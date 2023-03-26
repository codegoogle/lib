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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.p7700g.p99005.el2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialContainerTransform.java */
@e2(21)
/* loaded from: classes3.dex */
public final class uk2 extends Transition {
    public static final int A = 1;
    public static final int B = 2;
    private static final String C = uk2.class.getSimpleName();
    private static final String D = "materialContainerTransition:bounds";
    private static final String E = "materialContainerTransition:shapeAppearance";
    private static final String[] F = {D, E};
    private static final f G = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f H = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
    private static final f I = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
    private static final f J = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    private static final float K = -1.0f;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 0;
    @z1
    private e A0;
    private boolean B0;
    private float C0;
    private float D0;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    @m1
    private int P;
    @m1
    private int Q;
    @m1
    private int R;
    @w0
    private int S;
    @w0
    private int T;
    @w0
    private int U;
    @w0
    private int V;
    private int W;
    private int X;
    private int Y;
    @z1
    private View Z;
    @z1
    private View u0;
    @z1
    private qh2 v0;
    @z1
    private qh2 w0;
    @z1
    private e x0;
    @z1
    private e y0;
    @z1
    private e z0;

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
    public class b extends dl2 {
        public final /* synthetic */ View a;
        public final /* synthetic */ h b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public b(View view, h hVar, View view2, View view3) {
            this.a = view;
            this.b = hVar;
            this.c = view2;
            this.d = view3;
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@x1 Transition transition) {
            uk2.this.removeListener(this);
            if (uk2.this.M) {
                return;
            }
            this.c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            kf2.i(this.a).b(this.b);
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionStart(@x1 Transition transition) {
            kf2.i(this.a).a(this.b);
            this.c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
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
        private final jk2 F;
        private final ok2 G;
        private final boolean H;
        private final Paint I;
        private final Path J;
        private lk2 K;
        private qk2 L;
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
        private final sk2 r;
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
        public class a implements el2.c {
            public a() {
            }

            @Override // com.p7700g.p99005.el2.c
            public void a(Canvas canvas) {
                h.this.e.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        public class b implements el2.c {
            public b() {
            }

            @Override // com.p7700g.p99005.el2.c
            public void a(Canvas canvas) {
                h.this.i.draw(canvas);
            }
        }

        public /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, qh2 qh2Var, float f, View view2, RectF rectF2, qh2 qh2Var2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, jk2 jk2Var, ok2 ok2Var, f fVar, boolean z3, a aVar) {
            this(pathMotion, view, rectF, qh2Var, f, view2, rectF2, qh2Var2, f2, i, i2, i3, i4, z, z2, jk2Var, ok2Var, fVar, z3);
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
            el2.w(canvas, bounds, rectF.left, rectF.top, this.L.b, this.K.b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.n);
            Rect bounds = getBounds();
            RectF rectF = this.A;
            el2.w(canvas, bounds, rectF.left, rectF.top, this.L.a, this.K.a, new a());
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
            this.q.setAlpha((int) (this.v ? el2.k(0.0f, 255.0f, f) : el2.k(255.0f, 0.0f, f)));
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
            qk2 a2 = this.G.a(f, ((Float) jp.l(Float.valueOf(this.E.b.a))).floatValue(), ((Float) jp.l(Float.valueOf(this.E.b.b))).floatValue(), this.f.width(), this.f.height(), this.j.width(), this.j.height());
            this.L = a2;
            RectF rectF = this.A;
            float f10 = a2.c;
            rectF.set(f8 - (f10 / 2.0f), f9, (f10 / 2.0f) + f8, a2.d + f9);
            RectF rectF2 = this.C;
            qk2 qk2Var = this.L;
            float f11 = qk2Var.e;
            rectF2.set(f8 - (f11 / 2.0f), f9, (f11 / 2.0f) + f8, qk2Var.f + f9);
            this.B.set(this.A);
            this.D.set(this.C);
            float floatValue = ((Float) jp.l(Float.valueOf(this.E.c.a))).floatValue();
            float floatValue2 = ((Float) jp.l(Float.valueOf(this.E.c.b))).floatValue();
            boolean b2 = this.G.b(this.L);
            RectF rectF3 = b2 ? this.B : this.D;
            float l = el2.l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b2) {
                l = 1.0f - l;
            }
            this.G.c(rectF3, l, this.L);
            this.M = new RectF(Math.min(this.B.left, this.D.left), Math.min(this.B.top, this.D.top), Math.max(this.B.right, this.D.right), Math.max(this.B.bottom, this.D.bottom));
            this.r.b(f, this.g, this.k, this.A, this.B, this.D, this.E.d);
            this.N = el2.k(this.h, this.l, f);
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

        private h(PathMotion pathMotion, View view, RectF rectF, qh2 qh2Var, float f, View view2, RectF rectF2, qh2 qh2Var2, float f2, @w0 int i, @w0 int i2, @w0 int i3, int i4, boolean z, boolean z2, jk2 jk2Var, ok2 ok2Var, f fVar, boolean z3) {
            Paint paint = new Paint();
            this.m = paint;
            Paint paint2 = new Paint();
            this.n = paint2;
            Paint paint3 = new Paint();
            this.o = paint3;
            this.p = new Paint();
            Paint paint4 = new Paint();
            this.q = paint4;
            this.r = new sk2();
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
            this.F = jk2Var;
            this.G = ok2Var;
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
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.s = pathMeasure;
            this.t = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(el2.c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public uk2() {
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 16908290;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1375731712;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.B0 = Build.VERSION.SDK_INT >= 28;
        this.C0 = -1.0f;
        this.D0 = -1.0f;
    }

    private static qh2 D(@x1 View view, @z1 qh2 qh2Var) {
        if (qh2Var != null) {
            return qh2Var;
        }
        int i = ga2.h.r3;
        if (view.getTag(i) instanceof qh2) {
            return (qh2) view.getTag(i);
        }
        Context context = view.getContext();
        int O = O(context);
        if (O != -1) {
            return qh2.b(context, O, 0).m();
        }
        if (view instanceof uh2) {
            return ((uh2) view).getShapeAppearanceModel();
        }
        return qh2.a().m();
    }

    private f M(boolean z2, f fVar, f fVar2) {
        if (!z2) {
            fVar = fVar2;
        }
        return new f((e) el2.d(this.x0, fVar.a), (e) el2.d(this.y0, fVar.b), (e) el2.d(this.z0, fVar.c), (e) el2.d(this.A0, fVar.d), null);
    }

    @m2
    private static int O(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{ga2.c.Ph});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean R(@x1 RectF rectF, @x1 RectF rectF2) {
        int i = this.W;
        if (i == 0) {
            return el2.a(rectF2) > el2.a(rectF);
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            StringBuilder G2 = wo1.G("Invalid transition direction: ");
            G2.append(this.W);
            throw new IllegalArgumentException(G2.toString());
        } else {
            return true;
        }
    }

    private void T(Context context, boolean z2) {
        el2.r(this, context, ga2.c.Wb, ha2.b);
        el2.q(this, context, z2 ? ga2.c.Mb : ga2.c.Pb);
        if (this.N) {
            return;
        }
        el2.s(this, context, ga2.c.Yb);
    }

    private f b(boolean z2) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof tk2)) {
            return M(z2, G, H);
        }
        return M(z2, I, J);
    }

    private static RectF c(View view, @z1 View view2, float f2, float f3) {
        if (view2 != null) {
            RectF g2 = el2.g(view2);
            g2.offset(f2, f3);
            return g2;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private static qh2 d(@x1 View view, @x1 RectF rectF, @z1 qh2 qh2Var) {
        return el2.b(D(view, qh2Var), rectF);
    }

    private static void e(@x1 TransitionValues transitionValues, @z1 View view, @m1 int i, @z1 qh2 qh2Var) {
        if (i != -1) {
            transitionValues.view = el2.f(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i2 = ga2.h.r3;
            if (view2.getTag(i2) instanceof View) {
                transitionValues.view.setTag(i2, null);
                transitionValues.view = (View) transitionValues.view.getTag(i2);
            }
        }
        View view3 = transitionValues.view;
        if (!sr.T0(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF h2 = view3.getParent() == null ? el2.h(view3) : el2.g(view3);
        transitionValues.values.put(D, h2);
        transitionValues.values.put(E, d(view3, h2, qh2Var));
    }

    private static float h(float f2, View view) {
        return f2 != -1.0f ? f2 : sr.Q(view);
    }

    @z1
    public e A() {
        return this.z0;
    }

    @z1
    public e B() {
        return this.y0;
    }

    @w0
    public int C() {
        return this.V;
    }

    @z1
    public e E() {
        return this.A0;
    }

    @w0
    public int G() {
        return this.T;
    }

    public float H() {
        return this.C0;
    }

    @z1
    public qh2 I() {
        return this.v0;
    }

    @z1
    public View J() {
        return this.Z;
    }

    @m1
    public int L() {
        return this.Q;
    }

    public int N() {
        return this.W;
    }

    public boolean P() {
        return this.L;
    }

    public boolean Q() {
        return this.B0;
    }

    public boolean S() {
        return this.M;
    }

    public void U(@w0 int i) {
        this.S = i;
        this.T = i;
        this.U = i;
    }

    public void V(@w0 int i) {
        this.S = i;
    }

    public void X(boolean z2) {
        this.L = z2;
    }

    public void Z(@m1 int i) {
        this.P = i;
    }

    public void a0(boolean z2) {
        this.B0 = z2;
    }

    public void b0(@w0 int i) {
        this.U = i;
    }

    public void c0(float f2) {
        this.D0 = f2;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@x1 TransitionValues transitionValues) {
        e(transitionValues, this.u0, this.R, this.w0);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@x1 TransitionValues transitionValues) {
        e(transitionValues, this.Z, this.Q, this.v0);
    }

    @Override // android.transition.Transition
    @z1
    public Animator createAnimator(@x1 ViewGroup viewGroup, @z1 TransitionValues transitionValues, @z1 TransitionValues transitionValues2) {
        View e2;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(D);
            qh2 qh2Var = (qh2) transitionValues.values.get(E);
            if (rectF != null && qh2Var != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(D);
                qh2 qh2Var2 = (qh2) transitionValues2.values.get(E);
                if (rectF2 != null && qh2Var2 != null) {
                    View view2 = transitionValues.view;
                    View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.P == view4.getId()) {
                        e2 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e2 = el2.e(view4, this.P);
                        view = null;
                    }
                    RectF g2 = el2.g(e2);
                    float f2 = -g2.left;
                    float f3 = -g2.top;
                    RectF c2 = c(e2, view, f2, f3);
                    rectF.offset(f2, f3);
                    rectF2.offset(f2, f3);
                    boolean R = R(rectF, rectF2);
                    if (!this.O) {
                        T(view4.getContext(), R);
                    }
                    h hVar = new h(getPathMotion(), view2, rectF, qh2Var, h(this.C0, view2), view3, rectF2, qh2Var2, h(this.D0, view3), this.S, this.T, this.U, this.V, R, this.B0, kk2.a(this.X, R), pk2.a(this.Y, R, rectF, rectF2), b(R), this.L, null);
                    hVar.setBounds(Math.round(c2.left), Math.round(c2.top), Math.round(c2.right), Math.round(c2.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    addListener(new b(e2, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public void d0(@z1 qh2 qh2Var) {
        this.w0 = qh2Var;
    }

    public void e0(@z1 View view) {
        this.u0 = view;
    }

    @w0
    public int f() {
        return this.S;
    }

    public void f0(@m1 int i) {
        this.R = i;
    }

    @m1
    public int g() {
        return this.P;
    }

    public void g0(int i) {
        this.X = i;
    }

    @Override // android.transition.Transition
    @z1
    public String[] getTransitionProperties() {
        return F;
    }

    public void h0(@z1 e eVar) {
        this.x0 = eVar;
    }

    @w0
    public int i() {
        return this.U;
    }

    public void i0(int i) {
        this.Y = i;
    }

    public void j0(boolean z2) {
        this.M = z2;
    }

    public void k0(@z1 e eVar) {
        this.z0 = eVar;
    }

    public void l0(@z1 e eVar) {
        this.y0 = eVar;
    }

    public void m0(@w0 int i) {
        this.V = i;
    }

    public float n() {
        return this.D0;
    }

    public void n0(@z1 e eVar) {
        this.A0 = eVar;
    }

    @z1
    public qh2 o() {
        return this.w0;
    }

    public void o0(@w0 int i) {
        this.T = i;
    }

    @z1
    public View p() {
        return this.u0;
    }

    public void p0(float f2) {
        this.C0 = f2;
    }

    public void q0(@z1 qh2 qh2Var) {
        this.v0 = qh2Var;
    }

    public void r0(@z1 View view) {
        this.Z = view;
    }

    public void s0(@m1 int i) {
        this.Q = i;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@z1 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.N = true;
    }

    @m1
    public int t() {
        return this.R;
    }

    public void t0(int i) {
        this.W = i;
    }

    public int u() {
        return this.X;
    }

    @z1
    public e x() {
        return this.x0;
    }

    public int y() {
        return this.Y;
    }

    public uk2(@x1 Context context, boolean z2) {
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 16908290;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1375731712;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.B0 = Build.VERSION.SDK_INT >= 28;
        this.C0 = -1.0f;
        this.D0 = -1.0f;
        T(context, z2);
        this.O = true;
    }
}