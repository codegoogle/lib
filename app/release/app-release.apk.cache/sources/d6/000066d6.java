package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: TypedBundle.java */
/* loaded from: classes.dex */
public class y9 {
    private static final int a = 4;
    private static final int b = 10;
    private static final int c = 10;
    private static final int d = 5;
    public int[] e = new int[10];
    public int[] f = new int[10];
    public int g = 0;
    public int[] h = new int[10];
    public float[] i = new float[10];
    public int j = 0;
    public int[] k = new int[5];
    public String[] l = new String[5];
    public int m = 0;
    public int[] n = new int[4];
    public boolean[] o = new boolean[4];
    public int p = 0;

    public void a(int i, float f) {
        int i2 = this.j;
        int[] iArr = this.h;
        if (i2 >= iArr.length) {
            this.h = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.i;
            this.i = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.h;
        int i3 = this.j;
        iArr2[i3] = i;
        float[] fArr2 = this.i;
        this.j = i3 + 1;
        fArr2[i3] = f;
    }

    public void b(int i, int i2) {
        int i3 = this.g;
        int[] iArr = this.e;
        if (i3 >= iArr.length) {
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i4 = this.g;
        iArr3[i4] = i;
        int[] iArr4 = this.f;
        this.g = i4 + 1;
        iArr4[i4] = i2;
    }

    public void c(int i, String str) {
        int i2 = this.m;
        int[] iArr = this.k;
        if (i2 >= iArr.length) {
            this.k = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.k;
        int i3 = this.m;
        iArr2[i3] = i;
        String[] strArr2 = this.l;
        this.m = i3 + 1;
        strArr2[i3] = str;
    }

    public void d(int i, boolean z) {
        int i2 = this.p;
        int[] iArr = this.n;
        if (i2 >= iArr.length) {
            this.n = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.o;
            this.o = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.n;
        int i3 = this.p;
        iArr2[i3] = i;
        boolean[] zArr2 = this.o;
        this.p = i3 + 1;
        zArr2[i3] = z;
    }

    public void e(int i, String str) {
        if (str != null) {
            c(i, str);
        }
    }

    public void f(y9 y9Var) {
        for (int i = 0; i < this.g; i++) {
            y9Var.b(this.e[i], this.f[i]);
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            y9Var.a(this.h[i2], this.i[i2]);
        }
        for (int i3 = 0; i3 < this.m; i3++) {
            y9Var.c(this.k[i3], this.l[i3]);
        }
        for (int i4 = 0; i4 < this.p; i4++) {
            y9Var.d(this.n[i4], this.o[i4]);
        }
    }

    public void g(aa aaVar) {
        for (int i = 0; i < this.g; i++) {
            aaVar.a(this.e[i], this.f[i]);
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            aaVar.b(this.h[i2], this.i[i2]);
        }
        for (int i3 = 0; i3 < this.m; i3++) {
            aaVar.c(this.k[i3], this.l[i3]);
        }
        for (int i4 = 0; i4 < this.p; i4++) {
            aaVar.d(this.n[i4], this.o[i4]);
        }
    }

    public void h() {
        this.p = 0;
        this.m = 0;
        this.j = 0;
        this.g = 0;
    }

    public int i(int i) {
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.e[i2] == i) {
                return this.f[i2];
            }
        }
        return -1;
    }
}