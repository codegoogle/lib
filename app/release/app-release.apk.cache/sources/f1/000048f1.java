package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: Preconditions.java */
/* loaded from: classes3.dex */
public final class ip2 {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}