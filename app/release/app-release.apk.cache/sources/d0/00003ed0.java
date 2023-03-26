package com.p7700g.p99005;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public class dk0 extends zj0<PointF> {
    private final PointF i;

    public dk0(List<ep0<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public PointF i(ep0<PointF> ep0Var, float f) {
        return j(ep0Var, f, f, f);
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: q */
    public PointF j(ep0<PointF> ep0Var, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = ep0Var.d;
        if (pointF3 != null && (pointF = ep0Var.e) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            np0<A> np0Var = this.e;
            if (np0Var == 0 || (pointF2 = (PointF) np0Var.b(ep0Var.i, ep0Var.j.floatValue(), pointF4, pointF5, f, e(), f())) == null) {
                PointF pointF6 = this.i;
                float f4 = pointF4.x;
                float a = wo1.a(pointF5.x, f4, f2, f4);
                float f5 = pointF4.y;
                pointF6.set(a, ((pointF5.y - f5) * f3) + f5);
                return this.i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}