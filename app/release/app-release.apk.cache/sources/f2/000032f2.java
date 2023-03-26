package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Fb {
    @Nullable
    private final String a;

    public Fb() {
        this(null, 1, null);
    }

    public Fb(@Json(name = "ver") @Nullable String str) {
        this.a = str;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    public /* synthetic */ Fb(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}