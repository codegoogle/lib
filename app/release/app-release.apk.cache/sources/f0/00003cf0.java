package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ck0 extends zj0<PointF> {
    private final PointF i;
    private final float[] j;
    private final PathMeasure k;
    private bk0 l;

    public ck0(List<? extends ep0<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public PointF i(ep0<PointF> ep0Var, float f) {
        PointF pointF;
        bk0 bk0Var = (bk0) ep0Var;
        Path j = bk0Var.j();
        if (j == null) {
            return ep0Var.d;
        }
        np0<A> np0Var = this.e;
        if (np0Var == 0 || (pointF = (PointF) np0Var.b(bk0Var.i, bk0Var.j.floatValue(), (PointF) bk0Var.d, (PointF) bk0Var.e, e(), f, f())) == null) {
            if (this.l != bk0Var) {
                this.k.setPath(j, false);
                this.l = bk0Var;
            }
            PathMeasure pathMeasure = this.k;
            pathMeasure.getPosTan(pathMeasure.getLength() * f, this.j, null);
            PointF pointF2 = this.i;
            float[] fArr = this.j;
            pointF2.set(fArr[0], fArr[1]);
            return this.i;
        }
        return pointF;
    }
}