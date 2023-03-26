package com.p7700g.p99005;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
public class m3 {
    private static final String a = "ResourcesFlusher";
    private static Field b;
    private static boolean c;
    private static Class<?> d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static Field h;
    private static boolean i;

    /* compiled from: ResourcesFlusher.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private m3() {
    }

    public static void a(@x1 Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        if (i2 >= 24) {
            d(resources);
        } else if (i2 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    @e2(21)
    private static void b(@x1 Resources resources) {
        if (!c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @e2(23)
    private static void c(@x1 Resources resources) {
        if (!c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Object obj = null;
        Field field = b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @e2(24)
    private static void d(@x1 Resources resources) {
        Object obj;
        if (!i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            i = true;
        }
        Field field = h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            c = true;
        }
        Field field2 = b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @e2(16)
    private static void e(@x1 Object obj) {
        if (!e) {
            try {
                d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            e = true;
        }
        Class<?> cls = d;
        if (cls == null) {
            return;
        }
        if (!g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            g = true;
        }
        Field field = f;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}