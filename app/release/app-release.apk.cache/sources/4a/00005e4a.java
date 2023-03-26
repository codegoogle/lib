package com.p7700g.p99005;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class tj0<K, A> {
    private final d<K> c;
    @z1
    public np0<A> e;
    public final List<b> a = new ArrayList(1);
    private boolean b = false;
    public float d = 0.0f;
    @z1
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.p7700g.p99005.tj0.d
        public ep0<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean c(float f) {
            return false;
        }

        @Override // com.p7700g.p99005.tj0.d
        public float d() {
            return 1.0f;
        }

        @Override // com.p7700g.p99005.tj0.d
        public float e() {
            return 0.0f;
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f);

        ep0<T> b();

        boolean c(float f);

        @g1(from = zg2.s, to = 1.0d)
        float d();

        @g1(from = zg2.s, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {
        private final List<? extends ep0<T>> a;
        private ep0<T> c = null;
        private float d = -1.0f;
        @x1
        private ep0<T> b = f(0.0f);

        public e(List<? extends ep0<T>> list) {
            this.a = list;
        }

        private ep0<T> f(float f) {
            List<? extends ep0<T>> list = this.a;
            ep0<T> ep0Var = list.get(list.size() - 1);
            if (f >= ep0Var.e()) {
                return ep0Var;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                ep0<T> ep0Var2 = this.a.get(size);
                if (this.b != ep0Var2 && ep0Var2.a(f)) {
                    return ep0Var2;
                }
            }
            return this.a.get(0);
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean a(float f) {
            ep0<T> ep0Var = this.c;
            ep0<T> ep0Var2 = this.b;
            if (ep0Var == ep0Var2 && this.d == f) {
                return true;
            }
            this.c = ep0Var2;
            this.d = f;
            return false;
        }

        @Override // com.p7700g.p99005.tj0.d
        @x1
        public ep0<T> b() {
            return this.b;
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.p7700g.p99005.tj0.d
        public float d() {
            List<? extends ep0<T>> list = this.a;
            return list.get(list.size() - 1).b();
        }

        @Override // com.p7700g.p99005.tj0.d
        public float e() {
            return this.a.get(0).e();
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {
        @x1
        private final ep0<T> a;
        private float b = -1.0f;

        public f(List<? extends ep0<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.p7700g.p99005.tj0.d
        public ep0<T> b() {
            return this.a;
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override // com.p7700g.p99005.tj0.d
        public float d() {
            return this.a.b();
        }

        @Override // com.p7700g.p99005.tj0.d
        public float e() {
            return this.a.e();
        }

        @Override // com.p7700g.p99005.tj0.d
        public boolean isEmpty() {
            return false;
        }
    }

    public tj0(List<? extends ep0<K>> list) {
        this.c = o(list);
    }

    @g1(from = zg2.s, to = 1.0d)
    private float g() {
        if (this.g == -1.0f) {
            this.g = this.c.e();
        }
        return this.g;
    }

    private static <T> d<T> o(List<? extends ep0<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public ep0<K> b() {
        ci0.a("BaseKeyframeAnimation#getCurrentKeyframe");
        ep0<K> b2 = this.c.b();
        ci0.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    @g1(from = zg2.s, to = 1.0d)
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    public float d() {
        ep0<K> b2 = b();
        if (b2 == null || b2.h()) {
            return 0.0f;
        }
        return b2.f.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        ep0<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return (this.d - b2.e()) / (b2.b() - b2.e());
    }

    public float f() {
        return this.d;
    }

    public A h() {
        A i;
        float e2 = e();
        if (this.e == null && this.c.a(e2)) {
            return this.f;
        }
        ep0<K> b2 = b();
        Interpolator interpolator = b2.g;
        if (interpolator != null && b2.h != null) {
            i = j(b2, e2, interpolator.getInterpolation(e2), b2.h.getInterpolation(e2));
        } else {
            i = i(b2, d());
        }
        this.f = i;
        return i;
    }

    public abstract A i(ep0<K> ep0Var, float f2);

    public A j(ep0<K> ep0Var, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(@g1(from = 0.0d, to = 1.0d) float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            k();
        }
    }

    public void n(@z1 np0<A> np0Var) {
        np0<A> np0Var2 = this.e;
        if (np0Var2 != null) {
            np0Var2.c(null);
        }
        this.e = np0Var;
        if (np0Var != null) {
            np0Var.c(this);
        }
    }
}