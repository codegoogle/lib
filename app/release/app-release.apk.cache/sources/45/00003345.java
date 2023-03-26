package com.greedygame.mystique.models;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Padding {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public Padding() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public Padding(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public /* synthetic */ Padding(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}