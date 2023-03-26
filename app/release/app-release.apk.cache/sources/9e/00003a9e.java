package com.p7700g.p99005;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FakeDrag.java */
/* loaded from: classes.dex */
public final class bb0 {
    private final fb0 a;
    private final eb0 b;
    private final RecyclerView c;
    private VelocityTracker d;
    private int e;
    private float f;
    private int g;
    private long h;

    public bb0(fb0 fb0Var, eb0 eb0Var, RecyclerView recyclerView) {
        this.a = fb0Var;
        this.b = eb0Var;
        this.c = recyclerView;
    }

    private void a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.h, j, i, f, f2, 0);
        this.d.addMovement(obtain);
        obtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.d;
        if (velocityTracker == null) {
            this.d = VelocityTracker.obtain();
            this.e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    @q2
    public boolean b() {
        if (this.b.i()) {
            return false;
        }
        this.g = 0;
        this.f = 0;
        this.h = SystemClock.uptimeMillis();
        c();
        this.b.m();
        if (!this.b.k()) {
            this.c.M1();
        }
        a(this.h, 0, 0.0f, 0.0f);
        return true;
    }

    @q2
    public boolean d() {
        if (this.b.j()) {
            this.b.o();
            VelocityTracker velocityTracker = this.d;
            velocityTracker.computeCurrentVelocity(1000, this.e);
            if (this.c.k0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return true;
            }
            this.a.v();
            return true;
        }
        return false;
    }

    @q2
    public boolean e(float f) {
        if (this.b.j()) {
            float f2 = this.f - f;
            this.f = f2;
            int round = Math.round(f2 - this.g);
            this.g += round;
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z = this.a.getOrientation() == 0;
            int i = z ? round : 0;
            int i2 = z ? 0 : round;
            float f3 = z ? this.f : 0.0f;
            float f4 = z ? 0.0f : this.f;
            this.c.scrollBy(i, i2);
            a(uptimeMillis, 2, f3, f4);
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.b.j();
    }
}