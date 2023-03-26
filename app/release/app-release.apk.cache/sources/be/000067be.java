package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.anchorfree.vpnsdk.network.probe.DefaultNetworkProbeFactory;
import com.anchorfree.vpnsdk.vpnservice.config.VpnConfigProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: VpnConfigController.java */
/* loaded from: classes2.dex */
public class yn1 extends BroadcastReceiver {
    @x1
    private static final kj1 a = kj1.b("VpnConfigController");
    @x1
    private final Context b;
    @x1
    private final Executor c;
    @z1
    private zn1 d;
    @z1
    private xn1 e;

    public yn1(@x1 Context context, @x1 Executor executor) {
        this.b = context;
        this.c = executor;
    }

    @x1
    public static String a(@x1 Context context) {
        return String.format("%s.%s", context.getPackageName(), VpnConfigProvider.t);
    }

    @x1
    private do1 b(@x1 zn1 zn1Var) throws tn1 {
        vn1<? extends do1> d = zn1Var.d();
        if (d == null) {
            return on1.a;
        }
        return (do1) un1.a().b(d);
    }

    @x1
    private static md1 c(@x1 zn1 zn1Var) throws tn1 {
        vn1<? extends md1> e = zn1Var.e();
        if (e != null) {
            return (md1) un1.a().b(e);
        }
        return new DefaultNetworkProbeFactory();
    }

    @x1
    private static qa1 d(@x1 zn1 zn1Var) throws tn1 {
        return (qa1) un1.a().b(zn1Var.i());
    }

    private /* synthetic */ dq0 f(xn1 xn1Var, dq0 dq0Var) throws Exception {
        return s(xn1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ zn1 i() throws Exception {
        Bundle bundle = (Bundle) r81.f(this.b.getContentResolver().call(VpnConfigProvider.c(this.b), VpnConfigProvider.w, (String) null, (Bundle) null));
        bundle.setClassLoader(getClass().getClassLoader());
        return (zn1) bundle.getParcelable(VpnConfigProvider.u);
    }

    private /* synthetic */ Void j(xn1 xn1Var, boolean z, dq0 dq0Var) throws Exception {
        zn1 zn1Var = (zn1) dq0Var.F();
        if (zn1Var == null) {
            zn1Var = VpnConfigProvider.d(this.b);
        }
        q(xn1Var, zn1Var, z);
        return null;
    }

    private /* synthetic */ Object l(dq0 dq0Var) throws Exception {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(a(this.b));
        this.b.registerReceiver(this, intentFilter);
        return null;
    }

    private /* synthetic */ Void n() throws Exception {
        this.b.getContentResolver().call(VpnConfigProvider.c(this.b), VpnConfigProvider.y, (String) null, (Bundle) null);
        return null;
    }

    private void p(@x1 xn1 xn1Var, @x1 zn1 zn1Var, @z1 zn1 zn1Var2) throws tn1 {
        qa1 d;
        md1 c;
        re1 re1Var = null;
        if (zn1Var2 != null && r81.d(zn1Var2.i(), zn1Var.i()) && r81.d(zn1Var2.e(), zn1Var.e())) {
            d = null;
            c = null;
        } else {
            d = d(zn1Var);
            c = c(zn1Var);
        }
        do1 b = (zn1Var2 == null || !r81.d(zn1Var2.d(), zn1Var.d())) ? b(zn1Var) : null;
        if (zn1Var2 == null || !r81.d(zn1Var2.g(), zn1Var.g())) {
            re1Var = zn1Var.g();
            re1Var.j();
        }
        if (d != null && c != null) {
            xn1Var.b(d, c);
        }
        if (b != null) {
            xn1Var.j(b);
        }
        if (re1Var != null) {
            xn1Var.d(re1Var);
        }
    }

    private void q(@x1 final xn1 xn1Var, zn1 zn1Var, boolean z) {
        try {
            p(xn1Var, zn1Var, this.d);
            this.d = zn1Var;
        } catch (tn1 e) {
            if (!z) {
                u().u(new aq0() { // from class: com.p7700g.p99005.rn1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return yn1.this.g(xn1Var, dq0Var);
                    }
                });
                return;
            }
            throw new RuntimeException(e);
        }
    }

    @x1
    private dq0<zn1> r() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.sn1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yn1.this.i();
            }
        }, this.c);
    }

    private dq0<Void> s(@x1 final xn1 xn1Var, final boolean z) {
        return r().s(new aq0() { // from class: com.p7700g.p99005.pn1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                yn1.this.k(xn1Var, z, dq0Var);
                return null;
            }
        }, this.c);
    }

    private dq0<Void> u() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.qn1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yn1.this.o();
                return null;
            }
        }, this.c);
    }

    public /* synthetic */ dq0 g(xn1 xn1Var, dq0 dq0Var) {
        return s(xn1Var, true);
    }

    public /* synthetic */ Void k(xn1 xn1Var, boolean z, dq0 dq0Var) {
        j(xn1Var, z, dq0Var);
        return null;
    }

    public /* synthetic */ Object m(dq0 dq0Var) {
        l(dq0Var);
        return null;
    }

    public /* synthetic */ Void o() {
        n();
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 Context context, @x1 Intent intent) {
        zn1 zn1Var = (zn1) intent.getParcelableExtra(VpnConfigProvider.u);
        xn1 xn1Var = this.e;
        if (xn1Var != null) {
            q(xn1Var, zn1Var, false);
        }
    }

    public void t(@x1 xn1 xn1Var) {
        this.e = xn1Var;
        s(xn1Var, false).q(new aq0() { // from class: com.p7700g.p99005.nn1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                yn1.this.m(dq0Var);
                return null;
            }
        });
    }

    public void v() {
        try {
            this.e = null;
            this.d = null;
            this.b.unregisterReceiver(this);
        } catch (Throwable th) {
            a.o(th);
        }
    }
}