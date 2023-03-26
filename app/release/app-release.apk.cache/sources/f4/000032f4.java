package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Geo {
    @Nullable
    private final Float a;
    @Nullable
    private final Float b;
    @Nullable
    private final Float c;
    @Nullable
    private final Float d;

    public Geo() {
        this(null, null, null, null, 15, null);
    }

    public Geo(@Json(name = "lat") @Nullable Float f, @Json(name = "lng") @Nullable Float f2, @Json(name = "lla") @Nullable Float f3, @Json(name = "llf") @Nullable Float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Nullable
    public final Float a() {
        return this.a;
    }

    @Nullable
    public final Float b() {
        return this.c;
    }

    @Nullable
    public final Float c() {
        return this.d;
    }

    @Nullable
    public final Float d() {
        return this.b;
    }

    public /* synthetic */ Geo(Float f, Float f2, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
    }
}