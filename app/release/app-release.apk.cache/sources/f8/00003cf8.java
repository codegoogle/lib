package com.p7700g.p99005;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public class cl0 implements kl0<PointF, PointF> {
    private final List<ep0<PointF>> a;

    public cl0(List<ep0<PointF>> list) {
        this.a = list;
    }

    @Override // com.p7700g.p99005.kl0
    public tj0<PointF, PointF> a() {
        if (this.a.get(0).h()) {
            return new dk0(this.a);
        }
        return new ck0(this.a);
    }

    @Override // com.p7700g.p99005.kl0
    public List<ep0<PointF>> b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.kl0
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).h();
    }
}