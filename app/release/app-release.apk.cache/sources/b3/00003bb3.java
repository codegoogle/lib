package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: BitmapDrawableTransformation.java */
@Deprecated
/* loaded from: classes2.dex */
public class bv1 implements nq1<BitmapDrawable> {
    private final nq1<Drawable> c;

    public bv1(nq1<Bitmap> nq1Var) {
        this.c = (nq1) x02.d(new qv1(nq1Var, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static cs1<BitmapDrawable> c(cs1<Drawable> cs1Var) {
        if (cs1Var.get() instanceof BitmapDrawable) {
            return cs1Var;
        }
        StringBuilder G = wo1.G("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ");
        G.append(cs1Var.get());
        throw new IllegalArgumentException(G.toString());
    }

    private static cs1<Drawable> d(cs1<BitmapDrawable> cs1Var) {
        return cs1Var;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }

    @Override // com.p7700g.p99005.nq1
    @x1
    public cs1<BitmapDrawable> b(@x1 Context context, @x1 cs1<BitmapDrawable> cs1Var, int i, int i2) {
        return c(this.c.b(context, d(cs1Var), i, i2));
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof bv1) {
            return this.c.equals(((bv1) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }
}