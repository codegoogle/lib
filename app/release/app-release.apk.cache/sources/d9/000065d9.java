package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TelephonyManagerCompat.java */
/* loaded from: classes.dex */
public class xn {
    private static Method a;
    private static Method b;

    /* compiled from: TelephonyManagerCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        @z1
        @SuppressLint({"MissingPermission"})
        @h2("android.permission.READ_PHONE_STATE")
        public static String a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        @z1
        @SuppressLint({"MissingPermission"})
        @h2("android.permission.READ_PHONE_STATE")
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private xn() {
    }

    @z1
    @SuppressLint({"MissingPermission"})
    @h2("android.permission.READ_PHONE_STATE")
    public static String a(@x1 TelephonyManager telephonyManager) {
        int b2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return b.a(telephonyManager);
        }
        if (i >= 22 && (b2 = b(telephonyManager)) != Integer.MAX_VALUE && b2 != -1) {
            int a2 = wn.a(b2);
            if (i >= 23) {
                return a.a(telephonyManager, a2);
            }
            try {
                if (a == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE);
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                return (String) a.invoke(telephonyManager, Integer.valueOf(a2));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return telephonyManager.getDeviceId();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@x1 TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return c.a(telephonyManager);
        }
        if (i >= 22) {
            try {
                if (b == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Integer num = (Integer) b.invoke(telephonyManager, new Object[0]);
                if (num == null || num.intValue() == -1) {
                    return Integer.MAX_VALUE;
                }
                return num.intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }
}