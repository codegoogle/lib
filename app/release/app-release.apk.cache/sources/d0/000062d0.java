package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum w13 {
    LIGHT("light"),
    DARK("dark");
    
    @NotNull
    private final String v;

    w13(String str) {
        this.v = str;
    }

    @NotNull
    public final String g() {
        return this.v;
    }
}