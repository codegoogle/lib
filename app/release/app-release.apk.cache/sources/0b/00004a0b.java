package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: MaterialButtonHelper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class jb2 {
    @v0(api = 21)
    private static final boolean a;
    private static final boolean b;
    private final MaterialButton c;
    @x1
    private qh2 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    @z1
    private PorterDuff.Mode k;
    @z1
    private ColorStateList l;
    @z1
    private ColorStateList m;
    @z1
    private ColorStateList n;
    @z1
    private Drawable o;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s;
    private LayerDrawable t;
    private int u;

    static {
        int i = Build.VERSION.SDK_INT;
        a = true;
        b = i <= 22;
    }

    public jb2(MaterialButton materialButton, @x1 qh2 qh2Var) {
        this.c = materialButton;
        this.d = qh2Var;
    }

    private void E(@b1 int i, @b1 int i2) {
        int j0 = sr.j0(this.c);
        int paddingTop = this.c.getPaddingTop();
        int i0 = sr.i0(this.c);
        int paddingBottom = this.c.getPaddingBottom();
        int i3 = this.g;
        int i4 = this.h;
        this.h = i2;
        this.g = i;
        if (!this.q) {
            F();
        }
        sr.c2(this.c, j0, (paddingTop + i) - i3, i0, (paddingBottom + i2) - i4);
    }

    private void F() {
        this.c.setInternalBackground(a());
        lh2 f = f();
        if (f != null) {
            f.n0(this.u);
        }
    }

    private void G(@x1 qh2 qh2Var) {
        if (b && !this.q) {
            int j0 = sr.j0(this.c);
            int paddingTop = this.c.getPaddingTop();
            int i0 = sr.i0(this.c);
            int paddingBottom = this.c.getPaddingBottom();
            F();
            sr.c2(this.c, j0, paddingTop, i0, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(qh2Var);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(qh2Var);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(qh2Var);
        }
    }

    private void I() {
        lh2 f = f();
        lh2 n = n();
        if (f != null) {
            f.E0(this.j, this.m);
            if (n != null) {
                n.D0(this.j, this.p ? kc2.d(this.c, ga2.c.o3) : 0);
            }
        }
    }

    @x1
    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.e, this.g, this.f, this.h);
    }

    private Drawable a() {
        lh2 lh2Var = new lh2(this.d);
        lh2Var.Z(this.c.getContext());
        fk.o(lh2Var, this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            fk.p(lh2Var, mode);
        }
        lh2Var.E0(this.j, this.m);
        lh2 lh2Var2 = new lh2(this.d);
        lh2Var2.setTint(0);
        lh2Var2.D0(this.j, this.p ? kc2.d(this.c, ga2.c.o3) : 0);
        if (a) {
            lh2 lh2Var3 = new lh2(this.d);
            this.o = lh2Var3;
            fk.n(lh2Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(yg2.d(this.n), J(new LayerDrawable(new Drawable[]{lh2Var2, lh2Var})), this.o);
            this.t = rippleDrawable;
            return rippleDrawable;
        }
        xg2 xg2Var = new xg2(this.d);
        this.o = xg2Var;
        fk.o(xg2Var, yg2.d(this.n));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{lh2Var2, lh2Var, this.o});
        this.t = layerDrawable;
        return J(layerDrawable);
    }

    @z1
    private lh2 g(boolean z) {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (a) {
            return (lh2) ((LayerDrawable) ((InsetDrawable) this.t.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (lh2) this.t.getDrawable(!z ? 1 : 0);
    }

    @z1
    private lh2 n() {
        return g(true);
    }

    public void A(@z1 ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            I();
        }
    }

    public void B(int i) {
        if (this.j != i) {
            this.j = i;
            I();
        }
    }

    public void C(@z1 ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (f() != null) {
                fk.o(f(), this.l);
            }
        }
    }

    public void D(@z1 PorterDuff.Mode mode) {
        if (this.k != mode) {
            this.k = mode;
            if (f() == null || this.k == null) {
                return;
            }
            fk.p(f(), this.k);
        }
    }

    public void H(int i, int i2) {
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(this.e, this.g, i2 - this.f, i - this.h);
        }
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.g;
    }

    @z1
    public uh2 e() {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.t.getNumberOfLayers() > 2) {
            return (uh2) this.t.getDrawable(2);
        }
        return (uh2) this.t.getDrawable(1);
    }

    @z1
    public lh2 f() {
        return g(false);
    }

    @z1
    public ColorStateList h() {
        return this.n;
    }

    @x1
    public qh2 i() {
        return this.d;
    }

    @z1
    public ColorStateList j() {
        return this.m;
    }

    public int k() {
        return this.j;
    }

    public ColorStateList l() {
        return this.l;
    }

    public PorterDuff.Mode m() {
        return this.k;
    }

    public boolean o() {
        return this.q;
    }

    public boolean p() {
        return this.s;
    }

    public void q(@x1 TypedArray typedArray) {
        this.e = typedArray.getDimensionPixelOffset(ga2.o.al, 0);
        this.f = typedArray.getDimensionPixelOffset(ga2.o.bl, 0);
        this.g = typedArray.getDimensionPixelOffset(ga2.o.cl, 0);
        this.h = typedArray.getDimensionPixelOffset(ga2.o.dl, 0);
        int i = ga2.o.hl;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.i = dimensionPixelSize;
            y(this.d.w(dimensionPixelSize));
            this.r = true;
        }
        this.j = typedArray.getDimensionPixelSize(ga2.o.tl, 0);
        this.k = kf2.l(typedArray.getInt(ga2.o.gl, -1), PorterDuff.Mode.SRC_IN);
        this.l = sg2.a(this.c.getContext(), typedArray, ga2.o.fl);
        this.m = sg2.a(this.c.getContext(), typedArray, ga2.o.sl);
        this.n = sg2.a(this.c.getContext(), typedArray, ga2.o.f25pl);
        this.s = typedArray.getBoolean(ga2.o.el, false);
        this.u = typedArray.getDimensionPixelSize(ga2.o.il, 0);
        int j0 = sr.j0(this.c);
        int paddingTop = this.c.getPaddingTop();
        int i0 = sr.i0(this.c);
        int paddingBottom = this.c.getPaddingBottom();
        if (typedArray.hasValue(ga2.o.Zk)) {
            s();
        } else {
            F();
        }
        sr.c2(this.c, j0 + this.e, paddingTop + this.g, i0 + this.f, paddingBottom + this.h);
    }

    public void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void s() {
        this.q = true;
        this.c.setSupportBackgroundTintList(this.l);
        this.c.setSupportBackgroundTintMode(this.k);
    }

    public void t(boolean z) {
        this.s = z;
    }

    public void u(int i) {
        if (this.r && this.i == i) {
            return;
        }
        this.i = i;
        this.r = true;
        y(this.d.w(i));
    }

    public void v(@b1 int i) {
        E(this.g, i);
    }

    public void w(@b1 int i) {
        E(i, this.h);
    }

    public void x(@z1 ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            boolean z = a;
            if (z && (this.c.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.c.getBackground()).setColor(yg2.d(colorStateList));
            } else if (z || !(this.c.getBackground() instanceof xg2)) {
            } else {
                ((xg2) this.c.getBackground()).setTintList(yg2.d(colorStateList));
            }
        }
    }

    public void y(@x1 qh2 qh2Var) {
        this.d = qh2Var;
        G(qh2Var);
    }

    public void z(boolean z) {
        this.p = z;
        I();
    }
}