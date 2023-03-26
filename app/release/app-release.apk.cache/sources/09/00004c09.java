package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PatternPathMotion.java */
/* loaded from: classes.dex */
public class k80 extends i80 {
    private Path a;
    private final Path b;
    private final Matrix c;

    public k80() {
        Path path = new Path();
        this.b = path;
        this.c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.a = path;
    }

    private static float b(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    @Override // com.p7700g.p99005.i80
    public Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = b(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.c.setScale(b, b);
        this.c.postRotate((float) Math.toDegrees(atan2));
        this.c.postTranslate(f, f2);
        Path path = new Path();
        this.b.transform(this.c, path);
        return path;
    }

    public Path c() {
        return this.a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / b(f5, f6);
        this.c.postScale(b, b);
        this.c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.c, this.b);
        this.a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public k80(Context context, AttributeSet attributeSet) {
        this.b = new Path();
        this.c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.k);
        try {
            String m = ri.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                d(mj.e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public k80(Path path) {
        this.b = new Path();
        this.c = new Matrix();
        d(path);
    }
}