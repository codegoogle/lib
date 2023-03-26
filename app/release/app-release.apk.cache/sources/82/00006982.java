package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.p7700g.p99005.cn1;
import com.p7700g.p99005.xu0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ServiceControl.java */
/* loaded from: classes2.dex */
public class zm1 implements jn1, yd1, cn1.a {
    @x1
    private final jb1 A;
    @x1
    private final ib1 B;
    @x1
    private final jn1 C;
    @x1
    private final yd1 D;
    @x1
    private jd1 E;
    @x1
    private final jd1 F;
    @x1
    private final d G;
    @x1
    private final nb1 H;
    @z1
    private hn1 I;
    @z1
    private volatile fo1 J;
    @z1
    private dq0<kg1> K;
    @z1
    private yp0 L = null;
    @z1
    private yp0 M = null;
    @z1
    private jn1 N;
    @z1
    private dq0<Boolean> O;
    @z1
    private qe1 P;
    @z1
    private wd1 Q;
    @x1
    private final lb1 R;
    @x1
    private final kj1 s;
    @x1
    private final ob1 t;
    @x1
    private final cn1 u;
    @x1
    private final mb1 v;
    @x1
    private final ln1 w;
    @x1
    private final Executor x;
    @x1
    private final ScheduledExecutorService y;
    @x1
    private final Context z;

    /* compiled from: ServiceControl.java */
    /* loaded from: classes2.dex */
    public class a implements va1 {
        public final /* synthetic */ va1 b;

        public a(va1 va1Var) {
            zm1.this = r1;
            this.b = va1Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.b.a(gc1Var);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            this.b.complete();
        }
    }

    /* compiled from: ServiceControl.java */
    /* loaded from: classes2.dex */
    public class b implements jn1 {
        public final /* synthetic */ ScheduledFuture s;
        public final /* synthetic */ eq0 t;

        public b(ScheduledFuture scheduledFuture, eq0 eq0Var) {
            zm1.this = r1;
            this.s = scheduledFuture;
            this.t = eq0Var;
        }

        @Override // com.p7700g.p99005.jn1
        public /* synthetic */ void a(long j, long j2) {
            in1.a(this, j, j2);
        }

        @Override // com.p7700g.p99005.jn1
        public /* synthetic */ void b(Parcelable parcelable) {
            in1.b(this, parcelable);
        }

        @Override // com.p7700g.p99005.jn1
        public void h() {
            ScheduledFuture scheduledFuture = this.s;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.t.g(null);
        }

        @Override // com.p7700g.p99005.jn1
        public void i(@x1 kc1 kc1Var) {
            ScheduledFuture scheduledFuture = this.s;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.t.f(kc1Var);
        }
    }

    /* compiled from: ServiceControl.java */
    /* loaded from: classes2.dex */
    public class c implements va1 {
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ boolean c;

