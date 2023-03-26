package com.p7700g.p99005;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class v7<E> implements Cloneable {
    private static final Object s = new Object();
    private boolean t;
    private long[] u;
    private Object[] v;
    private int w;

    public v7() {
        this(10);
    }

    private void g() {
        int i = this.w;
        long[] jArr = this.u;
        Object[] objArr = this.v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != s) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.t = false;
        this.w = i2;
    }

    public void A(long j) {
        int b = u7.b(this.u, this.w, j);
        if (b >= 0) {
            Object[] objArr = this.v;
            Object obj = objArr[b];
            Object obj2 = s;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.t = true;
            }
        }
    }

    public boolean B(long j, Object obj) {
        int n = n(j);
        if (n >= 0) {
            E I = I(n);
            if (obj == I || (obj != null && obj.equals(I))) {
                C(n);
                return true;
            }
            return false;
        }
        return false;
    }

    public void C(int i) {
        Object[] objArr = this.v;
        Object obj = objArr[i];
        Object obj2 = s;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.t = true;
        }
    }

    @z1
    public E D(long j, E e) {
        int n = n(j);
        if (n >= 0) {
            Object[] objArr = this.v;
            E e2 = (E) objArr[n];
            objArr[n] = e;
            return e2;
        }
        return null;
    }

    public boolean E(long j, E e, E e2) {
        int n = n(j);
        if (n >= 0) {
            Object obj = this.v[n];
            if (obj == e || (e != null && e.equals(obj))) {
                this.v[n] = e2;
                return true;
            }
            return false;
        }
        return false;
    }

    public void G(int i, E e) {
        if (this.t) {
            g();
        }
        this.v[i] = e;
    }

    public int H() {
        if (this.t) {
            g();
        }
        return this.w;
    }

    public E I(int i) {
        if (this.t) {
            g();
        }
        return (E) this.v[i];
    }

    public void a(long j, E e) {
        int i = this.w;
        if (i != 0 && j <= this.u[i - 1]) {
            u(j, e);
            return;
        }
        if (this.t && i >= this.u.length) {
            g();
        }
        int i2 = this.w;
        if (i2 >= this.u.length) {
            int f = u7.f(i2 + 1);
            long[] jArr = new long[f];
            Object[] objArr = new Object[f];
            long[] jArr2 = this.u;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.v;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.u = jArr;
            this.v = objArr;
        }
        this.u[i2] = j;
        this.v[i2] = e;
        this.w = i2 + 1;
    }

    public void b() {
        int i = this.w;
        Object[] objArr = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.w = 0;
        this.t = false;
    }

    /* renamed from: c */
    public v7<E> clone() {
        try {
            v7<E> v7Var = (v7) super.clone();
            v7Var.u = (long[]) this.u.clone();
            v7Var.v = (Object[]) this.v.clone();
            return v7Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean d(long j) {
        return n(j) >= 0;
    }

    public boolean e(E e) {
        return o(e) >= 0;
    }

    @Deprecated
    public void f(long j) {
        A(j);
    }

    @z1
    public E h(long j) {
        return i(j, null);
    }

    public E i(long j, E e) {
        int b = u7.b(this.u, this.w, j);
        if (b >= 0) {
            Object[] objArr = this.v;
            if (objArr[b] != s) {
                return (E) objArr[b];
            }
        }
        return e;
    }

    public int n(long j) {
        if (this.t) {
            g();
        }
        return u7.b(this.u, this.w, j);
    }

    public int o(E e) {
        if (this.t) {
            g();
        }
        for (int i = 0; i < this.w; i++) {
            if (this.v[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean p() {
        return H() == 0;
    }

    public long t(int i) {
        if (this.t) {
            g();
        }
        return this.u[i];
    }

    public String toString() {
        if (H() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.w * 28);
        sb.append('{');
        for (int i = 0; i < this.w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(t(i));
            sb.append('=');
            E I = I(i);
            if (I != this) {
                sb.append(I);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(long j, E e) {
        int b = u7.b(this.u, this.w, j);
        if (b >= 0) {
            this.v[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.w;
        if (i < i2) {
            Object[] objArr = this.v;
            if (objArr[i] == s) {
                this.u[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.t && i2 >= this.u.length) {
            g();
            i = ~u7.b(this.u, this.w, j);
        }
        int i3 = this.w;
        if (i3 >= this.u.length) {
            int f = u7.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.u;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.v;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.u = jArr;
            this.v = objArr2;
        }
        int i4 = this.w;
        if (i4 - i != 0) {
            long[] jArr3 = this.u;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.v;
            System.arraycopy(objArr4, i, objArr4, i5, this.w - i);
        }
        this.u[i] = j;
        this.v[i] = e;
        this.w++;
    }

    public void x(@x1 v7<? extends E> v7Var) {
        int H = v7Var.H();
        for (int i = 0; i < H; i++) {
            u(v7Var.t(i), v7Var.I(i));
        }
    }

    @z1
    public E y(long j, E e) {
        E h = h(j);
        if (h == null) {
            u(j, e);
        }
        return h;
    }

    public v7(int i) {
        this.t = false;
        if (i == 0) {
            this.u = u7.b;
            this.v = u7.c;
            return;
        }
        int f = u7.f(i);
        this.u = new long[f];
        this.v = new Object[f];
    }
}