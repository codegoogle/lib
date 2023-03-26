package com.p7700g.p99005;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes3.dex */
public final class xv2 extends uv2 {
    private final xw2<String, uv2> a = new xw2<>();

    public void E(String str, uv2 uv2Var) {
        xw2<String, uv2> xw2Var = this.a;
        if (uv2Var == null) {
            uv2Var = wv2.a;
        }
        xw2Var.put(str, uv2Var);
    }

    public void G(String str, Boolean bool) {
        E(str, bool == null ? wv2.a : new aw2(bool));
    }

    public void H(String str, Character ch) {
        E(str, ch == null ? wv2.a : new aw2(ch));
    }

    public void I(String str, Number number) {
        E(str, number == null ? wv2.a : new aw2(number));
    }

    public void J(String str, String str2) {
        E(str, str2 == null ? wv2.a : new aw2(str2));
    }

    @Override // com.p7700g.p99005.uv2
    /* renamed from: L */
    public xv2 a() {
        xv2 xv2Var = new xv2();
        for (Map.Entry<String, uv2> entry : this.a.entrySet()) {
            xv2Var.E(entry.getKey(), entry.getValue().a());
        }
        return xv2Var;
    }

    public Set<Map.Entry<String, uv2>> M() {
        return this.a.entrySet();
    }

    public uv2 N(String str) {
        return this.a.get(str);
    }

    public rv2 O(String str) {
        return (rv2) this.a.get(str);
    }

    public xv2 P(String str) {
        return (xv2) this.a.get(str);
    }

    public aw2 Q(String str) {
        return (aw2) this.a.get(str);
    }

    public boolean R(String str) {
        return this.a.containsKey(str);
    }

    public Set<String> S() {
        return this.a.keySet();
    }

    public uv2 T(String str) {
        return this.a.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof xv2) && ((xv2) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int size() {
        return this.a.size();
    }
}