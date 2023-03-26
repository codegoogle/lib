package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public class nm0 extends im0 {
    private final zi0 H;
    private final jm0 I;

    public nm0(hi0 hi0Var, lm0 lm0Var, jm0 jm0Var) {
        super(hi0Var, lm0Var);
        this.I = jm0Var;
        zi0 zi0Var = new zi0(hi0Var, this, new cm0("__container", lm0Var.n(), false));
        this.H = zi0Var;
        zi0Var.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.p7700g.p99005.im0
    public void H(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        this.H.c(tk0Var, i, list, tk0Var2);
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.H.e(rectF, this.s, z);
    }

    @Override // com.p7700g.p99005.im0
    public void s(@x1 Canvas canvas, Matrix matrix, int i) {
        this.H.g(canvas, matrix, i);
    }

    @Override // com.p7700g.p99005.im0
    @z1
    public nl0 u() {
        nl0 u = super.u();
        return u != null ? u : this.I.u();
    }

    @Override // com.p7700g.p99005.im0
    @z1
    public in0 w() {
        in0 w = super.w();
        return w != null ? w : this.I.w();
    }
}