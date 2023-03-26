package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: SwapDrawer.java */
/* loaded from: classes3.dex */
public class cr3 extends uq3 {
    public cr3(@x1 Paint paint, @x1 pq3 pq3Var) {
        super(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, @x1 rp3 rp3Var, int i, int i2, int i3) {
        if (rp3Var instanceof xp3) {
            xp3 xp3Var = (xp3) rp3Var;
            int o = this.b.o();
            int s = this.b.s();
            int l = this.b.l();
            int p = this.b.p();
            int q = this.b.q();
            int e = this.b.e();
            int a = xp3Var.a();
            if (this.b.x()) {
                if (i == q) {
                    a = xp3Var.a();
                } else {
                    if (i == p) {
                        a = xp3Var.b();
                    }
                    o = s;
                }
            } else if (i == e) {
                a = xp3Var.a();
            } else {
                if (i == p) {
                    a = xp3Var.b();
                }
                o = s;
            }
            this.a.setColor(o);
            if (this.b.f() == qq3.HORIZONTAL) {
                canvas.drawCircle(a, i3, l, this.a);
            } else {
                canvas.drawCircle(i2, a, l, this.a);
            }
        }
    }
}