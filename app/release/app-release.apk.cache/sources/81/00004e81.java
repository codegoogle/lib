package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.xu0;

/* compiled from: EventConnectionStartDetailed.java */
/* loaded from: classes2.dex */
public class lg1 extends kg1 {
    private static final float y = -1.0f;
    private long A;
    private float B;
    @x1
    private String z;

    public lg1() {
        super("connection_start_detailed");
        this.z = "";
        this.A = 0L;
        this.B = -1.0f;
    }

    @x1
    public lg1 R(@x1 String str) {
        this.z = str;
        return this;
    }

    @Override // com.p7700g.p99005.kg1
    @x1
    /* renamed from: S */
    public lg1 Q(long j) {
        this.A = j;
        return this;
    }

    @x1
    public lg1 T(float f) {
        this.B = f;
        return this;
    }

    @Override // com.p7700g.p99005.kg1, com.p7700g.p99005.hg1, com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle b = super.b();
        float f = this.B;
        if (f != -1.0f) {
            b.putFloat(xu0.f.k, f);
        }
        w(b, xu0.f.e, this.z);
        b.putLong("duration", this.A);
        return b;
    }
}