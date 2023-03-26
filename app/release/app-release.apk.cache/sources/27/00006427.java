package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: ColorDrawer.java */
/* loaded from: classes3.dex */
public class wq3 extends uq3 {
    public wq3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2, int i3) {
        if (rp3Var instanceof sp3) {
            sp3 sp3Var = (sp3) rp3Var;
            float l = this.b.l();
            int o = this.b.o();
            int p = this.b.p();
            int q = this.b.q();
            int e = this.b.e();
            if (this.b.x()) {
                if (i == q) {
                    o = sp3Var.a();
                } else if (i == p) {
                    o = sp3Var.b();
                }
            } else if (i == p) {
                o = sp3Var.a();
            } else if (i == e) {
                o = sp3Var.b();
            }
            this.a.setColor(o);
            canvas.drawCircle(i2, i3, l, this.a);
        }
    }
}