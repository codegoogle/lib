package com.greedygame.core.signals;

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
public final class UiiClickSignal extends n23 {
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

    public UiiClickSignal() {
        this(0L, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ UiiClickSignal(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "uii_click" : str2, (i & 8) != 0 ? o23.a : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null);
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

    @NotNull
    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiiClickSignal(@Json(name = "ts") long j, @Json(name = "session_id") @NotNull String str, @Json(name = "status") @NotNull String str2, @Json(name = "advid") @NotNull String str3, @Json(name = "campaign_id") @Nullable String str4, @Json(name = "partner") @Nullable String str5) {
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
    }
}