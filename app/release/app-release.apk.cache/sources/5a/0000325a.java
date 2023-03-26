package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p7700g.p99005.ia2;
import com.p7700g.p99005.pa2;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long f = 75;
    public static final long g = 150;
    public static final long h = 0;
    public static final long i = 150;
    private final pa2 j;
    private final pa2 k;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean s;
        public final /* synthetic */ View t;

        public a(boolean z, View view) {
            this.s = z;
            this.t = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                return;
            }
            this.t.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.s) {
                this.t.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.j = new pa2(75L, 150L);
        this.k = new pa2(0L, 150L);
    }

    private void N(@x1 View view, boolean z, boolean z2, @x1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        pa2 pa2Var = z ? this.j : this.k;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        pa2Var.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, @x1 MotionEvent motionEvent) {
        return super.E(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @x1
    public AnimatorSet M(@x1 View view, @x1 View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        N(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        ia2.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new pa2(75L, 150L);
        this.k = new pa2(0L, 150L);
    }
}