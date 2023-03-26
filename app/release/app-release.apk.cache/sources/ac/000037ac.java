package com.northghost.caketube;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.sdk.SessionConfig;
import com.google.gson.Gson;
import com.northghost.caketube.CaketubeCredentialsSource;
import com.p7700g.p99005.a21;
import com.p7700g.p99005.aq0;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.ft0;
import com.p7700g.p99005.g51;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.go1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.ho1;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.jf1;
import com.p7700g.p99005.kf1;
import com.p7700g.p99005.nr0;
import com.p7700g.p99005.o41;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.qh3;
import com.p7700g.p99005.qr0;
import com.p7700g.p99005.r21;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.rh3;
import com.p7700g.p99005.sh3;
import com.p7700g.p99005.ti1;
import com.p7700g.p99005.ua1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x11;
import com.p7700g.p99005.z1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class CaketubeCredentialsSource implements ho1 {
    @x1
    private final x11 backend;
    @x1
    private final sh3 configProvider;
    @x1
    private final Context context;
    private final Executor executor = Executors.newSingleThreadScheduledExecutor();
    @x1
    private final h51 switcherStartHelper = (h51) i61.a().d(h51.class);

    public CaketubeCredentialsSource(@x1 Context context, @x1 Bundle bundle, @x1 x11 x11Var, @x1 o41 o41Var, @x1 o51 o51Var) {
        this.context = context;
        this.backend = x11Var;
        this.configProvider = new rh3(context, (Gson) i61.a().d(Gson.class), (jf1) i61.a().d(jf1.class));
    }

    public static /* synthetic */ Object lambda$load$2(ua1 ua1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            ua1Var.a(gc1.cast(dq0Var.E()));
            return null;
        }
        ua1Var.b((go1) r81.f((go1) dq0Var.F()));
        return null;
    }

    /* renamed from: lambda$prepareCreds$1 */
    public /* synthetic */ go1 b(dq0 dq0Var, g51 g51Var) throws Exception {
        ft0 ft0Var = (ft0) r81.f((ft0) dq0Var.F());
        String h = this.configProvider.h(ft0Var, Bundle.EMPTY);
        r21 d = kf1.d(this.context, this.switcherStartHelper.c(g51Var.e()));
        if (d != null) {
            h = d.a(ft0Var, null, h, g51Var.e());
        }
        Bundle bundle = new Bundle();
        this.switcherStartHelper.e(bundle, ft0Var, g51Var.e(), g51Var.a());
        Bundle bundle2 = new Bundle();
        this.switcherStartHelper.e(bundle2, ft0Var, g51Var.e(), g51Var.a());
        Bundle bundle3 = new Bundle();
        bundle3.putString("server_protocol", g51Var.e().getTransport());
        return go1.d().i(bundle2).j(h).l(bundle).n(bundle3).k((int) TimeUnit.SECONDS.toMillis(120L)).o(g51Var.e().getVpnParams()).h();
    }

    @x1
    private dq0<go1> loadCreds(@x1 final g51 g51Var) {
        nr0 nr0Var = qh3.w.equals(g51Var.e().getTransport()) ? nr0.OPENVPN_UDP : nr0.OPENVPN_TCP;
        a21.a aVar = new a21.a();
        SessionConfig e = g51Var.e();
        this.backend.s(new qr0.a().g(nr0Var).k(e.getPrivateGroup()).h(e.getCountry()).j(e.getLocation()).i(g51Var.c()).f(), aVar);
        return aVar.c().u(new aq0() { // from class: com.p7700g.p99005.oh3
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return CaketubeCredentialsSource.this.a(g51Var, dq0Var);
            }
        });
    }

    @x1
    /* renamed from: prepareCreds */
    public dq0<go1> a(@x1 final g51 g51Var, @x1 final dq0<ft0> dq0Var) {
        if (dq0Var.J()) {
            return dq0.C(dq0Var.E());
        }
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.nh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CaketubeCredentialsSource.this.b(dq0Var, g51Var);
            }
        }, this.executor);
    }

    @Override // com.p7700g.p99005.ho1
    @z1
    public go1 get(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle) throws Exception {
        return null;
    }

    @Override // com.p7700g.p99005.ho1
    public void load(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle, @x1 final ua1<go1> ua1Var) {
        loadCreds(this.switcherStartHelper.h(bundle)).q(new aq0() { // from class: com.p7700g.p99005.mh3
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                CaketubeCredentialsSource.lambda$load$2(ua1.this, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.ho1
    @z1
    public ve1 loadStartParams() {
        return null;
    }

    @Override // com.p7700g.p99005.ho1
    public void preloadCredentials(@x1 String str, @x1 Bundle bundle) {
    }

    @Override // com.p7700g.p99005.ho1
    public void storeStartParams(@x1 ve1 ve1Var) {
    }
}