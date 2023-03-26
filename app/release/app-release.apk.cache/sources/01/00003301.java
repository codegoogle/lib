package com.greedygame.core.models.core;

import com.p7700g.p99005.c25;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Sdk {
    private int a;
    @NotNull
    private String b;
    @Nullable
    private Admob c;
    @Nullable
    private Mopub d;
    @Nullable
    private Fb e;
    @Nullable
    private Play f;

    public Sdk(@Json(name = "num") int i, @Json(name = "ver") @NotNull String str, @Json(name = "admob") @Nullable Admob admob, @Json(name = "mopub") @Nullable Mopub mopub, @Json(name = "fb") @Nullable Fb fb, @Json(name = "play") @Nullable Play play) {
        c25.p(str, "ver");
        this.a = i;
        this.b = str;
        this.c = admob;
        this.d = mopub;
        this.e = fb;
        this.f = play;
    }

    @Nullable
    public final Admob a() {
        return this.c;
    }

    @Nullable
    public final Fb b() {
        return this.e;
    }

    @Nullable
    public final Mopub c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    @Nullable
    public final Play e() {
        return this.f;
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    public final void g(@Nullable Admob admob) {
        this.c = admob;
    }

    public final void h(@Nullable Fb fb) {
        this.e = fb;
    }

    public final void i(@Nullable Mopub mopub) {
        this.d = mopub;
    }

    public final void j(int i) {
        this.a = i;
    }

    public final void k(@Nullable Play play) {
        this.f = play;
    }

    public final void l(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.b = str;
    }

    public /* synthetic */ Sdk(int i, String str, Admob admob, Mopub mopub, Fb fb, Play play, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : admob, (i2 & 8) != 0 ? null : mopub, (i2 & 16) != 0 ? null : fb, (i2 & 32) != 0 ? null : play);
    }
}