package com.p7700g.p99005;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class mi {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;

    private mi() {
    }

    private static a a(@z1 a aVar, @w0 int i, @w0 int i2, boolean z, @w0 int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    public static Shader b(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader c(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s = ri.s(resources, theme, attributeSet, nf.j.C);
            float j = ri.j(s, xmlPullParser, "startX", nf.j.L, 0.0f);
            float j2 = ri.j(s, xmlPullParser, "startY", nf.j.M, 0.0f);
            float j3 = ri.j(s, xmlPullParser, "endX", nf.j.N, 0.0f);
            float j4 = ri.j(s, xmlPullParser, "endY", nf.j.O, 0.0f);
            float j5 = ri.j(s, xmlPullParser, "centerX", nf.j.G, 0.0f);
            float j6 = ri.j(s, xmlPullParser, "centerY", nf.j.H, 0.0f);
            int k = ri.k(s, xmlPullParser, "type", nf.j.F, 0);
            int f = ri.f(s, xmlPullParser, "startColor", nf.j.D, 0);
            boolean r = ri.r(xmlPullParser, "centerColor");
            int f2 = ri.f(s, xmlPullParser, "centerColor", nf.j.K, 0);
            int f3 = ri.f(s, xmlPullParser, "endColor", nf.j.E, 0);
            int k2 = ri.k(s, xmlPullParser, "tileMode", nf.j.J, 0);
            float j7 = ri.j(s, xmlPullParser, "gradientRadius", nf.j.I, 0.0f);
            s.recycle();
            a a2 = a(d(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k != 1) {
                if (k != 2) {
                    return new LinearGradient(j, j2, j3, j4, a2.a, a2.b, e(k2));
                }
                return new SweepGradient(j5, j6, a2.a, a2.b);
            } else if (j7 > 0.0f) {
                return new RadialGradient(j5, j6, j7, a2.a, a2.b, e(k2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a d(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray s = ri.s(resources, theme, attributeSet, nf.j.P);
                int i = nf.j.Q;
                boolean hasValue = s.hasValue(i);
                int i2 = nf.j.R;
                boolean hasValue2 = s.hasValue(i2);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = s.getColor(i, 0);
                float f = s.getFloat(i2, 0.0f);
                s.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode e(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(@x1 List<Integer> list, @x1 List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        public a(@w0 int i, @w0 int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(@w0 int i, @w0 int i2, @w0 int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}