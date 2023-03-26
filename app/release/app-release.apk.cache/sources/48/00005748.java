package com.p7700g.p99005;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorCompatBase.java */
/* loaded from: classes2.dex */
public class q12 {
    private q12() {
    }

    public static Interpolator a(float f, float f2) {
        return new r12(f, f2);
    }

    public static Interpolator b(float f, float f2, float f3, float f4) {
        return new r12(f, f2, f3, f4);
    }

    public static Interpolator c(Path path) {
        return new r12(path);
    }
}