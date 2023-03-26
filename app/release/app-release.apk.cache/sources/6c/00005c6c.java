package com.p7700g.p99005;

import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
/* loaded from: classes.dex */
public final class sq {

    /* compiled from: MarginLayoutParamsCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @e1
        public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @e1
        public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @e1
        public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @e1
        public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        @e1
        public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        @e1
        public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        @e1
        public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    private sq() {
    }

    public static int a(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a2 = a.a(marginLayoutParams);
        if (a2 == 0 || a2 == 1) {
            return a2;
        }
        return 0;
    }

    public static int b(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int c(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean d(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void e(@x1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.e(marginLayoutParams, i);
    }

    public static void f(@x1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.f(marginLayoutParams, i);
    }

    public static void g(@x1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.g(marginLayoutParams, i);
    }

    public static void h(@x1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.h(marginLayoutParams, i);
    }
}