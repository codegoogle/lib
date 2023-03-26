package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat.java */
/* renamed from: com.p7700g.p99005.do  reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {
    private static final String a = "ICUCompat";
    private static Method b;
    private static Method c;

    /* compiled from: ICUCompat.java */
    @e2(21)
    /* renamed from: com.p7700g.p99005.do$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: ICUCompat.java */
    @e2(24)
    /* renamed from: com.p7700g.p99005.do$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @e1
        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @e1
        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private Cdo() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = c;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @z1
    public static String c(@x1 Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return a.a((Locale) c.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return a.a(locale);
        }
    }
}