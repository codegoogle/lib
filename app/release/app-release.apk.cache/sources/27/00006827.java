package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes2.dex */
public class yw1 implements nq1<vw1> {
    private final nq1<Bitmap> c;

    public yw1(nq1<Bitmap> nq1Var) {
        this.c = (nq1) x02.d(nq1Var);
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }

    @Override // com.p7700g.p99005.nq1
    @x1
    public cs1<vw1> b(@x1 Context context, @x1 cs1<vw1> cs1Var, int i, int i2) {
        vw1 vw1Var = cs1Var.get();
        cs1<Bitmap> ev1Var = new ev1(vw1Var.h(), yo1.e(context).h());
        cs1<Bitmap> b = this.c.b(context, ev1Var, i, i2);
        if (!ev1Var.equals(b)) {
            ev1Var.a();
        }
        vw1Var.r(this.c, b.get());
        return cs1Var;
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof yw1) {
            return this.c.equals(((yw1) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }
}