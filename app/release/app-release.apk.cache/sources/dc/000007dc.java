package com.anythink.expressad.foundation.d;

import com.p7700g.p99005.wo1;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {
    public static final String a = "cid";
    public static final String b = "click_type";
    public static final String c = "network_type";
    public static final String d = "network_str";
    public static final String e = "click_duration";
    public static final String f = "last_url";
    public static final String g = "type";
    public static final String h = "code";
    public static final String i = "exception";
    public static final String j = "header";
    public static final String k = "content";
    public static final String l = "network_type";
    public static final String m = "rid";
    public static final String n = "key";
    public static final String o = "rid_n";
    public static final String p = "unit_id";
    public static final String q = "landing_type";
    public static final String r = "link_type";
    public static final String s = "click_time";
    public static final String t = "market_result";
    public static final String u = "2000013";
    public static final String v = "2000012";
    private String A;
    private int B;
    private String C;
    private String D;
    private String E;
    private int F;
    private int G;
    private String H;
    private int I;
    private int J;
    private String K;
    private int L;
    private String M;
    private int N;
    private int w;
    private String x;
    private String y;
    private String z;

    public f() {
    }

    private int b() {
        return this.N;
    }

    private int c() {
        return this.L;
    }

    private String d() {
        return this.M;
    }

    private void e(int i2) {
        this.N = i2;
    }

    private void f(int i2) {
        this.L = i2;
    }

    private int g() {
        return this.J;
    }

    private String h() {
        return this.K;
    }

    private int i() {
        return this.G;
    }

    private void j(String str) {
        this.M = str;
    }

    private int k() {
        return this.B;
    }

    private String l() {
        return this.D;
    }

    private String m() {
        return this.E;
    }

    private int n() {
        return this.F;
    }

    private String o() {
        return this.A;
    }

    private String p() {
        return this.y;
    }

    private String q() {
        return this.z;
    }

    private int r() {
        return this.w;
    }

    private String s() {
        return this.x;
    }

    public final void a(String str) {
        this.H = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.y);
        sb.append(", click_duration=");
        sb.append(this.z);
        sb.append(", lastUrl=");
        sb.append(this.A);
        sb.append(", code=");
        sb.append(this.B);
        sb.append(", excepiton=");
        sb.append(this.C);
        sb.append(", header=");
        sb.append(this.D);
        sb.append(", content=");
        sb.append(this.E);
        sb.append(", type=");
        sb.append(this.F);
        sb.append(", click_type=");
        return wo1.z(sb, this.G, "]");
    }

    private f(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, int i3, int i4, String str8, int i5, int i6, String str9, int i7, int i8, String str10) {
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = i2;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = i3;
        this.G = i4;
        this.H = str8;
        this.I = i5;
        this.J = i6;
        this.K = str9;
        this.L = i7;
        this.M = str10;
        this.N = i8;
    }

    private String e() {
        return this.H;
    }

    private int f() {
        return this.I;
    }

    private String j() {
        return this.C;
    }

    public final void a(int i2) {
        this.I = i2;
    }

    public final void b(int i2) {
        this.J = i2;
    }

    public final void c(String str) {
        this.C = str;
    }

    public final void d(String str) {
        this.D = str;
    }

    public final void g(String str) {
        this.y = str;
    }

    public final void h(String str) {
        this.z = str;
    }

    public final void i(String str) {
        this.x = str;
    }

    private void g(int i2) {
        this.w = i2;
    }

    public final void a() {
        this.G = 1;
    }

    public final void b(String str) {
        this.K = str;
    }

    public final void c(int i2) {
        this.B = i2;
    }

    public final void d(int i2) {
        this.F = i2;
    }

    public final void e(String str) {
        this.E = str;
    }

    public final void f(String str) {
        this.A = str;
    }

    public static String a(List<f> list) {
        if (list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (f fVar : list) {
                sb.append("rid_n=" + fVar.x);
                sb.append("&cid=" + fVar.y);
                sb.append("&click_type=" + fVar.G);
                sb.append("&type=" + fVar.F);
                sb.append("&click_duration=" + fVar.z);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + fVar.H);
                sb.append("&last_url=" + fVar.A);
                sb.append("&content=" + fVar.E);
                sb.append("&code=" + fVar.B);
                sb.append("&exception=" + fVar.C);
                sb.append("&header=" + fVar.D);
                sb.append("&landing_type=" + fVar.I);
                sb.append("&link_type=" + fVar.J);
                sb.append("&click_time=" + fVar.K + "\n");
            }
            return sb.toString();
        }
        return null;
    }

    private static String a(f fVar) {
        if (fVar != null) {
            StringBuilder sb = new StringBuilder();
            String str = fVar.A;
            sb.append("rid_n=" + fVar.x);
            sb.append("&click_type=" + fVar.G);
            sb.append("&type=" + fVar.F);
            sb.append("&cid=" + fVar.y);
            sb.append("&click_duration=" + fVar.z);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + fVar.H);
            sb.append("&last_url=".concat(String.valueOf(str)));
            sb.append("&code=" + fVar.B);
            sb.append("&exception=" + fVar.C);
            sb.append("&landing_type=" + fVar.I);
            sb.append("&link_type=" + fVar.J);
            sb.append("&click_time=" + fVar.K + "\n");
            return sb.toString();
        }
        return null;
    }
}