package com.p7700g.p99005;

/* compiled from: SystemClock.java */
/* loaded from: classes3.dex */
public class ns2 implements ms2 {
    private static ns2 a;

    private ns2() {
    }

    public static ns2 a() {
        if (a == null) {
            a = new ns2();
        }
        return a;
    }

    @Override // com.p7700g.p99005.ms2
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}