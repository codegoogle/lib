package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.ze2;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable.java */
/* loaded from: classes.dex */
public class ob2 extends lh2 implements lk, Drawable.Callback, ze2.b {
    private static final boolean W = false;
    private static final String Y = "http://schemas.android.com/apk/res-auto";
    private static final int Z = 24;
    private float A0;
    @x1
    private WeakReference<a> A1;
    @z1
    private ColorStateList B0;
    private TextUtils.TruncateAt B1;
    @z1
    private CharSequence C0;
    private boolean C1;
    private boolean D0;
    private int D1;
    @z1
    private Drawable E0;
    private boolean E1;
    @z1
    private ColorStateList F0;
    private float G0;
    private boolean H0;
    private boolean I0;
    @z1
    private Drawable J0;
    @z1
    private Drawable K0;
    @z1
    private ColorStateList L0;
    private float M0;
    @z1
    private CharSequence N0;
    private boolean O0;
    private boolean P0;
    @z1
    private Drawable Q0;
    @z1
    private ColorStateList R0;
    @z1
    private oa2 S0;
    @z1
    private oa2 T0;
    private float U0;
    private float V0;
    private float W0;
    private float X0;
    private float Y0;
    private float Z0;
    private float a1;
    private float b1;
    @x1
    private final Context c1;
    private final Paint d1;
    @z1
    private final Paint e1;
    private final Paint.FontMetrics f1;
    private final RectF g1;
    private final PointF h1;
    private final Path i1;
    @x1
    private final ze2 j1;
    @w0
    private int k1;
    @w0
    private int l1;
    @w0
    private int m1;
    @w0
    private int n1;
    @w0
    private int o1;
    @w0
    private int p1;
    private boolean q1;
    @w0
    private int r1;
    private int s1;
    @z1
    private ColorFilter t1;
    @z1
    private PorterDuffColorFilter u1;
    @z1
    private ColorStateList v0;
    @z1
    private ColorStateList v1;
    @z1
    private ColorStateList w0;
    @z1
    private PorterDuff.Mode w1;
    private float x0;
    private int[] x1;
    private float y0;
    private boolean y1;
    @z1
    private ColorStateList z0;
    @z1
    private ColorStateList z1;
    private static final int[] X = {16842910};
    private static final ShapeDrawable u0 = new ShapeDrawable(new OvalShape());

