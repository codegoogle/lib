package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.p7700g.p99005.vb2;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes.dex */
public final class pb2 {

    /* compiled from: CircularRevealCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ vb2 s;

        public a(vb2 vb2Var) {
            this.s = vb2Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.s.a();
        }
    }

    private pb2() {
    }

    @x1
    public static Animator a(@x1 vb2 vb2Var, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(vb2Var, (Property<vb2, V>) vb2.c.a, (TypeEvaluator) vb2.b.a, (Object[]) new vb2.e[]{new vb2.e(f, f2, f3)});
        vb2.e revealInfo = vb2Var.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) vb2Var, (int) f, (int) f2, revealInfo.d, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @x1
    public static Animator b(vb2 vb2Var, float f, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(vb2Var, (Property<vb2, V>) vb2.c.a, (TypeEvaluator) vb2.b.a, (Object[]) new vb2.e[]{new vb2.e(f, f2, f3), new vb2.e(f, f2, f4)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) vb2Var, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @x1
    public static Animator.AnimatorListener c(@x1 vb2 vb2Var) {
        return new a(vb2Var);
    }
}