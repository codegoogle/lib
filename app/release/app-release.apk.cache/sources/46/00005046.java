package com.p7700g.p99005;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mc3 {
    @NotNull
    public static final mc3 a = new mc3();
    @NotNull
    private static final ConcurrentHashMap<String, oc3> b = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            k03.values();
            int[] iArr = new int[4];
            iArr[k03.REWARDED.ordinal()] = 1;
            iArr[k03.INTERSTITIAL.ordinal()] = 2;
            iArr[k03.NATIVE_OR_BANNER.ordinal()] = 3;
            iArr[k03.APP_OPEN.ordinal()] = 4;
            a = iArr;
        }
    }

    private mc3() {
    }

    private final oc3 b(n03 n03Var) {
        oc3 rc3Var;
        int i = a.a[n03Var.i().ordinal()];
        if (i == 1) {
            rc3Var = new rc3(n03Var);
        } else if (i == 2) {
            rc3Var = new pc3(n03Var);
        } else if (i == 3) {
            rc3Var = new qc3(n03Var);
        } else if (i != 4) {
            throw new wo4();
        } else {
            rc3Var = new nc3(n03Var);
        }
        b.put(n03Var.c(), rc3Var);
        String c = cz2.c(this);
        StringBuilder G = wo1.G("New Controller ");
        G.append(n03Var.c());
        G.append(" - ");
        G.append(rc3Var.hashCode());
        xz2.c(c, G.toString());
        return rc3Var;
    }

    @NotNull
    public final oc3 a(@NotNull n03 n03Var) {
        c25.p(n03Var, "unitConfig");
        oc3 oc3Var = b.get(n03Var.c());
        if (oc3Var == null) {
            return b(n03Var);
        }
        String c = cz2.c(this);
        StringBuilder G = wo1.G("Old Controller ");
        G.append(n03Var.c());
        G.append(" - ");
        G.append(oc3Var.hashCode());
        xz2.c(c, G.toString());
        return oc3Var;
    }
}