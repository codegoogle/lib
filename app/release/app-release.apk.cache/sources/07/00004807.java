package com.p7700g.p99005;

import com.p7700g.p99005.m8;
import com.p7700g.p99005.yb;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class i8 {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean c = false;
    private static final boolean d = false;
    public static boolean e = false;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = false;
    private static int k = 1000;
    public static j8 l;
    public static long m;
    public static long n;
    public final g8 B;
    private a E;
    private a r;
    public f8[] u;
    public boolean o = false;
    public int p = 0;
    private HashMap<String, m8> q = null;
    private int s = 32;
    private int t = 32;
    public boolean v = false;
    public boolean w = false;
    private boolean[] x = new boolean[32];
    public int y = 1;
    public int z = 0;
    private int A = 32;
    private m8[] C = new m8[k];
    private int D = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(i8 i8Var, m8 m8Var, boolean z);

        void b(i8 i8Var);

        void c(i8 i8Var, f8 f8Var, boolean z);

        void clear();

        void d(a aVar);

        m8 e(i8 i8Var, boolean[] zArr);

        void f(m8 m8Var);

        m8 getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public class b extends f8 {
        public b(g8 g8Var) {
            this.g = new n8(this, g8Var);
        }
    }

    public i8() {
        this.u = null;
        this.u = new f8[32];
        W();
        g8 g8Var = new g8();
        this.B = g8Var;
        this.r = new l8(g8Var);
        if (j) {
            this.E = new b(g8Var);
        } else {
            this.E = new f8(g8Var);
        }
    }

    private void A() {
        B();
        String str = "";
        for (int i2 = 0; i2 < this.z; i2++) {
            StringBuilder G = wo1.G(str);
            G.append(this.u[i2]);
            str = wo1.t(G.toString(), "\n");
        }
        StringBuilder G2 = wo1.G(str);
        G2.append(this.r);
        G2.append("\n");
        System.out.println(G2.toString());
    }

    private void B() {
        StringBuilder G = wo1.G("Display Rows (");
        G.append(this.z);
        G.append("x");
        System.out.println(wo1.z(G, this.y, ")\n"));
    }

    private int E(a aVar) throws Exception {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.z) {
                z = false;
                break;
            }
            f8[] f8VarArr = this.u;
            if (f8VarArr[i2].c.S != m8.b.UNRESTRICTED && f8VarArr[i2].d < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                j8 j8Var = l;
                if (j8Var != null) {
                    j8Var.o++;
                }
                i3++;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                for (int i7 = 0; i7 < this.z; i7++) {
                    f8 f8Var = this.u[i7];
                    if (f8Var.c.S != m8.b.UNRESTRICTED && !f8Var.h && f8Var.d < 0.0f) {
                        int i8 = 9;
                        if (i) {
                            int a2 = f8Var.g.a();
                            int i9 = 0;
                            while (i9 < a2) {
                                m8 g2 = f8Var.g.g(i9);
                                float l2 = f8Var.g.l(g2);
                                if (l2 > 0.0f) {
                                    int i10 = 0;
                                    while (i10 < i8) {
                                        float f3 = g2.Q[i10] / l2;
                                        if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                            i5 = g2.L;
                                            i6 = i10;
                                            i4 = i7;
                                            f2 = f3;
                                        }
                                        i10++;
                                        i8 = 9;
                                    }
                                }
                                i9++;
                                i8 = 9;
                            }
                        } else {
                            for (int i11 = 1; i11 < this.y; i11++) {
                                m8 m8Var = this.B.d[i11];
                                float l3 = f8Var.g.l(m8Var);
                                if (l3 > 0.0f) {
                                    for (int i12 = 0; i12 < 9; i12++) {
                                        float f4 = m8Var.Q[i12] / l3;
                                        if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                            i5 = i11;
                                            i6 = i12;
                                            i4 = i7;
                                            f2 = f4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i4 != -1) {
                    f8 f8Var2 = this.u[i4];
                    f8Var2.c.M = -1;
                    j8 j8Var2 = l;
                    if (j8Var2 != null) {
                        j8Var2.n++;
                    }
                    f8Var2.C(this.B.d[i5]);
                    m8 m8Var2 = f8Var2.c;
                    m8Var2.M = i4;
                    m8Var2.n(this, f8Var2);
                } else {
                    z2 = true;
                }
                if (i3 > this.y / 2) {
                    z2 = true;
                }
            }
            return i3;
        }
        return 0;
    }

    private String H(int i2) {
        int i3 = i2 * 4;
        int i4 = i3 / 1024;
        int i5 = i4 / 1024;
        if (i5 > 0) {
            return wo1.n("", i5, " Mb");
        }
        if (i4 > 0) {
            return wo1.n("", i4, " Kb");
        }
        return wo1.n("", i3, " bytes");
    }

    private String I(int i2) {
        return i2 == 1 ? "LOW" : i2 == 2 ? "MEDIUM" : i2 == 3 ? "HIGH" : i2 == 4 ? "HIGHEST" : i2 == 5 ? "EQUALITY" : i2 == 8 ? "FIXED" : i2 == 6 ? "BARRIER" : "NONE";
    }

    public static j8 L() {
        return l;
    }

    private void S() {
        int i2 = this.s * 2;
        this.s = i2;
        this.u = (f8[]) Arrays.copyOf(this.u, i2);
        g8 g8Var = this.B;
        g8Var.d = (m8[]) Arrays.copyOf(g8Var.d, this.s);
        int i3 = this.s;
        this.x = new boolean[i3];
        this.t = i3;
        this.A = i3;
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.h++;
            j8Var.t = Math.max(j8Var.t, i3);
            j8 j8Var2 = l;
            j8Var2.J = j8Var2.t;
        }
    }

    private final int V(a aVar, boolean z) {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.l++;
        }
        for (int i2 = 0; i2 < this.y; i2++) {
            this.x[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            j8 j8Var2 = l;
            if (j8Var2 != null) {
                j8Var2.m++;
            }
            i3++;
            if (i3 >= this.y * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.x[aVar.getKey().L] = true;
            }
            m8 e2 = aVar.e(this, this.x);
            if (e2 != null) {
                boolean[] zArr = this.x;
                int i4 = e2.L;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (e2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.z; i6++) {
                    f8 f8Var = this.u[i6];
                    if (f8Var.c.S != m8.b.UNRESTRICTED && !f8Var.h && f8Var.y(e2)) {
                        float l2 = f8Var.g.l(e2);
                        if (l2 < 0.0f) {
                            float f3 = (-f8Var.d) / l2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    f8 f8Var2 = this.u[i5];
                    f8Var2.c.M = -1;
                    j8 j8Var3 = l;
                    if (j8Var3 != null) {
                        j8Var3.n++;
                    }
                    f8Var2.C(e2);
                    m8 m8Var = f8Var2.c;
                    m8Var.M = i5;
                    m8Var.n(this, f8Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    private void W() {
        int i2 = 0;
        if (j) {
            while (i2 < this.z) {
                f8 f8Var = this.u[i2];
                if (f8Var != null) {
                    this.B.a.a(f8Var);
                }
                this.u[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.z) {
            f8 f8Var2 = this.u[i2];
            if (f8Var2 != null) {
                this.B.b.a(f8Var2);
            }
            this.u[i2] = null;
            i2++;
        }
    }

    private m8 a(m8.b bVar, String str) {
        m8 b2 = this.B.c.b();
        if (b2 == null) {
            b2 = new m8(bVar, str);
            b2.l(bVar, str);
        } else {
            b2.h();
            b2.l(bVar, str);
        }
        int i2 = this.D;
        int i3 = k;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            k = i4;
            this.C = (m8[]) Arrays.copyOf(this.C, i4);
        }
        m8[] m8VarArr = this.C;
        int i5 = this.D;
        this.D = i5 + 1;
        m8VarArr[i5] = b2;
        return b2;
    }

    private void g(f8 f8Var) {
        f8Var.g(this, 0);
    }

    private final void m(f8 f8Var) {
        int i2;
        if (g && f8Var.h) {
            f8Var.c.i(this, f8Var.d);
        } else {
            f8[] f8VarArr = this.u;
            int i3 = this.z;
            f8VarArr[i3] = f8Var;
            m8 m8Var = f8Var.c;
            m8Var.M = i3;
            this.z = i3 + 1;
            m8Var.n(this, f8Var);
        }
        if (g && this.o) {
            int i4 = 0;
            while (i4 < this.z) {
                if (this.u[i4] == null) {
                    System.out.println("WTF");
                }
                f8[] f8VarArr2 = this.u;
                if (f8VarArr2[i4] != null && f8VarArr2[i4].h) {
                    f8 f8Var2 = f8VarArr2[i4];
                    f8Var2.c.i(this, f8Var2.d);
                    if (j) {
                        this.B.a.a(f8Var2);
                    } else {
                        this.B.b.a(f8Var2);
                    }
                    this.u[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.z;
                        if (i5 >= i2) {
                            break;
                        }
                        f8[] f8VarArr3 = this.u;
                        int i7 = i5 - 1;
                        f8VarArr3[i7] = f8VarArr3[i5];
                        if (f8VarArr3[i7].c.M == i5) {
                            f8VarArr3[i7].c.M = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.u[i6] = null;
                    }
                    this.z = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.o = false;
        }
    }

    private void n(f8 f8Var, int i2) {
        o(f8Var, i2, 0);
    }

    private void r() {
        for (int i2 = 0; i2 < this.z; i2++) {
            f8 f8Var = this.u[i2];
            f8Var.c.O = f8Var.d;
        }
    }

    public static f8 w(i8 i8Var, m8 m8Var, m8 m8Var2, float f2) {
        return i8Var.v().m(m8Var, m8Var2, f2);
    }

    private m8 y(String str, m8.b bVar) {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.p++;
        }
        if (this.y + 1 >= this.t) {
            S();
        }
        m8 a2 = a(bVar, null);
        a2.j(str);
        int i2 = this.p + 1;
        this.p = i2;
        this.y++;
        a2.L = i2;
        if (this.q == null) {
            this.q = new HashMap<>();
        }
        this.q.put(str, a2);
        this.B.d[this.p] = a2;
        return a2;
    }

    public void C() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.s; i3++) {
            f8[] f8VarArr = this.u;
            if (f8VarArr[i3] != null) {
                i2 = f8VarArr[i3].E() + i2;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.z; i5++) {
            f8[] f8VarArr2 = this.u;
            if (f8VarArr2[i5] != null) {
                i4 = f8VarArr2[i5].E() + i4;
            }
        }
        PrintStream printStream = System.out;
        StringBuilder G = wo1.G("Linear System -> Table size: ");
        G.append(this.s);
        G.append(" (");
        int i6 = this.s;
        G.append(H(i6 * i6));
        G.append(") -- row sizes: ");
        G.append(H(i2));
        G.append(", actual size: ");
        G.append(H(i4));
        G.append(" rows: ");
        G.append(this.z);
        G.append("/");
        G.append(this.A);
        G.append(" cols: ");
        G.append(this.y);
        G.append("/");
        G.append(this.t);
        G.append(" ");
        G.append(0);
        G.append(" occupied cells, ");
        G.append(H(0));
        printStream.println(G.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i2 = 0; i2 < this.z; i2++) {
            if (this.u[i2].c.S == m8.b.UNRESTRICTED) {
                StringBuilder G = wo1.G(str);
                G.append(this.u[i2].F());
                str = wo1.t(G.toString(), "\n");
            }
        }
        StringBuilder G2 = wo1.G(str);
        G2.append(this.r);
        G2.append("\n");
        System.out.println(G2.toString());
    }

    public void F(j8 j8Var) {
        l = j8Var;
    }

    public g8 G() {
        return this.B;
    }

    public a J() {
        return this.r;
    }

    public int K() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.z; i3++) {
            f8[] f8VarArr = this.u;
            if (f8VarArr[i3] != null) {
                i2 = f8VarArr[i3].E() + i2;
            }
        }
        return i2;
    }

    public int M() {
        return this.z;
    }

    public int N() {
        return this.p;
    }

    public int O(Object obj) {
        m8 j2 = ((yb) obj).j();
        if (j2 != null) {
            return (int) (j2.O + 0.5f);
        }
        return 0;
    }

    public f8 P(int i2) {
        return this.u[i2];
    }

    public float Q(String str) {
        m8 R = R(str, m8.b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.O;
    }

    public m8 R(String str, m8.b bVar) {
        if (this.q == null) {
            this.q = new HashMap<>();
        }
        m8 m8Var = this.q.get(str);
        return m8Var == null ? y(str, bVar) : m8Var;
    }

    public void T() throws Exception {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.i++;
        }
        if (this.r.isEmpty()) {
            r();
        } else if (!this.v && !this.w) {
            U(this.r);
        } else {
            j8 j8Var2 = l;
            if (j8Var2 != null) {
                j8Var2.v++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.z) {
                    z = true;
                    break;
                } else if (!this.u[i2].h) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                U(this.r);
                return;
            }
            j8 j8Var3 = l;
            if (j8Var3 != null) {
                j8Var3.u++;
            }
            r();
        }
    }

    public void U(a aVar) throws Exception {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.z++;
            j8Var.A = Math.max(j8Var.A, this.y);
            j8 j8Var2 = l;
            j8Var2.B = Math.max(j8Var2.B, this.z);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public void X(f8 f8Var) {
        m8 m8Var;
        int i2;
        if (!f8Var.h || (m8Var = f8Var.c) == null) {
            return;
        }
        int i3 = m8Var.M;
        if (i3 != -1) {
            while (true) {
                i2 = this.z;
                if (i3 >= i2 - 1) {
                    break;
                }
                f8[] f8VarArr = this.u;
                int i4 = i3 + 1;
                m8 m8Var2 = f8VarArr[i4].c;
                if (m8Var2.M == i4) {
                    m8Var2.M = i3;
                }
                f8VarArr[i3] = f8VarArr[i4];
                i3 = i4;
            }
            this.z = i2 - 1;
        }
        m8 m8Var3 = f8Var.c;
        if (!m8Var3.P) {
            m8Var3.i(this, f8Var.d);
        }
        if (j) {
            this.B.a.a(f8Var);
        } else {
            this.B.b.a(f8Var);
        }
    }

    public void Y() {
        g8 g8Var;
        int i2 = 0;
        while (true) {
            g8Var = this.B;
            m8[] m8VarArr = g8Var.d;
            if (i2 >= m8VarArr.length) {
                break;
            }
            m8 m8Var = m8VarArr[i2];
            if (m8Var != null) {
                m8Var.h();
            }
            i2++;
        }
        g8Var.c.c(this.C, this.D);
        this.D = 0;
        Arrays.fill(this.B.d, (Object) null);
        HashMap<String, m8> hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.p = 0;
        this.r.clear();
        this.y = 1;
        for (int i3 = 0; i3 < this.z; i3++) {
            f8[] f8VarArr = this.u;
            if (f8VarArr[i3] != null) {
                f8VarArr[i3].e = false;
            }
        }
        W();
        this.z = 0;
        if (j) {
            this.E = new b(this.B);
        } else {
            this.E = new f8(this.B);
        }
    }

    public void b(zb zbVar, zb zbVar2, float f2, int i2) {
        yb.b bVar = yb.b.LEFT;
        m8 u = u(zbVar.r(bVar));
        yb.b bVar2 = yb.b.TOP;
        m8 u2 = u(zbVar.r(bVar2));
        yb.b bVar3 = yb.b.RIGHT;
        m8 u3 = u(zbVar.r(bVar3));
        yb.b bVar4 = yb.b.BOTTOM;
        m8 u4 = u(zbVar.r(bVar4));
        m8 u5 = u(zbVar2.r(bVar));
        m8 u6 = u(zbVar2.r(bVar2));
        m8 u7 = u(zbVar2.r(bVar3));
        m8 u8 = u(zbVar2.r(bVar4));
        f8 v = v();
        double d2 = f2;
        double d3 = i2;
        v.v(u2, u4, u6, u8, (float) (Math.sin(d2) * d3));
        d(v);
        f8 v2 = v();
        v2.v(u, u3, u5, u7, (float) (Math.cos(d2) * d3));
        d(v2);
    }

    public void c(m8 m8Var, m8 m8Var2, int i2, float f2, m8 m8Var3, m8 m8Var4, int i3, int i4) {
        f8 v = v();
        v.k(m8Var, m8Var2, i2, f2, m8Var3, m8Var4, i3);
        if (i4 != 8) {
            v.g(this, i4);
        }
        d(v);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(f8 f8Var) {
        m8 A;
        if (f8Var == null) {
            return;
        }
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.j++;
            if (f8Var.h) {
                j8Var.k++;
            }
        }
        boolean z = true;
        if (this.z + 1 >= this.A || this.y + 1 >= this.t) {
            S();
        }
        boolean z2 = false;
        if (!f8Var.h) {
            f8Var.b(this);
            if (f8Var.isEmpty()) {
                return;
            }
            f8Var.w();
            if (f8Var.i(this)) {
                m8 t = t();
                f8Var.c = t;
                int i2 = this.z;
                m(f8Var);
                if (this.z == i2 + 1) {
                    this.E.d(f8Var);
                    V(this.E, true);
                    if (t.M == -1) {
                        if (f8Var.c == t && (A = f8Var.A(t)) != null) {
                            j8 j8Var2 = l;
                            if (j8Var2 != null) {
                                j8Var2.n++;
                            }
                            f8Var.C(A);
                        }
                        if (!f8Var.h) {
                            f8Var.c.n(this, f8Var);
                        }
                        if (j) {
                            this.B.a.a(f8Var);
                        } else {
                            this.B.b.a(f8Var);
                        }
                        this.z--;
                    }
                    if (f8Var.x()) {
                        return;
                    }
                    z2 = z;
                }
            }
            z = false;
            if (f8Var.x()) {
            }
        }
        if (z2) {
            return;
        }
        m(f8Var);
    }

    public f8 e(m8 m8Var, m8 m8Var2, int i2, int i3) {
        if (f && i3 == 8 && m8Var2.P && m8Var.M == -1) {
            m8Var.i(this, m8Var2.O + i2);
            return null;
        }
        f8 v = v();
        v.r(m8Var, m8Var2, i2);
        if (i3 != 8) {
            v.g(this, i3);
        }
        d(v);
        return v;
    }

    public void f(m8 m8Var, int i2) {
        if (f && m8Var.M == -1) {
            float f2 = i2;
            m8Var.i(this, f2);
            for (int i3 = 0; i3 < this.p + 1; i3++) {
                m8 m8Var2 = this.B.d[i3];
                if (m8Var2 != null && m8Var2.W && m8Var2.X == m8Var.L) {
                    m8Var2.i(this, m8Var2.Y + f2);
                }
            }
            return;
        }
        int i4 = m8Var.M;
        if (i4 != -1) {
            f8 f8Var = this.u[i4];
            if (f8Var.h) {
                f8Var.d = i2;
                return;
            } else if (f8Var.g.a() == 0) {
                f8Var.h = true;
                f8Var.d = i2;
                return;
            } else {
                f8 v = v();
                v.q(m8Var, i2);
                d(v);
                return;
            }
        }
        f8 v2 = v();
        v2.l(m8Var, i2);
        d(v2);
    }

    public void h(m8 m8Var, m8 m8Var2, int i2, boolean z) {
        f8 v = v();
        m8 x = x();
        x.N = 0;
        v.t(m8Var, m8Var2, x, i2);
        d(v);
    }

    public void i(m8 m8Var, m8 m8Var2, int i2, int i3) {
        f8 v = v();
        m8 x = x();
        x.N = 0;
        v.t(m8Var, m8Var2, x, i2);
        if (i3 != 8) {
            o(v, (int) (v.g.l(x) * (-1.0f)), i3);
        }
        d(v);
    }

    public void j(m8 m8Var, m8 m8Var2, int i2, boolean z) {
        f8 v = v();
        m8 x = x();
        x.N = 0;
        v.u(m8Var, m8Var2, x, i2);
        d(v);
    }

    public void k(m8 m8Var, m8 m8Var2, int i2, int i3) {
        f8 v = v();
        m8 x = x();
        x.N = 0;
        v.u(m8Var, m8Var2, x, i2);
        if (i3 != 8) {
            o(v, (int) (v.g.l(x) * (-1.0f)), i3);
        }
        d(v);
    }

    public void l(m8 m8Var, m8 m8Var2, m8 m8Var3, m8 m8Var4, float f2, int i2) {
        f8 v = v();
        v.n(m8Var, m8Var2, m8Var3, m8Var4, f2);
        if (i2 != 8) {
            v.g(this, i2);
        }
        d(v);
    }

    public void o(f8 f8Var, int i2, int i3) {
        f8Var.h(s(i3, null), i2);
    }

    public void p(m8 m8Var, m8 m8Var2, int i2) {
        if (m8Var.M == -1 && i2 == 0) {
            if (m8Var2.W) {
                m8Var2 = this.B.d[m8Var2.X];
            }
            if (m8Var.W) {
                m8 m8Var3 = this.B.d[m8Var.X];
                return;
            } else {
                m8Var.k(this, m8Var2, 0.0f);
                return;
            }
        }
        e(m8Var, m8Var2, i2, 8);
    }

    public final void q() {
        int i2;
        int i3 = 0;
        while (i3 < this.z) {
            f8 f8Var = this.u[i3];
            if (f8Var.g.a() == 0) {
                f8Var.h = true;
            }
            if (f8Var.h) {
                m8 m8Var = f8Var.c;
                m8Var.O = f8Var.d;
                m8Var.g(f8Var);
                int i4 = i3;
                while (true) {
                    i2 = this.z;
                    if (i4 >= i2 - 1) {
                        break;
                    }
                    f8[] f8VarArr = this.u;
                    int i5 = i4 + 1;
                    f8VarArr[i4] = f8VarArr[i5];
                    i4 = i5;
                }
                this.u[i2 - 1] = null;
                this.z = i2 - 1;
                i3--;
                if (j) {
                    this.B.a.a(f8Var);
                } else {
                    this.B.b.a(f8Var);
                }
            }
            i3++;
        }
    }

    public m8 s(int i2, String str) {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.q++;
        }
        if (this.y + 1 >= this.t) {
            S();
        }
        m8 a2 = a(m8.b.ERROR, str);
        int i3 = this.p + 1;
        this.p = i3;
        this.y++;
        a2.L = i3;
        a2.N = i2;
        this.B.d[i3] = a2;
        this.r.f(a2);
        return a2;
    }

    public m8 t() {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.s++;
        }
        if (this.y + 1 >= this.t) {
            S();
        }
        m8 a2 = a(m8.b.SLACK, null);
        int i2 = this.p + 1;
        this.p = i2;
        this.y++;
        a2.L = i2;
        this.B.d[i2] = a2;
        return a2;
    }

    public m8 u(Object obj) {
        m8 m8Var = null;
        if (obj == null) {
            return null;
        }
        if (this.y + 1 >= this.t) {
            S();
        }
        if (obj instanceof yb) {
            yb ybVar = (yb) obj;
            m8Var = ybVar.j();
            if (m8Var == null) {
                ybVar.z(this.B);
                m8Var = ybVar.j();
            }
            int i2 = m8Var.L;
            if (i2 == -1 || i2 > this.p || this.B.d[i2] == null) {
                if (i2 != -1) {
                    m8Var.h();
                }
                int i3 = this.p + 1;
                this.p = i3;
                this.y++;
                m8Var.L = i3;
                m8Var.S = m8.b.UNRESTRICTED;
                this.B.d[i3] = m8Var;
            }
        }
        return m8Var;
    }

    public f8 v() {
        f8 b2;
        if (j) {
            b2 = this.B.a.b();
            if (b2 == null) {
                b2 = new b(this.B);
                n++;
            } else {
                b2.D();
            }
        } else {
            b2 = this.B.b.b();
            if (b2 == null) {
                b2 = new f8(this.B);
                m++;
            } else {
                b2.D();
            }
        }
        m8.f();
        return b2;
    }

    public m8 x() {
        j8 j8Var = l;
        if (j8Var != null) {
            j8Var.r++;
        }
        if (this.y + 1 >= this.t) {
            S();
        }
        m8 a2 = a(m8.b.SLACK, null);
        int i2 = this.p + 1;
        this.p = i2;
        this.y++;
        a2.L = i2;
        this.B.d[i2] = a2;
        return a2;
    }

    public void z() {
        B();
        String z = wo1.z(wo1.G(" num vars "), this.p, "\n");
        for (int i2 = 0; i2 < this.p + 1; i2++) {
            m8 m8Var = this.B.d[i2];
            if (m8Var != null && m8Var.P) {
                z = z + " $[" + i2 + "] => " + m8Var + " = " + m8Var.O + "\n";
            }
        }
        String t = wo1.t(z, "\n");
        for (int i3 = 0; i3 < this.p + 1; i3++) {
            m8[] m8VarArr = this.B.d;
            m8 m8Var2 = m8VarArr[i3];
            if (m8Var2 != null && m8Var2.W) {
                t = t + " ~[" + i3 + "] => " + m8Var2 + " = " + m8VarArr[m8Var2.X] + " + " + m8Var2.Y + "\n";
            }
        }
        String t2 = wo1.t(t, "\n\n #  ");
        for (int i4 = 0; i4 < this.z; i4++) {
            StringBuilder G = wo1.G(t2);
            G.append(this.u[i4].F());
            t2 = wo1.t(G.toString(), "\n #  ");
        }
        if (this.r != null) {
            StringBuilder L = wo1.L(t2, "Goal: ");
            L.append(this.r);
            L.append("\n");
            t2 = L.toString();
        }
        System.out.println(t2);
    }
}