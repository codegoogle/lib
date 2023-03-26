package com.p7700g.p99005;

import android.content.Context;
import com.google.auto.value.AutoValue;

/* compiled from: CreationContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class k52 {
    private static final String a = "cct";

    public static k52 a(Context context, v92 v92Var, v92 v92Var2) {
        return new e52(context, v92Var, v92Var2, "cct");
    }

    public static k52 b(Context context, v92 v92Var, v92 v92Var2, String str) {
        return new e52(context, v92Var, v92Var2, str);
    }

    public abstract Context c();

    @x1
    public abstract String d();

    public abstract v92 e();

    public abstract v92 f();
}