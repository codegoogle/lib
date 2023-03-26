package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p7700g.p99005.lm0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class jm0 extends im0 {
    @z1
    private tj0<Float, Float> H;
    private final List<im0> I;
    private final RectF J;
    private final RectF K;
    private final Paint L;
    @z1
    private Boolean M;
    @z1
    private Boolean N;
    private boolean O;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lm0.b.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                iArr[lm0.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lm0.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public jm0(hi0 hi0Var, lm0 lm0Var, List<lm0> list, ei0 ei0Var) {
        super(hi0Var, lm0Var);
        int i;
        im0 im0Var;
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.O = true;
        zk0 u = lm0Var.u();
        if (u != null) {
            tj0<Float, Float> a2 = u.a();
            this.H = a2;
            f(a2);
            this.H.a(this);
        } else {
            this.H = null;
        }
        v7 v7Var = new v7(ei0Var.k().size());
        int size = list.size() - 1;
        im0 im0Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            lm0 lm0Var2 = list.get(size);
            im0 t = im0.t(this, lm0Var2, hi0Var, ei0Var);
            if (t != null) {
                v7Var.u(t.x().d(), t);
                if (im0Var2 != null) {
                    im0Var2.I(t);
                    im0Var2 = null;
                } else {
                    this.I.add(0, t);
                    int ordinal = lm0Var2.h().ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        im0Var2 = t;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < v7Var.H(); i++) {
            im0 im0Var3 = (im0) v7Var.h(v7Var.t(i));
            if (im0Var3 != null && (im0Var = (im0) v7Var.h(im0Var3.x().j())) != null) {
                im0Var3.K(im0Var);
            }
        }
    }

    @Override // com.p7700g.p99005.im0
    public void H(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            this.I.get(i2).c(tk0Var, i, list, tk0Var2);
        }
    }

    @Override // com.p7700g.p99005.im0
    public void J(boolean z) {
        super.J(z);
        for (im0 im0Var : this.I) {
            im0Var.J(z);
        }
    }

    @Override // com.p7700g.p99005.im0
    public void L(@g1(from = 0.0d, to = 1.0d) float f) {
        super.L(f);
        if (this.H != null) {
            f = ((this.u.b().i() * this.H.h().floatValue()) - this.u.b().r()) / (this.t.B().e() + 0.01f);
        }
        if (this.H == null) {
            f -= this.u.r();
        }
        if (this.u.v() != 0.0f && !"__container".equals(this.u.i())) {
            f /= this.u.v();
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).L(f);
        }
    }

    public boolean O() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                im0 im0Var = this.I.get(size);
                if (im0Var instanceof nm0) {
                    if (im0Var.y()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((im0Var instanceof jm0) && ((jm0) im0Var).O()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean P() {
        if (this.M == null) {
            if (z()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).z()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void Q(boolean z) {
        this.O = z;
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).e(this.J, this.s, true);
            rectF.union(this.J);
        }
    }

    @Override // com.p7700g.p99005.im0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.E) {
            if (np0Var == null) {
                tj0<Float, Float> tj0Var = this.H;
                if (tj0Var != null) {
                    tj0Var.n(null);
                    return;
                }
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.H = jk0Var;
            jk0Var.a(this);
            f(this.H);
        }
    }

    @Override // com.p7700g.p99005.im0
    public void s(Canvas canvas, Matrix matrix, int i) {
        ci0.a("CompositionLayer#draw");
        this.K.set(0.0f, 0.0f, this.u.l(), this.u.k());
        matrix.mapRect(this.K);
        boolean z = this.t.Z() && this.I.size() > 1 && i != 255;
        if (z) {
            this.L.setAlpha(i);
            cp0.n(canvas, this.K, this.L);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            if (((!this.O && "__container".equals(this.u.i())) || this.K.isEmpty()) ? true : canvas.clipRect(this.K)) {
                this.I.get(size).g(canvas, matrix, i);
            }
        }
        canvas.restore();
        ci0.b("CompositionLayer#draw");
    }
}