package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: MediaStoreSignature.java */
/* loaded from: classes2.dex */
public class j02 implements gq1 {
    @x1
    private final String c;
    private final long d;
    private final int e;

    public j02(@z1 String str, long j, int i) {
        this.c = str == null ? "" : str;
        this.d = j;
        this.e = i;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.d).putInt(this.e).array());
        messageDigest.update(this.c.getBytes(gq1.b));
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j02 j02Var = (j02) obj;
        return this.d == j02Var.d && this.e == j02Var.e && this.c.equals(j02Var.c);
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        long j = this.d;
        return (((this.c.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }
}