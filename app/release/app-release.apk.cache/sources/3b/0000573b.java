package com.p7700g.p99005;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.o03;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q03 implements m73 {
    @NotNull
    public static final q03 s;
    @NotNull
    private static final HashMap<String, o03> t;
    @NotNull
    private static final String u;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(@NotNull List<String> list);
    }

    /* loaded from: classes3.dex */
    public static final class c implements o03.d {
        public final /* synthetic */ Ad a;
        public final /* synthetic */ b b;

        public c(Ad ad, b bVar) {
            this.a = ad;
            this.b = bVar;
        }

        @Override // com.p7700g.p99005.o03.d
        public void a(@NotNull o03 o03Var) {
            c25.p(o03Var, "webView");
            HashMap hashMap = q03.t;
            String B = this.a.B();
            if (B == null) {
                B = "";
            }
            hashMap.put(B, o03Var);
            this.b.a();
        }

        @Override // com.p7700g.p99005.o03.d
        public void b(@NotNull o03 o03Var, @NotNull List<String> list) {
            c25.p(o03Var, "webView");
            c25.p(list, "errors");
            this.b.a(list);
        }
    }

    static {
        q03 q03Var = new q03();
        s = q03Var;
        t = new HashMap<>();
        u = "WebViewManager";
        xz2.c("WebViewManager", "Attaching destroy listener");
        GreedyGameAds.a.addDestroyEventListener(q03Var);
    }

    private q03() {
    }

    private final void d(WebView webView, String str) {
        webView.loadDataWithBaseURL(null, str, "text/html; charset=utf-8", "UTF-8", null);
    }

    @Nullable
    public final o03 a(@NotNull Ad ad, @NotNull a aVar) {
        c25.p(ad, "ad");
        c25.p(aVar, "pageEventsListener");
        o03 o03Var = t.get(ad.B());
        if (o03Var != null) {
            o03Var.setPageEventsListener(aVar);
            String c2 = ad.v().c();
            if (c2 != null) {
                s.d(o03Var, c2);
            }
        }
        return o03Var;
    }

    @Nullable
    public final o03 b(@NotNull Ad ad, @NotNull b bVar) {
        AppConfig r;
        c25.p(ad, "ad");
        c25.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Context e = (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) ? null : r.e();
        if (e == null) {
            return null;
        }
        o03 a2 = o03.s.a(e, new c(ad, bVar));
        if (ad.v().c() != null) {
            s.d(a2, "about:blank");
        }
        return a2;
    }

    public final void e(@NotNull Ad ad) {
        c25.p(ad, "activeAd");
        HashMap<String, o03> hashMap = t;
        String B = ad.B();
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        k35.k(hashMap).remove(B);
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        xz2.c(u, "Clearing webview map on SDK Destroy");
        t.clear();
    }
}