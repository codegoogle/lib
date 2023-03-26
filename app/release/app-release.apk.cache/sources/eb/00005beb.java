package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes3.dex */
public class sh2 {
    private static final float a = 270.0f;
    public static final float b = 180.0f;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    @Deprecated
    public float g;
    @Deprecated
    public float h;
    private final List<g> i = new ArrayList();
    private final List<i> j = new ArrayList();
    private boolean k;

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public class a extends i {
        public final /* synthetic */ List b;
        public final /* synthetic */ Matrix c;

        public a(List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // com.p7700g.p99005.sh2.i
        public void a(Matrix matrix, ah2 ah2Var, int i, Canvas canvas) {
            for (i iVar : this.b) {
                iVar.a(this.c, ah2Var, i, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class b extends i {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // com.p7700g.p99005.sh2.i
        public void a(Matrix matrix, @x1 ah2 ah2Var, int i, @x1 Canvas canvas) {
            ah2Var.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i, this.b.m(), this.b.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class c extends i {
        private final f b;
        private final float c;
        private final float d;

        public c(f fVar, float f, float f2) {
            this.b = fVar;
            this.c = f;
            this.d = f2;
        }

        @Override // com.p7700g.p99005.sh2.i
        public void a(Matrix matrix, @x1 ah2 ah2Var, int i, @x1 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.b.c - this.d, this.b.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            ah2Var.b(canvas, matrix2, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class d extends g {
        private static final RectF b = new RectF();
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;
        @Deprecated
        public float h;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.d;
        }

        private void p(float f) {
            this.f = f;
        }

        private void q(float f) {
            this.c = f;
        }

        private void r(float f) {
            this.e = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f) {
            this.g = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f) {
            this.h = f;
        }

        private void u(float f) {
            this.d = f;
        }

        @Override // com.p7700g.p99005.sh2.g
        public void a(@x1 Matrix matrix, @x1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = b;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class e extends g {
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;

        public e(float f, float f2, float f3, float f4, float f5, float f6) {
            h(f);
            j(f2);
            i(f3);
            k(f4);
            l(f5);
            m(f6);
        }

        private float b() {
            return this.b;
        }

        private float c() {
            return this.d;
        }

        private float d() {
            return this.c;
        }

        private float e() {
            return this.c;
        }

        private float f() {
            return this.f;
        }

        private float g() {
            return this.g;
        }

        private void h(float f) {
            this.b = f;
        }

        private void i(float f) {
            this.d = f;
        }

        private void j(float f) {
            this.c = f;
        }

        private void k(float f) {
            this.e = f;
        }

        private void l(float f) {
            this.f = f;
        }

        private void m(float f) {
            this.g = f;
        }

        @Override // com.p7700g.p99005.sh2.g
        public void a(@x1 Matrix matrix, @x1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class f extends g {
        private float b;
        private float c;

        @Override // com.p7700g.p99005.sh2.g
        public void a(@x1 Matrix matrix, @x1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class g {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class h extends g {
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;

        private float f() {
            return this.b;
        }

        private float g() {
            return this.c;
        }

        private float h() {
            return this.d;
        }

        private float i() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f) {
            this.b = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f) {
            this.c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f) {
            this.e = f;
        }

        @Override // com.p7700g.p99005.sh2.g
        public void a(@x1 Matrix matrix, @x1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class i {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, ah2 ah2Var, int i, Canvas canvas);

        public final void b(ah2 ah2Var, int i, Canvas canvas) {
            a(a, ah2Var, i, canvas);
        }
    }

    public sh2() {
        p(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (h() == f2) {
            return;
        }
        float h2 = ((f2 - h()) + 360.0f) % 360.0f;
        if (h2 > 180.0f) {
            return;
        }
        d dVar = new d(j(), k(), j(), k());
        dVar.s(h());
        dVar.t(h2);
        this.j.add(new b(dVar));
        r(f2);
    }

    private void c(i iVar, float f2, float f3) {
        b(f2);
        this.j.add(iVar);
        r(f3);
    }

    private float h() {
        return this.g;
    }

    private float i() {
        return this.h;
    }

    private void r(float f2) {
        this.g = f2;
    }

    private void s(float f2) {
        this.h = f2;
    }

    private void t(float f2) {
        this.e = f2;
    }

    private void u(float f2) {
        this.f = f2;
    }

    private void v(float f2) {
        this.c = f2;
    }

    private void w(float f2) {
        this.d = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.i.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        t((((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f));
        u((((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.get(i2).a(matrix, path);
        }
    }

    public boolean e() {
        return this.k;
    }

    @x1
    public i f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.j), new Matrix(matrix));
    }

    @e2(21)
    public void g(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.i.add(new e(f2, f3, f4, f5, f6, f7));
        this.k = true;
        t(f6);
        u(f7);
    }

    public float j() {
        return this.e;
    }

    public float k() {
        return this.f;
    }

    public float l() {
        return this.c;
    }

    public float m() {
        return this.d;
    }

    public void n(float f2, float f3) {
        f fVar = new f();
        fVar.b = f2;
        fVar.c = f3;
        this.i.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + a, cVar.c() + a);
        t(f2);
        u(f3);
    }

    @e2(21)
    public void o(float f2, float f3, float f4, float f5) {
        h hVar = new h();
        hVar.j(f2);
        hVar.k(f3);
        hVar.l(f4);
        hVar.m(f5);
        this.i.add(hVar);
        this.k = true;
        t(f4);
        u(f5);
    }

    public void p(float f2, float f3) {
        q(f2, f3, a, 0.0f);
    }

    public void q(float f2, float f3, float f4, float f5) {
        v(f2);
        w(f3);
        t(f2);
        u(f3);
        r(f4);
        s((f4 + f5) % 360.0f);
        this.i.clear();
        this.j.clear();
        this.k = false;
    }

    public sh2(float f2, float f3) {
        p(f2, f3);
    }
}