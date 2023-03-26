package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: FadeThroughProvider.java */
@e2(21)
/* loaded from: classes3.dex */
public final class nk2 implements fl2 {
    public static final float a = 0.35f;
    private float b = 0.35f;

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View s;
        public final /* synthetic */ float t;
        public final /* synthetic */ float u;
        public final /* synthetic */ float v;
        public final /* synthetic */ float w;

        public a(View view, float f, float f2, float f3, float f4) {
            this.s = view;
            this.t = f;
            this.u = f2;
            this.v = f3;
            this.w = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.s.setAlpha(el2.l(this.t, this.u, this.v, this.w, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View s;
        public final /* synthetic */ float t;

        public b(View view, float f) {
            this.s = view;
            this.t = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.setAlpha(this.t);
        }
    }

    private static Animator c(View view, float f, float f2, @g1(from = 0.0d, to = 1.0d) float f3, @g1(from = 0.0d, to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f, f2, f3, f4));
        ofFloat.addListener(new b(view, f5));
        return ofFloat;
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator a(@x1 ViewGroup viewGroup, @x1 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.b, 1.0f, alpha);
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator b(@x1 ViewGroup viewGroup, @x1 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.b, alpha);
    }

    public float d() {
        return this.b;
    }

    public void e(@g1(from = 0.0d, to = 1.0d) float f) {
        this.b = f;
    }
}