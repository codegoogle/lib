package com.p7700g.p99005;

import com.p7700g.p99005.f8;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class l8 extends f8 {
    private static final float i = 1.0E-4f;
    private static final boolean j = false;
    public static final int k = -1;
    private int l;
    private m8[] m;
    private m8[] n;
    private int o;
    public b p;
    public g8 q;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<m8> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(m8 m8Var, m8 m8Var2) {
            return m8Var.L - m8Var2.L;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {
        public m8 a;
        public l8 b;

        public b(l8 l8Var) {
            this.b = l8Var;
        }

        public void a(m8 m8Var) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.a.R;
                fArr[i] = fArr[i] + m8Var.R[i];
                if (Math.abs(fArr[i]) < 1.0E-4f) {
                    this.a.R[i] = 0.0f;
                }
            }
        }

        public boolean b(m8 m8Var, float f) {
            boolean z = true;
            if (!this.a.J) {
                for (int i = 0; i < 9; i++) {
                    float f2 = m8Var.R[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.a.R[i] = f3;
                    } else {
                        this.a.R[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.a.R;
                fArr[i2] = (m8Var.R[i2] * f) + fArr[i2];
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.a.R[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                l8.this.J(this.a);
            }
            return false;
        }

        public void c(m8 m8Var) {
            this.a = m8Var;
        }

        public final boolean d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.R[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i = 0; i < 9; i++) {
                if (this.a.R[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(m8 m8Var) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = m8Var.R[i];
                float f2 = this.a.R[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.a.R, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder G = wo1.G(str);
                    G.append(this.a.R[i]);
                    G.append(" ");
                    str = G.toString();
                }
            }
            StringBuilder L = wo1.L(str, "] ");
            L.append(this.a);
            return L.toString();
        }
    }

    public l8(g8 g8Var) {
        super(g8Var);
        this.l = 128;
        this.m = new m8[128];
        this.n = new m8[128];
        this.o = 0;
        this.p = new b(this);
        this.q = g8Var;
    }

    private final void I(m8 m8Var) {
        int i2;
        int i3 = this.o + 1;
        m8[] m8VarArr = this.m;
        if (i3 > m8VarArr.length) {
            m8[] m8VarArr2 = (m8[]) Arrays.copyOf(m8VarArr, m8VarArr.length * 2);
            this.m = m8VarArr2;
            this.n = (m8[]) Arrays.copyOf(m8VarArr2, m8VarArr2.length * 2);
        }
        m8[] m8VarArr3 = this.m;
        int i4 = this.o;
        m8VarArr3[i4] = m8Var;
        int i5 = i4 + 1;
        this.o = i5;
        if (i5 > 1 && m8VarArr3[i5 - 1].L > m8Var.L) {
            int i6 = 0;
            while (true) {
                i2 = this.o;
                if (i6 >= i2) {
                    break;
                }
                this.n[i6] = this.m[i6];
                i6++;
            }
            Arrays.sort(this.n, 0, i2, new a());
            for (int i7 = 0; i7 < this.o; i7++) {
                this.m[i7] = this.n[i7];
            }
        }
        m8Var.J = true;
        m8Var.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(m8 m8Var) {
        int i2 = 0;
        while (i2 < this.o) {
            if (this.m[i2] == m8Var) {
                while (true) {
                    int i3 = this.o;
                    if (i2 < i3 - 1) {
                        m8[] m8VarArr = this.m;
                        int i4 = i2 + 1;
                        m8VarArr[i2] = m8VarArr[i4];
                        i2 = i4;
                    } else {
                        this.o = i3 - 1;
                        m8Var.J = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // com.p7700g.p99005.f8, com.p7700g.p99005.i8.a
    public void c(i8 i8Var, f8 f8Var, boolean z) {
        m8 m8Var = f8Var.c;
        if (m8Var == null) {
            return;
        }
        f8.a aVar = f8Var.g;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            m8 g = aVar.g(i2);
            float j2 = aVar.j(i2);
            this.p.c(g);
            if (this.p.b(m8Var, j2)) {
                I(g);
            }
            this.d = (f8Var.d * j2) + this.d;
        }
        J(m8Var);
    }

    @Override // com.p7700g.p99005.f8, com.p7700g.p99005.i8.a
    public void clear() {
        this.o = 0;
        this.d = 0.0f;
    }

    @Override // com.p7700g.p99005.f8, com.p7700g.p99005.i8.a
    public m8 e(i8 i8Var, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.o; i3++) {
            m8 m8Var = this.m[i3];
            if (!zArr[m8Var.L]) {
                this.p.c(m8Var);
                if (i2 == -1) {
                    if (!this.p.d()) {
                    }
                    i2 = i3;
                } else {
                    if (!this.p.f(this.m[i2])) {
                    }
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.m[i2];
    }

    @Override // com.p7700g.p99005.f8, com.p7700g.p99005.i8.a
    public void f(m8 m8Var) {
        this.p.c(m8Var);
        this.p.g();
        m8Var.R[m8Var.N] = 1.0f;
        I(m8Var);
    }

    @Override // com.p7700g.p99005.f8, com.p7700g.p99005.i8.a
    public boolean isEmpty() {
        return this.o == 0;
    }

    @Override // com.p7700g.p99005.f8
    public String toString() {
        StringBuilder L = wo1.L("", " goal -> (");
        L.append(this.d);
        L.append(") : ");
        String sb = L.toString();
        for (int i2 = 0; i2 < this.o; i2++) {
            this.p.c(this.m[i2]);
            sb = sb + this.p + " ";
        }
        return sb;
    }
}