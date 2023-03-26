package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class e implements com.anythink.expressad.foundation.g.d.c {
    public static final String b = "ImageLoaderListener";
    private com.anythink.expressad.foundation.d.c a;
    public WeakReference<ImageView> c;
    private String d;

    public e(ImageView imageView) {
        this.c = new WeakReference<>(imageView);
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                com.anythink.expressad.foundation.h.n.d(b, "bitmap=null");
                return;
            }
            WeakReference<ImageView> weakReference = this.c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.c.get().setImageBitmap(bitmap);
            this.c.get().setVisibility(0);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(String str, String str2) {
    }

    public e(ImageView imageView, com.anythink.expressad.foundation.d.c cVar, String str) {
        this.c = new WeakReference<>(imageView);
        this.a = cVar;
        this.d = str;
    }
}