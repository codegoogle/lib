package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes2.dex */
public final class xv1 implements cs1<BitmapDrawable>, yr1 {
    private final Resources s;
    private final cs1<Bitmap> t;

    private xv1(@x1 Resources resources, @x1 cs1<Bitmap> cs1Var) {
        this.s = (Resources) x02.d(resources);
        this.t = (cs1) x02.d(cs1Var);
    }

    @z1
    public static cs1<BitmapDrawable> e(@x1 Resources resources, @z1 cs1<Bitmap> cs1Var) {
        if (cs1Var == null) {
            return null;
        }
        return new xv1(resources, cs1Var);
    }

    @Deprecated
    public static xv1 f(Context context, Bitmap bitmap) {
        return (xv1) e(context.getResources(), ev1.e(bitmap, yo1.e(context).h()));
    }

    @Deprecated
    public static xv1 g(Resources resources, ls1 ls1Var, Bitmap bitmap) {
        return (xv1) e(resources, ev1.e(bitmap, ls1Var));
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
        this.t.a();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    /* renamed from: b */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.s, this.t.get());
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return this.t.c();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.p7700g.p99005.yr1
    public void initialize() {
        cs1<Bitmap> cs1Var = this.t;
        if (cs1Var instanceof yr1) {
            ((yr1) cs1Var).initialize();
        }
    }
}