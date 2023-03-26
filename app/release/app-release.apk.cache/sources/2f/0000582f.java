package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.bc4;
import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.i34;
import com.p7700g.p99005.i54;
import com.p7700g.p99005.il4;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.yb4;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv6AddressSection.java */
/* loaded from: classes3.dex */
public class qi4 extends m14 implements Iterable<qi4> {
    private static final long P = 4;
    private static pi4.a[] Q = new pi4.a[8];
    private static final BigInteger[] R;
    private transient i S;
    private transient f34.k<qi4> T;
    public transient bc4 U;
    public transient n V;
    public final int W;
    private transient i34.c X;
    private transient i34.c Y;

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public class a extends pi4.a {
        private static final long z = 4;
        public final /* synthetic */ int A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pi4 pi4Var, pi4.a.C0226a c0226a, int i) {
            super(pi4Var, c0226a);
            qi4.this = r1;
            this.A = i;
        }

        @Override // com.p7700g.p99005.pi4.a, com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: O4 */
        public qi4 t(ri4[] ri4VarArr, Integer num, boolean z2) {
            return new qi4(ri4VarArr, this.A, false, num, z2);
        }

        @Override // com.p7700g.p99005.pi4.a, com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: Y4 */
        public qi4 u(ri4[] ri4VarArr) {
            return m0().u().Z4(ri4VarArr, this.A);
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            c.b.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[c.b.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.b.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.b.NO_HOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.b.COVERED_BY_HOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class c {
        public final boolean a;
        public final a b;
        public final b c;

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public enum a {
            HOST_PREFERRED,
            MIXED_PREFERRED,
            ZEROS_OR_HOST,
            ZEROS;

            public boolean f() {
                return this != ZEROS;
            }
        }

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public enum b {
            NO,
            NO_HOST,
            COVERED_BY_HOST,
            YES;

            public boolean a(qi4 qi4Var) {
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2 && qi4Var.C0()) {
                            int i = 6 - qi4Var.W;
                            return qi4Var.V0() - Math.max(i, 0) <= 0 || qi4Var.u2() * i >= qi4Var.K3().intValue();
                        }
                        return true;
                    }
                    return !qi4Var.C0();
                }
                return false;
            }
        }

        public c(boolean z, a aVar) {
            this(z, aVar, b.YES);
        }

