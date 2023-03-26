package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketListener.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/p7700g/p99005/or5;", "", "Lcom/p7700g/p99005/nr5;", "webSocket", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/nr5;Lcom/p7700g/p99005/jr5;)V", "", "text", "d", "(Lcom/p7700g/p99005/nr5;Ljava/lang/String;)V", "Lcom/p7700g/p99005/vv5;", "bytes", "e", "(Lcom/p7700g/p99005/nr5;Lcom/p7700g/p99005/vv5;)V", "", "code", "reason", "b", "(Lcom/p7700g/p99005/nr5;ILjava/lang/String;)V", "a", "", "t", "c", "(Lcom/p7700g/p99005/nr5;Ljava/lang/Throwable;Lcom/p7700g/p99005/jr5;)V", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class or5 {
    public void a(@NotNull nr5 nr5Var, int i, @NotNull String str) {
        c25.p(nr5Var, "webSocket");
        c25.p(str, "reason");
    }

    public void b(@NotNull nr5 nr5Var, int i, @NotNull String str) {
        c25.p(nr5Var, "webSocket");
        c25.p(str, "reason");
    }

    public void c(@NotNull nr5 nr5Var, @NotNull Throwable th, @Nullable jr5 jr5Var) {
        c25.p(nr5Var, "webSocket");
        c25.p(th, "t");
    }

    public void d(@NotNull nr5 nr5Var, @NotNull String str) {
        c25.p(nr5Var, "webSocket");
        c25.p(str, "text");
    }

    public void e(@NotNull nr5 nr5Var, @NotNull vv5 vv5Var) {
        c25.p(nr5Var, "webSocket");
        c25.p(vv5Var, "bytes");
    }

    public void f(@NotNull nr5 nr5Var, @NotNull jr5 jr5Var) {
        c25.p(nr5Var, "webSocket");
        c25.p(jr5Var, "response");
    }
}