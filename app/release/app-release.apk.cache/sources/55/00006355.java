package com.p7700g.p99005;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wb3 {
    @NotNull
    public static final wb3 a = new wb3();
    @NotNull
    private static final ConcurrentHashMap<String, vb3> b = new ConcurrentHashMap<>();

    private wb3() {
    }

    @NotNull
    public final vb3 a(@NotNull String str) {
        c25.p(str, "unitId");
        ConcurrentHashMap<String, vb3> concurrentHashMap = b;
        vb3 vb3Var = concurrentHashMap.get(str);
        if (vb3Var == null) {
            vb3 vb3Var2 = new vb3();
            xz2.c(cz2.c(a), "Returning new rewarded implementation");
            vb3Var2.n();
            concurrentHashMap.put(str, vb3Var2);
            return vb3Var2;
        }
        xz2.c(cz2.c(a), "Returning existing rewarded implementation");
        vb3Var.n();
        return vb3Var;
    }

    public final void b(@NotNull String str) {
        c25.p(str, "unitId");
        b.remove(str);
    }
}