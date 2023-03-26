package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes2.dex */
public class jz1 extends mz1<Drawable> {
    public jz1(ImageView imageView) {
        super(imageView);
    }

    @Override // com.p7700g.p99005.mz1
    /* renamed from: w */
    public void u(@z1 Drawable drawable) {
        ((ImageView) this.w).setImageDrawable(drawable);
    }

    @Deprecated
    public jz1(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}