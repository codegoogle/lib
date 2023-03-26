package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: AnimationUtils.java */
/* loaded from: classes2.dex */
public class i12 {
    public static boolean a(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public static boolean b(x12... x12VarArr) {
        for (x12 x12Var : x12VarArr) {
            if (x12Var.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public static void d(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    public static void e(x12... x12VarArr) {
        for (x12 x12Var : x12VarArr) {
            x12Var.start();
        }
    }

    public static void f(Animator animator) {
        if (animator == null || animator.isRunning()) {
            return;
        }
        animator.end();
    }

    public static void g(x12... x12VarArr) {
        for (x12 x12Var : x12VarArr) {
            x12Var.stop();
        }
    }
}