package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public class om0 extends im0 {
    private final RectF H;
    private final Paint I;
    private final float[] J;
    private final Path K;
    private final lm0 L;
    @z1
    private tj0<ColorFilter, ColorFilter> M;

    public om0(hi0 hi0Var, lm0 lm0Var) {
        super(hi0Var, lm0Var);
        this.H = new RectF();
        vi0 vi0Var = new vi0();
        this.I = vi0Var;
        this.J = new float[8];
        this.K = new Path();
        this.L = lm0Var;
        vi0Var.setAlpha(0);
        vi0Var.setStyle(Paint.Style.FILL);
        vi0Var.setColor(lm0Var.o());
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.H.set(0.0f, 0.0f, this.L.q(), this.L.p());
        this.s.mapRect(this.H);
        rectF.set(this.H);
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.K) {
            if (np0Var == null) {
                this.M = null;
            } else {
                this.M = new jk0(np0Var);
            }
        }
    }

    @Override // com.p7700g.p99005.im0
    public void s(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.L.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.B.h() == null ? 100 : this.B.h().h().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        this.I.setAlpha(intValue);
        tj0<ColorFilter, ColorFilter> tj0Var = this.M;
        if (tj0Var != null) {
            this.I.setColorFilter(tj0Var.h());
        }
        if (intValue > 0) {
            float[] fArr = this.J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.L.q();
            float[] fArr2 = this.J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.L.q();
            this.J[5] = this.L.p();
            float[] fArr3 = this.J;
            fArr3[6] = 0.0f;
            fArr3[7] = this.L.p();
            matrix.mapPoints(this.J);
            this.K.reset();
            Path path = this.K;
            float[] fArr4 = this.J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.K;
            float[] fArr5 = this.J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.K;
            float[] fArr6 = this.J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.K;
            float[] fArr7 = this.J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.K;
            float[] fArr8 = this.J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.K.close();
            canvas.drawPath(this.K, this.I);
        }
    }
}