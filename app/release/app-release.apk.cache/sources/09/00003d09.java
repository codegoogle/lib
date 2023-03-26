package com.p7700g.p99005;

import android.os.SystemClock;

/* compiled from: OSTimeImpl.java */
/* loaded from: classes3.dex */
public class cm3 implements bm3 {
    @Override // com.p7700g.p99005.bm3
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.p7700g.p99005.bm3
    public long b() {
        return System.currentTimeMillis();
    }
}