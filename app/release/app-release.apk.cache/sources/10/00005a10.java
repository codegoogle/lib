package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.p7700g.p99005.i2;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ri {
    private static final String a = "http://schemas.android.com/apk/res/android";

    private ri() {
    }

    public static int a(@x1 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean b(@x1 TypedArray typedArray, @n2 int i, @n2 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @z1
    public static Drawable c(@x1 TypedArray typedArray, @n2 int i, @n2 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    public static int d(@x1 TypedArray typedArray, @n2 int i, @n2 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    public static boolean e(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i, boolean z) {
        return !r(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @w0
    public static int f(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i, @w0 int i2) {
        return !r(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @z1
    public static ColorStateList g(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @z1 Resources.Theme theme, @x1 String str, @n2 int i) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return h(typedValue);
                }
                return ii.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    @x1
    private static ColorStateList h(@x1 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ji i(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @z1 Resources.Theme theme, @x1 String str, @n2 int i, @w0 int i2) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return ji.b(typedValue.data);
            }
            ji g = ji.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return ji.b(i2);
    }

    public static float j(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i, float f) {
        return !r(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int k(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i, int i2) {
        return !r(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @n0
    public static int l(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i, @n0 int i2) {
        return !r(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @z1
    public static String m(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, @n2 int i) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @n0
    public static int n(@x1 TypedArray typedArray, @n2 int i, @n2 int i2, @n0 int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @z1
    public static String o(@x1 TypedArray typedArray, @n2 int i, @n2 int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    @z1
    public static CharSequence p(@x1 TypedArray typedArray, @n2 int i, @n2 int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @z1
    public static CharSequence[] q(@x1 TypedArray typedArray, @n2 int i, @n2 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static boolean r(@x1 XmlPullParser xmlPullParser, @x1 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @x1
    public static TypedArray s(@x1 Resources resources, @z1 Resources.Theme theme, @x1 AttributeSet attributeSet, @x1 int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @z1
    public static TypedValue t(@x1 TypedArray typedArray, @x1 XmlPullParser xmlPullParser, @x1 String str, int i) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}