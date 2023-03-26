package com.p7700g.p99005;

import android.view.animation.Interpolator;

/* compiled from: MotionInterpolator.java */
/* loaded from: classes.dex */
public abstract class fe implements Interpolator {
    public abstract float a();

    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float v);
}