package com.p7700g.p99005;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.p7700g.p99005.t30;
import com.p7700g.p99005.u30;

/* compiled from: AsyncListUtil.java */
/* loaded from: classes.dex */
public class t20<T> {
    public static final String a = "AsyncListUtil";
    public static final boolean b = false;
    public final Class<T> c;
    public final int d;
    public final c<T> e;
    public final d f;
    public final u30<T> g;
    public final t30.b<T> h;
    public final t30.a<T> i;
    public boolean m;
    private final t30.b<T> s;
    private final t30.a<T> t;
    public final int[] j = new int[2];
    public final int[] k = new int[2];
    public final int[] l = new int[2];
    private int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public final SparseIntArray r = new SparseIntArray();

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes.dex */
    public class a implements t30.b<T> {
        public a() {
        }

        private boolean d(int i) {
            return i == t20.this.q;
        }

        private void e() {
            for (int i = 0; i < t20.this.g.f(); i++) {
                t20 t20Var = t20.this;
                t20Var.i.b(t20Var.g.c(i));
            }
            t20.this.g.b();
        }

        @Override // com.p7700g.p99005.t30.b
        public void a(int i, u30.a<T> aVar) {
            if (!d(i)) {
                t20.this.i.b(aVar);
                return;
            }
            u30.a<T> a = t20.this.g.a(aVar);
            if (a != null) {
                t20.this.i.b(a);
            }
            int i2 = aVar.b + aVar.c;
            int i3 = 0;
            while (i3 < t20.this.r.size()) {
                int keyAt = t20.this.r.keyAt(i3);
                if (aVar.b > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    t20.this.r.removeAt(i3);
                    t20.this.f.d(keyAt);
                }
            }
        }

        @Override // com.p7700g.p99005.t30.b
        public void b(int i, int i2) {
            u30.a<T> e;
            if (d(i) && (e = t20.this.g.e(i2)) != null) {
                t20.this.i.b(e);
            }
        }

        @Override // com.p7700g.p99005.t30.b
        public void c(int i, int i2) {
            if (d(i)) {
                t20 t20Var = t20.this;
                t20Var.o = i2;
                t20Var.f.c();
                t20 t20Var2 = t20.this;
                t20Var2.p = t20Var2.q;
                e();
                t20 t20Var3 = t20.this;
                t20Var3.m = false;
                t20Var3.g();
            }
        }
    }

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes.dex */
    public class b implements t30.a<T> {
        private u30.a<T> a;
        public final SparseBooleanArray b = new SparseBooleanArray();
        private int c;
        private int d;
        private int e;
        private int f;

        public b() {
        }

        private u30.a<T> e() {
            u30.a<T> aVar = this.a;
            if (aVar != null) {
                this.a = aVar.d;
                return aVar;
            }
            t20 t20Var = t20.this;
            return new u30.a<>(t20Var.c, t20Var.d);
        }

        private void f(u30.a<T> aVar) {
            this.b.put(aVar.b, true);
            t20.this.h.a(this.c, aVar);
        }

        private void g(int i) {
            int b = t20.this.e.b();
            while (this.b.size() >= b) {
                int keyAt = this.b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.e - keyAt;
                int i3 = keyAt2 - this.f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    k(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 >= i3 && i != 1) {
                        return;
                    }
                    k(keyAt2);
                }
            }
        }

        private int h(int i) {
            return i - (i % t20.this.d);
        }

        private boolean i(int i) {
            return this.b.get(i);
        }

        private void j(String str, Object... objArr) {
            String.format(str, objArr);
        }

        private void k(int i) {
            this.b.delete(i);
            t20.this.h.b(this.c, i);
        }

