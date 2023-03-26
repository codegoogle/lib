package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eb3 implements db3 {
    @NotNull
    private final Number a;

    public eb3(@NotNull Number number) {
        c25.p(number, "content");
        this.a = number;
    }

    @Override // com.p7700g.p99005.db3
    @NotNull
    public Object a() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return this.a.toString();
    }
}