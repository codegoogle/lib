package com.p7700g.p99005;

/* compiled from: TransportConfig.java */
/* loaded from: classes.dex */
public class j51 {
    @x1
    @mw2("name")
    private final String a;
    @x1
    @mw2(kg.z0)
    private final vn1<? extends qa1> b;
    @x1
    @mw2("credentials")
    private final vn1<? extends ho1> c;

    public j51(@x1 String str, @x1 vn1<? extends qa1> vn1Var, @x1 vn1<? extends ho1> vn1Var2) {
        this.a = str;
        this.b = vn1Var;
        this.c = vn1Var2;
    }

    @x1
    public static j51 a(@x1 String str, @x1 vn1<? extends qa1> vn1Var, @x1 vn1<? extends ho1> vn1Var2) {
        return new j51(str, vn1Var, vn1Var2);
    }

    @x1
    public static j51 b(@x1 String str, @x1 Class<? extends qa1> cls, @x1 Class<? extends ho1> cls2) {
        return new j51(str, vn1.d(cls, new Object[0]), vn1.d(cls2, new Object[0]));
    }

    @x1
    public vn1<? extends ho1> c() {
        return this.c;
    }

    @x1
    public String d() {
        return this.a;
    }

    @x1
    public vn1<? extends qa1> e() {
        return this.b;
    }

    public String toString() {
        StringBuilder K = wo1.K("TransportConfig{", "name='");
        wo1.d0(K, this.a, '\'', ", vpnTransportClassSpec=");
        K.append(this.b);
        K.append(", credentialsSourceClassSpec=");
        K.append(this.c);
        K.append('}');
        return K.toString();
    }
}