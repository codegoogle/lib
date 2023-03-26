package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class wi0 implements tj0.b, gj0, aj0 {
    private final hi0 e;
    public final im0 f;
    private final float[] h;
    public final Paint i;
    private final tj0<?, Float> j;
    private final tj0<?, Integer> k;
    private final List<tj0<?, Float>> l;
    @z1
    private final tj0<?, Float> m;
    @z1
    private tj0<ColorFilter, ColorFilter> n;
    @z1
    private tj0<Float, Float> o;
    public float p;
    @z1
    private vj0 q;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final List<b> g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* loaded from: classes.dex */
    public static final class b {
        private final List<jj0> a;
        @z1
        private final rj0 b;

        private b(@z1 rj0 rj0Var) {
            this.a = new ArrayList();
            this.b = rj0Var;
        }
    }

    public wi0(hi0 hi0Var, im0 im0Var, Paint.Cap cap, Paint.Join join, float f, bl0 bl0Var, zk0 zk0Var, List<zk0> list, zk0 zk0Var2) {
        vi0 vi0Var = new vi0(1);
        this.i = vi0Var;
        this.p = 0.0f;
        this.e = hi0Var;
        this.f = im0Var;
        vi0Var.setStyle(Paint.Style.STROKE);
        vi0Var.setStrokeCap(cap);
        vi0Var.setStrokeJoin(join);
        vi0Var.setStrokeMiter(f);
        this.k = bl0Var.a();
        this.j = zk0Var.a();
        if (zk0Var2 == null) {
            this.m = null;
        } else {
            this.m = zk0Var2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        im0Var.f(this.k);
        im0Var.f(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            im0Var.f(this.l.get(i2));
        }
        tj0<?, Float> tj0Var = this.m;
        if (tj0Var != null) {
            im0Var.f(tj0Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        tj0<?, Float> tj0Var2 = this.m;
        if (tj0Var2 != null) {
            tj0Var2.a(this);
        }
        if (im0Var.u() != null) {
            tj0<Float, Float> a2 = im0Var.u().a().a();
            this.o = a2;
            a2.a(this);
            im0Var.f(this.o);
        }
        if (im0Var.w() != null) {
            this.q = new vj0(this, im0Var, im0Var.w());
        }
    }

    private void f(Matrix matrix) {
        ci0.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            ci0.b("StrokeContent#applyDashPattern");
            return;
        }
        float g = cp0.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * g;
        }
        tj0<?, Float> tj0Var = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, tj0Var == null ? 0.0f : g * tj0Var.h().floatValue()));
        ci0.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        ci0.a("StrokeContent#applyTrimPath");
        if (bVar.b == null) {
            ci0.b("StrokeContent#applyTrimPath");
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((jj0) bVar.a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.b.f().h().floatValue() / 100.0f;
        float floatValue3 = bVar.b.h().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.i);
            ci0.b("StrokeContent#applyTrimPath");
            return;
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float f = floatValue3 * length;
        float f2 = (floatValue * length) + f;
        float min = Math.min((floatValue2 * length) + f, (f2 + length) - 1.0f);
        float f3 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((jj0) bVar.a.get(size2)).getPath());
            this.c.transform(matrix);
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            if (min > length) {
                float f4 = min - length;
                if (f4 < f3 + length2 && f3 < f4) {
                    cp0.a(this.c, f2 > length ? (f2 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f3 += length2;
                }
            }
            float f5 = f3 + length2;
            if (f5 >= f2 && f3 <= min) {
                if (f5 <= min && f2 < f3) {
                    canvas.drawPath(this.c, this.i);
                } else {
                    cp0.a(this.c, f2 < f3 ? 0.0f : (f2 - f3) / length2, min > f5 ? 1.0f : (min - f3) / length2, 0.0f);
                    canvas.drawPath(this.c, this.i);
                }
            }
            f3 += length2;
        }
        ci0.b("StrokeContent#applyTrimPath");
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.e.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        rj0 rj0Var = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            yi0 yi0Var = list.get(size);
            if (yi0Var instanceof rj0) {
                rj0 rj0Var2 = (rj0) yi0Var;
                if (rj0Var2.j() == fm0.a.INDIVIDUALLY) {
                    rj0Var = rj0Var2;
                }
            }
        }
        if (rj0Var != null) {
            rj0Var.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            yi0 yi0Var2 = list2.get(size2);
            if (yi0Var2 instanceof rj0) {
                rj0 rj0Var3 = (rj0) yi0Var2;
                if (rj0Var3.j() == fm0.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(rj0Var3);
                    rj0Var3.c(this);
                }
            }
            if (yi0Var2 instanceof jj0) {
                if (bVar == null) {
                    bVar = new b(rj0Var);
                }
                bVar.a.add((jj0) yi0Var2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        bp0.m(tk0Var, i, list, tk0Var2, this);
    }

    @Override // com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        ci0.a("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((jj0) bVar.a.get(i2)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float p = ((wj0) this.j).p();
        RectF rectF2 = this.d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ci0.b("StrokeContent#getBounds");
    }

    public void g(Canvas canvas, Matrix matrix, int i) {
        ci0.a("StrokeContent#draw");
        if (cp0.h(matrix)) {
            ci0.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(bp0.d((int) ((((i / 255.0f) * ((yj0) this.k).p()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(cp0.g(matrix) * ((wj0) this.j).p());
        if (this.i.getStrokeWidth() <= 0.0f) {
            ci0.b("StrokeContent#draw");
            return;
        }
        f(matrix);
        tj0<ColorFilter, ColorFilter> tj0Var = this.n;
        if (tj0Var != null) {
            this.i.setColorFilter(tj0Var.h());
        }
        tj0<Float, Float> tj0Var2 = this.o;
        if (tj0Var2 != null) {
            float floatValue = tj0Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (floatValue != this.p) {
                this.i.setMaskFilter(this.f.v(floatValue));
            }
            this.p = floatValue;
        }
        vj0 vj0Var = this.q;
        if (vj0Var != null) {
            vj0Var.b(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.b != null) {
                i(canvas, bVar, matrix);
            } else {
                ci0.a("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((jj0) bVar.a.get(size)).getPath(), matrix);
                }
                ci0.b("StrokeContent#buildPath");
                ci0.a("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                ci0.b("StrokeContent#drawPath");
            }
        }
        ci0.b("StrokeContent#draw");
    }

    @t0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        vj0 vj0Var;
        vj0 vj0Var2;
        vj0 vj0Var3;
        vj0 vj0Var4;
        vj0 vj0Var5;
        if (t == mi0.d) {
            this.k.n(np0Var);
        } else if (t == mi0.s) {
            this.j.n(np0Var);
        } else if (t == mi0.K) {
            tj0<ColorFilter, ColorFilter> tj0Var = this.n;
            if (tj0Var != null) {
                this.f.G(tj0Var);
            }
            if (np0Var == null) {
                this.n = null;
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.n = jk0Var;
            jk0Var.a(this);
            this.f.f(this.n);
        } else if (t == mi0.j) {
            tj0<Float, Float> tj0Var2 = this.o;
            if (tj0Var2 != null) {
                tj0Var2.n(np0Var);
                return;
            }
            jk0 jk0Var2 = new jk0(np0Var);
            this.o = jk0Var2;
            jk0Var2.a(this);
            this.f.f(this.o);
        } else if (t == mi0.e && (vj0Var5 = this.q) != null) {
            vj0Var5.c(np0Var);
        } else if (t == mi0.G && (vj0Var4 = this.q) != null) {
            vj0Var4.f(np0Var);
        } else if (t == mi0.H && (vj0Var3 = this.q) != null) {
            vj0Var3.d(np0Var);
        } else if (t == mi0.I && (vj0Var2 = this.q) != null) {
            vj0Var2.e(np0Var);
        } else if (t != mi0.J || (vj0Var = this.q) == null) {
        } else {
            vj0Var.g(np0Var);
        }
    }
}