package com.p7700g.p99005;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.lc3;
import com.p7700g.p99005.t23;
import java.util.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rc3 extends oc3 implements a93 {
    @NotNull
    private final n03 F;
    @NotNull
    private u13 G;
    @NotNull
    private final mz2<a> H;

    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.ADMOB_REWARDED_AD.ordinal()] = 1;
            iArr[lc3.ADMOB_REWARDED_INTERSTITIAL.ordinal()] = 2;
            iArr[lc3.FACEBOOK_REWARDED.ordinal()] = 3;
            a = iArr;
            u13.values();
            int[] iArr2 = new int[2];
            iArr2[u13.AUTO.ordinal()] = 1;
            iArr2[u13.MANUAL.ordinal()] = 2;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc3(@NotNull n03 n03Var) {
        super(n03Var);
        c25.p(n03Var, "unitConfig");
        this.F = n03Var;
        this.G = u13.MANUAL;
        this.H = new mz2<>();
    }

    private final void K() {
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
        int i = b.b[u().ordinal()];
        if (i == 1) {
            xz2.c(cz2.c(this), "Loading ad on Refresh");
            N();
        } else if (i != 2) {
        } else {
            A().b(new l03());
            A().notifyObservers();
            xz2.c(cz2.c(this), "Ready for Manual Refresh. Notifying Observers");
        }
    }

    @NotNull
    public final Observable L() {
        return this.H;
    }

    public final void M(@NotNull Activity activity) {
        Ad c;
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        lc3.a aVar = lc3.s;
        ia3 w = w();
        int i = b.a[aVar.b((w == null || (c = w.c()) == null) ? null : c.w()).ordinal()];
        if (i == 1) {
            f83 G = G();
            w73 w73Var = G instanceof w73 ? (w73) G : null;
            if (w73Var == null) {
                return;
            }
            w73Var.B(activity);
        } else if (i == 2) {
            f83 G2 = G();
            v73 v73Var = G2 instanceof v73 ? (v73) G2 : null;
            if (v73Var == null) {
                return;
            }
            v73Var.B(activity);
        } else if (i != 3) {
        } else {
            f83 G3 = G();
            n83 n83Var = G3 instanceof n83 ? (n83) G3 : null;
            if (n83Var == null) {
                return;
            }
            n83Var.A(activity);
        }
    }

    public void N() {
        super.k(this);
    }

    public final void O() {
        if (s()) {
            xz2.c(cz2.c(this), c25.C("Already Loading Ad. Rejecting loading current Ad ", this.F.c()));
        } else {
            H();
        }
    }

    public final void P() {
        Activity a2 = x03.s.a();
        if (a2 == null) {
            xz2.d(cz2.c(this), "Failed to show interstitial ad. Use show(Activity activity) instead");
            c();
            return;
        }
        M(a2);
    }

    @Override // com.p7700g.p99005.w83
    public void a(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.g(t23.b.INTERSTITIAL);
    }

    @Override // com.p7700g.p99005.a93
    public void b() {
        this.H.b(new a());
        this.H.notifyObservers();
    }

    @Override // com.p7700g.p99005.w83
    public void c() {
        D().b(j03.FAILED_TO_OPEN);
        D().notifyObservers();
    }

    @Override // com.p7700g.p99005.x83
    public void d() {
        I();
    }

    @Override // com.p7700g.p99005.x83
    public void e() {
        J();
    }

    @Override // com.p7700g.p99005.oc3
    public void j(@NotNull u13 u13Var) {
        c25.p(u13Var, "<set-?>");
        this.G = u13Var;
    }

    @Override // com.p7700g.p99005.oc3
    @NotNull
    public u13 u() {
        return this.G;
    }

    @Override // com.p7700g.p99005.w83
    public void c(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.e(t23.b.INTERSTITIAL);
        K();
    }
}