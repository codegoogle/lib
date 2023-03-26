package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;

/* compiled from: RoundedBitmapDrawableFactory.java */
/* loaded from: classes.dex */
public final class kk {
    private static final String a = "RoundedBitmapDrawableFa";

    /* compiled from: RoundedBitmapDrawableFactory.java */
    /* loaded from: classes.dex */
    public static class a extends jk {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // com.p7700g.p99005.jk
        public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
            nq.b(i, i2, i3, rect, rect2, 0);
        }

        @Override // com.p7700g.p99005.jk
        public boolean h() {
            Bitmap bitmap = this.b;
            return bitmap != null && yi.c(bitmap);
        }

        @Override // com.p7700g.p99005.jk
        public void o(boolean z) {
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                yi.d(bitmap, z);
                invalidateSelf();
            }
        }
    }

    private kk() {
    }

    @x1
    public static jk a(@x1 Resources resources, @z1 Bitmap bitmap) {
        return new ik(resources, bitmap);
    }

    @x1
    public static jk b(@x1 Resources resources, @x1 InputStream inputStream) {
        jk a2 = a(resources, BitmapFactory.decodeStream(inputStream));
        if (a2.b() == null) {
            String str = "RoundedBitmapDrawable cannot decode " + inputStream;
        }
        return a2;
    }

    @x1
    public static jk c(@x1 Resources resources, @x1 String str) {
        jk a2 = a(resources, BitmapFactory.decodeFile(str));
        a2.b();
        return a2;
    }
}