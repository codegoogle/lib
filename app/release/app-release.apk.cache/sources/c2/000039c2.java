package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/p7700g/p99005/aw5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lcom/p7700g/p99005/vw5;", "delegate", "Lcom/p7700g/p99005/vw5;", "<init>", "(Lcom/p7700g/p99005/vw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public abstract class aw5 implements vw5 {
    @NotNull
    private final vw5 delegate;

    public aw5(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "delegate");
        this.delegate = vw5Var;
    }

    @fz4(name = "-deprecated_delegate")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "delegate", imports = {}))
    @NotNull
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final vw5 m3deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @fz4(name = "delegate")
    @NotNull
    public final vw5 delegate() {
        return this.delegate;
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        this.delegate.write(sv5Var, j);
    }
}