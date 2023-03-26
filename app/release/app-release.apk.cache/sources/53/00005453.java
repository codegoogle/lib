package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Iterator;

/* compiled from: BaseViewAnimator.java */
/* loaded from: classes3.dex */
public abstract class og3 {
    public static final long a = 1000;
    private long c = 1000;
    private int d = 0;
    private int e = 1;
    private AnimatorSet b = new AnimatorSet();

    public og3 a(Animator.AnimatorListener l) {
        this.b.addListener(l);
        return this;
    }

    public void b() {
        t();
    }

    public void c() {
        this.b.cancel();
    }

    public AnimatorSet d() {
        return this.b;
    }

    public long e() {
        return this.c;
    }

    public long f() {
        return this.b.getStartDelay();
    }

    public boolean g() {
        return this.b.isRunning();
    }

    public boolean h() {
        return this.b.isStarted();
    }

    public abstract void i(View target);

    public void j() {
        this.b.removeAllListeners();
    }

    public void k(Animator.AnimatorListener l) {
        this.b.removeListener(l);
    }

    public void l(View target) {
        sr.F1(target, 1.0f);
        sr.k2(target, 1.0f);
        sr.l2(target, 1.0f);
        sr.t2(target, 0.0f);
        sr.u2(target, 0.0f);
        sr.g2(target, 0.0f);
        sr.i2(target, 0.0f);
        sr.h2(target, 0.0f);
    }

    public void m() {
        this.b = this.b.clone();
        t();
    }

    public og3 n(long duration) {
        this.c = duration;
        return this;
    }

    public og3 o(Interpolator interpolator) {
        this.b.setInterpolator(interpolator);
        return this;
    }

    public og3 p(int repeatMode) {
        this.e = repeatMode;
        return this;
    }

    public og3 q(int repeatTimes) {
        this.d = repeatTimes;
        return this;
    }

    public og3 r(long delay) {
        d().setStartDelay(delay);
        return this;
    }

    public og3 s(View target) {
        l(target);
        i(target);
        return this;
    }

    public void t() {
        Iterator<Animator> it = this.b.getChildAnimations().iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (next instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) next;
                valueAnimator.setRepeatCount(this.d);
                valueAnimator.setRepeatMode(this.e);
            }
        }
        this.b.setDuration(this.c);
        this.b.start();
    }
}