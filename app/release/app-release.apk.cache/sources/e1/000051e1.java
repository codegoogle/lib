package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ArcMotion.java */
/* loaded from: classes.dex */
public class n70 extends i80 {
    private static final float a = 0.0f;
    private static final float b = 70.0f;
    private static final float c = (float) Math.tan(Math.toRadians(35.0d));
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public n70() {
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = b;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = c;
    }

    private static float h(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // com.p7700g.p99005.i80
    public Path a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.h;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.g;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = this.i;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = wo1.a(f5, f11, sqrt, f11);
            f6 = wo1.a(f6, f12, sqrt, f12);
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public float b() {
        return this.f;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public void e(float f) {
        this.f = f;
        this.i = h(f);
    }

    public void f(float f) {
        this.d = f;
        this.g = h(f);
    }

    public void g(float f) {
        this.e = f;
        this.h = h(f);
    }

    @SuppressLint({"RestrictedApi"})
    public n70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = b;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(ri.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(ri.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(ri.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, b));
        obtainStyledAttributes.recycle();
    }
}