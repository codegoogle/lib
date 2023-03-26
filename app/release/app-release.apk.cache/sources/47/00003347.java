package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Placement {
    @Nullable
    private Position a;
    @NotNull
    private Padding b;
    @Nullable
    private Alignment c;

    public Placement() {
        this(null, null, null, 7, null);
    }

    public Placement(@Nullable Position position, @NotNull Padding padding, @Nullable Alignment alignment) {
        c25.p(padding, "padding");
        this.a = position;
        this.b = padding;
        this.c = alignment;
    }

    @Nullable
    public final Alignment a() {
        return this.c;
    }

    @NotNull
    public final Padding b() {
        return this.b;
    }

    @Nullable
    public final Position c() {
        return this.a;
    }

    public final boolean d() {
        Position position = this.a;
        if (position != null) {
            c25.m(position);
            if (position.i()) {
                return true;
            }
        }
        return false;
    }

    public final void e(@Nullable Alignment alignment) {
        this.c = alignment;
    }

    public final void f(@NotNull Padding padding) {
        c25.p(padding, "<set-?>");
        this.b = padding;
    }

    public final void g(@Nullable Position position) {
        this.a = position;
    }

    public /* synthetic */ Placement(Position position, Padding padding, Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : position, (i & 2) != 0 ? new Padding(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : padding, (i & 4) != 0 ? new Alignment(null, null, 3, null) : alignment);
    }
}