package com.p7700g.p99005;

import android.animation.TypeEvaluator;

/* compiled from: FloatArrayEvaluator.java */
/* loaded from: classes.dex */
public class y70 implements TypeEvaluator<float[]> {
    private float[] a;

    public y70(float[] fArr) {
        this.a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = wo1.a(fArr2[i], f2, f, f2);
        }
        return fArr3;
    }
}