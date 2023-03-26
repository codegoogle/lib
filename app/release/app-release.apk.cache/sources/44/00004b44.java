package com.p7700g.p99005;

/* compiled from: User.java */
/* loaded from: classes.dex */
public class jt0 {
    @mw2("subscriber")
    @z1
    private wr0 a;
    @x1
    @mw2("access_token")
    private String b;

    public jt0(@x1 String str) {
        this.b = str;
    }

    @x1
    public String a() {
        return this.b;
    }

    @z1
    public wr0 b() {
        return this.a;
    }

    public String toString() {
        StringBuilder G = wo1.G("User{subscriber=");
        wr0 wr0Var = this.a;
        G.append(wr0Var == null ? pg1.d : wr0Var.toString());
        G.append(", accessToken='");
        G.append(this.b);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}