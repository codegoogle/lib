package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ChangeClipBounds.java */
/* loaded from: classes.dex */
public class r70 extends s80 {
    private static final String J0 = "android:clipBounds:bounds";
    private static final String I0 = "android:clipBounds:clip";
    private static final String[] K0 = {I0};

    /* compiled from: ChangeClipBounds.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View s;

        public a(View view) {
            this.s = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sr.L1(this.s, null);
        }
    }

    public r70() {
    }

    private void Q0(z80 z80Var) {
        View view = z80Var.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect O = sr.O(view);
        z80Var.a.put(I0, O);
        if (O == null) {
            z80Var.a.put(J0, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // com.p7700g.p99005.s80
    public Animator A(@x1 ViewGroup viewGroup, z80 z80Var, z80 z80Var2) {
        ObjectAnimator objectAnimator = null;
        if (z80Var != null && z80Var2 != null && z80Var.a.containsKey(I0) && z80Var2.a.containsKey(I0)) {
            Rect rect = (Rect) z80Var.a.get(I0);
            Rect rect2 = (Rect) z80Var2.a.get(I0);
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) z80Var.a.get(J0);
            } else if (rect2 == null) {
                rect2 = (Rect) z80Var2.a.get(J0);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            sr.L1(z80Var2.b, rect);
            objectAnimator = ObjectAnimator.ofObject(z80Var2.b, (Property<View, V>) k90.d, (TypeEvaluator) new n80(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimator.addListener(new a(z80Var2.b));
            }
        }
        return objectAnimator;
    }

    @Override // com.p7700g.p99005.s80
    public String[] h0() {
        return K0;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    public r70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}