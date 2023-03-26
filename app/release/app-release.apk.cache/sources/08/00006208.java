package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
public final class vm implements wm {
    private static final Locale[] a = new Locale[0];
    private static final Locale b = new Locale(com.anythink.expressad.video.dynview.a.a.U, "XA");
    private static final Locale c = new Locale(com.anythink.expressad.video.dynview.a.a.S, "XB");
    private static final Locale d = um.b("en-Latn");
    private final Locale[] e;
    @x1
    private final String f;

    /* compiled from: LocaleListCompatWrapper.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public vm(@x1 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.e = a;
            this.f = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    k(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(e14.f0);
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(wo1.n("list[", i, "] is null"));
            }
        }
        this.e = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f = sb.toString();
    }

    private Locale e(Collection<String> collection, boolean z) {
        int f = f(collection, z);
        if (f == -1) {
            return null;
        }
        return this.e[f];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int f(Collection<String> collection, boolean z) {
        int i;
        Locale[] localeArr = this.e;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z) {
            i = g(d);
            if (i == 0) {
                return 0;
            }
        }
        i = Integer.MAX_VALUE;
        for (String str : collection) {
            int g = g(um.b(str));
            if (g == 0) {
                return 0;
            }
            if (g < i) {
                i = g;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private int g(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.e;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    private static String h(Locale locale) {
        String a2 = a.a(locale);
        return !a2.isEmpty() ? a2 : "";
    }

    private static boolean i(Locale locale) {
        return b.equals(locale) || c.equals(locale);
    }

    @p1(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h = h(locale);
        if (h.isEmpty()) {
            String country = locale.getCountry();
            return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
        }
        return h.equals(h(locale2)) ? 1 : 0;
    }

    @r2
    public static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // com.p7700g.p99005.wm
    public int a(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.e;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @Override // com.p7700g.p99005.wm
    public String b() {
        return this.f;
    }

    @Override // com.p7700g.p99005.wm
    @z1
    public Object c() {
        return null;
    }

    @Override // com.p7700g.p99005.wm
    public Locale d(@x1 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        Locale[] localeArr = ((vm) obj).e;
        if (this.e.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.e;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // com.p7700g.p99005.wm
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.e;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.e) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // com.p7700g.p99005.wm
    public boolean isEmpty() {
        return this.e.length == 0;
    }

    @Override // com.p7700g.p99005.wm
    public int size() {
        return this.e.length;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.e;
            if (i < localeArr.length) {
                G.append(localeArr[i]);
                if (i < this.e.length - 1) {
                    G.append(e14.f0);
                }
                i++;
            } else {
                G.append("]");
                return G.toString();
            }
        }
    }
}