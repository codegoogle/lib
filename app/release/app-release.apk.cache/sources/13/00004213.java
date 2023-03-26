package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fb3 implements db3 {
    @NotNull
    private final String a;

    public fb3(@NotNull String str) {
        c25.p(str, "content");
        this.a = str;
    }

    @Override // com.p7700g.p99005.db3
    @NotNull
    public Object a() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return this.a;
    }
}