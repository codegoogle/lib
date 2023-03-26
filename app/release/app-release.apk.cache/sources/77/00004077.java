package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Pair;
import com.p7700g.p99005.xu0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: ConnectionEventsReporter.java */
/* loaded from: classes2.dex */
public class eg1 {
    @x1
    private final kj1 a;
    @x1
    private final fg1 b;
    @x1
    private final kd1 c;
    @x1
    private final a d;
    @x1
    private final uc1 e;
    @x1
    private final ScheduledExecutorService f;
    @x1
    private final mg1 g;

    /* compiled from: ConnectionEventsReporter.java */
    /* loaded from: classes2.dex */
    public interface a {
        @x1
        dq0<lm1> e();
    }

    @SuppressLint({"LambdaLast"})
    public eg1(@x1 kd1 kd1Var, @x1 a aVar, @x1 uc1 uc1Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        this(mg1.a, fg1.a(), kd1Var, aVar, uc1Var, scheduledExecutorService);
    }

    /* renamed from: A */
    public /* synthetic */ kg1 B(Exception exc, List list, lm1 lm1Var, lm1 lm1Var2, kg1 kg1Var, ti1 ti1Var, Bundle bundle) throws Exception {
        this.a.d(exc, "Tracking connection start details with exception ", new Object[0]);
        lg1 lg1Var = new lg1();
        b(list, lg1Var);
        JSONArray d = lm1Var.e((lm1) r81.f(lm1Var2)).d();
        lg1Var.Q(kg1Var.P()).R(d.toString()).c(exc).y(ti1Var).B(bundle).C(this.e.h()).E(this.e.d()).G(kg1Var.m()).H((String) r81.f(kg1Var.n())).I(kg1Var.o()).J(kg1Var.p()).K(kg1Var.r()).L(kg1Var.s()).M(kg1Var.t()).N(kg1Var.u());
        this.g.c(lg1Var);
        return lg1Var;
    }

    /* renamed from: C */
    public /* synthetic */ dq0 D(kg1 kg1Var, ti1 ti1Var, lm1 lm1Var, Bundle bundle, dq0 dq0Var, Exception exc, dq0 dq0Var2) throws Exception {
        return Q(kg1Var, dq0Var2, ti1Var, lm1Var, bundle, (lm1) U(dq0Var), exc);
    }

