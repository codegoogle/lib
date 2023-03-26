package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: GzipSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/p7700g/p99005/ew5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", "b", "()V", "d", "Lcom/p7700g/p99005/sv5;", "buffer", "", "offset", "byteCount", "e", "(Lcom/p7700g/p99005/sv5;JJ)V", "", "name", "", "expected", "actual", "a", "(Ljava/lang/String;II)V", "sink", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/rw5;", "t", "Lcom/p7700g/p99005/rw5;", rs2.f.b, "Ljava/util/zip/Inflater;", "u", "Ljava/util/zip/Inflater;", "inflater", "Lcom/p7700g/p99005/hw5;", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/hw5;", "inflaterSource", "Ljava/util/zip/CRC32;", "w", "Ljava/util/zip/CRC32;", "crc", "", "s", AFHydra.EV_BYTECOUNT, "section", "<init>", "(Lcom/p7700g/p99005/xw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ew5 implements xw5 {
    private byte s;
    private final rw5 t;
    private final Inflater u;
    private final hw5 v;
    private final CRC32 w;

    public ew5(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        rw5 rw5Var = new rw5(xw5Var);
        this.t = rw5Var;
        Inflater inflater = new Inflater(true);
        this.u = inflater;
        this.v = new hw5((uv5) rw5Var, inflater);
        this.w = new CRC32();
    }

    private final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        c25.o(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        this.t.P1(10L);
        byte d2 = this.t.s.d2(3L);
        boolean z = ((d2 >> 1) & 1) == 1;
        if (z) {
            e(this.t.s, 0L, 10L);
        }
        a("ID1ID2", 8075, this.t.readShort());
        this.t.skip(8L);
        if (((d2 >> 2) & 1) == 1) {
            this.t.P1(2L);
            if (z) {
                e(this.t.s, 0L, 2L);
            }
            long z1 = this.t.s.z1();
            this.t.P1(z1);
            if (z) {
                e(this.t.s, 0L, z1);
            }
            this.t.skip(z1);
        }
        if (((d2 >> 3) & 1) == 1) {
            long U1 = this.t.U1((byte) 0);
            if (U1 != -1) {
                if (z) {
                    e(this.t.s, 0L, U1 + 1);
                }
                this.t.skip(U1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((d2 >> 4) & 1) == 1) {
            long U12 = this.t.U1((byte) 0);
            if (U12 != -1) {
                if (z) {
                    e(this.t.s, 0L, U12 + 1);
                }
                this.t.skip(U12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.t.z1(), (short) this.w.getValue());
            this.w.reset();
        }
    }

    private final void d() throws IOException {
        a("CRC", this.t.o1(), (int) this.w.getValue());
        a("ISIZE", this.t.o1(), (int) this.u.getBytesWritten());
    }

    private final void e(sv5 sv5Var, long j, long j2) {
        int i;
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        while (true) {
            int i2 = sw5Var.f;
            int i3 = sw5Var.e;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            sw5Var = sw5Var.i;
            c25.m(sw5Var);
        }
        while (j2 > 0) {
            int min = (int) Math.min(sw5Var.f - i, j2);
            this.w.update(sw5Var.d, (int) (sw5Var.e + j), min);
            j2 -= min;
            sw5Var = sw5Var.i;
            c25.m(sw5Var);
            j = 0;
        }
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.v.close();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.s == 0) {
                b();
                this.s = (byte) 1;
            }
            if (this.s == 1) {
                long z2 = sv5Var.z2();
                long read = this.v.read(sv5Var, j);
                if (read != -1) {
                    e(sv5Var, z2, read);
                    return read;
                }
                this.s = (byte) 2;
            }
            if (this.s == 2) {
                d();
                this.s = (byte) 3;
                if (!this.t.f0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.t.timeout();
    }
}