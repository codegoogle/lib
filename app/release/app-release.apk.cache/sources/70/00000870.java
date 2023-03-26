package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/* loaded from: classes2.dex */
public final class n {
    public static boolean a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = true;
    public static boolean h = false;
    private static final String i = "anythink_";

    static {
        if (com.anythink.expressad.a.a) {
            return;
        }
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
    }

    private n() {
    }

    public static void a(String str, String str2) {
        if (!b || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2) {
        if (!c || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    private static void c(String str, String str2, Throwable th) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    private static void d(String str, String str2, Throwable th) {
        if (!c || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    private static void e(String str, String str2) {
        if (!a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!b || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!e || str2 == null) {
            return;
        }
        a(str);
    }

    public static void c(String str, String str2) {
        if (!d || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void d(String str, String str2) {
        if (!e || str2 == null) {
            return;
        }
        a(str);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!d || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, Throwable th) {
        if (d) {
            a(str);
        }
    }

    private static void a(Context context, String str) {
        if (f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? i.concat(String.valueOf(str)) : str;
    }
}