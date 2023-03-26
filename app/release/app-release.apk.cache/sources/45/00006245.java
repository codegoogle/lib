package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: BasicDrawer.java */
/* loaded from: classes3.dex */
public class vq3 extends uq3 {
    private Paint c;

    public vq3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth(pq3Var.r());
    }

    public void a(@x1 Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float l = this.b.l();
        int r = this.b.r();
        float n = this.b.n();
        int o = this.b.o();
        int s = this.b.s();
        int p = this.b.p();
        eq3 b = this.b.b();
        if ((b == eq3.SCALE && !z) || (b == eq3.SCALE_DOWN && z)) {
            l *= n;
        }
        if (i != p) {
            o = s;
        }
        if (b == eq3.FILL && i != p) {
            paint = this.c;
            paint.setStrokeWidth(r);
        } else {
            paint = this.a;
        }
        paint.setColor(o);
        canvas.drawCircle(i2, i3, l, paint);
    }
}