package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class a {
    private static long a;
    private static long b;
    private static long c;

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0064a {
        private static a a = new a((byte) 0);

        private C0064a() {
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public static a a() {
        return C0064a.a;
    }

    public static long b() {
        return b;
    }

    private synchronized void c() {
        if (a == 0) {
            a = SystemClock.elapsedRealtime();
            c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        if (a != 0 && c != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - a;
            if (elapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - c) * 1000) / elapsedRealtime;
                        if (totalRxBytes == 0) {
                            b = 1L;
                        } else {
                            b = totalRxBytes;
                        }
                    } else {
                        b = 0L;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            e();
        }
    }

    private synchronized void e() {
        c = 0L;
        a = 0L;
    }

    private a() {
    }
}