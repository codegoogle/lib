package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: FillDrawer.java */
/* loaded from: classes3.dex */
public class yq3 extends uq3 {
    private Paint c;

    public yq3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2, int i3) {
        if (rp3Var instanceof up3) {
            up3 up3Var = (up3) rp3Var;
            int s = this.b.s();
            float l = this.b.l();
            int r = this.b.r();
            int p = this.b.p();
            int q = this.b.q();
            int e = this.b.e();
            if (this.b.x()) {
                if (i == q) {
                    s = up3Var.a();
                    l = up3Var.e();
                    r = up3Var.g();
                } else if (i == p) {
                    s = up3Var.b();
                    l = up3Var.f();
                    r = up3Var.h();
                }
            } else if (i == p) {
                s = up3Var.a();
                l = up3Var.e();
                r = up3Var.g();
            } else if (i == e) {
                s = up3Var.b();
                l = up3Var.f();
                r = up3Var.h();
            }
            this.c.setColor(s);
            this.c.setStrokeWidth(this.b.r());
            float f = i2;
            float f2 = i3;
            canvas.drawCircle(f, f2, this.b.l(), this.c);
            this.c.setStrokeWidth(r);
            canvas.drawCircle(f, f2, l, this.c);
        }
    }
}