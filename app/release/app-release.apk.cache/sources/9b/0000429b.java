package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat.java */
/* loaded from: classes.dex */
public final class fk {
    private static final String a = "DrawableCompat";
    private static Method b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    /* compiled from: DrawableCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @e1
        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @e1
        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @e1
        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @e1
        public static void e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* compiled from: DrawableCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @e1
        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @e1
        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @e1
        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @e1
        public static void e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @e1
        public static void f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @e1
        public static void g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @e1
        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @e1
        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @e1
        public static boolean b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    private fk() {
    }

    public static void a(@x1 Drawable drawable, @x1 Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@x1 Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@x1 Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            c(a.c((InsetDrawable) drawable));
        } else if (drawable instanceof mk) {
            c(((mk) drawable).b());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable b2 = a.b(drawableContainerState, i);
                if (b2 != null) {
                    c(b2);
                }
            }
        }
    }

    public static int d(@x1 Drawable drawable) {
        return a.a(drawable);
    }

    @z1
    public static ColorFilter e(@x1 Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@x1 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                d = null;
            }
        }
        return 0;
    }

    public static void g(@x1 Drawable drawable, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@x1 Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@x1 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@x1 Drawable drawable, boolean z) {
        a.e(drawable, z);
    }

    public static void k(@x1 Drawable drawable, float f, float f2) {
        b.e(drawable, f, f2);
    }

    public static void l(@x1 Drawable drawable, int i, int i2, int i3, int i4) {
        b.f(drawable, i, i2, i3, i4);
    }

    public static boolean m(@x1 Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i);
        }
        if (!c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        Method method = b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                b = null;
            }
        }
        return false;
    }

    public static void n(@x1 Drawable drawable, @w0 int i) {
        b.g(drawable, i);
    }

    public static void o(@x1 Drawable drawable, @z1 ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@x1 Drawable drawable, @x1 PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@x1 Drawable drawable) {
        return drawable instanceof mk ? (T) ((mk) drawable).b() : drawable;
    }

    @x1
    public static Drawable r(@x1 Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof lk)) ? new ok(drawable) : drawable;
    }
}