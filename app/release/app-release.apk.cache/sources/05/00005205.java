package com.p7700g.p99005;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes2.dex */
public class na2 implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @x1
    /* renamed from: a */
    public Matrix evaluate(float f, @x1 Matrix matrix, @x1 Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float[] fArr2 = this.a;
            fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
        }
        this.c.setValues(this.b);
        return this.c;
    }
}