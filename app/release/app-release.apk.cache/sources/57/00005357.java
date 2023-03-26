package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTargetFactory.java */
/* loaded from: classes2.dex */
public class nz1 {
    @x1
    public <Z> uz1<ImageView, Z> a(@x1 ImageView imageView, @x1 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new fz1(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new jz1(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}