    /* compiled from: ChipDrawable.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private ob2(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(context, attributeSet, i, i2);
        this.y0 = -1.0f;
        this.d1 = new Paint(1);
        this.f1 = new Paint.FontMetrics();
        this.g1 = new RectF();
        this.h1 = new PointF();
        this.i1 = new Path();
        this.s1 = 255;
        this.w1 = PorterDuff.Mode.SRC_IN;
        this.A1 = new WeakReference<>(null);
        Z(context);
        this.c1 = context;
        ze2 ze2Var = new ze2(this);
        this.j1 = ze2Var;
        this.C0 = "";
        ze2Var.e().density = context.getResources().getDisplayMetrics().density;
        this.e1 = null;
        int[] iArr = X;
        setState(iArr);
        f3(iArr);
        this.C1 = true;
        if (yg2.a) {
            u0.setTint(-1);
        }
    }

    private float G1() {
        Drawable drawable = this.q1 ? this.Q0 : this.E0;
        float f = this.G0;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(kf2.e(this.c1, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    private float H1() {
        Drawable drawable = this.q1 ? this.Q0 : this.E0;
        float f = this.G0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private boolean L3() {
        return this.P0 && this.Q0 != null && this.q1;
    }

    private boolean M3() {
        return this.D0 && this.E0 != null;
    }

    private boolean N3() {
        return this.I0 && this.J0 != null;
    }

    private void O3(@z1 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void P0(@z1 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        fk.m(drawable, fk.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.J0) {
            if (drawable.isStateful()) {
                drawable.setState(D1());
            }
            fk.o(drawable, this.L0);
            return;
        }
        Drawable drawable2 = this.E0;
        if (drawable == drawable2 && this.H0) {
            fk.o(drawable2, this.F0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void P3() {
        this.z1 = this.y1 ? yg2.d(this.B0) : null;
    }

    private void Q0(@x1 Rect rect, @x1 RectF rectF) {
        rectF.setEmpty();
        if (M3() || L3()) {
            float f = this.U0 + this.V0;
            float H1 = H1();
            if (fk.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + H1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - H1;
            }
            float G1 = G1();
            float exactCenterY = rect.exactCenterY() - (G1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + G1;
        }
    }

    @TargetApi(21)
    private void Q3() {
        this.K0 = new RippleDrawable(yg2.d(N1()), this.J0, u0);
    }

    private void S0(@x1 Rect rect, @x1 RectF rectF) {
        rectF.set(rect);
        if (N3()) {
            float f = this.b1 + this.a1 + this.M0 + this.Z0 + this.Y0;
            if (fk.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private void T0(@x1 Rect rect, @x1 RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f = this.b1 + this.a1;
            if (fk.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.M0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.M0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.M0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    @z1
    private ColorFilter T1() {
        ColorFilter colorFilter = this.t1;
        return colorFilter != null ? colorFilter : this.u1;
    }

    private void T2(@z1 ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            onStateChange(getState());
        }
    }

    private void U0(@x1 Rect rect, @x1 RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f = this.b1 + this.a1 + this.M0 + this.Z0 + this.Y0;
            if (fk.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean V1(@z1 int[] iArr, @q0 int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void W0(@x1 Rect rect, @x1 RectF rectF) {
        rectF.setEmpty();
        if (this.C0 != null) {
            float R0 = R0() + this.U0 + this.X0;
            float V0 = V0() + this.b1 + this.Y0;
            if (fk.f(this) == 0) {
                rectF.left = rect.left + R0;
                rectF.right = rect.right - V0;
            } else {
                rectF.left = rect.left + V0;
                rectF.right = rect.right - R0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float X0() {
        this.j1.e().getFontMetrics(this.f1);
        Paint.FontMetrics fontMetrics = this.f1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean Z0() {
        return this.P0 && this.Q0 != null && this.O0;
    }

    @x1
    public static ob2 a1(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        ob2 ob2Var = new ob2(context, attributeSet, i, i2);
        ob2Var.i2(attributeSet, i, i2);
        return ob2Var;
    }

    @x1
    public static ob2 b1(@x1 Context context, @t2 int i) {
        AttributeSet a2 = td2.a(context, i, "chip");
        int styleAttribute = a2.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = ga2.n.Dh;
        }
        return a1(context, a2, ga2.c.a2, styleAttribute);
    }

    private void c1(@x1 Canvas canvas, @x1 Rect rect) {
        if (L3()) {
            Q0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.Q0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            this.Q0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void d1(@x1 Canvas canvas, @x1 Rect rect) {
        if (this.E1) {
            return;
        }
        this.d1.setColor(this.l1);
        this.d1.setStyle(Paint.Style.FILL);
        this.d1.setColorFilter(T1());
        this.g1.set(rect);
        canvas.drawRoundRect(this.g1, o1(), o1(), this.d1);
    }

    private void e1(@x1 Canvas canvas, @x1 Rect rect) {
        if (M3()) {
            Q0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.E0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            this.E0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void f1(@x1 Canvas canvas, @x1 Rect rect) {
        if (this.A0 <= 0.0f || this.E1) {
            return;
        }
        this.d1.setColor(this.n1);
        this.d1.setStyle(Paint.Style.STROKE);
        if (!this.E1) {
            this.d1.setColorFilter(T1());
        }
        RectF rectF = this.g1;
        float f = this.A0;
        rectF.set((f / 2.0f) + rect.left, (f / 2.0f) + rect.top, rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.y0 - (this.A0 / 2.0f);
        canvas.drawRoundRect(this.g1, f2, f2, this.d1);
    }

    private static boolean f2(@z1 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void g1(@x1 Canvas canvas, @x1 Rect rect) {
        if (this.E1) {
            return;
        }
        this.d1.setColor(this.k1);
        this.d1.setStyle(Paint.Style.FILL);
        this.g1.set(rect);
        canvas.drawRoundRect(this.g1, o1(), o1(), this.d1);
    }

    private static boolean g2(@z1 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void h1(@x1 Canvas canvas, @x1 Rect rect) {
        if (N3()) {
            T0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.J0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            if (yg2.a) {
                this.K0.setBounds(this.J0.getBounds());
                this.K0.jumpToCurrentState();
                this.K0.draw(canvas);
            } else {
                this.J0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private static boolean h2(@z1 tg2 tg2Var) {
        return (tg2Var == null || tg2Var.i() == null || !tg2Var.i().isStateful()) ? false : true;
    }

    private void i1(@x1 Canvas canvas, @x1 Rect rect) {
        this.d1.setColor(this.o1);
        this.d1.setStyle(Paint.Style.FILL);
        this.g1.set(rect);
        if (!this.E1) {
            canvas.drawRoundRect(this.g1, o1(), o1(), this.d1);
            return;
        }
        h(new RectF(rect), this.i1);
        super.q(canvas, this.d1, this.i1, v());
    }

    private void i2(@z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        TypedArray j = cf2.j(this.c1, attributeSet, ga2.o.w5, i, i2, new int[0]);
        this.E1 = j.hasValue(ga2.o.i6);
        T2(sg2.a(this.c1, j, ga2.o.V5));
        v2(sg2.a(this.c1, j, ga2.o.I5));
        L2(j.getDimension(ga2.o.Q5, 0.0f));
        int i3 = ga2.o.J5;
        if (j.hasValue(i3)) {
            x2(j.getDimension(i3, 0.0f));
        }
        P2(sg2.a(this.c1, j, ga2.o.T5));
        R2(j.getDimension(ga2.o.U5, 0.0f));
        t3(sg2.a(this.c1, j, ga2.o.h6));
        y3(j.getText(ga2.o.C5));
        tg2 g = sg2.g(this.c1, j, ga2.o.x5);
        g.l(j.getDimension(ga2.o.y5, g.j()));
        if (Build.VERSION.SDK_INT < 23) {
            g.k(sg2.a(this.c1, j, ga2.o.z5));
        }
        z3(g);
        int i4 = j.getInt(ga2.o.A5, 0);
        if (i4 == 1) {
            l3(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            l3(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            l3(TextUtils.TruncateAt.END);
        }
        K2(j.getBoolean(ga2.o.P5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(Y, "chipIconEnabled") != null && attributeSet.getAttributeValue(Y, "chipIconVisible") == null) {
            K2(j.getBoolean(ga2.o.M5, false));
        }
        B2(sg2.e(this.c1, j, ga2.o.L5));
        int i5 = ga2.o.O5;
        if (j.hasValue(i5)) {
            H2(sg2.a(this.c1, j, i5));
        }
        F2(j.getDimension(ga2.o.N5, -1.0f));
        j3(j.getBoolean(ga2.o.c6, false));
        if (attributeSet != null && attributeSet.getAttributeValue(Y, "closeIconEnabled") != null && attributeSet.getAttributeValue(Y, "closeIconVisible") == null) {
            j3(j.getBoolean(ga2.o.X5, false));
        }
        U2(sg2.e(this.c1, j, ga2.o.W5));
        g3(sg2.a(this.c1, j, ga2.o.b6));
        b3(j.getDimension(ga2.o.Z5, 0.0f));
        l2(j.getBoolean(ga2.o.D5, false));
        u2(j.getBoolean(ga2.o.H5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(Y, "checkedIconEnabled") != null && attributeSet.getAttributeValue(Y, "checkedIconVisible") == null) {
            u2(j.getBoolean(ga2.o.F5, false));
        }
        n2(sg2.e(this.c1, j, ga2.o.E5));
        int i6 = ga2.o.G5;
        if (j.hasValue(i6)) {
            r2(sg2.a(this.c1, j, i6));
        }
        w3(oa2.c(this.c1, j, ga2.o.k6));
        m3(oa2.c(this.c1, j, ga2.o.e6));
        N2(j.getDimension(ga2.o.S5, 0.0f));
        q3(j.getDimension(ga2.o.g6, 0.0f));
        o3(j.getDimension(ga2.o.f6, 0.0f));
        H3(j.getDimension(ga2.o.m6, 0.0f));
        D3(j.getDimension(ga2.o.l6, 0.0f));
        d3(j.getDimension(ga2.o.a6, 0.0f));
        Y2(j.getDimension(ga2.o.Y5, 0.0f));
        z2(j.getDimension(ga2.o.K5, 0.0f));
        s3(j.getDimensionPixelSize(ga2.o.B5, Integer.MAX_VALUE));
        j.recycle();
    }

    private void j1(@x1 Canvas canvas, @x1 Rect rect) {
        Paint paint = this.e1;
        if (paint != null) {
            paint.setColor(fj.B(sr.t, 127));
            canvas.drawRect(rect, this.e1);
            if (M3() || L3()) {
                Q0(rect, this.g1);
                canvas.drawRect(this.g1, this.e1);
            }
            if (this.C0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.e1);
            }
            if (N3()) {
                T0(rect, this.g1);
                canvas.drawRect(this.g1, this.e1);
            }
            this.e1.setColor(fj.B(tk.c, 127));
            S0(rect, this.g1);
            canvas.drawRect(this.g1, this.e1);
            this.e1.setColor(fj.B(-16711936, 127));
            U0(rect, this.g1);
            canvas.drawRect(this.g1, this.e1);
        }
    }

    private void k1(@x1 Canvas canvas, @x1 Rect rect) {
        if (this.C0 != null) {
            Paint.Align Y0 = Y0(rect, this.h1);
            W0(rect, this.g1);
            if (this.j1.d() != null) {
                this.j1.e().drawableState = getState();
                this.j1.k(this.c1);
            }
            this.j1.e().setTextAlign(Y0);
            int i = 0;
            boolean z = Math.round(this.j1.f(P1().toString())) > Math.round(this.g1.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.g1);
            }
            CharSequence charSequence = this.C0;
            if (z && this.B1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.j1.e(), this.g1.width(), this.B1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.h1;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.j1.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean k2(@x1 int[] iArr, @x1 int[] iArr2) {
        boolean z;
        int colorForState;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.v0;
        int l = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.k1) : 0);
        boolean z2 = true;
        if (this.k1 != l) {
            this.k1 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.w0;
        int l2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.l1) : 0);
        if (this.l1 != l2) {
            this.l1 = l2;
            onStateChange = true;
        }
        int l3 = kc2.l(l, l2);
        if ((this.m1 != l3) | (y() == null)) {
            this.m1 = l3;
            o0(ColorStateList.valueOf(l3));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.z0;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.n1) : 0;
        if (this.n1 != colorForState2) {
            this.n1 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.z1 == null || !yg2.e(iArr)) ? 0 : this.z1.getColorForState(iArr, this.o1);
        if (this.o1 != colorForState3) {
            this.o1 = colorForState3;
            if (this.y1) {
                onStateChange = true;
            }
        }
        int colorForState4 = (this.j1.d() == null || this.j1.d().i() == null) ? 0 : this.j1.d().i().getColorForState(iArr, this.p1);
        if (this.p1 != colorForState4) {
            this.p1 = colorForState4;
            onStateChange = true;
        }
        boolean z3 = V1(getState(), 16842912) && this.O0;
        if (this.q1 != z3 && this.Q0 != null) {
            float R0 = R0();
            this.q1 = z3;
            if (R0 != R0()) {
                onStateChange = true;
                z = true;
                ColorStateList colorStateList4 = this.v1;
                colorForState = colorStateList4 == null ? colorStateList4.getColorForState(iArr, this.r1) : 0;
                if (this.r1 == colorForState) {
                    this.r1 = colorForState;
                    this.u1 = td2.c(this, this.v1, this.w1);
                } else {
                    z2 = onStateChange;
                }
                if (g2(this.E0)) {
                    z2 |= this.E0.setState(iArr);
                }
                if (g2(this.Q0)) {
                    z2 |= this.Q0.setState(iArr);
                }
                if (g2(this.J0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z2 |= this.J0.setState(iArr3);
                }
                if (yg2.a && g2(this.K0)) {
                    z2 |= this.K0.setState(iArr2);
                }
                if (z2) {
                    invalidateSelf();
                }
                if (z) {
                    j2();
                }
                return z2;
            }
            onStateChange = true;
        }
        z = false;
        ColorStateList colorStateList42 = this.v1;
        if (colorStateList42 == null) {
        }
        if (this.r1 == colorForState) {
        }
        if (g2(this.E0)) {
        }
        if (g2(this.Q0)) {
        }
        if (g2(this.J0)) {
        }
        if (yg2.a) {
            z2 |= this.K0.setState(iArr2);
        }
        if (z2) {
        }
        if (z) {
        }
        return z2;
    }

    public float A1() {
        return this.a1;
    }

    public void A2(@a1 int i) {
        z2(this.c1.getResources().getDimension(i));
    }

    public void A3(@m2 int i) {
        z3(new tg2(this.c1, i));
    }

    public float B1() {
        return this.M0;
    }

    public void B2(@z1 Drawable drawable) {
        Drawable q1 = q1();
        if (q1 != drawable) {
            float R0 = R0();
            this.E0 = drawable != null ? fk.r(drawable).mutate() : null;
            float R02 = R0();
            O3(q1);
            if (M3()) {
                P0(this.E0);
            }
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    public void B3(@w0 int i) {
        C3(ColorStateList.valueOf(i));
    }

    public float C1() {
        return this.Z0;
    }

    @Deprecated
    public void C2(boolean z) {
        K2(z);
    }

    public void C3(@z1 ColorStateList colorStateList) {
        tg2 Q1 = Q1();
        if (Q1 != null) {
            Q1.k(colorStateList);
            invalidateSelf();
        }
    }

    @x1
    public int[] D1() {
        return this.x1;
    }

    @Deprecated
    public void D2(@s0 int i) {
        J2(i);
    }

    public void D3(float f) {
        if (this.Y0 != f) {
            this.Y0 = f;
            invalidateSelf();
            j2();
        }
    }

    @z1
    public ColorStateList E1() {
        return this.L0;
    }

    public void E2(@f1 int i) {
        B2(r3.b(this.c1, i));
    }

    public void E3(@a1 int i) {
        D3(this.c1.getResources().getDimension(i));
    }

    public void F1(@x1 RectF rectF) {
        U0(getBounds(), rectF);
    }

    public void F2(float f) {
        if (this.G0 != f) {
            float R0 = R0();
            this.G0 = f;
            float R02 = R0();
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    public void F3(@l2 int i) {
        y3(this.c1.getResources().getString(i));
    }

    public void G2(@a1 int i) {
        F2(this.c1.getResources().getDimension(i));
    }

    public void G3(@b1 float f) {
        tg2 Q1 = Q1();
        if (Q1 != null) {
            Q1.l(f);
            this.j1.e().setTextSize(f);
            a();
        }
    }

    public void H2(@z1 ColorStateList colorStateList) {
        this.H0 = true;
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (M3()) {
                fk.o(this.E0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H3(float f) {
        if (this.X0 != f) {
            this.X0 = f;
            invalidateSelf();
            j2();
        }
    }

    public TextUtils.TruncateAt I1() {
        return this.B1;
    }

    public void I2(@y0 int i) {
        H2(r3.a(this.c1, i));
    }

    public void I3(@a1 int i) {
        H3(this.c1.getResources().getDimension(i));
    }

    @z1
    public oa2 J1() {
        return this.T0;
    }

    public void J2(@s0 int i) {
        K2(this.c1.getResources().getBoolean(i));
    }

    public void J3(boolean z) {
        if (this.y1 != z) {
            this.y1 = z;
            P3();
            onStateChange(getState());
        }
    }

    public float K1() {
        return this.W0;
    }

    public void K2(boolean z) {
        if (this.D0 != z) {
            boolean M3 = M3();
            this.D0 = z;
            boolean M32 = M3();
            if (M3 != M32) {
                if (M32) {
                    P0(this.E0);
                } else {
                    O3(this.E0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public boolean K3() {
        return this.C1;
    }

    public float L1() {
        return this.V0;
    }

    public void L2(float f) {
        if (this.x0 != f) {
            this.x0 = f;
            invalidateSelf();
            j2();
        }
    }

    @c2
    public int M1() {
        return this.D1;
    }

    public void M2(@a1 int i) {
        L2(this.c1.getResources().getDimension(i));
    }

    @z1
    public ColorStateList N1() {
        return this.B0;
    }

    public void N2(float f) {
        if (this.U0 != f) {
            this.U0 = f;
            invalidateSelf();
            j2();
        }
    }

    @z1
    public oa2 O1() {
        return this.S0;
    }

    public void O2(@a1 int i) {
        N2(this.c1.getResources().getDimension(i));
    }

    @z1
    public CharSequence P1() {
        return this.C0;
    }

    public void P2(@z1 ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            if (this.E1) {
                F0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @z1
    public tg2 Q1() {
        return this.j1.d();
    }

    public void Q2(@y0 int i) {
        P2(r3.a(this.c1, i));
    }

    public float R0() {
        if (M3() || L3()) {
            return this.V0 + H1() + this.W0;
        }
        return 0.0f;
    }

    public float R1() {
        return this.Y0;
    }

    public void R2(float f) {
        if (this.A0 != f) {
            this.A0 = f;
            this.d1.setStrokeWidth(f);
            if (this.E1) {
                super.I0(f);
            }
            invalidateSelf();
        }
    }

    public float S1() {
        return this.X0;
    }

    public void S2(@a1 int i) {
        R2(this.c1.getResources().getDimension(i));
    }

    public boolean U1() {
        return this.y1;
    }

    public void U2(@z1 Drawable drawable) {
        Drawable y1 = y1();
        if (y1 != drawable) {
            float V0 = V0();
            this.J0 = drawable != null ? fk.r(drawable).mutate() : null;
            if (yg2.a) {
                Q3();
            }
            float V02 = V0();
            O3(y1);
            if (N3()) {
                P0(this.J0);
            }
            invalidateSelf();
            if (V0 != V02) {
                j2();
            }
        }
    }

    public float V0() {
        if (N3()) {
            return this.Z0 + this.M0 + this.a1;
        }
        return 0.0f;
    }

    public void V2(@z1 CharSequence charSequence) {
        if (this.N0 != charSequence) {
            this.N0 = zn.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean W1() {
        return this.O0;
    }

    @Deprecated
    public void W2(boolean z) {
        j3(z);
    }

    @Deprecated
    public boolean X1() {
        return Y1();
    }

    @Deprecated
    public void X2(@s0 int i) {
        i3(i);
    }

    @x1
    public Paint.Align Y0(@x1 Rect rect, @x1 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.C0 != null) {
            float R0 = R0() + this.U0 + this.X0;
            if (fk.f(this) == 0) {
                pointF.x = rect.left + R0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - R0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - X0();
        }
        return align;
    }

    public boolean Y1() {
        return this.P0;
    }

    public void Y2(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Deprecated
    public boolean Z1() {
        return a2();
    }

    public void Z2(@a1 int i) {
        Y2(this.c1.getResources().getDimension(i));
    }

    @Override // com.p7700g.p99005.ze2.b
    public void a() {
        j2();
        invalidateSelf();
    }

    public boolean a2() {
        return this.D0;
    }

    public void a3(@f1 int i) {
        U2(r3.b(this.c1, i));
    }

    @Deprecated
    public boolean b2() {
        return d2();
    }

    public void b3(float f) {
        if (this.M0 != f) {
            this.M0 = f;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    public boolean c2() {
        return g2(this.J0);
    }

    public void c3(@a1 int i) {
        b3(this.c1.getResources().getDimension(i));
    }

    public boolean d2() {
        return this.I0;
    }

    public void d3(float f) {
        if (this.Z0 != f) {
            this.Z0 = f;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.s1;
        int a2 = i < 255 ? kb2.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        g1(canvas, bounds);
        d1(canvas, bounds);
        if (this.E1) {
            super.draw(canvas);
        }
        f1(canvas, bounds);
        i1(canvas, bounds);
        e1(canvas, bounds);
        c1(canvas, bounds);
        if (this.C1) {
            k1(canvas, bounds);
        }
        h1(canvas, bounds);
        j1(canvas, bounds);
        if (this.s1 < 255) {
            canvas.restoreToCount(a2);
        }
    }

    public boolean e2() {
        return this.E1;
    }

    public void e3(@a1 int i) {
        d3(this.c1.getResources().getDimension(i));
    }

    public boolean f3(@x1 int[] iArr) {
        if (Arrays.equals(this.x1, iArr)) {
            return false;
        }
        this.x1 = iArr;
        if (N3()) {
            return k2(getState(), iArr);
        }
        return false;
    }

    public void g3(@z1 ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            if (N3()) {
                fk.o(this.J0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s1;
    }

    @Override // android.graphics.drawable.Drawable
    @z1
    public ColorFilter getColorFilter() {
        return this.t1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(V0() + this.j1.f(P1().toString()) + R0() + this.U0 + this.X0 + this.Y0 + this.b1), this.D1);
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@x1 Outline outline) {
        if (this.E1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.y0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.y0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@y0 int i) {
        g3(r3.a(this.c1, i));
    }

    public void i3(@s0 int i) {
        j3(this.c1.getResources().getBoolean(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@x1 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return f2(this.v0) || f2(this.w0) || f2(this.z0) || (this.y1 && f2(this.z1)) || h2(this.j1.d()) || Z0() || g2(this.E0) || g2(this.Q0) || f2(this.v1);
    }

    public void j2() {
        a aVar = this.A1.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void j3(boolean z) {
        if (this.I0 != z) {
            boolean N3 = N3();
            this.I0 = z;
            boolean N32 = N3();
            if (N3 != N32) {
                if (N32) {
                    P0(this.J0);
                } else {
                    O3(this.J0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void k3(@z1 a aVar) {
        this.A1 = new WeakReference<>(aVar);
    }

    @z1
    public Drawable l1() {
        return this.Q0;
    }

    public void l2(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            float R0 = R0();
            if (!z && this.q1) {
                this.q1 = false;
            }
            float R02 = R0();
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    public void l3(@z1 TextUtils.TruncateAt truncateAt) {
        this.B1 = truncateAt;
    }

    @z1
    public ColorStateList m1() {
        return this.R0;
    }

    public void m2(@s0 int i) {
        l2(this.c1.getResources().getBoolean(i));
    }

    public void m3(@z1 oa2 oa2Var) {
        this.T0 = oa2Var;
    }

    @z1
    public ColorStateList n1() {
        return this.w0;
    }

    public void n2(@z1 Drawable drawable) {
        if (this.Q0 != drawable) {
            float R0 = R0();
            this.Q0 = drawable;
            float R02 = R0();
            O3(this.Q0);
            P0(this.Q0);
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    public void n3(@m0 int i) {
        m3(oa2.d(this.c1, i));
    }

    public float o1() {
        return this.E1 ? S() : this.y0;
    }

    @Deprecated
    public void o2(boolean z) {
        u2(z);
    }

    public void o3(float f) {
        if (this.W0 != f) {
            float R0 = R0();
            this.W0 = f;
            float R02 = R0();
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (M3()) {
            onLayoutDirectionChanged |= fk.m(this.E0, i);
        }
        if (L3()) {
            onLayoutDirectionChanged |= fk.m(this.Q0, i);
        }
        if (N3()) {
            onLayoutDirectionChanged |= fk.m(this.J0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (M3()) {
            onLevelChange |= this.E0.setLevel(i);
        }
        if (L3()) {
            onLevelChange |= this.Q0.setLevel(i);
        }
        if (N3()) {
            onLevelChange |= this.J0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable, com.p7700g.p99005.ze2.b
    public boolean onStateChange(@x1 int[] iArr) {
        if (this.E1) {
            super.onStateChange(iArr);
        }
        return k2(iArr, D1());
    }

    public float p1() {
        return this.b1;
    }

    @Deprecated
    public void p2(@s0 int i) {
        u2(this.c1.getResources().getBoolean(i));
    }

    public void p3(@a1 int i) {
        o3(this.c1.getResources().getDimension(i));
    }

    @z1
    public Drawable q1() {
        Drawable drawable = this.E0;
        if (drawable != null) {
            return fk.q(drawable);
        }
        return null;
    }

    public void q2(@f1 int i) {
        n2(r3.b(this.c1, i));
    }

    public void q3(float f) {
        if (this.V0 != f) {
            float R0 = R0();
            this.V0 = f;
            float R02 = R0();
            invalidateSelf();
            if (R0 != R02) {
                j2();
            }
        }
    }

    public float r1() {
        return this.G0;
    }

    public void r2(@z1 ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            if (Z0()) {
                fk.o(this.Q0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r3(@a1 int i) {
        q3(this.c1.getResources().getDimension(i));
    }

    @z1
    public ColorStateList s1() {
        return this.F0;
    }

    public void s2(@y0 int i) {
        r2(r3.a(this.c1, i));
    }

    public void s3(@c2 int i) {
        this.D1 = i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.s1 != i) {
            this.s1 = i;
            invalidateSelf();
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        if (this.t1 != colorFilter) {
            this.t1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(@z1 ColorStateList colorStateList) {
        if (this.v1 != colorStateList) {
            this.v1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.p7700g.p99005.lh2, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@x1 PorterDuff.Mode mode) {
        if (this.w1 != mode) {
            this.w1 = mode;
            this.u1 = td2.c(this, this.v1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (M3()) {
            visible |= this.E0.setVisible(z, z2);
        }
        if (L3()) {
            visible |= this.Q0.setVisible(z, z2);
        }
        if (N3()) {
            visible |= this.J0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.x0;
    }

    public void t2(@s0 int i) {
        u2(this.c1.getResources().getBoolean(i));
    }

    public void t3(@z1 ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            P3();
            onStateChange(getState());
        }
    }

    public float u1() {
        return this.U0;
    }

    public void u2(boolean z) {
        if (this.P0 != z) {
            boolean L3 = L3();
            this.P0 = z;
            boolean L32 = L3();
            if (L3 != L32) {
                if (L32) {
                    P0(this.Q0);
                } else {
                    O3(this.Q0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void u3(@y0 int i) {
        t3(r3.a(this.c1, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @z1
    public ColorStateList v1() {
        return this.z0;
    }

    public void v2(@z1 ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void v3(boolean z) {
        this.C1 = z;
    }

    public float w1() {
        return this.A0;
    }

    public void w2(@y0 int i) {
        v2(r3.a(this.c1, i));
    }

    public void w3(@z1 oa2 oa2Var) {
        this.S0 = oa2Var;
    }

    public void x1(@x1 RectF rectF) {
        S0(getBounds(), rectF);
    }

    @Deprecated
    public void x2(float f) {
        if (this.y0 != f) {
            this.y0 = f;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f));
        }
    }

    public void x3(@m0 int i) {
        w3(oa2.d(this.c1, i));
    }

    @z1
    public Drawable y1() {
        Drawable drawable = this.J0;
        if (drawable != null) {
            return fk.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void y2(@a1 int i) {
        x2(this.c1.getResources().getDimension(i));
    }

    public void y3(@z1 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.C0, charSequence)) {
            return;
        }
        this.C0 = charSequence;
        this.j1.j(true);
        invalidateSelf();
        j2();
    }

    @z1
    public CharSequence z1() {
        return this.N0;
    }

    public void z2(float f) {
        if (this.b1 != f) {
            this.b1 = f;
            invalidateSelf();
            j2();
        }
    }

    public void z3(@z1 tg2 tg2Var) {
        this.j1.i(tg2Var, this.c1);
    }
}