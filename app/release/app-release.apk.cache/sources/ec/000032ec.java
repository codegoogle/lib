package com.greedygame.core.models.core;

import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.c25;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class BidModel {
    @NotNull
    private final User a;
    @NotNull
    private final App b;
    @NotNull
    private final Sdk c;
    @Nullable
    private final Geo d;
    @NotNull
    private final Device e;
    @Nullable
    private String f;
    @NotNull
    private transient String g;
    @NotNull
    private transient String h;

    public BidModel(@Json(name = "usr") @NotNull User user, @Json(name = "app") @NotNull App app, @Json(name = "sdk") @NotNull Sdk sdk, @Json(name = "geo") @Nullable Geo geo, @Json(name = "dvc") @NotNull Device device, @Json(name = "session_id") @Nullable String str) {
        c25.p(user, "user");
        c25.p(app, "app");
        c25.p(sdk, "sdk");
        c25.p(device, AbstractLog.DEVICE);
        this.a = user;
        this.b = app;
        this.c = sdk;
        this.d = geo;
        this.e = device;
        this.f = str;
        this.g = "";
        this.h = "";
    }

    @NotNull
    public final App a() {
        return this.b;
    }

    @NotNull
    public final String b() {
        return this.g;
    }

    @NotNull
    public final Device c() {
        return this.e;
    }

    @Nullable
    public final Geo d() {
        return this.d;
    }

    @NotNull
    public final Sdk e() {
        return this.c;
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @NotNull
    public final String g() {
        return this.h;
    }

    @NotNull
    public final User h() {
        return this.a;
    }

    public final void i(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.g = str;
    }

    public final void j(@Nullable String str) {
        this.f = str;
    }

    public final void k(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.h = str;
    }

    public /* synthetic */ BidModel(User user, App app, Sdk sdk, Geo geo, Device device, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, app, sdk, (i & 8) != 0 ? null : geo, device, (i & 32) != 0 ? null : str);
    }
}