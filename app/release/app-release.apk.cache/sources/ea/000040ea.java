package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: HttpException.java */
/* loaded from: classes2.dex */
public final class eq1 extends IOException {
    private static final long s = 1;
    public static final int t = -1;
    private final int u;

    public eq1(int i) {
        this("Http request failed", i);
    }

    public int f() {
        return this.u;
    }

    @Deprecated
    public eq1(String str) {
        this(str, -1);
    }

    public eq1(String str, int i) {
        this(str, i, null);
    }

    public eq1(String str, int i, @z1 Throwable th) {
        super(str + ", status code: " + i, th);
        this.u = i;
    }
}