package com.p7700g.p99005;

import android.content.Context;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.SignalResponse;
import com.greedygame.core.signals.InstallReferrerSignal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hb3 {
    @NotNull
    public static final a a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            b.a.a().a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final hb3 b = new hb3();

        private b() {
        }

        @NotNull
        public final hb3 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements to1 {
        public final /* synthetic */ ro1 a;
        public final /* synthetic */ iy2 b;

        /* loaded from: classes3.dex */
        public static final class a implements ka3<n23, SignalResponse> {
            public final /* synthetic */ iy2 s;

            public a(iy2 iy2Var) {
                this.s = iy2Var;
            }

            @Override // com.p7700g.p99005.ka3
            public void a(@NotNull b23<n23, SignalResponse> b23Var, @NotNull h23<String> h23Var, @NotNull Throwable th) {
                c25.p(b23Var, "request");
                c25.p(h23Var, "response");
                c25.p(th, "t");
                xz2.b("InstallReferrerHlpr", "Install referer signal failed", th);
            }

            @Override // com.p7700g.p99005.ka3
            public void b(@NotNull b23<n23, SignalResponse> b23Var, @NotNull h23<SignalResponse> h23Var) {
                c25.p(b23Var, "request");
                c25.p(h23Var, "response");
                if (h23Var.d()) {
                    iy2 iy2Var = this.s;
                    if (iy2Var == null) {
                        return;
                    }
                    iy2Var.d(iy2.c, true);
                    return;
                }
                xz2.c("InstallReferrerHlpr", "Install referer signal failed w/o exception");
            }
        }

        public c(ro1 ro1Var, iy2 iy2Var) {
            this.a = ro1Var;
            this.b = iy2Var;
        }

        @Override // com.p7700g.p99005.to1
        public void a(int i) {
            AppConfig r;
            String f;
            if (i == -1) {
                xz2.c("InstallReferrerHlpr", " Service Disconnected during connection request");
            } else if (i != 0) {
                if (i != 2) {
                    return;
                }
                xz2.c("InstallReferrerHlpr", "Feature not supported");
            } else {
                xz2.c("InstallReferrerHlpr", "Install referrer connection success");
                uo1 b = this.a.b();
                String d = b.d();
                c25.o(d, "response.installReferrer");
                long f2 = b.f();
                long b2 = b.b();
                boolean a2 = b.a();
                InstallReferrerSignal installReferrerSignal = new InstallReferrerSignal(null, null, null, 0L, 0L, false, null, 0L, 255, null);
                GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
                String str = "null_app_id";
                if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (f = r.f()) != null) {
                    str = f;
                }
                installReferrerSignal.j(str);
                String l = h73.a.a().l("bundle");
                if (l == null) {
                    l = "";
                }
                installReferrerSignal.l(l);
                installReferrerSignal.o(d);
                installReferrerSignal.n(f2);
                installReferrerSignal.k(b2);
                installReferrerSignal.m(a2);
                xz2.c("InstallReferrerHlpr", c25.C("Referrer details ", installReferrerSignal));
                this.a.a();
                new ob3(installReferrerSignal, new a(this.b)).q();
            }
        }

        @Override // com.p7700g.p99005.to1
        public void b() {
            xz2.c("InstallReferrerHlpr", "Service Disconnected after data collected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        AppConfig r;
        AppConfig r2;
        AppConfig r3;
        Context e;
        j23 s;
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
        iy2 r4 = (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) ? null : r.r();
        if (r4 == null ? false : r4.i(iy2.c, false)) {
            xz2.c("InstallReferrerHlpr", "Install tracker signal already fired");
            return;
        }
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if ((iNSTANCE$com_greedygame_sdkx_core2 == null || (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) == null || r2.l()) ? false : true) {
            xz2.c("InstallReferrerHlpr", "Install tracking disabled.");
            return;
        }
        xz2.c("InstallReferrerHlpr", " Getting referral info");
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core3 == null || (r3 = iNSTANCE$com_greedygame_sdkx_core3.r()) == null || (e = r3.e()) == null) {
            return;
        }
        try {
            ro1 a2 = ro1.d(e).a();
            a2.e(new c(a2, r4));
            yq4 yq4Var = yq4.a;
        } catch (Exception e2) {
            xz2.b("InstallReferrerHlpr", "Could not get referrer details due to exception ", e2);
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core4 = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core4 != null && (s = iNSTANCE$com_greedygame_sdkx_core4.s()) != null) {
                s.d(e2, false, "install-referrer", null);
            }
            if (r4 == null) {
                return;
            }
            r4.d(iy2.c, true);
            yq4 yq4Var2 = yq4.a;
        }
    }
}