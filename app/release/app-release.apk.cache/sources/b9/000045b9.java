package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h23<T> {
    @Nullable
    private final T a;
    private final int b;
    private final boolean c;
    @Nullable
    private String d;

    public h23(@Nullable T t, int i, boolean z) {
        this.a = t;
        this.b = i;
        this.c = z;
        this.d = null;
    }

    @Nullable
    public final T a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public h23(@Nullable String str, int i, boolean z) {
        this.a = null;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public /* synthetic */ h23(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "Unknown error" : str, i, z);
    }
}