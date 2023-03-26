package com.squareup.moshi;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.vv5;
import com.p7700g.p99005.xw5;
import com.p7700g.p99005.zw5;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class JsonValueSource implements xw5 {
    private final sv5 buffer;
    private boolean closed;
    private long limit;
    private final sv5 prefix;
    private final uv5 source;
    private int stackSize;
    private vv5 state;
    public static final vv5 STATE_JSON = vv5.u("[]{}\"'/#");
    public static final vv5 STATE_SINGLE_QUOTED = vv5.u("'\\");
    public static final vv5 STATE_DOUBLE_QUOTED = vv5.u("\"\\");
    public static final vv5 STATE_END_OF_LINE_COMMENT = vv5.u("\r\n");
    public static final vv5 STATE_C_STYLE_COMMENT = vv5.u(tm4.g);
    public static final vv5 STATE_END_OF_JSON = vv5.t;

    public JsonValueSource(uv5 uv5Var) {
        this(uv5Var, new sv5(), STATE_JSON, 0);
    }

    private void advanceLimit(long j) throws IOException {
        while (true) {
            long j2 = this.limit;
            if (j2 >= j) {
                return;
            }
            vv5 vv5Var = this.state;
            vv5 vv5Var2 = STATE_END_OF_JSON;
            if (vv5Var == vv5Var2) {
                return;
            }
            if (j2 == this.buffer.z2()) {
                if (this.limit > 0) {
                    return;
                }
                this.source.P1(1L);
            }
            long N1 = this.buffer.N1(this.state, this.limit);
            if (N1 == -1) {
                this.limit = this.buffer.z2();
            } else {
                byte d2 = this.buffer.d2(N1);
                vv5 vv5Var3 = this.state;
                vv5 vv5Var4 = STATE_JSON;
                if (vv5Var3 == vv5Var4) {
                    if (d2 == 34) {
                        this.state = STATE_DOUBLE_QUOTED;
                        this.limit = N1 + 1;
                    } else if (d2 == 35) {
                        this.state = STATE_END_OF_LINE_COMMENT;
                        this.limit = N1 + 1;
                    } else if (d2 == 39) {
                        this.state = STATE_SINGLE_QUOTED;
                        this.limit = N1 + 1;
                    } else if (d2 != 47) {
                        if (d2 != 91) {
                            if (d2 != 93) {
                                if (d2 != 123) {
                                    if (d2 != 125) {
                                    }
                                }
                            }
                            int i = this.stackSize - 1;
                            this.stackSize = i;
                            if (i == 0) {
                                this.state = vv5Var2;
                            }
                            this.limit = N1 + 1;
                        }
                        this.stackSize++;
                        this.limit = N1 + 1;
                    } else {
                        long j3 = 2 + N1;
                        this.source.P1(j3);
                        long j4 = N1 + 1;
                        byte d22 = this.buffer.d2(j4);
                        if (d22 == 47) {
                            this.state = STATE_END_OF_LINE_COMMENT;
                            this.limit = j3;
                        } else if (d22 == 42) {
                            this.state = STATE_C_STYLE_COMMENT;
                            this.limit = j3;
                        } else {
                            this.limit = j4;
                        }
                    }
                } else if (vv5Var3 == STATE_SINGLE_QUOTED || vv5Var3 == STATE_DOUBLE_QUOTED) {
                    if (d2 == 92) {
                        long j5 = N1 + 2;
                        this.source.P1(j5);
                        this.limit = j5;
                    } else {
                        if (this.stackSize > 0) {
                            vv5Var2 = vv5Var4;
                        }
                        this.state = vv5Var2;
                        this.limit = N1 + 1;
                    }
                } else if (vv5Var3 == STATE_C_STYLE_COMMENT) {
                    long j6 = 2 + N1;
                    this.source.P1(j6);
                    long j7 = N1 + 1;
                    if (this.buffer.d2(j7) == 47) {
                        this.limit = j6;
                        this.state = vv5Var4;
                    } else {
                        this.limit = j7;
                    }
                } else if (vv5Var3 == STATE_END_OF_LINE_COMMENT) {
                    this.limit = N1 + 1;
                    this.state = vv5Var4;
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }

    public void discard() throws IOException {
        this.closed = true;
        while (this.state != STATE_END_OF_JSON) {
            advanceLimit(PlaybackStateCompat.F);
            this.source.skip(this.limit);
        }
    }

    @Override // com.p7700g.p99005.xw5
    public long read(sv5 sv5Var, long j) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.prefix.f0()) {
            long read = this.prefix.read(sv5Var, j);
            long j2 = j - read;
            if (this.buffer.f0()) {
                return read;
            }
            long read2 = read(sv5Var, j2);
            return read2 != -1 ? read + read2 : read;
        }
        advanceLimit(j);
        long j3 = this.limit;
        if (j3 == 0) {
            if (this.state == STATE_END_OF_JSON) {
                return -1L;
            }
            throw new AssertionError();
        }
        long min = Math.min(j, j3);
        sv5Var.write(this.buffer, min);
        this.limit -= min;
        return min;
    }

    @Override // com.p7700g.p99005.xw5
    public zw5 timeout() {
        return this.source.timeout();
    }

    public JsonValueSource(uv5 uv5Var, sv5 sv5Var, vv5 vv5Var, int i) {
        this.limit = 0L;
        this.closed = false;
        this.source = uv5Var;
        this.buffer = uv5Var.o();
        this.prefix = sv5Var;
        this.state = vv5Var;
        this.stackSize = i;
    }
}