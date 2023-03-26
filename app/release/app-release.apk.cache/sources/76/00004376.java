package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes2.dex */
public class fz1 extends mz1<Bitmap> {
    public fz1(ImageView imageView) {
        super(imageView);
    }

    @Override // com.p7700g.p99005.mz1
    /* renamed from: w */
    public void u(Bitmap bitmap) {
        ((ImageView) this.w).setImageBitmap(bitmap);
    }

    @Deprecated
    public fz1(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}