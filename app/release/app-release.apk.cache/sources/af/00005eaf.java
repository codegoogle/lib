package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: Drawer.java */
/* loaded from: classes3.dex */
public class tq3 {
    private vq3 a;
    private wq3 b;
    private ar3 c;
    private er3 d;
    private br3 e;
    private yq3 f;
    private dr3 g;
    private xq3 h;
    private cr3 i;
    private zq3 j;
    private int k;
    private int l;
    private int m;

    public tq3(@x1 pq3 pq3Var) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.a = new vq3(paint, pq3Var);
        this.b = new wq3(paint, pq3Var);
        this.c = new ar3(paint, pq3Var);
        this.d = new er3(paint, pq3Var);
        this.e = new br3(paint, pq3Var);
        this.f = new yq3(paint, pq3Var);
        this.g = new dr3(paint, pq3Var);
        this.h = new xq3(paint, pq3Var);
        this.i = new cr3(paint, pq3Var);
        this.j = new zq3(paint, pq3Var);
    }

    public void a(@x1 Canvas canvas, boolean z) {
        if (this.b != null) {
            this.a.a(canvas, this.k, z, this.l, this.m);
        }
    }

    public void b(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            wq3Var.a(canvas, rp3Var, this.k, this.l, this.m);
        }
    }

    public void c(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        xq3 xq3Var = this.h;
        if (xq3Var != null) {
            xq3Var.a(canvas, rp3Var, this.l, this.m);
        }
    }

    public void d(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        yq3 yq3Var = this.f;
        if (yq3Var != null) {
            yq3Var.a(canvas, rp3Var, this.k, this.l, this.m);
        }
    }

    public void e(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        ar3 ar3Var = this.c;
        if (ar3Var != null) {
            ar3Var.a(canvas, rp3Var, this.k, this.l, this.m);
        }
    }

    public void f(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        zq3 zq3Var = this.j;
        if (zq3Var != null) {
            zq3Var.a(canvas, rp3Var, this.k, this.l, this.m);
        }
    }

    public void g(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        br3 br3Var = this.e;
        if (br3Var != null) {
            br3Var.a(canvas, rp3Var, this.l, this.m);
        }
    }

    public void h(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        cr3 cr3Var = this.i;
        if (cr3Var != null) {
            cr3Var.a(canvas, rp3Var, this.k, this.l, this.m);
        }
    }

    public void i(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        dr3 dr3Var = this.g;
        if (dr3Var != null) {
            dr3Var.a(canvas, rp3Var, this.l, this.m);
        }
    }

    public void j(@x1 Canvas canvas, @x1 rp3 rp3Var) {
        er3 er3Var = this.d;
        if (er3Var != null) {
            er3Var.a(canvas, rp3Var, this.l, this.m);
        }
    }

    public void k(int i, int i2, int i3) {
        this.k = i;
        this.l = i2;
        this.m = i3;
    }
}