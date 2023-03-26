package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.i34;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.n14;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.s14;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: IPAddressNetwork.java */
/* loaded from: classes3.dex */
public abstract class l14<T extends j14, R extends m14, E extends m14, S extends n14, J extends InetAddress> extends s04<S> {
    private static final long u = 4;
    private final int[] A;
    private transient T B;
    private transient String[] C;
    private c<T, R, E, S, J> D;
    private final T[] v;
    private final T[] w;
    private final T[] x;
    private final T[] y;
    private final int[] z;

    /* compiled from: IPAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static abstract class a<T extends e14> implements Serializable {
        private static final long s = 4;
        private final d t;
        public final Map<String, T> u;

        public a() {
            this(null, null);
        }

        private T i(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num, CharSequence charSequence) {
            if (this.u == null) {
                return d(this.t.c(bVar, bVar2, bVar3, num, charSequence));
            }
            String u = u(bVar, bVar2, bVar3, num, charSequence);
            T t = this.u.get(u);
            if (t == null) {
                j14 c = this.t.c(bVar, bVar2, bVar3, num, charSequence);
                c.d1(u);
                T d = d(c);
                T putIfAbsent = this.u.putIfAbsent(u, d);
                if (putIfAbsent == null) {
                    b(d);
                    return d;
                }
                return putIfAbsent;
            }
            return t;
        }

        public static n04.b o(byte[] bArr) {
            return p(bArr, bArr.length == 4 ? 1 : 2);
        }

        public static n04.b p(final byte[] bArr, final int i) {
            return new n04.b() { // from class: com.p7700g.p99005.hz3
                @Override // com.p7700g.p99005.n04.b
                public final int a(int i2) {
                    return l14.a.t(i, bArr, i2);
                }
            };
        }

        public static /* synthetic */ int t(int i, byte[] bArr, int i2) {
            int i3 = i2 * i;
            int i4 = i + i3;
            int i5 = 0;
            while (i3 < i4) {
                i5 = (i5 << 8) | (bArr[i3] & 255);
                i3++;
            }
            return i5;
        }

        public abstract void b(T t);

        public abstract void c(T t, j14 j14Var);

        public abstract T d(j14 j14Var);

        public T e(n04.a aVar) {
            if (aVar instanceof j14.a) {
                return g((j14.a) aVar);
            }
            return i(aVar.V0() == 4 ? j14.b.IPV4 : j14.b.IPV6, aVar.W0(), aVar.X0(), null, null);
        }

        public T f(n04.b bVar, n04.b bVar2, Integer num, CharSequence charSequence) {
            return i(j14.b.IPV6, bVar, bVar2, num, charSequence);
        }

        public T g(j14.a aVar) {
            return i(aVar.Z0(), aVar.W0(), aVar.X0(), aVar.L0(), aVar.a1());
        }

        public T h(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num) {
            return i(bVar, bVar2, bVar3, num, null);
        }

        public T m(byte[] bArr) {
            j14.b bVar = bArr.length == 4 ? j14.b.IPV4 : j14.b.IPV6;
            return i(bVar, p(bArr, bVar.f() ? 1 : 2), null, null, null);
        }

        public Map<String, T> n() {
            return this.u;
        }

        public String u(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num, CharSequence charSequence) {
            return this.t.t(bVar, bVar2, bVar3, num, charSequence);
        }

        public a(s14 s14Var) {
            this(null, s14Var);
        }

        public a(Map<String, T> map) {
            this(map, null);
        }

