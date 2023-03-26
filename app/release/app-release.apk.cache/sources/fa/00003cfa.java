package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: SlideDistanceProvider.java */
@e2(21)
/* loaded from: classes3.dex */
public final class cl2 implements fl2 {
    private static final int a = -1;
    private int b;
    @c2
    private int c = -1;

    /* compiled from: SlideDistanceProvider.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View s;
        public final /* synthetic */ float t;

        public a(View view, float f) {
            this.s = view;
            this.t = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.setTranslationX(this.t);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
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
            this.s.setTranslationY(this.t);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface c {
    }

    public cl2(int i) {
        this.b = i;
    }

    private static Animator c(View view, View view2, int i, @c2 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i == 8388611) {
                            return e(view2, j(view) ? i2 + translationX : translationX - i2, translationX, translationX);
                        } else if (i == 8388613) {
                            return e(view2, j(view) ? translationX - i2 : i2 + translationX, translationX, translationX);
                        } else {
                            throw new IllegalArgumentException(wo1.l("Invalid slide direction: ", i));
                        }
                    }
                    return f(view2, i2 + translationY, translationY, translationY);
                }
                return f(view2, translationY - i2, translationY, translationY);
            }
            return e(view2, translationX - i2, translationX, translationX);
        }
        return e(view2, i2 + translationX, translationX, translationX);
    }

    private static Animator d(View view, View view2, int i, @c2 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i == 8388611) {
                            return e(view2, translationX, j(view) ? translationX - i2 : i2 + translationX, translationX);
                        } else if (i == 8388613) {
                            return e(view2, translationX, j(view) ? i2 + translationX : translationX - i2, translationX);
                        } else {
                            throw new IllegalArgumentException(wo1.l("Invalid slide direction: ", i));
                        }
                    }
                    return f(view2, translationY, translationY - i2, translationY);
                }
                return f(view2, translationY, i2 + translationY, translationY);
            }
            return e(view2, translationX, i2 + translationX, translationX);
        }
        return e(view2, translationX, translationX - i2, translationX);
    }

    private static Animator e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new a(view, f3));
        return ofPropertyValuesHolder;
    }

    private static Animator f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new b(view, f3));
        return ofPropertyValuesHolder;
    }

    private int h(Context context) {
        int i = this.c;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(ga2.f.C9);
    }

    private static boolean j(View view) {
        return sr.Y(view) == 1;
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator a(@x1 ViewGroup viewGroup, @x1 View view) {
        return c(viewGroup, view, this.b, h(view.getContext()));
    }

    @Override // com.p7700g.p99005.fl2
    @z1
    public Animator b(@x1 ViewGroup viewGroup, @x1 View view) {
        return d(viewGroup, view, this.b, h(view.getContext()));
    }

    @c2
    public int g() {
        return this.c;
    }

    public int i() {
        return this.b;
    }

    public void k(@c2 int i) {
        if (i >= 0) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void l(int i) {
        this.b = i;
    }
}