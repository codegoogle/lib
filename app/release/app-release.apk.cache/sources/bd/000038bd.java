package com.p7700g.p99005;

import com.greedygame.core.GreedyGameAds;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ad3 {
    @NotNull
    public static final ad3 a = new ad3();
    @NotNull
    private static final String b = "androidx.constraintlayout.widget.ConstraintLayout";
    @NotNull
    private static final String c = "com.squareup.moshi.Moshi";

    private ad3() {
    }

    private final boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            xz2.d(GreedyGameAds.b, "[ERROR] " + str + " not found. Please check documentation and include the dependency");
            return false;
        }
    }

    private final boolean c() {
        return b(b);
    }

    private final boolean d() {
        return b(c);
    }

    public final boolean a() {
        return c() && d();
    }
}