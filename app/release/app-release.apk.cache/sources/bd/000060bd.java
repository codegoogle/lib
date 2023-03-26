package com.p7700g.p99005;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.p7700g.p99005.pu;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class uu extends pu<uu> {
    private static final float G = Float.MAX_VALUE;
    private vu H;
    private float I;
    private boolean J;

    public uu(su suVar) {
        super(suVar);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
    }

    private void C() {
        vu vuVar = this.H;
        if (vuVar != null) {
            double d = vuVar.d();
            if (d <= this.A) {
                if (d < this.B) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                return;
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public boolean A() {
        return this.H.l > zg2.s;
    }

    public vu B() {
        return this.H;
    }

    public uu D(vu vuVar) {
        this.H = vuVar;
        return this;
    }

    public void E() {
        if (A()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.z) {
                    this.J = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    @Override // com.p7700g.p99005.pu
    public float f(float f, float f2) {
        return this.H.b(f, f2);
    }

    @Override // com.p7700g.p99005.pu
    public boolean j(float f, float f2) {
        return this.H.a(f, f2);
    }

    @Override // com.p7700g.p99005.pu
    public void v(float f) {
    }

    @Override // com.p7700g.p99005.pu
    public void w() {
        C();
        this.H.j(i());
        super.w();
    }

    @Override // com.p7700g.p99005.pu
    public boolean y(long j) {
        if (this.J) {
            float f = this.I;
            if (f != Float.MAX_VALUE) {
                this.H.h(f);
                this.I = Float.MAX_VALUE;
            }
            this.v = this.H.d();
            this.u = 0.0f;
            this.J = false;
            return true;
        }
        if (this.I != Float.MAX_VALUE) {
            this.H.d();
            long j2 = j / 2;
            pu.p k = this.H.k(this.v, this.u, j2);
            this.H.h(this.I);
            this.I = Float.MAX_VALUE;
            pu.p k2 = this.H.k(k.a, k.b, j2);
            this.v = k2.a;
            this.u = k2.b;
        } else {
            pu.p k3 = this.H.k(this.v, this.u, j);
            this.v = k3.a;
            this.u = k3.b;
        }
        float max = Math.max(this.v, this.B);
        this.v = max;
        float min = Math.min(max, this.A);
        this.v = min;
        if (j(min, this.u)) {
            this.v = this.H.d();
            this.u = 0.0f;
            return true;
        }
        return false;
    }

    public void z(float f) {
        if (k()) {
            this.I = f;
            return;
        }
        if (this.H == null) {
            this.H = new vu(f);
        }
        this.H.h(f);
        w();
    }

    public <K> uu(K k, ru<K> ruVar) {
        super(k, ruVar);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
    }

    public <K> uu(K k, ru<K> ruVar, float f) {
        super(k, ruVar);
        this.H = null;
        this.I = Float.MAX_VALUE;
        this.J = false;
        this.H = new vu(f);
    }
}