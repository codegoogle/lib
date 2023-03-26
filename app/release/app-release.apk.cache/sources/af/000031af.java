package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.ha2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int a = 225;
    public static final int b = 175;
    private static final int c = 1;
    private static final int d = 2;
    private int e;
    private int f;
    private int g;
    @z1
    private ViewPropertyAnimator h;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.h = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.e = 0;
        this.f = 2;
        this.g = 0;
    }

    private void H(@x1 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.h = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i, int i2) {
        return i == 2;
    }

    public boolean I() {
        return this.f == 1;
    }

    public boolean J() {
        return this.f == 2;
    }

    public void K(@x1 V v, @b1 int i) {
        this.g = i;
        if (this.f == 1) {
            v.setTranslationY(this.e + i);
        }
    }

    public void L(@x1 V v) {
        M(v, true);
    }

    public void M(@x1 V v, boolean z) {
        if (I()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f = 1;
        int i = this.e + this.g;
        if (z) {
            H(v, i, 175L, ha2.c);
        } else {
            v.setTranslationY(i);
        }
    }

    public void N(@x1 V v) {
        O(v, true);
    }

    public void O(@x1 V v, boolean z) {
        if (J()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f = 2;
        if (z) {
            H(v, 0, 225L, ha2.d);
        } else {
            v.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i) {
        this.e = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.m(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, int i3, int i4, int i5, @x1 int[] iArr) {
        if (i2 > 0) {
            L(v);
        } else if (i2 < 0) {
            N(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.f = 2;
        this.g = 0;
    }
}