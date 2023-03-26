package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.p7700g.p99005.xu0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ReconnectManager.java */
/* loaded from: classes2.dex */
public class qe1 {
    @x1
    public static final String a = "ReconnectManager";
    @x1
    public static final String b = "reconnection_scheduled";
    private static final int c = 3;
    @x1
    private final Context e;
    @x1
    private final ScheduledExecutorService f;
    @x1
    private nb1 g;
    @x1
    private final SharedPreferences h;
    @x1
    private final AFVpnService i;
    @x1
    private final List<? extends pe1> j;
    @x1
    private final me1 k;
    private final boolean l;
    @x1
    private oe1 m;
    @z1
    private ve1 n;
    private volatile boolean o;
    @z1
    private ScheduledFuture<?> q;
    @z1
    private pc1 r;
    @x1
    public le1 s;
    @x1
    private final kj1 d = kj1.b(a);
    private volatile int p = 0;

    /* compiled from: ReconnectManager.java */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(@x1 qc1 qc1Var);
    }

    public qe1(@x1 Context context, @x1 ScheduledExecutorService scheduledExecutorService, @x1 nb1 nb1Var, @x1 SharedPreferences sharedPreferences, @x1 AFVpnService aFVpnService, @x1 List<? extends pe1> list, boolean z, @x1 oe1 oe1Var, @x1 le1 le1Var, @x1 oc1 oc1Var) {
        this.e = context;
        this.f = scheduledExecutorService;
        this.g = nb1Var;
        this.h = sharedPreferences;
        this.i = aFVpnService;
        this.j = list;
        this.l = z;
        this.m = oe1Var;
        this.s = le1Var;
        this.k = oc1Var.a(context, scheduledExecutorService);
        a(list);
    }

    private synchronized void F(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.c("setReconnectionScheduled: %b", Boolean.valueOf(z));
            SharedPreferences.Editor edit = this.h.edit();
            edit.putBoolean(b, z);
            if (z) {
                this.d.c("Preserve VPN start arguments", new Object[0]);
                this.g.e(this.n);
            }
            edit.apply();
        }
    }

    private void G(@z1 ve1 ve1Var) {
        ve1 ve1Var2 = this.n;
        if (ve1Var2 == ve1Var && ve1Var2 != null && ve1Var2.equals(ve1Var)) {
            return;
        }
        this.n = ve1Var;
        this.d.c("Set VPN start arguments to %s", ve1Var);
        if (this.n != null) {
            this.d.c("Preserve VPN start arguments", new Object[0]);
            this.g.e(ve1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void u(@x1 ve1 ve1Var, @x1 String str) {
        this.d.c("Start VPN as reconnection attempt", new Object[0]);
        Bundle d = ve1Var.d();
        d.putBoolean("extra_fast_start", true);
        d.putBoolean(CredentialsContentProvider.D, ve1Var.j());
        this.i.T(ve1Var.g(), str, true, ve1Var.c(), d, va1.a);
    }

    private void I() {
        this.d.c("stopReconnection", new Object[0]);
        F(false);
        b();
        this.p = 0;
    }

    private void a(@x1 List<? extends pe1> list) {
        for (pe1 pe1Var : list) {
            pe1Var.c(this);
        }
    }

    private void b() {
        d();
        c();
    }

    private void c() {
        ScheduledFuture<?> scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.q = null;
        }
    }

    private void d() {
        pc1 pc1Var = this.r;
        if (pc1Var != null) {
            pc1Var.cancel();
            this.r = null;
        }
    }

    @x1
    public static qe1 e(@x1 Context context, @x1 AFVpnService aFVpnService, @x1 nb1 nb1Var, @x1 ScheduledExecutorService scheduledExecutorService, @x1 re1 re1Var) throws tn1 {
        return new qe1(context, scheduledExecutorService, nb1Var, context.getSharedPreferences(a, 0), aFVpnService, Collections.unmodifiableList(re1Var.j()), re1Var.q(), re1Var.e() != null ? re1Var.e() : oe1.c(context), new le1(context), re1Var.i());
    }

    @x1
    @r2
    public static qe1 f(@x1 Context context, @x1 AFVpnService aFVpnService, @x1 nb1 nb1Var, @x1 ScheduledExecutorService scheduledExecutorService, @x1 List<? extends pe1> list, @x1 oe1 oe1Var, boolean z, @x1 le1 le1Var) {
        return new qe1(context, scheduledExecutorService, nb1Var, context.getSharedPreferences(a, 0), aFVpnService, list, z, oe1Var, le1Var, oc1.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(pe1 pe1Var, ve1 ve1Var, gc1 gc1Var, int i) {
        pe1Var.g(ve1Var, gc1Var, i);
        synchronized (this) {
            this.p++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void q(ve1 ve1Var) {
        try {
            if (this.i.o()) {
                C(ve1Var, xu0.e.g);
                synchronized (this) {
                    this.p++;
                }
            }
        } catch (Throwable th) {
            this.d.f(th);
            F(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void s(ve1 ve1Var) {
        if (this.k.b()) {
            u(ve1Var, xu0.e.g);
        } else {
            C(ve1Var, xu0.e.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void w(a aVar, ve1 ve1Var, String str, qc1 qc1Var) {
        this.d.c("onNetworkChange: %s reconnectionScheduled: %s", qc1Var, Boolean.valueOf(m()));
        if (aVar.a(qc1Var) && m()) {
            u(ve1Var, str);
        }
    }

    @z1
    public Runnable A(@z1 qe1 qe1Var) {
        this.d.c("restoreState", new Object[0]);
        if (!this.j.isEmpty()) {
            if (qe1Var != null && !qe1Var.j.isEmpty()) {
                this.o = qe1Var.o;
                this.n = qe1Var.n;
                this.d.c("Restored state from previous INSTANCE of ReconnectManager. reconnectionScheduled: %b, vpnStartArguments: %s", Boolean.valueOf(this.o), this.n);
            } else {
                this.o = this.h.getBoolean(b, false) || this.s.c();
                try {
                    if (this.o) {
                        this.n = this.g.c();
                    }
                } catch (Exception e) {
                    this.d.e((String) r81.f(e.getMessage()), e);
                }
                this.d.c("Restored state from preference. reconnectionScheduled: %b, vpnStartArguments: %s", Boolean.valueOf(this.o), this.n);
            }
            if (this.o) {
                final ve1 ve1Var = this.n;
                if (ve1Var == null) {
                    this.d.e("Arguments for vpn start wasn't been restored.", new Object[0]);
                    F(false);
                    return null;
                }
                return new Runnable() { // from class: com.p7700g.p99005.de1
                    @Override // java.lang.Runnable
                    public final void run() {
                        qe1.this.s(ve1Var);
                    }
                };
            }
        }
        return null;
    }

    public void B(@x1 final ve1 ve1Var, long j, @x1 final String str) {
        this.d.c("schedule VPN start in %d", Long.valueOf(j));
        b();
        this.q = this.f.schedule(new Runnable() { // from class: com.p7700g.p99005.he1
            @Override // java.lang.Runnable
            public final void run() {
                qe1.this.u(ve1Var, str);
            }
        }, j, TimeUnit.MILLISECONDS);
        F(true);
    }

    public void C(@x1 ve1 ve1Var, @x1 String str) {
        D(ve1Var, true, str, zd1.a);
    }

    public void D(@x1 final ve1 ve1Var, boolean z, @x1 final String str, @x1 final a aVar) {
        if (aVar.a(this.k.a()) && z) {
            this.d.c("Device is already connected, try to start VPN right away", new Object[0]);
            F(true);
            u(ve1Var, str);
            return;
        }
        this.d.c("schedule VPN start on network change", new Object[0]);
        c();
        this.r = this.k.c(a, new nc1() { // from class: com.p7700g.p99005.fe1
            @Override // com.p7700g.p99005.nc1
            public final void a(qc1 qc1Var) {
                qe1.this.w(aVar, ve1Var, str, qc1Var);
            }
        });
        F(true);
    }

    public void E(@x1 oe1 oe1Var) {
        this.m = oe1Var;
    }

    public boolean J() {
        return this.l;
    }

    public void K(@x1 ve1 ve1Var, @x1 String str) {
        this.d.c("VPN start right away", new Object[0]);
        b();
        u(ve1Var, str);
    }

    @z1
    public Runnable g(@x1 final gc1 gc1Var, @x1 en1 en1Var) {
        final int i = this.p;
        final ve1 ve1Var = this.n;
        if (ve1Var == null) {
            this.d.c("There is not vpn start arguments registered. Use registerVpnStartArguments(VpnStartArguments) method prior to calling findVpnExceptionHandler(VpnException) method", new Object[0]);
            return null;
        }
        this.d.c("connection attempt #%d", Integer.valueOf(i));
        for (final pe1 pe1Var : this.j) {
            if (pe1Var.d(ve1Var, gc1Var, en1Var, i)) {
                this.d.c("%s was handled by %s", gc1Var, pe1Var.getClass().getSimpleName());
                return new Runnable() { // from class: com.p7700g.p99005.ee1
                    @Override // java.lang.Runnable
                    public final void run() {
                        qe1.this.o(pe1Var, ve1Var, gc1Var, i);
                    }
                };
            }
        }
        gc1 unWrap = gc1.unWrap(gc1Var);
        boolean z = (unWrap instanceof jc1) || (unWrap instanceof hc1);
        if (this.o && i < 3 && !(unWrap instanceof ub1) && !z) {
            this.d.c("will schedule reconnect on network change", new Object[0]);
            return new Runnable() { // from class: com.p7700g.p99005.ge1
                @Override // java.lang.Runnable
                public final void run() {
                    qe1.this.q(ve1Var);
                }
            };
        }
        this.d.c("%s no handler found", gc1Var.getMessage());
        return null;
    }

    @x1
    public oe1 h() {
        return this.m;
    }

    @x1
    public Context i() {
        return this.e;
    }

    public void j(@x1 ve1 ve1Var) {
        G(ve1Var);
        C(ve1Var, xu0.e.b);
    }

    public void k(boolean z) {
        if (z) {
            F(false);
        }
        b();
    }

    public boolean l() {
        return this.k.b();
    }

    public boolean m() {
        return this.o;
    }

    public synchronized void x() {
        for (pe1 pe1Var : this.j) {
            pe1Var.i();
        }
        this.s.a();
        I();
    }

    public void y() {
        this.s.b();
        I();
        for (pe1 pe1Var : this.j) {
            pe1Var.j();
        }
    }

    public void z(@x1 ve1 ve1Var) {
        G(ve1Var);
    }
}