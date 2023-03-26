package com.p7700g.p99005;

/* compiled from: Social.java */
/* loaded from: classes.dex */
public class vr0 {
    @mw2("email")
    @z1
    private String a;
    @mw2("vpnhub")
    @z1
    private String b;

    @z1
    public String a() {
        return this.a;
    }

    @z1
    @Deprecated
    public String b() {
        return "";
    }

    @z1
    public String c() {
        return this.b;
    }

    public String toString() {
        StringBuilder K = wo1.K("Social{", "email='");
        wo1.d0(K, this.a, '\'', ", vpnhub='");
        K.append(this.b);
        K.append('\'');
        K.append('}');
        return K.toString();
    }
}