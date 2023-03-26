package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;

/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes3.dex */
public final class og2 extends ag2 {
    public int g;
    public int h;
    public boolean i;

    public og2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.fa);
    }

    @Override // com.p7700g.p99005.ag2
    public void e() {
        if (this.g == 0) {
            if (this.b <= 0) {
                if (this.c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public og2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        this(context, attributeSet, i, ng2.Q);
    }

    public og2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(context, attributeSet, i, i2);
        TypedArray j = cf2.j(context, attributeSet, ga2.o.Ck, ga2.c.fa, ng2.Q, new int[0]);
        this.g = j.getInt(ga2.o.Dk, 1);
        this.h = j.getInt(ga2.o.Ek, 0);
        j.recycle();
        e();
        this.i = this.h == 1;
    }
}