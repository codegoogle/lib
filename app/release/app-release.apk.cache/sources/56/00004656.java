package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.qg2;
import com.p7700g.p99005.ye2;

/* compiled from: CollapsingTextHelper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class he2 {
    private static final String b = "CollapsingTextHelper";
    private static final String c = "…";
    private static final float d = 0.5f;
    private static final boolean e = false;
    private float A;
    private float B;
    private float C;
    private Typeface D;
    private Typeface E;
    private Typeface F;
    private Typeface G;
    private Typeface H;
    private Typeface I;
    private Typeface J;
    private qg2 K;
    private qg2 L;
    @z1
    private CharSequence M;
    @z1
    private CharSequence N;
    private boolean O;
    private boolean Q;
    @z1
    private Bitmap R;
    private Paint S;
    private float T;
    private float U;
    private float V;
    private float W;
    private float X;
    private int Y;
    private int[] Z;
    private boolean a0;
    @x1
    private final TextPaint b0;
    @x1
    private final TextPaint c0;
    private TimeInterpolator d0;
    private TimeInterpolator e0;
    private float f0;
    private final View g;
    private float g0;
    private boolean h;
    private float h0;
    private float i;
    private ColorStateList i0;
    private boolean j;
    private float j0;
    private float k;
    private float k0;
    private float l;
    private float l0;
    private int m;
    private ColorStateList m0;
    @x1
    private final Rect n;
    private float n0;
    @x1
    private final Rect o;
    private float o0;
    @x1
    private final RectF p;
    private float p0;
    private StaticLayout q0;
    private float r0;
    private float s0;
    private float t0;
    private ColorStateList u;
    private CharSequence u0;
    private ColorStateList v;
    private int w;
    private float x;
    private float y;
    private float z;
    private static final boolean a = false;
    @x1
    private static final Paint f = null;
    private int q = 16;
    private int r = 16;
    private float s = 15.0f;
    private float t = 15.0f;
    private boolean P = true;
    private int v0 = 1;
    private float w0 = 0.0f;
    private float x0 = 1.0f;
    private int y0 = ye2.a;

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes3.dex */
    public class a implements qg2.a {
        public a() {
        }

        @Override // com.p7700g.p99005.qg2.a
        public void a(Typeface typeface) {
            he2.this.m0(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes3.dex */
    public class b implements qg2.a {
        public b() {
        }

        @Override // com.p7700g.p99005.qg2.a
        public void a(Typeface typeface) {
            he2.this.x0(typeface);
        }
    }

    static {
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public he2(View view) {
        this.g = view;
        TextPaint textPaint = new TextPaint(129);
        this.b0 = textPaint;
        this.c0 = new TextPaint(textPaint);
        this.o = new Rect();
        this.n = new Rect();
        this.p = new RectF();
        this.l = e();
        Z(view.getContext().getResources().getConfiguration());
    }

    private void D0(float f2) {
        h(f2);
        boolean z = a && this.T != 1.0f;
        this.Q = z;
        if (z) {
            n();
        }
        sr.m1(this.g);
    }

    private Layout.Alignment N() {
        int d2 = nq.d(this.q, this.O ? 1 : 0) & 7;
        if (d2 != 1) {
            return d2 != 5 ? this.O ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.O ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private boolean N0() {
        return this.v0 > 1 && (!this.O || this.j) && !this.Q;
    }

    private void Q(@x1 TextPaint textPaint) {
        textPaint.setTextSize(this.t);
        textPaint.setTypeface(this.D);
        textPaint.setLetterSpacing(this.n0);
    }

    private void R(@x1 TextPaint textPaint) {
        textPaint.setTextSize(this.s);
        textPaint.setTypeface(this.G);
        textPaint.setLetterSpacing(this.o0);
    }

    private void S(float f2) {
        if (this.j) {
            this.p.set(f2 < this.l ? this.n : this.o);
            return;
        }
        this.p.left = Y(this.n.left, this.o.left, f2, this.d0);
        this.p.top = Y(this.x, this.y, f2, this.d0);
        this.p.right = Y(this.n.right, this.o.right, f2, this.d0);
        this.p.bottom = Y(this.n.bottom, this.o.bottom, f2, this.d0);
    }

    private static boolean T(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-5f;
    }

    private boolean U() {
        return sr.Y(this.g) == 1;
    }

    private boolean X(@x1 CharSequence charSequence, boolean z) {
        ko koVar;
        if (z) {
            koVar = lo.d;
        } else {
            koVar = lo.c;
        }
        return koVar.b(charSequence, 0, charSequence.length());
    }

    private static float Y(float f2, float f3, float f4, @z1 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return ha2.a(f2, f3, f4);
    }

    @w0
    private static int a(@w0 int i, @w0 int i2, @g1(from = 0.0d, to = 1.0d) float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    private float a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void b(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        i(1.0f, z);
        CharSequence charSequence = this.N;
        if (charSequence != null && (staticLayout2 = this.q0) != null) {
            this.u0 = TextUtils.ellipsize(charSequence, this.b0, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.u0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.r0 = a0(this.b0, charSequence2);
        } else {
            this.r0 = 0.0f;
        }
        int d2 = nq.d(this.r, this.O ? 1 : 0);
        int i = d2 & 112;
        if (i == 48) {
            this.y = this.o.top;
        } else if (i != 80) {
            this.y = this.o.centerY() - ((this.b0.descent() - this.b0.ascent()) / 2.0f);
        } else {
            this.y = this.b0.ascent() + this.o.bottom;
        }
        int i2 = d2 & nq.d;
        if (i2 == 1) {
            this.A = this.o.centerX() - (this.r0 / 2.0f);
        } else if (i2 != 5) {
            this.A = this.o.left;
        } else {
            this.A = this.o.right - this.r0;
        }
        i(0.0f, z);
        float height = this.q0 != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.q0;
        if (staticLayout3 != null && this.v0 > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.N;
            if (charSequence3 != null) {
                f2 = a0(this.b0, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.q0;
        this.w = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int d3 = nq.d(this.q, this.O ? 1 : 0);
        int i3 = d3 & 112;
        if (i3 == 48) {
            this.x = this.n.top;
        } else if (i3 != 80) {
            this.x = this.n.centerY() - (height / 2.0f);
        } else {
            this.x = this.b0.descent() + (this.n.bottom - height);
        }
        int i4 = d3 & nq.d;
        if (i4 == 1) {
            this.z = this.n.centerX() - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.z = this.n.left;
        } else {
            this.z = this.n.right - f2;
        }
        j();
        D0(this.i);
    }

    private void c() {
        g(this.i);
    }

    private float d(@g1(from = 0.0d, to = 1.0d) float f2) {
        float f3 = this.l;
        if (f2 <= f3) {
            return ha2.b(1.0f, 0.0f, this.k, f3, f2);
        }
        return ha2.b(0.0f, 1.0f, f3, 1.0f, f2);
    }

    private float e() {
        float f2 = this.k;
        return wo1.a(1.0f, f2, 0.5f, f2);
    }

    private static boolean e0(@x1 Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private boolean f(@x1 CharSequence charSequence) {
        boolean U = U();
        return this.P ? X(charSequence, U) : U;
    }

    private void g(float f2) {
        float f3;
        S(f2);
        if (this.j) {
            if (f2 < this.l) {
                this.B = this.z;
                this.C = this.x;
                D0(0.0f);
                f3 = 0.0f;
            } else {
                this.B = this.A;
                this.C = this.y - Math.max(0, this.m);
                D0(1.0f);
                f3 = 1.0f;
            }
        } else {
            this.B = Y(this.z, this.A, f2, this.d0);
            this.C = Y(this.x, this.y, f2, this.d0);
            D0(f2);
            f3 = f2;
        }
        TimeInterpolator timeInterpolator = ha2.b;
        i0(1.0f - Y(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        t0(Y(1.0f, 0.0f, f2, timeInterpolator));
        if (this.v != this.u) {
            this.b0.setColor(a(y(), w(), f3));
        } else {
            this.b0.setColor(w());
        }
        float f4 = this.n0;
        float f5 = this.o0;
        if (f4 != f5) {
            this.b0.setLetterSpacing(Y(f5, f4, f2, timeInterpolator));
        } else {
            this.b0.setLetterSpacing(f4);
        }
        this.V = Y(this.j0, this.f0, f2, null);
        this.W = Y(this.k0, this.g0, f2, null);
        this.X = Y(this.l0, this.h0, f2, null);
        int a2 = a(x(this.m0), x(this.i0), f2);
        this.Y = a2;
        this.b0.setShadowLayer(this.V, this.W, this.X, a2);
        if (this.j) {
            int alpha = this.b0.getAlpha();
            this.b0.setAlpha((int) (d(f2) * alpha));
        }
        sr.m1(this.g);
    }

    private void h(float f2) {
        i(f2, false);
    }

    private void i(float f2, boolean z) {
        boolean z2;
        float f3;
        float f4;
        boolean z3;
        if (this.M == null) {
            return;
        }
        float width = this.o.width();
        float width2 = this.n.width();
        if (T(f2, 1.0f)) {
            f3 = this.t;
            f4 = this.n0;
            this.T = 1.0f;
            Typeface typeface = this.J;
            Typeface typeface2 = this.D;
            if (typeface != typeface2) {
                this.J = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f5 = this.s;
            float f6 = this.o0;
            Typeface typeface3 = this.J;
            Typeface typeface4 = this.G;
            if (typeface3 != typeface4) {
                this.J = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (T(f2, 0.0f)) {
                this.T = 1.0f;
            } else {
                this.T = Y(this.s, this.t, f2, this.e0) / this.s;
            }
            float f7 = this.t / this.s;
            width = (!z && width2 * f7 > width) ? Math.min(width / f7, width2) : width2;
            f3 = f5;
            f4 = f6;
            z3 = z2;
        }
        if (width > 0.0f) {
            z3 = ((this.U > f3 ? 1 : (this.U == f3 ? 0 : -1)) != 0) || ((this.p0 > f4 ? 1 : (this.p0 == f4 ? 0 : -1)) != 0) || this.a0 || z3;
            this.U = f3;
            this.p0 = f4;
            this.a0 = false;
        }
        if (this.N == null || z3) {
            this.b0.setTextSize(this.U);
            this.b0.setTypeface(this.J);
            this.b0.setLetterSpacing(this.p0);
            this.b0.setLinearText(this.T != 1.0f);
            this.O = f(this.M);
            StaticLayout k = k(N0() ? this.v0 : 1, width, this.O);
            this.q0 = k;
            this.N = k.getText();
        }
    }

    private void i0(float f2) {
        this.s0 = f2;
        sr.m1(this.g);
    }

    private void j() {
        Bitmap bitmap = this.R;
        if (bitmap != null) {
            bitmap.recycle();
            this.R = null;
        }
    }

    private StaticLayout k(int i, float f2, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = ye2.c(this.M, this.b0, (int) f2).e(TextUtils.TruncateAt.END).i(z).d(i == 1 ? Layout.Alignment.ALIGN_NORMAL : N()).h(false).k(i).j(this.w0, this.x0).g(this.y0).a();
        } catch (ye2.a e2) {
            e2.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) jp.l(staticLayout);
    }

    private void m(@x1 Canvas canvas, float f2, float f3) {
        int alpha = this.b0.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.b0.setAlpha((int) (this.t0 * f4));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.b0;
            textPaint.setShadowLayer(this.V, this.W, this.X, kc2.a(this.Y, textPaint.getAlpha()));
        }
        this.q0.draw(canvas);
        this.b0.setAlpha((int) (this.s0 * f4));
        if (i >= 31) {
            TextPaint textPaint2 = this.b0;
            textPaint2.setShadowLayer(this.V, this.W, this.X, kc2.a(this.Y, textPaint2.getAlpha()));
        }
        int lineBaseline = this.q0.getLineBaseline(0);
        CharSequence charSequence = this.u0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.b0);
        if (i >= 31) {
            this.b0.setShadowLayer(this.V, this.W, this.X, this.Y);
        }
        if (this.j) {
            return;
        }
        String trim = this.u0.toString().trim();
        if (trim.endsWith(c)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.b0.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.q0.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.b0);
    }

    private void n() {
        if (this.R != null || this.n.isEmpty() || TextUtils.isEmpty(this.N)) {
            return;
        }
        g(0.0f);
        int width = this.q0.getWidth();
        int height = this.q0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.R = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.q0.draw(new Canvas(this.R));
        if (this.S == null) {
            this.S = new Paint(3);
        }
    }

    private boolean n0(Typeface typeface) {
        qg2 qg2Var = this.L;
        if (qg2Var != null) {
            qg2Var.c();
        }
        if (this.F != typeface) {
            this.F = typeface;
            Typeface b2 = wg2.b(this.g.getContext().getResources().getConfiguration(), typeface);
            this.E = b2;
            if (b2 == null) {
                b2 = this.F;
            }
            this.D = b2;
            return true;
        }
        return false;
    }

    private float s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.r0 / 2.0f);
        }
        return ((i2 & nq.c) == 8388613 || (i2 & 5) == 5) ? this.O ? this.o.left : this.o.right - this.r0 : this.O ? this.o.right - this.r0 : this.o.left;
    }

    private float t(@x1 RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (this.r0 / 2.0f) + (i / 2.0f);
        }
        return ((i2 & nq.c) == 8388613 || (i2 & 5) == 5) ? this.O ? rectF.left + this.r0 : this.o.right : this.O ? this.o.right : rectF.left + this.r0;
    }

    private void t0(float f2) {
        this.t0 = f2;
        sr.m1(this.g);
    }

    @w0
    private int x(@z1 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.Z;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    @w0
    private int y() {
        return x(this.u);
    }

    private boolean y0(Typeface typeface) {
        qg2 qg2Var = this.K;
        if (qg2Var != null) {
            qg2Var.c();
        }
        if (this.I != typeface) {
            this.I = typeface;
            Typeface b2 = wg2.b(this.g.getContext().getResources().getConfiguration(), typeface);
            this.H = b2;
            if (b2 == null) {
                b2 = this.I;
            }
            this.G = b2;
            return true;
        }
        return false;
    }

    public ColorStateList A() {
        return this.u;
    }

    public void A0(boolean z) {
        this.j = z;
    }

    public float B() {
        R(this.c0);
        return this.c0.descent() + (-this.c0.ascent());
    }

    public void B0(float f2) {
        this.k = f2;
        this.l = e();
    }

    public int C() {
        return this.q;
    }

    @e2(23)
    public void C0(int i) {
        this.y0 = i;
    }

    public float D() {
        R(this.c0);
        return -this.c0.ascent();
    }

    public float E() {
        return this.s;
    }

    @e2(23)
    public void E0(float f2) {
        this.w0 = f2;
    }

    public Typeface F() {
        Typeface typeface = this.G;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @e2(23)
    public void F0(@g1(from = 0.0d) float f2) {
        this.x0 = f2;
    }

    public float G() {
        return this.i;
    }

    public void G0(int i) {
        if (i != this.v0) {
            this.v0 = i;
            j();
            c0();
        }
    }

    public float H() {
        return this.l;
    }

    public void H0(TimeInterpolator timeInterpolator) {
        this.d0 = timeInterpolator;
        c0();
    }

    @e2(23)
    public int I() {
        return this.y0;
    }

    public void I0(boolean z) {
        this.P = z;
    }

    public int J() {
        StaticLayout staticLayout = this.q0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean J0(int[] iArr) {
        this.Z = iArr;
        if (W()) {
            c0();
            return true;
        }
        return false;
    }

    @e2(23)
    public float K() {
        return this.q0.getSpacingAdd();
    }

    public void K0(@z1 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.M, charSequence)) {
            this.M = charSequence;
            this.N = null;
            j();
            c0();
        }
    }

    @e2(23)
    public float L() {
        return this.q0.getSpacingMultiplier();
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.e0 = timeInterpolator;
        c0();
    }

    public int M() {
        return this.v0;
    }

    public void M0(Typeface typeface) {
        boolean n0 = n0(typeface);
        boolean y0 = y0(typeface);
        if (n0 || y0) {
            c0();
        }
    }

    @z1
    public TimeInterpolator O() {
        return this.d0;
    }

    @z1
    public CharSequence P() {
        return this.M;
    }

    public boolean V() {
        return this.P;
    }

    public final boolean W() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.v;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.u) != null && colorStateList.isStateful());
    }

    public void Z(@x1 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.F;
            if (typeface != null) {
                this.E = wg2.b(configuration, typeface);
            }
            Typeface typeface2 = this.I;
            if (typeface2 != null) {
                this.H = wg2.b(configuration, typeface2);
            }
            Typeface typeface3 = this.E;
            if (typeface3 == null) {
                typeface3 = this.F;
            }
            this.D = typeface3;
            Typeface typeface4 = this.H;
            if (typeface4 == null) {
                typeface4 = this.I;
            }
            this.G = typeface4;
            d0(true);
        }
    }

    public void b0() {
        this.h = this.o.width() > 0 && this.o.height() > 0 && this.n.width() > 0 && this.n.height() > 0;
    }

    public void c0() {
        d0(false);
    }

    public void d0(boolean z) {
        if ((this.g.getHeight() <= 0 || this.g.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        c();
    }

    public void f0(int i, int i2, int i3, int i4) {
        if (e0(this.o, i, i2, i3, i4)) {
            return;
        }
        this.o.set(i, i2, i3, i4);
        this.a0 = true;
        b0();
    }

    public void g0(@x1 Rect rect) {
        f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void h0(int i) {
        tg2 tg2Var = new tg2(this.g.getContext(), i);
        if (tg2Var.i() != null) {
            this.v = tg2Var.i();
        }
        if (tg2Var.j() != 0.0f) {
            this.t = tg2Var.j();
        }
        ColorStateList colorStateList = tg2Var.g;
        if (colorStateList != null) {
            this.i0 = colorStateList;
        }
        this.g0 = tg2Var.l;
        this.h0 = tg2Var.m;
        this.f0 = tg2Var.n;
        this.n0 = tg2Var.p;
        qg2 qg2Var = this.L;
        if (qg2Var != null) {
            qg2Var.c();
        }
        this.L = new qg2(new a(), tg2Var.e());
        tg2Var.h(this.g.getContext(), this.L);
        c0();
    }

    public void j0(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            c0();
        }
    }

    public void k0(int i) {
        if (this.r != i) {
            this.r = i;
            c0();
        }
    }

    public void l(@x1 Canvas canvas) {
        int save = canvas.save();
        if (this.N == null || !this.h) {
            return;
        }
        this.b0.setTextSize(this.U);
        float f2 = this.B;
        float f3 = this.C;
        boolean z = this.Q && this.R != null;
        float f4 = this.T;
        if (f4 != 1.0f && !this.j) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.R, f2, f3, this.S);
            canvas.restoreToCount(save);
            return;
        }
        if (N0() && (!this.j || this.i > this.l)) {
            m(canvas, this.B - this.q0.getLineStart(0), f3);
        } else {
            canvas.translate(f2, f3);
            this.q0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void l0(float f2) {
        if (this.t != f2) {
            this.t = f2;
            c0();
        }
    }

    public void m0(Typeface typeface) {
        if (n0(typeface)) {
            c0();
        }
    }

    public void o(@x1 RectF rectF, int i, int i2) {
        this.O = f(this.M);
        rectF.left = s(i, i2);
        rectF.top = this.o.top;
        rectF.right = t(rectF, i, i2);
        rectF.bottom = r() + this.o.top;
    }

    public void o0(int i) {
        this.m = i;
    }

    public ColorStateList p() {
        return this.v;
    }

    public void p0(int i, int i2, int i3, int i4) {
        if (e0(this.n, i, i2, i3, i4)) {
            return;
        }
        this.n.set(i, i2, i3, i4);
        this.a0 = true;
        b0();
    }

    public int q() {
        return this.r;
    }

    public void q0(@x1 Rect rect) {
        p0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float r() {
        Q(this.c0);
        return -this.c0.ascent();
    }

    public void r0(float f2) {
        if (this.o0 != f2) {
            this.o0 = f2;
            c0();
        }
    }

    public void s0(int i) {
        tg2 tg2Var = new tg2(this.g.getContext(), i);
        if (tg2Var.i() != null) {
            this.u = tg2Var.i();
        }
        if (tg2Var.j() != 0.0f) {
            this.s = tg2Var.j();
        }
        ColorStateList colorStateList = tg2Var.g;
        if (colorStateList != null) {
            this.m0 = colorStateList;
        }
        this.k0 = tg2Var.l;
        this.l0 = tg2Var.m;
        this.j0 = tg2Var.n;
        this.o0 = tg2Var.p;
        qg2 qg2Var = this.K;
        if (qg2Var != null) {
            qg2Var.c();
        }
        this.K = new qg2(new b(), tg2Var.e());
        tg2Var.h(this.g.getContext(), this.K);
        c0();
    }

    public float u() {
        return this.t;
    }

    public void u0(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            c0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.D;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(int i) {
        if (this.q != i) {
            this.q = i;
            c0();
        }
    }

    @w0
    public int w() {
        return x(this.v);
    }

    public void w0(float f2) {
        if (this.s != f2) {
            this.s = f2;
            c0();
        }
    }

    public void x0(Typeface typeface) {
        if (y0(typeface)) {
            c0();
        }
    }

    public int z() {
        return this.w;
    }

    public void z0(float f2) {
        float d2 = bm.d(f2, 0.0f, 1.0f);
        if (d2 != this.i) {
            this.i = d2;
            c();
        }
    }
}