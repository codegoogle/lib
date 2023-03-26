package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: ShapeSprite.java */
/* loaded from: classes2.dex */
public abstract class w12 extends x12 {
    private Paint W;
    private int X;
    private int Y;

    public w12() {
        y(-1);
        Paint paint = new Paint();
        this.W = paint;
        paint.setAntiAlias(true);
        this.W.setColor(this.X);
    }

    private void P() {
        int alpha = getAlpha();
        int i = this.Y;
        this.X = ((((i >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i << 8) >>> 8);
    }

    public abstract void N(Canvas canvas, Paint paint);

    public int O() {
        return this.X;
    }

    @Override // com.p7700g.p99005.x12
    public final void e(Canvas canvas) {
        this.W.setColor(this.X);
        N(canvas, this.W);
    }

    @Override // com.p7700g.p99005.x12
    public int g() {
        return this.Y;
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        P();
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.W.setColorFilter(colorFilter);
    }

    @Override // com.p7700g.p99005.x12
    public void y(int i) {
        this.Y = i;
        P();
    }
}