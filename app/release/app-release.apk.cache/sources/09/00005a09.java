package com.p7700g.p99005;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.p7700g.p99005.i2;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes3.dex */
public class rh2 {
    private final sh2[] a = new sh2[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final sh2 g = new sh2();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public static class a {
        public static final rh2 a = new rh2();

        private a() {
        }
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface b {
        void a(sh2 sh2Var, Matrix matrix, int i);

        void b(sh2 sh2Var, Matrix matrix, int i);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public static final class c {
        @x1
        public final qh2 a;
        @x1
        public final Path b;
        @x1
        public final RectF c;
        @z1
        public final b d;
        public final float e;

        public c(@x1 qh2 qh2Var, float f, RectF rectF, @z1 b bVar, Path path) {
            this.d = bVar;
            this.a = qh2Var;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public rh2() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new sh2();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private void b(@x1 c cVar, int i) {
        this.h[0] = this.a[i].l();
        this.h[1] = this.a[i].m();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.a[i], this.b[i], i);
        }
    }

    private void c(@x1 c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].j();
        this.h[1] = this.a[i].k();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].l();
        this.i[1] = this.a[i2].m();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(cVar.c, i);
        this.g.p(0.0f, 0.0f);
        ih2 j = j(i, cVar.a);
        j.b(max, i3, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (j.a() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.l();
            this.h[1] = this.g.m();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.g, this.c[i], i);
        }
    }

    private void f(int i, @x1 RectF rectF, @x1 PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private fh2 g(int i, @x1 qh2 qh2Var) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return qh2Var.t();
                }
                return qh2Var.r();
            }
            return qh2Var.j();
        }
        return qh2Var.l();
    }

    private gh2 h(int i, @x1 qh2 qh2Var) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return qh2Var.s();
                }
                return qh2Var.q();
            }
            return qh2Var.i();
        }
        return qh2Var.k();
    }

    private float i(@x1 RectF rectF, int i) {
        float[] fArr = this.h;
        sh2[] sh2VarArr = this.a;
        fArr[0] = sh2VarArr[i].e;
        fArr[1] = sh2VarArr[i].f;
        this.b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.h[1]);
        }
        return Math.abs(rectF.centerX() - this.h[0]);
    }

    private ih2 j(int i, @x1 qh2 qh2Var) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return qh2Var.o();
                }
                return qh2Var.p();
            }
            return qh2Var.n();
        }
        return qh2Var.h();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @q2
    @x1
    public static rh2 k() {
        return a.a;
    }

    @e2(19)
    private boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(@x1 c cVar, int i) {
        h(i, cVar.a).c(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float a2 = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    private void o(int i) {
        this.h[0] = this.a[i].j();
        this.h[1] = this.a[i].k();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }

    public void d(qh2 qh2Var, float f, RectF rectF, @x1 Path path) {
        e(qh2Var, f, rectF, null, path);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void e(qh2 qh2Var, float f, RectF rectF, b bVar, @x1 Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(qh2Var, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            o(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public void n(boolean z) {
        this.l = z;
    }
}