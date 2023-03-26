package com.p7700g.p99005;

import com.p7700g.p99005.f83;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i83 extends e83 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    public void z() {
        xz2.c(cz2.c(this), "User earned reward");
        n().e();
        for (x83 x83Var : k()) {
            yq4 yq4Var = null;
            a93 a93Var = x83Var instanceof a93 ? (a93) x83Var : null;
            if (a93Var != null) {
                a93Var.b();
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                String c = cz2.c(this);
                StringBuilder G = wo1.G("Unit ");
                G.append(r().c());
                G.append(" is being used in a different format than Rewarded. Please check this.");
                xz2.d(c, G.toString());
            }
        }
    }
}