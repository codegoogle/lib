package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.au;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jb2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.mh2;
import com.p7700g.p99005.nq;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.uh2;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.y0;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, uh2 {
    private static final String A = "MaterialButton";
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 16;
    public static final int z = 32;
    @x1
    private final jb2 C;
    @x1
    private final LinkedHashSet<b> D;
    @z1
    private c E;
    @z1
    private PorterDuff.Mode F;
    @z1
    private ColorStateList G;
    @z1
    private Drawable H;
    @c2
    private int I;
    @c2
    private int J;
    @c2
    private int K;
    @c2
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private static final int[] s = {16842911};
    private static final int[] t = {16842912};
    private static final int B = ga2.n.mh;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes2.dex */
    public static class d extends au {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public boolean s;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public d createFromParcel(@x1 Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public d createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(@x1 Parcel parcel) {
            this.s = parcel.readInt() == 1;
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s ? 1 : 0);
        }

        public d(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }
    }

    public MaterialButton(@x1 Context context) {
        this(context, null);
    }

    private boolean d() {
        int i = this.O;
        return i == 3 || i == 4;
    }

    private boolean e() {
        int i = this.O;
        return i == 1 || i == 2;
    }

    private boolean f() {
        int i = this.O;
        return i == 16 || i == 32;
    }

    private boolean g() {
        return sr.Y(this) == 1;
    }

    @x1
    private String getA11yClassName() {
        return (c() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment == 6 || textAlignment == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (textAlignment != 4) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & nq.d;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean h() {
        jb2 jb2Var = this.C;
        return (jb2Var == null || jb2Var.o()) ? false : true;
    }

    private void j() {
        if (e()) {
            nt.w(this, this.H, null, null, null);
        } else if (d()) {
            nt.w(this, null, null, this.H, null);
        } else if (f()) {
            nt.w(this, null, this.H, null, null);
        }
    }

    private void k(boolean z2) {
        Drawable drawable = this.H;
        boolean z3 = true;
        if (drawable != null) {
            Drawable mutate = fk.r(drawable).mutate();
            this.H = mutate;
            fk.o(mutate, this.G);
            PorterDuff.Mode mode = this.F;
            if (mode != null) {
                fk.p(this.H, mode);
            }
            int i = this.I;
            if (i == 0) {
                i = this.H.getIntrinsicWidth();
            }
            int i2 = this.I;
            if (i2 == 0) {
                i2 = this.H.getIntrinsicHeight();
            }
            Drawable drawable2 = this.H;
            int i3 = this.J;
            int i4 = this.K;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.H.setVisible(true, z2);
        }
        if (z2) {
            j();
            return;
        }
        Drawable[] h = nt.h(this);
        Drawable drawable3 = h[0];
        Drawable drawable4 = h[1];
        Drawable drawable5 = h[2];
        if ((!e() || drawable3 == this.H) && ((!d() || drawable5 == this.H) && (!f() || drawable4 == this.H))) {
            z3 = false;
        }
        if (z3) {
            j();
        }
    }

    private void l(int i, int i2) {
        if (this.H == null || getLayout() == null) {
            return;
        }
        if (!e() && !d()) {
            if (f()) {
                this.J = 0;
                if (this.O == 16) {
                    this.K = 0;
                    k(false);
                    return;
                }
                int i3 = this.I;
                if (i3 == 0) {
                    i3 = this.H.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.L) - getPaddingBottom()) / 2;
                if (this.K != textHeight) {
                    this.K = textHeight;
                    k(false);
                    return;
                }
                return;
            }
            return;
        }
        this.K = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.O;
        if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
            int i5 = this.I;
            if (i5 == 0) {
                i5 = this.H.getIntrinsicWidth();
            }
            int textWidth = ((((i - getTextWidth()) - sr.i0(this)) - i5) - this.L) - sr.j0(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                textWidth /= 2;
            }
            if (g() != (this.O == 4)) {
                textWidth = -textWidth;
            }
            if (this.J != textWidth) {
                this.J = textWidth;
                k(false);
                return;
            }
            return;
        }
        this.J = 0;
        k(false);
    }

    public void a(@x1 b bVar) {
        this.D.add(bVar);
    }

    public void b() {
        this.D.clear();
    }

    public boolean c() {
        jb2 jb2Var = this.C;
        return jb2Var != null && jb2Var.p();
    }

    @Override // android.view.View
    @z1
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @z1
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @c2
    public int getCornerRadius() {
        if (h()) {
            return this.C.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.H;
    }

    public int getIconGravity() {
        return this.O;
    }

    @c2
    public int getIconPadding() {
        return this.L;
    }

    @c2
    public int getIconSize() {
        return this.I;
    }

    public ColorStateList getIconTint() {
        return this.G;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @b1
    public int getInsetBottom() {
        return this.C.c();
    }

    @b1
    public int getInsetTop() {
        return this.C.d();
    }

    @z1
    public ColorStateList getRippleColor() {
        if (h()) {
            return this.C.h();
        }
        return null;
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        if (h()) {
            return this.C.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (h()) {
            return this.C.j();
        }
        return null;
    }

    @c2
    public int getStrokeWidth() {
        if (h()) {
            return this.C.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public ColorStateList getSupportBackgroundTintList() {
        if (h()) {
            return this.C.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (h()) {
            return this.C.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void i(@x1 b bVar) {
        this.D.remove(bVar);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.M;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (h()) {
            mh2.f(this, this.C.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (c()) {
            Button.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@x1 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        jb2 jb2Var;
        super.onLayout(z2, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (jb2Var = this.C) != null) {
            jb2Var.H(i4 - i2, i3 - i);
        }
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@z1 Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setChecked(dVar.s);
    }

    @Override // android.widget.TextView, android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.s = this.M;
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.H != null) {
            if (this.H.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@x1 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@w0 int i) {
        if (h()) {
            this.C.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@x1 Drawable drawable) {
        if (h()) {
            if (drawable != getBackground()) {
                this.C.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@f1 int i) {
        setBackgroundDrawable(i != 0 ? r3.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@z1 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@z1 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (h()) {
            this.C.t(z2);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (c() && isEnabled() && this.M != z2) {
            this.M = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).p(this, this.M);
            }
            if (this.N) {
                return;
            }
            this.N = true;
            Iterator<b> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.M);
            }
            this.N = false;
        }
    }

    public void setCornerRadius(@c2 int i) {
        if (h()) {
            this.C.u(i);
        }
    }

    public void setCornerRadiusResource(@a1 int i) {
        if (h()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (h()) {
            this.C.f().n0(f);
        }
    }

    public void setIcon(@z1 Drawable drawable) {
        if (this.H != drawable) {
            this.H = drawable;
            k(true);
            l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.O != i) {
            this.O = i;
            l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@c2 int i) {
        if (this.L != i) {
            this.L = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@f1 int i) {
        setIcon(i != 0 ? r3.b(getContext(), i) : null);
    }

    public void setIconSize(@c2 int i) {
        if (i >= 0) {
            if (this.I != i) {
                this.I = i;
                k(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@z1 ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            k(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.F != mode) {
            this.F = mode;
            k(false);
        }
    }

    public void setIconTintResource(@y0 int i) {
        setIconTint(r3.a(getContext(), i));
    }

    public void setInsetBottom(@b1 int i) {
        this.C.v(i);
    }

    public void setInsetTop(@b1 int i) {
        this.C.w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@z1 c cVar) {
        this.E = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        c cVar = this.E;
        if (cVar != null) {
            cVar.a(this, z2);
        }
        super.setPressed(z2);
    }

    public void setRippleColor(@z1 ColorStateList colorStateList) {
        if (h()) {
            this.C.x(colorStateList);
        }
    }

    public void setRippleColorResource(@y0 int i) {
        if (h()) {
            setRippleColor(r3.a(getContext(), i));
        }
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        if (h()) {
            this.C.y(qh2Var);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (h()) {
            this.C.z(z2);
        }
    }

    public void setStrokeColor(@z1 ColorStateList colorStateList) {
        if (h()) {
            this.C.A(colorStateList);
        }
    }

    public void setStrokeColorResource(@y0 int i) {
        if (h()) {
            setStrokeColor(r3.a(getContext(), i));
        }
    }

    public void setStrokeWidth(@c2 int i) {
        if (h()) {
            this.C.B(i);
        }
    }

    public void setStrokeWidthResource(@a1 int i) {
        if (h()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@z1 ColorStateList colorStateList) {
        if (h()) {
            this.C.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@z1 PorterDuff.Mode mode) {
        if (h()) {
            this.C.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @e2(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.M);
    }

    public MaterialButton(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.Ka);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = B;
        this.D = new LinkedHashSet<>();
        this.M = false;
        this.N = false;
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.Yk, i, i2, new int[0]);
        this.L = j.getDimensionPixelSize(ga2.o.ll, 0);
        this.F = kf2.l(j.getInt(ga2.o.ol, -1), PorterDuff.Mode.SRC_IN);
        this.G = sg2.a(getContext(), j, ga2.o.nl);
        this.H = sg2.e(getContext(), j, ga2.o.jl);
        this.O = j.getInteger(ga2.o.kl, 1);
        this.I = j.getDimensionPixelSize(ga2.o.ml, 0);
        jb2 jb2Var = new jb2(this, qh2.e(context2, attributeSet, i, i2).m());
        this.C = jb2Var;
        jb2Var.q(j);
        j.recycle();
        setCompoundDrawablePadding(this.L);
        k(this.H != null);
    }
}