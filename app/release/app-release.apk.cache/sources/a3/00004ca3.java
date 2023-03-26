package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes3.dex */
public final class kg2 extends hg2<og2> {
    private float c;
    private float d;
    private float e;

    public kg2(@x1 og2 og2Var) {
        super(og2Var);
        this.c = 300.0f;
    }

    @Override // com.p7700g.p99005.hg2
    public void a(@x1 Canvas canvas, @g1(from = 0.0d, to = 1.0d) float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        float f2 = ((og2) this.a).a;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - ((og2) this.a).a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (((og2) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.n() && ((og2) this.a).e == 1) || (this.b.m() && ((og2) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.n() || this.b.m()) {
            canvas.translate(0.0f, ((f - 1.0f) * ((og2) this.a).a) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.a;
        this.d = ((og2) s).a * f;
        this.e = ((og2) s).b * f;
    }

    @Override // com.p7700g.p99005.hg2
    public void b(@x1 Canvas canvas, @x1 Paint paint, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @w0 int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = this.e;
        float f5 = ((f3 - (f4 * 2.0f)) * f) + ((-f3) / 2.0f);
        float f6 = (f3 - (f4 * 2.0f)) * f2;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f7 = this.d;
        float f8 = (-f7) / 2.0f;
        RectF rectF = new RectF(f5, f8, (f4 * 2.0f) + f6 + ((-f3) / 2.0f), f7 / 2.0f);
        float f9 = this.e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // com.p7700g.p99005.hg2
    public void c(@x1 Canvas canvas, @x1 Paint paint) {
        int a = kc2.a(((og2) this.a).d, this.b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // com.p7700g.p99005.hg2
    public int d() {
        return ((og2) this.a).a;
    }

    @Override // com.p7700g.p99005.hg2
    public int e() {
        return -1;
    }
}