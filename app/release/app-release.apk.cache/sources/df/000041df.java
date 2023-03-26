package com.p7700g.p99005;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.core.signals.MediationLoadedSignal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class f83 implements o13 {
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private static final HashMap<Integer, f83> b = new HashMap<>();
    @Nullable
    private static String c = "";
    @NotNull
    private Context d;
    @NotNull
    private Partner e;
    @NotNull
    private volatile CopyOnWriteArrayList<y83> f;
    @NotNull
    private CopyOnWriteArrayList<x83> g;
    @NotNull
    private String h;
    @NotNull
    private hc3 i;
    @NotNull
    private ia3 j;
    @Nullable
    private NativeMediatedAsset k;
    @Nullable
    private String l;
    @NotNull
    private c m;
    @NotNull
    private final n03 n;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private Context a;
        public Partner b;
        public y83 c;
        public x83 d;
        public AppConfig e;
        public c03 f;
        public String g;
        public hc3 h;
        public ia3 i;
        public n03 j;

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final f83 A() {
            f83 v73Var;
            f83 f83Var = null;
            if (this.b != null && this.c != null && this.d != null) {
                b bVar = f83.a;
                f83 f83Var2 = bVar.b().get(Integer.valueOf(bVar.a(y().c())));
                if (f83Var2 != null) {
                    xz2.c("MedBase", c25.C("MediationBase already created for ", y().c().B()));
                    f83Var2.c(s());
                    return f83Var2;
                }
                String g = k().g();
                if (c25.g(g, p13.ADMOB.f())) {
                    v73Var = new u73(this, null, 2, null);
                } else if (c25.g(g, p13.ADMOB_BANNER.f())) {
                    v73Var = new r73(this, null, 2, null);
                } else if (c25.g(g, p13.ADMOB_INTERSTITIAL.f())) {
                    v73Var = new s73(this, null, 2, null);
                } else if (c25.g(g, p13.ADMOB_REWARDED.f())) {
                    v73Var = new w73(this, null, 2, null);
                } else if (!c25.g(g, p13.ADMOB_REWARDED_INTERSTITIAL.f())) {
                    if (c25.g(g, p13.ADMOB_APP_OPEN.f())) {
                        f83Var = new q73(this);
                    } else if (c25.g(g, p13.FACEBOOK.f())) {
                        f83Var = new m83(this);
                    } else if (c25.g(g, p13.FACEBOOK_BANNER.f())) {
                        f83Var = new j83(this);
                    } else if (c25.g(g, p13.FACEBOOK_INTERSTITIAL.f())) {
                        f83Var = new k83(this);
                    } else if (c25.g(g, p13.FACEBOOK_REWARDED.f())) {
                        f83Var = new n83(this);
                    } else if (c25.g(g, p13.MOPUB.f())) {
                        f83Var = new p93(this);
                    }
                    int a = bVar.a(y().c());
                    StringBuilder G = wo1.G("MediationBase newly created: ");
                    G.append((Object) y().c().B());
                    G.append(gl4.R);
                    G.append(a);
                    xz2.c("MedBase", G.toString());
                    if (f83Var != null) {
                        bVar.b().put(Integer.valueOf(a), f83Var);
                    }
                    return f83Var;
                } else {
                    v73Var = new v73(this, null, 2, null);
                }
                f83Var = v73Var;
                int a2 = bVar.a(y().c());
                StringBuilder G2 = wo1.G("MediationBase newly created: ");
                G2.append((Object) y().c().B());
                G2.append(gl4.R);
                G2.append(a2);
                xz2.c("MedBase", G2.toString());
                if (f83Var != null) {
                }
                return f83Var;
            }
            xz2.c("MedBase", "[ERROR] Need all the objects to create the MediationBase");
            throw new ey2(null, 1, null);
        }

        @NotNull
        public final Context a() {
            return this.a;
        }

        public final void b(@NotNull AppConfig appConfig) {
            c25.p(appConfig, "<set-?>");
            this.e = appConfig;
        }

        public final void c(@NotNull c03 c03Var) {
            c25.p(c03Var, "<set-?>");
            this.f = c03Var;
        }

        public final void d(@NotNull n03 n03Var) {
            c25.p(n03Var, "<set-?>");
            this.j = n03Var;
        }

        public final void e(@NotNull Partner partner) {
            c25.p(partner, "<set-?>");
            this.b = partner;
        }

        public final void f(@NotNull x83 x83Var) {
            c25.p(x83Var, "<set-?>");
            this.d = x83Var;
        }

        public final void g(@NotNull y83 y83Var) {
            c25.p(y83Var, "<set-?>");
            this.c = y83Var;
        }

        public final void h(@NotNull ia3 ia3Var) {
            c25.p(ia3Var, "<set-?>");
            this.i = ia3Var;
        }

        public final void i(@NotNull hc3 hc3Var) {
            c25.p(hc3Var, "<set-?>");
            this.h = hc3Var;
        }

        public final void j(@NotNull String str) {
            c25.p(str, "<set-?>");
            this.g = str;
        }

        @NotNull
        public final Partner k() {
            Partner partner = this.b;
            if (partner != null) {
                return partner;
            }
            c25.S("partner");
            throw null;
        }

        @NotNull
        public final a l(@NotNull AppConfig appConfig) {
            c25.p(appConfig, "appConfig");
            b(appConfig);
            c(appConfig.t());
            return this;
        }

        @NotNull
        public final a m(@NotNull n03 n03Var) {
            c25.p(n03Var, "unitConfig");
            d(n03Var);
            return this;
        }

        @NotNull
        public final a n(@NotNull x83 x83Var) {
            c25.p(x83Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            f(x83Var);
            return this;
        }

        @NotNull
        public final a o(@NotNull y83 y83Var) {
            c25.p(y83Var, "mediationListener");
            g(y83Var);
            return this;
        }

        @NotNull
        public final a p(@NotNull ia3 ia3Var) {
            c25.p(ia3Var, "adContainer");
            h(ia3Var);
            Partner w = ia3Var.c().w();
            if (w != null) {
                e(w);
            }
            return this;
        }

        @NotNull
        public final a q(@NotNull hc3 hc3Var) {
            c25.p(hc3Var, "assetManager");
            i(hc3Var);
            return this;
        }

        @NotNull
        public final a r(@NotNull String str) {
            c25.p(str, "basePath");
            j(str);
            return this;
        }

        @NotNull
        public final y83 s() {
            y83 y83Var = this.c;
            if (y83Var != null) {
                return y83Var;
            }
            c25.S("mediationListener");
            throw null;
        }

        @NotNull
        public final x83 t() {
            x83 x83Var = this.d;
            if (x83Var != null) {
                return x83Var;
            }
            c25.S("mMediatedAdsListener");
            throw null;
        }

        @NotNull
        public final AppConfig u() {
            AppConfig appConfig = this.e;
            if (appConfig != null) {
                return appConfig;
            }
            c25.S("appConfig");
            throw null;
        }

        @NotNull
        public final c03 v() {
            c03 c03Var = this.f;
            if (c03Var != null) {
                return c03Var;
            }
            c25.S("privacyConfig");
            throw null;
        }

        @NotNull
        public final String w() {
            String str = this.g;
            if (str != null) {
                return str;
            }
            c25.S("basePath");
            throw null;
        }

        @NotNull
        public final hc3 x() {
            hc3 hc3Var = this.h;
            if (hc3Var != null) {
                return hc3Var;
            }
            c25.S("assetManager");
            throw null;
        }

        @NotNull
        public final ia3 y() {
            ia3 ia3Var = this.i;
            if (ia3Var != null) {
                return ia3Var;
            }
            c25.S("adContainer");
            throw null;
        }

        @NotNull
        public final n03 z() {
            n03 n03Var = this.j;
            if (n03Var != null) {
                return n03Var;
            }
            c25.S("unitConfig");
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(@NotNull Ad ad) {
            c25.p(ad, "ad");
            String[] strArr = new String[1];
            String B = ad.B();
            if (B == null) {
                B = "";
            }
            strArr[0] = B;
            return bc3.b(strArr);
        }

        @NotNull
        public final HashMap<Integer, f83> b() {
            return f83.b;
        }

        public final void c(@Nullable String str) {
            f83.c = str;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        INITIALIZED,
        LOADING,
        FINISHED
    }

    public f83(@NotNull a aVar) {
        c25.p(aVar, "builder");
        this.d = aVar.a();
        this.f = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArrayList<>();
        this.m = c.INITIALIZED;
        this.e = aVar.k();
        this.f.add(aVar.s());
        this.g.add(aVar.t());
        this.h = aVar.w();
        this.i = aVar.x();
        this.j = aVar.y();
        this.n = aVar.z();
    }

    public final void a(@Nullable NativeMediatedAsset nativeMediatedAsset) {
        this.k = nativeMediatedAsset;
    }

    public void b(@NotNull Partner partner) {
        String g;
        c25.p(partner, "config");
        this.m = c.FINISHED;
        Ad n = n();
        String B = n().B();
        String str = "";
        MediationLoadedSignal mediationLoadedSignal = new MediationLoadedSignal(0L, B == null ? "" : B, null, null, n, null, null, 109, null);
        xz2.c("MedBase", "Sending Mediation Loaded Signal");
        new nb3(mediationLoadedSignal, null).q();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Partner w = n().w();
        if (w != null && (g = w.g()) != null) {
            str = g;
        }
        linkedHashMap.put("partner", str);
        for (y83 y83Var : this.f) {
            a(n().v());
            NativeMediatedAsset o = o();
            c25.m(o);
            y83Var.c(o);
        }
        this.f.clear();
    }

    public final void c(@NotNull y83 y83Var) {
        c25.p(y83Var, "mediationListener");
        CopyOnWriteArrayList<y83> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f);
        copyOnWriteArrayList.add(y83Var);
        this.f = copyOnWriteArrayList;
    }

    public void d() {
        int a2 = a.a(n());
        xz2.c("MedBase", c25.C("Destroying ad: ", Integer.valueOf(a2)));
        b.remove(Integer.valueOf(a2));
    }

    public void e() {
        c cVar = this.m;
        if (cVar == c.INITIALIZED) {
            this.m = c.LOADING;
        } else if (cVar == c.FINISHED) {
            xz2.c("MedBase", "Loading already finished");
            if (this.k != null) {
                for (y83 y83Var : this.f) {
                    NativeMediatedAsset o = o();
                    c25.m(o);
                    y83Var.c(o);
                }
            } else if (this.l != null) {
                for (y83 y83Var2 : this.f) {
                    String p = p();
                    c25.m(p);
                    y83Var2.a(p);
                }
            }
            this.f.clear();
        }
    }

    public final void f(@Nullable String str) {
        this.l = str;
    }

    public void g(@NotNull String str) {
        c25.p(str, "errorCodes");
        this.m = c.FINISHED;
        xz2.c("MedBase", c25.C("Ad Load Failed: ", s()));
        for (y83 y83Var : this.f) {
            f(str);
            y83Var.a(str);
        }
    }

    @NotNull
    public final Context i() {
        return this.d;
    }

    @NotNull
    public final Partner j() {
        return this.e;
    }

    @NotNull
    public final CopyOnWriteArrayList<x83> k() {
        return this.g;
    }

    @NotNull
    public final String l() {
        return this.h;
    }

    @NotNull
    public final hc3 m() {
        return this.i;
    }

    @NotNull
    public final Ad n() {
        return this.j.c();
    }

    @Nullable
    public final NativeMediatedAsset o() {
        return this.k;
    }

    @Nullable
    public final String p() {
        return this.l;
    }

    @NotNull
    public final c q() {
        return this.m;
    }

    @NotNull
    public final n03 r() {
        return this.n;
    }

    @NotNull
    public final String s() {
        return c25.C(c25.C(c25.C("", this.e.g()), ":"), this.e.e());
    }

    @t0
    public void t() {
        xz2.c("MedBase", c25.C("Impression: ", s()));
        this.j.n();
        for (x83 x83Var : this.g) {
            x83Var.e();
        }
    }

    public void u() {
        xz2.c("MedBase", c25.C("AdClicked: ", s()));
        for (x83 x83Var : this.g) {
            x83Var.d();
        }
    }
}