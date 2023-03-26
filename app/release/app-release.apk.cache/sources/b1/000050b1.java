package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public class mj0 implements aj0, jj0, fj0, tj0.b, gj0 {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final hi0 c;
    private final im0 d;
    private final String e;
    private final boolean f;
    private final tj0<Float, Float> g;
    private final tj0<Float, Float> h;
    private final ik0 i;
    private zi0 j;

    public mj0(hi0 hi0Var, im0 im0Var, yl0 yl0Var) {
        this.c = hi0Var;
        this.d = im0Var;
        this.e = yl0Var.c();
        this.f = yl0Var.f();
        tj0<Float, Float> a = yl0Var.b().a();
        this.g = a;
        im0Var.f(a);
        a.a(this);
        tj0<Float, Float> a2 = yl0Var.d().a();
        this.h = a2;
        im0Var.f(a2);
        a2.a(this);
        ik0 b = yl0Var.e().b();
        this.i = b;
        b.a(im0Var);
        b.b(this);
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        this.j.b(list, list2);
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        bp0.m(tk0Var, i, list, tk0Var2, this);
    }

    @Override // com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // com.p7700g.p99005.fj0
    public void f(ListIterator<yi0> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new zi0(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        float floatValue3 = this.i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.i.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.g(f + floatValue2));
            this.j.g(canvas, this.a, (int) (bp0.k(floatValue3, floatValue4, f / floatValue) * i));
        }
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.e;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + floatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        if (this.i.c(t, np0Var)) {
            return;
        }
        if (t == mi0.u) {
            this.g.n(np0Var);
        } else if (t == mi0.v) {
            this.h.n(np0Var);
        }
    }
}