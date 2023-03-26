package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class ag {

    /* compiled from: BundleCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @e1
        public static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    /* loaded from: classes.dex */
    public static class b {
        private static final String a = "BundleCompatBaseImpl";
        private static Method b;
        private static boolean c;
        private static Method d;
        private static boolean e;

        private b() {
        }

        public static IBinder a(Bundle bundle, String str) {
            if (!c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                c = true;
            }
            Method method2 = b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                e = true;
            }
            Method method2 = d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    d = null;
                }
            }
        }
    }

    private ag() {
    }

    @z1
    public static IBinder a(@x1 Bundle bundle, @z1 String str) {
        return a.a(bundle, str);
    }

    public static void b(@x1 Bundle bundle, @z1 String str, @z1 IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}