package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmOkio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/p7700g/p99005/nw5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "s", "Ljava/io/OutputStream;", "out", "t", "Lcom/p7700g/p99005/zw5;", "<init>", "(Ljava/io/OutputStream;Lcom/p7700g/p99005/zw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class nw5 implements vw5 {
    private final OutputStream s;
    private final zw5 t;

    public nw5(@NotNull OutputStream outputStream, @NotNull zw5 zw5Var) {
        c25.p(outputStream, "out");
        c25.p(zw5Var, "timeout");
        this.s = outputStream;
        this.t = zw5Var;
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s.close();
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
        this.s.flush();
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return this.t;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("sink(");
        G.append(this.s);
        G.append(')');
        return G.toString();
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, rs2.f.b);
        pv5.e(sv5Var.z2(), 0L, j);
        while (j > 0) {
            this.t.h();
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
            this.s.write(sw5Var.d, sw5Var.e, min);
            sw5Var.e += min;
            long j2 = min;
            j -= j2;
            sv5Var.v2(sv5Var.z2() - j2);
            if (sw5Var.e == sw5Var.f) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            }
        }
    }
}