package com.p7700g.p99005;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o73 {
    @NotNull
    public static final o73 a = new o73();
    @NotNull
    private static final ConcurrentHashMap<String, n73> b = new ConcurrentHashMap<>();

    private o73() {
    }

    @NotNull
    public final n73 a(@NotNull String str) {
        c25.p(str, "unitId");
        ConcurrentHashMap<String, n73> concurrentHashMap = b;
        n73 n73Var = concurrentHashMap.get(str);
        if (n73Var == null) {
            n73 n73Var2 = new n73();
            xz2.c("GGInterstitialImplementationFactory", "Returning new intersitial implementation");
            n73Var2.o();
            concurrentHashMap.put(str, n73Var2);
            return n73Var2;
        }
        xz2.c("GGInterstitialImplementationFactory", "Returning existing intersitial implementation");
        n73Var.o();
        return n73Var;
    }

    public final void b(@NotNull String str) {
        c25.p(str, "unitId");
        b.remove(str);
    }
}