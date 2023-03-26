package com.p7700g.p99005;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: YoYo.java */
/* loaded from: classes3.dex */
public class tg3 {
    private static final long a = 1000;
    private static final long b = 0;
    public static final int c = -1;
    public static final float d = Float.MAX_VALUE;
    private og3 e;
    private long f;
    private long g;
    private boolean h;
    private int i;
    private int j;
    private Interpolator k;
    private float l;
    private float m;
    private List<Animator.AnimatorListener> n;
    private View o;

    /* compiled from: YoYo.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Animator animator);
    }

    /* compiled from: YoYo.java */
    /* loaded from: classes3.dex */
    public static class d implements Animator.AnimatorListener {
        private d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* compiled from: YoYo.java */
    /* loaded from: classes3.dex */
    public static final class e {
        private og3 a;
        private View b;

        public boolean a() {
            return this.a.g();
        }

        public boolean b() {
            return this.a.h();
        }

        public void c() {
            d(true);
        }

        public void d(boolean reset) {
            this.a.c();
            if (reset) {
                this.a.l(this.b);
            }
        }

        private e(og3 animator, View target) {
            this.b = target;
            this.a = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public og3 b() {
        this.e.s(this.o);
        float f = this.l;
        if (f == Float.MAX_VALUE) {
            View view = this.o;
            sr.d2(view, view.getMeasuredWidth() / 2.0f);
        } else {
            this.o.setPivotX(f);
        }
        float f2 = this.m;
        if (f2 == Float.MAX_VALUE) {
            View view2 = this.o;
            sr.e2(view2, view2.getMeasuredHeight() / 2.0f);
        } else {
            this.o.setPivotY(f2);
        }
        this.e.n(this.f).q(this.i).p(this.j).o(this.k).r(this.g);
        if (this.n.size() > 0) {
            for (Animator.AnimatorListener animatorListener : this.n) {
                this.e.a(animatorListener);
            }
        }
        this.e.b();
        return this.e;
    }

    public static b c(og3 animator) {
        return new b(animator);
    }

    public static b d(sg3 techniques) {
        return new b(techniques);
    }

    /* compiled from: YoYo.java */
    /* loaded from: classes3.dex */
    public static final class b {
        private List<Animator.AnimatorListener> a;
        private og3 b;
        private long c;
        private long d;
        private boolean e;
        private int f;
        private int g;
        private float h;
        private float i;
        private Interpolator j;
        private View k;

        /* compiled from: YoYo.java */
        /* loaded from: classes3.dex */
        public class a extends d {
            public final /* synthetic */ c s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final c val$callback) {
                super();
                this.s = val$callback;
            }

            @Override // com.p7700g.p99005.tg3.d, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                this.s.a(animation);
            }
        }

        /* compiled from: YoYo.java */
        /* renamed from: com.p7700g.p99005.tg3$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0244b extends d {
            public final /* synthetic */ c s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0244b(final c val$callback) {
                super();
                this.s = val$callback;
            }

            @Override // com.p7700g.p99005.tg3.d, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                this.s.a(animation);
            }
        }

        /* compiled from: YoYo.java */
        /* loaded from: classes3.dex */
        public class c extends d {
            public final /* synthetic */ c s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(final c val$callback) {
                super();
                this.s = val$callback;
            }

            @Override // com.p7700g.p99005.tg3.d, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.s.a(animation);
            }
        }

        /* compiled from: YoYo.java */
        /* loaded from: classes3.dex */
        public class d extends d {
            public final /* synthetic */ c s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(final c val$callback) {
                super();
                this.s = val$callback;
            }

            @Override // com.p7700g.p99005.tg3.d, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                this.s.a(animation);
            }
        }

        public b l(long delay) {
            this.d = delay;
            return this;
        }

        public b m(long duration) {
            this.c = duration;
            return this;
        }

        public b n(Interpolator interpolator) {
            this.j = interpolator;
            return this;
        }

        public b o(final c callback) {
            this.a.add(new c(callback));
            return this;
        }

        public b p(final c callback) {
            this.a.add(new C0244b(callback));
            return this;
        }

        public b q(final c callback) {
            this.a.add(new d(callback));
            return this;
        }

        public b r(final c callback) {
            this.a.add(new a(callback));
            return this;
        }

        public b s(float pivotX, float pivotY) {
            this.h = pivotX;
            this.i = pivotY;
            return this;
        }

        public b t(float pivotX) {
            this.h = pivotX;
            return this;
        }

        public b u(float pivotY) {
            this.i = pivotY;
            return this;
        }

        public e v(View target) {
            this.k = target;
            return new e(new tg3(this).b(), this.k);
        }

        public b w(int times) {
            if (times >= -1) {
                this.e = times != 0;
                this.f = times;
                return this;
            }
            throw new RuntimeException("Can not be less than -1, -1 is infinite loop");
        }

        public b x(int mode) {
            this.g = mode;
            return this;
        }

        public b y(Animator.AnimatorListener listener) {
            this.a.add(listener);
            return this;
        }

        private b(sg3 techniques) {
            this.a = new ArrayList();
            this.c = 1000L;
            this.d = 0L;
            this.e = false;
            this.f = 0;
            this.g = 1;
            this.h = Float.MAX_VALUE;
            this.i = Float.MAX_VALUE;
            this.b = techniques.f();
        }

        private b(og3 animator) {
            this.a = new ArrayList();
            this.c = 1000L;
            this.d = 0L;
            this.e = false;
            this.f = 0;
            this.g = 1;
            this.h = Float.MAX_VALUE;
            this.i = Float.MAX_VALUE;
            this.b = animator;
        }
    }

    private tg3(b animationComposer) {
        this.e = animationComposer.b;
        this.f = animationComposer.c;
        this.g = animationComposer.d;
        this.h = animationComposer.e;
        this.i = animationComposer.f;
        this.j = animationComposer.g;
        this.k = animationComposer.j;
        this.l = animationComposer.h;
        this.m = animationComposer.i;
        this.n = animationComposer.a;
        this.o = animationComposer.k;
    }
}