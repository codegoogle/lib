package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: BitmapResource.java */
/* loaded from: classes2.dex */
public class ev1 implements cs1<Bitmap>, yr1 {
    private final Bitmap s;
    private final ls1 t;

    public ev1(@x1 Bitmap bitmap, @x1 ls1 ls1Var) {
        this.s = (Bitmap) x02.e(bitmap, "Bitmap must not be null");
        this.t = (ls1) x02.e(ls1Var, "BitmapPool must not be null");
    }

    @z1
    public static ev1 e(@z1 Bitmap bitmap, @x1 ls1 ls1Var) {
        if (bitmap == null) {
            return null;
        }
        return new ev1(bitmap, ls1Var);
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
        this.t.a(this.s);
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    /* renamed from: b */
    public Bitmap get() {
        return this.s;
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return z02.h(this.s);
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // com.p7700g.p99005.yr1
    public void initialize() {
        this.s.prepareToDraw();
    }
}