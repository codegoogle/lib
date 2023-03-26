package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p7700g.p99005.au;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.cb2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.lh2;
import com.p7700g.p99005.mh2;
import com.p7700g.p99005.nq;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.ra2;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.v1;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int s = ga2.n.eh;
    private static final long t = 300;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 0;
    public static final int x = 1;
    private static final int y = 0;
    private final int A;
    private final lh2 B;
    @z1
    private Animator C;
    @z1
    private Animator D;
    private int E;
    private int F;
    private boolean G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private int K;
    private ArrayList<j> L;
    @v1
    private int M;
    private boolean N;
    private boolean O;
    private Behavior P;
    private int Q;
    private int R;
    private int S;
    @x1
    public AnimatorListenerAdapter T;
    @x1
    public ra2<FloatingActionButton> U;
    @z1
    private Integer z;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.N) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.W(bottomAppBar.E, BottomAppBar.this.O);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ra2<FloatingActionButton> {
        public b() {
        }

        @Override // com.p7700g.p99005.ra2
        /* renamed from: c */
        public void a(@x1 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.B.p0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.p7700g.p99005.ra2
        /* renamed from: d */
        public void b(@x1 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().x(translationX);
                BottomAppBar.this.B.invalidateSelf();
            }
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != max) {
                BottomAppBar.this.getTopEdgeTreatment().n(max);
                BottomAppBar.this.B.invalidateSelf();
            }
            BottomAppBar.this.B.p0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements kf2.e {
        public c() {
        }

        @Override // com.p7700g.p99005.kf2.e
        @x1
        public gs a(View view, @x1 gs gsVar, @x1 kf2.f fVar) {
            boolean z;
            if (BottomAppBar.this.H) {
                BottomAppBar.this.Q = gsVar.o();
            }
            boolean z2 = false;
            if (BottomAppBar.this.I) {
                z = BottomAppBar.this.S != gsVar.p();
                BottomAppBar.this.S = gsVar.p();
            } else {
                z = false;
            }
            if (BottomAppBar.this.J) {
                boolean z3 = BottomAppBar.this.R != gsVar.q();
                BottomAppBar.this.R = gsVar.q();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar.this.J();
                BottomAppBar.this.g0();
                BottomAppBar.this.f0();
            }
            return gsVar;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.N();
            BottomAppBar.this.C = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.O();
        }
    }

    /* loaded from: classes2.dex */
    public class e extends FloatingActionButton.b {
        public final /* synthetic */ int a;

        /* loaded from: classes2.dex */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.N();
            }
        }

        public e(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@x1 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.S(this.a));
            floatingActionButton.A(new a());
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.N();
            BottomAppBar.this.N = false;
            BottomAppBar.this.D = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.O();
        }
    }

    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {
        public boolean s;
        public final /* synthetic */ ActionMenuView t;
        public final /* synthetic */ int u;
        public final /* synthetic */ boolean v;

        public g(ActionMenuView actionMenuView, int i, boolean z) {
            this.t = actionMenuView;
            this.u = i;
            this.v = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                return;
            }
            boolean z = BottomAppBar.this.M != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.e0(bottomAppBar.M);
            BottomAppBar.this.k0(this.t, this.u, this.v, z);
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public final /* synthetic */ ActionMenuView s;
        public final /* synthetic */ int t;
        public final /* synthetic */ boolean u;

        public h(ActionMenuView actionMenuView, int i, boolean z) {
            this.s = actionMenuView;
            this.t = i;
            this.u = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.s;
            actionMenuView.setTranslationX(BottomAppBar.this.R(actionMenuView, this.t, this.u));
        }
    }

    /* loaded from: classes2.dex */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.T.onAnimationStart(animator);
            FloatingActionButton P = BottomAppBar.this.P();
            if (P != null) {
                P.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface l {
    }

    /* loaded from: classes2.dex */
    public static class m extends au {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public int s;
        public boolean t;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            @z1
            /* renamed from: a */
            public m createFromParcel(@x1 Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public m createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t ? 1 : 0);
        }

        public m(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = parcel.readInt();
            this.t = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@x1 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(@x1 FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.T);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Animator animator = this.D;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.C;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void L(int i2, @x1 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(P(), "translationX", S(i2));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void M(int i2, boolean z, @x1 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - R(actionMenuView, i2, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new g(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        ArrayList<j> arrayList;
        int i2 = this.K - 1;
        this.K = i2;
        if (i2 != 0 || (arrayList = this.L) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        ArrayList<j> arrayList;
        int i2 = this.K;
        this.K = i2 + 1;
        if (i2 != 0 || (arrayList = this.L) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z1
    public FloatingActionButton P() {
        View Q = Q();
        if (Q instanceof FloatingActionButton) {
            return (FloatingActionButton) Q;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View Q() {
        if (getParent() instanceof CoordinatorLayout) {
            for (View view : ((CoordinatorLayout) getParent()).r(this)) {
                if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                    return view;
                }
                while (r0.hasNext()) {
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float S(int i2) {
        boolean k2 = kf2.k(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.A + (k2 ? this.S : this.R))) * (k2 ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean T() {
        FloatingActionButton P = P();
        return P != null && P.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i2, boolean z) {
        if (!sr.T0(this)) {
            this.N = false;
            e0(this.M);
            return;
        }
        Animator animator = this.D;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!T()) {
            i2 = 0;
            z = false;
        }
        M(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.D = animatorSet;
        animatorSet.addListener(new f());
        this.D.start();
    }

    private void X(int i2) {
        if (this.E == i2 || !sr.T0(this)) {
            return;
        }
        Animator animator = this.C;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.F == 1) {
            L(i2, arrayList);
        } else {
            K(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.C = animatorSet;
        animatorSet.addListener(new d());
        this.C.start();
    }

    @z1
    private Drawable Y(@z1 Drawable drawable) {
        if (drawable == null || this.z == null) {
            return drawable;
        }
        Drawable r = fk.r(drawable.mutate());
        fk.n(r, this.z.intValue());
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.D != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!T()) {
            j0(actionMenuView, 0, false);
        } else {
            j0(actionMenuView, this.E, this.O);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        getTopEdgeTreatment().x(getFabTranslationX());
        View Q = Q();
        this.B.p0((this.O && T()) ? 1.0f : 0.0f);
        if (Q != null) {
            Q.setTranslationY(getFabTranslationY());
            Q.setTranslationX(getFabTranslationX());
        }
    }

    @z1
    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return S(this.E);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public cb2 getTopEdgeTreatment() {
        return (cb2) this.B.getShapeAppearanceModel().p();
    }

    private void j0(@x1 ActionMenuView actionMenuView, int i2, boolean z) {
        k0(actionMenuView, i2, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(@x1 ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
        h hVar = new h(actionMenuView, i2, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public void H(@x1 j jVar) {
        if (this.L == null) {
            this.L = new ArrayList<>();
        }
        this.L.add(jVar);
    }

    public void K(int i2, List<Animator> list) {
        FloatingActionButton P = P();
        if (P == null || P.q()) {
            return;
        }
        O();
        P.o(new e(i2));
    }

    public int R(@x1 ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 == 1 && z) {
            boolean k2 = kf2.k(this);
            int measuredWidth = k2 ? getMeasuredWidth() : 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & nq.d) == 8388611) {
                    if (k2) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((k2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (k2 ? this.R : -this.S));
        }
        return 0;
    }

    public boolean U() {
        return getBehavior().I();
    }

    public boolean V() {
        return getBehavior().J();
    }

    public void Z() {
        a0(true);
    }

    public void a0(boolean z) {
        getBehavior().M(this, z);
    }

    public void b0() {
        c0(true);
    }

    public void c0(boolean z) {
        getBehavior().O(this, z);
    }

    public void d0(@x1 j jVar) {
        ArrayList<j> arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void e0(@v1 int i2) {
        if (i2 != 0) {
            this.M = 0;
            getMenu().clear();
            inflateMenu(i2);
        }
    }

    @z1
    public ColorStateList getBackgroundTint() {
        return this.B.R();
    }

    @b1
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.E;
    }

    public int getFabAnimationMode() {
        return this.F;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @b1
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.G;
    }

    public void h0(int i2, @v1 int i3) {
        this.M = i3;
        this.N = true;
        W(i2, this.O);
        X(i2);
        this.E = i2;
    }

    public boolean i0(@c2 int i2) {
        float f2 = i2;
        if (f2 != getTopEdgeTreatment().h()) {
            getTopEdgeTreatment().u(f2);
            this.B.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.f(this, this.B);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            J();
            g0();
        }
        f0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.E = mVar.s;
        this.O = mVar.t;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.s = this.E;
        mVar.t = this.O;
        return mVar;
    }

    public void setBackgroundTint(@z1 ColorStateList colorStateList) {
        fk.o(this.B, colorStateList);
    }

    public void setCradleVerticalOffset(@b1 float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().n(f2);
            this.B.invalidateSelf();
            g0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.B.n0(f2);
        getBehavior().K(this, this.B.K() - this.B.J());
    }

    public void setFabAlignmentMode(int i2) {
        h0(i2, 0);
    }

    public void setFabAnimationMode(int i2) {
        this.F = i2;
    }

    public void setFabCornerSize(@b1 float f2) {
        if (f2 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().o(f2);
            this.B.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@b1 float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().p(f2);
            this.B.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@b1 float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().t(f2);
            this.B.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.G = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@z1 Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(@w0 int i2) {
        this.z = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.N0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @x1
    public Behavior getBehavior() {
        if (this.P == null) {
            this.P = new Behavior();
        }
        return this.P;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @x1
        private final Rect i;
        private WeakReference<BottomAppBar> j;
        private int k;
        private final View.OnLayoutChangeListener l;

        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.j.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.l(Behavior.this.i);
                    int height = Behavior.this.i.height();
                    bottomAppBar.i0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.i)));
                    CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                    if (Behavior.this.k == 0) {
                        ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ga2.f.f6) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                        if (kf2.k(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.A + ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
                            return;
                        }
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.A + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
                        return;
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.l = new a();
            this.i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S */
        public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 BottomAppBar bottomAppBar, int i) {
            this.j = new WeakReference<>(bottomAppBar);
            View Q = bottomAppBar.Q();
            if (Q != null && !sr.T0(Q)) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) Q.getLayoutParams();
                gVar.d = 49;
                this.k = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                if (Q instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) Q;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(ga2.b.x);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(ga2.b.w);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.l);
                    bottomAppBar.I(floatingActionButton);
                }
                bottomAppBar.g0();
            }
            coordinatorLayout.H(bottomAppBar, i);
            return super.m(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: T */
        public boolean B(@x1 CoordinatorLayout coordinatorLayout, @x1 BottomAppBar bottomAppBar, @x1 View view, @x1 View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.B(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.l = new a();
            this.i = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(yi2.c(context, attributeSet, i2, r6), attributeSet, i2);
        int i3 = s;
        lh2 lh2Var = new lh2();
        this.B = lh2Var;
        this.K = 0;
        this.M = 0;
        this.N = false;
        this.O = true;
        this.T = new a();
        this.U = new b();
        Context context2 = getContext();
        TypedArray j2 = cf2.j(context2, attributeSet, ga2.o.t4, i2, i3, new int[0]);
        ColorStateList a2 = sg2.a(context2, j2, ga2.o.u4);
        int i4 = ga2.o.C4;
        if (j2.hasValue(i4)) {
            setNavigationIconTint(j2.getColor(i4, -1));
        }
        int dimensionPixelSize = j2.getDimensionPixelSize(ga2.o.v4, 0);
        this.E = j2.getInt(ga2.o.w4, 0);
        this.F = j2.getInt(ga2.o.x4, 0);
        this.G = j2.getBoolean(ga2.o.B4, false);
        this.H = j2.getBoolean(ga2.o.D4, false);
        this.I = j2.getBoolean(ga2.o.E4, false);
        this.J = j2.getBoolean(ga2.o.F4, false);
        j2.recycle();
        this.A = getResources().getDimensionPixelOffset(ga2.f.e6);
        lh2Var.setShapeAppearanceModel(qh2.a().G(new cb2(j2.getDimensionPixelOffset(ga2.o.y4, 0), j2.getDimensionPixelOffset(ga2.o.z4, 0), j2.getDimensionPixelOffset(ga2.o.A4, 0))).m());
        lh2Var.x0(2);
        lh2Var.r0(Paint.Style.FILL);
        lh2Var.Z(context2);
        setElevation(dimensionPixelSize);
        fk.o(lh2Var, a2);
        sr.H1(this, lh2Var);
        kf2.c(this, attributeSet, i2, i3, new c());
    }
}