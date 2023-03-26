package com.p7700g.p99005;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.p7700g.p99005.lm0;
import com.p7700g.p99005.tj0;
import com.p7700g.p99005.ul0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class im0 implements aj0, tj0.b, uk0 {
    private static final int a = 2;
    private static final int b = 16;
    private static final int c = 1;
    private static final int d = 19;
    private final List<tj0<?, ?>> A;
    public final ik0 B;
    private boolean C;
    private boolean D;
    @z1
    private Paint E;
    public float F;
    @z1
    public BlurMaskFilter G;
    private final Path e = new Path();
    private final Matrix f = new Matrix();
    private final Matrix g = new Matrix();
    private final Paint h = new vi0(1);
    private final Paint i = new vi0(1, PorterDuff.Mode.DST_IN);
    private final Paint j = new vi0(1, PorterDuff.Mode.DST_OUT);
    private final Paint k;
    private final Paint l;
    private final RectF m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final String r;
    public final Matrix s;
    public final hi0 t;
    public final lm0 u;
    @z1
    private ak0 v;
    @z1
    private wj0 w;
    @z1
    private im0 x;
    @z1
    private im0 y;
    private List<im0> z;

    /* compiled from: BaseLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            ul0.a.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                iArr[ul0.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ul0.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ul0.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ul0.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            lm0.a.values();
            int[] iArr2 = new int[7];
            a = iArr2;
            try {
                iArr2[lm0.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[lm0.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[lm0.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[lm0.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[lm0.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[lm0.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[lm0.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public im0(hi0 hi0Var, lm0 lm0Var) {
        vi0 vi0Var = new vi0(1);
        this.k = vi0Var;
        this.l = new vi0(PorterDuff.Mode.CLEAR);
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.s = new Matrix();
        this.A = new ArrayList();
        this.C = true;
        this.F = 0.0f;
        this.t = hi0Var;
        this.u = lm0Var;
        this.r = lm0Var.i() + "#draw";
        if (lm0Var.h() == lm0.b.INVERT) {
            vi0Var.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            vi0Var.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        ik0 b2 = lm0Var.w().b();
        this.B = b2;
        b2.b(this);
        if (lm0Var.g() != null && !lm0Var.g().isEmpty()) {
            ak0 ak0Var = new ak0(lm0Var.g());
            this.v = ak0Var;
            for (tj0<am0, Path> tj0Var : ak0Var.a()) {
                tj0Var.a(this);
            }
            for (tj0<Integer, Integer> tj0Var2 : this.v.c()) {
                f(tj0Var2);
                tj0Var2.a(this);
            }
        }
        N();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (y()) {
            int size = this.v.b().size();
            for (int i = 0; i < size; i++) {
                ul0 ul0Var = this.v.b().get(i);
                Path h = this.v.a().get(i).h();
                if (h != null) {
                    this.e.set(h);
                    this.e.transform(matrix);
                    int ordinal = ul0Var.a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            return;
                        }
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                return;
                            }
                            this.e.computeBounds(this.q, false);
                            if (i != 0) {
                                this.o.set(this.q);
                            } else {
                                RectF rectF2 = this.o;
                                rectF2.set(Math.min(rectF2.left, this.q.left), Math.min(this.o.top, this.q.top), Math.max(this.o.right, this.q.right), Math.max(this.o.bottom, this.q.bottom));
                            }
                        }
                    }
                    if (ul0Var.d()) {
                        return;
                    }
                    this.e.computeBounds(this.q, false);
                    if (i != 0) {
                    }
                }
            }
            if (rectF.intersect(this.o)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void B(RectF rectF, Matrix matrix) {
        if (z() && this.u.h() != lm0.b.INVERT) {
            this.p.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.x.e(this.p, matrix, true);
            if (rectF.intersect(this.p)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C() {
        this.t.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E() {
        M(this.w.p() == 1.0f);
    }

    private void F(float f) {
        this.t.B().o().e(this.u.i(), f);
    }

    private void M(boolean z) {
        if (z != this.C) {
            this.C = z;
            C();
        }
    }

    private void N() {
        if (!this.u.e().isEmpty()) {
            wj0 wj0Var = new wj0(this.u.e());
            this.w = wj0Var;
            wj0Var.l();
            this.w.a(new tj0.b() { // from class: com.p7700g.p99005.hm0
                @Override // com.p7700g.p99005.tj0.b
                public final void a() {
                    im0.this.E();
                }
            });
            M(this.w.h().floatValue() == 1.0f);
            f(this.w);
            return;
        }
        M(true);
    }

    private void i(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var, tj0<Integer, Integer> tj0Var2) {
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        this.h.setAlpha((int) (tj0Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.e, this.h);
    }

    private void j(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var, tj0<Integer, Integer> tj0Var2) {
        cp0.n(canvas, this.m, this.i);
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        this.h.setAlpha((int) (tj0Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.e, this.h);
        canvas.restore();
    }

    private void k(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var, tj0<Integer, Integer> tj0Var2) {
        cp0.n(canvas, this.m, this.h);
        canvas.drawRect(this.m, this.h);
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        this.h.setAlpha((int) (tj0Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.e, this.j);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var, tj0<Integer, Integer> tj0Var2) {
        cp0.n(canvas, this.m, this.i);
        canvas.drawRect(this.m, this.h);
        this.j.setAlpha((int) (tj0Var2.h().intValue() * 2.55f));
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        canvas.drawPath(this.e, this.j);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var, tj0<Integer, Integer> tj0Var2) {
        cp0.n(canvas, this.m, this.j);
        canvas.drawRect(this.m, this.h);
        this.j.setAlpha((int) (tj0Var2.h().intValue() * 2.55f));
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        canvas.drawPath(this.e, this.j);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix) {
        ci0.a("Layer#saveLayer");
        cp0.o(canvas, this.m, this.i, 19);
        if (Build.VERSION.SDK_INT < 28) {
            r(canvas);
        }
        ci0.b("Layer#saveLayer");
        for (int i = 0; i < this.v.b().size(); i++) {
            ul0 ul0Var = this.v.b().get(i);
            tj0<am0, Path> tj0Var = this.v.a().get(i);
            tj0<Integer, Integer> tj0Var2 = this.v.c().get(i);
            int ordinal = ul0Var.a().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (i == 0) {
                        this.h.setColor(sr.t);
                        this.h.setAlpha(255);
                        canvas.drawRect(this.m, this.h);
                    }
                    if (ul0Var.d()) {
                        m(canvas, matrix, tj0Var, tj0Var2);
                    } else {
                        o(canvas, matrix, tj0Var);
                    }
                } else if (ordinal != 2) {
                    if (ordinal == 3 && p()) {
                        this.h.setAlpha(255);
                        canvas.drawRect(this.m, this.h);
                    }
                } else if (ul0Var.d()) {
                    l(canvas, matrix, tj0Var, tj0Var2);
                } else {
                    j(canvas, matrix, tj0Var, tj0Var2);
                }
            } else if (ul0Var.d()) {
                k(canvas, matrix, tj0Var, tj0Var2);
            } else {
                i(canvas, matrix, tj0Var, tj0Var2);
            }
        }
        ci0.a("Layer#restoreLayer");
        canvas.restore();
        ci0.b("Layer#restoreLayer");
    }

    private void o(Canvas canvas, Matrix matrix, tj0<am0, Path> tj0Var) {
        this.e.set(tj0Var.h());
        this.e.transform(matrix);
        canvas.drawPath(this.e, this.j);
    }

    private boolean p() {
        if (this.v.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.v.b().size(); i++) {
            if (this.v.b().get(i).a() != ul0.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void q() {
        if (this.z != null) {
            return;
        }
        if (this.y == null) {
            this.z = Collections.emptyList();
            return;
        }
        this.z = new ArrayList();
        for (im0 im0Var = this.y; im0Var != null; im0Var = im0Var.y) {
            this.z.add(im0Var);
        }
    }

    private void r(Canvas canvas) {
        ci0.a("Layer#clearLayer");
        RectF rectF = this.m;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.l);
        ci0.b("Layer#clearLayer");
    }

    @z1
    public static im0 t(jm0 jm0Var, lm0 lm0Var, hi0 hi0Var, ei0 ei0Var) {
        int ordinal = lm0Var.f().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                StringBuilder G = wo1.G("Unknown layer type ");
                                G.append(lm0Var.f());
                                yo0.e(G.toString());
                                return null;
                            }
                            return new pm0(hi0Var, lm0Var);
                        }
                        return new nm0(hi0Var, lm0Var, jm0Var);
                    }
                    return new mm0(hi0Var, lm0Var);
                }
                return new km0(hi0Var, lm0Var);
            }
            return new om0(hi0Var, lm0Var);
        }
        return new jm0(hi0Var, lm0Var, ei0Var.p(lm0Var.m()), ei0Var);
    }

    public void G(tj0<?, ?> tj0Var) {
        this.A.remove(tj0Var);
    }

    public void H(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
    }

    public void I(@z1 im0 im0Var) {
        this.x = im0Var;
    }

    public void J(boolean z) {
        if (z && this.E == null) {
            this.E = new vi0();
        }
        this.D = z;
    }

    public void K(@z1 im0 im0Var) {
        this.y = im0Var;
    }

    public void L(@g1(from = 0.0d, to = 1.0d) float f) {
        this.B.j(f);
        if (this.v != null) {
            for (int i = 0; i < this.v.a().size(); i++) {
                this.v.a().get(i).m(f);
            }
        }
        wj0 wj0Var = this.w;
        if (wj0Var != null) {
            wj0Var.m(f);
        }
        im0 im0Var = this.x;
        if (im0Var != null) {
            im0Var.L(f);
        }
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            this.A.get(i2).m(f);
        }
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        C();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        im0 im0Var = this.x;
        if (im0Var != null) {
            tk0 a2 = tk0Var2.a(im0Var.getName());
            if (tk0Var.c(this.x.getName(), i)) {
                list.add(a2.j(this.x));
            }
            if (tk0Var.i(getName(), i)) {
                this.x.H(tk0Var, tk0Var.e(this.x.getName(), i) + i, list, a2);
            }
        }
        if (tk0Var.h(getName(), i)) {
            if (!"__container".equals(getName())) {
                tk0Var2 = tk0Var2.a(getName());
                if (tk0Var.c(getName(), i)) {
                    list.add(tk0Var2.j(this));
                }
            }
            if (tk0Var.i(getName(), i)) {
                H(tk0Var, tk0Var.e(getName(), i) + i, list, tk0Var2);
            }
        }
    }

    @Override // com.p7700g.p99005.aj0
    @t0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
        q();
        this.s.set(matrix);
        if (z) {
            List<im0> list = this.z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.s.preConcat(this.z.get(size).B.f());
                }
            } else {
                im0 im0Var = this.y;
                if (im0Var != null) {
                    this.s.preConcat(im0Var.B.f());
                }
            }
        }
        this.s.preConcat(this.B.f());
    }

    public void f(@z1 tj0<?, ?> tj0Var) {
        if (tj0Var == null) {
            return;
        }
        this.A.add(tj0Var);
    }

    @Override // com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        ci0.a(this.r);
        if (this.C && !this.u.x()) {
            q();
            ci0.a("Layer#parentMatrix");
            this.f.reset();
            this.f.set(matrix);
            for (int size = this.z.size() - 1; size >= 0; size--) {
                this.f.preConcat(this.z.get(size).B.f());
            }
            ci0.b("Layer#parentMatrix");
            int intValue = (int) ((((i / 255.0f) * (this.B.h() == null ? 100 : this.B.h().h().intValue())) / 100.0f) * 255.0f);
            if (!z() && !y()) {
                this.f.preConcat(this.B.f());
                ci0.a("Layer#drawLayer");
                s(canvas, this.f, intValue);
                ci0.b("Layer#drawLayer");
                F(ci0.b(this.r));
                return;
            }
            ci0.a("Layer#computeBounds");
            e(this.m, this.f, false);
            B(this.m, matrix);
            this.f.preConcat(this.B.f());
            A(this.m, this.f);
            this.n.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.g);
            if (!this.g.isIdentity()) {
                Matrix matrix2 = this.g;
                matrix2.invert(matrix2);
                this.g.mapRect(this.n);
            }
            if (!this.m.intersect(this.n)) {
                this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            ci0.b("Layer#computeBounds");
            if (this.m.width() >= 1.0f && this.m.height() >= 1.0f) {
                ci0.a("Layer#saveLayer");
                this.h.setAlpha(255);
                cp0.n(canvas, this.m, this.h);
                ci0.b("Layer#saveLayer");
                r(canvas);
                ci0.a("Layer#drawLayer");
                s(canvas, this.f, intValue);
                ci0.b("Layer#drawLayer");
                if (y()) {
                    n(canvas, this.f);
                }
                if (z()) {
                    ci0.a("Layer#drawMatte");
                    ci0.a("Layer#saveLayer");
                    cp0.o(canvas, this.m, this.k, 19);
                    ci0.b("Layer#saveLayer");
                    r(canvas);
                    this.x.g(canvas, matrix, intValue);
                    ci0.a("Layer#restoreLayer");
                    canvas.restore();
                    ci0.b("Layer#restoreLayer");
                    ci0.b("Layer#drawMatte");
                }
                ci0.a("Layer#restoreLayer");
                canvas.restore();
                ci0.b("Layer#restoreLayer");
            }
            if (this.D && (paint = this.E) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.E.setColor(-251901);
                this.E.setStrokeWidth(4.0f);
                canvas.drawRect(this.m, this.E);
                this.E.setStyle(Paint.Style.FILL);
                this.E.setColor(1357638635);
                canvas.drawRect(this.m, this.E);
            }
            F(ci0.b(this.r));
            return;
        }
        ci0.b(this.r);
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.u.i();
    }

    @Override // com.p7700g.p99005.uk0
    @t0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        this.B.c(t, np0Var);
    }

    public abstract void s(Canvas canvas, Matrix matrix, int i);

    @z1
    public nl0 u() {
        return this.u.a();
    }

    public BlurMaskFilter v(float f) {
        if (this.F == f) {
            return this.G;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.G = blurMaskFilter;
        this.F = f;
        return blurMaskFilter;
    }

    @z1
    public in0 w() {
        return this.u.c();
    }

    public lm0 x() {
        return this.u;
    }

    public boolean y() {
        ak0 ak0Var = this.v;
        return (ak0Var == null || ak0Var.a().isEmpty()) ? false : true;
    }

    public boolean z() {
        return this.x != null;
    }
}