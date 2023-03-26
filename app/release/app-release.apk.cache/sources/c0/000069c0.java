package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: ScaleDownDrawer.java */
/* loaded from: classes3.dex */
public class zq3 extends uq3 {
    public zq3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2, int i3) {
        if (rp3Var instanceof vp3) {
            vp3 vp3Var = (vp3) rp3Var;
            float l = this.b.l();
            int o = this.b.o();
            int p = this.b.p();
            int q = this.b.q();
            int e = this.b.e();
            if (this.b.x()) {
                if (i == q) {
                    l = vp3Var.e();
                    o = vp3Var.a();
                } else if (i == p) {
                    l = vp3Var.f();
                    o = vp3Var.b();
                }
            } else if (i == p) {
                l = vp3Var.e();
                o = vp3Var.a();
            } else if (i == e) {
                l = vp3Var.f();
                o = vp3Var.b();
            }
            this.a.setColor(o);
            canvas.drawCircle(i2, i3, l, this.a);
        }
    }
}