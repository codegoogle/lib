package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.partner.celpher.PartnerCelpher;
import com.p7700g.p99005.bt0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PartnerApiBuilder.java */
/* loaded from: classes.dex */
public class fr0 {
    @z1
    private br0 a;
    @z1
    private at0 b;
    @z1
    private st0 c;
    @z1
    private ClientInfo d;
    @z1
    private vs0 e;
    @z1
    private ss0 f;
    @x1
    private Map<String, Set<String>> g = new HashMap();
    @z1
    private String h;
    @z1
    private String i;
    @z1
    private ot0 j;
    @z1
    private PartnerCelpher k;
    @z1
    private Context l;
    @z1
    private Executor m;

    @x1
    public fr0 a(@x1 String str, @x1 String str2) {
        Set<String> set = this.g.get(str);
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(str2);
        this.g.put(str, set);
        return this;
    }

    @x1
    public fr0 b(@x1 String str) {
        this.h = str;
        return this;
    }

    @x1
    public er0 c() {
        if (this.l != null) {
            if (this.j != null) {
                if (this.d != null) {
                    if (this.e != null) {
                        if (this.f != null) {
                            if (this.h != null) {
                                if (this.i != null) {
                                    if (this.a != null) {
                                        if (this.k != null) {
                                            if (this.b == null) {
                                                this.b = new bt0.d().f(this.g).g();
                                            }
                                            if (this.c == null) {
                                                this.c = new qt0();
                                            }
                                            if (this.m == null) {
                                                this.m = Executors.newSingleThreadExecutor();
                                            }
                                            return new us0(this.l, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.a, this.k, this.m);
                                        }
                                        throw new IllegalStateException("partnerCelpher is required");
                                    }
                                    throw new IllegalStateException("urlRotator is required");
                                }
                                throw new IllegalStateException("SDK version is required");
                            }
                            throw new IllegalStateException("App version is required");
                        }
                        throw new IllegalStateException("Token repository is required");
                    }
                    throw new IllegalStateException("Token repository is required");
                }
                throw new IllegalStateException("Client info required");
            }
            throw new IllegalStateException("deviceIDProvider required");
        }
        throw new IllegalStateException("Context required");
    }

    @x1
    public fr0 d(@x1 ClientInfo clientInfo) {
        this.d = clientInfo;
        return this;
    }

    @x1
    public fr0 e(@x1 ss0 ss0Var) {
        this.f = ss0Var;
        return this;
    }

    @x1
    public fr0 f(@x1 st0 st0Var) {
        this.c = st0Var;
        return this;
    }

    @x1
    public fr0 g(@x1 at0 at0Var) {
        this.b = at0Var;
        return this;
    }

    @x1
    public fr0 h(@x1 String str) {
        this.i = str;
        return this;
    }

    @x1
    public fr0 i(@x1 Context context) {
        this.l = context;
        return this;
    }

    @x1
    public fr0 j(@x1 ot0 ot0Var) {
        this.j = ot0Var;
        return this;
    }

    @x1
    public fr0 k(@z1 Executor executor) {
        this.m = executor;
        return this;
    }

    @x1
    public fr0 l(@z1 PartnerCelpher partnerCelpher) {
        this.k = partnerCelpher;
        return this;
    }

    @x1
    public fr0 m(@x1 vs0 vs0Var) {
        this.e = vs0Var;
        return this;
    }

    @x1
    public fr0 n(@x1 br0 br0Var) {
        this.a = br0Var;
        return this;
    }
}