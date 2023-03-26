package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class AnyThinkFramLayout extends FrameLayout {
    private AnimatorSet a;

    public AnyThinkFramLayout(@x1 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.a = animatorSet;
    }

    public AnyThinkFramLayout(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkFramLayout(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}