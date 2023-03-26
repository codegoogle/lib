package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorDonut.java */
/* loaded from: classes2.dex */
public class r12 implements Interpolator {
    private static final float a = 0.002f;
    private final float[] b;
    private final float[] c;

    public r12(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.b = new float[i];
        this.c = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.b[i2] = fArr[0];
            this.c[i2] = fArr[1];
        }
    }

    private static Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    private static Path b(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.b.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.b[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.b;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.c[i];
        }
        float[] fArr2 = this.c;
        float f3 = fArr2[i];
        return wo1.a(fArr2[length], f3, (f - fArr[i]) / f2, f3);
    }

    public r12(float f, float f2) {
        this(b(f, f2));
    }

    public r12(float f, float f2, float f3, float f4) {
        this(a(f, f2, f3, f4));
    }
}