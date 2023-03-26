package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: ThumbnailImageViewTarget.java */
/* loaded from: classes2.dex */
public abstract class tz1<T> extends mz1<T> {
    public tz1(ImageView imageView) {
        super(imageView);
    }

    @Override // com.p7700g.p99005.mz1
    public void u(@z1 T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.w).getLayoutParams();
        Drawable w = w(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            w = new lz1(w, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.w).setImageDrawable(w);
    }

    public abstract Drawable w(T t);

    @Deprecated
    public tz1(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}