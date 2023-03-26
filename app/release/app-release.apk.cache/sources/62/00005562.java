package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompatApi21.java */
/* loaded from: classes2.dex */
public class p12 {
    private p12() {
    }

    @TargetApi(21)
    public static Interpolator a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    @TargetApi(21)
    public static Interpolator b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    @TargetApi(21)
    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}