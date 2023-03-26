package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* compiled from: KeyFrameInterpolator.java */
/* loaded from: classes2.dex */
public class n12 implements Interpolator {
    private TimeInterpolator a;
    private float[] b;

    public n12(TimeInterpolator timeInterpolator, float... fArr) {
        this.a = timeInterpolator;
        this.b = fArr;
    }

    public static n12 a(float... fArr) {
        n12 n12Var = new n12(m12.a(), new float[0]);
        n12Var.c(fArr);
        return n12Var;
    }

    public static n12 b(float f, float f2, float f3, float f4, float... fArr) {
        n12 n12Var = new n12(o12.b(f, f2, f3, f4), new float[0]);
        n12Var.c(fArr);
        return n12Var;
    }

    public void c(float... fArr) {
        this.b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.b.length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f2 = fArr[i];
                i++;
                float f3 = fArr[i];
                float f4 = f3 - f2;
                if (f >= f2 && f <= f3) {
                    return (this.a.getInterpolation((f - f2) / f4) * f4) + f2;
                }
            }
        }
        return this.a.getInterpolation(f);
    }
}