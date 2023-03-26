package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ColorStateListInflaterCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ii {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    private ii() {
    }

    @x1
    public static ColorStateList a(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @x1
    public static ColorStateList b(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @x1
    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @z1
    public static ColorStateList d(@x1 Resources resources, @t2 int i, @z1 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList e(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        Resources resources2 = resources;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h = h(resources2, theme, attributeSet, nf.j.d);
                int i4 = nf.j.e;
                int resourceId = h.getResourceId(i4, -1);
                if (resourceId != -1 && !f(resources2, resourceId)) {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h.getColor(nf.j.e, -65281);
                    }
                } else {
                    color = h.getColor(i4, -65281);
                }
                float f2 = 1.0f;
                int i5 = nf.j.f;
                if (h.hasValue(i5)) {
                    f2 = h.getFloat(i5, 1.0f);
                } else {
                    int i6 = nf.j.h;
                    if (h.hasValue(i6)) {
                        f2 = h.getFloat(i6, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i7 = nf.j.g;
                    if (h.hasValue(i7)) {
                        f = h.getFloat(i7, -1.0f);
                        h.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr3 = new int[attributeCount];
                        int i8 = 0;
                        for (i = 0; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != nf.a.a && attributeNameResource != nf.a.m) {
                                int i9 = i8 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr3[i8] = attributeNameResource;
                                i8 = i9;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr3, i8);
                        iArr2 = ni.a(iArr2, i3, g(color, f2, f));
                        iArr = (int[][]) ni.c(iArr, i3, trimStateSet);
                        i3++;
                    }
                }
                f = h.getFloat(nf.j.i, -1.0f);
                h.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i82 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i82);
                iArr2 = ni.a(iArr2, i3, g(color, f2, f));
                iArr = (int[][]) ni.c(iArr, i3, trimStateSet2);
                i3++;
            }
            i2 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i3];
        int[][] iArr5 = new int[i3];
        System.arraycopy(iArr2, 0, iArr4, 0, i3);
        System.arraycopy(iArr, 0, iArr5, 0, i3);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean f(@x1 Resources resources, @y0 int i) {
        TypedValue c = c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        return i2 >= 28 && i2 <= 31;
    }

    @w0
    private static int g(@w0 int i, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f != 1.0f || z) {
            int e = bm.e((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
            if (z) {
                gi c = gi.c(i);
                i = gi.p(c.j(), c.i(), f2);
            }
            return (i & sr.s) | (e << 24);
        }
        return i;
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}