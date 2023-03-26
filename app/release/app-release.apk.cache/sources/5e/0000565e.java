package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes3.dex */
public class pi2 extends lh2 {
    @x1
    private final Paint W;
    @x1
    private final RectF X;

    public pi2() {
        this(null);
    }

    private void T0() {
        this.W.setStyle(Paint.Style.FILL_AND_STROKE);
        this.W.setColor(-1);
        this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public boolean P0() {
        return !this.X.isEmpty();
    }

    public void Q0() {
        R0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void R0(float f, float f2, float f3, float f4) {
        RectF rectF = this.X;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void S0(@x1 RectF rectF) {
        R0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.p7700g.p99005.lh2
    public void s(@x1 Canvas canvas) {
        if (this.X.isEmpty()) {
            super.s(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.X);
        } else {
            canvas.clipRect(this.X, Region.Op.DIFFERENCE);
        }
        super.s(canvas);
        canvas.restore();
    }

    public pi2(@z1 qh2 qh2Var) {
        super(qh2Var == null ? new qh2() : qh2Var);
        this.W = new Paint(1);
        T0();
        this.X = new RectF();
    }
}