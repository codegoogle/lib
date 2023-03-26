package com.anchorfree.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.HydraCredentialsSource;
import com.google.gson.Gson;
import com.p7700g.p99005.a21;
import com.p7700g.p99005.aq0;
import com.p7700g.p99005.c81;
import com.p7700g.p99005.d41;
import com.p7700g.p99005.d81;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.f61;
import com.p7700g.p99005.ft0;
import com.p7700g.p99005.g51;
import com.p7700g.p99005.g61;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.gn1;
import com.p7700g.p99005.go1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.ho1;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.i81;
import com.p7700g.p99005.j81;
import com.p7700g.p99005.jf1;
import com.p7700g.p99005.k31;
import com.p7700g.p99005.k81;
import com.p7700g.p99005.kf1;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.mr0;
import com.p7700g.p99005.n31;
import com.p7700g.p99005.nr0;
import com.p7700g.p99005.o41;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.oq0;
import com.p7700g.p99005.p31;
import com.p7700g.p99005.q21;
import com.p7700g.p99005.qr0;
import com.p7700g.p99005.r21;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.s31;
import com.p7700g.p99005.t31;
import com.p7700g.p99005.tb1;
import com.p7700g.p99005.ti1;
import com.p7700g.p99005.ua1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x11;
import com.p7700g.p99005.x31;
import com.p7700g.p99005.yx0;
import com.p7700g.p99005.z1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes.dex */
public class HydraCredentialsSource implements ho1 {
    @x1
    public static final String EXTRA_LOCAL_CONFIG_PATCH = "extra:hydra:patch";
    @x1
    public static final String KEY_LAST_START_PARAMS = "key:last_start_params";
    @x1
    private final o51 configSource;
    @x1
    private final Context context;
    @x1
    private List<b> credentialsHandlers;
    @x1
    private final Gson gson;
    @x1
    private final f61 hydraConfigProvider;
    @x1
    private final x11 networkLayer;
    @x1
    private final x31 prefs;
    @x1
    private final o41 remoteFileListener;
    @x1
    private final h51 switcherStartHelper;
    @x1
    private static final kj1 LOGGER = kj1.b("PartnerCredentialsSource");
    @x1
    private static final ExecutorService ASYNC_EXECUTOR = Executors.newSingleThreadExecutor();

    /* loaded from: classes.dex */
    public static class a {
        @x1
        public final gn1 a;
        @x1
        public final SessionConfig b;
        @z1
        public final mr0 c;
        @x1
        public final ft0 d;

        public a(@x1 gn1 gn1Var, @x1 SessionConfig sessionConfig, @z1 mr0 mr0Var, @x1 ft0 ft0Var) {
            this.a = gn1Var;
            this.b = sessionConfig;
            this.c = mr0Var;
            this.d = ft0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(@x1 ft0 ft0Var, @x1 String str, @x1 q21 q21Var, @x1 SessionConfig sessionConfig) throws Exception;
    }

    public HydraCredentialsSource(@x1 Context context, @x1 Bundle bundle, @x1 x11 x11Var, @x1 o41 o41Var, @x1 o51 o51Var) {
        initProvider(context);
        this.configSource = o51Var;
        this.prefs = (x31) i61.a().d(x31.class);
        this.context = context;
        f61 createConfigProvider = createConfigProvider(context);
        this.hydraConfigProvider = createConfigProvider;
        this.networkLayer = x11Var;
        this.gson = kf1.e();
        this.switcherStartHelper = (h51) i61.a().d(h51.class);
        ArrayList arrayList = new ArrayList();
        this.credentialsHandlers = arrayList;
        arrayList.add(new t31(createConfigProvider));
        this.credentialsHandlers.add(new p31(LOGGER));
        this.remoteFileListener = o41Var;
    }

    @x1
    private Bundle configBundle(@x1 ClientInfo clientInfo) {
        Bundle bundle = new Bundle();
        bundle.putString("partner_carrier", clientInfo.getCarrierId());
        bundle.putString("hydra_base_url", TextUtils.join(",", clientInfo.getUrls()));
        return bundle;
    }

