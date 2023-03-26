package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.i34;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.o04;
import com.p7700g.p99005.q14;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.w64;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* compiled from: IPAddressSection.java */
/* loaded from: classes3.dex */
public abstract class m14 extends i34 implements p14, v04 {
    private static final long I = 4;
    private static final o34[] J = new o34[0];
    public static final Comparator<? super p14> K = nz3.s;
    private static final o04.b L = new o04.b(true, false, true);
    private static final o04.b M = new o04.b(true, true, true);
    private transient f N;
    private transient BigInteger O;

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class a<S extends e24> extends b<S, S> implements x44<S> {
        public a(S s, Predicate<q14.g<S, S>> predicate, h<S, S> hVar, ToLongFunction<S> toLongFunction) {
            super(s, predicate, hVar, toLongFunction);
        }

        @Override // com.p7700g.p99005.m14.b
        /* renamed from: s */
        public a<S> r(S s, boolean z, Function<S, BigInteger> function, Predicate<S> predicate, ToLongFunction<S> toLongFunction) {
            return new a<>(s, this.t, (h) this.k, z, function, predicate, toLongFunction);
        }

        @Override // com.p7700g.p99005.g24.a, com.p7700g.p99005.w24, com.p7700g.p99005.v44, java.util.Spliterator
        /* renamed from: t */
        public a<S> trySplit() {
            return (a) super.trySplit();
        }

        public a(S s, Predicate<q14.g<S, S>> predicate, h<S, S> hVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            super(s, predicate, hVar, function, predicate2, toLongFunction);
        }

        public a(S s, Predicate<q14.g<S, S>> predicate, h<S, S> hVar, boolean z, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            super(s, predicate, hVar, z, function, predicate2, toLongFunction);
        }
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class c {
        public static final int a = 1;
        public static final int b = 16;
        public static final int c = 48;
        public static final int d = 112;
        public final int e;

        public c() {
            this(1);
        }

        public boolean a(int i) {
            return (this.e & i) == i;
        }

        public boolean b(int i) {
            return (i & this.e) != 0;
        }

        public String toString() {
            Field[] fields;
            int i;
            TreeMap treeMap = new TreeMap();
            for (Field field : getClass().getFields()) {
                int modifiers = field.getModifiers();
                if (Modifier.isFinal(modifiers) && Modifier.isStatic(modifiers)) {
                    try {
                        treeMap.put(Integer.valueOf(field.getInt(null)), field.getName() + ": " + a(i) + System.lineSeparator());
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
            Collection<String> values = treeMap.values();
            StringBuilder sb = new StringBuilder();
            for (String str : values) {
                sb.append(str);
            }
            return sb.toString();
        }

        public c(int i) {
            this.e = i;
        }
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class d extends f34.m {
        public static final e d;
        public static final e e;
        public static final e f;
        public static final e g;
        public static final e h;
        public static final e i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;

        static {
            l lVar = new l(l.a.ALL);
            d = new e.a(16).f(null).b(true).u(lVar).j();
            e = new e.a(16).f(null).b(true).u(lVar).a(n04.t).j();
            f = new e.a(8).f(null).b(true).u(lVar).j();
            g = new e.a(8).f(null).b(true).u(lVar).a("0").j();
            h = new e.a(2).f(null).b(true).u(lVar).j();
            i = new e.a(10, gl4.R).j();
        }
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class e extends f34.n {
        public final String k;
        public final l.a l;
        public final char m;

        /* compiled from: IPAddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends f34.n.a {
            public String k;
            public l.a l;
            public char m;

            public a(int i) {
                this(i, gl4.R);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: k */
            public a a(String str) {
                return (a) super.a(str);
            }

            public a l(String str) {
                this.k = str;
                return this;
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: m */
            public a b(boolean z) {
                return (a) super.b(z);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: n */
            public a c(int i) {
                return (a) super.c(i);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: o */
            public a d(boolean z) {
                return (a) super.d(z);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: p */
            public a e(String str) {
                return (a) super.e(str);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: q */
            public a f(Character ch) {
                return (a) super.f(ch);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: r */
            public a g(boolean z) {
                return (a) super.g(z);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: s */
            public a h(boolean z) {
                return (a) super.h(z);
            }

            public a t(l.a aVar) {
                this.l = aVar;
                return this;
            }

            public a u(l lVar) {
                t(lVar.a);
                return i(lVar.b);
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: v */
            public a i(f34.n.b bVar) {
                return (a) super.i(bVar);
            }

            public a w(char c) {
                this.m = c;
                return this;
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: x */
            public e j() {
                return new e(this.d, this.c, this.l, this.b, this.e, this.f, this.m, this.g, this.k, this.h, this.i, this.j);
            }

            public a(int i, char c) {
                super(i, c);
                this.k = "";
                this.l = l.a.NETWORK_ONLY;
                this.m = '%';
            }
        }

        public e(int i, boolean z, l.a aVar, f34.n.b bVar, String str, Character ch, char c, String str2, String str3, boolean z2, boolean z3, boolean z4) {
            super(i, z, bVar, str, ch, str2, z2, z3, z4);
            this.k = str3;
            this.l = aVar;
            this.m = c;
        }
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class f {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;
        private Boolean e;
    }

    /* compiled from: IPAddressSection.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface g<R, S> {
        S a(R r, int i);
    }

    /* compiled from: IPAddressSection.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface h<S, T> extends g24.d<S, T> {
    }

    /* compiled from: IPAddressSection.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface i {
        p14 a(p14 p14Var, int i, int i2, int i3);
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class j {
        public int a;
        public int b;
        public int c;
        public p14[] d;
        public int[] e;
        public p14 f;
        public p14 g;
        public int h;
        public int i;

        public j(int i) {
            this.c = i * 2;
        }

        public boolean a() {
            int i = this.b;
            if (i <= 0) {
                return false;
            }
            p14[] p14VarArr = this.d;
            int[] iArr = this.e;
            int i2 = i - 1;
            this.i = iArr[i2];
            this.g = p14VarArr[i2];
            int i3 = i2 - 1;
            this.h = iArr[i3];
            this.f = p14VarArr[i3];
            this.b = i3;
            return true;
        }

        public void b(p14 p14Var, p14 p14Var2, int i, int i2) {
            int i3 = this.b;
            if (i3 >= this.a) {
                c();
            }
            p14[] p14VarArr = this.d;
            int[] iArr = this.e;
            p14VarArr[i3] = p14Var;
            int i4 = i3 + 1;
            iArr[i3] = i;
            p14VarArr[i4] = p14Var2;
            iArr[i4] = i2;
            this.b = i4 + 1;
        }

        public void c() {
            int i = this.a;
            int i2 = i == 0 ? this.c : i << 1;
            p14[] p14VarArr = new p14[i2];
            int[] iArr = new int[i2];
            int i3 = this.b;
            if (i3 > 0) {
                System.arraycopy(this.d, 0, p14VarArr, 0, i3);
                System.arraycopy(this.e, 0, iArr, 0, this.b);
            }
            this.d = p14VarArr;
            this.e = iArr;
            this.a = i2;
        }
    }

    /* compiled from: IPAddressSection.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface k<R, S> {
        S a(R r, R r2, R r3);
    }

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class l {
        public final a a;
        public final f34.n.b b;

        /* compiled from: IPAddressSection.java */
        /* loaded from: classes3.dex */
        public enum a {
            NETWORK_ONLY,
            ALL
        }

        public l() {
            this(a.NETWORK_ONLY);
        }

        public l(a aVar) {
            this(aVar, new f34.n.b());
        }

        public l(a aVar, f34.n.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }
    }

    public m14(n14[] n14VarArr, boolean z, boolean z2) {
        super(z ? (h34[]) n14VarArr.clone() : n14VarArr, z2);
        if (z2) {
            l14<?, ?, ?, ?, ?> m0 = m0();
            Integer num = null;
            int u2 = u2();
            int i2 = 0;
            while (i2 < n14VarArr.length) {
                n14 n14Var = n14VarArr[i2];
                if (m0.m(n14Var.m0())) {
                    Integer D5 = n14Var.D5();
                    if (num == null) {
                        if (D5 != null) {
                            this.z = b(f34.k3(u2, D5.intValue(), i2));
                        }
                    } else if (D5 == null || D5.intValue() != 0) {
                        throw new u14(n14VarArr[i2 - 1], n14Var, D5);
                    }
                    i2++;
                    num = D5;
                } else {
                    throw new x14(n14Var);
                }
            }
            if (num == null) {
                this.z = g24.t;
            }
        }
    }

    /* renamed from: A6 */
    public /* synthetic */ int B6(int i2, int i3, int i4, int i5) {
        if (i5 == i2) {
            n14 D0 = D0(i5);
            int A0 = D0.A0() - f34.p3(i3, i4, i5).intValue();
            return ((D0.h3() >>> A0) - (D0.B1() >>> A0)) + 1;
        }
        return D0(i5).c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends j14, R extends m14, S extends n14> R C5(R r, int i2, int i3, l14.c<T, R, ?, S, ?> cVar, g<Integer, S> gVar) {
        if (i2 >= 0 && i2 <= r.A0()) {
            if (r.f6(i2)) {
                return r;
            }
            int V0 = r.V0();
            n14[] n14VarArr = (n14[]) cVar.d(i3);
            if (i3 > 0) {
                int u2 = r.u2();
                int i4 = i3 - 1;
                int i5 = V0 - 1;
                while (i4 >= 0) {
                    n14VarArr[i4] = gVar.a(f34.p3(u2, i2, i5), i5);
                    i4--;
                    i5--;
                }
            }
            return (R) cVar.u(n14VarArr);
        }
        throw new y14(r, i2);
    }

    public static /* synthetic */ int C6(g gVar, m14 m14Var, int i2) {
        return ((n14) gVar.a(m14Var, i2)).B1();
    }

    public static /* synthetic */ n14 D6(g gVar, m14 m14Var, int i2) {
        return (n14) gVar.a(m14Var, i2);
    }

    public static /* synthetic */ int E6(g gVar, m14 m14Var, m14 m14Var2, int i2) {
        return ((n14) gVar.a(m14Var2, i2)).B1() | ((n14) gVar.a(m14Var, i2)).B1();
    }

    public static /* synthetic */ int F6(g gVar, m14 m14Var, int i2) {
        return ((n14) gVar.a(m14Var, i2)).B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <R extends m14, S extends n14> R G5(R r, l14.c<?, R, ?, S, ?> cVar, Supplier<Iterator<S[]>> supplier, IntFunction<S> intFunction, boolean z, boolean z2) {
        n14[] n14VarArr;
        boolean z3;
        m14 u;
        Integer K3;
        if (z && z2 && r.o4()) {
            Iterator<S[]> it = supplier.get();
            if (!it.hasNext()) {
                z3 = false;
                n14VarArr = null;
                if (z3) {
                    return null;
                }
                if (!r.m0().i().f() && (K3 = r.K3()) != null) {
                    u = cVar.t(n14VarArr, K3, true);
                } else {
                    u = cVar.u(n14VarArr);
                }
                return (R) u;
            }
            n14VarArr = it.next();
        } else {
            n14VarArr = (n14[]) f34.c1(r, cVar, intFunction);
        }
        z3 = true;
        if (z3) {
        }
    }

    public static /* synthetic */ n14 G6(g gVar, m14 m14Var, int i2) {
        return (n14) gVar.a(m14Var, i2);
    }

    public static List<p14> H5(p14[] p14VarArr) {
        int n3;
        int i3;
        int B1;
        int i2;
        ArrayList arrayList = new ArrayList(p14VarArr.length << 3);
        if (Q6(p14VarArr, arrayList)) {
            return arrayList;
        }
        o04.b bVar = L;
        o04.b bVar2 = M;
        p14 p14Var = p14VarArr[0];
        int A0 = p14Var.A0();
        int u2 = p14Var.u2();
        int Z1 = p14Var.Z1();
        int size = arrayList.size() - 1;
        int i4 = size - 1;
        int i5 = 0;
        while (size > 0) {
            p14 p14Var2 = (p14) arrayList.get(i4);
            p14 p14Var3 = (p14) arrayList.get(size);
            if (bVar2.g(p14Var2, p14Var3) > 0) {
                i5++;
                int i6 = size + 1;
                while (i6 < arrayList.size() && arrayList.get(i6) == null) {
                    i6++;
                }
                if (i6 < arrayList.size()) {
                    arrayList.set(size, (p14) arrayList.get(i6));
                    arrayList.set(i6, null);
                } else {
                    arrayList.set(size, null);
                    int i7 = i4;
                    i4--;
                    size = i7;
                }
            } else {
                if (bVar.g(p14Var2, p14Var3) >= 0) {
                    i5++;
                    arrayList.set(i4, p14Var3);
                    arrayList.set(size, null);
                } else {
                    Integer L0 = p14Var2.L0();
                    if (Objects.equals(L0, p14Var3.L0())) {
                        int intValue = L0 == null ? A0 - 1 : L0.intValue() - 1;
                        if (intValue == 0) {
                            n3 = 0;
                            i3 = 0;
                        } else {
                            n3 = n3(intValue, Z1, u2);
                            i3 = i3(intValue, Z1, u2);
                        }
                        n14 D0 = p14Var2.D0(n3);
                        n14 D02 = p14Var3.D0(n3);
                        int B12 = D0.B1();
                        int B13 = D02.B1();
                        int i8 = u2 - 1;
                        if (i3 == n3) {
                            int i9 = i8 - (intValue % u2);
                            i2 = B12 >>> i9;
                            B1 = B13 >>> i9;
                        } else {
                            int B14 = p14Var2.D0(i3).B1();
                            B1 = (B13 << 1) | (p14Var3.D0(i3).B1() >>> i8);
                            i2 = (B12 << 1) | (B14 >>> i8);
                        }
                        if (i2 == B1 || (i2 ^ 1) == B1) {
                            int i10 = n3 - 1;
                            while (true) {
                                if (i10 >= 0) {
                                    if (p14Var2.D0(i10).B1() != p14Var3.D0(i10).B1()) {
                                        break;
                                    }
                                    i10--;
                                } else {
                                    arrayList.set(i4, p14Var3.i4(intValue));
                                    i5++;
                                    int i11 = size + 1;
                                    while (i11 < arrayList.size() && arrayList.get(i11) == null) {
                                        i11++;
                                    }
                                    if (i11 < arrayList.size()) {
                                        arrayList.set(size, (p14) arrayList.get(i11));
                                        arrayList.set(i11, null);
                                    } else {
                                        arrayList.set(size, null);
                                    }
                                }
                            }
                        }
                        size = i4;
                        i4--;
                    }
                }
                int i72 = i4;
                i4--;
                size = i72;
            }
        }
        if (i5 > 0) {
            int size2 = arrayList.size() - i5;
            int i12 = 0;
            int i13 = 0;
            while (i12 < size2) {
                int i14 = i13;
                while (arrayList.get(i14) == null) {
                    i14++;
                }
                if (i12 != i14) {
                    arrayList.set(i12, (p14) arrayList.get(i14));
                }
                i12++;
                i13 = i14 + 1;
            }
            int size3 = arrayList.size();
            while (true) {
                int i15 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                size3--;
                arrayList.remove(size3);
                i5 = i15;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int H6(p14 p14Var, p14 p14Var2) {
        int compareTo;
        Integer L0 = p14Var.L0();
        Integer L02 = p14Var2.L0();
        if (L0 == L02) {
            compareTo = 0;
        } else if (L0 == null) {
            compareTo = -1;
        } else {
            compareTo = L02 == null ? 1 : L02.compareTo(L0);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        if (L0 == null || L0.intValue() != 0) {
            int V0 = L0 == null ? p14Var.V0() - 1 : n3(L0.intValue(), p14Var.Z1(), p14Var.u2());
            int V02 = L0 == null ? p14Var.V0() : i3(L0.intValue(), p14Var.Z1(), p14Var.u2());
            for (int i2 = 0; i2 < V02; i2++) {
                n14 D0 = p14Var.D0(i2);
                n14 D02 = p14Var2.D0(i2);
                compareTo = (D0.h3() - D0.B1()) - (D02.h3() - D02.B1());
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            for (int i3 = 0; i3 <= V0; i3++) {
                compareTo = p14Var.D0(i3).B1() - p14Var2.D0(i3).B1();
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        }
        return compareTo;
    }

    public static List<p14> I5(p14[] p14VarArr, i iVar) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList(p14VarArr.length << 1);
        if (P6(p14VarArr, arrayList)) {
            arrayList.set(0, ((p14) arrayList.get(0)).t0());
            return arrayList;
        }
        o04.b bVar = L;
        o04.b bVar2 = M;
        int size = arrayList.size() - 1;
        int i4 = size - 1;
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int i7 = -1;
            while (size > 0) {
                p14 p14Var = (p14) arrayList.get(i4);
                p14 p14Var2 = (p14) arrayList.get(size);
                if (bVar2.g(p14Var, p14Var2) > 0) {
                    i5++;
                    i2 = size + 1;
                    while (i2 < arrayList.size() && arrayList.get(i2) == null) {
                        i2++;
                    }
                    if (i2 < arrayList.size()) {
                        break;
                    }
                    arrayList.set(size, null);
                } else if (bVar.g(p14Var, p14Var2) >= 0) {
                    i5++;
                    arrayList.set(i4, p14Var2);
                    arrayList.set(size, null);
                } else {
                    if (i6 < 0) {
                        i6 = p14Var.G2();
                    }
                    if (i7 < 0) {
                        i7 = p14Var2.G2();
                    }
                    if (i6 == i7) {
                        n14 D0 = p14Var.D0(i6);
                        n14 D02 = p14Var2.D0(i6);
                        int B1 = D02.B1();
                        int h3 = D0.h3();
                        if (h3 >= B1 || h3 + 1 == B1) {
                            for (int i8 = i6 - 1; i8 >= 0; i8--) {
                                if (p14Var.D0(i8).B1() == p14Var2.D0(i8).B1()) {
                                }
                            }
                            p14 a2 = iVar.a(p14Var, i6, D0.B1(), Math.max(h3, D02.h3()));
                            arrayList.set(i4, a2);
                            if (a2.D0(i6).H0()) {
                                if (i6 == 0) {
                                    arrayList.clear();
                                    arrayList.add(a2);
                                    return arrayList;
                                }
                                i6--;
                            }
                            i5++;
                            int i9 = size + 1;
                            while (i9 < arrayList.size() && arrayList.get(i9) == null) {
                                i9++;
                            }
                            if (i9 < arrayList.size()) {
                                arrayList.set(size, (p14) arrayList.get(i9));
                                arrayList.set(i9, null);
                                i3 = -1;
                            } else {
                                arrayList.set(size, null);
                                size = i4;
                                i4--;
                                i3 = i6;
                                i6 = -1;
                            }
                            i7 = i3;
                        }
                        size = i4;
                        i6 = -1;
                        i4--;
                    }
                }
                i7 = i6;
                i6 = -1;
                int i10 = i4;
                i4--;
                size = i10;
            }
            if (i5 > 0) {
                int size2 = arrayList.size() - i5;
                int i11 = 0;
                int i12 = 0;
                while (i11 < size2) {
                    while (arrayList.get(i12) == null) {
                        i12++;
                    }
                    arrayList.set(i11, ((p14) arrayList.get(i12)).t0());
                    i11++;
                    i12++;
                }
                int size3 = arrayList.size();
                while (true) {
                    int i13 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    size3--;
                    arrayList.remove(size3);
                    i5 = i13;
                }
            } else {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    arrayList.set(i14, ((p14) arrayList.get(i14)).t0());
                }
            }
            return arrayList;
            arrayList.set(size, (p14) arrayList.get(i2));
            arrayList.set(i2, null);
        }
    }

    public static /* synthetic */ g34[] I6(int i2) {
        return new g34[i2];
    }

    public static /* synthetic */ g34[] J6(int i2) {
        return new g34[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends j14, R extends m14, S extends n14> R K5(R r, int i2, boolean z, l14.c<T, R, ?, S, ?> cVar, g<Integer, S> gVar) {
        if (i2 >= 0 && i2 <= r.A0()) {
            if (r.j6(i2, z)) {
                return r;
            }
            int u2 = r.u2();
            int L5 = r.L5(i2);
            n14[] n14VarArr = (n14[]) cVar.d(L5);
            for (int i3 = 0; i3 < L5; i3++) {
                n14VarArr[i3] = gVar.a(x3(u2, b(i2), i3), i3);
            }
            return (R) cVar.u(n14VarArr);
        }
        throw new y14(r, i2);
    }

    public static /* synthetic */ g34[] K6(int i2) {
        return new g34[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R extends m14, S extends n14> R M5(R r, Integer num, l14.c<?, R, ?, S, ?> cVar, boolean z, IntFunction<S> intFunction, IntUnaryOperator intUnaryOperator) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        IntFunction<S> intFunction2 = intFunction;
        IntUnaryOperator intUnaryOperator2 = intUnaryOperator;
        if (num != null && (num.intValue() < 0 || num.intValue() > r.A0())) {
            throw new y14(r, num.intValue());
        }
        int u2 = r.u2();
        int V0 = r.V0();
        boolean f2 = r.m0().i().f();
        int i9 = 0;
        while (i9 < V0) {
            Integer x3 = x3(u2, num, i9);
            S apply = intFunction2.apply(i9);
            int applyAsInt = intUnaryOperator2.applyAsInt(i9);
            int B1 = apply.B1();
            int h3 = apply.h3();
            if (z) {
                if (f2 && x3 != null) {
                    applyAsInt &= apply.C5(x3.intValue());
                }
                long j2 = B1;
                long j3 = h3;
                i2 = u2;
                i3 = V0;
                long j4 = applyAsInt;
                w64.c y4 = n14.y4(j2, j3, j4, apply.I4());
                if (y4.M0()) {
                    i4 = (int) y4.a(j2, j4);
                    i5 = (int) y4.b(j3, j4);
                } else {
                    throw new t14(apply, "ipaddress.error.maskMismatch");
                }
            } else {
                i2 = u2;
                i3 = V0;
                i4 = B1 | applyAsInt;
                i5 = h3 | applyAsInt;
            }
            if (apply.J5(i4, i5, x3)) {
                n14[] n14VarArr = (n14[]) cVar.d(r.V0());
                r.m3(0, i9, n14VarArr, 0);
                n14VarArr[i9] = (n14) cVar.c(i4, i5, x3);
                if (!f2 || x3 == null) {
                    int i10 = i3;
                    while (true) {
                        i9++;
                        if (i9 >= i10) {
                            break;
                        }
                        Integer x32 = x3(i2, num, i9);
                        S apply2 = intFunction.apply(i9);
                        int applyAsInt2 = intUnaryOperator.applyAsInt(i9);
                        int B12 = apply2.B1();
                        int h32 = apply2.h3();
                        if (z) {
                            if (f2 && x32 != null) {
                                applyAsInt2 &= apply2.C5(x32.intValue());
                            }
                            i6 = i10;
                            long j5 = B12;
                            long j6 = h32;
                            long j7 = applyAsInt2;
                            w64.c y42 = n14.y4(j5, j6, j7, apply2.I4());
                            if (y42.M0()) {
                                i7 = (int) y42.a(j5, j7);
                                i8 = (int) y42.b(j6, j7);
                            } else {
                                throw new t14(apply2, "ipaddress.error.maskMismatch");
                            }
                        } else {
                            i6 = i10;
                            i7 = B12 | applyAsInt2;
                            i8 = h32 | applyAsInt2;
                        }
                        if (apply2.J5(i7, i8, x32)) {
                            n14VarArr[i9] = (n14) cVar.c(i7, i8, x32);
                        } else {
                            n14VarArr[i9] = apply2;
                        }
                        if (!f2 || x32 == null) {
                            i10 = i6;
                        } else {
                            int i11 = i9 + 1;
                            int i12 = i6;
                            if (i11 < i12) {
                                Arrays.fill(n14VarArr, i11, i12, (n14) cVar.e(0, b(0)));
                            }
                        }
                    }
                } else {
                    int i13 = i9 + 1;
                    int i14 = i3;
                    if (i13 < i14) {
                        Arrays.fill(n14VarArr, i13, i14, (n14) cVar.e(0, b(0)));
                    }
                }
                return (R) cVar.p(n14VarArr, num);
            }
            i9++;
            intUnaryOperator2 = intUnaryOperator;
            V0 = i3;
            u2 = i2;
            intFunction2 = intFunction;
        }
        return r;
    }

    public static boolean N3(s04<?> s04Var, s04<?> s04Var2) {
        return f34.N3(s04Var, s04Var2);
    }

    public static i34.c P4() {
        return i34.P4();
    }

    public static <R extends m14> R[] P5(R r, R r2, UnaryOperator<R> unaryOperator, UnaryOperator<R> unaryOperator2, Comparator<R> comparator, UnaryOperator<R> unaryOperator3, UnaryOperator<R> unaryOperator4, IntFunction<R[]> intFunction) {
        r.m5(r2);
        R[] rArr = (R[]) l5(r, r2, unaryOperator3, intFunction);
        if (rArr != null) {
            return rArr;
        }
        List list = (List) b5(r, r2, unaryOperator, unaryOperator2, comparator, unaryOperator4, mz3.a);
        return (R[]) ((m14[]) list.toArray(intFunction.apply(list.size())));
    }

    private static boolean P6(p14[] p14VarArr, List<p14> list) {
        for (p14 p14Var : p14VarArr) {
            if (p14Var != null) {
                if (p14Var.M0()) {
                    list.add(p14Var);
                } else {
                    Iterator<? extends p14> j1 = p14Var.j1();
                    while (j1.hasNext()) {
                        list.add(j1.next());
                    }
                }
            }
        }
        if (list.size() == 1) {
            return true;
        }
        list.sort(n04.H);
        return false;
    }

    public static i34.c Q4(int i2, int i3) {
        return i34.Q4(i2, i3);
    }

    public static <R extends m14, S extends n14> R[] Q5(R r, R r2, UnaryOperator<R> unaryOperator, UnaryOperator<R> unaryOperator2, Comparator<R> comparator, UnaryOperator<R> unaryOperator3, final l14.c<?, R, ?, S, ?> cVar) {
        Objects.requireNonNull(cVar);
        R[] rArr = (R[]) o5(r, r2, unaryOperator3, new IntFunction() { // from class: com.p7700g.p99005.k04
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return l14.c.this.W3(i2);
            }
        });
        if (rArr != null) {
            return rArr;
        }
        List list = (List) b5(r, r2, unaryOperator, unaryOperator2, comparator, unaryOperator3, new k() { // from class: com.p7700g.p99005.wz3
            @Override // com.p7700g.p99005.m14.k
            public final Object a(Object obj, Object obj2, Object obj3) {
                m14 m14Var = (m14) obj;
                m14 m14Var2 = (m14) obj2;
                m14 m14Var3 = (m14) obj3;
                return Objects.requireNonNull(l14.c.this);
            }
        });
        return (R[]) ((m14[]) list.toArray(cVar.W3(list.size())));
    }

    private static boolean Q6(p14[] p14VarArr, List<p14> list) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < p14VarArr.length; i2++) {
            p14 p14Var = p14VarArr[i2];
            if (p14Var != null) {
                if (!p14Var.M0()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(p14VarArr.length);
                        for (int i3 = 0; i3 < i2; i3++) {
                            p14 p14Var2 = p14VarArr[i3];
                            if (p14Var2 != null) {
                                arrayList.add(p14Var2);
                            }
                        }
                    }
                    Iterator<? extends p14> j1 = p14Var.j1();
                    while (j1.hasNext()) {
                        arrayList.add(j1.next());
                    }
                } else if (arrayList != null) {
                    arrayList.add(p14Var);
                }
            }
        }
        if (arrayList == null) {
            for (p14 p14Var3 : p14VarArr) {
                if (p14Var3 != null) {
                    if (p14Var3.b1()) {
                        list.add(p14Var3);
                    } else {
                        for (p14 p14Var4 : p14Var3.i1()) {
                            list.add(p14Var4);
                        }
                    }
                }
            }
        } else {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                p14 p14Var5 = (p14) arrayList.get(i4);
                if (p14Var5.b1()) {
                    list.add(p14Var5);
                } else {
                    for (p14 p14Var6 : p14Var5.i1()) {
                        list.add(p14Var6);
                    }
                }
            }
        }
        if (list.size() == 1) {
            return true;
        }
        list.sort(n04.H);
        return false;
    }

    private void T5(StringBuilder sb, String str, boolean z, p54 p54Var) {
        boolean z2 = false;
        if (z && z3()) {
            Iterator<? extends m14> it = iterator();
            sb.append('(');
            boolean z3 = false;
            while (it.hasNext()) {
                if (z3) {
                    sb.append(" OR ");
                } else {
                    z3 = true;
                }
                it.next().T5(sb, str, false, p54Var);
            }
            sb.append(')');
        } else if (V0() > 0) {
            i54 l7 = l7();
            if (l7.size() > 1) {
                sb.append('(');
            }
            boolean e6 = e6();
            Iterator<h54<?, ?>> it2 = l7.iterator();
            while (it2.hasNext()) {
                h54<?, ?> next = it2.next();
                if (z2) {
                    sb.append(" OR ");
                } else {
                    z2 = true;
                }
                r54<?, ?, S> a2 = next.a(e6, p54Var);
                sb.append('(');
                a2.b(sb, str).append(')');
            }
            if (l7.size() > 1) {
                sb.append(')');
            }
        }
    }

    public static <R extends m14, S extends n14> R T6(final R r, boolean z, l14.c<?, R, ?, S, ?> cVar, final g<R, S> gVar) throws t14 {
        if (r.C0()) {
            final R H = cVar.m0().H(z ? r.L0().intValue() : r.A0());
            return (R) V5(r, null, cVar, z, new IntFunction() { // from class: com.p7700g.p99005.tz3
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return m14.D6(m14.g.this, r, i2);
                }
            }, new IntUnaryOperator() { // from class: com.p7700g.p99005.xz3
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i2) {
                    return m14.C6(m14.g.this, H, i2);
                }
            }, false);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R extends m14, S extends n14> R V5(R r, Integer num, l14.c<?, R, ?, S, ?> cVar, boolean z, IntFunction<S> intFunction, IntUnaryOperator intUnaryOperator, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        IntFunction<S> intFunction2 = intFunction;
        IntUnaryOperator intUnaryOperator2 = intUnaryOperator;
        if (num != null && (num.intValue() < 0 || num.intValue() > r.A0())) {
            throw new y14(r, num.intValue());
        }
        int u2 = r.u2();
        int V0 = r.V0();
        boolean z4 = r.m0().i().f() && !z2;
        int i9 = 0;
        while (i9 < V0) {
            Integer x3 = x3(u2, num, i9);
            S apply = intFunction2.apply(i9);
            int applyAsInt = intUnaryOperator2.applyAsInt(i9);
            int B1 = apply.B1();
            int h3 = apply.h3();
            if (z) {
                if (z4 && x3 != null) {
                    applyAsInt |= apply.B5(x3.intValue());
                }
                long j2 = B1;
                i2 = u2;
                i3 = V0;
                long j3 = h3;
                long j4 = applyAsInt;
                w64.j W4 = n14.W4(j2, j3, j4, apply.I4());
                if (W4.M0()) {
                    i4 = (int) W4.a(j2, j4);
                    i5 = (int) W4.b(j3, j4);
                } else {
                    throw new t14(apply, "ipaddress.error.maskMismatch");
                }
            } else {
                i2 = u2;
                i3 = V0;
                i4 = B1 & applyAsInt;
                i5 = h3 & applyAsInt;
            }
            if (apply.J5(i4, i5, x3)) {
                n14[] n14VarArr = (n14[]) cVar.d(r.V0());
                r.m3(0, i9, n14VarArr, 0);
                n14VarArr[i9] = (n14) cVar.c(i4, i5, x3);
                if (!z4 || x3 == null) {
                    int i10 = i3;
                    int i11 = i9 + 1;
                    while (true) {
                        if (i11 >= i10) {
                            break;
                        }
                        int i12 = i2;
                        Integer x32 = x3(i12, num, i11);
                        S apply2 = intFunction2.apply(i11);
                        int applyAsInt2 = intUnaryOperator.applyAsInt(i11);
                        int B12 = apply2.B1();
                        int h32 = apply2.h3();
                        if (z) {
                            if (z4 && x32 != null) {
                                applyAsInt2 |= apply2.B5(x32.intValue());
                            }
                            i6 = i10;
                            long j5 = B12;
                            long j6 = h32;
                            z3 = z4;
                            long j7 = applyAsInt2;
                            w64.j W42 = n14.W4(j5, j6, j7, apply2.I4());
                            if (W42.M0()) {
                                i7 = (int) W42.a(j5, j7);
                                i8 = (int) W42.b(j6, j7);
                            } else {
                                throw new t14(apply2, "ipaddress.error.maskMismatch");
                            }
                        } else {
                            i6 = i10;
                            z3 = z4;
                            i7 = B12 & applyAsInt2;
                            i8 = h32 & applyAsInt2;
                        }
                        if (apply2.J5(i7, i8, x32)) {
                            n14VarArr[i11] = (n14) cVar.c(i7, i8, x32);
                        } else {
                            n14VarArr[i11] = apply2;
                        }
                        if (!z3 || x32 == null) {
                            i10 = i6;
                            i11++;
                            intFunction2 = intFunction;
                            i2 = i12;
                            z4 = z3;
                        } else {
                            int i13 = i11 + 1;
                            int i14 = i6;
                            if (i13 < i14) {
                                Arrays.fill(n14VarArr, i13, i14, (n14) cVar.e(0, b(0)));
                            }
                        }
                    }
                } else {
                    int i15 = i9 + 1;
                    int i16 = i3;
                    if (i15 < i16) {
                        Arrays.fill(n14VarArr, i15, i16, (n14) cVar.e(0, b(0)));
                    }
                }
                return (R) cVar.t(n14VarArr, num, z2);
            }
            i9++;
            intFunction2 = intFunction;
            V0 = i3;
            u2 = i2;
            z4 = z4;
            intUnaryOperator2 = intUnaryOperator;
        }
        return r;
    }

    private boolean Y5() {
        if (this.N == null) {
            synchronized (this) {
                if (this.N == null) {
                    this.N = new f();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private Integer Z6(Integer num) {
        if (num == null) {
            return this.N.b = g24.t;
        }
        this.N.b = num;
        this.N.a = g24.t;
        return num;
    }

    public static <R extends m14, S extends n14> m14 a5(final R r, int i2, boolean z, l14.c<?, R, ?, S, ?> cVar, final g<R, S> gVar) throws t14 {
        if (i2 == 0 && r.C0()) {
            return r;
        }
        int D1 = r.D1(i2, false, false);
        if (D1 > r.A0()) {
            if (r.C0()) {
                final R H = cVar.m0().H(z ? r.L0().intValue() : r.A0());
                return V5(r, null, cVar, z, new IntFunction() { // from class: com.p7700g.p99005.lz3
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i3) {
                        return m14.u6(m14.g.this, r, i3);
                    }
                }, new IntUnaryOperator() { // from class: com.p7700g.p99005.vz3
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i3) {
                        return m14.v6(m14.g.this, H, i3);
                    }
                }, false);
            }
            return r;
        }
        return r.o0(D1 >= 0 ? D1 : 0, z);
    }

    private Integer a7(Integer num) {
        if (num == null) {
            return this.N.a = g24.t;
        }
        this.N.a = num;
        this.N.b = g24.t;
        return num;
    }

    public static Integer b(int i2) {
        return f34.b(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R extends p14, OperatorResult> OperatorResult b5(R r, R r2, UnaryOperator<R> unaryOperator, UnaryOperator<R> unaryOperator2, Comparator<R> comparator, Function<R, R> function, k<R, OperatorResult> kVar) {
        p14 p14Var;
        p14 p14Var2;
        boolean z;
        p14 p14Var3;
        boolean z2 = false;
        boolean z3 = true;
        if (r.equals(r2)) {
            if (function == 0 || !r.C0()) {
                z2 = true;
                z3 = false;
                p14Var3 = r;
            } else if (r2.C0()) {
                p14Var3 = (p14) function.apply(r);
                z3 = false;
            } else {
                p14Var3 = r2;
            }
            p14Var2 = (p14) unaryOperator2.apply(p14Var3);
            p14Var = (p14) unaryOperator.apply(p14Var3);
        } else {
            p14 p14Var4 = (p14) unaryOperator.apply(r);
            p14Var = (p14) unaryOperator.apply(r2);
            p14 p14Var5 = (p14) unaryOperator2.apply(r);
            p14Var2 = (p14) unaryOperator2.apply(r2);
            if (comparator.compare(p14Var4, p14Var) > 0) {
                z = true;
                z3 = false;
            } else {
                p14Var = p14Var4;
                z = false;
            }
            if (comparator.compare(p14Var5, p14Var2) >= 0) {
                z2 = z3;
                p14Var2 = p14Var5;
                z = false;
            }
            if (function != 0) {
                p14Var = (p14) function.apply(p14Var);
                p14Var2 = (p14) function.apply(p14Var2);
            }
            z3 = z;
        }
        if (!z2) {
            r = z3 ? r2 : null;
        }
        return (OperatorResult) kVar.a(r, p14Var, p14Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends j14, R extends m14, S extends n14> R d6(R r, R r2, l14.c<T, R, ?, S, ?> cVar, IntFunction<S> intFunction, IntFunction<S> intFunction2) {
        r.m5(r2);
        Integer K3 = r.K3();
        Integer K32 = r2.K3();
        if (K3 != null) {
            if (K32 == null) {
                K3 = null;
            } else if (K32.intValue() > K3.intValue()) {
                K3 = K32;
            }
        }
        if (r2.y1(r)) {
            if (Objects.equals(K3, r.K3())) {
                return r;
            }
        } else if (!r.z3()) {
            return null;
        }
        if (r.y1(r2)) {
            if (Objects.equals(K3, r2.K3())) {
                return r2;
            }
        } else if (!r2.z3()) {
            return null;
        }
        int V0 = r.V0();
        for (int i2 = 0; i2 < V0; i2++) {
            n14 D0 = r.D0(i2);
            n14 D02 = r2.D0(i2);
            int B1 = D0.B1();
            int h3 = D0.h3();
            int B12 = D02.B1();
            int h32 = D02.h3();
            if (B12 > h3 || B1 > h32) {
                return null;
            }
        }
        n14[] n14VarArr = (n14[]) cVar.d(V0);
        for (int i3 = 0; i3 < V0; i3++) {
            S apply = intFunction.apply(i3);
            S apply2 = intFunction2.apply(i3);
            Integer x3 = x3(apply.A0(), K3, i3);
            if (apply.R1(apply2) && !apply2.K5(x3, false)) {
                n14VarArr[i3] = apply2;
            } else if (apply2.R1(apply) && !apply.K5(x3, false)) {
                n14VarArr[i3] = apply;
            } else {
                n14VarArr[i3] = (n14) cVar.c(Math.max(apply.B1(), apply2.B1()), Math.min(apply.h3(), apply2.h3()), x3);
            }
        }
        return (R) cVar.S3(n14VarArr);
    }

    public static <R extends m14, S extends n14> R e7(final R r, l14.c<?, R, ?, S, ?> cVar, int i2, boolean z, boolean z2, boolean z3, final g<R, S> gVar) throws t14 {
        int A0;
        final R H;
        final R y;
        Integer K3 = r.K3();
        if (K3 != null) {
            if (i2 == K3.intValue()) {
                return r;
            }
            if (z2 && i2 > K3.intValue()) {
                g24.d(r, i2);
                return r;
            }
        }
        g24.d(r, i2);
        l14<?, R, ?, S, ?> m0 = cVar.m0();
        IntUnaryOperator intUnaryOperator = null;
        if (m0.i().f()) {
            A0 = (K3 == null || i2 <= K3.intValue() || !z) ? i2 : K3.intValue();
        } else {
            if (K3 != null && z) {
                if (i2 > K3.intValue()) {
                    H = m0.H(K3.intValue());
                    y = m0.y(i2);
                } else {
                    H = m0.H(i2);
                    y = m0.y(K3.intValue());
                }
                intUnaryOperator = new IntUnaryOperator() { // from class: com.p7700g.p99005.iz3
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i3) {
                        return m14.E6(m14.g.this, H, y, i3);
                    }
                };
            }
            A0 = r.A0();
        }
        if (intUnaryOperator == null) {
            final R H2 = m0.H(A0);
            intUnaryOperator = new IntUnaryOperator() { // from class: com.p7700g.p99005.jz3
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    return m14.F6(m14.g.this, H2, i3);
                }
            };
        }
        return (R) V5(r, b(i2), cVar, true, new IntFunction() { // from class: com.p7700g.p99005.qz3
            @Override // java.util.function.IntFunction
            public final Object apply(int i3) {
                return m14.G6(m14.g.this, r, i3);
            }
        }, intUnaryOperator, z3);
    }

    public static int f5(j14.b bVar) {
        return n14.u5(bVar);
    }

    public static int g5(j14.b bVar) {
        return n14.u5(bVar);
    }

    public static List<p14> g7(p14 p14Var, p14 p14Var2) {
        ArrayList arrayList = new ArrayList();
        j jVar = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int V0 = p14Var.V0();
            int u2 = p14Var.u2();
            int i4 = 0;
            while (i3 < V0) {
                i4 = p14Var.D0(i3).B1() ^ p14Var2.D0(i3).B1();
                if (i4 != 0) {
                    break;
                }
                i2 += u2;
                i3++;
            }
            if (i4 == 0) {
                arrayList.add(p14Var.i4(p14Var.A0()));
            } else {
                boolean z = i4 == 1;
                if (z && i3 + 1 == V0) {
                    arrayList.add(p14Var.i4(p14Var.A0() - 1));
                } else {
                    int numberOfLeadingZeros = (Integer.numberOfLeadingZeros(i4) - (32 - u2)) + i2;
                    if (p14Var.N2(numberOfLeadingZeros) && p14Var2.r1(numberOfLeadingZeros)) {
                        arrayList.add(p14Var.i4(numberOfLeadingZeros));
                    } else {
                        p14 I2 = p14Var2.I2(numberOfLeadingZeros + 1);
                        p14 l0 = I2.l0(-1L);
                        if (z) {
                            i2 += u2;
                            i3++;
                        }
                        if (jVar == null) {
                            jVar = new j(128);
                        }
                        jVar.b(I2, p14Var2, i2, i3);
                        p14Var2 = l0;
                    }
                }
            }
            if (jVar == null || !jVar.a()) {
                break;
            }
            p14Var = jVar.f;
            p14Var2 = jVar.g;
            i2 = jVar.h;
            i3 = jVar.i;
        }
        return arrayList;
    }

    public static List<p14> h7(p14 p14Var, p14 p14Var2, i iVar) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList(8);
        int V0 = p14Var.V0();
        if (V0 == 0) {
            arrayList.add(p14Var);
            return arrayList;
        }
        p14 p14Var3 = p14Var;
        int u2 = p14Var.u2();
        ArrayDeque arrayDeque = null;
        j jVar = null;
        int i4 = 0;
        int i5 = 0;
        p14 p14Var4 = p14Var2;
        while (true) {
            n14 D0 = p14Var3.D0(i4);
            int i6 = i4 + 1;
            n14 D02 = p14Var4.D0(i4);
            int B1 = D0.B1();
            int B12 = D02.B1();
            i5 += u2;
            if (B1 != B12 || i6 >= V0) {
                if (B1 == B12) {
                    arrayList.add(p14Var3);
                    i2 = V0;
                } else {
                    boolean N2 = p14Var3.N2(i5);
                    boolean r1 = p14Var4.r1(i5);
                    i2 = V0;
                    if (N2) {
                        if (r1) {
                            arrayList.add(iVar.a(p14Var3, i4, B1, B12));
                        } else {
                            p14 I2 = p14Var4.I2(i5);
                            arrayList.add(iVar.a(p14Var3, i4, B1, I2.l0(-1L).D0(i4).B1()));
                            i4 = i6;
                            p14Var3 = I2;
                        }
                    } else if (r1) {
                        p14Var4 = p14Var3.d2(i5);
                        p14 l0 = p14Var4.l0(1L);
                        p14 a2 = iVar.a(l0, i4, l0.D0(i4).B1(), B12);
                        if (arrayDeque == null) {
                            arrayDeque = new ArrayDeque(8);
                        }
                        arrayDeque.addFirst(a2);
                        i4 = i6;
                    } else {
                        p14 I22 = p14Var4.I2(i5);
                        p14 l02 = I22.l0(-1L);
                        p14 d2 = p14Var3.d2(i5);
                        p14 l03 = d2.l0(1L);
                        if (l03.m4(l02) <= 0) {
                            p14 a3 = iVar.a(l03, i4, l03.D0(i4).B1(), l02.D0(i4).B1());
                            if (arrayDeque == null) {
                                i3 = 8;
                                arrayDeque = new ArrayDeque(8);
                            } else {
                                i3 = 8;
                            }
                            arrayDeque.addFirst(a3);
                        } else {
                            i3 = 8;
                        }
                        if (jVar == null) {
                            jVar = new j(i3);
                        }
                        jVar.b(I22, p14Var4, i5, i6);
                        i4 = i6;
                        p14Var4 = d2;
                    }
                    V0 = i2;
                }
                if (arrayDeque != null) {
                    while (true) {
                        p14 p14Var5 = (p14) arrayDeque.pollFirst();
                        if (p14Var5 == null) {
                            break;
                        }
                        arrayList.add(p14Var5);
                    }
                }
                if (jVar == null || !jVar.a()) {
                    break;
                }
                p14Var3 = jVar.f;
                p14Var4 = jVar.g;
                i5 = jVar.h;
                i4 = jVar.i;
                V0 = i2;
            } else {
                i4 = i6;
            }
        }
        return arrayList;
    }

    public static int i3(int i2, int i3, int i4) {
        return t64.c(i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Integer i5(boolean z) {
        int i2;
        int A0;
        int V0 = V0();
        if (V0 == 0) {
            return null;
        }
        int i3 = 0;
        int g1 = D0(0).g1();
        if (z) {
            i2 = 0;
        } else {
            i2 = g1;
            g1 = 0;
        }
        int i4 = 0;
        while (i3 < V0) {
            n14 D0 = D0(i3);
            if (D0.B1() != g1) {
                Integer j5 = D0.j5(z);
                if (j5 == null) {
                    return null;
                }
                A0 = j5.intValue() + i4;
                while (true) {
                    i3++;
                    if (i3 < V0) {
                        if (D0(i3).B1() != i2) {
                            return null;
                        }
                    }
                }
            } else {
                A0 = D0.A0() + i4;
            }
            i4 = A0;
            i3++;
        }
        return b(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends j14, R extends m14, S extends n14> R[] i7(R r, R r2, l14.c<T, R, ?, S, ?> cVar, IntFunction<S> intFunction, g<R, R> gVar) {
        int i2;
        r.m5(r2);
        Integer num = null;
        if (!r.z3()) {
            if (r2.y1(r)) {
                return null;
            }
            R[] W3 = cVar.W3(1);
            W3[0] = r;
            return W3;
        }
        int V0 = r.V0();
        for (int i3 = 0; i3 < V0; i3++) {
            n14 D0 = r.D0(i3);
            n14 D02 = r2.D0(i3);
            int B1 = D0.B1();
            int h3 = D0.h3();
            int B12 = D02.B1();
            int h32 = D02.h3();
            if (B12 > h3 || B1 > h32) {
                R[] W32 = cVar.W3(1);
                W32[0] = r;
                return W32;
            }
        }
        n14[] n14VarArr = (n14[]) cVar.d(V0);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < V0) {
            S apply = intFunction.apply(i4);
            n14 D03 = r2.D0(i4);
            int B13 = apply.B1();
            int h33 = apply.h3();
            int B14 = D03.B1();
            int h34 = D03.h3();
            if (B13 < B14) {
                i2 = i4;
                arrayList.add(w5(r, B13, B14 - 1, i2, cVar, intFunction, n14VarArr));
                if (h33 <= h34) {
                    n14VarArr[i2] = (n14) cVar.c(B14, h33, null);
                } else {
                    n14VarArr[i2] = (n14) cVar.c(B14, h34, null);
                    arrayList.add(w5(r, h34 + 1, h33, i2, cVar, intFunction, n14VarArr));
                }
            } else if (h33 <= h34) {
                if (apply.C0()) {
                    n14VarArr[i4] = (n14) cVar.c(B13, h33, num);
                } else {
                    n14VarArr[i4] = apply;
                }
                i2 = i4;
            } else {
                n14VarArr[i4] = (n14) cVar.c(B13, h34, num);
                i2 = i4;
                arrayList.add(w5(r, h34 + 1, h33, i4, cVar, intFunction, n14VarArr));
            }
            i4 = i2 + 1;
            num = null;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (r.C0()) {
            int intValue = r.K3().intValue();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                m14 m14Var = (m14) arrayList.get(i5);
                int A0 = m14Var.A0();
                int V02 = r.V0() - 1;
                int i6 = A0;
                while (true) {
                    if (V02 < 0) {
                        break;
                    }
                    n14 D04 = m14Var.D0(V02);
                    int A02 = D04.A0();
                    int b3 = D04.b3();
                    if (b3 == A02) {
                        break;
                    }
                    i6 -= A02;
                    if (b3 != 0) {
                        i6 += b3;
                        break;
                    }
                    V02--;
                }
                if (i6 != A0) {
                    if (i6 < intValue) {
                        i6 = intValue;
                    }
                    arrayList.set(i5, (m14) gVar.a(m14Var, i6));
                }
            }
        }
        R[] W33 = cVar.W3(arrayList.size());
        arrayList.toArray(W33);
        return W33;
    }

    public static void j5(int i2, StringBuilder sb) {
        g24.b.H(i2, sb);
    }

    private static <R extends m14> R[] l5(R r, R r2, UnaryOperator<R> unaryOperator, IntFunction<R[]> intFunction) {
        if (r.y1(r2)) {
            return (R[]) ((m14[]) j14.X2(r, r2, true, unaryOperator, intFunction));
        }
        if (r2.y1(r)) {
            return (R[]) ((m14[]) j14.X2(r2, r, false, unaryOperator, intFunction));
        }
        return null;
    }

    public static boolean l6(final n14[] n14VarArr, Integer num, l14<?, ?, ?, ?, ?> l14Var, boolean z) {
        int length = n14VarArr.length;
        if (length == 0) {
            return false;
        }
        n14 n14Var = n14VarArr[0];
        return t64.h(new n04.b() { // from class: com.p7700g.p99005.kz3
            @Override // com.p7700g.p99005.n04.b
            public final int a(int i2) {
                int B1;
                B1 = n14VarArr[i2].B1();
                return B1;
            }
        }, new n04.b() { // from class: com.p7700g.p99005.rz3
            @Override // com.p7700g.p99005.n04.b
            public final int a(int i2) {
                int h3;
                h3 = n14VarArr[i2].h3();
                return h3;
            }
        }, length, n14Var.g3(), n14Var.A0(), n14Var.g1(), num, l14Var.i(), z);
    }

    public static int n3(int i2, int i3, int i4) {
        return t64.e(i2, i3, i4);
    }

    public static g24.c<o34> n7(e eVar) {
        g24.c<o34> cVar = (g24.c) g24.o(eVar);
        if (cVar == null) {
            g24.c<o34> cVar2 = new g24.c<>(eVar.d, eVar.f, eVar.j);
            cVar2.J(eVar.c);
            cVar2.c0(eVar.b);
            cVar2.t0(eVar.l);
            cVar2.X(eVar.e);
            cVar2.s0(eVar.k);
            cVar2.T(eVar.g);
            cVar2.V(eVar.h);
            cVar2.a0(eVar.i);
            cVar2.d0(eVar.m);
            g24.L(eVar, cVar2);
            return cVar2;
        }
        return cVar;
    }

    private static <R extends m14> R[] o5(R r, R r2, UnaryOperator<R> unaryOperator, IntFunction<R[]> intFunction) {
        if (r.y1(r2)) {
            return (R[]) ((m14[]) j14.i3(r, r2, true, unaryOperator, intFunction));
        }
        if (r2.y1(r)) {
            return (R[]) ((m14[]) j14.i3(r2, r, false, unaryOperator, intFunction));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x003c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <S extends n14> boolean p6(int i2, S[] sArr, int i3, int i4, int i5) {
        if (sArr.length != 0 && i2 < i5) {
            int length = sArr.length;
            int i32 = i3(i2, i3, i4);
            int i6 = i32;
            loop0: while (i6 < length) {
                Integer p3 = f34.p3(i4, i2, i32);
                S s = sArr[i6];
                if (p3 != null) {
                    int B5 = s.B5(p3.intValue());
                    if (s.z3() || (B5 & s.B1()) != 0) {
                        return false;
                    }
                    while (true) {
                        i6++;
                        if (i6 < length) {
                            if (!sArr[i6].V1()) {
                                break loop0;
                            }
                        }
                    }
                    return false;
                }
                i6++;
            }
            return true;
        }
        return false;
    }

    public static boolean r5(int i2, p14 p14Var, p14 p14Var2) {
        g24.d(p14Var, i2);
        int p1 = p14Var.p1();
        int u2 = p14Var.u2();
        int i3 = i3(i2, p14Var.Z1(), u2);
        if (i3 < p1) {
            n14 D0 = p14Var.D0(i3);
            n14 D02 = p14Var2.D0(i3);
            if (!D0.r5(D0.B1(), D02.B1(), f34.p3(u2, i2, i3).intValue())) {
                return false;
            }
            for (int i4 = i3 + 1; i4 < p1; i4++) {
                n14 D03 = p14Var.D0(i4);
                n14 D04 = p14Var2.D0(i4);
                if (!D03.v1() || !D04.x1()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String r7(e eVar, o34 o34Var) {
        return n7(eVar).f0(o34Var);
    }

    public static boolean s5(int i2, p14 p14Var, p14 p14Var2) {
        g24.d(p14Var, i2);
        int p1 = p14Var.p1();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= p1) {
                break;
            }
            n14 D0 = p14Var.D0(i3);
            n14 D02 = p14Var2.D0(i3);
            int A0 = D0.A0() + i4;
            if (i2 >= A0) {
                if (!D0.Q5(D02)) {
                    return false;
                }
                i3++;
                i4 = A0;
            } else {
                if (!D0.t5(D0.B1(), D02.B1(), Math.max(0, i2 - i4))) {
                    return false;
                }
                for (int i5 = i3 + 1; i5 < p1; i5++) {
                    n14 D03 = p14Var.D0(i5);
                    n14 D04 = p14Var2.D0(i5);
                    if (!D03.v1() || !D04.x1()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static <S extends x04> Iterator<S[]> s6(int i2, s04.a<S> aVar, IntFunction<Iterator<S>> intFunction, int i3, int i4, IntFunction<Iterator<S>> intFunction2) {
        return f34.I4(i2, aVar, null, intFunction, null, i3, i4, intFunction2);
    }

    public static <T extends n04, S extends x04> Iterator<T> t6(T t, d34<T, ?, ?, S> d34Var, Iterator<S[]> it) {
        return f34.U3(t != null, t, d34Var, it, null);
    }

    public static p14 u5(p14 p14Var, p14 p14Var2, p14 p14Var3) {
        int V0 = p14Var2.V0();
        int u2 = p14Var2.u2();
        int i2 = 0;
        for (int i3 = 0; i3 < V0; i3++) {
            int B1 = p14Var2.D0(i3).B1() ^ p14Var3.D0(i3).B1();
            if (B1 != 0) {
                int numberOfLeadingZeros = (Integer.numberOfLeadingZeros(B1) - (32 - u2)) + i2;
                if (p14Var == null) {
                    p14Var = p14Var2;
                }
                return p14Var.i4(numberOfLeadingZeros);
            }
            i2 += u2;
        }
        if (p14Var == null) {
            p14Var = p14Var2;
        }
        return p14Var.i4(p14Var2.A0());
    }

    public static /* synthetic */ n14 u6(g gVar, m14 m14Var, int i2) {
        return (n14) gVar.a(m14Var, i2);
    }

    public static <T extends p14> T v5(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, Comparator<T> comparator) throws r04 {
        return (T) b5(t, t2, unaryOperator, unaryOperator2, comparator, null, ez3.a);
    }

    public static /* synthetic */ int v6(g gVar, m14 m14Var, int i2) {
        return ((n14) gVar.a(m14Var, i2)).B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends j14, R extends m14, S extends n14> R v7(R r, int i2, l14.c<T, R, ?, S, ?> cVar, g<Integer, S> gVar) {
        if (i2 >= 0 && i2 <= r.A0()) {
            if (r.k6(i2)) {
                return r;
            }
            int u2 = r.u2();
            int V0 = r.V0();
            n14[] n14VarArr = (n14[]) cVar.d(V0);
            for (int i3 = 0; i3 < V0; i3++) {
                n14VarArr[i3] = gVar.a(f34.p3(u2, i2, i3), i3);
            }
            return (R) cVar.u(n14VarArr);
        }
        throw new y14(r, i2);
    }

    public static Integer w3(int i2, int i3) {
        return f34.w3(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends j14, R extends m14, S extends n14> R w5(R r, int i2, int i3, int i4, l14.c<T, R, ?, S, ?> cVar, IntFunction<S> intFunction, S[] sArr) {
        int V0 = r.V0();
        n14[] n14VarArr = (n14[]) cVar.d(V0);
        for (int i5 = 0; i5 < i4; i5++) {
            n14VarArr[i5] = sArr[i5];
        }
        n14VarArr[i4] = (n14) cVar.c(i2, i3, null);
        while (true) {
            i4++;
            if (i4 < V0) {
                n14VarArr[i4] = intFunction.apply(i4);
            } else {
                return (R) cVar.u(n14VarArr);
            }
        }
    }

    public static String x(String str) {
        return d14.a(str);
    }

    public static Integer x3(int i2, Integer num, int i3) {
        return f34.x3(i2, num, i3);
    }

    public static <T extends j14, R extends m14, S extends n14> R x5(l14.c<T, R, ?, S, ?> cVar, S[] sArr, m14 m14Var) {
        return cVar.w3(m14Var, sArr);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return u2() * V0();
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    /* renamed from: A5 */
    public n14 t(int i2) {
        return O5()[i2];
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: A7 */
    public abstract m14 t0();

    public abstract Iterator<? extends m14> B0();

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean B3(int i2) {
        int p1;
        int u2;
        int i3;
        g24.d(this, i2);
        boolean f2 = m0().i().f();
        if ((!f2 || !C0() || K3().intValue() > i2) && (i3 = i3(i2, Z1(), (u2 = u2()))) < (p1 = p1())) {
            n14 t = t(i3);
            if (!t.B3(f34.p3(u2, i2, i3).intValue())) {
                return false;
            }
            if (f2 && t.C0()) {
                return true;
            }
            for (int i4 = i3 + 1; i4 < p1; i4++) {
                n14 t2 = t(i4);
                if (!t2.H0()) {
                    return false;
                }
                if (f2 && t2.C0()) {
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.p14
    /* renamed from: B5 */
    public m14 a2() {
        return m0().x(K3() == null ? 0 : K3().intValue()).J0(0, V0());
    }

    @Override // com.p7700g.p99005.p14
    public String D2(e eVar) {
        return r7(eVar, this);
    }

    public int D5(int i2) {
        return V0() - i3(i2, Z1(), u2());
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: E5 */
    public abstract m14 a0();

    public abstract Iterator<? extends m14> F0();

    @Override // com.p7700g.p99005.p14
    /* renamed from: F5 */
    public abstract m14 e2();

    public abstract x44<? extends m14> G0();

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean H0() {
        int p1 = p1();
        if (m0().i().f()) {
            for (int i2 = 0; i2 < p1; i2++) {
                n14 D0 = D0(i2);
                if (!D0.H0()) {
                    return false;
                }
                if (D0.D5() != null) {
                    return true;
                }
            }
            return true;
        }
        return super.H0();
    }

    @Override // com.p7700g.p99005.z04
    public String[] I1() {
        return u1();
    }

    public abstract m14 J0(int i2, int i3);

    /* JADX WARN: Type inference failed for: r0v4, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.p14
    /* renamed from: J5 */
    public m14 P1() {
        return m0().x(K3() == null ? A0() : K3().intValue()).J0(0, V0());
    }

    public abstract Stream<? extends m14> K0();

    public int L5(int i2) {
        return n3(i2, Z1(), u2()) + 1;
    }

    public long L6(int i2) {
        if (z3()) {
            return f34.q4(this, i2);
        }
        return 1L;
    }

    public long M6(int i2) {
        if (z3()) {
            return f34.w4(this, i2);
        }
        return 1L;
    }

    public /* bridge */ /* synthetic */ x04[] N0() {
        x04[] N0;
        N0 = N0();
        return N0;
    }

    @Override // com.p7700g.p99005.q04
    public String N1(boolean z) throws t14 {
        if (!Z5()) {
            d U5 = U5();
            String str = z ? U5.c : U5.b;
            if (str != null) {
                return str;
            }
        }
        d U52 = U5();
        String m7 = m7(z, null);
        if (z) {
            U52.c = m7;
        } else {
            U52.b = m7;
        }
        return m7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006a, code lost:
        continue;
     */
    @Override // com.p7700g.p99005.p14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean N2(int i2) {
        if (i2 >= 0 && i2 <= A0()) {
            if (m0().i().f() && C0() && K3().intValue() <= i2) {
                return true;
            }
            int u2 = u2();
            int i3 = i3(i2, Z1(), u2);
            int V0 = V0();
            while (i3 < V0) {
                n14 D0 = D0(i3);
                Integer p3 = f34.p3(u2, i2, i3);
                if (p3 != null) {
                    if ((D0.B5(p3.intValue()) & D0.G4()) != 0) {
                        return false;
                    }
                    while (true) {
                        i3++;
                        if (i3 < V0) {
                            if (!D0(i3).v1()) {
                                return false;
                            }
                        }
                    }
                }
                i3++;
            }
            return true;
        }
        throw new y14(this, i2);
    }

    public o34[] N5(c cVar) {
        return cVar.a(1) ? new o34[]{this} : J;
    }

    public long N6(final int i2, int i3) {
        if (N2(i2)) {
            if (z3()) {
                final int u2 = u2();
                final int n3 = n3(i2, Z1(), u2);
                return f34.j3(new IntUnaryOperator() { // from class: com.p7700g.p99005.oz3
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i4) {
                        return m14.this.B6(n3, u2, i2, i4);
                    }
                }, n3 + 1);
            }
            return 1L;
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ v04 O0() {
        v04 O0;
        O0 = O0();
        return O0;
    }

    public abstract Stream<? extends m14> O1(int i2);

    public n14[] O5() {
        return (n14[]) u();
    }

    public boolean O6(m14 m14Var, m14 m14Var2) {
        k5(m14Var2);
        m5(m14Var);
        int V0 = V0();
        for (int i2 = 0; i2 < V0; i2++) {
            n14 D0 = D0(i2);
            n14 D02 = m14Var2.D0(i2);
            n14 D03 = m14Var.D0(i2);
            if (!D0.s1(D03.B1(), D03.h3(), D02.B1())) {
                return false;
            }
        }
        return true;
    }

    public abstract Stream<? extends m14> P0();

    @Override // com.p7700g.p99005.p14
    public BigInteger R3() {
        if (C0() && K3().intValue() < A0()) {
            BigInteger bigInteger = this.O;
            if (bigInteger == null) {
                BigInteger subtract = getCount().subtract(X5(K3().intValue(), V0()));
                this.O = subtract;
                return subtract;
            }
            return bigInteger;
        }
        return getCount();
    }

    public void R5(StringBuilder sb, String str) {
        S5(sb, str, new q54());
    }

    public abstract boolean R6(m14 m14Var);

    public abstract Iterator<? extends m14> S2(int i2);

    public void S5(StringBuilder sb, String str, p54 p54Var) {
        T5(sb, str, true, p54Var);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: S6 */
    public abstract m14 n0();

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean T0(int i2) {
        return y04.g(this, i2);
    }

    public x44<? extends m14> U1() {
        return y2(G2());
    }

    public abstract d U5();

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: U6 */
    public abstract m14 v0(boolean z);

    @Override // com.p7700g.p99005.z04
    public int V0() {
        return p1();
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: V6 */
    public abstract m14 d0(boolean z);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: W4 */
    public abstract m14 r0(boolean z);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: W5 */
    public abstract m14 b0();

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: W6 */
    public abstract m14 c0();

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public Integer X3() {
        Integer num;
        if (!Y5() && (num = this.N.d) != null) {
            if (num.intValue() < 0) {
                return null;
            }
            return num;
        }
        Integer X3 = super.X3();
        if (X3 == null) {
            this.N.d = g24.t;
            this.N.e = Boolean.FALSE;
            return null;
        }
        if (C0() && X3.equals(K3())) {
            this.N.e = Boolean.TRUE;
        }
        this.N.d = X3;
        return X3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
        return r2;
     */
    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: X4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m14 q0(boolean z, boolean z2) {
        int X2 = X2(z, u2(), false);
        Integer K3 = K3();
        if (K3 == null) {
            if (z) {
            }
        } else if (K3.intValue() == X2 && X2 != 0) {
            return v0(z2);
        }
        return o0(X2, z2);
    }

    public abstract BigInteger X5(int i2, int i3);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: X6 */
    public abstract m14 k0();

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Y4 */
    public abstract m14 j0(int i2);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Y6 */
    public abstract m14 s0();

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public BigInteger Z2(int i2) {
        if (i2 >= 0) {
            int V0 = V0();
            if (i2 > V0) {
                i2 = V0;
            }
            return z5(i2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Z4 */
    public abstract m14 u0(int i2, boolean z);

    public abstract boolean Z5();

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: a6 */
    public abstract m14 l0(long j2);

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public boolean b1() {
        if (!Y5() && this.N.e != null) {
            return this.N.e.booleanValue();
        }
        boolean b1 = super.b1();
        this.N.e = Boolean.valueOf(b1);
        if (b1) {
            this.N.d = K3();
        }
        return b1;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public int b3() {
        Integer num;
        if (Y5() || (num = this.N.c) == null) {
            f fVar = this.N;
            Integer b2 = b(super.b3());
            fVar.c = b2;
            num = b2;
        }
        return num.intValue();
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: b6 */
    public abstract m14 g0(long j2);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: b7 */
    public abstract m14 h0(int i2);

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: c5 */
    public abstract m14 p0(int i2) throws y14;

    public void c6(Integer num, boolean z, Integer num2, Integer num3, Integer num4, BigInteger bigInteger, i34.c cVar, i34.c cVar2) {
        if (this.N == null) {
            this.N = new f();
        }
        if (z) {
            a7(num);
        } else {
            Z6(num);
        }
        super.E(num2, bigInteger);
        this.N.c = num3;
        this.N.e = Boolean.valueOf(Objects.equals(num4, num2));
        this.N.d = num4;
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: c7 */
    public abstract m14 o0(int i2, boolean z);

    @Override // com.p7700g.p99005.p14
    /* renamed from: d5 */
    public m14 g2() {
        return o0(b3(), false);
    }

    public abstract m14 d7(int i2, boolean z, boolean z2);

    @Override // com.p7700g.p99005.p14
    /* renamed from: e5 */
    public m14 F2() {
        if (z3()) {
            Integer X3 = X3();
            if (X3 == null) {
                return null;
            }
            m14 o0 = o0(X3.intValue(), false);
            o0.Y5();
            o0.N.e = Boolean.TRUE;
            o0.N.d = X3;
            return o0;
        }
        return this;
    }

    public boolean e6() {
        return V0() == j14.y4(Z0());
    }

    public abstract Iterable<? extends m14> f0();

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean f1(int i2) {
        return y04.c(this, i2);
    }

    public boolean f6(int i2) {
        if (V0() == 0) {
            return true;
        }
        if (i2 >= u2()) {
            return false;
        }
        return !D0(0).L5(b(i2));
    }

    public List<? extends p14> f7(boolean z) {
        return j14.n5(this, z);
    }

    @Override // com.p7700g.p99005.z04
    public int g1() {
        return n14.z5(Z0());
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public int g3() {
        return Z1() * V0();
    }

    public boolean g6() {
        return false;
    }

    public abstract void h5(String str);

    public boolean h6() {
        return false;
    }

    public boolean i6(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (D0(i3).z3()) {
                return true;
            }
        }
        return false;
    }

    public abstract Iterator<? extends m14> iterator();

    public Iterator<? extends m14> j1() {
        return S2(G2());
    }

    public boolean j6(int i2, boolean z) {
        int V0 = V0();
        if (V0 == 0) {
            return true;
        }
        int u2 = u2();
        int n3 = n3(i2, Z1(), u2);
        if (n3 + 1 < V0) {
            return false;
        }
        return !D0(V0 - 1).O5(b(f34.p3(u2, i2, n3).intValue()), z);
    }

    public i54 j7() {
        return Y1(new c(48));
    }

    @Override // com.p7700g.p99005.p14
    public String k1() throws t14 {
        String str;
        if (Z5() || (str = U5().p) == null) {
            d U5 = U5();
            String k7 = k7(null);
            U5.p = k7;
            return k7;
        }
        return str;
    }

    public Stream<? extends m14> k4() {
        return O1(G2());
    }

    public void k5(m14 m14Var) throws z14 {
        if (m14Var.V0() < V0()) {
            throw new z14(this, m14Var);
        }
    }

    public boolean k6(int i2) {
        int V0 = V0();
        if (V0 == 0) {
            return true;
        }
        int u2 = u2();
        int i3 = i3(i2, Z1(), u2);
        if (i3 >= V0) {
            if (i2 == A0()) {
                n14 D0 = D0(V0 - 1);
                return !D0.P5(D0.A0());
            }
            return true;
        }
        if (D0(i3).P5(f34.p3(u2, i2, i3).intValue())) {
            return false;
        }
        if (!m0().i().f()) {
            for (int i4 = i3 + 1; i4 < V0; i4++) {
                if (!D0(i4).H0()) {
                    return false;
                }
            }
        }
        return true;
    }

    public String k7(CharSequence charSequence) {
        if (S3()) {
            return f34.L4(n7(d.h), a0(), b0(), charSequence);
        }
        return n7(d.h).g0(this, charSequence);
    }

    public i54 l7() {
        return Y1(new c());
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
    public /* bridge */ /* synthetic */ s04 m0() {
        return super.m0();
    }

    @Override // com.p7700g.p99005.z04
    public void m3(int i2, int i3, x04[] x04VarArr, int i4) {
        System.arraycopy(u(), i2, x04VarArr, i4, i3 - i2);
    }

    public void m5(m14 m14Var) throws z14 {
        if (m14Var.V0() != V0()) {
            throw new z14(this, m14Var);
        }
    }

    public boolean m6() {
        Integer K3 = K3();
        if (K3 != null && K3.intValue() < A0()) {
            int n3 = n3(K3.intValue(), Z1(), u2());
            if (n3 < 0) {
                return true;
            }
            for (int i2 = 0; i2 < n3; i2++) {
                if (D0(i2).z3()) {
                    return false;
                }
            }
            n14 D0 = D0(n3);
            int B1 = D0.B1() ^ D0.h3();
            if (B1 == 0) {
                return true;
            }
            int A0 = D0.A0();
            return x3(A0, K3, n3).intValue() <= Integer.numberOfLeadingZeros(B1) - (32 - A0);
        }
        return !z3();
    }

    public String m7(boolean z, CharSequence charSequence) throws t14 {
        if (S3()) {
            return f34.L4(n7(z ? d.e : d.d), a0(), b0(), charSequence);
        }
        return n7(z ? d.e : d.d).g0(this, charSequence);
    }

    @Override // com.p7700g.p99005.g24
    public byte[] n() {
        return super.n();
    }

    public void n5(ri4[] ri4VarArr) {
        l14<?, ?, ?, ?, ?> m0 = m0();
        for (ri4 ri4Var : ri4VarArr) {
            if (!m0.m(ri4Var.m0())) {
                throw new x14(ri4Var);
            }
        }
    }

    public boolean n6() {
        if (C0()) {
            return o6(K3().intValue());
        }
        return false;
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.p14
    public boolean o4() {
        Integer K3 = K3();
        if (K3 == null || K3.intValue() >= A0()) {
            return false;
        }
        return N2(K3.intValue());
    }

    public boolean o6(int i2) {
        if (i2 >= 0 && i2 <= A0()) {
            return p6(i2, N0(), Z1(), u2(), A0());
        }
        throw new y14(this, i2);
    }

    public InetAddress o7(j14 j14Var) {
        InetAddress inetAddress;
        if (D() || (inetAddress = this.x.e) == null) {
            g24.g gVar = this.x;
            InetAddress D5 = j14Var.D5();
            gVar.e = D5;
            return D5;
        }
        return inetAddress;
    }

    @Override // com.p7700g.p99005.g24
    public BigInteger p() {
        return z5(V0());
    }

    public boolean p5(m14 m14Var) {
        if (!m14Var.C0()) {
            return y1(m14Var);
        }
        int intValue = m14Var.K3().intValue();
        if (intValue == m14Var.A0()) {
            return y1(m14Var);
        }
        return q5(m14Var, intValue);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: p7 */
    public abstract m14 L3();

    @Override // com.p7700g.p99005.p14
    public BigInteger q1() {
        return h1(u2() * G2());
    }

    @Override // com.p7700g.p99005.p14
    public String q2(boolean z) throws t14 {
        if (!Z5()) {
            d U5 = U5();
            String str = z ? U5.n : U5.o;
            if (str != null) {
                return str;
            }
        }
        d U52 = U5();
        String s7 = s7(z, null);
        if (z) {
            U52.n = s7;
        } else {
            U52.o = s7;
        }
        return s7;
    }

    @Override // com.p7700g.p99005.p14
    public boolean q3() {
        Integer K3 = K3();
        if (K3 == null || K3.intValue() >= A0()) {
            return false;
        }
        return r1(K3.intValue());
    }

    public abstract boolean q5(m14 m14Var, int i2);

    public <S extends n14> boolean q6(S[] sArr) {
        if (C0()) {
            return p6(K3().intValue(), sArr, Z1(), u2(), A0());
        }
        return false;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: q7 */
    public abstract m14 d2(int i2);

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0064, code lost:
        continue;
     */
    @Override // com.p7700g.p99005.p14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r1(int i2) {
        if (i2 >= 0 && i2 <= A0()) {
            if (m0().i().f() && C0() && K3().intValue() <= i2) {
                return true;
            }
            int u2 = u2();
            int i3 = i3(i2, Z1(), u2);
            int V0 = V0();
            while (i3 < V0) {
                n14 D0 = D0(i3);
                Integer p3 = f34.p3(u2, i2, i3);
                if (p3 != null) {
                    int B5 = D0.B5(p3.intValue());
                    if ((D0.h3() & B5) != B5) {
                        return false;
                    }
                    while (true) {
                        i3++;
                        if (i3 < V0) {
                            if (!D0(i3).x1()) {
                                return false;
                            }
                        }
                    }
                }
                i3++;
            }
            return true;
        }
        throw new y14(this, i2);
    }

    @Override // com.p7700g.p99005.z04
    public void r2(x04[] x04VarArr) {
        m3(0, p1(), x04VarArr, 0);
    }

    public <S extends n14> boolean r6(S[] sArr, int i2) {
        return p6(i2, sArr, Z1(), u2(), A0());
    }

    public String s7(boolean z, CharSequence charSequence) throws t14 {
        if (!S3()) {
            return n7(z ? d.g : d.f).g0(new i34((g34[]) Z(3, null, null, az3.a, sz3.a), m0()), charSequence);
        }
        m14 a0 = a0();
        m14 b0 = b0();
        l04 l04Var = l04.a;
        return f34.L4(n7(z ? d.g : d.f), new i34((g34[]) a0.X(3, l04Var, pz3.a), m0()), new i34((g34[]) b0.X(3, l04Var, uz3.a), m0()), charSequence);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract x44<? extends m14> spliterator();

    public abstract Stream<? extends m14> stream();

    @Override // com.p7700g.p99005.p14
    /* renamed from: t5 */
    public abstract m14 e1();

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: t7 */
    public abstract m14 i0();

    @Override // com.p7700g.p99005.g24
    public String toString() {
        return E0();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: u7 */
    public abstract m14 i4(int i2);

    public i54 w7() {
        return Y1(new c(16));
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: x7 */
    public abstract m14 Z3();

    public abstract x44<? extends m14> y0();

    public boolean y1(v04 v04Var) {
        int V0 = V0();
        if (V0 != v04Var.V0()) {
            return false;
        }
        for (int n3 = C0() && m0().i().f() ? n3(K3().intValue(), Z1(), u2()) : V0 - 1; n3 >= 0; n3--) {
            if (!D0(n3).R1(v04Var.D0(n3))) {
                return false;
            }
        }
        return true;
    }

    public abstract x44<? extends m14> y2(int i2);

    public Integer y5(boolean z) {
        Integer Z6;
        if (z) {
            if (Y5() || (Z6 = this.N.a) == null) {
                Z6 = a7(i5(z));
            }
        } else if (Y5() || (Z6 = this.N.b) == null) {
            Z6 = Z6(i5(z));
        }
        if (Z6.intValue() < 0) {
            return null;
        }
        return Z6;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: y7 */
    public abstract m14 I2(int i2);

    public abstract m14 z0(int i2);

    public abstract Iterator<? extends m14> z1();

    public abstract BigInteger z5(int i2);

    @Override // com.p7700g.p99005.p14
    /* renamed from: z7 */
    public abstract m14 O3();

    /* compiled from: IPAddressSection.java */
    /* loaded from: classes3.dex */
    public static class b<S extends e24, T> extends g24.a<S, T> implements q14.g<S, T> {
        public final Predicate<q14.g<S, T>> t;

        public b(S s, Predicate<q14.g<S, T>> predicate, h<S, T> hVar, ToLongFunction<S> toLongFunction) {
            super(s, null, hVar, null, null, toLongFunction);
            this.t = predicate;
        }

        @Override // com.p7700g.p99005.g24.a
        public boolean o() {
            return this.t.test(this);
        }

        @Override // com.p7700g.p99005.g24.a
        /* renamed from: r */
        public b<S, T> h(S s, boolean z, Function<S, BigInteger> function, Predicate<S> predicate, ToLongFunction<S> toLongFunction) {
            return new b<>(s, this.t, (h) this.k, z, function, predicate, toLongFunction);
        }

        public b(S s, Predicate<q14.g<S, T>> predicate, h<S, T> hVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            super(s, null, hVar, function, predicate2, toLongFunction);
            this.t = predicate;
        }

        public b(S s, Predicate<q14.g<S, T>> predicate, h<S, T> hVar, boolean z, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            super(s, null, hVar, z, false, function, predicate2, toLongFunction);
            this.t = predicate;
        }
    }

    public n14 D0(int i2) {
        return O5()[i2];
    }
}