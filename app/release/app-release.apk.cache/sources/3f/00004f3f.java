package com.p7700g.p99005;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public final class lt {
    private static final String a = "PopupWindowCompatApi21";
    private static Method b;
    private static boolean c;
    private static Method d;
    private static boolean e;
    private static Field f;
    private static boolean g;

    /* compiled from: PopupWindowCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @e1
        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @e1
        public static void c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @e1
        public static void d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    private lt() {
    }

    public static boolean a(@x1 PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(popupWindow);
        }
        if (!g) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            g = true;
        }
        Field field = f;
        if (field != null) {
            try {
                return ((Boolean) field.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException unused2) {
                return false;
            }
        }
        return false;
    }

    public static int b(@x1 PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(popupWindow);
        }
        if (!e) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static void c(@x1 PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z);
            return;
        }
        if (!g) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            g = true;
        }
        Field field = f;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void d(@x1 PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i);
            return;
        }
        if (!c) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            c = true;
        }
        Method method = b;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void e(@x1 PopupWindow popupWindow, @x1 View view, int i, int i2, int i3) {
        a.a(popupWindow, view, i, i2, i3);
    }
}