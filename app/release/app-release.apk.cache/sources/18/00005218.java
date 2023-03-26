package com.p7700g.p99005;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.lc3;
import com.p7700g.p99005.t23;
import com.p7700g.p99005.x03;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nc3 extends oc3 implements w83 {
    @NotNull
    private final n03 F;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.ADMOB_APP_OPEN.ordinal()] = 1;
            iArr[lc3.ADMOB.ordinal()] = 2;
            iArr[lc3.ADMOB_BANNER.ordinal()] = 3;
            iArr[lc3.FACEBOOK_BANNER.ordinal()] = 4;
            iArr[lc3.FACEBOOK.ordinal()] = 5;
            iArr[lc3.S2S_INTERSTITIAL.ordinal()] = 6;
            iArr[lc3.S2S_BANNER.ordinal()] = 7;
            iArr[lc3.S2S.ordinal()] = 8;
            a = iArr;
            u13.values();
            int[] iArr2 = new int[2];
            iArr2[u13.AUTO.ordinal()] = 1;
            iArr2[u13.MANUAL.ordinal()] = 2;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc3(@NotNull n03 n03Var) {
        super(n03Var);
        c25.p(n03Var, "unitConfig");
        this.F = n03Var;
    }

    private final void N() {
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
        int i = a.b[u().ordinal()];
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
        switch (a.a[aVar.b((w == null || (c = w.c()) == null) ? null : c.w()).ordinal()]) {
            case 1:
                f83 G = G();
                q73 q73Var = G instanceof q73 ? (q73) G : null;
                if (q73Var == null) {
                    return;
                }
                q73Var.A(activity);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                p(t23.b.APP_OPEN);
                return;
            case 6:
            case 7:
            case 8:
                J();
                p(t23.b.APP_OPEN);
                return;
            default:
                return;
        }
    }

    public final void M() {
        x03.a aVar = x03.s;
        Activity a2 = aVar == null ? null : aVar.a();
        if (a2 == null) {
            cz2.c(this);
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
        mz2<j03> D = D();
        D.b(j03.FAILED_TO_OPEN);
        D.notifyObservers();
    }

    @Override // com.p7700g.p99005.x83
    public void d() {
        I();
    }

    @Override // com.p7700g.p99005.x83
    public void e() {
        J();
    }

    @Override // com.p7700g.p99005.w83
    public void c(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        super.e(t23.b.INTERSTITIAL);
        N();
    }
}