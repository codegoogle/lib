package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ze2;

/* compiled from: TooltipDrawable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class kj2 extends lh2 implements ze2.b {
    @m2
    private static final int W = ga2.n.lj;
    @q0
    private static final int X = ga2.c.wh;
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private float E0;
    private float F0;
    private final float G0;
    private float H0;
    private float I0;
    @z1
    private CharSequence Y;
    @x1
    private final Context Z;
    @z1
    private final Paint.FontMetrics u0;
    @x1
    private final ze2 v0;
    @x1
    private final View.OnLayoutChangeListener w0;
    @x1
    private final Rect x0;
    private int y0;
    private int z0;

    /* compiled from: TooltipDrawable.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            kj2.this.r1(view);
        }
    }

    private kj2(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(context, attributeSet, i, i2);
        this.u0 = new Paint.FontMetrics();
        ze2 ze2Var = new ze2(this);
        this.v0 = ze2Var;
        this.w0 = new a();
        this.x0 = new Rect();
        this.E0 = 1.0f;
        this.F0 = 1.0f;
        this.G0 = 0.5f;
        this.H0 = 0.5f;
        this.I0 = 1.0f;
        this.Z = context;
        ze2Var.e().density = context.getResources().getDisplayMetrics().density;
        ze2Var.e().setTextAlign(Paint.Align.CENTER);
    }

    private float Q0() {
        int i;
        if (((this.x0.right - getBounds().right) - this.D0) - this.B0 < 0) {
            i = ((this.x0.right - getBounds().right) - this.D0) - this.B0;
        } else if (((this.x0.left - getBounds().left) - this.D0) + this.B0 <= 0) {
            return 0.0f;
        } else {
            i = ((this.x0.left - getBounds().left) - this.D0) + this.B0;
        }
        return i;
    }

    private float R0() {
        this.v0.e().getFontMetrics(this.u0);
        Paint.FontMetrics fontMetrics = this.u0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float S0(@x1 Rect rect) {
        return rect.centerY() - R0();
    }

    @x1
    public static kj2 T0(@x1 Context context) {
        return V0(context, null, X, W);
    }

    @x1
    public static kj2 U0(@x1 Context context, @z1 AttributeSet attributeSet) {
        return V0(context, attributeSet, X, W);
    }

    @x1
    public static kj2 V0(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        kj2 kj2Var = new kj2(context, attributeSet, i, i2);
        kj2Var.g1(attributeSet, i, i2);
        return kj2Var;
    }

    private ih2 W0() {
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.C0))) / 2.0f;
        return new nh2(new kh2(this.C0), Math.min(Math.max(-Q0(), -width), width));
    }

    private void Y0(@x1 Canvas canvas) {
        if (this.Y == null) {
            return;
        }
        Rect bounds = getBounds();
        int S0 = (int) S0(bounds);
        if (this.v0.d() != null) {
            this.v0.e().drawableState = getState();
            this.v0.k(this.Z);
            this.v0.e().setAlpha((int) (this.I0 * 255.0f));
        }
        CharSequence charSequence = this.Y;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), S0, this.v0.e());
    }

    private float f1() {
        CharSequence charSequence = this.Y;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.v0.f(charSequence.toString());
    }

    private void g1(@z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        TypedArray j = cf2.j(this.Z, attributeSet, ga2.o.Nv, i, i2, new int[0]);
        this.C0 = this.Z.getResources().getDimensionPixelSize(ga2.f.x9);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
        m1(j.getText(ga2.o.Uv));
        tg2 g = sg2.g(this.Z, j, ga2.o.Ov);
        if (g != null) {
            int i3 = ga2.o.Pv;
            if (j.hasValue(i3)) {
                g.k(sg2.a(this.Z, j, i3));
            }
        }
        n1(g);
        o0(ColorStateList.valueOf(j.getColor(ga2.o.Vv, kc2.l(fj.B(kc2.c(this.Z, 16842801, kj2.class.getCanonicalName()), 229), fj.B(kc2.c(this.Z, ga2.c.Q2, kj2.class.getCanonicalName()), 153)))));
        F0(ColorStateList.valueOf(kc2.c(this.Z, ga2.c.o3, kj2.class.getCanonicalName())));
        this.y0 = j.getDimensionPixelSize(ga2.o.Qv, 0);
        this.z0 = j.getDimensionPixelSize(ga2.o.Sv, 0);
        this.A0 = j.getDimensionPixelSize(ga2.o.Tv, 0);
        this.B0 = j.getDimensionPixelSize(ga2.o.Rv, 0);
        j.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(@x1 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.D0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.x0);
    }

    public void X0(@z1 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.w0);
    }

    public int Z0() {
        return this.B0;
    }

    @Override // com.p7700g.p99005.ze2.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.A0;
    }

    public int b1() {
        return this.z0;
    }

    @z1
    public CharSequence c1() {
        return this.Y;
    }

    @z1
    public tg2 d1() {
        return this.v0.d();
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        canvas.save();
        float Q0 = Q0();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.E0, this.F0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.H0) + getBounds().top);
        canvas.translate(Q0, (float) (-((sqrt * this.C0) - this.C0)));
        super.draw(canvas);
        Y0(canvas);
        canvas.restore();
    }

    public int e1() {
        return this.y0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.v0.e().getTextSize(), this.A0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.y0 * 2) + f1(), this.z0);
    }

    public void h1(@c2 int i) {
        this.B0 = i;
        invalidateSelf();
    }

    public void i1(@c2 int i) {
        this.A0 = i;
        invalidateSelf();
    }

    public void j1(@c2 int i) {
        this.z0 = i;
        invalidateSelf();
    }

    public void k1(@z1 View view) {
        if (view == null) {
            return;
        }
        r1(view);
        view.addOnLayoutChangeListener(this.w0);
    }

    public void l1(@g1(from = 0.0d, to = 1.0d) float f) {
        this.H0 = 1.2f;
        this.E0 = f;
        this.F0 = f;
        this.I0 = ha2.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void m1(@z1 CharSequence charSequence) {
        if (TextUtils.equals(this.Y, charSequence)) {
            return;
        }
        this.Y = charSequence;
        this.v0.j(true);
        invalidateSelf();
    }

    public void n1(@z1 tg2 tg2Var) {
        this.v0.i(tg2Var, this.Z);
    }

    public void o1(@m2 int i) {
        n1(new tg2(this.Z, i));
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable, com.p7700g.p99005.ze2.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@c2 int i) {
        this.y0 = i;
        invalidateSelf();
    }

    public void q1(@l2 int i) {
        m1(this.Z.getResources().getString(i));
    }
}