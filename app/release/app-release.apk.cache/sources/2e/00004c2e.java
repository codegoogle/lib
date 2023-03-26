package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: CanvasCompat.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class kb2 {
    private kb2() {
    }

    public static int a(@x1 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }

    public static int b(@x1 Canvas canvas, @z1 RectF rectF, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        return canvas.saveLayerAlpha(rectF, i, 31);
    }
}