package com.p7700g.p99005;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class y7<K, V> {
    public static int A = 0;
    private static final boolean s = false;
    private static final String t = "ArrayMap";
    private static final boolean u = true;
    private static final int v = 4;
    private static final int w = 10;
    @z1
    public static Object[] x;
    public static int y;
    @z1
    public static Object[] z;
    public int[] B;
    public Object[] C;
    public int D;

    public y7() {
        this.B = u7.a;
        this.C = u7.c;
        this.D = 0;
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (y7.class) {
                Object[] objArr = z;
                if (objArr != null) {
                    this.C = objArr;
                    z = (Object[]) objArr[0];
                    this.B = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (y7.class) {
                Object[] objArr2 = x;
                if (objArr2 != null) {
                    this.C = objArr2;
                    x = (Object[]) objArr2[0];
                    this.B = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    y--;
                    return;
                }
            }
        }
        this.B = new int[i];
        this.C = new Object[i << 1];
    }

    private static int e(int[] iArr, int i, int i2) {
        try {
            return u7.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void i(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (y7.class) {
                if (A < 10) {
                    objArr[0] = z;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    z = objArr;
                    A++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (y7.class) {
                if (y < 10) {
                    objArr[0] = x;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    x = objArr;
                    y++;
                }
            }
        }
    }

    public void clear() {
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.B;
            Object[] objArr = this.C;
            this.B = u7.a;
            this.C = u7.c;
            this.D = 0;
            i(iArr, objArr, i);
        }
        if (this.D > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@z1 Object obj) {
        return k(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y7) {
            y7 y7Var = (y7) obj;
            if (size() != y7Var.size()) {
                return false;
            }
            for (int i = 0; i < this.D; i++) {
                try {
                    K n = n(i);
                    V r = r(i);
                    Object obj2 = y7Var.get(n);
                    if (r == null) {
                        if (obj2 != null || !y7Var.containsKey(n)) {
                            return false;
                        }
                    } else if (!r.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.D; i2++) {
                try {
                    K n2 = n(i2);
                    V r2 = r(i2);
                    Object obj3 = map.get(n2);
                    if (r2 == null) {
                        if (obj3 != null || !map.containsKey(n2)) {
                            return false;
                        }
                    } else if (!r2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @z1
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int k = k(obj);
        return k >= 0 ? (V) this.C[(k << 1) + 1] : v2;
    }

    public void h(int i) {
        int i2 = this.D;
        int[] iArr = this.B;
        if (iArr.length < i) {
            Object[] objArr = this.C;
            a(i);
            if (this.D > 0) {
                System.arraycopy(iArr, 0, this.B, 0, i2);
                System.arraycopy(objArr, 0, this.C, 0, i2 << 1);
            }
            i(iArr, objArr, i2);
        }
        if (this.D != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.B;
        Object[] objArr = this.C;
        int i = this.D;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.D <= 0;
    }

    public int j(Object obj, int i) {
        int i2 = this.D;
        if (i2 == 0) {
            return -1;
        }
        int e = e(this.B, i2, i);
        if (e >= 0 && !obj.equals(this.C[e << 1])) {
            int i3 = e + 1;
            while (i3 < i2 && this.B[i3] == i) {
                if (obj.equals(this.C[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = e - 1; i4 >= 0 && this.B[i4] == i; i4--) {
                if (obj.equals(this.C[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return e;
    }

    public int k(@z1 Object obj) {
        return obj == null ? l() : j(obj, obj.hashCode());
    }

    public int l() {
        int i = this.D;
        if (i == 0) {
            return -1;
        }
        int e = e(this.B, i, 0);
        if (e >= 0 && this.C[e << 1] != null) {
            int i2 = e + 1;
            while (i2 < i && this.B[i2] == 0) {
                if (this.C[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = e - 1; i3 >= 0 && this.B[i3] == 0; i3--) {
                if (this.C[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return e;
    }

    public int m(Object obj) {
        int i = this.D * 2;
        Object[] objArr = this.C;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K n(int i) {
        return (K) this.C[i << 1];
    }

    public void o(@x1 y7<? extends K, ? extends V> y7Var) {
        int i = y7Var.D;
        h(this.D + i);
        if (this.D != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(y7Var.n(i2), y7Var.r(i2));
            }
        } else if (i > 0) {
            System.arraycopy(y7Var.B, 0, this.B, 0, i);
            System.arraycopy(y7Var.C, 0, this.C, 0, i << 1);
            this.D = i;
        }
    }

    public V p(int i) {
        Object[] objArr = this.C;
        int i2 = i << 1;
        V v2 = (V) objArr[i2 + 1];
        int i3 = this.D;
        int i4 = 0;
        if (i3 <= 1) {
            i(this.B, objArr, i3);
            this.B = u7.a;
            this.C = u7.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.B;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.D) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.B, 0, i);
                    System.arraycopy(objArr, 0, this.C, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.B, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.C, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.C;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.C;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.D) {
            this.D = i4;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    @z1
    public V put(K k, V v2) {
        int i;
        int j;
        int i2 = this.D;
        if (k == null) {
            j = l();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            j = j(k, hashCode);
        }
        if (j >= 0) {
            int i3 = (j << 1) + 1;
            Object[] objArr = this.C;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = ~j;
        int[] iArr = this.B;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.C;
            a(i5);
            if (i2 == this.D) {
                int[] iArr2 = this.B;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.C, 0, objArr2.length);
                }
                i(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.B;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.C;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.D - i4) << 1);
        }
        int i7 = this.D;
        if (i2 == i7) {
            int[] iArr4 = this.B;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.C;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v2;
                this.D = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @z1
    public V putIfAbsent(K k, V v2) {
        V v3 = get(k);
        return v3 == null ? put(k, v2) : v3;
    }

    public V q(int i, V v2) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.C;
        V v3 = (V) objArr[i2];
        objArr[i2] = v2;
        return v3;
    }

    public V r(int i) {
        return (V) this.C[(i << 1) + 1];
    }

    @z1
    public V remove(Object obj) {
        int k = k(obj);
        if (k >= 0) {
            return p(k);
        }
        return null;
    }

    @z1
    public V replace(K k, V v2) {
        int k2 = k(k);
        if (k2 >= 0) {
            return q(k2, v2);
        }
        return null;
    }

    public int size() {
        return this.D;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.D * 28);
        sb.append('{');
        for (int i = 0; i < this.D; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K n = n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V r = r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int k = k(obj);
        if (k >= 0) {
            V r = r(k);
            if (obj2 == r || (obj2 != null && obj2.equals(r))) {
                p(k);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v2, V v3) {
        int k2 = k(k);
        if (k2 >= 0) {
            V r = r(k2);
            if (r == v2 || (v2 != null && v2.equals(r))) {
                q(k2, v3);
                return true;
            }
            return false;
        }
        return false;
    }

    public y7(int i) {
        if (i == 0) {
            this.B = u7.a;
            this.C = u7.c;
        } else {
            a(i);
        }
        this.D = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y7(y7<K, V> y7Var) {
        this();
        if (y7Var != 0) {
            o(y7Var);
        }
    }
}