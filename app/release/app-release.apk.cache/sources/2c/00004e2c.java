package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
@e2(19)
/* loaded from: classes.dex */
public class l90 extends q90 {
    private static boolean h = true;

    @Override // com.p7700g.p99005.q90
    public void a(@x1 View view) {
    }

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public float c(@x1 View view) {
        if (h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // com.p7700g.p99005.q90
    public void d(@x1 View view) {
    }

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void g(@x1 View view, float f) {
        if (h) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f);
    }
}