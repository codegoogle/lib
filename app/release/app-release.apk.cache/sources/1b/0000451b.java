package com.p7700g.p99005;

/* compiled from: AuthMethod.java */
/* loaded from: classes.dex */
public class gr0 {
    @x1
    private static final String a = "anonymous";
    @x1
    private static final String b = "google";
    @x1
    private static final String c = "facebook";
    @x1
    private static final String d = "twitter";
    @x1
    private static final String e = "github";
    @x1
    private static final String f = "firebase";
    @x1
    private static final String g = "oauth";
    @x1
    private final String h;
    @z1
    private final String i;

    private gr0(@x1 String str) {
        this.h = str;
        this.i = null;
    }

    @x1
    public static gr0 a() {
        return new gr0(a);
    }

    @x1
    public static gr0 b(String str, String str2) {
        return new gr0(str2, str);
    }

    @x1
    public static gr0 c(String str) {
        return new gr0(g, str);
    }

    @x1
    public static gr0 d(String str) {
        return new gr0(c, str);
    }

    @x1
    public static gr0 e(String str) {
        return new gr0(f, str);
    }

    @x1
    public static gr0 h(String str) {
        return new gr0(e, str);
    }

    @x1
    public static gr0 i(String str) {
        return new gr0(b, str);
    }

    @x1
    public static gr0 j(String str) {
        return new gr0(d, str);
    }

    @z1
    public String f() {
        return this.i;
    }

    @x1
    public String g() {
        return this.h;
    }

    @x1
    public String toString() {
        StringBuilder K = wo1.K("AuthMethod{", "type='");
        wo1.d0(K, this.h, '\'', ", accessToken='");
        K.append(this.i);
        K.append('\'');
        K.append('}');
        return K.toString();
    }

    private gr0(@x1 String str, @x1 String str2) {
        this.h = str;
        this.i = str2;
    }
}