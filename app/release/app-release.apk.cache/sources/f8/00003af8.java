package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes3.dex */
public final class bg2 extends hg2<eg2> {
    private int c;
    private float d;
    private float e;
    private float f;

    public bg2(@x1 eg2 eg2Var) {
        super(eg2Var);
        this.c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    private int i() {
        S s = this.a;
        return (((eg2) s).h * 2) + ((eg2) s).g;
    }

    @Override // com.p7700g.p99005.hg2
    public void a(@x1 Canvas canvas, @g1(from = 0.0d, to = 1.0d) float f) {
        S s;
        S s2 = this.a;
        float f2 = (((eg2) s2).g / 2.0f) + ((eg2) s2).h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.c = ((eg2) this.a).i == 0 ? 1 : -1;
        this.d = ((eg2) s).a * f;
        this.e = ((eg2) s).b * f;
        this.f = (((eg2) s).g - ((eg2) s).a) / 2.0f;
        if ((this.b.n() && ((eg2) this.a).e == 2) || (this.b.m() && ((eg2) this.a).f == 1)) {
            this.f = (((1.0f - f) * ((eg2) this.a).a) / 2.0f) + this.f;
        } else if ((this.b.n() && ((eg2) this.a).e == 1) || (this.b.m() && ((eg2) this.a).f == 2)) {
            this.f -= ((1.0f - f) * ((eg2) this.a).a) / 2.0f;
        }
    }

    @Override // com.p7700g.p99005.hg2
    public void b(@x1 Canvas canvas, @x1 Paint paint, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @w0 int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        int i2 = this.c;
        float f3 = f * 360.0f * i2;
        float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * i2;
        float f5 = this.f;
        canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
        if (this.e <= 0.0f || Math.abs(f4) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.d, this.e, f3);
        h(canvas, paint, this.d, this.e, f3 + f4);
    }

    @Override // com.p7700g.p99005.hg2
    public void c(@x1 Canvas canvas, @x1 Paint paint) {
        int a = kc2.a(((eg2) this.a).d, this.b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // com.p7700g.p99005.hg2
    public int d() {
        return i();
    }

    @Override // com.p7700g.p99005.hg2
    public int e() {
        return i();
    }
}