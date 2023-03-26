package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p7700g.p99005.ga2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes3.dex */
public class ce2 {
    public static final long b = 100;
    public static final long c = 100;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final float g = 1.5f;
    private static final float h = 0.0f;
    private static final float i = 0.4f;
    private static final float j = 0.4f;
    private static final float k = 1.0f;
    private static final float l = 1.0f;
    private static final float m = 1.0f;
    private static final float n = 0.0f;
    private static final float o = 0.0f;
    public boolean A;
    public float C;
    public float D;
    public float E;
    public int F;
    @x1
    private final xe2 G;
    @z1
    private Animator H;
    @z1
    private oa2 I;
    @z1
    private oa2 J;
    private float K;
    private int M;
    private ArrayList<Animator.AnimatorListener> O;
    private ArrayList<Animator.AnimatorListener> P;
    private ArrayList<j> Q;
    public final FloatingActionButton R;
    public final bh2 S;
    @z1
    private ViewTreeObserver.OnPreDrawListener X;
    @z1
    public qh2 v;
    @z1
    public lh2 w;
    @z1
    public Drawable x;
    @z1
    public be2 y;
    @z1
    public Drawable z;
    public static final TimeInterpolator a = ha2.c;
    public static final int[] p = {16842919, 16842910};
    public static final int[] q = {16843623, 16842908, 16842910};
    public static final int[] r = {16842908, 16842910};
    public static final int[] s = {16843623, 16842910};
    public static final int[] t = {16842910};
    public static final int[] u = new int[0];
    public boolean B = true;
    private float L = 1.0f;
    private int N = 0;
    private final Rect T = new Rect();
    private final RectF U = new RectF();
    private final RectF V = new RectF();
    private final Matrix W = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        private boolean s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ k u;

