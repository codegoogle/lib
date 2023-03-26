package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: WormDrawer.java */
/* loaded from: classes3.dex */
public class er3 extends uq3 {
    public RectF c;

    public er3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
        this.c = new RectF();
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2) {
        if (rp3Var instanceof zp3) {
            zp3 zp3Var = (zp3) rp3Var;
            int b = zp3Var.b();
            int a = zp3Var.a();
            int l = this.b.l();
            int s = this.b.s();
            int o = this.b.o();
            if (this.b.f() == qq3.HORIZONTAL) {
                RectF rectF = this.c;
                rectF.left = b;
                rectF.right = a;
                rectF.top = i2 - l;
                rectF.bottom = i2 + l;
            } else {
                RectF rectF2 = this.c;
                rectF2.left = i - l;
                rectF2.right = i + l;
                rectF2.top = b;
                rectF2.bottom = a;
            }
            this.a.setColor(s);
            float f = i;
            float f2 = i2;
            float f3 = l;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(o);
            canvas.drawRoundRect(this.c, f3, f3, this.a);
        }
    }
}