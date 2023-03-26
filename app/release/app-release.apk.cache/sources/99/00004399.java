package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.s04;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: AddressDivisionGroupingBase.java */
/* loaded from: classes3.dex */
public abstract class g24 implements i24 {
    private static final long s = 1;
    public static final Integer t = -1;
    public static final BigInteger u = BigInteger.ZERO.not();
    public static BigInteger v = BigInteger.valueOf(Long.MAX_VALUE);
    public static ResourceBundle w;
    private transient Boolean A;
    private transient BigInteger B;
    private transient BigInteger C;
    public transient int D;
    public transient g x;
    private final f24[] y;
    public Integer z;

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public static class a<S extends e24, T> extends n24<S, T> implements e<S, T> {
        private S g;
        private Iterator<T> h;
        private S i;
        private S j;
        public final d<S, T> k;
        private boolean l;
        private final boolean m;
        private Function<S, BigInteger> n;
        private Predicate<S> o;
        private final ToLongFunction<S> p;
        private long q;
        private BigInteger r;
        public final Predicate<e<S, T>> s;

        public a(S s, Predicate<e<S, T>> predicate, d<S, T> dVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            this(s, predicate, dVar, true, true, function, predicate2, toLongFunction);
            q();
        }

        private BigInteger i() {
            return k().subtract(this.e);
        }

        private long j() {
            return l() - this.a;
        }

        private BigInteger k() {
            BigInteger bigInteger = this.r;
            if (bigInteger == null) {
                BigInteger apply = this.n.apply(this.g);
                this.r = apply;
                return apply;
            }
            return bigInteger;
        }

        private long l() {
            long j = this.q;
            if (j < 0) {
                long applyAsLong = this.p.applyAsLong(this.g);
                this.q = applyAsLong;
                return applyAsLong;
            }
            return j;
        }

        private Iterator<T> m() {
            if (this.h == null) {
                this.h = this.k.a(this.l, this.m, this.g);
            }
            return this.h;
        }

        @Override // com.p7700g.p99005.v44
        public BigInteger c() {
            if (this.d) {
                return i().subtract(BigInteger.valueOf(this.f));
            }
            return BigInteger.valueOf(j());
        }

        @Override // com.p7700g.p99005.w24, java.util.Spliterator
        public int characteristics() {
            if (this.d) {
                return 4373;
            }
            return super.characteristics();
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            if (this.d) {
                if (i().compareTo(g24.v) <= 0) {
                    return i().longValue();
                }
                return Long.MAX_VALUE;
            }
            return j();
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super T> consumer) {
            if (this.b) {
                return;
            }
            this.b = true;
            try {
                if (this.d) {
                    f(m(), consumer, k());
                } else {
                    d(m(), consumer, l());
                }
            } finally {
                this.b = false;
            }
        }

        public boolean g() {
            if (this.b) {
                return false;
            }
            if (this.d) {
                if (this.e.compareTo(k().shiftRight(1)) >= 0) {
                    return false;
                }
            } else if (this.a >= (l() >> 1)) {
                return false;
            }
            return true;
        }

        public a<S, T> h(S s, boolean z, Function<S, BigInteger> function, Predicate<S> predicate, ToLongFunction<S> toLongFunction) {
            return new a<>(s, this.s, this.k, z, false, function, predicate, toLongFunction);
        }

        @Override // com.p7700g.p99005.g24.e
        /* renamed from: n */
        public void b(S s, S s2) {
            this.i = s;
            this.j = s2;
        }

        public boolean o() {
            return this.s.test(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        @Override // com.p7700g.p99005.w24, com.p7700g.p99005.v44, java.util.Spliterator
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a<S, T> trySplit() {
            BigInteger bigInteger;
            if (g() && o()) {
                boolean z = true;
                if (!this.d ? this.a <= 0 : this.e.signum() <= 0) {
                    z = false;
                }
                long j = -1;
                if (z) {
                    if (this.d) {
                        bigInteger = this.n.apply(this.i);
                        if (this.e.compareTo(bigInteger) >= 0) {
                            return null;
                        }
                        a<S, T> h = h(this.i, this.l, this.n, this.o, this.p);
                        if (z) {
                            if (this.d) {
                                if (h.d) {
                                    h.e = this.e;
                                } else {
                                    h.a = this.e.longValue();
                                }
                                this.e = BigInteger.ZERO;
                            } else {
                                h.a = this.a;
                                this.a = 0L;
                            }
                            h.h = this.h;
                            this.h = null;
                            h.r = bigInteger;
                            h.q = j;
                        }
                        this.g = this.j;
                        this.l = false;
                        q();
                        return h;
                    }
                    j = this.p.applyAsLong(this.i);
                    if (this.a >= j) {
                        return null;
                    }
                }
                bigInteger = null;
                a<S, T> h2 = h(this.i, this.l, this.n, this.o, this.p);
                if (z) {
                }
                this.g = this.j;
                this.l = false;
                q();
                return h2;
            }
            return null;
        }

        public void q() {
            boolean z = false;
            if (this.n != null) {
                Predicate<S> predicate = this.o;
                z = (predicate == null || !predicate.test(this.g)) ? true : true;
                this.d = z;
                if (!z) {
                    this.n = null;
                    this.o = null;
                }
            } else {
                this.d = false;
            }
            this.q = -1L;
            this.r = null;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super T> consumer) {
            if (this.b) {
                return false;
            }
            if (!this.d ? this.a < l() : !(this.e.signum() > 0 && this.e.compareTo(k()) >= 0)) {
                return false;
            }
            return e(m(), consumer);
        }

        @Override // com.p7700g.p99005.v44, com.p7700g.p99005.g24.e
        public S a() {
            return this.g;
        }

        public a(S s, Predicate<e<S, T>> predicate, d<S, T> dVar, boolean z, boolean z2, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
            this.g = s;
            this.k = dVar;
            this.l = z;
            this.m = z2;
            this.p = toLongFunction;
            this.n = function;
            this.o = predicate2;
            this.s = predicate;
            q();
        }
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public static class b<T extends l34> implements y44, z44, Cloneable {
        public static final f34.n.b s = new f34.n.b();
        private boolean A;
        private String B;
        private char C;
        private f34.n.b t;
        public boolean u;
        private String v;
        private int w;
        public Character x;
        private boolean y;
        private boolean z;

        public b(int i, Character ch, boolean z) {
            this(i, ch, z, (char) 0);
        }

        public static void H(int i, StringBuilder sb) {
        }

        public static b<l34> e0(f34.n nVar) {
            b<l34> bVar = (b) g24.o(nVar);
            if (bVar == null) {
                b<l34> bVar2 = new b<>(nVar.d, nVar.f, nVar.j);
                bVar2.J(nVar.c);
                bVar2.c0(nVar.b);
                bVar2.X(nVar.e);
                bVar2.T(nVar.g);
                bVar2.V(nVar.h);
                bVar2.a0(nVar.i);
                g24.L(nVar, bVar2);
                return bVar2;
            }
            return bVar;
        }

        public StringBuilder A(StringBuilder sb, T t, CharSequence charSequence) {
            return G(D(B(sb), t), charSequence);
        }

        public StringBuilder B(StringBuilder sb) {
            String L = L();
            if (L != null && L.length() > 0) {
                sb.append(L);
            }
            return sb;
        }

        public int C(int i, StringBuilder sb, T t) {
            return t.e0(i).a(i, this, sb);
        }

        public StringBuilder D(StringBuilder sb, T t) {
            int p1 = t.p1();
            if (p1 != 0) {
                boolean S = S();
                int i = 0;
                Character O = O();
                while (true) {
                    C(S ? (p1 - i) - 1 : i, sb, t);
                    i++;
                    if (i == p1) {
                        break;
                    } else if (O != null) {
                        sb.append(O);
                    }
                }
            }
            return sb;
        }

        public int E(k34 k34Var, StringBuilder sb) {
            if (sb == null) {
                return k34Var.a(0, this, null) + M();
            }
            B(sb);
            k34Var.a(0, this, sb);
            return 0;
        }

        public StringBuilder G(StringBuilder sb, CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 0) {
                sb.append(this.C);
                sb.append(charSequence);
            }
            return sb;
        }

        @Override // 
        /* renamed from: I */
        public b<T> clone() {
            try {
                return (b) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public void J(boolean z) {
            this.u = z;
        }

        public String L() {
            return this.B;
        }

        public int M() {
            String L = L();
            if (L != null) {
                return L.length();
            }
            return 0;
        }

        public int N(T t) {
            if (t.p1() != 0) {
                int p1 = t.p1();
                int i = 0;
                for (int i2 = 0; i2 < p1; i2++) {
                    i += C(i2, null, t);
                }
                return O() != null ? (p1 - 1) + i : i;
            }
            return 0;
        }

        public Character O() {
            return this.x;
        }

        public int P(T t) {
            return N(t) + M();
        }

        public int Q(T t, CharSequence charSequence) {
            int P = P(t);
            return charSequence != null ? P + R(charSequence) : P;
        }

        public int R(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() <= 0) {
                return 0;
            }
            return charSequence.length() + 1;
        }

        public boolean S() {
            return this.z;
        }

        public void T(String str) {
            this.B = str;
        }

        public void U(int i) {
            this.w = i;
        }

        public void V(boolean z) {
            this.z = z;
        }

        public void X(String str) {
            Objects.requireNonNull(str);
            this.v = str;
        }

        public void Z(Character ch) {
            this.x = ch;
        }

        public void a0(boolean z) {
            this.A = z;
        }

        @Override // com.p7700g.p99005.y44
        public int b(k34 k34Var) {
            return E(k34Var, null);
        }

        public void b0(boolean z) {
            this.y = z;
        }

        @Override // com.p7700g.p99005.z44
        public boolean c() {
            return this.y;
        }

        public void c0(f34.n.b bVar) {
            this.t = bVar;
        }

        @Override // com.p7700g.p99005.z44
        public boolean d() {
            return true;
        }

        public void d0(char c) {
            this.C = c;
        }

        @Override // com.p7700g.p99005.z44
        public boolean e() {
            return this.A;
        }

        @Override // com.p7700g.p99005.z44
        public Character f() {
            return this.x;
        }

        public String f0(T t) {
            return g0(t, null);
        }

        @Override // com.p7700g.p99005.z44
        public boolean g() {
            return this.z;
        }

        public String g0(T t, CharSequence charSequence) {
            int Q = Q(t, charSequence);
            StringBuilder sb = new StringBuilder(Q);
            A(sb, t, charSequence);
            H(Q, sb);
            return sb.toString();
        }

        @Override // com.p7700g.p99005.y44
        public StringBuilder h(StringBuilder sb, k34 k34Var) {
            E(k34Var, sb);
            return sb;
        }

        @Override // com.p7700g.p99005.z44
        public f34.n.b o() {
            return this.t;
        }

        @Override // com.p7700g.p99005.z44
        public int p() {
            return this.w;
        }

        @Override // com.p7700g.p99005.z44
        public String t() {
            return this.v;
        }

        @Override // com.p7700g.p99005.z44
        public int u(int i) {
            return this.u ? -1 : 0;
        }

        public StringBuilder y(StringBuilder sb, T t) {
            return A(sb, t, null);
        }

        public b(int i, Character ch, boolean z, char c) {
            this.t = s;
            this.v = "";
            this.B = "";
            this.w = i;
            this.x = ch;
            this.y = z;
            this.C = c;
        }
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public static class c<T extends o34> extends b<T> implements l54<T> {
        public static final m14.l.a D = m14.l.a.NETWORK_ONLY;
        public static final int E = 16;
        private m14.l.a F;
        private int[] G;
        private String H;

        public c(int i, Character ch, boolean z) {
            this(i, ch, z, (char) 0);
        }

        public static int q0(o34 o34Var) {
            if (o34Var.C0()) {
                return f24.g4(o34Var.L0().intValue(), 10) + 1;
            }
            return 0;
        }

        @Override // com.p7700g.p99005.l54
        public char a() {
            return this.x.charValue();
        }

        @Override // com.p7700g.p99005.g24.b, com.p7700g.p99005.z44
        public boolean d() {
            return this.F == m14.l.a.ALL;
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: h0 */
        public StringBuilder A(StringBuilder sb, T t, CharSequence charSequence) {
            k0(G(D(B(sb), t), charSequence));
            if (!S() && !d()) {
                i0(sb, t);
            }
            return sb;
        }

        @Override // com.p7700g.p99005.l54
        public int i(T t) {
            int p1 = t.p1();
            if (p1 > 0) {
                return p1 - 1;
            }
            return 0;
        }

        public void i0(StringBuilder sb, o34 o34Var) {
            if (o34Var.C0()) {
                sb.append(j14.P);
                sb.append(o34Var.L0());
            }
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: j0 */
        public int C(int i, StringBuilder sb, T t) {
            Integer f;
            m34 e0 = t.e0(i);
            s04.c i2 = t.m0().i();
            if (!i2.g() && !d() && (f = e0.f()) != null && f.intValue() < e0.A0() && ((!i2.h() || t.I0()) && !e())) {
                if (e0.b1()) {
                    return e0.e(i, this, sb);
                }
                return e0.g(i, this, sb);
            }
            return e0.a(i, this, sb);
        }

        public StringBuilder k0(StringBuilder sb) {
            String n0 = n0();
            if (n0 != null) {
                sb.append(n0);
            }
            return sb;
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: l0 */
        public c<T> clone() {
            c<T> cVar = (c) super.clone();
            int[] iArr = this.G;
            if (iArr != null) {
                cVar.G = (int[]) iArr.clone();
            }
            return cVar;
        }

        public void m0(int i, int i2, int i3) {
            if (this.G == null) {
                this.G = new int[i3];
            }
            this.G[i] = i2;
        }

        @Override // com.p7700g.p99005.l54
        public /* bridge */ /* synthetic */ String n(o34 o34Var) {
            return super.f0(o34Var);
        }

        public String n0() {
            return this.H;
        }

        public int o0() {
            String n0 = n0();
            if (n0 != null) {
                return n0.length();
            }
            return 0;
        }

        public int p0(int i) {
            int[] iArr = this.G;
            if (iArr == null || iArr.length <= i) {
                return 0;
            }
            return iArr[i];
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: r0 */
        public int P(T t) {
            int N = N(t);
            if (!S() && !d()) {
                N += q0(t);
            }
            return M() + o0() + N;
        }

        public void s0(String str) {
            this.H = str;
        }

        public void t0(m14.l.a aVar) {
            this.F = aVar;
        }

        @Override // com.p7700g.p99005.g24.b, com.p7700g.p99005.z44
        public int u(int i) {
            if (this.u) {
                return -1;
            }
            int[] iArr = this.G;
            if (iArr == null || iArr.length <= i) {
                return 0;
            }
            return iArr[i];
        }

        @Override // com.p7700g.p99005.l54
        public /* bridge */ /* synthetic */ String x(o34 o34Var, CharSequence charSequence) {
            return super.g0(o34Var, charSequence);
        }

        public c(int i, Character ch, boolean z, char c) {
            super(i, ch, z, c);
            this.F = D;
            this.H = "";
        }
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface d<S, T> {
        Iterator<T> a(boolean z, boolean z2, S s);
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public interface e<S, T> {
        S a();

        void b(S s, S s2);
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public static class f {
        public y44 a;
    }

    /* compiled from: AddressDivisionGroupingBase.java */
    /* loaded from: classes3.dex */
    public static class g {
        public byte[] a;
        public byte[] b;
        public BigInteger c;
        public BigInteger d;
        public InetAddress e;
    }

    static {
        String str = d14.class.getPackage().getName() + ".IPAddressResources";
        try {
            w = ResourceBundle.getBundle(str);
        } catch (MissingResourceException unused) {
            System.err.println("bundle " + str + " is missing");
        }
    }

    public g24(f24[] f24VarArr) {
        this(f24VarArr, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer A(r24 r24Var) {
        int p1 = r24Var.p1();
        boolean f2 = r24Var.m0().i().f();
        int i = 0;
        int i2 = 0;
        while (i < p1) {
            t24 e0 = r24Var.e0(i);
            Integer X3 = e0.X3();
            if (X3 == null) {
                return null;
            }
            i2 += X3.intValue();
            if (f2 && e0.C0()) {
                return b(i2);
            }
            if (X3.intValue() < e0.A0()) {
                while (true) {
                    i++;
                    if (i < p1) {
                        t24 e02 = r24Var.e0(i);
                        if (!e02.H0()) {
                            return null;
                        }
                        if (f2 && e02.C0()) {
                            return b(i2);
                        }
                    }
                }
            }
            i++;
        }
        return b(i2);
    }

    private /* synthetic */ String H(int i) {
        return e0(i).w3();
    }

    public static void L(f fVar, y44 y44Var) {
        fVar.a = y44Var;
    }

    public static b<o34> O(m14.e eVar) {
        return f24.I3(eVar);
    }

    public static int a(int i, long j, long j2) {
        return f24.h(i, j, j2);
    }

    public static Integer b(int i) {
        return t64.a(i);
    }

    public static Integer c(r24 r24Var) {
        int p1 = r24Var.p1();
        if (p1 <= 0 || (r24Var.m0().i().f() && !r24Var.e0(p1 - 1).C0())) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < p1; i2++) {
            t24 e0 = r24Var.e0(i2);
            Integer f2 = e0.f();
            if (f2 != null) {
                return t64.a(f2.intValue() + i);
            }
            i += e0.A0();
        }
        return null;
    }

    public static void d(i24 i24Var, int i) throws y14 {
        if (i < 0 || i > i24Var.A0()) {
            throw new y14(i24Var, i);
        }
    }

    public static boolean e(r24 r24Var, int i) {
        d(r24Var, i);
        boolean f2 = r24Var.m0().i().f();
        if (f2 && r24Var.C0() && r24Var.K3().intValue() <= i) {
            return true;
        }
        int p1 = r24Var.p1();
        int i2 = 0;
        int i3 = 0;
        while (i2 < p1) {
            t24 e0 = r24Var.e0(i2);
            int A0 = e0.A0() + i3;
            if (i < A0) {
                if (e0.B3(Math.max(0, i - i3))) {
                    if (f2 && e0.C0()) {
                        return true;
                    }
                    for (int i4 = i2 + 1; i4 < p1; i4++) {
                        t24 e02 = r24Var.e0(i4);
                        if (!e02.H0()) {
                            return false;
                        }
                        if (f2 && e02.C0()) {
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
            i2++;
            i3 = A0;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(r24 r24Var, int i) {
        d(r24Var, i);
        boolean f2 = r24Var.m0().i().f();
        if (f2 && r24Var.C0() && r24Var.K3().intValue() < i) {
            return false;
        }
        int p1 = r24Var.p1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= p1) {
                break;
            }
            t24 e0 = r24Var.e0(i2);
            int A0 = e0.A0() + i3;
            if (i >= A0) {
                if (e0.z3()) {
                    return false;
                }
                i2++;
                i3 = A0;
            } else if (!e0.Y2(Math.max(0, i - i3))) {
                return false;
            } else {
                if (f2 && e0.C0()) {
                    return true;
                }
                for (int i4 = i2 + 1; i4 < p1; i4++) {
                    t24 e02 = r24Var.e0(i4);
                    if (!e02.H0()) {
                        return false;
                    }
                    if (f2 && e02.C0()) {
                        return true;
                    }
                }
            }
        }
    }

    public static <S extends e24, T> v44<S, T> g(S s2, Predicate<e<S, T>> predicate, d<S, T> dVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
        return new a(s2, predicate, dVar, function, predicate2, toLongFunction);
    }

    public static <T extends q04> x44<T> h(T t2, Predicate<e<T, T>> predicate, d<T, T> dVar, Function<T, BigInteger> function, Predicate<T> predicate2, ToLongFunction<T> toLongFunction) {
        return new p24(t2, predicate, dVar, function, predicate2, toLongFunction);
    }

    private static byte[] i(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (i2 + 7) >> 3;
        if (bArr != null && bArr.length >= i3 + i) {
            System.arraycopy(bArr2, 0, bArr, i, i3);
            return bArr;
        } else if (i > 0) {
            byte[] bArr3 = new byte[i3 + i];
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, 0, Math.min(i, bArr.length));
            }
            System.arraycopy(bArr2, 0, bArr3, i, bArr2.length);
            return bArr3;
        } else {
            return (byte[]) bArr2.clone();
        }
    }

    public static y44 o(f fVar) {
        return fVar.a;
    }

    public static String x(String str) {
        ResourceBundle resourceBundle = w;
        if (resourceBundle != null) {
            try {
                return resourceBundle.getString(str);
            } catch (MissingResourceException unused) {
                return str;
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public /* synthetic */ int A0() {
        return h24.a(this);
    }

    @Override // com.p7700g.p99005.l24
    public byte[] A3() {
        return (byte[]) B().clone();
    }

    public byte[] B() {
        if (D()) {
            g gVar = this.x;
            byte[] m = m(false);
            gVar.b = m;
            if (z3()) {
                return m;
            }
            gVar.a = m;
            return m;
        }
        g gVar2 = this.x;
        byte[] bArr = gVar2.b;
        if (bArr == null) {
            if (!z3()) {
                bArr = gVar2.a;
                if (bArr != null) {
                    gVar2.b = bArr;
                } else {
                    byte[] m2 = m(false);
                    gVar2.b = m2;
                    gVar2.a = m2;
                    return m2;
                }
            } else {
                byte[] m3 = m(false);
                gVar2.b = m3;
                return m3;
            }
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean B3(int i) {
        return k24.c(this, i);
    }

    @Override // com.p7700g.p99005.i24
    public boolean C0() {
        return L0() != null;
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger C1() {
        if (D()) {
            g gVar = this.x;
            BigInteger bigInteger = new BigInteger(1, B());
            gVar.d = bigInteger;
            if (z3()) {
                return bigInteger;
            }
            gVar.c = bigInteger;
            return bigInteger;
        }
        g gVar2 = this.x;
        BigInteger bigInteger2 = gVar2.d;
        if (bigInteger2 == null) {
            if (!z3()) {
                BigInteger bigInteger3 = gVar2.c;
                if (bigInteger3 != null) {
                    gVar2.d = bigInteger3;
                    return bigInteger3;
                }
                BigInteger bigInteger4 = new BigInteger(1, B());
                gVar2.d = bigInteger4;
                gVar2.c = bigInteger4;
                return bigInteger4;
            }
            BigInteger bigInteger5 = new BigInteger(1, B());
            gVar2.d = bigInteger5;
            return bigInteger5;
        }
        return bigInteger2;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] C2(byte[] bArr, int i) {
        return i(bArr, i, n(), A0());
    }

    public boolean D() {
        if (this.x == null) {
            synchronized (this) {
                if (this.x == null) {
                    this.x = new g();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void E(Integer num, BigInteger bigInteger) {
        if (num == null) {
            num = t;
        }
        this.z = num;
        this.B = bigInteger;
    }

    public boolean G(g24 g24Var) {
        int p1 = p1();
        if (p1 != g24Var.p1()) {
            return false;
        }
        for (int i = 0; i < p1; i++) {
            if (!e0(i).equals(g24Var.e0(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.i24
    public /* synthetic */ int G2() {
        return h24.g(this);
    }

    @Override // com.p7700g.p99005.l24
    public boolean H0() {
        int p1 = p1();
        for (int i = 0; i < p1; i++) {
            if (!e0(i).H0()) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ String I(int i) {
        return e0(i).w3();
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.o34
    public boolean I0() {
        return C0() && B3(L0().intValue());
    }

    public void J(byte[] bArr) {
        if (this.x == null) {
            this.x = new g();
        }
        this.x.a = bArr;
    }

    @Override // com.p7700g.p99005.i24
    public Integer L0() {
        return this.z;
    }

    public void M(InetAddress inetAddress) {
        if (this.x == null) {
            this.x = new g();
        }
        this.x.e = inetAddress;
    }

    @Override // com.p7700g.p99005.i24
    public /* synthetic */ boolean M0() {
        return h24.i(this);
    }

    public void N(byte[] bArr) {
        if (this.x == null) {
            this.x = new g();
        }
        this.x.b = bArr;
    }

    @Override // com.p7700g.p99005.l24
    public boolean P3() {
        int p1 = p1();
        for (int i = 0; i < p1; i++) {
            if (!e0(i).P3()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.l24
    public boolean V1() {
        int p1 = p1();
        for (int i = 0; i < p1; i++) {
            if (!e0(i).V1()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.i24
    public BigInteger X1() {
        BigInteger bigInteger = this.C;
        if (bigInteger == null) {
            Integer L0 = L0();
            if (L0 != null && L0.intValue() < A0()) {
                BigInteger y = y();
                this.C = y;
                return y;
            }
            BigInteger count = getCount();
            this.C = count;
            return count;
        }
        return bigInteger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        continue;
     */
    @Override // com.p7700g.p99005.l24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer X3() {
        int p1 = p1();
        int i = 0;
        int i2 = 0;
        while (i < p1) {
            f24 e0 = e0(i);
            Integer X3 = e0.X3();
            if (X3 == null) {
                return null;
            }
            i2 += X3.intValue();
            if (X3.intValue() < e0.A0()) {
                while (true) {
                    i++;
                    if (i < p1) {
                        if (!e0(i).H0()) {
                            return null;
                        }
                    }
                }
            }
            i++;
        }
        return b(i2);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean Y2(int i) {
        return k24.d(this, i);
    }

    @Override // com.p7700g.p99005.i24
    public /* synthetic */ BigInteger Z2(int i) {
        return h24.b(this, i);
    }

    @Override // com.p7700g.p99005.i24
    public boolean b1() {
        return C0() && Y2(L0().intValue());
    }

    @Override // com.p7700g.p99005.l24
    public int b3() {
        int p1 = p1();
        int A0 = A0();
        for (int i = p1 - 1; i >= 0; i--) {
            f24 e0 = e0(i);
            int A02 = e0.A0();
            int b3 = e0.b3();
            if (b3 == A02) {
                return A0;
            }
            A0 -= A02;
            if (b3 != 0) {
                return A0 + b3;
            }
        }
        return A0;
    }

    @Override // com.p7700g.p99005.l24, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(l24 l24Var) {
        int m4;
        m4 = m4(l24Var);
        return m4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g24) {
            return ((g24) obj).G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.i24
    public /* synthetic */ int f4(i24 i24Var) {
        return h24.h(this, i24Var);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int g3() {
        return k24.e(this);
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger getCount() {
        BigInteger bigInteger = this.B;
        if (bigInteger == null) {
            BigInteger p = p();
            this.B = p;
            return p;
        }
        return bigInteger;
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getValue() {
        BigInteger bigInteger;
        if (D() || (bigInteger = this.x.c) == null) {
            g gVar = this.x;
            BigInteger bigInteger2 = new BigInteger(1, n());
            gVar.c = bigInteger2;
            return bigInteger2;
        }
        return bigInteger;
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public /* synthetic */ BigInteger h1(int i) {
        return h24.f(this, i);
    }

    public int hashCode() {
        int i = this.D;
        if (i == 0) {
            int p1 = p1();
            int i2 = 1;
            for (int i3 = 0; i3 < p1; i3++) {
                f24 e0 = e0(i3);
                BigInteger value = e0.getValue();
                BigInteger C1 = e0.C1();
                do {
                    long longValue = value.longValue();
                    long longValue2 = C1.longValue();
                    value = value.shiftRight(64);
                    C1 = C1.shiftRight(64);
                    i2 = a(i2, longValue, longValue2);
                } while (!C1.equals(BigInteger.ZERO));
            }
            this.D = i2;
            return i2;
        }
        return i;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] l1(byte[] bArr) {
        return C2(bArr, 0);
    }

    public abstract byte[] m(boolean z);

    @Override // com.p7700g.p99005.l24
    public byte[] m1() {
        return (byte[]) n().clone();
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int m4(l24 l24Var) {
        return k24.a(this, l24Var);
    }

    public byte[] n() {
        byte[] bArr;
        if (D() || (bArr = this.x.a) == null) {
            g gVar = this.x;
            byte[] m = m(true);
            gVar.a = m;
            return m;
        }
        return bArr;
    }

    public BigInteger p() {
        return h24.c(this);
    }

    @Override // com.p7700g.p99005.l34
    public int p1() {
        return u().length;
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    /* renamed from: t */
    public f24 e0(int i) {
        return u()[i];
    }

    @Override // com.p7700g.p99005.l24
    public byte[] t4(byte[] bArr) {
        return C2(bArr, 0);
    }

    public String toString() {
        return Arrays.asList(u()).toString();
    }

    public f24[] u() {
        return this.y;
    }

    @Override // com.p7700g.p99005.i24
    public String[] u1() {
        String[] strArr = new String[p1()];
        Arrays.setAll(strArr, new IntFunction() { // from class: com.p7700g.p99005.c24
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return g24.this.e0(i).w3();
            }
        });
        return strArr;
    }

    @Override // com.p7700g.p99005.l24
    public boolean v1() {
        int p1 = p1();
        for (int i = 0; i < p1; i++) {
            if (!e0(i).v1()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] v3(byte[] bArr, int i) {
        return i(bArr, i, B(), A0());
    }

    @Override // com.p7700g.p99005.l24
    public boolean x1() {
        int p1 = p1();
        for (int i = 0; i < p1; i++) {
            if (!e0(i).x1()) {
                return false;
            }
        }
        return true;
    }

    public BigInteger y() {
        return h24.e(this);
    }

    @Override // com.p7700g.p99005.l24
    public boolean z3() {
        Boolean bool = this.A;
        if (bool == null) {
            for (int p1 = p1() - 1; p1 >= 0; p1--) {
                if (e0(p1).z3()) {
                    this.A = Boolean.TRUE;
                    return true;
                }
            }
            this.A = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    public g24(f24[] f24VarArr, boolean z) {
        this.y = f24VarArr;
        if (z) {
            for (f24 f24Var : f24VarArr) {
                if (f24Var == null) {
                    throw new NullPointerException(x("ipaddress.error.null.segment"));
                }
            }
        }
    }
}