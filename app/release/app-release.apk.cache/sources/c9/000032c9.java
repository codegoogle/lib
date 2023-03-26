package com.greedygame.core.ad.models;

import com.p7700g.p99005.h73;
import com.p7700g.p99005.z85;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class AdUnitMeasurements {
    @Nullable
    private Integer a;
    @Nullable
    private Integer b;
    @Nullable
    private Long c;
    @Nullable
    private Long d;
    @Nullable
    private Boolean e;
    @Nullable
    private Long f;
    @Nullable
    private Double g;

    public AdUnitMeasurements() {
        this(null, null, null, null, null, null, 63, null);
    }

    public AdUnitMeasurements(@Json(name = "h") @Nullable Integer num, @Json(name = "w") @Nullable Integer num2, @Json(name = "render_t") @Nullable Long l, @Json(name = "inflate_t") @Nullable Long l2, @Json(name = "dflt_tmplt") @Nullable Boolean bool, @Json(name = "imp_t") @Nullable Long l3) {
        this.a = num;
        this.b = num2;
        this.c = l;
        this.d = l2;
        this.e = bool;
        this.f = l3;
    }

    @Json(name = "d")
    public static /* synthetic */ void getScreeDensity$annotations() {
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final Long c() {
        return this.d;
    }

    @Nullable
    public final Double d() {
        String l = h73.a.a().l("d");
        if (l == null) {
            return null;
        }
        return z85.H0(l);
    }

    @Nullable
    public final Long e() {
        return this.f;
    }

    @Nullable
    public final Long f() {
        return this.c;
    }

    @Nullable
    public final Boolean g() {
        return this.e;
    }

    public final void h() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
    }

    public final void i(@Nullable Integer num) {
        this.a = num;
    }

    public final void j(@Nullable Integer num) {
        this.b = num;
    }

    public final void k(@Nullable Boolean bool) {
        this.e = bool;
    }

    public final void l(@Nullable Long l) {
        this.d = l;
    }

    public final void m(@Nullable Double d) {
        this.g = d;
    }

    public final void n(@Nullable Long l) {
        this.f = l;
    }

    public final void o(@Nullable Long l) {
        this.c = l;
    }

    public /* synthetic */ AdUnitMeasurements(Integer num, Integer num2, Long l, Long l2, Boolean bool, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l3);
    }
}