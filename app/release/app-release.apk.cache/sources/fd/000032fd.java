package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Play {
    @NotNull
    private final String a;

    public Play() {
        this(null, 1, null);
    }

    public Play(@Json(name = "ver") @NotNull String str) {
        c25.p(str, "ver");
        this.a = str;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public /* synthetic */ Play(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}