        public a(Map<String, T> map, s14 s14Var) {
            this.u = map;
            this.t = new d(s14Var);
        }
    }

    /* compiled from: IPAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static abstract class c<T extends j14, R extends m14, E extends m14, S extends n14, J extends InetAddress> extends d34<T, R, E, S> {
        private static final long u = 4;
        private l14<T, R, E, S, J> v;

        public c(l14<T, R, E, S, J> l14Var) {
            this.v = l14Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private S[] x4(p14 p14Var, int i, int i2, int i3) {
            S[] sArr = (S[]) ((n14[]) d(p14Var.V0()));
            p14Var.m3(0, i, sArr, 0);
            sArr[i] = (n14) c(i2, i3, null);
            int i4 = i + 1;
            if (i4 < sArr.length) {
                n14 n14Var = (n14) c(0, E(), null);
                do {
                    sArr[i4] = n14Var;
                    i4++;
                } while (i4 < sArr.length);
                return sArr;
            }
            return sArr;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: C3 */
        public R p(S[] sArr, Integer num) {
            return t(sArr, num, false);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: D1 */
        public T m(byte[] bArr, CharSequence charSequence) {
            return c1(e4(bArr, y4(), null), charSequence);
        }

        @Override // com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: E3 */
        public abstract R t(S[] sArr, Integer num, boolean z);

        public abstract R G3(byte[] bArr, int i, int i2, int i3, Integer num);

        public abstract R I3(byte[] bArr, int i, int i2, Integer num);

        public abstract R N3(byte[] bArr, Integer num);

        public T O(n04.b bVar, n04.b bVar2, Integer num) {
            return H(x3(bVar, bVar2, num));
        }

        public T P(n04.b bVar, n04.b bVar2, Integer num, CharSequence charSequence) {
            return c1(x3(bVar, bVar2, num), charSequence);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: Q */
        public abstract T H(R r);

        public abstract T R(J j);

        public abstract T S(J j, Integer num);

        public abstract R S3(S[] sArr);

        public T T(byte[] bArr) {
            return H(N3(bArr, null));
        }

        public T U(byte[] bArr, int i, int i2, Integer num) {
            return H(G3(bArr, i, i2, y4(), num));
        }

        public abstract R U3(S[] sArr, Integer num);

        public T V(byte[] bArr, int i, int i2, Integer num, CharSequence charSequence) {
            return c1(G3(bArr, i, i2, y4(), num), charSequence);
        }

        public abstract R[] W3(int i);

        public T X(byte[] bArr, Integer num) {
            return H(N3(bArr, num));
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: X0 */
        public T g(R r, e14 e14Var) {
            T H = H(r);
            H.c1(e14Var);
            return H;
        }

        public T X2(byte[] bArr, Integer num) {
            return H(e4(bArr, y4(), num));
        }

        public T Z(S[] sArr) {
            return H(S3(sArr));
        }

        public abstract T c1(R r, CharSequence charSequence);

        @Override // com.p7700g.p99005.s64
        /* renamed from: d1 */
        public T h(R r, CharSequence charSequence, e14 e14Var) {
            T c1 = c1(r, charSequence);
            c1.c1(e14Var);
            return c1;
        }

        public T d3(byte[] bArr, Integer num, f14 f14Var) {
            return g(e4(bArr, y4(), num), f14Var);
        }

        public R e4(byte[] bArr, int i, Integer num) {
            return (R) M(bArr, i, num, false);
        }

        @Override // com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: g4 */
        public abstract R u(S[] sArr);

        public T i3(byte[] bArr, Integer num, CharSequence charSequence) {
            return c1(e4(bArr, y4(), num), charSequence);
        }

        public T j3(byte[] bArr, Integer num, CharSequence charSequence, f14 f14Var) {
            return h(e4(bArr, y4(), num), charSequence, f14Var);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: k3 */
        public T I(S[] sArr) {
            return H(u(sArr));
        }

        public T n3(S[] sArr, CharSequence charSequence) {
            return c1(u(sArr), charSequence);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: n4 */
        public S B(int i, int i2, Integer num, CharSequence charSequence, int i3, int i4, boolean z, boolean z2, int i5, int i6, int i7) {
            S s = (S) c(i, i2, num);
            s.l6(charSequence, z, z2, i5, i6, i7, i3, i4);
            s.n6(charSequence, z2, i5, i7, i3, i4);
            return s;
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: p3 */
        public T J(S[] sArr, Integer num) {
            return H(p(sArr, num));
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: p4 */
        public S D(int i, Integer num, CharSequence charSequence, int i2, boolean z, int i3, int i4) {
            S s = (S) e(i, num);
            s.k6(charSequence, z, i3, i4, i2);
            s.m6(charSequence, z, i3, i4, i2);
            return s;
        }

        public T q4(p14 p14Var, int i, int i2, int i3) {
            return I(x4(p14Var, i, i2, i3));
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: t3 */
        public T L(S[] sArr, Integer num, boolean z) {
            return H(t(sArr, num, z));
        }

        public T w0(S[] sArr, Integer num) {
            return H(U3(sArr, num));
        }

        public abstract R w3(m14 m14Var, S[] sArr);

        public R w4(p14 p14Var, int i, int i2, int i3) {
            return u(x4(p14Var, i, i2, i3));
        }

        public abstract T[] x0(int i);

        public abstract R x3(n04.b bVar, n04.b bVar2, Integer num);

        public abstract int y4();

        @Override // com.p7700g.p99005.d34
        public l14<T, R, E, S, J> m0() {
            return this.v;
        }
    }

    /* compiled from: IPAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class d implements Serializable {
        private static final long s = 4;
        public final s14 t;

        public d() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public j14 c(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num, CharSequence charSequence) {
            if (bVar == j14.b.IPV4) {
                return o().O(bVar2, bVar3, num);
            }
            if (bVar == j14.b.IPV6) {
                return p().P(bVar2, bVar3, num, charSequence);
            }
            throw new IllegalArgumentException();
        }

        private j14 m(byte[] bArr, int i, int i2, Integer num, CharSequence charSequence) {
            if (bArr.length < 16) {
                return o().U(bArr, i, i2, num);
            }
            return p().V(bArr, i, i2, num, charSequence);
        }

        private ac4.a o() {
            return this.t.o().m0().u();
        }

        private pi4.a p() {
            return this.t.p().m0().u();
        }

        public j14 b(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num) {
            return c(bVar, bVar2, bVar3, num, null);
        }

        public j14 d(InetAddress inetAddress) {
            if (inetAddress instanceof Inet4Address) {
                return o().R((Inet4Address) inetAddress);
            }
            if (inetAddress instanceof Inet6Address) {
                return p().R((Inet6Address) inetAddress);
            }
            return null;
        }

        public j14 e(InetAddress inetAddress, Integer num) {
            if (inetAddress instanceof Inet4Address) {
                return o().S((Inet4Address) inetAddress, num);
            }
            if (inetAddress instanceof Inet6Address) {
                return p().S((Inet6Address) inetAddress, num);
            }
            return null;
        }

        public j14 f(InterfaceAddress interfaceAddress) {
            InetAddress address = interfaceAddress.getAddress();
            if (address instanceof Inet4Address) {
                return o().S((Inet4Address) address, l14.o(interfaceAddress.getNetworkPrefixLength()));
            }
            if (address instanceof Inet6Address) {
                return p().S((Inet6Address) address, l14.o(interfaceAddress.getNetworkPrefixLength()));
            }
            return null;
        }

        public j14 g(byte[] bArr) {
            return m(bArr, 0, bArr.length, null, null);
        }

        public j14 h(byte[] bArr, int i, int i2) {
            return m(bArr, i, i2, null, null);
        }

        public j14 i(byte[] bArr, int i, int i2, Integer num) {
            return m(bArr, i, i2, num, null);
        }

        public j14 n(byte[] bArr, Integer num) {
            return m(bArr, 0, bArr.length, num, null);
        }

        public String t(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num, CharSequence charSequence) {
            if (bVar == j14.b.IPV4) {
                return yb4.B7(this.t.o().m0(), bVar2, bVar3, num);
            }
            if (bVar == j14.b.IPV6) {
                return ni4.e8(this.t.p().m0(), bVar2, bVar3, num, charSequence);
            }
            throw new IllegalArgumentException();
        }

        public d(ac4 ac4Var, pi4 pi4Var) {
            this(new s14.a().t().F(ac4Var).k().u().D(pi4Var).B().F(ac4Var).D().k().A());
        }

        public d(s14 s14Var) {
            this.t = s14Var == null ? r14.t : s14Var;
        }
    }

    public l14(Class<T> cls) {
        j14.b Z0 = Z0();
        T[] tArr = (T[]) ((j14[]) Array.newInstance((Class<?>) cls, j14.x3(Z0) + 1));
        this.v = tArr;
        this.w = (T[]) ((j14[]) tArr.clone());
        this.x = (T[]) ((j14[]) tArr.clone());
        this.y = (T[]) ((j14[]) tArr.clone());
        this.D = p();
        int u5 = n14.u5(Z0);
        int i = ~((-1) << u5);
        int[] iArr = new int[u5 + 1];
        this.z = iArr;
        this.A = (int[]) iArr.clone();
        for (int i2 = 0; i2 <= u5; i2++) {
            int i3 = (i << (u5 - i2)) & i;
            this.z[i2] = i3;
            this.A[i2] = (~i3) & i;
        }
    }

    private T B(int i, T[] tArr, boolean z, boolean z2, boolean z3) {
        int i2;
        int i3;
        int i4;
        int i5;
        T t;
        int i6;
        T I;
        T I2;
        T I3;
        l24 l24Var;
        T t2;
        j14.b Z0 = Z0();
        int x3 = j14.x3(Z0);
        if (i >= 0 && i <= x3) {
            T t3 = tArr[i];
            if (t3 == null) {
                if (z) {
                    i3 = x3;
                    i2 = 0;
                } else {
                    i2 = x3;
                    i3 = 0;
                }
                T t4 = tArr[i3];
                T t5 = tArr[i2];
                if (t4 == null || t5 == null) {
                    synchronized (tArr) {
                        int y4 = j14.y4(Z0);
                        int C3 = j14.C3(Z0);
                        int I32 = j14.I3(Z0);
                        T t6 = tArr[i3];
                        if (t6 == null) {
                            c<T, R, E, S, J> g = g();
                            S[] sArr = (S[]) ((n14[]) g.d(y4));
                            int g4 = j14.g4(Z0);
                            if (z && z2) {
                                Arrays.fill(sArr, 0, sArr.length - 1, (n14) g.e(g4, m14.w3(C3, x3)));
                                sArr[sArr.length - 1] = (n14) g.e(g4, m14.w3(C3, C3));
                                I2 = g.J(sArr, o(x3));
                            } else {
                                Arrays.fill(sArr, (n14) g.b(g4));
                                I2 = g.I(sArr);
                            }
                            t = I2;
                            i4 = C3;
                            i5 = y4;
                            P(t.O0(), z, z2, z3, x3, i3, y4, C3, I32);
                            tArr[i3] = t;
                        } else {
                            i4 = C3;
                            i5 = y4;
                            t = t6;
                        }
                        T t7 = tArr[i2];
                        if (t7 == null) {
                            c<T, R, E, S, J> g2 = g();
                            S[] sArr2 = (S[]) ((n14[]) g2.d(i5));
                            if (z && z2) {
                                i6 = i4;
                                Arrays.fill(sArr2, (n14) g2.e(0, m14.w3(i6, 0)));
                                T J = g2.J(sArr2, o(0));
                                if (i().h() && !z3) {
                                    J = (T) J.m();
                                }
                                I = J;
                            } else {
                                i6 = i4;
                                Arrays.fill(sArr2, (n14) g2.b(0));
                                I = g2.I(sArr2);
                            }
                            P(I.O0(), z, z2, z3, x3, i2, i5, i6, I32);
                            tArr[i2] = I;
                            t5 = I;
                        } else {
                            t5 = t7;
                        }
                    }
                    t4 = t;
                }
                synchronized (tArr) {
                    T t8 = tArr[i];
                    if (t8 == null) {
                        BiFunction<T, Integer, S> N = N();
                        int y42 = j14.y4(Z0);
                        int C32 = j14.C3(Z0);
                        int I33 = j14.I3(Z0);
                        S apply = N.apply(t4, 1);
                        S apply2 = N.apply(t5, 1);
                        c<T, R, E, S, J> g3 = g();
                        ArrayList arrayList = new ArrayList(y42);
                        int i7 = 0;
                        for (int i8 = i; i8 > 0; i8 -= C32) {
                            if (i8 <= C32) {
                                int i9 = ((i8 - 1) % C32) + 1;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= y42) {
                                        l24Var = null;
                                        break;
                                    } else if (i9 != i && (t2 = tArr[i9]) != null) {
                                        l24Var = (n14) N.apply(t2, Integer.valueOf(i10));
                                        break;
                                    } else {
                                        i10++;
                                        i9 += C32;
                                    }
                                }
                                if (l24Var == null) {
                                    int M = M(i8);
                                    if (!z) {
                                        l24Var = (S) g3.b(L(i8));
                                    } else if (z2) {
                                        l24Var = (S) g3.e(M, m14.w3(C32, i8));
                                    } else {
                                        l24Var = (S) g3.b(M);
                                    }
                                }
                                arrayList.add(l24Var);
                            } else {
                                arrayList.add(z ? apply : apply2);
                            }
                            i7++;
                        }
                        while (i7 < y42) {
                            arrayList.add(z ? apply2 : apply);
                            i7++;
                        }
                        S[] sArr3 = (S[]) ((n14[]) g3.d(arrayList.size()));
                        arrayList.toArray(sArr3);
                        if (z && z2) {
                            I3 = g3.J(sArr3, o(i));
                            if (i().h() && !z3) {
                                I3 = (T) I3.m();
                            }
                        } else {
                            I3 = g3.I(sArr3);
                        }
                        T t9 = I3;
                        P(t9.O0(), z, z2, z3, x3, i, y42, C32, I33);
                        tArr[i] = t9;
                        t3 = t9;
                    } else {
                        t3 = t8;
                    }
                }
            }
            return t3;
        }
        throw new y14(i, Z0);
    }

    public static String I(int i) {
        StringBuilder sb = new StringBuilder(l64.b + 1);
        sb.append(j14.P);
        sb.append(i);
        return sb.toString();
    }

    private void P(m14 m14Var, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        i34.c cVar;
        i34.c cVar2;
        Integer o;
        BigInteger bigInteger;
        Integer num;
        int i32;
        int i6 = 0;
        boolean z4 = !z ? i2 < i4 : i - i2 < i4;
        i34.c P4 = m14.P4();
        if (z4) {
            if (z) {
                i6 = m14.n3(i2, i5, i4) + 1;
                i32 = i3 - i6;
            } else {
                i32 = m14.i3(i2, i5, i4);
            }
            i34.c Q4 = m14.Q4(i6, i32);
            if (!z || !z2 || i().g()) {
                P4 = Q4;
            }
            cVar2 = Q4;
            cVar = P4;
        } else {
            cVar = P4;
            cVar2 = cVar;
        }
        Integer o2 = o(i2);
        if (z && z2) {
            if (!i().g() && (!i().h() || z3)) {
                bigInteger = BigInteger.valueOf(2L).pow(i - i2);
                num = o2;
                o = num;
            } else {
                o = o(i);
                num = o2;
                bigInteger = BigInteger.ONE;
            }
        } else {
            o = o(i);
            bigInteger = BigInteger.ONE;
            num = null;
        }
        m14Var.c6(o2, z, num, o, o, bigInteger, cVar, cVar2);
    }

    public static Integer o(int i) {
        return m14.b(i);
    }

    public T A() {
        if (this.B == null) {
            synchronized (this) {
                if (this.B == null) {
                    this.B = t();
                }
            }
        }
        return this.B;
    }

    public T D(int i) {
        return B(i, this.x, true, true, true);
    }

    public T E(int i) {
        return G(i, true);
    }

    public T G(int i, boolean z) {
        return B(i, z ? this.v : this.w, true, z, false);
    }

    public R H(int i) {
        return J().apply(G(i, true));
    }

    public abstract Function<T, R> J();

    public int L(int i) {
        return this.A[i];
    }

    public int M(int i) {
        return this.z[i];
    }

    public abstract BiFunction<T, Integer, S> N();

    public String[] O() {
        if (this.C == null) {
            synchronized (this) {
                if (this.C == null) {
                    this.C = A().O5();
                }
            }
        }
        return this.C;
    }

    public boolean Q() {
        return false;
    }

    public boolean R() {
        return false;
    }

    public abstract j14.b Z0();

    @Override // com.p7700g.p99005.s04
    public void f() {
        Arrays.fill(this.v, (Object) null);
        Arrays.fill(this.w, (Object) null);
        Arrays.fill(this.x, (Object) null);
        Arrays.fill(this.y, (Object) null);
        this.B = null;
        this.C = null;
        super.f();
    }

    public abstract c<T, R, E, S, J> p();

    public abstract T t();

    @Override // com.p7700g.p99005.s04
    /* renamed from: u */
    public c<T, R, E, S, J> g() {
        return this.D;
    }

    public T x(int i) {
        return B(i, this.y, false, false, false);
    }

    public R y(int i) {
        return J().apply(x(i));
    }

    /* compiled from: IPAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class e extends s04.b<r14> {
        private static final long u = 4;
        private final a<r14> v;

        /* compiled from: IPAddressNetwork.java */
        /* loaded from: classes3.dex */
        public class a extends a<r14> {
            public a(Map map, s14 s14Var) {
                super(map, s14Var);
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: A */
            public r14 d(j14 j14Var) {
                return j14Var.N();
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: x */
            public void b(r14 r14Var) {
                e.this.a(r14Var);
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: y */
            public void c(r14 r14Var, j14 j14Var) {
                r14Var.d(j14Var);
            }
        }

        public e(Map<String, r14> map, s14 s14Var) {
            super(map);
            this.v = new a(map, s14Var);
        }

        public static n04.b t(byte[] bArr) {
            return a.o(bArr);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: h */
        public r14 c(String str) {
            s14 s14Var = ((a) this.v).t.t;
            return s14Var == null ? new r14(str) : new r14(str, s14Var);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: i */
        public r14 d(n04.a aVar) {
            return this.v.e(aVar);
        }

        public r14 m(n04.b bVar, n04.b bVar2, Integer num, CharSequence charSequence) {
            return this.v.f(bVar, bVar2, num, charSequence);
        }

        public r14 n(j14.a aVar) {
            return this.v.g(aVar);
        }

        public r14 o(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num) {
            return this.v.h(bVar, bVar2, bVar3, num);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: p */
        public r14 f(byte[] bArr) {
            return this.v.m(bArr);
        }

        public e(Map<String, r14> map) {
            this(map, null);
        }

        public e(s14 s14Var) {
            this(null, s14Var);
        }

        public e() {
            this(null, null);
        }
    }

    /* compiled from: IPAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class b extends s04.b<f14> {
        private static final long u = 4;
        private final a<f14> v;
        private final h14 w;

        /* compiled from: IPAddressNetwork.java */
        /* loaded from: classes3.dex */
        public class a extends a<f14> {
            public final /* synthetic */ boolean v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map map, s14 s14Var, boolean z) {
                super(map, s14Var);
                this.v = z;
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: A */
            public f14 d(j14 j14Var) {
                if (this.v) {
                    return new f14(j14Var.C5().getHostName());
                }
                return new f14(j14Var);
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: x */
            public void b(f14 f14Var) {
                b.this.a(f14Var);
            }

            @Override // com.p7700g.p99005.l14.a
            /* renamed from: y */
            public void c(f14 f14Var, j14 j14Var) {
                f14Var.o(j14Var);
            }
        }

        public b(Map<String, f14> map, h14 h14Var, boolean z) {
            super(map);
            this.v = new a(map, h14Var.L, z);
            this.w = h14Var;
        }

        public static n04.b p(byte[] bArr) {
            return a.o(bArr);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: h */
        public f14 c(String str) {
            return this.w == null ? new f14(str) : new f14(str, this.w);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: i */
        public f14 d(n04.a aVar) {
            return this.v.e(aVar);
        }

        public f14 m(n04.b bVar, n04.b bVar2, Integer num, CharSequence charSequence) {
            return this.v.f(bVar, bVar2, num, charSequence);
        }

        public f14 n(j14.b bVar, n04.b bVar2, n04.b bVar3, Integer num) {
            return this.v.h(bVar, bVar2, bVar3, num);
        }

        @Override // com.p7700g.p99005.s04.b
        /* renamed from: o */
        public f14 f(byte[] bArr) {
            return this.v.m(bArr);
        }

        public b(Map<String, f14> map) {
            this(map, f14.x, false);
        }

        public b(h14 h14Var) {
            this(null, h14Var, false);
        }

        public b() {
            this(null, null, false);
        }
    }
}