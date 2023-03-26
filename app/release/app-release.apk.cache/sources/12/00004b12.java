package com.p7700g.p99005;

import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes2.dex */
public final class jq1 implements gq1 {
    private final q7<iq1<?>, Object> c = new m02();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(@x1 iq1<T> iq1Var, @x1 Object obj, @x1 MessageDigest messageDigest) {
        iq1Var.h(obj, messageDigest);
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        for (int i = 0; i < this.c.size(); i++) {
            f(this.c.n(i), this.c.r(i), messageDigest);
        }
    }

    @z1
    public <T> T c(@x1 iq1<T> iq1Var) {
        return this.c.containsKey(iq1Var) ? (T) this.c.get(iq1Var) : iq1Var.d();
    }

    public void d(@x1 jq1 jq1Var) {
        this.c.o(jq1Var.c);
    }

    @x1
    public <T> jq1 e(@x1 iq1<T> iq1Var, @x1 T t) {
        this.c.put(iq1Var, t);
        return this;
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof jq1) {
            return this.c.equals(((jq1) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("Options{values=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}