package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;
import com.p7700g.p99005.pt0;

/* loaded from: classes2.dex */
public class f {
    private static String a = "DomainSameTool";

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", pt0.a)) > 0;
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            return false;
        }
    }

    private static void b(Context context) {
        if (context == null) {
        }
    }
}