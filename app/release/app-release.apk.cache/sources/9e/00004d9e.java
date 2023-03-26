package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: CornerRadiusTransform.java */
/* loaded from: classes4.dex */
public class ky5 implements ly5 {
    private float a;
    private Shader b;
    private final RectF c = new RectF();

    public ky5(@g1(from = 0.0d) float f) {
        f(f);
    }

    private void f(@g1(from = 0.0d) float f) {
        float max = Math.max(0.0f, f);
        if (max != this.a) {
            this.a = max;
            this.b = null;
        }
    }

    @Override // com.p7700g.p99005.ly5
    public void a(Canvas canvas, Paint paint, Bitmap bitmap) {
        if (this.a == 0.0f) {
            canvas.drawBitmap(bitmap, (Rect) null, this.c, paint);
            return;
        }
        if (this.b == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.b = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            RectF rectF = this.c;
            matrix.setTranslate(rectF.left, rectF.top);
            matrix.preScale(this.c.width() / bitmap.getWidth(), this.c.height() / bitmap.getHeight());
            this.b.setLocalMatrix(matrix);
        }
        paint.setShader(this.b);
        RectF rectF2 = this.c;
        float f = this.a;
        canvas.drawRoundRect(rectF2, f, f, paint);
    }

    @Override // com.p7700g.p99005.ly5
    public void b(Rect rect) {
        this.c.set(rect);
        this.b = null;
    }

    @x1
    public RectF c() {
        return this.c;
    }

    @g1(from = zg2.s)
    public float d() {
        return this.a;
    }

    public void e(@g1(from = 0.0d) float f) {
        f(f);
    }
}