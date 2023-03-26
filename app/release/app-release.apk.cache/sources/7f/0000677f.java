package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.hk2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialContainerTransform.java */
/* loaded from: classes3.dex */
public final class yj2 extends s80 {
    public static final int I0 = 0;
    public static final int J0 = 1;
    public static final int K0 = 2;
    public static final int L0 = 0;
    public static final int M0 = 1;
    public static final int N0 = 2;
    public static final int O0 = 3;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    private static final String S0 = yj2.class.getSimpleName();
    private static final String T0 = "materialContainerTransition:bounds";
    private static final String U0 = "materialContainerTransition:shapeAppearance";
    private static final String[] V0 = {T0, U0};
    private static final f W0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f X0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
    private static final f Y0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
    private static final f Z0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    private static final float a1 = -1.0f;
    private boolean b1;
    private boolean c1;
    private boolean d1;
    private boolean e1;
    @m1
    private int f1;
    @m1
    private int g1;
    @m1
    private int h1;
    @w0
    private int i1;
    @w0
    private int j1;
    @w0
    private int k1;
    @w0
    private int l1;
    private int m1;
    private int n1;
    private int o1;
    @z1
    private View p1;
    @z1
    private View q1;
    @z1
    private qh2 r1;
    @z1
    private qh2 s1;
    @z1
    private e t1;
    @z1
    private e u1;
    @z1
    private e v1;
    @z1
    private e w1;
    private boolean x1;
    private float y1;
    private float z1;

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ h s;