    /* renamed from: E */
    public /* synthetic */ dq0 F(final ti1 ti1Var, final Exception exc, final kg1 kg1Var, final lm1 lm1Var, final Bundle bundle, final dq0 dq0Var) throws Exception {
        this.a.c("Start vpn task is cancelled, check timeout, test network and report start details", new Object[0]);
        return L(ti1Var, exc).w(new aq0() { // from class: com.p7700g.p99005.wf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return eg1.this.D(kg1Var, ti1Var, lm1Var, bundle, dq0Var, exc, dq0Var2);
            }
        }, this.f);
    }

    private /* synthetic */ dq0 G(dq0 dq0Var) throws Exception {
        return this.d.e();
    }

    /* renamed from: I */
    public /* synthetic */ dq0 J(kg1 kg1Var, ti1 ti1Var, lm1 lm1Var, Bundle bundle, dq0 dq0Var) throws Exception {
        return R(kg1Var, Collections.emptyList(), ti1Var, lm1Var, bundle, (lm1) U(dq0Var), null);
    }

    private boolean K(@z1 Exception exc) {
        return (!(exc instanceof gc1) || (exc instanceof hc1) || (exc instanceof jc1)) ? false : true;
    }

    @x1
    private dq0<List<nd1>> L(@x1 ti1 ti1Var, @z1 Exception exc) {
        if ((exc instanceof rb1) && System.currentTimeMillis() - ti1Var.e() <= this.b.b()) {
            return dq0.D(Collections.emptyList());
        }
        this.a.c("Connection was too long, test network on cancel", new Object[0]);
        return (dq0) r81.f(this.c.i());
    }

    @x1
    private dq0<ig1> N(@x1 final ig1 ig1Var, @x1 final List<nd1> list, @z1 final Exception exc) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.xf1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eg1.this.q(ig1Var, exc, list);
            }
        }, this.f);
    }

    @x1
    private dq0<kg1> O(@x1 @xu0.d final String str, @x1 final ti1 ti1Var, @x1 final Bundle bundle, @z1 final Exception exc, @x1 final lm1 lm1Var) {
        this.a.d(exc, "Report connection start with start vpn.", new Object[0]);
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.bg1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eg1.this.v(exc, lm1Var, ti1Var, bundle, str);
            }
        }, this.f);
    }

    @x1
    private dq0<kg1> Q(@x1 kg1 kg1Var, @x1 dq0<List<nd1>> dq0Var, @x1 ti1 ti1Var, @x1 lm1 lm1Var, @x1 Bundle bundle, @x1 lm1 lm1Var2, @z1 Exception exc) {
        return R(kg1Var, f(dq0Var), ti1Var, lm1Var, bundle, lm1Var2, exc);
    }

    @x1
    private dq0<kg1> R(@x1 final kg1 kg1Var, @x1 final List<nd1> list, @x1 final ti1 ti1Var, @x1 final lm1 lm1Var, @x1 final Bundle bundle, @x1 final lm1 lm1Var2, @z1 final Exception exc) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.rf1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eg1.this.B(exc, list, lm1Var2, lm1Var, kg1Var, ti1Var, bundle);
            }
        }, this.f);
    }

    @x1
    private dq0<kg1> S(@x1 final kg1 kg1Var, @x1 final lm1 lm1Var, @x1 final ti1 ti1Var, @x1 final Bundle bundle, @z1 final Exception exc) {
        return this.d.e().R(new aq0() { // from class: com.p7700g.p99005.cg1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.F(ti1Var, exc, kg1Var, lm1Var, bundle, dq0Var);
            }
        }, this.f);
    }

    @x1
    private dq0<kg1> T(@x1 final kg1 kg1Var, @x1 final ti1 ti1Var, @x1 final Bundle bundle, @x1 final lm1 lm1Var, @x1 wp0 wp0Var) {
        this.a.c("Start vpn task is ok, report connection", new Object[0]);
        return d(this.b.d(), wp0Var).u(new aq0() { // from class: com.p7700g.p99005.nf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.H(dq0Var);
            }
        }).R(new aq0() { // from class: com.p7700g.p99005.tf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.J(kg1Var, ti1Var, lm1Var, bundle, dq0Var);
            }
        }, this.f);
    }

    @x1
    private static <T> T U(dq0<T> dq0Var) {
        return (T) r81.g(dq0Var.F(), "task must have not null result");
    }

    private void a(@x1 List<nd1> list, @x1 jg1 jg1Var) {
        if (list.isEmpty()) {
            return;
        }
        jg1Var.V(kd1.b(list)).D(kd1.f(list)).F(kd1.e(list));
    }

    private void b(@x1 List<nd1> list, @x1 lg1 lg1Var) {
        if (list.isEmpty()) {
            return;
        }
        lg1Var.T(kd1.b(list)).D(kd1.f(list)).F(kd1.e(list));
    }

    private static double c(int i) {
        return (i + 1) * 0.2d;
    }

    @x1
    private dq0<Void> d(long j, @z1 wp0 wp0Var) {
        if (wp0Var == null || !wp0Var.a()) {
            if (j <= 0) {
                return dq0.D(null);
            }
            final eq0 eq0Var = new eq0();
            final ScheduledFuture<?> schedule = this.f.schedule(new Runnable() { // from class: com.p7700g.p99005.yf1
                @Override // java.lang.Runnable
                public final void run() {
                    eq0.this.g(null);
                }
            }, j, TimeUnit.MILLISECONDS);
            if (wp0Var != null) {
                wp0Var.b(new Runnable() { // from class: com.p7700g.p99005.ag1
                    @Override // java.lang.Runnable
                    public final void run() {
                        eg1.i(schedule, eq0Var);
                    }
                });
            }
            return eq0Var.a();
        }
        return dq0.i();
    }

    private int e(@x1 Exception exc) {
        if (exc instanceof kc1) {
            return ((kc1) exc).getCode();
        }
        return 0;
    }

    @x1
    private List<nd1> f(@x1 dq0<List<nd1>> dq0Var) {
        if (dq0Var.J()) {
            this.a.g(dq0Var.E(), "Network probs failed", new Object[0]);
            return Collections.emptyList();
        } else if (dq0Var.F() == null) {
            this.a.e("Network probs is null", new Object[0]);
            return Collections.emptyList();
        } else {
            return dq0Var.F();
        }
    }

    @x1
    private dq0<ig1> g(@x1 final kg1 kg1Var, @x1 @xu0.d final String str, @x1 final bn1 bn1Var, @z1 final Exception exc) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.of1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eg1.this.k(kg1Var, bn1Var, exc, str);
            }
        }, this.f);
    }

    public static /* synthetic */ void i(ScheduledFuture scheduledFuture, eq0 eq0Var) {
        scheduledFuture.cancel(true);
        eq0Var.e();
    }

    /* renamed from: j */
    public /* synthetic */ ig1 k(kg1 kg1Var, bn1 bn1Var, Exception exc, String str) throws Exception {
        this.a.c("Tracking connection end", new Object[0]);
        long currentTimeMillis = (System.currentTimeMillis() - kg1Var.f()) - kg1Var.P();
        ig1 ig1Var = new ig1();
        ig1Var.S(bn1Var.c()).T(bn1Var.d()).U(currentTimeMillis).c(exc).x(kg1Var.e()).z(kg1Var.f()).B(kg1Var.h()).C(this.e.h()).E(this.e.d()).G(kg1Var.m()).H(str).I(kg1Var.o()).J(kg1Var.p()).K(kg1Var.r()).L(kg1Var.s()).M(kg1Var.t()).N(kg1Var.u());
        this.g.c(ig1Var);
        return ig1Var;
    }

    /* renamed from: l */
    public /* synthetic */ dq0 m(dq0 dq0Var, dq0 dq0Var2, Exception exc, dq0 dq0Var3) throws Exception {
        return N((ig1) U(dq0Var), f(dq0Var2), exc);
    }

    /* renamed from: n */
    public /* synthetic */ dq0 o(final Exception exc, final dq0 dq0Var) throws Exception {
        this.a.d(exc, "Event connection end sent, prepare connection notifyStopped details, exception is", new Object[0]);
        final dq0 D = K(exc) ? (dq0) r81.f(this.c.i()) : dq0.D(Collections.emptyList());
        return D.w(new aq0() { // from class: com.p7700g.p99005.sf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return eg1.this.m(dq0Var, D, exc, dq0Var2);
            }
        }, this.f);
    }

    /* renamed from: p */
    public /* synthetic */ ig1 q(ig1 ig1Var, Exception exc, List list) throws Exception {
        this.a.c("Tracking connection end details", new Object[0]);
        jg1 jg1Var = new jg1();
        jg1Var.S(ig1Var.P()).T(ig1Var.Q()).U(ig1Var.R()).c(exc).x(ig1Var.e()).z(ig1Var.f()).B(ig1Var.h()).C(this.e.h()).E(this.e.d()).G(ig1Var.m()).H((String) r81.f(ig1Var.n())).I(ig1Var.o()).J(ig1Var.p()).K(ig1Var.r()).L(ig1Var.s()).M(ig1Var.t()).N(ig1Var.u());
        a(list, jg1Var);
        this.g.c(jg1Var);
        return jg1Var;
    }

    private /* synthetic */ dq0 r(dq0 dq0Var) throws Exception {
        return this.d.e();
    }

    public static /* synthetic */ Pair t(lm1 lm1Var, dq0 dq0Var) throws Exception {
        return new Pair((kg1) dq0Var.F(), lm1Var);
    }

    /* renamed from: u */
    public /* synthetic */ kg1 v(Exception exc, lm1 lm1Var, ti1 ti1Var, Bundle bundle, String str) throws Exception {
        this.a.d(exc, "Tracking connection start with exception", new Object[0]);
        List<km1> p = exc == null ? lm1Var.p() : lm1Var.l();
        km1 km1Var = !p.isEmpty() ? p.get(0) : null;
        sc1 d = this.e.d();
        kg1 Q = new kg1().Q(System.currentTimeMillis() - ti1Var.e());
        int i = bundle.getInt(xu0.f.r, 0);
        String string = bundle.getString(xu0.f.s, null);
        this.a.c(wo1.t("sd_tag = ", string), new Object[0]);
        this.g.c(Q.c(exc).y(ti1Var).B(bundle).C(this.e.h()).E(d).G(lm1Var.m()).H(str).I(i).J(string).K(km1Var == null ? "" : km1Var.d()).M(lm1Var.o()).N(lm1Var.n()));
        return Q;
    }

    /* renamed from: w */
    public /* synthetic */ dq0 x(String str, ti1 ti1Var, Bundle bundle, Exception exc, dq0 dq0Var) throws Exception {
        final lm1 lm1Var = (lm1) U(dq0Var);
        return O(str, ti1Var, bundle, exc, lm1Var).L(new aq0() { // from class: com.p7700g.p99005.qf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return eg1.t(lm1.this, dq0Var2);
            }
        });
    }

    /* renamed from: y */
    public /* synthetic */ dq0 z(Exception exc, ti1 ti1Var, Bundle bundle, wp0 wp0Var, dq0 dq0Var) throws Exception {
        this.a.d(exc, "Report connection start detailed with start vpn.", new Object[0]);
        Pair pair = (Pair) U(dq0Var);
        kg1 kg1Var = (kg1) pair.first;
        lm1 lm1Var = (lm1) pair.second;
        if (exc == null) {
            return T(kg1Var, ti1Var, bundle, lm1Var, wp0Var);
        }
        this.a.c("Start vpn task is failed, test network and report start details", new Object[0]);
        return S(kg1Var, lm1Var, ti1Var, bundle, exc);
    }

    public /* synthetic */ dq0 H(dq0 dq0Var) {
        return this.d.e();
    }

    @x1
    public dq0<ig1> M(@x1 kg1 kg1Var, @x1 @xu0.d String str, @x1 bn1 bn1Var, @z1 final Exception exc) {
        return g(kg1Var, str, bn1Var, exc).R(new aq0() { // from class: com.p7700g.p99005.vf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.o(exc, dq0Var);
            }
        }, this.f);
    }

    @x1
    public dq0<kg1> P(@x1 @xu0.d final String str, @x1 final ti1 ti1Var, @x1 final wp0 wp0Var, @x1 final Bundle bundle, @z1 final Exception exc) {
        return d(this.b.c(), null).u(new aq0() { // from class: com.p7700g.p99005.pf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.s(dq0Var);
            }
        }).R(new aq0() { // from class: com.p7700g.p99005.uf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.x(str, ti1Var, bundle, exc, dq0Var);
            }
        }, this.f).R(new aq0() { // from class: com.p7700g.p99005.zf1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return eg1.this.z(exc, ti1Var, bundle, wp0Var, dq0Var);
            }
        }, this.f);
    }

    public /* synthetic */ dq0 s(dq0 dq0Var) {
        return this.d.e();
    }

    @r2
    public eg1(@x1 mg1 mg1Var, @x1 fg1 fg1Var, @x1 kd1 kd1Var, @x1 a aVar, @x1 uc1 uc1Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.a = kj1.b("ConnectionEventsReporter");
        this.g = mg1Var;
        this.b = fg1Var;
        this.c = kd1Var;
        this.d = aVar;
        this.e = uc1Var;
        this.f = scheduledExecutorService;
    }
}