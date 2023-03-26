package com.p7700g.p99005;

import com.p7700g.p99005.f8;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class n8 implements f8.a {
    private static final boolean a = false;
    private static final boolean b = true;
    private static float c = 0.001f;
    private final int d = -1;
    private int e = 16;
    private int f = 16;
    public int[] g = new int[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public float[] j = new float[16];
    public int[] k = new int[16];
    public int[] l = new int[16];
    public int m = 0;
    public int n = -1;
    private final f8 o;
    public final g8 p;

    public n8(f8 f8Var, g8 g8Var) {
        this.o = f8Var;
        this.p = g8Var;
        clear();
    }

    private void o(m8 m8Var, int i) {
        int[] iArr;
        int i2 = m8Var.L % this.f;
        int[] iArr2 = this.g;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.h;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.h[i] = -1;
    }

    private void p(int i, m8 m8Var, float f) {
        this.i[i] = m8Var.L;
        this.j[i] = f;
        this.k[i] = -1;
        this.l[i] = -1;
        m8Var.a(this.o);
        m8Var.V++;
        this.m++;
    }

    private void q() {
        for (int i = 0; i < this.f; i++) {
            if (this.g[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.g[i];
                boolean z = false;
                while (!z) {
                    StringBuilder L = wo1.L(str, " ");
                    L.append(this.i[i2]);
                    str = L.toString();
                    int[] iArr = this.h;
                    if (iArr[i2] != -1) {
                        i2 = iArr[i2];
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int r() {
        for (int i = 0; i < this.e; i++) {
            if (this.i[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void s() {
        int i = this.e * 2;
        this.i = Arrays.copyOf(this.i, i);
        this.j = Arrays.copyOf(this.j, i);
        this.k = Arrays.copyOf(this.k, i);
        this.l = Arrays.copyOf(this.l, i);
        this.h = Arrays.copyOf(this.h, i);
        for (int i2 = this.e; i2 < i; i2++) {
            this.i[i2] = -1;
            this.h[i2] = -1;
        }
        this.e = i;
    }

    private void t(int i, m8 m8Var, float f) {
        int r = r();
        p(r, m8Var, f);
        if (i != -1) {
            this.k[r] = i;
            int[] iArr = this.l;
            iArr[r] = iArr[i];
            iArr[i] = r;
        } else {
            this.k[r] = -1;
            if (this.m > 0) {
                this.l[r] = this.n;
                this.n = r;
            } else {
                this.l[r] = -1;
            }
        }
        int[] iArr2 = this.l;
        if (iArr2[r] != -1) {
            this.k[iArr2[r]] = r;
        }
        o(m8Var, r);
    }

    private void u(m8 m8Var) {
        int[] iArr;
        int i = m8Var.L;
        int i2 = i % this.f;
        int[] iArr2 = this.g;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.i[i3] == i) {
            int[] iArr3 = this.h;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.h;
            if (iArr[i3] == -1 || this.i[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.i[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // com.p7700g.p99005.f8.a
    public int a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.f8.a
    public int b(m8 m8Var) {
        int[] iArr;
        if (this.m != 0 && m8Var != null) {
            int i = m8Var.L;
            int i2 = this.g[i % this.f];
            if (i2 == -1) {
                return -1;
            }
            if (this.i[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.h;
                if (iArr[i2] == -1 || this.i[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            if (iArr[i2] != -1 && this.i[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    @Override // com.p7700g.p99005.f8.a
    public void c() {
        int i = this.m;
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
    public void clear() {
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            m8 g = g(i2);
            if (g != null) {
                g.g(this.o);
            }
        }
        for (int i3 = 0; i3 < this.e; i3++) {
            this.i[i3] = -1;
            this.h[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            this.g[i4] = -1;
        }
        this.m = 0;
        this.n = -1;
    }

    @Override // com.p7700g.p99005.f8.a
    public boolean d(m8 m8Var) {
        return b(m8Var) != -1;
    }

    @Override // com.p7700g.p99005.f8.a
    public float e(f8 f8Var, boolean z) {
        float l = l(f8Var.c);
        k(f8Var.c, z);
        n8 n8Var = (n8) f8Var.g;
        int a2 = n8Var.a();
        int i = 0;
        int i2 = 0;
        while (i < a2) {
            int[] iArr = n8Var.i;
            if (iArr[i2] != -1) {
                h(this.p.d[iArr[i2]], n8Var.j[i2] * l, z);
                i++;
            }
            i2++;
        }
        return l;
    }

    @Override // com.p7700g.p99005.f8.a
    public void f(m8 m8Var, float f) {
        float f2 = c;
        if (f > (-f2) && f < f2) {
            k(m8Var, true);
            return;
        }
        if (this.m == 0) {
            p(0, m8Var, f);
            o(m8Var, 0);
            this.n = 0;
            return;
        }
        int b2 = b(m8Var);
        if (b2 != -1) {
            this.j[b2] = f;
            return;
        }
        if (this.m + 1 >= this.e) {
            s();
        }
        int i = this.m;
        int i2 = this.n;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.i;
            int i5 = iArr[i2];
            int i6 = m8Var.L;
            if (i5 == i6) {
                this.j[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.l[i2];
            if (i2 == -1) {
                break;
            }
        }
        t(i3, m8Var, f);
    }

    @Override // com.p7700g.p99005.f8.a
    public m8 g(int i) {
        int i2 = this.m;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.n;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.p.d[this.i[i3]];
            }
            i3 = this.l[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.f8.a
    public void h(m8 m8Var, float f, boolean z) {
        float f2 = c;
        if (f <= (-f2) || f >= f2) {
            int b2 = b(m8Var);
            if (b2 == -1) {
                f(m8Var, f);
                return;
            }
            float[] fArr = this.j;
            fArr[b2] = fArr[b2] + f;
            float f3 = fArr[b2];
            float f4 = c;
            if (f3 <= (-f4) || fArr[b2] >= f4) {
                return;
            }
            fArr[b2] = 0.0f;
            k(m8Var, z);
        }
    }

    @Override // com.p7700g.p99005.f8.a
    public void i() {
        int i = this.m;
        int i2 = this.n;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.j;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.l[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.p7700g.p99005.f8.a
    public float j(int i) {
        int i2 = this.m;
        int i3 = this.n;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.j[i3];
            }
            i3 = this.l[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.f8.a
    public float k(m8 m8Var, boolean z) {
        int b2 = b(m8Var);
        if (b2 == -1) {
            return 0.0f;
        }
        u(m8Var);
        float f = this.j[b2];
        if (this.n == b2) {
            this.n = this.l[b2];
        }
        this.i[b2] = -1;
        int[] iArr = this.k;
        if (iArr[b2] != -1) {
            int[] iArr2 = this.l;
            iArr2[iArr[b2]] = iArr2[b2];
        }
        int[] iArr3 = this.l;
        if (iArr3[b2] != -1) {
            iArr[iArr3[b2]] = iArr[b2];
        }
        this.m--;
        m8Var.V--;
        if (z) {
            m8Var.g(this.o);
        }
        return f;
    }

    @Override // com.p7700g.p99005.f8.a
    public float l(m8 m8Var) {
        int b2 = b(m8Var);
        if (b2 != -1) {
            return this.j[b2];
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.f8.a
    public int m() {
        return 0;
    }

    @Override // com.p7700g.p99005.f8.a
    public void n(float f) {
        int i = this.m;
        int i2 = this.n;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.j;
            fArr[i2] = fArr[i2] / f;
            i2 = this.l[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String t;
        String t2;
        String str = hashCode() + " { ";
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            m8 g = g(i2);
            if (g != null) {
                String str2 = str + g + " = " + j(i2) + " ";
                int b2 = b(g);
                String t3 = wo1.t(str2, "[p: ");
                if (this.k[b2] != -1) {
                    StringBuilder G = wo1.G(t3);
                    G.append(this.p.d[this.i[this.k[b2]]]);
                    t = G.toString();
                } else {
                    t = wo1.t(t3, "none");
                }
                String t4 = wo1.t(t, ", n: ");
                if (this.l[b2] != -1) {
                    StringBuilder G2 = wo1.G(t4);
                    G2.append(this.p.d[this.i[this.l[b2]]]);
                    t2 = G2.toString();
                } else {
                    t2 = wo1.t(t4, "none");
                }
                str = wo1.t(t2, "]");
            }
        }
        return wo1.t(str, " }");
    }
}