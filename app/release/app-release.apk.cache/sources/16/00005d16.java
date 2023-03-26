package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: classes2.dex */
public final class t02 {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    private t02() {
    }

    public static double a(long j) {
        return (b() - j) * a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}