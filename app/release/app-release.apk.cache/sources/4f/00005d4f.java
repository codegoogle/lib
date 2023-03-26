package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.uii.GreedyGameActivity;
import com.p7700g.p99005.pa3;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t23 {
    @NotNull
    public static final a a = new a(null);
    private Context b;
    private iy2 c;
    @Nullable
    private d d;
    @Nullable
    private u23 e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final t23 a() {
            return c.a.a();
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        INTERSTITIAL("interstitial"),
        APP_OPEN("app_open"),
        NATIVE(com.anythink.expressad.foundation.g.a.f.a),
        REWARDED("rewarded"),
        REWARDED_INTERSTITIAL("rewarded_interstitial");
        
        @NotNull
        private final String y;

        b(String str) {
            this.y = str;
        }

        @NotNull
        public final String f() {
            return this.y;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @NotNull
        public static final c a = new c();
        @NotNull
        private static final t23 b = new t23(null);

        private c() {
        }

        @NotNull
        public final t23 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends BroadcastReceiver {
        @NotNull
        private final zb3 a;
        @NotNull
        private final b b;
        public final /* synthetic */ t23 c;

        public d(@NotNull t23 t23Var, @NotNull zb3 zb3Var, b bVar) {
            c25.p(t23Var, "this$0");
            c25.p(zb3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            c25.p(bVar, "launchMode");
            this.c = t23Var;
            this.a = zb3Var;
            this.b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            d dVar;
            if (c25.g(intent == null ? null : intent.getAction(), "uii-open")) {
                this.a.g(this.b);
                return;
            }
            this.a.e(this.b);
            if (context != null && (dVar = this.c.d) != null) {
                q10.b(context).f(dVar);
            }
            this.c.d = null;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            b.values();
            int[] iArr = new int[5];
            iArr[b.INTERSTITIAL.ordinal()] = 1;
            iArr[b.APP_OPEN.ordinal()] = 2;
            iArr[b.NATIVE.ordinal()] = 3;
            a = iArr;
            lc3.values();
            int[] iArr2 = new int[17];
            iArr2[lc3.ADMOB.ordinal()] = 1;
            iArr2[lc3.MOPUB.ordinal()] = 2;
            iArr2[lc3.FACEBOOK.ordinal()] = 3;
            iArr2[lc3.BRAND.ordinal()] = 4;
            iArr2[lc3.S2S.ordinal()] = 5;
            b = iArr2;
        }
    }

    private t23() {
    }

    public /* synthetic */ t23(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void d(n03 n03Var) {
        e(b.APP_OPEN, n03Var);
    }

    private final void e(b bVar, n03 n03Var) {
        Context context = this.b;
        if (context != null) {
            Intent intent = new Intent(context, GreedyGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("unit_confid", n03Var);
            bundle.putString(com.anythink.core.common.b.e.d, bVar.f());
            intent.putExtra("bundle", bundle);
            intent.addFlags(268435456);
            Context context2 = this.b;
            if (context2 != null) {
                context2.startActivity(intent);
                return;
            } else {
                c25.S("context");
                throw null;
            }
        }
        c25.S("context");
        throw null;
    }

    private final void h(ia3 ia3Var, n03 n03Var, pa3.b bVar, pa3.a aVar) {
        AppConfig r;
        String f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("unit_id", n03Var.c());
        String B = ia3Var.c().B();
        if (B == null) {
            B = "";
        }
        linkedHashMap.put("session_id", B);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (f = r.f()) == null) {
            f = "";
        }
        linkedHashMap.put("app_id", f);
        String r2 = ia3Var.c().r();
        if (r2 == null) {
            r2 = "";
        }
        linkedHashMap.put("campaign_id", r2);
        String l = h73.a.a().l("advid");
        linkedHashMap.put("advid", l != null ? l : "");
        linkedHashMap.put("src", bVar.toString());
        linkedHashMap.put("dstn", aVar.toString());
    }

    private final void i(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        int i = e.b[lc3.s.b(ia3Var.c().w()).ordinal()];
        if (i == 1) {
            m(ia3Var, n03Var, zb3Var);
        } else if (i == 2) {
            n(ia3Var, n03Var, zb3Var);
        } else if (i == 3) {
            o(ia3Var, n03Var, zb3Var);
        } else if (i == 4) {
            q(ia3Var, n03Var, zb3Var);
        } else if (i != 5) {
            xz2.c("UiiMngr", "No matched engagement for the Campaign");
        } else {
            p(ia3Var, n03Var, zb3Var);
        }
    }

    private final void j(zb3 zb3Var, b bVar) {
        d dVar = new d(this, zb3Var, bVar);
        this.d = dVar;
        if (dVar == null) {
            return;
        }
        Context context = this.b;
        if (context != null) {
            q10 b2 = q10.b(context);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("uii-close");
            intentFilter.addAction("uii-open");
            yq4 yq4Var = yq4.a;
            b2.c(dVar, intentFilter);
            return;
        }
        c25.S("context");
        throw null;
    }

    private final void k(n03 n03Var) {
        e(b.INTERSTITIAL, n03Var);
    }

    private final void l(ia3 ia3Var, n03 n03Var, b bVar, zb3 zb3Var) {
        if (ia3Var.m() && !ia3Var.k()) {
            xz2.c("UiiMngr", "Ad not a clickable unit");
            return;
        }
        j(zb3Var, bVar);
        int i = e.a[bVar.ordinal()];
        if (i == 1) {
            k(n03Var);
        } else if (i == 2) {
            d(n03Var);
        } else if (i != 3) {
        } else {
            i(ia3Var, n03Var, zb3Var);
        }
    }

    private final void m(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        Context context = this.b;
        if (context != null) {
            Intent intent = new Intent(context, GreedyGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("unit_confid", n03Var);
            intent.putExtra("bundle", bundle);
            intent.addFlags(268435456);
            Context context2 = this.b;
            if (context2 != null) {
                context2.startActivity(intent);
                h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.UII);
                return;
            }
            c25.S("context");
            throw null;
        }
        c25.S("context");
        throw null;
    }

    private final void n(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        Context context = this.b;
        if (context != null) {
            Intent intent = new Intent(context, GreedyGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("unit_confid", n03Var);
            intent.putExtra("bundle", bundle);
            intent.addFlags(268435456);
            Context context2 = this.b;
            if (context2 != null) {
                context2.startActivity(intent);
                h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.UII);
                return;
            }
            c25.S("context");
            throw null;
        }
        c25.S("context");
        throw null;
    }

    private final void o(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        Context context = this.b;
        if (context != null) {
            Intent intent = new Intent(context, GreedyGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("unit_confid", n03Var);
            intent.putExtra("bundle", bundle);
            intent.addFlags(268435456);
            Context context2 = this.b;
            if (context2 != null) {
                context2.startActivity(intent);
                h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.UII);
                return;
            }
            c25.S("context");
            throw null;
        }
        c25.S("context");
        throw null;
    }

    private final void p(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        Context context = this.b;
        if (context != null) {
            Intent intent = new Intent(context, GreedyGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("unit_confid", n03Var);
            intent.putExtra("bundle", bundle);
            intent.addFlags(268435456);
            Context context2 = this.b;
            if (context2 != null) {
                context2.startActivity(intent);
                h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.UII);
                return;
            }
            c25.S("context");
            throw null;
        }
        c25.S("context");
        throw null;
    }

    private final void q(ia3 ia3Var, n03 n03Var, zb3 zb3Var) {
        String y = ia3Var.c().y();
        if (y != null) {
            if (!(y.length() == 0)) {
                if (ia3Var.c().t()) {
                    h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.EXTERNAL);
                    j73 j73Var = j73.a;
                    Context context = this.b;
                    if (context != null) {
                        j73Var.a(context, y);
                        return;
                    } else {
                        c25.S("context");
                        throw null;
                    }
                }
                Context context2 = this.b;
                if (context2 != null) {
                    Intent intent = new Intent(context2, GreedyGameActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("unit_confid", n03Var);
                    intent.putExtra("bundle", bundle);
                    intent.addFlags(268435456);
                    Context context3 = this.b;
                    if (context3 != null) {
                        context3.startActivity(intent);
                        h(ia3Var, n03Var, pa3.b.UNIT, pa3.a.UII);
                        return;
                    }
                    c25.S("context");
                    throw null;
                }
                c25.S("context");
                throw null;
            }
        }
        xz2.c("UiiMngr", "[ERROR] Engagement url not available");
    }

    @Nullable
    public final u23 b() {
        return this.e;
    }

    public final void c(@NotNull Context context, @NotNull iy2 iy2Var) {
        c25.p(context, "context");
        c25.p(iy2Var, "sharedPrefHelper");
        this.b = context;
        this.c = iy2Var;
    }

    public final void g(@NotNull ia3 ia3Var, @NotNull n03 n03Var, @NotNull b bVar, @NotNull zb3 zb3Var) {
        c25.p(ia3Var, "adContainer");
        c25.p(n03Var, "unitConfig");
        c25.p(bVar, "launchModes");
        c25.p(zb3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        xz2.c("UiiMngr", c25.C("ShowUII Called for ", n03Var.c()));
        l(ia3Var, n03Var, bVar, zb3Var);
    }
}