package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.cx;
import com.p7700g.p99005.ey;
import com.p7700g.p99005.nm;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class ix {

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class a implements nm.b {
        public final /* synthetic */ Fragment a;

        public a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // com.p7700g.p99005.nm.b
        public void onCancel() {
            if (this.a.getAnimatingAway() != null) {
                View animatingAway = this.a.getAnimatingAway();
                this.a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.a.setAnimator(null);
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ ey.g c;
        public final /* synthetic */ nm d;

        /* compiled from: FragmentAnim.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.getAnimatingAway() != null) {
                    b.this.b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, ey.g gVar, nm nmVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.d = nmVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ View t;
        public final /* synthetic */ Fragment u;
        public final /* synthetic */ ey.g v;
        public final /* synthetic */ nm w;

        public c(ViewGroup viewGroup, View view, Fragment fragment, ey.g gVar, nm nmVar) {
            this.s = viewGroup;
            this.t = view;
            this.u = fragment;
            this.v = gVar;
            this.w = nmVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.endViewTransition(this.t);
            Animator animator2 = this.u.getAnimator();
            this.u.setAnimator(null);
            if (animator2 == null || this.s.indexOfChild(this.t) >= 0) {
                return;
            }
            this.v.a(this.u, this.w);
        }
    }

    private ix() {
    }

    public static void a(@x1 Fragment fragment, @x1 d dVar, @x1 ey.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        nm nmVar = new nm();
        nmVar.d(new a(fragment));
        gVar.b(fragment, nmVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, nmVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, nmVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    public static d c(@x1 Context context, @x1 Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int b2 = b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = cx.g.u0;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, b2);
            if (onCreateAnimation != null) {
                return new d(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, b2);
            if (onCreateAnimator != null) {
                return new d(onCreateAnimator);
            }
            if (b2 == 0 && nextTransition != 0) {
                b2 = d(nextTransition, z);
            }
            if (b2 != 0) {
                boolean equals = com.anythink.expressad.foundation.h.h.f.equals(context.getResources().getResourceTypeName(b2));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, b2);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b2);
                            if (loadAnimation2 != null) {
                                return new d(loadAnimation2);
                            }
                        } else {
                            throw e3;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    @l0
    private static int d(int i, boolean z) {
        if (i == 4097) {
            return z ? cx.b.e : cx.b.f;
        } else if (i == 4099) {
            return z ? cx.b.c : cx.b.d;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? cx.b.a : cx.b.b;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {
        private final ViewGroup s;
        private final View t;
        private boolean u;
        private boolean v;
        private boolean w;

        public e(@x1 Animation animation, @x1 ViewGroup viewGroup, @x1 View view) {
            super(false);
            this.w = true;
            this.s = viewGroup;
            this.t = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, @x1 Transformation transformation) {
            this.w = true;
            if (this.u) {
                return !this.v;
            }
            if (!super.getTransformation(j, transformation)) {
                this.u = true;
                mr.a(this.s, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.u && this.w) {
                this.w = false;
                this.s.post(this);
                return;
            }
            this.s.endViewTransition(this.t);
            this.v = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, @x1 Transformation transformation, float f) {
            this.w = true;
            if (this.u) {
                return !this.v;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.u = true;
                mr.a(this.s, this);
            }
            return true;
        }
    }
}