        public a(h hVar) {
            this.s = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.s.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    public class b extends gk2 {
        public final /* synthetic */ View s;
        public final /* synthetic */ h t;
        public final /* synthetic */ View u;
        public final /* synthetic */ View v;

        public b(View view, h hVar, View view2, View view3) {
            this.s = view;
            this.t = hVar;
            this.u = view2;
            this.v = view3;
        }

        @Override // com.p7700g.p99005.gk2, com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
            kf2.i(this.s).a(this.t);
            this.u.setAlpha(0.0f);
            this.v.setAlpha(0.0f);
        }

        @Override // com.p7700g.p99005.gk2, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            yj2.this.v0(this);
            if (yj2.this.c1) {
                return;
            }
            this.u.setAlpha(1.0f);
            this.v.setAlpha(1.0f);
            kf2.i(this.s).b(this.t);
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface c {
    }

    /* compiled from: MaterialContainerTransform.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    public static class e {
        @g1(from = zg2.s, to = 1.0d)
        private final float a;
        @g1(from = zg2.s, to = 1.0d)
        private final float b;

        public e(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
            this.a = f;
            this.b = f2;
        }

        @g1(from = zg2.s, to = 1.0d)
        public float c() {
            return this.b;
        }

        @g1(from = zg2.s, to = 1.0d)
        public float d() {
            return this.a;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    public static class f {
        @x1
        private final e a;
        @x1
        private final e b;
        @x1
        private final e c;
        @x1
        private final e d;

        public /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@x1 e eVar, @x1 e eVar2, @x1 e eVar3, @x1 e eVar4) {
            this.a = eVar;
            this.b = eVar2;
            this.c = eVar3;
            this.d = eVar4;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface g {
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    public static final class h extends Drawable {
        private static final int a = 754974720;
        private static final int b = -7829368;
        private static final float c = 0.3f;
        private static final float d = 1.5f;
        private final RectF A;
        private final RectF B;
        private final RectF C;
        private final RectF D;
        private final f E;
        private final nj2 F;
        private final sj2 G;
        private final boolean H;
        private final Paint I;
        private final Path J;
        private pj2 K;
        private uj2 L;
        private RectF M;
        private float N;
        private float O;
        private float P;
        private final View e;
        private final RectF f;
        private final qh2 g;
        private final float h;
        private final View i;
        private final RectF j;
        private final qh2 k;
        private final float l;
        private final Paint m;
        private final Paint n;
        private final Paint o;
        private final Paint p;
        private final Paint q;
        private final wj2 r;
        private final PathMeasure s;
        private final float t;
        private final float[] u;
        private final boolean v;
        private final float w;
        private final float x;
        private final boolean y;
        private final lh2 z;

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        public class a implements hk2.c {
            public a() {
            }

            @Override // com.p7700g.p99005.hk2.c
            public void a(Canvas canvas) {
                h.this.e.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        public class b implements hk2.c {
            public b() {
            }

            @Override // com.p7700g.p99005.hk2.c
            public void a(Canvas canvas) {
                h.this.i.draw(canvas);
            }
        }

        public /* synthetic */ h(i80 i80Var, View view, RectF rectF, qh2 qh2Var, float f, View view2, RectF rectF2, qh2 qh2Var2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, nj2 nj2Var, sj2 sj2Var, f fVar, boolean z3, a aVar) {
            this(i80Var, view, rectF, qh2Var, f, view2, rectF2, qh2Var2, f2, i, i2, i3, i4, z, z2, nj2Var, sj2Var, fVar, z3);
        }

        private static float d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @w0 int i) {
            PointF m = m(rectF);
            if (this.P == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.I.setColor(i);
            canvas.drawPath(path, this.I);
        }

        private void g(Canvas canvas, RectF rectF, @w0 int i) {
            this.I.setColor(i);
            canvas.drawRect(rectF, this.I);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.r.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            lh2 lh2Var = this.z;
            RectF rectF = this.M;
            lh2Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.z.n0(this.N);
            this.z.B0((int) this.O);
            this.z.setShapeAppearanceModel(this.r.c());
            this.z.draw(canvas);
        }

        private void j(Canvas canvas) {
            qh2 c2 = this.r.c();
            if (c2.u(this.M)) {
                float a2 = c2.r().a(this.M);
                canvas.drawRoundRect(this.M, a2, a2, this.p);
                return;
            }
            canvas.drawPath(this.r.d(), this.p);
        }

        private void k(Canvas canvas) {
            n(canvas, this.o);
            Rect bounds = getBounds();
            RectF rectF = this.C;
            hk2.w(canvas, bounds, rectF.left, rectF.top, this.L.b, this.K.b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.n);
            Rect bounds = getBounds();
            RectF rectF = this.A;
            hk2.w(canvas, bounds, rectF.left, rectF.top, this.L.a, this.K.a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f) {
            if (this.P != f) {
                p(f);
            }
        }

        private void p(float f) {
            float f2;
            float f3;
            this.P = f;
            this.q.setAlpha((int) (this.v ? hk2.k(0.0f, 255.0f, f) : hk2.k(255.0f, 0.0f, f)));
            this.s.getPosTan(this.t * f, this.u, null);
            float[] fArr = this.u;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f2 = 0.99f;
                    f3 = (f - 1.0f) / 0.00999999f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.s.getPosTan(this.t * f2, fArr, null);
                float[] fArr2 = this.u;
                float f6 = fArr2[0];
                float f7 = fArr2[1];
                f4 = wo1.a(f4, f6, f3, f4);
                f5 = wo1.a(f5, f7, f3, f5);
            }
            float f8 = f4;
            float f9 = f5;
            uj2 a2 = this.G.a(f, ((Float) jp.l(Float.valueOf(this.E.b.a))).floatValue(), ((Float) jp.l(Float.valueOf(this.E.b.b))).floatValue(), this.f.width(), this.f.height(), this.j.width(), this.j.height());
            this.L = a2;
            RectF rectF = this.A;
            float f10 = a2.c;
            rectF.set(f8 - (f10 / 2.0f), f9, (f10 / 2.0f) + f8, a2.d + f9);
            RectF rectF2 = this.C;
            uj2 uj2Var = this.L;
            float f11 = uj2Var.e;
            rectF2.set(f8 - (f11 / 2.0f), f9, (f11 / 2.0f) + f8, uj2Var.f + f9);
            this.B.set(this.A);
            this.D.set(this.C);
            float floatValue = ((Float) jp.l(Float.valueOf(this.E.c.a))).floatValue();
            float floatValue2 = ((Float) jp.l(Float.valueOf(this.E.c.b))).floatValue();
            boolean b2 = this.G.b(this.L);
            RectF rectF3 = b2 ? this.B : this.D;
            float l = hk2.l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b2) {
                l = 1.0f - l;
            }
            this.G.c(rectF3, l, this.L);
            this.M = new RectF(Math.min(this.B.left, this.D.left), Math.min(this.B.top, this.D.top), Math.max(this.B.right, this.D.right), Math.max(this.B.bottom, this.D.bottom));
            this.r.b(f, this.g, this.k, this.A, this.B, this.D, this.E.d);
            this.N = hk2.k(this.h, this.l, f);
            float d2 = d(this.M, this.w);
            float e = e(this.M, this.x);
            float f12 = this.N;
            float f13 = (int) (e * f12);
            this.O = f13;
            this.p.setShadowLayer(f12, (int) (d2 * f12), f13, a);
            this.K = this.F.a(f, ((Float) jp.l(Float.valueOf(this.E.a.a))).floatValue(), ((Float) jp.l(Float.valueOf(this.E.a.b))).floatValue(), 0.35f);
            if (this.n.getColor() != 0) {
                this.n.setAlpha(this.K.a);
            }
            if (this.o.getColor() != 0) {
                this.o.setAlpha(this.K.b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@x1 Canvas canvas) {
            if (this.q.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.q);
            }
            int save = this.H ? canvas.save() : -1;
            if (this.y && this.N > 0.0f) {
                h(canvas);
            }
            this.r.a(canvas);
            n(canvas, this.m);
            if (this.K.c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.H) {
                canvas.restoreToCount(save);
                f(canvas, this.A, this.J, -65281);
                g(canvas, this.B, oq.u);
                g(canvas, this.A, -16711936);
                g(canvas, this.D, -16711681);
                g(canvas, this.C, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@z1 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private h(i80 i80Var, View view, RectF rectF, qh2 qh2Var, float f, View view2, RectF rectF2, qh2 qh2Var2, float f2, @w0 int i, @w0 int i2, @w0 int i3, int i4, boolean z, boolean z2, nj2 nj2Var, sj2 sj2Var, f fVar, boolean z3) {
            Paint paint = new Paint();
            this.m = paint;
            Paint paint2 = new Paint();
            this.n = paint2;
            Paint paint3 = new Paint();
            this.o = paint3;
            this.p = new Paint();
            Paint paint4 = new Paint();
            this.q = paint4;
            this.r = new wj2();
            this.u = r7;
            lh2 lh2Var = new lh2();
            this.z = lh2Var;
            Paint paint5 = new Paint();
            this.I = paint5;
            this.J = new Path();
            this.e = view;
            this.f = rectF;
            this.g = qh2Var;
            this.h = f;
            this.i = view2;
            this.j = rectF2;
            this.k = qh2Var2;
            this.l = f2;
            this.v = z;
            this.y = z2;
            this.F = nj2Var;
            this.G = sj2Var;
            this.E = fVar;
            this.H = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.w = displayMetrics.widthPixels;
            this.x = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            lh2Var.o0(ColorStateList.valueOf(0));
            lh2Var.x0(2);
            lh2Var.u0(false);
            lh2Var.v0(b);
            RectF rectF3 = new RectF(rectF);
            this.A = rectF3;
            this.B = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.C = rectF4;
            this.D = new RectF(rectF4);
            PointF m = m(rectF);
            PointF m2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(i80Var.a(m.x, m.y, m2.x, m2.y), false);
            this.s = pathMeasure;
            this.t = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(hk2.c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public yj2() {
        this.b1 = false;
        this.c1 = false;
        this.d1 = false;
        this.e1 = false;
        this.f1 = 16908290;
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = 0;
        this.j1 = 0;
        this.k1 = 0;
        this.l1 = 1375731712;
        this.m1 = 0;
        this.n1 = 0;
        this.o1 = 0;
        this.x1 = Build.VERSION.SDK_INT >= 28;
        this.y1 = -1.0f;
        this.z1 = -1.0f;
    }

    private void A1(Context context, boolean z) {
        hk2.r(this, context, ga2.c.Wb, ha2.b);
        hk2.q(this, context, z ? ga2.c.Mb : ga2.c.Pb);
        if (this.d1) {
            return;
        }
        hk2.s(this, context, ga2.c.Yb);
    }

    private f R0(boolean z) {
        i80 Z = Z();
        if (!(Z instanceof n70) && !(Z instanceof xj2)) {
            return t1(z, W0, X0);
        }
        return t1(z, Y0, Z0);
    }

    private static RectF S0(View view, @z1 View view2, float f2, float f3) {
        if (view2 != null) {
            RectF g2 = hk2.g(view2);
            g2.offset(f2, f3);
            return g2;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private static qh2 T0(@x1 View view, @x1 RectF rectF, @z1 qh2 qh2Var) {
        return hk2.b(m1(view, qh2Var), rectF);
    }

    private static void U0(@x1 z80 z80Var, @z1 View view, @m1 int i, @z1 qh2 qh2Var) {
        if (i != -1) {
            z80Var.b = hk2.f(z80Var.b, i);
        } else if (view != null) {
            z80Var.b = view;
        } else {
            View view2 = z80Var.b;
            int i2 = ga2.h.r3;
            if (view2.getTag(i2) instanceof View) {
                z80Var.b.setTag(i2, null);
                z80Var.b = (View) z80Var.b.getTag(i2);
            }
        }
        View view3 = z80Var.b;
        if (!sr.T0(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF h2 = view3.getParent() == null ? hk2.h(view3) : hk2.g(view3);
        z80Var.a.put(T0, h2);
        z80Var.a.put(U0, T0(view3, h2, qh2Var));
    }

    private static float Y0(float f2, View view) {
        return f2 != -1.0f ? f2 : sr.Q(view);
    }

    private static qh2 m1(@x1 View view, @z1 qh2 qh2Var) {
        if (qh2Var != null) {
            return qh2Var;
        }
        int i = ga2.h.r3;
        if (view.getTag(i) instanceof qh2) {
            return (qh2) view.getTag(i);
        }
        Context context = view.getContext();
        int v1 = v1(context);
        if (v1 != -1) {
            return qh2.b(context, v1, 0).m();
        }
        if (view instanceof uh2) {
            return ((uh2) view).getShapeAppearanceModel();
        }
        return qh2.a().m();
    }

    private f t1(boolean z, f fVar, f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new f((e) hk2.d(this.t1, fVar.a), (e) hk2.d(this.u1, fVar.b), (e) hk2.d(this.v1, fVar.c), (e) hk2.d(this.w1, fVar.d), null);
    }

    @m2
    private static int v1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{ga2.c.Ph});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean y1(@x1 RectF rectF, @x1 RectF rectF2) {
        int i = this.m1;
        if (i == 0) {
            return hk2.a(rectF2) > hk2.a(rectF);
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            StringBuilder G = wo1.G("Invalid transition direction: ");
            G.append(this.m1);
            throw new IllegalArgumentException(G.toString());
        } else {
            return true;
        }
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        View e2;
        View view;
        if (z80Var != null && z80Var2 != null) {
            RectF rectF = (RectF) z80Var.a.get(T0);
            qh2 qh2Var = (qh2) z80Var.a.get(U0);
            if (rectF != null && qh2Var != null) {
                RectF rectF2 = (RectF) z80Var2.a.get(T0);
                qh2 qh2Var2 = (qh2) z80Var2.a.get(U0);
                if (rectF2 != null && qh2Var2 != null) {
                    View view2 = z80Var.b;
                    View view3 = z80Var2.b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.f1 == view4.getId()) {
                        e2 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e2 = hk2.e(view4, this.f1);
                        view = null;
                    }
                    RectF g2 = hk2.g(e2);
                    float f2 = -g2.left;
                    float f3 = -g2.top;
                    RectF S02 = S0(e2, view, f2, f3);
                    rectF.offset(f2, f3);
                    rectF2.offset(f2, f3);
                    boolean y1 = y1(rectF, rectF2);
                    if (!this.e1) {
                        A1(view4.getContext(), y1);
                    }
                    h hVar = new h(Z(), view2, rectF, qh2Var, Y0(this.y1, view2), view3, rectF2, qh2Var2, Y0(this.z1, view3), this.i1, this.j1, this.k1, this.l1, y1, this.x1, oj2.a(this.n1, y1), tj2.a(this.o1, y1, rectF, rectF2), R0(y1), this.b1, null);
                    hVar.setBounds(Math.round(S02.left), Math.round(S02.top), Math.round(S02.right), Math.round(S02.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    a(new b(e2, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public void B1(@w0 int i) {
        this.i1 = i;
        this.j1 = i;
        this.k1 = i;
    }

    public void C1(@w0 int i) {
        this.i1 = i;
    }

    public void E1(boolean z) {
        this.b1 = z;
    }

    public void F1(@m1 int i) {
        this.f1 = i;
    }

    public void G1(boolean z) {
        this.x1 = z;
    }

    public void H1(@w0 int i) {
        this.k1 = i;
    }

    public void I1(float f2) {
        this.z1 = f2;
    }

    @Override // com.p7700g.p99005.s80
    public void K0(@z1 i80 i80Var) {
        super.K0(i80Var);
        this.d1 = true;
    }

    public void L1(@z1 qh2 qh2Var) {
        this.s1 = qh2Var;
    }

    public void M1(@z1 View view) {
        this.q1 = view;
    }

    public void N1(@m1 int i) {
        this.h1 = i;
    }

    public void O1(int i) {
        this.n1 = i;
    }

    public void P1(@z1 e eVar) {
        this.t1 = eVar;
    }

    public void Q1(int i) {
        this.o1 = i;
    }

    public void R1(boolean z) {
        this.c1 = z;
    }

    public void S1(@z1 e eVar) {
        this.v1 = eVar;
    }

    public void U1(@z1 e eVar) {
        this.u1 = eVar;
    }

    @w0
    public int V0() {
        return this.i1;
    }

    public void V1(@w0 int i) {
        this.l1 = i;
    }

    @m1
    public int W0() {
        return this.f1;
    }

    public void W1(@z1 e eVar) {
        this.w1 = eVar;
    }

    public void X1(@w0 int i) {
        this.j1 = i;
    }

    public void Y1(float f2) {
        this.y1 = f2;
    }

    @w0
    public int Z0() {
        return this.k1;
    }

    public void Z1(@z1 qh2 qh2Var) {
        this.r1 = qh2Var;
    }

    public float a1() {
        return this.z1;
    }

    public void a2(@z1 View view) {
        this.p1 = view;
    }

    @z1
    public qh2 b1() {
        return this.s1;
    }

    public void b2(@m1 int i) {
        this.g1 = i;
    }

    public void c2(int i) {
        this.m1 = i;
    }

    @z1
    public View e1() {
        return this.q1;
    }

    @m1
    public int f1() {
        return this.h1;
    }

    public int g1() {
        return this.n1;
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public String[] h0() {
        return V0;
    }

    @z1
    public e h1() {
        return this.t1;
    }

    public int i1() {
        return this.o1;
    }

    @z1
    public e j1() {
        return this.v1;
    }

    @z1
    public e k1() {
        return this.u1;
    }

    @w0
    public int l1() {
        return this.l1;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        U0(z80Var, this.q1, this.h1, this.s1);
    }

    @z1
    public e n1() {
        return this.w1;
    }

    @w0
    public int o1() {
        return this.j1;
    }

    public float p1() {
        return this.y1;
    }

    @z1
    public qh2 q1() {
        return this.r1;
    }

    @z1
    public View r1() {
        return this.p1;
    }

    @m1
    public int s1() {
        return this.g1;
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        U0(z80Var, this.p1, this.g1, this.r1);
    }

    public int u1() {
        return this.m1;
    }

    public boolean w1() {
        return this.b1;
    }

    public boolean x1() {
        return this.x1;
    }

    public boolean z1() {
        return this.c1;
    }

    public yj2(@x1 Context context, boolean z) {
        this.b1 = false;
        this.c1 = false;
        this.d1 = false;
        this.e1 = false;
        this.f1 = 16908290;
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = 0;
        this.j1 = 0;
        this.k1 = 0;
        this.l1 = 1375731712;
        this.m1 = 0;
        this.n1 = 0;
        this.o1 = 0;
        this.x1 = Build.VERSION.SDK_INT >= 28;
        this.y1 = -1.0f;
        this.z1 = -1.0f;
        A1(context, z);
        this.e1 = true;
    }
}