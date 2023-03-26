package com.p7700g.p99005;

/* compiled from: Bundle.java */
/* loaded from: classes.dex */
public class lr0 {
    @mw2("id")
    private long a;
    @mw2("name")
    @z1
    private String b;
    @mw2("devices_limit")
    private long c;
    @mw2("sessions_limit")
    private long d;

    public long a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    @z1
    public String c() {
        return this.b;
    }

    public long d() {
        return this.d;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Bundle{id=");
        G.append(this.a);
        G.append(", name='");
        wo1.d0(G, this.b, '\'', ", devicesLimit=");
        G.append(this.c);
        G.append(", sessionsLimit=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}