        public c(Runnable runnable, boolean z) {
            zm1.this = r1;
            this.b = runnable;
            this.c = z;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            zm1.this.s.f(gc1Var);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
                if (!this.c || ((qe1) r81.f(zm1.this.P)).m()) {
                    return;
                }
                zm1.this.H0(xu0.e.h, va1.a, gc1.withMessage("Reconnection cancelled"));
            }
        }
    }

    /* compiled from: ServiceControl.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a(@x1 ve1 ve1Var);

        void f();

        void h();
    }

    public zm1(@x1 Context context, @x1 jb1 jb1Var, @x1 kj1 kj1Var, @x1 ob1 ob1Var, @x1 cn1 cn1Var, @x1 ib1 ib1Var, @x1 mb1 mb1Var, @x1 ln1 ln1Var, @x1 d dVar, @x1 nb1 nb1Var, @x1 lb1 lb1Var, @x1 Executor executor, @x1 ScheduledExecutorService scheduledExecutorService, @x1 jd1 jd1Var, @x1 jd1 jd1Var2) {
        this.z = context;
        this.A = jb1Var;
        this.s = kj1Var;
        this.t = ob1Var;
        this.u = cn1Var;
        this.B = ib1Var;
        this.v = mb1Var;
        this.w = ln1Var;
        this.x = executor;
        this.y = scheduledExecutorService;
        this.R = lb1Var;
        this.H = nb1Var;
        this.G = dVar;
        this.C = new kn1(this, executor);
        this.D = new ym1(this, executor);
        this.E = jd1Var;
        this.F = jd1Var2;
    }

    private /* synthetic */ dq0 A(Bundle bundle, String str, zp0 zp0Var, dq0 dq0Var) throws Exception {
        return this.v.d(bundle, str, dq0Var, (fo1) zp0Var.a());
    }

    private /* synthetic */ Object C(final Bundle bundle, final String str, final String str2, final co1 co1Var, final va1 va1Var, dq0 dq0Var) throws Exception {
        final wp0 wp0Var = (wp0) r81.f((wp0) dq0Var.F());
        final jb1 jb1Var = this.A;
        Objects.requireNonNull(jb1Var);
        wp0Var.b(new Runnable() { // from class: com.p7700g.p99005.hm1
            @Override // java.lang.Runnable
            public final void run() {
                jb1.this.a();
            }
        });
        final zp0 zp0Var = new zp0();
        this.K = dq0.D(this.t.c()).x(new aq0() { // from class: com.p7700g.p99005.ql1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.x(wp0Var, dq0Var2);
            }
        }, this.x, wp0Var).L(new aq0() { // from class: com.p7700g.p99005.ml1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                zm1.this.I(dq0Var2);
                return null;
            }
        }).P(new aq0() { // from class: com.p7700g.p99005.xl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.K(bundle, wp0Var, dq0Var2);
            }
        }).P(new aq0() { // from class: com.p7700g.p99005.cl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.P(str, str2, co1Var, bundle, wp0Var, dq0Var2);
            }
        }).S(new aq0() { // from class: com.p7700g.p99005.bl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                zm1.this.R(zp0Var, dq0Var2);
                return dq0Var2;
            }
        }, this.x, wp0Var).S(new aq0() { // from class: com.p7700g.p99005.zk1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.T(wp0Var, dq0Var2);
            }
        }, this.x, wp0Var).w(new aq0() { // from class: com.p7700g.p99005.fl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.V(va1Var, dq0Var2);
            }
        }, this.x).P(new aq0() { // from class: com.p7700g.p99005.uk1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.z(str, bundle, dq0Var2);
            }
        }).w(new aq0() { // from class: com.p7700g.p99005.vl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.B(bundle, str2, zp0Var, dq0Var2);
            }
        }, this.x);
        return null;
    }

    @x1
    private List<gc1> C0(@x1 List<gc1> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator() { // from class: com.p7700g.p99005.al1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zm1.this.v((gc1) obj, (gc1) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ Object E(va1 va1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            va1Var.a(gc1.cast(dq0Var.E()));
            return null;
        }
        return null;
    }

    @z1
    private ScheduledFuture<?> E0(@x1 final eq0<fo1> eq0Var, final int i) {
        if (i > 0) {
            return this.y.schedule(new Runnable() { // from class: com.p7700g.p99005.pl1
                @Override // java.lang.Runnable
                public final void run() {
                    zm1.W(eq0.this, i);
                }
            }, i, TimeUnit.MILLISECONDS);
        }
        return null;
    }

    /* renamed from: F */
    public /* synthetic */ dq0 G(boolean z, final va1 va1Var, final String str, final String str2, final co1 co1Var, final Bundle bundle, dq0 dq0Var) throws Exception {
        this.s.c("Last stop complete result: %s error: %s cancelled: %s", dq0Var.F(), dq0Var.E(), Boolean.valueOf(dq0Var.H()));
        boolean z2 = !((qe1) r81.f(this.P)).m();
        this.s.c("Starting from reconnect: %s scheduled: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z && z2) {
            va1Var.a(gc1.vpnConnectCanceled());
            return l();
        }
        return w0(str, str2, co1Var, bundle).N(new aq0() { // from class: com.p7700g.p99005.gl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                zm1.this.D(bundle, str, str2, co1Var, va1Var, dq0Var2);
                return null;
            }
        }, this.x).q(new aq0() { // from class: com.p7700g.p99005.yk1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                zm1.E(va1.this, dq0Var2);
                return null;
            }
        });
    }

    @x1
    private dq0<fo1> F0(@x1 final fo1 fo1Var, @x1 final wp0 wp0Var) {
        if (wp0Var.a()) {
            return l();
        }
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.sl1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zm1.this.Y(fo1Var);
                return null;
            }
        }, this.x).u(new aq0() { // from class: com.p7700g.p99005.ul1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return zm1.this.a0(fo1Var, wp0Var, dq0Var);
            }
        });
    }

    @x1
    private synchronized dq0<Boolean> G0(@x1 @xu0.d final String str, @x1 final va1 va1Var, @z1 final Exception exc, final boolean z) {
        en1 c2 = this.t.c();
        kj1 kj1Var = this.s;
        kj1Var.c("Called stopVpn in state:" + c2 + " moveToPause: " + z, new Object[0]);
        final boolean z2 = c2 == en1.CONNECTED;
        if (c2 != en1.IDLE && c2 != en1.DISCONNECTING) {
            if (this.O == null) {
                if (z) {
                    ((qe1) r81.f(this.P)).k(true);
                }
                this.v.e();
                z0(null);
                final dq0<kg1> p = p();
                this.s.c("Got start task %s result: %s cancelled: %s error: %s completed: %s", this.K, String.valueOf(p.F()), Boolean.valueOf(p.H()), p.E(), Boolean.valueOf(p.I()));
                this.K = null;
                yp0 yp0Var = new yp0();
                A0(yp0Var);
                wp0 j = yp0Var.j();
                dq0 w = p.s(new aq0() { // from class: com.p7700g.p99005.jl1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return zm1.this.c0(dq0Var);
                    }
                }, this.x).w(new aq0() { // from class: com.p7700g.p99005.vk1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return zm1.this.e0(z, exc, p, z2, str, dq0Var);
                    }
                }, this.x);
                this.s.c("Initiate stop VPN commands sequence in state: %s moveToPause: %s", c2, Boolean.valueOf(z));
                this.O = w.u(new aq0() { // from class: com.p7700g.p99005.xk1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        zm1.this.g0(dq0Var);
                        return dq0Var;
                    }
                }).t(new aq0() { // from class: com.p7700g.p99005.kl1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return zm1.this.i0(z, dq0Var);
                    }
                }, this.x, j);
            } else {
                this.s.c("There is previous stop. Wait while it complete", new Object[0]);
                yp0 yp0Var2 = new yp0();
                if (!z) {
                    A0(yp0Var2);
                }
                this.O = this.O.x(new aq0() { // from class: com.p7700g.p99005.wl1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return zm1.this.k0(z, str, va1Var, exc, dq0Var);
                    }
                }, this.x, yp0Var2.j());
            }
            this.O.s(new aq0() { // from class: com.p7700g.p99005.hl1
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    return zm1.this.m0(z, va1Var, dq0Var);
                }
            }, this.x);
            return this.O;
        }
        kj1 kj1Var2 = this.s;
        kj1Var2.c("Vpn cant't be stopped in state:" + c2, new Object[0]);
        gc1 vpnStopCanceled = gc1.vpnStopCanceled();
        va1Var.a(vpnStopCanceled);
        return dq0.C(vpnStopCanceled);
    }

    private /* synthetic */ Object H(dq0 dq0Var) throws Exception {
        g(en1.CONNECTING_CREDENTIALS, false);
        return null;
    }

    private /* synthetic */ dq0 J(Bundle bundle, wp0 wp0Var, dq0 dq0Var) throws Exception {
        return this.A.b(bundle, wp0Var);
    }

    @x1
    private dq0<Boolean> J0(@z1 kg1 kg1Var, @x1 en1 en1Var, boolean z, @x1 @xu0.d String str, @z1 Exception exc, final boolean z2) {
        kj1 kj1Var = this.s;
        kj1Var.c("stopVpnBaseOnCurrentState(" + en1Var + ", " + str + ", " + this.x + ")", new Object[0]);
        if (en1.CONNECTING_PERMISSIONS.equals(en1Var)) {
            return dq0.D(null).q(new aq0() { // from class: com.p7700g.p99005.tl1
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    return zm1.this.o0(z2, dq0Var);
                }
            });
        }
        return this.v.c(z, kg1Var, str, exc).u(new aq0() { // from class: com.p7700g.p99005.ll1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return zm1.this.q0(z2, dq0Var);
            }
        });
    }

    private void K0() {
        this.s.c("subscribeToTransport", new Object[0]);
        ((hn1) r81.f(this.I)).k(this.C);
        ((wd1) r81.f(this.Q)).c(this.D);
    }

    public static /* synthetic */ dq0 L(dq0 dq0Var, dq0 dq0Var2) throws Exception {
        if (dq0Var2.J()) {
            return dq0.C(dq0Var2.E());
        }
        return dq0.C(dq0Var.E());
    }

    private void L0() {
        this.s.c("unsubscribeFromTransport", new Object[0]);
        ((hn1) r81.f(this.I)).x(this.C);
        ((wd1) r81.f(this.Q)).e(this.D);
    }

    /* renamed from: M */
    public /* synthetic */ dq0 N(Bundle bundle, wp0 wp0Var, final dq0 dq0Var) throws Exception {
        return dq0Var.J() ? this.A.b(bundle, wp0Var).u(new aq0() { // from class: com.p7700g.p99005.el1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.L(dq0.this, dq0Var2);
            }
        }) : dq0Var;
    }

    /* renamed from: O */
    public /* synthetic */ dq0 P(String str, String str2, co1 co1Var, final Bundle bundle, final wp0 wp0Var, dq0 dq0Var) throws Exception {
        return this.A.d(this.z, str, str2, this.t.a(), co1Var, bundle, false, wp0Var).u(new aq0() { // from class: com.p7700g.p99005.nl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return zm1.this.N(bundle, wp0Var, dq0Var2);
            }
        });
    }

    private /* synthetic */ dq0 Q(zp0 zp0Var, dq0 dq0Var) throws Exception {
        fo1 fo1Var = (fo1) lj1.b(dq0Var);
        this.J = fo1Var;
        this.s.c("Got credentials %s", fo1Var);
        zp0Var.b(fo1Var);
        return dq0Var;
    }

    /* renamed from: S */
    public /* synthetic */ dq0 T(wp0 wp0Var, dq0 dq0Var) throws Exception {
        return F0((fo1) lj1.b(dq0Var), wp0Var);
    }

    public static /* synthetic */ void W(eq0 eq0Var, int i) {
        eq0Var.f(new sb1(TimeUnit.MILLISECONDS.toSeconds(i)));
    }

    private /* synthetic */ Object X(fo1 fo1Var) throws Exception {
        g(en1.CONNECTING_VPN, false);
        this.t.l(fo1Var.x);
        K0();
        return null;
    }

    /* renamed from: Z */
    public /* synthetic */ dq0 a0(fo1 fo1Var, wp0 wp0Var, dq0 dq0Var) throws Exception {
        int i = fo1Var.u;
        hn1 hn1Var = (hn1) r81.f(this.I);
        final eq0<fo1> eq0Var = new eq0<>();
        wp0Var.b(new Runnable() { // from class: com.p7700g.p99005.im1
            @Override // java.lang.Runnable
            public final void run() {
                eq0.this.e();
            }
        });
        this.N = new b(E0(eq0Var, i), eq0Var);
        try {
            hn1Var.A(fo1Var, this.w);
        } catch (gc1 e) {
            eq0Var.c(e);
        }
        return eq0Var.a();
    }

    private /* synthetic */ en1 b0(dq0 dq0Var) throws Exception {
        return this.t.c();
    }

    /* renamed from: d0 */
    public /* synthetic */ dq0 e0(boolean z, Exception exc, dq0 dq0Var, boolean z2, String str, dq0 dq0Var2) throws Exception {
        this.s.c("stop step after getting state", new Object[0]);
        if (dq0Var2.H()) {
            return dq0.i();
        }
        if (dq0Var2.J()) {
            return dq0.C(dq0Var2.E());
        }
        en1 en1Var = (en1) r81.f((en1) dq0Var2.F());
        this.v.a();
        if (!z) {
            g(en1.DISCONNECTING, true);
        } else {
            this.t.j(en1.PAUSED);
        }
        kj1 kj1Var = this.s;
        kj1Var.c("Stop vpn called in service on state " + en1Var + " exception " + exc, new Object[0]);
        return J0((kg1) dq0Var.F(), en1Var, z2, str, exc, z);
    }

    private /* synthetic */ dq0 f0(dq0 dq0Var) throws Exception {
        L0();
        return dq0Var;
    }

    /* renamed from: h0 */
    public /* synthetic */ Boolean i0(boolean z, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            this.s.e("Stop error: %s message: %s cancelled: %s", dq0Var.E(), dq0Var.E().getMessage(), Boolean.valueOf(dq0Var.H()));
        }
        this.s.c("Event connection end details sent, notify callbacks; moveToPause: %s", Boolean.valueOf(z));
        if (!z) {
            ((qe1) r81.f(this.P)).y();
            g(en1.IDLE, false);
        } else {
            this.t.j(en1.DISCONNECTING);
            g(en1.PAUSED, false);
        }
        this.O = null;
        this.s.c("Finish stop VPN commands sequence with moveToPause: %s", Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    /* renamed from: j0 */
    public /* synthetic */ dq0 k0(boolean z, String str, va1 va1Var, Exception exc, dq0 dq0Var) throws Exception {
        kj1 kj1Var = this.s;
        StringBuilder G = wo1.G("Previous stop complete with error: ");
        G.append(dq0Var.E());
        kj1Var.c(G.toString(), new Object[0]);
        if (!dq0Var.J()) {
            en1 c2 = this.t.c();
            kj1 kj1Var2 = this.s;
            kj1Var2.c("Previous stop completed in state " + c2, new Object[0]);
            if (c2 == en1.PAUSED && !z) {
                ((qe1) r81.f(this.P)).k(true);
                this.O = null;
                return G0(str, va1Var, exc, false);
            } else if (z) {
                return dq0.C(gc1.vpnStopCanceled());
            } else {
                this.O = null;
                ((qe1) r81.f(this.P)).y();
                g(en1.IDLE, false);
            }
        }
        return dq0Var;
    }

    private boolean k(@x1 List<gc1> list) {
        fo1 fo1Var = this.J;
        boolean z = false;
        if (fo1Var == null || !fo1Var.w.getBoolean(CredentialsContentProvider.G, false)) {
            for (gc1 gc1Var : list) {
                z |= gc1Var instanceof vb1;
            }
            return z;
        }
        return true;
    }

    @x1
    private <T> dq0<T> l() {
        return dq0.C(gc1.vpnConnectCanceled());
    }

    /* renamed from: l0 */
    public /* synthetic */ Boolean m0(boolean z, va1 va1Var, dq0 dq0Var) throws Exception {
        kj1 kj1Var = this.s;
        StringBuilder G = wo1.G("Callback stop VPN commands sequence error: ");
        G.append(dq0Var.E());
        G.append(" cancelled: ");
        G.append(dq0Var.H());
        G.append(" moveToPause: ");
        G.append(z);
        kj1Var.c(G.toString(), new Object[0]);
        if (dq0Var.J()) {
            va1Var.a(gc1.cast(dq0Var.E()));
        } else if (dq0Var.H()) {
            va1Var.a(gc1.vpnStopCanceled());
        } else {
            va1Var.complete();
        }
        return Boolean.valueOf(z);
    }

    private int m(@x1 gc1 gc1Var) {
        if (gc1Var instanceof vb1) {
            return 3;
        }
        if (gc1Var instanceof xb1) {
            return 2;
        }
        return gc1Var instanceof kc1 ? 1 : 0;
    }

    @x1
    private gc1 n(@x1 List<gc1> list) {
        return list.get(0);
    }

    /* renamed from: n0 */
    public /* synthetic */ Boolean o0(boolean z, dq0 dq0Var) throws Exception {
        this.R.b();
        this.s.c("Stop permission dialog", new Object[0]);
        return Boolean.valueOf(z);
    }

    @x1
    private dq0<kg1> p() {
        dq0<kg1> dq0Var = this.K;
        return dq0Var == null ? dq0.D(null) : dq0Var;
    }

    /* renamed from: p0 */
    public /* synthetic */ dq0 q0(boolean z, dq0 dq0Var) throws Exception {
        ((hn1) r81.f(this.I)).B();
        return dq0.D(Boolean.valueOf(z));
    }

    /* renamed from: q */
    public /* synthetic */ wp0 r(String str, String str2, co1 co1Var, Bundle bundle) throws Exception {
        this.s.c("Start vpn call", new Object[0]);
        if (!this.t.f() && !this.t.e()) {
            yp0 yp0Var = new yp0();
            z0(yp0Var);
            A0(null);
            this.t.k();
            ve1 a2 = this.H.a(str, str2, co1Var, bundle, this.t.a());
            this.E.a(!a2.j());
            this.F.a(!a2.i());
            this.H.e(a2);
            this.G.a(a2);
            this.u.f();
            ((qe1) r81.f(this.P)).z(a2);
            this.s.c("Initiate start VPN commands sequence", new Object[0]);
            ((hn1) r81.f(this.I)).w(bundle);
            return yp0Var.j();
        }
        kj1 kj1Var = this.s;
        StringBuilder G = wo1.G("Fail to start VPN. startVpnTaskRef ");
        G.append(this.K == null ? "is null" : "is not null");
        G.append(", isStarting: ");
        G.append(this.t.f());
        G.append(", isStarted: ");
        G.append(this.t.e());
        kj1Var.c(G.toString(), new Object[0]);
        throw new lc1("Wrong state to call start");
    }

    private /* synthetic */ Object r0(String str, String str2, co1 co1Var, Bundle bundle, dq0 dq0Var) throws Exception {
        en1 c2 = this.t.c();
        kj1 kj1Var = this.s;
        kj1Var.c("Update config in " + c2, new Object[0]);
        if (c2 == en1.CONNECTED) {
            ve1 a2 = this.H.a(str, str2, co1Var, bundle, this.t.a());
            this.H.e(a2);
            ((qe1) r81.f(this.P)).z(a2);
            ((hn1) r81.f(this.I)).C((fo1) r81.f((fo1) dq0Var.F()));
            return null;
        }
        this.s.c("Update config not in connected. Skip", new Object[0]);
        return null;
    }

    /* renamed from: s */
    public /* synthetic */ void t(Runnable runnable, String str, gc1 gc1Var) {
        boolean z = ((qe1) r81.f(this.P)).J() && runnable != null;
        G0(str, new c(runnable, z), gc1Var, z);
    }

    public static /* synthetic */ Object t0(om1 om1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            om1Var.r1(new nm1(gc1.cast(dq0Var.E())));
            return null;
        }
        om1Var.onComplete();
        return null;
    }

    private /* synthetic */ int u(gc1 gc1Var, gc1 gc1Var2) {
        return m(gc1Var2) - m(gc1Var);
    }

    @x1
    /* renamed from: u0 */
    public dq0<fo1> V(@x1 va1 va1Var, @x1 dq0<fo1> dq0Var) {
        if (dq0Var.J()) {
            v0(gc1.cast(dq0Var.E()), new a(va1Var));
            this.G.h();
        } else if (dq0Var.H()) {
            gc1 vpnConnectCanceled = gc1.vpnConnectCanceled();
            va1Var.a(vpnConnectCanceled);
            this.G.h();
            return dq0.C(vpnConnectCanceled);
        } else {
            this.G.h();
            va1Var.complete();
        }
        return dq0Var;
    }

    /* renamed from: w */
    public /* synthetic */ dq0 x(wp0 wp0Var, dq0 dq0Var) throws Exception {
        this.s.c("Start vpn from state %s cancelled: %s", (en1) r81.f((en1) dq0Var.F()), Boolean.valueOf(dq0Var.H()));
        g(en1.CONNECTING_PERMISSIONS, false);
        return this.R.a(wp0Var);
    }

    private boolean x0(@x1 @xu0.d final String str, @x1 final gc1 gc1Var, @z1 final Runnable runnable) {
        kj1 kj1Var = this.s;
        StringBuilder M = wo1.M("processError: gprReason: ", str, " e: ");
        M.append(gc1Var.getMessage());
        M.append("in state: ");
        M.append(this.t.c());
        kj1Var.c(M.toString(), new Object[0]);
        this.x.execute(new Runnable() { // from class: com.p7700g.p99005.dl1
            @Override // java.lang.Runnable
            public final void run() {
                zm1.this.t(runnable, str, gc1Var);
            }
        });
        return runnable != null;
    }

    private /* synthetic */ dq0 y(String str, Bundle bundle, dq0 dq0Var) throws Exception {
        return this.A.e(dq0Var, str, bundle);
    }

    public synchronized void A0(@z1 yp0 yp0Var) {
        yp0 yp0Var2 = this.M;
        if (yp0Var2 == yp0Var) {
            this.s.c("stopVpnTokenSource equal new. skip set", new Object[0]);
            return;
        }
        if (yp0Var2 != null) {
            this.s.c("cancel stopVpnTokenSource", new Object[0]);
            this.M.d();
        }
        this.s.c("stopVpnTokenSource set to new %s", yp0Var);
        this.M = yp0Var;
    }

    public /* synthetic */ dq0 B(Bundle bundle, String str, zp0 zp0Var, dq0 dq0Var) {
        return this.v.d(bundle, str, dq0Var, (fo1) zp0Var.a());
    }

    public void B0(@x1 hn1 hn1Var) {
        this.I = hn1Var;
        this.Q = new wd1(hn1Var);
    }

    public /* synthetic */ Object D(Bundle bundle, String str, String str2, co1 co1Var, va1 va1Var, dq0 dq0Var) {
        C(bundle, str, str2, co1Var, va1Var, dq0Var);
        return null;
    }

    public synchronized void D0(@x1 final String str, @x1 final String str2, final boolean z, @x1 final co1 co1Var, @x1 final Bundle bundle, @x1 final va1 va1Var) {
        I0().u(new aq0() { // from class: com.p7700g.p99005.rl1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return zm1.this.G(z, va1Var, str, str2, co1Var, bundle, dq0Var);
            }
        });
    }

    public void H0(@x1 @xu0.d String str, @x1 va1 va1Var, @z1 Exception exc) {
        G0(str, va1Var, exc, false);
    }

    public /* synthetic */ Object I(dq0 dq0Var) {
        H(dq0Var);
        return null;
    }

    @x1
    public synchronized dq0<Boolean> I0() {
        dq0<Boolean> dq0Var;
        dq0Var = this.O;
        if (dq0Var == null) {
            dq0Var = dq0.D(null);
        }
        return dq0Var;
    }

    public /* synthetic */ dq0 K(Bundle bundle, wp0 wp0Var, dq0 dq0Var) {
        return this.A.b(bundle, wp0Var);
    }

    public void M0(@x1 final String str, @x1 final String str2, @x1 final Bundle bundle, @x1 final om1 om1Var) {
        this.t.k();
        fo1 fo1Var = this.J;
        co1 c2 = fo1Var != null ? fo1Var.s : co1.c();
        final co1 co1Var = c2;
        this.A.d(this.z, str, str2, this.t.a(), c2, bundle, true, null).L(new aq0() { // from class: com.p7700g.p99005.wk1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                zm1.this.s0(str, str2, co1Var, bundle, dq0Var);
                return null;
            }
        }).s(new aq0() { // from class: com.p7700g.p99005.il1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                zm1.t0(om1.this, dq0Var);
                return null;
            }
        }, this.x);
    }

    public /* synthetic */ dq0 R(zp0 zp0Var, dq0 dq0Var) {
        Q(zp0Var, dq0Var);
        return dq0Var;
    }

    public /* synthetic */ Object Y(fo1 fo1Var) {
        X(fo1Var);
        return null;
    }

    @Override // com.p7700g.p99005.jn1
    public synchronized void a(long j, long j2) {
        this.B.h(j, j2);
    }

    @Override // com.p7700g.p99005.jn1
    public void b(@x1 Parcelable parcelable) {
        this.B.i(parcelable);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:23:0x0003, B:25:0x0035, B:27:0x003f, B:30:0x0055, B:32:0x005f, B:28:0x004b), top: B:38:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    @Override // com.p7700g.p99005.cn1.a
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gc1 c(@x1 List<gc1> list) {
        Runnable runnable;
        try {
            en1 c2 = this.t.c();
            this.s.c("processTransportErrors: %d in state: %s", Integer.valueOf(list.size()), c2);
            List<gc1> C0 = C0(list);
            gc1 n = n(C0);
            qe1 qe1Var = (qe1) r81.f(this.P);
            if (!k(C0)) {
                Iterator<gc1> it = C0.iterator();
                if (it.hasNext()) {
                    gc1 next = it.next();
                    runnable = qe1Var.g(next, c2);
                    n = next;
                    if (x0(n.getGprReason(), n, runnable)) {
                        this.B.f(n);
                        return n;
                    }
                    return null;
                }
            } else {
                this.s.c("processTransportErrors: forbids reconnect", new Object[0]);
            }
            runnable = null;
            if (x0(n.getGprReason(), n, runnable)) {
            }
        } catch (Throwable th) {
            this.s.e("The error was thrown while search for error handler. Will stop without reconnection", th);
            return null;
        }
    }

    public /* synthetic */ en1 c0(dq0 dq0Var) {
        return this.t.c();
    }

    @Override // com.p7700g.p99005.yd1
    public synchronized void f(@x1 String str) {
        this.B.g(str);
    }

    public synchronized void g(@x1 en1 en1Var, boolean z) {
        en1 c2 = this.t.c();
        if (c2 == en1Var) {
            return;
        }
        if (!z && c2 == en1.PAUSED && (en1Var == en1.IDLE || en1Var == en1.DISCONNECTING)) {
            this.s.c("Ignore transition from: %s to: %s", c2.name(), en1Var.name());
            return;
        }
        this.s.c("Change state from %s to %s", c2.name(), en1Var.name());
        this.t.j(en1Var);
        if (en1Var == en1.CONNECTED) {
            this.t.g();
            ((qe1) r81.f(this.P)).x();
        } else {
            this.t.h();
        }
        if (en1Var == en1.IDLE) {
            this.G.f();
            ((qe1) r81.f(this.P)).y();
        }
        this.B.e(en1Var);
    }

    public /* synthetic */ dq0 g0(dq0 dq0Var) {
        L0();
        return dq0Var;
    }

    @Override // com.p7700g.p99005.jn1
    public synchronized void h() {
        jn1 jn1Var = this.N;
        if (jn1Var != null) {
            jn1Var.h();
            this.N = null;
        }
        if (this.t.c() == en1.CONNECTING_VPN) {
            g(en1.CONNECTED, false);
        }
    }

    @Override // com.p7700g.p99005.jn1
    public synchronized void i(@x1 kc1 kc1Var) {
        jn1 jn1Var = this.N;
        if (jn1Var != null) {
            jn1Var.i(kc1Var);
            this.N = null;
        }
        v0(kc1Var, null);
    }

    public void j() {
        wd1 wd1Var = this.Q;
        if (wd1Var != null) {
            wd1Var.d();
        }
    }

    @z1
    public fo1 o() {
        return this.J;
    }

    public /* synthetic */ Object s0(String str, String str2, co1 co1Var, Bundle bundle, dq0 dq0Var) {
        r0(str, str2, co1Var, bundle, dq0Var);
        return null;
    }

    public /* synthetic */ int v(gc1 gc1Var, gc1 gc1Var2) {
        return m(gc1Var2) - m(gc1Var);
    }

    public void v0(@x1 gc1 gc1Var, @z1 va1 va1Var) {
        this.s.d(gc1Var, "onVpnDisconnected on state %s", this.t.c());
        this.u.d(gc1.unWrap(gc1Var), va1Var);
    }

    @x1
    @r2
    public dq0<wp0> w0(@x1 final String str, @x1 final String str2, @x1 final co1 co1Var, @x1 final Bundle bundle) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.ol1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zm1.this.r(str, str2, co1Var, bundle);
            }
        }, this.x);
    }

    public void y0(@x1 qe1 qe1Var) {
        this.P = qe1Var;
    }

    public /* synthetic */ dq0 z(String str, Bundle bundle, dq0 dq0Var) {
        return this.A.e(dq0Var, str, bundle);
    }

    public void z0(@z1 yp0 yp0Var) {
        yp0 yp0Var2 = this.L;
        if (yp0Var2 == yp0Var) {
            this.s.c("startVpnTokenSource equal new. skip set", new Object[0]);
            return;
        }
        if (yp0Var2 != null) {
            this.s.c("cancel startVpnTokenSource", new Object[0]);
            this.L.d();
        }
        this.s.c("startVpnTokenSource set to new %s", yp0Var);
        this.L = yp0Var;
    }
}