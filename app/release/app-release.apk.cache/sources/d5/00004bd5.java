package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k33 {
    @NotNull
    public static final k33 a = new k33();

    private k33() {
    }

    @NotNull
    public final Bitmap a(@NotNull Bitmap bitmap, int i, int i2) {
        c25.p(bitmap, "bitmap");
        Bitmap b = ry2.a.b(i, i2, Bitmap.Config.ARGB_8888);
        float f = i;
        float width = f / bitmap.getWidth();
        float f2 = i2;
        float height = f2 / bitmap.getHeight();
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, f3, f4);
        Canvas canvas = new Canvas(b);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, f3 - (bitmap.getWidth() / 2), f4 - (bitmap.getHeight() / 2), new Paint(2));
        return b;
    }
}