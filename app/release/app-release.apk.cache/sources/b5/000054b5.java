package com.p7700g.p99005;

import java.math.BigInteger;

/* compiled from: VASTMediaFile.java */
/* loaded from: classes3.dex */
public class op5 {
    private String a;
    private String b;
    private String c;
    private String d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private Boolean h;
    private Boolean i;
    private String j;

    public String a() {
        return this.j;
    }

    public BigInteger b() {
        return this.e;
    }

    public String c() {
        return this.c;
    }

    public BigInteger d() {
        return this.g;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.a;
    }

    public BigInteger h() {
        return this.f;
    }

    public Boolean i() {
        return this.i;
    }

    public Boolean j() {
        return this.h;
    }

    public void k(String value) {
        this.j = value;
    }

    public void l(BigInteger value) {
        this.e = value;
    }

    public void m(String value) {
        this.c = value;
    }

    public void n(BigInteger value) {
        this.g = value;
    }

    public void o(String value) {
        this.b = value;
    }

    public void p(Boolean value) {
        this.i = value;
    }

    public void q(Boolean value) {
        this.h = value;
    }

    public void r(String value) {
        this.d = value;
    }

    public void s(String value) {
        this.a = value;
    }

    public void t(BigInteger value) {
        this.f = value;
    }

    public String toString() {
        StringBuilder G = wo1.G("MediaFile [value=");
        G.append(this.a);
        G.append(", id=");
        G.append(this.b);
        G.append(", delivery=");
        G.append(this.c);
        G.append(", type=");
        G.append(this.d);
        G.append(", bitrate=");
        G.append(this.e);
        G.append(", width=");
        G.append(this.f);
        G.append(", height=");
        G.append(this.g);
        G.append(", scalable=");
        G.append(this.h);
        G.append(", maintainAspectRatio=");
        G.append(this.i);
        G.append(", apiFramework=");
        return wo1.C(G, this.j, "]");
    }
}