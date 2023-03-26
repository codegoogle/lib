package com.anchorfree.vpnsdk.vpnservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.VpnService;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.p7700g.p99005.aq0;
import com.p7700g.p99005.bn1;
import com.p7700g.p99005.cn1;
import com.p7700g.p99005.co1;
import com.p7700g.p99005.do1;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.eg1;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.eq0;
import com.p7700g.p99005.fn1;
import com.p7700g.p99005.fo1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.hn1;
import com.p7700g.p99005.ib1;
import com.p7700g.p99005.ic1;
import com.p7700g.p99005.jb1;
import com.p7700g.p99005.jc1;
import com.p7700g.p99005.jd1;
import com.p7700g.p99005.kb1;
import com.p7700g.p99005.kd1;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.ko1;
import com.p7700g.p99005.lb1;
import com.p7700g.p99005.lc1;
import com.p7700g.p99005.lm1;
import com.p7700g.p99005.ln1;
import com.p7700g.p99005.mb1;
import com.p7700g.p99005.md1;
import com.p7700g.p99005.mm1;
import com.p7700g.p99005.mn1;
import com.p7700g.p99005.nb1;
import com.p7700g.p99005.nc1;
import com.p7700g.p99005.nm1;
import com.p7700g.p99005.no1;
import com.p7700g.p99005.o0;
import com.p7700g.p99005.ob1;
import com.p7700g.p99005.oe1;
import com.p7700g.p99005.om1;
import com.p7700g.p99005.pc1;
import com.p7700g.p99005.pm1;
import com.p7700g.p99005.po1;
import com.p7700g.p99005.qa1;
import com.p7700g.p99005.qc1;
import com.p7700g.p99005.qe1;
import com.p7700g.p99005.qm1;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.re1;
import com.p7700g.p99005.rm1;
import com.p7700g.p99005.sm1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.tm1;
import com.p7700g.p99005.tn1;
import com.p7700g.p99005.uc1;
import com.p7700g.p99005.um1;
import com.p7700g.p99005.va1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xn1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yn1;
import com.p7700g.p99005.yp0;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zm1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"UnannotatedField"})
/* loaded from: classes2.dex */
public class AFVpnService extends VpnService implements ln1, eg1.a, xn1, zm1.d {
    @x1
    public static Executor s = Executors.newSingleThreadScheduledExecutor();
    @x1
    public static ScheduledExecutorService t = Executors.newSingleThreadScheduledExecutor();
    @x1
    private static final String u = "10.1.1.1";
    @x1
    public static final String v = "extra:always-on";
    @x1
    private final yn1 A;
    @x1
    private final td1 B;
    @x1
    private final jd1 C;
    @x1
    private final jd1 D;
    @x1
    private jb1 E;
    @x1
    private final ob1 F;
    @x1
    private final ib1 G;
    @z1
    private qe1 H;
    @z1
    private hn1 I;
    @z1
    private ParcelFileDescriptor J;
    @x1
    private final cn1 K;
    @x1
    private tm1.b L;
    @z1
    private pc1 M;
    @x1
    private final mb1 N;
    @x1
    private final lb1 O;
    @x1
    private zm1 P;
    @x1
    public eq0<qe1> Q;
    public boolean R;
    @x1
    private final kj1 w;
    @x1
    private final nb1 x;
    @x1
    private final uc1 y;
    @x1
    private final kb1 z;

    /* loaded from: classes2.dex */
    public class a implements td1 {
        public a() {
            AFVpnService.this = r1;
        }

        @Override // com.p7700g.p99005.td1
        public boolean k(@x1 ParcelFileDescriptor parcelFileDescriptor) {
            return l(parcelFileDescriptor.getFd());
        }

        @Override // com.p7700g.p99005.td1
        public boolean l(int i) {
            return ((AFVpnService) r81.f(AFVpnService.this)).protect(i);
        }
    }

    public AFVpnService() {
        kj1 b = kj1.b("AFVpnService");
        this.w = b;
        this.x = new nb1(this);
        this.y = new uc1(this);
        this.z = new kb1(this);
        this.A = new yn1(this, s);
        a aVar = new a();
        this.B = aVar;
        this.C = new jd1(true, aVar, "probe");
        this.D = new jd1(true, aVar, "captive-portal");
        ob1 ob1Var = new ob1();
        this.F = ob1Var;
        this.G = new ib1(b, ob1Var);
        this.K = new cn1();
        this.L = new um1(this, new mm1(t, b), b);
        this.N = new mb1(ob1Var, t);
        this.O = new lb1(this);
        this.Q = new eq0<>();
    }

