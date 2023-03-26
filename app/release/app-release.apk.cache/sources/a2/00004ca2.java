package com.p7700g.p99005;

import android.os.Bundle;

/* compiled from: EventConnectionStart.java */
/* loaded from: classes2.dex */
public class kg1 extends hg1 {
    private long x;

    public kg1() {
        this("connection_start");
    }

    public long P() {
        return this.x;
    }

    @x1
    public kg1 Q(long j) {
        this.x = j;
        return this;
    }

    @Override // com.p7700g.p99005.hg1, com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle b = super.b();
        b.putLong("duration", this.x);
        return b;
    }

    public kg1(@x1 String str) {
        super(str);
        this.x = 0L;
    }
}