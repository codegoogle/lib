package com.p7700g.p99005;

import com.p7700g.p99005.tz2;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sa3 {
    @NotNull
    private static final String a = "https://api.greedygame.com/";
    @NotNull
    private static final String b = c25.C(a(), "v4/bid/");
    @NotNull
    private static final String c;
    @NotNull
    private static final String d;
    @NotNull
    private static final String e;
    @NotNull
    private static final String f;
    @NotNull
    private static final String g;

    static {
        String C = c25.C(a(), "v4/signals/");
        c = C;
        d = c25.C(C, "adstat");
        e = c25.C(C, "crash");
        f = c25.C(C, "anr");
        g = c25.C(a(), "v3/install-tracking/track");
    }

    @NotNull
    public static final String a() {
        tz2.a aVar = tz2.a;
        String str = a;
        String a2 = aVar.a("debug.greedygame.sdkx.base.url", str);
        if (a2 == null) {
            a2 = str;
        }
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = a2.toLowerCase();
        c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
        if (c25.g(lowerCase, "default")) {
            return str;
        }
        xz2.c("CONSTANTS", "Using base url specified via adb");
        return a2;
    }

    @NotNull
    public static final String b() {
        return b;
    }

    @NotNull
    public static final String c() {
        return d;
    }

    @NotNull
    public static final String d() {
        return e;
    }

    @NotNull
    public static final String e() {
        return f;
    }

    @NotNull
    public static final String f() {
        return g;
    }
}