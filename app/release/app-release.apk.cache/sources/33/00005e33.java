package com.p7700g.p99005;

/* compiled from: OpenVpnConfigWrapper.java */
/* loaded from: classes3.dex */
public class th3 {
    @x1
    @mw2("config")
    public String a;
    @x1
    @mw2("username")
    public String b;
    @x1
    @mw2("password")
    public String c;
    @mw2("authFile")
    @z1
    public String d;
    @mw2("apiVersion")
    @z1
    public String e;

    public th3(@x1 String str, @x1 String str2, @x1 String str3, @z1 String str4, @x1 String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @z1
    public String a() {
        return this.e;
    }

    @z1
    public String b() {
        return this.d;
    }

    @x1
    public String c() {
        return this.a;
    }

    @x1
    public String d() {
        return this.c;
    }

    @x1
    public String e() {
        return this.b;
    }
}