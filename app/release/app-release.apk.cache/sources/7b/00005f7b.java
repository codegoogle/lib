package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import java.io.Serializable;

/* compiled from: ParsedHost.java */
/* loaded from: classes3.dex */
public class u64 implements Serializable {
    private static final long s = 4;
    private static final a t = new a();
    public static final v64 u = new v64();
    private a A;
    public String B;
    private final String C;
    private String[] v;
    private int[] w;
    private boolean[] x;
    private final v64 y;
    private String z;

    /* compiled from: ParsedHost.java */
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        private static final long s = 4;
        public boolean t;
        public boolean u;
        public a14 v;
        public o64 w;
    }

    public u64(String str, o64 o64Var) {
        this(str, null, null, u, new a());
        this.A.w = o64Var;
    }

    private String G(o64 o64Var) {
        if (o64Var.E1()) {
            return n04.A;
        }
        if (o64Var.m2()) {
            return l14.I(o64Var.c2().intValue());
        }
        return o64Var.r3() ? "" : this.C;
    }

    private boolean y() {
        return this.A.w != null;
    }

    public boolean A() {
        return i() != null;
    }

    public boolean B() {
        return y() && i().v2();
    }

    public boolean D() {
        return this.A.u;
    }

    public boolean E() {
        return this.A.t;
    }

    public Integer K3() {
        return this.y.K3();
    }

    public j14 f() throws t14 {
        if (y()) {
            return i().w1();
        }
        return null;
    }

    public j14 g(j14.b bVar) throws t14 {
        if (y()) {
            return i().n1(bVar);
        }
        return null;
    }

    public r14 h() {
        if (y()) {
            o64 i = i();
            if (i.E1()) {
                return new r14(n04.A, i.Y0());
            }
            if (i.m2()) {
                return new r14(l14.I(i.c2().intValue()), i.Y0());
            }
            if (i.r3()) {
                return new r14("", i.Y0());
            }
            try {
                return i.w1().N();
            } catch (t14 unused) {
                return new r14(this.C, i.Y0());
            }
        }
        return null;
    }

    public o64 i() {
        return this.A.w;
    }

    public a14 m() {
        return this.A.v;
    }

    public Integer n() {
        return this.y.f();
    }

    public String o() {
        String str = this.B;
        if (str == null) {
            if (this.C.length() > 0) {
                synchronized (this) {
                    String str2 = this.B;
                    if (str2 == null) {
                        if (y()) {
                            o64 i = i();
                            try {
                                j14 w1 = i.w1();
                                if (w1 != null) {
                                    String S1 = w1.O0().S1();
                                    this.B = S1;
                                    return S1;
                                }
                            } catch (t14 unused) {
                            }
                            String G = G(i);
                            this.B = G;
                            return G;
                        }
                        StringBuilder sb = new StringBuilder(this.C.length());
                        String[] t2 = t();
                        sb.append(t2[0]);
                        for (int i2 = 1; i2 < t2.length; i2++) {
                            sb.append('.');
                            sb.append(t2[i2]);
                        }
                        String sb2 = sb.toString();
                        this.B = sb2;
                        return sb2;
                    }
                    return str2;
                }
            }
            String str3 = this.C;
            this.B = str3;
            return str3;
        }
        return str;
    }

    public j14 p() {
        return this.y.g();
    }

    public String[] t() {
        String[] strArr = this.v;
        if (strArr == null) {
            synchronized (this) {
                strArr = this.v;
                if (strArr == null) {
                    int i = 0;
                    if (y()) {
                        o64 i2 = i();
                        try {
                            j14 w1 = i2.w1();
                            if (w1 != null) {
                                String[] I1 = w1.O0().I1();
                                this.v = I1;
                                return I1;
                            }
                        } catch (t14 unused) {
                        }
                        strArr = i2.r3() ? new String[0] : new String[]{G(i2)};
                    } else {
                        int length = this.w.length;
                        String[] strArr2 = new String[length];
                        int i3 = -1;
                        while (i < length) {
                            int i4 = this.w[i];
                            boolean[] zArr = this.x;
                            if (zArr != null && !zArr[i]) {
                                StringBuilder sb = new StringBuilder((i4 - i3) - 1);
                                while (true) {
                                    i3++;
                                    if (i3 >= i4) {
                                        break;
                                    }
                                    char charAt = this.C.charAt(i3);
                                    if (charAt >= 'A' && charAt <= 'Z') {
                                        charAt = (char) (charAt + gl4.R);
                                    }
                                    sb.append(charAt);
                                }
                                strArr2[i] = sb.toString();
                            } else {
                                strArr2[i] = this.C.substring(i3 + 1, i4);
                            }
                            i++;
                            i3 = i4;
                        }
                        this.w = null;
                        this.x = null;
                        strArr = strArr2;
                    }
                    this.v = strArr;
                }
            }
        }
        return strArr;
    }

    public Integer u() {
        return this.y.h();
    }

    public String x() {
        CharSequence i;
        String str = this.z;
        if (str != null || (i = this.y.i()) == null) {
            return str;
        }
        String charSequence = i.toString();
        this.z = charSequence;
        return charSequence;
    }

    public u64(String str, o64 o64Var, v64 v64Var) {
        this(str, null, null, v64Var, new a());
        this.A.w = o64Var;
    }

    public u64(String str, int[] iArr, boolean[] zArr, v64 v64Var) {
        this(str, iArr, zArr, v64Var, null);
    }

    public u64(String str, int[] iArr, boolean[] zArr, v64 v64Var, a aVar) {
        this.y = v64Var;
        this.x = zArr;
        this.w = iArr;
        this.C = str;
        this.A = aVar == null ? t : aVar;
    }
}