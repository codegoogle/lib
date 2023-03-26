package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public class ej0 extends wi0 {
    private static final int r = 32;
    private final tj0<PointF, PointF> A;
    private final tj0<PointF, PointF> B;
    @z1
    private jk0 C;
    private final String s;
    private final boolean t;
    private final v7<LinearGradient> u;
    private final v7<RadialGradient> v;
    private final RectF w;
    private final tl0 x;
    private final int y;
    private final tj0<ql0, ql0> z;

    public ej0(hi0 hi0Var, im0 im0Var, sl0 sl0Var) {
        super(hi0Var, im0Var, sl0Var.b().f(), sl0Var.g().f(), sl0Var.i(), sl0Var.k(), sl0Var.m(), sl0Var.h(), sl0Var.c());
        this.u = new v7<>();
        this.v = new v7<>();
        this.w = new RectF();
        this.s = sl0Var.j();
        this.x = sl0Var.f();
        this.t = sl0Var.n();
        this.y = (int) (hi0Var.B().d() / 32.0f);
        tj0<ql0, ql0> a = sl0Var.e().a();
        this.z = a;
        a.a(this);
        im0Var.f(a);
        tj0<PointF, PointF> a2 = sl0Var.l().a();
        this.A = a2;
        a2.a(this);
        im0Var.f(a2);
        tj0<PointF, PointF> a3 = sl0Var.d().a();
        this.B = a3;
        a3.a(this);
        im0Var.f(a3);
    }

    private int[] j(int[] iArr) {
        jk0 jk0Var = this.C;
        if (jk0Var != null) {
            Integer[] numArr = (Integer[]) jk0Var.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int k() {
        int round = Math.round(this.A.f() * this.y);
        int round2 = Math.round(this.B.f() * this.y);
        int round3 = Math.round(this.z.f() * this.y);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient l() {
        long k = k();
        LinearGradient h = this.u.h(k);
        if (h != null) {
            return h;
        }
        PointF h2 = this.A.h();
        PointF h3 = this.B.h();
        ql0 h4 = this.z.h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, j(h4.a()), h4.b(), Shader.TileMode.CLAMP);
        this.u.u(k, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        float f;
        float f2;
        long k = k();
        RadialGradient h = this.v.h(k);
        if (h != null) {
            return h;
        }
        PointF h2 = this.A.h();
        PointF h3 = this.B.h();
        ql0 h4 = this.z.h();
        int[] j = j(h4.a());
        float[] b = h4.b();
        RadialGradient radialGradient = new RadialGradient(h2.x, h2.y, (float) Math.hypot(h3.x - f, h3.y - f2), j, b, Shader.TileMode.CLAMP);
        this.v.u(k, radialGradient);
        return radialGradient;
    }

    @Override // com.p7700g.p99005.wi0, com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        Shader m;
        if (this.t) {
            return;
        }
        e(this.w, matrix, false);
        if (this.x == tl0.LINEAR) {
            m = l();
        } else {
            m = m();
        }
        m.setLocalMatrix(matrix);
        this.i.setShader(m);
        super.g(canvas, matrix, i);
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.wi0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.L) {
            jk0 jk0Var = this.C;
            if (jk0Var != null) {
                this.f.G(jk0Var);
            }
            if (np0Var == null) {
                this.C = null;
                return;
            }
            jk0 jk0Var2 = new jk0(np0Var);
            this.C = jk0Var2;
            jk0Var2.a(this);
            this.f.f(this.C);
        }
    }
}