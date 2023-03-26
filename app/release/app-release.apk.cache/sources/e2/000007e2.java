package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes2.dex */
public final class l {
    public static final String a = "key";
    public static final String b = "time";
    public static final String c = "ad_source_id";
    public static final String d = "num";
    public static final String e = "unit_id";
    public static final String f = "fb";
    public static final String g = "timeout";
    public static final String h = "network_type";
    public static final String i = "network_str";
    public static final String j = "2000006";
    public static final String k = "hb";
    private int l;
    private String m;
    private int n;
    private String o;
    private int p;
    private int q;
    private int r;
    private String s;
    private int t;
    private String u;

    private l(int i2, String str, int i3, String str2, int i4, int i5, int i6) {
        this.l = i2;
        this.m = str;
        this.n = i3;
        this.o = str2;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }

    private int a() {
        return this.t;
    }

    private int b() {
        return this.l;
    }

    private String c() {
        return this.m;
    }

    private String d() {
        return this.u;
    }

    private int e() {
        return this.n;
    }

    private String f() {
        return this.o;
    }

    private int g() {
        return this.p;
    }

    private int h() {
        return this.q;
    }

    private int i() {
        return this.r;
    }

    private String j() {
        return this.s;
    }

    private void a(int i2) {
        this.t = i2;
    }

    private void b(int i2) {
        this.l = i2;
    }

    private void c(int i2) {
        this.n = i2;
    }

    private void d(int i2) {
        this.p = i2;
    }

    private void e(int i2) {
        this.q = i2;
    }

    private void f(int i2) {
        this.r = i2;
    }

    private void a(String str) {
        this.m = str;
    }

    private void b(String str) {
        this.u = str;
    }

    private void c(String str) {
        this.o = str;
    }

    private void d(String str) {
        this.s = str;
    }

    private static String a(List<l> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (l lVar : list) {
            stringBuffer.append("ad_source_id=" + lVar.l);
            stringBuffer.append("&time=" + lVar.m);
            stringBuffer.append("&num=" + lVar.n);
            stringBuffer.append("&unit_id=" + lVar.o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + lVar.p);
            if (lVar.t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + lVar.q + "\n");
        }
        return stringBuffer.toString();
    }

    public l() {
    }
}