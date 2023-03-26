package com.p7700g.p99005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MediaTypes.java */
/* loaded from: classes3.dex */
public class ct3 {
    public static final String a = "application/vnd.sun.wadl+xml";
    public static final tm4 b = tm4.h(a);
    public static final String c = "application/vnd.sun.wadl+json";
    public static final tm4 d = tm4.h(c);
    public static final tm4 e = tm4.h("application/fastinfoset");
    public static final Comparator<tm4> f = new a();
    public static final Comparator<List<? extends tm4>> g = new b();
    public static final tm4 h = new tm4(tm4.g, tm4.g);
    public static final List<tm4> i = b();
    public static final rs3 j = new rs3(tm4.g, tm4.g);
    public static final List<rs3> k = a();
    public static final Comparator<gt3> l = new c();
    public static final List<tm4> m = f();
    private static Map<String, tm4> n = new d();

    /* compiled from: MediaTypes.java */
    /* loaded from: classes3.dex */
    public static class a implements Comparator<tm4> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(tm4 tm4Var, tm4 tm4Var2) {
            if (!tm4Var.d().equals(tm4.g) || tm4Var2.d().equals(tm4.g)) {
                if (!tm4Var2.d().equals(tm4.g) || tm4Var.d().equals(tm4.g)) {
                    if (!tm4Var.c().equals(tm4.g) || tm4Var2.c().equals(tm4.g)) {
                        return (!tm4Var2.c().equals(tm4.g) || tm4Var.c().equals(tm4.g)) ? 0 : -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: MediaTypes.java */
    /* loaded from: classes3.dex */
    public static class b implements Comparator<List<? extends tm4>> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(List<? extends tm4> list, List<? extends tm4> list2) {
            return ct3.f.compare(b(list), b(list2));
        }

        public tm4 b(List<? extends tm4> list) {
            return list.get(list.size() - 1);
        }
    }

    /* compiled from: MediaTypes.java */
    /* loaded from: classes3.dex */
    public static class c implements Comparator<gt3> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(gt3 gt3Var, gt3 gt3Var2) {
            int k = gt3Var2.k() - gt3Var.k();
            return k != 0 ? k : ct3.f.compare(gt3Var, gt3Var2);
        }
    }

    /* compiled from: MediaTypes.java */
    /* loaded from: classes3.dex */
    public static class d extends HashMap<String, tm4> {
        public d() {
            put("application", new tm4("application", tm4.g));
            put("multipart", new tm4("multipart", tm4.g));
            put("text", new tm4("text", tm4.g));
        }
    }

    private ct3() {
    }

    private static List<rs3> a() {
        return Collections.singletonList(j);
    }

    private static List<tm4> b() {
        return Collections.singletonList(h);
    }

    public static List<tm4> c(tl4 tl4Var) {
        if (tl4Var == null) {
            return i;
        }
        return e(tl4Var.value());
    }

    public static List<tm4> d(jm4 jm4Var) {
        if (jm4Var == null) {
            return i;
        }
        return e(jm4Var.value());
    }

    public static List<tm4> e(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : strArr) {
                kt3.E(arrayList, str);
            }
            Collections.sort(arrayList, f);
            return arrayList;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static List<tm4> f() {
        return Collections.singletonList(new gt3(tm4.g, tm4.g));
    }

    public static List<tm4> g(jm4 jm4Var) {
        if (jm4Var != null && jm4Var.value().length != 0) {
            return new ArrayList(h(jm4Var.value()));
        }
        return m;
    }

    public static List<gt3> h(String[] strArr) {
        try {
            return kt3.L(strArr);
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static tm4 i(tm4 tm4Var) {
        tm4 tm4Var2 = n.get(tm4Var.d());
        return tm4Var2 == null ? new tm4(tm4Var.d(), tm4.g) : tm4Var2;
    }

    public static final boolean j(List<? extends tm4> list, List<? extends tm4> list2) {
        for (tm4 tm4Var : list) {
            for (tm4 tm4Var2 : list2) {
                if (l(tm4Var, tm4Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final tm4 k(tm4 tm4Var, tm4 tm4Var2) {
        return (!tm4Var.f() || tm4Var2.f()) ? (!tm4Var.g() || tm4Var2.g()) ? tm4Var : tm4Var2 : tm4Var2;
    }

    public static final boolean l(tm4 tm4Var, tm4 tm4Var2) {
        return tm4Var != null && tm4Var2 != null && tm4Var.c().equalsIgnoreCase(tm4Var2.c()) && tm4Var.d().equalsIgnoreCase(tm4Var2.d());
    }
}