package com.p7700g.p99005;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: LottieInterpolatedPointValue.java */
/* loaded from: classes.dex */
public class ip0 extends jp0<PointF> {
    private final PointF g;

    public ip0(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.g = new PointF();
    }

    @Override // com.p7700g.p99005.jp0, com.p7700g.p99005.np0
    public /* bridge */ /* synthetic */ Object a(fp0 fp0Var) {
        return super.a(fp0Var);
    }

    @Override // com.p7700g.p99005.jp0
    /* renamed from: f */
    public PointF e(PointF pointF, PointF pointF2, float f) {
        this.g.set(bp0.k(pointF.x, pointF2.x, f), bp0.k(pointF.y, pointF2.y, f));
        return this.g;
    }

    public ip0(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.g = new PointF();
    }
}