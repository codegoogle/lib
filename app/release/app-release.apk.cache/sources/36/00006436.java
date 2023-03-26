package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* compiled from: Subscriber.java */
/* loaded from: classes.dex */
public class wr0 {
    @mw2("id")
    private long a;
    @mw2("name")
    @z1
    private String b;
    @mw2("auth_method")
    @z1
    private String c;
    @mw2("given_name")
    @z1
    private String d;
    @mw2("condition")
    private long e;
    @mw2("extred")
    @z1
    private String f;
    @mw2("bundle")
    @z1
    private lr0 g;
    @mw2("activated_devices")
    private long h;
    @mw2("active_sessions")
    private long i;
    @mw2("carrier_id")
    @z1
    private String j;
    @mw2("registration_time")
    @z1
    private Date k;
    @mw2("connection_time")
    @z1
    private Date l;
    @mw2("locale")
    @z1
    private String m;
    @mw2(kg.x0)
    @z1
    private vr0 n;
    @x1
    @mw2("purchases")
    private List<ur0> o = new ArrayList();

    public long a() {
        return this.h;
    }

    public long b() {
        return this.i;
    }

    @x1
    public String c() {
        String str = this.c;
        return str == null ? "" : str;
    }

    @z1
    public lr0 d() {
        return this.g;
    }

    @z1
    public String e() {
        return this.j;
    }

    public long f() {
        return this.e;
    }

    public long g() {
        Date date = this.l;
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @z1
    public String h() {
        return this.f;
    }

    public long i() {
        return this.a;
    }

    @z1
    public String j() {
        return this.m;
    }

    @x1
    public String k() {
        String str = this.b;
        return str == null ? "" : str;
    }

    @x1
    public List<ur0> l() {
        return Collections.unmodifiableList(this.o);
    }

    public long m() {
        Date date = this.k;
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @z1
    public vr0 n() {
        return this.n;
    }

    @x1
    public String toString() {
        StringBuilder K = wo1.K("Subscriber{", "id=");
        K.append(this.a);
        K.append(", condition=");
        K.append(this.e);
        K.append(", extref='");
        wo1.d0(K, this.f, '\'', ", bundle=");
        K.append(this.g);
        K.append(", activatedDevices=");
        K.append(this.h);
        K.append(", activeSessions=");
        K.append(this.i);
        K.append(", carrierId='");
        wo1.d0(K, this.j, '\'', ", registrationTime=");
        K.append(this.k);
        K.append(", connectionTime=");
        K.append(this.l);
        K.append(", locale='");
        wo1.d0(K, this.m, '\'', ", social=");
        K.append(this.n);
        K.append(", purchases=");
        K.append(this.o);
        K.append(", name=");
        K.append(this.b);
        K.append(", auth_method=");
        K.append(this.c);
        K.append(", given_name=");
        return wo1.B(K, this.d, '}');
    }
}