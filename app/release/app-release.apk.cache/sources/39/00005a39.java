package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Hold.java */
@e2(21)
/* loaded from: classes3.dex */
public final class rk2 extends Visibility {
    @Override // android.transition.Visibility
    @x1
    public Animator onAppear(@x1 ViewGroup viewGroup, @x1 View view, @z1 TransitionValues transitionValues, @z1 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @x1
    public Animator onDisappear(@x1 ViewGroup viewGroup, @x1 View view, @z1 TransitionValues transitionValues, @z1 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}