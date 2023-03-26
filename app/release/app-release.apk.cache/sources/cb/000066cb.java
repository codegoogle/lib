package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.f83;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class y73 extends i83 {
    @NotNull
    private final h73 o;
    @NotNull
    private final c03 p;
    @NotNull
    private final String q;
    @NotNull
    private final String r;
    @NotNull
    private final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
        this.o = h73Var;
        this.p = aVar.v();
        this.q = "rdp";
        this.r = "IABUSPrivacy_String";
        this.s = "1NYY";
    }

    @NotNull
    public final Bundle A() {
        Bundle bundle = new Bundle();
        bundle.putString("npa", this.p.c() ? "1" : "0");
        bundle.putString("gg_npa", this.p.c() ? "1" : "0");
        bundle.putString("gg_app_id", this.o.j());
        bundle.putString("gg_bundle", this.o.l("bundle"));
        bundle.putString("gg_request_id", n().B());
        bundle.putString("gg_placement_id", j().j());
        if (this.p.a()) {
            bundle.putInt(this.q, 1);
            bundle.putString(this.r, this.s);
        }
        xz2.c(cz2.c(this), c25.C("Admob Bundle values: ", bundle));
        return bundle;
    }
}