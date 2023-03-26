package com.p7700g.p99005;

/* compiled from: RemainingTraffic.java */
/* loaded from: classes.dex */
public class ht0 {
    @mw2("result")
    @z1
    private String a;
    @mw2("traffic_start")
    private long b;
    @mw2("traffic_limit")
    private long c;
    @mw2("traffic_used")
    private long d;
    @mw2("traffic_remaining")
    private long e;

    public long a() {
        return this.c;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.d;
    }

    public boolean e() {
        return it0.b.equals(this.a);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("RemainingTraffic{trafficStart=");
        G.append(this.b);
        G.append(", trafficLimit=");
        G.append(this.c);
        G.append(", trafficUsed=");
        G.append(this.d);
        G.append(", trafficRemaining=");
        G.append(this.e);
        G.append(", is unlimited=");
        G.append(e());
        G.append('}');
        return G.toString();
    }
}