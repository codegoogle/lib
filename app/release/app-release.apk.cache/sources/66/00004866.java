package com.p7700g.p99005;

import android.animation.Animator;
import com.p7700g.p99005.z90;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes3.dex */
public abstract class ig2<T extends Animator> {
    public jg2 a;
    public final float[] b;
    public final int[] c;

    public ig2(int i) {
        this.b = new float[i * 2];
        this.c = new int[i];
    }

    public abstract void a();

    public float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void c();

    public abstract void d(@x1 z90.a aVar);

    public void e(@x1 jg2 jg2Var) {
        this.a = jg2Var;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}