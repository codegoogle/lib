package com.greedygame.core.signals;

import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
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
public final class MediationLoadedSignal extends n23 {
    private final long b;
    @NotNull
    private final String c;
    @NotNull
    private final String d;
    @NotNull
    private final String e;
    @NotNull
    private final Ad f;
    @Nullable
    private final Partner g;
    @Nullable
    private final String h;

    public MediationLoadedSignal() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ MediationLoadedSignal(long j, String str, String str2, String str3, Ad ad, Partner partner, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "mediation_ad_loaded" : str2, (i & 8) != 0 ? o23.a : str3, (i & 16) != 0 ? Ad.s.a() : ad, (i & 32) != 0 ? null : partner, (i & 64) == 0 ? str4 : null);
    }

    @NotNull
    public final String b() {
        return this.e;
    }

    @Nullable
    public final String c() {
        return this.h;
    }

    @NotNull
    public final Ad d() {
        return this.f;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    @Nullable
    public final Partner f() {
        return this.g;
    }

    @NotNull
    public final String g() {
        return this.d;
    }

    public final long h() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationLoadedSignal(@Json(name = "ts") long j, @Json(name = "session_id") @NotNull String str, @Json(name = "status") @NotNull String str2, @Json(name = "advid") @NotNull String str3, @Json(name = "ad") @NotNull Ad ad, @Json(name = "partner") @Nullable Partner partner, @Json(name = "campaign_id") @Nullable String str4) {
        super(str);
        c25.p(str, "currentSessionId");
        c25.p(str2, "status");
        c25.p(str3, "advId");
        c25.p(ad, "currentAd");
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ad;
        this.g = partner;
        this.h = str4;
    }
}