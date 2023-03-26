package com.p7700g.p99005;

import com.p7700g.p99005.b12;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.or1;
import com.p7700g.p99005.wr1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes2.dex */
public class sr1<R> implements or1.b<R>, b12.f {
    private static final c s = new c();
    private final kt1 A;
    private final kt1 B;
    private final kt1 C;
    private final AtomicInteger D;
    private gq1 E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private cs1<?> J;
    public aq1 K;
    private boolean L;
    public xr1 M;
    private boolean N;
    public wr1<?> O;
    private or1<R> P;
    private volatile boolean Q;
    private boolean R;
    public final e t;
    private final d12 u;
    private final wr1.a v;
    private final ip.a<sr1<?>> w;
    private final c x;
    private final tr1 y;
    private final kt1 z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private final az1 s;

        public a(az1 az1Var) {
            this.s = az1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.s.g()) {
                synchronized (sr1.this) {
                    if (sr1.this.t.b(this.s)) {
                        sr1.this.f(this.s);
                    }
                    sr1.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private final az1 s;

        public b(az1 az1Var) {
            this.s = az1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.s.g()) {
                synchronized (sr1.this) {
                    if (sr1.this.t.b(this.s)) {
                        sr1.this.O.b();
                        sr1.this.g(this.s);
                        sr1.this.s(this.s);
                    }
                    sr1.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    @r2
    /* loaded from: classes2.dex */
    public static class c {
        public <R> wr1<R> a(cs1<R> cs1Var, boolean z, gq1 gq1Var, wr1.a aVar) {
            return new wr1<>(cs1Var, z, true, gq1Var, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes2.dex */
    public static final class d {
        public final az1 a;
        public final Executor b;

        public d(az1 az1Var, Executor executor) {
            this.a = az1Var;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes2.dex */
    public static final class e implements Iterable<d> {
        private final List<d> s;

        public e() {
            this(new ArrayList(2));
        }

        private static d d(az1 az1Var) {
            return new d(az1Var, q02.a());
        }

        public void a(az1 az1Var, Executor executor) {
            this.s.add(new d(az1Var, executor));
        }

        public boolean b(az1 az1Var) {
            return this.s.contains(d(az1Var));
        }

        public e c() {
            return new e(new ArrayList(this.s));
        }

        public void clear() {
            this.s.clear();
        }

        public void e(az1 az1Var) {
            this.s.remove(d(az1Var));
        }

        public boolean isEmpty() {
            return this.s.isEmpty();
        }

        @Override // java.lang.Iterable
        @x1
        public Iterator<d> iterator() {
            return this.s.iterator();
        }

        public int size() {
            return this.s.size();
        }

        public e(List<d> list) {
            this.s = list;
        }
    }

    public sr1(kt1 kt1Var, kt1 kt1Var2, kt1 kt1Var3, kt1 kt1Var4, tr1 tr1Var, wr1.a aVar, ip.a<sr1<?>> aVar2) {
        this(kt1Var, kt1Var2, kt1Var3, kt1Var4, tr1Var, aVar, aVar2, s);
    }

    private kt1 j() {
        if (this.G) {
            return this.B;
        }
        return this.H ? this.C : this.A;
    }

    private boolean n() {
        return this.N || this.L || this.Q;
    }

    private synchronized void r() {
        if (this.E != null) {
            this.t.clear();
            this.E = null;
            this.O = null;
            this.J = null;
            this.N = false;
            this.Q = false;
            this.L = false;
            this.R = false;
            this.P.w(false);
            this.P = null;
            this.M = null;
            this.K = null;
            this.w.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.p7700g.p99005.or1.b
    public void a(xr1 xr1Var) {
        synchronized (this) {
            this.M = xr1Var;
        }
        o();
    }

    @Override // com.p7700g.p99005.b12.f
    @x1
    public d12 b() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.or1.b
    public void c(cs1<R> cs1Var, aq1 aq1Var, boolean z) {
        synchronized (this) {
            this.J = cs1Var;
            this.K = aq1Var;
            this.R = z;
        }
        p();
    }

    @Override // com.p7700g.p99005.or1.b
    public void d(or1<?> or1Var) {
        j().execute(or1Var);
    }

    public synchronized void e(az1 az1Var, Executor executor) {
        this.u.c();
        this.t.a(az1Var, executor);
        boolean z = true;
        if (this.L) {
            k(1);
            executor.execute(new b(az1Var));
        } else if (this.N) {
            k(1);
            executor.execute(new a(az1Var));
        } else {
            if (this.Q) {
                z = false;
            }
            x02.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @k1("this")
    public void f(az1 az1Var) {
        try {
            az1Var.a(this.M);
        } catch (Throwable th) {
            throw new ir1(th);
        }
    }

    @k1("this")
    public void g(az1 az1Var) {
        try {
            az1Var.c(this.O, this.K, this.R);
        } catch (Throwable th) {
            throw new ir1(th);
        }
    }

    public void h() {
        if (n()) {
            return;
        }
        this.Q = true;
        this.P.e();
        this.y.c(this, this.E);
    }

    public void i() {
        wr1<?> wr1Var;
        synchronized (this) {
            this.u.c();
            x02.a(n(), "Not yet complete!");
            int decrementAndGet = this.D.decrementAndGet();
            x02.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                wr1Var = this.O;
                r();
            } else {
                wr1Var = null;
            }
        }
        if (wr1Var != null) {
            wr1Var.g();
        }
    }

    public synchronized void k(int i) {
        wr1<?> wr1Var;
        x02.a(n(), "Not yet complete!");
        if (this.D.getAndAdd(i) == 0 && (wr1Var = this.O) != null) {
            wr1Var.b();
        }
    }

    @r2
    public synchronized sr1<R> l(gq1 gq1Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.E = gq1Var;
        this.F = z;
        this.G = z2;
        this.H = z3;
        this.I = z4;
        return this;
    }

    public synchronized boolean m() {
        return this.Q;
    }

    public void o() {
        synchronized (this) {
            this.u.c();
            if (this.Q) {
                r();
            } else if (!this.t.isEmpty()) {
                if (!this.N) {
                    this.N = true;
                    gq1 gq1Var = this.E;
                    e c2 = this.t.c();
                    k(c2.size() + 1);
                    this.y.b(this, gq1Var, null);
                    Iterator<d> it = c2.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.b.execute(new a(next.a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    public void p() {
        synchronized (this) {
            this.u.c();
            if (this.Q) {
                this.J.a();
                r();
            } else if (!this.t.isEmpty()) {
                if (!this.L) {
                    this.O = this.x.a(this.J, this.F, this.E, this.v);
                    this.L = true;
                    e c2 = this.t.c();
                    k(c2.size() + 1);
                    this.y.b(this, this.E, this.O);
                    Iterator<d> it = c2.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.b.execute(new b(next.a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public boolean q() {
        return this.I;
    }

    public synchronized void s(az1 az1Var) {
        boolean z;
        this.u.c();
        this.t.e(az1Var);
        if (this.t.isEmpty()) {
            h();
            if (!this.L && !this.N) {
                z = false;
                if (z && this.D.get() == 0) {
                    r();
                }
            }
            z = true;
            if (z) {
                r();
            }
        }
    }

    public synchronized void t(or1<R> or1Var) {
        this.P = or1Var;
        (or1Var.D() ? this.z : j()).execute(or1Var);
    }

    @r2
    public sr1(kt1 kt1Var, kt1 kt1Var2, kt1 kt1Var3, kt1 kt1Var4, tr1 tr1Var, wr1.a aVar, ip.a<sr1<?>> aVar2, c cVar) {
        this.t = new e();
        this.u = d12.a();
        this.D = new AtomicInteger();
        this.z = kt1Var;
        this.A = kt1Var2;
        this.B = kt1Var3;
        this.C = kt1Var4;
        this.y = tr1Var;
        this.v = aVar;
        this.w = aVar2;
        this.x = cVar;
    }
}