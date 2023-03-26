package com.p7700g.p99005;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes2.dex */
public class ur1 implements gq1 {
    private final Object c;
    private final int d;
    private final int e;
    private final Class<?> f;
    private final Class<?> g;
    private final gq1 h;
    private final Map<Class<?>, nq1<?>> i;
    private final jq1 j;
    private int k;

    public ur1(Object obj, gq1 gq1Var, int i, int i2, Map<Class<?>, nq1<?>> map, Class<?> cls, Class<?> cls2, jq1 jq1Var) {
        this.c = x02.d(obj);
        this.h = (gq1) x02.e(gq1Var, "Signature must not be null");
        this.d = i;
        this.e = i2;
        this.i = (Map) x02.d(map);
        this.f = (Class) x02.e(cls, "Resource class must not be null");
        this.g = (Class) x02.e(cls2, "Transcode class must not be null");
        this.j = (jq1) x02.d(jq1Var);
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof ur1) {
            ur1 ur1Var = (ur1) obj;
            return this.c.equals(ur1Var.c) && this.h.equals(ur1Var.h) && this.e == ur1Var.e && this.d == ur1Var.d && this.i.equals(ur1Var.i) && this.f.equals(ur1Var.f) && this.g.equals(ur1Var.g) && this.j.equals(ur1Var.j);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        if (this.k == 0) {
            int hashCode = this.c.hashCode();
            this.k = hashCode;
            int hashCode2 = this.h.hashCode() + (hashCode * 31);
            this.k = hashCode2;
            int i = (hashCode2 * 31) + this.d;
            this.k = i;
            int i2 = (i * 31) + this.e;
            this.k = i2;
            int hashCode3 = this.i.hashCode() + (i2 * 31);
            this.k = hashCode3;
            int hashCode4 = this.f.hashCode() + (hashCode3 * 31);
            this.k = hashCode4;
            int hashCode5 = this.g.hashCode() + (hashCode4 * 31);
            this.k = hashCode5;
            this.k = this.j.hashCode() + (hashCode5 * 31);
        }
        return this.k;
    }

    public String toString() {
        StringBuilder G = wo1.G("EngineKey{model=");
        G.append(this.c);
        G.append(", width=");
        G.append(this.d);
        G.append(", height=");
        G.append(this.e);
        G.append(", resourceClass=");
        G.append(this.f);
        G.append(", transcodeClass=");
        G.append(this.g);
        G.append(", signature=");
        G.append(this.h);
        G.append(", hashCode=");
        G.append(this.k);
        G.append(", transformations=");
        G.append(this.i);
        G.append(", options=");
        G.append(this.j);
        G.append('}');
        return G.toString();
    }
}