package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: $Gson$Preconditions.java */
/* loaded from: classes3.dex */
public final class qw2 {
    private qw2() {
        throw new UnsupportedOperationException();
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}