    public static /* synthetic */ Object B(ve1 ve1Var, dq0 dq0Var) throws Exception {
        ((qe1) r81.f((qe1) dq0Var.F())).j(ve1Var);
        return null;
    }

    private /* synthetic */ Object C(dq0 dq0Var) throws Exception {
        try {
            final ve1 ve1Var = (ve1) dq0Var.F();
            if (ve1Var != null) {
                kj1 kj1Var = this.w;
                kj1Var.c("Got start arguments " + ve1Var, new Object[0]);
                this.Q.a().q(new aq0() { // from class: com.p7700g.p99005.sj1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var2) {
                        AFVpnService.B(ve1.this, dq0Var2);
                        return null;
                    }
                });
            } else {
                this.w.c("No start arguments for vpn always on", new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            this.w.f(th);
            return null;
        }
    }

    public static /* synthetic */ dq0 E(om1 om1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            om1Var.r1(new nm1(gc1.cast(dq0Var.E())));
            throw dq0Var.E();
        }
        return dq0Var;
    }

    public static /* synthetic */ Object F(om1 om1Var, dq0 dq0Var) throws Exception {
        om1Var.onComplete();
        return null;
    }

    /* renamed from: K */
    public void A(@x1 final qc1 qc1Var) {
        s.execute(new Runnable() { // from class: com.p7700g.p99005.oj1
            @Override // java.lang.Runnable
            public final void run() {
                AFVpnService.this.y(qc1Var);
            }
        });
    }

    private void M() {
        this.w.c("Last arguments loaded, starting", new Object[0]);
        sendBroadcast(new Intent(Z(this)));
    }

    @x1
    public static String Z(@x1 Context context) {
        return String.format("%s.vpn.always.on.action", context.getPackageName());
    }

    private void l(@x1 co1 co1Var, @x1 VpnService.Builder builder) {
        int e = co1Var.e();
        if (e == 1) {
            for (String str : co1Var.d()) {
                try {
                    builder.addAllowedApplication(str);
                } catch (PackageManager.NameNotFoundException e2) {
                    this.w.d(e2, "Error on add allowed app ", new Object[0]);
                }
            }
        } else if (e == 2) {
            for (String str2 : co1Var.d()) {
                try {
                    builder.addDisallowedApplication(str2);
                } catch (Exception e3) {
                    this.w.d(e3, "Error on add disallowed app", new Object[0]);
                }
            }
        }
    }

    /* renamed from: x */
    public /* synthetic */ void y(qc1 qc1Var) {
        this.w.c("onNetworkChange network: %s, state: ", qc1Var, this.F.c());
        if (this.F.c() == en1.CONNECTED) {
            this.K.d(gc1.fromReason(xu0.e.j), null);
        }
    }

    public /* synthetic */ Object D(dq0 dq0Var) {
        C(dq0Var);
        return null;
    }

    public void G(@x1 pm1 pm1Var) {
        this.G.a(pm1Var);
    }

    public void H(@x1 qm1 qm1Var) {
        this.G.b(qm1Var);
    }

    public void I(@x1 rm1 rm1Var) {
        this.G.c(rm1Var);
    }

    public void J(@x1 sm1 sm1Var) {
        this.G.d(sm1Var);
    }

