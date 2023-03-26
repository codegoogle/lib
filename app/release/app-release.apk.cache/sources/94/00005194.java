package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class n23 {
    @Nullable
    private final String a;

    public n23() {
        this(null, 1, null);
    }

    public n23(@Nullable String str) {
        this.a = str;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    public /* synthetic */ n23(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}