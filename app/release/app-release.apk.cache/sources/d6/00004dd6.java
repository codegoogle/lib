package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class l30 {
    private static final int a = Integer.MIN_VALUE;
    public static final int b = 0;
    public static final int c = 1;
    public final RecyclerView.o d;
    private int e;
    public final Rect f;

    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public static class a extends l30 {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // com.p7700g.p99005.l30
        public int d(View view) {
            return this.d.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.d.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.d.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int g(View view) {
            return this.d.Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int h() {
            return this.d.z0();
        }

        @Override // com.p7700g.p99005.l30
        public int i() {
            return this.d.z0() - this.d.p0();
        }

        @Override // com.p7700g.p99005.l30
        public int j() {
            return this.d.p0();
        }

        @Override // com.p7700g.p99005.l30
        public int l() {
            return this.d.A0();
        }

        @Override // com.p7700g.p99005.l30
        public int m() {
            return this.d.f0();
        }

        @Override // com.p7700g.p99005.l30
        public int n() {
            return this.d.o0();
        }

        @Override // com.p7700g.p99005.l30
        public int o() {
            return (this.d.z0() - this.d.o0()) - this.d.p0();
        }

        @Override // com.p7700g.p99005.l30
        public int q(View view) {
            this.d.y0(view, true, this.f);
            return this.f.right;
        }

        @Override // com.p7700g.p99005.l30
        public int r(View view) {
            this.d.y0(view, true, this.f);
            return this.f.left;
        }

        @Override // com.p7700g.p99005.l30
        public void s(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        @Override // com.p7700g.p99005.l30
        public void t(int i) {
            this.d.T0(i);
        }
    }

    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public static class b extends l30 {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // com.p7700g.p99005.l30
        public int d(View view) {
            return this.d.W(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.d.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.d.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int g(View view) {
            return this.d.c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // com.p7700g.p99005.l30
        public int h() {
            return this.d.e0();
        }

        @Override // com.p7700g.p99005.l30
        public int i() {
            return this.d.e0() - this.d.m0();
        }

        @Override // com.p7700g.p99005.l30
        public int j() {
            return this.d.m0();
        }

        @Override // com.p7700g.p99005.l30
        public int l() {
            return this.d.f0();
        }

        @Override // com.p7700g.p99005.l30
        public int m() {
            return this.d.A0();
        }

        @Override // com.p7700g.p99005.l30
        public int n() {
            return this.d.r0();
        }

        @Override // com.p7700g.p99005.l30
        public int o() {
            return (this.d.e0() - this.d.r0()) - this.d.m0();
        }

        @Override // com.p7700g.p99005.l30
        public int q(View view) {
            this.d.y0(view, true, this.f);
            return this.f.bottom;
        }

        @Override // com.p7700g.p99005.l30
        public int r(View view) {
            this.d.y0(view, true, this.f);
            return this.f.top;
        }

        @Override // com.p7700g.p99005.l30
        public void s(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        @Override // com.p7700g.p99005.l30
        public void t(int i) {
            this.d.U0(i);
        }
    }

    public /* synthetic */ l30(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static l30 a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static l30 b(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(oVar);
    }

    public static l30 c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.o k() {
        return this.d;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.e) {
            return 0;
        }
        return o() - this.e;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i);

    public abstract void t(int i);

    public void u() {
        this.e = o();
    }

    private l30(RecyclerView.o oVar) {
        this.e = Integer.MIN_VALUE;
        this.f = new Rect();
        this.d = oVar;
    }
}