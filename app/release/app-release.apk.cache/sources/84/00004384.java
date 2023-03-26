package com.p7700g.p99005;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes2.dex */
public final class g02 implements gq1 {
    private final int c;
    private final gq1 d;

    private g02(int i, gq1 gq1Var) {
        this.c = i;
        this.d = gq1Var;
    }

    @x1
    public static gq1 c(@x1 Context context) {
        return new g02(context.getResources().getConfiguration().uiMode & 48, h02.c(context));
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof g02) {
            g02 g02Var = (g02) obj;
            return this.c == g02Var.c && this.d.equals(g02Var.d);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return z02.q(this.d, this.c);
    }
}