package com.greedygame.core.models.core;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Device {
    @Nullable
    private Os a;
    @Nullable
    private String b;
    @Nullable
    private String c;
    @Nullable
    private Screen d;
    @Nullable
    private String e;
    @Nullable
    private Integer f;

    public Device() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Device(@Json(name = "os") @Nullable Os os, @Json(name = "maker") @Nullable String str, @Json(name = "model") @Nullable String str2, @Json(name = "scrn") @Nullable Screen screen, @Json(name = "locale") @Nullable String str3, @Json(name = "hni") @Nullable Integer num) {
        this.a = os;
        this.b = str;
        this.c = str2;
        this.d = screen;
        this.e = str3;
        this.f = num;
    }

    @Nullable
    public final Integer a() {
        return this.f;
    }

    @Nullable
    public final String b() {
        return this.e;
    }

    @Nullable
    public final String c() {
        return this.b;
    }

    @Nullable
    public final String d() {
        return this.c;
    }

    @Nullable
    public final Os e() {
        return this.a;
    }

    @Nullable
    public final Screen f() {
        return this.d;
    }

    public final void g(@Nullable Integer num) {
        this.f = num;
    }

    public final void h(@Nullable String str) {
        this.e = str;
    }

    public final void i(@Nullable String str) {
        this.b = str;
    }

    public final void j(@Nullable String str) {
        this.c = str;
    }

    public final void k(@Nullable Os os) {
        this.a = os;
    }

    public final void l(@Nullable Screen screen) {
        this.d = screen;
    }

    public /* synthetic */ Device(Os os, String str, String str2, Screen screen, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : os, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : screen, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num);
    }
}