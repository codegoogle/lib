package com.p7700g.p99005;

/* compiled from: CLToken.java */
/* loaded from: classes.dex */
public class ua extends na {
    public b A;
    public char[] B;
    public char[] C;
    public char[] D;
    public int z;

    /* compiled from: CLToken.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[b.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: CLToken.java */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public ua(char[] cArr) {
        super(cArr);
        this.z = 0;
        this.A = b.UNKNOWN;
        this.B = "true".toCharArray();
        this.C = "false".toCharArray();
        this.D = pg1.d.toCharArray();
    }

    public static na C(char[] cArr) {
        return new ua(cArr);
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        a(sb, i);
        sb.append(b());
        return sb.toString();
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        if (ra.a) {
            StringBuilder G = wo1.G("<");
            G.append(b());
            G.append(">");
            return G.toString();
        }
        return b();
    }

    public boolean D() throws sa {
        b bVar = this.A;
        if (bVar == b.TRUE) {
            return true;
        }
        if (bVar == b.FALSE) {
            return false;
        }
        StringBuilder G = wo1.G("this token is not a boolean: <");
        G.append(b());
        G.append(">");
        throw new sa(G.toString(), this);
    }

    public b E() {
        return this.A;
    }

    public boolean G() throws sa {
        if (this.A == b.NULL) {
            return true;
        }
        StringBuilder G = wo1.G("this token is not a null: <");
        G.append(b());
        G.append(">");
        throw new sa(G.toString(), this);
    }

    public boolean H(char c, long j) {
        int ordinal = this.A.ordinal();
        if (ordinal == 0) {
            char[] cArr = this.B;
            int i = this.z;
            if (cArr[i] == c) {
                this.A = b.TRUE;
            } else if (this.C[i] == c) {
                this.A = b.FALSE;
            } else if (this.D[i] == c) {
                this.A = b.NULL;
            }
            r1 = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.B;
            int i2 = this.z;
            r1 = cArr2[i2] == c;
            if (r1 && i2 + 1 == cArr2.length) {
                u(j);
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.C;
            int i3 = this.z;
            r1 = cArr3[i3] == c;
            if (r1 && i3 + 1 == cArr3.length) {
                u(j);
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.D;
            int i4 = this.z;
            r1 = cArr4[i4] == c;
            if (r1 && i4 + 1 == cArr4.length) {
                u(j);
            }
        }
        this.z++;
        return r1;
    }
}