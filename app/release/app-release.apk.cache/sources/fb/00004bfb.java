package com.p7700g.p99005;

import android.os.Trace;

/* compiled from: TraceApi18Impl.java */
@e2(18)
/* loaded from: classes.dex */
public final class k70 {
    private k70() {
    }

    public static void a(@x1 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}