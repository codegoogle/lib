package com.greedygame.core.signals;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.n23;
import com.p7700g.p99005.o23;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class AdAvailableSignal extends n23 {
    private final long b;
    @NotNull
    private final String c;
    @NotNull
    private final String d;
    @NotNull
    private final String e;
    @NotNull
    private final String f;

    public /* synthetic */ AdAvailableSignal(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "ad_avail" : str2, (i & 8) != 0 ? o23.a : str3, str4);
    }

    @NotNull
    public final String b() {
        return this.e;
    }

    @NotNull
    public final String c() {
        return this.f;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    @NotNull
    public final String e() {
        return this.d;
    }

    public final long f() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdAvailableSignal(@Json(name = "ts") long j, @Json(name = "session_id") @NotNull String str, @Json(name = "status") @NotNull String str2, @Json(name = "advid") @NotNull String str3, @Json(name = "campaign_id") @NotNull String str4) {
        super(str);
        c25.p(str, "currentSessionId");
        c25.p(str2, "status");
        c25.p(str3, "advId");
        c25.p(str4, "campaignId");
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}