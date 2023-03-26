package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.p7700g.p99005.ga2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialCardView.java */
/* loaded from: classes2.dex */
public class lb2 extends CardView implements Checkable, uh2 {
    private static final int[] B = {16842911};
    private static final int[] C = {16842912};
    private static final int[] D = {ga2.c.Ce};
    private static final int E = ga2.n.yh;
    private static final String F = "MaterialCardView";
    private static final String G = "androidx.cardview.widget.CardView";
    public static final int H = 8388659;
    public static final int I = 8388691;
    public static final int J = 8388661;
    public static final int K = 8388693;
    @x1
    private final mb2 L;
    private boolean M;
    private boolean N;
    private boolean O;
    private b P;

    /* compiled from: MaterialCardView.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* compiled from: MaterialCardView.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(lb2 lb2Var, boolean z);
    }

    public lb2(Context context) {
        this(context, null);
    }

    @x1
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.L.j().getBounds());
        return rectF;
    }

    private void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.L.i();
        }
    }

    @Override // androidx.cardview.widget.CardView
    @x1
    public ColorStateList getCardBackgroundColor() {
        return this.L.k();
    }

    @x1
    public ColorStateList getCardForegroundColor() {
        return this.L.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @z1
    public Drawable getCheckedIcon() {
        return this.L.m();
    }

    public int getCheckedIconGravity() {
        return this.L.n();
    }

    @b1
    public int getCheckedIconMargin() {
        return this.L.o();
    }

    @b1
    public int getCheckedIconSize() {
        return this.L.p();
    }

    @z1
    public ColorStateList getCheckedIconTint() {
        return this.L.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.L.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.L.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.L.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.L.A().top;
    }

    @g1(from = zg2.s, to = 1.0d)
    public float getProgress() {
        return this.L.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.L.s();
    }

    public ColorStateList getRippleColor() {
        return this.L.v();
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return this.L.w();
    }

    @w0
    @Deprecated
    public int getStrokeColor() {
        return this.L.x();
    }

    @z1
    public ColorStateList getStrokeColorStateList() {
        return this.L.y();
    }

    @b1
    public int getStrokeWidth() {
        return this.L.z();
    }

    @Override // androidx.cardview.widget.CardView
    public void h(int i, int i2, int i3, int i4) {
        this.L.Y(i, i2, i3, i4);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.N;
    }

    public boolean k() {
        mb2 mb2Var = this.L;
        return mb2Var != null && mb2Var.D();
    }

    public boolean l() {
        return this.O;
    }

    public void m(int i, int i2, int i3, int i4) {
        super.h(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.f(this, this.L.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, B);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, C);
        }
        if (l()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@x1 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(G);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(G);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.L.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.M) {
            if (!this.L.C()) {
                this.L.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@w0 int i) {
        this.L.J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.L.d0();
    }

    public void setCardForegroundColor(@z1 ColorStateList colorStateList) {
        this.L.K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.L.L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.N != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@z1 Drawable drawable) {
        this.L.N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.L.n() != i) {
            this.L.O(i);
        }
    }

    public void setCheckedIconMargin(@b1 int i) {
        this.L.P(i);
    }

    public void setCheckedIconMarginResource(@a1 int i) {
        if (i != -1) {
            this.L.P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@f1 int i) {
        this.L.N(r3.b(getContext(), i));
    }

    public void setCheckedIconSize(@b1 int i) {
        this.L.Q(i);
    }

    public void setCheckedIconSizeResource(@a1 int i) {
        if (i != 0) {
            this.L.Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@z1 ColorStateList colorStateList) {
        this.L.R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        mb2 mb2Var = this.L;
        if (mb2Var != null) {
            mb2Var.b0();
        }
    }

    public void setDragged(boolean z) {
        if (this.O != z) {
            this.O = z;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.L.f0();
    }

    public void setOnCheckedChangeListener(@z1 b bVar) {
        this.P = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.L.f0();
        this.L.c0();
    }

    public void setProgress(@g1(from = 0.0d, to = 1.0d) float f) {
        this.L.T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.L.S(f);
    }

    public void setRippleColor(@z1 ColorStateList colorStateList) {
        this.L.U(colorStateList);
    }

    public void setRippleColorResource(@y0 int i) {
        this.L.U(r3.a(getContext(), i));
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        setClipToOutline(qh2Var.u(getBoundsAsRectF()));
        this.L.V(qh2Var);
    }

    public void setStrokeColor(@w0 int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@b1 int i) {
        this.L.X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.L.f0();
        this.L.c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (k() && isEnabled()) {
            this.N = !this.N;
            refreshDrawableState();
            j();
            this.L.M(this.N);
            b bVar = this.P;
            if (bVar != null) {
                bVar.a(this, this.N);
            }
        }
    }

    public lb2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.eb);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@z1 ColorStateList colorStateList) {
        this.L.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.L.W(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lb2(Context context, AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = E;
        this.N = false;
        this.O = false;
        this.M = true;
        TypedArray j = cf2.j(getContext(), attributeSet, ga2.o.Ul, i, i2, new int[0]);
        mb2 mb2Var = new mb2(this, attributeSet, i, i2);
        this.L = mb2Var;
        mb2Var.J(super.getCardBackgroundColor());
        mb2Var.Y(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        mb2Var.G(j);
        j.recycle();
    }
}