package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.bu;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m0;
import com.p7700g.p99005.m2;
import com.p7700g.p99005.mh2;
import com.p7700g.p99005.oa2;
import com.p7700g.p99005.ob2;
import com.p7700g.p99005.pe2;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.s0;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.tg2;
import com.p7700g.p99005.uh2;
import com.p7700g.p99005.vg2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.y0;
import com.p7700g.p99005.yg2;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.util.List;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements ob2.a, uh2, pe2<Chip> {
    private static final int A = 48;
    private static final String B = "android.widget.Button";
    private static final String C = "android.widget.CompoundButton";
    private static final String D = "android.widget.RadioButton";
    private static final String E = "android.view.View";
    private static final String s = "Chip";
    private static final int u = 0;
    private static final int v = 1;
    private static final String z = "http://schemas.android.com/apk/res/android";
    @z1
    private ob2 F;
    @z1
    private InsetDrawable G;
    @z1
    private RippleDrawable H;
    @z1
    private View.OnClickListener I;
    @z1
    private CompoundButton.OnCheckedChangeListener J;
    @z1
    private pe2.a<Chip> K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private int Q;
    @b1(unit = 1)
    private int R;
    @z1
    private CharSequence S;
    @x1
    private final d T;
    private boolean U;
    private final Rect V;
    private final RectF W;
    private final vg2 u0;
    private static final int t = ga2.n.Bh;
    private static final Rect w = new Rect();
    private static final int[] x = {16842913};
    private static final int[] y = {16842911};

    /* loaded from: classes.dex */
    public class a extends vg2 {
        public a() {
        }

        @Override // com.p7700g.p99005.vg2
        public void a(int i) {
        }

        @Override // com.p7700g.p99005.vg2
        public void b(@x1 Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.F.K3() ? Chip.this.F.P1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (Chip.this.K != null) {
                Chip.this.K.a(Chip.this, z);
            }
            if (Chip.this.J != null) {
                Chip.this.J.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @x1 Outline outline) {
            if (Chip.this.F != null) {
                Chip.this.F.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends bu {
        public d(Chip chip) {
            super(chip);
        }

        @Override // com.p7700g.p99005.bu
        public int C(float f, float f2) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // com.p7700g.p99005.bu
        public void D(@x1 List<Integer> list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.y() && Chip.this.I != null) {
                list.add(1);
            }
        }

        @Override // com.p7700g.p99005.bu
        public boolean N(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.z();
                }
                return false;
            }
            return false;
        }

        @Override // com.p7700g.p99005.bu
        public void Q(@x1 ls lsVar) {
            lsVar.U0(Chip.this.s());
            lsVar.X0(Chip.this.isClickable());
            lsVar.W0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                lsVar.L1(text);
            } else {
                lsVar.a1(text);
            }
        }

        @Override // com.p7700g.p99005.bu
        public void R(int i, @x1 ls lsVar) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    lsVar.a1(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = ga2.m.B0;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    lsVar.a1(context.getString(i2, objArr).trim());
                }
                lsVar.R0(Chip.this.getCloseIconTouchBoundsInt());
                lsVar.b(ls.a.f);
                lsVar.g1(Chip.this.isEnabled());
                return;
            }
            lsVar.a1("");
            lsVar.R0(Chip.w);
        }

        @Override // com.p7700g.p99005.bu
        public void S(int i, boolean z) {
            if (i == 1) {
                Chip.this.O = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void A() {
        if (this.G != null) {
            this.G = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            E();
        }
    }

    private void C(@z1 ob2 ob2Var) {
        if (ob2Var != null) {
            ob2Var.k3(null);
        }
    }

    private void D() {
        if (o() && y() && this.I != null) {
            sr.A1(this, this.T);
            this.U = true;
            return;
        }
        sr.A1(this, null);
        this.U = false;
    }

    private void E() {
        if (yg2.a) {
            F();
            return;
        }
        this.F.J3(true);
        sr.H1(this, getBackgroundDrawable());
        G();
        n();
    }

    private void F() {
        this.H = new RippleDrawable(yg2.d(this.F.N1()), getBackgroundDrawable(), null);
        this.F.J3(false);
        sr.H1(this, this.H);
        G();
    }

    private void G() {
        ob2 ob2Var;
        if (TextUtils.isEmpty(getText()) || (ob2Var = this.F) == null) {
            return;
        }
        int V0 = (int) (this.F.V0() + this.F.R1() + ob2Var.p1());
        int R0 = (int) (this.F.R0() + this.F.S1() + this.F.u1());
        if (this.G != null) {
            Rect rect = new Rect();
            this.G.getPadding(rect);
            R0 += rect.left;
            V0 += rect.right;
        }
        sr.c2(this, R0, getPaddingTop(), V0, getPaddingBottom());
    }

    private void H() {
        TextPaint paint = getPaint();
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            paint.drawableState = ob2Var.getState();
        }
        tg2 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.u0);
        }
    }

    private void I(@z1 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public RectF getCloseIconTouchBounds() {
        this.W.setEmpty();
        if (o() && this.I != null) {
            this.F.F1(this.W);
        }
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.V.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.V;
    }

    @z1
    private tg2 getTextAppearance() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.Q1();
        }
        return null;
    }

    private void k(@x1 ob2 ob2Var) {
        ob2Var.k3(this);
    }

    @x1
    private int[] l() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.O) {
            i2++;
        }
        if (this.N) {
            i2++;
        }
        if (this.M) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.O) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.N) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.M) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    private void n() {
        if (getBackgroundDrawable() == this.G && this.F.getCallback() == null) {
            this.F.setCallback(this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        ob2 ob2Var = this.F;
        return (ob2Var == null || ob2Var.y1() == null) ? false : true;
    }

    private void p(Context context, @z1 AttributeSet attributeSet, int i) {
        TypedArray j = cf2.j(context, attributeSet, ga2.o.w5, i, t, new int[0]);
        this.P = j.getBoolean(ga2.o.d6, false);
        this.R = (int) Math.ceil(j.getDimension(ga2.o.R5, (float) Math.ceil(kf2.e(getContext(), 48))));
        j.recycle();
    }

    private void q() {
        setOutlineProvider(new c());
    }

    private void r(int i, int i2, int i3, int i4) {
        this.G = new InsetDrawable((Drawable) this.F, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.N != z2) {
            this.N = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.M != z2) {
            this.M = z2;
            refreshDrawableState();
        }
    }

    public boolean B() {
        return this.P;
    }

    @Override // com.p7700g.p99005.ob2.a
    public void a() {
        m(this.R);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@x1 MotionEvent motionEvent) {
        if (this.U) {
            return this.T.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.U) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.T.w(keyEvent) || this.T.B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ob2 ob2Var = this.F;
        if ((ob2Var == null || !ob2Var.c2()) ? false : this.F.f3(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @x1
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.S)) {
            return this.S;
        }
        if (!s()) {
            return isClickable() ? B : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).k()) ? D : C;
    }

    @z1
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.G;
        return insetDrawable == null ? this.F : insetDrawable;
    }

    @z1
    public Drawable getCheckedIcon() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.l1();
        }
        return null;
    }

    @z1
    public ColorStateList getCheckedIconTint() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.m1();
        }
        return null;
    }

    @z1
    public ColorStateList getChipBackgroundColor() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.n1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return Math.max(0.0f, ob2Var.o1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.F;
    }

    public float getChipEndPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.p1();
        }
        return 0.0f;
    }

    @z1
    public Drawable getChipIcon() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.q1();
        }
        return null;
    }

    public float getChipIconSize() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.r1();
        }
        return 0.0f;
    }

    @z1
    public ColorStateList getChipIconTint() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.s1();
        }
        return null;
    }

    public float getChipMinHeight() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.t1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.u1();
        }
        return 0.0f;
    }

    @z1
    public ColorStateList getChipStrokeColor() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.v1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.w1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @z1
    public Drawable getCloseIcon() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.y1();
        }
        return null;
    }

    @z1
    public CharSequence getCloseIconContentDescription() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.z1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.A1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.B1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.C1();
        }
        return 0.0f;
    }

    @z1
    public ColorStateList getCloseIconTint() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.E1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @z1
    public TextUtils.TruncateAt getEllipsize() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.I1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@x1 Rect rect) {
        if (this.U && (this.T.B() == 1 || this.T.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @z1
    public oa2 getHideMotionSpec() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.J1();
        }
        return null;
    }

    public float getIconEndPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.K1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.L1();
        }
        return 0.0f;
    }

    @z1
    public ColorStateList getRippleColor() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.N1();
        }
        return null;
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return this.F.getShapeAppearanceModel();
    }

    @z1
    public oa2 getShowMotionSpec() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.O1();
        }
        return null;
    }

    public float getTextEndPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.R1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            return ob2Var.S1();
        }
        return 0.0f;
    }

    public boolean m(@b1 int i) {
        this.R = i;
        if (!B()) {
            if (this.G != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        int max = Math.max(0, i - this.F.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.F.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.G != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.G != null) {
            Rect rect = new Rect();
            this.G.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                E();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        r(i2, i3, i2, i3);
        E();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.f(this, this.F);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, x);
        }
        if (s()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.U) {
            this.T.M(z2, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@x1 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            ls.X1(accessibilityNodeInfo).Z0(ls.c.h(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.i(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @z1
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@x1 MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.Q != i) {
            this.Q = i;
            G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@x1 MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.M) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.M) {
                z();
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        ob2 ob2Var = this.F;
        return ob2Var != null && ob2Var.W1();
    }

    public void setAccessibilityClassName(@z1 CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.H) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.H) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@z1 ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@z1 PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.l2(z2);
        }
    }

    public void setCheckableResource(@s0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.m2(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        ob2 ob2Var = this.F;
        if (ob2Var == null) {
            this.L = z2;
        } else if (ob2Var.W1()) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(@z1 Drawable drawable) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.n2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@s0 int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@f1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.q2(i);
        }
    }

    public void setCheckedIconTint(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.r2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.s2(i);
        }
    }

    public void setCheckedIconVisible(@s0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.t2(i);
        }
    }

    public void setChipBackgroundColor(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.v2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.w2(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.x2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.y2(i);
        }
    }

    public void setChipDrawable(@x1 ob2 ob2Var) {
        ob2 ob2Var2 = this.F;
        if (ob2Var2 != ob2Var) {
            C(ob2Var2);
            this.F = ob2Var;
            ob2Var.v3(false);
            k(this.F);
            m(this.R);
        }
    }

    public void setChipEndPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.z2(f);
        }
    }

    public void setChipEndPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.A2(i);
        }
    }

    public void setChipIcon(@z1 Drawable drawable) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.B2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(@s0 int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@f1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.E2(i);
        }
    }

    public void setChipIconSize(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.F2(f);
        }
    }

    public void setChipIconSizeResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.G2(i);
        }
    }

    public void setChipIconTint(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.H2(colorStateList);
        }
    }

    public void setChipIconTintResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.I2(i);
        }
    }

    public void setChipIconVisible(@s0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.J2(i);
        }
    }

    public void setChipMinHeight(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.L2(f);
        }
    }

    public void setChipMinHeightResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.M2(i);
        }
    }

    public void setChipStartPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.N2(f);
        }
    }

    public void setChipStartPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.O2(i);
        }
    }

    public void setChipStrokeColor(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.P2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.Q2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.R2(f);
        }
    }

    public void setChipStrokeWidthResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.S2(i);
        }
    }

    @Deprecated
    public void setChipText(@z1 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@l2 int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@z1 Drawable drawable) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.U2(drawable);
        }
        D();
    }

    public void setCloseIconContentDescription(@z1 CharSequence charSequence) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.V2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@s0 int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.Y2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.Z2(i);
        }
    }

    public void setCloseIconResource(@f1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.a3(i);
        }
        D();
    }

    public void setCloseIconSize(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.b3(f);
        }
    }

    public void setCloseIconSizeResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.c3(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.d3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.e3(i);
        }
    }

    public void setCloseIconTint(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.g3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.h3(i);
        }
    }

    public void setCloseIconVisible(@s0 int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f) {
        super.setElevation(f);
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.n0(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.F == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            ob2 ob2Var = this.F;
            if (ob2Var != null) {
                ob2Var.l3(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.P = z2;
        m(this.R);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(@z1 oa2 oa2Var) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.m3(oa2Var);
        }
    }

    public void setHideMotionSpecResource(@m0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.n3(i);
        }
    }

    public void setIconEndPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.o3(f);
        }
    }

    public void setIconEndPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.p3(i);
        }
    }

    public void setIconStartPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.q3(f);
        }
    }

    public void setIconStartPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.r3(i);
        }
    }

    @Override // com.p7700g.p99005.pe2
    @i2({i2.a.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@z1 pe2.a<Chip> aVar) {
        this.K = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.F == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@c2 int i) {
        super.setMaxWidth(i);
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.s3(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@z1 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.J = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.I = onClickListener;
        D();
    }

    public void setRippleColor(@z1 ColorStateList colorStateList) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.t3(colorStateList);
        }
        if (this.F.U1()) {
            return;
        }
        F();
    }

    public void setRippleColorResource(@y0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.u3(i);
            if (this.F.U1()) {
                return;
            }
            F();
        }
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        this.F.setShapeAppearanceModel(qh2Var);
    }

    public void setShowMotionSpec(@z1 oa2 oa2Var) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.w3(oa2Var);
        }
    }

    public void setShowMotionSpecResource(@m0 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.x3(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ob2 ob2Var = this.F;
        if (ob2Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(ob2Var.K3() ? null : charSequence, bufferType);
        ob2 ob2Var2 = this.F;
        if (ob2Var2 != null) {
            ob2Var2.y3(charSequence);
        }
    }

    public void setTextAppearance(@z1 tg2 tg2Var) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.z3(tg2Var);
        }
        H();
    }

    public void setTextAppearanceResource(@m2 int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.D3(f);
        }
    }

    public void setTextEndPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.E3(i);
        }
    }

    public void setTextStartPadding(float f) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.H3(f);
        }
    }

    public void setTextStartPaddingResource(@a1 int i) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.I3(i);
        }
    }

    @Deprecated
    public boolean t() {
        return u();
    }

    public boolean u() {
        ob2 ob2Var = this.F;
        return ob2Var != null && ob2Var.Y1();
    }

    @Deprecated
    public boolean v() {
        return w();
    }

    public boolean w() {
        ob2 ob2Var = this.F;
        return ob2Var != null && ob2Var.a2();
    }

    @Deprecated
    public boolean x() {
        return y();
    }

    public boolean y() {
        ob2 ob2Var = this.F;
        return ob2Var != null && ob2Var.d2();
    }

    @t0
    public boolean z() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.I;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.U) {
            this.T.Y(1, 1);
        }
        return z2;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.e2);
    }

    public void setCloseIconVisible(boolean z2) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.j3(z2);
        }
        D();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = t;
        this.V = new Rect();
        this.W = new RectF();
        this.u0 = new a();
        Context context2 = getContext();
        I(attributeSet);
        ob2 a1 = ob2.a1(context2, attributeSet, i, i2);
        p(context2, attributeSet, i);
        setChipDrawable(a1);
        a1.n0(sr.Q(this));
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.w5, i, i2, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(sg2.a(context2, j, ga2.o.z5));
        }
        boolean hasValue = j.hasValue(ga2.o.i6);
        j.recycle();
        this.T = new d(this);
        D();
        if (!hasValue) {
            q();
        }
        setChecked(this.L);
        setText(a1.P1());
        setEllipsize(a1.I1());
        H();
        if (!this.F.K3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        G();
        if (B()) {
            setMinHeight(this.R);
        }
        this.Q = sr.Y(this);
        super.setOnCheckedChangeListener(new b());
    }

    public void setCheckedIconVisible(boolean z2) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.u2(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.K2(z2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.A3(i);
        }
        H();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ob2 ob2Var = this.F;
        if (ob2Var != null) {
            ob2Var.A3(i);
        }
        H();
    }
}