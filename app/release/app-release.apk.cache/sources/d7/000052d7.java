package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* loaded from: classes.dex */
public final class nq {
    public static final int a = 8388608;
    public static final int b = 8388611;
    public static final int c = 8388613;
    public static final int d = 8388615;

    /* compiled from: GravityCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        @e1
        public static void b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        @e1
        public static void c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    private nq() {
    }

    public static void a(int i, int i2, int i3, @x1 Rect rect, int i4, int i5, @x1 Rect rect2, int i6) {
        a.a(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    public static void b(int i, int i2, int i3, @x1 Rect rect, @x1 Rect rect2, int i4) {
        a.b(i, i2, i3, rect, rect2, i4);
    }

    public static void c(int i, @x1 Rect rect, @x1 Rect rect2, int i2) {
        a.c(i, rect, rect2, i2);
    }

    public static int d(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}