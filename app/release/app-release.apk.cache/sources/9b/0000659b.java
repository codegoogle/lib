package com.p7700g.p99005;

/* compiled from: QurekaIntModel.java */
/* loaded from: classes3.dex */
public class xg3 {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public void f(String qureka_int) {
        this.a = qureka_int;
    }

    public void g(String qureka_int_image_show) {
        this.c = qureka_int_image_show;
    }

    public void h(String qureka_int_image_ss) {
        this.e = qureka_int_image_ss;
    }

    public void i(String qureka_int_image_top) {
        this.d = qureka_int_image_top;
    }

    public void j(String qureka_open_image_url) {
        this.b = qureka_open_image_url;
    }

    public String toString() {
        StringBuilder G = wo1.G("QurekaIntModel{qureka_int='");
        wo1.d0(G, this.a, '\'', ", qureka_open_image_url='");
        wo1.d0(G, this.b, '\'', ", qureka_int_image_show='");
        wo1.d0(G, this.c, '\'', ", qureka_int_image_top='");
        wo1.d0(G, this.d, '\'', ", qureka_int_image_ss='");
        G.append(this.e);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}