    @x1
    private go1 getCredentialsResponse(@x1 g51 g51Var, @z1 mr0 mr0Var, @x1 SessionConfig sessionConfig, @x1 ft0 ft0Var, @x1 gn1 gn1Var) throws Exception {
        q21 q21Var = new q21(sessionConfig.getConfig(), sessionConfig.getDnsRules(), sessionConfig.getProxyRules(), mr0Var != null ? mr0Var.f() : null);
        ArrayList arrayList = new ArrayList(this.credentialsHandlers);
        arrayList.add(new n31(LOGGER, sessionConfig.getExtras().get(EXTRA_LOCAL_CONFIG_PATCH)));
        r21 d = kf1.d(this.context, this.switcherStartHelper.c(sessionConfig));
        arrayList.add(new d41(d));
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = ((b) it.next()).a(ft0Var, str, q21Var, sessionConfig);
        }
        Bundle bundle = new Bundle();
        ClientInfo a2 = g51Var.a();
        this.switcherStartHelper.e(bundle, ft0Var, sessionConfig, a2);
        Bundle bundle2 = new Bundle();
        this.switcherStartHelper.e(bundle2, ft0Var, sessionConfig, a2);
        return go1.d().i(bundle).j(this.hydraConfigProvider.i(str)).l(bundle2).m(patcherCert(ft0Var, d, sessionConfig)).n(configBundle(a2)).o(gn1Var).k((int) TimeUnit.SECONDS.toMillis(30L)).h();
    }

    private void initProvider(@x1 Context context) {
        try {
            context.getContentResolver().call(Uri.parse(String.format("content://%s.sdk.transport.hydra", context.getPackageName())), e31.b, "", Bundle.EMPTY);
        } catch (Throwable th) {
            LOGGER.f(th);
        }
    }

    public static /* synthetic */ ft0 lambda$loadCreds$1(dq0 dq0Var) throws Exception {
        ft0 ft0Var = (ft0) dq0Var.F();
        if (!dq0Var.J() && ft0Var == null) {
            throw new tb1(new RuntimeException("Creds are null"));
        }
        if (dq0Var.J()) {
            throw dq0Var.E();
        }
        return ft0Var;
    }

