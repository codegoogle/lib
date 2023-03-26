package com.p7700g.p99005;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class k90 {
    private static final q90 a;
    private static final String b = "ViewUtils";
    public static final Property<View, Float> c;
    public static final Property<View, Rect> d;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(k90.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            k90.h(view, f.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return sr.O(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            sr.L1(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new p90();
        } else if (i >= 23) {
            a = new o90();
        } else if (i >= 22) {
            a = new n90();
        } else {
            a = new m90();
        }
        c = new a(Float.class, "translationAlpha");
        d = new b(Rect.class, "clipBounds");
    }

    private k90() {
    }

    public static void a(@x1 View view) {
        a.a(view);
    }

    public static j90 b(@x1 View view) {
        return new i90(view);
    }

    public static float c(@x1 View view) {
        return a.c(view);
    }

    public static v90 d(@x1 View view) {
        return new u90(view);
    }

    public static void e(@x1 View view) {
        a.d(view);
    }

    public static void f(@x1 View view, @z1 Matrix matrix) {
        a.e(view, matrix);
    }

    public static void g(@x1 View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    public static void h(@x1 View view, float f) {
        a.g(view, f);
    }

    public static void i(@x1 View view, int i) {
        a.h(view, i);
    }

    public static void j(@x1 View view, @x1 Matrix matrix) {
        a.i(view, matrix);
    }

    public static void k(@x1 View view, @x1 Matrix matrix) {
        a.j(view, matrix);
    }
}