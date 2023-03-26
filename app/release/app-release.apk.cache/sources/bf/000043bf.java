package com.p7700g.p99005;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class g30 extends q30 {
    private static final float e = 1.0f;
    @z1
    private l30 f;
    @z1
    private l30 g;

    private float m(RecyclerView.o oVar, l30 l30Var) {
        int Q = oVar.Q();
        if (Q == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < Q; i3++) {
            View P = oVar.P(i3);
            int s0 = oVar.s0(P);
            if (s0 != -1) {
                if (s0 < i) {
                    view = P;
                    i = s0;
                }
                if (s0 > i2) {
                    view2 = P;
                    i2 = s0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(l30Var.d(view), l30Var.d(view2)) - Math.min(l30Var.g(view), l30Var.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    private int n(@x1 RecyclerView.o oVar, @x1 View view, l30 l30Var) {
        return ((l30Var.e(view) / 2) + l30Var.g(view)) - ((l30Var.o() / 2) + l30Var.n());
    }

    private int o(RecyclerView.o oVar, l30 l30Var, int i, int i2) {
        int[] d = d(i, i2);
        float m = m(oVar, l30Var);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1]) / m);
    }

    @z1
    private View p(RecyclerView.o oVar, l30 l30Var) {
        int Q = oVar.Q();
        View view = null;
        if (Q == 0) {
            return null;
        }
        int o = (l30Var.o() / 2) + l30Var.n();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < Q; i2++) {
            View P = oVar.P(i2);
            int abs = Math.abs(((l30Var.e(P) / 2) + l30Var.g(P)) - o);
            if (abs < i) {
                view = P;
                i = abs;
            }
        }
        return view;
    }

    @x1
    private l30 q(@x1 RecyclerView.o oVar) {
        l30 l30Var = this.g;
        if (l30Var == null || l30Var.d != oVar) {
            this.g = l30.a(oVar);
        }
        return this.g;
    }

    @x1
    private l30 r(@x1 RecyclerView.o oVar) {
        l30 l30Var = this.f;
        if (l30Var == null || l30Var.d != oVar) {
            this.f = l30.c(oVar);
        }
        return this.f;
    }

    @Override // com.p7700g.p99005.q30
    public int[] c(@x1 RecyclerView.o oVar, @x1 View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // com.p7700g.p99005.q30
    public View h(RecyclerView.o oVar) {
        if (oVar.o()) {
            return p(oVar, r(oVar));
        }
        if (oVar.n()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    @Override // com.p7700g.p99005.q30
    public int i(RecyclerView.o oVar, int i, int i2) {
        int g0;
        View h;
        int s0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.b0.b) || (g0 = oVar.g0()) == 0 || (h = h(oVar)) == null || (s0 = oVar.s0(h)) == -1 || (a = ((RecyclerView.b0.b) oVar).a(g0 - 1)) == null) {
            return -1;
        }
        if (oVar.n()) {
            i4 = o(oVar, q(oVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.o()) {
            i5 = o(oVar, r(oVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.o()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = s0 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= g0 ? i3 : i7;
    }
}