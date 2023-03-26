package com.p7700g.p99005;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
@e2(29)
/* loaded from: classes.dex */
public class p90 extends o90 {
    @Override // com.p7700g.p99005.l90, com.p7700g.p99005.q90
    public float c(@x1 View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.p7700g.p99005.m90, com.p7700g.p99005.q90
    public void e(@x1 View view, @z1 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // com.p7700g.p99005.n90, com.p7700g.p99005.q90
    public void f(@x1 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.p7700g.p99005.l90, com.p7700g.p99005.q90
    public void g(@x1 View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.p7700g.p99005.o90, com.p7700g.p99005.q90
    public void h(@x1 View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.p7700g.p99005.m90, com.p7700g.p99005.q90
    public void i(@x1 View view, @x1 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.p7700g.p99005.m90, com.p7700g.p99005.q90
    public void j(@x1 View view, @x1 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}