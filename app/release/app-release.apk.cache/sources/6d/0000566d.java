package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.p7700g.p99005.i2;

/* compiled from: CubicCurveData.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class pk0 {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public pk0() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(pk0 pk0Var) {
        PointF pointF = pk0Var.c;
        g(pointF.x, pointF.y);
        PointF pointF2 = pk0Var.a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = pk0Var.b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f, float f2) {
        this.c.set(f, f2);
    }

    @x1
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public pk0(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}