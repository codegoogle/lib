package com.p7700g.p99005;

import java.util.List;

/* compiled from: CnlConfig.java */
/* loaded from: classes.dex */
public class j21 {
    @x1
    @mw2("type")
    public final String a;
    @x1
    @mw2("ssid")
    public final List<String> b;
    @x1
    @mw2("bssid")
    public final List<String> c;
    @x1
    @mw2("action")
    public final String d;
    @mw2("authorized")
    @z1
    public final String e;

    public j21(@x1 String str, @x1 List<String> list, @x1 List<String> list2, @x1 String str2, @z1 String str3) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = str3;
    }

    @x1
    public String a() {
        return this.d;
    }

    @z1
    public String b() {
        return this.e;
    }

    @x1
    public List<String> c() {
        return this.c;
    }

    @x1
    public List<String> d() {
        return this.b;
    }

    @x1
    public String e() {
        return this.a;
    }

    public boolean f() {
        if (this.b.isEmpty() || (this.b.size() == 1 && "".equals(this.b.get(0)))) {
            return this.c.isEmpty() || (this.c.size() == 1 && "".equals(this.c.get(0)));
        }
        return false;
    }

    public String toString() {
        StringBuilder K = wo1.K("CNLConfig{", "type='");
        wo1.d0(K, this.a, '\'', ", ssid=");
        K.append(this.b);
        K.append(", bssid=");
        K.append(this.c);
        K.append(", action='");
        wo1.d0(K, this.d, '\'', ", authorized='");
        K.append(this.e);
        K.append('\'');
        K.append('}');
        return K.toString();
    }
}