package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public class pa2 {
    private long a;
    private long b;
    @z1
    private TimeInterpolator c;
    private int d;
    private int e;

    public pa2(long j, long j2) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    @x1
    public static pa2 b(@x1 ValueAnimator valueAnimator) {
        pa2 pa2Var = new pa2(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        pa2Var.d = valueAnimator.getRepeatCount();
        pa2Var.e = valueAnimator.getRepeatMode();
        return pa2Var;
    }

    private static TimeInterpolator f(@x1 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return ha2.c;
            }
            return interpolator instanceof DecelerateInterpolator ? ha2.d : interpolator;
        }
        return ha2.b;
    }

    public void a(@x1 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    @z1
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : ha2.b;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pa2) {
            pa2 pa2Var = (pa2) obj;
            if (c() == pa2Var.c() && d() == pa2Var.d() && g() == pa2Var.g() && h() == pa2Var.h()) {
                return e().getClass().equals(pa2Var.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = e().getClass().hashCode();
        int g = g();
        return h() + ((g + ((hashCode + (((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31)) * 31)) * 31);
    }

    @x1
    public String toString() {
        StringBuilder F = wo1.F('\n');
        F.append(getClass().getName());
        F.append('{');
        F.append(Integer.toHexString(System.identityHashCode(this)));
        F.append(" delay: ");
        F.append(c());
        F.append(" duration: ");
        F.append(d());
        F.append(" interpolator: ");
        F.append(e().getClass());
        F.append(" repeatCount: ");
        F.append(g());
        F.append(" repeatMode: ");
        F.append(h());
        F.append("}\n");
        return F.toString();
    }

    public pa2(long j, long j2, @x1 TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}