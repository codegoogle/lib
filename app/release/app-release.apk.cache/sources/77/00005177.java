package com.p7700g.p99005;

import com.p7700g.p99005.m00;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 {
    @NotNull
    public static k00 a(@NotNull m00.b _this, Class cls) {
        c25.p(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @NotNull
    public static k00 b(@NotNull m00.b _this, @NotNull Class cls, z00 z00Var) {
        c25.p(cls, "modelClass");
        c25.p(z00Var, "extras");
        return _this.a(cls);
    }

    @jz4
    @NotNull
    public static m00.b c(@NotNull g10<?>... g10VarArr) {
        return m00.b.a.a(g10VarArr);
    }
}