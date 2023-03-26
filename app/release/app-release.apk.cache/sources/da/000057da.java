package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.AdView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.core.network.model.responses.TemplateMeta;
import com.greedygame.mystique2.models.MediationType;
import com.greedygame.mystique2.models.Template;
import com.p7700g.p99005.b35;
import com.p7700g.p99005.q03;
import com.p7700g.p99005.t23;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qc3 extends oc3 implements g03, z83 {
    @NotNull
    private final n03 F;
    @Nullable
    private fy2 G;
    private boolean H;
    private boolean I;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            u13.values();
            int[] iArr = new int[2];
            iArr[u13.AUTO.ordinal()] = 1;
            iArr[u13.MANUAL.ordinal()] = 2;
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<yq4> {
        public final /* synthetic */ b35.h<View> u;
        public final /* synthetic */ Context v;
        public final /* synthetic */ f03 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b35.h<View> hVar, Context context, f03 f03Var) {
            super(0);
            this.u = hVar;
            this.v = context;
            this.w = f03Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, android.widget.ImageView] */
        public final void a() {
            Ad c;
            TemplateMeta C;
            String c2;
            ia3 w = qc3.this.w();
            String str = "";
            if (w != null && (c = w.c()) != null && (C = c.C()) != null && (c2 = C.c()) != null) {
                str = c2;
            }
            Bitmap c3 = wz2.c(str);
            b35.h<View> hVar = this.u;
            ?? imageView = new ImageView(this.v);
            imageView.setImageBitmap(c3);
            yq4 yq4Var = yq4.a;
            hVar.s = imageView;
            this.w.f(this.u.s);
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<yq4> {
        public final /* synthetic */ GGAdview t;
        public final /* synthetic */ qc3 u;
        public final /* synthetic */ f03 v;

        /* loaded from: classes3.dex */
        public /* synthetic */ class a extends y15 implements f05<String, yq4> {
            public a(qc3 qc3Var) {
                super(1, qc3Var, qc3.class, "handleUnitClick", "handleUnitClick(Ljava/lang/String;)V", 0);
            }

            public final void K4(@NotNull String str) {
                c25.p(str, "p0");
                ((qc3) this.u).V(str);
            }

            @Override // com.p7700g.p99005.f05
            public /* synthetic */ yq4 M(String str) {
                K4(str);
                return yq4.a;
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements q33 {
            public final /* synthetic */ qc3 a;
            public final /* synthetic */ GGAdview b;

            /* loaded from: classes3.dex */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    MediationType.values();
                    int[] iArr = new int[6];
                    iArr[MediationType.S2S.ordinal()] = 1;
                    iArr[MediationType.MOPUB.ordinal()] = 2;
                    iArr[MediationType.FACEBOOK.ordinal()] = 3;
                    iArr[MediationType.ADMOB.ordinal()] = 4;
                    a = iArr;
                }
            }

            public b(qc3 qc3Var, GGAdview gGAdview) {
                this.a = qc3Var;
                this.b = gGAdview;
            }

            @Override // com.p7700g.p99005.q33
            public void a(@NotNull o33 o33Var) {
                Ad c;
                f83 G;
                n13<?> a2;
                Boolean impression;
                Ad c2;
                TemplateMeta C;
                String e;
                Ad c3;
                c25.p(o33Var, "mystiqueView");
                ia3 w = this.a.w();
                Partner partner = null;
                if (w != null && (c3 = w.c()) != null) {
                    partner = c3.w();
                }
                int i = a.a[m13.b(partner).ordinal()];
                if (i == 1) {
                    ia3 w2 = this.a.w();
                    if (w2 == null || (c = w2.c()) == null) {
                        return;
                    }
                    o93 a3 = o93.b.a(this.b, this.a.N(), c, o33Var);
                    if (a3 == null) {
                        return;
                    }
                    a3.a();
                } else if ((i != 2 && i != 3 && i != 4) || (G = this.a.G()) == null || (a2 = G.a()) == null) {
                } else {
                    qc3 qc3Var = this.a;
                    GGAdview gGAdview = this.b;
                    n33 a4 = n33.a.a();
                    ia3 w3 = qc3Var.w();
                    String str = "";
                    if (w3 != null && (c2 = w3.c()) != null && (C = c2.C()) != null && (e = C.e()) != null) {
                        str = e;
                    }
                    Template k = a4.k(str);
                    k93 a5 = k93.a.a(gGAdview, qc3Var.N(), a2, o33Var, (k == null || (impression = k.getImpression()) == null) ? true : impression.booleanValue());
                    if (a5 == null) {
                        return;
                    }
                    a5.a();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GGAdview gGAdview, qc3 qc3Var, f03 f03Var) {
            super(0);
            this.t = gGAdview;
            this.u = qc3Var;
            this.v = f03Var;
        }

        public final void a() {
            Ad c;
            Ad c2;
            TemplateMeta C;
            String e;
            g73 a2 = g73.a.a();
            GGAdview gGAdview = this.t;
            n03 N = this.u.N();
            ia3 w = this.u.w();
            String str = "";
            if (w != null && (c2 = w.c()) != null && (C = c2.C()) != null && (e = C.e()) != null) {
                str = e;
            }
            ia3 w2 = this.u.w();
            Partner w3 = (w2 == null || (c = w2.c()) == null) ? null : c.w();
            ia3 w4 = this.u.w();
            Ad c3 = w4 == null ? null : w4.c();
            c25.m(c3);
            o33 e2 = a2.e(gGAdview, N, str, w3, c3, new a(this.u), new b(this.u, this.t));
            if (e2 != null) {
                f03 f03Var = this.v;
                qc3 qc3Var = this.u;
                f03Var.k(e2);
                AdUnitMeasurements l = qc3Var.N().l();
                l.l(Long.valueOf(e2.getTimeTaken()));
                l.k(e2.E() ? Boolean.TRUE : null);
                r9 = l;
            }
            if (r9 == null) {
                qc3 qc3Var2 = this.u;
                String c4 = cz2.c(qc3Var2);
                StringBuilder G = wo1.G("Mystique view null for ");
                G.append(qc3Var2.N().c());
                G.append(". Not displaying ad");
                xz2.d(c4, G.toString());
                qc3Var2.x().b(r13.NO_FILL);
                qc3Var2.x().notifyObservers();
            }
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements q03.a {
        public d() {
        }

        @Override // com.p7700g.p99005.q03.a
        public void a() {
            qc3.this.I();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends fy2 {
        public e(long j) {
            super(j, 1000L);
        }

        @Override // com.p7700g.p99005.fy2
        public void j() {
            Ad c;
            String str = null;
            qc3.this.G = null;
            String c2 = cz2.c(this);
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("Timer Finished ");
            ia3 w = qc3.this.w();
            if (w != null && (c = w.c()) != null) {
                str = c.B();
            }
            G.append((Object) str);
            G.append(" Refresh Policy ");
            G.append(qc3.this.u());
            strArr[0] = G.toString();
            xz2.c(c2, strArr);
            qc3.this.M();
        }

        @Override // com.p7700g.p99005.fy2
        public void k(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc3(@NotNull n03 n03Var) {
        super(n03Var);
        c25.p(n03Var, "unitConfig");
        this.F = n03Var;
    }

    private final long L() {
        Ad c2;
        ia3 w = w();
        Long l = null;
        if (w != null && (c2 = w.c()) != null) {
            l = Long.valueOf(c2.z());
        }
        if (l == null) {
            return 60000L;
        }
        return Math.max(30000L, l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        AtomicBoolean l;
        ia3 w = w();
        if ((w == null || (l = w.l()) == null || !l.get()) ? false : true) {
            xz2.c(cz2.c(this), "Ad is still locked. Cannot refresh ad");
            return;
        }
        ia3 w2 = w();
        if (w2 != null) {
            w2.d(null);
        }
        ia3 w3 = w();
        if (w3 != null) {
            w3.g(false);
        }
        int i = a.a[u().ordinal()];
        if (i == 1) {
            xz2.c(cz2.c(this), "Loading ad on Refresh");
            W();
        } else if (i != 2) {
        } else {
            A().b(new l03());
            A().notifyObservers();
            xz2.c(cz2.c(this), "Ready for Manual Refresh. Notifying Observers");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((r1.length() > 0) == true) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void O(Context context, f03 f03Var) {
        Ad c2;
        TemplateMeta C;
        b35.h hVar = new b35.h();
        ia3 w = w();
        boolean z = true;
        if (w != null && (c2 = w.c()) != null && (C = c2.C()) != null && (r1 = C.c()) != null) {
        }
        z = false;
        if (z) {
            ky2.a.a().h(new b(hVar, context, f03Var));
        } else {
            f03Var.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String str) {
        AppConfig r;
        ia3 w = w();
        if (w == null) {
            xz2.c(cz2.c(this), "Got a unit click,but ad is null");
        } else if (!w.k()) {
            xz2.c(cz2.c(this), c25.C(this.F.c(), " received click, but unit is not clickable"));
        } else {
            Partner w2 = w.c().w();
            Context context = null;
            k13 e2 = w2 == null ? null : w2.e();
            boolean t = w.c().t();
            if (e2 == k13.S2S) {
                I();
                if (t) {
                    a03 a03Var = a03.a;
                    GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
                    if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
                        context = r.e();
                    }
                    a03Var.d(context, str);
                    return;
                }
                oc3.l(this, null, 1, null);
            } else if (this.I) {
            } else {
                oc3.l(this, null, 1, null);
            }
        }
    }

    private final void Y(f03 f03Var, GGAdview gGAdview) {
        Ad c2;
        if (w() == null) {
            return;
        }
        ia3 w = w();
        NativeMediatedAsset nativeMediatedAsset = null;
        if ((w == null ? null : w.c()) != null) {
            ia3 w2 = w();
            if (w2 != null && (c2 = w2.c()) != null) {
                nativeMediatedAsset = c2.v();
            }
            if (nativeMediatedAsset == null) {
                return;
            }
            xz2.c(cz2.c(this), "Generating new MystiqueView");
            ky2.a.a().h(new c(gGAdview, this, f03Var));
        }
    }

    @Override // com.p7700g.p99005.oc3
    public void J() {
        Ad c2;
        ia3 w = w();
        if ((w == null || w.j()) ? false : true) {
            super.J();
            K();
            return;
        }
        String c3 = cz2.c(this);
        String[] strArr = new String[1];
        StringBuilder G = wo1.G("GG Impression already recorded for ");
        ia3 w2 = w();
        String str = null;
        if (w2 != null && (c2 = w2.c()) != null) {
            str = c2.B();
        }
        G.append((Object) str);
        G.append(" for ");
        G.append(this.F.c());
        strArr[0] = G.toString();
        xz2.c(c3, strArr);
        b();
    }

    @r2
    public final void K() {
        Ad c2;
        if (this.G == null) {
            String c3 = cz2.c(this);
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("Starting timer for ");
            ia3 w = w();
            String str = null;
            if (w != null && (c2 = w.c()) != null) {
                str = c2.B();
            }
            G.append((Object) str);
            G.append(gl4.R);
            strArr[0] = G.toString();
            xz2.c(c3, strArr);
            this.G = new e(L()).q();
        }
    }

    @NotNull
    public final n03 N() {
        return this.F;
    }

    @r2
    public final void P(@NotNull f03 f03Var) {
        n13<?> a2;
        c25.p(f03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f83 G = G();
        Object a3 = (G == null || (a2 = G.a()) == null) ? null : a2.a();
        AdView adView = a3 instanceof AdView ? (AdView) a3 : null;
        if (adView == null) {
            return;
        }
        xz2.c(cz2.c(this), "Loaded Banner Ad from mediation base");
        f03Var.j(adView);
    }

    @r2(otherwise = 2)
    public final void Q(@NotNull f03 f03Var, @NotNull GGAdview gGAdview) {
        Ad c2;
        c25.p(f03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c25.p(gGAdview, "adView");
        ia3 w = w();
        if (w == null || (c2 = w.c()) == null) {
            return;
        }
        o03 a2 = q03.s.a(c2, new d());
        if (a2 != null) {
            f03Var.e(a2);
            return;
        }
        c2.d("Failed to show ad - Webview not found");
        M();
    }

    public final void R(@NotNull GGAdview gGAdview, @NotNull f03 f03Var) {
        Ad c2;
        Partner w;
        Ad c3;
        TemplateMeta C;
        c25.p(gGAdview, "adView");
        c25.p(f03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ia3 w2 = w();
        String str = null;
        String g = (w2 == null || (c2 = w2.c()) == null || (w = c2.w()) == null) ? null : w.g();
        if (c25.g(g, p13.ADMOB_BANNER.f())) {
            X(f03Var);
        } else if (c25.g(g, p13.FACEBOOK_BANNER.f())) {
            P(f03Var);
        } else if (c25.g(g, p13.S2S_BANNER.f())) {
            Q(f03Var, gGAdview);
        } else {
            ia3 w3 = w();
            if (w3 != null && (c3 = w3.c()) != null && (C = c3.C()) != null) {
                str = C.g();
            }
            if (c25.g(str, "v1")) {
                Context context = gGAdview.getContext();
                c25.o(context, "adView.context");
                O(context, f03Var);
            } else if (c25.g(str, qh3.x)) {
                Y(f03Var, gGAdview);
            }
        }
    }

    public void W() {
        super.k(this);
    }

    @r2(otherwise = 2)
    public final void X(@NotNull f03 f03Var) {
        n13<?> a2;
        c25.p(f03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f83 G = G();
        Object a3 = (G == null || (a2 = G.a()) == null) ? null : a2.a();
        com.google.android.gms.ads.AdView adView = a3 instanceof com.google.android.gms.ads.AdView ? (com.google.android.gms.ads.AdView) a3 : null;
        if (adView == null) {
            return;
        }
        xz2.c(cz2.c(this), "Loaded Banner Ad from mediation base");
        f03Var.j(adView);
    }

    @Nullable
    public final ia3 Z() {
        return w();
    }

    public final void a0() {
        if (s()) {
            xz2.c(cz2.c(this), c25.C("Already Loading Ad. Rejecting loading current Ad ", this.F.c()));
        } else {
            H();
        }
    }

    public final void b() {
        fy2 fy2Var;
        xz2.c(cz2.c(this), c25.C("Resuming timer. Is Ad Loaded? ", Boolean.valueOf(t())));
        if (!t() || (fy2Var = this.G) == null) {
            return;
        }
        fy2Var.m();
    }

    public final void b0() {
        fy2 fy2Var;
        String c2 = cz2.c(this);
        StringBuilder G = wo1.G("Pausing timer. Is Ad Loaded? ");
        G.append(t());
        G.append(" , Is UII Opened ");
        G.append(this.H);
        xz2.c(c2, G.toString());
        if (this.H || !t() || (fy2Var = this.G) == null) {
            return;
        }
        fy2Var.l();
    }

    @Override // com.p7700g.p99005.oc3, com.p7700g.p99005.h03
    public void d(@NotNull ia3 ia3Var) {
        c25.p(ia3Var, "adContainer");
        ia3Var.d(this);
        super.d(ia3Var);
    }

    @Override // com.p7700g.p99005.x83
    public void e() {
    }

    @Override // com.p7700g.p99005.oc3, com.p7700g.p99005.zb3
    public void e(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        this.H = false;
        super.e(bVar);
    }

    @Override // com.p7700g.p99005.g03
    public void f() {
        Ad c2;
        String c3 = cz2.c(this);
        String[] strArr = new String[1];
        ia3 w = w();
        String str = null;
        if (w != null && (c2 = w.c()) != null) {
            str = c2.B();
        }
        strArr[0] = c25.C("Ad Locked ", str);
        xz2.c(c3, strArr);
    }

    @Override // com.p7700g.p99005.oc3, com.p7700g.p99005.zb3
    public void g(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        b();
        this.H = true;
        super.g(bVar);
    }

    @Override // com.p7700g.p99005.g03
    public void h() {
        Ad c2;
        String c3 = cz2.c(this);
        String[] strArr = new String[1];
        ia3 w = w();
        String str = null;
        if (w != null && (c2 = w.c()) != null) {
            str = c2.B();
        }
        strArr[0] = c25.C("Ad UnLocked ", str);
        xz2.c(c3, strArr);
        if (this.G == null) {
            M();
        }
    }

    @Override // com.p7700g.p99005.oc3, com.p7700g.p99005.f13
    public void z() {
        fy2 fy2Var = this.G;
        if (fy2Var != null) {
            fy2Var.a();
        }
        this.G = null;
        super.z();
    }

    @Override // com.p7700g.p99005.x83
    public void d() {
        I();
    }
}