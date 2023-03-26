package com.p7700g.p99005;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GhostViewUtils.java */
/* loaded from: classes.dex */
public class e80 {
    private e80() {
    }

    @z1
    public static a80 a(@x1 View view, @x1 ViewGroup viewGroup, @z1 Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return c80.b(view, viewGroup, matrix);
        }
        return d80.b(view, viewGroup, matrix);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            c80.f(view);
        } else {
            d80.f(view);
        }
    }
}