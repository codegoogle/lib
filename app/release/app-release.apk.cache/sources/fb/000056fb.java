package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes2.dex */
public final class pv1 {
    private static final String a = "DrawableToBitmap";
    private static final ls1 b = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes2.dex */
    public class a extends ms1 {
        @Override // com.p7700g.p99005.ms1, com.p7700g.p99005.ls1
        public void a(Bitmap bitmap) {
        }
    }

    private pv1() {
    }

    @z1
    public static cs1<Bitmap> a(ls1 ls1Var, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(ls1Var, current, i, i2);
            z = true;
        }
        if (!z) {
            ls1Var = b;
        }
        return ev1.e(bitmap, ls1Var);
    }

    @z1
    private static Bitmap b(ls1 ls1Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(a, 5)) {
                String str = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(a, 5)) {
                String str2 = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = ew1.i();
            i3.lock();
            Bitmap b2 = ls1Var.b(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(b2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return b2;
            } finally {
                i3.unlock();
            }
        }
    }
}