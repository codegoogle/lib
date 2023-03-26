package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.xu0;

/* compiled from: EventConnectionEndDetailed.java */
/* loaded from: classes2.dex */
public class jg1 extends ig1 {
    private static final float A = -1.0f;
    private float B;

    public jg1() {
        super("connection_end_detailed");
        this.B = -1.0f;
    }

    @x1
    public jg1 V(float f) {
        this.B = f;
        return this;
    }

    @Override // com.p7700g.p99005.ig1, com.p7700g.p99005.hg1, com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle b = super.b();
        float f = this.B;
        if (f != -1.0f) {
            b.putFloat(xu0.f.k, f);
        }
        return b;
    }
}