package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes3.dex */
public class mh2 {
    private mh2() {
    }

    @x1
    public static gh2 a(int i) {
        if (i != 0) {
            if (i != 1) {
                return b();
            }
            return new hh2();
        }
        return new ph2();
    }

    @x1
    public static gh2 b() {
        return new ph2();
    }

    @x1
    public static ih2 c() {
        return new ih2();
    }

    public static void d(@x1 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof lh2) {
            ((lh2) background).n0(f);
        }
    }

    public static void e(@x1 View view) {
        Drawable background = view.getBackground();
        if (background instanceof lh2) {
            f(view, (lh2) background);
        }
    }

    public static void f(@x1 View view, @x1 lh2 lh2Var) {
        if (lh2Var.b0()) {
            lh2Var.s0(kf2.j(view));
        }
    }
}