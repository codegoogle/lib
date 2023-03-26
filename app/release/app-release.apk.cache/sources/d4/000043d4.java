package com.p7700g.p99005;

import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.SessionConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SwitcherStartConfig.java */
/* loaded from: classes.dex */
public class g51 {
    @x1
    @mw2("sessionConfig")
    private final SessionConfig a;
    @x1
    @mw2("clientInfo")
    private final ClientInfo b;
    @mw2("credentials")
    @z1
    private final ft0 c;
    @mw2("remoteConfig")
    @z1
    private final mr0 d;
    @z1
    private final z21 e;
    @mw2("updateRules")
    private final boolean f;
    @mw2("fastStart")
    private final boolean g;
    private final boolean h;

    public g51(@x1 SessionConfig sessionConfig, @x1 ClientInfo clientInfo, @z1 ft0 ft0Var, @z1 mr0 mr0Var, @z1 z21 z21Var, boolean z, boolean z2, boolean z3) {
        this.a = sessionConfig;
        this.b = clientInfo;
        this.c = ft0Var;
        this.d = mr0Var;
        this.e = z21Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @x1
    public ClientInfo a() {
        return this.b;
    }

    @z1
    public ft0 b() {
        return this.c;
    }

    @x1
    public Map<String, String> c() {
        HashMap hashMap = new HashMap();
        z21 z21Var = this.e;
        if (z21Var != null) {
            hashMap.put("debug_geoip_country", z21Var.a());
            hashMap.put("debug_geoip_region", this.e.b());
            hashMap.put("debug_geoip_state", this.e.c());
        }
        return hashMap;
    }

    @z1
    public mr0 d() {
        return this.d;
    }

    @x1
    public SessionConfig e() {
        return this.a;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.f;
    }
}