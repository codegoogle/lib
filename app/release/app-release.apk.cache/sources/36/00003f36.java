package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: ThinWormDrawer.java */
/* loaded from: classes3.dex */
public class dr3 extends er3 {
    public dr3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    @Override // com.p7700g.p99005.er3
    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2) {
        if (rp3Var instanceof yp3) {
            yp3 yp3Var = (yp3) rp3Var;
            int b = yp3Var.b();
            int a = yp3Var.a();
            int e = yp3Var.e() / 2;
            int l = this.b.l();
            int s = this.b.s();
            int o = this.b.o();
            if (this.b.f() == qq3.HORIZONTAL) {
                RectF rectF = this.c;
                rectF.left = b;
                rectF.right = a;
                rectF.top = i2 - e;
                rectF.bottom = e + i2;
            } else {
                RectF rectF2 = this.c;
                rectF2.left = i - e;
                rectF2.right = e + i;
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