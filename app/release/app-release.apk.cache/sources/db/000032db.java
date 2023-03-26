package com.greedygame.core.app_open_ads.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.greedygame.core.GreedyGameAds;
import com.p7700g.p99005.b13;
import com.p7700g.p99005.c13;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import com.p7700g.p99005.d13;
import com.p7700g.p99005.dc3;
import com.p7700g.p99005.g13;
import com.p7700g.p99005.ia3;
import com.p7700g.p99005.j03;
import com.p7700g.p99005.k03;
import com.p7700g.p99005.m03;
import com.p7700g.p99005.m73;
import com.p7700g.p99005.mc3;
import com.p7700g.p99005.mz2;
import com.p7700g.p99005.n03;
import com.p7700g.p99005.nc3;
import com.p7700g.p99005.oc3;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.r13;
import com.p7700g.p99005.s13;
import com.p7700g.p99005.u13;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.yq4;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GGAppOpenAdsImpl implements pz, b13, m73, Observer {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final GGAppOpenAdsImpl t = b.a.a();
    private boolean u;
    @Nullable
    private d13 v;
    @NotNull
    private c13 w;
    @NotNull
    private n03 x;
    @Nullable
    private nc3 y;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GGAppOpenAdsImpl a() {
            return GGAppOpenAdsImpl.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final GGAppOpenAdsImpl b = new GGAppOpenAdsImpl(null);

        private b() {
        }

        @NotNull
        public final GGAppOpenAdsImpl a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            m03.values();
            int[] iArr = new int[2];
            iArr[m03.OPEN.ordinal()] = 1;
            iArr[m03.CLOSE.ordinal()] = 2;
            a = iArr;
            j03.values();
            int[] iArr2 = new int[3];
            iArr2[j03.FAILED_TO_OPEN.ordinal()] = 1;
            b = iArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public final /* synthetic */ Object s;

        public d(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d13 c = ((GGAppOpenAdsImpl) this.s).c();
            if (c == null) {
                return;
            }
            c.onAdClosed();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ Object s;

        public e(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d13 c = ((GGAppOpenAdsImpl) this.s).c();
            if (c == null) {
                return;
            }
            c.onAdOpened();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements g13 {
        public f() {
        }

        @Override // com.p7700g.p99005.g13
        public void a(@NotNull s13 s13Var) {
            c25.p(s13Var, "cause");
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null) {
                iNSTANCE$com_greedygame_sdkx_core.F(this);
            }
            xz2.d(cz2.c(this), c25.C("Ad Load failed since GreedyGameAds SDK could not be initialized with error ", s13Var));
            d13 c = GGAppOpenAdsImpl.this.c();
            if (c == null) {
                return;
            }
            c.a(r13.SDK_NOT_INTIALIZED);
        }

        @Override // com.p7700g.p99005.g13
        public void onInitSuccess() {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null) {
                iNSTANCE$com_greedygame_sdkx_core.F(this);
            }
            xz2.c(cz2.c(this), "SDK Init is now complete.Loading ads as requested");
            GGAppOpenAdsImpl.this.q();
        }
    }

    private GGAppOpenAdsImpl() {
        this.w = c13.PORTRAIT;
        this.x = new n03(null, k03.APP_OPEN, 1, null);
    }

    public /* synthetic */ GGAppOpenAdsImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void j(j03 j03Var) {
        d13 c2;
        if (c.b[j03Var.ordinal()] != 1 || (c2 = c()) == null) {
            return;
        }
        c2.e();
    }

    private final void l(r13 r13Var) {
        yq4 yq4Var;
        xz2.d(cz2.c(this), c25.C("Intersitial Ad Load failed ", r13Var));
        d13 c2 = c();
        if (c2 == null) {
            yq4Var = null;
        } else {
            c2.a(r13Var);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.d(cz2.c(this), "Listener is null");
        }
    }

    private final void m(ia3 ia3Var) {
        mz2<ia3> v;
        xz2.c(cz2.c(this), c25.C("Ad Loaded ", c()));
        nc3 nc3Var = this.y;
        if (nc3Var != null && (v = nc3Var.v()) != null) {
            v.deleteObserver(this);
        }
        d13 c2 = c();
        if (c2 == null) {
            return;
        }
        c2.onAdLoaded();
    }

    private final void n(String str) {
        if (c25.g(str, this.x.c())) {
            return;
        }
        n03 n03Var = new n03(str, k03.APP_OPEN);
        this.x = n03Var;
        oc3 a2 = mc3.a.a(n03Var);
        nc3 nc3Var = a2 instanceof nc3 ? (nc3) a2 : null;
        if (nc3Var == null) {
            String c2 = cz2.c(this);
            StringBuilder G = wo1.G("Unit id ");
            G.append(this.x.c());
            G.append(" is used in multiple ad formats. Please correct this");
            xz2.d(c2, G.toString());
            return;
        }
        this.y = nc3Var;
        if (nc3Var != null) {
            nc3Var.j(u13.MANUAL);
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        mz2<ia3> v;
        xz2.c(cz2.c(this), "Loading app open ad");
        nc3 nc3Var = this.y;
        if (nc3Var != null && (v = nc3Var.v()) != null) {
            v.addObserver(this);
        }
        nc3 nc3Var2 = this.y;
        if (nc3Var2 == null) {
            return;
        }
        nc3Var2.K();
    }

    private final void r() {
        s();
        xz2.c(cz2.c(this), c25.C("Adding Data Observer for ", this.x.c()));
        nc3 nc3Var = this.y;
        if (nc3Var == null) {
            return;
        }
        nc3Var.y().addObserver(this);
        nc3Var.x().addObserver(this);
        nc3Var.v().addObserver(this);
        nc3Var.B().addObserver(this);
        nc3Var.C().addObserver(this);
        nc3Var.E().addObserver(this);
    }

    private final void s() {
        xz2.c(cz2.c(this), c25.C("Removing Data Observer for ", this.x.c()));
        nc3 nc3Var = this.y;
        if (nc3Var == null) {
            return;
        }
        nc3Var.y().deleteObserver(this);
        nc3Var.x().deleteObserver(this);
        nc3Var.v().deleteObserver(this);
        nc3Var.B().deleteObserver(this);
        nc3Var.C().deleteObserver(this);
        nc3Var.E().deleteObserver(this);
    }

    private final void t() {
        xz2.c(cz2.c(this), "Scheduling ad load for appOpenAds after SDK is initialized");
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null) {
            return;
        }
        iNSTANCE$com_greedygame_sdkx_core.p(new f());
    }

    private final void u() {
        this.u = false;
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            d13 c2 = c();
            if (c2 == null) {
                return;
            }
            c2.onAdClosed();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new d(this));
    }

    private final void v() {
        this.u = true;
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            d13 c2 = c();
            if (c2 == null) {
                return;
            }
            c2.onAdOpened();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(this));
    }

    @Override // com.p7700g.p99005.b13
    public boolean a() {
        ia3 w;
        nc3 nc3Var = this.y;
        if (nc3Var == null || (w = nc3Var.w()) == null) {
            return false;
        }
        return w.i();
    }

    @Override // com.p7700g.p99005.b13
    public boolean b() {
        return this.u;
    }

    @Override // com.p7700g.p99005.b13
    @Nullable
    public d13 c() {
        return this.v;
    }

    @Override // com.p7700g.p99005.b13
    @NotNull
    public c13 d() {
        return this.w;
    }

    @Override // com.p7700g.p99005.b13
    public void e(@Nullable d13 d13Var) {
        this.v = d13Var;
    }

    @Override // com.p7700g.p99005.b13
    public void f(@NotNull c13 c13Var) {
        c25.p(c13Var, "<set-?>");
        this.w = c13Var;
    }

    public final void o() {
        GreedyGameAds.a.addDestroyEventListener(this);
    }

    @Override // java.util.Observer
    public void update(@Nullable Observable observable, @Nullable Object obj) {
        if (obj instanceof ia3) {
            m((ia3) obj);
        } else if (obj instanceof r13) {
            l((r13) obj);
        } else if (obj instanceof j03) {
            j((j03) obj);
        } else if (obj instanceof m03) {
            int i = c.a[((m03) obj).ordinal()];
            if (i == 1) {
                v();
            } else if (i != 2) {
            } else {
                u();
            }
        }
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        this.x = new n03(null, k03.APP_OPEN, 1, null);
        s();
    }

    @Override // com.p7700g.p99005.b13
    public void a(@NotNull String str) {
        c25.p(str, "unitId");
        if (str.length() == 0) {
            xz2.d(cz2.c(this), "Unit Id should not be empty.");
            d13 c2 = c();
            if (c2 == null) {
                return;
            }
            c2.a(r13.EMPTY_UNIT_ID);
            return;
        }
        n(str);
        if (c() == null) {
            xz2.d(cz2.c(this), "AppOpenAds events listener should be set before calling loadAd. Use setListener(listener: GGInterstitialEventsListener) method");
            return;
        }
        dc3 dc3Var = dc3.a;
        if (dc3Var.b()) {
            t();
        } else if (!dc3Var.a()) {
            xz2.d(cz2.c(this), "GreedyGameAds SDK should be initialised before an ad can be loaded. Run GreedyGameAds.initWith method. Refer docs for more information");
            d13 c3 = c();
            if (c3 == null) {
                return;
            }
            c3.a(r13.SDK_NOT_INTIALIZED);
        } else {
            q();
        }
    }

    @Override // com.p7700g.p99005.b13
    public void f() {
        if (!a()) {
            xz2.d(cz2.c(this), "Ad is not loaded");
            d13 c2 = c();
            if (c2 == null) {
                return;
            }
            c2.e();
        } else if (b()) {
            xz2.d(cz2.c(this), "Ad is already being shown");
            d13 c3 = c();
            if (c3 == null) {
                return;
            }
            c3.e();
        } else {
            nc3 nc3Var = this.y;
            if (nc3Var == null) {
                return;
            }
            nc3Var.M();
        }
    }

    @Override // com.p7700g.p99005.b13
    public void a(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (!a()) {
            xz2.d(cz2.c(this), "Ad is not loaded");
            d13 c2 = c();
            if (c2 == null) {
                return;
            }
            c2.e();
        } else if (b()) {
            xz2.d(cz2.c(this), "Ad is already being shown");
            d13 c3 = c();
            if (c3 == null) {
                return;
            }
            c3.e();
        } else {
            nc3 nc3Var = this.y;
            if (nc3Var == null) {
                return;
            }
            nc3Var.L(activity);
        }
    }
}