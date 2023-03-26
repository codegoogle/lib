package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class j extends e {
    private int a;

    public j(ImageView imageView, int i) {
        super(imageView);
        this.a = i;
    }

    @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled() || (a = com.anythink.expressad.foundation.h.m.a(bitmap, this.a)) == null) {
                return;
            }
            this.c.get().setImageBitmap(a);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
        }
    }
}