package com.p7700g.p99005;

import com.p7700g.p99005.ms3;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: UriTemplate.java */
/* loaded from: classes3.dex */
public class os3 {
    private static String[] a = new String[0];
    public static final Comparator<os3> b = new a();
    private static final Pattern c = Pattern.compile("\\{(\\w[-\\w\\.]*)\\}");
    public static final os3 d = new os3();
    private final String e;
    private final String f;
    private final ns3 g;
    private final boolean h;
    private final List<String> i;
    private final int j;
    private final int k;

    /* compiled from: UriTemplate.java */
    /* loaded from: classes3.dex */
    public static class a implements Comparator<os3> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(os3 os3Var, os3 os3Var2) {
            if (os3Var == null && os3Var2 == null) {
                return 0;
            }
            if (os3Var == null) {
                return 1;
            }
            if (os3Var2 == null) {
                return -1;
            }
            os3 os3Var3 = os3.d;
            if (os3Var == os3Var3 && os3Var2 == os3Var3) {
                return 0;
            }
            if (os3Var == os3Var3) {
                return 1;
            }
            if (os3Var2 == os3Var3) {
                return -1;
            }
            int q = os3Var2.q() - os3Var.q();
            if (q != 0) {
                return q;
            }
            int s = os3Var2.s() - os3Var.s();
            if (s != 0) {
                return s;
            }
            int r = os3Var2.r() - os3Var.r();
            return r != 0 ? r : os3Var2.g.d().compareTo(os3Var.g.d());
        }
    }

    private os3() {
        this.f = "";
        this.e = "";
        this.g = ns3.a;
        this.h = false;
        this.i = Collections.emptyList();
        this.k = 0;
        this.j = 0;
    }

    public static final String b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return j(str, str2, str3, str4, str5, str6, str7, str8, hashMap, z);
    }

    public static final String c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Object[] objArr, boolean z) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] != null) {
                strArr[i] = objArr[i].toString();
            }
        }
        return k(str, str2, str3, str4, str5, str6, str7, str8, strArr, z);
    }

    public static final String d(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, ? extends Object> map, boolean z) {
        return b(str, null, str2, str3, str4, str5, str6, str7, map, z);
    }

    public static final String e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Object[] objArr, boolean z) {
        return c(str, null, str2, str3, str4, str5, str6, str7, objArr, z);
    }

    private static int i(ms3.c cVar, String str, String[] strArr, int i, boolean z, Map<String, Object> map, StringBuilder sb) {
        if (str.indexOf(123) == -1) {
            sb.append(str);
            return i;
        }
        String g = new ps3(str).g();
        Matcher matcher = c.matcher(g);
        int i2 = 0;
        while (matcher.find()) {
            sb.append((CharSequence) g, i2, matcher.start());
            String group = matcher.group(1);
            Object obj = map.get(group);
            if (obj == null && i < strArr.length) {
                obj = strArr[i];
                i++;
            }
            if (obj != null) {
                map.put(group, obj);
                String obj2 = obj.toString();
                sb.append(z ? ms3.x(obj2, cVar) : ms3.e(obj2, cVar));
                i2 = matcher.end();
            } else {
                throw z(group);
            }
        }
        sb.append((CharSequence) g, i2, g.length());
        return i;
    }

    public static final String j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map, boolean z) {
        return l(str, str2, str3, str4, str5, str6, str7, str8, a, z, map);
    }

    public static final String k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, boolean z) {
        return l(str, str2, str3, str4, str5, str6, str7, str8, strArr, z, new HashMap());
    }

    private static String l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, boolean z, Map<String, Object> map) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (str != null) {
            int i4 = i(ms3.c.SCHEME, str, strArr, 0, false, map, sb);
            sb.append(':');
            i3 = i4;
        }
        if (str3 != null || str4 != null || str5 != null) {
            sb.append("//");
            if (str3 != null && str3.length() > 0) {
                int i5 = i(ms3.c.USER_INFO, str3, strArr, i3, z, map, sb);
                sb.append('@');
                i3 = i5;
            }
            if (str4 != null) {
                i3 = i(ms3.c.HOST, str4, strArr, i3, z, map, sb);
            }
            if (str5 != null && str5.length() > 0) {
                sb.append(':');
                i = i(ms3.c.PORT, str5, strArr, i3, false, map, sb);
                i3 = i;
            }
        } else if (str2 != null) {
            sb.append("//");
            i = i(ms3.c.AUTHORITY, str2, strArr, i3, z, map, sb);
            i3 = i;
        }
        if (str6 != null && str6.length() > 0) {
            if (sb.length() > 0 && str6.charAt(0) != '/') {
                sb.append(j14.P);
            }
            i3 = i(ms3.c.PATH, str6, strArr, i3, z, map, sb);
        }
        if (str7 == null || str7.length() <= 0) {
            i2 = i3;
        } else {
            sb.append('?');
            i2 = i(ms3.c.QUERY_PARAM, str7, strArr, i3, z, map, sb);
        }
        if (str8 != null && str8.length() > 0) {
            sb.append('#');
            i(ms3.c.FRAGMENT, str8, strArr, i2, z, map, sb);
        }
        return sb.toString();
    }

    public static final String m(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, ? extends Object> map, boolean z) {
        return j(str, null, str2, str3, str4, str5, str6, str7, map, z);
    }

    public static final String n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr, boolean z) {
        return k(str, null, str2, str3, str4, str5, str6, str7, strArr, z);
    }

    private static IllegalArgumentException z(String str) {
        return new IllegalArgumentException(wo1.u("The template variable, ", str, ", has no value"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof os3) {
            return this.g.equals(((os3) obj).g);
        }
        return false;
    }

    public final String f(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = c.matcher(this.f);
        int i = 0;
        while (matcher.find()) {
            sb.append((CharSequence) this.f, i, matcher.start());
            String str = map.get(matcher.group(1));
            if (str != null) {
                sb.append(str);
            }
            i = matcher.end();
        }
        String str2 = this.f;
        sb.append((CharSequence) str2, i, str2.length());
        return sb.toString();
    }

    public final String g(String... strArr) {
        return h(strArr, 0, strArr.length);
    }

    public final String h(String[] strArr, int i, int i2) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        Matcher matcher = c.matcher(this.f);
        int i3 = i2 + i;
        int i4 = 0;
        while (matcher.find()) {
            sb.append((CharSequence) this.f, i4, matcher.start());
            String group = matcher.group(1);
            String str = (String) hashMap.get(group);
            if (str != null) {
                sb.append(str);
            } else if (i < i3) {
                int i5 = i + 1;
                String str2 = strArr[i];
                if (str2 != null) {
                    hashMap.put(group, str2);
                    sb.append(str2);
                }
                i = i5;
            }
            i4 = matcher.end();
        }
        String str3 = this.f;
        sb.append((CharSequence) str3, i4, str3.length());
        return sb.toString();
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public ns3 o(ps3 ps3Var) {
        return new ns3(ps3Var.j(), ps3Var.d());
    }

    public final boolean p() {
        return this.h;
    }

    public final int q() {
        return this.k;
    }

    public final int r() {
        return this.j;
    }

    public final int s() {
        return this.i.size();
    }

    public final ns3 t() {
        return this.g;
    }

    public final String toString() {
        return this.g.toString();
    }

    public final String u() {
        return this.e;
    }

    public final List<String> v() {
        return this.i;
    }

    public final boolean w(String str) {
        for (String str2 : this.i) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(CharSequence charSequence, List<String> list) throws IllegalArgumentException {
        if (list != null) {
            return this.g.f(charSequence, list);
        }
        throw new IllegalArgumentException();
    }

    public final boolean y(CharSequence charSequence, Map<String, String> map) throws IllegalArgumentException {
        if (map != null) {
            return this.g.g(charSequence, this.i, map);
        }
        throw new IllegalArgumentException();
    }

    public os3(String str) throws PatternSyntaxException, IllegalArgumentException {
        this(new ps3(str));
    }

    public os3(ps3 ps3Var) throws PatternSyntaxException, IllegalArgumentException {
        String k = ps3Var.k();
        this.e = k;
        this.f = ps3Var.g();
        this.g = o(ps3Var);
        this.j = ps3Var.h();
        this.k = ps3Var.i();
        this.h = k.charAt(k.length() - 1) == '/';
        this.i = Collections.unmodifiableList(ps3Var.f());
    }
}