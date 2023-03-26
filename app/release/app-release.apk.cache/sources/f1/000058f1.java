package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes2.dex */
public class qv1 implements nq1<Drawable> {
    private final nq1<Bitmap> c;
    private final boolean d;

    public qv1(nq1<Bitmap> nq1Var, boolean z) {
        this.c = nq1Var;
        this.d = z;
    }

    private cs1<Drawable> d(Context context, cs1<Bitmap> cs1Var) {
        return xv1.e(context.getResources(), cs1Var);
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }

    @Override // com.p7700g.p99005.nq1
    @x1
    public cs1<Drawable> b(@x1 Context context, @x1 cs1<Drawable> cs1Var, int i, int i2) {
        ls1 h = yo1.e(context).h();
        Drawable drawable = cs1Var.get();
        cs1<Bitmap> a = pv1.a(h, drawable, i, i2);
        if (a == null) {
            if (this.d) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return cs1Var;
        }
        cs1<Bitmap> b = this.c.b(context, a, i, i2);
        if (b.equals(a)) {
            b.a();
            return cs1Var;
        }
        return d(context, b);
    }

    public nq1<BitmapDrawable> c() {
        return this;
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof qv1) {
            return this.c.equals(((qv1) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }
}