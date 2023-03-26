package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: InflaterSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/hw5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", "d", "()V", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "a", "", "b", "()Z", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "", "s", AFHydra.STATUS_IDLE, "bufferBytesHeldByInflater", "Ljava/util/zip/Inflater;", com.ironsource.sdk.controller.v.a, "Ljava/util/zip/Inflater;", "inflater", "Lcom/p7700g/p99005/uv5;", "u", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "t", "Z", "closed", "<init>", "(Lcom/p7700g/p99005/uv5;Ljava/util/zip/Inflater;)V", "(Lcom/p7700g/p99005/xw5;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class hw5 implements xw5 {
    private int s;
    private boolean t;
    private final uv5 u;
    private final Inflater v;

    public hw5(@NotNull uv5 uv5Var, @NotNull Inflater inflater) {
        c25.p(uv5Var, rs2.f.b);
        c25.p(inflater, "inflater");
        this.u = uv5Var;
        this.v = inflater;
    }

    private final void d() {
        int i = this.s;
        if (i == 0) {
            return;
        }
        int remaining = i - this.v.getRemaining();
        this.s -= remaining;
        this.u.skip(remaining);
    }

    public final long a(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.t) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    sw5 D2 = sv5Var.D2(1);
                    int min = (int) Math.min(j, 8192 - D2.f);
                    b();
                    int inflate = this.v.inflate(D2.d, D2.f, min);
                    d();
                    if (inflate > 0) {
                        D2.f += inflate;
                        long j2 = inflate;
                        sv5Var.v2(sv5Var.z2() + j2);
                        return j2;
                    }
                    if (D2.e == D2.f) {
                        sv5Var.s = D2.b();
                        tw5.d(D2);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    public final boolean b() throws IOException {
        if (this.v.needsInput()) {
            if (this.u.f0()) {
                return true;
            }
            sw5 sw5Var = this.u.o().s;
            c25.m(sw5Var);
            int i = sw5Var.f;
            int i2 = sw5Var.e;
            int i3 = i - i2;
            this.s = i3;
            this.v.setInput(sw5Var.d, i2, i3);
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.t) {
            return;
        }
        this.v.end();
        this.t = true;
        this.u.close();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        do {
            long a = a(sv5Var, j);
            if (a > 0) {
                return a;
            }
            if (this.v.finished() || this.v.needsDictionary()) {
                return -1L;
            }
        } while (!this.u.f0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.u.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hw5(@NotNull xw5 xw5Var, @NotNull Inflater inflater) {
        this(jw5.d(xw5Var), inflater);
        c25.p(xw5Var, rs2.f.b);
        c25.p(inflater, "inflater");
    }
}