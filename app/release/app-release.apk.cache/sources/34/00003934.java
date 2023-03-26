package com.p7700g.p99005;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public class am0 {
    private final List<pk0> a;
    private PointF b;
    private boolean c;

    public am0(PointF pointF, boolean z, List<pk0> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List<pk0> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(am0 am0Var, am0 am0Var2, @g1(from = 0.0d, to = 1.0d) float f) {
        List<pk0> list;
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = am0Var.d() || am0Var2.d();
        if (am0Var.a().size() != am0Var2.a().size()) {
            StringBuilder G = wo1.G("Curves must have the same number of control points. Shape 1: ");
            G.append(am0Var.a().size());
            G.append("\tShape 2: ");
            G.append(am0Var2.a().size());
            yo0.e(G.toString());
        }
        int min = Math.min(am0Var.a().size(), am0Var2.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new pk0());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                this.a.remove(list.size() - 1);
            }
        }
        PointF b = am0Var.b();
        PointF b2 = am0Var2.b();
        f(bp0.k(b.x, b2.x, f), bp0.k(b.y, b2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            pk0 pk0Var = am0Var.a().get(size3);
            pk0 pk0Var2 = am0Var2.a().get(size3);
            PointF a = pk0Var.a();
            PointF b3 = pk0Var.b();
            PointF c = pk0Var.c();
            PointF a2 = pk0Var2.a();
            PointF b4 = pk0Var2.b();
            PointF c2 = pk0Var2.c();
            this.a.get(size3).d(bp0.k(a.x, a2.x, f), bp0.k(a.y, a2.y, f));
            this.a.get(size3).e(bp0.k(b3.x, b4.x, f), bp0.k(b3.y, b4.y, f));
            this.a.get(size3).g(bp0.k(c.x, c2.x, f), bp0.k(c.y, c2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        StringBuilder G = wo1.G("ShapeData{numCurves=");
        G.append(this.a.size());
        G.append("closed=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }

    public am0() {
        this.a = new ArrayList();
    }
}