        private void l(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                t20.this.i.c(z ? (i2 + i) - i4 : i4, i3);
                i4 += t20.this.d;
            }
        }

        @Override // com.p7700g.p99005.t30.a
        public void a(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int h = h(i);
            int h2 = h(i2);
            this.e = h(i3);
            int h3 = h(i4);
            this.f = h3;
            if (i5 == 1) {
                l(this.e, h2, i5, true);
                l(h2 + t20.this.d, this.f, i5, false);
                return;
            }
            l(h, h3, i5, false);
            l(this.e, h - t20.this.d, i5, true);
        }

        @Override // com.p7700g.p99005.t30.a
        public void b(u30.a<T> aVar) {
            t20.this.e.c(aVar.a, aVar.c);
            aVar.d = this.a;
            this.a = aVar;
        }

        @Override // com.p7700g.p99005.t30.a
        public void c(int i, int i2) {
            if (i(i)) {
                return;
            }
            u30.a<T> e = e();
            e.b = i;
            int min = Math.min(t20.this.d, this.d - i);
            e.c = min;
            t20.this.e.a(e.a, e.b, min);
            g(i2);
            f(e);
        }

        @Override // com.p7700g.p99005.t30.a
        public void d(int i) {
            this.c = i;
            this.b.clear();
            int d = t20.this.e.d();
            this.d = d;
            t20.this.h.c(this.c, d);
        }
    }

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes.dex */
    public static abstract class c<T> {
        @s2
        public abstract void a(@x1 T[] tArr, int i, int i2);

        @s2
        public int b() {
            return 10;
        }

        @s2
        public void c(@x1 T[] tArr, int i) {
        }

        @s2
        public abstract int d();
    }

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;

        @q2
        public void a(@x1 int[] iArr, @x1 int[] iArr2, int i) {
            int i2 = (iArr[1] - iArr[0]) + 1;
            int i3 = i2 / 2;
            iArr2[0] = iArr[0] - (i == 1 ? i2 : i3);
            int i4 = iArr[1];
            if (i != 2) {
                i2 = i3;
            }
            iArr2[1] = i4 + i2;
        }

        @q2
        public abstract void b(@x1 int[] iArr);

        @q2
        public abstract void c();

        @q2
        public abstract void d(int i);
    }

    public t20(@x1 Class<T> cls, int i, @x1 c<T> cVar, @x1 d dVar) {
        a aVar = new a();
        this.s = aVar;
        b bVar = new b();
        this.t = bVar;
        this.c = cls;
        this.d = i;
        this.e = cVar;
        this.f = dVar;
        this.g = new u30<>(i);
        j30 j30Var = new j30();
        this.h = j30Var.b(aVar);
        this.i = j30Var.a(bVar);
        f();
    }

    private boolean c() {
        return this.q != this.p;
    }

    @z1
    public T a(int i) {
        if (i >= 0 && i < this.o) {
            T d2 = this.g.d(i);
            if (d2 == null && !c()) {
                this.r.put(i, 0);
            }
            return d2;
        }
        throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.o);
    }

    public int b() {
        return this.o;
    }

    public void d(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.m = true;
    }

    public void f() {
        this.r.clear();
        t30.a<T> aVar = this.i;
        int i = this.q + 1;
        this.q = i;
        aVar.d(i);
    }

    public void g() {
        this.f.b(this.j);
        int[] iArr = this.j;
        if (iArr[0] > iArr[1] || iArr[0] < 0 || iArr[1] >= this.o) {
            return;
        }
        if (!this.m) {
            this.n = 0;
        } else {
            int i = iArr[0];
            int[] iArr2 = this.k;
            if (i <= iArr2[1] && iArr2[0] <= iArr[1]) {
                if (iArr[0] < iArr2[0]) {
                    this.n = 1;
                } else if (iArr[0] > iArr2[0]) {
                    this.n = 2;
                }
            } else {
                this.n = 0;
            }
        }
        int[] iArr3 = this.k;
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        this.f.a(iArr, this.l, this.n);
        int[] iArr4 = this.l;
        iArr4[0] = Math.min(this.j[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.l;
        iArr5[1] = Math.max(this.j[1], Math.min(iArr5[1], this.o - 1));
        t30.a<T> aVar = this.i;
        int[] iArr6 = this.j;
        int i2 = iArr6[0];
        int i3 = iArr6[1];
        int[] iArr7 = this.l;
        aVar.a(i2, i3, iArr7[0], iArr7[1], this.n);
    }
}