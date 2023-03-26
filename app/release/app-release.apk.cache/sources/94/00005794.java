package com.p7700g.p99005;

/* compiled from: NetworkStatus.java */
/* loaded from: classes.dex */
public class q71 {
    @x1
    private final b a;
    @x1
    private final String b;
    @x1
    private final String c;
    @x1
    private final a d;

    /* compiled from: NetworkStatus.java */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        OPEN,
        SECURE
    }

    /* compiled from: NetworkStatus.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        WIFI,
        MOBILE,
        LAN
    }

    @r2(otherwise = 3)
    public q71(@x1 b bVar, @x1 String str, @x1 String str2, @x1 a aVar) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    @x1
    public String a() {
        return this.c;
    }

    public a b() {
        return this.d;
    }

    @x1
    public String c() {
        return this.b;
    }

    @x1
    public b d() {
        return this.a;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return this.a == q71Var.a && this.b.equals(q71Var.b) && this.c.equals(q71Var.c) && this.d == q71Var.d;
    }

    public int hashCode() {
        return this.d.hashCode() + wo1.x(this.c, wo1.x(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder K = wo1.K("NetworkStatus{", "type=");
        K.append(this.a);
        K.append(", ssid='");
        wo1.d0(K, this.b, '\'', ", bssid='");
        wo1.d0(K, this.c, '\'', ", security=");
        K.append(this.d);
        K.append('}');
        return K.toString();
    }
}