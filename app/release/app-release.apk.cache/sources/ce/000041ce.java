package com.p7700g.p99005;

import com.p7700g.p99005.i8;
import com.p7700g.p99005.m8;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class f8 implements i8.a {
    private static final boolean a = false;
    private static final boolean b = false;
    public a g;
    public m8 c = null;
    public float d = 0.0f;
    public boolean e = false;
    public ArrayList<m8> f = new ArrayList<>();
    public boolean h = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        int b(m8 m8Var);

        void c();

        void clear();

        boolean d(m8 m8Var);

        float e(f8 f8Var, boolean z);

        void f(m8 m8Var, float f);

        m8 g(int i);

        void h(m8 m8Var, float f, boolean z);

        void i();

        float j(int i);

        float k(m8 m8Var, boolean z);

        float l(m8 m8Var);

        int m();

        void n(float f);
    }

    public f8() {
    }

    private m8 B(boolean[] zArr, m8 m8Var) {
        m8.b bVar;
        int a2 = this.g.a();
        m8 m8Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < a2; i++) {
            float j = this.g.j(i);
            if (j < 0.0f) {
                m8 g = this.g.g(i);
                if ((zArr == null || !zArr[g.L]) && g != m8Var && (((bVar = g.S) == m8.b.SLACK || bVar == m8.b.ERROR) && j < f)) {
                    f = j;
                    m8Var2 = g;
                }
            }
        }
        return m8Var2;
    }

    private boolean z(m8 m8Var, i8 i8Var) {
        return m8Var.V <= 1;
    }

    public m8 A(m8 m8Var) {
        return B(null, m8Var);
    }

    public void C(m8 m8Var) {
        m8 m8Var2 = this.c;
        if (m8Var2 != null) {
            this.g.f(m8Var2, -1.0f);
            this.c.M = -1;
            this.c = null;
        }
        float k = this.g.k(m8Var, true) * (-1.0f);
        this.c = m8Var;
        if (k == 1.0f) {
            return;
        }
        this.d /= k;
        this.g.n(k);
    }

    public void D() {
        this.c = null;
        this.g.clear();
        this.d = 0.0f;
        this.h = false;
    }

    public int E() {
        return this.g.m() + (this.c != null ? 4 : 0) + 4 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String F() {
        String sb;
        boolean z;
        float j;
        int i;
        if (this.c == null) {
            sb = "0";
        } else {
            StringBuilder G = wo1.G("");
            G.append(this.c);
            sb = G.toString();
        }
        String t = wo1.t(sb, " = ");
        if (this.d != 0.0f) {
            StringBuilder G2 = wo1.G(t);
            G2.append(this.d);
            t = G2.toString();
            z = true;
        } else {
            z = false;
        }
        int a2 = this.g.a();
        for (int i2 = 0; i2 < a2; i2++) {
            m8 g = this.g.g(i2);
            if (g != null && (this.g.j(i2)) != 0.0f) {
                String m8Var = g.toString();
                if (!z) {
                    if (j < 0.0f) {
                        t = wo1.t(t, "- ");
                        j *= -1.0f;
                    }
                    t = j == 1.0f ? wo1.t(t, m8Var) : t + j + " " + m8Var;
                    z = true;
                } else if (i > 0) {
                    t = wo1.t(t, " + ");
                    if (j == 1.0f) {
                    }
                    z = true;
                } else {
                    t = wo1.t(t, " - ");
                    j *= -1.0f;
                    if (j == 1.0f) {
                    }
                    z = true;
                }
            }
        }
        return !z ? wo1.t(t, "0.0") : t;
    }

    public void G(i8 i8Var, m8 m8Var, boolean z) {
        if (m8Var == null || !m8Var.W) {
            return;
        }
        float l = this.g.l(m8Var);
        this.d = (m8Var.Y * l) + this.d;
        this.g.k(m8Var, z);
        if (z) {
            m8Var.g(this);
        }
        this.g.h(i8Var.B.d[m8Var.X], l, z);
        if (i8.g && this.g.a() == 0) {
            this.h = true;
            i8Var.o = true;
        }
    }

    @Override // com.p7700g.p99005.i8.a
    public void a(i8 i8Var, m8 m8Var, boolean z) {
        if (m8Var == null || !m8Var.P) {
            return;
        }
        float l = this.g.l(m8Var);
        this.d = (m8Var.O * l) + this.d;
        this.g.k(m8Var, z);
        if (z) {
            m8Var.g(this);
        }
        if (i8.g && this.g.a() == 0) {
            this.h = true;
            i8Var.o = true;
        }
    }

    @Override // com.p7700g.p99005.i8.a
    public void b(i8 i8Var) {
        if (i8Var.u.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int a2 = this.g.a();
            for (int i = 0; i < a2; i++) {
                m8 g = this.g.g(i);
                if (g.M != -1 || g.P || g.W) {
                    this.f.add(g);
                }
            }
            int size = this.f.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    m8 m8Var = this.f.get(i2);
                    if (m8Var.P) {
                        a(i8Var, m8Var, true);
                    } else if (m8Var.W) {
                        G(i8Var, m8Var, true);
                    } else {
                        c(i8Var, i8Var.u[m8Var.M], true);
                    }
                }
                this.f.clear();
            } else {
                z = true;
            }
        }
        if (i8.g && this.c != null && this.g.a() == 0) {
            this.h = true;
            i8Var.o = true;
        }
    }

    @Override // com.p7700g.p99005.i8.a
    public void c(i8 i8Var, f8 f8Var, boolean z) {
        float e = this.g.e(f8Var, z);
        this.d = (f8Var.d * e) + this.d;
        if (z) {
            f8Var.c.g(this);
        }
        if (i8.g && this.c != null && this.g.a() == 0) {
            this.h = true;
            i8Var.o = true;
        }
    }

    @Override // com.p7700g.p99005.i8.a
    public void clear() {
        this.g.clear();
        this.c = null;
        this.d = 0.0f;
    }

    @Override // com.p7700g.p99005.i8.a
    public void d(i8.a aVar) {
        if (aVar instanceof f8) {
            f8 f8Var = (f8) aVar;
            this.c = null;
            this.g.clear();
            for (int i = 0; i < f8Var.g.a(); i++) {
                this.g.h(f8Var.g.g(i), f8Var.g.j(i), true);
            }
        }
    }

    @Override // com.p7700g.p99005.i8.a
    public m8 e(i8 i8Var, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // com.p7700g.p99005.i8.a
    public void f(m8 m8Var) {
        int i = m8Var.N;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.g.f(m8Var, f);
    }

    public f8 g(i8 i8Var, int i) {
        this.g.f(i8Var.s(i, "ep"), 1.0f);
        this.g.f(i8Var.s(i, "em"), -1.0f);
        return this;
    }

    @Override // com.p7700g.p99005.i8.a
    public m8 getKey() {
        return this.c;
    }

    public f8 h(m8 m8Var, int i) {
        this.g.f(m8Var, i);
        return this;
    }

    public boolean i(i8 i8Var) {
        boolean z;
        m8 j = j(i8Var);
        if (j == null) {
            z = true;
        } else {
            C(j);
            z = false;
        }
        if (this.g.a() == 0) {
            this.h = true;
        }
        return z;
    }

    @Override // com.p7700g.p99005.i8.a
    public boolean isEmpty() {
        return this.c == null && this.d == 0.0f && this.g.a() == 0;
    }

    public m8 j(i8 i8Var) {
        boolean z;
        boolean z2;
        int a2 = this.g.a();
        m8 m8Var = null;
        m8 m8Var2 = null;
        boolean z3 = false;
        boolean z4 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < a2; i++) {
            float j = this.g.j(i);
            m8 g = this.g.g(i);
            if (g.S == m8.b.UNRESTRICTED) {
                if (m8Var == null) {
                    z2 = z(g, i8Var);
                } else if (f > j) {
                    z2 = z(g, i8Var);
                } else if (!z3 && z(g, i8Var)) {
                    f = j;
                    m8Var = g;
                    z3 = true;
                }
                z3 = z2;
                f = j;
                m8Var = g;
            } else if (m8Var == null && j < 0.0f) {
                if (m8Var2 == null) {
                    z = z(g, i8Var);
                } else if (f2 > j) {
                    z = z(g, i8Var);
                } else if (!z4 && z(g, i8Var)) {
                    f2 = j;
                    m8Var2 = g;
                    z4 = true;
                }
                z4 = z;
                f2 = j;
                m8Var2 = g;
            }
        }
        return m8Var != null ? m8Var : m8Var2;
    }

    public f8 k(m8 m8Var, m8 m8Var2, int i, float f, m8 m8Var3, m8 m8Var4, int i2) {
        if (m8Var2 == m8Var3) {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var4, 1.0f);
            this.g.f(m8Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var3, -1.0f);
            this.g.f(m8Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.d = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.g.f(m8Var, -1.0f);
            this.g.f(m8Var2, 1.0f);
            this.d = i;
        } else if (f >= 1.0f) {
            this.g.f(m8Var4, -1.0f);
            this.g.f(m8Var3, 1.0f);
            this.d = -i2;
        } else {
            float f2 = 1.0f - f;
            this.g.f(m8Var, f2 * 1.0f);
            this.g.f(m8Var2, f2 * (-1.0f));
            this.g.f(m8Var3, (-1.0f) * f);
            this.g.f(m8Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.d = (i2 * f) + ((-i) * f2);
            }
        }
        return this;
    }

    public f8 l(m8 m8Var, int i) {
        this.c = m8Var;
        float f = i;
        m8Var.O = f;
        this.d = f;
        this.h = true;
        return this;
    }

    public f8 m(m8 m8Var, m8 m8Var2, float f) {
        this.g.f(m8Var, -1.0f);
        this.g.f(m8Var2, f);
        return this;
    }

    public f8 n(m8 m8Var, m8 m8Var2, m8 m8Var3, m8 m8Var4, float f) {
        this.g.f(m8Var, -1.0f);
        this.g.f(m8Var2, 1.0f);
        this.g.f(m8Var3, f);
        this.g.f(m8Var4, -f);
        return this;
    }

    public f8 o(float f, float f2, float f3, m8 m8Var, int i, m8 m8Var2, int i2, m8 m8Var3, int i3, m8 m8Var4, int i4) {
        if (f2 != 0.0f && f != f3) {
            float f4 = (f / f2) / (f3 / f2);
            this.d = (i4 * f4) + (i3 * f4) + ((-i) - i2);
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var4, f4);
            this.g.f(m8Var3, -f4);
        } else {
            this.d = ((-i) - i2) + i3 + i4;
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var4, 1.0f);
            this.g.f(m8Var3, -1.0f);
        }
        return this;
    }

    public f8 p(float f, float f2, float f3, m8 m8Var, m8 m8Var2, m8 m8Var3, m8 m8Var4) {
        this.d = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var4, 1.0f);
            this.g.f(m8Var3, -1.0f);
        } else if (f == 0.0f) {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.g.f(m8Var3, 1.0f);
            this.g.f(m8Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var4, f4);
            this.g.f(m8Var3, -f4);
        }
        return this;
    }

    public f8 q(m8 m8Var, int i) {
        if (i < 0) {
            this.d = i * (-1);
            this.g.f(m8Var, 1.0f);
        } else {
            this.d = i;
            this.g.f(m8Var, -1.0f);
        }
        return this;
    }

    public f8 r(m8 m8Var, m8 m8Var2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.d = i;
        }
        if (!z) {
            this.g.f(m8Var, -1.0f);
            this.g.f(m8Var2, 1.0f);
        } else {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
        }
        return this;
    }

    public f8 s(m8 m8Var, int i, m8 m8Var2) {
        this.d = i;
        this.g.f(m8Var, -1.0f);
        return this;
    }

    public f8 t(m8 m8Var, m8 m8Var2, m8 m8Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.d = i;
        }
        if (!z) {
            this.g.f(m8Var, -1.0f);
            this.g.f(m8Var2, 1.0f);
            this.g.f(m8Var3, 1.0f);
        } else {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var3, -1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public f8 u(m8 m8Var, m8 m8Var2, m8 m8Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.d = i;
        }
        if (!z) {
            this.g.f(m8Var, -1.0f);
            this.g.f(m8Var2, 1.0f);
            this.g.f(m8Var3, -1.0f);
        } else {
            this.g.f(m8Var, 1.0f);
            this.g.f(m8Var2, -1.0f);
            this.g.f(m8Var3, 1.0f);
        }
        return this;
    }

    public f8 v(m8 m8Var, m8 m8Var2, m8 m8Var3, m8 m8Var4, float f) {
        this.g.f(m8Var3, 0.5f);
        this.g.f(m8Var4, 0.5f);
        this.g.f(m8Var, -0.5f);
        this.g.f(m8Var2, -0.5f);
        this.d = -f;
        return this;
    }

    public void w() {
        float f = this.d;
        if (f < 0.0f) {
            this.d = f * (-1.0f);
            this.g.i();
        }
    }

    public boolean x() {
        m8 m8Var = this.c;
        return m8Var != null && (m8Var.S == m8.b.UNRESTRICTED || this.d >= 0.0f);
    }

    public boolean y(m8 m8Var) {
        return this.g.d(m8Var);
    }

    public f8(g8 g8Var) {
        this.g = new e8(this, g8Var);
    }
}