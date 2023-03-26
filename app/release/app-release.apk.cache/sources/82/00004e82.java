package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.p7700g.p99005.z90;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes3.dex */
public final class lg2 extends ig2<ObjectAnimator> {
    private static final int d = 667;
    private static final int e = 333;
    private static final Property<lg2, Float> f = new b(Float.class, "animationFraction");
    private ObjectAnimator g;
    private qy h;
    private final ag2 i;
    private int j;
    private boolean k;
    private float l;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            lg2 lg2Var = lg2.this;
            lg2Var.j = (lg2Var.j + 1) % lg2.this.i.c.length;
            lg2.this.k = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class b extends Property<lg2, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(lg2 lg2Var) {
            return Float.valueOf(lg2Var.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(lg2 lg2Var, Float f) {
            lg2Var.r(f.floatValue());
        }
    }

    public lg2(@x1 og2 og2Var) {
        super(3);
        this.j = 1;
        this.i = og2Var;
        this.h = new qy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.l;
    }

    private void o() {
        if (this.g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f, 0.0f, 1.0f);
            this.g = ofFloat;
            ofFloat.setDuration(333L);
            this.g.setInterpolator(null);
            this.g.setRepeatCount(-1);
            this.g.addListener(new a());
        }
    }

    private void p() {
        if (!this.k || this.b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = kc2.a(this.i.c[this.j], this.a.getAlpha());
        this.k = false;
    }

    private void s(int i) {
        this.b[0] = 0.0f;
        float b2 = b(i, 0, d);
        float[] fArr = this.b;
        float interpolation = this.h.getInterpolation(b2);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.b;
        float interpolation2 = this.h.getInterpolation(b2 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.b[5] = 1.0f;
    }

    @Override // com.p7700g.p99005.ig2
    public void a() {
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.p7700g.p99005.ig2
    public void c() {
        q();
    }

    @Override // com.p7700g.p99005.ig2
    public void d(@z1 z90.a aVar) {
    }

    @Override // com.p7700g.p99005.ig2
    public void f() {
    }

    @Override // com.p7700g.p99005.ig2
    public void g() {
        o();
        q();
        this.g.start();
    }

    @Override // com.p7700g.p99005.ig2
    public void h() {
    }

    @r2
    public void q() {
        this.k = true;
        this.j = 1;
        Arrays.fill(this.c, kc2.a(this.i.c[0], this.a.getAlpha()));
    }

    @r2
    public void r(float f2) {
        this.l = f2;
        s((int) (f2 * 333.0f));
        p();
        this.a.invalidateSelf();
    }
}