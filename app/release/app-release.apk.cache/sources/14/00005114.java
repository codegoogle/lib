package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes2.dex */
public class ms1 implements ls1 {
    @Override // com.p7700g.p99005.ls1
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.p7700g.p99005.ls1
    @x1
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.p7700g.p99005.ls1
    public void c(int i) {
    }

    @Override // com.p7700g.p99005.ls1
    public void d() {
    }

    @Override // com.p7700g.p99005.ls1
    public void e(float f) {
    }

    @Override // com.p7700g.p99005.ls1
    public long f() {
        return 0L;
    }

    @Override // com.p7700g.p99005.ls1
    @x1
    public Bitmap g(int i, int i2, Bitmap.Config config) {
        return b(i, i2, config);
    }
}