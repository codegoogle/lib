package com.p7700g.p99005;

/* compiled from: Purchase.java */
/* loaded from: classes.dex */
public class ur0 {
    @mw2("id")
    private long a;
    @x1
    @mw2("type")
    private String b;
    @mw2("checkTime")
    private long c;

    public ur0(long j, @x1 String str, long j2) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    @x1
    public String c() {
        return this.b;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Purchase{id=");
        G.append(this.a);
        G.append(", type='");
        wo1.d0(G, this.b, '\'', ", checkTime=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}