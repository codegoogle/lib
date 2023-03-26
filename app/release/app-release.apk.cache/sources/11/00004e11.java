package com.p7700g.p99005;

import android.os.Trace;

/* compiled from: TraceApi29Impl.java */
@e2(29)
/* loaded from: classes.dex */
public final class l70 {
    private l70() {
    }

    public static void a(@x1 String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(@x1 String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static void c(@x1 String str, int i) {
        Trace.setCounter(str, i);
    }
}