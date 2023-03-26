package com.p7700g.p99005;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "", "toString", "()Ljava/lang/String;", "a", "()Lcom/p7700g/p99005/xw5;", "s", "Lcom/p7700g/p99005/xw5;", "b", "delegate", "<init>", "(Lcom/p7700g/p99005/xw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public abstract class bw5 implements xw5 {
    @NotNull
    private final xw5 s;

    public bw5(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, "delegate");
        this.s = xw5Var;
    }

    @fz4(name = "-deprecated_delegate")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "delegate", imports = {}))
    @NotNull
    public final xw5 a() {
        return this.s;
    }

    @fz4(name = "delegate")
    @NotNull
    public final xw5 b() {
        return this.s;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.s.close();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        return this.s.read(sv5Var, j);
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.s.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.s + ')';
    }
}