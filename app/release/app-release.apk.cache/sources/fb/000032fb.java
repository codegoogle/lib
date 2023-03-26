package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Os {
    @Nullable
    private String a;
    @Nullable
    private String b;
    @Nullable
    private String c;
    @Nullable
    private Integer d;

    public Os() {
        this(null, null, null, null, 15, null);
    }

    public Os(@Json(name = "pltfrm") @Nullable String str, @Json(name = "ver") @Nullable String str2, @Json(name = "num") @Nullable String str3, @Json(name = "apilvl") @Nullable Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    @Nullable
    public final Integer a() {
        return this.d;
    }

    @Nullable
    public final String b() {
        return this.c;
    }

    @Nullable
    public final String c() {
        return this.a;
    }

    @Nullable
    public final String d() {
        return this.b;
    }

    public final void e(@Nullable Integer num) {
        this.d = num;
    }

    public final void f(@Nullable String str) {
        this.c = str;
    }

    public final void g(@Nullable String str) {
        this.a = str;
    }

    public final void h(@Nullable String str) {
        this.b = str;
    }

    public /* synthetic */ Os(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}