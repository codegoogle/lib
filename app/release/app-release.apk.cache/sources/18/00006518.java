package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public class x70 extends r90 {
    private static final String P0 = "android:fade:transitionAlpha";
    private static final String Q0 = "Fade";
    public static final int R0 = 1;
    public static final int S0 = 2;

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public class a extends u80 {
        public final /* synthetic */ View s;

        public a(View view) {
            this.s = view;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            k90.h(this.s, 1.0f);
            k90.a(this.s);
            s80Var.v0(this);
        }
    }

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        private final View s;
        private boolean t = false;

        public b(View view) {
            this.s = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k90.h(this.s, 1.0f);
            if (this.t) {
                this.s.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (sr.K0(this.s) && this.s.getLayerType() == 0) {
                this.t = true;
                this.s.setLayerType(2, null);
            }
        }
    }

    public x70(int i) {
        Z0(i);
    }

    private Animator a1(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        k90.h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, k90.c, f2);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float b1(z80 z80Var, float f) {
        Float f2;
        return (z80Var == null || (f2 = (Float) z80Var.a.get(P0)) == null) ? f : f2.floatValue();
    }

    @Override // com.p7700g.p99005.r90
    public Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        float b1 = b1(z80Var, 0.0f);
        return a1(view, b1 != 1.0f ? b1 : 0.0f, 1.0f);
    }

    @Override // com.p7700g.p99005.r90
    public Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        k90.e(view);
        return a1(view, b1(z80Var, 1.0f), 0.0f);
    }

    @Override // com.p7700g.p99005.r90, com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        super.t(z80Var);
        z80Var.a.put(P0, Float.valueOf(k90.c(z80Var.b)));
    }

    public x70() {
    }

    @SuppressLint({"RestrictedApi"})
    public x70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.f);
        Z0(ri.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, R0()));
        obtainStyledAttributes.recycle();
    }
}