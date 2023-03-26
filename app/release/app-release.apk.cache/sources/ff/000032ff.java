package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Screen {
    private final int a;
    private final int b;
    private final float c;
    @Nullable
    private final Float d;

    public Screen(@Json(name = "h") int i, @Json(name = "w") int i2, @Json(name = "d") float f, @Json(name = "di") @Nullable Float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    public final float a() {
        return this.c;
    }

    @Nullable
    public final Float b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public /* synthetic */ Screen(int i, int i2, float f, Float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, (i3 & 8) != 0 ? null : f2);
    }
}