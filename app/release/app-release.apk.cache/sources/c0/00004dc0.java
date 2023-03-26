package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class l13 {
    @NotNull
    private q13 b;
    @NotNull
    private n13<?> c;

    public l13(@NotNull q13 q13Var, @NotNull n13<?> n13Var) {
        c25.p(q13Var, "mMediationPresenter");
        c25.p(n13Var, "mGGAdView");
        this.b = q13Var;
        this.c = n13Var;
    }

    public final void e(@NotNull n13<?> n13Var) {
        c25.p(n13Var, "<set-?>");
        this.c = n13Var;
    }

    public abstract void f();

    @NotNull
    public final q13 g() {
        return this.b;
    }

    @NotNull
    public final n13<?> h() {
        return this.c;
    }
}