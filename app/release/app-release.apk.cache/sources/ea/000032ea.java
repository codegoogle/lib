package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class App {
    @NotNull
    private String a;
    private int b;
    @NotNull
    private String c;
    @NotNull
    private String d;
    @Nullable
    private String e;

    public App(@Json(name = "ver") @NotNull String str, @Json(name = "num") int i, @Json(name = "pkg") @NotNull String str2, @Json(name = "eng") @NotNull String str3, @Json(name = "theme") @Nullable String str4) {
        c25.p(str, "ver");
        c25.p(str2, "bundle");
        c25.p(str3, "engine");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    @Nullable
    public final String d() {
        return this.e;
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public final void f(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.c = str;
    }

    public final void g(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.d = str;
    }

    public final void h(int i) {
        this.b = i;
    }

    public final void i(@Nullable String str) {
        this.e = str;
    }

    public final void j(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.a = str;
    }

    public /* synthetic */ App(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? null : str4);
    }
}