package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public class go0 implements mo0<am0> {
    public static final go0 a = new go0();
    private static final po0.a b = po0.a.a("c", com.ironsource.sdk.controller.v.a, "i", ij3.b);

    private go0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public am0 a(po0 po0Var, float f) throws IOException {
        if (po0Var.s() == po0.b.BEGIN_ARRAY) {
            po0Var.b();
        }
        po0Var.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(b);
            if (w == 0) {
                z = po0Var.j();
            } else if (w == 1) {
                list = rn0.f(po0Var, f);
            } else if (w == 2) {
                list2 = rn0.f(po0Var, f);
            } else if (w != 3) {
                po0Var.z();
                po0Var.A();
            } else {
                list3 = rn0.f(po0Var, f);
            }
        }
        po0Var.f();
        if (po0Var.s() == po0.b.END_ARRAY) {
            po0Var.e();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new am0(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new pk0(bp0.a(list.get(i2), list3.get(i2)), bp0.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new pk0(bp0.a(list.get(i3), list3.get(i3)), bp0.a(pointF3, list2.get(0)), pointF3));
            }
            return new am0(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}