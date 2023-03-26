package com.p7700g.p99005;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class ua3 {
    @NotNull
    private final List<l23> a;

    public ua3(@j2(min = 1) @NotNull l23... l23VarArr) {
        c25.p(l23VarArr, "reportFields");
        this.a = as4.iz(l23VarArr);
    }

    @NotNull
    public abstract db3 a(@NotNull l23 l23Var);

    @NotNull
    public final List<l23> b() {
        return this.a;
    }

    public final boolean c(@NotNull Set<? extends l23> set, @NotNull l23 l23Var) {
        c25.p(set, "crashReportFields");
        c25.p(l23Var, "collect");
        return set.contains(l23Var);
    }
}