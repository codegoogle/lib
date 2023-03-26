package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.qh2;

/* compiled from: MaterialCardViewHelper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class mb2 {
    private static final int a = -1;
    private static final double b = Math.cos(Math.toRadians(45.0d));
    private static final float c = 1.5f;
    private static final int d = 2;
    private static final Drawable e;
    @x1
    private final lb2 f;
    @x1
    private final lh2 h;
    @x1
    private final lh2 i;
    @b1
    private int j;
    @b1
    private int k;
    private int l;
    @b1
    private int m;
    @z1
    private Drawable n;
    @z1
    private Drawable o;
    @z1
    private ColorStateList p;
    @z1
    private ColorStateList q;
    @z1
    private qh2 r;
    @z1
    private ColorStateList s;
    @z1
    private Drawable t;
    @z1
    private LayerDrawable u;
    @z1
    private lh2 v;
    @z1
    private lh2 w;
    private boolean y;
    @x1
    private final Rect g = new Rect();
    private boolean x = false;

    /* compiled from: MaterialCardViewHelper.java */
    /* loaded from: classes2.dex */
    public class a extends InsetDrawable {
        public a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        e = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public mb2(@x1 lb2 lb2Var, AttributeSet attributeSet, int i, @m2 int i2) {
        this.f = lb2Var;
        lh2 lh2Var = new lh2(lb2Var.getContext(), attributeSet, i, i2);
        this.h = lh2Var;
        lh2Var.Z(lb2Var.getContext());
        lh2Var.v0(-12303292);
        qh2.b v = lh2Var.getShapeAppearanceModel().v();
        TypedArray obtainStyledAttributes = lb2Var.getContext().obtainStyledAttributes(attributeSet, ga2.o.i5, i, ga2.n.j4);
        int i3 = ga2.o.m5;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.i = new lh2();
        V(v.m());
        obtainStyledAttributes.recycle();
    }

    @x1
    private Drawable B(Drawable drawable) {
        int i;
        int i2;
        if (this.f.getUseCompatPadding()) {
            int ceil = (int) Math.ceil(d());
            i = (int) Math.ceil(c());
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new a(drawable, i, i2, i, i2);
    }

    private boolean E() {
        return (this.l & 80) == 80;
    }

    private boolean F() {
        return (this.l & nq.c) == 8388613;
    }

    private boolean Z() {
        return this.f.getPreventCornerOverlap() && !e();
    }

    private float a() {
        return Math.max(Math.max(b(this.r.q(), this.h.S()), b(this.r.s(), this.h.T())), Math.max(b(this.r.k(), this.h.u()), b(this.r.i(), this.h.t())));
    }

    private boolean a0() {
        return this.f.getPreventCornerOverlap() && e() && this.f.getUseCompatPadding();
    }

    private float b(gh2 gh2Var, float f) {
        if (gh2Var instanceof ph2) {
            return (float) ((1.0d - b) * f);
        }
        if (gh2Var instanceof hh2) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f.getMaxCardElevation() + (a0() ? a() : 0.0f);
    }

    private float d() {
        return (this.f.getMaxCardElevation() * 1.5f) + (a0() ? a() : 0.0f);
    }

    private boolean e() {
        return this.h.e0();
    }

    private void e0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f.getForeground()).setDrawable(drawable);
        } else {
            this.f.setForeground(B(drawable));
        }
    }

    @x1
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        lh2 h = h();
        this.v = h;
        h.o0(this.p);
        stateListDrawable.addState(new int[]{16842919}, this.v);
        return stateListDrawable;
    }

    @x1
    private Drawable g() {
        if (yg2.a) {
            this.w = h();
            return new RippleDrawable(this.p, null, this.w);
        }
        return f();
    }

    private void g0() {
        Drawable drawable;
        if (yg2.a && (drawable = this.t) != null) {
            ((RippleDrawable) drawable).setColor(this.p);
            return;
        }
        lh2 lh2Var = this.v;
        if (lh2Var != null) {
            lh2Var.o0(this.p);
        }
    }

    @x1
    private lh2 h() {
        return new lh2(this.r);
    }

    @x1
    private Drawable r() {
        if (this.t == null) {
            this.t = g();
        }
        if (this.u == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.t, this.i, this.o});
            this.u = layerDrawable;
            layerDrawable.setId(2, ga2.h.o3);
        }
        return this.u;
    }

    private float t() {
        if (this.f.getPreventCornerOverlap() && this.f.getUseCompatPadding()) {
            return (float) ((1.0d - b) * this.f.getCardViewRadius());
        }
        return 0.0f;
    }

    @x1
    public Rect A() {
        return this.g;
    }

    public boolean C() {
        return this.x;
    }

    public boolean D() {
        return this.y;
    }

    public void G(@x1 TypedArray typedArray) {
        ColorStateList a2 = sg2.a(this.f.getContext(), typedArray, ga2.o.gm);
        this.s = a2;
        if (a2 == null) {
            this.s = ColorStateList.valueOf(-1);
        }
        this.m = typedArray.getDimensionPixelSize(ga2.o.hm, 0);
        boolean z = typedArray.getBoolean(ga2.o.Vl, false);
        this.y = z;
        this.f.setLongClickable(z);
        this.q = sg2.a(this.f.getContext(), typedArray, ga2.o.bm);
        N(sg2.e(this.f.getContext(), typedArray, ga2.o.Xl));
        Q(typedArray.getDimensionPixelSize(ga2.o.am, 0));
        P(typedArray.getDimensionPixelSize(ga2.o.Zl, 0));
        this.l = typedArray.getInteger(ga2.o.Yl, 8388661);
        ColorStateList a3 = sg2.a(this.f.getContext(), typedArray, ga2.o.cm);
        this.p = a3;
        if (a3 == null) {
            this.p = ColorStateList.valueOf(kc2.d(this.f, ga2.c.M2));
        }
        K(sg2.a(this.f.getContext(), typedArray, ga2.o.Wl));
        g0();
        d0();
        h0();
        this.f.setBackgroundInternal(B(this.h));
        Drawable r = this.f.isClickable() ? r() : this.i;
        this.n = r;
        this.f.setForeground(B(r));
    }

    public void H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.u != null) {
            int i10 = 0;
            if (this.f.getUseCompatPadding()) {
                i3 = (int) Math.ceil(d() * 2.0f);
                i10 = (int) Math.ceil(c() * 2.0f);
            } else {
                i3 = 0;
            }
            if (F()) {
                i4 = ((i - this.j) - this.k) - i10;
            } else {
                i4 = this.j;
            }
            if (E()) {
                i5 = this.j;
            } else {
                i5 = ((i2 - this.j) - this.k) - i3;
            }
            int i11 = i5;
            if (F()) {
                i6 = this.j;
            } else {
                i6 = ((i - this.j) - this.k) - i10;
            }
            if (E()) {
                i7 = ((i2 - this.j) - this.k) - i3;
            } else {
                i7 = this.j;
            }
            int i12 = i7;
            if (sr.Y(this.f) == 1) {
                i9 = i6;
                i8 = i4;
            } else {
                i8 = i6;
                i9 = i4;
            }
            this.u.setLayerInset(2, i9, i12, i8, i11);
        }
    }

    public void I(boolean z) {
        this.x = z;
    }

    public void J(ColorStateList colorStateList) {
        this.h.o0(colorStateList);
    }

    public void K(@z1 ColorStateList colorStateList) {
        lh2 lh2Var = this.i;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        lh2Var.o0(colorStateList);
    }

    public void L(boolean z) {
        this.y = z;
    }

    public void M(boolean z) {
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setAlpha(z ? 255 : 0);
        }
    }

    public void N(@z1 Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = fk.r(drawable).mutate();
            this.o = mutate;
            fk.o(mutate, this.q);
            M(this.f.isChecked());
        } else {
            this.o = e;
        }
        LayerDrawable layerDrawable = this.u;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(ga2.h.o3, this.o);
        }
    }

    public void O(int i) {
        this.l = i;
        H(this.f.getMeasuredWidth(), this.f.getMeasuredHeight());
    }

    public void P(@b1 int i) {
        this.j = i;
    }

    public void Q(@b1 int i) {
        this.k = i;
    }

    public void R(@z1 ColorStateList colorStateList) {
        this.q = colorStateList;
        Drawable drawable = this.o;
        if (drawable != null) {
            fk.o(drawable, colorStateList);
        }
    }

    public void S(float f) {
        V(this.r.w(f));
        this.n.invalidateSelf();
        if (a0() || Z()) {
            c0();
        }
        if (a0()) {
            f0();
        }
    }

    public void T(@g1(from = 0.0d, to = 1.0d) float f) {
        this.h.p0(f);
        lh2 lh2Var = this.i;
        if (lh2Var != null) {
            lh2Var.p0(f);
        }
        lh2 lh2Var2 = this.w;
        if (lh2Var2 != null) {
            lh2Var2.p0(f);
        }
    }

    public void U(@z1 ColorStateList colorStateList) {
        this.p = colorStateList;
        g0();
    }

    public void V(@x1 qh2 qh2Var) {
        this.r = qh2Var;
        this.h.setShapeAppearanceModel(qh2Var);
        lh2 lh2Var = this.h;
        lh2Var.u0(!lh2Var.e0());
        lh2 lh2Var2 = this.i;
        if (lh2Var2 != null) {
            lh2Var2.setShapeAppearanceModel(qh2Var);
        }
        lh2 lh2Var3 = this.w;
        if (lh2Var3 != null) {
            lh2Var3.setShapeAppearanceModel(qh2Var);
        }
        lh2 lh2Var4 = this.v;
        if (lh2Var4 != null) {
            lh2Var4.setShapeAppearanceModel(qh2Var);
        }
    }

    public void W(ColorStateList colorStateList) {
        if (this.s == colorStateList) {
            return;
        }
        this.s = colorStateList;
        h0();
    }

    public void X(@b1 int i) {
        if (i == this.m) {
            return;
        }
        this.m = i;
        h0();
    }

    public void Y(int i, int i2, int i3, int i4) {
        this.g.set(i, i2, i3, i4);
        c0();
    }

    public void b0() {
        Drawable drawable = this.n;
        Drawable r = this.f.isClickable() ? r() : this.i;
        this.n = r;
        if (drawable != r) {
            e0(r);
        }
    }

    public void c0() {
        int a2 = (int) ((Z() || a0() ? a() : 0.0f) - t());
        lb2 lb2Var = this.f;
        Rect rect = this.g;
        lb2Var.m(rect.left + a2, rect.top + a2, rect.right + a2, rect.bottom + a2);
    }

    public void d0() {
        this.h.n0(this.f.getCardElevation());
    }

    public void f0() {
        if (!C()) {
            this.f.setBackgroundInternal(B(this.h));
        }
        this.f.setForeground(B(this.n));
    }

    public void h0() {
        this.i.E0(this.m, this.s);
    }

    @e2(api = 23)
    public void i() {
        Drawable drawable = this.t;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.t.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.t.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @x1
    public lh2 j() {
        return this.h;
    }

    public ColorStateList k() {
        return this.h.y();
    }

    public ColorStateList l() {
        return this.i.y();
    }

    @z1
    public Drawable m() {
        return this.o;
    }

    public int n() {
        return this.l;
    }

    @b1
    public int o() {
        return this.j;
    }

    @b1
    public int p() {
        return this.k;
    }

    @z1
    public ColorStateList q() {
        return this.q;
    }

    public float s() {
        return this.h.S();
    }

    @g1(from = 0.0d, to = 1.0d)
    public float u() {
        return this.h.z();
    }

    @z1
    public ColorStateList v() {
        return this.p;
    }

    public qh2 w() {
        return this.r;
    }

    @w0
    public int x() {
        ColorStateList colorStateList = this.s;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @z1
    public ColorStateList y() {
        return this.s;
    }

    @b1
    public int z() {
        return this.m;
    }
}