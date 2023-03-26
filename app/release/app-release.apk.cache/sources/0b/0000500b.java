package com.p7700g.p99005;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class m8 implements Comparable<m8> {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    private static int D = 1;
    private static int E = 1;
    private static int F = 1;
    private static int G = 1;
    private static int H = 1;
    public static final int I = 9;
    private static final boolean s = false;
    private static final boolean t = false;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;
    public boolean J;
    private String K;
    public int L;
    public int M;
    public int N;
    public float O;
    public boolean P;
    public float[] Q;
    public float[] R;
    public b S;
    public f8[] T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public float Y;
    public HashSet<f8> Z;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[5];
            a = iArr;
            try {
                iArr[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public m8(String str, b bVar) {
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.P = false;
        this.Q = new float[9];
        this.R = new float[9];
        this.T = new f8[16];
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.X = -1;
        this.Y = 0.0f;
        this.Z = null;
        this.K = str;
        this.S = bVar;
    }

    private static String e(b bVar, String str) {
        if (str != null) {
            StringBuilder G2 = wo1.G(str);
            G2.append(E);
            return G2.toString();
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            StringBuilder G3 = wo1.G("U");
            int i = F + 1;
            F = i;
            G3.append(i);
            return G3.toString();
        } else if (ordinal == 1) {
            StringBuilder G4 = wo1.G("C");
            int i2 = G + 1;
            G = i2;
            G4.append(i2);
            return G4.toString();
        } else if (ordinal == 2) {
            StringBuilder G5 = wo1.G("S");
            int i3 = D + 1;
            D = i3;
            G5.append(i3);
            return G5.toString();
        } else if (ordinal == 3) {
            StringBuilder G6 = wo1.G("e");
            int i4 = E + 1;
            E = i4;
            G6.append(i4);
            return G6.toString();
        } else if (ordinal == 4) {
            StringBuilder G7 = wo1.G(bx.C4);
            int i5 = H + 1;
            H = i5;
            G7.append(i5);
            return G7.toString();
        } else {
            throw new AssertionError(bVar.name());
        }
    }

    public static void f() {
        E++;
    }

    public final void a(f8 f8Var) {
        int i = 0;
        while (true) {
            int i2 = this.U;
            if (i < i2) {
                if (this.T[i] == f8Var) {
                    return;
                }
                i++;
            } else {
                f8[] f8VarArr = this.T;
                if (i2 >= f8VarArr.length) {
                    this.T = (f8[]) Arrays.copyOf(f8VarArr, f8VarArr.length * 2);
                }
                f8[] f8VarArr2 = this.T;
                int i3 = this.U;
                f8VarArr2[i3] = f8Var;
                this.U = i3 + 1;
                return;
            }
        }
    }

    public void b() {
        for (int i = 0; i < 9; i++) {
            this.Q[i] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(m8 m8Var) {
        return this.L - m8Var.L;
    }

    public String d() {
        return this.K;
    }

    public final void g(f8 f8Var) {
        int i = this.U;
        int i2 = 0;
        while (i2 < i) {
            if (this.T[i2] == f8Var) {
                while (i2 < i - 1) {
                    f8[] f8VarArr = this.T;
                    int i3 = i2 + 1;
                    f8VarArr[i2] = f8VarArr[i3];
                    i2 = i3;
                }
                this.U--;
                return;
            }
            i2++;
        }
    }

    public void h() {
        this.K = null;
        this.S = b.UNKNOWN;
        this.N = 0;
        this.L = -1;
        this.M = -1;
        this.O = 0.0f;
        this.P = false;
        this.W = false;
        this.X = -1;
        this.Y = 0.0f;
        int i = this.U;
        for (int i2 = 0; i2 < i; i2++) {
            this.T[i2] = null;
        }
        this.U = 0;
        this.V = 0;
        this.J = false;
        Arrays.fill(this.R, 0.0f);
    }

    public void i(i8 i8Var, float f) {
        this.O = f;
        this.P = true;
        this.W = false;
        this.X = -1;
        this.Y = 0.0f;
        int i = this.U;
        this.M = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.T[i2].a(i8Var, this, false);
        }
        this.U = 0;
    }

    public void j(String str) {
        this.K = str;
    }

    public void k(i8 i8Var, m8 m8Var, float f) {
        this.W = true;
        this.X = m8Var.L;
        this.Y = f;
        int i = this.U;
        this.M = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.T[i2].G(i8Var, this, false);
        }
        this.U = 0;
        i8Var.z();
    }

    public void l(b bVar, String str) {
        this.S = bVar;
    }

    public String m() {
        String str = this + "[";
        boolean z2 = false;
        boolean z3 = true;
        for (int i = 0; i < this.Q.length; i++) {
            StringBuilder G2 = wo1.G(str);
            G2.append(this.Q[i]);
            String sb = G2.toString();
            float[] fArr = this.Q;
            if (fArr[i] > 0.0f) {
                z2 = false;
            } else if (fArr[i] < 0.0f) {
                z2 = true;
            }
            if (fArr[i] != 0.0f) {
                z3 = false;
            }
            if (i < fArr.length - 1) {
                str = wo1.t(sb, ", ");
            } else {
                str = wo1.t(sb, "] ");
            }
        }
        if (z2) {
            str = wo1.t(str, " (-)");
        }
        return z3 ? wo1.t(str, " (*)") : str;
    }

    public final void n(i8 i8Var, f8 f8Var) {
        int i = this.U;
        for (int i2 = 0; i2 < i; i2++) {
            this.T[i2].c(i8Var, f8Var, false);
        }
        this.U = 0;
    }

    public String toString() {
        if (this.K != null) {
            StringBuilder G2 = wo1.G("");
            G2.append(this.K);
            return G2.toString();
        }
        StringBuilder G3 = wo1.G("");
        G3.append(this.L);
        return G3.toString();
    }

    public m8(b bVar, String str) {
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.P = false;
        this.Q = new float[9];
        this.R = new float[9];
        this.T = new f8[16];
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.X = -1;
        this.Y = 0.0f;
        this.Z = null;
        this.S = bVar;
    }
}