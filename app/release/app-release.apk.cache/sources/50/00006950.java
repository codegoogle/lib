package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class zi0 implements aj0, jj0, tj0.b, uk0 {
    private final Paint a;
    private final RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<yi0> h;
    private final hi0 i;
    @z1
    private List<jj0> j;
    @z1
    private ik0 k;

    public zi0(hi0 hi0Var, im0 im0Var, cm0 cm0Var) {
        this(hi0Var, im0Var, cm0Var.c(), cm0Var.d(), f(hi0Var, im0Var, cm0Var.b()), i(cm0Var.b()));
    }

    private static List<yi0> f(hi0 hi0Var, im0 im0Var, List<pl0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            yi0 a = list.get(i).a(hi0Var, im0Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @z1
    public static jl0 i(List<pl0> list) {
        for (int i = 0; i < list.size(); i++) {
            pl0 pl0Var = list.get(i);
            if (pl0Var instanceof jl0) {
                return (jl0) pl0Var;
            }
        }
        return null;
    }

    private boolean l() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof aj0) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        ArrayList arrayList = new ArrayList(this.h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            yi0 yi0Var = this.h.get(size);
            yi0Var.b(arrayList, this.h.subList(0, size));
            arrayList.add(yi0Var);
        }
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        if (tk0Var.h(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                tk0Var2 = tk0Var2.a(getName());
                if (tk0Var.c(getName(), i)) {
                    list.add(tk0Var2.j(this));
                }
            }
            if (tk0Var.i(getName(), i)) {
                int e = tk0Var.e(getName(), i) + i;
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    yi0 yi0Var = this.h.get(i2);
                    if (yi0Var instanceof uk0) {
                        ((uk0) yi0Var).c(tk0Var, e, list, tk0Var2);
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        ik0 ik0Var = this.k;
        if (ik0Var != null) {
            this.c.preConcat(ik0Var.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            yi0 yi0Var = this.h.get(size);
            if (yi0Var instanceof aj0) {
                ((aj0) yi0Var).e(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        ik0 ik0Var = this.k;
        if (ik0Var != null) {
            this.c.preConcat(ik0Var.f());
            i = (int) (((((this.k.h() == null ? 100 : this.k.h().h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.Z() && l() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(this.b, this.c, true);
            this.a.setAlpha(i);
            cp0.n(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            yi0 yi0Var = this.h.get(size);
            if (yi0Var instanceof aj0) {
                ((aj0) yi0Var).g(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.f;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        this.c.reset();
        ik0 ik0Var = this.k;
        if (ik0Var != null) {
            this.c.set(ik0Var.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            yi0 yi0Var = this.h.get(size);
            if (yi0Var instanceof jj0) {
                this.d.addPath(((jj0) yi0Var).getPath(), this.c);
            }
        }
        return this.d;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        ik0 ik0Var = this.k;
        if (ik0Var != null) {
            ik0Var.c(t, np0Var);
        }
    }

    public List<jj0> j() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                yi0 yi0Var = this.h.get(i);
                if (yi0Var instanceof jj0) {
                    this.j.add((jj0) yi0Var);
                }
            }
        }
        return this.j;
    }

    public Matrix k() {
        ik0 ik0Var = this.k;
        if (ik0Var != null) {
            return ik0Var.f();
        }
        this.c.reset();
        return this.c;
    }

    public zi0(hi0 hi0Var, im0 im0Var, String str, boolean z, List<yi0> list, @z1 jl0 jl0Var) {
        this.a = new vi0();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = hi0Var;
        this.g = z;
        this.h = list;
        if (jl0Var != null) {
            ik0 b = jl0Var.b();
            this.k = b;
            b.a(im0Var);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            yi0 yi0Var = list.get(size);
            if (yi0Var instanceof fj0) {
                arrayList.add((fj0) yi0Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((fj0) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}