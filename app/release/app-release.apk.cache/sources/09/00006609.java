package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: DropDrawer.java */
/* loaded from: classes3.dex */
public class xq3 extends uq3 {
    public xq3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2) {
        if (rp3Var instanceof tp3) {
            tp3 tp3Var = (tp3) rp3Var;
            int s = this.b.s();
            int o = this.b.o();
            this.a.setColor(s);
            canvas.drawCircle(i, i2, this.b.l(), this.a);
            this.a.setColor(o);
            if (this.b.f() == qq3.HORIZONTAL) {
                canvas.drawCircle(tp3Var.c(), tp3Var.a(), tp3Var.b(), this.a);
            } else {
                canvas.drawCircle(tp3Var.a(), tp3Var.c(), tp3Var.b(), this.a);
            }
        }
    }
}