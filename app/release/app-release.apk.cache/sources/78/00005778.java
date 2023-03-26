package com.p7700g.p99005;

import android.content.Context;
import java.io.File;

/* compiled from: Volley.java */
/* loaded from: classes3.dex */
public class q53 {
    private static final String a = "volley";

    public static u43 a(Context context) {
        return c(context, null);
    }

    private static u43 b(Context context, m43 network) {
        u43 u43Var = new u43(new i53(new File(context.getCacheDir(), a)), network);
        u43Var.i();
        return u43Var;
    }

    public static u43 c(Context context, e53 stack) {
        f53 f53Var;
        if (stack == null) {
            f53Var = new f53((e53) new n53());
        } else {
            f53Var = new f53(stack);
        }
        return b(context, f53Var);
    }

    @Deprecated
    public static u43 d(Context context, m53 stack) {
        if (stack == null) {
            return c(context, null);
        }
        return b(context, new f53(stack));
    }
}