package com.p7700g.p99005;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.GreedyGameAds;
import com.p7700g.p99005.rc3;
import java.util.Observable;
import java.util.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vb3 extends r03 implements m73, xb3, Observer {
    @NotNull
    private n03 t = new n03(null, k03.REWARDED, 1, null);
    @NotNull
    private String u = "";
    @Nullable
    private m23 v;
    private boolean w;
    private boolean x;
    @Nullable
    private rc3 y;

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
            m23 S = ((vb3) this.s).S();
            if (S == null) {
                return;
            }
            S.onAdClosed();
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
            m23 S = ((vb3) this.s).S();
            if (S == null) {
                return;
            }
            S.onAdOpened();
        }
    }

    public vb3() {
        GreedyGameAds.a.addInternalDestroyListener$com_greedygame_sdkx_core(this);
    }

    private final void C() {
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            m23 S = S();
            if (S == null) {
                return;
            }
            S.onAdOpened();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new c(this));
    }

    private final void L(j03 j03Var) {
        m23 S;
        if (a.b[j03Var.ordinal()] != 1 || (S = S()) == null) {
            return;
        }
        S.e();
    }

    private final void N(r13 r13Var) {
        yq4 yq4Var;
        xz2.d(cz2.c(this), c25.C("Intersitial Ad Load failed ", r13Var));
        a(false);
        Q(false);
        m23 S = S();
        if (S == null) {
            yq4Var = null;
        } else {
            S.a(r13Var);
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
        m23 S = S();
        if (S == null) {
            return;
        }
        S.onAdLoaded();
    }

    private final ia3 U() {
        rc3 rc3Var = this.y;
        if (rc3Var == null) {
            return null;
        }
        return rc3Var.w();
    }

    private final void p() {
        Q(false);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            m23 S = S();
            if (S == null) {
                return;
            }
            S.onAdClosed();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(this));
    }

    private final void q() {
        if (this.y != null) {
            return;
        }
        oc3 a2 = mc3.a.a(H());
        rc3 rc3Var = a2 instanceof rc3 ? (rc3) a2 : null;
        if (rc3Var == null) {
            String c2 = cz2.c(this);
            StringBuilder G = wo1.G("Unit id ");
            G.append(H().c());
            G.append(" is used in multiple ad formats. Please correct this");
            xz2.d(c2, G.toString());
            return;
        }
        this.y = rc3Var;
        s();
    }

    private final void s() {
        yq4 yq4Var;
        t();
        xz2.c(cz2.c(this), c25.C("Adding Data Observer for ", H().c()));
        rc3 rc3Var = this.y;
        if (rc3Var == null) {
            yq4Var = null;
        } else {
            rc3Var.y().addObserver(this);
            rc3Var.x().addObserver(this);
            rc3Var.v().addObserver(this);
            rc3Var.B().addObserver(this);
            rc3Var.C().addObserver(this);
            rc3Var.E().addObserver(this);
            rc3Var.L().addObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    private final void t() {
        yq4 yq4Var;
        xz2.c(cz2.c(this), c25.C("Removing Data Observer for ", H().c()));
        rc3 rc3Var = this.y;
        if (rc3Var == null) {
            yq4Var = null;
        } else {
            rc3Var.y().deleteObserver(this);
            rc3Var.x().deleteObserver(this);
            rc3Var.v().deleteObserver(this);
            rc3Var.B().deleteObserver(this);
            rc3Var.C().deleteObserver(this);
            rc3Var.E().deleteObserver(this);
            rc3Var.L().deleteObserver(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), c25.C("Controller is null for ", H().c()));
        }
    }

    @Override // com.p7700g.p99005.r03
    public void D() {
        yq4 yq4Var;
        if (S() == null) {
            yq4Var = null;
        } else {
            ia3 U = U();
            boolean z = false;
            if (U != null && !U.i()) {
                z = true;
            }
            if (z) {
                xz2.c(cz2.c(this), "Network Observer :Loading Ad after network connected.");
                j();
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
        if (S() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the new created instance of ", R()));
            return;
        }
        boolean z = false;
        if (H().c().length() == 0) {
            N(r13.EMPTY_UNIT_ID);
        } else if (!GreedyGameAds.a.isSdkInitialized()) {
            super.E(d03Var);
        } else if (T()) {
            xz2.c(cz2.c(this), "Currently loading ad. Rejecting this request");
        } else {
            if (this.y == null) {
                q();
            }
            ia3 U = U();
            if (U != null && U.i()) {
                z = true;
            }
            if (z) {
                a(true);
                rc3 rc3Var = this.y;
                if (rc3Var != null) {
                    rc3Var.O();
                }
            }
            xz2.c(cz2.c(this), "Loading ad on load ad request");
            rc3 rc3Var2 = this.y;
            if (rc3Var2 == null) {
                return;
            }
            rc3Var2.N();
        }
    }

    @Override // com.p7700g.p99005.r03
    @NotNull
    public n03 H() {
        return this.t;
    }

    public void M(@NotNull n03 n03Var) {
        c25.p(n03Var, "value");
        this.t = n03Var;
        q();
    }

    public void O(@Nullable m23 m23Var) {
        this.v = m23Var;
    }

    public void Q(boolean z) {
        this.x = z;
    }

    @NotNull
    public String R() {
        return this.u;
    }

    @Nullable
    public m23 S() {
        return this.v;
    }

    public boolean T() {
        return this.w;
    }

    @Override // com.p7700g.p99005.xb3
    public void a(@NotNull String str) {
        c25.p(str, "value");
        this.u = str;
        M(new n03(str, k03.REWARDED));
    }

    @Override // com.p7700g.p99005.xb3
    public boolean i() {
        return this.x && S() != null;
    }

    @Override // com.p7700g.p99005.xb3
    public void j() {
        if (S() == null) {
            xz2.d(cz2.c(this), "Interstitial events listener should be set before calling loadAd. Use setListener(listener: GGInterstitialEventsListener) method");
        } else {
            G(S());
        }
    }

    @Override // com.p7700g.p99005.xb3
    public void k(@NotNull m23 m23Var) {
        c25.p(m23Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        xz2.c(cz2.c(this), c25.C("Setting new events listener for unit ", R()));
        O(m23Var);
    }

    @Override // com.p7700g.p99005.xb3
    public void l() {
        if (S() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the newly created instance of ", R()));
            return;
        }
        ia3 U = U();
        boolean z = false;
        if (U != null && !U.i()) {
            z = true;
        }
        if (z) {
            xz2.d(cz2.c(this), "This ad is not valid. Cannot show ad");
            return;
        }
        rc3 rc3Var = this.y;
        if (rc3Var == null) {
            return;
        }
        rc3Var.P();
    }

    @Override // com.p7700g.p99005.xb3
    public void m() {
        xz2.c(cz2.c(this), "Received on destroy, removing observers and current ggImplementation");
        n();
        wb3.a.b(R());
        t();
        K();
    }

    public void n() {
        O(null);
    }

    @Override // java.util.Observer
    public void update(@Nullable Observable observable, @Nullable Object obj) {
        m23 S;
        if (obj instanceof ia3) {
            P((ia3) obj);
        } else if (obj instanceof r13) {
            N((r13) obj);
        } else if (obj instanceof j03) {
            L((j03) obj);
        } else if (obj instanceof m03) {
            int i = a.a[((m03) obj).ordinal()];
            if (i == 1) {
                C();
            } else if (i != 2) {
            } else {
                p();
            }
        } else if (!(obj instanceof rc3.a) || (S = S()) == null) {
        } else {
            S.onReward();
        }
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        m();
    }

    public void a(boolean z) {
        this.w = z;
    }

    @Override // com.p7700g.p99005.xb3
    public void k() {
        O(null);
    }

    @Override // com.p7700g.p99005.xb3
    public void a(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (S() == null) {
            xz2.d(cz2.c(this), c25.C("Call setListener and then loadAd for the newly created instance of ", R()));
            return;
        }
        ia3 U = U();
        boolean z = false;
        if (U != null && !U.i()) {
            z = true;
        }
        if (z) {
            xz2.d(cz2.c(this), "This ad is not valid. Cannot show ad");
            return;
        }
        rc3 rc3Var = this.y;
        if (rc3Var == null) {
            return;
        }
        rc3Var.M(activity);
    }
}