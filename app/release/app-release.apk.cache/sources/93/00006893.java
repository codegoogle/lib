package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: SneakyThrow.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class z50 {
    private z50() {
    }

    public static void a(@x1 Exception exc) {
        b(exc);
    }

    private static <E extends Throwable> void b(@x1 Throwable th) throws Throwable {
        throw th;
    }
}