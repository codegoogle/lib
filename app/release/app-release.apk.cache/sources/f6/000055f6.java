package com.p7700g.p99005;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.lc3;
import com.p7700g.p99005.t23;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pc3 extends oc3 implements w83 {
    @NotNull
    public static final a F = new a(null);
    private static long G;
    @NotNull
    private final n03 H;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return System.currentTimeMillis() - pc3.G > com.anythink.expressad.video.module.a.a.m.af;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.ADMOB_INTERSTITIAL.ordinal()] = 1;
            iArr[lc3.FACEBOOK_INTERSTITIAL.ordinal()] = 2;
            iArr[lc3.ADMOB.ordinal()] = 3;
            iArr[lc3.ADMOB_BANNER.ordinal()] = 4;
            iArr[lc3.FACEBOOK_BANNER.ordinal()] = 5;
            iArr[lc3.FACEBOOK.ordinal()] = 6;
            iArr[lc3.S2S_VIDEO.ordinal()] = 7;
            iArr[lc3.S2S_INTERSTITIAL.ordinal()] = 8;
            iArr[lc3.S2S_BANNER.ordinal()] = 9;
            iArr[lc3.S2S.ordinal()] = 10;
            a = iArr;
            u13.values();
            int[] iArr2 = new int[2];
            iArr2[u13.AUTO.ordinal()] = 1;
            iArr2[u13.MANUAL.ordinal()] = 2;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc3(@NotNull n03 n03Var) {
        super(n03Var);
        c25.p(n03Var, "unitConfig");
        this.H = n03Var;
    }

    private final void b() {
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
            K();
        } else if (i != 2) {
        } else {
            A().b(new l03());
            A().notifyObservers();
            xz2.c(cz2.c(this), "Ready for Manual Refresh. Notifying Observers");
        }
    }

    public void K() {
        super.k(this);
    }

    public final void L(@NotNull Activity activity) {
        Ad c;
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        lc3.a aVar = lc3.s;
        ia3 w = w();
        switch (b.a[aVar.b((w == null || (c = w.c()) == null) ? null : c.w()).ordinal()]) {
            case 1:
                f83 G2 = G();
                s73 s73Var = G2 instanceof s73 ? (s73) G2 : null;
                if (s73Var == null) {
                    xz2.c(cz2.c(this), "Could not convert to admob mediation base");
                    return;
                } else if (!F.a()) {
                    xz2.d(cz2.c(this), "Cannot show interstitial. Ad is being shown too frequently.");
                    c();
                    zc3 zc3Var = zc3.a;
                    StringBuilder G3 = wo1.G("Policy Violation - ");
                    G3.append(this.H.c());
                    G3.append("- Ads being shown too frequently");
                    zc3Var.a(G3.toString(), "Interstitial ads should be shown after a minimum if 2 user interactions. Otherwise its an Admob Policy Violation", cz2.c(this));
                    return;
                } else {
                    s73Var.A(activity);
                    return;
                }
            case 2:
                f83 G4 = G();
                k83 k83Var = G4 instanceof k83 ? (k83) G4 : null;
                if (k83Var == null) {
                    xz2.c(cz2.c(this), "Could not convert to facebook mediation base");
                    return;
                } else {
                    k83Var.z(activity);
                    return;
                }
            case 3:
            case 4:
            case 5:
            case 6:
                p(t23.b.INTERSTITIAL);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                J();
                p(t23.b.INTERSTITIAL);
                return;
            default:
                return;
        }
    }

    public final void M() {
        if (s()) {
            xz2.c(cz2.c(this), c25.C("Already Loading Ad. Rejecting loading current Ad ", this.H.c()));
        } else {
            H();
        }
    }

    public final void N() {
        Activity a2 = x03.s.a();
        if (a2 == null) {
            xz2.d(cz2.c(this), "Failed to show interstitial ad. Use show(Activity activity) instead");
            c();
            return;
        }
        L(a2);
    }

    @Override // com.p7700g.p99005.w83
    public void a(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.g(t23.b.INTERSTITIAL);
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

    @Override // com.p7700g.p99005.oc3, com.p7700g.p99005.zb3
    public void e(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.e(bVar);
        G = System.currentTimeMillis();
        b();
    }

    @Override // com.p7700g.p99005.w83
    public void c(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.e(t23.b.INTERSTITIAL);
        G = System.currentTimeMillis();
        b();
    }

    @Override // com.p7700g.p99005.x83
    public void e() {
        J();
    }
}