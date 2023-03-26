package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class tc0 implements Runnable {
    public static final String s = tb0.f("WorkerWrapper");
    private hb0 B;
    private de0 C;
    private WorkDatabase D;
    private xe0 E;
    private ge0 F;
    private af0 G;
    private List<String> H;
    private String I;
    private volatile boolean L;
    public Context t;
    private String u;
    private List<mc0> v;
    private WorkerParameters.a w;
    public we0 x;
    public ListenableWorker y;
    public cg0 z;
    @x1
    public ListenableWorker.a A = ListenableWorker.a.a();
    @x1
    public zf0<Boolean> J = zf0.v();
    @z1
    public gn2<ListenableWorker.a> K = null;

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ gn2 s;
        public final /* synthetic */ zf0 t;

        public a(final gn2 val$runExpedited, final zf0 val$future) {
            this.s = val$runExpedited;
            this.t = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.get();
                tb0.c().a(tc0.s, String.format("Starting work for %s", tc0.this.x.f), new Throwable[0]);
                tc0 tc0Var = tc0.this;
                tc0Var.K = tc0Var.y.startWork();
                this.t.s(tc0.this.K);
            } catch (Throwable th) {
                this.t.r(th);
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ zf0 s;
        public final /* synthetic */ String t;

        public b(final zf0 val$future, final String val$workDescription) {
            this.s = val$future;
            this.t = val$workDescription;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.s.get();
                    if (aVar == null) {
                        tb0.c().b(tc0.s, String.format("%s returned a null result. Treating it as a failure.", tc0.this.x.f), new Throwable[0]);
                    } else {
                        tb0.c().a(tc0.s, String.format("%s returned a %s result.", tc0.this.x.f, aVar), new Throwable[0]);
                        tc0.this.A = aVar;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    tb0.c().b(tc0.s, String.format("%s failed because it threw an exception/error", this.t), e);
                } catch (CancellationException e2) {
                    tb0.c().d(tc0.s, String.format("%s was cancelled", this.t), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    tb0.c().b(tc0.s, String.format("%s failed because it threw an exception/error", this.t), e);
                }
            } finally {
                tc0.this.f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class c {
        @x1
        public Context a;
        @z1
        public ListenableWorker b;
        @x1
        public de0 c;
        @x1
        public cg0 d;
        @x1
        public hb0 e;
        @x1
        public WorkDatabase f;
        @x1
        public String g;
        public List<mc0> h;
        @x1
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, @x1 de0 foregroundProcessor, @x1 WorkDatabase database, @x1 String workSpecId) {
            this.a = context.getApplicationContext();
            this.d = workTaskExecutor;
            this.c = foregroundProcessor;
            this.e = configuration;
            this.f = database;
            this.g = workSpecId;
        }

        @x1
        public tc0 a() {
            return new tc0(this);
        }

        @x1
        public c b(@z1 WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.i = runtimeExtras;
            }
            return this;
        }

        @x1
        public c c(@x1 List<mc0> schedulers) {
            this.h = schedulers;
            return this;
        }

        @x1
        @r2
        public c d(@x1 ListenableWorker worker) {
            this.b = worker;
            return this;
        }
    }

    public tc0(@x1 c builder) {
        this.t = builder.a;
        this.z = builder.d;
        this.C = builder.c;
        this.u = builder.g;
        this.v = builder.h;
        this.w = builder.i;
        this.y = builder.b;
        this.B = builder.e;
        WorkDatabase workDatabase = builder.f;
        this.D = workDatabase;
        this.E = workDatabase.L();
        this.F = this.D.C();
        this.G = this.D.M();
    }

    private String a(List<String> tags) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.u);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : tags) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a result) {
        if (result instanceof ListenableWorker.a.c) {
            tb0.c().d(s, String.format("Worker result SUCCESS for %s", this.I), new Throwable[0]);
            if (this.x.d()) {
                h();
            } else {
                m();
            }
        } else if (result instanceof ListenableWorker.a.b) {
            tb0.c().d(s, String.format("Worker result RETRY for %s", this.I), new Throwable[0]);
            g();
        } else {
            tb0.c().d(s, String.format("Worker result FAILURE for %s", this.I), new Throwable[0]);
            if (this.x.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.E.t(str) != dc0.a.CANCELLED) {
                this.E.b(dc0.a.FAILED, str);
            }
            linkedList.addAll(this.F.b(str));
        }
    }

    private void g() {
        this.D.c();
        try {
            this.E.b(dc0.a.ENQUEUED, this.u);
            this.E.C(this.u, System.currentTimeMillis());
            this.E.d(this.u, -1L);
            this.D.A();
        } finally {
            this.D.i();
            i(true);
        }
    }

    private void h() {
        this.D.c();
        try {
            this.E.C(this.u, System.currentTimeMillis());
            this.E.b(dc0.a.ENQUEUED, this.u);
            this.E.v(this.u);
            this.E.d(this.u, -1L);
            this.D.A();
        } finally {
            this.D.i();
            i(false);
        }
    }

    private void i(final boolean needsReschedule) {
        ListenableWorker listenableWorker;
        this.D.c();
        try {
            if (!this.D.L().q()) {
                if0.c(this.t, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.E.b(dc0.a.ENQUEUED, this.u);
                this.E.d(this.u, -1L);
            }
            if (this.x != null && (listenableWorker = this.y) != null && listenableWorker.isRunInForeground()) {
                this.C.b(this.u);
            }
            this.D.A();
            this.D.i();
            this.J.q(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.D.i();
            throw th;
        }
    }

    private void j() {
        dc0.a t = this.E.t(this.u);
        if (t == dc0.a.RUNNING) {
            tb0.c().a(s, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.u), new Throwable[0]);
            i(true);
            return;
        }
        tb0.c().a(s, String.format("Status for %s is %s; not doing any work", this.u, t), new Throwable[0]);
        i(false);
    }

    private void k() {
        kb0 b2;
        if (n()) {
            return;
        }
        this.D.c();
        try {
            we0 u = this.E.u(this.u);
            this.x = u;
            if (u == null) {
                tb0.c().b(s, String.format("Didn't find WorkSpec for id %s", this.u), new Throwable[0]);
                i(false);
                this.D.A();
            } else if (u.e != dc0.a.ENQUEUED) {
                j();
                this.D.A();
                tb0.c().a(s, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.x.f), new Throwable[0]);
            } else {
                if (u.d() || this.x.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    we0 we0Var = this.x;
                    if (!(we0Var.q == 0) && currentTimeMillis < we0Var.a()) {
                        tb0.c().a(s, String.format("Delaying execution for %s because it is being executed before schedule.", this.x.f), new Throwable[0]);
                        i(true);
                        this.D.A();
                        return;
                    }
                }
                this.D.A();
                this.D.i();
                if (this.x.d()) {
                    b2 = this.x.h;
                } else {
                    rb0 b3 = this.B.f().b(this.x.g);
                    if (b3 == null) {
                        tb0.c().b(s, String.format("Could not create Input Merger %s", this.x.g), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.x.h);
                    arrayList.addAll(this.E.A(this.u));
                    b2 = b3.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.u), b2, this.H, this.w, this.x.n, this.B.e(), this.z, this.B.m(), new vf0(this.D, this.z), new uf0(this.D, this.C, this.z));
                if (this.y == null) {
                    this.y = this.B.m().b(this.t, this.x.f, workerParameters);
                }
                ListenableWorker listenableWorker = this.y;
                if (listenableWorker == null) {
                    tb0.c().b(s, String.format("Could not create Worker %s", this.x.f), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    tb0.c().b(s, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.x.f), new Throwable[0]);
                    l();
                } else {
                    this.y.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        zf0 v = zf0.v();
                        tf0 tf0Var = new tf0(this.t, this.x, this.y, workerParameters.b(), this.z);
                        this.z.b().execute(tf0Var);
                        gn2<Void> a2 = tf0Var.a();
                        a2.a(new a(a2, v), this.z.b());
                        v.a(new b(v, this.I), this.z.d());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.D.i();
        }
    }

    private void m() {
        this.D.c();
        try {
            this.E.b(dc0.a.SUCCEEDED, this.u);
            this.E.k(this.u, ((ListenableWorker.a.c) this.A).c());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.F.b(this.u)) {
                if (this.E.t(str) == dc0.a.BLOCKED && this.F.c(str)) {
                    tb0.c().d(s, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.E.b(dc0.a.ENQUEUED, str);
                    this.E.C(str, currentTimeMillis);
                }
            }
            this.D.A();
        } finally {
            this.D.i();
            i(false);
        }
    }

    private boolean n() {
        if (this.L) {
            tb0.c().a(s, String.format("Work interrupted for %s", this.I), new Throwable[0]);
            dc0.a t = this.E.t(this.u);
            if (t == null) {
                i(false);
            } else {
                i(!t.f());
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        this.D.c();
        try {
            boolean z = true;
            if (this.E.t(this.u) == dc0.a.ENQUEUED) {
                this.E.b(dc0.a.RUNNING, this.u);
                this.E.B(this.u);
            } else {
                z = false;
            }
            this.D.A();
            return z;
        } finally {
            this.D.i();
        }
    }

    @x1
    public gn2<Boolean> b() {
        return this.J;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void d() {
        boolean z;
        this.L = true;
        n();
        gn2<ListenableWorker.a> gn2Var = this.K;
        if (gn2Var != null) {
            z = gn2Var.isDone();
            this.K.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.y;
        if (listenableWorker != null && !z) {
            listenableWorker.stop();
        } else {
            tb0.c().a(s, String.format("WorkSpec %s is already done. Not interrupting.", this.x), new Throwable[0]);
        }
    }

    public void f() {
        if (!n()) {
            this.D.c();
            try {
                dc0.a t = this.E.t(this.u);
                this.D.K().a(this.u);
                if (t == null) {
                    i(false);
                } else if (t == dc0.a.RUNNING) {
                    c(this.A);
                } else if (!t.f()) {
                    g();
                }
                this.D.A();
            } finally {
                this.D.i();
            }
        }
        List<mc0> list = this.v;
        if (list != null) {
            for (mc0 mc0Var : list) {
                mc0Var.e(this.u);
            }
            nc0.b(this.B, this.D, this.v);
        }
    }

    @r2
    public void l() {
        this.D.c();
        try {
            e(this.u);
            this.E.k(this.u, ((ListenableWorker.a.C0004a) this.A).c());
            this.D.A();
        } finally {
            this.D.i();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    @s2
    public void run() {
        List<String> b2 = this.G.b(this.u);
        this.H = b2;
        this.I = a(b2);
        k();
    }
}