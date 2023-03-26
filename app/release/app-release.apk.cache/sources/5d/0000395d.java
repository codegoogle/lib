package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.p7700g.p99005.pp3;

/* compiled from: BaseAnimation.java */
/* loaded from: classes3.dex */
public abstract class aq3<T extends Animator> {
    public static final int a = 350;
    public pp3.a c;
    public long b = 350;
    public T d = a();

    public aq3(@z1 pp3.a aVar) {
        this.c = aVar;
    }

    @x1
    public abstract T a();

    public aq3 b(long j) {
        this.b = j;
        T t = this.d;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public void c() {
        T t = this.d;
        if (t == null || !t.isStarted()) {
            return;
        }
        this.d.end();
    }

    public abstract aq3 d(float f);

    public void e() {
        T t = this.d;
        if (t == null || t.isRunning()) {
            return;
        }
        this.d.start();
    }
}