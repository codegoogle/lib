package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes2.dex */
public class sa2 extends FrameLayout {
    private static final int s = ga2.n.f23de;
    private static final int t = 600;
    public static final int u = 0;
    public static final int v = 1;
    private View A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final Rect F;
    @x1
    public final he2 G;
    @x1
    public final ud2 H;
    private boolean I;
    private boolean J;
    @z1
    private Drawable K;
    @z1
    public Drawable L;
    private int M;
    private boolean N;
    private ValueAnimator O;
    private long P;
    private int Q;
    private AppBarLayout.h R;
    public int S;
    private int T;
    @z1
    public gs U;
    private int V;
    private boolean W;
    private int u0;
    private boolean v0;
    private boolean w;
    private int x;
    @z1
    private ViewGroup y;
    @z1
    private View z;

    /* compiled from: CollapsingToolbarLayout.java */
    /* loaded from: classes2.dex */
    public class a implements jr {
        public a() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, @x1 gs gsVar) {
            return sa2.this.r(gsVar);
        }
    }

    /* compiled from: CollapsingToolbarLayout.java */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            sa2.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: CollapsingToolbarLayout.java */
    /* loaded from: classes2.dex */
    public class d implements AppBarLayout.h {
        public d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.h, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            int height;
            sa2 sa2Var = sa2.this;
            sa2Var.S = i;
            gs gsVar = sa2Var.U;
            int r = gsVar != null ? gsVar.r() : 0;
            int childCount = sa2.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = sa2.this.getChildAt(i2);
                c cVar = (c) childAt.getLayoutParams();
                wa2 j = sa2.j(childAt);
                int i3 = cVar.e;
                if (i3 == 1) {
                    j.k(bm.e(-i, 0, sa2.this.h(childAt)));
                } else if (i3 == 2) {
                    j.k(Math.round((-i) * cVar.f));
                }
            }
            sa2.this.z();
            sa2 sa2Var2 = sa2.this;
            if (sa2Var2.L != null && r > 0) {
                sr.m1(sa2Var2);
            }
            int height2 = (sa2.this.getHeight() - sr.d0(sa2.this)) - r;
            float f = height2;
            sa2.this.G.B0(Math.min(1.0f, (height - sa2.this.getScrimVisibleHeightTrigger()) / f));
            sa2 sa2Var3 = sa2.this;
            sa2Var3.G.o0(sa2Var3.S + height2);
            sa2.this.G.z0(Math.abs(i) / f);
        }
    }

    /* compiled from: CollapsingToolbarLayout.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface e {
    }

    public sa2(@x1 Context context) {
        this(context, null);
    }

    private void A(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.I || (view = this.A) == null) {
            return;
        }
        boolean z2 = sr.N0(view) && this.A.getVisibility() == 0;
        this.J = z2;
        if (z2 || z) {
            boolean z3 = sr.Y(this) == 1;
            u(z3);
            this.G.p0(z3 ? this.D : this.B, this.F.top + this.C, (i3 - i) - (z3 ? this.B : this.D), (i4 - i2) - this.E);
            this.G.d0(z);
        }
    }

    private void B() {
        if (this.y != null && this.I && TextUtils.isEmpty(this.G.P())) {
            setTitle(i(this.y));
        }
    }

    private void a(int i) {
        TimeInterpolator timeInterpolator;
        c();
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.O = valueAnimator2;
            if (i > this.M) {
                timeInterpolator = ha2.c;
            } else {
                timeInterpolator = ha2.d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.O.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.O.cancel();
        }
        this.O.setDuration(this.P);
        this.O.setIntValues(this.M, i);
        this.O.start();
    }

    private void b(AppBarLayout appBarLayout) {
        if (n()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void c() {
        if (this.w) {
            ViewGroup viewGroup = null;
            this.y = null;
            this.z = null;
            int i = this.x;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.y = viewGroup2;
                if (viewGroup2 != null) {
                    this.z = d(viewGroup2);
                }
            }
            if (this.y == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (p(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.y = viewGroup;
            }
            y();
            this.w = false;
        }
    }

    @x1
    private View d(@x1 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    private static int g(@x1 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @x1
    public static wa2 j(@x1 View view) {
        int i = ga2.h.i6;
        wa2 wa2Var = (wa2) view.getTag(i);
        if (wa2Var == null) {
            wa2 wa2Var2 = new wa2(view);
            view.setTag(i, wa2Var2);
            return wa2Var2;
        }
        return wa2Var;
    }

    private boolean n() {
        return this.T == 1;
    }

    private static boolean p(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean q(View view) {
        View view2 = this.z;
        if (view2 == null || view2 == this) {
            if (view == this.y) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void u(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.z;
        if (view == null) {
            view = this.y;
        }
        int h = h(view);
        je2.a(this, this.A, this.F);
        ViewGroup viewGroup = this.y;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i3 = toolbar.getTitleMarginTop();
            i = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i3 = toolbar2.getTitleMarginTop();
            i = toolbar2.getTitleMarginBottom();
        }
        he2 he2Var = this.G;
        Rect rect = this.F;
        int i5 = rect.left + (z ? i2 : i4);
        int i6 = rect.top + h + i3;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        he2Var.f0(i5, i6, i7 - i4, (rect.bottom + h) - i);
    }

    private void v() {
        setContentDescription(getTitle());
    }

    private void w(@x1 Drawable drawable, int i, int i2) {
        x(drawable, this.y, i, i2);
    }

    private void x(@x1 Drawable drawable, @z1 View view, int i, int i2) {
        if (n() && view != null && this.I) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void y() {
        View view;
        if (!this.I && (view = this.A) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A);
            }
        }
        if (!this.I || this.y == null) {
            return;
        }
        if (this.A == null) {
            this.A = new View(getContext());
        }
        if (this.A.getParent() == null) {
            this.y.addView(this.A, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.y == null && (drawable = this.K) != null && this.M > 0) {
            drawable.mutate().setAlpha(this.M);
            this.K.draw(canvas);
        }
        if (this.I && this.J) {
            if (this.y != null && this.K != null && this.M > 0 && n() && this.G.G() < this.G.H()) {
                int save = canvas.save();
                canvas.clipRect(this.K.getBounds(), Region.Op.DIFFERENCE);
                this.G.l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.G.l(canvas);
            }
        }
        if (this.L == null || this.M <= 0) {
            return;
        }
        gs gsVar = this.U;
        int r = gsVar != null ? gsVar.r() : 0;
        if (r > 0) {
            this.L.setBounds(0, -this.S, getWidth(), r - this.S);
            this.L.mutate().setAlpha(this.M);
            this.L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.K == null || this.M <= 0 || !q(view)) {
            z = false;
        } else {
            x(this.K, view, getWidth(), getHeight());
            this.K.mutate().setAlpha(this.M);
            this.K.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        he2 he2Var = this.G;
        if (he2Var != null) {
            z |= he2Var.J0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.G.q();
    }

    @x1
    public Typeface getCollapsedTitleTypeface() {
        return this.G.v();
    }

    @z1
    public Drawable getContentScrim() {
        return this.K;
    }

    public int getExpandedTitleGravity() {
        return this.G.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.E;
    }

    public int getExpandedTitleMarginEnd() {
        return this.D;
    }

    public int getExpandedTitleMarginStart() {
        return this.B;
    }

    public int getExpandedTitleMarginTop() {
        return this.C;
    }

    @x1
    public Typeface getExpandedTitleTypeface() {
        return this.G.F();
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.G.I();
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int getLineCount() {
        return this.G.J();
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.G.K();
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.G.L();
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.G.M();
    }

    public int getScrimAlpha() {
        return this.M;
    }

    public long getScrimAnimationDuration() {
        return this.P;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.Q;
        if (i >= 0) {
            return i + this.V + this.u0;
        }
        gs gsVar = this.U;
        int r = gsVar != null ? gsVar.r() : 0;
        int d0 = sr.d0(this);
        if (d0 > 0) {
            return Math.min((d0 * 2) + r, getHeight());
        }
        return getHeight() / 3;
    }

    @z1
    public Drawable getStatusBarScrim() {
        return this.L;
    }

    @z1
    public CharSequence getTitle() {
        if (this.I) {
            return this.G.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.T;
    }

    @z1
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.G.O();
    }

    public final int h(@x1 View view) {
        return ((getHeight() - j(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean k() {
        return this.v0;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean l() {
        return this.W;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean m() {
        return this.G.V();
    }

    public boolean o() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            sr.N1(this, sr.T(appBarLayout));
            if (this.R == null) {
                this.R = new d();
            }
            appBarLayout.e(this.R);
            sr.u1(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@x1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G.Z(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.h hVar = this.R;
        if (hVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gs gsVar = this.U;
        if (gsVar != null) {
            int r = gsVar.r();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!sr.T(childAt) && childAt.getTop() < r) {
                    sr.e1(childAt, r);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            j(getChildAt(i6)).h();
        }
        A(i, i2, i3, i4, false);
        B();
        z();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            j(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        gs gsVar = this.U;
        int r = gsVar != null ? gsVar.r() : 0;
        if ((mode == 0 || this.W) && r > 0) {
            this.V = r;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r, 1073741824));
        }
        if (this.v0 && this.G.M() > 1) {
            B();
            A(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z = this.G.z();
            if (z > 1) {
                this.u0 = (z - 1) * Math.round(this.G.B());
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.u0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.y;
        if (viewGroup != null) {
            View view = this.z;
            if (view != null && view != this) {
                setMinimumHeight(g(view));
            } else {
                setMinimumHeight(g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.K;
        if (drawable != null) {
            w(drawable, i, i2);
        }
    }

    public gs r(@x1 gs gsVar) {
        gs gsVar2 = sr.T(this) ? gsVar : null;
        if (!ep.a(this.U, gsVar2)) {
            this.U = gsVar2;
            requestLayout();
        }
        return gsVar.c();
    }

    public void s(int i, int i2, int i3, int i4) {
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        requestLayout();
    }

    public void setCollapsedTitleGravity(int i) {
        this.G.k0(i);
    }

    public void setCollapsedTitleTextAppearance(@m2 int i) {
        this.G.h0(i);
    }

    public void setCollapsedTitleTextColor(@w0 int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@z1 Typeface typeface) {
        this.G.m0(typeface);
    }

    public void setContentScrim(@z1 Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.K = mutate;
            if (mutate != null) {
                w(mutate, getWidth(), getHeight());
                this.K.setCallback(this);
                this.K.setAlpha(this.M);
            }
            sr.m1(this);
        }
    }

    public void setContentScrimColor(@w0 int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@f1 int i) {
        setContentScrim(gh.i(getContext(), i));
    }

    public void setExpandedTitleColor(@w0 int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.G.v0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.B = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.C = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@m2 int i) {
        this.G.s0(i);
    }

    public void setExpandedTitleTextColor(@x1 ColorStateList colorStateList) {
        this.G.u0(colorStateList);
    }

    public void setExpandedTitleTypeface(@z1 Typeface typeface) {
        this.G.x0(typeface);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.v0 = z;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.W = z;
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.G.C0(i);
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.G.E0(f);
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@g1(from = 0.0d) float f) {
        this.G.F0(f);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.G.G0(i);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.G.I0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.M) {
            if (this.K != null && (viewGroup = this.y) != null) {
                sr.m1(viewGroup);
            }
            this.M = i;
            sr.m1(this);
        }
    }

    public void setScrimAnimationDuration(@p1(from = 0) long j) {
        this.P = j;
    }

    public void setScrimVisibleHeightTrigger(@p1(from = 0) int i) {
        if (this.Q != i) {
            this.Q = i;
            z();
        }
    }

    public void setScrimsShown(boolean z) {
        t(z, sr.T0(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@z1 Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.L = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                fk.m(this.L, sr.Y(this));
                this.L.setVisible(getVisibility() == 0, false);
                this.L.setCallback(this);
                this.L.setAlpha(this.M);
            }
            sr.m1(this);
        }
    }

    public void setStatusBarScrimColor(@w0 int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@f1 int i) {
        setStatusBarScrim(gh.i(getContext(), i));
    }

    public void setTitle(@z1 CharSequence charSequence) {
        this.G.K0(charSequence);
        v();
    }

    public void setTitleCollapseMode(int i) {
        this.T = i;
        boolean n = n();
        this.G.A0(n);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (n && this.K == null) {
            setContentScrimColor(this.H.g(getResources().getDimension(ga2.f.P0)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.I) {
            this.I = z;
            v();
            y();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@z1 TimeInterpolator timeInterpolator) {
        this.G.H0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.L;
        if (drawable != null && drawable.isVisible() != z) {
            this.L.setVisible(z, false);
        }
        Drawable drawable2 = this.K;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.K.setVisible(z, false);
    }

    public void t(boolean z, boolean z2) {
        if (this.N != z) {
            if (z2) {
                a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.N = z;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@x1 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.K || drawable == this.L;
    }

    public final void z() {
        if (this.K == null && this.L == null) {
            return;
        }
        setScrimsShown(getHeight() + this.S < getScrimVisibleHeightTrigger());
    }

    public sa2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.F2);
    }

    public void setCollapsedTitleTextColor(@x1 ColorStateList colorStateList) {
        this.G.j0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        this.w = true;
        this.F = new Rect();
        this.Q = -1;
        this.V = 0;
        this.u0 = 0;
        Context context2 = getContext();
        he2 he2Var = new he2(this);
        this.G = he2Var;
        he2Var.L0(ha2.e);
        he2Var.I0(false);
        this.H = new ud2(context2);
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.G6, i, i2, new int[0]);
        he2Var.v0(j.getInt(ga2.o.L6, 8388691));
        he2Var.k0(j.getInt(ga2.o.H6, 8388627));
        int dimensionPixelSize = j.getDimensionPixelSize(ga2.o.M6, 0);
        this.E = dimensionPixelSize;
        this.D = dimensionPixelSize;
        this.C = dimensionPixelSize;
        this.B = dimensionPixelSize;
        int i3 = ga2.o.P6;
        if (j.hasValue(i3)) {
            this.B = j.getDimensionPixelSize(i3, 0);
        }
        int i4 = ga2.o.O6;
        if (j.hasValue(i4)) {
            this.D = j.getDimensionPixelSize(i4, 0);
        }
        int i5 = ga2.o.Q6;
        if (j.hasValue(i5)) {
            this.C = j.getDimensionPixelSize(i5, 0);
        }
        int i6 = ga2.o.N6;
        if (j.hasValue(i6)) {
            this.E = j.getDimensionPixelSize(i6, 0);
        }
        this.I = j.getBoolean(ga2.o.b7, true);
        setTitle(j.getText(ga2.o.Z6));
        he2Var.s0(ga2.n.v7);
        he2Var.h0(x2.l.m3);
        int i7 = ga2.o.R6;
        if (j.hasValue(i7)) {
            he2Var.s0(j.getResourceId(i7, 0));
        }
        int i8 = ga2.o.I6;
        if (j.hasValue(i8)) {
            he2Var.h0(j.getResourceId(i8, 0));
        }
        int i9 = ga2.o.S6;
        if (j.hasValue(i9)) {
            he2Var.u0(sg2.a(context2, j, i9));
        }
        int i10 = ga2.o.J6;
        if (j.hasValue(i10)) {
            he2Var.j0(sg2.a(context2, j, i10));
        }
        this.Q = j.getDimensionPixelSize(ga2.o.X6, -1);
        int i11 = ga2.o.V6;
        if (j.hasValue(i11)) {
            he2Var.G0(j.getInt(i11, 1));
        }
        int i12 = ga2.o.c7;
        if (j.hasValue(i12)) {
            he2Var.H0(AnimationUtils.loadInterpolator(context2, j.getResourceId(i12, 0)));
        }
        this.P = j.getInt(ga2.o.W6, 600);
        setContentScrim(j.getDrawable(ga2.o.K6));
        setStatusBarScrim(j.getDrawable(ga2.o.Y6));
        setTitleCollapseMode(j.getInt(ga2.o.a7, 0));
        this.x = j.getResourceId(ga2.o.d7, -1);
        this.W = j.getBoolean(ga2.o.U6, false);
        this.v0 = j.getBoolean(ga2.o.T6, false);
        j.recycle();
        setWillNotDraw(false);
        sr.Z1(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* compiled from: CollapsingToolbarLayout.java */
    /* loaded from: classes2.dex */
    public static class c extends FrameLayout.LayoutParams {
        private static final float a = 0.5f;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public int e;
        public float f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = 0;
            this.f = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.e7);
            this.e = obtainStyledAttributes.getInt(ga2.o.f7, 0);
            d(obtainStyledAttributes.getFloat(ga2.o.g7, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.e;
        }

        public float b() {
            return this.f;
        }

        public void c(int i) {
            this.e = i;
        }

        public void d(float f) {
            this.f = f;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.e = 0;
            this.f = 0.5f;
        }

        public c(int i, int i2, int i3) {
            super(i, i2, i3);
            this.e = 0;
            this.f = 0.5f;
        }

        public c(@x1 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = 0;
            this.f = 0.5f;
        }

        public c(@x1 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = 0;
            this.f = 0.5f;
        }

        @e2(19)
        public c(@x1 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = 0;
            this.f = 0.5f;
        }
    }
}