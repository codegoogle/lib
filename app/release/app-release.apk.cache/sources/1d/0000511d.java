package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.TimeZone;

/* compiled from: AndroidUtils.java */
/* loaded from: classes.dex */
public class mt0 {
    @x1
    private static Object a(@x1 Context context) throws Exception {
        return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
    }

    @x1
    private static String b(@z1 String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    @x1
    public static String c(@x1 Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() > 4) {
            try {
                return Integer.toString(Integer.parseInt(networkOperator.substring(0, 3)));
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    @x1
    public static String d(@x1 Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() > 4) {
            try {
                return Integer.toString(Integer.parseInt(networkOperator.substring(3)));
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    @x1
    public static String e() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return b(str2);
        }
        return wo1.D(new StringBuilder(), b(str), " ", str2);
    }

    @x1
    public static String f(@x1 Context context) {
        try {
            Object a = a(context);
            return (String) a.getClass().getMethod("getId", new Class[0]).invoke(a, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    @x1
    public static String g() {
        return TimeZone.getDefault().getID();
    }
}