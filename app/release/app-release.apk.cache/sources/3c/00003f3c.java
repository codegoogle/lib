package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class ds {
    private static final boolean a = false;
    private static final String b = "WindowInsetsAnimCompat";
    private e c;

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final int a = 0;
        public static final int b = 1;
        public WindowInsets c;
        private final int d;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @i2({i2.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public b(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public void b(@x1 ds dsVar) {
        }

        public void c(@x1 ds dsVar) {
        }

        @x1
        public abstract gs d(@x1 gs gsVar, @x1 List<ds> list);

        @x1
        public a e(@x1 ds dsVar, @x1 a aVar) {
            return aVar;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c extends e {

        /* compiled from: WindowInsetsAnimationCompat.java */
        @e2(21)
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {
            private static final int a = 160;
            public final b b;
            private gs c;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: com.p7700g.p99005.ds$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0165a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ ds s;
                public final /* synthetic */ gs t;
                public final /* synthetic */ gs u;
                public final /* synthetic */ int v;
                public final /* synthetic */ View w;

                public C0165a(ds dsVar, gs gsVar, gs gsVar2, int i, View view) {
                    this.s = dsVar;
                    this.t = gsVar;
                    this.u = gsVar2;
                    this.v = i;
                    this.w = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.s.i(valueAnimator.getAnimatedFraction());
                    c.n(this.w, c.r(this.t, this.u, this.s.d(), this.v), Collections.singletonList(this.s));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ ds s;
                public final /* synthetic */ View t;

                public b(ds dsVar, View view) {
                    this.s = dsVar;
                    this.t = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.s.i(1.0f);
                    c.l(this.t, this.s);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: com.p7700g.p99005.ds$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0166c implements Runnable {
                public final /* synthetic */ View s;
                public final /* synthetic */ ds t;
                public final /* synthetic */ a u;
                public final /* synthetic */ ValueAnimator v;

                public RunnableC0166c(View view, ds dsVar, a aVar, ValueAnimator valueAnimator) {
                    this.s = view;
                    this.t = dsVar;
                    this.u = aVar;
                    this.v = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.o(this.s, this.t, this.u);
                    this.v.start();
                }
            }

            public a(@x1 View view, @x1 b bVar) {
                this.b = bVar;
                gs n0 = sr.n0(view);
                this.c = n0 != null ? new gs.b(n0).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.c = gs.L(windowInsets, view);
                    return c.p(view, windowInsets);
                }
                gs L = gs.L(windowInsets, view);
                if (this.c == null) {
                    this.c = sr.n0(view);
                }
                if (this.c == null) {
                    this.c = L;
                    return c.p(view, windowInsets);
                }
                b q = c.q(view);
                if (q != null && Objects.equals(q.c, windowInsets)) {
                    return c.p(view, windowInsets);
                }
                int i = c.i(L, this.c);
                if (i == 0) {
                    return c.p(view, windowInsets);
                }
                gs gsVar = this.c;
                ds dsVar = new ds(i, new DecelerateInterpolator(), 160L);
                dsVar.i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(dsVar.b());
                a j = c.j(L, gsVar, i);
                c.m(view, dsVar, windowInsets, false);
                duration.addUpdateListener(new C0165a(dsVar, L, gsVar, i, view));
                duration.addListener(new b(dsVar, view));
                mr.a(view, new RunnableC0166c(view, dsVar, j, duration));
                this.c = L;
                return c.p(view, windowInsets);
            }
        }

        public c(int i, @z1 Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        public static int i(@x1 gs gsVar, @x1 gs gsVar2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!gsVar.f(i2).equals(gsVar2.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @x1
        public static a j(@x1 gs gsVar, @x1 gs gsVar2, int i) {
            hj f = gsVar.f(i);
            hj f2 = gsVar2.f(i);
            return new a(hj.d(Math.min(f.b, f2.b), Math.min(f.c, f2.c), Math.min(f.d, f2.d), Math.min(f.e, f2.e)), hj.d(Math.max(f.b, f2.b), Math.max(f.c, f2.c), Math.max(f.d, f2.d), Math.max(f.e, f2.e)));
        }

        @x1
        private static View.OnApplyWindowInsetsListener k(@x1 View view, @x1 b bVar) {
            return new a(view, bVar);
        }

        public static void l(@x1 View view, @x1 ds dsVar) {
            b q = q(view);
            if (q != null) {
                q.b(dsVar);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), dsVar);
                }
            }
        }

        public static void m(View view, ds dsVar, WindowInsets windowInsets, boolean z) {
            b q = q(view);
            if (q != null) {
                q.c = windowInsets;
                if (!z) {
                    q.c(dsVar);
                    z = q.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m(viewGroup.getChildAt(i), dsVar, windowInsets, z);
                }
            }
        }

        public static void n(@x1 View view, @x1 gs gsVar, @x1 List<ds> list) {
            b q = q(view);
            if (q != null) {
                gsVar = q.d(gsVar, list);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    n(viewGroup.getChildAt(i), gsVar, list);
                }
            }
        }

        public static void o(View view, ds dsVar, a aVar) {
            b q = q(view);
            if (q != null) {
                q.e(dsVar, aVar);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    o(viewGroup.getChildAt(i), dsVar, aVar);
                }
            }
        }

        @x1
        public static WindowInsets p(@x1 View view, @x1 WindowInsets windowInsets) {
            return view.getTag(nf.e.h0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @z1
        public static b q(View view) {
            Object tag = view.getTag(nf.e.p0);
            if (tag instanceof a) {
                return ((a) tag).b;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static gs r(gs gsVar, gs gsVar2, float f, int i) {
            gs.b bVar = new gs.b(gsVar);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.c(i2, gsVar.f(i2));
                } else {
                    hj f2 = gsVar.f(i2);
                    hj f3 = gsVar2.f(i2);
                    float f4 = 1.0f - f;
                    bVar.c(i2, gs.z(f2, (int) (((f2.b - f3.b) * f4) + 0.5d), (int) (((f2.c - f3.c) * f4) + 0.5d), (int) (((f2.d - f3.d) * f4) + 0.5d), (int) (((f2.e - f3.e) * f4) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void s(@x1 View view, @z1 b bVar) {
            Object tag = view.getTag(nf.e.h0);
            if (bVar == null) {
                view.setTag(nf.e.p0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener k = k(view, bVar);
            view.setTag(nf.e.p0, k);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(k);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        private final int a;
        private float b;
        @z1
        private final Interpolator c;
        private final long d;
        private float e;

        public e(int i, @z1 Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return this.e;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            return this.b;
        }

        public float d() {
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.b);
            }
            return this.b;
        }

        @z1
        public Interpolator e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public void g(float f) {
            this.e = f;
        }

        public void h(float f) {
            this.b = f;
        }
    }

    public ds(int i, @z1 Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.c = new d(i, interpolator, j);
        } else {
            this.c = new c(i, interpolator, j);
        }
    }

    public static void h(@x1 View view, @z1 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.s(view, bVar);
        }
    }

    @e2(30)
    public static ds j(WindowInsetsAnimation windowInsetsAnimation) {
        return new ds(windowInsetsAnimation);
    }

    @g1(from = zg2.s, to = 1.0d)
    public float a() {
        return this.c.a();
    }

    public long b() {
        return this.c.b();
    }

    @g1(from = zg2.s, to = 1.0d)
    public float c() {
        return this.c.c();
    }

    public float d() {
        return this.c.d();
    }

    @z1
    public Interpolator e() {
        return this.c.e();
    }

    public int f() {
        return this.c.f();
    }

    public void g(@g1(from = 0.0d, to = 1.0d) float f) {
        this.c.g(f);
    }

    public void i(@g1(from = 0.0d, to = 1.0d) float f) {
        this.c.h(f);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class d extends e {
        @x1
        private final WindowInsetsAnimation f;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @e2(30)
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation.Callback {
            private final b a;
            private List<ds> b;
            private ArrayList<ds> c;
            private final HashMap<WindowInsetsAnimation, ds> d;

            public a(@x1 b bVar) {
                super(bVar.a());
                this.d = new HashMap<>();
                this.a = bVar;
            }

            @x1
            private ds a(@x1 WindowInsetsAnimation windowInsetsAnimation) {
                ds dsVar = this.d.get(windowInsetsAnimation);
                if (dsVar == null) {
                    ds j = ds.j(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, j);
                    return j;
                }
                return dsVar;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@x1 WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@x1 WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @x1
            public WindowInsets onProgress(@x1 WindowInsets windowInsets, @x1 List<WindowInsetsAnimation> list) {
                ArrayList<ds> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<ds> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    ds a = a(windowInsetsAnimation);
                    a.i(windowInsetsAnimation.getFraction());
                    this.c.add(a);
                }
                return this.a.d(gs.K(windowInsets), this.b).J();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @x1
            public WindowInsetsAnimation.Bounds onStart(@x1 WindowInsetsAnimation windowInsetsAnimation, @x1 WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        public d(@x1 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f = windowInsetsAnimation;
        }

        @x1
        public static WindowInsetsAnimation.Bounds i(@x1 a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().h(), aVar.b().h());
        }

        @x1
        public static hj j(@x1 WindowInsetsAnimation.Bounds bounds) {
            return hj.g(bounds.getUpperBound());
        }

        @x1
        public static hj k(@x1 WindowInsetsAnimation.Bounds bounds) {
            return hj.g(bounds.getLowerBound());
        }

        public static void l(@x1 View view, @z1 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // com.p7700g.p99005.ds.e
        public long b() {
            return this.f.getDurationMillis();
        }

        @Override // com.p7700g.p99005.ds.e
        public float c() {
            return this.f.getFraction();
        }

        @Override // com.p7700g.p99005.ds.e
        public float d() {
            return this.f.getInterpolatedFraction();
        }

        @Override // com.p7700g.p99005.ds.e
        @z1
        public Interpolator e() {
            return this.f.getInterpolator();
        }

        @Override // com.p7700g.p99005.ds.e
        public int f() {
            return this.f.getTypeMask();
        }

        @Override // com.p7700g.p99005.ds.e
        public void h(float f) {
            this.f.setFraction(f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        private final hj a;
        private final hj b;

        public a(@x1 hj hjVar, @x1 hj hjVar2) {
            this.a = hjVar;
            this.b = hjVar2;
        }

        @e2(30)
        @x1
        public static a e(@x1 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @x1
        public hj a() {
            return this.a;
        }

        @x1
        public hj b() {
            return this.b;
        }

        @x1
        public a c(@x1 hj hjVar) {
            return new a(gs.z(this.a, hjVar.b, hjVar.c, hjVar.d, hjVar.e), gs.z(this.b, hjVar.b, hjVar.c, hjVar.d, hjVar.e));
        }

        @e2(30)
        @x1
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            StringBuilder G = wo1.G("Bounds{lower=");
            G.append(this.a);
            G.append(" upper=");
            G.append(this.b);
            G.append("}");
            return G.toString();
        }

        @e2(30)
        private a(@x1 WindowInsetsAnimation.Bounds bounds) {
            this.a = d.k(bounds);
            this.b = d.j(bounds);
        }
    }

    @e2(30)
    private ds(@x1 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.c = new d(windowInsetsAnimation);
        }
    }
}