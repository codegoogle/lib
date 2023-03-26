package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes2.dex */
public final class es1 implements gq1 {
    private static final u02<Class<?>, byte[]> c = new u02<>(50);
    private final is1 d;
    private final gq1 e;
    private final gq1 f;
    private final int g;
    private final int h;
    private final Class<?> i;
    private final jq1 j;
    private final nq1<?> k;

    public es1(is1 is1Var, gq1 gq1Var, gq1 gq1Var2, int i, int i2, nq1<?> nq1Var, Class<?> cls, jq1 jq1Var) {
        this.d = is1Var;
        this.e = gq1Var;
        this.f = gq1Var2;
        this.g = i;
        this.h = i2;
        this.k = nq1Var;
        this.i = cls;
        this.j = jq1Var;
    }

    private byte[] c() {
        u02<Class<?>, byte[]> u02Var = c;
        byte[] k = u02Var.k(this.i);
        if (k == null) {
            byte[] bytes = this.i.getName().getBytes(gq1.b);
            u02Var.o(this.i, bytes);
            return bytes;
        }
        return k;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.d.e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.g).putInt(this.h).array();
        this.f.a(messageDigest);
        this.e.a(messageDigest);
        messageDigest.update(bArr);
        nq1<?> nq1Var = this.k;
        if (nq1Var != null) {
            nq1Var.a(messageDigest);
        }
        this.j.a(messageDigest);
        messageDigest.update(c());
        this.d.f(bArr);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof es1) {
            es1 es1Var = (es1) obj;
            return this.h == es1Var.h && this.g == es1Var.g && z02.d(this.k, es1Var.k) && this.i.equals(es1Var.i) && this.e.equals(es1Var.e) && this.f.equals(es1Var.f) && this.j.equals(es1Var.j);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        int hashCode = ((((this.f.hashCode() + (this.e.hashCode() * 31)) * 31) + this.g) * 31) + this.h;
        nq1<?> nq1Var = this.k;
        if (nq1Var != null) {
            hashCode = (hashCode * 31) + nq1Var.hashCode();
        }
        int hashCode2 = this.i.hashCode();
        return this.j.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder G = wo1.G("ResourceCacheKey{sourceKey=");
        G.append(this.e);
        G.append(", signature=");
        G.append(this.f);
        G.append(", width=");
        G.append(this.g);
        G.append(", height=");
        G.append(this.h);
        G.append(", decodedResourceClass=");
        G.append(this.i);
        G.append(", transformation='");
        G.append(this.k);
        G.append('\'');
        G.append(", options=");
        G.append(this.j);
        G.append('}');
        return G.toString();
    }
}