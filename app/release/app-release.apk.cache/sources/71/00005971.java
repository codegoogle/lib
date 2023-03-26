package com.p7700g.p99005;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class r7<E> implements Collection<E>, Set<E> {
    @z1
    private static Object[] A = null;
    private static int B = 0;
    private static final boolean s = false;
    private static final String t = "ArraySet";
    private static final int[] u = new int[0];
    private static final Object[] v = new Object[0];
    private static final int w = 4;
    private static final int x = 10;
    @z1
    private static Object[] y;
    private static int z;
    private int[] C;
    public Object[] D;
    public int E;
    private x7<E, E> F;

    /* compiled from: ArraySet.java */
    /* loaded from: classes.dex */
    public class a extends x7<E, E> {
        public a() {
        }

        @Override // com.p7700g.p99005.x7
        public void a() {
            r7.this.clear();
        }

        @Override // com.p7700g.p99005.x7
        public Object b(int i, int i2) {
            return r7.this.D[i];
        }

        @Override // com.p7700g.p99005.x7
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.p7700g.p99005.x7
        public int d() {
            return r7.this.E;
        }

        @Override // com.p7700g.p99005.x7
        public int e(Object obj) {
            return r7.this.indexOf(obj);
        }

        @Override // com.p7700g.p99005.x7
        public int f(Object obj) {
            return r7.this.indexOf(obj);
        }

        @Override // com.p7700g.p99005.x7
        public void g(E e, E e2) {
            r7.this.add(e);
        }

        @Override // com.p7700g.p99005.x7
        public void h(int i) {
            r7.this.i(i);
        }

        @Override // com.p7700g.p99005.x7
        public E i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public r7() {
        this(0);
    }

    private void b(int i) {
        if (i == 8) {
            synchronized (r7.class) {
                Object[] objArr = A;
                if (objArr != null) {
                    this.D = objArr;
                    A = (Object[]) objArr[0];
                    this.C = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    B--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (r7.class) {
                Object[] objArr2 = y;
                if (objArr2 != null) {
                    this.D = objArr2;
                    y = (Object[]) objArr2[0];
                    this.C = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    z--;
                    return;
                }
            }
        }
        this.C = new int[i];
        this.D = new Object[i];
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (r7.class) {
                if (B < 10) {
                    objArr[0] = A;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    A = objArr;
                    B++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (r7.class) {
                if (z < 10) {
                    objArr[0] = y;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    y = objArr;
                    z++;
                }
            }
        }
    }

    private x7<E, E> e() {
        if (this.F == null) {
            this.F = new a();
        }
        return this.F;
    }

    private int f(Object obj, int i) {
        int i2 = this.E;
        if (i2 == 0) {
            return -1;
        }
        int a2 = u7.a(this.C, i2, i);
        if (a2 >= 0 && !obj.equals(this.D[a2])) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.C[i3] == i) {
                if (obj.equals(this.D[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.C[i4] == i; i4--) {
                if (obj.equals(this.D[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return a2;
    }

    private int g() {
        int i = this.E;
        if (i == 0) {
            return -1;
        }
        int a2 = u7.a(this.C, i, 0);
        if (a2 >= 0 && this.D[a2] != null) {
            int i2 = a2 + 1;
            while (i2 < i && this.C[i2] == 0) {
                if (this.D[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.C[i3] == 0; i3--) {
                if (this.D[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return a2;
    }

    public void a(@x1 r7<? extends E> r7Var) {
        int i = r7Var.E;
        c(this.E + i);
        if (this.E != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(r7Var.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(r7Var.C, 0, this.C, 0, i);
            System.arraycopy(r7Var.D, 0, this.D, 0, i);
            this.E = i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@z1 E e) {
        int i;
        int f;
        if (e == null) {
            f = g();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            f = f(e, hashCode);
        }
        if (f >= 0) {
            return false;
        }
        int i2 = ~f;
        int i3 = this.E;
        int[] iArr = this.C;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.D;
            b(i4);
            int[] iArr2 = this.C;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.D, 0, objArr.length);
            }
            d(iArr, objArr, this.E);
        }
        int i5 = this.E;
        if (i2 < i5) {
            int[] iArr3 = this.C;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.D;
            System.arraycopy(objArr2, i2, objArr2, i6, this.E - i2);
        }
        this.C[i2] = i;
        this.D[i2] = e;
        this.E++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@x1 Collection<? extends E> collection) {
        c(collection.size() + this.E);
        boolean z2 = false;
        for (E e : collection) {
            z2 |= add(e);
        }
        return z2;
    }

    public void c(int i) {
        int[] iArr = this.C;
        if (iArr.length < i) {
            Object[] objArr = this.D;
            b(i);
            int i2 = this.E;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.C, 0, i2);
                System.arraycopy(objArr, 0, this.D, 0, this.E);
            }
            d(iArr, objArr, this.E);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.E;
        if (i != 0) {
            d(this.C, this.D, i);
            this.C = u;
            this.D = v;
            this.E = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@z1 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@x1 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.E; i++) {
                try {
                    if (!set.contains(m(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(@x1 r7<? extends E> r7Var) {
        int i = r7Var.E;
        int i2 = this.E;
        for (int i3 = 0; i3 < i; i3++) {
            remove(r7Var.m(i3));
        }
        return i2 != this.E;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.C;
        int i = this.E;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public E i(int i) {
        Object[] objArr = this.D;
        E e = (E) objArr[i];
        int i2 = this.E;
        if (i2 <= 1) {
            d(this.C, objArr, i2);
            this.C = u;
            this.D = v;
            this.E = 0;
        } else {
            int[] iArr = this.C;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                b(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.E--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.C, 0, i);
                    System.arraycopy(objArr, 0, this.D, 0, i);
                }
                int i3 = this.E;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.C, i, i3 - i);
                    System.arraycopy(objArr, i4, this.D, i, this.E - i);
                }
            } else {
                int i5 = i2 - 1;
                this.E = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.D;
                    System.arraycopy(objArr2, i6, objArr2, i, this.E - i);
                }
                this.D[this.E] = null;
            }
        }
        return e;
    }

    public int indexOf(@z1 Object obj) {
        return obj == null ? g() : f(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.E <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return e().m().iterator();
    }

    @z1
    public E m(int i) {
        return (E) this.D[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@z1 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@x1 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@x1 Collection<?> collection) {
        boolean z2 = false;
        for (int i = this.E - 1; i >= 0; i--) {
            if (!collection.contains(this.D[i])) {
                i(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.E;
    }

    @Override // java.util.Collection, java.util.Set
    @x1
    public Object[] toArray() {
        int i = this.E;
        Object[] objArr = new Object[i];
        System.arraycopy(this.D, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.E * 14);
        sb.append('{');
        for (int i = 0; i < this.E; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public r7(int i) {
        if (i == 0) {
            this.C = u;
            this.D = v;
        } else {
            b(i);
        }
        this.E = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @x1
    public <T> T[] toArray(@x1 T[] tArr) {
        if (tArr.length < this.E) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.E));
        }
        System.arraycopy(this.D, 0, tArr, 0, this.E);
        int length = tArr.length;
        int i = this.E;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r7(@z1 r7<E> r7Var) {
        this();
        if (r7Var != 0) {
            a(r7Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r7(@z1 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}