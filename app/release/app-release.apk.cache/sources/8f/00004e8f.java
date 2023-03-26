package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.rh2;
import com.p7700g.p99005.sh2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes3.dex */
public class lh2 extends Drawable implements lk, uh2 {
    private static final String s = lh2.class.getSimpleName();
    private static final float t = 0.75f;
    private static final float u = 0.25f;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    private static final Paint y;
    private final sh2.i[] A;
    private final sh2.i[] B;
    private final BitSet C;
    private boolean D;
    private final Matrix E;
    private final Path F;
    private final Path G;
    private final RectF H;
    private final RectF I;
    private final Region J;
    private final Region K;
    private qh2 L;
    private final Paint M;
    private final Paint N;
    private final ah2 O;
    @x1
    private final rh2.b P;
    private final rh2 Q;
    @z1
    private PorterDuffColorFilter R;
    @z1
    private PorterDuffColorFilter S;
    private int T;
    @x1
    private final RectF U;
    private boolean V;
    private d z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public class a implements rh2.b {
        public a() {
        }

        @Override // com.p7700g.p99005.rh2.b
        public void a(@x1 sh2 sh2Var, Matrix matrix, int i) {
            lh2.this.C.set(i, sh2Var.e());
            lh2.this.A[i] = sh2Var.f(matrix);
        }

        @Override // com.p7700g.p99005.rh2.b
        public void b(@x1 sh2 sh2Var, Matrix matrix, int i) {
            lh2.this.C.set(i + 4, sh2Var.e());
            lh2.this.B[i] = sh2Var.f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public class b implements qh2.c {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // com.p7700g.p99005.qh2.c
        @x1
        public fh2 a(@x1 fh2 fh2Var) {
            return fh2Var instanceof oh2 ? fh2Var : new dh2(this.a, fh2Var);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface c {
    }

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ lh2(d dVar, a aVar) {
        this(dVar);
    }

    private boolean M0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.z.d == null || color2 == (colorForState2 = this.z.d.getColorForState(iArr, (color2 = this.M.getColor())))) {
            z = false;
        } else {
            this.M.setColor(colorForState2);
            z = true;
        }
        if (this.z.e == null || color == (colorForState = this.z.e.getColorForState(iArr, (color = this.N.getColor())))) {
            return z;
        }
        this.N.setColor(colorForState);
        return true;
    }

    private boolean N0() {
        PorterDuffColorFilter porterDuffColorFilter = this.R;
        PorterDuffColorFilter porterDuffColorFilter2 = this.S;
        d dVar = this.z;
        this.R = k(dVar.g, dVar.h, this.M, true);
        d dVar2 = this.z;
        this.S = k(dVar2.f, dVar2.h, this.N, false);
        d dVar3 = this.z;
        if (dVar3.u) {
            this.O.d(dVar3.g.getColorForState(getState(), 0));
        }
        return (ep.a(porterDuffColorFilter, this.R) && ep.a(porterDuffColorFilter2, this.S)) ? false : true;
    }

    private float O() {
        if (Y()) {
            return this.N.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void O0() {
        float V = V();
        this.z.r = (int) Math.ceil(0.75f * V);
        this.z.s = (int) Math.ceil(V * 0.25f);
        N0();
        a0();
    }

    private boolean W() {
        d dVar = this.z;
        int i = dVar.q;
        return i != 1 && dVar.r > 0 && (i == 2 || j0());
    }

    private boolean X() {
        Paint.Style style = this.z.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Y() {
        Paint.Style style = this.z.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.N.getStrokeWidth() > 0.0f;
    }

    private void a0() {
        super.invalidateSelf();
    }

    @z1
    private PorterDuffColorFilter f(@x1 Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int l = l(color);
            this.T = l;
            if (l != color) {
                return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(@x1 RectF rectF, @x1 Path path) {
        h(rectF, path);
        if (this.z.j != 1.0f) {
            this.E.reset();
            Matrix matrix = this.E;
            float f = this.z.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.E);
        }
        path.computeBounds(this.U, true);
    }

    private void g0(@x1 Canvas canvas) {
        if (W()) {
            canvas.save();
            i0(canvas);
            if (!this.V) {
                o(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.U.width() - getBounds().width());
            int height = (int) (this.U.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap((this.z.r * 2) + ((int) this.U.width()) + width, (this.z.r * 2) + ((int) this.U.height()) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.z.r) - width;
                float f2 = (getBounds().top - this.z.r) - height;
                canvas2.translate(-f, -f2);
                o(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    private static int h0(int i, int i2) {
        return ((i2 + (i2 >>> 7)) * i) >>> 8;
    }

    private void i() {
        qh2 y2 = getShapeAppearanceModel().y(new b(-O()));
        this.L = y2;
        this.Q.d(y2, this.z.k, w(), this.G);
    }

    private void i0(@x1 Canvas canvas) {
        canvas.translate(I(), J());
    }

    @x1
    private PorterDuffColorFilter j(@x1 ColorStateList colorStateList, @x1 PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.T = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @x1
    private PorterDuffColorFilter k(@z1 ColorStateList colorStateList, @z1 PorterDuff.Mode mode, @x1 Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z);
        }
        return f(paint, z);
    }

    @x1
    public static lh2 m(Context context) {
        return n(context, 0.0f);
    }

    @x1
    public static lh2 n(Context context, float f) {
        int c2 = kc2.c(context, ga2.c.o3, lh2.class.getSimpleName());
        lh2 lh2Var = new lh2();
        lh2Var.Z(context);
        lh2Var.o0(ColorStateList.valueOf(c2));
        lh2Var.n0(f);
        return lh2Var;
    }

    private void o(@x1 Canvas canvas) {
        this.C.cardinality();
        if (this.z.s != 0) {
            canvas.drawPath(this.F, this.O.c());
        }
        for (int i = 0; i < 4; i++) {
            this.A[i].b(this.O, this.z.r, canvas);
            this.B[i].b(this.O, this.z.r, canvas);
        }
        if (this.V) {
            int I = I();
            int J = J();
            canvas.translate(-I, -J);
            canvas.drawPath(this.F, y);
            canvas.translate(I, J);
        }
    }

    private void p(@x1 Canvas canvas) {
        r(canvas, this.M, this.F, this.z.a, v());
    }

    private void r(@x1 Canvas canvas, @x1 Paint paint, @x1 Path path, @x1 qh2 qh2Var, @x1 RectF rectF) {
        if (qh2Var.u(rectF)) {
            float a2 = qh2Var.t().a(rectF) * this.z.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    @x1
    private RectF w() {
        this.I.set(v());
        float O = O();
        this.I.inset(O, O);
        return this.I;
    }

    public Paint.Style A() {
        return this.z.v;
    }

    @Deprecated
    public void A0(int i) {
        this.z.r = i;
    }

    public float B() {
        return this.z.n;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void B0(int i) {
        d dVar = this.z;
        if (dVar.s != i) {
            dVar.s = i;
            a0();
        }
    }

    @Deprecated
    public void C(int i, int i2, @x1 Path path) {
        h(new RectF(0.0f, 0.0f, i, i2), path);
    }

    @Deprecated
    public void C0(@x1 th2 th2Var) {
        setShapeAppearanceModel(th2Var);
    }

    @w0
    public int D() {
        return this.T;
    }

    public void D0(float f, @w0 int i) {
        I0(f);
        F0(ColorStateList.valueOf(i));
    }

    public float E() {
        return this.z.j;
    }

    public void E0(float f, @z1 ColorStateList colorStateList) {
        I0(f);
        F0(colorStateList);
    }

    public int F() {
        return this.z.t;
    }

    public void F0(@z1 ColorStateList colorStateList) {
        d dVar = this.z;
        if (dVar.e != colorStateList) {
            dVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public int G() {
        return this.z.q;
    }

    public void G0(@w0 int i) {
        H0(ColorStateList.valueOf(i));
    }

    @Deprecated
    public int H() {
        return (int) x();
    }

    public void H0(ColorStateList colorStateList) {
        this.z.f = colorStateList;
        N0();
        a0();
    }

    public int I() {
        d dVar = this.z;
        return (int) (Math.sin(Math.toRadians(dVar.t)) * dVar.s);
    }

    public void I0(float f) {
        this.z.l = f;
        invalidateSelf();
    }

    public int J() {
        d dVar = this.z;
        return (int) (Math.cos(Math.toRadians(dVar.t)) * dVar.s);
    }

    public void J0(float f) {
        d dVar = this.z;
        if (dVar.p != f) {
            dVar.p = f;
            O0();
        }
    }

    public int K() {
        return this.z.r;
    }

    public void K0(boolean z) {
        d dVar = this.z;
        if (dVar.u != z) {
            dVar.u = z;
            invalidateSelf();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int L() {
        return this.z.s;
    }

    public void L0(float f) {
        J0(f - x());
    }

    @z1
    @Deprecated
    public th2 M() {
        qh2 shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof th2) {
            return (th2) shapeAppearanceModel;
        }
        return null;
    }

    @z1
    public ColorStateList N() {
        return this.z.e;
    }

    @z1
    public ColorStateList P() {
        return this.z.f;
    }

    public float Q() {
        return this.z.l;
    }

    @z1
    public ColorStateList R() {
        return this.z.g;
    }

    public float S() {
        return this.z.a.r().a(v());
    }

    public float T() {
        return this.z.a.t().a(v());
    }

    public float U() {
        return this.z.p;
    }

    public float V() {
        return U() + x();
    }

    public void Z(Context context) {
        this.z.b = new ud2(context);
        O0();
    }

    public boolean b0() {
        ud2 ud2Var = this.z.b;
        return ud2Var != null && ud2Var.l();
    }

    public boolean c0() {
        return this.z.b != null;
    }

    public boolean d0(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        this.M.setColorFilter(this.R);
        int alpha = this.M.getAlpha();
        this.M.setAlpha(h0(alpha, this.z.m));
        this.N.setColorFilter(this.S);
        this.N.setStrokeWidth(this.z.l);
        int alpha2 = this.N.getAlpha();
        this.N.setAlpha(h0(alpha2, this.z.m));
        if (this.D) {
            i();
            g(v(), this.F);
            this.D = false;
        }
        g0(canvas);
        if (X()) {
            p(canvas);
        }
        if (Y()) {
            s(canvas);
        }
        this.M.setAlpha(alpha);
        this.N.setAlpha(alpha2);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean e0() {
        return this.z.a.u(v());
    }

    @Deprecated
    public boolean f0() {
        int i = this.z.q;
        return i == 0 || i == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.z.m;
    }

    @Override // android.graphics.drawable.Drawable
    @z1
    public Drawable.ConstantState getConstantState() {
        return this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@x1 Outline outline) {
        if (this.z.q == 2) {
            return;
        }
        if (e0()) {
            outline.setRoundRect(getBounds(), S() * this.z.k);
            return;
        }
        g(v(), this.F);
        if (this.F.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.F);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        Rect rect2 = this.z.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return this.z.a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.J.set(getBounds());
        g(v(), this.F);
        this.K.setPath(this.F, this.J);
        this.J.op(this.K, Region.Op.DIFFERENCE);
        return this.J;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public final void h(@x1 RectF rectF, @x1 Path path) {
        rh2 rh2Var = this.Q;
        d dVar = this.z;
        rh2Var.e(dVar.a, dVar.k, rectF, this.P, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.D = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.z.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.z.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.z.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.z.d) != null && colorStateList4.isStateful())));
    }

    public boolean j0() {
        return (e0() || this.F.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void k0(float f) {
        setShapeAppearanceModel(this.z.a.w(f));
    }

    @i2({i2.a.LIBRARY_GROUP})
    @w0
    public int l(@w0 int i) {
        float B = B() + V();
        ud2 ud2Var = this.z.b;
        return ud2Var != null ? ud2Var.e(i, B) : i;
    }

    public void l0(@x1 fh2 fh2Var) {
        setShapeAppearanceModel(this.z.a.x(fh2Var));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void m0(boolean z) {
        this.Q.n(z);
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable mutate() {
        this.z = new d(this.z);
        return this;
    }

    public void n0(float f) {
        d dVar = this.z;
        if (dVar.o != f) {
            dVar.o = f;
            O0();
        }
    }

    public void o0(@z1 ColorStateList colorStateList) {
        d dVar = this.z;
        if (dVar.d != colorStateList) {
            dVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.D = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.ze2.b
    public boolean onStateChange(int[] iArr) {
        boolean z = M0(iArr) || N0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p0(float f) {
        d dVar = this.z;
        if (dVar.k != f) {
            dVar.k = f;
            this.D = true;
            invalidateSelf();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void q(@x1 Canvas canvas, @x1 Paint paint, @x1 Path path, @x1 RectF rectF) {
        r(canvas, paint, path, this.z.a, rectF);
    }

    public void q0(int i, int i2, int i3, int i4) {
        d dVar = this.z;
        if (dVar.i == null) {
            dVar.i = new Rect();
        }
        this.z.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void r0(Paint.Style style) {
        this.z.v = style;
        a0();
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void s(@x1 Canvas canvas) {
        r(canvas, this.N, this.G, this.L, w());
    }

    public void s0(float f) {
        d dVar = this.z;
        if (dVar.n != f) {
            dVar.n = f;
            O0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@p1(from = 0, to = 255) int i) {
        d dVar = this.z;
        if (dVar.m != i) {
            dVar.m = i;
            a0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        this.z.c = colorFilter;
        a0();
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        this.z.a = qh2Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(@w0 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(@z1 ColorStateList colorStateList) {
        this.z.g = colorStateList;
        N0();
        a0();
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@z1 PorterDuff.Mode mode) {
        d dVar = this.z;
        if (dVar.h != mode) {
            dVar.h = mode;
            N0();
            a0();
        }
    }

    public float t() {
        return this.z.a.j().a(v());
    }

    public void t0(float f) {
        d dVar = this.z;
        if (dVar.j != f) {
            dVar.j = f;
            invalidateSelf();
        }
    }

    public float u() {
        return this.z.a.l().a(v());
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void u0(boolean z) {
        this.V = z;
    }

    @x1
    public RectF v() {
        this.H.set(getBounds());
        return this.H;
    }

    public void v0(int i) {
        this.O.d(i);
        this.z.u = false;
        a0();
    }

    public void w0(int i) {
        d dVar = this.z;
        if (dVar.t != i) {
            dVar.t = i;
            a0();
        }
    }

    public float x() {
        return this.z.o;
    }

    public void x0(int i) {
        d dVar = this.z;
        if (dVar.q != i) {
            dVar.q = i;
            a0();
        }
    }

    @z1
    public ColorStateList y() {
        return this.z.d;
    }

    @Deprecated
    public void y0(int i) {
        n0(i);
    }

    public float z() {
        return this.z.k;
    }

    @Deprecated
    public void z0(boolean z) {
        x0(!z ? 1 : 0);
    }

    public lh2() {
        this(new qh2());
    }

    public lh2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        this(qh2.e(context, attributeSet, i, i2).m());
    }

    @Deprecated
    public lh2(@x1 th2 th2Var) {
        this((qh2) th2Var);
    }

    public lh2(@x1 qh2 qh2Var) {
        this(new d(qh2Var, null));
    }

    private lh2(@x1 d dVar) {
        rh2 rh2Var;
        this.A = new sh2.i[4];
        this.B = new sh2.i[4];
        this.C = new BitSet(8);
        this.E = new Matrix();
        this.F = new Path();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Region();
        this.K = new Region();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.O = new ah2();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            rh2Var = rh2.k();
        } else {
            rh2Var = new rh2();
        }
        this.Q = rh2Var;
        this.U = new RectF();
        this.V = true;
        this.z = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        N0();
        M0(getState());
        this.P = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public static final class d extends Drawable.ConstantState {
        @x1
        public qh2 a;
        @z1
        public ud2 b;
        @z1
        public ColorFilter c;
        @z1
        public ColorStateList d;
        @z1
        public ColorStateList e;
        @z1
        public ColorStateList f;
        @z1
        public ColorStateList g;
        @z1
        public PorterDuff.Mode h;
        @z1
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public d(qh2 qh2Var, ud2 ud2Var) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = qh2Var;
            this.b = ud2Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            lh2 lh2Var = new lh2(this, null);
            lh2Var.D = true;
            return lh2Var;
        }

        public d(@x1 d dVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = dVar.a;
            this.b = dVar.b;
            this.l = dVar.l;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.h = dVar.h;
            this.g = dVar.g;
            this.m = dVar.m;
            this.j = dVar.j;
            this.s = dVar.s;
            this.q = dVar.q;
            this.u = dVar.u;
            this.k = dVar.k;
            this.n = dVar.n;
            this.o = dVar.o;
            this.p = dVar.p;
            this.r = dVar.r;
            this.t = dVar.t;
            this.f = dVar.f;
            this.v = dVar.v;
            if (dVar.i != null) {
                this.i = new Rect(dVar.i);
            }
        }
    }
}