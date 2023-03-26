package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.util.Locale;

/* compiled from: BuildCompat.java */
/* loaded from: classes.dex */
public class jm {

    /* compiled from: BuildCompat.java */
    @g2
    /* loaded from: classes.dex */
    public @interface a {
    }

    private jm() {
    }

    @v0(api = 24)
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @v0(api = 25)
    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @v0(api = 26)
    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @v0(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @v0(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @i2({i2.a.TESTS})
    public static boolean f(@x1 String str, @x1 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @v0(api = 29)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @v0(api = 30)
    @Deprecated
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @v0(api = 31, codename = "S")
    @Deprecated
    public static boolean i() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && f("S", Build.VERSION.CODENAME));
    }

    @a
    @v0(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i >= 32 || (i >= 31 && f("Sv2", Build.VERSION.CODENAME));
    }

    @a
    @v0(api = 33, codename = "Tiramisu")
    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && f("Tiramisu", Build.VERSION.CODENAME));
    }

    @a
    @v0(codename = "UpsideDownCake")
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33 && f("UpsideDownCake", Build.VERSION.CODENAME);
    }
}