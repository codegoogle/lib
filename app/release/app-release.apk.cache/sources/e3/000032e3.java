package com.greedygame.core.interstitial.general;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.adview.general.GGAdview;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import com.p7700g.p99005.i13;
import com.p7700g.p99005.n73;
import com.p7700g.p99005.o73;
import com.p7700g.p99005.p73;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.u13;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.yq4;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class GGInterstitialAd implements pz {
    @NotNull
    private final Context s;
    @NotNull
    private String t;
    @NotNull
    private final p73 u;
    @NotNull
    private u13 v;

    public GGInterstitialAd(@NotNull Context context, @NotNull String str) {
        c25.p(context, "context");
        c25.p(str, "unitId");
        this.s = context;
        this.t = str;
        n73 a = o73.a.a(str);
        this.u = a;
        u13 u13Var = u13.MANUAL;
        this.v = u13Var;
        a.a(this.t);
        r(u13Var);
        q();
    }

    private final u13 k() {
        return this.u.f();
    }

    private final void q() {
        Context context = this.s;
        yq4 yq4Var = null;
        qz qzVar = context instanceof qz ? (qz) context : null;
        if (qzVar != null) {
            xz2.c(cz2.c(this), "Ad is lifecycle aware");
            qzVar.getLifecycle().a(this);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(cz2.c(this), "Ad is not lifecycle aware");
        }
    }

    private final void r(u13 u13Var) {
        String a = GGAdview.s.a();
        StringBuilder G = wo1.G("Changing refresh policy for ");
        G.append(this.u.g());
        G.append(" from ");
        G.append(this.v);
        G.append(" to ");
        G.append(u13Var);
        xz2.c(a, G.toString());
        this.v = u13Var;
        this.u.e(u13Var);
    }

    public final void e() {
        this.u.n();
    }

    @NotNull
    public final p73 f() {
        return this.u;
    }

    @NotNull
    public final Context j() {
        return this.s;
    }

    @NotNull
    public final String l() {
        return this.t;
    }

    public final boolean m() {
        return this.u.j();
    }

    public final void n() {
        this.u.k();
    }

    public final void o() {
        this.u.l();
    }

    public final void p(@NotNull i13 i13Var) {
        c25.p(i13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.u.j(i13Var);
    }

    public final void s(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.t = str;
    }

    public final void t() {
        this.u.m();
    }

    public final void u(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.u.a(activity);
    }
}