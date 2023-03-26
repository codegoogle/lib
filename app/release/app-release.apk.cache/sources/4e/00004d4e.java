package com.p7700g.p99005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: HttpHeaderReader.java */
/* loaded from: classes3.dex */
public abstract class kt3 {
    private static final k<bt3> a = new a();
    private static final k<tm4> b = new b();
    private static final k<rs3> c = new c();
    private static final Comparator<rs3> d = new d();
    private static final k<gt3> e = new e();
    private static final k<ss3> f = new g();
    private static final k<qs3> g = new h();
    private static final Comparator<ft3> h = new i();

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class a implements k<bt3> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public bt3 a(kt3 kt3Var) throws ParseException {
            return bt3.d(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class b implements k<tm4> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public tm4 a(kt3 kt3Var) throws ParseException {
            return mu3.f(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class c implements k<rs3> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public rs3 a(kt3 kt3Var) throws ParseException {
            return rs3.i(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class d implements Comparator<rs3> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(rs3 rs3Var, rs3 rs3Var2) {
            int a = rs3Var2.a() - rs3Var.a();
            return a != 0 ? a : ct3.f.compare(rs3Var, rs3Var2);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class e implements k<gt3> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public gt3 a(kt3 kt3Var) throws ParseException {
            return gt3.m(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class f implements Comparator<rs3> {
        public final /* synthetic */ List s;

        public f(List list) {
            this.s = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(rs3 rs3Var, rs3 rs3Var2) {
            int i = q95.a;
            int i2 = q95.a;
            boolean z = false;
            boolean z2 = false;
            for (gt3 gt3Var : this.s) {
                if (!z && ct3.l(rs3Var, gt3Var)) {
                    i2 = gt3Var.k() * rs3Var.a();
                    z = true;
                } else if (!z2 && ct3.l(rs3Var2, gt3Var)) {
                    i = gt3Var.k() * rs3Var2.a();
                    z2 = true;
                }
            }
            int i3 = i - i2;
            if (i3 != 0) {
                return i3;
            }
            int a = rs3Var2.a() - rs3Var.a();
            return a != 0 ? a : ct3.f.compare(rs3Var, rs3Var2);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class g implements k<ss3> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public ss3 a(kt3 kt3Var) throws ParseException {
            return new ss3(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class h implements k<qs3> {
        @Override // com.p7700g.p99005.kt3.k
        /* renamed from: b */
        public qs3 a(kt3 kt3Var) throws ParseException {
            return new qs3(kt3Var);
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public static class i implements Comparator<ft3> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ft3 ft3Var, ft3 ft3Var2) {
            return ft3Var2.a() - ft3Var.a();
        }
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public enum j {
        Token,
        QuotedString,
        Comment,
        Separator,
        Control
    }

    /* compiled from: HttpHeaderReader.java */
    /* loaded from: classes3.dex */
    public interface k<T> {
        T a(kt3 kt3Var) throws ParseException;
    }

    public static Date A(String str) throws ParseException {
        return ws3.e(str);
    }

    public static <T> List<T> B(k<T> kVar, String str) throws ParseException {
        return C(new ArrayList(), kVar, str);
    }

    public static <T> List<T> C(List<T> list, k<T> kVar, String str) throws ParseException {
        lt3 lt3Var = new lt3(str);
        jt3 jt3Var = new jt3(lt3Var);
        while (lt3Var.e()) {
            list.add(kVar.a(jt3Var));
            jt3Var.M();
            if (lt3Var.e()) {
                lt3Var.i();
            }
        }
        return list;
    }

    public static Set<bt3> D(String str) throws ParseException {
        if (str.equals(tm4.g)) {
            return bt3.d;
        }
        lt3 lt3Var = new lt3(str);
        HashSet hashSet = new HashSet(1);
        jt3 jt3Var = new jt3(lt3Var);
        while (lt3Var.e()) {
            hashSet.add(a.a(jt3Var));
            jt3Var.M();
            if (lt3Var.e()) {
                lt3Var.i();
            }
        }
        return hashSet;
    }

    public static List<tm4> E(List<tm4> list, String str) throws ParseException {
        return C(list, b, str);
    }

    public static vm4 F(String str) {
        return it3.c(str);
    }

    public static Map<String, String> G(kt3 kt3Var) throws ParseException {
        return H(kt3Var, false);
    }

    public static Map<String, String> H(kt3 kt3Var, boolean z) throws ParseException {
        String r;
        LinkedHashMap linkedHashMap = null;
        while (kt3Var.e()) {
            kt3Var.o(';');
            while (kt3Var.f(';', true)) {
                kt3Var.i();
            }
            if (!kt3Var.e()) {
                break;
            }
            String p = kt3Var.p();
            kt3Var.o('=');
            if ("filename".equalsIgnoreCase(p) && z) {
                String r2 = kt3Var.r(true);
                r = r2.substring(r2.lastIndexOf(92) + 1);
            } else {
                r = kt3Var.r(false);
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(p.toLowerCase(), r);
        }
        return linkedHashMap;
    }

    public static int I(String str) throws ParseException {
        int i2 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            if (length <= 5) {
                char charAt = str.charAt(0);
                int i3 = 1;
                if (charAt == '0' || charAt == '1') {
                    if (1 == length) {
                        return (charAt - '0') * 1000;
                    }
                    char charAt2 = str.charAt(1);
                    if (charAt2 != '.') {
                        throw new ParseException("Error parsing Quality value: a decimal place is expected rather than '" + charAt2 + "'", 2);
                    } else if (2 == length) {
                        return (charAt2 - '0') * 1000;
                    } else {
                        i3 = 2;
                    }
                } else if (charAt != '.') {
                    throw new ParseException("Error parsing Quality value: a decimal numeral '0' or '1' is expected rather than '" + charAt + "'", 1);
                } else if (1 == length) {
                    throw new ParseException("Error parsing Quality value: a decimal numeral is expected after the decimal point", 1);
                }
                int i4 = 100;
                while (i3 < length) {
                    int i5 = i3 + 1;
                    char charAt3 = str.charAt(i3);
                    if (charAt3 >= '0' && charAt3 <= '9') {
                        i2 += (charAt3 - '0') * i4;
                        i4 /= 10;
                        i3 = i5;
                    } else {
                        throw new ParseException("Error parsing Quality value: a decimal numeral is expected rather than '" + charAt3 + "'", i5);
                    }
                }
                if (charAt == '1') {
                    if (i2 <= 0) {
                        return 1000;
                    }
                    throw new ParseException(wo1.u("The Quality value, ", str, ", is greater than 1"), i3);
                }
                return i2;
            }
            throw new ParseException("Quality value is greater than the maximum length, 5", 0);
        }
        throw new ParseException("Quality value cannot be null or an empty String", 0);
    }

    public static int J(kt3 kt3Var) throws ParseException {
        int i2 = -1;
        while (kt3Var.e()) {
            kt3Var.o(';');
            if (!kt3Var.e()) {
                return 1000;
            }
            String p = kt3Var.p();
            kt3Var.o('=');
            String q = kt3Var.q();
            if (i2 == -1 && p.equalsIgnoreCase("q")) {
                i2 = I(q);
            }
        }
        if (i2 == -1) {
            return 1000;
        }
        return i2;
    }

    public static List<gt3> K(String str) throws ParseException {
        return x(ct3.l, e, str);
    }

    public static List<gt3> L(String[] strArr) throws ParseException {
        if (strArr.length < 2) {
            return K(strArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        return K(sb.toString());
    }

    public static kt3 g(String str) {
        return new lt3(str);
    }

    public static kt3 h(String str, boolean z) {
        return new lt3(str, z);
    }

    public static List<qs3> s(String str) throws ParseException {
        return w(g, str);
    }

    public static List<rs3> t(String str) throws ParseException {
        return x(d, c, str);
    }

    public static List<rs3> u(String str, List<gt3> list) throws ParseException {
        return x(new f(list), c, str);
    }

    public static List<ss3> v(String str) throws ParseException {
        return w(f, str);
    }

    public static <T extends ft3> List<T> w(k<T> kVar, String str) throws ParseException {
        List<T> B = B(kVar, str);
        Collections.sort(B, h);
        return B;
    }

    public static <T> List<T> x(Comparator<T> comparator, k<T> kVar, String str) throws ParseException {
        List<T> B = B(kVar, str);
        Collections.sort(B, comparator);
        return B;
    }

    public static pm4 y(String str) {
        return it3.a(str);
    }

    public static Map<String, pm4> z(String str) {
        return it3.b(str);
    }

    public abstract j a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f(char c2, boolean z);

    public abstract j i() throws ParseException;

    public abstract j j(boolean z) throws ParseException;

    public abstract j k(boolean z, boolean z2) throws ParseException;

    public String l() throws ParseException {
        if (j(false) == j.QuotedString) {
            return b();
        }
        throw new ParseException("Next event is not a Quoted String", c());
    }

    public abstract String m(char c2, char c3) throws ParseException;

    public char n() throws ParseException {
        if (j(false) == j.Separator) {
            return b().charAt(0);
        }
        throw new ParseException("Next event is not a Separator", c());
    }

    public void o(char c2) throws ParseException {
        if (j(false) == j.Separator) {
            if (c2 == b().charAt(0)) {
                return;
            }
            throw new ParseException("Expected separator '" + c2 + "' instead of '" + b().charAt(0) + "'", c());
        }
        throw new ParseException("Next event is not a Separator", c());
    }

    public String p() throws ParseException {
        if (j(false) == j.Token) {
            return b();
        }
        throw new ParseException("Next event is not a Token", c());
    }

    public String q() throws ParseException {
        return r(false);
    }

    public String r(boolean z) throws ParseException {
        j k2 = k(false, z);
        if (k2 != j.Token && k2 != j.QuotedString) {
            StringBuilder G = wo1.G("Next event is not a Token or a Quoted String, ");
            G.append(b());
            throw new ParseException(G.toString(), c());
        }
        return b();
    }
}