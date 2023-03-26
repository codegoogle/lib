package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public class h70 extends ViewGroup implements gr, fr, cr, br, hr, dr {
    private static final float A = 2.0f;
    private static final int B = -1;
    private static final float C = 0.5f;
    private static final float D = 0.8f;
    private static final int E = 150;
    private static final int F = 300;
    private static final int G = 200;
    private static final int H = 200;
    private static final int I = 64;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = -1;
    @r2
    public static final int v = 40;
    @r2
    public static final int w = 56;
    private static final int y = 255;
    private static final int z = 76;
    private boolean A0;
    private final DecelerateInterpolator B0;
    public f70 C0;
    private int D0;
    public int E0;
    public float F0;
    public int G0;
    public int H0;
    public int I0;
    public g70 J0;
    private View K;
    private Animation K0;
    public j L;
    private Animation L0;
    public boolean M;
    private Animation M0;
    private int N;
    private Animation N0;
    private float O;
    private Animation O0;
    private float P;
    public boolean P0;
    private final ir Q;
    private int Q0;
    private final er R;
    public boolean R0;
    private final int[] S;
    private i S0;
    private final int[] T;
    private boolean T0;
    private final int[] U;
    private Animation.AnimationListener U0;
    private boolean V;
    private final Animation V0;
    private int W;
    private final Animation W0;
    public int u0;
    private float v0;
    private float w0;
    private boolean x0;
    private int y0;
    public boolean z0;
    private static final String x = h70.class.getSimpleName();
    private static final int[] J = {16842766};

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            h70 h70Var = h70.this;
            if (h70Var.M) {
                h70Var.J0.setAlpha(255);
                h70.this.J0.start();
                h70 h70Var2 = h70.this;
                if (h70Var2.P0 && (jVar = h70Var2.L) != null) {
                    jVar.a();
                }
                h70 h70Var3 = h70.this;
                h70Var3.u0 = h70Var3.C0.getTop();
                return;
            }
            h70Var.r();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            h70.this.setAnimationProgress(f);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            h70.this.setAnimationProgress(1.0f - f);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class d extends Animation {
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;

        public d(int i, int i2) {
            this.s = i;
            this.t = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            g70 g70Var = h70.this.J0;
            int i = this.s;
            g70Var.setAlpha((int) (((this.t - i) * f) + i));
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h70 h70Var = h70.this;
            if (h70Var.z0) {
                return;
            }
            h70Var.z(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            h70 h70Var = h70.this;
            if (!h70Var.R0) {
                i = h70Var.H0 - Math.abs(h70Var.G0);
            } else {
                i = h70Var.H0;
            }
            h70 h70Var2 = h70.this;
            int i2 = h70Var2.E0;
            h70.this.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - h70Var2.C0.getTop());
            h70.this.J0.v(1.0f - f);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            h70.this.p(f);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            h70 h70Var = h70.this;
            float f2 = h70Var.F0;
            h70Var.setAnimationProgress(((-f2) * f) + f2);
            h70.this.p(f);
        }
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(@x1 h70 h70Var, @z1 View view);
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public h70(@x1 Context context) {
        this(context, null);
    }

    private void A(int i2, Animation.AnimationListener animationListener) {
        this.E0 = i2;
        this.F0 = this.C0.getScaleX();
        h hVar = new h();
        this.O0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.C0.c(animationListener);
        }
        this.C0.clearAnimation();
        this.C0.startAnimation(this.O0);
    }

    private void B(Animation.AnimationListener animationListener) {
        this.C0.setVisibility(0);
        this.J0.setAlpha(255);
        b bVar = new b();
        this.K0 = bVar;
        bVar.setDuration(this.W);
        if (animationListener != null) {
            this.C0.c(animationListener);
        }
        this.C0.clearAnimation();
        this.C0.startAnimation(this.K0);
    }

    private void g(int i2, Animation.AnimationListener animationListener) {
        this.E0 = i2;
        this.V0.reset();
        this.V0.setDuration(200L);
        this.V0.setInterpolator(this.B0);
        if (animationListener != null) {
            this.C0.c(animationListener);
        }
        this.C0.clearAnimation();
        this.C0.startAnimation(this.V0);
    }

    private void h(int i2, Animation.AnimationListener animationListener) {
        if (this.z0) {
            A(i2, animationListener);
            return;
        }
        this.E0 = i2;
        this.W0.reset();
        this.W0.setDuration(200L);
        this.W0.setInterpolator(this.B0);
        if (animationListener != null) {
            this.C0.c(animationListener);
        }
        this.C0.clearAnimation();
        this.C0.startAnimation(this.W0);
    }

    private void j() {
        this.C0 = new f70(getContext());
        g70 g70Var = new g70(getContext());
        this.J0 = g70Var;
        g70Var.F(1);
        this.C0.setImageDrawable(this.J0);
        this.C0.setVisibility(8);
        addView(this.C0);
    }

    private void k() {
        if (this.K == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.C0)) {
                    this.K = childAt;
                    return;
                }
            }
        }
    }

    private void l(float f2) {
        if (f2 > this.O) {
            u(true, true);
            return;
        }
        this.M = false;
        this.J0.C(0.0f, 0.0f);
        h(this.u0, this.z0 ? null : new e());
        this.J0.u(false);
    }

    private boolean m(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void o(float f2) {
        this.J0.u(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.O));
        float max = (((float) Math.max(min - 0.4d, (double) zg2.s)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.O;
        int i2 = this.I0;
        if (i2 <= 0) {
            if (this.R0) {
                i2 = this.H0 - this.G0;
            } else {
                i2 = this.H0;
            }
        }
        float f3 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.G0 + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.C0.getVisibility() != 0) {
            this.C0.setVisibility(0);
        }
        if (!this.z0) {
            this.C0.setScaleX(1.0f);
            this.C0.setScaleY(1.0f);
        }
        if (this.z0) {
            setAnimationProgress(Math.min(1.0f, f2 / this.O));
        }
        if (f2 < this.O) {
            if (this.J0.getAlpha() > 76 && !m(this.M0)) {
                y();
            }
        } else if (this.J0.getAlpha() < 255 && !m(this.N0)) {
            x();
        }
        this.J0.C(0.0f, Math.min((float) D, max * D));
        this.J0.v(Math.min(1.0f, max));
        this.J0.z(((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.u0);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y0) {
            this.y0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i2) {
        this.C0.getBackground().setAlpha(i2);
        this.J0.setAlpha(i2);
    }

    private void u(boolean z2, boolean z3) {
        if (this.M != z2) {
            this.P0 = z3;
            k();
            this.M = z2;
            if (z2) {
                g(this.u0, this.U0);
            } else {
                z(this.U0);
            }
        }
    }

    private Animation v(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300L);
        this.C0.c(null);
        this.C0.clearAnimation();
        this.C0.startAnimation(dVar);
        return dVar;
    }

    private void w(float f2) {
        float f3 = this.w0;
        int i2 = this.N;
        if (f2 - f3 <= i2 || this.x0) {
            return;
        }
        this.v0 = f3 + i2;
        this.x0 = true;
        this.J0.setAlpha(76);
    }

    private void x() {
        this.N0 = v(this.J0.getAlpha(), 255);
    }

    private void y() {
        this.M0 = v(this.J0.getAlpha(), 76);
    }

    @Override // com.p7700g.p99005.br
    public boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return i6 == 0 && this.R.g(i2, i3, i4, i5, iArr, i6);
    }

    @Override // com.p7700g.p99005.br
    public boolean b(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return i4 == 0 && dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    @Override // com.p7700g.p99005.cr
    public void c(int i2, int i3, int i4, int i5, @z1 int[] iArr, int i6, @x1 int[] iArr2) {
        if (i6 == 0) {
            this.R.e(i2, i3, i4, i5, iArr, i6, iArr2);
        }
    }

    @Override // com.p7700g.p99005.br
    public boolean d(int i2) {
        return i2 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.R.a(f2, f3, z2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.R.b(f2, f3);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.R.c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.R.f(i2, i3, i4, i5, iArr);
    }

    @Override // com.p7700g.p99005.br
    public boolean e(int i2, int i3) {
        return i3 == 0 && startNestedScroll(i2);
    }

    @Override // com.p7700g.p99005.br
    public void f(int i2) {
        if (i2 == 0) {
            stopNestedScroll();
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.D0;
        return i4 < 0 ? i3 : i3 == i2 + (-1) ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup, com.p7700g.p99005.hr
    public int getNestedScrollAxes() {
        return this.Q.a();
    }

    public int getProgressCircleDiameter() {
        return this.Q0;
    }

    public int getProgressViewEndOffset() {
        return this.H0;
    }

    public int getProgressViewStartOffset() {
        return this.G0;
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean hasNestedScrollingParent() {
        return this.R.k();
    }

    public boolean i() {
        i iVar = this.S0;
        if (iVar != null) {
            return iVar.a(this, this.K);
        }
        View view = this.K;
        if (view instanceof ListView) {
            return jt.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean isNestedScrollingEnabled() {
        return this.R.m();
    }

    public boolean n() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        k();
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0 && actionMasked == 0) {
            this.A0 = false;
        }
        if (!isEnabled() || this.A0 || i() || this.M || this.V) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.y0;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    w(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.x0 = false;
            this.y0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.G0 - this.C0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.y0 = pointerId;
            this.x0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.w0 = motionEvent.getY(findPointerIndex2);
        }
        return this.x0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.K == null) {
            k();
        }
        View view = this.K;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.C0.getMeasuredWidth();
        int measuredHeight2 = this.C0.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.u0;
        this.C0.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.K == null) {
            k();
        }
        View view = this.K;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.C0.measure(View.MeasureSpec.makeMeasureSpec(this.Q0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.Q0, 1073741824));
        this.D0 = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.C0) {
                this.D0 = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // com.p7700g.p99005.gr
    public void onNestedScroll(@x1 View view, int i2, int i3, int i4, int i5, int i6, @x1 int[] iArr) {
        if (i6 != 0) {
            return;
        }
        int i7 = iArr[1];
        c(i2, i3, i4, i5, this.T, i6, iArr);
        int i8 = i5 - (iArr[1] - i7);
        int i9 = i8 == 0 ? i5 + this.T[1] : i8;
        if (i9 >= 0 || i()) {
            return;
        }
        float abs = this.P + Math.abs(i9);
        this.P = abs;
        o(abs);
        iArr[1] = iArr[1] + i8;
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.s);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.M);
    }

    @Override // com.p7700g.p99005.fr
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    @Override // com.p7700g.p99005.fr
    public void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0 && actionMasked == 0) {
            this.A0 = false;
        }
        if (!isEnabled() || this.A0 || i() || this.M || this.V) {
            return false;
        }
        if (actionMasked == 0) {
            this.y0 = motionEvent.getPointerId(0);
            this.x0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.y0);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.x0) {
                this.x0 = false;
                l((motionEvent.getY(findPointerIndex) - this.v0) * 0.5f);
            }
            this.y0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.y0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            w(y2);
            if (this.x0) {
                float f2 = (y2 - this.v0) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                o(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.y0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    public void p(float f2) {
        int i2 = this.E0;
        setTargetOffsetTopAndBottom((i2 + ((int) ((this.G0 - i2) * f2))) - this.C0.getTop());
    }

    public void r() {
        this.C0.clearAnimation();
        this.J0.stop();
        this.C0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.z0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.G0 - this.u0);
        }
        this.u0 = this.C0.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        ViewParent parent;
        View view = this.K;
        if (view != null && !sr.V0(view)) {
            if (this.T0 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z2);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void s(boolean z2, int i2) {
        this.H0 = i2;
        this.z0 = z2;
        this.C0.invalidate();
    }

    public void setAnimationProgress(float f2) {
        this.C0.setScaleX(f2);
        this.C0.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(@y0 int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@w0 int... iArr) {
        k();
        this.J0.y(iArr);
    }

    public void setColorSchemeResources(@y0 int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = gh.f(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.O = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (z2) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z2) {
        this.T0 = z2;
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void setNestedScrollingEnabled(boolean z2) {
        this.R.p(z2);
    }

    public void setOnChildScrollUpCallback(@z1 i iVar) {
        this.S0 = iVar;
    }

    public void setOnRefreshListener(@z1 j jVar) {
        this.L = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(@w0 int i2) {
        this.C0.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(@y0 int i2) {
        setProgressBackgroundColorSchemeColor(gh.f(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (z2 && this.M != z2) {
            this.M = z2;
            if (!this.R0) {
                i2 = this.H0 + this.G0;
            } else {
                i2 = this.H0;
            }
            setTargetOffsetTopAndBottom(i2 - this.u0);
            this.P0 = false;
            B(this.U0);
            return;
        }
        u(z2, false);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.Q0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.Q0 = (int) (displayMetrics.density * 40.0f);
            }
            this.C0.setImageDrawable(null);
            this.J0.F(i2);
            this.C0.setImageDrawable(this.J0);
        }
    }

    public void setSlingshotDistance(@c2 int i2) {
        this.I0 = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.C0.bringToFront();
        sr.e1(this.C0, i2);
        this.u0 = this.C0.getTop();
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean startNestedScroll(int i2) {
        return this.R.r(i2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void stopNestedScroll() {
        this.R.t();
    }

    public void t(boolean z2, int i2, int i3) {
        this.z0 = z2;
        this.G0 = i2;
        this.H0 = i3;
        this.R0 = true;
        r();
        this.M = false;
    }

    public void z(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.L0 = cVar;
        cVar.setDuration(150L);
        this.C0.c(animationListener);
        this.C0.clearAnimation();
        this.C0.startAnimation(this.L0);
    }

    /* compiled from: SwipeRefreshLayout.java */
    /* loaded from: classes.dex */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public final boolean s;

        /* compiled from: SwipeRefreshLayout.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.s = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.s = parcel.readByte() != 0;
        }
    }

    public h70(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = false;
        this.O = -1.0f;
        this.S = new int[2];
        this.T = new int[2];
        this.U = new int[2];
        this.y0 = -1;
        this.D0 = -1;
        this.U0 = new a();
        this.V0 = new f();
        this.W0 = new g();
        this.N = ViewConfiguration.get(context).getScaledTouchSlop();
        this.W = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.B0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.Q0 = (int) (displayMetrics.density * 40.0f);
        j();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.H0 = i2;
        this.O = i2;
        this.Q = new ir(this);
        this.R = new er(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.Q0;
        this.u0 = i3;
        this.G0 = i3;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.P;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.P = 0.0f;
                } else {
                    this.P = f2 - f3;
                    iArr[1] = i3;
                }
                o(this.P);
            }
        }
        if (this.R0 && i3 > 0 && this.P == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.C0.setVisibility(8);
        }
        int[] iArr2 = this.S;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.Q.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.P = 0.0f;
        this.V = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.A0 || this.M || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onStopNestedScroll(View view) {
        this.Q.d(view);
        this.V = false;
        float f2 = this.P;
        if (f2 > 0.0f) {
            l(f2);
            this.P = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(view, i2, i3, i4, i5, i6, this.U);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0, this.U);
    }
}