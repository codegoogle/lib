package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import org.jetbrains.annotations.NotNull;

/* compiled from: Okio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/p7700g/p99005/rv5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "<init>", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class rv5 implements vw5 {
    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return zw5.a;
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, rs2.f.b);
        sv5Var.skip(j);
    }
}