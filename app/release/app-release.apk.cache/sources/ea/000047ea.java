package com.p7700g.p99005;

import com.p7700g.p99005.m14;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: IPAddressPartStringCollection.java */
/* loaded from: classes3.dex */
public class i54 extends j54<o34, l54<?>, h54<?, ?>> {
    private final List<k54<?, ?, ? extends h54<?, ?>>> s = new ArrayList();

    /* compiled from: IPAddressPartStringCollection.java */
    /* loaded from: classes3.dex */
    public class a implements Iterator<h54<?, ?>> {
        private int s;
        private Iterator<? extends h54<?, ?>> t;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public h54<?, ?> next() {
            if (hasNext()) {
                return this.t.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                if (this.t == null) {
                    if (this.s >= i54.this.s.size()) {
                        return false;
                    }
                    List list = i54.this.s;
                    int i = this.s;
                    this.s = i + 1;
                    this.t = ((k54) list.get(i)).iterator();
                }
                if (this.t.hasNext()) {
                    return true;
                }
                this.t = null;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends h54<?, ?>> it = this.t;
            if (it != null) {
                it.remove();
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: IPAddressPartStringCollection.java */
    /* loaded from: classes3.dex */
    public static abstract class b<T extends o34, P extends l54<T>, S extends h54<T, P>, C extends k54<T, P, S>, O extends m14.c> {
        public static int a = 16;
        private int[][] b;
        public final T c;
        public final O d;
        public final C e;
        private boolean f;

        public b(T t, O o, C c) {
            this.c = t;
            this.d = o;
            this.e = c;
        }

        public static int[] d(int i, o34 o34Var) {
            int p1 = o34Var.p1();
            int[] iArr = new int[p1];
            for (int i2 = 0; i2 < p1; i2++) {
                m34 e0 = o34Var.e0(i2);
                int c = e0.c(i);
                int b = e0.b(i);
                if (c < b) {
                    iArr[i2] = b - c;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        }

        private static boolean g(int i, o34 o34Var) {
            return i(i, o34Var, -1, 0);
        }

        private static boolean i(int i, o34 o34Var, int i2, int i3) {
            int i4 = i3 + i2;
            for (int i5 = 0; i5 < o34Var.p1(); i5++) {
                if (i5 < i2 || i5 >= i4) {
                    m34 e0 = o34Var.e0(i5);
                    if (e0.c(i) < e0.b(i)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public abstract void a();

        public void b(P p) {
            this.e.b(p);
        }

        public int[] c(int i) {
            int[][] iArr = this.b;
            if (iArr == null) {
                int[][] iArr2 = new int[a + 1];
                this.b = iArr2;
                int[] d = d(i, this.c);
                iArr2[i] = d;
                return d;
            }
            int[] iArr3 = iArr[i];
            if (iArr3 == null) {
                int[] d2 = d(i, this.c);
                iArr[i] = d2;
                return d2;
            }
            return iArr3;
        }

        public C e() {
            if (!this.f) {
                synchronized (this) {
                    if (!this.f) {
                        this.f = true;
                        a();
                    }
                }
            }
            return this.e;
        }

        public boolean f(int i) {
            return g(i, this.c);
        }

        public boolean h(int i, int i2, int i3) {
            return i(i, this.c, i2, i3);
        }
    }

    @Override // com.p7700g.p99005.j54
    public /* bridge */ /* synthetic */ String[] a() {
        return super.a();
    }

    public void c(k54<?, ?, ? extends h54<?, ?>> k54Var) {
        this.s.add(k54Var);
    }

    public void d(i54 i54Var) {
        this.s.addAll(i54Var.s);
    }

    public o34 e(int i) {
        return h(i).s;
    }

    public int f() {
        return this.s.size();
    }

    public o34[] g(o34[] o34VarArr) {
        int f = f();
        if (o34VarArr.length < f) {
            o34VarArr = (o34[]) Array.newInstance(o34VarArr.getClass().getComponentType(), f);
        }
        int i = 0;
        for (k54<?, ?, ? extends h54<?, ?>> k54Var : this.s) {
            o34VarArr[i] = k54Var.s;
            i++;
        }
        return o34VarArr;
    }

    public k54<?, ?, ?> h(int i) {
        return this.s.get(i);
    }

    public k54<?, ?, ?> i(o34 o34Var) {
        for (k54<?, ?, ? extends h54<?, ?>> k54Var : this.s) {
            if (k54Var.s.equals(o34Var)) {
                return k54Var;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<h54<?, ?>> iterator() {
        return new a();
    }

    @Override // com.p7700g.p99005.j54
    public int size() {
        int i = 0;
        for (k54<?, ?, ? extends h54<?, ?>> k54Var : this.s) {
            i += k54Var.size();
        }
        return i;
    }
}