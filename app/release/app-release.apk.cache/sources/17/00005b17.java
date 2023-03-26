package com.p7700g.p99005;

import java.io.Serializable;

/* compiled from: AdaptedFunctionReference.java */
@tp4(version = "1.4")
/* loaded from: classes3.dex */
public class s05 implements v15, Serializable {
    public final Object s;
    private final Class t;
    private final String u;
    private final String v;
    private final boolean w;
    private final int x;
    private final int y;

    public s05(int i, Class cls, String str, String str2, int i2) {
        this(i, i15.s, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s05) {
            s05 s05Var = (s05) obj;
            return this.w == s05Var.w && this.x == s05Var.x && this.y == s05Var.y && c25.g(this.s, s05Var.s) && c25.g(this.t, s05Var.t) && this.u.equals(s05Var.u) && this.v.equals(s05Var.v);
        }
        return false;
    }

    public y55 h() {
        Class cls = this.t;
        if (cls == null) {
            return null;
        }
        return this.w ? c35.g(cls) : c35.d(cls);
    }

    public int hashCode() {
        Object obj = this.s;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.t;
        return ((((wo1.x(this.v, wo1.x(this.u, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.w ? 1231 : 1237)) * 31) + this.x) * 31) + this.y;
    }

    @Override // com.p7700g.p99005.v15
    public int i() {
        return this.x;
    }

    public String toString() {
        return c35.w(this);
    }

    public s05(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.s = obj;
        this.t = cls;
        this.u = str;
        this.v = str2;
        this.w = (i2 & 1) == 1;
        this.x = i;
        this.y = i2 >> 1;
    }
}