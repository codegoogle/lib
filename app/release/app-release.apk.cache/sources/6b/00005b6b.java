package com.p7700g.p99005;

/* compiled from: CircularArray.java */
/* loaded from: classes.dex */
public final class s7<E> {
    private E[] a;
    private int b;
    private int c;
    private int d;

    public s7() {
        this(8);
    }

    private void d() {
        E[] eArr = this.a;
        int length = eArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.a, 0, eArr2, i2, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(E e) {
        int i = (this.b - 1) & this.d;
        this.b = i;
        this.a[i] = e;
        if (i == this.c) {
            d();
        }
    }

    public void b(E e) {
        E[] eArr = this.a;
        int i = this.c;
        eArr[i] = e;
        int i2 = this.d & (i + 1);
        this.c = i2;
        if (i2 == this.b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public E e(int i) {
        if (i >= 0 && i < m()) {
            return this.a[this.d & (this.b + i)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E f() {
        int i = this.b;
        if (i != this.c) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            return this.a[(i2 - 1) & this.d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.b == this.c;
    }

    public E i() {
        int i = this.b;
        if (i != this.c) {
            E[] eArr = this.a;
            E e = eArr[i];
            eArr[i] = null;
            this.b = (i + 1) & this.d;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E j() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            int i3 = this.d & (i2 - 1);
            E[] eArr = this.a;
            E e = eArr[i3];
            eArr[i3] = null;
            this.c = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i) {
        int i2;
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            int i3 = this.c;
            int i4 = i < i3 ? i3 - i : 0;
            int i5 = i4;
            while (true) {
                i2 = this.c;
                if (i5 >= i2) {
                    break;
                }
                this.a[i5] = null;
                i5++;
            }
            int i6 = i2 - i4;
            int i7 = i - i6;
            this.c = i2 - i6;
            if (i7 > 0) {
                int length = this.a.length;
                this.c = length;
                int i8 = length - i7;
                for (int i9 = i8; i9 < this.c; i9++) {
                    this.a[i9] = null;
                }
                this.c = i8;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void l(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            int length = this.a.length;
            int i2 = this.b;
            if (i < length - i2) {
                length = i2 + i;
            }
            while (i2 < length) {
                this.a[i2] = null;
                i2++;
            }
            int i3 = this.b;
            int i4 = length - i3;
            int i5 = i - i4;
            this.b = this.d & (i3 + i4);
            if (i5 > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    this.a[i6] = null;
                }
                this.b = i5;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int m() {
        return (this.c - this.b) & this.d;
    }

    public s7(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.d = i - 1;
            this.a = (E[]) new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}