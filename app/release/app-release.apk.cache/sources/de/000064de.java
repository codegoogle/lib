package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.p7700g.p99005.i2;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Compatibility.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class x3 {

    /* compiled from: Compatibility.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(@x1 Resources resources, int i, int i2, @x1 TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    /* compiled from: Compatibility.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(@x1 ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* compiled from: Compatibility.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @x1
        @e1
        public static Drawable a(@x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @e1
        public static int b(@x1 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @e1
        public static void c(@x1 Drawable drawable, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private x3() {
    }
}