        public a(boolean z, k kVar) {
            this.t = z;
            this.u = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ce2.this.N = 0;
            ce2.this.H = null;
            if (this.s) {
                return;
            }
            FloatingActionButton floatingActionButton = ce2.this.R;
            boolean z = this.t;
            floatingActionButton.c(z ? 8 : 4, z);
            k kVar = this.u;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ce2.this.R.c(0, this.t);
            ce2.this.N = 1;
            ce2.this.H = animator;
            this.s = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean s;
        public final /* synthetic */ k t;

        public b(boolean z, k kVar) {
            this.s = z;
            this.t = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ce2.this.N = 0;
            ce2.this.H = null;
            k kVar = this.t;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ce2.this.R.c(0, this.s);
            ce2.this.N = 2;
            ce2.this.H = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class c extends na2 {
        public c() {
        }

        @Override // com.p7700g.p99005.na2, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, @x1 Matrix matrix, @x1 Matrix matrix2) {
            ce2.this.L = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float s;
        public final /* synthetic */ float t;
        public final /* synthetic */ float u;
        public final /* synthetic */ float v;
        public final /* synthetic */ float w;
        public final /* synthetic */ float x;
        public final /* synthetic */ float y;
        public final /* synthetic */ Matrix z;

        public d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.s = f;
            this.t = f2;
            this.u = f3;
            this.v = f4;
            this.w = f5;
            this.x = f6;
            this.y = f7;
            this.z = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ce2.this.R.setAlpha(ha2.b(this.s, this.t, 0.0f, 0.2f, floatValue));
            ce2.this.R.setScaleX(ha2.a(this.u, this.v, floatValue));
            ce2.this.R.setScaleY(ha2.a(this.w, this.v, floatValue));
            ce2.this.L = ha2.a(this.x, this.y, floatValue);
            ce2.this.h(ha2.a(this.x, this.y, floatValue), this.z);
            ce2.this.R.setImageMatrix(this.z);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class e implements TypeEvaluator<Float> {
        public FloatEvaluator a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ce2.this.H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class g extends m {
        public g() {
            super(ce2.this, null);
        }

        @Override // com.p7700g.p99005.ce2.m
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class h extends m {
        public h() {
            super(ce2.this, null);
        }

        @Override // com.p7700g.p99005.ce2.m
        public float a() {
            ce2 ce2Var = ce2.this;
            return ce2Var.C + ce2Var.D;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class i extends m {
        public i() {
            super(ce2.this, null);
        }

        @Override // com.p7700g.p99005.ce2.m
        public float a() {
            ce2 ce2Var = ce2.this;
            return ce2Var.C + ce2Var.E;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public interface k {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class l extends m {
        public l() {
            super(ce2.this, null);
        }

        @Override // com.p7700g.p99005.ce2.m
        public float a() {
            return ce2.this.C;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean s;
        private float t;
        private float u;

        private m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ce2.this.j0((int) this.u);
            this.s = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            if (!this.s) {
                lh2 lh2Var = ce2.this.w;
                this.t = lh2Var == null ? 0.0f : lh2Var.x();
                this.u = a();
                this.s = true;
            }
            ce2 ce2Var = ce2.this;
            float f = this.t;
            ce2Var.j0((int) ((valueAnimator.getAnimatedFraction() * (this.u - f)) + f));
        }

        public /* synthetic */ m(ce2 ce2Var, a aVar) {
            this();
        }
    }

    public ce2(FloatingActionButton floatingActionButton, bh2 bh2Var) {
        this.R = floatingActionButton;
        this.S = bh2Var;
        xe2 xe2Var = new xe2();
        this.G = xe2Var;
        xe2Var.a(p, k(new i()));
        xe2Var.a(q, k(new h()));
        xe2Var.a(r, k(new h()));
        xe2Var.a(s, k(new h()));
        xe2Var.a(t, k(new l()));
        xe2Var.a(u, k(new g()));
        this.K = floatingActionButton.getRotation();
    }

    private boolean d0() {
        return sr.T0(this.R) && !this.R.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f2, @x1 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.R.getDrawable();
        if (drawable == null || this.M == 0) {
            return;
        }
        RectF rectF = this.U;
        RectF rectF2 = this.V;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.M;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.M;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    @x1
    private AnimatorSet i(@x1 oa2 oa2Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.R, View.ALPHA, f2);
        oa2Var.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.R, View.SCALE_X, f3);
        oa2Var.h("scale").a(ofFloat2);
        k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.R, View.SCALE_Y, f3);
        oa2Var.h("scale").a(ofFloat3);
        k0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f4, this.W);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.R, new ma2(), new c(), new Matrix(this.W));
        oa2Var.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ia2.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.R.getAlpha(), f2, this.R.getScaleX(), f3, this.R.getScaleY(), this.L, f4, new Matrix(this.W)));
        arrayList.add(ofFloat);
        ia2.a(animatorSet, arrayList);
        animatorSet.setDuration(of2.d(this.R.getContext(), ga2.c.Mb, this.R.getContext().getResources().getInteger(ga2.i.F)));
        animatorSet.setInterpolator(of2.e(this.R.getContext(), ga2.c.Wb, ha2.b));
        return animatorSet;
    }

    @x1
    private ValueAnimator k(@x1 m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @x1
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.X == null) {
            this.X = new f();
        }
        return this.X;
    }

    public void A() {
        this.G.c();
    }

    public void B() {
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            mh2.f(this.R, lh2Var);
        }
        if (N()) {
            this.R.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.R.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.X;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.X = null;
        }
    }

    public void E(int[] iArr) {
        this.G.d(iArr);
    }

    public void F(float f2, float f3, float f4) {
        i0();
        j0(f2);
    }

    public void G(@x1 Rect rect) {
        jp.m(this.z, "Didn't initialize content background");
        if (c0()) {
            this.S.setBackgroundDrawable(new InsetDrawable(this.z, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.S.setBackgroundDrawable(this.z);
    }

    public void H() {
        float rotation = this.R.getRotation();
        if (this.K != rotation) {
            this.K = rotation;
            g0();
        }
    }

    public void I() {
        ArrayList<j> arrayList = this.Q;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J() {
        ArrayList<j> arrayList = this.Q;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@x1 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void L(@x1 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void M(@x1 j jVar) {
        ArrayList<j> arrayList = this.Q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public boolean N() {
        return true;
    }

    public void O(@z1 ColorStateList colorStateList) {
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            lh2Var.setTintList(colorStateList);
        }
        be2 be2Var = this.y;
        if (be2Var != null) {
            be2Var.d(colorStateList);
        }
    }

    public void P(@z1 PorterDuff.Mode mode) {
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            lh2Var.setTintMode(mode);
        }
    }

    public final void Q(float f2) {
        if (this.C != f2) {
            this.C = f2;
            F(f2, this.D, this.E);
        }
    }

    public void R(boolean z) {
        this.A = z;
    }

    public final void S(@z1 oa2 oa2Var) {
        this.J = oa2Var;
    }

    public final void T(float f2) {
        if (this.D != f2) {
            this.D = f2;
            F(this.C, f2, this.E);
        }
    }

    public final void U(float f2) {
        this.L = f2;
        Matrix matrix = this.W;
        h(f2, matrix);
        this.R.setImageMatrix(matrix);
    }

    public final void V(int i2) {
        if (this.M != i2) {
            this.M = i2;
            h0();
        }
    }

    public void W(int i2) {
        this.F = i2;
    }

    public final void X(float f2) {
        if (this.E != f2) {
            this.E = f2;
            F(this.C, this.D, f2);
        }
    }

    public void Y(@z1 ColorStateList colorStateList) {
        Drawable drawable = this.x;
        if (drawable != null) {
            fk.o(drawable, yg2.d(colorStateList));
        }
    }

    public void Z(boolean z) {
        this.B = z;
        i0();
    }

    public final void a0(@x1 qh2 qh2Var) {
        this.v = qh2Var;
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            lh2Var.setShapeAppearanceModel(qh2Var);
        }
        Drawable drawable = this.x;
        if (drawable instanceof uh2) {
            ((uh2) drawable).setShapeAppearanceModel(qh2Var);
        }
        be2 be2Var = this.y;
        if (be2Var != null) {
            be2Var.g(qh2Var);
        }
    }

    public final void b0(@z1 oa2 oa2Var) {
        this.I = oa2Var;
    }

    public boolean c0() {
        return true;
    }

    public void e(@x1 Animator.AnimatorListener animatorListener) {
        if (this.P == null) {
            this.P = new ArrayList<>();
        }
        this.P.add(animatorListener);
    }

    public final boolean e0() {
        return !this.A || this.R.getSizeDimension() >= this.F;
    }

    public void f(@x1 Animator.AnimatorListener animatorListener) {
        if (this.O == null) {
            this.O = new ArrayList<>();
        }
        this.O.add(animatorListener);
    }

    public void f0(@z1 k kVar, boolean z) {
        AnimatorSet j2;
        if (z()) {
            return;
        }
        Animator animator = this.H;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.I == null;
        if (d0()) {
            if (this.R.getVisibility() != 0) {
                this.R.setAlpha(0.0f);
                this.R.setScaleY(z2 ? 0.4f : 0.0f);
                this.R.setScaleX(z2 ? 0.4f : 0.0f);
                U(z2 ? 0.4f : 0.0f);
            }
            oa2 oa2Var = this.I;
            if (oa2Var != null) {
                j2 = i(oa2Var, 1.0f, 1.0f, 1.0f);
            } else {
                j2 = j(1.0f, 1.0f, 1.0f);
            }
            j2.addListener(new b(z, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.O;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j2.addListener(it.next());
                }
            }
            j2.start();
            return;
        }
        this.R.c(0, z);
        this.R.setAlpha(1.0f);
        this.R.setScaleY(1.0f);
        this.R.setScaleX(1.0f);
        U(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    public void g(@x1 j jVar) {
        if (this.Q == null) {
            this.Q = new ArrayList<>();
        }
        this.Q.add(jVar);
    }

    public void g0() {
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            lh2Var.w0((int) this.K);
        }
    }

    public final void h0() {
        U(this.L);
    }

    public final void i0() {
        Rect rect = this.T;
        s(rect);
        G(rect);
        this.S.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void j0(float f2) {
        lh2 lh2Var = this.w;
        if (lh2Var != null) {
            lh2Var.n0(f2);
        }
    }

    public lh2 l() {
        return new lh2((qh2) jp.l(this.v));
    }

    @z1
    public final Drawable m() {
        return this.z;
    }

    public float n() {
        return this.C;
    }

    public boolean o() {
        return this.A;
    }

    @z1
    public final oa2 p() {
        return this.J;
    }

    public float q() {
        return this.D;
    }

    public void s(@x1 Rect rect) {
        int sizeDimension = this.A ? (this.F - this.R.getSizeDimension()) / 2 : 0;
        float n2 = this.B ? n() + this.E : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(n2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(n2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.E;
    }

    @z1
    public final qh2 u() {
        return this.v;
    }

    @z1
    public final oa2 v() {
        return this.I;
    }

    public void w(@z1 k kVar, boolean z) {
        AnimatorSet j2;
        if (y()) {
            return;
        }
        Animator animator = this.H;
        if (animator != null) {
            animator.cancel();
        }
        if (d0()) {
            oa2 oa2Var = this.J;
            if (oa2Var != null) {
                j2 = i(oa2Var, 0.0f, 0.0f, 0.0f);
            } else {
                j2 = j(0.0f, 0.4f, 0.4f);
            }
            j2.addListener(new a(z, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.P;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j2.addListener(it.next());
                }
            }
            j2.start();
            return;
        }
        this.R.c(z ? 8 : 4, z);
        if (kVar != null) {
            kVar.b();
        }
    }

    public void x(ColorStateList colorStateList, @z1 PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        lh2 l2 = l();
        this.w = l2;
        l2.setTintList(colorStateList);
        if (mode != null) {
            this.w.setTintMode(mode);
        }
        this.w.v0(-12303292);
        this.w.Z(this.R.getContext());
        xg2 xg2Var = new xg2(this.w.getShapeAppearanceModel());
        xg2Var.setTintList(yg2.d(colorStateList2));
        this.x = xg2Var;
        this.z = new LayerDrawable(new Drawable[]{(Drawable) jp.l(this.w), xg2Var});
    }

    public boolean y() {
        return this.R.getVisibility() == 0 ? this.N == 1 : this.N != 2;
    }

    public boolean z() {
        return this.R.getVisibility() != 0 ? this.N == 2 : this.N != 1;
    }
}