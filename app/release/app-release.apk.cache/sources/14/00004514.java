package com.p7700g.p99005;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import com.p7700g.p99005.pp3;

/* compiled from: ScaleDownAnimation.java */
/* loaded from: classes3.dex */
public class gq3 extends fq3 {
    public gq3(@x1 pp3.a aVar) {
        super(aVar);
    }

    @Override // com.p7700g.p99005.fq3
    @x1
    public PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.q;
            i = (int) (i2 * this.r);
            str = fq3.o;
        } else {
            i = this.q;
            i2 = (int) (i * this.r);
            str = fq3.p;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}