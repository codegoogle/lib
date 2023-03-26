package com.p7700g.p99005;

import android.content.res.Resources;
import android.util.TypedValue;

/* compiled from: DensityUtils.java */
/* loaded from: classes3.dex */
public class gr3 {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static int b(float f) {
        return (int) TypedValue.applyDimension(0, f, Resources.getSystem().getDisplayMetrics());
    }
}