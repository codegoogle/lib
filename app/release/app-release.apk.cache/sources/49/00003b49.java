package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ScaleProvider.java */
@e2(21)
/* loaded from: classes3.dex */
public final class bl2 implements fl2 {
    private float a;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;

    /* compiled from: ScaleProvider.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View s;
        public final /* synthetic */ float t;
        public final /* synthetic */ float u;

        public a(View view, float f, float f2) {
            this.s = view;
            this.t = f;
            this.u = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.setScaleX(this.t);
            this.s.setScaleY(this.u);
        }
    }

    public bl2() {
        this(true);
    }

    private static Animator c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator a(@x1 ViewGroup viewGroup, @x1 View view) {
        if (this.e) {
            return c(view, this.c, this.d);
        }
        return c(view, this.b, this.a);
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator b(@x1 ViewGroup viewGroup, @x1 View view) {
        if (this.f) {
            if (this.e) {
                return c(view, this.a, this.b);
            }
            return c(view, this.d, this.c);
        }
        return null;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.a;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public void j(boolean z) {
        this.e = z;
    }

    public void k(float f) {
        this.d = f;
    }

    public void l(float f) {
        this.c = f;
    }

    public void m(float f) {
        this.b = f;
    }

    public void n(float f) {
        this.a = f;
    }

    public void o(boolean z) {
        this.f = z;
    }

    public bl2(boolean z) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }
}