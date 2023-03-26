package com.p7700g.p99005;

import com.p7700g.p99005.mn4;

/* compiled from: NewCookie.java */
/* loaded from: classes3.dex */
public class vm4 extends pm4 {
    public static final int h = -1;
    private static final mn4.a<vm4> i = mn4.g().b(vm4.class);
    private String j;
    private int k;
    private boolean l;

    public vm4(String str, String str2) {
        super(str, str2);
        this.j = null;
        this.k = -1;
        this.l = false;
    }

    public static vm4 k(String str) throws IllegalArgumentException {
        return i.a(str);
    }

    @Override // com.p7700g.p99005.pm4
    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            vm4 vm4Var = (vm4) obj;
            if (b() == vm4Var.b() || (b() != null && b().equals(vm4Var.b()))) {
                if ((d() == vm4Var.d() || (d() != null && d().equals(vm4Var.d()))) && e() == vm4Var.e()) {
                    if (c() == vm4Var.c() || (c() != null && c().equals(vm4Var.c()))) {
                        if (a() == vm4Var.a() || (a() != null && a().equals(vm4Var.a()))) {
                            String str = this.j;
                            String str2 = vm4Var.j;
                            return (str == str2 || (str != null && str.equals(str2))) && this.k == vm4Var.k && this.l == vm4Var.l;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String g() {
        return this.j;
    }

    public int h() {
        return this.k;
    }

    @Override // com.p7700g.p99005.pm4
    public int hashCode() {
        int hashCode = super.hashCode() * 59;
        String str = this.j;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 59) + this.k) * 59) + (this.l ? 1 : 0);
    }

    public boolean i() {
        return this.l;
    }

    public pm4 j() {
        return new pm4(b(), d(), c(), a(), e());
    }

    @Override // com.p7700g.p99005.pm4
    public String toString() {
        return i.b(this);
    }

    public vm4(String str, String str2, String str3, String str4, String str5, int i2, boolean z) {
        super(str, str2, str3, str4);
        this.j = null;
        this.k = -1;
        this.l = false;
        this.j = str5;
        this.k = i2;
        this.l = z;
    }

    public vm4(String str, String str2, String str3, String str4, int i2, String str5, int i3, boolean z) {
        super(str, str2, str3, str4, i2);
        this.j = null;
        this.k = -1;
        this.l = false;
        this.j = str5;
        this.k = i3;
        this.l = z;
    }

    public vm4(pm4 pm4Var) {
        super(pm4Var == null ? null : pm4Var.b(), pm4Var == null ? null : pm4Var.d(), pm4Var == null ? null : pm4Var.c(), pm4Var == null ? null : pm4Var.a(), pm4Var == null ? 1 : pm4Var.e());
        this.j = null;
        this.k = -1;
        this.l = false;
    }

    public vm4(pm4 pm4Var, String str, int i2, boolean z) {
        this(pm4Var);
        this.j = str;
        this.k = i2;
        this.l = z;
    }
}