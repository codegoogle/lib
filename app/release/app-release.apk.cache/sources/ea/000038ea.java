package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.p7700g.p99005.i2;

/* compiled from: ShadowRenderer.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ah2 {
    private static final int a = 68;
    private static final int b = 20;
    private static final int c = 0;
    private static final int[] d = new int[3];
    private static final float[] e = {0.0f, 0.5f, 1.0f};
    private static final int[] f = new int[4];
    private static final float[] g = {0.0f, 0.0f, 0.5f, 1.0f};
    @x1
    private final Paint h;
    @x1
    private final Paint i;
    @x1
    private final Paint j;
    private int k;
    private int l;
    private int m;
    private final Path n;
    private Paint o;

    public ah2() {
        this(sr.t);
    }

    public void a(@x1 Canvas canvas, @z1 Matrix matrix, @x1 RectF rectF, int i, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.n;
        if (z) {
            int[] iArr = f;
            iArr[0] = 0;
            iArr[1] = this.m;
            iArr[2] = this.l;
            iArr[3] = this.k;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            int[] iArr2 = f;
            iArr2[0] = 0;
            iArr2[1] = this.k;
            iArr2[2] = this.l;
            iArr2[3] = this.m;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = g;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.i.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.o);
        }
        canvas.drawArc(rectF, f2, f3, true, this.i);
        canvas.restore();
    }

    public void b(@x1 Canvas canvas, @z1 Matrix matrix, @x1 RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = d;
        iArr[0] = this.m;
        iArr[1] = this.l;
        iArr[2] = this.k;
        Paint paint = this.j;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, e, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.j);
        canvas.restore();
    }

    @x1
    public Paint c() {
        return this.h;
    }

    public void d(int i) {
        this.k = fj.B(i, 68);
        this.l = fj.B(i, 20);
        this.m = fj.B(i, 0);
        this.h.setColor(this.k);
    }

    public ah2(int i) {
        this.n = new Path();
        this.o = new Paint();
        this.h = new Paint();
        d(i);
        this.o.setColor(0);
        Paint paint = new Paint(4);
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.j = new Paint(paint);
    }
}