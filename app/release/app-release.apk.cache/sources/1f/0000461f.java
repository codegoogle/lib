package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.p7700g.p99005.i2;

/* compiled from: AnimationUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ha2 {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new qy();
    public static final TimeInterpolator c = new py();
    public static final TimeInterpolator d = new ry();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return wo1.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, @g1(from = 0.0d, to = 1.0d) float f3, @g1(from = 0.0d, to = 1.0d) float f4, @g1(from = 0.0d, to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}