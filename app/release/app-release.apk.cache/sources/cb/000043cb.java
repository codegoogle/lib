package com.p7700g.p99005;

import java.util.List;

/* compiled from: ProbeTestResult.java */
/* loaded from: classes.dex */
public class g41 {
    private final boolean a;
    private final long b;
    private final long c;
    private final long d;
    @z1
    private String e;
    @z1
    private ti1 f;
    private float g;
    @z1
    private String h;
    @z1
    private String i;
    @z1
    private List<nd1> j;

    public g41(boolean z, long j, long j2, long j3, @z1 String str, @z1 ti1 ti1Var) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = ti1Var;
    }

    public long a() {
        return this.c;
    }

    @z1
    public ti1 b() {
        return this.f;
    }

    public long c() {
        return this.b;
    }

    @z1
    public String d() {
        return this.e;
    }

    @z1
    public String e() {
        return this.h;
    }

    public float f() {
        return this.g;
    }

    @z1
    public List<nd1> g() {
        return this.j;
    }

    @z1
    public String h() {
        return this.i;
    }

    public long i() {
        return this.d;
    }

    public boolean j() {
        return this.a;
    }

    public void k(@z1 String str) {
        this.h = str;
    }

    public void l(float f) {
        this.g = f;
    }

    public void m(@x1 List<nd1> list) {
        this.j = list;
    }

    public void n(@x1 String str) {
        this.i = str;
    }

    public String toString() {
        StringBuilder G = wo1.G("ProbeTestResult{success=");
        G.append(this.a);
        G.append(", duration=");
        G.append(this.b);
        G.append(", attempt=");
        G.append(this.c);
        G.append(", startAt=");
        G.append(this.d);
        G.append(", error='");
        wo1.d0(G, this.e, '\'', ", connectionAttemptId=");
        G.append(this.f);
        G.append(", networkAvailability=");
        G.append(this.g);
        G.append(", ip='");
        wo1.d0(G, this.h, '\'', ", networkQuality='");
        G.append(this.i);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}