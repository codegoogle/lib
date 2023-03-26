package com.anchorfree.vpnsdk.vpnservice.credentials;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.anchorfree.vpnsdk.vpnservice.credentials.DefaultCaptivePortalChecker;
import com.anythink.expressad.video.module.a.a.m;
import com.p7700g.p99005.do1;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.eo1;
import com.p7700g.p99005.fc1;
import com.p7700g.p99005.fr5;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.hq5;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.iq5;
import com.p7700g.p99005.jr5;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.kr5;
import com.p7700g.p99005.me1;
import com.p7700g.p99005.oc1;
import com.p7700g.p99005.od1;
import com.p7700g.p99005.qc1;
import com.p7700g.p99005.rc1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.va1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DefaultCaptivePortalChecker implements do1 {
    @x1
    public static final String a = "connectivitycheck.gstatic.com";
    public static final String b = "/generate_204";
    @x1
    private static final String c = "http://connectivitycheck.gstatic.com/generate_204";
    @x1
    private static final String d = "https://connectivitycheck.gstatic.com/generate_204";
    public static final int e = 3000;
    @x1
    private final kj1 f;
    @x1
    private final String g;
    @z1
    private me1 h;

    /* loaded from: classes2.dex */
    public class a implements iq5 {
        public final /* synthetic */ Context a;
        public final /* synthetic */ va1 b;
        public final /* synthetic */ Bundle c;

        public a(Context context, va1 va1Var, Bundle bundle) {
            this.a = context;
            this.b = va1Var;
            this.c = bundle;
        }

        @Override // com.p7700g.p99005.iq5
        public void a(@x1 hq5 hq5Var, @x1 jr5 jr5Var) {
            DefaultCaptivePortalChecker.this.f.c("Captive portal detection response", new Object[0]);
            gc1 gc1Var = null;
            try {
                kr5 v = jr5Var.v();
                long j = v == null ? -1L : v.j();
                DefaultCaptivePortalChecker.this.f.c("Captive response code: %d redirect: %s content-length: %d ", Integer.valueOf(jr5Var.E()), Boolean.valueOf(jr5Var.Z()), Long.valueOf(j));
                if (jr5Var.E() == 302 || j > 0) {
                    gc1Var = DefaultCaptivePortalChecker.this.e(this.c);
                }
                jr5Var.close();
            } catch (Throwable th) {
                DefaultCaptivePortalChecker.this.f.o(th);
            }
            if (gc1Var != null) {
                this.b.a(gc1Var);
            } else {
                this.b.complete();
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            DefaultCaptivePortalChecker.this.f.g(iOException, "Captive portal detection failed", new Object[0]);
            if (DefaultCaptivePortalChecker.this.i(this.a, this.b, this.c)) {
                return;
            }
            this.b.complete();
        }
    }

    public DefaultCaptivePortalChecker() {
        this(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public gc1 e(@x1 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        try {
            bundle2.putString(xu0.f.A, bundle.getString(xu0.f.A));
        } catch (Throwable th) {
            this.f.f(th);
        }
        return new fc1(bundle2, new eo1());
    }

    @x1
    private static String f() {
        return (Build.VERSION.SDK_INT < 24 || !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(a)) ? d : c;
    }

    private /* synthetic */ Object g(Context context, td1 td1Var, va1 va1Var, Bundle bundle) throws Exception {
        fr5.a c2 = od1.c(context, td1Var, false, true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2.j0(m.af, timeUnit).k(m.af, timeUnit).f().a(new hr5.a().B(this.g).b()).D1(new a(context, va1Var, bundle));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(@x1 Context context, @x1 va1 va1Var, @x1 Bundle bundle) {
        NetworkCapabilities d2;
        try {
            if (this.h == null) {
                this.h = oc1.a.a(context, Executors.newSingleThreadScheduledExecutor());
            }
            qc1 a2 = this.h.a();
            this.f.c("Got network info %s", a2);
            if ((a2 instanceof rc1) && (d2 = ((rc1) a2).d()) != null && d2.hasCapability(17)) {
                this.f.c("Captive portal detected on network capabilities", new Object[0]);
                va1Var.a(e(bundle));
                return true;
            }
        } catch (Throwable th) {
            this.f.f(th);
        }
        return false;
    }

    @Override // com.p7700g.p99005.do1
    public void a(@x1 final Context context, @z1 final td1 td1Var, @x1 final va1 va1Var, @x1 final Bundle bundle) {
        this.f.c("Captive portal detection started", new Object[0]);
        if (i(context, va1Var, bundle)) {
            return;
        }
        this.f.c("Captive portal detection with url %s started", this.g);
        dq0.g(new Callable() { // from class: com.p7700g.p99005.bo1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DefaultCaptivePortalChecker.this.h(context, td1Var, va1Var, bundle);
                return null;
            }
        });
    }

    public /* synthetic */ Object h(Context context, td1 td1Var, va1 va1Var, Bundle bundle) {
        g(context, td1Var, va1Var, bundle);
        return null;
    }

    public DefaultCaptivePortalChecker(@x1 String str) {
        this.f = kj1.b("CaptivePortalChecker");
        this.g = str;
    }
}