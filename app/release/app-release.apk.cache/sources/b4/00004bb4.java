package com.p7700g.p99005;

import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes2.dex */
public final class k02 implements gq1 {
    private final Object c;

    public k02(@x1 Object obj) {
        this.c = x02.d(obj);
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(this.c.toString().getBytes(gq1.b));
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof k02) {
            return this.c.equals(((k02) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("ObjectKey{object=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}