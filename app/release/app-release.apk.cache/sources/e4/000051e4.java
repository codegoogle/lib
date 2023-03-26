package com.p7700g.p99005;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.GreedyGameAds;
import java.util.Observable;
import java.util.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n73 extends r03 implements m73, p73, Observer {
    @Nullable
    private pc3 u;
    @Nullable
    private i13 x;
    private boolean y;
    private boolean z;
    @NotNull
    private u13 t = u13.AUTO;
    @NotNull
    private n03 v = new n03(null, k03.INTERSTITIAL, 1, null);
    @NotNull
    private String w = "";

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
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
    public static final class b implements Runnable {
        public final /* synthetic */ Object s;

        public b(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i13 R = ((n73) this.s).R();
            if (R == null) {
                return;
            }
            R.onAdClosed();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Object s;

        public c(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i13 R = ((n73) this.s).R();
            if (R == null) {
                return;
            }
            R.onAdOpened();
        }
    }

    public n73() {
        GreedyGameAds.a.addInternalDestroyListener$com_greedygame_sdkx_core(this);
    }

    private final void C() {
        if (this.u != null) {
            return;
        }
        oc3 a2 = mc3.a.a(H());
        pc3 pc3Var = a2 instanceof pc3 ? (pc3) a2 : null;
        if (pc3Var == null) {
            String c2 = cz2.c(this);
            StringBuilder G = wo1.G("Unit id ");
            G.append(H().c());
            G.append(" is used in multiple ad formats. Please correct this");
            xz2.d(c2, G.toString());
            return;
        }
        this.u = pc3Var;
        q();
    }

    private final void L(j03 j03Var) {
        i13 R;
        if (a.b[j03Var.ordinal()] != 1 || (R = R()) == null) {
            return;
        }
        R.e();
    }

    private final void O(r13 r13Var) {
        yq4 yq4Var;
        xz2.d(cz2.c(this), c25.C("Intersitial Ad Load failed ", r13Var));
        a(false);
        Q(false);
        i13 R = R();
        if (R == null) {
            yq4Var = null;
        } else {
            R.a(r13Var);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.d(cz2.c(this), "Listener is null");
        }
    }

    private final void P(ia3 ia3Var) {
        J();
        a(false);
        Q(true);
        i13 R = R();
        if (R == null) {
            return;
        }
        R.onAdLoaded();
    }

    private final ia3 S() {
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            return null;
        }
        return pc3Var.w();
    }

    private final void q() {
        yq4 yq4Var;
        s();
        xz2.c(cz2.c(this), c25.C("Adding Data Observer for ", H().c()));
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            yq4Var = null;
        } else {
            pc3Var.y().addObserver(this);
            pc3Var.x().addObserver(this);
            pc3Var.v().addObserver(this);
            pc3Var.B().addObserver(this);
            pc3Var.C().addObserver(this);
            pc3Var.E().addObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    private final void s() {
        yq4 yq4Var;
        xz2.c(cz2.c(this), c25.C("Removing Data Observer for ", H().c()));
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            yq4Var = null;
        } else {
            pc3Var.y().deleteObserver(this);
            pc3Var.x().deleteObserver(this);
            pc3Var.v().deleteObserver(this);
            pc3Var.B().deleteObserver(this);
            pc3Var.C().deleteObserver(this);
            pc3Var.E().deleteObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    private final void t() {
        Q(false);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            i13 R = R();
            if (R == null) {
                return;
            }
            R.onAdClosed();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(this));
    }

    private final void w() {
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            i13 R = R();
            if (R == null) {
                return;
            }
            R.onAdOpened();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new c(this));
    }

    @Override // com.p7700g.p99005.r03
    public void D() {
        yq4 yq4Var;
        if (R() == null) {
            yq4Var = null;
        } else {
            ia3 S = S();
            boolean z = false;
            if (S != null && !S.i()) {
                z = true;
            }
            if (z) {
                xz2.c(cz2.c(this), "Network Observer :Loading Ad after network connected.");
                k();
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
        if (R() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the new created instance of ", g()));
            return;
        }
        boolean z = false;
        if (H().c().length() == 0) {
            O(r13.EMPTY_UNIT_ID);
        } else if (!GreedyGameAds.a.isSdkInitialized()) {
            super.E(d03Var);
        } else if (i()) {
            xz2.c(cz2.c(this), "Currently loading ad. Rejecting this request");
        } else {
            if (this.u == null) {
                C();
            }
            ia3 S = S();
            if (S != null && S.i()) {
                z = true;
            }
            if (z) {
                a(true);
                pc3 pc3Var = this.u;
                if (pc3Var == null) {
                    return;
                }
                pc3Var.M();
                return;
            }
            xz2.c(cz2.c(this), "Loading ad on load ad request");
            pc3 pc3Var2 = this.u;
            if (pc3Var2 == null) {
                return;
            }
            pc3Var2.K();
        }
    }

    @Override // com.p7700g.p99005.r03
    @NotNull
    public n03 H() {
        return this.v;
    }

    public void M(@NotNull n03 n03Var) {
        c25.p(n03Var, "value");
        this.v = n03Var;
        C();
    }

    public void N(@Nullable i13 i13Var) {
        this.x = i13Var;
    }

    public void Q(boolean z) {
        this.z = z;
    }

    @Nullable
    public i13 R() {
        return this.x;
    }

    @Override // com.p7700g.p99005.p73
    public void a(@NotNull String str) {
        c25.p(str, "value");
        this.w = str;
        M(new n03(str, k03.INTERSTITIAL));
    }

    @Override // com.p7700g.p99005.p73
    public void e(@NotNull u13 u13Var) {
        c25.p(u13Var, "value");
        String c2 = cz2.c(this);
        StringBuilder G = wo1.G("Changing refresh policy for ");
        G.append(H().c());
        G.append(" from ");
        G.append(this.t);
        G.append(" to ");
        G.append(u13Var);
        xz2.c(c2, G.toString());
        this.t = u13Var;
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            return;
        }
        pc3Var.j(u13Var);
    }

    @Override // com.p7700g.p99005.p73
    @NotNull
    public u13 f() {
        pc3 pc3Var = this.u;
        u13 u = pc3Var == null ? null : pc3Var.u();
        return u == null ? u13.AUTO : u;
    }

    @Override // com.p7700g.p99005.p73
    @NotNull
    public String g() {
        return this.w;
    }

    public boolean i() {
        return this.y;
    }

    @Override // com.p7700g.p99005.p73
    public boolean j() {
        return this.z && R() != null;
    }

    @Override // com.p7700g.p99005.p73
    public void k() {
        if (R() == null) {
            xz2.d(cz2.c(this), "Interstitial events listener should be set before calling loadAd. Use setListener(listener: GGInterstitialEventsListener) method");
        } else {
            G(R());
        }
    }

    @Override // com.p7700g.p99005.p73
    public void l() {
        N(null);
    }

    @Override // com.p7700g.p99005.p73
    public void m() {
        if (R() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the newly created instance of ", g()));
            return;
        }
        ia3 S = S();
        boolean z = false;
        if (S != null && !S.i()) {
            z = true;
        }
        if (z) {
            xz2.d(cz2.c(this), "This ad is not valid. Cannot show ad");
            return;
        }
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            return;
        }
        pc3Var.N();
    }

    @Override // com.p7700g.p99005.p73
    public void n() {
        xz2.c(cz2.c(this), "Received on destroy, removing observers and current ggImplementation");
        o();
        o73.a.b(g());
        s();
        K();
    }

    public void o() {
        N(null);
    }

    @Override // java.util.Observer
    public void update(@Nullable Observable observable, @Nullable Object obj) {
        if (obj instanceof ia3) {
            P((ia3) obj);
        } else if (obj instanceof r13) {
            O((r13) obj);
        } else if (obj instanceof j03) {
            L((j03) obj);
        } else if (obj instanceof m03) {
            int i = a.a[((m03) obj).ordinal()];
            if (i == 1) {
                w();
            } else if (i != 2) {
            } else {
                t();
            }
        }
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        n();
    }

    @Override // com.p7700g.p99005.p73
    public void j(@NotNull i13 i13Var) {
        c25.p(i13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        xz2.c(cz2.c(this), c25.C("Setting new events listener for unit ", g()));
        N(i13Var);
    }

    public void a(boolean z) {
        this.y = z;
    }

    @Override // com.p7700g.p99005.p73
    public void a(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (R() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the newly created instance of ", g()));
            return;
        }
        ia3 S = S();
        boolean z = false;
        if (S != null && !S.i()) {
            z = true;
        }
        if (z) {
            xz2.d(cz2.c(this), "This ad is not valid. Cannot show ad");
            return;
        }
        pc3 pc3Var = this.u;
        if (pc3Var == null) {
            return;
        }
        pc3Var.L(activity);
    }
}