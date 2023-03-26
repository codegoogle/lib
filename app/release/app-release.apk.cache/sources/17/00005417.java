package com.p7700g.p99005;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oa3 {
    @NotNull
    public static final oa3 a = new oa3();
    @NotNull
    private static final String b = "NetUtil";

    private oa3() {
    }

    @NotNull
    public final String a(@NotNull String str) {
        c25.p(str, "key");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String l = h73.a.a().l(str);
        if (TextUtils.isEmpty(l)) {
            return "";
        }
        c25.m(l);
        return l;
    }

    public final void b(@Nullable h93 h93Var) {
        if (h93Var == null || !Boolean.parseBoolean(a("X-Gg-Debug"))) {
            return;
        }
        h93Var.b("X-Gg-Debug", a("X-Gg-Debug"));
    }

    public final boolean c(@NotNull Context context) {
        c25.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}