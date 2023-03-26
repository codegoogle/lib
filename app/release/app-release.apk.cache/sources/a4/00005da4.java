package com.p7700g.p99005;

/* compiled from: CircularIntArray.java */
/* loaded from: classes.dex */
public final class t7 {
    private int[] a;
    private int b;
    private int c;
    private int d;

    public t7() {
        this(8);
    }

    private void d() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.a, 0, iArr2, i2, this.b);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(int i) {
        int i2 = (this.b - 1) & this.d;
        this.b = i2;
        this.a[i2] = i;
        if (i2 == this.c) {
            d();
        }
    }

    public void b(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        if (i3 == this.b) {
            d();
        }
    }

    public void c() {
        this.c = this.b;
    }

    public int e(int i) {
        if (i >= 0 && i < m()) {
            return this.a[this.d & (this.b + i)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int f() {
        int i = this.b;
        if (i != this.c) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
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

    public int i() {
        int i = this.b;
        if (i != this.c) {
            int i2 = this.a[i];
            this.b = (i + 1) & this.d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int j() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            int i3 = this.d & (i2 - 1);
            int i4 = this.a[i3];
            this.c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            this.c = this.d & (this.c - i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void l(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            this.b = this.d & (this.b + i);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int m() {
        return (this.c - this.b) & this.d;
    }

    public t7(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.d = i - 1;
            this.a = new int[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}