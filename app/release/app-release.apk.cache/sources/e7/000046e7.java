package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* compiled from: ProcessCompat.java */
/* loaded from: classes.dex */
public final class hn {

    /* compiled from: ProcessCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private static final Object a = new Object();
        private static Method b;
        private static boolean c;

        private a() {
        }

        @SuppressLint({"PrivateApi"})
        public static boolean a(int i) {
            try {
                synchronized (a) {
                    if (!c) {
                        c = true;
                        b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: ProcessCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class b {
        private static final Object a = new Object();
        private static Method b;
        private static boolean c;

        private b() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i) {
            try {
                synchronized (a) {
                    if (!c) {
                        c = true;
                        b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: ProcessCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        public static boolean a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    private hn() {
    }

    public static boolean a(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(i);
        }
        return b.a(i);
    }
}