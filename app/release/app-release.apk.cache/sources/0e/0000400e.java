package com.p7700g.p99005;

import com.p7700g.p99005.f8;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class e8 implements f8.a {
    private static final boolean a = false;
    public static final int b = -1;
    private static final boolean c = false;
    private static float d = 0.001f;
    private final f8 f;
    public final g8 g;
    public int e = 0;
    private int h = 8;
    private m8 i = null;
    private int[] j = new int[8];
    private int[] k = new int[8];
    private float[] l = new float[8];
    private int m = -1;
    private int n = -1;
    private boolean o = false;

    public e8(f8 f8Var, g8 g8Var) {
        this.f = f8Var;
        this.g = g8Var;
    }

    @Override // com.p7700g.p99005.f8.a
    public int a() {
        return this.e;
    }

    @Override // com.p7700g.p99005.f8.a
    public int b(m8 m8Var) {
        int i = this.m;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            if (this.j[i] == m8Var.L) {
                return i;
            }
            i = this.k[i];
        }
        return -1;
    }

    @Override // com.p7700g.p99005.f8.a
    public void c() {
        int i = this.e;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            m8 g = g(i2);
            if (g != null) {
                PrintStream printStream = System.out;
                printStream.print(g + " = " + j(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // com.p7700g.p99005.f8.a
    public final void clear() {
        int i = this.m;
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            m8 m8Var = this.g.d[this.j[i]];
            if (m8Var != null) {
                m8Var.g(this.f);
            }
            i = this.k[i];
        }
        this.m = -1;
        this.n = -1;
        this.o = false;
        this.e = 0;
    }

    @Override // com.p7700g.p99005.f8.a
    public boolean d(m8 m8Var) {
        int i = this.m;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            if (this.j[i] == m8Var.L) {
                return true;
            }
            i = this.k[i];
        }
        return false;
    }

    @Override // com.p7700g.p99005.f8.a
    public float e(f8 f8Var, boolean z) {
        float l = l(f8Var.c);
        k(f8Var.c, z);
        f8.a aVar = f8Var.g;
        int a2 = aVar.a();
        for (int i = 0; i < a2; i++) {
            m8 g = aVar.g(i);
            h(g, aVar.l(g) * l, z);
        }
        return l;
    }

    @Override // com.p7700g.p99005.f8.a
    public final void f(m8 m8Var, float f) {
        if (f == 0.0f) {
            k(m8Var, true);
            return;
        }
        int i = this.m;
        if (i == -1) {
            this.m = 0;
            this.l[0] = f;
            this.j[0] = m8Var.L;
            this.k[0] = -1;
            m8Var.V++;
            m8Var.a(this.f);
            this.e++;
            if (this.o) {
                return;
            }
            int i2 = this.n + 1;
            this.n = i2;
            int[] iArr = this.j;
            if (i2 >= iArr.length) {
                this.o = true;
                this.n = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.e; i4++) {
            int[] iArr2 = this.j;
            int i5 = iArr2[i];
            int i6 = m8Var.L;
            if (i5 == i6) {
                this.l[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.k[i];
        }
        int i7 = this.n;
        int i8 = i7 + 1;
        if (this.o) {
            int[] iArr3 = this.j;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.j;
        if (i7 >= iArr4.length && this.e < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.j;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.j;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.h * 2;
            this.h = i10;
            this.o = false;
            this.n = i7 - 1;
            this.l = Arrays.copyOf(this.l, i10);
            this.j = Arrays.copyOf(this.j, this.h);
            this.k = Arrays.copyOf(this.k, this.h);
        }
        this.j[i7] = m8Var.L;
        this.l[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.k;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.k[i7] = this.m;
            this.m = i7;
        }
        m8Var.V++;
        m8Var.a(this.f);
        int i11 = this.e + 1;
        this.e = i11;
        if (!this.o) {
            this.n++;
        }
        int[] iArr8 = this.j;
        if (i11 >= iArr8.length) {
            this.o = true;
        }
        if (this.n >= iArr8.length) {
            this.o = true;
            this.n = iArr8.length - 1;
        }
    }

    @Override // com.p7700g.p99005.f8.a
    public m8 g(int i) {
        int i2 = this.m;
        for (int i3 = 0; i2 != -1 && i3 < this.e; i3++) {
            if (i3 == i) {
                return this.g.d[this.j[i2]];
            }
            i2 = this.k[i2];
        }
        return null;
    }

    @Override // com.p7700g.p99005.f8.a
    public void h(m8 m8Var, float f, boolean z) {
        float f2 = d;
        if (f <= (-f2) || f >= f2) {
            int i = this.m;
            if (i == -1) {
                this.m = 0;
                this.l[0] = f;
                this.j[0] = m8Var.L;
                this.k[0] = -1;
                m8Var.V++;
                m8Var.a(this.f);
                this.e++;
                if (this.o) {
                    return;
                }
                int i2 = this.n + 1;
                this.n = i2;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.o = true;
                    this.n = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.e; i4++) {
                int[] iArr2 = this.j;
                int i5 = iArr2[i];
                int i6 = m8Var.L;
                if (i5 == i6) {
                    float[] fArr = this.l;
                    float f3 = fArr[i] + f;
                    float f4 = d;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.m) {
                            this.m = this.k[i];
                        } else {
                            int[] iArr3 = this.k;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            m8Var.g(this.f);
                        }
                        if (this.o) {
                            this.n = i;
                        }
                        m8Var.V--;
                        this.e--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.k[i];
            }
            int i7 = this.n;
            int i8 = i7 + 1;
            if (this.o) {
                int[] iArr4 = this.j;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.j;
            if (i7 >= iArr5.length && this.e < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.j;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.j;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.h * 2;
                this.h = i10;
                this.o = false;
                this.n = i7 - 1;
                this.l = Arrays.copyOf(this.l, i10);
                this.j = Arrays.copyOf(this.j, this.h);
                this.k = Arrays.copyOf(this.k, this.h);
            }
            this.j[i7] = m8Var.L;
            this.l[i7] = f;
            if (i3 != -1) {
                int[] iArr8 = this.k;
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                this.k[i7] = this.m;
                this.m = i7;
            }
            m8Var.V++;
            m8Var.a(this.f);
            this.e++;
            if (!this.o) {
                this.n++;
            }
            int i11 = this.n;
            int[] iArr9 = this.j;
            if (i11 >= iArr9.length) {
                this.o = true;
                this.n = iArr9.length - 1;
            }
        }
    }

    @Override // com.p7700g.p99005.f8.a
    public void i() {
        int i = this.m;
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            float[] fArr = this.l;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.k[i];
        }
    }

    @Override // com.p7700g.p99005.f8.a
    public float j(int i) {
        int i2 = this.m;
        for (int i3 = 0; i2 != -1 && i3 < this.e; i3++) {
            if (i3 == i) {
                return this.l[i2];
            }
            i2 = this.k[i2];
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.f8.a
    public final float k(m8 m8Var, boolean z) {
        if (this.i == m8Var) {
            this.i = null;
        }
        int i = this.m;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.e) {
            if (this.j[i] == m8Var.L) {
                if (i == this.m) {
                    this.m = this.k[i];
                } else {
                    int[] iArr = this.k;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    m8Var.g(this.f);
                }
                m8Var.V--;
                this.e--;
                this.j[i] = -1;
                if (this.o) {
                    this.n = i;
                }
                return this.l[i];
            }
            i2++;
            i3 = i;
            i = this.k[i];
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.f8.a
    public final float l(m8 m8Var) {
        int i = this.m;
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            if (this.j[i] == m8Var.L) {
                return this.l[i];
            }
            i = this.k[i];
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.f8.a
    public int m() {
        return (this.j.length * 4 * 3) + 0 + 36;
    }

    @Override // com.p7700g.p99005.f8.a
    public void n(float f) {
        int i = this.m;
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            float[] fArr = this.l;
            fArr[i] = fArr[i] / f;
            i = this.k[i];
        }
    }

    public int o() {
        return this.m;
    }

    public final int p(int i) {
        return this.j[i];
    }

    public final int q(int i) {
        return this.k[i];
    }

    public m8 r() {
        m8 m8Var = this.i;
        if (m8Var == null) {
            int i = this.m;
            m8 m8Var2 = null;
            for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
                if (this.l[i] < 0.0f) {
                    m8 m8Var3 = this.g.d[this.j[i]];
                    if (m8Var2 == null || m8Var2.N < m8Var3.N) {
                        m8Var2 = m8Var3;
                    }
                }
                i = this.k[i];
            }
            return m8Var2;
        }
        return m8Var;
    }

    public final float s(int i) {
        return this.l[i];
    }

    public boolean t() {
        int i = this.m;
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            if (this.l[i] > 0.0f) {
                return true;
            }
            i = this.k[i];
        }
        return false;
    }

    public String toString() {
        int i = this.m;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.e; i2++) {
            StringBuilder G = wo1.G(wo1.t(str, " -> "));
            G.append(this.l[i]);
            G.append(" : ");
            StringBuilder G2 = wo1.G(G.toString());
            G2.append(this.g.d[this.j[i]]);
            str = G2.toString();
            i = this.k[i];
        }
        return str;
    }
}