package com.p7700g.p99005;

import android.view.animation.Interpolator;

/* compiled from: OneSignalBounceInterpolator.java */
/* loaded from: classes3.dex */
public class nm3 implements Interpolator {
    private double a;
    private double b;

    public nm3(double d, double d2) {
        this.a = 1.0d;
        this.b = 10.0d;
        this.a = d;
        this.b = d2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) ((Math.cos(this.b * f) * Math.pow(2.718281828459045d, (-f) / this.a) * (-1.0d)) + 1.0d);
    }
}