package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h93 {
    @NotNull
    private final HashMap<String, String> a = new HashMap<>();

    @NotNull
    public final HashMap<String, String> a() {
        return this.a;
    }

    public final void b(@NotNull String str, @NotNull String str2) {
        c25.p(str, "key");
        c25.p(str2, "value");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final void c() {
        this.a.clear();
    }
}