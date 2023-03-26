package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class yr {
    public static final int a = 2113929216;
    private final WeakReference<View> b;
    public Runnable c = null;
    public Runnable d = null;
    public int e = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ zr s;
        public final /* synthetic */ View t;

        public a(zr zrVar, View view) {
            this.s = zrVar;
            this.t = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s.onAnimationCancel(this.t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.onAnimationEnd(this.t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.s.onAnimationStart(this.t);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @e1
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @e1
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @e1
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @e1
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @e1
        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public static class f implements zr {
        public yr a;
        public boolean b;

        public f(yr yrVar) {
            this.a = yrVar;
        }

        @Override // com.p7700g.p99005.zr
        public void onAnimationCancel(@x1 View view) {
            Object tag = view.getTag(yr.a);
            zr zrVar = tag instanceof zr ? (zr) tag : null;
            if (zrVar != null) {
                zrVar.onAnimationCancel(view);
            }
        }

        @Override // com.p7700g.p99005.zr
        @SuppressLint({"WrongConstant"})
        public void onAnimationEnd(@x1 View view) {
            int i = this.a.e;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.e = -1;
            }
            yr yrVar = this.a;
            Runnable runnable = yrVar.d;
            if (runnable != null) {
                yrVar.d = null;
                runnable.run();
            }
            Object tag = view.getTag(yr.a);
            zr zrVar = tag instanceof zr ? (zr) tag : null;
            if (zrVar != null) {
                zrVar.onAnimationEnd(view);
            }
            this.b = true;
        }

        @Override // com.p7700g.p99005.zr
        public void onAnimationStart(@x1 View view) {
            this.b = false;
            if (this.a.e > -1) {
                view.setLayerType(2, null);
            }
            yr yrVar = this.a;
            Runnable runnable = yrVar.c;
            if (runnable != null) {
                yrVar.c = null;
                runnable.run();
            }
            Object tag = view.getTag(yr.a);
            zr zrVar = tag instanceof zr ? (zr) tag : null;
            if (zrVar != null) {
                zrVar.onAnimationStart(view);
            }
        }
    }

    public yr(View view) {
        this.b = new WeakReference<>(view);
    }

    private void u(View view, zr zrVar) {
        if (zrVar != null) {
            view.animate().setListener(new a(zrVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @x1
    public yr A(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    @x1
    public yr B(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().translationYBy(f2);
        }
        return this;
    }

    @x1
    public yr C(float f2) {
        View view = this.b.get();
        if (view != null) {
            e.a(view.animate(), f2);
        }
        return this;
    }

    @x1
    public yr D(float f2) {
        View view = this.b.get();
        if (view != null) {
            e.b(view.animate(), f2);
        }
        return this;
    }

    @x1
    public yr E(@x1 Runnable runnable) {
        View view = this.b.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @x1
    @SuppressLint({"WrongConstant"})
    public yr F() {
        View view = this.b.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @x1
    public yr G(@x1 Runnable runnable) {
        View view = this.b.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @x1
    public yr H(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().x(f2);
        }
        return this;
    }

    @x1
    public yr I(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().xBy(f2);
        }
        return this;
    }

    @x1
    public yr J(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().y(f2);
        }
        return this;
    }

    @x1
    public yr K(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().yBy(f2);
        }
        return this;
    }

    @x1
    public yr L(float f2) {
        View view = this.b.get();
        if (view != null) {
            e.c(view.animate(), f2);
        }
        return this;
    }

    @x1
    public yr M(float f2) {
        View view = this.b.get();
        if (view != null) {
            e.d(view.animate(), f2);
        }
        return this;
    }

    @x1
    public yr a(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    @x1
    public yr b(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().alphaBy(f2);
        }
        return this;
    }

    public void c() {
        View view = this.b.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.b.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @z1
    public Interpolator e() {
        View view = this.b.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long f() {
        View view = this.b.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @x1
    public yr h(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotation(f2);
        }
        return this;
    }

    @x1
    public yr i(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotationBy(f2);
        }
        return this;
    }

    @x1
    public yr j(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotationX(f2);
        }
        return this;
    }

    @x1
    public yr k(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotationXBy(f2);
        }
        return this;
    }

    @x1
    public yr l(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotationY(f2);
        }
        return this;
    }

    @x1
    public yr m(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().rotationYBy(f2);
        }
        return this;
    }

    @x1
    public yr n(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().scaleX(f2);
        }
        return this;
    }

    @x1
    public yr o(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().scaleXBy(f2);
        }
        return this;
    }

    @x1
    public yr p(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().scaleY(f2);
        }
        return this;
    }

    @x1
    public yr q(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().scaleYBy(f2);
        }
        return this;
    }

    @x1
    public yr r(long j) {
        View view = this.b.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @x1
    public yr s(@z1 Interpolator interpolator) {
        View view = this.b.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @x1
    public yr t(@z1 zr zrVar) {
        View view = this.b.get();
        if (view != null) {
            u(view, zrVar);
        }
        return this;
    }

    @x1
    public yr v(long j) {
        View view = this.b.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @x1
    public yr w(@z1 final bs bsVar) {
        final View view = this.b.get();
        if (view != null) {
            d.a(view.animate(), bsVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.p7700g.p99005.zp
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bs.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void x() {
        View view = this.b.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @x1
    public yr y(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().translationX(f2);
        }
        return this;
    }

    @x1
    public yr z(float f2) {
        View view = this.b.get();
        if (view != null) {
            view.animate().translationXBy(f2);
        }
        return this;
    }
}