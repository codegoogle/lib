package com.p7700g.p99005;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class q30 extends RecyclerView.r {
    public static final float a = 100.0f;
    public RecyclerView b;
    private Scroller c;
    private final RecyclerView.t d = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                q30.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class b extends f30 {
        public b(Context context) {
            super(context);
        }

        @Override // com.p7700g.p99005.f30, androidx.recyclerview.widget.RecyclerView.b0
        public void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            q30 q30Var = q30.this;
            RecyclerView recyclerView = q30Var.b;
            if (recyclerView == null) {
                return;
            }
            int[] c = q30Var.c(recyclerView.getLayoutManager(), view);
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
    }

    private void g() {
        this.b.s1(this.d);
        this.b.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.b.getOnFlingListener() == null) {
            this.b.q(this.d);
            this.b.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(@x1 RecyclerView.o oVar, int i, int i2) {
        RecyclerView.b0 e;
        int i3;
        if (!(oVar instanceof RecyclerView.b0.b) || (e = e(oVar)) == null || (i3 = i(oVar, i, i2)) == -1) {
            return false;
        }
        e.q(i3);
        oVar.g2(e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.b.getLayoutManager();
        if (layoutManager == null || this.b.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.b.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && k(layoutManager, i, i2);
    }

    public void b(@z1 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.b = recyclerView;
        if (recyclerView != null) {
            j();
            this.c = new Scroller(this.b.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @z1
    public abstract int[] c(@x1 RecyclerView.o oVar, @x1 View view);

    public int[] d(int i, int i2) {
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.c.getFinalX(), this.c.getFinalY()};
    }

    @z1
    public RecyclerView.b0 e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @z1
    @Deprecated
    public f30 f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new b(this.b.getContext());
        }
        return null;
    }

    @z1
    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i, int i2);

    public void l() {
        RecyclerView.o layoutManager;
        View h;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h = h(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, h);
        if (c[0] == 0 && c[1] == 0) {
            return;
        }
        this.b.F1(c[0], c[1]);
    }
}