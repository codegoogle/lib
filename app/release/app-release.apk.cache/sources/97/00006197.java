package com.p7700g.p99005;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: DisplayUtils.java */
/* loaded from: classes3.dex */
public final class vd3 {
    public static int a(float f) {
        return Math.round(f * b().density);
    }

    public static DisplayMetrics b() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public static int c() {
        return b().heightPixels;
    }

    public static int d() {
        return b().widthPixels;
    }
}