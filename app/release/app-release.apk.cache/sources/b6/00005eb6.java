package com.p7700g.p99005;

/* compiled from: PrivateGroup.java */
/* loaded from: classes.dex */
public class tr0 {
    @x1
    @mw2("name")
    private String a;

    public tr0(@x1 String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("PrivateGroup{name='");
        G.append(this.a);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}