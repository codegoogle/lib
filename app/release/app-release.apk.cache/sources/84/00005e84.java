package com.p7700g.p99005;

import com.p7700g.p99005.mn4;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MediaType.java */
/* loaded from: classes3.dex */
public class tm4 {
    public static final String B = "text/xml";
    public static final String D = "text/html";
    public static final String g = "*";
    public static final String h = "*/*";
    public static final String j = "application/xml";
    public static final String l = "application/atom+xml";
    public static final String n = "application/xhtml+xml";
    public static final String p = "application/svg+xml";
    public static final String r = "application/json";
    public static final String t = "application/x-www-form-urlencoded";
    public static final String v = "multipart/form-data";
    public static final String x = "application/octet-stream";
    public static final String z = "text/plain";
    private String F;
    private String G;
    private Map<String, String> H;
    private static final Map<String, String> e = Collections.emptyMap();
    private static final mn4.a<tm4> f = mn4.g().b(tm4.class);
    public static final tm4 i = new tm4();
    public static final tm4 k = new tm4("application", "xml");
    public static final tm4 m = new tm4("application", "atom+xml");
    public static final tm4 o = new tm4("application", "xhtml+xml");
    public static final tm4 q = new tm4("application", "svg+xml");
    public static final tm4 s = new tm4("application", "json");
    public static final tm4 u = new tm4("application", "x-www-form-urlencoded");
    public static final tm4 w = new tm4("multipart", "form-data");
    public static final tm4 y = new tm4("application", "octet-stream");
    public static final tm4 A = new tm4("text", "plain");
    public static final tm4 C = new tm4("text", "xml");
    public static final tm4 E = new tm4("text", ck3.a);

    /* compiled from: MediaType.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public tm4(String str, String str2, Map<String, String> map) {
        this.F = str == null ? g : str;
        this.G = str2 == null ? g : str2;
        if (map == null) {
            this.H = e;
            return;
        }
        TreeMap treeMap = new TreeMap(new a());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(entry.getKey().toLowerCase(), entry.getValue());
        }
        this.H = Collections.unmodifiableMap(treeMap);
    }

    public static tm4 h(String str) throws IllegalArgumentException {
        return f.a(str);
    }

    public Map<String, String> b() {
        return this.H;
    }

    public String c() {
        return this.G;
    }

    public String d() {
        return this.F;
    }

    public boolean e(tm4 tm4Var) {
        if (tm4Var == null) {
            return false;
        }
        if (this.F.equals(g) || tm4Var.F.equals(g)) {
            return true;
        }
        if (this.F.equalsIgnoreCase(tm4Var.F) && (this.G.equals(g) || tm4Var.G.equals(g))) {
            return true;
        }
        return this.F.equalsIgnoreCase(tm4Var.F) && this.G.equalsIgnoreCase(tm4Var.G);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof tm4)) {
            tm4 tm4Var = (tm4) obj;
            return this.F.equalsIgnoreCase(tm4Var.F) && this.G.equalsIgnoreCase(tm4Var.G) && this.H.equals(tm4Var.H);
        }
        return false;
    }

    public boolean f() {
        return c().equals(g);
    }

    public boolean g() {
        return d().equals(g);
    }

    public int hashCode() {
        return this.H.hashCode() + (this.F.toLowerCase() + this.G.toLowerCase()).hashCode();
    }

    public String toString() {
        return f.b(this);
    }

    public tm4(String str, String str2) {
        this(str, str2, e);
    }

    public tm4() {
        this(g, g);
    }
}