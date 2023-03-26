package com.greedygame.core.rewarded_ad.general;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import com.p7700g.p99005.m23;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.vb3;
import com.p7700g.p99005.wb3;
import com.p7700g.p99005.xb3;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.yq4;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GGRewardedAd implements pz {
    @NotNull
    private final Context s;
    @NotNull
    private String t;
    @NotNull
    private final xb3 u;

    public GGRewardedAd(@NotNull Context context, @NotNull String str) {
        c25.p(context, "context");
        c25.p(str, "unitId");
        this.s = context;
        this.t = str;
        vb3 a = wb3.a.a(str);
        this.u = a;
        a.a(this.t);
        o();
    }

    private final void o() {
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

    public final void e() {
        this.u.m();
    }

    @NotNull
    public final Context f() {
        return this.s;
    }

    @NotNull
    public final String j() {
        return this.t;
    }

    public final boolean k() {
        return this.u.i();
    }

    public final void l() {
        this.u.j();
    }

    public final void m() {
        this.u.k();
    }

    public final void n(@NotNull m23 m23Var) {
        c25.p(m23Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.u.k(m23Var);
    }

    public final void p(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.t = str;
    }

    public final void q() {
        this.u.l();
    }

    public final void r(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.u.a(activity);
    }
}