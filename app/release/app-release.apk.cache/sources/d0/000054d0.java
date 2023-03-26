package com.p7700g.p99005;

import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class or {

    /* compiled from: ScaleGestureDetectorCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @e1
        public static void b(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    private or() {
    }

    public static boolean a(@x1 ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(@x1 ScaleGestureDetector scaleGestureDetector, boolean z) {
        a.b(scaleGestureDetector, z);
    }

    @Deprecated
    public static void d(Object obj, boolean z) {
        c((ScaleGestureDetector) obj, z);
    }
}