    public void L() {
        this.x.d().L(new aq0() { // from class: com.p7700g.p99005.qj1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                AFVpnService.this.D(dq0Var);
                return null;
            }
        });
    }

    public void N(@x1 pm1 pm1Var) {
        this.G.j(pm1Var);
    }

    public void O(@x1 qm1 qm1Var) {
        this.G.k(qm1Var);
    }

    public void P(@x1 rm1 rm1Var) {
        this.G.l(rm1Var);
    }

    public void Q(@x1 sm1 sm1Var) {
        this.G.m(sm1Var);
    }

    public void R(@x1 final om1 om1Var) {
        StartVPNServiceShadowActivity.f(getApplicationContext(), new yp0().j()).q(new aq0() { // from class: com.p7700g.p99005.pj1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                AFVpnService.E(om1.this, dq0Var);
                return dq0Var;
            }
        }).L(new aq0() { // from class: com.p7700g.p99005.rj1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                AFVpnService.F(om1.this, dq0Var);
                return null;
            }
        });
    }

    public void S() {
        ((hn1) r81.f(this.I)).y();
    }

    public void T(@x1 String str, @x1 String str2, boolean z, @x1 co1 co1Var, @x1 Bundle bundle, @x1 va1 va1Var) {
        this.P.D0(str, str2, z, co1Var, bundle, va1Var);
    }

    @SuppressLint({"IconColors"})
    public void U(@x1 oe1 oe1Var) {
        this.w.c("startForeground", new Object[0]);
        startForeground(3333, this.z.a(oe1Var));
    }

    public void V(@x1 String str, @x1 String str2) {
        ((hn1) r81.f(this.I)).z(str, str2);
    }

    public void W(@x1 @xu0.d String str, @x1 va1 va1Var, @z1 Exception exc) {
        this.P.H0(str, va1Var, exc);
    }

    public void X(@x1 oe1 oe1Var) {
        ((qe1) r81.f(this.H)).E(oe1Var);
    }

    public void Y(@x1 String str, @x1 String str2, @x1 Bundle bundle, @x1 om1 om1Var) {
        this.P.M0(str, str2, bundle, om1Var);
    }

    @Override // com.p7700g.p99005.zm1.d
    public void a(@x1 ve1 ve1Var) {
        boolean m = ((qe1) r81.f(this.H)).m();
        boolean z = m && ve1Var.j();
        if (z) {
            this.w.i("tunnel will survive on reconnect", new Object[0]);
        }
        if (!m || z) {
            return;
        }
        U(((qe1) r81.f(this.H)).h());
        f();
    }

    @Override // com.p7700g.p99005.xn1
    public void b(@x1 qa1 qa1Var, @x1 md1 md1Var) {
        this.w.c("onVpnTransportChanged", new Object[0]);
        ko1 a2 = no1.a(getApplicationContext());
        jd1 jd1Var = new jd1(true, this.B, kg.z0);
        hn1 create = qa1Var.create(getApplicationContext(), new po1(jd1Var, a2), jd1Var, this.C);
        this.I = create;
        this.P.B0(create);
        kd1 a3 = md1Var.a(getApplicationContext(), this.C);
        a3.a(this.I.p());
        this.N.b(a3, this.y, this);
    }

    @Override // com.p7700g.p99005.ln1
    @x1
    public mn1 c(@x1 fo1 fo1Var) {
        VpnService.Builder builder = new VpnService.Builder(this);
        l(fo1Var.s, builder);
        return new mn1(builder);
    }

    @Override // com.p7700g.p99005.xn1
    public void d(@x1 re1 re1Var) {
        this.w.c("onReconnectionSettingChanged", new Object[0]);
        qe1 qe1Var = this.H;
        if (qe1Var != null) {
            qe1Var.k(false);
        }
        try {
            qe1 e = qe1.e(getApplicationContext(), this, this.x, t, re1Var);
            this.H = e;
            Runnable A = e.A(qe1Var);
            if (this.H.m() && this.H.J()) {
                this.P.g(en1.PAUSED, false);
            }
            pc1 pc1Var = this.M;
            if (pc1Var != null) {
                pc1Var.cancel();
                this.M = null;
            }
            this.M = re1Var.i().a(this, t).c("AFVpnService", new nc1() { // from class: com.p7700g.p99005.tj1
                @Override // com.p7700g.p99005.nc1
                public final void a(qc1 qc1Var) {
                    AFVpnService.this.A(qc1Var);
                }
            });
            this.P.y0(this.H);
            if (A != null) {
                s.execute(A);
            }
            this.Q.g(this.H);
        } catch (tn1 e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.p7700g.p99005.eg1.a
    @x1
    public dq0<lm1> e() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.nj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AFVpnService.this.p();
            }
        }, s);
    }

    @Override // com.p7700g.p99005.zm1.d
    public void f() {
        if (this.J != null) {
            this.w.c("Vpn Tunnel FD is about to be closed.", new Object[0]);
            try {
                this.J.close();
            } catch (IOException e) {
                this.w.f(e);
            }
        }
        this.J = null;
    }

    @Override // com.p7700g.p99005.ln1
    @z1
    public ParcelFileDescriptor g(@x1 mn1 mn1Var) throws gc1 {
        boolean q = ((hn1) r81.f(this.I)).q();
        if (this.J != null && q) {
            this.w.c("Vpn tun is already open. Vpn tunnel params was ignored and FD for existing tunnel was returned.", new Object[0]);
        } else {
            ParcelFileDescriptor establish = mn1Var.h().establish();
            this.J = establish;
            if (establish != null) {
                this.w.c("Vpn Tunnel FD is opened", new Object[0]);
            } else {
                throw new ic1();
            }
        }
        stopForeground(true);
        return this.J;
    }

    @Override // com.p7700g.p99005.zm1.d
    public void h() {
        stopForeground(true);
    }

    @Override // com.p7700g.p99005.ln1
    public int i() throws lc1 {
        ParcelFileDescriptor parcelFileDescriptor = this.J;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor.getFd();
        }
        throw new lc1("Vpn tunnel doen't exist");
    }

    @Override // com.p7700g.p99005.xn1
    public void j(@x1 do1 do1Var) {
        this.w.c("onCaptivePortalChanged", new Object[0]);
        this.E.f(do1Var);
    }

    public void k() {
        ((hn1) r81.f(this.I)).j();
    }

    public void m(int i, @x1 Bundle bundle) {
        ((hn1) r81.f(this.I)).v(i, bundle);
    }

    public void n() {
        this.P.j();
    }

    public boolean o() throws gc1 {
        this.w.c("establishVpnService", new Object[0]);
        mn1 c = c((fo1) r81.f(this.P.o()));
        if (VpnService.prepare(getApplicationContext()) == null) {
            c.a(u, 30);
            g(c);
            this.w.c("VPNService Established", new Object[0]);
            return true;
        }
        throw new jc1();
    }

    @Override // android.net.VpnService, android.app.Service
    @x1
    public IBinder onBind(@z1 Intent intent) {
        kj1 kj1Var = this.w;
        kj1Var.c("onBind " + intent, new Object[0]);
        return this.L;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        jb1 jb1Var = new jb1(this, this.D);
        this.E = jb1Var;
        this.P = new zm1(this, jb1Var, this.w, this.F, this.K, this.G, this.N, this, this, this.x, this.O, s, t, this.C, this.D);
        this.A.t(new fn1(s, this));
        this.K.a(this.P);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.w.c("onDestroy", new Object[0]);
        this.A.v();
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        this.w.n("connection was revoked by the system, file descriptor should be closed", new Object[0]);
        f();
        this.R = false;
        this.P.v0(new jc1(), null);
    }

    @Override // android.app.Service
    public int onStartCommand(@z1 Intent intent, int i, int i2) {
        boolean z = intent != null && "android.net.VpnService".equals(intent.getAction());
        this.R = z;
        if (z) {
            this.w.c("Start on VPN always on feature", new Object[0]);
            M();
        }
        this.w.c("Start on VPN always on %s", intent);
        return 3;
    }

    @Override // android.app.Service
    public boolean onUnbind(@z1 Intent intent) {
        kj1 kj1Var = this.w;
        kj1Var.c("onUnbind " + intent, new Object[0]);
        return super.onUnbind(intent);
    }

    @o0
    @x1
    public lm1 p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(v, this.R);
        hn1 hn1Var = this.I;
        if (hn1Var != null) {
            return hn1Var.l().r(this.F.a()).c(bundle);
        }
        return lm1.g().c(bundle);
    }

    @o0
    @z1
    public fo1 q() {
        this.w.c("Start on VPN always on onCreate", new Object[0]);
        return this.P.o();
    }

    @o0
    @x1
    public String r() {
        File h = this.w.h(getCacheDir());
        return h != null ? h.getAbsolutePath() : "";
    }

    @o0
    public int s(@x1 String str) {
        return ((hn1) r81.f(this.I)).m(str);
    }

    @o0
    public int t() {
        return ((hn1) r81.f(this.I)).n();
    }

    @o0
    public long u() {
        return this.F.b();
    }

    @o0
    @x1
    public en1 v() {
        return this.F.c();
    }

    @o0
    @x1
    public bn1 w() {
        return this.F.d();
    }
}