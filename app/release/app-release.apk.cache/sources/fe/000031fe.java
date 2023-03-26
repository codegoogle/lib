package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.bh2;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.ce2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.de2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fi2;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.je2;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.lf2;
import com.p7700g.p99005.m0;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.oa2;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.qr;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.ra2;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.tt;
import com.p7700g.p99005.uh2;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.wd2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yd2;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes3.dex */
public class FloatingActionButton extends lf2 implements qr, tt, wd2, uh2, CoordinatorLayout.b {
    private static final int A = 470;
    private static final String t = "FloatingActionButton";
    private static final String u = "expandableWidgetHelper";
    private static final int v = ga2.n.ee;
    public static final int w = 1;
    public static final int x = 0;
    public static final int y = -1;
    public static final int z = 0;
    @z1
    private ColorStateList B;
    @z1
    private PorterDuff.Mode C;
    @z1
    private ColorStateList D;
    @z1
    private PorterDuff.Mode E;
    @z1
    private ColorStateList F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    public boolean L;
    public final Rect M;
    private final Rect N;
    @x1
    private final AppCompatImageHelper O;
    @x1
    private final yd2 P;
    private ce2 Q;

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean G(@x1 CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, @x1 Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H() {
            return super.H();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean K(CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, View view) {
            return super.i(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean L(@x1 CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, int i) {
            return super.m(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void M(boolean z) {
            super.M(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @r2
        public /* bridge */ /* synthetic */ void N(b bVar) {
            super.N(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void h(@x1 CoordinatorLayout.g gVar) {
            super.h(gVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements ce2.k {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.p7700g.p99005.ce2.k
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.p7700g.p99005.ce2.k
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes3.dex */
    public class c implements bh2 {
        public c() {
        }

        @Override // com.p7700g.p99005.bh2
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.M.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(floatingActionButton.J + i, FloatingActionButton.this.J + i2, FloatingActionButton.this.J + i3, FloatingActionButton.this.J + i4);
        }

        @Override // com.p7700g.p99005.bh2
        public boolean b() {
            return FloatingActionButton.this.L;
        }

        @Override // com.p7700g.p99005.bh2
        public float c() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.p7700g.p99005.bh2
        public void setBackgroundDrawable(@z1 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* loaded from: classes3.dex */
    public class e<T extends FloatingActionButton> implements ce2.j {
        @x1
        private final ra2<T> a;

        public e(@x1 ra2<T> ra2Var) {
            this.a = ra2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.ce2.j
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.ce2.j
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(@z1 Object obj) {
            return (obj instanceof e) && ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(@x1 Context context) {
        this(context, null);
    }

    @z1
    private ce2.k C(@z1 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private ce2 getImpl() {
        if (this.Q == null) {
            this.Q = j();
        }
        return this.Q;
    }

    @x1
    private ce2 j() {
        return new de2(this, new c());
    }

    private int m(int i) {
        int i2 = this.I;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(ga2.f.j1);
            }
            return resources.getDimensionPixelSize(ga2.f.i1);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < A) {
            return m(1);
        } else {
            return m(0);
        }
    }

    private void s(@x1 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.M;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void t() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList == null) {
            fk.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.E;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    private static int x(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    public void A(@z1 b bVar) {
        B(bVar, true);
    }

    public void B(@z1 b bVar, boolean z2) {
        getImpl().f0(C(bVar), z2);
    }

    @Override // com.p7700g.p99005.xd2
    public boolean a(boolean z2) {
        return this.P.f(z2);
    }

    @Override // com.p7700g.p99005.xd2
    public boolean b() {
        return this.P.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void f(@x1 Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(@x1 Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    @Override // android.view.View
    @z1
    public ColorStateList getBackgroundTintList() {
        return this.B;
    }

    @Override // android.view.View
    @z1
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.C;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @x1
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @z1
    public Drawable getContentBackground() {
        return getImpl().m();
    }

    @c2
    public int getCustomSize() {
        return this.I;
    }

    @Override // com.p7700g.p99005.wd2
    public int getExpandedComponentIdHint() {
        return this.P.b();
    }

    @z1
    public oa2 getHideMotionSpec() {
        return getImpl().p();
    }

    @w0
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.F;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @z1
    public ColorStateList getRippleColorStateList() {
        return this.F;
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return (qh2) jp.l(getImpl().u());
    }

    @z1
    public oa2 getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.H;
    }

    public int getSizeDimension() {
        return m(this.H);
    }

    @Override // com.p7700g.p99005.qr
    @z1
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // com.p7700g.p99005.qr
    @z1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // com.p7700g.p99005.tt
    @z1
    public ColorStateList getSupportImageTintList() {
        return this.D;
    }

    @Override // com.p7700g.p99005.tt
    @z1
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.E;
    }

    public boolean getUseCompatPadding() {
        return this.L;
    }

    public void h(@x1 ra2<? extends FloatingActionButton> ra2Var) {
        getImpl().g(new e(ra2Var));
    }

    public void i() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    @Deprecated
    public boolean k(@x1 Rect rect) {
        if (sr.T0(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            s(rect);
            return true;
        }
        return false;
    }

    public void l(@x1 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public void n() {
        o(null);
    }

    public void o(@z1 b bVar) {
        p(bVar, true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.J = (sizeDimension - this.K) / 2;
        getImpl().i0();
        int min = Math.min(x(sizeDimension, i), x(sizeDimension, i2));
        Rect rect = this.M;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fi2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fi2 fi2Var = (fi2) parcelable;
        super.onRestoreInstanceState(fi2Var.getSuperState());
        this.P.d((Bundle) jp.l(fi2Var.s.get(u)));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        fi2 fi2Var = new fi2(onSaveInstanceState);
        fi2Var.s.put(u, this.P.e());
        return fi2Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@x1 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && k(this.N) && !this.N.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(@z1 b bVar, boolean z2) {
        getImpl().w(C(bVar), z2);
    }

    public boolean q() {
        return getImpl().y();
    }

    public boolean r() {
        return getImpl().z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@z1 ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@z1 PorterDuff.Mode mode) {
        if (this.C != mode) {
            this.C = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().Q(f);
    }

    public void setCompatElevationResource(@a1 int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().T(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@a1 int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().X(f);
    }

    public void setCompatPressedTranslationZResource(@a1 int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@c2 int i) {
        if (i >= 0) {
            if (i != this.I) {
                this.I = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().j0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().o()) {
            getImpl().R(z2);
            requestLayout();
        }
    }

    @Override // com.p7700g.p99005.wd2
    public void setExpandedComponentIdHint(@m1 int i) {
        this.P.g(i);
    }

    public void setHideMotionSpec(@z1 oa2 oa2Var) {
        getImpl().S(oa2Var);
    }

    public void setHideMotionSpecResource(@m0 int i) {
        setHideMotionSpec(oa2.d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@z1 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().h0();
            if (this.D != null) {
                t();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@f1 int i) {
        this.O.setImageResource(i);
        t();
    }

    public void setMaxImageSize(int i) {
        this.K = i;
        getImpl().V(i);
    }

    public void setRippleColor(@w0 int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().I();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @r2
    public void setShadowPaddingEnabled(boolean z2) {
        getImpl().Z(z2);
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        getImpl().a0(qh2Var);
    }

    public void setShowMotionSpec(@z1 oa2 oa2Var) {
        getImpl().b0(oa2Var);
    }

    public void setShowMotionSpecResource(@m0 int i) {
        setShowMotionSpec(oa2.d(getContext(), i));
    }

    public void setSize(int i) {
        this.I = 0;
        if (i != this.H) {
            this.H = i;
            requestLayout();
        }
    }

    @Override // com.p7700g.p99005.qr
    public void setSupportBackgroundTintList(@z1 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.qr
    public void setSupportBackgroundTintMode(@z1 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // com.p7700g.p99005.tt
    public void setSupportImageTintList(@z1 ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            t();
        }
    }

    @Override // com.p7700g.p99005.tt
    public void setSupportImageTintMode(@z1 PorterDuff.Mode mode) {
        if (this.E != mode) {
            this.E = mode;
            t();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.L != z2) {
            this.L = z2;
            getImpl().C();
        }
    }

    @Override // com.p7700g.p99005.lf2, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void u(@x1 Animator.AnimatorListener animatorListener) {
        getImpl().K(animatorListener);
    }

    public void v(@x1 Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@x1 ra2<? extends FloatingActionButton> ra2Var) {
        getImpl().M(new e(ra2Var));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A(null);
    }

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private static final boolean a = true;
        private Rect b;
        private b c;
        private boolean d;

        public BaseBehavior() {
            this.d = true;
        }

        private static boolean I(@x1 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void J(@x1 CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.M;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                sr.e1(floatingActionButton, i2);
            }
            if (i != 0) {
                sr.d1(floatingActionButton, i);
            }
        }

        private boolean O(@x1 View view, @x1 FloatingActionButton floatingActionButton) {
            return this.d && ((CoordinatorLayout.g) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @x1 AppBarLayout appBarLayout, @x1 FloatingActionButton floatingActionButton) {
            if (O(appBarLayout, floatingActionButton)) {
                if (this.b == null) {
                    this.b = new Rect();
                }
                Rect rect = this.b;
                je2.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.p(this.c, false);
                    return true;
                }
                floatingActionButton.B(this.c, false);
                return true;
            }
            return false;
        }

        private boolean Q(@x1 View view, @x1 FloatingActionButton floatingActionButton) {
            if (O(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.p(this.c, false);
                    return true;
                }
                floatingActionButton.B(this.c, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: G */
        public boolean b(@x1 CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, @x1 Rect rect) {
            Rect rect2 = floatingActionButton.M;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean H() {
            return this.d;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: K */
        public boolean i(CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (I(view)) {
                Q(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L */
        public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 FloatingActionButton floatingActionButton, int i) {
            List<View> q = coordinatorLayout.q(floatingActionButton);
            int size = q.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = q.get(i2);
                if (view instanceof AppBarLayout) {
                    if (P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (I(view) && Q(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.H(floatingActionButton, i);
            J(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void M(boolean z) {
            this.d = z;
        }

        @r2
        public void N(b bVar) {
            this.c = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@x1 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.Ff);
            this.d = obtainStyledAttributes.getBoolean(ga2.o.Gf, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.w6);
    }

    public void setRippleColor(@z1 ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            getImpl().Y(this.F);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = v;
        this.M = new Rect();
        this.N = new Rect();
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.nf, i, i2, new int[0]);
        this.B = sg2.a(context2, j, ga2.o.pf);
        this.C = kf2.l(j.getInt(ga2.o.qf, -1), null);
        this.F = sg2.a(context2, j, ga2.o.Af);
        this.H = j.getInt(ga2.o.vf, -1);
        this.I = j.getDimensionPixelSize(ga2.o.uf, 0);
        this.G = j.getDimensionPixelSize(ga2.o.rf, 0);
        float dimension = j.getDimension(ga2.o.sf, 0.0f);
        float dimension2 = j.getDimension(ga2.o.xf, 0.0f);
        float dimension3 = j.getDimension(ga2.o.zf, 0.0f);
        this.L = j.getBoolean(ga2.o.Ef, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(ga2.f.b8);
        setMaxImageSize(j.getDimensionPixelSize(ga2.o.yf, 0));
        oa2 c2 = oa2.c(context2, j, ga2.o.Df);
        oa2 c3 = oa2.c(context2, j, ga2.o.wf);
        qh2 m = qh2.g(context2, attributeSet, i, i2, qh2.a).m();
        boolean z2 = j.getBoolean(ga2.o.tf, false);
        setEnabled(j.getBoolean(ga2.o.of, true));
        j.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.O = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
        this.P = new yd2(this);
        getImpl().a0(m);
        getImpl().x(this.B, this.C, this.F, this.G);
        getImpl().W(dimensionPixelSize);
        getImpl().Q(dimension);
        getImpl().T(dimension2);
        getImpl().X(dimension3);
        getImpl().b0(c2);
        getImpl().S(c3);
        getImpl().R(z2);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}