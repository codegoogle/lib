package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Carrier {
    @Nullable
    private String a;
    @Nullable
    private String b;

    public Carrier() {
        this(null, null, 3, null);
    }

    public Carrier(@Json(name = "name") @Nullable String str, @Json(name = "cr") @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }

    @Nullable
    public final String a() {
        return this.b;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public final void c(@Nullable String str) {
        this.b = str;
    }

    public final void d(@Nullable String str) {
        this.a = str;
    }

    public /* synthetic */ Carrier(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}