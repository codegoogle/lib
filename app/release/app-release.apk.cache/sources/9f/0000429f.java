package com.p7700g.p99005;

import android.graphics.Path;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public class fk0 extends tj0<am0, Path> {
    private final am0 i;
    private final Path j;
    private List<pj0> k;

    public fk0(List<ep0<am0>> list) {
        super(list);
        this.i = new am0();
        this.j = new Path();
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public Path i(ep0<am0> ep0Var, float f) {
        this.i.c(ep0Var.d, ep0Var.e, f);
        am0 am0Var = this.i;
        List<pj0> list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                am0Var = this.k.get(size).d(am0Var);
            }
        }
        bp0.i(am0Var, this.j);
        return this.j;
    }

    public void q(@z1 List<pj0> list) {
        this.k = list;
    }
}