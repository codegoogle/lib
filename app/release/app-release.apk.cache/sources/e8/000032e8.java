package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Admob {
    @NotNull
    private String a;

    public Admob(@Json(name = "ver") @NotNull String str) {
        c25.p(str, "ver");
        this.a = str;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void b(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.a = str;
    }
}