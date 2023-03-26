package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.p7700g.p99005.z90;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes3.dex */
public final class cg2 extends ig2<ObjectAnimator> {
    private static final int d = 4;
    private static final int e = 5400;
    private static final int f = 667;
    private static final int g = 667;
    private static final int h = 333;
    private static final int i = 333;
    private static final int m = -20;
    private static final int n = 250;
    private static final int o = 1520;
    private ObjectAnimator r;
    private ObjectAnimator s;
    private final qy t;
    private final ag2 u;
    private int v;
    private float w;
    private float x;
    public z90.a y;
    private static final int[] j = {0, 1350, 2700, 4050};
    private static final int[] k = {667, 2017, 3367, 4717};
    private static final int[] l = {1000, 2350, 3700, 5050};
    private static final Property<cg2, Float> p = new c(Float.class, "animationFraction");
    private static final Property<cg2, Float> q = new d(Float.class, "completeEndFraction");

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            cg2 cg2Var = cg2.this;
            cg2Var.v = (cg2Var.v + 4) % cg2.this.u.c.length;
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            cg2.this.a();
            cg2 cg2Var = cg2.this;
            z90.a aVar = cg2Var.y;
            if (aVar != null) {
                aVar.b(cg2Var.a);
            }
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class c extends Property<cg2, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(cg2 cg2Var) {
            return Float.valueOf(cg2Var.o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(cg2 cg2Var, Float f) {
            cg2Var.t(f.floatValue());
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class d extends Property<cg2, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(cg2 cg2Var) {
            return Float.valueOf(cg2Var.p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(cg2 cg2Var, Float f) {
            cg2Var.u(f.floatValue());
        }
    }

    public cg2(@x1 eg2 eg2Var) {
        super(1);
        this.v = 0;
        this.y = null;
        this.u = eg2Var;
        this.t = new qy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.x;
    }

    private void q() {
        if (this.r == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, p, 0.0f, 1.0f);
            this.r = ofFloat;
            ofFloat.setDuration(5400L);
            this.r.setInterpolator(null);
            this.r.setRepeatCount(-1);
            this.r.addListener(new a());
        }
        if (this.s == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, q, 0.0f, 1.0f);
            this.s = ofFloat2;
            ofFloat2.setDuration(333L);
            this.s.setInterpolator(this.t);
            this.s.addListener(new b());
        }
    }

    private void r(int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            float b2 = b(i2, l[i3], 333);
            if (b2 >= 0.0f && b2 <= 1.0f) {
                int i4 = i3 + this.v;
                int[] iArr = this.u.c;
                int length = i4 % iArr.length;
                int a2 = kc2.a(iArr[length], this.a.getAlpha());
                int a3 = kc2.a(this.u.c[(length + 1) % iArr.length], this.a.getAlpha());
                this.c[0] = ja2.b().evaluate(this.t.getInterpolation(b2), Integer.valueOf(a2), Integer.valueOf(a3)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f2) {
        this.x = f2;
    }

    private void v(int i2) {
        float[] fArr = this.b;
        float f2 = this.w;
        fArr[0] = (f2 * 1520.0f) - 20.0f;
        fArr[1] = f2 * 1520.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            float b2 = b(i2, j[i3], 667);
            float[] fArr2 = this.b;
            fArr2[1] = (this.t.getInterpolation(b2) * 250.0f) + fArr2[1];
            float b3 = b(i2, k[i3], 667);
            float[] fArr3 = this.b;
            fArr3[0] = (this.t.getInterpolation(b3) * 250.0f) + fArr3[0];
        }
        float[] fArr4 = this.b;
        fArr4[0] = ((fArr4[1] - fArr4[0]) * this.x) + fArr4[0];
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }

    @Override // com.p7700g.p99005.ig2
    public void a() {
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void c() {
        s();
    }

    @Override // com.p7700g.p99005.ig2
    public void d(@x1 z90.a aVar) {
        this.y = aVar;
    }

    @Override // com.p7700g.p99005.ig2
    public void f() {
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.a.isVisible()) {
            this.s.start();
        } else {
            a();
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void g() {
        q();
        s();
        this.r.start();
    }

    @Override // com.p7700g.p99005.ig2
    public void h() {
        this.y = null;
    }

    @r2
    public void s() {
        this.v = 0;
        this.c[0] = kc2.a(this.u.c[0], this.a.getAlpha());
        this.x = 0.0f;
    }

    @r2
    public void t(float f2) {
        this.w = f2;
        int i2 = (int) (f2 * 5400.0f);
        v(i2);
        r(i2);
        this.a.invalidateSelf();
    }
}