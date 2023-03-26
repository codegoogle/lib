package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Timing.kt */
@fz4(name = "TimingKt")
@vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"measureNanoTime", "", "block", "Lkotlin/Function0;", "", "measureTimeMillis", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class z75 {
    public static final long a(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "block");
        long nanoTime = System.nanoTime();
        uz4Var.x();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "block");
        long currentTimeMillis = System.currentTimeMillis();
        uz4Var.x();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}