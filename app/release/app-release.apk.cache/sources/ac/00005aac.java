package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Map;

/* compiled from: AcceptableMediaType.java */
/* loaded from: classes3.dex */
public class rs3 extends tm4 implements ft3 {
    private final int I;

    public rs3(String str, String str2) {
        super(str, str2);
        this.I = 1000;
    }

    public static rs3 i(kt3 kt3Var) throws ParseException {
        String str;
        String str2;
        kt3Var.e();
        String p = kt3Var.p();
        if (kt3Var.f(j14.P, false)) {
            kt3Var.j(false);
            str = kt3Var.p();
        } else {
            str = tm4.g;
        }
        Map<String, String> map = null;
        int i = 1000;
        if (kt3Var.e() && (map = kt3.G(kt3Var)) != null && (str2 = map.get("q")) != null) {
            i = kt3.I(str2);
        }
        return new rs3(p, str, i, map);
    }

    @Override // com.p7700g.p99005.ft3
    public int a() {
        return this.I;
    }

    public rs3(String str, String str2, int i, Map<String, String> map) {
        super(str, str2, map);
        this.I = i;
    }
}