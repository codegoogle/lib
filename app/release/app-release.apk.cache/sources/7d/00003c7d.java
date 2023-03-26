package com.p7700g.p99005;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cc3 {
    @NotNull
    public static final cc3 a = new cc3();
    @NotNull
    private static final String b = "NativeUtils";

    private cc3() {
    }

    private final int a(Context context) {
        yz2 yz2Var = yz2.a;
        if (yz2Var.e(context)) {
            return yz2Var.c(context);
        }
        return yz2Var.b(context);
    }

    public final int b(@NotNull Context context, int i) {
        float f;
        float f2;
        float f3;
        c25.p(context, "context");
        float min = Math.min(90.0f, a(context) * 0.15f);
        if (i <= 655) {
            if (i > 632) {
                f3 = 81.0f;
            } else if (i > 526) {
                f = i * 60.0f;
                f2 = 468.0f;
            } else if (i > 432) {
                f3 = 68.0f;
            } else {
                f = i * 50.0f;
                f2 = 320.0f;
            }
            return a45.J0(Math.max(Math.min(f3, min), 50.0f));
        }
        f = i * 90.0f;
        f2 = 728.0f;
        f3 = f / f2;
        return a45.J0(Math.max(Math.min(f3, min), 50.0f));
    }
}