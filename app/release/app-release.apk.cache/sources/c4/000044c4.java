package com.p7700g.p99005;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public class gl0 implements kl0<PointF, PointF> {
    private final zk0 a;
    private final zk0 b;

    public gl0(zk0 zk0Var, zk0 zk0Var2) {
        this.a = zk0Var;
        this.b = zk0Var2;
    }

    @Override // com.p7700g.p99005.kl0
    public tj0<PointF, PointF> a() {
        return new gk0(this.a.a(), this.b.a());
    }

    @Override // com.p7700g.p99005.kl0
    public List<ep0<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.p7700g.p99005.kl0
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}