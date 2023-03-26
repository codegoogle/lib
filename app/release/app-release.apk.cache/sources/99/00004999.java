package com.p7700g.p99005;

import com.p7700g.p99005.k14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* compiled from: IPAddress.java */
/* loaded from: classes3.dex */
public abstract class j14 extends n04 implements p14, v24 {
    private static final long O = 4;
    public static final char P = '/';
    public static final String Q = "0b";
    public static final k14 R = new k14.a();
    public f14 S;
    private f14 T;

    /* compiled from: IPAddress.java */
    /* loaded from: classes3.dex */
    public interface a extends n04.a {
        Integer L0();

        b Z0();

        String a1();
    }

    /* compiled from: IPAddress.java */
    /* loaded from: classes3.dex */
    public enum b {
        IPV4,
        IPV6;

        public boolean f() {
            return this == IPV4;
        }

        public boolean g() {
            return this == IPV6;
        }

        @Override // java.lang.Enum
        public String toString() {
            return f() ? "IPv4" : "IPv6";
        }
    }

    public j14(m14 m14Var) {
        super(m14Var);
    }

    public static <T extends j14> T[] B4(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, Comparator<T> comparator, UnaryOperator<T> unaryOperator3, UnaryOperator<T> unaryOperator4, IntFunction<T[]> intFunction) {
        T[] tArr = (T[]) D1(t, t2, unaryOperator3, intFunction);
        if (tArr != null) {
            return tArr;
        }
        List list = (List) m14.b5(t, t2, unaryOperator, unaryOperator2, comparator, unaryOperator4, gz3.a);
        return (T[]) ((j14[]) list.toArray(intFunction.apply(list.size())));
    }

    public static int C3(b bVar) {
        return n14.u5(bVar);
    }

    private static <T extends j14> T[] D1(T t, T t2, UnaryOperator<T> unaryOperator, IntFunction<T[]> intFunction) {
        if (t.h4(t2)) {
            return (T[]) ((j14[]) X2(t, t2, true, unaryOperator, intFunction));
        }
        if (t2.h4(t)) {
            return (T[]) ((j14[]) X2(t2, t, false, unaryOperator, intFunction));
        }
        return null;
    }

