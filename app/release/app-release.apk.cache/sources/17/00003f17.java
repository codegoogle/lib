package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Task.java */
/* loaded from: classes.dex */
public class dq0<TResult> {
    private static volatile q d;
    private boolean j;
    private boolean k;
    @z1
    private TResult l;
    private Exception m;
    private boolean n;
    @z1
    private fq0 o;
    public static final ExecutorService a = up0.a();
    private static final Executor b = up0.b();
    public static final Executor c = tp0.d();
    @x1
    private static dq0<?> e = new dq0<>((Object) null);
    @x1
    private static dq0<Boolean> f = new dq0<>(Boolean.TRUE);
    @x1
    private static dq0<Boolean> g = new dq0<>(Boolean.FALSE);
    @x1
    private static dq0<?> h = new dq0<>(true);
    private final Object i = new Object();
    @z1
    private List<aq0<TResult, Void>> p = new ArrayList();

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class a implements aq0<TResult, Void> {
        public final /* synthetic */ eq0 a;
        public final /* synthetic */ aq0 b;
        public final /* synthetic */ Executor c;
        public final /* synthetic */ wp0 d;

        public a(eq0 eq0Var, aq0 aq0Var, Executor executor, wp0 wp0Var) {
            this.a = eq0Var;
            this.b = aq0Var;
            this.c = executor;
            this.d = wp0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public Void a(dq0<TResult> dq0Var) {
            dq0.l(this.a, this.b, dq0Var, this.c, this.d);
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class b implements aq0<TResult, Void> {
        public final /* synthetic */ eq0 a;
        public final /* synthetic */ aq0 b;
        public final /* synthetic */ Executor c;
        public final /* synthetic */ wp0 d;

        public b(eq0 eq0Var, aq0 aq0Var, Executor executor, wp0 wp0Var) {
            this.a = eq0Var;
            this.b = aq0Var;
            this.c = executor;
            this.d = wp0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public Void a(dq0<TResult> dq0Var) {
            dq0.k(this.a, this.b, dq0Var, this.c, this.d);
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class c implements aq0<TResult, dq0<TContinuationResult>> {
        public final /* synthetic */ wp0 a;
        public final /* synthetic */ aq0 b;

        public c(wp0 wp0Var, aq0 aq0Var) {
            this.a = wp0Var;
            this.b = aq0Var;
        }

        @Override // com.p7700g.p99005.aq0
        /* renamed from: b */
        public dq0<TContinuationResult> a(@x1 dq0<TResult> dq0Var) {
            wp0 wp0Var = this.a;
            if (wp0Var != null && wp0Var.a()) {
                return dq0.i();
            }
            if (dq0Var.J()) {
                return dq0.C(dq0Var.E());
            }
            if (dq0Var.H()) {
                return dq0.i();
            }
            return dq0Var.q(this.b);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class d implements aq0<TResult, dq0<TContinuationResult>> {
        public final /* synthetic */ wp0 a;
        public final /* synthetic */ aq0 b;

        public d(wp0 wp0Var, aq0 aq0Var) {
            this.a = wp0Var;
            this.b = aq0Var;
        }

        @Override // com.p7700g.p99005.aq0
        /* renamed from: b */
        public dq0<TContinuationResult> a(@x1 dq0<TResult> dq0Var) {
            wp0 wp0Var = this.a;
            if (wp0Var != null && wp0Var.a()) {
                return dq0.i();
            }
            if (dq0Var.J()) {
                return dq0.C(dq0Var.E());
            }
            if (dq0Var.H()) {
                return dq0.i();
            }
            return dq0Var.u(this.b);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class e implements Runnable {
        public final /* synthetic */ wp0 s;
        public final /* synthetic */ eq0 t;
        public final /* synthetic */ aq0 u;
        public final /* synthetic */ dq0 v;

        public e(wp0 wp0Var, eq0 eq0Var, aq0 aq0Var, dq0 dq0Var) {
            this.s = wp0Var;
            this.t = eq0Var;
            this.u = aq0Var;
            this.v = dq0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            wp0 wp0Var = this.s;
            if (wp0Var != null && wp0Var.a()) {
                this.t.b();
                return;
            }
            try {
                this.t.d(this.u.a(this.v));
            } catch (CancellationException unused) {
                this.t.b();
            } catch (Exception e) {
                this.t.c(e);
            }
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {
        public final /* synthetic */ wp0 s;
        public final /* synthetic */ eq0 t;
        public final /* synthetic */ aq0 u;
        public final /* synthetic */ dq0 v;

        /* compiled from: Task.java */
        /* loaded from: classes.dex */
        public class a implements aq0<TContinuationResult, Void> {
            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p7700g.p99005.aq0
            @z1
            /* renamed from: b */
            public Void a(@x1 dq0<TContinuationResult> dq0Var) {
                wp0 wp0Var = f.this.s;
                if (wp0Var != null && wp0Var.a()) {
                    f.this.t.b();
                    return null;
                }
                if (dq0Var.H()) {
                    f.this.t.b();
                } else if (dq0Var.J()) {
                    f.this.t.c(dq0Var.E());
                } else {
                    f.this.t.d(dq0Var.F());
                }
                return null;
            }
        }

        public f(wp0 wp0Var, eq0 eq0Var, aq0 aq0Var, dq0 dq0Var) {
            this.s = wp0Var;
            this.t = eq0Var;
            this.u = aq0Var;
            this.v = dq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            wp0 wp0Var = this.s;
            if (wp0Var != null && wp0Var.a()) {
                this.t.b();
                return;
            }
            try {
                dq0 dq0Var = (dq0) this.u.a(this.v);
                if (dq0Var == null) {
                    this.t.d(null);
                } else {
                    dq0Var.q(new a());
                }
            } catch (CancellationException unused) {
                this.t.b();
            } catch (Exception e) {
                this.t.c(e);
            }
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class g implements Runnable {
        public final /* synthetic */ eq0 s;

        public g(eq0 eq0Var) {
            this.s = eq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.g(null);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class h implements Runnable {
        public final /* synthetic */ ScheduledFuture s;
        public final /* synthetic */ eq0 t;

        public h(ScheduledFuture scheduledFuture, eq0 eq0Var) {
            this.s = scheduledFuture;
            this.t = eq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.cancel(true);
            this.t.e();
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class i implements aq0<TResult, dq0<Void>> {
        public i() {
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public dq0<Void> a(@x1 dq0<TResult> dq0Var) throws Exception {
            if (dq0Var.H()) {
                return dq0.i();
            }
            if (dq0Var.J()) {
                return dq0.C(dq0Var.E());
            }
            return dq0.D(null);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class j implements Runnable {
        public final /* synthetic */ wp0 s;
        public final /* synthetic */ eq0 t;
        public final /* synthetic */ Callable u;

        public j(wp0 wp0Var, eq0 eq0Var, Callable callable) {
            this.s = wp0Var;
            this.t = eq0Var;
            this.u = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            wp0 wp0Var = this.s;
            if (wp0Var != null && wp0Var.a()) {
                this.t.b();
                return;
            }
            try {
                this.t.d(this.u.call());
            } catch (CancellationException unused) {
                this.t.b();
            } catch (Exception e) {
                this.t.c(e);
            }
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class k implements aq0<TResult, Void> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ eq0 b;

        public k(AtomicBoolean atomicBoolean, eq0 eq0Var) {
            this.a = atomicBoolean;
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public Void a(@x1 dq0<TResult> dq0Var) {
            if (this.a.compareAndSet(false, true)) {
                this.b.d(dq0Var);
                return null;
            }
            dq0Var.E();
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class l implements aq0<Object, Void> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ eq0 b;

        public l(AtomicBoolean atomicBoolean, eq0 eq0Var) {
            this.a = atomicBoolean;
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public Void a(@x1 dq0<Object> dq0Var) {
            if (this.a.compareAndSet(false, true)) {
                this.b.d(dq0Var);
                return null;
            }
            dq0Var.E();
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class m implements aq0<Void, List<TResult>> {
        public final /* synthetic */ Collection a;

        public m(Collection collection) {
            this.a = collection;
        }

        @Override // com.p7700g.p99005.aq0
        /* renamed from: b */
        public List<TResult> a(dq0<Void> dq0Var) throws Exception {
            if (this.a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (dq0 dq0Var2 : this.a) {
                arrayList.add(dq0Var2.F());
            }
            return arrayList;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class n implements aq0<Object, Void> {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ AtomicBoolean c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ eq0 e;

        public n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, eq0 eq0Var) {
            this.a = obj;
            this.b = arrayList;
            this.c = atomicBoolean;
            this.d = atomicInteger;
            this.e = eq0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public Void a(@x1 dq0<Object> dq0Var) {
            if (dq0Var.J()) {
                synchronized (this.a) {
                    this.b.add(dq0Var.E());
                }
            }
            if (dq0Var.H()) {
                this.c.set(true);
            }
            if (this.d.decrementAndGet() == 0) {
                if (this.b.size() != 0) {
                    if (this.b.size() == 1) {
                        this.e.c((Exception) this.b.get(0));
                    } else {
                        this.e.c(new sp0(String.format("There were %d exceptions.", Integer.valueOf(this.b.size())), this.b));
                    }
                } else if (this.c.get()) {
                    this.e.b();
                } else {
                    this.e.d(null);
                }
            }
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class o implements aq0<Void, dq0<Void>> {
        public final /* synthetic */ wp0 a;
        public final /* synthetic */ Callable b;
        public final /* synthetic */ aq0 c;
        public final /* synthetic */ Executor d;
        public final /* synthetic */ zp0 e;

        public o(wp0 wp0Var, Callable callable, aq0 aq0Var, Executor executor, zp0 zp0Var) {
            this.a = wp0Var;
            this.b = callable;
            this.c = aq0Var;
            this.d = executor;
            this.e = zp0Var;
        }

        @Override // com.p7700g.p99005.aq0
        @z1
        /* renamed from: b */
        public dq0<Void> a(dq0<Void> dq0Var) throws Exception {
            wp0 wp0Var = this.a;
            if (wp0Var != null && wp0Var.a()) {
                return dq0.i();
            }
            if (((Boolean) this.b.call()).booleanValue()) {
                return dq0.D(null).R(this.c, this.d).R((aq0) this.e.a(), this.d);
            }
            return dq0.D(null);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class p extends eq0<TResult> {
        public p() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public interface q {
        void a(dq0<?> dq0Var, gq0 gq0Var);
    }

    public dq0() {
    }

    @x1
    public static dq0<Void> A(long j2, wp0 wp0Var) {
        return B(j2, up0.d(), wp0Var);
    }

    @x1
    public static dq0<Void> B(long j2, @x1 ScheduledExecutorService scheduledExecutorService, @z1 wp0 wp0Var) {
        if (wp0Var == null || !wp0Var.a()) {
            if (j2 <= 0) {
                return D(null);
            }
            eq0 eq0Var = new eq0();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new g(eq0Var), j2, TimeUnit.MILLISECONDS);
            if (wp0Var != null) {
                wp0Var.b(new h(schedule, eq0Var));
            }
            return eq0Var.a();
        }
        return i();
    }

    @x1
    public static <TResult> dq0<TResult> C(Exception exc) {
        eq0 eq0Var = new eq0();
        eq0Var.c(exc);
        return eq0Var.a();
    }

    @x1
    public static <TResult> dq0<TResult> D(@z1 TResult tresult) {
        if (tresult == null) {
            return (dq0<TResult>) e;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (dq0<TResult>) f : (dq0<TResult>) g;
        }
        eq0 eq0Var = new eq0();
        eq0Var.d(tresult);
        return eq0Var.a();
    }

    public static q G() {
        return d;
    }

    private void T() {
        synchronized (this.i) {
            for (aq0<TResult, Void> aq0Var : this.p) {
                try {
                    aq0Var.a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.p = null;
        }
    }

    public static void U(q qVar) {
        d = qVar;
    }

    @z1
    public static dq0<Void> a0(Collection<? extends dq0<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        eq0 eq0Var = new eq0();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (dq0<?> dq0Var : collection) {
            dq0Var.q(new n(obj, arrayList, atomicBoolean, atomicInteger, eq0Var));
        }
        return eq0Var.a();
    }

    @x1
    public static <TResult> dq0<List<TResult>> b0(@x1 Collection<? extends dq0<TResult>> collection) {
        return (dq0<List<TResult>>) a0(collection).L(new m(collection));
    }

    public static <TResult> dq0<TResult> c(@x1 Callable<TResult> callable) {
        return f(callable, b, null);
    }

    @z1
    public static dq0<dq0<?>> c0(Collection<? extends dq0<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        eq0 eq0Var = new eq0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (dq0<?> dq0Var : collection) {
            dq0Var.q(new l(atomicBoolean, eq0Var));
        }
        return eq0Var.a();
    }

    public static <TResult> dq0<TResult> d(@x1 Callable<TResult> callable, wp0 wp0Var) {
        return f(callable, b, wp0Var);
    }

    @z1
    public static <TResult> dq0<dq0<TResult>> d0(Collection<? extends dq0<TResult>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        eq0 eq0Var = new eq0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (dq0<TResult> dq0Var : collection) {
            dq0Var.q(new k(atomicBoolean, eq0Var));
        }
        return eq0Var.a();
    }

    public static <TResult> dq0<TResult> e(@x1 Callable<TResult> callable, @x1 Executor executor) {
        return f(callable, executor, null);
    }

    public static <TResult> dq0<TResult> f(@x1 Callable<TResult> callable, @x1 Executor executor, @z1 wp0 wp0Var) {
        eq0 eq0Var = new eq0();
        try {
            executor.execute(new j(wp0Var, eq0Var, callable));
        } catch (Exception e2) {
            eq0Var.c(new bq0(e2));
        }
        return eq0Var.a();
    }

    public static <TResult> dq0<TResult> g(@x1 Callable<TResult> callable) {
        return f(callable, a, null);
    }

    public static <TResult> dq0<TResult> h(@x1 Callable<TResult> callable, wp0 wp0Var) {
        return f(callable, a, wp0Var);
    }

    @x1
    public static <TResult> dq0<TResult> i() {
        return (dq0<TResult>) h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void k(@x1 eq0<TContinuationResult> eq0Var, @x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, dq0<TResult> dq0Var, @x1 Executor executor, @z1 wp0 wp0Var) {
        try {
            executor.execute(new f(wp0Var, eq0Var, aq0Var, dq0Var));
        } catch (Exception e2) {
            eq0Var.c(new bq0(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void l(@x1 eq0<TContinuationResult> eq0Var, @x1 aq0<TResult, TContinuationResult> aq0Var, dq0<TResult> dq0Var, @x1 Executor executor, @z1 wp0 wp0Var) {
        try {
            executor.execute(new e(wp0Var, eq0Var, aq0Var, dq0Var));
        } catch (Exception e2) {
            eq0Var.c(new bq0(e2));
        }
    }

    public static <TResult> dq0<TResult>.p y() {
        return new p();
    }

    @x1
    public static dq0<Void> z(long j2) {
        return B(j2, up0.d(), null);
    }

    public Exception E() {
        Exception exc;
        synchronized (this.i) {
            if (this.m != null) {
                this.n = true;
                fq0 fq0Var = this.o;
                if (fq0Var != null) {
                    fq0Var.a();
                    this.o = null;
                }
            }
            exc = this.m;
        }
        return exc;
    }

    @z1
    public TResult F() {
        TResult tresult;
        synchronized (this.i) {
            tresult = this.l;
        }
        return tresult;
    }

    public boolean H() {
        boolean z;
        synchronized (this.i) {
            z = this.k;
        }
        return z;
    }

    public boolean I() {
        boolean z;
        synchronized (this.i) {
            z = this.j;
        }
        return z;
    }

    public boolean J() {
        boolean z;
        synchronized (this.i) {
            z = E() != null;
        }
        return z;
    }

    @x1
    public dq0<Void> K() {
        return u(new i());
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> L(@x1 aq0<TResult, TContinuationResult> aq0Var) {
        return O(aq0Var, b, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> M(@x1 aq0<TResult, TContinuationResult> aq0Var, wp0 wp0Var) {
        return O(aq0Var, b, wp0Var);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> N(@x1 aq0<TResult, TContinuationResult> aq0Var, @x1 Executor executor) {
        return O(aq0Var, executor, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> O(@x1 aq0<TResult, TContinuationResult> aq0Var, @x1 Executor executor, @z1 wp0 wp0Var) {
        return w(new c(wp0Var, aq0Var), executor);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> P(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var) {
        return R(aq0Var, b);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> Q(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, wp0 wp0Var) {
        return S(aq0Var, b, wp0Var);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> R(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, @x1 Executor executor) {
        return S(aq0Var, executor, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> S(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, @x1 Executor executor, @z1 wp0 wp0Var) {
        return w(new d(wp0Var, aq0Var), executor);
    }

    public boolean V() {
        synchronized (this.i) {
            if (this.j) {
                return false;
            }
            this.j = true;
            this.k = true;
            this.i.notifyAll();
            T();
            return true;
        }
    }

    public boolean W(Exception exc) {
        synchronized (this.i) {
            if (this.j) {
                return false;
            }
            this.j = true;
            this.m = exc;
            this.n = false;
            this.i.notifyAll();
            T();
            if (!this.n && G() != null) {
                this.o = new fq0(this);
            }
            return true;
        }
    }

    public boolean X(@z1 TResult tresult) {
        synchronized (this.i) {
            if (this.j) {
                return false;
            }
            this.j = true;
            this.l = tresult;
            this.i.notifyAll();
            T();
            return true;
        }
    }

    public void Y() throws InterruptedException {
        synchronized (this.i) {
            if (!I()) {
                this.i.wait();
            }
        }
    }

    public boolean Z(long j2, @x1 TimeUnit timeUnit) throws InterruptedException {
        boolean I;
        synchronized (this.i) {
            if (!I()) {
                this.i.wait(timeUnit.toMillis(j2));
            }
            I = I();
        }
        return I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public <TOut> dq0<TOut> j() {
        return this;
    }

    @x1
    public dq0<Void> m(@x1 Callable<Boolean> callable, @x1 aq0<Void, dq0<Void>> aq0Var) {
        return p(callable, aq0Var, b, null);
    }

    @x1
    public dq0<Void> n(@x1 Callable<Boolean> callable, @x1 aq0<Void, dq0<Void>> aq0Var, wp0 wp0Var) {
        return p(callable, aq0Var, b, wp0Var);
    }

    @x1
    public dq0<Void> o(@x1 Callable<Boolean> callable, @x1 aq0<Void, dq0<Void>> aq0Var, @x1 Executor executor) {
        return p(callable, aq0Var, executor, null);
    }

    @x1
    public dq0<Void> p(@x1 Callable<Boolean> callable, @x1 aq0<Void, dq0<Void>> aq0Var, @x1 Executor executor, @z1 wp0 wp0Var) {
        zp0 zp0Var = new zp0();
        zp0Var.b(new o(wp0Var, callable, aq0Var, executor, zp0Var));
        return K().w((aq0) zp0Var.a(), executor);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> q(@x1 aq0<TResult, TContinuationResult> aq0Var) {
        return t(aq0Var, b, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> r(@x1 aq0<TResult, TContinuationResult> aq0Var, wp0 wp0Var) {
        return t(aq0Var, b, wp0Var);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> s(@x1 aq0<TResult, TContinuationResult> aq0Var, @x1 Executor executor) {
        return t(aq0Var, executor, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> t(@x1 aq0<TResult, TContinuationResult> aq0Var, @x1 Executor executor, wp0 wp0Var) {
        boolean I;
        eq0 eq0Var = new eq0();
        synchronized (this.i) {
            I = I();
            if (!I) {
                this.p.add(new a(eq0Var, aq0Var, executor, wp0Var));
            }
        }
        if (I) {
            l(eq0Var, aq0Var, this, executor, wp0Var);
        }
        return eq0Var.a();
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> u(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var) {
        return x(aq0Var, b, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> v(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, wp0 wp0Var) {
        return x(aq0Var, b, wp0Var);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> w(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, @x1 Executor executor) {
        return x(aq0Var, executor, null);
    }

    @x1
    public <TContinuationResult> dq0<TContinuationResult> x(@x1 aq0<TResult, dq0<TContinuationResult>> aq0Var, @x1 Executor executor, wp0 wp0Var) {
        boolean I;
        eq0 eq0Var = new eq0();
        synchronized (this.i) {
            I = I();
            if (!I) {
                this.p.add(new b(eq0Var, aq0Var, executor, wp0Var));
            }
        }
        if (I) {
            k(eq0Var, aq0Var, this, executor, wp0Var);
        }
        return eq0Var.a();
    }

    private dq0(TResult tresult) {
        X(tresult);
    }

    private dq0(boolean z) {
        if (z) {
            V();
        } else {
            X(null);
        }
    }
}