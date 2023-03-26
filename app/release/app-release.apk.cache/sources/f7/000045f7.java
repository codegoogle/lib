package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.expressad.foundation.c.d;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.Admob;
import com.greedygame.core.models.core.App;
import com.greedygame.core.models.core.BidModel;
import com.greedygame.core.models.core.Device;
import com.greedygame.core.models.core.Fb;
import com.greedygame.core.models.core.Geo;
import com.greedygame.core.models.core.Mopub;
import com.greedygame.core.models.core.Os;
import com.greedygame.core.models.core.Play;
import com.greedygame.core.models.core.Screen;
import com.greedygame.core.models.core.Sdk;
import com.greedygame.core.models.core.User;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.g83;
import com.p7700g.p99005.gy2;
import com.p7700g.p99005.qp4;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h73 implements g83.b, g83.c {
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private static final String b = "greedygame";
    @NotNull
    private static String c = "android_native";
    @NotNull
    private static String d = "0";
    private iy2 e;
    @NotNull
    private final vz2<String, String> f;
    @NotNull
    private final AtomicBoolean g;
    @NotNull
    private final AtomicBoolean h;
    @NotNull
    private final AtomicBoolean i;
    @Nullable
    private cy2 j;
    private Context k;
    public File l;
    @Nullable
    private c m;
    private g83 n;
    private AppConfig o;
    private c03 p;
    private Handler q;
    @NotNull
    private final qo4 r;

    /* loaded from: classes3.dex */
    public static final class a {
        @Nullable
        private iy2 a;

        @NotNull
        public final a a(@NotNull iy2 iy2Var) {
            c25.p(iy2Var, "sharedPrefHelper");
            this.a = iy2Var;
            return this;
        }

        @NotNull
        public final h73 b() {
            if (this.a == null) {
                xz2.c("SDKHlpr", "[ERROR] Need all the objects to create the SDKHelper");
            }
            h73 a = h73.a.a();
            a.o();
            return a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h73 a() {
            return d.a.a();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(@NotNull s13 s13Var);

        void b();
    }

    /* loaded from: classes3.dex */
    public static final class d {
        @NotNull
        public static final d a = new d();
        @NotNull
        private static final h73 b = new h73(null);

        private d() {
        }

        @NotNull
        public final h73 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends e25 implements uz4<String> {
        public e() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final String x() {
            AppConfig appConfig = h73.this.o;
            if (appConfig != null) {
                return appConfig.f();
            }
            c25.S("appConfig");
            throw null;
        }
    }

    private h73() {
        this.f = new vz2<>();
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.r = so4.c(new e());
    }

    public /* synthetic */ h73(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InitializationStatus initializationStatus) {
        xz2.c("SDKHlpr", "ADMOB SDK::initialized");
    }

    private final void h(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        vz2<String, String> vz2Var = this.f;
        if (str2 == null) {
            str2 = "";
        }
        vz2Var.put(str, str2);
    }

    private final String n() {
        return l("bundle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        c25.m(iNSTANCE$com_greedygame_sdkx_core);
        AppConfig r = iNSTANCE$com_greedygame_sdkx_core.r();
        this.o = r;
        if (r != null) {
            this.p = r.t();
            AppConfig appConfig = this.o;
            if (appConfig != null) {
                this.k = appConfig.e();
                AppConfig appConfig2 = this.o;
                if (appConfig2 == null) {
                    c25.S("appConfig");
                    throw null;
                }
                this.e = appConfig2.r();
                Context context = this.k;
                if (context == null) {
                    c25.S("context");
                    throw null;
                }
                iy2 iy2Var = this.e;
                if (iy2Var != null) {
                    this.j = new cy2(context, iy2Var);
                    h("game-eng", c);
                    h("enginev", d);
                    c03 c03Var = this.p;
                    if (c03Var != null) {
                        h("consent", c03Var.c() ? "1" : "0");
                        this.q = new Handler(Looper.getMainLooper());
                        Context context2 = this.k;
                        if (context2 != null) {
                            this.n = new g83(context2);
                            u();
                            return;
                        }
                        c25.S("context");
                        throw null;
                    }
                    c25.S("privacyConfig");
                    throw null;
                }
                c25.S("sharedPrefHelper");
                throw null;
            }
            c25.S("appConfig");
            throw null;
        }
        c25.S("appConfig");
        throw null;
    }

    private final void p() {
        AppConfig r;
        cy2 cy2Var = this.j;
        c25.m(cy2Var);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        dy2.g((iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) ? null : r.e());
        h("carrier", cy2Var.c());
        h("mcc", cy2Var.k());
        h("ai5", cy2Var.a());
        h("uuid", cy2Var.r());
        h("model", cy2Var.g());
        h("d", cy2Var.p());
        h("cr", cy2Var.o());
        h("screen", cy2Var.h());
        h(d.a.f, cy2Var.b());
        h("isrc", "1");
        h("manufacturer", cy2Var.f());
        h("locale", cy2Var.j());
        h("di", cy2Var.i());
        h("os_ver", cy2Var.n());
        h("api_level", String.valueOf(cy2Var.l()));
        h("os_num", cy2Var.m());
        AppConfig appConfig = this.o;
        if (appConfig != null) {
            h("admob_enabled", String.valueOf(appConfig.i()));
            AppConfig appConfig2 = this.o;
            if (appConfig2 != null) {
                h("facebook_enabled", String.valueOf(appConfig2.k()));
                AppConfig appConfig3 = this.o;
                if (appConfig3 != null) {
                    h("mopub_enabled", String.valueOf(appConfig3.m()));
                    c03 c03Var = this.p;
                    if (c03Var != null) {
                        h("coppa", c03Var.b() ? "1" : "0");
                        try {
                            h("mopub_version", "5.10.0");
                        } catch (Exception unused) {
                            xz2.d("SDKHlpr", "Mopub SDK Not found");
                        }
                        try {
                            h("facebook_version", "6.6.0");
                            return;
                        } catch (Exception unused2) {
                            xz2.d("SDKHlpr", "Facebook SDK Not found");
                            return;
                        }
                    }
                    c25.S("privacyConfig");
                    throw null;
                }
                c25.S("appConfig");
                throw null;
            }
            c25.S("appConfig");
            throw null;
        }
        c25.S("appConfig");
        throw null;
    }

    private final void q() {
    }

    private final void r() {
        Context context = this.k;
        if (context != null) {
            h("bundle", context.getPackageName());
        } else {
            c25.S("context");
            throw null;
        }
    }

    private final void s() {
        Context context = this.k;
        if (context != null) {
            try {
                String n = n();
                if (n == null) {
                    return;
                }
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(n, 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    h("appv", String.valueOf(packageInfo.getLongVersionCode()));
                } else {
                    h("appv", String.valueOf(packageInfo.versionCode));
                }
                h("appn", packageInfo.versionName);
                return;
            } catch (PackageManager.NameNotFoundException e2) {
                xz2.c("SDKHlpr", c25.C("[ERROR] Exception while retrieving versioncode ", e2.getMessage()));
                return;
            }
        }
        c25.S("context");
        throw null;
    }

    private final void t() {
        h("sdkn", "3042");
    }

    private final void u() {
        gy2.a aVar = gy2.a;
        Context context = this.k;
        if (context != null) {
            gy2 a2 = aVar.a(context);
            c25.m(a2);
            if (a2.d("android.permission.WRITE_EXTERNAL_STORAGE") && c25.g("mounted", Environment.getExternalStorageState())) {
                Context context2 = this.k;
                if (context2 != null) {
                    g(new File(context2.getExternalFilesDir(null), b));
                } else {
                    c25.S("context");
                    throw null;
                }
            }
            if (this.l == null) {
                Context context3 = this.k;
                if (context3 != null) {
                    g(new File(context3.getFilesDir(), b));
                } else {
                    c25.S("context");
                    throw null;
                }
            }
            if (!c().exists()) {
                c().mkdirs();
            }
            xz2.c("SDKHlpr", c25.C("Campaign storage path: ", c().getAbsolutePath()));
            return;
        }
        c25.S("context");
        throw null;
    }

    private final void w() {
        h("sdkv", "0.0.94");
    }

    private final void x() {
        h("imgv2", "0.0.94");
        h("imgv", "0.0.94");
    }

    @Override // com.p7700g.p99005.g83.b
    public void a(@NotNull String str) {
        c25.p(str, "playVersion");
        h("play_version", str);
        this.h.set(true);
        m();
    }

    @Override // com.p7700g.p99005.g83.b
    public void b(@NotNull String str, boolean z) {
        c25.p(str, "advId");
        Context context = this.k;
        if (context == null) {
            c25.S("context");
            throw null;
        } else if (context != null) {
            String string = context.getString(b03.l.g0);
            c25.o(string, "context.getString(R.string.gg_exposed_shared_pref_name)");
            new iy2(context, string).c("advid", str);
            h("advid", str);
            h("optout", z ? "1" : "0");
            this.i.set(true);
            m();
        } else {
            c25.S("context");
            throw null;
        }
    }

    @NotNull
    public final File c() {
        File file = this.l;
        if (file != null) {
            return file;
        }
        c25.S("storageBasePath");
        throw null;
    }

    public final void e(@NotNull c cVar) {
        c25.p(cVar, "preparationListener");
        xz2.c("SDKHlpr", "Preparing SDKHelper");
        this.m = cVar;
        this.i.set(false);
        this.g.set(false);
        if (!ad3.a.a()) {
            cVar.a(s13.MISSING_EXTERNAL_DEPENDENCY);
            this.m = null;
            return;
        }
        w();
        x();
        t();
        r();
        s();
        q();
        m();
        p();
        g83 g83Var = this.n;
        if (g83Var != null) {
            g83Var.f(this);
            c03 c03Var = this.p;
            if (c03Var == null) {
                c25.S("privacyConfig");
                throw null;
            } else if (c03Var.d()) {
                g83 g83Var2 = this.n;
                if (g83Var2 != null) {
                    g83Var2.g(this);
                    return;
                } else {
                    c25.S("playHelper");
                    throw null;
                }
            } else {
                xz2.c("SDKHlpr", "Coppa or DNT Location Enabled so not taking the location");
                c("Coppa or DNT Location Enabled so not taking the location");
                return;
            }
        }
        c25.S("playHelper");
        throw null;
    }

    @r2(otherwise = 2)
    public final void g(@NotNull File file) {
        c25.p(file, "<set-?>");
        this.l = file;
    }

    @NotNull
    public final String j() {
        return (String) this.r.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BidModel k() {
        Geo geo;
        Admob admob;
        Fb fb;
        Object b2;
        Fb fb2;
        AppConfig appConfig;
        AppConfig appConfig2;
        Admob admob2;
        String l = l("appn");
        String str = l == null ? "" : l;
        int c2 = zz2.c(l("appv"));
        String l2 = l("bundle");
        String str2 = l2 == null ? "" : l2;
        String l3 = l("game-eng");
        String str3 = l3 == null ? "" : l3;
        l("game-eng");
        AppConfig appConfig3 = this.o;
        if (appConfig3 != null) {
            w13 u = appConfig3.u();
            App app = new App(str, c2, str2, str3, u == null ? null : u.g());
            l("carrier");
            l("cr");
            int c3 = zz2.c(l("mcc"));
            String l4 = l("locale");
            String str4 = l4 == null ? "" : l4;
            String l5 = l("manufacturer");
            String l6 = l("model");
            String l7 = l("os_ver");
            if (l7 == null) {
                l7 = "";
            }
            String l8 = l("os_num");
            if (l8 == null) {
                l8 = "";
            }
            Os os = new Os(pt0.a, l7, l8, Integer.valueOf(zz2.c(l("api_level"))));
            float f = dy2.f;
            String l9 = l("di");
            Device device = new Device(os, l5, l6, new Screen(dy2.e, dy2.g, f, l9 == null ? null : z85.J0(l9)), str4, Integer.valueOf(c3));
            String l10 = l("latitude");
            Float J0 = l10 == null ? null : z85.J0(l10);
            String l11 = l("longitude");
            Float J02 = l11 == null ? null : z85.J0(l11);
            String l12 = l("lla");
            Float J03 = l12 == null ? null : z85.J0(l12);
            String l13 = l("llf");
            Float J04 = l13 == null ? null : z85.J0(l13);
            c03 c03Var = this.p;
            if (c03Var != null) {
                if (!c03Var.d() || J0 == null) {
                    geo = null;
                } else {
                    J0.floatValue();
                    geo = new Geo(J0, J02, J03, J04);
                }
                AppConfig appConfig4 = this.o;
                if (appConfig4 != null) {
                    if (appConfig4.i()) {
                        g83.a aVar = g83.a;
                        if (aVar.b()) {
                            AppConfig appConfig5 = this.o;
                            if (appConfig5 != null) {
                                MobileAds.initialize(appConfig5.e(), s53.a);
                                admob2 = new Admob(aVar.e());
                            } else {
                                c25.S("appConfig");
                                throw null;
                            }
                        } else {
                            xz2.d("SDKHlpr", "AdMob ads are enabled but AdMob SDK was not found. Add AdMob SDK or disable AdMob ads in AppConfig.Builder to resolve this error.");
                            admob2 = new Admob("unknown");
                        }
                        admob = admob2;
                    } else {
                        admob = null;
                    }
                    AppConfig appConfig6 = this.o;
                    if (appConfig6 != null) {
                        if (appConfig6.k()) {
                            try {
                                qp4.a aVar2 = qp4.s;
                                appConfig = this.o;
                            } catch (Throwable th) {
                                th = th;
                                fb = null;
                            }
                            if (appConfig != null) {
                                if (!AudienceNetworkAds.isInitialized(appConfig.e())) {
                                    AppConfig appConfig7 = this.o;
                                    if (appConfig7 == null) {
                                        c25.S("appConfig");
                                        throw null;
                                    }
                                    AudienceNetworkAds.initialize(appConfig7.e());
                                }
                                fb = new Fb(l("facebook_version"));
                                try {
                                    b2 = qp4.b(yq4.a);
                                } catch (Throwable th2) {
                                    th = th2;
                                    qp4.a aVar3 = qp4.s;
                                    b2 = qp4.b(rp4.a(th));
                                    if (qp4.e(b2) != null) {
                                    }
                                    fb2 = fb;
                                    appConfig2 = this.o;
                                    if (appConfig2 == null) {
                                    }
                                }
                                if (qp4.e(b2) != null) {
                                    xz2.d("SDKHlpr", "Facebook ads are enabled but Facebook SDK was not found. Add Facebook SDK or disable Facebook ads in AppConfig.Builder to resolve this error.");
                                    fb = new Fb("unknown");
                                    yq4 yq4Var = yq4.a;
                                }
                                fb2 = fb;
                            } else {
                                c25.S("appConfig");
                                throw null;
                            }
                        } else {
                            fb2 = null;
                        }
                        appConfig2 = this.o;
                        if (appConfig2 == null) {
                            Mopub mopub = appConfig2.m() ? new Mopub(l("mopub_version")) : null;
                            String l14 = l("play_version");
                            if (l14 == null) {
                                l14 = "";
                            }
                            Play play = new Play(l14);
                            String l15 = l("sdkn");
                            int parseInt = l15 == null ? 0 : Integer.parseInt(l15);
                            String l16 = l("sdkv");
                            Sdk sdk = new Sdk(parseInt, l16 == null ? "" : l16, admob, mopub, fb2, play);
                            User user = new User(null, null, null, null, null, null, 63, null);
                            user.g(l("advid"));
                            user.h(l("ai5"));
                            String l17 = l("optout");
                            user.l(l17 == null ? 0 : Integer.valueOf(Integer.parseInt(l17)));
                            c03 c03Var2 = this.p;
                            if (c03Var2 != null) {
                                user.j(c03Var2.c() ? 1 : 0);
                                c03 c03Var3 = this.p;
                                if (c03Var3 != null) {
                                    user.k(c03Var3.b() ? 1 : 0);
                                    c03 c03Var4 = this.p;
                                    if (c03Var4 != null) {
                                        user.i(c03Var4.a() ? 1 : 0);
                                        BidModel bidModel = new BidModel(user, app, sdk, geo, device, null, 32, null);
                                        AppConfig appConfig8 = this.o;
                                        if (appConfig8 != null) {
                                            bidModel.i(appConfig8.f());
                                            yq4 yq4Var2 = yq4.a;
                                            return bidModel;
                                        }
                                        c25.S("appConfig");
                                        throw null;
                                    }
                                    c25.S("privacyConfig");
                                    throw null;
                                }
                                c25.S("privacyConfig");
                                throw null;
                            }
                            c25.S("privacyConfig");
                            throw null;
                        }
                        c25.S("appConfig");
                        throw null;
                    }
                    c25.S("appConfig");
                    throw null;
                }
                c25.S("appConfig");
                throw null;
            }
            c25.S("privacyConfig");
            throw null;
        }
        c25.S("appConfig");
        throw null;
    }

    @Nullable
    public final String l(@NotNull String str) {
        c25.p(str, "key");
        if (TextUtils.isEmpty(str)) {
            xz2.c("SDKHlpr", "Cannot get value for null key");
            return null;
        }
        String a2 = this.f.a(str, "");
        if (TextUtils.isEmpty(a2)) {
            switch (str.hashCode()) {
                case -1770323837:
                    if (str.equals("game-eng")) {
                        AppConfig appConfig = this.o;
                        if (appConfig != null) {
                            return appConfig.n();
                        }
                        c25.S("appConfig");
                        throw null;
                    }
                    break;
                case -1603842444:
                    if (str.equals("enginev")) {
                        AppConfig appConfig2 = this.o;
                        if (appConfig2 != null) {
                            return appConfig2.o();
                        }
                        c25.S("appConfig");
                        throw null;
                    }
                    break;
                case -1411074055:
                    if (str.equals("app_id")) {
                        return j();
                    }
                    break;
                case -476160740:
                    if (str.equals("epoch_ms")) {
                        return String.valueOf(System.currentTimeMillis());
                    }
                    break;
                case 3711:
                    if (str.equals("ts")) {
                        return String.valueOf(System.currentTimeMillis());
                    }
                    break;
                case 103459:
                    if (str.equals("hni")) {
                        return this.f.get("mcc");
                    }
                    break;
                case 96722057:
                    if (str.equals("epoch")) {
                        return String.valueOf(System.currentTimeMillis() / 1000);
                    }
                    break;
                case 1913874683:
                    if (str.equals("X-Gg-Debug")) {
                        AppConfig appConfig3 = this.o;
                        if (appConfig3 != null) {
                            return String.valueOf(appConfig3.w());
                        }
                        c25.S("appConfig");
                        throw null;
                    }
                    break;
            }
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2;
    }

    @r2(otherwise = 4)
    public final void m() {
        xz2.c("SDKHlpr", "Play services checking if both adv ID and location is received");
        if (this.i.get() && this.g.get() && this.h.get()) {
            xz2.c("SDKHlpr", "Play services advID location and version acquired");
            c cVar = this.m;
            if (cVar != null) {
                cVar.b();
            }
            this.m = null;
        }
    }

    @Override // com.p7700g.p99005.g83.c
    public void c(@NotNull String str) {
        c25.p(str, "error");
        this.g.set(true);
        m();
    }

    @Override // com.p7700g.p99005.g83.c
    public void a(@NotNull Location location) {
        c25.p(location, ik3.b);
        StringBuilder sb = new StringBuilder();
        sb.append(location.getLatitude());
        sb.append(e14.f0);
        sb.append(location.getLongitude());
        h("ll", sb.toString());
        h("latitude", String.valueOf(location.getLatitude()));
        h("longitude", String.valueOf(location.getLongitude()));
        h("lla", String.valueOf(location.getAccuracy()));
        h("llf", String.valueOf(location.getTime()));
        this.g.set(true);
        m();
    }

    @Override // com.p7700g.p99005.g83.b
    public void b(@NotNull String str) {
        c25.p(str, "error");
        this.i.set(true);
        m();
    }
}