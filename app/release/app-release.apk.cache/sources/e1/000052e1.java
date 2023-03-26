package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConnectionPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/p7700g/p99005/nq5;", "", "", "d", "()I", "a", "Lcom/p7700g/p99005/yq4;", "b", "()V", "Lcom/p7700g/p99005/ns5;", "Lcom/p7700g/p99005/ns5;", "c", "()Lcom/p7700g/p99005/ns5;", "delegate", "<init>", "(Lcom/p7700g/p99005/ns5;)V", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class nq5 {
    @NotNull
    private final ns5 a;

    public nq5(@NotNull ns5 ns5Var) {
        c25.p(ns5Var, "delegate");
        this.a = ns5Var;
    }

    public final int a() {
        return this.a.d();
    }

    public final void b() {
        this.a.e();
    }

    @NotNull
    public final ns5 c() {
        return this.a;
    }

    public final int d() {
        return this.a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nq5(int i, long j, @NotNull TimeUnit timeUnit) {
        this(new ns5(fs5.a, i, j, timeUnit));
        c25.p(timeUnit, "timeUnit");
    }

    public nq5() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}