package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.p7700g.p99005.m80;
import com.p7700g.p99005.s80;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes.dex */
public class b90 {

    /* compiled from: TranslationAnimationCreator.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements s80.h {
        private final float A;
        private final View s;
        private final View t;
        private final int u;
        private final int v;
        private int[] w;
        private float x;
        private float y;
        private final float z;

        public a(View view, View view2, int i, int i2, float f, float f2) {
            this.t = view;
            this.s = view2;
            this.u = i - Math.round(view.getTranslationX());
            this.v = i2 - Math.round(view.getTranslationY());
            this.z = f;
            this.A = f2;
            int i3 = m80.e.J;
            int[] iArr = (int[]) view2.getTag(i3);
            this.w = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            this.t.setTranslationX(this.z);
            this.t.setTranslationY(this.A);
            s80Var.v0(this);
        }

        @Override // com.p7700g.p99005.s80.h
        public void d(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.w == null) {
                this.w = new int[2];
            }
            this.w[0] = Math.round(this.t.getTranslationX() + this.u);
            this.w[1] = Math.round(this.t.getTranslationY() + this.v);
            this.s.setTag(m80.e.J, this.w);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.x = this.t.getTranslationX();
            this.y = this.t.getTranslationY();
            this.t.setTranslationX(this.z);
            this.t.setTranslationY(this.A);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.t.setTranslationX(this.x);
            this.t.setTranslationY(this.y);
        }
    }

    private b90() {
    }

    @z1
    public static Animator a(@x1 View view, @x1 z80 z80Var, int i, int i2, float f, float f2, float f3, float f4, @z1 TimeInterpolator timeInterpolator, @x1 s80 s80Var) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) z80Var.b.getTag(m80.e.J);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        a aVar = new a(view, z80Var.b, round, round2, translationX, translationY);
        s80Var.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        m70.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}