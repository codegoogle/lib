package com.p7700g.p99005;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class z7<E> implements Cloneable {
    private static final Object s = new Object();
    private boolean t;
    private int[] u;
    private Object[] v;
    private int w;

    public z7() {
        this(10);
    }

    private void g() {
        int i = this.w;
        int[] iArr = this.u;
        Object[] objArr = this.v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != s) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.t = false;
        this.w = i2;
    }

    public void A(int i) {
        int a = u7.a(this.u, this.w, i);
        if (a >= 0) {
            Object[] objArr = this.v;
            Object obj = objArr[a];
            Object obj2 = s;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.t = true;
            }
        }
    }

    public boolean B(int i, Object obj) {
        int n = n(i);
        if (n >= 0) {
            E J = J(n);
            if (obj == J || (obj != null && obj.equals(J))) {
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

    public void D(int i, int i2) {
        int min = Math.min(this.w, i2 + i);
        while (i < min) {
            C(i);
            i++;
        }
    }

    @z1
    public E E(int i, E e) {
        int n = n(i);
        if (n >= 0) {
            Object[] objArr = this.v;
            E e2 = (E) objArr[n];
            objArr[n] = e;
            return e2;
        }
        return null;
    }

    public boolean G(int i, E e, E e2) {
        int n = n(i);
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

    public void H(int i, E e) {
        if (this.t) {
            g();
        }
        this.v[i] = e;
    }

    public int I() {
        if (this.t) {
            g();
        }
        return this.w;
    }

    public E J(int i) {
        if (this.t) {
            g();
        }
        return (E) this.v[i];
    }

    public void a(int i, E e) {
        int i2 = this.w;
        if (i2 != 0 && i <= this.u[i2 - 1]) {
            u(i, e);
            return;
        }
        if (this.t && i2 >= this.u.length) {
            g();
        }
        int i3 = this.w;
        if (i3 >= this.u.length) {
            int e2 = u7.e(i3 + 1);
            int[] iArr = new int[e2];
            Object[] objArr = new Object[e2];
            int[] iArr2 = this.u;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.v;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.u = iArr;
            this.v = objArr;
        }
        this.u[i3] = i;
        this.v[i3] = e;
        this.w = i3 + 1;
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
    public z7<E> clone() {
        try {
            z7<E> z7Var = (z7) super.clone();
            z7Var.u = (int[]) this.u.clone();
            z7Var.v = (Object[]) this.v.clone();
            return z7Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean d(int i) {
        return n(i) >= 0;
    }

    public boolean e(E e) {
        return o(e) >= 0;
    }

    @Deprecated
    public void f(int i) {
        A(i);
    }

    @z1
    public E h(int i) {
        return i(i, null);
    }

    public E i(int i, E e) {
        int a = u7.a(this.u, this.w, i);
        if (a >= 0) {
            Object[] objArr = this.v;
            if (objArr[a] != s) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public int n(int i) {
        if (this.t) {
            g();
        }
        return u7.a(this.u, this.w, i);
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
        return I() == 0;
    }

    public int t(int i) {
        if (this.t) {
            g();
        }
        return this.u[i];
    }

    public String toString() {
        if (I() <= 0) {
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
            E J = J(i);
            if (J != this) {
                sb.append(J);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i, E e) {
        int a = u7.a(this.u, this.w, i);
        if (a >= 0) {
            this.v[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.w;
        if (i2 < i3) {
            Object[] objArr = this.v;
            if (objArr[i2] == s) {
                this.u[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.t && i3 >= this.u.length) {
            g();
            i2 = ~u7.a(this.u, this.w, i);
        }
        int i4 = this.w;
        if (i4 >= this.u.length) {
            int e2 = u7.e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.u;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.v;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.u = iArr;
            this.v = objArr2;
        }
        int i5 = this.w;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.u;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.v;
            System.arraycopy(objArr4, i2, objArr4, i6, this.w - i2);
        }
        this.u[i2] = i;
        this.v[i2] = e;
        this.w++;
    }

    public void x(@x1 z7<? extends E> z7Var) {
        int I = z7Var.I();
        for (int i = 0; i < I; i++) {
            u(z7Var.t(i), z7Var.J(i));
        }
    }

    @z1
    public E y(int i, E e) {
        E h = h(i);
        if (h == null) {
            u(i, e);
        }
        return h;
    }

    public z7(int i) {
        this.t = false;
        if (i == 0) {
            this.u = u7.a;
            this.v = u7.c;
            return;
        }
        int e = u7.e(i);
        this.u = new int[e];
        this.v = new Object[e];
    }
}