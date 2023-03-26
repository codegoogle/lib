package com.p7700g.p99005;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: SortedList.java */
/* loaded from: classes.dex */
public class r30<T> {
    public static final int a = -1;
    private static final int b = 10;
    private static final int c = 10;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 4;
    public T[] g;
    private T[] h;
    private int i;
    private int j;
    private int k;
    private b l;
    private a m;
    private int n;
    private final Class<T> o;

    /* compiled from: SortedList.java */
    /* loaded from: classes.dex */
    public static class a<T2> extends b<T2> {
        public final b<T2> s;
        private final u20 t;

        public a(b<T2> bVar) {
            this.s = bVar;
            this.t = new u20(bVar);
        }

        @Override // com.p7700g.p99005.i30
        public void a(int i, int i2) {
            this.t.a(i, i2);
        }

        @Override // com.p7700g.p99005.i30
        public void b(int i, int i2) {
            this.t.b(i, i2);
        }

        @Override // com.p7700g.p99005.r30.b, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.s.compare(t2, t22);
        }

        @Override // com.p7700g.p99005.i30
        public void d(int i, int i2) {
            this.t.d(i, i2);
        }

        @Override // com.p7700g.p99005.r30.b, com.p7700g.p99005.i30
        public void f(int i, int i2, Object obj) {
            this.t.f(i, i2, obj);
        }

        @Override // com.p7700g.p99005.r30.b
        public boolean g(T2 t2, T2 t22) {
            return this.s.g(t2, t22);
        }

        @Override // com.p7700g.p99005.r30.b
        public boolean h(T2 t2, T2 t22) {
            return this.s.h(t2, t22);
        }

        @Override // com.p7700g.p99005.r30.b
        @z1
        public Object i(T2 t2, T2 t22) {
            return this.s.i(t2, t22);
        }

        @Override // com.p7700g.p99005.r30.b
        public void j(int i, int i2) {
            this.t.f(i, i2, null);
        }

