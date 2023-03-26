package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import com.p7700g.p99005.ga2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* loaded from: classes3.dex */
public class md2 {
    public static final String a = "UTC";
    public static AtomicReference<ld2> b = new AtomicReference<>();

    private md2() {
    }

    public static void A(@z1 ld2 ld2Var) {
        b.set(ld2Var);
    }

    public static long a(long j) {
        Calendar v = v();
        v.setTimeInMillis(j);
        return f(v).getTimeInMillis();
    }

    private static int b(@x1 String str, @x1 String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }

    public static Calendar f(Calendar calendar) {
        Calendar w = w(calendar);
        Calendar v = v();
        v.set(w.get(1), w.get(2), w.get(5));
        return v;
    }

    private static java.text.DateFormat g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    public static java.text.DateFormat h() {
        return i(Locale.getDefault());
    }

    public static java.text.DateFormat i(Locale locale) {
        return g(0, locale);
    }

    public static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    public static java.text.DateFormat k(Locale locale) {
        return g(2, locale);
    }

    public static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    public static java.text.DateFormat m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) k(locale);
        simpleDateFormat.applyPattern(z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    public static SimpleDateFormat n(String str) {
        return o(str, Locale.getDefault());
    }

    private static SimpleDateFormat o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    public static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(ga2.m.e1);
        String string2 = resources.getString(ga2.m.d1);
        String string3 = resources.getString(ga2.m.c1);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    public static ld2 r() {
        ld2 ld2Var = b.get();
        return ld2Var == null ? ld2.e() : ld2Var;
    }

    private static TimeZone s() {
        return TimeZone.getTimeZone(a);
    }

    public static Calendar t() {
        Calendar c = r().c();
        c.set(11, 0);
        c.set(12, 0);
        c.set(13, 0);
        c.set(14, 0);
        c.setTimeZone(s());
        return c;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone(a);
    }

    public static Calendar v() {
        return w(null);
    }

    public static Calendar w(@z1 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat x(Locale locale) {
        return e("yMMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat y(Locale locale) {
        return e("yMMMEd", locale);
    }

    @x1
    private static String z(@x1 String str) {
        int b2 = b(str, "yY", 1, 0);
        if (b2 >= str.length()) {
            return str;
        }
        int b3 = b(str, "EMd", 1, b2);
        return str.replace(str.substring(b(str, b3 < str.length() ? "EMd," : "EMd", -1, b2) + 1, b3), " ").trim();
    }
}