        public c(boolean z, a aVar, b bVar) {
            this.a = z;
            this.b = aVar;
            this.c = bVar == null ? b.YES : bVar;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class d extends qi4 {
        private static final long Z = 4;
        private final m14 u0;

        public d(m14 m14Var, ri4[] ri4VarArr, int i) {
            super(ri4VarArr, i, false);
            this.u0 = m14Var;
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 A2(int i, boolean z) {
            return super.A2(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ n14 A5(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 A7() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 B5() {
            return super.a2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ x04 D0(int i) {
            return super.D0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 E5() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 F2() {
            return super.e5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 F5() {
            return super.e2();
        }

        @Override // com.p7700g.p99005.i34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.o34
        public boolean I0() {
            return this.u0.I0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 I2(int i) {
            return super.y7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 J0(int i, int i2) {
            return super.J0(i, i2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 J5() {
            return super.P1();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 L3() {
            return super.p7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ x04[] N0() {
            return super.N0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34
        public /* bridge */ /* synthetic */ h34 N4(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 O0() {
            return super.O0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 O3() {
            return super.z7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ n14[] O5() {
            return super.O5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 P1() {
            return super.P1();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14[] Q0() {
            return super.Q0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 Q3(int i) {
            return super.Q3(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 S6() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14.d U5() {
            return super.U5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 U6(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 V6(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W4(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W5() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W6() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 X4(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 X6() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Y4(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Y6() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 Z3() {
            return super.x7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Z4(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 a2() {
            return super.a2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 a6(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 b6(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 b7(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 c5(int i) throws y14 {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 c7(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 d2(int i) {
            return super.q7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34
        public /* bridge */ /* synthetic */ e34 d3(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 d5() {
            return super.g2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 d7(int i, boolean z, boolean z2) {
            return super.d7(i, z, z2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ j24 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 e1() {
            return super.t5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 e2() {
            return super.e2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 e5() {
            return super.e5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 g0(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 g2() {
            return super.g2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14[] i1() {
            return super.i1();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 i2() {
            return super.i2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 i4(int i) throws y14 {
            return super.u7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 l0(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
        public /* bridge */ /* synthetic */ s04 m0() {
            return super.m0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 o2() {
            return super.o2();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 p7() {
            return super.p7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 q7(int i) {
            return super.q7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
        public /* bridge */ /* synthetic */ v44 spliterator() {
            return super.spliterator();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
        public /* bridge */ /* synthetic */ f24 t(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 t5() {
            return super.t5();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 t7() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 u7(int i) {
            return super.u7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 x7() {
            return super.x7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 y7(int i) {
            return super.y7(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 z0(int i) {
            return super.z0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 z4(int i) {
            return super.z4(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 z7() {
            return super.z7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ n14 D0(int i) {
            return super.D0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 J0(int i, int i2) {
            return super.J0(i, i2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ n14[] N0() {
            return super.N0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 O0() {
            return super.O0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ t24 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 g0(long j) throws c14 {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 l0(long j) throws c14 {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
        public /* bridge */ /* synthetic */ l14 m0() {
            return super.m0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 z0(int i) {
            return super.z0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ k34 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 g0(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 l0(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.qi4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ m34 e0(int i) {
            return super.t(i);
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class e extends f34.k<ni4> {
        public Inet6Address e;
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class f extends h54<qi4, m> {
        private final CharSequence d;

        public f(qi4 qi4Var, m mVar, CharSequence charSequence) {
            super(qi4Var, mVar);
            this.d = charSequence;
        }

        @Override // com.p7700g.p99005.h54
        public String b() {
            if (this.c == null) {
                this.c = ((m) this.b).g0((qi4) this.a, this.d);
            }
            return this.c;
        }

        public boolean e() {
            return ((m) this.b).z0(this.a);
        }

        @Override // com.p7700g.p99005.h54
        /* renamed from: f */
        public k a(boolean z, p54 p54Var) {
            return new k(this, p54Var);
        }

        public boolean g() {
            return ((m) this.b).E0(this.a);
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class g extends k54<qi4, m, f> {
        private final CharSequence u;

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public class a extends k54<qi4, m, f>.a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a() {
                super();
                g.this = r1;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public f next() {
                return new f((qi4) g.this.s, (m) this.s.next(), g.this.u);
            }
        }

        public g(qi4 qi4Var, CharSequence charSequence) {
            super(qi4Var);
            this.u = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a();
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class h extends m14.c {
        public static final int f = 2;
        public static final int g = 4;
        public static final int h = 256;
        public static final int i = 768;
        public static final int j = 1792;
        public static final int k = 3840;
        public static final int l = 7936;
        public static final int m = 65536;
        public static final h n = new h(3861, new bc4.e(17));
        public static final h o = new h(69431, new bc4.e(49), null, new bc4.e(831));
        public static final h p = new h(1793);
        public final bc4.e q;
        public final bc4.e r;
        public final yb4.a s;

        public h(int i2) {
            this(i2, null, null, null);
        }

        public static h c(m14.c cVar) {
            if (cVar instanceof h) {
                return (h) cVar;
            }
            return new h(cVar.e & (-73479));
        }

        public h(int i2, bc4.e eVar) {
            this(i2, eVar, null, null);
        }

        public h(int i2, bc4.e eVar, yb4.a aVar, bc4.e eVar2) {
            super(i2 | (eVar == null ? 0 : 2) | (eVar2 != null ? 65536 : 0));
            if (a(2) && eVar == null) {
                eVar = new bc4.e();
            }
            this.q = eVar;
            if (a(65536)) {
                eVar2 = eVar2 == null ? new bc4.e() : eVar2;
                if (aVar == null) {
                    aVar = j14.R;
                }
            }
            this.r = eVar2;
            this.s = aVar;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class i extends m14.d {
        public static final l A;
        public static final l B;
        public static final l C;
        public static final m14.e D;
        public static final m14.e E;
        public static final l r;
        public static final l s;
        public static final l t;
        public static final l u;
        public static final l v;
        public static final l w;
        public static final l x;
        public static final l y;
        public static final l z;
        public String F;
        public String G;
        public String H;
        public String I;
        public String J;
        public String K;
        public String L;
        public String M;

        static {
            c.a aVar = c.a.ZEROS_OR_HOST;
            c cVar = new c(true, aVar);
            c cVar2 = new c(true, c.a.MIXED_PREFERRED);
            c cVar3 = new c(false, aVar);
            c cVar4 = new c(true, c.a.HOST_PREFERRED);
            c.a aVar2 = c.a.ZEROS;
            c cVar5 = new c(true, aVar2);
            c cVar6 = new c(false, aVar2);
            r = new l.a().C(true).z(cVar2).x();
            l.a m = new l.a().m(true);
            m14.l.a aVar3 = m14.l.a.NETWORK_ONLY;
            s = m.u(new m14.l(aVar3, new f34.n.b(n04.w))).x();
            u = new l.a().z(cVar3).x();
            v = new l.a().q('-').w(ni4.Z).l(ni4.w0).u(new m14.l(aVar3, new f34.n.b(ni4.v0, n04.A, null))).x();
            w = new l.a().z(cVar).x();
            t = new l.a().x();
            m14.l.a aVar4 = m14.l.a.ALL;
            m14.l lVar = new m14.l(aVar4);
            m14.l lVar2 = new m14.l(aVar4, new f34.n.b(n04.D, n04.F));
            y = new l.a().u(lVar).z(cVar6).x();
            x = new l.a().u(lVar).x();
            z = new l.a().u(lVar2).x();
            A = new l.a().u(lVar).z(cVar5).x();
            B = new l.a().z(cVar4).x();
            C = new l.a().o(true).l(ni4.x0).r(true).m(true).q('.').x();
            D = new m14.e.a(85).b(true).i(new f34.n.b(n04.y)).w((char) 167).j();
            E = new m14.e.a(2).f(':').e(j14.Q).b(true).j();
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class j extends i54 {

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends i54.b<qi4, m, f, g, h> {
            public a(qi4 qi4Var, h hVar, CharSequence charSequence) {
                super(qi4Var, hVar, new g(qi4Var, charSequence));
            }

            private void j(int i, int i2, boolean z, int i3) {
                int i4 = i2 + i;
                if (!z) {
                    int i5 = i4 - i;
                    if (i5 > 0) {
                        k(i, i5, i3);
                        return;
                    }
                    return;
                }
                while (i < i4) {
                    int i6 = i + 1;
                    for (int i7 = i6; i7 <= i4; i7++) {
                        k(i, i7 - i, i3);
                    }
                    i = i6;
                }
            }

            private void k(int i, int i2, int i3) {
                m mVar = new m(i, i2);
                int p = mVar.p();
                ArrayList<m> arrayList = new ArrayList<>();
                arrayList.add(mVar);
                if (((h) this.d).a(48)) {
                    int[] c = c(16);
                    int i4 = i2 + i;
                    int V0 = ((qi4) this.c).V0();
                    for (int i5 = 0; i5 < V0; i5++) {
                        if (i5 < i || i5 >= i4) {
                            int size = arrayList.size();
                            for (int i6 = c[i5]; i6 > 0; i6--) {
                                for (int i7 = 0; i7 < size; i7++) {
                                    m l0 = arrayList.get(i7).l0();
                                    l0.m0(i5, i6, ((qi4) this.c).V0());
                                    arrayList.add(l0);
                                }
                                if (!((h) this.d).a(112)) {
                                    break;
                                }
                            }
                        }
                    }
                } else if (((h) this.d).a(16) && h(16, i, i2)) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        m l02 = arrayList.get(i8).l0();
                        l02.J(true);
                        arrayList.add(l02);
                    }
                }
                l(arrayList, p);
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    b(arrayList.get(i9));
                }
            }

            private void l(ArrayList<m> arrayList, int i) {
                if (((h) this.d).a(4) && ((qi4) this.c).S8(i, true)) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        m l0 = arrayList.get(i2).l0();
                        l0.b0(true);
                        arrayList.add(l0);
                    }
                }
            }

            @Override // com.p7700g.p99005.i54.b
            public void a() {
                int V0 = ((qi4) this.c).V0();
                int i = 0;
                k(-1, 0, V0);
                if (((h) this.d).a(h.k)) {
                    i34.c T4 = ((qi4) this.c).T4();
                    while (i < T4.b()) {
                        i34.a a = T4.a(i);
                        j(a.a, a.b, ((h) this.d).a(h.l), V0);
                        i++;
                    }
                } else if (((h) this.d).a(256)) {
                    int[] h8 = ((qi4) this.c).h8(new c(((h) this.d).a(768), c.a.ZEROS));
                    if (h8 != null) {
                        if (((h) this.d).a(h.j)) {
                            int i2 = h8[1];
                            i34.c T42 = ((qi4) this.c).T4();
                            while (i < T42.b()) {
                                i34.a a2 = T42.a(i);
                                int i3 = a2.b;
                                if (i3 == i2) {
                                    j(a2.a, i3, ((h) this.d).a(h.l), V0);
                                }
                                i++;
                            }
                            return;
                        }
                        j(h8[0], h8[1], false, V0);
                    }
                }
            }
        }

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public static class b extends i54.b<n, o, h54<n, o>, p, h> {
            private final CharSequence g;

            public b(n nVar, h hVar, CharSequence charSequence) {
                super(nVar, hVar, new p(nVar, charSequence));
                this.g = charSequence;
            }

            @Override // com.p7700g.p99005.i54.b
            public void a() {
                i54 Fb = ((n) this.c).K.Fb(((h) this.d).q);
                Iterator<f> it = new a(((n) this.c).J, (h) this.d, this.g).e().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    Iterator<h54<?, ?>> it2 = Fb.iterator();
                    while (it2.hasNext()) {
                        b(new o(next, it2.next()));
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.i54
        public void c(k54<?, ?, ?> k54Var) {
            super.c(k54Var);
        }

        @Override // com.p7700g.p99005.i54
        public void d(i54 i54Var) {
            super.d(i54Var);
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class k extends r54<qi4, m, f> {
        public k(f fVar, p54 p54Var) {
            super(fVar, ((qi4) fVar.a).e6(), p54Var);
        }

        @Override // com.p7700g.p99005.r54
        public StringBuilder b(StringBuilder sb, String str) {
            if (((qi4) ((f) this.a).a).e6()) {
                d(sb, str, ((f) this.a).b());
            } else if (((f) this.a).e()) {
                char c = ((f) this.a).c();
                String substring = ((f) this.a).b().substring(0, ((f) this.a).b().length() - 1);
                sb.append('(');
                e(sb, str, c, ((f) this.a).d(), substring);
                sb.append(") AND (");
                a(sb, str, c, ((f) this.a).d() + (7 - ((qi4) ((f) this.a).a).V0()));
                sb.append(')');
            } else if (((f) this.a).g()) {
                char c2 = ((f) this.a).c();
                sb.append('(');
                e(sb, str, c2, ((f) this.a).d() + 1, ((f) this.a).b());
                sb.append(") AND (");
                c(sb, str, c2, ((f) this.a).d() + (8 - ((qi4) ((f) this.a).a).V0()));
                sb.append(')');
            } else {
                e(sb, str, ((f) this.a).c(), ((f) this.a).d() + 1, ((f) this.a).b());
            }
            return sb;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class l extends m14.e {
        public final m14.e n;
        public final c o;

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends m14.e.a {
            private boolean n;
            private m14.e o;
            private c p;

            public a() {
                super(16, ':');
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: A */
            public a m(boolean z) {
                return (a) super.b(z);
            }

            public a B(m14.e eVar) {
                this.n = true;
                this.o = eVar;
                return this;
            }

            public a C(boolean z) {
                this.n = z;
                return this;
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: D */
            public a n(int i) {
                return (a) super.c(i);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: E */
            public a o(boolean z) {
                return (a) super.d(z);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: F */
            public a p(String str) {
                return (a) super.e(str);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: G */
            public a q(Character ch) {
                return (a) super.f(ch);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: H */
            public a r(boolean z) {
                return (a) super.g(z);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: I */
            public a s(boolean z) {
                return (a) super.h(z);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: J */
            public a u(m14.l lVar) {
                return (a) super.u(lVar);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: K */
            public a w(char c) {
                return (a) super.w(c);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: L */
            public l x() {
                return new l(this.d, this.c, this.l, this.b, this.e, this.n, this.o, this.p, this.f, this.m, this.g, this.k, this.h, this.i, this.j);
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: y */
            public a l(String str) {
                return (a) super.l(str);
            }

            public a z(c cVar) {
                this.p = cVar;
                return this;
            }
        }

        public l(int i, boolean z, m14.l.a aVar, f34.n.b bVar, String str, boolean z2, m14.e eVar, c cVar, Character ch, char c, String str2, String str3, boolean z3, boolean z4, boolean z5) {
            super(i, z, aVar, bVar, str, ch, c, str2, str3, z3, z4, z5);
            this.o = cVar;
            if (z2) {
                this.n = eVar == null ? new bc4.h.a().b(z).t(aVar).i(bVar).j() : eVar;
            } else {
                this.n = null;
            }
        }

        public static l b(m14.e eVar) {
            if (eVar instanceof l) {
                return (l) eVar;
            }
            return new l(eVar.d, eVar.c, eVar.l, eVar.b, eVar.e, false, null, null, eVar.f, '%', eVar.g, eVar.k, eVar.h, eVar.i, eVar.j);
        }

        public m c(qi4 qi4Var) {
            m mVar = new m();
            if (this.o != null) {
                int[] i8 = qi4Var.i8(this.o, e());
                if (i8 != null) {
                    boolean z = false;
                    int i = i8[0];
                    int i2 = i8[1];
                    mVar.I = i;
                    mVar.J = i + i2;
                    if (this.o.b.f() && qi4Var.C0() && mVar.J > m14.i3(qi4Var.K3().intValue(), 2, 16)) {
                        z = true;
                    }
                    mVar.K = z;
                }
            }
            mVar.J(this.c);
            mVar.t0(this.l);
            mVar.c0(this.b);
            mVar.Z(this.f);
            mVar.s0(this.k);
            mVar.T(this.g);
            mVar.V(this.h);
            mVar.a0(this.i);
            mVar.d0(this.m);
            mVar.b0(this.j);
            mVar.U(this.d);
            mVar.X(this.e);
            return mVar;
        }

        public boolean d() {
            return this.o == null;
        }

        public boolean e() {
            return this.n != null;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class m extends g24.c<qi4> {
        public int I;
        public int J;
        public boolean K;

        public m() {
            this(-1, 0);
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: A0 */
        public int N(qi4 qi4Var) {
            int p1 = qi4Var.p1();
            int i = 0;
            if (p1 != 0) {
                Character O = O();
                int i2 = 0;
                while (true) {
                    int i3 = this.I;
                    if (i < i3 || i >= this.J) {
                        i2 += C(i, null, qi4Var);
                        i++;
                        if (i >= p1) {
                            break;
                        } else if (O != null) {
                            i2++;
                        }
                    } else {
                        if (i == i3 && O != null) {
                            i2++;
                            if (i == 0) {
                                i2++;
                            }
                        }
                        i++;
                        if (i >= p1) {
                            break;
                        }
                    }
                }
                return i2;
            }
            return 0;
        }

        @Override // com.p7700g.p99005.g24.c
        /* renamed from: B0 */
        public int r0(qi4 qi4Var) {
            int N = N(qi4Var);
            if (!S() && (!d() || this.K)) {
                N += g24.c.q0(qi4Var);
            }
            return M() + o0() + N;
        }

        public int C0(o34 o34Var) {
            int i;
            int p1 = o34Var.p1();
            if (p1 == 0) {
                return 0;
            }
            int i2 = p1 - 1;
            if (E0(o34Var)) {
                int i3 = this.J;
                int i4 = i2 - ((i3 - i) - 1);
                return (this.I == 0 || i3 >= p1) ? i4 + 1 : i4;
            }
            return i2;
        }

        @Override // com.p7700g.p99005.g24.c, com.p7700g.p99005.l54
        /* renamed from: D0 */
        public int i(qi4 qi4Var) {
            return C0(qi4Var);
        }

        public boolean E0(o34 o34Var) {
            return this.I >= 0;
        }

        @Override // com.p7700g.p99005.g24.c
        /* renamed from: u0 */
        public StringBuilder h0(StringBuilder sb, qi4 qi4Var, CharSequence charSequence) {
            k0(G(D(B(sb), qi4Var), charSequence));
            if (!S() && (!d() || this.K)) {
                i0(sb, qi4Var);
            }
            return sb;
        }

        @Override // com.p7700g.p99005.g24.b
        /* renamed from: v0 */
        public StringBuilder D(StringBuilder sb, qi4 qi4Var) {
            int i;
            int p1 = qi4Var.p1();
            if (p1 <= 0) {
                return sb;
            }
            int i2 = p1 - 1;
            Character O = O();
            boolean S = S();
            int i3 = 0;
            while (true) {
                int i4 = S ? i2 - i3 : i3;
                int i5 = this.I;
                if (i4 < i5 || i4 >= (i = this.J)) {
                    C(i4, sb, qi4Var);
                    i3++;
                    if (i3 > i2) {
                        break;
                    } else if (O != null) {
                        sb.append(O);
                    }
                } else {
                    if (S) {
                        i5 = i - 1;
                    }
                    if (i4 == i5 && O != null) {
                        sb.append(O);
                        if (i3 == 0) {
                            sb.append(O);
                        }
                    }
                    i3++;
                    if (i3 > i2) {
                        break;
                    }
                }
            }
            return sb;
        }

        @Override // com.p7700g.p99005.g24.c
        /* renamed from: y0 */
        public m l0() {
            return (m) super.clone();
        }

        public boolean z0(o34 o34Var) {
            return this.J >= o34Var.p1();
        }

        public m(int i, int i2) {
            this(false, i, i2, false, ':', '%');
        }

        private m(boolean z, int i, int i2, boolean z2, char c, char c2) {
            super(16, Character.valueOf(c), z2, c2);
            J(z);
            this.I = i;
            this.J = i + i2;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class n extends i34 {
        private static final long I = 4;
        private final qi4 J;
        private final bc4 K;
        private String L;

        public /* synthetic */ n(qi4 qi4Var, bc4 bc4Var, a aVar) {
            this(qi4Var, bc4Var);
        }

        private static h34[] Y4(qi4 qi4Var, bc4 bc4Var) {
            int V0 = qi4Var.V0();
            int V02 = bc4Var.V0();
            if (((V02 + 1) >> 1) + V0 + qi4Var.W <= 8) {
                n14[] n14VarArr = new n14[V0 + V02];
                qi4Var.m3(0, V0, n14VarArr, 0);
                bc4Var.m3(0, V02, n14VarArr, V0);
                return n14VarArr;
            }
            throw new c14(qi4Var, bc4Var);
        }

        @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
        public int A0() {
            return this.K.A0() + this.J.A0();
        }

        @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
        public boolean G(g24 g24Var) {
            if (g24Var instanceof n) {
                n nVar = (n) g24Var;
                return this.J.equals(nVar.J) && this.K.equals(nVar.K);
            }
            return false;
        }

        @Override // com.p7700g.p99005.i34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.o34
        public boolean I0() {
            if (K3() == null) {
                return false;
            }
            if (m0().i().f()) {
                return true;
            }
            if (this.J.C0()) {
                return this.J.I0() && this.K.H0();
            }
            return this.K.I0();
        }

        @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return this.J.equals(nVar.J) && this.K.equals(nVar.K);
            }
            return false;
        }

        @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
        public int g3() {
            return this.K.g3() + this.J.g3();
        }

        @Override // com.p7700g.p99005.g24
        public String toString() {
            if (this.L == null) {
                l lVar = i.r;
                this.L = new o(lVar.c(this.J), lVar.n).n(this);
            }
            return this.L;
        }

        private n(qi4 qi4Var, bc4 bc4Var) {
            super(Y4(qi4Var, bc4Var), qi4Var.m0());
            if (qi4Var.C0()) {
                if (bc4Var.C0() && bc4Var.K3().intValue() == 0) {
                    this.z = qi4Var.K3();
                } else {
                    throw new u14(qi4Var, bc4Var, bc4Var.K3());
                }
            } else if (bc4Var.C0()) {
                this.z = f34.b(qi4Var.A0() + bc4Var.K3().intValue());
            } else {
                this.z = g24.t;
            }
            this.K = bc4Var;
            this.J = qi4Var;
        }
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class p extends k54<n, o, h54<n, o>> {
        private final CharSequence u;

        /* compiled from: IPv6AddressSection.java */
        /* loaded from: classes3.dex */
        public class a extends k54<n, o, h54<n, o>>.a {

            /* compiled from: IPv6AddressSection.java */
            /* renamed from: com.p7700g.p99005.qi4$p$a$a */
            /* loaded from: classes3.dex */
            public class C0234a extends h54<n, o> {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0234a(n nVar, o oVar) {
                    super(nVar, oVar);
                    a.this = r1;
                }

                @Override // com.p7700g.p99005.h54
                public String b() {
                    if (this.c == null) {
                        this.c = ((o) this.b).x((n) this.a, p.this.u);
                    }
                    return this.c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a() {
                super();
                p.this = r1;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public h54<n, o> next() {
                return new C0234a((n) p.this.s, (o) this.s.next());
            }
        }

        public p(n nVar, CharSequence charSequence) {
            super(nVar);
            this.u = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<h54<n, o>> iterator() {
            return new a();
        }
    }

    static {
        BigInteger shiftLeft = BigInteger.valueOf(1L).shiftLeft(64);
        BigInteger bigInteger = BigInteger.ONE;
        R = new BigInteger[]{BigInteger.ZERO, BigInteger.valueOf(av5.s), BigInteger.valueOf(4294967295L), BigInteger.valueOf(281474976710655L), shiftLeft.subtract(bigInteger), BigInteger.valueOf(1L).shiftLeft(80).subtract(bigInteger), BigInteger.valueOf(1L).shiftLeft(96).subtract(bigInteger), BigInteger.valueOf(1L).shiftLeft(112).subtract(bigInteger), BigInteger.valueOf(1L).shiftLeft(128).subtract(bigInteger)};
    }

    public qi4(ri4 ri4Var) {
        this(new ri4[]{ri4Var}, 0, false);
    }

    private /* synthetic */ ri4 Ba(int i2) {
        return D0(i2).j6();
    }

    private /* synthetic */ ri4 Da(int i2) {
        return D0(i2).y6();
    }

    private /* synthetic */ int E9(int i2) {
        return D0(i2).c4();
    }

    private static BigInteger Eb(long j2, long j3) {
        if (j2 <= -1257966797) {
            if (j2 == 1) {
                return BigInteger.valueOf(j3);
            }
            if (j3 <= -1257966797) {
                if (j3 == 1) {
                    return BigInteger.valueOf(j2);
                }
                return BigInteger.valueOf(j2 * j3);
            }
        } else if (j3 == 1) {
            return BigInteger.valueOf(j2);
        }
        return BigInteger.valueOf(j2).multiply(BigInteger.valueOf(j3));
    }

    /* renamed from: Fa */
    public /* synthetic */ ri4[] Ga() {
        return a0().N0();
    }

    private /* synthetic */ ri4 G9(Integer num, int i2) {
        return D0(i2).o6(num);
    }

    private /* synthetic */ Iterator Ha(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    private Iterator<qi4> Hb(boolean z) {
        Iterator I4;
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            pi4.a e8 = e8();
            boolean b1 = z ? b1() : X1().equals(BigInteger.ONE);
            int n3 = m14.n3(L0.intValue(), Z1(), u2());
            int i3 = m14.i3(L0.intValue(), Z1(), u2());
            int V0 = V0();
            if (b1) {
                I4 = null;
            } else {
                I4 = f34.I4(V0, e8, null, new IntFunction() { // from class: com.p7700g.p99005.dd4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return qi4.this.D0(i2).iterator();
                    }
                }, null, n3, i3, z ? new IntFunction() { // from class: com.p7700g.p99005.lg4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return qi4.this.D0(i2).F0();
                    }
                } : new IntFunction() { // from class: com.p7700g.p99005.ee4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return qi4.this.D0(i2).B0();
                    }
                });
            }
            return f34.W3(b1, this, e8, I4, L0);
        }
        return iterator();
    }

    /* renamed from: I9 */
    public /* synthetic */ ri4 J9(boolean z, int i2) {
        return z ? D0(i2).x5() : D0(i2).b0();
    }

    public static /* synthetic */ qi4 Ja(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (qi4) f34.V(ri4VarArr, aVar, num);
    }

    private s04.a<ri4> K8() {
        return m0().u();
    }

    private /* synthetic */ ri4 K9(boolean z, Integer num, int i2) {
        return D0(i2).r6(num, z);
    }

    private x44<qi4> Kb(boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Lb(z, L0.intValue());
        }
        return ic(false);
    }

    private x44<qi4> Lb(boolean z, final int i2) {
        g24.d dVar;
        if (i2 <= A0() && i2 >= 0) {
            final Integer b2 = b(i2);
            final pi4.a e8 = e8();
            final int n3 = m14.n3(i2, Z1(), u2());
            final int i3 = m14.i3(i2, Z1(), u2());
            qi4 o0 = o0(i2, false);
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.bf4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.fg4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return qi4.ma(pi4.a.this, r2, (ri4[]) obj2);
                        }
                    }, pi4.a.this, ((qi4) ((g24.e) obj).a()).O5(), n3, i3, b2);
                    return K4;
                }
            };
            if (z) {
                dVar = fd4.a;
            } else {
                dVar = !M0() ? ge4.a : dg4.a;
            }
            return g24.h(o0, predicate, dVar, mi4.a, ne4.a, new ToLongFunction() { // from class: com.p7700g.p99005.sf4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return qi4.la(i2, (qi4) obj);
                }
            });
        }
        throw new y14(this, i2);
    }

    /* renamed from: M9 */
    public /* synthetic */ int N9(boolean z, int i2, int i3) {
        if (z && i3 == i2) {
            return D0(i3).A5();
        }
        return D0(i3).c4();
    }

    public static /* synthetic */ boolean Ma(qi4 qi4Var) {
        return qi4Var.getCount().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ long Na(int i2, qi4 qi4Var) {
        return f34.q4(qi4Var, i2);
    }

    /* renamed from: O9 */
    public /* synthetic */ int P9(int i2, int i3, int i4) {
        if (i4 == i2) {
            ri4 D0 = D0(i4);
            int A0 = D0.A0() - f34.p3(u2(), i3, i4).intValue();
            return ((D0.h3() >>> A0) - (D0.B1() >>> A0)) + 1;
        }
        return D0(i4).c4();
    }

    public static /* synthetic */ ni4 Oa(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (ni4) f34.U(ri4VarArr, aVar, num);
    }

    /* renamed from: Q9 */
    public /* synthetic */ BigInteger R9() {
        return y8(V0());
    }

    public static /* synthetic */ boolean Ra(ni4 ni4Var) {
        return ni4Var.getCount().compareTo(g24.v) <= 0;
    }

    /* renamed from: S9 */
    public /* synthetic */ ri4[] T9() {
        return a0().O5();
    }

    private qi4 Tb(boolean z) {
        return (qi4) f34.F4(z, this, e8(), new IntFunction() { // from class: com.p7700g.p99005.wd4
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return qi4.this.D0(i2).j6();
            }
        }, true);
    }

    private void U7(qi4[] qi4VarArr) {
        for (qi4 qi4Var : qi4VarArr) {
            if (qi4Var != null) {
                if (qi4Var.W == this.W) {
                    if (qi4Var.V0() != V0()) {
                        throw new z14(this, qi4Var);
                    }
                } else {
                    throw new t04(qi4Var, qi4Var.W, this.W);
                }
            }
        }
    }

    private /* synthetic */ Iterator U9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    public static /* synthetic */ int W9(qi4 qi4Var, int i2) {
        return qi4Var.D0(i2).B1();
    }

    /* renamed from: Wa */
    public /* synthetic */ Iterator Xa(final int i2, boolean z, boolean z2, qi4 qi4Var) {
        return qi4Var.b9(new Predicate() { // from class: com.p7700g.p99005.je4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qi4.this.gb((ri4[]) obj, i2);
            }
        });
    }

    private Iterator<ri4[]> Wb(Predicate<ri4[]> predicate) {
        final boolean f2 = m0().i().f();
        return f34.H4(V0(), K8(), z3() ? null : new Supplier() { // from class: com.p7700g.p99005.hf4
            @Override // java.util.function.Supplier
            public final Object get() {
                return qi4.this.Ga();
            }
        }, new IntFunction() { // from class: com.p7700g.p99005.de4
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return qi4.this.Ia(f2, i2);
            }
        }, predicate);
    }

    public static /* synthetic */ int X9(qi4 qi4Var, int i2) {
        return qi4Var.D0(i2).B1();
    }

    public static /* synthetic */ int Y9(qi4 qi4Var, qi4 qi4Var2, int i2) {
        return qi4Var.D0(i2).B1() | qi4Var2.D0(i2).B1();
    }

    public static /* synthetic */ long Ya(int i2, int i3, qi4 qi4Var) {
        return f34.q4(qi4Var, i2) - qi4Var.N6(i3, i2);
    }

    public static qi4 Z7(pi4.a aVar, ri4[] ri4VarArr, yb4 yb4Var) throws t14 {
        bc4 O0 = yb4Var.O0();
        ri4[] d2 = aVar.d(ri4VarArr.length + 2);
        d2[0] = ri4VarArr[0];
        d2[1] = ri4VarArr[1];
        d2[2] = ri4VarArr[2];
        d2[3] = ri4VarArr[3];
        d2[4] = ri4VarArr[4];
        d2[5] = ri4VarArr[5];
        d2[6] = O0.D0(0).G6(aVar, O0.D0(1));
        d2[7] = O0.D0(2).G6(aVar, O0.D0(3));
        qi4 u = aVar.u(d2);
        u.U = O0;
        return u;
    }

    private /* synthetic */ Iterator Z9(int i2) {
        return D0(i2).iterator();
    }

    public static /* synthetic */ BigInteger Za(int i2, int i3, qi4 qi4Var) {
        return qi4Var.getCount().subtract(qi4Var.X5(i2, i3));
    }

    public static jl4 a8(il4.a aVar, kl4[] kl4VarArr, int i2, boolean z) {
        return (jl4) f34.w0(aVar, kl4VarArr, i2, z);
    }

    public static Integer b(int i2) {
        return m14.b(i2);
    }

    private Iterator<qi4> b9(Predicate<ri4[]> predicate) {
        boolean f2 = m0().i().f();
        boolean z = (z3() || (f2 && C0())) ? false : true;
        return f34.W3(z, (!z || (predicate != null && predicate.test(O5()))) ? null : this, e8(), z ? null : Wb(predicate), f2 ? null : L0());
    }

    private /* synthetic */ Iterator ba(int i2) {
        return D0(i2).F0();
    }

    public static /* synthetic */ long bb(int i2, qi4 qi4Var) {
        return f34.q4(qi4Var, i2);
    }

    private qi4 bc(int i2, boolean z, boolean z2, boolean z3) {
        return (qi4) m14.e7(this, e8(), i2, z, z2, !z3, ve4.a);
    }

    public static /* synthetic */ qi4 cb(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (qi4) f34.V(ri4VarArr, aVar, num);
    }

    private Predicate<ri4[]> d8() {
        if (C0()) {
            final int intValue = K3().intValue();
            return new Predicate() { // from class: com.p7700g.p99005.ed4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return qi4.this.gb((ri4[]) obj, intValue);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ int d9(qi4 qi4Var, int i2) {
        return qi4Var.D0(i2).B1();
    }

    private /* synthetic */ Iterator da(int i2) {
        return D0(i2).B0();
    }

    private pi4.a e8() {
        return f8(this.W);
    }

    public static /* synthetic */ int e9(qi4 qi4Var, qi4 qi4Var2, int i2) {
        return qi4Var.D0(i2).B1() & qi4Var2.D0(i2).B1();
    }

    public static /* synthetic */ boolean eb(qi4 qi4Var) {
        return qi4Var.getCount().compareTo(g24.v) <= 0;
    }

    private /* synthetic */ Iterator f9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    private /* synthetic */ Iterator fa(int i2) {
        return D0(i2).iterator();
    }

    private qi4[] g8(qi4... qi4VarArr) {
        qi4[] qi4VarArr2 = new qi4[qi4VarArr.length + 1];
        System.arraycopy(qi4VarArr, 0, qi4VarArr2, 1, qi4VarArr.length);
        qi4VarArr2[0] = this;
        return qi4VarArr2;
    }

    public int[] h8(c cVar) {
        return i8(cVar, false);
    }

    private /* synthetic */ Iterator h9(int i2) {
        return D0(i2).F6();
    }

    private /* synthetic */ Iterator ha(int i2) {
        return D0(i2).F0();
    }

    /* renamed from: hb */
    public /* synthetic */ Iterator ib(final int i2, boolean z, boolean z2, ni4 ni4Var) {
        return ni4Var.O0().a9(ni4Var, ni4Var.r6(), new Predicate() { // from class: com.p7700g.p99005.sg4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qi4.this.gb((ri4[]) obj, i2);
            }
        });
    }

    public int[] i8(c cVar, boolean z) {
        if (cVar != null) {
            c.a aVar = cVar.b;
            i34.c S4 = aVar.f() ? S4() : T4();
            int V0 = V0();
            boolean z2 = z && cVar.c.a(this);
            boolean z3 = aVar == c.a.HOST_PREFERRED;
            boolean z4 = z && aVar == c.a.MIXED_PREFERRED;
            int i2 = -1;
            int i3 = 0;
            for (int b2 = S4.b() - 1; b2 >= 0; b2--) {
                i34.a a2 = S4.a(b2);
                int i4 = a2.a;
                int i5 = a2.b;
                if (z) {
                    int i6 = 6 - this.W;
                    if (!z2 || i4 > i6 || i4 + i5 < V0) {
                        i5 = Math.min(i5, i6 - i4);
                    }
                }
                if (i5 > 0 && i5 >= i3 && (cVar.a || i5 > 1)) {
                    i3 = i5;
                    i2 = i4;
                }
                if ((z3 && C0() && u2() * (i4 + i5) > K3().intValue()) || (z4 && i4 + i5 >= V0)) {
                    break;
                }
            }
            if (i2 >= 0) {
                return new int[]{i2, i3};
            }
            return null;
        }
        return null;
    }

    private static BigInteger j8(IntUnaryOperator intUnaryOperator, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return BigInteger.ONE;
            }
            long applyAsInt = intUnaryOperator.applyAsInt(0);
            int min = Math.min(i2, 3);
            for (int i3 = 1; i3 < min; i3++) {
                int applyAsInt2 = intUnaryOperator.applyAsInt(i3);
                if (applyAsInt == 1) {
                    applyAsInt = applyAsInt2;
                } else if (applyAsInt2 != 1) {
                    applyAsInt *= applyAsInt2;
                }
            }
            if (i2 <= 3) {
                return BigInteger.valueOf(applyAsInt);
            }
            long applyAsInt3 = intUnaryOperator.applyAsInt(3);
            int min2 = Math.min(i2, 6);
            for (int i4 = 4; i4 < min2; i4++) {
                int applyAsInt4 = intUnaryOperator.applyAsInt(i4);
                if (applyAsInt3 == 1) {
                    applyAsInt3 = applyAsInt4;
                } else if (applyAsInt4 != 1) {
                    applyAsInt3 *= applyAsInt4;
                }
            }
            if (i2 <= 6) {
                return Eb(applyAsInt, applyAsInt3);
            }
            long applyAsInt5 = intUnaryOperator.applyAsInt(6);
            if (i2 > 7) {
                int applyAsInt6 = intUnaryOperator.applyAsInt(7);
                if (applyAsInt5 == 1) {
                    applyAsInt5 = applyAsInt6;
                } else if (applyAsInt6 != 1) {
                    applyAsInt5 *= applyAsInt6;
                }
            }
            if (applyAsInt5 <= -1257966797) {
                if (applyAsInt5 == 1) {
                    return Eb(applyAsInt, applyAsInt3);
                }
                if (applyAsInt3 <= -1257966797) {
                    return Eb(applyAsInt, applyAsInt3 * applyAsInt5);
                }
                if (applyAsInt <= -1257966797) {
                    return Eb(applyAsInt * applyAsInt5, applyAsInt3);
                }
            } else if (applyAsInt3 <= -1257966797) {
                if (applyAsInt3 == 1) {
                    return Eb(applyAsInt, applyAsInt5);
                }
                if (applyAsInt <= -1257966797) {
                    return Eb(applyAsInt * applyAsInt3, applyAsInt5);
                }
            } else if (applyAsInt == 1) {
                return Eb(applyAsInt3, applyAsInt5);
            }
            return Eb(applyAsInt, applyAsInt3).multiply(BigInteger.valueOf(applyAsInt5));
        }
        throw new IllegalArgumentException();
    }

    private /* synthetic */ Iterator j9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    private /* synthetic */ Iterator ja(int i2) {
        return D0(i2).B0();
    }

    public static /* synthetic */ long jb(int i2, int i3, ni4 ni4Var) {
        return f34.q4(ni4Var.O0(), i2) - ni4Var.O0().N6(i3, i2);
    }

    private /* synthetic */ Iterator l9(int i2) {
        return D0(i2).F6();
    }

    public static /* synthetic */ long la(int i2, qi4 qi4Var) {
        return f34.w4(qi4Var, i2);
    }

    public static /* synthetic */ qi4 ma(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (qi4) f34.V(ri4VarArr, aVar, num);
    }

    public static /* synthetic */ qi4 n9(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (qi4) f34.V(ri4VarArr, aVar, num);
    }

    public static /* synthetic */ ni4 nb(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (ni4) f34.U(ri4VarArr, aVar, num);
    }

    public static /* synthetic */ ni4 oa(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (ni4) f34.U(ri4VarArr, aVar, num);
    }

    public static /* synthetic */ boolean pb(ni4 ni4Var) {
        return ni4Var.getCount().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ BigInteger q9(int i2, qi4 qi4Var) {
        return qi4Var.Z2(i2);
    }

    public static /* synthetic */ boolean r9(int i2, qi4 qi4Var) {
        return qi4Var.Z2(i2).compareTo(g24.v) <= 0;
    }

    private String rc(o oVar, CharSequence charSequence) {
        return oVar.x(z8(), charSequence);
    }

    private static int s8(jl4 jl4Var) {
        int i2 = jl4Var.L;
        int V0 = jl4Var.V0() + i2;
        int i3 = ((V0 + 1) >> 1) - (i2 >> 1);
        return (jl4Var.F5() || i2 > 2 || V0 < 4) ? i3 : i3 + 1;
    }

    public static /* synthetic */ long s9(int i2, qi4 qi4Var) {
        return f34.q4(qi4Var, i2);
    }

    public static /* synthetic */ g34[] sb(int i2) {
        return new g34[i2];
    }

    private static int t8(jl4 jl4Var) {
        int i2 = jl4Var.L;
        int i3 = (i2 >> 1) + 4;
        return (jl4Var.F5() || i2 < 3) ? i3 : i3 + 1;
    }

    public static /* synthetic */ ni4 t9(pi4.a aVar, Integer num, ri4[] ri4VarArr) {
        return (ni4) f34.U(ri4VarArr, aVar, num);
    }

    public static /* synthetic */ Iterator ta(boolean z, boolean z2, ni4 ni4Var) {
        return (z || z2) ? ni4Var.B0() : ni4Var.F0();
    }

    public static /* synthetic */ g34[] tb(int i2) {
        return new g34[i2];
    }

    public static String tc(m14.e eVar, CharSequence charSequence, o34 o34Var) {
        return m14.n7(eVar).g0(o34Var, charSequence);
    }

    public static p14 u5(p14 p14Var, p14 p14Var2, p14 p14Var3) {
        return m14.u5(p14Var, p14Var2, p14Var3);
    }

    public static /* synthetic */ boolean ua(ni4 ni4Var) {
        return ni4Var.X1().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ g34[] ub(int i2) {
        return new g34[i2];
    }

    public static <T extends p14> T v5(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, Comparator<T> comparator) throws r04 {
        return (T) m14.v5(t, t2, unaryOperator, unaryOperator2, comparator);
    }

    private /* synthetic */ ri4 vb(Integer num, int i2) {
        return D0(i2).r6(num, true);
    }

    public static /* synthetic */ boolean x9(int i2, ni4 ni4Var) {
        return ni4Var.Z2(i2).compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ Iterator xa(boolean z, boolean z2, qi4 qi4Var) {
        return (z || z2) ? qi4Var.B0() : qi4Var.F0();
    }

    public static BigInteger y8(int i2) {
        return R[i2];
    }

    public static /* synthetic */ boolean ya(qi4 qi4Var) {
        return qi4Var.X1().compareTo(g24.v) <= 0;
    }

    private /* synthetic */ ri4 za(boolean z, int i2) {
        return D0(i2).i6(z);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return V0() << 4;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
    /* renamed from: A8 */
    public pi4 m0() {
        return n04.h();
    }

    public /* synthetic */ ri4 Aa(boolean z, int i2) {
        return D0(i2).i6(z);
    }

    public qi4 Ab(qi4 qi4Var, int i2) throws t14, y14, z14 {
        k5(qi4Var);
        if (m0().i().f()) {
            return (qi4) m14.V5(this, b(i2), e8(), true, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.cg4
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    return qi4.X9(qi4.this, i3);
                }
            }, false);
        }
        final qi4 y = m0().y(i2);
        return (qi4) m14.V5(this, b(i2), e8(), true, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.xf4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return qi4.Y9(qi4.this, y, i3);
            }
        }, false);
    }

    public j Ac(h hVar, CharSequence charSequence) {
        j jVar = new j();
        if (V0() - Math.max(6 - this.W, 0) > 0 && hVar.a(2)) {
            jVar.c(new j.b(z8(), hVar, charSequence).e());
        }
        if (hVar.a(1)) {
            jVar.c(new j.a(this, hVar, charSequence).e());
        }
        return jVar;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<qi4> B0() {
        return Hb(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: B8 */
    public qi4 P1() {
        return (qi4) super.P1();
    }

    @Deprecated
    public qi4[] Bb(qi4... qi4VarArr) throws z14 {
        return Cb(qi4VarArr);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Bc */
    public qi4 x7() throws t14 {
        if (!C0()) {
            pi4 m0 = m0();
            s04.c i2 = m0.i();
            ni4 G = m0.G(0, !i2.f());
            if (i2.h()) {
                G = G.m();
            }
            return G.J0(0, V0());
        } else if (o4() && m6()) {
            return a0();
        } else {
            return b8(false);
        }
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: C8 */
    public qi4 o2() {
        if (C0()) {
            return Q3(K3().intValue());
        }
        return Q3(A0());
    }

    public /* synthetic */ ri4 Ca(int i2) {
        return D0(i2).j6();
    }

    public qi4[] Cb(qi4... qi4VarArr) throws z14, t04 {
        U7(qi4VarArr);
        List<p14> H5 = m14.H5(g8(qi4VarArr));
        return (qi4[]) H5.toArray(new qi4[H5.size()]);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Cc */
    public qi4 y7(int i2) {
        if (C0() && i2 == K3().intValue()) {
            return x7();
        }
        final ni4 E = m0().E(i2);
        return (qi4) m14.V5(this, null, e8(), false, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.xe4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int B1;
                B1 = ni4.this.D0(i3).B1();
                return B1;
            }
        }, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public String D2(m14.e eVar) {
        if (eVar instanceof l) {
            return uc((l) eVar);
        }
        return super.D2(eVar);
    }

    @Override // com.p7700g.p99005.p14
    public String D3() {
        String str;
        if (Z5() || (str = this.S.q) == null) {
            i U5 = U5();
            String yc = yc(null);
            U5.q = yc;
            return yc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: D8 */
    public qi4 Q3(int i2) throws y14 {
        return A2(i2, true);
    }

    public qi4[] Db(qi4... qi4VarArr) throws z14 {
        U7(qi4VarArr);
        qi4[] g8 = g8(qi4VarArr);
        final pi4.a e8 = e8();
        Objects.requireNonNull(e8);
        List<p14> I5 = m14.I5(g8, new m14.i() { // from class: com.p7700g.p99005.bi4
            @Override // com.p7700g.p99005.m14.i
            public final p14 a(p14 p14Var, int i2, int i3, int i4) {
                return pi4.a.this.w4(p14Var, i2, i3, i4);
            }
        });
        return (qi4[]) I5.toArray(new qi4[I5.size()]);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Dc */
    public qi4 z7() {
        if (!C0()) {
            return m0().x(A0()).J0(0, V0());
        }
        return c8();
    }

    @Override // com.p7700g.p99005.q04
    public String E0() {
        String str;
        if (Z5() || (str = U5().F) == null) {
            i U5 = U5();
            String uc = uc(i.t);
            U5.F = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: E8 */
    public qi4 A2(int i2, final boolean z) throws y14 {
        return (qi4) m14.K5(this, i2, z, e8(), new m14.g() { // from class: com.p7700g.p99005.ue4
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return qi4.this.L9(z, (Integer) obj, i3);
            }
        });
    }

    public /* synthetic */ ri4 Ea(int i2) {
        return D0(i2).y6();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Ec */
    public qi4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<qi4> F0() {
        return Hb(true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: F7 */
    public qi4 r0(boolean z) {
        return q0(z, true);
    }

    public o34[] F8(h hVar) {
        if (hVar.a(2)) {
            return hVar.a(1) ? new o34[]{this, z8()} : new o34[]{z8()};
        }
        return super.N5(hVar);
    }

    public /* synthetic */ int F9(int i2) {
        return D0(i2).c4();
    }

    public Iterator<ni4> Fb(ni4 ni4Var, d34<ni4, ?, ?, ri4> d34Var, boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Gb(ni4Var, d34Var, z, L0.intValue());
        }
        return a9(ni4Var, d34Var, null);
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof qi4) && super.G(g24Var);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<qi4> G0() {
        return Kb(true);
    }

    @Override // com.p7700g.p99005.p14
    public String G1() {
        String str;
        if (Z5() || (str = U5().j) == null) {
            i U5 = U5();
            String uc = uc(i.x);
            U5.j = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: G7 */
    public qi4 q0(boolean z, boolean z2) {
        return (qi4) super.q0(z, z2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: G8 */
    public qi4 O0() {
        return this;
    }

    public Iterator<ni4> Gb(ni4 ni4Var, d34<ni4, ?, ?, ri4> d34Var, boolean z, int i2) {
        Iterator I4;
        if (i2 <= A0() && i2 >= 0) {
            boolean Y2 = z ? Y2(i2) : h1(i2).equals(BigInteger.ONE);
            if (Y2) {
                ni4Var = ni4Var.o0(i2, false);
            }
            int n3 = m14.n3(i2, Z1(), u2());
            int i3 = m14.i3(i2, Z1(), u2());
            int V0 = V0();
            if (Y2) {
                I4 = null;
            } else {
                I4 = f34.I4(V0, d34Var, null, new IntFunction() { // from class: com.p7700g.p99005.xd4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return qi4.this.D0(i4).iterator();
                    }
                }, null, n3, i3, z ? new IntFunction() { // from class: com.p7700g.p99005.tg4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return qi4.this.D0(i4).F0();
                    }
                } : new IntFunction() { // from class: com.p7700g.p99005.rd4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return qi4.this.D0(i4).B0();
                    }
                });
            }
            return f34.U3(Y2, ni4Var, d34Var, I4, b(i2));
        }
        throw new y14(ni4Var, i2);
    }

    @Override // com.p7700g.p99005.p14
    public String H2() {
        return x2();
    }

    @Override // com.p7700g.p99005.z04
    public String H3() {
        String str;
        if (Z5() || (str = U5().G) == null) {
            i U5 = U5();
            String uc = uc(i.w);
            U5.G = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: H7 */
    public qi4 j0(int i2) {
        return u0(i2, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: H8 */
    public qi4 z0(int i2) {
        return J0(i2, V0());
    }

    public /* synthetic */ ri4 H9(Integer num, int i2) {
        return D0(i2).o6(num);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: I7 */
    public qi4 u0(int i2, boolean z) {
        return (qi4) m14.a5(this, i2, z, e8(), qg4.a);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: I8 */
    public qi4 J0(int i2, int i3) {
        return (qi4) f34.t3(i2, i3, this, f8(this.W + i2));
    }

    public /* synthetic */ Iterator Ia(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    public x44<ni4> Ib(ni4 ni4Var, pi4.a aVar, boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Jb(ni4Var, aVar, z, L0.intValue());
        }
        return hc(ni4Var, aVar, false);
    }

    public qi4 J7(qi4 qi4Var) {
        int V0 = V0();
        return Ob(V0, V0, qi4Var, 0, qi4Var.V0());
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: J8 */
    public ri4 D0(int i2) {
        return (ri4) super.D0(i2);
    }

    public x44<ni4> Jb(ni4 ni4Var, final pi4.a aVar, boolean z, final int i2) {
        g24.d dVar;
        if (i2 <= A0() && i2 >= 0) {
            final Integer b2 = b(i2);
            final int n3 = m14.n3(i2, Z1(), u2());
            final int i3 = m14.i3(i2, Z1(), u2());
            ni4 o0 = ni4Var.o0(i2, false);
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.se4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.zd4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return qi4.oa(pi4.a.this, r2, (ri4[]) obj2);
                        }
                    }, pi4.a.this, ((ni4) ((g24.e) obj).a()).O0().O5(), n3, i3, b2);
                    return K4;
                }
            };
            if (z) {
                dVar = lf4.a;
            } else {
                dVar = !M0() ? ie4.a : td4.a;
            }
            return g24.h(o0, predicate, dVar, uh4.a, be4.a, new ToLongFunction() { // from class: com.p7700g.p99005.ld4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long w4;
                    w4 = f34.w4(((ni4) obj).O0(), i2);
                    return w4;
                }
            });
        }
        throw new y14(ni4Var, i2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<qi4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    public qi4 K7(qi4 qi4Var) {
        qi4 qi4Var2;
        Integer K3 = K3();
        if (K3 == null) {
            return J7(qi4Var);
        }
        int u2 = u2();
        int intValue = K3.intValue() % u2;
        if (intValue != 0) {
            K3 = Integer.valueOf((u2 - intValue) + K3.intValue());
            qi4Var2 = o0(K3.intValue(), false);
        } else {
            qi4Var2 = this;
        }
        int intValue2 = K3.intValue() >>> 4;
        if (qi4Var.C0() && qi4Var.L0().intValue() == 0) {
            return V8(intValue2, qi4Var);
        }
        return qi4Var2.Pb(intValue2, intValue2, qi4Var, 0, qi4Var.V0(), true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: L7 */
    public qi4 p0(int i2) throws y14 {
        return bc(i2, true, true, true);
    }

    public void L8(int i2, int i3, Collection<? super ri4> collection) {
        while (i2 < i3) {
            collection.add(D0(i2));
            i2++;
        }
    }

    public /* synthetic */ ri4 L9(boolean z, Integer num, int i2) {
        return D0(i2).r6(num, z);
    }

    @Override // com.p7700g.p99005.g24
    public void M(InetAddress inetAddress) {
        super.M(inetAddress);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: M7 */
    public qi4 g2() {
        return (qi4) super.g2();
    }

    public void M8(Collection<? super ri4> collection) {
        L8(0, V0(), collection);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: Mb */
    public qi4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.m14
    public o34[] N5(m14.c cVar) {
        return F8(h.c(cVar));
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: N7 */
    public qi4 e5() {
        return (qi4) super.F2();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: N8 */
    public ri4[] N0() {
        return (ri4[]) u().clone();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: Nb */
    public qi4 v0(boolean z) {
        return (qi4) m14.T6(this, z, e8(), ci4.a);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Stream<qi4> O1(int i2) {
        return StreamSupport.stream(y2(i2), false);
    }

    @Override // com.p7700g.p99005.m14
    public boolean O6(m14 m14Var, m14 m14Var2) {
        return (m14Var instanceof qi4) && (m14Var2 instanceof qi4) && super.O6(m14Var, m14Var2);
    }

    public qi4 O7(qi4 qi4Var) throws t14 {
        return P7(qi4Var, false);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: O8 */
    public ri4[] O5() {
        return (ri4[]) super.u();
    }

    public qi4 Ob(int i2, int i3, qi4 qi4Var, int i4, int i5) {
        return Pb(i2, i3, qi4Var, i4, i5, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<qi4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    public qi4 P7(qi4 qi4Var, boolean z) throws t14, z14 {
        k5(qi4Var);
        return (qi4) m14.M5(this, z ? L0() : null, e8(), true, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.yf4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return qi4.d9(qi4.this, i2);
            }
        });
    }

    public qi4 P8() {
        return (qi4) f34.C3(this);
    }

    public qi4 Pb(int i2, int i3, qi4 qi4Var, int i4, int i5, boolean z) {
        qi4 o0;
        qi4 J0;
        int i6;
        qi4 qi4Var2;
        int i7;
        qi4 qi4Var3;
        int i8 = i3;
        qi4 qi4Var4 = qi4Var;
        int i9 = i5;
        int V0 = V0();
        int i10 = i8 - i2;
        int i11 = i9 - i4;
        if (i10 >= 0 && i11 >= 0 && i2 >= 0 && i4 >= 0 && i9 <= qi4Var.V0() && i8 <= V0) {
            int i12 = this.W;
            if (((i12 + V0) + i11) - i10 <= 8) {
                if (i11 == 0 && i10 == 0) {
                    return this;
                }
                if (i12 == qi4Var4.W && V0 == i10) {
                    return qi4Var4;
                }
                if (m0().i().f()) {
                    if (z) {
                        o0 = t0();
                        int i13 = i9 << 4;
                        if (!qi4Var.C0() || qi4Var.K3().intValue() > i13) {
                            qi4Var4 = qi4Var.o0(i13, false);
                        }
                        i7 = i9;
                        qi4Var3 = qi4Var4;
                        i6 = i8;
                        qi4Var2 = o0;
                    }
                    i7 = i9;
                    qi4Var3 = qi4Var4;
                    i6 = i8;
                    qi4Var2 = this;
                } else {
                    Integer L0 = L0();
                    if (z) {
                        int i14 = V0 - i8;
                        if (i14 > 0) {
                            J0 = J0(0, i2).t0();
                            qi4 V8 = qi4Var.V8(i9, z0(i3));
                            i9 += i14;
                            qi4Var4 = V8;
                            i8 = i2;
                        } else {
                            J0 = t0();
                            int i15 = i9 << 4;
                            if (!qi4Var.C0() || qi4Var.K3().intValue() > i15) {
                                qi4Var4 = qi4Var.o0(i15, false);
                            }
                        }
                    } else {
                        if (L0 != null && L0.intValue() <= (i2 << 4)) {
                            qi4Var4 = qi4Var.o0(0, false);
                        } else if (i8 < V0) {
                            int i16 = i9 << 4;
                            if (qi4Var.C0() && qi4Var.K3().intValue() <= i16) {
                                int i17 = i8 << 4;
                                if (L0 == null || L0.intValue() > i17) {
                                    if (i10 <= 0 && qi4Var.L0().intValue() != 0) {
                                        J0 = J0(0, i2);
                                        qi4Var4 = qi4Var.V8(i9, z0(i3));
                                        i9 += V0 - i8;
                                    } else {
                                        o0 = o0(i17, false);
                                        i7 = i9;
                                        qi4Var3 = qi4Var4;
                                        i6 = i8;
                                        qi4Var2 = o0;
                                    }
                                }
                            }
                        }
                        i7 = i9;
                        qi4Var3 = qi4Var4;
                        i6 = i8;
                        qi4Var2 = this;
                    }
                    qi4 qi4Var5 = qi4Var4;
                    i6 = i8;
                    qi4Var2 = J0;
                    i7 = i9;
                    qi4Var3 = qi4Var5;
                }
                return (qi4) f34.D4(qi4Var2, i2, i6, qi4Var3, i4, i7, e8(), z, false);
            }
            throw new c14(this, qi4Var);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.p7700g.p99005.p14
    public String Q2() {
        String str;
        if (Z5() || (str = U5().k) == null) {
            i U5 = U5();
            String uc = uc(i.s);
            U5.k = uc;
            return uc;
        }
        return str;
    }

    public qi4 Q7(qi4 qi4Var, int i2) throws t14, y14, z14 {
        k5(qi4Var);
        final qi4 H = m0().H(i2);
        return (qi4) m14.M5(this, b(i2), e8(), true, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.of4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return qi4.e9(qi4.this, H, i3);
            }
        });
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Q8 */
    public i U5() {
        return this.S;
    }

    public qi4 Qb(int i2, qi4 qi4Var) {
        return Ob(i2, qi4Var.V0() + i2, qi4Var, 0, qi4Var.V0());
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public v44<qi4, ri4[]> R0() {
        qi4 qi4Var;
        final int V0 = V0();
        final Integer K3 = K3();
        final pi4.a e8 = e8();
        if (m0().i().f()) {
            K3 = null;
            qi4Var = t0();
        } else {
            qi4Var = this;
        }
        final int i2 = V0 - 1;
        return g24.g(qi4Var, new Predicate() { // from class: com.p7700g.p99005.ke4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.yd4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return qi4.Ja(pi4.a.this, r2, (ri4[]) obj2);
                    }
                }, pi4.a.this, ((qi4) ((g24.e) obj).a()).O5(), i2, V0, K3);
                return K4;
            }
        }, tf4.a, di4.a, le4.a, new ToLongFunction() { // from class: com.p7700g.p99005.qf4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return qi4.Na(V0, (qi4) obj);
            }
        });
    }

    @Override // com.p7700g.p99005.m14
    public boolean R6(m14 m14Var) {
        qi4 qi4Var;
        int i2;
        int i3;
        if (m14Var == this) {
            return true;
        }
        if (!(m14Var instanceof qi4) || (i2 = this.W) < (i3 = (qi4Var = (qi4) m14Var).W)) {
            return false;
        }
        return i34.V4(this, qi4Var, i2 - i3);
    }

    public Iterator<ni4> R7(ni4 ni4Var, d34<ni4, ?, ?, ri4> d34Var, int i2) {
        if (i2 >= 0) {
            if (i2 > V0()) {
                return a9(ni4Var, d34Var, null);
            }
            final boolean f2 = m0().i().f();
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                } else if (D0(i3).z3()) {
                    break;
                } else {
                    i3++;
                }
            }
            return f34.U3(z, ni4Var, d34Var, z ? null : f34.I4(V0(), d34Var, null, new IntFunction() { // from class: com.p7700g.p99005.jg4
                @Override // java.util.function.IntFunction
                public final Object apply(int i4) {
                    return qi4.this.k9(f2, i4);
                }
            }, null, i2 - 1, i2, new IntFunction() { // from class: com.p7700g.p99005.kf4
                @Override // java.util.function.IntFunction
                public final Object apply(int i4) {
                    return qi4.this.D0(i4).F6();
                }
            }), f2 ? null : L0());
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: R8 */
    public qi4 b0() {
        return w8(false, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: Rb */
    public qi4 d0(final boolean z) {
        return (qi4) f34.E4(z, this, e8(), new IntFunction() { // from class: com.p7700g.p99005.pf4
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return qi4.this.Aa(z, i2);
            }
        }, true);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public Stream<ri4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    @Override // com.p7700g.p99005.p14
    public String S1() {
        String str;
        if (Z5() || (str = U5().J) == null) {
            i U5 = U5();
            String uc = uc(i.y);
            U5.J = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<qi4> S2(int i2) {
        int i3;
        boolean z;
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return iterator();
            }
            final boolean f2 = m0().i().f();
            pi4.a e8 = e8();
            int i4 = 0;
            while (true) {
                i3 = i2 - 1;
                if (i4 > i3) {
                    z = true;
                    break;
                } else if (D0(i4).z3()) {
                    z = false;
                    break;
                } else {
                    i4++;
                }
            }
            return f34.W3(z, this, e8, z ? null : f34.I4(V0(), e8, null, new IntFunction() { // from class: com.p7700g.p99005.md4
                @Override // java.util.function.IntFunction
                public final Object apply(int i5) {
                    return qi4.this.g9(f2, i5);
                }
            }, null, i3, i2, new IntFunction() { // from class: com.p7700g.p99005.te4
                @Override // java.util.function.IntFunction
                public final Object apply(int i5) {
                    return qi4.this.D0(i5).F6();
                }
            }), f2 ? null : L0());
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.i34
    public i34.c S4() {
        if (this.Y == null) {
            this.Y = super.S4();
        }
        return this.Y;
    }

    public x44<ni4> S7(ni4 ni4Var, final pi4.a aVar, final int i2) {
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return hc(ni4Var, aVar, false);
            }
            boolean f2 = m0().i().f();
            final Integer num = null;
            Integer L0 = f2 ? null : L0();
            if (f2) {
                ni4Var = ni4Var.t0();
            } else {
                num = L0;
            }
            ni4 ni4Var2 = ni4Var;
            final int i3 = i2 - 1;
            return g24.h(ni4Var2, new Predicate() { // from class: com.p7700g.p99005.od4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.zf4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return qi4.t9(pi4.a.this, r2, (ri4[]) obj2);
                        }
                    }, pi4.a.this, ((ni4) ((g24.e) obj).a()).O0().O5(), i3, i2, num);
                    return K4;
                }
            }, new g24.d() { // from class: com.p7700g.p99005.oe4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    Iterator S2;
                    S2 = ((ni4) obj).S2(i2);
                    return S2;
                }
            }, new Function() { // from class: com.p7700g.p99005.ud4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    BigInteger Z2;
                    Z2 = ((ni4) obj).Z2(i2);
                    return Z2;
                }
            }, new Predicate() { // from class: com.p7700g.p99005.jf4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return qi4.x9(i2, (ni4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.mg4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long q4;
                    q4 = f34.q4(((ni4) obj).O0(), i2);
                    return q4;
                }
            });
        }
        throw new IllegalArgumentException();
    }

    public boolean S8(int i2, boolean z) {
        if (i2 > 10) {
            int V0 = V0();
            for (int i3 = 0; i3 < V0; i3++) {
                if (D0(i3).M4(i2, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: Sb */
    public qi4 c0() {
        return Tb(false);
    }

    @Override // com.p7700g.p99005.p14
    public String T3() {
        String str;
        if (Z5() || (str = U5().l) == null) {
            i U5 = U5();
            String uc = uc(i.z);
            U5.l = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.i34
    public i34.c T4() {
        if (this.X == null) {
            this.X = super.T4();
        }
        return this.X;
    }

    public void T7(qi4 qi4Var, qi4 qi4Var2) {
        f34.k<qi4> kVar = this.T;
        if (qi4Var == null && qi4Var2 == null) {
            return;
        }
        if (kVar == null || ((qi4Var != null && kVar.a == null) || (qi4Var2 != null && kVar.c == null))) {
            synchronized (this) {
                f34.k<qi4> kVar2 = this.T;
                if (kVar2 == null) {
                    f34.k<qi4> kVar3 = new f34.k<>();
                    this.T = kVar3;
                    kVar3.a = qi4Var;
                    kVar3.c = qi4Var2;
                } else {
                    if (kVar2.a == null) {
                        kVar2.a = qi4Var;
                    }
                    if (kVar2.c == null) {
                        kVar2.c = qi4Var2;
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: T8 */
    public qi4 l0(long j2) {
        if (j2 != 0 || z3()) {
            BigInteger value = getValue();
            BigInteger C1 = C1();
            BigInteger count = getCount();
            BigInteger valueOf = BigInteger.valueOf(j2);
            f34.T(j2, valueOf, value, C1, count, new Supplier() { // from class: com.p7700g.p99005.qd4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.R9();
                }
            });
            Integer L0 = m0().i().f() ? null : L0();
            qi4 qi4Var = (qi4) f34.d1(this, j2, e8(), new Supplier() { // from class: com.p7700g.p99005.nc4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.a0();
                }
            }, new Supplier() { // from class: com.p7700g.p99005.ei4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.b0();
                }
            }, L0);
            return qi4Var != null ? qi4Var : (qi4) f34.G3(this, j2, valueOf, e8(), new Supplier() { // from class: com.p7700g.p99005.nc4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.a0();
                }
            }, new Supplier() { // from class: com.p7700g.p99005.ei4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.b0();
                }
            }, L0);
        }
        return this;
    }

    @Override // com.p7700g.p99005.z04
    public String U0() {
        String str;
        if (Z5() || (str = this.S.a) == null) {
            i iVar = this.S;
            String uc = uc(i.u);
            iVar.a = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public x44<qi4> U1() {
        return super.U1();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: U8 */
    public qi4 g0(long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 <= 0) {
            return i2 == 0 ? this : a0().l0(j2);
        }
        return b0().l0(j2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Ub */
    public qi4 k0() {
        return Tb(true);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean V1() {
        i34.c T4 = T4();
        return T4.b() == 1 && T4.a(0).b == V0();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: V7 */
    public qi4 t5() {
        return (qi4) u5(this, a0(), b0());
    }

    public qi4 V8(int i2, qi4 qi4Var) {
        return Ob(i2, i2, qi4Var, 0, qi4Var.V0());
    }

    public /* synthetic */ Iterator V9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Vb */
    public qi4 s0() {
        return V0() <= 1 ? this : (qi4) f34.G4(this, e8(), new IntFunction() { // from class: com.p7700g.p99005.rf4
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return qi4.this.D0(i2).y6();
            }
        }, true);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public Iterator<ri4[]> W0() {
        return Wb(null);
    }

    @Override // com.p7700g.p99005.v04
    public boolean W1(v04 v04Var) {
        qi4 qi4Var;
        int i2;
        int i3;
        if (v04Var == this) {
            return true;
        }
        if (!(v04Var instanceof qi4) || (i2 = this.W) < (i3 = (qi4Var = (qi4) v04Var).W)) {
            return false;
        }
        return f34.y4(this, qi4Var, i2 - i3);
    }

    public qi4 W7(qi4 qi4Var) throws r04 {
        m5(qi4Var);
        fi4 fi4Var = fi4.a;
        xh4 xh4Var = xh4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (qi4) v5(this, qi4Var, fi4Var, xh4Var, new oc4(o04Var));
    }

    public qi4 W8(qi4 qi4Var) throws z14 {
        pi4.a e8 = e8();
        sc4 sc4Var = new sc4(this);
        Objects.requireNonNull(qi4Var);
        return (qi4) m14.d6(this, qi4Var, e8, sc4Var, new sc4(qi4Var));
    }

    @Override // com.p7700g.p99005.m14
    public BigInteger X5(final int i2, int i3) {
        if (N2(i2)) {
            if (z3()) {
                final int n3 = m14.n3(i2, Z1(), u2());
                return j8(new IntUnaryOperator() { // from class: com.p7700g.p99005.vd4
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i4) {
                        return qi4.this.P9(n3, i2, i4);
                    }
                }, n3 + 1);
            }
            return BigInteger.ONE;
        }
        return BigInteger.ZERO;
    }

    public qi4 X7() {
        Integer K3 = K3();
        final ni4 x = m0().x(K3.intValue());
        if (m0().i().f()) {
            K3 = null;
        }
        return (qi4) m14.M5(this, K3, e8(), false, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.af4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = ni4.this.D0(i2).B1();
                return B1;
            }
        });
    }

    public boolean X8() {
        return Y8(false);
    }

    public v44<ni4, ri4[]> Xb(ni4 ni4Var, final pi4.a aVar) {
        final int V0 = V0();
        final Integer K3 = K3();
        if (m0().i().f()) {
            K3 = null;
            ni4Var = ni4Var.t0();
        }
        ni4 ni4Var2 = ni4Var;
        final int i2 = V0 - 1;
        return g24.g(ni4Var2, new Predicate() { // from class: com.p7700g.p99005.ye4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.cd4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return qi4.Oa(pi4.a.this, r2, (ri4[]) obj2);
                    }
                }, pi4.a.this, ((ni4) ((g24.e) obj).a()).O0().O5(), i2, V0, K3);
                return K4;
            }
        }, kd4.a, qc4.a, sd4.a, new ToLongFunction() { // from class: com.p7700g.p99005.ag4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long q4;
                q4 = f34.q4(((ni4) obj).O0(), V0);
                return q4;
            }
        });
    }

    @Override // com.p7700g.p99005.p14
    public i54 Y1(m14.c cVar) {
        return zc(h.c(cVar));
    }

    public qi4 Y7() {
        int V0 = V0() - Math.max(6 - this.W, 0);
        if (V0 <= 0) {
            return this;
        }
        int max = Math.max(0, V0() - V0);
        pi4.a u = m0().u();
        ri4[] d2 = u.d(max);
        m3(0, max, d2, 0);
        return u.M4(this, d2, this.W);
    }

    public boolean Y8(boolean z) {
        int V0 = V0();
        int i2 = this.W;
        int i3 = V0 + i2;
        if (i2 > 5) {
            return (z && i2 == 6 && i3 > 6) ? D0(6 - i2).J3(65024, 65280) : z;
        } else if (i3 <= 6) {
            return (z && i3 == 6) ? D0(5 - i2).J3(255, 255) : z;
        } else {
            int i4 = 5 - i2;
            return D0(i4 + 1).J3(65024, 65280) && D0(i4).J3(255, 255);
        }
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Yb */
    public qi4 h0(int i2) throws y14 {
        return bc(i2, true, false, true);
    }

    @Override // com.p7700g.p99005.p14
    public j14.b Z0() {
        return j14.b.IPV6;
    }

    @Override // com.p7700g.p99005.z04
    public int Z1() {
        return 2;
    }

    @Override // com.p7700g.p99005.m14
    public boolean Z5() {
        if (this.S == null) {
            synchronized (this) {
                if (this.S == null) {
                    this.S = new i();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: Z8 */
    public boolean gb(ri4[] ri4VarArr, int i2) {
        return super.r6(ri4VarArr, i2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Zb */
    public qi4 o0(int i2, boolean z) throws y14 {
        return bc(i2, z, false, true);
    }

    public Iterator<ni4> a9(ni4 ni4Var, d34<ni4, ?, ?, ri4> d34Var, Predicate<ri4[]> predicate) {
        Iterator H4;
        final boolean f2 = m0().i().f();
        boolean z = (z3() || (f2 && C0())) ? false : true;
        if (!z || (predicate != null && predicate.test(O5()))) {
            ni4Var = null;
        }
        if (z) {
            H4 = null;
        } else {
            H4 = f34.H4(V0(), d34Var, z3() ? null : new Supplier() { // from class: com.p7700g.p99005.vf4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return qi4.this.T9();
                }
            }, new IntFunction() { // from class: com.p7700g.p99005.wf4
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return qi4.this.V9(f2, i2);
                }
            }, predicate);
        }
        return f34.U3(z, ni4Var, d34Var, H4, f2 ? null : L0());
    }

    public /* synthetic */ Iterator aa(int i2) {
        return D0(i2).iterator();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: ac */
    public qi4 d7(int i2, boolean z, boolean z2) throws y14 {
        return bc(i2, z, false, z2);
    }

    @Override // com.p7700g.p99005.p14
    public Iterator<ri4[]> b2() {
        return Wb(d8());
    }

    public qi4 b8(boolean z) {
        int intValue = K3().intValue();
        pi4 m0 = m0();
        final ni4 E = m0.E(intValue);
        return (qi4) m14.V5(this, m0.i().f() ? null : b(intValue), e8(), !z, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.hg4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = ni4.this.D0(i2).B1();
                return B1;
            }
        }, true);
    }

    @Override // com.p7700g.p99005.m14
    public void c6(Integer num, boolean z, Integer num2, Integer num3, Integer num4, BigInteger bigInteger, i34.c cVar, i34.c cVar2) {
        super.c6(num, z, num2, num3, num4, bigInteger, cVar, cVar2);
        this.X = cVar;
        this.Y = cVar2;
    }

    public qi4 c8() {
        Integer K3 = K3();
        final ni4 x = m0().x(K3.intValue());
        return (qi4) m14.V5(this, K3, e8(), false, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.if4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = ni4.this.D0(i2).B1();
                return B1;
            }
        }, true);
    }

    public /* synthetic */ Iterator ca(int i2) {
        return D0(i2).F0();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: cc */
    public qi4[] i1() {
        if (M0()) {
            return b1() ? new qi4[]{this} : dc(this);
        }
        ArrayList arrayList = (ArrayList) f7(true);
        return (qi4[]) arrayList.toArray(new qi4[arrayList.size()]);
    }

    public qi4[] dc(qi4 qi4Var) throws t04 {
        if (qi4Var.W == this.W) {
            fi4 fi4Var = fi4.a;
            xh4 xh4Var = xh4.a;
            o04 o04Var = n04.H;
            Objects.requireNonNull(o04Var);
            oc4 oc4Var = new oc4(o04Var);
            wh4 wh4Var = wh4.a;
            ic4 ic4Var = ic4.a;
            final pi4.a e8 = e8();
            Objects.requireNonNull(e8);
            return (qi4[]) m14.P5(this, qi4Var, fi4Var, xh4Var, oc4Var, wh4Var, ic4Var, new IntFunction() { // from class: com.p7700g.p99005.rc4
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return pi4.a.this.W3(i2);
                }
            });
        }
        throw new t04(qi4Var, qi4Var.W, this.W);
    }

    public /* synthetic */ Iterator ea(int i2) {
        return D0(i2).B0();
    }

    @Deprecated
    public qi4[] ec(qi4 qi4Var) {
        return gc(qi4Var);
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qi4) {
            qi4 qi4Var = (qi4) obj;
            return this.W == qi4Var.W && qi4Var.G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<qi4> f0() {
        return this;
    }

    public pi4.a f8(int i2) {
        pi4.a u = m0().u();
        boolean z = i2 < 8;
        pi4.a aVar = z ? Q[i2] : null;
        if (aVar == null || (!z && !aVar.m0().equals(m0()))) {
            a aVar2 = new a(m0(), u.x, i2);
            aVar2.y = u.y;
            if (z) {
                Q[i2] = aVar2;
            }
            return aVar2;
        }
        return aVar;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: fc */
    public qi4[] Q0() throws r04 {
        if (M0()) {
            return new qi4[]{t0()};
        }
        ArrayList arrayList = (ArrayList) f7(false);
        return (qi4[]) arrayList.toArray(new qi4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public int g3() {
        return V0() << 1;
    }

    public /* synthetic */ Iterator g9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    public /* synthetic */ Iterator ga(int i2) {
        return D0(i2).iterator();
    }

    public qi4[] gc(qi4 qi4Var) throws t04 {
        if (qi4Var.W == this.W) {
            fi4 fi4Var = fi4.a;
            xh4 xh4Var = xh4.a;
            o04 o04Var = n04.H;
            Objects.requireNonNull(o04Var);
            return (qi4[]) m14.Q5(this, qi4Var, fi4Var, xh4Var, new oc4(o04Var), ic4.a, e8());
        }
        throw new t04(qi4Var, qi4Var.W, this.W);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger h1(int i2) {
        g24.d(this, i2);
        if (z3()) {
            final int n3 = m14.n3(i2, Z1(), u2());
            final boolean z = n3 == m14.i3(i2, Z1(), u2());
            return j8(new IntUnaryOperator() { // from class: com.p7700g.p99005.ze4
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    return qi4.this.N9(z, n3, i3);
                }
            }, n3 + 1);
        }
        return BigInteger.ONE;
    }

    @Override // com.p7700g.p99005.m14
    public void h5(String str) {
        if (Z5() || U5().F == null) {
            U5().F = str;
        }
    }

    @Override // com.p7700g.p99005.m14
    public boolean h6() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.p7700g.p99005.pd4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.p7700g.p99005.he4] */
    public x44<ni4> hc(ni4 ni4Var, final pi4.a aVar, boolean z) {
        ni4 ni4Var2;
        final Integer num;
        ef4 ef4Var;
        ToLongFunction toLongFunction;
        qc4 qc4Var;
        final int V0 = V0();
        Integer K3 = K3();
        if (m0().i().f()) {
            num = null;
            ni4Var2 = ni4Var.t0();
        } else {
            ni4Var2 = ni4Var;
            num = K3;
        }
        if (z && o4()) {
            final int intValue = K3.intValue();
            ef4Var = new g24.d() { // from class: com.p7700g.p99005.pd4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return qi4.this.ib(intValue, z2, z3, (ni4) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.ce4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return qi4.jb(V0, intValue, (ni4) obj);
                }
            };
            qc4Var = new Function() { // from class: com.p7700g.p99005.he4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    BigInteger subtract;
                    subtract = r3.O0().getCount().subtract(((ni4) obj).O0().X5(intValue, V0));
                    return subtract;
                }
            };
        } else {
            ef4Var = ef4.a;
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.pe4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long q4;
                    q4 = f34.q4(((ni4) obj).O0(), V0);
                    return q4;
                }
            };
            qc4Var = qc4.a;
        }
        final int i2 = V0 - 1;
        return g24.h(ni4Var2, new Predicate() { // from class: com.p7700g.p99005.df4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.og4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return qi4.nb(pi4.a.this, r2, (ri4[]) obj2);
                    }
                }, pi4.a.this, ((ni4) ((g24.e) obj).a()).O0().O5(), i2, V0, num);
                return K4;
            }
        }, ef4Var, qc4Var, uf4.a, toLongFunction);
    }

    public /* synthetic */ Iterator i9(int i2) {
        return D0(i2).F6();
    }

    public /* synthetic */ Iterator ia(int i2) {
        return D0(i2).F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.p7700g.p99005.kg4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.p7700g.p99005.gf4] */
    public x44<qi4> ic(boolean z) {
        qi4 qi4Var;
        final Integer num;
        qe4 qe4Var;
        ToLongFunction toLongFunction;
        di4 di4Var;
        final int V0 = V0();
        Integer K3 = K3();
        final pi4.a e8 = e8();
        if (m0().i().f()) {
            num = null;
            qi4Var = t0();
        } else {
            qi4Var = this;
            num = K3;
        }
        if (z && o4()) {
            final int intValue = K3.intValue();
            ?? r1 = new g24.d() { // from class: com.p7700g.p99005.kg4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return qi4.this.Xa(intValue, z2, z3, (qi4) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.pg4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return qi4.Ya(V0, intValue, (qi4) obj);
                }
            };
            di4Var = new Function() { // from class: com.p7700g.p99005.gf4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return qi4.Za(intValue, V0, (qi4) obj);
                }
            };
            qe4Var = r1;
        } else {
            qe4Var = qe4.a;
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.jd4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return qi4.bb(V0, (qi4) obj);
                }
            };
            di4Var = di4.a;
        }
        final int i2 = V0 - 1;
        return g24.h(qi4Var, new Predicate() { // from class: com.p7700g.p99005.ff4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.re4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return qi4.cb(pi4.a.this, r2, (ri4[]) obj2);
                    }
                }, pi4.a.this, ((qi4) ((g24.e) obj).a()).O5(), i2, V0, num);
                return K4;
            }
        }, qe4Var, di4Var, mf4.a, toLongFunction);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<qi4> iterator() {
        return b9(null);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<qi4> j1() {
        return super.j1();
    }

    @Override // com.p7700g.p99005.m14
    public i54 j7() {
        return zc(h.o);
    }

    public qi4[] jc(qi4 qi4Var) throws z14 {
        return (qi4[]) m14.i7(this, qi4Var, e8(), new sc4(this), gg4.a);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Stream<qi4> k4() {
        return super.k4();
    }

    @Override // com.p7700g.p99005.m14
    public String k7(CharSequence charSequence) throws t14 {
        if (S3()) {
            return f34.L4(m14.n7(m14.d.h), a0(), b0(), charSequence);
        }
        return sc(m14.d.h, charSequence);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    /* renamed from: k8 */
    public ri4 t(int i2) {
        return (ri4) super.t(i2);
    }

    public /* synthetic */ Iterator k9(boolean z, int i2) {
        return D0(i2).G6(!z);
    }

    public /* synthetic */ Iterator ka(int i2) {
        return D0(i2).B0();
    }

    public String kc() throws t14 {
        String str;
        if (Z5() || (str = U5().L) == null) {
            i U5 = U5();
            String lc = lc(null);
            U5.L = lc;
            return lc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.p14
    public String l2() {
        String str;
        if (Z5() || (str = U5().I) == null) {
            i U5 = U5();
            String uc = uc(i.A);
            U5.I = uc;
            return uc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14
    public i54 l7() {
        return zc(h.p);
    }

    public bc4 l8() {
        cc4[] d2;
        if (this.U == null) {
            synchronized (this) {
                if (this.U == null) {
                    int V0 = V0() - Math.max(6 - this.W, 0);
                    int V02 = V0() - 1;
                    ac4.a u = q8().u();
                    if (V0 == 0) {
                        d2 = u.d(0);
                    } else if (V0 == 1) {
                        d2 = u.d(Z1());
                        D0(V02).C6(d2, 0, u);
                    } else {
                        d2 = u.d(Z1() << 1);
                        ri4 D0 = D0(V02);
                        D0(V02 - 1).C6(d2, 0, u);
                        D0.C6(d2, Z1(), u);
                    }
                    this.U = (bc4) m14.x5(u, d2, this);
                }
            }
        }
        return this.U;
    }

    public String lc(String str) {
        x24 x24Var;
        Integer K3 = K3();
        if (S3()) {
            x24Var = new x24(n(), B(), A0(), 85, m0(), K3);
        } else {
            x24Var = new x24(n(), A0(), 85, m0(), K3);
        }
        return tc(i.D, str, new y24(new x24[]{x24Var}, m0()));
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public byte[] m(boolean z) {
        byte[] bArr = new byte[g3()];
        int V0 = V0();
        for (int i2 = 0; i2 < V0; i2++) {
            ri4 D0 = D0(i2);
            int i3 = i2 << 1;
            int B1 = z ? D0.B1() : D0.h3();
            bArr[i3] = (byte) (B1 >>> 8);
            bArr[i3 + 1] = (byte) B1;
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.m14
    public String m7(boolean z, CharSequence charSequence) throws t14 {
        if (S3()) {
            return f34.L4(m14.n7(z ? m14.d.e : m14.d.d), a0(), b0(), charSequence);
        }
        return sc(z ? m14.d.e : m14.d.d, charSequence);
    }

    public bc4 m8(int i2, int i3) {
        int i4 = 1;
        if (i2 == ((6 - this.W) << 1) && i3 == (V0() << 1)) {
            return l8();
        }
        ac4.a u = q8().u();
        cc4[] d2 = u.d(i3 - i2);
        int Z1 = Z1();
        if (i2 % Z1 == 1) {
            i2++;
            D0(i2 >> 1).C6(d2, -1, u);
        } else {
            i4 = 0;
        }
        while (i2 < i3) {
            D0(i2 >> 1).C6(d2, i4, u);
            i2 += Z1;
            i4 += Z1;
        }
        return (bc4) m14.x5(u, d2, this);
    }

    public /* synthetic */ Iterator m9(int i2) {
        return D0(i2).F6();
    }

    public jl4 mc(boolean z) {
        kl4[] nc = nc(z);
        if (nc == null) {
            return null;
        }
        return a8(x8().g(), nc, Math.max(0, this.W - 4) << 1, z);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.g24
    public byte[] n() {
        return super.n();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: n8 */
    public qi4 a2() {
        return (qi4) super.a2();
    }

    public kl4[] nc(boolean z) {
        int i2;
        int i3;
        ri4 ri4Var;
        int i4;
        ri4 ri4Var2;
        int i5;
        ri4 ri4Var3;
        ri4 ri4Var4;
        int i6 = this.W;
        int V0 = V0();
        int i7 = 4;
        int i8 = 0;
        if (i6 < 4) {
            i2 = 0;
        } else {
            i2 = i6 - 4;
            i7 = 0;
        }
        if (i2 != 0 || i7 >= V0) {
            i3 = i7;
            ri4Var = null;
        } else {
            i3 = i7 + 1;
            ri4Var = D0(i7);
        }
        if (i2 > 1 || i3 >= V0) {
            i4 = i3;
            ri4Var2 = null;
        } else {
            i4 = i3 + 1;
            ri4Var2 = D0(i3);
        }
        if (i2 > 2 || i4 >= V0) {
            i5 = i4;
            ri4Var3 = null;
        } else {
            i5 = i4 + 1;
            ri4Var3 = D0(i4);
        }
        if (i2 > 3 || i5 >= V0) {
            ri4Var4 = null;
        } else {
            ri4Var4 = D0(i5);
            i5++;
        }
        int i9 = (i5 - i7) << 1;
        if (!z) {
            i9 -= 2;
        }
        if ((ri4Var2 == null || ri4Var2.J3(255, 255)) && ((ri4Var3 == null || ri4Var3.J3(65024, 65280)) && i9 != 0)) {
            il4.a g2 = x8().g();
            kl4 b2 = g2.b(0);
            kl4[] d2 = g2.d(i9);
            if (ri4Var != null) {
                ri4Var.C6(d2, 0, g2);
                kl4 kl4Var = d2[0];
                int B1 = kl4Var.B1();
                int h3 = kl4Var.h3();
                if (!kl4Var.J3(B1 & 2, 2)) {
                    return null;
                }
                d2[0] = g2.c(B1 ^ 2, h3 ^ 2, null);
                i8 = 2;
            }
            if (ri4Var2 != null) {
                ri4Var2.C6(d2, i8, g2);
                if (!z) {
                    d2[i8 + 1] = b2;
                }
                i8 += 2;
            }
            if (ri4Var3 != null) {
                if (z) {
                    ri4Var3.C6(d2, i8, g2);
                } else if (ri4Var2 != null) {
                    i8 -= 2;
                    kl4 kl4Var2 = d2[i8];
                    ri4Var3.C6(d2, i8, g2);
                    d2[i8] = kl4Var2;
                } else {
                    ri4Var3.C6(d2, i8, g2);
                    d2[i8] = b2;
                }
                i8 += 2;
            }
            if (ri4Var4 != null) {
                ri4Var4.C6(d2, i8, g2);
            }
            return d2;
        }
        return null;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: o8 */
    public qi4 i2() {
        if (C0()) {
            return z4(K3().intValue());
        }
        return z4(0);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: oc */
    public qi4 p7() throws t14 {
        if (!C0()) {
            ni4 x = m0().x(0);
            if (m0().i().f()) {
                return x.J0(0, V0());
            }
            return x.k5(0).J0(0, V0());
        } else if (q3() && m6()) {
            return b0();
        } else {
            return X7();
        }
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: p8 */
    public qi4 z4(int i2) throws y14 {
        int D5 = D5(i2);
        return (qi4) m14.C5(this, i2, D5, f8((V0() - D5) + this.W), new m14.g() { // from class: com.p7700g.p99005.me4
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return qi4.this.H9((Integer) obj, i3);
            }
        });
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: pc */
    public qi4 q7(int i2) {
        if (C0() && i2 == K3().intValue()) {
            return p7();
        }
        final ni4 x = m0().x(i2);
        return (qi4) m14.M5(this, null, e8(), false, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.eg4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int B1;
                B1 = ni4.this.D0(i3).B1();
                return B1;
            }
        });
    }

    @Override // com.p7700g.p99005.m14
    public boolean q5(m14 m14Var, int i2) {
        if (m14Var instanceof qi4) {
            qi4[] jc = ((qi4) m14Var).jc(this);
            if (jc != null) {
                for (qi4 qi4Var : jc) {
                    if (!qi4Var.o6(i2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public ac4 q8() {
        return n04.g();
    }

    public String qc() {
        String str;
        if (Z5() || (str = U5().H) == null) {
            i U5 = U5();
            String uc = uc(i.r);
            U5.H = uc;
            return uc;
        }
        return str;
    }

    public ni4 r8(yb4 yb4Var) {
        return yb4Var.u6(O5());
    }

    @Override // com.p7700g.p99005.p14
    public String s4() {
        String str;
        if (Z5() || (str = U5().m) == null) {
            i U5 = U5();
            String vc = vc(i.C, "");
            U5.m = vc;
            return vc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14
    public String s7(boolean z, CharSequence charSequence) throws t14 {
        if (charSequence == null) {
            return super.s7(z, null);
        }
        g24.c<o34> n7 = m14.n7(z ? m14.d.g : m14.d.f);
        if (S3()) {
            qi4 a0 = a0();
            qi4 b0 = b0();
            li4 li4Var = li4.a;
            return f34.L4(n7, new i34((g34[]) a0.X(3, li4Var, bg4.a), m0()), new i34((g34[]) b0.X(3, li4Var, nf4.a), m0()), charSequence);
        }
        return n7.g0(new i34((g34[]) Z(3, null, null, hc4.a, nd4.a), m0()), charSequence);
    }

    public String sc(m14.e eVar, CharSequence charSequence) {
        if (charSequence == null) {
            return D2(eVar);
        }
        if (eVar instanceof l) {
            return vc((l) eVar, charSequence);
        }
        return m14.n7(eVar).g0(this, charSequence);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<qi4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.z04
    public int u2() {
        return 16;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: u8 */
    public qi4 a0() {
        return w8(true, false);
    }

    public String uc(l lVar) {
        return vc(lVar, null);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: v8 */
    public qi4 e2() {
        return w8(true, true);
    }

    public String vc(l lVar, CharSequence charSequence) {
        m c2;
        if (!lVar.d()) {
            c2 = lVar.c(this);
            if (lVar.e() && c2.J <= 6 - this.W) {
                return rc(new o(c2, lVar.n), charSequence);
            }
        } else {
            l54 l54Var = (l54) g24.o(lVar);
            if (l54Var == null) {
                c2 = lVar.c(this);
                if (lVar.e()) {
                    o oVar = new o(c2, lVar.n);
                    g24.L(lVar, oVar);
                    return rc(oVar, charSequence);
                }
                g24.L(lVar, c2);
            } else if (l54Var instanceof o) {
                return rc((o) l54Var, charSequence);
            } else {
                c2 = (m) l54Var;
            }
        }
        return c2.g0(this, charSequence);
    }

    @Override // com.p7700g.p99005.m14
    public i54 w7() {
        return zc(h.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0054, code lost:
        if (r0 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qi4 w8(final boolean z, boolean z2) {
        qi4 P8 = P8();
        if (P8 == null) {
            f34.k<qi4> kVar = this.T;
            if (kVar != null) {
                if (z) {
                }
            }
            synchronized (this) {
                f34.k<qi4> kVar2 = this.T;
                boolean z3 = false;
                boolean z4 = kVar2 == null;
                if (z4) {
                    kVar2 = new f34.k<>();
                    this.T = kVar2;
                } else if (!z) {
                    P8 = kVar2.c;
                } else if (z2) {
                    P8 = kVar2.b;
                    if (P8 == null && !kVar2.d) {
                        z3 = true;
                    }
                    z4 = z3;
                } else {
                    P8 = kVar2.a;
                    if (P8 == null) {
                        z3 = true;
                    }
                    z4 = z3;
                }
                if (z4) {
                    P8 = (qi4) m14.G5(this, e8(), new Supplier() { // from class: com.p7700g.p99005.gi4
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return qi4.this.b2();
                        }
                    }, new IntFunction() { // from class: com.p7700g.p99005.ig4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i2) {
                            return qi4.this.J9(z, i2);
                        }
                    }, z, z2);
                    if (P8 == null) {
                        kVar2.d = true;
                    } else if (!z) {
                        kVar2.c = P8;
                    } else if (z2) {
                        kVar2.b = P8;
                    } else {
                        kVar2.a = P8;
                    }
                }
            }
        } else if (z2 && o4()) {
            return null;
        }
        return P8;
    }

    public /* synthetic */ ri4 wb(Integer num, int i2) {
        return D0(i2).r6(num, true);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: wc */
    public qi4 t7() {
        Integer K3 = K3();
        return (K3 == null || m0().i().f()) ? this : u7(K3.intValue());
    }

    @Override // com.p7700g.p99005.p14
    public String x2() {
        String str;
        if (Z5() || (str = U5().K) == null) {
            i U5 = U5();
            String uc = uc(i.B);
            U5.K = uc;
            return uc;
        }
        return str;
    }

    public il4 x8() {
        return n04.i();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: xc */
    public qi4 u7(int i2) throws y14 {
        return (qi4) m14.v7(this, i2, e8(), new m14.g() { // from class: com.p7700g.p99005.fe4
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return qi4.this.wb((Integer) obj, i3);
            }
        });
    }

    @Override // com.p7700g.p99005.g24
    public BigInteger y() {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() < A0()) {
            return h1(L0.intValue());
        }
        return getCount();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<qi4> y0() {
        return Kb(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.v04
    public boolean y1(v04 v04Var) {
        return (v04Var instanceof qi4) && this.W == ((qi4) v04Var).W && super.y1(v04Var);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public x44<qi4> y2(final int i2) {
        qi4 qi4Var;
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return spliterator();
            }
            final pi4.a e8 = e8();
            boolean f2 = m0().i().f();
            final Integer num = null;
            Integer L0 = f2 ? null : L0();
            if (f2) {
                qi4Var = t0();
            } else {
                num = L0;
                qi4Var = this;
            }
            final int i3 = i2 - 1;
            return g24.h(qi4Var, new Predicate() { // from class: com.p7700g.p99005.ae4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.rg4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return qi4.n9(pi4.a.this, r2, (ri4[]) obj2);
                        }
                    }, pi4.a.this, ((qi4) ((g24.e) obj).a()).O5(), i3, i2, num);
                    return K4;
                }
            }, new g24.d() { // from class: com.p7700g.p99005.we4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    Iterator S2;
                    S2 = ((qi4) obj).S2(i2);
                    return S2;
                }
            }, new Function() { // from class: com.p7700g.p99005.gd4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return qi4.q9(i2, (qi4) obj);
                }
            }, new Predicate() { // from class: com.p7700g.p99005.hd4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return qi4.r9(i2, (qi4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.cf4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return qi4.s9(i2, (qi4) obj);
                }
            });
        }
        throw new IllegalArgumentException();
    }

    public qi4 yb(qi4 qi4Var) throws t14 {
        return zb(qi4Var, false);
    }

    public String yc(CharSequence charSequence) {
        return sc(i.E, charSequence);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<qi4> z1() {
        return b9(d8());
    }

    @Override // com.p7700g.p99005.m14
    public BigInteger z5(int i2) {
        if (!z3()) {
            return BigInteger.ONE;
        }
        return j8(new IntUnaryOperator() { // from class: com.p7700g.p99005.ng4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return qi4.this.D0(i3).c4();
            }
        }, i2);
    }

    public n z8() {
        if (this.V == null) {
            synchronized (this) {
                if (this.V == null) {
                    this.V = new n(Y7(), l8(), null);
                }
            }
        }
        return this.V;
    }

    public qi4 zb(qi4 qi4Var, boolean z) throws t14, z14 {
        k5(qi4Var);
        return (qi4) m14.V5(this, z ? L0() : null, e8(), true, new sc4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.id4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return qi4.W9(qi4.this, i2);
            }
        }, false);
    }

    public i54 zc(h hVar) {
        return Ac(hVar, null);
    }

    public qi4(ri4 ri4Var, int i2) throws c14 {
        this(new ri4[]{ri4Var}, i2, false);
    }

    /* compiled from: IPv6AddressSection.java */
    /* loaded from: classes3.dex */
    public static class o implements l54<n>, Cloneable {
        private g24.c<o34> s;
        private m t;

        public o(f fVar, h54<?, ?> h54Var) {
            this.s = (g24.c) h54Var.b;
            this.t = (m) fVar.b;
        }

        @Override // com.p7700g.p99005.l54
        public char a() {
            return this.s.a();
        }

        @Override // com.p7700g.p99005.y44
        public int b(k34 k34Var) {
            return this.t.b(k34Var);
        }

        public StringBuilder c(StringBuilder sb, n nVar, CharSequence charSequence) {
            this.t.B(sb);
            this.t.D(sb, nVar.J);
            if (this.t.J < nVar.J.V0()) {
                sb.append(this.t.a());
            }
            this.s.D(sb, nVar.K);
            this.t.G(sb, charSequence);
            this.t.k0(sb);
            d(sb, nVar);
            return sb;
        }

        public void d(StringBuilder sb, n nVar) {
            if (t(nVar.J) || p(nVar.K)) {
                this.t.i0(sb, nVar);
            }
        }

        /* renamed from: e */
        public o clone() {
            try {
                o oVar = (o) super.clone();
                oVar.t = this.t.l0();
                oVar.s = this.s.clone();
                return oVar;
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public int f(n nVar) {
            if (t(nVar.J) || p(nVar.K)) {
                return g24.c.q0(nVar);
            }
            return 0;
        }

        public int g(n nVar, CharSequence charSequence) {
            int N = this.s.N(nVar.K) + this.t.N(nVar.J);
            if (this.t.J < nVar.J.V0()) {
                N++;
            }
            return this.t.M() + this.t.o0() + this.t.R(charSequence) + f(nVar) + N;
        }

        @Override // com.p7700g.p99005.y44
        public StringBuilder h(StringBuilder sb, k34 k34Var) {
            return this.t.h(sb, k34Var);
        }

        @Override // com.p7700g.p99005.l54
        /* renamed from: o */
        public int i(n nVar) {
            return this.s.i(nVar.K);
        }

        public boolean p(bc4 bc4Var) {
            return bc4Var.C0() && !this.s.d();
        }

        public boolean t(qi4 qi4Var) {
            return qi4Var.C0() && (!this.t.d() || this.t.K);
        }

        @Override // com.p7700g.p99005.l54
        /* renamed from: u */
        public String n(n nVar) {
            return x(nVar, null);
        }

        @Override // com.p7700g.p99005.l54
        /* renamed from: y */
        public String x(n nVar, CharSequence charSequence) {
            int g = g(nVar, charSequence);
            StringBuilder sb = new StringBuilder(g);
            c(sb, nVar, charSequence);
            g24.b.H(g, sb);
            return sb.toString();
        }

        public o(m mVar, m14.e eVar) {
            this.s = m14.n7(eVar);
            this.t = mVar;
        }
    }

    public qi4(ri4[] ri4VarArr) throws c14 {
        this(ri4VarArr, 0, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<qi4> spliterator() {
        return ic(false);
    }

    public qi4(ri4[] ri4VarArr, Integer num) throws c14 {
        this(ri4VarArr, 0, num);
    }

    public qi4(ri4[] ri4VarArr, int i2, Integer num) throws c14 {
        this(ri4VarArr, i2, true, num, false);
    }

    public qi4(ri4[] ri4VarArr, int i2, boolean z, Integer num, boolean z2) throws c14 {
        this(ri4VarArr, i2, z, num == null);
        if (num != null) {
            if (num.intValue() >= 0) {
                int length = ri4VarArr.length << 4;
                if (num.intValue() > length) {
                    if (num.intValue() <= 128) {
                        num = Integer.valueOf(length);
                    } else {
                        throw new y14(num.intValue());
                    }
                }
                if (ri4VarArr.length > 0) {
                    Integer num2 = this.z;
                    if (num2 != g24.t && num2.intValue() < num.intValue()) {
                        num = this.z;
                    }
                    pi4 m0 = m0();
                    f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), (z2 || !m14.l6(ri4VarArr, num, m0, false)) ? pc4.a : mc4.a);
                    this.z = num;
                    return;
                }
                return;
            }
            throw new y14(num.intValue());
        }
    }

    public qi4(ri4[] ri4VarArr, int i2, boolean z) throws c14 {
        this(ri4VarArr, i2, z, true);
    }

    public qi4(ri4[] ri4VarArr, int i2, boolean z, boolean z2) throws c14 {
        super(ri4VarArr, z, true);
        if (z2 && C0()) {
            f34.x4(K3().intValue(), O5(), u2(), Z1(), ii4.a);
        }
        this.W = i2;
        if (i2 >= 0 && i2 <= 8) {
            if (ri4VarArr.length + i2 > 8) {
                throw new c14(i2 + ri4VarArr.length);
            }
            return;
        }
        throw new t04(i2);
    }

    public qi4(n04.b bVar, int i2, Integer num) throws c14 {
        this(bVar, bVar, i2, num);
    }

    public qi4(n04.b bVar, n04.b bVar2, int i2, Integer num) throws c14 {
        super(new ri4[i2], false, false);
        ri4[] O5 = O5();
        pi4 m0 = m0();
        f34.X0(O5, bVar, bVar2, Z1(), u2(), m0, num);
        if (num != null) {
            if (num.intValue() >= 0 && num.intValue() <= 128) {
                if (m0.i().h() && m14.l6(O5, num, m0, false)) {
                    f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), mc4.a);
                }
                this.z = num;
            } else {
                throw new y14(num.intValue());
            }
        } else {
            this.z = g24.t;
        }
        this.W = 0;
    }

    public qi4(n04.b bVar, int i2) throws c14 {
        this(bVar, bVar, i2);
    }

    public qi4(n04.b bVar, n04.b bVar2, int i2) {
        this(bVar, bVar2, i2, (Integer) null);
    }

    public qi4(byte[] bArr, int i2, Integer num, boolean z, boolean z2) throws c14 {
        this(bArr, 0, bArr.length, i2, num, z, z2);
    }

    public qi4(byte[] bArr, int i2, int i3, int i4, Integer num, boolean z, boolean z2) throws c14 {
        super(new ri4[i4 >= 0 ? i4 : ((Math.max(0, i3 - i2) + 2) - 1) >> 1], false, false);
        Integer num2;
        ri4[] O5 = O5();
        pi4 m0 = m0();
        f34.M4(O5, bArr, i2, i3, Z1(), u2(), m0, num);
        boolean z3 = bArr.length == (O5.length << 1);
        if (num != null) {
            if (num.intValue() >= 0) {
                int length = O5.length << 4;
                if (num.intValue() <= length) {
                    num2 = num;
                } else if (num.intValue() <= 128) {
                    num2 = Integer.valueOf(length);
                } else {
                    throw new y14(num.intValue());
                }
                if (O5.length > 0) {
                    if (m0.i().h() && !z2) {
                        if (m14.l6(O5, num2, m0, false)) {
                            f34.J4(m0, num2.intValue(), O5, u2(), Z1(), m0.u(), mc4.a);
                        } else if (z3 && num2.intValue() >= A0()) {
                            J(z ? (byte[]) bArr.clone() : bArr);
                        }
                    } else if ((z3 && m0.i().g()) || num2.intValue() >= A0()) {
                        J(z ? (byte[]) bArr.clone() : bArr);
                    }
                } else if (z3) {
                    J(bArr);
                }
                this.z = num2;
            } else {
                throw new y14(num.intValue());
            }
        } else {
            this.z = g24.t;
            if (z3) {
                J(z ? (byte[]) bArr.clone() : bArr);
            }
        }
        this.W = 0;
    }

    public qi4(byte[] bArr, int i2, Integer num, boolean z) throws c14 {
        this(bArr, 0, bArr.length, i2, num, z, false);
    }

    public qi4(byte[] bArr, int i2, int i3, Integer num) throws c14 {
        this(bArr, i2, i3, -1, num, true, false);
    }

    public qi4(byte[] bArr, int i2, int i3) throws c14 {
        this(bArr, i2, i3, -1, null, true, false);
    }

    public qi4(byte[] bArr, Integer num) throws c14 {
        this(bArr, 0, bArr.length, -1, num, true, false);
    }

    public qi4(byte[] bArr) throws c14 {
        this(bArr, 0, bArr.length, -1, null, true, false);
    }

    public qi4(BigInteger bigInteger, int i2, Integer num) throws c14 {
        this(bigInteger.toByteArray(), i2, num, false);
    }

    public qi4(BigInteger bigInteger, int i2) throws c14 {
        this(bigInteger, i2, (Integer) null);
    }

    public qi4(long j2, long j3, int i2, Integer num) throws y14 {
        super(new ri4[i2], false, false);
        ri4[] O5 = O5();
        pi4 m0 = m0();
        f34.x0(O5, j2, j3, u2(), m0, num);
        if (num != null) {
            if (num.intValue() >= 0 && num.intValue() <= 128) {
                if (m0.i().h() && m14.l6(O5, num, m0, false)) {
                    f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), mc4.a);
                }
                this.z = num;
            } else {
                throw new y14(num.intValue());
            }
        } else {
            this.z = g24.t;
        }
        this.W = 0;
    }

    public qi4(long j2, long j3, int i2) {
        this(j2, j3, i2, (Integer) null);
    }

    public qi4(gl4 gl4Var) {
        this(gl4Var.O0(), 4, 4);
    }

    public qi4(jl4 jl4Var) {
        this(jl4Var, t8(jl4Var), s8(jl4Var));
    }

    private qi4(jl4 jl4Var, int i2, int i3) throws t14 {
        super(i3 <= 0 ? pi4.G : new ri4[i3], false, false);
        this.z = g24.t;
        this.W = i2;
        ri4[] O5 = O5();
        ni4.W7(O5, 0, jl4Var, jl4Var.L, jl4Var.F5(), m0().u(), x8().g(), null);
        n5(O5);
    }
}