        public void k() {
            this.t.c();
        }
    }

    /* compiled from: SortedList.java */
    /* loaded from: classes.dex */
    public static abstract class b<T2> implements Comparator<T2>, i30 {
        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public void f(int i, int i2, Object obj) {
            j(i, i2);
        }

        public abstract boolean g(T2 t2, T2 t22);

        public abstract boolean h(T2 t2, T2 t22);

        @z1
        public Object i(T2 t2, T2 t22) {
            return null;
        }

        public abstract void j(int i, int i2);
    }

    public r30(@x1 Class<T> cls, @x1 b<T> bVar) {
        this(cls, bVar, 10);
    }

    private void A(@x1 T[] tArr) {
        boolean z = !(this.l instanceof a);
        if (z) {
            h();
        }
        this.i = 0;
        this.j = this.n;
        this.h = this.g;
        this.k = 0;
        int D = D(tArr);
        this.g = (T[]) ((Object[]) Array.newInstance((Class<?>) this.o, D));
        while (true) {
            int i = this.k;
            if (i >= D && this.i >= this.j) {
                break;
            }
            int i2 = this.i;
            int i3 = this.j;
            if (i2 >= i3) {
                int i4 = D - i;
                System.arraycopy(tArr, i, this.g, i, i4);
                this.k += i4;
                this.n += i4;
                this.l.b(i, i4);
                break;
            } else if (i >= D) {
                int i5 = i3 - i2;
                this.n -= i5;
                this.l.d(i, i5);
                break;
            } else {
                T t = this.h[i2];
                T t2 = tArr[i];
                int compare = this.l.compare(t, t2);
                if (compare < 0) {
                    B();
                } else if (compare > 0) {
                    z(t2);
                } else if (!this.l.h(t, t2)) {
                    B();
                    z(t2);
                } else {
                    T[] tArr2 = this.g;
                    int i6 = this.k;
                    tArr2[i6] = t2;
                    this.i++;
                    this.k = i6 + 1;
                    if (!this.l.g(t, t2)) {
                        b bVar = this.l;
                        bVar.f(this.k - 1, 1, bVar.i(t, t2));
                    }
                }
            }
        }
        this.h = null;
        if (z) {
            k();
        }
    }

    private void B() {
        this.n--;
        this.i++;
        this.l.d(this.k, 1);
    }

    private int D(@x1 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.l);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.l.compare(tArr[i2], t) == 0) {
                int m = m(t, tArr, i2, i);
                if (m != -1) {
                    tArr[m] = t;
                } else {
                    if (i != i3) {
                        tArr[i] = t;
                    }
                    i++;
                }
            } else {
                if (i != i3) {
                    tArr[i] = t;
                }
                i2 = i;
                i++;
            }
        }
        return i;
    }

    private void E() {
        if (this.h != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t, boolean z) {
        int l = l(t, this.g, 0, this.n, 1);
        if (l == -1) {
            l = 0;
        } else if (l < this.n) {
            T t2 = this.g[l];
            if (this.l.h(t2, t)) {
                if (this.l.g(t2, t)) {
                    this.g[l] = t;
                    return l;
                }
                this.g[l] = t;
                b bVar = this.l;
                bVar.f(l, 1, bVar.i(t2, t));
                return l;
            }
        }
        g(l, t);
        if (z) {
            this.l.b(l, 1);
        }
        return l;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D = D(tArr);
        if (this.n == 0) {
            this.g = tArr;
            this.n = D;
            this.l.b(0, D);
            return;
        }
        q(tArr, D);
    }

    private void g(int i, T t) {
        int i2 = this.n;
        if (i <= i2) {
            T[] tArr = this.g;
            if (i2 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.o, tArr.length + 10));
                System.arraycopy(this.g, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.g, i, tArr2, i + 1, this.n - i);
                this.g = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.g[i] = t;
            }
            this.n++;
            return;
        }
        StringBuilder H = wo1.H("cannot add item to ", i, " because size is ");
        H.append(this.n);
        throw new IndexOutOfBoundsException(H.toString());
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.o, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.l.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare == 0) {
                if (this.l.h(t2, t)) {
                    return i4;
                }
                int p = p(t, i4, i, i2);
                return (i3 == 1 && p == -1) ? i4 : p;
            } else {
                i2 = i4;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    private int m(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.l.h(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int p(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.g[i4];
            if (this.l.compare(t3, t) != 0) {
                break;
            } else if (this.l.h(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.g[i];
            if (this.l.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.l.h(t2, t));
        return i;
    }

    private void q(T[] tArr, int i) {
        boolean z = !(this.l instanceof a);
        if (z) {
            h();
        }
        this.h = this.g;
        int i2 = 0;
        this.i = 0;
        int i3 = this.n;
        this.j = i3;
        this.g = (T[]) ((Object[]) Array.newInstance((Class<?>) this.o, i3 + i + 10));
        this.k = 0;
        while (true) {
            int i4 = this.i;
            int i5 = this.j;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.g, this.k, i6);
                int i7 = this.k + i6;
                this.k = i7;
                this.n += i6;
                this.l.b(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.h, i4, this.g, this.k, i8);
                this.k += i8;
                break;
            } else {
                T t = this.h[i4];
                T t2 = tArr[i2];
                int compare = this.l.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.g;
                    int i9 = this.k;
                    int i10 = i9 + 1;
                    this.k = i10;
                    tArr2[i9] = t2;
                    this.n++;
                    i2++;
                    this.l.b(i10 - 1, 1);
                } else if (compare == 0 && this.l.h(t, t2)) {
                    T[] tArr3 = this.g;
                    int i11 = this.k;
                    this.k = i11 + 1;
                    tArr3[i11] = t2;
                    i2++;
                    this.i++;
                    if (!this.l.g(t, t2)) {
                        b bVar = this.l;
                        bVar.f(this.k - 1, 1, bVar.i(t, t2));
                    }
                } else {
                    T[] tArr4 = this.g;
                    int i12 = this.k;
                    this.k = i12 + 1;
                    tArr4[i12] = t;
                    this.i++;
                }
            }
        }
        this.h = null;
        if (z) {
            k();
        }
    }

    private boolean t(T t, boolean z) {
        int l = l(t, this.g, 0, this.n, 2);
        if (l == -1) {
            return false;
        }
        v(l, z);
        return true;
    }

    private void v(int i, boolean z) {
        T[] tArr = this.g;
        System.arraycopy(tArr, i + 1, tArr, i, (this.n - i) - 1);
        int i2 = this.n - 1;
        this.n = i2;
        this.g[i2] = null;
        if (z) {
            this.l.d(i, 1);
        }
    }

    private void z(T t) {
        T[] tArr = this.g;
        int i = this.k;
        tArr[i] = t;
        int i2 = i + 1;
        this.k = i2;
        this.n++;
        this.l.b(i2 - 1, 1);
    }

    public int C() {
        return this.n;
    }

    public void F(int i, T t) {
        E();
        T n = n(i);
        boolean z = n == t || !this.l.g(n, t);
        if (n != t && this.l.compare(n, t) == 0) {
            this.g[i] = t;
            if (z) {
                b bVar = this.l;
                bVar.f(i, 1, bVar.i(n, t));
                return;
            }
            return;
        }
        if (z) {
            b bVar2 = this.l;
            bVar2.f(i, 1, bVar2.i(n, t));
        }
        v(i, false);
        int b2 = b(t, false);
        if (i != b2) {
            this.l.a(i, b2);
        }
    }

    public int a(T t) {
        E();
        return b(t, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@x1 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.o, collection.size())), true);
    }

    public void d(@x1 T... tArr) {
        e(tArr, false);
    }

    public void e(@x1 T[] tArr, boolean z) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.l;
        if (bVar instanceof a) {
            return;
        }
        if (this.m == null) {
            this.m = new a(bVar);
        }
        this.l = this.m;
    }

    public void i() {
        E();
        int i = this.n;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.g, 0, i, (Object) null);
        this.n = 0;
        this.l.d(0, i);
    }

    public void k() {
        E();
        b bVar = this.l;
        if (bVar instanceof a) {
            ((a) bVar).k();
        }
        b bVar2 = this.l;
        a aVar = this.m;
        if (bVar2 == aVar) {
            this.l = aVar.s;
        }
    }

    public T n(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.n && i >= 0) {
            T[] tArr = this.h;
            if (tArr != null && i >= (i2 = this.k)) {
                return tArr[(i - i2) + this.i];
            }
            return this.g[i];
        }
        StringBuilder H = wo1.H("Asked to get item at ", i, " but size is ");
        H.append(this.n);
        throw new IndexOutOfBoundsException(H.toString());
    }

    public int o(T t) {
        if (this.h != null) {
            int l = l(t, this.g, 0, this.k, 4);
            if (l != -1) {
                return l;
            }
            int l2 = l(t, this.h, this.i, this.j, 4);
            if (l2 != -1) {
                return (l2 - this.i) + this.k;
            }
            return -1;
        }
        return l(t, this.g, 0, this.n, 4);
    }

    public void r(int i) {
        E();
        T n = n(i);
        v(i, false);
        int b2 = b(n, false);
        if (i != b2) {
            this.l.a(i, b2);
        }
    }

    public boolean s(T t) {
        E();
        return t(t, true);
    }

    public T u(int i) {
        E();
        T n = n(i);
        v(i, true);
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@x1 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.o, collection.size())), true);
    }

    public void x(@x1 T... tArr) {
        y(tArr, false);
    }

    public void y(@x1 T[] tArr, boolean z) {
        E();
        if (z) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public r30(@x1 Class<T> cls, @x1 b<T> bVar, int i) {
        this.o = cls;
        this.g = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.l = bVar;
        this.n = 0;
    }
}