package com.p7700g.p99005;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.core.signals.AdInvalidSignal;
import com.p7700g.p99005.f23;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gc3 implements i03, m73 {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final gc3 t = b.a.a();
    @NotNull
    private final ConcurrentHashMap<String, ArrayDeque<ia3>> u = new ConcurrentHashMap<>();
    @NotNull
    private final ConcurrentHashMap<String, WeakReference<h03>> v = new ConcurrentHashMap<>();
    @NotNull
    private final ConcurrentHashMap<String, ia3> w = new ConcurrentHashMap<>();
    @NotNull
    private final ConcurrentHashMap<String, f83> x = new ConcurrentHashMap<>();
    @NotNull
    private final ConcurrentHashMap<String, ic3> y = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final gc3 a() {
            return gc3.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final gc3 b = new gc3();

        private b() {
        }

        @NotNull
        public final gc3 a() {
            return b;
        }
    }

    public gc3() {
        GreedyGameAds.a.addInternalDestroyListener$com_greedygame_sdkx_core(this);
    }

    private final void i(r13 r13Var, String str) {
        h03 h03Var;
        WeakReference<h03> weakReference = this.v.get(str);
        if (weakReference == null || (h03Var = weakReference.get()) == null) {
            return;
        }
        h03Var.i(r13Var);
    }

    private final void k(ia3 ia3Var) {
        ConcurrentHashMap<String, f83> concurrentHashMap;
        String B;
        Ad c = ia3Var.c();
        Partner w = c.w();
        yq4 yq4Var = null;
        String g = w == null ? null : w.g();
        if (c25.g(g, p13.S2S_INTERSTITIAL.f()) ? true : c25.g(g, p13.S2S_BANNER.f())) {
            q03.s.e(c);
            return;
        }
        if (c25.g(g, p13.FACEBOOK.f()) ? true : c25.g(g, p13.FACEBOOK_BANNER.f()) ? true : c25.g(g, p13.FACEBOOK_INTERSTITIAL.f()) ? true : c25.g(g, p13.MOPUB.f()) ? true : c25.g(g, p13.ADMOB.f()) ? true : c25.g(g, p13.ADMOB_BANNER.f()) ? true : c25.g(g, p13.ADMOB_INTERSTITIAL.f())) {
            f83 f83Var = this.x.get(c.B());
            if (f83Var != null) {
                f83Var.d();
                yq4 yq4Var2 = yq4.a;
                try {
                    concurrentHashMap = this.x;
                    B = c.B();
                } catch (NullPointerException unused) {
                    xz2.c("AdProvider", "NPE while removing mediation base from registry");
                }
                if (concurrentHashMap == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                k35.k(concurrentHashMap).remove(B);
                StringBuilder G = wo1.G("Ad with session id ");
                G.append((Object) ia3Var.c().B());
                G.append(" is now destroyed");
                xz2.c("AdProvider", G.toString());
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                StringBuilder G2 = wo1.G("There is no active ad with session id ");
                G2.append((Object) c.B());
                G2.append(" under mediation partners.");
                xz2.c("AdProvider", G2.toString());
            }
        }
    }

    private final void l(ia3 ia3Var, AppConfig appConfig, n03 n03Var, x83 x83Var, boolean z) {
        Ad c;
        String B;
        if (!oa3.a.c(appConfig.e())) {
            i(r13.NO_FILL, n03Var.c());
            p("Internet not available for init request");
            xz2.d(GreedyGameAds.b, "[ERROR] Internet not available.");
            return;
        }
        ic3 ic3Var = this.y.get(n03Var.c());
        if (ic3Var == null) {
            ic3Var = new ic3(appConfig, n03Var, this, x83Var);
            this.y.put(n03Var.c(), ic3Var);
        }
        f23.a p = new f23.a().p(n03Var);
        String str = "";
        if (ia3Var != null && (c = ia3Var.c()) != null && (B = c.B()) != null) {
            str = B;
        }
        ic3Var.f(p.n(str).g(z));
    }

    private final void m(ia3 ia3Var, String str) {
        h03 h03Var;
        this.w.put(str, ia3Var);
        WeakReference<h03> weakReference = this.v.get(str);
        if (weakReference == null || (h03Var = weakReference.get()) == null) {
            return;
        }
        h03Var.d(ia3Var);
    }

    private final void p(String str) {
        new kb3(new AdInvalidSignal(0L, null, null, null, null, str, 31, null), null).q();
    }

    @Nullable
    public final f83 a(@NotNull Ad ad) {
        c25.p(ad, "ad");
        return this.x.get(ad.B());
    }

    @Nullable
    public final ia3 b(@NotNull n03 n03Var) {
        c25.p(n03Var, "unitConfig");
        return this.w.get(n03Var.c());
    }

    @NotNull
    public final String c() {
        try {
            String B = this.w.elements().nextElement().c().B();
            return B == null ? "" : B;
        } catch (NoSuchElementException unused) {
            return "";
        }
    }

    public final synchronized void d(@NotNull AppConfig appConfig, @NotNull n03 n03Var, @NotNull x83 x83Var, @NotNull u13 u13Var) {
        c25.p(appConfig, "mAppConfig");
        c25.p(n03Var, "unitConfig");
        c25.p(x83Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c25.p(u13Var, "refreshPolicy");
        ia3 remove = this.w.remove(n03Var.c());
        if (remove != null) {
            if (remove.i()) {
                m(remove, n03Var.c());
                return;
            }
            k(remove);
        }
        if (this.u.containsKey(n03Var.c())) {
            ArrayDeque<ia3> arrayDeque = this.u.get(n03Var.c());
            if ((arrayDeque == null ? null : arrayDeque.peek()) != null) {
                boolean z = true;
                while (true) {
                    if (!z) {
                        break;
                    }
                    ArrayDeque<ia3> arrayDeque2 = this.u.get(n03Var.c());
                    ia3 poll = arrayDeque2 == null ? null : arrayDeque2.poll();
                    if (poll != null) {
                        boolean o = poll.o();
                        if (o) {
                            xz2.c("AdProvider", "AdExpired " + ((Object) poll.c().B()) + " for Unit " + n03Var.c() + ". Moving to next Ad");
                            String B = poll.c().B();
                            if (B == null) {
                                B = "";
                            }
                            String str = B;
                            String r = poll.c().r();
                            if (r == null) {
                                r = "";
                            }
                            new kb3(new AdInvalidSignal(0L, str, null, null, r, "Ad Expired", 13, null), null).q();
                            z = o;
                        } else {
                            xz2.c("AdProvider", "Ad Found  " + ((Object) poll.c().B()) + ". Issuing success callback");
                            m(poll, n03Var.c());
                            break;
                        }
                    } else {
                        xz2.c("AdProvider", "Empty Ad Queue for unit " + n03Var.c() + ". Doing Init");
                        l(remove, appConfig, n03Var, x83Var, u13Var == u13.MANUAL);
                    }
                }
            }
        }
        xz2.c("AdProvider", "First Init Request " + n03Var.c() + ". Doing Init");
        l(remove, appConfig, n03Var, x83Var, u13Var == u13.MANUAL);
    }

    public final void e(@NotNull n03 n03Var, @NotNull h03 h03Var) {
        c25.p(n03Var, "unitConfig");
        c25.p(h03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.u.putIfAbsent(n03Var.c(), new ArrayDeque<>());
        this.v.putIfAbsent(n03Var.c(), new WeakReference<>(h03Var));
    }

    @Override // com.p7700g.p99005.i03
    public void f(@NotNull n03 n03Var) {
        c25.p(n03Var, "unitConfig");
        this.y.remove(n03Var.c());
        ArrayDeque<ia3> arrayDeque = this.u.get(n03Var.c());
        if (!(arrayDeque != null && arrayDeque.isEmpty()) || this.w.containsKey(n03Var.c())) {
            return;
        }
        p("No valid ads where available to serve");
        i(r13.NO_FILL, n03Var.c());
        xz2.c("AdProvider", c25.C("No Ads Available in queue or active ad registry for adunit ", n03Var.c()));
    }

    @Override // com.p7700g.p99005.i03
    public void g(@NotNull n03 n03Var, @NotNull ia3 ia3Var) {
        c25.p(n03Var, "unitConfig");
        c25.p(ia3Var, "adContainer");
        if (!this.w.containsKey(n03Var.c())) {
            StringBuilder G = wo1.G("Ad Queue Empty for ");
            G.append(n03Var.c());
            G.append(" adding to active and issuing callback");
            xz2.c("AdProvider", G.toString());
            m(ia3Var, n03Var.c());
            return;
        }
        StringBuilder G2 = wo1.G("Adding to queue for ");
        G2.append(n03Var.c());
        G2.append(" ad ");
        G2.append((Object) ia3Var.c().B());
        xz2.c("AdProvider", G2.toString());
        ArrayDeque<ia3> arrayDeque = this.u.get(n03Var.c());
        if (arrayDeque == null) {
            return;
        }
        arrayDeque.add(ia3Var);
    }

    @Override // com.p7700g.p99005.i03
    public void h(@NotNull n03 n03Var, @NotNull String str) {
        c25.p(n03Var, "unitConfig");
        c25.p(str, "error");
        p(str);
    }

    public final void j(@NotNull Ad ad, @Nullable f83 f83Var) {
        c25.p(ad, "ad");
        if (f83Var == null) {
            return;
        }
        ConcurrentHashMap<String, f83> concurrentHashMap = this.x;
        String B = ad.B();
        if (B == null) {
            B = "";
        }
        concurrentHashMap.putIfAbsent(B, f83Var);
    }

    public final boolean n(@NotNull String str) {
        c25.p(str, "unitId");
        ArrayDeque<ia3> arrayDeque = this.u.get(str);
        if (arrayDeque == null) {
            return false;
        }
        return !arrayDeque.isEmpty();
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        ConcurrentHashMap<String, ArrayDeque<ia3>> concurrentHashMap = this.u;
        for (Map.Entry<String, ArrayDeque<ia3>> entry : concurrentHashMap.entrySet()) {
            entry.getValue().clear();
        }
        concurrentHashMap.clear();
        this.v.clear();
        this.w.clear();
        ConcurrentHashMap<String, f83> concurrentHashMap2 = this.x;
        for (Map.Entry<String, f83> entry2 : concurrentHashMap2.entrySet()) {
            entry2.getValue().d();
        }
        concurrentHashMap2.clear();
        this.y.clear();
    }
}