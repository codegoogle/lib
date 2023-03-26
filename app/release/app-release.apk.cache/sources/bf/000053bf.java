package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import com.p7700g.p99005.w64;
import java.io.Serializable;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: IPAddressProvider.java */
/* loaded from: classes3.dex */
public interface o64 extends Serializable {
    public static final l g0 = new a(i.INVALID);
    public static final l h0 = new b(null);
    public static final l i0 = new c(i.EMPTY);

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public class a extends l {
        public a(i iVar) {
            super(iVar);
        }

        @Override // com.p7700g.p99005.o64.l, com.p7700g.p99005.o64
        public boolean T2() {
            return true;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public class b extends l {
        public b(i iVar) {
            super(iVar);
        }

        @Override // com.p7700g.p99005.o64.l, com.p7700g.p99005.o64
        public boolean a4() {
            return true;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public class c extends l {
        public c(i iVar) {
            super(iVar);
        }

        @Override // com.p7700g.p99005.o64.l, com.p7700g.p99005.o64
        public boolean r3() {
            return true;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            j14.b.values();
            int[] iArr = new int[2];
            a = iArr;
            try {
                iArr[j14.b.IPV4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j14.b.IPV6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static abstract class e extends m {
        private static final long y = 4;
        public final Integer A;
        public final j14.b z;

        public e(Integer num, s14 s14Var) {
            this(num, null, s14Var);
        }

        @Override // com.p7700g.p99005.o64.g, com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 Q1() {
            if (this.z == null) {
                return null;
            }
            return super.Q1();
        }

        @Override // com.p7700g.p99005.o64.g, com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public Integer c2() {
            return this.A;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean o3() {
            return v4() && this.z.f();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean v2() {
            return v4() && this.z.g();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean v4() {
            return this.z != null;
        }

        @Override // com.p7700g.p99005.o64.g, com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 w1() {
            if (this.z == null) {
                return null;
            }
            return super.w1();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14.b w2() {
            return this.z;
        }

        public e(Integer num, j14.b bVar, s14 s14Var) {
            super(s14Var);
            this.A = num;
            this.z = bVar;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static abstract class g extends h {
        private static final long u = 4;

        private w64.d<?> g() {
            w64.d<?> dVar = this.t;
            if (dVar == null) {
                synchronized (this) {
                    dVar = this.t;
                    if (dVar == null) {
                        dVar = f();
                        this.t = dVar;
                    }
                }
            }
            return dVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.p7700g.p99005.j14] */
        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 Q1() {
            return g().g();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public Integer c2() {
            w1();
            return super.c2();
        }

        public abstract w64.d<?> f();

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 n1(j14.b bVar) {
            w1();
            return super.n1(bVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.p7700g.p99005.j14] */
        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 w1() {
            return g().f();
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static class h implements o64 {
        private static final long s = 4;
        public w64.d<?> t;

        public /* synthetic */ h(j14 j14Var, j14 j14Var2, a aVar) {
            this(j14Var, j14Var2);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean C4() {
            return n64.l(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean E1() {
            return n64.k(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ int F3(o64 o64Var) {
            return n64.z(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ r24 L1() {
            return n64.c(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean M0() {
            return n64.s(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean M1(o64 o64Var) {
            return n64.A(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean M3(o64 o64Var) {
            return n64.x(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean P2(o64 o64Var) {
            return n64.a(this, o64Var);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.p7700g.p99005.j14] */
        @Override // com.p7700g.p99005.o64
        public j14 Q1() {
            return this.t.g();
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean T2() {
            return n64.j(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ q14 V3() {
            return n64.h(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ int W2() {
            return n64.B(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ s14 Y0() {
            return n64.d(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean Y3(String str) {
            return n64.w(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean a4() {
            return n64.t(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean b4() {
            return n64.i(this);
        }

        @Override // com.p7700g.p99005.o64
        public Integer c2() {
            return w1().K3();
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ j14 e3() {
            return n64.f(this);
        }

        @Override // com.p7700g.p99005.o64
        public i getType() {
            return i.a(w2());
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean k2(String str) {
            return n64.b(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean m2() {
            return n64.r(this);
        }

        @Override // com.p7700g.p99005.o64
        public j14 n1(j14.b bVar) {
            if (bVar.equals(w2())) {
                return w1();
            }
            return null;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean o1(String str) {
            return n64.y(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public boolean o3() {
            return w1().J4();
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean p2(o64 o64Var) {
            return n64.u(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean r3() {
            return n64.m(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean r4() {
            return n64.q(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean t1(o64 o64Var) {
            return n64.v(this, o64Var);
        }

        public String toString() {
            return String.valueOf(w1());
        }

        @Override // com.p7700g.p99005.o64
        public boolean v2() {
            return w1().L4();
        }

        @Override // com.p7700g.p99005.o64
        public boolean v4() {
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.p7700g.p99005.j14] */
        @Override // com.p7700g.p99005.o64
        public j14 w1() {
            return this.t.f();
        }

        @Override // com.p7700g.p99005.o64
        public j14.b w2() {
            return w1().Z0();
        }

        public h() {
        }

        private h(j14 j14Var, j14 j14Var2) {
            this.t = new w64.d<>(j14Var, j14Var2);
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public enum i {
        INVALID,
        EMPTY,
        IPV4,
        IPV6,
        PREFIX_ONLY,
        ALL;

        public static i a(j14.b bVar) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return null;
                }
                return IPV6;
            }
            return IPV4;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static class j extends m {
        private static final long y = 4;
        private final CharSequence z;

        public j(s14 s14Var) {
            this(null, s14Var);
        }

        @Override // com.p7700g.p99005.o64.g, com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public Integer c2() {
            return null;
        }

        @Override // com.p7700g.p99005.o64.g
        public w64.d<j14> f() {
            j14 A;
            InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
            boolean z = loopbackAddress instanceof Inet6Address;
            CharSequence charSequence = this.z;
            if (charSequence != null && charSequence.length() > 0 && z) {
                A = (j14) this.x.p().m0().u().m(loopbackAddress.getAddress(), this.z);
            } else if (z) {
                A = this.x.p().m0().A();
            } else {
                A = this.x.o().m0().A();
            }
            return new w64.d<>(A);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public i getType() {
            return i.a(w2());
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.p7700g.p99005.j14] */
        /* JADX WARN: Type inference failed for: r4v6, types: [com.p7700g.p99005.j14] */
        @Override // com.p7700g.p99005.o64.m
        public j14 i(j14.b bVar) {
            w64.d<?> dVar = this.t;
            if (dVar != null && bVar.equals(dVar.f().Z0())) {
                return this.t.f();
            }
            l14 m0 = bVar.f() ? this.x.o().m0() : this.x.p().m0();
            j14 A = m0.A();
            CharSequence charSequence = this.z;
            return (charSequence == null || charSequence.length() <= 0 || !bVar.g()) ? A : (j14) m0.g().m(A.m1(), this.z);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean o3() {
            return w1().J4();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean v2() {
            return w1().L4();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean v4() {
            return true;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14.b w2() {
            return w1().Z0();
        }

        public j(CharSequence charSequence, s14 s14Var) {
            super(s14Var);
            this.z = charSequence;
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static class k extends e {
        private static final long B = 4;

        public k(Integer num, s14 s14Var) {
            super(num, s14Var);
        }

        private j14 m(j14.b bVar, int i, boolean z) {
            l14 m0 = bVar.f() ? this.x.o().m0() : this.x.p().m0();
            return z ? m0.D(i) : m0.G(i, false);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public int F3(o64 o64Var) throws t14 {
            int ordinal;
            int ordinal2;
            if (this == o64Var) {
                return 0;
            }
            if (this.z == null) {
                i type = o64Var.getType();
                i iVar = i.PREFIX_ONLY;
                if (type == iVar) {
                    return o64Var.c2().intValue() - c2().intValue();
                }
                ordinal = iVar.ordinal();
                ordinal2 = o64Var.getType().ordinal();
            } else {
                j14 w1 = o64Var.w1();
                if (w1 != null) {
                    return w1().m4(w1);
                }
                ordinal = i.a(this.z).ordinal();
                ordinal2 = o64Var.getType().ordinal();
            }
            return ordinal - ordinal2;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean M1(o64 o64Var) {
            if (o64Var == this) {
                return true;
            }
            if (this.z == null) {
                return o64Var.getType() == i.PREFIX_ONLY && o64Var.c2().intValue() == c2().intValue();
            }
            return n64.A(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public int W2() {
            if (this.z == null) {
                return c2().intValue();
            }
            return w1().hashCode();
        }

        @Override // com.p7700g.p99005.o64.g
        public w64.d<?> f() {
            return new w64.d<>(m(this.z, c2().intValue(), true), m(this.z, c2().intValue(), false));
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public i getType() {
            j14.b bVar = this.z;
            if (bVar != null) {
                return i.a(bVar);
            }
            return i.PREFIX_ONLY;
        }

        @Override // com.p7700g.p99005.o64.m
        public j14 i(j14.b bVar) {
            return m(bVar, c2().intValue(), true);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean m2() {
            return this.z == null;
        }

        public k(Integer num, j14.b bVar, s14 s14Var) {
            super(num, bVar, s14Var);
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static abstract class l implements o64 {
        private static final long s = 4;
        private i t;

        public l(i iVar) {
            this.t = iVar;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean C4() {
            return n64.l(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean E1() {
            return n64.k(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ int F3(o64 o64Var) {
            return n64.z(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ r24 L1() {
            return n64.c(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean M0() {
            return n64.s(this);
        }

        @Override // com.p7700g.p99005.o64
        public boolean M1(o64 o64Var) {
            if (this == o64Var) {
                return true;
            }
            return (o64Var instanceof l) && getType() == ((l) o64Var).getType();
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean M3(o64 o64Var) {
            return n64.x(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean P2(o64 o64Var) {
            return n64.a(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public j14 Q1() {
            return null;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean T2() {
            return n64.j(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ q14 V3() {
            return n64.h(this);
        }

        @Override // com.p7700g.p99005.o64
        public int W2() {
            return Objects.hashCode(getType());
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ s14 Y0() {
            return n64.d(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean Y3(String str) {
            return n64.w(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean a4() {
            return n64.t(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean b4() {
            return n64.i(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Integer c2() {
            return n64.g(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ j14 e3() {
            return n64.f(this);
        }

        @Override // com.p7700g.p99005.o64
        public i getType() {
            return this.t;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean k2(String str) {
            return n64.b(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean m2() {
            return n64.r(this);
        }

        @Override // com.p7700g.p99005.o64
        public j14 n1(j14.b bVar) {
            return null;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean o1(String str) {
            return n64.y(this, str);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean o3() {
            return n64.o(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean p2(o64 o64Var) {
            return n64.u(this, o64Var);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean r3() {
            return n64.m(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean r4() {
            return n64.q(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ Boolean t1(o64 o64Var) {
            return n64.v(this, o64Var);
        }

        public String toString() {
            return String.valueOf(getType());
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean v2() {
            return n64.p(this);
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ boolean v4() {
            return n64.n(this);
        }

        @Override // com.p7700g.p99005.o64
        public j14 w1() {
            return null;
        }

        @Override // com.p7700g.p99005.o64
        public /* synthetic */ j14.b w2() {
            return n64.e(this);
        }
    }

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static abstract class m extends g {
        private static final long v = 4;
        public j14[] w;
        public final s14 x;

        public m(s14 s14Var) {
            this.x = s14Var;
        }

        private j14 h(j14.b bVar, int i) {
            j14[] j14VarArr = this.w;
            j14 j14Var = j14VarArr[i];
            if (j14Var == null) {
                j14 i2 = i(bVar);
                j14VarArr[i] = i2;
                return i2;
            }
            return j14Var;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public s14 Y0() {
            return this.x;
        }

        public abstract j14 i(j14.b bVar);

        @Override // com.p7700g.p99005.o64.g, com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 n1(j14.b bVar) {
            j14 h;
            j14 h2;
            int ordinal = bVar.ordinal();
            j14[] j14VarArr = this.w;
            if (j14VarArr == null) {
                synchronized (this) {
                    if (this.w == null) {
                        j14.b.values();
                        j14[] j14VarArr2 = new j14[2];
                        this.w = j14VarArr2;
                        h2 = i(bVar);
                        j14VarArr2[ordinal] = h2;
                    } else {
                        h2 = h(bVar, ordinal);
                    }
                }
                return h2;
            }
            j14 j14Var = j14VarArr[ordinal];
            if (j14Var == null) {
                synchronized (this) {
                    h = h(bVar, ordinal);
                }
                return h;
            }
            return j14Var;
        }
    }

    boolean C4();

    boolean E1();

    int F3(o64 o64Var) throws t14;

    r24 L1() throws t14;

    boolean M0();

    boolean M1(o64 o64Var) throws t14;

    Boolean M3(o64 o64Var);

    Boolean P2(o64 o64Var);

    j14 Q1() throws t14;

    boolean T2();

    q14 V3();

    int W2() throws t14;

    s14 Y0();

    Boolean Y3(String str);

    boolean a4();

    boolean b4();

    Integer c2();

    j14 e3();

    i getType();

    Boolean k2(String str);

    boolean m2();

    j14 n1(j14.b bVar) throws t14;

    Boolean o1(String str);

    boolean o3();

    Boolean p2(o64 o64Var);

    boolean r3();

    boolean r4();

    Boolean t1(o64 o64Var);

    boolean v2();

    boolean v4();

    j14 w1() throws t14;

    j14.b w2();

    /* compiled from: IPAddressProvider.java */
    /* loaded from: classes3.dex */
    public static class f extends e {
        private static final long B = 4;
        public e14 C;
        public v64 D;

        public f(v64 v64Var, e14 e14Var, s14 s14Var) {
            super(v64Var.f(), s14Var);
            this.C = e14Var;
            this.D = v64Var;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean E1() {
            return this.z == null;
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public r24 L1() throws t14 {
            if (E1()) {
                return null;
            }
            l14 m0 = this.z.f() ? this.x.o().m0() : this.x.p().m0();
            j14 e3 = e3();
            if (e3 != null && e3.E3(true) == null) {
                Integer E3 = e3.E3(false);
                if (E3 != null) {
                    return m0.x(E3.intValue()).i0();
                }
                throw new t14(w1(), e3, "ipaddress.error.maskMismatch");
            } else if (this.z.f()) {
                return new i34(new g34[]{new g34(0L, -1L, 32, 10, m0, this.D.f())}, m0);
            } else {
                if (this.z.g()) {
                    byte[] bArr = new byte[16];
                    Arrays.fill(bArr, (byte) -1);
                    return new y24(new x24[]{new x24(new byte[16], bArr, 128, 16, m0, this.D.f())}, m0);
                }
                return null;
            }
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public boolean M0() {
            return !E1();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public Boolean P2(o64 o64Var) {
            if (o64Var.T2()) {
                return Boolean.FALSE;
            }
            j14.b bVar = this.z;
            if (bVar == null) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(bVar == o64Var.w2());
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public q14 V3() {
            if (E1()) {
                return null;
            }
            j14 e3 = e3();
            if (e3 != null && e3.E3(true) == null) {
                j14 O4 = w64.O4(this.z, u64.u, null, this.x);
                return O4.m().M5(O4.o().V4(e3));
            }
            return n64.h(this);
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public int W2() {
            if (this.z == null) {
                return n04.A.hashCode();
            }
            return super.hashCode();
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public j14 e3() {
            return this.D.g();
        }

        @Override // com.p7700g.p99005.o64.g
        public w64.d<?> f() {
            v64 v64Var = this.D;
            v64 v64Var2 = u64.u;
            if (v64Var.equals(v64Var2)) {
                return new w64.d<>(w64.O4(this.z, this.D, this.C, this.x));
            }
            j14 O4 = w64.O4(this.z, this.D, this.C, this.x);
            j14.b bVar = this.z;
            if (this.D.m() != null) {
                v64Var2 = new v64(this.D.m());
            }
            return new w64.d<>(O4, w64.O4(bVar, v64Var2, this.C, this.x));
        }

        @Override // com.p7700g.p99005.o64.h, com.p7700g.p99005.o64
        public i getType() {
            j14.b bVar = this.z;
            if (bVar != null) {
                return i.a(bVar);
            }
            return i.ALL;
        }

        @Override // com.p7700g.p99005.o64.m
        public j14 i(j14.b bVar) {
            return w64.O4(bVar, this.D, this.C, this.x);
        }

        public f(v64 v64Var, j14.b bVar, e14 e14Var, s14 s14Var) {
            super(v64Var.f(), bVar, s14Var);
            this.C = e14Var;
            this.D = v64Var;
        }
    }
}