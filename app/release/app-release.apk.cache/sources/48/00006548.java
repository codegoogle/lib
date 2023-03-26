package com.p7700g.p99005;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p7700g.p99005.ga2;

/* compiled from: ViewUtilsLollipop.java */
@e2(21)
/* loaded from: classes2.dex */
public class xa2 {
    private static final int[] a = {16843848};

    public static void a(@x1 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(@x1 View view, float f) {
        int integer = view.getResources().getInteger(ga2.i.c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, ga2.c.De, -ga2.c.Ee}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(@x1 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray j = cf2.j(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (j.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j.getResourceId(0, 0)));
            }
        } finally {
            j.recycle();
        }
    }
}