package com.p7700g.p99005;

import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class zo0 extends vo0 implements Choreographer.FrameCallback {
    @z1
    private ei0 B;
    private float u = 1.0f;
    private boolean v = false;
    private long w = 0;
    private float x = 0.0f;
    private int y = 0;
    private float z = -2.1474836E9f;
    private float A = 2.1474836E9f;
    @r2
    public boolean C = false;

    private void N() {
        if (this.B == null) {
            return;
        }
        float f = this.x;
        if (f < this.z || f > this.A) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.z), Float.valueOf(this.A), Float.valueOf(this.x)));
        }
    }

    private float n() {
        ei0 ei0Var = this.B;
        if (ei0Var == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / ei0Var.i()) / Math.abs(this.u);
    }

    private boolean u() {
        return t() < 0.0f;
    }

    public void A() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @u1
    public void B() {
        C(true);
    }

    @u1
    public void C(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.C = false;
        }
    }

    @u1
    public void D() {
        this.C = true;
        A();
        this.w = 0L;
        if (u() && i() == p()) {
            this.x = o();
        } else if (u() || i() != o()) {
        } else {
            this.x = p();
        }
    }

    public void E() {
        M(-t());
    }

    public void G(ei0 ei0Var) {
        boolean z = this.B == null;
        this.B = ei0Var;
        if (z) {
            J(Math.max(this.z, ei0Var.r()), Math.min(this.A, ei0Var.f()));
        } else {
            J((int) ei0Var.r(), (int) ei0Var.f());
        }
        float f = this.x;
        this.x = 0.0f;
        H((int) f);
        e();
    }

    public void H(float f) {
        if (this.x == f) {
            return;
        }
        this.x = bp0.c(f, p(), o());
        this.w = 0L;
        e();
    }

    public void I(float f) {
        J(this.z, f);
    }

    public void J(float f, float f2) {
        if (f <= f2) {
            ei0 ei0Var = this.B;
            float r = ei0Var == null ? -3.4028235E38f : ei0Var.r();
            ei0 ei0Var2 = this.B;
            float f3 = ei0Var2 == null ? Float.MAX_VALUE : ei0Var2.f();
            float c = bp0.c(f, r, f3);
            float c2 = bp0.c(f2, r, f3);
            if (c == this.z && c2 == this.A) {
                return;
            }
            this.z = c;
            this.A = c2;
            H((int) bp0.c(this.x, c, c2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void L(int i) {
        J(i, (int) this.A);
    }

    public void M(float f) {
        this.u = f;
    }

    @Override // com.p7700g.p99005.vo0
    public void a() {
        super.a();
        b(u());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @u1
    public void cancel() {
        a();
        B();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        A();
        if (this.B == null || !isRunning()) {
            return;
        }
        ci0.a("LottieValueAnimator#doFrame");
        long j2 = this.w;
        float n = ((float) (j2 != 0 ? j - j2 : 0L)) / n();
        float f = this.x;
        if (u()) {
            n = -n;
        }
        float f2 = f + n;
        this.x = f2;
        boolean z = !bp0.e(f2, p(), o());
        this.x = bp0.c(this.x, p(), o());
        this.w = j;
        e();
        if (z) {
            if (getRepeatCount() != -1 && this.y >= getRepeatCount()) {
                this.x = this.u < 0.0f ? p() : o();
                B();
                b(u());
            } else {
                c();
                this.y++;
                if (getRepeatMode() == 2) {
                    this.v = !this.v;
                    E();
                } else {
                    this.x = u() ? o() : p();
                }
                this.w = j;
            }
        }
        N();
        ci0.b("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.B = null;
        this.z = -2.1474836E9f;
        this.A = 2.1474836E9f;
    }

    @u1
    public void g() {
        B();
        b(u());
    }

    @Override // android.animation.ValueAnimator
    @g1(from = zg2.s, to = 1.0d)
    public float getAnimatedFraction() {
        float p;
        float o;
        float p2;
        if (this.B == null) {
            return 0.0f;
        }
        if (u()) {
            p = o() - this.x;
            o = o();
            p2 = p();
        } else {
            p = this.x - p();
            o = o();
            p2 = p();
        }
        return p / (o - p2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ei0 ei0Var = this.B;
        if (ei0Var == null) {
            return 0L;
        }
        return ei0Var.d();
    }

    @g1(from = zg2.s, to = 1.0d)
    public float h() {
        ei0 ei0Var = this.B;
        if (ei0Var == null) {
            return 0.0f;
        }
        return (this.x - ei0Var.r()) / (this.B.f() - this.B.r());
    }

    public float i() {
        return this.x;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.C;
    }

    public float o() {
        ei0 ei0Var = this.B;
        if (ei0Var == null) {
            return 0.0f;
        }
        float f = this.A;
        return f == 2.1474836E9f ? ei0Var.f() : f;
    }

    public float p() {
        ei0 ei0Var = this.B;
        if (ei0Var == null) {
            return 0.0f;
        }
        float f = this.z;
        return f == -2.1474836E9f ? ei0Var.r() : f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.v) {
            return;
        }
        this.v = false;
        E();
    }

    public float t() {
        return this.u;
    }

    @u1
    public void x() {
        B();
    }

    @u1
    public void y() {
        this.C = true;
        d(u());
        H((int) (u() ? o() : p()));
        this.w = 0L;
        this.y = 0;
        A();
    }
}