package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import com.p7700g.p99005.s14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: IPAddressString.java */
/* loaded from: classes3.dex */
public class r14 implements e14, Comparable<r14> {
    private static final long s = 4;
    public static final s14 t = new s14.a().A();
    public final s14 u;
    public final String v;
    private a14 w;
    private o64 x;

    /* compiled from: IPAddressString.java */
    /* loaded from: classes3.dex */
    public class a implements Iterator<String> {
        public boolean s;
        public final /* synthetic */ String t;

        public a(String str) {
            this.t = str;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (!this.s) {
                this.s = true;
                return this.t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: IPAddressString.java */
    /* loaded from: classes3.dex */
    public class b implements Iterator<String> {
        private boolean s;
        public final int t;
        private final Iterator<String>[] u;
        private String[] v;
        public final /* synthetic */ List w;

        public b(List list) {
            this.w = list;
            int size = list.size();
            this.t = size;
            this.u = new Iterator[size];
            this.v = new String[size];
            c(0);
        }

        private void a() {
            for (int i = this.t - 1; i >= 0; i--) {
                if (this.u[i].hasNext()) {
                    this.v[i] = this.u[i].next();
                    c(i + 1);
                    return;
                }
            }
            this.s = true;
        }

        private void c(int i) {
            while (i < this.t) {
                this.u[i] = ((List) this.w.get(i)).iterator();
                this.v[i] = this.u[i].next();
                i++;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public String next() {
            if (!this.s) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.t; i++) {
                    sb.append(this.v[i]);
                }
                a();
                return sb.toString();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r14(String str) {
        this(str, t);
    }

    public static void D1(j14.b bVar, int i, boolean z) throws y14 {
        if (i > (bVar != null && bVar.f() ? 32 : 128)) {
            throw new y14(i, bVar);
        }
    }

    private static boolean G(char c) {
        return c == '.' || c == ':' || c == '-' || c == '|';
    }

    private boolean Q(j14.b bVar) throws a14 {
        if (this.x.a4()) {
            return false;
        }
        if (bVar == null) {
            a14 a14Var = this.w;
            if (a14Var == null) {
                return true;
            }
            throw a14Var;
        } else if (bVar.f()) {
            f();
            return true;
        } else if (bVar.g()) {
            g();
            return true;
        } else {
            return true;
        }
    }

    private static Iterator<String> R(List<List<String>> list) {
        return new b(list);
    }

    public static Iterator<String> S(String str) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (G(charAt)) {
                if (arrayList2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(8);
                    }
                    ArrayList arrayList3 = arrayList;
                    a(str, arrayList3, i, i2, i3, arrayList2, i4);
                    arrayList2 = null;
                    i2 = i4;
                    arrayList = arrayList3;
                }
                i = i4 + 1;
                i3 = i;
            } else if (charAt == ',') {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(str.substring(i3, i4));
                i3 = i4 + 1;
                z = true;
            }
        }
        if (z) {
            if (arrayList2 != null) {
                ArrayList arrayList4 = arrayList == null ? new ArrayList(8) : arrayList;
                a(str, arrayList4, i, i2, i3, arrayList2, str.length());
                arrayList = arrayList4;
            } else {
                arrayList.add(Arrays.asList(str.substring(i2, str.length())));
            }
            return R(arrayList);
        }
        return new a(str);
    }

    private void X0(j14.b bVar) throws a14 {
        if (Q(bVar)) {
            return;
        }
        synchronized (this) {
            if (Q(bVar)) {
                return;
            }
            try {
                this.x = B().b(this);
            } catch (a14 e) {
                this.w = e;
                this.x = o64.g0;
                throw e;
            }
        }
    }

    public static int X2(j14.b bVar, CharSequence charSequence) throws y14 {
        try {
            return z64.E.a(charSequence, bVar);
        } catch (a14 e) {
            throw new y14(charSequence, bVar, e);
        }
    }

    private static void a(String str, List<List<String>> list, int i, int i2, int i3, List<String> list2, int i4) {
        list2.add(str.substring(i3, i4));
        if (i2 != i) {
            list.add(Arrays.asList(str.substring(i2, i)));
        }
        list.add(list2);
    }

    private void f() throws a14 {
        j14.b w2 = this.x.w2();
        if (w2 != null && w2.g()) {
            throw new a14("ipaddress.error.address.is.ipv6");
        }
        a14 a14Var = this.w;
        if (a14Var != null) {
            throw a14Var;
        }
    }

    private void g() throws a14 {
        j14.b w2 = this.x.w2();
        if (w2 != null && w2.f()) {
            throw new a14("ipaddress.error.address.is.ipv4");
        }
        a14 a14Var = this.w;
        if (a14Var != null) {
            throw a14Var;
        }
    }

    public static int n(String str) {
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (G(charAt)) {
                if (i > 0) {
                    i2 *= i + 1;
                    i = 0;
                }
            } else if (charAt == ',') {
                i++;
            }
        }
        return i > 0 ? i2 * (i + 1) : i2;
    }

    private static String x0(o64 o64Var) throws t14 {
        if (o64Var.E1()) {
            return n04.A;
        }
        if (o64Var.r3()) {
            return "";
        }
        if (o64Var.m2()) {
            return l14.I(o64Var.c2().intValue());
        }
        if (o64Var.v4()) {
            return o64Var.w1().E0();
        }
        return null;
    }

    public s14 A() {
        return this.u;
    }

    public l64 B() {
        return z64.E;
    }

    public boolean C0() {
        return K3() != null;
    }

    public boolean D() {
        return P() && this.x.E1();
    }

    public boolean E() {
        return L() && this.x.C4();
    }

    @Override // com.p7700g.p99005.e14
    public String E0() {
        if (P()) {
            try {
                return x0(this.x);
            } catch (t14 unused) {
            }
        }
        return toString();
    }

    public boolean H() {
        return P() && this.x.r3();
    }

    public boolean I() {
        return P() && this.x.v4();
    }

    public boolean J() {
        return P() && this.x.o3();
    }

    public Integer K3() {
        if (P()) {
            return this.x.c2();
        }
        return null;
    }

    public boolean L() {
        return P() && this.x.v2();
    }

    public r24 L1() {
        if (this.x.T2()) {
            return null;
        }
        try {
            validate();
            return this.x.L1();
        } catch (a14 | t14 unused) {
            return null;
        }
    }

    public boolean M() {
        j14 a1 = a1();
        return a1 != null && a1.O4();
    }

    public boolean M0() {
        return P() && this.x.M0();
    }

    public boolean N() {
        return L() && this.x.r4();
    }

    public boolean O() {
        return P() && this.x.m2();
    }

    public boolean P() {
        if (this.x.a4()) {
            try {
                validate();
                return true;
            } catch (a14 unused) {
                return false;
            }
        }
        return !this.x.T2();
    }

    public boolean T(r14 r14Var) {
        Boolean Y3;
        if (r14Var != this || O()) {
            P();
            if (r14Var.x.a4() && (Y3 = this.x.Y3(r14Var.v)) != null) {
                return Y3.booleanValue();
            }
            if (r14Var.P()) {
                Boolean t1 = this.x.t1(r14Var.x);
                if (t1 != null) {
                    return t1.booleanValue();
                }
                j14 a1 = a1();
                if (a1 != null) {
                    j14 a12 = r14Var.a1();
                    Integer K3 = K3();
                    if (a12 != null) {
                        return (K3 == null || K3.intValue() <= a12.A0()) && a1.c5(a12);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean U(r14 r14Var) {
        j14 a1;
        Boolean o1;
        if (r14Var != this || O()) {
            P();
            if (r14Var.x.a4() && (o1 = this.x.o1(r14Var.v)) != null) {
                return o1.booleanValue();
            }
            if (r14Var.P()) {
                Boolean M3 = this.x.M3(r14Var.x);
                if (M3 != null) {
                    return M3.booleanValue();
                }
                j14 a12 = a1();
                if (a12 != null && (a1 = r14Var.a1()) != null) {
                    Integer K3 = K3();
                    return (K3 == null || K3.intValue() <= a1.A0()) && a12.B(a1);
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.p7700g.p99005.e14
    /* renamed from: V */
    public j14 R2() throws a14, t14 {
        validate();
        return this.x.w1();
    }

    public boolean V1() {
        j14 a1 = a1();
        return a1 != null && a1.V1();
    }

    public j14 X(j14.b bVar) throws a14, t14 {
        validate();
        return this.x.n1(bVar);
    }

    public r24 Z() throws a14, t14 {
        validate();
        return this.x.L1();
    }

    public j14.b Z0() {
        if (P()) {
            return this.x.w2();
        }
        return null;
    }

    public r14 b(boolean z) {
        int max;
        if (O()) {
            int intValue = K3().intValue();
            if (z) {
                max = Math.min(128, (intValue + 8) - (intValue % 8));
            } else {
                max = Math.max(0, intValue - (((intValue - 1) % 8) + 1));
            }
            return new r14(l14.I(max), this.u);
        }
        j14 a1 = a1();
        if (a1 == null) {
            return null;
        }
        Integer K3 = a1.K3();
        if (!z && K3 != null && K3.intValue() == 0 && a1.z3() && a1.I0()) {
            return new r14(n04.A, this.u);
        }
        return a1.r0(z).N();
    }

    public r14 c(int i) {
        if (O()) {
            return new r14(l14.I(i > 0 ? Math.min(128, K3().intValue() + i) : Math.max(0, K3().intValue() + i)), this.u);
        }
        j14 a1 = a1();
        if (a1 == null) {
            return null;
        }
        if (i == 0 && C0()) {
            return this;
        }
        Integer K3 = a1.K3();
        if (K3 != null && K3.intValue() + i < 0 && a1.I0()) {
            return new r14(n04.A, this.u);
        }
        return a1.j0(i).N();
    }

    public void c1() throws a14 {
        X0(j14.b.IPV4);
        f();
    }

    public void d(j14 j14Var) {
        if (this.x.a4()) {
            this.x = j14Var.x4();
        }
    }

    public void d1() throws a14 {
        X0(j14.b.IPV6);
        g();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r14) {
            r14 r14Var = (r14) obj;
            boolean equals = toString().equals(r14Var.toString());
            if (equals && this.u == r14Var.u) {
                return true;
            }
            if (P()) {
                if (r14Var.P()) {
                    Boolean p2 = this.x.p2(r14Var.x);
                    if (p2 != null) {
                        return p2.booleanValue();
                    }
                    try {
                        return this.x.M1(r14Var.x);
                    } catch (t14 unused) {
                        return equals;
                    }
                }
                return false;
            } else if (r14Var.P()) {
                return false;
            } else {
                return equals;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(r14 r14Var) {
        if (this == r14Var) {
            return 0;
        }
        boolean P = P();
        boolean P2 = r14Var.P();
        if (P || P2) {
            try {
                return this.x.F3(r14Var.x);
            } catch (t14 unused) {
            }
        }
        return toString().compareTo(r14Var.toString());
    }

    public int hashCode() {
        if (P()) {
            try {
                return this.x.W2();
            } catch (t14 unused) {
            }
        }
        return toString().hashCode();
    }

    public boolean i(r14 r14Var) {
        j14 a1;
        Boolean k2;
        if (P()) {
            if (r14Var == this) {
                return true;
            }
            if (r14Var.x.a4() && (k2 = this.x.k2(r14Var.v)) != null) {
                return k2.booleanValue();
            }
            if (r14Var.P()) {
                Boolean P2 = this.x.P2(r14Var.x);
                if (P2 != null) {
                    return P2.booleanValue();
                }
                j14 a12 = a1();
                if (a12 == null || (a1 = r14Var.a1()) == null) {
                    return false;
                }
                return a12.h4(a1);
            }
            return false;
        }
        return false;
    }

    public String m() throws a14 {
        Integer E3;
        j14 a1 = a1();
        if (a1 == null) {
            E3 = K3();
            if (E3 == null) {
                return null;
            }
        } else {
            E3 = a1.E3(true);
            if (E3 == null) {
                return null;
            }
        }
        int intValue = E3.intValue();
        StringBuilder sb = new StringBuilder(n14.v6(E3.intValue(), 10) + 1);
        sb.append(j14.P);
        return n14.u6(intValue, 10, sb).toString();
    }

    @Override // com.p7700g.p99005.e14
    /* renamed from: o */
    public j14 a1() {
        if (this.x.T2()) {
            return null;
        }
        try {
            return R2();
        } catch (a14 | t14 unused) {
            return null;
        }
    }

    public j14 p(j14.b bVar) {
        if (this.x.T2()) {
            return null;
        }
        try {
            return X(bVar);
        } catch (a14 | t14 unused) {
            return null;
        }
    }

    public a14 t() {
        if (!this.x.T2()) {
            try {
                validate();
            } catch (a14 e) {
                return e;
            }
        }
        return this.w;
    }

    @Override // com.p7700g.p99005.e14
    public String toString() {
        return this.v;
    }

    public j14 u() {
        if (this.x.T2()) {
            return null;
        }
        try {
            return w0();
        } catch (a14 | t14 unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.e14
    public void validate() throws a14 {
        X0(null);
    }

    public j14 w0() throws a14, t14 {
        validate();
        return this.x.Q1();
    }

    public j14 x() {
        if (P()) {
            return this.x.e3();
        }
        return null;
    }

    public q14 y() {
        if (this.x.T2()) {
            return null;
        }
        try {
            validate();
            return this.x.V3();
        } catch (a14 unused) {
            return null;
        }
    }

    public q14 z2() throws a14 {
        validate();
        return this.x.V3();
    }

    public r14(String str, s14 s14Var) {
        this.x = o64.h0;
        if (str == null) {
            this.v = "";
        } else {
            this.v = str.trim();
        }
        this.u = s14Var;
    }

    public r14(String str, j14 j14Var, s14 s14Var) {
        this.x = o64.h0;
        this.u = s14Var;
        this.v = str;
        this.x = j14Var.x4();
    }
}