    public static /* synthetic */ Object lambda$loadCreds$4(ua1 ua1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            ua1Var.a(d81.b(dq0Var.E()));
            return null;
        }
        ua1Var.b((go1) r81.f((go1) dq0Var.F()));
        return null;
    }

    /* renamed from: lambda$loadCreds$5 */
    public /* synthetic */ dq0 c(final SessionConfig sessionConfig, final g51 g51Var, final mr0 mr0Var, final gn1 gn1Var, final ua1 ua1Var, dq0 dq0Var) throws Exception {
        return loadCredentials(new qr0.a().g(nr0.HYDRA_TCP).h(sessionConfig.getCountry()).j(sessionConfig.getLocation()).k(sessionConfig.getPrivateGroup()).i(g51Var.c()).f()).q(yx0.a).P(new aq0() { // from class: com.p7700g.p99005.ux0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return HydraCredentialsSource.this.a(mr0Var, sessionConfig, gn1Var, dq0Var2);
            }
        }).P(new aq0() { // from class: com.p7700g.p99005.by0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return HydraCredentialsSource.this.b(g51Var, dq0Var2);
            }
        }).q(new aq0() { // from class: com.p7700g.p99005.xx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                HydraCredentialsSource.lambda$loadCreds$4(ua1.this, dq0Var2);
                return null;
            }
        });
    }

    private /* synthetic */ dq0 lambda$patchStart$7(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        return prepareStartConfig(sessionConfig);
    }

    public static /* synthetic */ a lambda$patchStart$8(gn1 gn1Var, mr0 mr0Var, ft0 ft0Var, dq0 dq0Var) throws Exception {
        return new a(gn1Var, (SessionConfig) r81.f((SessionConfig) dq0Var.F()), mr0Var, ft0Var);
    }

    /* renamed from: lambda$prepareCredsTask$9 */
    public /* synthetic */ go1 e(dq0 dq0Var, g51 g51Var) throws Exception {
        try {
            a aVar = (a) r81.f((a) dq0Var.F());
            ft0 ft0Var = aVar.d;
            if (ft0Var != null) {
                return getCredentialsResponse(g51Var, aVar.c, aVar.b, ft0Var, aVar.a);
            }
            throw new NullPointerException("Empty creds");
        } catch (Throwable th) {
            throw new tb1(th);
        }
    }

    /* renamed from: lambda$prepareStartConfig$6 */
    public /* synthetic */ dq0 f(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        return patchStartConfig(sessionConfig, (List) dq0Var.F());
    }

    public static /* synthetic */ Void lambda$removeSDHistory$0(File file) throws Exception {
        try {
            File file2 = new File(file, "sd_history");
            if (!file2.exists() || file2.delete()) {
                return null;
            }
            LOGGER.e("Failed to delete sd_history", new Object[0]);
            return null;
        } catch (Throwable th) {
            LOGGER.f(th);
            return null;
        }
    }

    @x1
    private dq0<ft0> loadCredentials(@x1 qr0 qr0Var) {
        a21.a aVar = new a21.a();
        this.networkLayer.s(qr0Var, aVar);
        return aVar.c();
    }

    private void loadCreds(@x1 final g51 g51Var, @z1 final mr0 mr0Var, @x1 final SessionConfig sessionConfig, @x1 final gn1 gn1Var, @x1 final ua1<go1> ua1Var) {
        removeSDHistory(this.context.getCacheDir()).u(new aq0() { // from class: com.p7700g.p99005.zx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return HydraCredentialsSource.this.c(sessionConfig, g51Var, mr0Var, gn1Var, ua1Var, dq0Var);
            }
        });
    }

    @x1
    /* renamed from: patchStart */
    public dq0<a> a(@z1 final mr0 mr0Var, @x1 final SessionConfig sessionConfig, @x1 final gn1 gn1Var, @x1 dq0<ft0> dq0Var) {
        final ft0 ft0Var = (ft0) r81.f(dq0Var.F());
        return this.remoteFileListener.a(mr0Var, (ft0) r81.f(ft0Var)).u(new aq0() { // from class: com.p7700g.p99005.ay0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return HydraCredentialsSource.this.d(sessionConfig, dq0Var2);
            }
        }).q(new aq0() { // from class: com.p7700g.p99005.vx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return HydraCredentialsSource.lambda$patchStart$8(gn1.this, mr0Var, ft0Var, dq0Var2);
            }
        });
    }

    @x1
    private dq0<SessionConfig> patchStartConfig(@x1 SessionConfig sessionConfig, @z1 List<k81<? extends s31>> list) {
        if (list != null) {
            for (k81<? extends s31> k81Var : list) {
                try {
                    sessionConfig = ((s31) j81.a().b(k81Var)).a(this.context, sessionConfig);
                } catch (i81 e) {
                    LOGGER.f(e);
                }
            }
        }
        return dq0.D(sessionConfig);
    }

    @x1
    private String patcherCert(@x1 ft0 ft0Var, @z1 r21 r21Var, @x1 SessionConfig sessionConfig) {
        if (r21Var != null) {
            return r21Var.b(ft0Var, sessionConfig);
        }
        return (String) r81.f(ft0Var.j());
    }

    @x1
    /* renamed from: prepareCredsTask */
    public dq0<go1> b(@x1 final g51 g51Var, @x1 final dq0<a> dq0Var) {
        if (dq0Var.J()) {
            return dq0.C(dq0Var.E());
        }
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.wx0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HydraCredentialsSource.this.e(dq0Var, g51Var);
            }
        }, ASYNC_EXECUTOR);
    }

    @x1
    private dq0<SessionConfig> prepareStartConfig(@x1 final SessionConfig sessionConfig) {
        return this.configSource.r0().u(new aq0() { // from class: com.p7700g.p99005.sx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return HydraCredentialsSource.this.f(sessionConfig, dq0Var);
            }
        });
    }

    @x1
    private dq0<Void> removeSDHistory(@x1 final File file) {
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.tx0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HydraCredentialsSource.lambda$removeSDHistory$0(file);
                return null;
            }
        });
    }

    @x1
    public f61 createConfigProvider(@x1 Context context) {
        return new f61(context, new g61((c81) i61.a().d(c81.class), oq0.l.f), new k31(), (jf1) i61.a().d(jf1.class));
    }

    public /* synthetic */ dq0 d(SessionConfig sessionConfig, dq0 dq0Var) {
        return prepareStartConfig(sessionConfig);
    }

    @Override // com.p7700g.p99005.ho1
    @x1
    public go1 get(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle) throws Exception {
        g51 h = this.switcherStartHelper.h(bundle);
        ft0 b2 = h.b();
        SessionConfig e = h.e();
        return getCredentialsResponse(h, h.d(), e, (ft0) r81.f(b2), e.getVpnParams());
    }

    @Override // com.p7700g.p99005.ho1
    public void load(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle, @x1 ua1<go1> ua1Var) {
        try {
            g51 h = this.switcherStartHelper.h(bundle);
            SessionConfig e = h.e();
            loadCreds(h, (mr0) bundle.getSerializable(kf1.a), e, e.getVpnParams(), ua1Var);
        } catch (Throwable th) {
            LOGGER.f(th);
            ua1Var.a(gc1.cast(th));
        }
    }

    @Override // com.p7700g.p99005.ho1
    @z1
    public ve1 loadStartParams() {
        try {
            return (ve1) this.gson.n(this.prefs.e(KEY_LAST_START_PARAMS, ""), ve1.class);
        } catch (Throwable th) {
            LOGGER.f(th);
            return null;
        }
    }

    @Override // com.p7700g.p99005.ho1
    public void preloadCredentials(@x1 String str, @x1 Bundle bundle) {
    }

    @Override // com.p7700g.p99005.ho1
    public void storeStartParams(@z1 ve1 ve1Var) {
        if (ve1Var != null) {
            this.prefs.c().b(KEY_LAST_START_PARAMS, this.gson.z(ve1Var)).a();
        }
    }
}