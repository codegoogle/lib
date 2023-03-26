package com.p7700g.p99005;

import com.p7700g.p99005.mn4;

/* compiled from: Cookie.java */
/* loaded from: classes3.dex */
public class pm4 {
    public static final int a = 1;
    private static final mn4.a<pm4> b = mn4.g().b(pm4.class);
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;

    public pm4(String str, String str2, String str3, String str4, int i) {
        if (str != null) {
            this.c = str;
            this.d = str2;
            this.e = i;
            this.g = str4;
            this.f = str3;
            return;
        }
        throw new IllegalArgumentException("name==null");
    }

    public static pm4 f(String str) throws IllegalArgumentException {
        return b.a(str);
    }

    public String a() {
        return this.g;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            pm4 pm4Var = (pm4) obj;
            String str = this.c;
            String str2 = pm4Var.c;
            if (str == str2 || (str != null && str.equals(str2))) {
                String str3 = this.d;
                String str4 = pm4Var.d;
                if ((str3 == str4 || (str3 != null && str3.equals(str4))) && this.e == pm4Var.e) {
                    String str5 = this.f;
                    String str6 = pm4Var.f;
                    if (str5 == str6 || (str5 != null && str5.equals(str6))) {
                        String str7 = this.g;
                        String str8 = pm4Var.g;
                        if (str7 != str8) {
                            return str7 != null && str7.equals(str8);
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.c;
        int hashCode = (679 + (str != null ? str.hashCode() : 0)) * 97;
        String str2 = this.d;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 97) + this.e) * 97;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 97;
        String str4 = this.g;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return b.b(this);
    }

    public pm4(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, 1);
    }

    public pm4(String str, String str2) {
        this(str, str2, null, null);
    }
}