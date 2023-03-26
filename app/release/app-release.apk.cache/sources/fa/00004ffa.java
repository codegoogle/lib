package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimatorUtils.java */
/* loaded from: classes.dex */
public class m70 {

    /* compiled from: AnimatorUtils.java */
    /* loaded from: classes.dex */
    public interface a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private m70() {
    }

    public static void a(@x1 Animator animator, @x1 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(@x1 Animator animator) {
        animator.pause();
    }

    public static void c(@x1 Animator animator) {
        animator.resume();
    }
}