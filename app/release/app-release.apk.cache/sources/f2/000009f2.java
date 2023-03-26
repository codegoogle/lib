package com.anythink.expressad.video.dynview.g;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.anythink.expressad.video.dynview.c;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: com.anythink.expressad.video.dynview.g.b$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public AnonymousClass5(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.g.b$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public AnonymousClass6(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    private static void a(Map map, c cVar, View view) {
        if (view != null) {
            com.anythink.expressad.video.dynview.h.a.a.a().a(map, cVar, view);
        }
    }

    private static PropertyValuesHolder b(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.6f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.5f, 1.0f), Keyframe.ofFloat(0.6f, 1.0f), Keyframe.ofFloat(0.7f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    public static ObjectAnimator c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(900L);
        duration.setRepeatCount(-1);
        return duration;
    }

    public static void e(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(500L);
        }
    }

    private static TranslateAnimation f(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        view.setVisibility(0);
        return translateAnimation;
    }

    private static ObjectAnimator g(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(2000L);
    }

    private static ObjectAnimator h(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(2000L);
    }

    private static ObjectAnimator i(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(900L);
    }

    public final void d(final View view) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.g.b.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    private void a(View view, long j) {
        ValueAnimator ofInt;
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, r0);
        } else {
            ofInt = ValueAnimator.ofInt(r0, 0);
        }
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public static ObjectAnimator b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    private void a(final View view, int i, int i2, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.g.b.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                view.requestLayout();
            }
        });
        duration.start();
    }

    private void a(final View view, int i, int i2, int i3, int i4, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.g.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i3, i4);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.g.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    private void a(View view, int i, long j) {
        ValueAnimator ofInt;
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, i);
        } else {
            ofInt = ValueAnimator.ofInt(i, 0);
        }
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    private static PropertyValuesHolder a(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.8f), Keyframe.ofFloat(0.3f, 1.3f), Keyframe.ofFloat(0.4f, 0.8f), Keyframe.ofFloat(0.5f, 1.3f), Keyframe.ofFloat(0.6f, 0.9f), Keyframe.ofFloat(0.7f, 1.3f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    private static PropertyValuesHolder a(Property property, float f) {
        float f2 = (-2.0f) * f;
        float f3 = f * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f3), Keyframe.ofFloat(1.0f, 0.0f));
    }

    public static ObjectAnimator a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }
}