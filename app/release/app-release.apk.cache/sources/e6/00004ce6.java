package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public class km0 extends im0 {
    private final Paint H;
    private final Rect I;
    private final Rect J;
    @z1
    private final ii0 K;
    @z1
    private tj0<ColorFilter, ColorFilter> L;
    @z1
    private tj0<Bitmap, Bitmap> M;

    public km0(hi0 hi0Var, lm0 lm0Var) {
        super(hi0Var, lm0Var);
        this.H = new vi0(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = hi0Var.I(lm0Var.m());
    }

    @z1
    private Bitmap O() {
        Bitmap h;
        tj0<Bitmap, Bitmap> tj0Var = this.M;
        if (tj0Var == null || (h = tj0Var.h()) == null) {
            Bitmap z = this.t.z(this.u.m());
            if (z != null) {
                return z;
            }
            ii0 ii0Var = this.K;
            if (ii0Var != null) {
                return ii0Var.a();
            }
            return null;
        }
        return h;
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        if (this.K != null) {
            float e = cp0.e();
            rectF.set(0.0f, 0.0f, this.K.f() * e, this.K.d() * e);
            this.s.mapRect(rectF);
        }
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.K) {
            if (np0Var == null) {
                this.L = null;
            } else {
                this.L = new jk0(np0Var);
            }
        } else if (t == mi0.N) {
            if (np0Var == null) {
                this.M = null;
            } else {
                this.M = new jk0(np0Var);
            }
        }
    }

    @Override // com.p7700g.p99005.im0
    public void s(@x1 Canvas canvas, Matrix matrix, int i) {
        Bitmap O = O();
        if (O == null || O.isRecycled() || this.K == null) {
            return;
        }
        float e = cp0.e();
        this.H.setAlpha(i);
        tj0<ColorFilter, ColorFilter> tj0Var = this.L;
        if (tj0Var != null) {
            this.H.setColorFilter(tj0Var.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.I.set(0, 0, O.getWidth(), O.getHeight());
        if (this.t.J()) {
            this.J.set(0, 0, (int) (this.K.f() * e), (int) (this.K.d() * e));
        } else {
            this.J.set(0, 0, (int) (O.getWidth() * e), (int) (O.getHeight() * e));
        }
        canvas.drawBitmap(O, this.I, this.J, this.H);
        canvas.restore();
    }
}