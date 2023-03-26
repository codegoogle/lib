package com.p7700g.p99005;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: SingleConnectionProbe.java */
/* loaded from: classes.dex */
public class e51 {
    @x1
    private static final kj1 a = w21.a;
    @x1
    public final ScheduledExecutorService b;
    @x1
    private final e41 c;
    @x1
    private final y41 e;
    @x1
    private final x21 f;
    private final f41 g;
    private final a51 h;
    @z1
    private lm1 j;
    @z1
    private ScheduledFuture<?> k;
    private o51 m;
    private ui1 n;
    @x1
    private final Object d = new Object();
    @x1
    private final List<g41> i = new LinkedList();
    @x1
    private yp0 l = new yp0();

    /* compiled from: SingleConnectionProbe.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        private ui1 s;
        @x1
        private final e51 t;
        @x1
        private final wp0 u;
        @x1
        private final a51 v;
        private final int w;

        /* compiled from: SingleConnectionProbe.java */
        /* renamed from: com.p7700g.p99005.e51$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0168a implements ua1<en1> {
            public final /* synthetic */ dq0 b;

            public C0168a(dq0 dq0Var) {
                this.b = dq0Var;
            }

            @Override // com.p7700g.p99005.ua1
            public void a(@x1 gc1 gc1Var) {
            }

            @Override // com.p7700g.p99005.ua1
            /* renamed from: c */
            public void b(@x1 en1 en1Var) {
                synchronized (a.this.t.d) {
                    if (en1Var == en1.CONNECTED) {
                        g41 g41Var = (g41) this.b.F();
                        w21.a.c("Running yet. State: %s. Track event for attempt: %d with result %s", en1Var, Integer.valueOf(a.this.w), g41Var);
                        if (g41Var != null) {
                            a.this.t.d(g41Var);
                        }
                        a.this.t.j(a.this.u, a.this.w + 1);
                    } else {
                        w21.a.c("Got vpn state: %s for attempt: %d", en1Var, Integer.valueOf(a.this.w));
                    }
                }
            }
        }

        public a(@x1 ui1 ui1Var, @x1 e51 e51Var, @x1 wp0 wp0Var, @x1 a51 a51Var, int i) {
            this.s = ui1Var;
            this.t = e51Var;
            this.u = wp0Var;
            this.v = a51Var;
            this.w = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            kj1 kj1Var = w21.a;
            kj1Var.c("Start test attempt: %d", Integer.valueOf(this.w));
            dq0<g41> f = this.v.f(this.u, this.w);
            try {
                f.Z(2L, TimeUnit.MINUTES);
                kj1Var.c("Finished test attempt: %d", Integer.valueOf(this.w));
                this.s.K(new C0168a(f));
            } catch (InterruptedException e) {
                kj1 kj1Var2 = w21.a;
                kj1Var2.c("Interrupted attempt: %d", Integer.valueOf(this.w));
                kj1Var2.f(e);
            }
        }
    }

    public e51(@x1 e41 e41Var, @x1 o51 o51Var, @x1 ui1 ui1Var, @x1 y41 y41Var, @x1 x21 x21Var, @x1 f41 f41Var, @x1 a51 a51Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.c = e41Var;
        this.m = o51Var;
        this.n = ui1Var;
        this.e = y41Var;
        this.f = x21Var;
        this.g = f41Var;
        this.h = a51Var;
        this.b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@x1 g41 g41Var) {
        synchronized (this.d) {
            synchronized (this.i) {
                ti1 b = g41Var.b();
                a.c("Collecting result for test %s", b);
                if (b != null && this.j != null && b.d().equals(this.j.j().d())) {
                    this.i.add(g41Var);
                }
            }
        }
    }

    private a e(wp0 wp0Var, int i) {
        return new a(this.n, this, wp0Var, this.h, i);
    }

    private /* synthetic */ Object f(dq0 dq0Var) throws Exception {
        synchronized (this.d) {
            if (this.j == null) {
                this.j = (lm1) dq0Var.F();
                this.k = this.b.schedule(e(this.l.j(), 1), this.c.a, TimeUnit.SECONDS);
            }
        }
        return null;
    }

    private /* synthetic */ Object h(dq0 dq0Var) throws Exception {
        if (dq0Var.F() == Boolean.TRUE) {
            this.f.o().q(new aq0() { // from class: com.p7700g.p99005.pz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    e51.this.g(dq0Var2);
                    return null;
                }
            });
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@x1 wp0 wp0Var, int i) {
        synchronized (this.d) {
            if (this.j != null && this.k != null) {
                w21.a.c("Schedule for attempt: %d", Integer.valueOf(i));
                this.k = this.b.schedule(e(wp0Var, i), this.c.b, TimeUnit.SECONDS);
            }
        }
    }

    public /* synthetic */ Object g(dq0 dq0Var) {
        f(dq0Var);
        return null;
    }

    public /* synthetic */ Object i(dq0 dq0Var) {
        h(dq0Var);
        return null;
    }

    public void k() {
        synchronized (this.d) {
            if (this.j != null) {
                return;
            }
            this.m.h().q(new aq0() { // from class: com.p7700g.p99005.oz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    e51.this.i(dq0Var);
                    return null;
                }
            });
        }
    }

    public void l(@x1 en1 en1Var) {
        synchronized (this.d) {
            a.c("stop", new Object[0]);
            this.l.d();
            ScheduledFuture<?> scheduledFuture = this.k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            if (this.j != null && !this.i.isEmpty()) {
                this.g.b(en1Var, this.j.j(), this.e, this.i);
            }
            this.j = null;
            this.k = null;
        }
    }
}