package com.p7700g.p99005;

import android.graphics.Color;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l33 {
    @NotNull
    public static final l33 a = new l33();

    private l33() {
    }

    public final boolean a(@NotNull String str) {
        c25.p(str, "color");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Color.parseColor(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}