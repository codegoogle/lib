package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.m80;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ChangeTransform.java */
/* loaded from: classes.dex */
public class u70 extends s80 {
    private static final String K0 = "android:changeTransform:parent";
    private static final String M0 = "android:changeTransform:intermediateParentMatrix";
    private static final String N0 = "android:changeTransform:intermediateMatrix";
    public boolean S0;
    private boolean T0;
    private Matrix U0;
    private static final String I0 = "android:changeTransform:matrix";
    private static final String J0 = "android:changeTransform:transforms";
    private static final String L0 = "android:changeTransform:parentMatrix";
    private static final String[] O0 = {I0, J0, L0};
    private static final Property<e, float[]> P0 = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> Q0 = new b(PointF.class, "translations");
    private static final boolean R0 = true;

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public static class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public static class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        private boolean s;
        private Matrix t = new Matrix();
        public final /* synthetic */ boolean u;
        public final /* synthetic */ Matrix v;
        public final /* synthetic */ View w;
        public final /* synthetic */ f x;
        public final /* synthetic */ e y;

        public c(boolean z, Matrix matrix, View view, f fVar, e eVar) {
            this.u = z;
            this.v = matrix;
            this.w = view;
            this.x = fVar;
            this.y = eVar;
        }

        private void a(Matrix matrix) {
            this.t.set(matrix);
            this.w.setTag(m80.e.L, this.t);
            this.x.a(this.w);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.s) {
                if (this.u && u70.this.S0) {
                    a(this.v);
                } else {
                    this.w.setTag(m80.e.L, null);
                    this.w.setTag(m80.e.v, null);
                }
            }
            k90.f(this.w, null);
            this.x.a(this.w);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.y.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            u70.W0(this.w);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public static class d extends u80 {
        private View s;
        private a80 t;

        public d(View view, a80 a80Var) {
            this.s = view;
            this.t = a80Var;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
            this.t.setVisibility(4);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            s80Var.v0(this);
            e80.b(this.s);
            this.s.setTag(m80.e.L, null);
            this.s.setTag(m80.e.v, null);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
            this.t.setVisibility(0);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public static class e {
        private final Matrix a = new Matrix();
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        public e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            k90.f(this.b, this.a);
        }

        public Matrix a() {
            return this.a;
        }

        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    /* compiled from: ChangeTransform.java */
    /* loaded from: classes.dex */
    public static class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = sr.z0(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            u70.b1(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return fVar.a == this.a && fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
            }
            return false;
        }

        public int hashCode() {
            float f = this.a;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return floatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public u70() {
        this.S0 = true;
        this.T0 = true;
        this.U0 = new Matrix();
    }

    private void Q0(z80 z80Var) {
        View view = z80Var.b;
        if (view.getVisibility() == 8) {
            return;
        }
        z80Var.a.put(K0, view.getParent());
        z80Var.a.put(J0, new f(view));
        Matrix matrix = view.getMatrix();
        z80Var.a.put(I0, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.T0) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            k90.j(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            z80Var.a.put(L0, matrix2);
            z80Var.a.put(N0, view.getTag(m80.e.L));
            z80Var.a.put(M0, view.getTag(m80.e.v));
        }
    }

    private void R0(ViewGroup viewGroup, z80 z80Var, z80 z80Var2) {
        View view = z80Var2.b;
        Matrix matrix = new Matrix((Matrix) z80Var2.a.get(L0));
        k90.k(viewGroup, matrix);
        a80 a2 = e80.a(view, viewGroup, matrix);
        if (a2 == null) {
            return;
        }
        a2.a((ViewGroup) z80Var.a.get(K0), z80Var.b);
        s80 s80Var = this;
        while (true) {
            s80 s80Var2 = s80Var.Y;
            if (s80Var2 == null) {
                break;
            }
            s80Var = s80Var2;
        }
        s80Var.a(new d(view, a2));
        if (R0) {
            View view2 = z80Var.b;
            if (view2 != z80Var2.b) {
                k90.h(view2, 0.0f);
            }
            k90.h(view, 1.0f);
        }
    }

    private ObjectAnimator S0(z80 z80Var, z80 z80Var2, boolean z) {
        Matrix matrix = (Matrix) z80Var.a.get(I0);
        Matrix matrix2 = (Matrix) z80Var2.a.get(I0);
        if (matrix == null) {
            matrix = g80.a;
        }
        if (matrix2 == null) {
            matrix2 = g80.a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) z80Var2.a.get(J0);
        View view = z80Var2.b;
        W0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(P0, new y70(new float[9]), fArr, fArr2), l80.a(Q0, Z().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        m70.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.b) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean V0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (l0(viewGroup) && l0(viewGroup2)) {
            z80 V = V(viewGroup, true);
            if (V == null) {
                return false;
            }
        }
    }

    public static void W0(View view) {
        b1(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void Y0(z80 z80Var, z80 z80Var2) {
        Matrix matrix = (Matrix) z80Var2.a.get(L0);
        z80Var2.b.setTag(m80.e.v, matrix);
        Matrix matrix2 = this.U0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) z80Var.a.get(I0);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            z80Var.a.put(I0, matrix3);
        }
        matrix3.postConcat((Matrix) z80Var.a.get(L0));
        matrix3.postConcat(matrix2);
    }

    public static void b1(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        sr.v2(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    @Override // com.p7700g.p99005.s80
    public Animator A(@x1 ViewGroup viewGroup, z80 z80Var, z80 z80Var2) {
        if (z80Var == null || z80Var2 == null || !z80Var.a.containsKey(K0) || !z80Var2.a.containsKey(K0)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) z80Var.a.get(K0);
        boolean z = this.T0 && !V0(viewGroup2, (ViewGroup) z80Var2.a.get(K0));
        Matrix matrix = (Matrix) z80Var.a.get(N0);
        if (matrix != null) {
            z80Var.a.put(I0, matrix);
        }
        Matrix matrix2 = (Matrix) z80Var.a.get(M0);
        if (matrix2 != null) {
            z80Var.a.put(L0, matrix2);
        }
        if (z) {
            Y0(z80Var, z80Var2);
        }
        ObjectAnimator S0 = S0(z80Var, z80Var2, z);
        if (z && S0 != null && this.S0) {
            R0(viewGroup, z80Var, z80Var2);
        } else if (!R0) {
            viewGroup2.endViewTransition(z80Var.b);
        }
        return S0;
    }

    public boolean T0() {
        return this.T0;
    }

    public boolean U0() {
        return this.S0;
    }

    public void Z0(boolean z) {
        this.T0 = z;
    }

    public void a1(boolean z) {
        this.S0 = z;
    }

    @Override // com.p7700g.p99005.s80
    public String[] h0() {
        return O0;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
        if (R0) {
            return;
        }
        ((ViewGroup) z80Var.b.getParent()).startViewTransition(z80Var.b);
    }

    @SuppressLint({"RestrictedApi"})
    public u70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S0 = true;
        this.T0 = true;
        this.U0 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.S0 = ri.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.T0 = ri.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}