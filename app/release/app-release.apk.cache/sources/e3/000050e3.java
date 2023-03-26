package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p7700g.p99005.lp3;
import com.p7700g.p99005.lr3;
import com.p7700g.p99005.nq3;

/* compiled from: PageIndicatorView.java */
/* loaded from: classes3.dex */
public class mp3 extends View implements lr3.j, lp3.a, lr3.i {
    private lp3 s;
    private DataSetObserver t;
    private lr3 u;
    private boolean v;

    /* compiled from: PageIndicatorView.java */
    /* loaded from: classes3.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            mp3.this.v();
        }
    }

    /* compiled from: PageIndicatorView.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            sq3.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[sq3.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sq3.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sq3.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public mp3(Context context) {
        super(context);
        k(null);
    }

    private int g(int i) {
        int c = this.s.d().c() - 1;
        if (i <= 0) {
            return 0;
        }
        return i > c ? c : i;
    }

    @z1
    private lr3 i(@x1 ViewGroup viewGroup, int i) {
        View findViewById;
        if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i)) != null && (findViewById instanceof lr3)) {
            return (lr3) findViewById;
        }
        return null;
    }

    private void j(@z1 ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup) && ((ViewGroup) viewParent).getChildCount() > 0) {
            lr3 i = i((ViewGroup) viewParent, this.s.d().t());
            if (i != null) {
                setViewPager(i);
            } else {
                j(viewParent.getParent());
            }
        }
    }

    private void k(@z1 AttributeSet attributeSet) {
        t();
        l(attributeSet);
    }

    private void l(@z1 AttributeSet attributeSet) {
        lp3 lp3Var = new lp3(this);
        this.s = lp3Var;
        lp3Var.c().c(getContext(), attributeSet);
        pq3 d = this.s.d();
        d.J(getPaddingLeft());
        d.L(getPaddingTop());
        d.K(getPaddingRight());
        d.I(getPaddingBottom());
        this.v = d.x();
    }

    private boolean m() {
        int ordinal = this.s.d().m().ordinal();
        if (ordinal != 0) {
            return ordinal == 2 && mo.b(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean n() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void o(int i, float f) {
        pq3 d = this.s.d();
        if (n() && d.x() && d.b() != eq3.NONE) {
            Pair<Integer, Float> e = fr3.e(d, i, f, m());
            s(((Integer) e.first).intValue(), ((Float) e.second).floatValue());
        }
    }

    private void p(int i) {
        pq3 d = this.s.d();
        boolean n = n();
        int c = d.c();
        if (n) {
            if (m()) {
                i = (c - 1) - i;
            }
            setSelection(i);
        }
    }

    private void q() {
        lr3 lr3Var;
        if (this.t != null || (lr3Var = this.u) == null || lr3Var.getAdapter() == null) {
            return;
        }
        this.t = new a();
        try {
            this.u.getAdapter().m(this.t);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void t() {
        if (getId() == -1) {
            setId(hr3.b());
        }
    }

    private void u() {
        lr3 lr3Var;
        if (this.t == null || (lr3Var = this.u) == null || lr3Var.getAdapter() == null) {
            return;
        }
        try {
            this.u.getAdapter().u(this.t);
            this.t = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        int e;
        int currentItem;
        lr3 lr3Var = this.u;
        if (lr3Var == null || lr3Var.getAdapter() == null) {
            return;
        }
        if (this.u.getAdapter() instanceof ir3) {
            e = ((ir3) this.u.getAdapter()).x();
            currentItem = e > 0 ? this.u.getCurrentItem() % e : 0;
        } else {
            e = this.u.getAdapter().e();
            currentItem = this.u.getCurrentItem();
        }
        if (m()) {
            currentItem = (e - 1) - currentItem;
        }
        this.s.d().Q(currentItem);
        this.s.d().R(currentItem);
        this.s.d().F(currentItem);
        this.s.d().B(e);
        this.s.b().b();
        w();
        requestLayout();
    }

    private void w() {
        if (this.s.d().v()) {
            int c = this.s.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && c > 1) {
                setVisibility(0);
            } else if (visibility == 4 || c > 1) {
            } else {
                setVisibility(4);
            }
        }
    }

    @Override // com.p7700g.p99005.lr3.j
    public void a(int i, float f, int i2) {
        o(i, f);
    }

    @Override // com.p7700g.p99005.lr3.j
    public void b(int i) {
        if (i == 0) {
            this.s.d().E(this.v);
        }
    }

    @Override // com.p7700g.p99005.lr3.j
    public void c(int i) {
        p(i);
    }

    @Override // com.p7700g.p99005.lp3.a
    public void d() {
        invalidate();
    }

    @Override // com.p7700g.p99005.lr3.i
    public void e(@x1 lr3 lr3Var, @z1 ra0 ra0Var, @z1 ra0 ra0Var2) {
        v();
    }

    public long getAnimationDuration() {
        return this.s.d().a();
    }

    public int getCount() {
        return this.s.d().c();
    }

    public int getPadding() {
        return this.s.d().g();
    }

    public int getRadius() {
        return this.s.d().l();
    }

    public float getScaleFactor() {
        return this.s.d().n();
    }

    public int getSelectedColor() {
        return this.s.d().o();
    }

    public int getSelection() {
        return this.s.d().p();
    }

    public int getStrokeWidth() {
        return this.s.d().r();
    }

    public int getUnselectedColor() {
        return this.s.d().s();
    }

    public void h() {
        pq3 d = this.s.d();
        d.E(false);
        d.F(-1);
        d.R(-1);
        d.Q(-1);
        this.s.b().a();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j(getParent());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        u();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.s.c().a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> d = this.s.c().d(i, i2);
        setMeasuredDimension(((Integer) d.first).intValue(), ((Integer) d.second).intValue());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof rq3) {
            pq3 d = this.s.d();
            rq3 rq3Var = (rq3) parcelable;
            d.Q(rq3Var.d());
            d.R(rq3Var.e());
            d.F(rq3Var.c());
            super.onRestoreInstanceState(rq3Var.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        pq3 d = this.s.d();
        rq3 rq3Var = new rq3(super.onSaveInstanceState());
        rq3Var.i(d.p());
        rq3Var.j(d.q());
        rq3Var.g(d.e());
        return rq3Var;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.s.c().f(motionEvent);
        return true;
    }

    public void r() {
        lr3 lr3Var = this.u;
        if (lr3Var != null) {
            lr3Var.P(this);
            this.u = null;
        }
    }

    public void s(int i, float f) {
        pq3 d = this.s.d();
        if (d.x()) {
            int c = d.c();
            if (c <= 0 || i < 0) {
                i = 0;
            } else {
                int i2 = c - 1;
                if (i > i2) {
                    i = i2;
                }
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                d.F(d.p());
                d.Q(i);
            }
            d.R(i);
            this.s.b().c(f);
        }
    }

    public void setAnimationDuration(long j) {
        this.s.d().y(j);
    }

    public void setAnimationType(@z1 eq3 eq3Var) {
        this.s.a(null);
        if (eq3Var != null) {
            this.s.d().z(eq3Var);
        } else {
            this.s.d().z(eq3.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.s.d().A(z);
        w();
    }

    public void setClickListener(@z1 nq3.b bVar) {
        this.s.c().e(bVar);
    }

    public void setCount(int i) {
        if (i < 0 || this.s.d().c() == i) {
            return;
        }
        this.s.d().B(i);
        w();
        requestLayout();
    }

    public void setDynamicCount(boolean z) {
        this.s.d().C(z);
        if (z) {
            q();
        } else {
            u();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.s.d().E(z);
        this.v = z;
    }

    public void setOrientation(@z1 qq3 qq3Var) {
        if (qq3Var != null) {
            this.s.d().G(qq3Var);
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.s.d().H(gr3.a(i));
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.s.d().M(gr3.a(i));
        invalidate();
    }

    public void setRtlMode(@z1 sq3 sq3Var) {
        pq3 d = this.s.d();
        if (sq3Var == null) {
            d.N(sq3.Off);
        } else {
            d.N(sq3Var);
        }
        if (this.u == null) {
            return;
        }
        int p = d.p();
        if (m()) {
            p = (d.c() - 1) - p;
        } else {
            lr3 lr3Var = this.u;
            if (lr3Var != null) {
                p = lr3Var.getCurrentItem();
            }
        }
        d.F(p);
        d.R(p);
        d.Q(p);
        invalidate();
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.s.d().O(f);
    }

    public void setSelected(int i) {
        pq3 d = this.s.d();
        eq3 b2 = d.b();
        d.z(eq3.NONE);
        setSelection(i);
        d.z(b2);
    }

    public void setSelectedColor(int i) {
        this.s.d().P(i);
        invalidate();
    }

    public void setSelection(int i) {
        pq3 d = this.s.d();
        int g = g(i);
        if (g == d.p() || g == d.q()) {
            return;
        }
        d.E(false);
        d.F(d.p());
        d.R(g);
        d.Q(g);
        this.s.b().a();
    }

    public void setStrokeWidth(float f) {
        int l = this.s.d().l();
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = l;
            if (f > f2) {
                f = f2;
            }
        }
        this.s.d().S((int) f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.s.d().T(i);
        invalidate();
    }

    public void setViewPager(@z1 lr3 lr3Var) {
        r();
        if (lr3Var == null) {
            return;
        }
        this.u = lr3Var;
        lr3Var.d(this);
        this.u.c(this);
        this.s.d().U(this.u.getId());
        setDynamicCount(this.s.d().w());
        v();
    }

    public mp3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(attributeSet);
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.s.d().H((int) f);
        invalidate();
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.s.d().M((int) f);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int a2 = gr3.a(i);
        int l = this.s.d().l();
        if (a2 < 0) {
            a2 = 0;
        } else if (a2 > l) {
            a2 = l;
        }
        this.s.d().S(a2);
        invalidate();
    }

    public mp3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k(attributeSet);
    }

    @TargetApi(21)
    public mp3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        k(attributeSet);
    }
}