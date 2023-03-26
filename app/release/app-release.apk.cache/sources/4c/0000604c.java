package com.p7700g.p99005;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class um {
    private static final um a = a(new Locale[0]);
    private final wm b;

    /* compiled from: LocaleListCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: LocaleListCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @e1
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @e1
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private um(wm wmVar) {
        this.b = wmVar;
    }

    @x1
    public static um a(@x1 Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return n(b.a(localeArr));
        }
        return new um(new vm(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException(wo1.u("Can not parse language tag: [", str, "]"));
    }

    @x1
    public static um c(@z1 String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = a.a(split[i]);
            }
            return a(localeArr);
        }
        return g();
    }

    @x1
    @j2(min = 1)
    public static um e() {
        return Build.VERSION.SDK_INT >= 24 ? n(b.b()) : a(Locale.getDefault());
    }

    @x1
    @j2(min = 1)
    public static um f() {
        return Build.VERSION.SDK_INT >= 24 ? n(b.c()) : a(Locale.getDefault());
    }

    @x1
    public static um g() {
        return a;
    }

    @e2(24)
    @x1
    public static um n(@x1 LocaleList localeList) {
        return new um(new xm(localeList));
    }

    @e2(24)
    @Deprecated
    public static um o(Object obj) {
        return n((LocaleList) obj);
    }

    @z1
    public Locale d(int i) {
        return this.b.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof um) && this.b.equals(((um) obj).b);
    }

    @z1
    public Locale h(@x1 String[] strArr) {
        return this.b.d(strArr);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @p1(from = -1)
    public int i(@z1 Locale locale) {
        return this.b.a(locale);
    }

    public boolean j() {
        return this.b.isEmpty();
    }

    @p1(from = 0)
    public int k() {
        return this.b.size();
    }

    @x1
    public String l() {
        return this.b.b();
    }

    @z1
    public Object m() {
        return this.b.c();
    }

    @x1
    public String toString() {
        return this.b.toString();
    }
}