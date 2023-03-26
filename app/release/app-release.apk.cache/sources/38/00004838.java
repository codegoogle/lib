package com.p7700g.p99005;

/* compiled from: StopLogic.java */
/* loaded from: classes.dex */
public class id extends fe {
    private w9 a;
    private t9 b;
    private v9 c;

    public id() {
        w9 w9Var = new w9();
        this.a = w9Var;
        this.c = w9Var;
    }

    @Override // com.p7700g.p99005.fe
    public float a() {
        return this.c.a();
    }

    public void b(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        w9 w9Var = this.a;
        this.c = w9Var;
        w9Var.f(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String c(String desc, float time) {
        return this.c.b(desc, time);
    }

    public float d(float x) {
        return this.c.c(x);
    }

    public boolean e() {
        return this.c.d();
    }

    public void f(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.b == null) {
            this.b = new t9();
        }
        t9 t9Var = this.b;
        this.c = t9Var;
        t9Var.h(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // com.p7700g.p99005.fe, android.animation.TimeInterpolator
    public float getInterpolation(float v) {
        return this.c.getInterpolation(v);
    }
}