package com.ironsource.sdk.utils;

import android.text.TextUtils;
import com.ironsource.sdk.g.d;

/* loaded from: classes3.dex */
public class Logger {
    private static boolean a;

    public static void d(String str, String str2) {
        boolean z = a;
    }

    public static void d(String str, String str2, Throwable th) {
        boolean z = a;
    }

    public static void e(String str, String str2) {
        boolean z = a;
    }

    public static void e(String str, String str2, Throwable th) {
        boolean z = a;
    }

    public static void enableLogging(int i) {
        a = d.EnumC0131d.MODE_0.d != i;
    }

    public static void i(String str, String str2) {
        boolean z = a;
    }

    public static void i(String str, String str2, Throwable th) {
        if (a) {
            TextUtils.isEmpty(str2);
        }
    }

    public static void v(String str, String str2) {
        boolean z = a;
    }

    public static void v(String str, String str2, Throwable th) {
        boolean z = a;
    }

    public static void w(String str, String str2) {
        boolean z = a;
    }

    public static void w(String str, String str2, Throwable th) {
        boolean z = a;
    }
}