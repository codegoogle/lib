package com.p7700g.p99005;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class m30 extends q30 {
    private static final int e = 100;
    @z1
    private l30 f;
    @z1
    private l30 g;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends f30 {
        public a(Context context) {
            super(context);
        }

        @Override // com.p7700g.p99005.f30, androidx.recyclerview.widget.RecyclerView.b0
        public void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            m30 m30Var = m30.this;
            int[] c = m30Var.c(m30Var.b.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int x = x(Math.max(Math.abs(i), Math.abs(i2)));
            if (x > 0) {
                aVar.l(i, i2, x, this.q);
            }
        }

        @Override // com.p7700g.p99005.f30
        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // com.p7700g.p99005.f30
        public int y(int i) {
            return Math.min(100, super.y(i));
        }
    }

    private int m(@x1 RecyclerView.o oVar, @x1 View view, l30 l30Var) {
        return ((l30Var.e(view) / 2) + l30Var.g(view)) - ((l30Var.o() / 2) + l30Var.n());
    }

    @z1
    private View n(RecyclerView.o oVar, l30 l30Var) {
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
    private l30 o(@x1 RecyclerView.o oVar) {
        l30 l30Var = this.g;
        if (l30Var == null || l30Var.d != oVar) {
            this.g = l30.a(oVar);
        }
        return this.g;
    }

    @z1
    private l30 p(RecyclerView.o oVar) {
        if (oVar.o()) {
            return q(oVar);
        }
        if (oVar.n()) {
            return o(oVar);
        }
        return null;
    }

    @x1
    private l30 q(@x1 RecyclerView.o oVar) {
        l30 l30Var = this.f;
        if (l30Var == null || l30Var.d != oVar) {
            this.f = l30.c(oVar);
        }
        return this.f;
    }

    private boolean r(RecyclerView.o oVar, int i, int i2) {
        return oVar.n() ? i > 0 : i2 > 0;
    }

    private boolean s(RecyclerView.o oVar) {
        PointF a2;
        int g0 = oVar.g0();
        if (!(oVar instanceof RecyclerView.b0.b) || (a2 = ((RecyclerView.b0.b) oVar).a(g0 - 1)) == null) {
            return false;
        }
        return a2.x < 0.0f || a2.y < 0.0f;
    }

    @Override // com.p7700g.p99005.q30
    @z1
    public int[] c(@x1 RecyclerView.o oVar, @x1 View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = m(oVar, view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = m(oVar, view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // com.p7700g.p99005.q30
    public f30 f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new a(this.b.getContext());
        }
        return null;
    }

    @Override // com.p7700g.p99005.q30
    @z1
    public View h(RecyclerView.o oVar) {
        if (oVar.o()) {
            return n(oVar, q(oVar));
        }
        if (oVar.n()) {
            return n(oVar, o(oVar));
        }
        return null;
    }

    @Override // com.p7700g.p99005.q30
    public int i(RecyclerView.o oVar, int i, int i2) {
        l30 p;
        int g0 = oVar.g0();
        if (g0 == 0 || (p = p(oVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int Q = oVar.Q();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < Q; i5++) {
            View P = oVar.P(i5);
            if (P != null) {
                int m = m(oVar, P, p);
                if (m <= 0 && m > i3) {
                    view2 = P;
                    i3 = m;
                }
                if (m >= 0 && m < i4) {
                    view = P;
                    i4 = m;
                }
            }
        }
        boolean r = r(oVar, i, i2);
        if (!r || view == null) {
            if (r || view2 == null) {
                if (r) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int s0 = oVar.s0(view) + (s(oVar) == r ? -1 : 1);
                if (s0 < 0 || s0 >= g0) {
                    return -1;
                }
                return s0;
            }
            return oVar.s0(view2);
        }
        return oVar.s0(view);
    }
}