package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.p7700g.p99005.ae2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.ee2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.je2;
import com.p7700g.p99005.m0;
import com.p7700g.p99005.oa2;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zd2;
import java.util.List;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int Q = 0;
    private static final int R = 1;
    private static final int S = 2;
    private final int A0;
    private int B0;
    private int C0;
    @x1
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    @x1
    public ColorStateList H0;
    private int u0;
    private final zd2 v0;
    @x1
    private final ee2 w0;
    @x1
    private final ee2 x0;
    private final ee2 y0;
    private final ee2 z0;
    private static final int P = ga2.n.Oh;
    public static final Property<View, Float> T = new d(Float.class, "width");
    public static final Property<View, Float> U = new e(Float.class, "height");
    public static final Property<View, Float> V = new f(Float.class, "paddingStart");
    public static final Property<View, Float> W = new g(Float.class, "paddingEnd");

    /* loaded from: classes3.dex */
    public class a implements l {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return ExtendedFloatingActionButton.this.C0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return ExtendedFloatingActionButton.this.B0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.C0 + ExtendedFloatingActionButton.this.B0 + (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements l {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        private boolean s;
        public final /* synthetic */ ee2 t;
        public final /* synthetic */ j u;

        public c(ee2 ee2Var, j jVar) {
            this.t = ee2Var;
            this.u = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
            this.t.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.t.i();
            if (this.s) {
                return;
            }
            this.t.m(this.u);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.t.onAnimationStart(animator);
            this.s = false;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @x1
        /* renamed from: a */
        public Float get(@x1 View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 View view, @x1 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @x1
        /* renamed from: a */
        public Float get(@x1 View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 View view, @x1 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @x1
        /* renamed from: a */
        public Float get(@x1 View view) {
            return Float.valueOf(sr.j0(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 View view, @x1 Float f) {
            sr.c2(view, f.intValue(), view.getPaddingTop(), sr.i0(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public class g extends Property<View, Float> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @x1
        /* renamed from: a */
        public Float get(@x1 View view) {
            return Float.valueOf(sr.i0(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 View view, @x1 Float f) {
            sr.c2(view, sr.j0(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public class h extends ae2 {
        private final l g;
        private final boolean h;

        public h(zd2 zd2Var, l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, zd2Var);
            this.g = lVar;
            this.h = z;
        }

        @Override // com.p7700g.p99005.ee2
        public int c() {
            if (this.h) {
                return ga2.b.s;
            }
            return ga2.b.r;
        }

        @Override // com.p7700g.p99005.ee2
        public void d() {
            ExtendedFloatingActionButton.this.E0 = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
            sr.c2(ExtendedFloatingActionButton.this, this.g.b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.g.a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.p7700g.p99005.ee2
        public boolean f() {
            return this.h == ExtendedFloatingActionButton.this.E0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.F0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        @x1
        public AnimatorSet k() {
            oa2 b = b();
            if (b.j("width")) {
                PropertyValuesHolder[] g = b.g("width");
                g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.g.getWidth());
                b.l("width", g);
            }
            if (b.j("height")) {
                PropertyValuesHolder[] g2 = b.g("height");
                g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.g.getHeight());
                b.l("height", g2);
            }
            if (b.j("paddingStart")) {
                PropertyValuesHolder[] g3 = b.g("paddingStart");
                g3[0].setFloatValues(sr.j0(ExtendedFloatingActionButton.this), this.g.b());
                b.l("paddingStart", g3);
            }
            if (b.j("paddingEnd")) {
                PropertyValuesHolder[] g4 = b.g("paddingEnd");
                g4[0].setFloatValues(sr.i0(ExtendedFloatingActionButton.this), this.g.a());
                b.l("paddingEnd", g4);
            }
            if (b.j("labelOpacity")) {
                PropertyValuesHolder[] g5 = b.g("labelOpacity");
                boolean z = this.h;
                g5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                b.l("labelOpacity", g5);
            }
            return super.o(b);
        }

        @Override // com.p7700g.p99005.ee2
        public void m(@z1 j jVar) {
            if (jVar == null) {
                return;
            }
            if (this.h) {
                jVar.a(ExtendedFloatingActionButton.this);
            } else {
                jVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.E0 = this.h;
            ExtendedFloatingActionButton.this.F0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* loaded from: classes3.dex */
    public class i extends ae2 {
        private boolean g;

        public i(zd2 zd2Var) {
            super(ExtendedFloatingActionButton.this, zd2Var);
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void a() {
            super.a();
            this.g = true;
        }

        @Override // com.p7700g.p99005.ee2
        public int c() {
            return ga2.b.t;
        }

        @Override // com.p7700g.p99005.ee2
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.p7700g.p99005.ee2
        public boolean f() {
            return ExtendedFloatingActionButton.this.I();
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.u0 = 0;
            if (this.g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.p7700g.p99005.ee2
        public void m(@z1 j jVar) {
            if (jVar != null) {
                jVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.u0 = 1;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class j {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* loaded from: classes3.dex */
    public class k extends ae2 {
        public k(zd2 zd2Var) {
            super(ExtendedFloatingActionButton.this, zd2Var);
        }

        @Override // com.p7700g.p99005.ee2
        public int c() {
            return ga2.b.u;
        }

        @Override // com.p7700g.p99005.ee2
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.p7700g.p99005.ee2
        public boolean f() {
            return ExtendedFloatingActionButton.this.J();
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.u0 = 0;
        }

        @Override // com.p7700g.p99005.ee2
        public void m(@z1 j jVar) {
            if (jVar != null) {
                jVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.p7700g.p99005.ae2, com.p7700g.p99005.ee2
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.u0 = 2;
        }
    }

    /* loaded from: classes3.dex */
    public interface l {
        int a();

        int b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@x1 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        return getVisibility() == 0 ? this.u0 == 1 : this.u0 != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        return getVisibility() != 0 ? this.u0 == 2 : this.u0 != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(@x1 ee2 ee2Var, @z1 j jVar) {
        if (ee2Var.f()) {
            return;
        }
        if (!Q()) {
            ee2Var.d();
            ee2Var.m(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet k2 = ee2Var.k();
        k2.addListener(new c(ee2Var, jVar));
        for (Animator.AnimatorListener animatorListener : ee2Var.l()) {
            k2.addListener(animatorListener);
        }
        k2.start();
    }

    private void P() {
        this.H0 = getTextColors();
    }

    private boolean Q() {
        return (sr.T0(this) || (!J() && this.G0)) && !isInEditMode();
    }

    public void A(@x1 Animator.AnimatorListener animatorListener) {
        this.z0.h(animatorListener);
    }

    public void B(@x1 Animator.AnimatorListener animatorListener) {
        this.y0.h(animatorListener);
    }

    public void C(@x1 Animator.AnimatorListener animatorListener) {
        this.w0.h(animatorListener);
    }

    public void D() {
        K(this.x0, null);
    }

    public void E(@x1 j jVar) {
        K(this.x0, jVar);
    }

    public void F() {
        K(this.z0, null);
    }

    public void G(@x1 j jVar) {
        K(this.z0, jVar);
    }

    public final boolean H() {
        return this.E0;
    }

    public void L(@x1 Animator.AnimatorListener animatorListener) {
        this.x0.g(animatorListener);
    }

    public void M(@x1 Animator.AnimatorListener animatorListener) {
        this.z0.g(animatorListener);
    }

    public void N(@x1 Animator.AnimatorListener animatorListener) {
        this.y0.g(animatorListener);
    }

    public void O(@x1 Animator.AnimatorListener animatorListener) {
        this.w0.g(animatorListener);
    }

    public void R() {
        K(this.y0, null);
    }

    public void S(@x1 j jVar) {
        K(this.y0, jVar);
    }

    public void T() {
        K(this.w0, null);
    }

    public void U(@x1 j jVar) {
        K(this.w0, jVar);
    }

    public void V(@x1 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @x1
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.D0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @r2
    public int getCollapsedSize() {
        int i2 = this.A0;
        return i2 < 0 ? (Math.min(sr.j0(this), sr.i0(this)) * 2) + getIconSize() : i2;
    }

    @z1
    public oa2 getExtendMotionSpec() {
        return this.x0.e();
    }

    @z1
    public oa2 getHideMotionSpec() {
        return this.z0.e();
    }

    @z1
    public oa2 getShowMotionSpec() {
        return this.y0.e();
    }

    @z1
    public oa2 getShrinkMotionSpec() {
        return this.w0.e();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.E0 = false;
            this.w0.d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.G0 = z;
    }

    public void setExtendMotionSpec(@z1 oa2 oa2Var) {
        this.x0.j(oa2Var);
    }

    public void setExtendMotionSpecResource(@m0 int i2) {
        setExtendMotionSpec(oa2.d(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.E0 == z) {
            return;
        }
        ee2 ee2Var = z ? this.x0 : this.w0;
        if (ee2Var.f()) {
            return;
        }
        ee2Var.d();
    }

    public void setHideMotionSpec(@z1 oa2 oa2Var) {
        this.z0.j(oa2Var);
    }

    public void setHideMotionSpecResource(@m0 int i2) {
        setHideMotionSpec(oa2.d(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.E0 || this.F0) {
            return;
        }
        this.B0 = sr.j0(this);
        this.C0 = sr.i0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.E0 || this.F0) {
            return;
        }
        this.B0 = i2;
        this.C0 = i4;
    }

    public void setShowMotionSpec(@z1 oa2 oa2Var) {
        this.y0.j(oa2Var);
    }

    public void setShowMotionSpecResource(@m0 int i2) {
        setShowMotionSpec(oa2.d(getContext(), i2));
    }

    public void setShrinkMotionSpec(@z1 oa2 oa2Var) {
        this.w0.j(oa2Var);
    }

    public void setShrinkMotionSpecResource(@m0 int i2) {
        setShrinkMotionSpec(oa2.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        P();
    }

    public void z(@x1 Animator.AnimatorListener animatorListener) {
        this.x0.h(animatorListener);
    }

    public ExtendedFloatingActionButton(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.Y5);
    }

    /* loaded from: classes3.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private static final boolean a = false;
        private static final boolean b = true;
        private Rect c;
        @z1
        private j d;
        @z1
        private j e;
        private boolean f;
        private boolean g;

        public ExtendedFloatingActionButtonBehavior() {
            this.f = false;
            this.g = true;
        }

        private static boolean K(@x1 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean R(@x1 View view, @x1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f || this.g) && ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean T(CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, @x1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (R(appBarLayout, extendedFloatingActionButton)) {
                if (this.c == null) {
                    this.c = new Rect();
                }
                Rect rect = this.c;
                je2.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    S(extendedFloatingActionButton);
                    return true;
                }
                G(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private boolean U(@x1 View view, @x1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (R(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    S(extendedFloatingActionButton);
                    return true;
                }
                G(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        public void G(@x1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            boolean z = this.g;
            if (z) {
                jVar = this.e;
            } else {
                jVar = this.d;
            }
            extendedFloatingActionButton.K(z ? extendedFloatingActionButton.x0 : extendedFloatingActionButton.y0, jVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean b(@x1 CoordinatorLayout coordinatorLayout, @x1 ExtendedFloatingActionButton extendedFloatingActionButton, @x1 Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean I() {
            return this.f;
        }

        public boolean J() {
            return this.g;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L */
        public boolean i(CoordinatorLayout coordinatorLayout, @x1 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (K(view)) {
                U(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M */
        public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> q = coordinatorLayout.q(extendedFloatingActionButton);
            int size = q.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = q.get(i2);
                if (view instanceof AppBarLayout) {
                    if (T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(view) && U(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.H(extendedFloatingActionButton, i);
            return true;
        }

        public void N(boolean z) {
            this.f = z;
        }

        public void O(boolean z) {
            this.g = z;
        }

        @r2
        public void P(@z1 j jVar) {
            this.d = jVar;
        }

        @r2
        public void Q(@z1 j jVar) {
            this.e = jVar;
        }

        public void S(@x1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            boolean z = this.g;
            if (z) {
                jVar = this.e;
            } else {
                jVar = this.d;
            }
            extendedFloatingActionButton.K(z ? extendedFloatingActionButton.w0 : extendedFloatingActionButton.z0, jVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@x1 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@x1 Context context, @z1 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.kf);
            this.f = obtainStyledAttributes.getBoolean(ga2.o.lf, false);
            this.g = obtainStyledAttributes.getBoolean(ga2.o.mf, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(yi2.c(context, attributeSet, i2, r9), attributeSet, i2);
        int i3 = P;
        this.u0 = 0;
        zd2 zd2Var = new zd2();
        this.v0 = zd2Var;
        k kVar = new k(zd2Var);
        this.y0 = kVar;
        i iVar = new i(zd2Var);
        this.z0 = iVar;
        this.E0 = true;
        this.F0 = false;
        this.G0 = false;
        Context context2 = getContext();
        this.D0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray j2 = cf2.j(context2, attributeSet, ga2.o.df, i2, i3, new int[0]);
        oa2 c2 = oa2.c(context2, j2, ga2.o.f8if);
        oa2 c3 = oa2.c(context2, j2, ga2.o.hf);
        oa2 c4 = oa2.c(context2, j2, ga2.o.gf);
        oa2 c5 = oa2.c(context2, j2, ga2.o.jf);
        this.A0 = j2.getDimensionPixelSize(ga2.o.ef, -1);
        this.B0 = sr.j0(this);
        this.C0 = sr.i0(this);
        zd2 zd2Var2 = new zd2();
        h hVar = new h(zd2Var2, new a(), true);
        this.x0 = hVar;
        h hVar2 = new h(zd2Var2, new b(), false);
        this.w0 = hVar2;
        kVar.j(c2);
        iVar.j(c3);
        hVar.j(c4);
        hVar2.j(c5);
        j2.recycle();
        setShapeAppearanceModel(qh2.g(context2, attributeSet, i2, i3, qh2.a).m());
        P();
    }

    @Override // android.widget.TextView
    public void setTextColor(@x1 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        P();
    }
}