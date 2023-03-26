package com.p7700g.p99005;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class rs {

    /* compiled from: PathInterpolatorCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static PathInterpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @e1
        public static PathInterpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @e1
        public static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private rs() {
    }

    @x1
    public static Interpolator a(float f, float f2) {
        return a.a(f, f2);
    }

    @x1
    public static Interpolator b(float f, float f2, float f3, float f4) {
        return a.b(f, f2, f3, f4);
    }

    @x1
    public static Interpolator c(@x1 Path path) {
        return a.c(path);
    }
}