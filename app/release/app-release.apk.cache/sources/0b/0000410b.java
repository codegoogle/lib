package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Collections;
import java.util.Map;

/* compiled from: ParameterizedHeader.java */
/* loaded from: classes3.dex */
public class et3 {
    private String a;
    private Map<String, String> b;

    public et3(String str) throws ParseException {
        this(kt3.g(str));
    }

    public Map<String, String> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public et3(kt3 kt3Var) throws ParseException {
        kt3Var.e();
        this.a = "";
        while (kt3Var.e() && !kt3Var.f(';', false)) {
            kt3Var.i();
            this.a += kt3Var.b();
        }
        if (kt3Var.e()) {
            this.b = kt3.G(kt3Var);
        }
        Map<String, String> map = this.b;
        if (map == null) {
            this.b = Collections.emptyMap();
        } else {
            this.b = Collections.unmodifiableMap(map);
        }
    }
}