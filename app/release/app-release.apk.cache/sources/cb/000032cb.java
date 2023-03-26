package com.greedygame.core.adview.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.core.network.model.responses.TemplateMeta;
import com.p7700g.p99005.b95;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import com.p7700g.p99005.d03;
import com.p7700g.p99005.e25;
import com.p7700g.p99005.f03;
import com.p7700g.p99005.ia3;
import com.p7700g.p99005.j73;
import com.p7700g.p99005.k03;
import com.p7700g.p99005.k13;
import com.p7700g.p99005.ky2;
import com.p7700g.p99005.l03;
import com.p7700g.p99005.m03;
import com.p7700g.p99005.mc3;
import com.p7700g.p99005.mz2;
import com.p7700g.p99005.n03;
import com.p7700g.p99005.oc3;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.qc3;
import com.p7700g.p99005.r03;
import com.p7700g.p99005.r13;
import com.p7700g.p99005.s03;
import com.p7700g.p99005.sc3;
import com.p7700g.p99005.u13;
import com.p7700g.p99005.uz4;
import com.p7700g.p99005.v03;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.yq4;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GGAdViewImpl extends r03 implements pz, s03, Observer {
    private boolean A;
    private boolean B;
    private int C;
    @NotNull
    private u13 D;
    @Nullable
    private Context E;
    private long F;
    @NotNull
    private n03 G;
    private final boolean t;
    @Nullable
    private qc3 u;
    @Nullable
    private v03 v;
    @NotNull
    private String w;
    private boolean x;
    @NotNull
    private String y;
    @Nullable
    private Observer z;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            m03.values();
            int[] iArr = new int[2];
            iArr[m03.OPEN.ordinal()] = 1;
            iArr[m03.CLOSE.ordinal()] = 2;
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<yq4> {
        public final /* synthetic */ v03 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v03 v03Var) {
            super(0);
            this.u = v03Var;
        }

        public final void a() {
            GGAdViewImpl.this.G(this.u);
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ r13 t;

        public c(Object obj, r13 r13Var) {
            this.s = obj;
            this.t = r13Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v03 Z = ((GGAdViewImpl) this.s).Z();
            if (Z == null) {
                return;
            }
            Z.a(this.t);
        }
    }

    public GGAdViewImpl() {
        this(false, 1, null);
    }

    public GGAdViewImpl(boolean z) {
        this.t = z;
        this.w = "";
        this.y = "";
        this.B = true;
        this.D = u13.AUTO;
        this.F = -1L;
        this.G = new n03(null, k03.NATIVE_OR_BANNER, 1, null);
    }

    private final void L() {
        qc3 qc3Var;
        qc3 qc3Var2 = this.u;
        boolean z = false;
        if (qc3Var2 != null && qc3Var2.t()) {
            qc3 qc3Var3 = this.u;
            if (qc3Var3 != null && qc3Var3.F()) {
                z = true;
            }
            if (!((z && k() == u13.AUTO) || k() == u13.MANUAL) || (qc3Var = this.u) == null) {
                return;
            }
            qc3Var.a0();
        }
    }

    private final void M() {
        qc3 qc3Var = this.u;
        if (qc3Var != null) {
            qc3Var.b0();
        }
        R();
        K();
    }

    private final void N() {
        yq4 yq4Var;
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            yq4Var = null;
        } else {
            qc3Var.N().d(this.C);
            xz2.c(cz2.c(this), c25.C("Updated Unit Size set to AdController ", Integer.valueOf(this.C)));
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), "Controller is null could not update the unit size.");
        }
    }

    private final void O() {
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            return;
        }
        oc3.l(qc3Var, null, 1, null);
    }

    private final void P() {
        Ad c2;
        ia3 Z;
        Ad c3;
        String y;
        Ad c4;
        qc3 qc3Var = this.u;
        String str = null;
        if (qc3Var == null || (Z = qc3Var.Z()) == null || (c3 = Z.c()) == null || (y = c3.y()) == null) {
            String c5 = cz2.c(this);
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("For ");
            ia3 g = g();
            if (g != null && (c2 = g.c()) != null) {
                str = c2.B();
            }
            G.append((Object) str);
            G.append(" the redirect url is null");
            strArr[0] = G.toString();
            xz2.c(c5, strArr);
            return;
        }
        if (y.length() > 0) {
            j73.a.a(b0(), y);
            return;
        }
        String c6 = cz2.c(this);
        String[] strArr2 = new String[1];
        StringBuilder G2 = wo1.G("For ");
        ia3 g2 = g();
        if (g2 != null && (c4 = g2.c()) != null) {
            str = c4.B();
        }
        G2.append((Object) str);
        G2.append(" the redirect url is empty");
        strArr2[0] = G2.toString();
        xz2.c(c6, strArr2);
    }

    private final void Q() {
        yq4 yq4Var;
        if (b95.U1(h())) {
            return;
        }
        R();
        xz2.c(cz2.c(this), c25.C("Adding Data Observer for ", H().c()));
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            yq4Var = null;
        } else {
            Observer a0 = a0();
            if (a0 != null) {
                qc3Var.y().addObserver(a0);
                qc3Var.x().addObserver(a0);
                qc3Var.v().addObserver(a0);
            }
            qc3Var.y().addObserver(this);
            qc3Var.x().addObserver(this);
            qc3Var.v().addObserver(this);
            qc3Var.B().addObserver(this);
            qc3Var.C().addObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    private final void R() {
        yq4 yq4Var;
        if (b95.U1(h())) {
            return;
        }
        xz2.c(cz2.c(this), c25.C("Removing Data Observer for ", H().c()));
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            yq4Var = null;
        } else {
            Observer a0 = a0();
            if (a0 != null) {
                qc3Var.y().deleteObserver(a0);
                qc3Var.x().deleteObserver(a0);
                qc3Var.v().deleteObserver(a0);
            }
            qc3Var.y().deleteObserver(this);
            qc3Var.x().deleteObserver(this);
            qc3Var.v().deleteObserver(this);
            qc3Var.B().deleteObserver(this);
            qc3Var.C().deleteObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    private final void S() {
        if (this.u != null) {
            return;
        }
        oc3 a2 = mc3.a.a(H());
        qc3 qc3Var = a2 instanceof qc3 ? (qc3) a2 : null;
        if (qc3Var == null) {
            String c2 = cz2.c(this);
            StringBuilder G = wo1.G("Unit id ");
            G.append(H().c());
            G.append(" is used in multiple ad formats. Please correct this");
            xz2.d(c2, G.toString());
            return;
        }
        this.u = qc3Var;
        N();
        ViewGroup.LayoutParams k = H().k();
        if (k != null) {
            X(k);
        }
        Q();
    }

    private final void T() {
        if (k() == u13.MANUAL) {
            xz2.c(cz2.c(this), c25.C(H().c(), " ready for refresh"));
            v03 v03Var = this.v;
            if (v03Var == null) {
                return;
            }
            v03Var.c();
        }
    }

    private final void V(r13 r13Var) {
        xz2.c(cz2.c(this), c25.C("Ad Loading Error: ", r13Var));
        Y(false);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            v03 Z = Z();
            if (Z == null) {
                return;
            }
            Z.a(r13Var);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new c(this, r13Var));
    }

    private final void W(ia3 ia3Var) {
        v03 v03Var;
        J();
        if (!c25.g(this.w, ia3Var.c().B())) {
            this.F = System.currentTimeMillis();
            String B = ia3Var.c().B();
            if (B == null) {
                B = "";
            }
            this.w = B;
        }
        xz2.c(cz2.c(this), c25.C("Ad Loaded ", H().c()));
        Y(false);
        if (!this.t || (v03Var = this.v) == null) {
            return;
        }
        v03Var.onAdLoaded();
    }

    private final void X(ViewGroup.LayoutParams layoutParams) {
        yq4 yq4Var;
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            yq4Var = null;
        } else {
            qc3Var.N().e(new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height));
            xz2.c(cz2.c(this), "Updated adview layout params");
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), "Controller is null could not update the unit size.");
        }
    }

    private final void Y(boolean z) {
        this.x = z;
        if (z) {
            this.w = "";
        }
    }

    private final void d0() {
        Q();
        J();
    }

    @Override // com.p7700g.p99005.s03
    public void A() {
        mz2<ia3> v;
        ia3 a2;
        mz2<ia3> v2;
        ia3 a3;
        Ad c2;
        Partner w;
        ia3 Z;
        Ad c3;
        TemplateMeta C;
        ia3 Z2;
        Ad c4;
        if (g() == null) {
            xz2.c(cz2.c(this), "Current Ad is null. Rejecting click event");
            return;
        }
        ia3 g = g();
        if (((g == null || g.i()) ? false : true) && k() == u13.AUTO) {
            xz2.c(cz2.c(this), "Current Ad is not valid. Rejecting click event");
            return;
        }
        qc3 qc3Var = this.u;
        if ((qc3Var == null || (v = qc3Var.v()) == null || (a2 = v.a()) == null || a2.k()) ? false : true) {
            xz2.c(cz2.c(this), c25.C(H().c(), " received click, but unit is not clickable"));
            return;
        }
        qc3 qc3Var2 = this.u;
        Boolean bool = null;
        k13 e = (qc3Var2 == null || (v2 = qc3Var2.v()) == null || (a3 = v2.a()) == null || (c2 = a3.c()) == null || (w = c2.w()) == null) ? null : w.e();
        qc3 qc3Var3 = this.u;
        String g2 = (qc3Var3 == null || (Z = qc3Var3.Z()) == null || (c3 = Z.c()) == null || (C = c3.C()) == null) ? null : C.g();
        qc3 qc3Var4 = this.u;
        if (qc3Var4 != null && (Z2 = qc3Var4.Z()) != null && (c4 = Z2.c()) != null) {
            bool = Boolean.valueOf(c4.t());
        }
        if (c25.g(g2, "v1")) {
            if (e == k13.S2S && c25.g(bool, Boolean.TRUE)) {
                qc3 qc3Var5 = this.u;
                if (qc3Var5 != null) {
                    qc3Var5.I();
                }
                P();
                return;
            }
            qc3 qc3Var6 = this.u;
            if (qc3Var6 != null) {
                qc3Var6.I();
            }
            O();
        }
    }

    @Override // com.p7700g.p99005.s03
    public void B(@Nullable Observer observer) {
        this.z = observer;
    }

    @Override // com.p7700g.p99005.s03
    public void C() {
        xz2.c(cz2.c(this), "lifecycle owner STARTED");
        this.B = true;
    }

    @Override // com.p7700g.p99005.r03
    public void D() {
        yq4 yq4Var;
        v03 v03Var = this.v;
        if (v03Var == null) {
            yq4Var = null;
        } else {
            ia3 g = g();
            boolean z = false;
            if (g != null && !g.i()) {
                z = true;
            }
            if (z && k() == u13.AUTO) {
                xz2.c(cz2.c(this), "Network Observer :Loading Ad after network connected.");
                r(v03Var);
            }
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), "Network Observer : Not Loading Ad  AdLoadCallback is null");
        }
    }

    @Override // com.p7700g.p99005.r03
    public void F() {
        xz2.c(cz2.c(this), "Network Observer :Network disconnected. Will load ad after ");
    }

    @Override // com.p7700g.p99005.r03
    public void G(@Nullable d03 d03Var) {
        Objects.requireNonNull(d03Var, "null cannot be cast to non-null type com.greedygame.core.adview.general.AdLoadCallback");
        this.v = (v03) d03Var;
        if (!GreedyGameAds.a.isSdkInitialized()) {
            super.E(d03Var);
        } else if (this.x) {
            xz2.c(cz2.c(this), c25.C("AdView Loading ad. Rejecting request ", H().c()));
        } else {
            Y(true);
            if (this.u == null) {
                S();
            }
            xz2.c(cz2.c(this), "Loading ad on load ad request");
            qc3 qc3Var = this.u;
            if (qc3Var == null) {
                return;
            }
            qc3Var.W();
        }
    }

    @Override // com.p7700g.p99005.r03
    @NotNull
    public n03 H() {
        return this.G;
    }

    public void U(@NotNull n03 n03Var) {
        c25.p(n03Var, "<set-?>");
        this.G = n03Var;
    }

    @Nullable
    public final v03 Z() {
        return this.v;
    }

    @Override // com.p7700g.p99005.s03
    public void a(@NotNull String str) {
        c25.p(str, "value");
        if (c25.g(this.y, str)) {
            return;
        }
        if (str.length() == 0) {
            return;
        }
        this.y = str;
        H().g(str);
        this.u = null;
        S();
    }

    @Nullable
    public Observer a0() {
        return this.z;
    }

    @Nullable
    public Context b0() {
        return this.E;
    }

    public final void c0() {
        R();
    }

    @Override // com.p7700g.p99005.s03
    public void e(@NotNull u13 u13Var) {
        c25.p(u13Var, "value");
        String c2 = cz2.c(this);
        StringBuilder G = wo1.G("Changing refresh policy for ");
        G.append(H().c());
        G.append(" from ");
        G.append(this.D);
        G.append(" to ");
        G.append(u13Var);
        xz2.c(c2, G.toString());
        this.D = u13Var;
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            return;
        }
        qc3Var.j(u13Var);
    }

    @Override // com.p7700g.p99005.s03
    public void f(@NotNull n03 n03Var) {
        c25.p(n03Var, "unitConfig");
        cz2.c(this);
        c25.C("GGAdView created ", n03Var.c());
        U(n03Var);
        S();
    }

    @Override // com.p7700g.p99005.s03
    @Nullable
    public ia3 g() {
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            return null;
        }
        return qc3Var.Z();
    }

    @Override // com.p7700g.p99005.s03
    @NotNull
    public String h() {
        return H().c();
    }

    @Override // com.p7700g.p99005.s03
    public boolean j() {
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            return false;
        }
        return qc3Var.t();
    }

    @Override // com.p7700g.p99005.s03
    @NotNull
    public u13 k() {
        qc3 qc3Var = this.u;
        u13 u = qc3Var == null ? null : qc3Var.u();
        return u == null ? u13.AUTO : u;
    }

    @Override // com.p7700g.p99005.s03
    public boolean m() {
        return xz2.e;
    }

    @Override // com.p7700g.p99005.s03
    @NotNull
    public String n() {
        String format = new SimpleDateFormat("hh:mm:ss a").format(Long.valueOf(this.F));
        c25.o(format, "sdf.format(_lastAdRefreshTime)");
        return format;
    }

    @Override // com.p7700g.p99005.s03
    public void o() {
        qc3 qc3Var;
        if (!this.B || (qc3Var = this.u) == null) {
            return;
        }
        qc3Var.J();
    }

    @Override // com.p7700g.p99005.s03
    public void p() {
        xz2.c(cz2.c(this), "lifecycle owner CREATE");
        this.A = true;
    }

    @Override // com.p7700g.p99005.s03
    public void q() {
        xz2.c(cz2.c(this), "lifecycle owner RESUMED");
        d0();
        L();
    }

    @Override // com.p7700g.p99005.s03
    public void r(@Nullable v03 v03Var) {
        ky2.a.a().h(new b(v03Var));
    }

    @Override // com.p7700g.p99005.s03
    public void s() {
        xz2.c(cz2.c(this), "lifecycle owner PAUSED");
        M();
    }

    @Override // com.p7700g.p99005.s03
    public void t() {
        xz2.c(cz2.c(this), "lifecycle owner STOP");
        this.B = false;
        this.A = false;
    }

    @Override // java.util.Observer
    public void update(@Nullable Observable observable, @Nullable Object obj) {
        v03 v03Var;
        if (obj instanceof ia3) {
            W((ia3) obj);
        } else if (obj instanceof r13) {
            V((r13) obj);
        } else if (obj instanceof l03) {
            T();
        } else if (obj instanceof m03) {
            int i = a.a[((m03) obj).ordinal()];
            if (i != 1) {
                if (i == 2 && (v03Var = this.v) != null) {
                    v03Var.d();
                    return;
                }
                return;
            }
            v03 v03Var2 = this.v;
            if (v03Var2 == null) {
                return;
            }
            v03Var2.b();
        } else if (obj instanceof sc3) {
            Y(false);
            this.u = null;
        }
    }

    @Override // com.p7700g.p99005.s03
    public void v() {
        xz2.c(cz2.c(this), "lifecycle owner View Detached");
        M();
    }

    @Override // com.p7700g.p99005.s03
    public void w() {
        xz2.c(cz2.c(this), "lifecycle owner DESTROYED");
        this.v = null;
        B(null);
        a((Context) null);
    }

    @Override // com.p7700g.p99005.s03
    public void y() {
        qc3 qc3Var;
        xz2.c(cz2.c(this), "lifecycle owner View Attached");
        this.B = true;
        d0();
        qc3 qc3Var2 = this.u;
        if (!(qc3Var2 != null && qc3Var2.t()) || (qc3Var = this.u) == null) {
            return;
        }
        qc3Var.b();
    }

    @Override // com.p7700g.p99005.s03
    public void s(@NotNull GGAdview gGAdview, @NotNull f03 f03Var) {
        c25.p(gGAdview, "adView");
        c25.p(f03Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        qc3 qc3Var = this.u;
        if (qc3Var == null) {
            return;
        }
        qc3Var.R(gGAdview, f03Var);
    }

    @Override // com.p7700g.p99005.s03
    public void v(@NotNull ViewGroup.LayoutParams layoutParams) {
        c25.p(layoutParams, "params");
        H().e(new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height));
        X(layoutParams);
    }

    @Override // com.p7700g.p99005.s03
    public void a(@Nullable Context context) {
        this.E = context;
    }

    @Override // com.p7700g.p99005.s03
    public void a(int i, int i2) {
        if (i > 0) {
            this.C = i;
            H().d(this.C);
            N();
            AdUnitMeasurements l = H().l();
            l.j(Integer.valueOf(i));
            l.i(Integer.valueOf(i2));
        }
    }

    public /* synthetic */ GGAdViewImpl(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.p7700g.p99005.s03
    public void a(boolean z) {
        if (z) {
            if (!this.B) {
                q();
            }
            this.B = true;
            return;
        }
        this.B = false;
        s();
    }
}