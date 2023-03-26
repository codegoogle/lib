package com.greedygame.core.signals;

import com.anythink.expressad.videocommon.e.b;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.n23;
import com.p7700g.p99005.o23;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class InstallReferrerSignal extends n23 {
    @NotNull
    private String b;
    @NotNull
    private String c;
    @NotNull
    private String d;
    private long e;
    private long f;
    private boolean g;
    @NotNull
    private final String h;
    private final long i;

    public InstallReferrerSignal() {
        this(null, null, null, 0L, 0L, false, null, 0L, 255, null);
    }

    public /* synthetic */ InstallReferrerSignal(String str, String str2, String str3, long j, long j2, boolean z, String str4, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L, (i & 32) != 0 ? false : z, (i & 64) != 0 ? o23.a : str4, (i & 128) != 0 ? System.currentTimeMillis() : j3);
    }

    @NotNull
    public final String b() {
        return this.h;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.f;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    public final boolean f() {
        return this.g;
    }

    public final long g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    public final long i() {
        return this.i;
    }

    public final void j(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.b = str;
    }

    public final void k(long j) {
        this.f = j;
    }

    public final void l(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.c = str;
    }

    public final void m(boolean z) {
        this.g = z;
    }

    public final void n(long j) {
        this.e = j;
    }

    public final void o(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.d = str;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("url:");
        G.append(this.d);
        G.append("\npackage:");
        G.append(this.c);
        return G.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerSignal(@Json(name = "app_id") @NotNull String str, @Json(name = "pkg") @NotNull String str2, @Json(name = "ref_url") @NotNull String str3, @Json(name = "ref_clk_time") long j, @Json(name = "install_time") long j2, @Json(name = "instant_exp") boolean z, @Json(name = "advid") @NotNull String str4, @Json(name = "ts") long j3) {
        super(null, 1, null);
        c25.p(str, b.u);
        c25.p(str2, "appPackage");
        c25.p(str3, "referrerUrl");
        c25.p(str4, "advId");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = str4;
        this.i = j3;
    }
}