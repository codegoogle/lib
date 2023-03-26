package com.greedygame.core.signals;

import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.n23;
import com.p7700g.p99005.o23;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class AdRewardSignal extends n23 {
    private final long b;
    @NotNull
    private final String c;
    @NotNull
    private final String d;
    @NotNull
    private final String e;
    @Nullable
    private final String f;
    @Nullable
    private final String g;
    @Nullable
    private final AdUnitMeasurements h;

    public AdRewardSignal() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ AdRewardSignal(long j, String str, String str2, String str3, String str4, String str5, AdUnitMeasurements adUnitMeasurements, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "ad_reward" : str2, (i & 8) != 0 ? o23.a : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? adUnitMeasurements : null);
    }

    @NotNull
    public final String b() {
        return this.e;
    }

    @Nullable
    public final String c() {
        return this.f;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    @Nullable
    public final String e() {
        return this.g;
    }

    @Nullable
    public final AdUnitMeasurements f() {
        return this.h;
    }

    @NotNull
    public final String g() {
        return this.d;
    }

    public final long h() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRewardSignal(@Json(name = "ts") long j, @Json(name = "session_id") @NotNull String str, @Json(name = "status") @NotNull String str2, @Json(name = "advid") @NotNull String str3, @Json(name = "campaign_id") @Nullable String str4, @Json(name = "partner") @Nullable String str5, @Json(name = "stat") @Nullable AdUnitMeasurements adUnitMeasurements) {
        super(str);
        c25.p(str, "currentSessionId");
        c25.p(str2, "status");
        c25.p(str3, "advId");
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = adUnitMeasurements;
    }
}