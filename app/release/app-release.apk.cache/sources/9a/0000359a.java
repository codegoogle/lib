package com.ironsource.sdk;

import java.util.Map;

/* loaded from: classes3.dex */
public final class b {
    public final boolean a;
    public String b;
    public String c;
    public boolean d;
    public a e;
    public Map<String, String> f;
    public com.ironsource.sdk.j.a g;
    public boolean h = false;
    public boolean i;

    public b(String str, String str2, boolean z, boolean z2, boolean z3, Map<String, String> map, com.ironsource.sdk.j.a aVar, a aVar2) {
        this.i = false;
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = z2;
        this.f = map;
        this.g = aVar;
        this.e = aVar2;
        this.i = z3;
    }

    public final boolean a() {
        a aVar = this.e;
        if (aVar != null) {
            if (aVar.b > 0 && aVar.a > 0) {
                return true;
            }
        }
        return false;
    }
}