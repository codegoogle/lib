package com.p7700g.p99005;

import android.view.animation.Interpolator;

/* compiled from: PP_MyBounceInterpolator.java */
/* loaded from: classes3.dex */
public class ch3 implements Interpolator {
    public double a;
    public double b;

    public ch3(double amplitude, double frequency) {
        this.a = 1.0d;
        this.b = 10.0d;
        this.a = amplitude;
        this.b = frequency;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float time) {
        double d = this.a;
        int i = (d > zg2.s ? 1 : (d == zg2.s ? 0 : -1));
        return (float) ((Math.cos(this.b * time) * Math.pow(2.718281828459045d, (-time) / d) * (-1.0d)) + 1.0d);
    }
}