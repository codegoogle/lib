package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: BitmapThumbnailImageViewTarget.java */
/* loaded from: classes2.dex */
public class gz1 extends tz1<Bitmap> {
    public gz1(ImageView imageView) {
        super(imageView);
    }

    @Override // com.p7700g.p99005.tz1
    /* renamed from: x */
    public Drawable w(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.w).getResources(), bitmap);
    }

    @Deprecated
    public gz1(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}