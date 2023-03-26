package com.p7700g.p99005;

/* compiled from: Tracking.java */
/* loaded from: classes3.dex */
public class np5 {
    private String a;
    private mp5 b;

    public mp5 a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void c(mp5 event) {
        this.b = event;
    }

    public void d(String value) {
        this.a = value;
    }

    public String toString() {
        StringBuilder G = wo1.G("Tracking [event=");
        G.append(this.b);
        G.append(", value=");
        return wo1.C(G, this.a, "]");
    }
}