    public static <T extends j14, S extends n14> T[] D4(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, Comparator<T> comparator, UnaryOperator<T> unaryOperator3, final l14.c<T, ?, ?, S, ?> cVar) {
        Objects.requireNonNull(cVar);
        T[] tArr = (T[]) d3(t, t2, unaryOperator3, new IntFunction() { // from class: com.p7700g.p99005.j04
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return l14.c.this.x0(i);
            }
        });
        if (tArr != null) {
            return tArr;
        }
        final cz3 cz3Var = new cz3(cVar);
        List list = (List) m14.b5(t, t2, unaryOperator, unaryOperator2, comparator, unaryOperator3, new m14.k() { // from class: com.p7700g.p99005.fz3
            @Override // com.p7700g.p99005.m14.k
            public final Object a(Object obj, Object obj2, Object obj3) {
                List h7;
                j14 j14Var = (j14) obj;
                h7 = m14.h7((j14) obj2, (j14) obj3, m14.i.this);
                return h7;
            }
        });
        return (T[]) ((j14[]) list.toArray(cVar.x0(list.size())));
    }

    public static int G3(b bVar) {
        return bVar.f() ? 4 : 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r21.intValue() < (r24 == 8 ? r22 << 3 : r24 == 16 ? r22 << 4 : r22 * r24)) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb A[EDGE_INSN: B:84:0x00eb->B:67:0x00eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int G5(s04.c cVar, n04.b bVar, n04.b bVar2, Integer num, int i, int i2, int i3, int i4, char c, int i5, CharSequence charSequence, StringBuilder sb) {
        boolean z;
        int i6;
        int a2;
        int a3;
        if (num != null && cVar.f()) {
            if (num.intValue() > 0) {
            }
            z = true;
            i6 = 0;
            int i7 = 0;
            while (true) {
                Integer x3 = m14.x3(i3, num, i6);
                if (z || x3 == null || x3.intValue() != 0) {
                    if (bVar != null) {
                        a2 = bVar2.a(i6);
                    } else {
                        a2 = bVar.a(i6);
                        if (bVar2 != null) {
                            a3 = bVar2.a(i6);
                            if (bVar != null || bVar2 == null) {
                                if (z && x3 != null) {
                                    a2 &= (-1) << (i3 - x3.intValue());
                                }
                                if (sb == null) {
                                    i7 += n14.v6(a2, i5);
                                } else {
                                    n14.u6(a2, i5, sb);
                                }
                            } else {
                                if (z && x3 != null) {
                                    int intValue = (-1) << (i3 - x3.intValue());
                                    a2 &= intValue;
                                    a3 &= intValue;
                                }
                                int i8 = a3;
                                if (a2 != i8) {
                                    if (a2 > i8) {
                                        int i9 = a2;
                                        a2 = i8;
                                        i8 = i9;
                                    }
                                    if (a2 == 0 && i8 == i4) {
                                        if (sb == null) {
                                            i7 += n04.A.length();
                                        } else {
                                            sb.append(n04.A);
                                        }
                                    } else if (sb == null) {
                                        i7 += n04.w.length() + n14.v6(i8, i5) + n14.v6(a2, i5);
                                    } else {
                                        StringBuilder u6 = n14.u6(a2, i5, sb);
                                        u6.append(n04.w);
                                        n14.u6(i8, i5, u6);
                                    }
                                } else if (sb == null) {
                                    i7 += n14.v6(a2, i5);
                                } else {
                                    n14.u6(a2, i5, sb);
                                }
                            }
                            i6++;
                            if (i6 < i) {
                                break;
                            } else if (sb != null) {
                                sb.append(c);
                            }
                        }
                    }
                    a3 = 0;
                    if (bVar != null) {
                    }
                    if (z) {
                        a2 &= (-1) << (i3 - x3.intValue());
                    }
                    if (sb == null) {
                    }
                    i6++;
                    if (i6 < i) {
                    }
                } else if (sb == null) {
                    i7++;
                } else {
                    sb.append('0');
                }
                i6++;
                if (i6 < i) {
                }
            }
            if (sb == null) {
                i7 = (i7 + i) - 1;
            }
            if (charSequence != null && charSequence.length() > 0) {
                if (sb != null) {
                    i7 += charSequence.length() + 1;
                } else {
                    sb.append('%');
                    sb.append(charSequence);
                }
            }
            if (num == null) {
                if (sb == null) {
                    return i7 + n14.v6(num.intValue(), 10) + 1;
                }
                sb.append(P);
                sb.append(num);
                return i7;
            }
            return i7;
        }
        z = false;
        i6 = 0;
        int i72 = 0;
        while (true) {
            Integer x32 = m14.x3(i3, num, i6);
            if (z) {
            }
            if (bVar != null) {
            }
            a3 = 0;
            if (bVar != null) {
            }
            if (z) {
            }
            if (sb == null) {
            }
            i6++;
            if (i6 < i) {
            }
        }
        if (sb == null) {
        }
        if (charSequence != null) {
            if (sb != null) {
            }
        }
        if (num == null) {
        }
    }

    public static String H5(s04.c cVar, n04.b bVar, n04.b bVar2, Integer num, int i, int i2, int i3, int i4, char c, int i5, CharSequence charSequence) {
        int G5 = G5(cVar, bVar, bVar2, num, i, i2, i3, i4, c, i5, charSequence, null);
        StringBuilder sb = new StringBuilder(G5);
        G5(cVar, bVar, bVar2, num, i, i2, i3, i4, c, i5, charSequence, sb);
        m14.j5(G5, sb);
        return sb.toString();
    }

    public static int I3(b bVar) {
        return n14.v5(bVar);
    }

    public static String I5(a aVar) {
        b Z0 = aVar.Z0();
        if (Z0.f()) {
            return yb4.B7(n04.g(), aVar.W0(), aVar.X0(), aVar.L0());
        }
        if (Z0.g()) {
            return ni4.e8(n04.h(), aVar.W0(), aVar.X0(), aVar.L0(), aVar.a1());
        }
        throw new IllegalArgumentException();
    }

    public static void J5(a aVar, StringBuilder sb) {
        b Z0 = aVar.Z0();
        if (Z0.f()) {
            G5(n04.g().i(), aVar.W0(), aVar.X0(), aVar.L0(), 4, 1, 8, 255, '.', 10, null, sb);
        } else if (Z0.g()) {
            G5(n04.h().i(), aVar.W0(), aVar.X0(), aVar.L0(), 8, 2, 16, 65535, ':', 16, aVar.a1(), sb);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static <T extends p14> T[] X2(T t, T t2, boolean z, UnaryOperator<T> unaryOperator, IntFunction<T[]> intFunction) {
        if (t.C0()) {
            if (!t.b1()) {
                t = null;
            }
        } else {
            t = (z && t2.C0() && t.equals(t2) && t2.b1()) ? t2 : (T) unaryOperator.apply(t);
        }
        if (t != null) {
            T[] apply = intFunction.apply(1);
            apply[0] = t;
            return apply;
        }
        return null;
    }

    private static <T extends j14> T[] d3(T t, T t2, UnaryOperator<T> unaryOperator, IntFunction<T[]> intFunction) {
        if (t.h4(t2)) {
            return (T[]) ((j14[]) i3(t, t2, true, unaryOperator, intFunction));
        }
        if (t2.h4(t)) {
            return (T[]) ((j14[]) i3(t2, t, false, unaryOperator, intFunction));
        }
        return null;
    }

    public static int g4(b bVar) {
        return n14.z5(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2.M0() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T extends p14> T[] i3(T t, T t2, boolean z, UnaryOperator<T> unaryOperator, IntFunction<T[]> intFunction) {
        if (t.C0()) {
            if (z && !t2.C0() && t.equals(t2)) {
                if (t2.M0()) {
                    t = t2;
                }
                t = null;
            } else {
                if (t.M0()) {
                    t = (T) unaryOperator.apply(t);
                }
                t = null;
            }
        }
        if (t != null) {
            T[] apply = intFunction.apply(1);
            apply[0] = t;
            return apply;
        }
        return null;
    }

    public static int j3(j14 j14Var, j14 j14Var2) {
        return n04.H.a(j14Var, j14Var2);
    }

    public static <T extends j14, S extends n14> List<p14> n4(p14[] p14VarArr) {
        return m14.H5(p14VarArr);
    }

    public static List<? extends p14> n5(p14 p14Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends p14> j1 = p14Var.j1();
        while (j1.hasNext()) {
            p14 next = j1.next();
            if (z) {
                Collections.addAll(arrayList, next.i1());
            } else {
                Collections.addAll(arrayList, next);
            }
        }
        return arrayList;
    }

    public static <T extends j14, S extends n14> List<p14> p4(p14[] p14VarArr, l14.c<T, ?, ?, S, ?> cVar) {
        Objects.requireNonNull(cVar);
        return m14.I5(p14VarArr, new cz3(cVar));
    }

    public static int x3(b bVar) {
        return bVar.f() ? 32 : 128;
    }

    public static int y4(b bVar) {
        return bVar.f() ? 4 : 8;
    }

    public static String y5(String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append('\'');
            sb.append(str);
            sb.append('\'');
            sb.append(e14.f0);
        }
        return sb.substring(0, sb.length() - 1);
    }

    public yb4 A5() {
        return null;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Iterator<? extends j14> B0();

    public ni4 B5() {
        return null;
    }

    @Override // com.p7700g.p99005.v24
    public boolean C(q14 q14Var) {
        if (j3(q14Var.a0(), m()) < 0 || j3(q14Var.b0(), o()) > 0) {
            return false;
        }
        if (M0()) {
            return true;
        }
        Iterator<? extends j14> j1 = j1();
        while (j1.hasNext()) {
            if (j1.next().C(q14Var)) {
                return true;
            }
        }
        return false;
    }

    public InetAddress C5() {
        return O0().o7(this);
    }

    @Override // com.p7700g.p99005.z04
    public /* bridge */ /* synthetic */ x04 D0(int i) {
        return o14.l(this, i);
    }

    @Override // com.p7700g.p99005.p14
    public String D2(m14.e eVar) {
        return O0().D2(eVar);
    }

    public InetAddress D5() {
        try {
            return InetAddress.getByAddress(O0().n());
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public Integer E3(boolean z) {
        return O0().y5(z);
    }

    public int E4(boolean z) {
        return O0().R4(z);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: E5 */
    public abstract j14 L3();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Iterator<? extends j14> F0();

    @Override // com.p7700g.p99005.n04
    /* renamed from: F4 */
    public abstract j14 p(long j) throws c14;

    @Override // com.p7700g.p99005.p14
    /* renamed from: F5 */
    public abstract j14 d2(int i);

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract x44<? extends j14> G0();

    @Override // com.p7700g.p99005.p14
    public String G1() {
        return O0().G1();
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: G4 */
    public abstract j14 t(long j) throws c14;

    @Override // com.p7700g.p99005.p14
    public String H2() {
        return O0().H2();
    }

    public abstract j14 H4(j14 j14Var) throws r04;

    public boolean I4() {
        return V1();
    }

    public boolean J4() {
        return O0().g6();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Stream<? extends j14> K0();

    @Override // com.p7700g.p99005.r24
    public Integer K3() {
        return O0().K3();
    }

    public abstract boolean K4();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: K5 */
    public abstract j14 i0();

    public boolean L4() {
        return O0().h6();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: L5 */
    public abstract j14 i4(int i) throws y14;

    public abstract boolean M4();

    public abstract q14 M5(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.z04
    public /* bridge */ /* synthetic */ x04[] N0() {
        return o14.m(this);
    }

    @Override // com.p7700g.p99005.p14
    public boolean N2(int i) {
        return O0().N2(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.p14
    /* renamed from: N3 */
    public j14 a2() {
        Integer K3 = K3();
        return m0().x(K3 == null ? 0 : K3.intValue());
    }

    public abstract boolean N4();

    public i54 N5() {
        return O0().w7();
    }

    @Override // com.p7700g.p99005.p14
    public abstract Stream<? extends j14> O1(int i);

    public abstract boolean O4();

    public String[] O5() {
        return N5().a();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Stream<? extends j14> P0();

    public boolean P4() {
        return O0().m6();
    }

    public String[] P5(m14.c cVar) {
        return Y1(cVar).a();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Q */
    public abstract j14 r0(boolean z);

    @Override // com.p7700g.p99005.p14
    public String Q2() {
        return O0().Q2();
    }

    public boolean Q4() {
        return V1();
    }

    public abstract String Q5();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: R */
    public abstract j14 q0(boolean z, boolean z2);

    @Override // com.p7700g.p99005.p14
    public BigInteger R3() {
        return O0().R3();
    }

    public boolean R4() {
        return O0().n6();
    }

    public InetAddress R5() {
        return o().C5();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: S */
    public abstract j14 j0(int i);

    @Override // com.p7700g.p99005.p14
    public String S1() {
        return O0().S1();
    }

    @Override // com.p7700g.p99005.p14
    public abstract Iterator<? extends j14> S2(int i);

    public int S3(boolean z) {
        return O0().O4(z);
    }

    public boolean S4(int i) {
        return O0().o6(i);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: S5 */
    public abstract j14 Z3();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: T */
    public abstract j14 u0(int i, boolean z);

    @Override // com.p7700g.p99005.p14
    public String T3() {
        return O0().T3();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: T5 */
    public abstract j14 I2(int i);

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: U */
    public abstract j14 p0(int i);

    @Override // com.p7700g.p99005.p14
    public x44<? extends j14> U1() {
        return y2(G2());
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: U3 */
    public abstract j14 e2();

    public abstract j14 U5(boolean z);

    public <V> V V(BiFunction<? super j14, ? super j14, V> biFunction, j14... j14VarArr) {
        o04 o04Var = n04.H;
        o04 o04Var2 = n04.I;
        j14 j14Var = this;
        j14 j14Var2 = j14Var;
        for (j14 j14Var3 : j14VarArr) {
            if (j14Var3 != null) {
                j14 n3 = n3(j14Var3);
                if (o04Var.a(n3, j14Var) < 0) {
                    j14Var = n3;
                }
                if (o04Var2.a(n3, j14Var2) > 0) {
                    j14Var2 = n3;
                }
            }
        }
        return biFunction.apply(j14Var.m(), j14Var2.o());
    }

    public abstract j14 V4(j14 j14Var) throws r04, t14;

    @Override // com.p7700g.p99005.p14
    /* renamed from: V5 */
    public abstract j14 O3();

    public void W3(StringBuilder sb, String str) {
        O0().R5(sb, str);
    }

    public abstract j14 W4(j14 j14Var, boolean z) throws r04, t14;

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: W5 */
    public abstract j14 t0();

    @Override // com.p7700g.p99005.p14
    /* renamed from: X */
    public j14 g2() {
        return o0(b3(), false);
    }

    public abstract j14 X0(j14 j14Var, int i) throws r04, t14;

    public abstract j14 X4(j14 j14Var, int i) throws r04, t14;

    @Override // com.p7700g.p99005.p14
    public i54 Y1(m14.c cVar) {
        return O0().Y1(cVar);
    }

    public boolean Y4(r14 r14Var) {
        if (u(r14Var)) {
            return true;
        }
        j14 a1 = r14Var.a1();
        return a1 != null && A(a1);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: Z */
    public j14 F2() {
        Integer X3 = X3();
        if (X3 == null) {
            return null;
        }
        return o0(X3.intValue(), false);
    }

    @Override // com.p7700g.p99005.p14
    public b Z0() {
        return O0().Z0();
    }

    @Override // com.p7700g.p99005.z04
    public int Z1() {
        return n14.v5(Z0());
    }

    public boolean Z4(j14 j14Var, j14 j14Var2) {
        return O0().O6(j14Var.O0(), j14Var2.O0());
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: a0 */
    public abstract j14 m();

    public abstract j14[] a5(j14... j14VarArr) throws r04;

    @Override // com.p7700g.p99005.n04
    /* renamed from: b0 */
    public abstract j14 o();

    public abstract j14[] b5(j14... j14VarArr) throws r04;

    public void c1(e14 e14Var) {
        if (e14Var instanceof f14) {
            this.S = (f14) e14Var;
            this.N = new r14(this.S.toString(), this, this.S.F.L);
        } else if (e14Var instanceof r14) {
            this.N = (r14) e14Var;
        }
    }

    public boolean c5(j14 j14Var) {
        if (j14Var == this) {
            return true;
        }
        return O0().R6(j14Var.O0());
    }

    public void d1(String str) {
        O0().h5(str);
    }

    public j14 d5() {
        return (C0() && K3().intValue() == A0()) ? t0() : this;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    public /* bridge */ /* synthetic */ j24 e0(int i) {
        return q24.a(this, i);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    public /* bridge */ /* synthetic */ k34 e0(int i) {
        return q24.b(this, i);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    public /* bridge */ /* synthetic */ m34 e0(int i) {
        return q24.c(this, i);
    }

    public void e4(StringBuilder sb, String str, p54 p54Var) {
        O0().S5(sb, str, p54Var);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: e5 */
    public abstract j14 n0();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Iterable<? extends j14> f0();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: f5 */
    public abstract j14 v0(boolean z);

    @Override // com.p7700g.p99005.z04
    public int g1() {
        return n14.z5(Z0());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.l24
    public int g3() {
        return O0().g3();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: g5 */
    public abstract j14 d0(boolean z);

    @Override // com.p7700g.p99005.v24
    public boolean h4(j14 j14Var) {
        return super.K2(j14Var);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: h5 */
    public abstract j14 c0();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: i5 */
    public abstract j14 k0();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract Iterator<? extends j14> iterator();

    @Override // com.p7700g.p99005.p14
    public Iterator<? extends j14> j1() {
        return S2(G2());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: j5 */
    public abstract j14 s0();

    @Override // com.p7700g.p99005.p14
    public String k1() throws t14 {
        return O0().k1();
    }

    public boolean k3(j14 j14Var) {
        if (j14Var == this) {
            return true;
        }
        return O0().p5(j14Var.O0());
    }

    @Override // com.p7700g.p99005.p14
    public Stream<? extends j14> k4() {
        return O1(G2());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: k5 */
    public abstract j14 h0(int i);

    @Override // com.p7700g.p99005.p14
    public String l2() {
        return O0().l2();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: l5 */
    public abstract j14 o0(int i, boolean z);

    @Override // com.p7700g.p99005.q04
    public abstract l14<?, ?, ?, ?, ?> m0();

    public abstract j14 m5(int i, boolean z, boolean z2);

    public abstract j14 n3(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.p14
    public boolean o4() {
        return O0().o4();
    }

    public List<? extends p14> o5(boolean z) {
        return n5(this, z);
    }

    public abstract j14 p3(j14 j14Var) throws r04;

    public abstract j14[] p5(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.p14
    public BigInteger q1() {
        return O0().q1();
    }

    @Override // com.p7700g.p99005.p14
    public String q2(boolean z) throws t14 {
        return O0().q2(z);
    }

    @Override // com.p7700g.p99005.p14
    public boolean q3() {
        return O0().q3();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.p14
    /* renamed from: q4 */
    public j14 P1() {
        Integer K3 = K3();
        return m0().E(K3 == null ? A0() : K3.intValue());
    }

    @Deprecated
    public abstract q14 q5(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.p14
    public boolean r1(int i) {
        return O0().r1(i);
    }

    public abstract j14[] r5(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.p14
    public String s4() {
        return O0().s4();
    }

    public abstract j14[] s5(j14 j14Var) throws r04;

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract x44<? extends j14> spliterator();

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Stream<? extends j14> stream();

    public abstract s14 t3();

    @Override // com.p7700g.p99005.n04
    /* renamed from: t5 */
    public r14 N() {
        if (this.N == null) {
            this.N = new r14(U0(), this, t3());
        }
        return w3();
    }

    @Override // com.p7700g.p99005.n04
    public boolean u(e14 e14Var) {
        e14 e14Var2 = this.N;
        if (e14Var2 == null || !(e14Var instanceof r14)) {
            return false;
        }
        r14 r14Var = (r14) e14Var2;
        r14 r14Var2 = (r14) e14Var;
        return r14Var == r14Var2 || (r14Var.v.equals(r14Var2.v) && r14Var.u == r14Var2.u);
    }

    @Override // com.p7700g.p99005.z04
    public int u2() {
        return n14.u5(Z0());
    }

    public i54 u5() {
        return O0().j7();
    }

    public String[] v5() {
        return u5().a();
    }

    public abstract j14 w0(j14 j14Var) throws r04, t14;

    public r14 w3() {
        return (r14) this.N;
    }

    public o34[] w4(m14.c cVar) {
        return new o34[]{O0()};
    }

    public f14 w5() {
        f14 f14Var = this.T;
        if (f14Var == null) {
            if (!z3()) {
                InetAddress C5 = C5();
                String canonicalHostName = C5.getCanonicalHostName();
                if (canonicalHostName.equals(C5.getHostAddress())) {
                    f14 f14Var2 = new f14(canonicalHostName, new u64(canonicalHostName, x4()));
                    f14Var2.D = this;
                    return f14Var2;
                }
                return new f14(canonicalHostName);
            }
            throw new t14(this, "ipaddress.error.unavailable.numeric");
        }
        return f14Var;
    }

    @Override // com.p7700g.p99005.n04
    public abstract boolean x();

    public abstract j14 x0(j14 j14Var, boolean z) throws r04, t14;

    @Override // com.p7700g.p99005.p14
    public String x2() {
        return O0().x2();
    }

    public o64 x4() {
        if (C0()) {
            if (!m0().i().g() && I0()) {
                return n64.C(this, U5(true).t0());
            }
            return n64.C(this, t0());
        }
        return n64.C(this, this);
    }

    public String x5() {
        return E0();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract x44<? extends j14> y0();

    @Override // com.p7700g.p99005.p14
    public abstract x44<? extends j14> y2(int i);

    @Override // com.p7700g.p99005.p14
    public abstract Iterator<? extends j14> z1();

    @Override // com.p7700g.p99005.v24
    public abstract q14 z2();

    public f14 z5() {
        f14 f14Var = this.S;
        if (f14Var == null) {
            f14 w5 = w5();
            this.S = w5;
            return w5;
        }
        return f14Var;
    }

    public j14(Function<n04, v04> function) {
        super(function);
    }

    @Override // com.p7700g.p99005.z04
    public m14 J0(int i, int i2) {
        return O0().J0(i, i2);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    public m14 O0() {
        return (m14) super.O0();
    }

    @Override // com.p7700g.p99005.z04
    public m14 z0(int i) {
        return O0().z0(i);
    }
}