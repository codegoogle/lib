package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: GzipSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0019\u0010$\u001a\u00020\u00128G@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/p7700g/p99005/dw5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/yq4;", "e", "()V", "Lcom/p7700g/p99005/sv5;", "buffer", "", "byteCount", "d", "(Lcom/p7700g/p99005/sv5;J)V", rs2.f.b, "write", "flush", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "Ljava/util/zip/Deflater;", "a", "()Ljava/util/zip/Deflater;", "Lcom/p7700g/p99005/yv5;", "u", "Lcom/p7700g/p99005/yv5;", "deflaterSink", "Ljava/util/zip/CRC32;", "w", "Ljava/util/zip/CRC32;", "crc", "Lcom/p7700g/p99005/qw5;", "s", "Lcom/p7700g/p99005/qw5;", "sink", "t", "Ljava/util/zip/Deflater;", "b", "deflater", "", com.ironsource.sdk.controller.v.a, "Z", "closed", "<init>", "(Lcom/p7700g/p99005/vw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class dw5 implements vw5 {
    private final qw5 s;
    @NotNull
    private final Deflater t;
    private final yv5 u;
    private boolean v;
    private final CRC32 w;

    public dw5(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        qw5 qw5Var = new qw5(vw5Var);
        this.s = qw5Var;
        Deflater deflater = new Deflater(-1, true);
        this.t = deflater;
        this.u = new yv5((tv5) qw5Var, deflater);
        this.w = new CRC32();
        sv5 sv5Var = qw5Var.s;
        sv5Var.M(8075);
        sv5Var.g0(8);
        sv5Var.g0(0);
        sv5Var.S(0);
        sv5Var.g0(0);
        sv5Var.g0(0);
    }

    private final void d(sv5 sv5Var, long j) {
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        while (j > 0) {
            int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
            this.w.update(sw5Var.d, sw5Var.e, min);
            j -= min;
            sw5Var = sw5Var.i;
            c25.m(sw5Var);
        }
    }

    private final void e() {
        this.s.e0((int) this.w.getValue());
        this.s.e0((int) this.t.getBytesRead());
    }

    @fz4(name = "-deprecated_deflater")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "deflater", imports = {}))
    @NotNull
    public final Deflater a() {
        return this.t;
    }

    @fz4(name = "deflater")
    @NotNull
    public final Deflater b() {
        return this.t;
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.v) {
            return;
        }
        Throwable th = null;
        try {
            this.u.b();
            e();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.t.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.s.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.v = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() throws IOException {
        this.u.flush();
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return this.s.timeout();
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
        }
        if (i == 0) {
            return;
        }
        d(sv5Var, j);
        this.u.write(sv5Var, j);
    }
}