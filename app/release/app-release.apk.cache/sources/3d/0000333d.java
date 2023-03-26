package com.greedygame.mystique.models;

import com.p7700g.p99005.jz2;
import com.p7700g.p99005.kz2;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Alignment {
    @Nullable
    private final jz2 a;
    @Nullable
    private final kz2 b;

    public Alignment() {
        this(null, null, 3, null);
    }

    public Alignment(@Nullable jz2 jz2Var, @Nullable kz2 kz2Var) {
        this.a = jz2Var;
        this.b = kz2Var;
    }

    @Nullable
    public final jz2 a() {
        return this.a;
    }

    @Nullable
    public final kz2 b() {
        return this.b;
    }

    public /* synthetic */ Alignment(jz2 jz2Var, kz2 kz2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? jz2.CENTER : jz2Var, (i & 2) != 0 ? kz2.CENTER : kz2Var);
    }
}