package com.p7700g.p99005;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TestClock.java */
/* loaded from: classes2.dex */
public class x92 implements v92 {
    private final AtomicLong a;

    public x92(long j) {
        this.a = new AtomicLong(j);
    }

    @Override // com.p7700g.p99005.v92
    public long a() {
        return this.a.get();
    }

    public void b(long j) {
        if (j >= 0) {
            this.a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    public void c() {
        b(1L);
    }
}