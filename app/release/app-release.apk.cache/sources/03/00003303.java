package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class User {
    @Nullable
    private String a;
    @Nullable
    private String b;
    @Nullable
    private Integer c;
    @Nullable
    private Integer d;
    @Nullable
    private Integer e;
    @Nullable
    private Integer f;

    public User() {
        this(null, null, null, null, null, null, 63, null);
    }

    public User(@Json(name = "advid") @Nullable String str, @Json(name = "ai5") @Nullable String str2, @Json(name = "dnt") @Nullable Integer num, @Json(name = "consent") @Nullable Integer num2, @Json(name = "coppa") @Nullable Integer num3, @Json(name = "ccpa") @Nullable Integer num4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.f;
    }

    @Nullable
    public final Integer d() {
        return this.d;
    }

    @Nullable
    public final Integer e() {
        return this.e;
    }

    @Nullable
    public final Integer f() {
        return this.c;
    }

    public final void g(@Nullable String str) {
        this.a = str;
    }

    public final void h(@Nullable String str) {
        this.b = str;
    }

    public final void i(@Nullable Integer num) {
        this.f = num;
    }

    public final void j(@Nullable Integer num) {
        this.d = num;
    }

    public final void k(@Nullable Integer num) {
        this.e = num;
    }

    public final void l(@Nullable Integer num) {
        this.c = num;
    }

    public /* synthetic */ User(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}