package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.p7700g.p99005.i2;

/* compiled from: EdgeToEdgeUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ke2 {
    private static final int a = 128;

    private ke2() {
    }

    public static void a(@x1 Window window, boolean z) {
        b(window, z, null, null);
    }

    public static void b(@x1 Window window, boolean z, @w0 @z1 Integer num, @w0 @z1 Integer num2) {
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        z2 = (num2 == null || num2.intValue() == 0) ? true : true;
        if (z3 || z2) {
            int b = kc2.b(window.getContext(), 16842801, sr.t);
            if (z3) {
                num = Integer.valueOf(b);
            }
            if (z2) {
                num2 = Integer.valueOf(b);
            }
        }
        cs.c(window, !z);
        int d = d(window.getContext(), z);
        int c = c(window.getContext(), z);
        window.setStatusBarColor(d);
        window.setNavigationBarColor(c);
        boolean e = e(d, kc2.k(num.intValue()));
        boolean e2 = e(c, kc2.k(num2.intValue()));
        hs a2 = cs.a(window, window.getDecorView());
        if (a2 != null) {
            a2.i(e);
            a2.h(e2);
        }
    }

    @TargetApi(21)
    private static int c(Context context, boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 27) {
            if (z) {
                return 0;
            }
            return kc2.b(context, 16843858, sr.t);
        }
        return fj.B(kc2.b(context, 16843858, sr.t), 128);
    }

    @TargetApi(21)
    private static int d(Context context, boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 23) {
            if (z) {
                return 0;
            }
            return kc2.b(context, 16843857, sr.t);
        }
        return fj.B(kc2.b(context, 16843857, sr.t), 128);
    }

    private static boolean e(int i, boolean z) {
        return kc2.k(i) || (i == 0 && z);
    }
}