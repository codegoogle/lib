package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.z90;
import java.util.Arrays;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes3.dex */
public final class mg2 extends ig2<ObjectAnimator> {
    private static final int d = 1800;
    private static final int[] e = {533, 567, 850, 750};
    private static final int[] f = {1267, 1000, 333, 0};
    private static final Property<mg2, Float> g = new c(Float.class, "animationFraction");
    private ObjectAnimator h;
    private ObjectAnimator i;
    private final Interpolator[] j;
    private final ag2 k;
    private int l;
    private boolean m;
    private float n;
    public z90.a o;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            mg2 mg2Var = mg2.this;
            mg2Var.l = (mg2Var.l + 1) % mg2.this.k.c.length;
            mg2.this.m = true;
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            mg2.this.a();
            mg2 mg2Var = mg2.this;
            z90.a aVar = mg2Var.o;
            if (aVar != null) {
                aVar.b(mg2Var.a);
            }
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class c extends Property<mg2, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(mg2 mg2Var) {
            return Float.valueOf(mg2Var.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(mg2 mg2Var, Float f) {
            mg2Var.r(f.floatValue());
        }
    }

    public mg2(@x1 Context context, @x1 og2 og2Var) {
        super(2);
        this.l = 0;
        this.o = null;
        this.k = og2Var;
        this.j = new Interpolator[]{ba0.b(context, ga2.b.d), ba0.b(context, ga2.b.e), ba0.b(context, ga2.b.f), ba0.b(context, ga2.b.g)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.n;
    }

    private void o() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(com.anythink.expressad.d.a.b.aC);
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new a());
        }
        if (this.i == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, g, 1.0f);
            this.i = ofFloat2;
            ofFloat2.setDuration(com.anythink.expressad.d.a.b.aC);
            this.i.setInterpolator(null);
            this.i.addListener(new b());
        }
    }

    private void p() {
        if (this.m) {
            Arrays.fill(this.c, kc2.a(this.k.c[this.l], this.a.getAlpha()));
            this.m = false;
        }
    }

    private void s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2] = Math.max(0.0f, Math.min(1.0f, this.j[i2].getInterpolation(b(i, f[i2], e[i2]))));
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void c() {
        q();
    }

    @Override // com.p7700g.p99005.ig2
    public void d(@x1 z90.a aVar) {
        this.o = aVar;
    }

    @Override // com.p7700g.p99005.ig2
    public void f() {
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.a.isVisible()) {
            this.i.setFloatValues(this.n, 1.0f);
            this.i.setDuration((1.0f - this.n) * 1800.0f);
            this.i.start();
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void g() {
        o();
        q();
        this.h.start();
    }

    @Override // com.p7700g.p99005.ig2
    public void h() {
        this.o = null;
    }

    @r2
    public void q() {
        this.l = 0;
        int a2 = kc2.a(this.k.c[0], this.a.getAlpha());
        int[] iArr = this.c;
        iArr[0] = a2;
        iArr[1] = a2;
    }

    @r2
    public void r(float f2) {
        this.n = f2;
        s((int) (f2 * 1800.0f));
        p();
        this.a.invalidateSelf();
    }
}