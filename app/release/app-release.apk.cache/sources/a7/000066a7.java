package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum y33 {
    ADMOB("admob"),
    MOPUB("mopub"),
    FACEBOOK("fan");
    
    @NotNull
    private final String w;

    y33(String str) {
        this.w = str;
    }

    @NotNull
    public final String g() {
        return this.w;
    }
}