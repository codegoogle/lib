package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: SlideDrawer.java */
/* loaded from: classes3.dex */
public class br3 extends uq3 {
    public br3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2) {
        if (rp3Var instanceof wp3) {
            int a = ((wp3) rp3Var).a();
            int s = this.b.s();
            int o = this.b.o();
            int l = this.b.l();
            this.a.setColor(s);
            float f = i;
            float f2 = i2;
            float f3 = l;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(o);
            if (this.b.f() == qq3.HORIZONTAL) {
                canvas.drawCircle(a, f2, f3, this.a);
            } else {
                canvas.drawCircle(f, a, f3, this.a);
            }
        }
    }
}