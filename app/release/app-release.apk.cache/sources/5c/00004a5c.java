package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.p7700g.p99005.ag2;
import com.p7700g.p99005.z90;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes3.dex */
public final class jg2<S extends ag2> extends gg2 {
    private hg2<S> J;
    private ig2<ObjectAnimator> K;

    public jg2(@x1 Context context, @x1 ag2 ag2Var, @x1 hg2<S> hg2Var, @x1 ig2<ObjectAnimator> ig2Var) {
        super(context, ag2Var);
        C(hg2Var);
        B(ig2Var);
    }

    @x1
    public static jg2<eg2> x(@x1 Context context, @x1 eg2 eg2Var) {
        return new jg2<>(context, eg2Var, new bg2(eg2Var), new cg2(eg2Var));
    }

    @x1
    public static jg2<og2> y(@x1 Context context, @x1 og2 og2Var) {
        ig2 mg2Var;
        kg2 kg2Var = new kg2(og2Var);
        if (og2Var.g == 0) {
            mg2Var = new lg2(og2Var);
        } else {
            mg2Var = new mg2(context, og2Var);
        }
        return new jg2<>(context, og2Var, kg2Var, mg2Var);
    }

    @x1
    public hg2<S> A() {
        return this.J;
    }

    public void B(@x1 ig2<ObjectAnimator> ig2Var) {
        this.K = ig2Var;
        ig2Var.e(this);
    }

    public void C(@x1 hg2<S> hg2Var) {
        this.J = hg2Var;
        hg2Var.f(this);
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ void b(@x1 z90.a aVar) {
        super.b(aVar);
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ boolean d(@x1 z90.a aVar) {
        return super.d(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.J.g(canvas, j());
        this.J.c(canvas, this.H);
        int i = 0;
        while (true) {
            ig2<ObjectAnimator> ig2Var = this.K;
            int[] iArr = ig2Var.c;
            if (i < iArr.length) {
                hg2<S> hg2Var = this.J;
                Paint paint = this.H;
                float[] fArr = ig2Var.b;
                int i2 = i * 2;
                hg2Var.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.J.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.J.e();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@z1 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean v(boolean z, boolean z2, boolean z3) {
        return super.v(z, z2, z3);
    }

    @Override // com.p7700g.p99005.gg2
    public boolean w(boolean z, boolean z2, boolean z3) {
        boolean w = super.w(z, z2, z3);
        if (!isRunning()) {
            this.K.a();
        }
        float a = this.x.a(this.v.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.K.g();
        }
        return w;
    }

    @x1
    public ig2<ObjectAnimator> z() {
        return this.K;
    }
}