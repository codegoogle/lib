package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.p7700g.p99005.i2;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ea0 implements Interpolator {
    private static final float a = 0.002f;
    public static final int b = 3000;
    public static final double c = 1.0E-5d;
    private float[] d;
    private float[] e;

    public ea0(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.d = new float[min];
            this.e = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.d[i2] = fArr[0];
                this.e[i2] = fArr[1];
            }
            if (Math.abs(this.d[0]) <= 1.0E-5d && Math.abs(this.e[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.d[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.e[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.d;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder G = wo1.G("The Path must start at (0,0) and end at (1,1) start: ");
            G.append(this.d[0]);
            G.append(",");
            G.append(this.e[0]);
            G.append(" end:");
            int i6 = min - 1;
            G.append(this.d[i6]);
            G.append(",");
            G.append(this.e[i6]);
            throw new IllegalArgumentException(G.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (ri.r(xmlPullParser, "pathData")) {
            String m = ri.m(typedArray, xmlPullParser, "pathData", 4);
            Path e = mj.e(m);
            if (e != null) {
                b(e);
                return;
            }
            throw new InflateException(wo1.t("The path is null, which is created from ", m));
        } else if (ri.r(xmlPullParser, "controlX1")) {
            if (ri.r(xmlPullParser, "controlY1")) {
                float j = ri.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float j2 = ri.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean r = ri.r(xmlPullParser, "controlX2");
                if (r != ri.r(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!r) {
                    c(j, j2);
                    return;
                } else {
                    a(j, j2, ri.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), ri.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
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
        int length = this.d.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.d[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.d;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.e[i];
        }
        float[] fArr2 = this.e;
        float f3 = fArr2[i];
        return wo1.a(fArr2[length], f3, (f - fArr[i]) / f2, f3);
    }

    public ea0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = ri.s(resources, theme, attributeSet, y90.r0);
        d(s, xmlPullParser);
        s.recycle();
    }
}