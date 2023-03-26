package com.p7700g.p99005;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes2.dex */
public final class kr1 implements gq1 {
    private final gq1 c;
    private final gq1 d;

    public kr1(gq1 gq1Var, gq1 gq1Var2) {
        this.c = gq1Var;
        this.d = gq1Var2;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        this.c.a(messageDigest);
        this.d.a(messageDigest);
    }

    public gq1 c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof kr1) {
            kr1 kr1Var = (kr1) obj;
            return this.c.equals(kr1Var.c) && this.d.equals(kr1Var.d);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        StringBuilder G = wo1.G("DataCacheKey{sourceKey=");
        G.append(this.c);
        G.append(", signature=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}