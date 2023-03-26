package com.p7700g.p99005;

import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: classes3.dex */
public class uc2 {
    private uc2() {
    }

    public static fp<String, String> a(@z1 Long l, @z1 Long l2) {
        return b(l, l2, null);
    }

    public static fp<String, String> b(@z1 Long l, @z1 Long l2, @z1 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return fp.a(null, null);
        }
        if (l == null) {
            return fp.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return fp.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar t = md2.t();
        Calendar v = md2.v();
        v.setTimeInMillis(l.longValue());
        Calendar v2 = md2.v();
        v2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return fp.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (v.get(1) == v2.get(1)) {
            if (v.get(1) == t.get(1)) {
                return fp.a(f(l.longValue(), Locale.getDefault()), f(l2.longValue(), Locale.getDefault()));
            }
            return fp.a(f(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
        } else {
            return fp.a(k(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
        }
    }

    public static String c(long j) {
        return d(j, null);
    }

    public static String d(long j, @z1 SimpleDateFormat simpleDateFormat) {
        Calendar t = md2.t();
        Calendar v = md2.v();
        v.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return wo1.j(j, simpleDateFormat);
        }
        if (t.get(1) == v.get(1)) {
            return e(j);
        }
        return j(j);
    }

    public static String e(long j) {
        return f(j, Locale.getDefault());
    }

    public static String f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return md2.c(locale).format(new Date(j));
        }
        return md2.m(locale).format(new Date(j));
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return md2.d(locale).format(new Date(j));
        }
        return md2.i(locale).format(new Date(j));
    }

    public static String i(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    public static String j(long j) {
        return k(j, Locale.getDefault());
    }

    public static String k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return md2.x(locale).format(new Date(j));
        }
        return md2.k(locale).format(new Date(j));
    }

    public static String l(long j) {
        return m(j, Locale.getDefault());
    }

    public static String m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return md2.y(locale).format(new Date(j));
        }
        return md2.i(locale).format(new Date(j));
    }
}