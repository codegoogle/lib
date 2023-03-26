package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeflaterSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/yv5;", "Lcom/p7700g/p99005/vw5;", "", "syncFlush", "Lcom/p7700g/p99005/yq4;", "a", "(Z)V", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", "b", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "", "toString", "()Ljava/lang/String;", "s", "Z", "closed", "Ljava/util/zip/Deflater;", "u", "Ljava/util/zip/Deflater;", "deflater", "Lcom/p7700g/p99005/tv5;", "t", "Lcom/p7700g/p99005/tv5;", "sink", "<init>", "(Lcom/p7700g/p99005/tv5;Ljava/util/zip/Deflater;)V", "(Lcom/p7700g/p99005/vw5;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class yv5 implements vw5 {
    private boolean s;
    private final tv5 t;
    private final Deflater u;

    public yv5(@NotNull tv5 tv5Var, @NotNull Deflater deflater) {
        c25.p(tv5Var, "sink");
        c25.p(deflater, "deflater");
        this.t = tv5Var;
        this.u = deflater;
    }

    @IgnoreJRERequirement
    private final void a(boolean z) {
        sw5 D2;
        int deflate;
        sv5 o = this.t.o();
        while (true) {
            D2 = o.D2(1);
            if (z) {
                Deflater deflater = this.u;
                byte[] bArr = D2.d;
                int i = D2.f;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.u;
                byte[] bArr2 = D2.d;
                int i2 = D2.f;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                D2.f += deflate;
                o.v2(o.z2() + deflate);
                this.t.p0();
            } else if (this.u.needsInput()) {
                break;
            }
        }
        if (D2.e == D2.f) {
            o.s = D2.b();
            tw5.d(D2);
        }
    }

    public final void b() {
        this.u.finish();
        a(false);
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.s) {
            return;
        }
        Throwable th = null;
        try {
            b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.u.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.t.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.s = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.t.flush();
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return this.t.timeout();
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("DeflaterSink(");
        G.append(this.t);
        G.append(')');
        return G.toString();
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        pv5.e(sv5Var.z2(), 0L, j);
        while (j > 0) {
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
            this.u.setInput(sw5Var.d, sw5Var.e, min);
            a(false);
            long j2 = min;
            sv5Var.v2(sv5Var.z2() - j2);
            int i = sw5Var.e + min;
            sw5Var.e = i;
            if (i == sw5Var.f) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yv5(@NotNull vw5 vw5Var, @NotNull Deflater deflater) {
        this(jw5.c(vw5Var), deflater);
        c25.p(vw5Var, "sink");
        c25.p(deflater, "deflater");
    }
}