package com.greedygame.mystique.models;

import com.p7700g.p99005.dy2;
import com.p7700g.p99005.z23;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Position {
    private final float a;
    private final float b;
    private float c;
    private float d;

    public Position(@Json(name = "x") float f, @Json(name = "y") float f2, @Json(name = "width") float f3, @Json(name = "height") float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return dy2.c(z23.a.a(), this.d, 2.0f);
    }

    public final float b() {
        return this.d;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.b;
    }

    public final float f() {
        return dy2.c(z23.a.a(), this.c, 2.0f);
    }

    public final float g() {
        return dy2.c(z23.a.a(), this.a, 2.0f);
    }

    public final float h() {
        return dy2.c(z23.a.a(), this.b, 2.0f);
    }

    public final boolean i() {
        if (!(this.c == 0.0f)) {
            if (!(this.d == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final void j(float f) {
        this.d = f;
    }

    public final void k(float f) {
        this.c = f;
    }
}