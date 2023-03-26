package com.p7700g.p99005;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: RouteDatabase.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/os5;", "", "Lcom/p7700g/p99005/lr5;", "failedRoute", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/lr5;)V", "route", "a", "", "c", "(Lcom/p7700g/p99005/lr5;)Z", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class os5 {
    private final Set<lr5> a = new LinkedHashSet();

    public final synchronized void a(@NotNull lr5 lr5Var) {
        c25.p(lr5Var, "route");
        this.a.remove(lr5Var);
    }

    public final synchronized void b(@NotNull lr5 lr5Var) {
        c25.p(lr5Var, "failedRoute");
        this.a.add(lr5Var);
    }

    public final synchronized boolean c(@NotNull lr5 lr5Var) {
        c25.p(lr5Var, "route");
        return this.a.contains(lr5Var);
    }
}