package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.i54;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.ni4;
import com.p7700g.p99005.qi4;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.yb4;
import java.math.BigInteger;
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
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv4AddressSection.java */
/* loaded from: classes3.dex */
public class bc4 extends m14 implements Iterable<bc4> {
    private static final long P = 4;
    private static final long[] Q = {0, 255, av5.s, 16777215, 4294967295L};
    public transient f R;
    private transient f34.k<bc4> S;

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class b extends bc4 {
        private static final long T = 4;
        private final m14 U;

        public b(m14 m14Var, cc4[] cc4VarArr) {
            super(cc4VarArr, false);
            this.U = m14Var;
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 A2(int i, boolean z) {
            return super.A2(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ n14 A5(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 A7() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 B5() {
            return super.a2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ x04 D0(int i) {
            return super.D0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 E5() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 F2() {
            return super.e5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 F5() {
            return super.e2();
        }

        @Override // com.p7700g.p99005.i34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.o34
        public boolean I0() {
            return this.U.I0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 I2(int i) {
            return super.y7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 J0(int i, int i2) {
            return super.J0(i, i2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 J5() {
            return super.P1();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 L3() {
            return super.p7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ x04[] N0() {
            return super.N0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34
        public /* bridge */ /* synthetic */ h34 N4(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 O0() {
            return super.O0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 O3() {
            return super.z7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ n14[] O5() {
            return super.O5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 P1() {
            return super.P1();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14[] Q0() {
            return super.Q0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 Q3(int i) {
            return super.Q3(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 S6() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14.d U5() {
            return super.U5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 U6(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 V6(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W4(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W5() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 W6() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 X4(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 X6() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Y4(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Y6() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 Z3() {
            return super.x7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 Z4(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 a2() {
            return super.a2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 a6(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 b6(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 b7(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        @Deprecated
        public /* bridge */ /* synthetic */ m14 c5(int i) throws y14 {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 c7(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ q04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 d2(int i) {
            return super.q7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34
        public /* bridge */ /* synthetic */ e34 d3(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 d5() {
            return super.g2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 d7(int i, boolean z, boolean z2) {
            return super.d7(i, z, z2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ j24 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 e1() {
            return super.t5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 e2() {
            return super.e2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 e5() {
            return super.e5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 g0(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 g2() {
            return super.g2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14[] i1() {
            return super.i1();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 i2() {
            return super.i2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ p14 i4(int i) throws y14 {
            return super.u7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 l0(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
        public /* bridge */ /* synthetic */ s04 m0() {
            return super.m0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 o2() {
            return super.o2();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 p7() {
            return super.p7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 q7(int i) {
            return super.q7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
        public /* bridge */ /* synthetic */ v44 spliterator() {
            return super.spliterator();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
        public /* bridge */ /* synthetic */ f24 t(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 t5() {
            return super.t5();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 t7() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 u7(int i) {
            return super.u7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ v04 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 x7() {
            return super.x7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 y7(int i) {
            return super.y7(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ v04 z0(int i) {
            return super.z0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.p14
        public /* bridge */ /* synthetic */ m14 z4(int i) {
            return super.z4(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14
        public /* bridge */ /* synthetic */ m14 z7() {
            return super.z7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ n14 D0(int i) {
            return super.D0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 J0(int i, int i2) {
            return super.J0(i, i2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ n14[] N0() {
            return super.N0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 O0() {
            return super.O0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ v04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ t24 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 g0(long j) throws c14 {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 l0(long j) throws c14 {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
        public /* bridge */ /* synthetic */ l14 m0() {
            return super.m0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ z04 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
        public /* bridge */ /* synthetic */ m14 z0(int i) {
            return super.z0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ z04 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ k34 e0(int i) {
            return super.t(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 g0(long j) {
            return super.g0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 h0(int i) {
            return super.h0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 i0() {
            return super.t7();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 j0(int i) {
            return super.j0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 k0() {
            return super.k0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 l0(long j) {
            return super.l0(j);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 n0() {
            return super.n0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 o0(int i, boolean z) {
            return super.o0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 p0(int i) {
            return super.p0(i);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 q0(boolean z, boolean z2) {
            return super.q0(z, z2);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 r0(boolean z) {
            return super.r0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 s0() {
            return super.s0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 t0() {
            return super.t0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 u0(int i, boolean z) {
            return super.u0(i, z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
        @Deprecated
        public /* bridge */ /* synthetic */ p14 v0(boolean z) {
            return super.v0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 a0() {
            return super.a0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 b0() {
            return super.b0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 c0() {
            return super.c0();
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
        public /* bridge */ /* synthetic */ p14 d0(boolean z) {
            return super.d0(z);
        }

        @Override // com.p7700g.p99005.bc4, com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
        public /* bridge */ /* synthetic */ m34 e0(int i) {
            return super.t(i);
        }
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class c extends f34.k<yb4> {
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class d extends i54 {
        @Override // com.p7700g.p99005.i54
        public void c(k54<?, ?, ? extends h54<?, ?>> k54Var) {
            super.c(k54Var);
        }

        @Override // com.p7700g.p99005.i54
        public void d(i54 i54Var) {
            super.d(i54Var);
        }
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class f extends m14.d {
        public static final m14.e r;
        public static final m14.e s;
        public static final m14.e t;
        public static final m14.e u;
        public static final m14.e v;
        public static final m14.e w;
        public static final m14.e x;
        public static final m14.e y;
        public String A;
        public String z;

        static {
            m14.l.a aVar = m14.l.a.ALL;
            m14.l lVar = new m14.l(aVar);
            m14.l lVar2 = new m14.l(aVar, new f34.n.b(n04.D, n04.F));
            r = new h.a().b(true).u(new m14.l(m14.l.a.NETWORK_ONLY, new f34.n.b(n04.w))).j();
            s = new h.a().u(lVar).j();
            t = new h.a().u(lVar2).j();
            h.a aVar2 = new h.a();
            yb4.b bVar = yb4.b.OCTAL;
            u = aVar2.c(bVar.f()).e(bVar.g()).j();
            h.a aVar3 = new h.a();
            yb4.b bVar2 = yb4.b.HEX;
            v = aVar3.c(bVar2.f()).e(bVar2.g()).j();
            w = new h.a().x();
            x = new h.a().u(lVar).d(true).l(yb4.y0).j();
            y = new m14.e.a(2).f('.').e(j14.Q).j();
        }
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class g extends i54 {

        /* compiled from: IPv4AddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends k54<o34, i, h54<o34, i>> {

            /* compiled from: IPv4AddressSection.java */
            /* renamed from: com.p7700g.p99005.bc4$g$a$a */
            /* loaded from: classes3.dex */
            public class C0149a extends k54<o34, i, h54<o34, i>>.a {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0149a() {
                    super();
                    a.this = r1;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public h54<o34, i> next() {
                    return new h54<>(a.this.s, (i) this.s.next());
                }
            }

            public a(o34 o34Var) {
                super(o34Var);
            }

            @Override // java.lang.Iterable
            public Iterator<h54<o34, i>> iterator() {
                return new C0149a();
            }
        }

        /* compiled from: IPv4AddressSection.java */
        /* loaded from: classes3.dex */
        public static class b extends i54.b<o34, i, h54<o34, i>, a, e> {
            public static boolean k(o34 o34Var) {
                int p1 = o34Var.p1();
                for (int i = 0; i < p1; i++) {
                    if (!o34Var.e0(i).d(8)) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:140:0x013f A[LOOP:5: B:138:0x0139->B:140:0x013f, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x006e  */
            @Override // com.p7700g.p99005.i54.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void a() {
                boolean z;
                Iterator it;
                int i;
                boolean z2;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i2 = 10;
                arrayList2.add(bc4.b(10));
                if (((e) this.d).a(512)) {
                    arrayList2.add(bc4.b(16));
                }
                int i3 = 8;
                if (((e) this.d).a(256)) {
                    arrayList2.add(bc4.b(8));
                    if (((e) this.d).a(112) && yb4.b.OCTAL.g().equals("0") && k(this.c)) {
                        z = true;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList3 = new ArrayList();
                            i iVar = new i(intValue);
                            arrayList3.add(iVar);
                            if (intValue == i3) {
                                iVar.X(yb4.b.OCTAL.g());
                            } else if (intValue == 16) {
                                iVar.X(yb4.b.HEX.g());
                            }
                            if (((e) this.d).a(48)) {
                                int[] c = c(intValue);
                                int p1 = this.c.p1();
                                int i4 = 0;
                                while (i4 < p1) {
                                    int i5 = c[i4];
                                    int size = arrayList3.size();
                                    while (i5 > 0) {
                                        int i6 = 0;
                                        while (i6 < size) {
                                            i iVar2 = (i) arrayList3.get(i6);
                                            if (z && intValue == i2) {
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= p1) {
                                                        z2 = true;
                                                        break;
                                                    } else if (i7 != i4 && iVar2.p0(i7) == 0) {
                                                        z2 = false;
                                                        break;
                                                    } else {
                                                        i7++;
                                                    }
                                                }
                                                if (z2) {
                                                    i6++;
                                                    i2 = 10;
                                                }
                                            }
                                            i l0 = iVar2.l0();
                                            l0.m0(i4, i5, this.c.p1());
                                            arrayList3.add(l0);
                                            i6++;
                                            i2 = 10;
                                        }
                                        if (!((e) this.d).a(112)) {
                                            break;
                                        }
                                        i5--;
                                        i2 = 10;
                                    }
                                    i4++;
                                    i2 = 10;
                                }
                            } else if (((e) this.d).a(16) && f(intValue)) {
                                i iVar3 = new i(10);
                                iVar3.J(true);
                                arrayList3.add(iVar3);
                                arrayList.addAll(arrayList3);
                                i2 = 10;
                                i3 = 8;
                            }
                            arrayList.addAll(arrayList3);
                            i2 = 10;
                            i3 = 8;
                        }
                        for (i = 0; i < arrayList.size(); i++) {
                            b((i) arrayList.get(i));
                        }
                    }
                }
                z = false;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                while (i < arrayList.size()) {
                }
            }

            @Override // com.p7700g.p99005.i54.b
            /* renamed from: j */
            public void b(i iVar) {
                super.b(iVar);
            }

            private b(o34 o34Var, e eVar, a aVar) {
                super(o34Var, eVar, aVar);
            }
        }

        @Override // com.p7700g.p99005.i54
        public void d(i54 i54Var) {
            super.d(i54Var);
        }
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class h extends m14.e {

        /* compiled from: IPv4AddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends m14.e.a {
            public a() {
                this(10, '.');
            }

            @Override // com.p7700g.p99005.m14.e.a
            /* renamed from: y */
            public h x() {
                return new h(this.d, this.c, this.l, this.b, this.e, this.f, this.g, this.k, this.h, this.i, this.j);
            }

            public a(int i, char c) {
                super(i, c);
            }
        }

        public h(int i, boolean z, m14.l.a aVar, f34.n.b bVar, String str, Character ch, String str2, String str3, boolean z2, boolean z3, boolean z4) {
            super(i, z, aVar, bVar, str, ch, gl4.R, str2, str3, z2, z3, z4);
        }
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class i extends g24.c<o34> {
        public i(int i) {
            super(i, '.', false);
        }

        @Override // com.p7700g.p99005.g24.c
        /* renamed from: u0 */
        public i l0() {
            return (i) super.clone();
        }
    }

    public bc4(cc4 cc4Var) {
        this(new cc4[]{cc4Var}, false);
    }

    private /* synthetic */ Iterator A9(int i2) {
        return D0(i2).iterator();
    }

    /* renamed from: Ba */
    public /* synthetic */ Iterator Ca(final Integer num, boolean z, boolean z2, bc4 bc4Var) {
        return bc4Var.M8(new Predicate() { // from class: com.p7700g.p99005.x94
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bc4.this.Aa(num, (cc4[]) obj);
            }
        });
    }

    private /* synthetic */ Iterator C9(int i2) {
        return D0(i2).F0();
    }

    public static /* synthetic */ long Da(int i2, bc4 bc4Var) {
        return f34.q4(bc4Var, i2);
    }

    private /* synthetic */ Iterator E9(int i2) {
        return D0(i2).B0();
    }

    public static /* synthetic */ bc4 Fa(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (bc4) f34.V(cc4VarArr, aVar, num);
    }

    private /* synthetic */ Iterator G9(int i2) {
        return D0(i2).iterator();
    }

    private /* synthetic */ Iterator I9(int i2) {
        return D0(i2).F0();
    }

    private /* synthetic */ cc4 Ja(Integer num, int i2) {
        return D0(i2).r6(num, true);
    }

    private /* synthetic */ Iterator K9(int i2) {
        return D0(i2).B0();
    }

    private Iterator<bc4> M8(Predicate<cc4[]> predicate) {
        boolean f2 = m0().i().f();
        boolean z = (z3() || (f2 && C0())) ? false : true;
        return f34.W3(z, (!z || (predicate != null && predicate.test(O5()))) ? null : this, Y7(), z ? null : jb(predicate), f2 ? null : L0());
    }

    public static /* synthetic */ bc4 M9(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (bc4) f34.V(cc4VarArr, aVar, num);
    }

    private gc4 N8(int i2) {
        int V0 = (V0() - 1) - i2;
        Integer num = null;
        long j = 0;
        long j2 = 0;
        int i3 = 0;
        cc4 cc4Var = null;
        int i4 = 0;
        for (int i5 = 0; i5 <= i2; i5++) {
            int i6 = V0 + i5;
            cc4 D0 = D0(i6);
            if (cc4Var != null) {
                if (!D0.H0()) {
                    throw new t14(cc4Var, i3, D0, i6, "ipaddress.error.segmentMismatch");
                }
            } else if (D0.z3()) {
                i3 = i6;
                cc4Var = D0;
            }
            j = (j << u2()) | D0.B1();
            j2 = (j2 << u2()) | D0.h3();
            if (num == null) {
                Integer D5 = D0.D5();
                if (D5 != null) {
                    num = b(D5.intValue() + i4);
                } else {
                    i4 = D0.A0() + i4;
                }
            }
        }
        return new gc4(i2, j, j2, num);
    }

    public static /* synthetic */ int P8(bc4 bc4Var, int i2) {
        return bc4Var.D0(i2).B1();
    }

    public static /* synthetic */ int Q8(bc4 bc4Var, bc4 bc4Var2, int i2) {
        return bc4Var.D0(i2).B1() & bc4Var2.D0(i2).B1();
    }

    public static /* synthetic */ Iterator Q9(boolean z, boolean z2, bc4 bc4Var) {
        return (z || z2) ? bc4Var.B0() : bc4Var.F0();
    }

    private void R7(bc4[] bc4VarArr) {
        for (bc4 bc4Var : bc4VarArr) {
            if (bc4Var != null && bc4Var.V0() != V0()) {
                throw new z14(this, bc4Var);
            }
        }
    }

    private /* synthetic */ Iterator R8(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public static /* synthetic */ long R9(int i2, bc4 bc4Var) {
        return f34.w4(bc4Var, i2);
    }

    public static /* synthetic */ yb4 S9(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (yb4) f34.U(cc4VarArr, aVar, num);
    }

    private /* synthetic */ Iterator T8(int i2) {
        return D0(i2).E6();
    }

    private /* synthetic */ Iterator V8(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    private Iterator<bc4> Va(boolean z) {
        boolean z2;
        Iterator I4;
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            ac4.a Y7 = Y7();
            if (z) {
                z2 = b1();
            } else {
                z2 = M6(L0.intValue()) == 1;
            }
            int n3 = m14.n3(L0.intValue(), Z1(), u2());
            int i3 = m14.i3(L0.intValue(), Z1(), u2());
            int V0 = V0();
            if (z2) {
                I4 = null;
            } else {
                I4 = f34.I4(V0, Y7, null, new IntFunction() { // from class: com.p7700g.p99005.ja4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return bc4.this.D0(i2).iterator();
                    }
                }, null, n3, i3, z ? new IntFunction() { // from class: com.p7700g.p99005.b84
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return bc4.this.D0(i2).F0();
                    }
                } : new IntFunction() { // from class: com.p7700g.p99005.h84
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        return bc4.this.D0(i2).B0();
                    }
                });
            }
            return f34.W3(z2, this, Y7, I4, L0);
        }
        return iterator();
    }

    public static /* synthetic */ Iterator W9(boolean z, boolean z2, yb4 yb4Var) {
        return (z || z2) ? yb4Var.B0() : yb4Var.F0();
    }

    private Predicate<cc4[]> X7() {
        if (C0()) {
            final int intValue = K3().intValue();
            return new Predicate() { // from class: com.p7700g.p99005.r74
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return bc4.this.l9((cc4[]) obj, intValue);
                }
            };
        }
        return null;
    }

    private /* synthetic */ Iterator X8(int i2) {
        return D0(i2).E6();
    }

    private ac4.a Y7() {
        return h8();
    }

    private /* synthetic */ cc4 Y9(boolean z, int i2) {
        return D0(i2).i6(z);
    }

    private x44<bc4> Ya(boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Za(z, L0.intValue());
        }
        return vb(false);
    }

    private bc4[] Z7(bc4... bc4VarArr) {
        bc4[] bc4VarArr2 = new bc4[bc4VarArr.length + 1];
        System.arraycopy(bc4VarArr, 0, bc4VarArr2, 1, bc4VarArr.length);
        bc4VarArr2[0] = this;
        return bc4VarArr2;
    }

    public static /* synthetic */ bc4 Z8(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (bc4) f34.V(cc4VarArr, aVar, num);
    }

    private x44<bc4> Za(boolean z, final int i2) {
        g24.d dVar;
        if (i2 <= A0() && i2 >= 0) {
            final Integer b2 = b(i2);
            final ac4.a Y7 = Y7();
            final int n3 = m14.n3(i2, Z1(), u2());
            final int i3 = m14.i3(i2, Z1(), u2());
            bc4 o0 = o0(i2, false);
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.o84
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.da4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bc4.M9(ac4.a.this, r2, (cc4[]) obj2);
                        }
                    }, ac4.a.this, ((bc4) ((g24.e) obj).a()).O5(), n3, i3, b2);
                    return K4;
                }
            };
            if (z) {
                dVar = l84.a;
            } else {
                dVar = !M0() ? m94.a : r84.a;
            }
            return g24.h(o0, predicate, dVar, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.b94
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return bc4.R9(i2, (bc4) obj);
                }
            });
        }
        throw new y14(this, i2);
    }

    private /* synthetic */ cc4 aa(int i2) {
        return D0(i2).y6();
    }

    public static Integer b(int i2) {
        return m14.b(i2);
    }

    public static /* synthetic */ long c9(int i2, bc4 bc4Var) {
        return f34.q4(bc4Var, i2);
    }

    /* renamed from: ca */
    public /* synthetic */ cc4[] da() {
        return a0().N0();
    }

    public static /* synthetic */ yb4 d9(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (yb4) f34.U(cc4VarArr, aVar, num);
    }

    private bc4 db(int i2, int i3, bc4 bc4Var, int i4, int i5, boolean z) {
        bc4 o0;
        bc4 J0;
        int i6;
        bc4 bc4Var2;
        int i7;
        bc4 bc4Var3;
        int i8 = i3;
        bc4 bc4Var4 = bc4Var;
        int i9 = i5;
        int V0 = V0();
        int i10 = i8 - i2;
        int i11 = i9 - i4;
        if (i10 < 0 || i11 < 0 || i2 < 0 || i4 < 0 || i9 > bc4Var.V0() || i8 > V0) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = (V0 + i11) - i10;
        if (i12 <= 4) {
            if (i11 == 0 && i10 == 0) {
                return this;
            }
            if (V0 == i10) {
                return bc4Var4;
            }
            if (m0().i().f()) {
                if (z) {
                    o0 = t0();
                    int i13 = i9 << 3;
                    if (!bc4Var.C0() || bc4Var.K3().intValue() > i13) {
                        bc4Var4 = bc4Var.o0(i13, false);
                    }
                    i7 = i9;
                    bc4Var3 = bc4Var4;
                    i6 = i8;
                    bc4Var2 = o0;
                }
                i7 = i9;
                bc4Var3 = bc4Var4;
                i6 = i8;
                bc4Var2 = this;
            } else {
                Integer L0 = L0();
                if (z) {
                    int i14 = V0 - i8;
                    if (i14 > 0) {
                        J0 = J0(0, i2).t0();
                        bc4 H8 = bc4Var.H8(i9, z0(i3));
                        i9 += i14;
                        bc4Var4 = H8;
                        i8 = i2;
                    } else {
                        J0 = t0();
                        int i15 = i9 << 3;
                        if (!bc4Var.C0() || bc4Var.K3().intValue() > i15) {
                            bc4Var4 = bc4Var.o0(i15, false);
                        }
                    }
                } else {
                    if (L0 != null && !z && L0.intValue() <= (i2 << 3)) {
                        bc4Var4 = bc4Var.o0(0, false);
                    } else if (i8 < V0) {
                        int i16 = i9 << 3;
                        if (bc4Var.C0() && bc4Var.K3().intValue() <= i16) {
                            int i17 = i8 << 3;
                            if (L0 == null || L0.intValue() > i17) {
                                if (i10 <= 0 && bc4Var.L0().intValue() != 0) {
                                    J0 = J0(0, i2);
                                    bc4Var4 = bc4Var.H8(i9, z0(i3));
                                    i9 += V0 - i8;
                                } else {
                                    o0 = o0(i17, false);
                                    i7 = i9;
                                    bc4Var3 = bc4Var4;
                                    i6 = i8;
                                    bc4Var2 = o0;
                                }
                            }
                        }
                    }
                    i7 = i9;
                    bc4Var3 = bc4Var4;
                    i6 = i8;
                    bc4Var2 = this;
                }
                bc4 bc4Var5 = bc4Var4;
                i6 = i8;
                bc4Var2 = J0;
                i7 = i9;
                bc4Var3 = bc4Var5;
            }
            return (bc4) f34.D4(bc4Var2, i2, i6, bc4Var3, i4, i7, Y7(), z, false);
        }
        throw new c14(this, bc4Var, i12);
    }

    private /* synthetic */ Iterator ea(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public static /* synthetic */ bc4 ga(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (bc4) f34.V(cc4VarArr, aVar, num);
    }

    private ac4.a h8() {
        return m0().u();
    }

    private int i8(boolean z) {
        int V0 = V0();
        int i2 = 0;
        for (int i3 = 0; i3 < V0; i3++) {
            cc4 D0 = D0(i3);
            i2 = (i2 << u2()) | (z ? D0.B1() : D0.h3());
        }
        return i2;
    }

    public static /* synthetic */ long ja(int i2, bc4 bc4Var) {
        return f34.q4(bc4Var, i2);
    }

    private Iterator<cc4[]> jb(Predicate<cc4[]> predicate) {
        final boolean f2 = m0().i().f();
        return f34.H4(V0(), y8(), z3() ? null : new Supplier() { // from class: com.p7700g.p99005.q84
            @Override // java.util.function.Supplier
            public final Object get() {
                return bc4.this.da();
            }
        }, new IntFunction() { // from class: com.p7700g.p99005.p94
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return bc4.this.fa(f2, i2);
            }
        }, predicate);
    }

    public static /* synthetic */ yb4 ka(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (yb4) f34.U(cc4VarArr, aVar, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0056, code lost:
        if (r0 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private bc4 m8(final boolean z, boolean z2) {
        bc4 bc4Var = (bc4) f34.C3(this);
        if (bc4Var == null) {
            f34.k<bc4> kVar = this.S;
            if (kVar != null) {
                if (z) {
                }
            }
            synchronized (this) {
                f34.k<bc4> kVar2 = this.S;
                boolean z3 = false;
                boolean z4 = kVar2 == null;
                if (z4) {
                    kVar2 = new f34.k<>();
                    this.S = kVar2;
                } else if (!z) {
                    bc4Var = kVar2.c;
                } else if (z2) {
                    bc4Var = kVar2.b;
                    if (bc4Var == null && !kVar2.d) {
                        z3 = true;
                    }
                    z4 = z3;
                } else {
                    bc4Var = kVar2.a;
                    if (bc4Var == null) {
                        z3 = true;
                    }
                    z4 = z3;
                }
                if (z4) {
                    bc4Var = (bc4) m14.G5(this, Y7(), new Supplier() { // from class: com.p7700g.p99005.d74
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return bc4.this.b2();
                        }
                    }, new IntFunction() { // from class: com.p7700g.p99005.ba4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i2) {
                            return bc4.this.p9(z, i2);
                        }
                    }, z, z2);
                    if (bc4Var == null) {
                        kVar2.d = true;
                    } else if (!z) {
                        kVar2.c = bc4Var;
                    } else if (z2) {
                        kVar2.b = bc4Var;
                    } else {
                        kVar2.a = bc4Var;
                    }
                }
            }
        } else if (z2 && o4()) {
            return null;
        }
        return bc4Var;
    }

    private /* synthetic */ cc4 m9(Integer num, int i2) {
        return D0(i2).o6(num);
    }

    private static long n8(int i2) {
        return Q[i2];
    }

    /* renamed from: o9 */
    public /* synthetic */ cc4 p9(boolean z, int i2) {
        return z ? D0(i2).x5() : D0(i2).b0();
    }

    private bc4 ob(int i2, boolean z, boolean z2, boolean z3) {
        return (bc4) m14.e7(this, Y7(), i2, z, z2, !z3, f94.a);
    }

    public static /* synthetic */ long pa(int i2, Integer num, yb4 yb4Var) {
        return f34.q4(yb4Var.O0(), i2) - yb4Var.O0().N6(num.intValue(), i2);
    }

    private /* synthetic */ cc4 q9(boolean z, Integer num, int i2) {
        return D0(i2).r6(num, z);
    }

    private /* synthetic */ boolean qa(Integer num, cc4[] cc4VarArr) {
        return l9(cc4VarArr, num.intValue());
    }

    /* renamed from: s9 */
    public /* synthetic */ long t9() {
        return n8(V0());
    }

    /* renamed from: sa */
    public /* synthetic */ Iterator ta(final Integer num, boolean z, boolean z2, yb4 yb4Var) {
        return yb4Var.O0().L8(yb4Var, yb4Var.m6(), new Predicate() { // from class: com.p7700g.p99005.h94
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bc4.this.ra(num, (cc4[]) obj);
            }
        });
    }

    public static p14 u5(p14 p14Var, p14 p14Var2, p14 p14Var3) {
        return m14.u5(p14Var, p14Var2, p14Var3);
    }

    /* renamed from: u9 */
    public /* synthetic */ cc4[] v9() {
        return a0().O5();
    }

    public static <T extends p14> T v5(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, Comparator<T> comparator) throws r04 {
        return (T) m14.v5(t, t2, unaryOperator, unaryOperator2, comparator);
    }

    private /* synthetic */ Iterator w9(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public static /* synthetic */ yb4 wa(ac4.a aVar, Integer num, cc4[] cc4VarArr) {
        return (yb4) f34.U(cc4VarArr, aVar, num);
    }

    private ac4.a y8() {
        return h8();
    }

    public static /* synthetic */ int y9(bc4 bc4Var, int i2) {
        return bc4Var.D0(i2).B1();
    }

    public static /* synthetic */ long ya(int i2, Integer num, bc4 bc4Var) {
        return f34.q4(bc4Var, i2) - bc4Var.N6(num.intValue(), i2);
    }

    public static /* synthetic */ int z9(bc4 bc4Var, bc4 bc4Var2, int i2) {
        return bc4Var.D0(i2).B1() | bc4Var2.D0(i2).B1();
    }

    private /* synthetic */ boolean za(Integer num, cc4[] cc4VarArr) {
        return l9(cc4VarArr, num.intValue());
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return V0() << 3;
    }

    public void A8(Collection<? super cc4> collection) {
        z8(0, V0(), collection);
    }

    public /* synthetic */ boolean Aa(Integer num, cc4[] cc4VarArr) {
        return l9(cc4VarArr, num.intValue());
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Ab */
    public bc4 p7() throws t14 {
        if (!C0()) {
            yb4 x = m0().x(0);
            if (m0().i().f()) {
                return x.J0(0, V0());
            }
            return x.k5(0).J0(0, V0());
        } else if (o4() && m6()) {
            return a0();
        } else {
            return U7();
        }
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<bc4> B0() {
        return Va(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: B7 */
    public bc4 r0(boolean z) {
        return q0(z, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: B8 */
    public cc4[] N0() {
        return (cc4[]) u().clone();
    }

    public /* synthetic */ Iterator B9(int i2) {
        return D0(i2).iterator();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Bb */
    public bc4 q7(int i2) {
        if (C0() && i2 == K3().intValue()) {
            return p7();
        }
        final yb4 x = m0().x(i2);
        return (bc4) m14.M5(this, null, Y7(), false, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.u84
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int B1;
                B1 = yb4.this.D0(i3).B1();
                return B1;
            }
        });
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: C7 */
    public bc4 q0(boolean z, boolean z2) {
        return (bc4) super.q0(z, z2);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: C8 */
    public cc4[] O5() {
        return (cc4[]) super.u();
    }

    public String Cb(m14.e eVar, int i2) throws t14 {
        if (i2 <= 0) {
            return D2(eVar);
        }
        if (V0() <= 1) {
            return D2(eVar);
        }
        return m14.r7(eVar, zb(i2));
    }

    @Override // com.p7700g.p99005.p14
    public String D3() {
        String str;
        if (Z5() || (str = this.R.q) == null) {
            f fVar = this.R;
            String D2 = D2(f.y);
            fVar.q = D2;
            return D2;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: D7 */
    public bc4 j0(int i2) {
        return u0(i2, true);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: D8 */
    public f U5() {
        return this.R;
    }

    public /* synthetic */ Iterator D9(int i2) {
        return D0(i2).F0();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Db */
    public bc4 t7() {
        Integer K3 = K3();
        return (K3 == null || m0().i().f()) ? this : u7(K3.intValue());
    }

    @Override // com.p7700g.p99005.q04
    public String E0() {
        return U0();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: E7 */
    public bc4 u0(int i2, boolean z) {
        return (bc4) m14.a5(this, i2, z, Y7(), n74.a);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: E8 */
    public bc4 b0() {
        return m8(false, false);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Eb */
    public bc4 u7(int i2) throws y14 {
        return (bc4) m14.v7(this, i2, Y7(), new m14.g() { // from class: com.p7700g.p99005.x74
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return bc4.this.Ka((Integer) obj, i3);
            }
        });
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<bc4> F0() {
        return Va(true);
    }

    public bc4 F7(bc4 bc4Var) {
        int V0 = V0();
        return cb(V0, V0, bc4Var, 0, bc4Var.V0());
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: F8 */
    public bc4 l0(long j) {
        if (j != 0 || z3()) {
            long I8 = I8() & 4294967295L;
            long Jb = Jb() & 4294967295L;
            long longValue = getCount().longValue();
            f34.S(j, I8, Jb, longValue, new LongSupplier() { // from class: com.p7700g.p99005.t74
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return bc4.this.t9();
                }
            });
            return (bc4) f34.E3(this, j, Y7(), longValue, I8, Jb, new Supplier() { // from class: com.p7700g.p99005.qb4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return bc4.this.a0();
                }
            }, new Supplier() { // from class: com.p7700g.p99005.b74
                @Override // java.util.function.Supplier
                public final Object get() {
                    return bc4.this.b0();
                }
            }, m0().i().f() ? null : L0());
        }
        return this;
    }

    public /* synthetic */ Iterator F9(int i2) {
        return D0(i2).B0();
    }

    public i54 Fb(e eVar) {
        o34[] t8;
        d dVar = new d();
        for (o34 o34Var : t8(eVar)) {
            dVar.c(new g.b(o34Var, eVar, new g.a(o34Var)).e());
        }
        return dVar;
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof bc4) && super.G(g24Var);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<bc4> G0() {
        return Ya(true);
    }

    @Override // com.p7700g.p99005.p14
    public String G1() {
        String str;
        if (Z5() || (str = this.R.j) == null) {
            f fVar = this.R;
            String D2 = D2(f.s);
            fVar.j = D2;
            return D2;
        }
        return str;
    }

    public bc4 G7(bc4 bc4Var) {
        bc4 bc4Var2;
        Integer K3 = K3();
        if (K3 == null) {
            return F7(bc4Var);
        }
        int u2 = u2();
        int intValue = K3.intValue() % u2;
        if (intValue != 0) {
            K3 = Integer.valueOf((u2 - intValue) + K3.intValue());
            bc4Var2 = o0(K3.intValue(), false);
        } else {
            bc4Var2 = this;
        }
        int intValue2 = K3.intValue() >>> 3;
        if (bc4Var.C0() && bc4Var.L0().intValue() == 0) {
            return H8(intValue2, bc4Var);
        }
        return bc4Var2.db(intValue2, intValue2, bc4Var, 0, bc4Var.V0(), true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: G8 */
    public bc4 g0(long j) {
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 <= 0) {
            return i2 == 0 ? this : a0().l0(j);
        }
        return b0().l0(j);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Gb */
    public bc4 x7() throws t14 {
        if (!C0()) {
            ac4 m0 = m0();
            s04.c i2 = m0.i();
            yb4 G = m0.G(0, !i2.f());
            if (i2.h()) {
                G = G.m();
            }
            return G.J0(0, V0());
        } else if (o4() && m6()) {
            return a0();
        } else {
            return V7(false);
        }
    }

    @Override // com.p7700g.p99005.p14
    public String H2() {
        return G1();
    }

    @Override // com.p7700g.p99005.z04
    public String H3() {
        return U0();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: H7 */
    public bc4 p0(int i2) {
        return ob(i2, true, true, true);
    }

    public bc4 H8(int i2, bc4 bc4Var) {
        return cb(i2, i2, bc4Var, 0, bc4Var.V0());
    }

    public /* synthetic */ Iterator H9(int i2) {
        return D0(i2).iterator();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Hb */
    public bc4 y7(int i2) {
        if (C0() && i2 == K3().intValue()) {
            return x7();
        }
        final yb4 E = m0().E(i2);
        return (bc4) m14.V5(this, null, Y7(), false, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.a84
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int B1;
                B1 = yb4.this.D0(i3).B1();
                return B1;
            }
        }, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: I7 */
    public bc4 g2() {
        return (bc4) super.g2();
    }

    public int I8() {
        return i8(true);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: Ib */
    public bc4 z7() {
        if (!C0()) {
            return m0().x(A0()).J0(0, V0());
        }
        return W7();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: J7 */
    public bc4 e5() {
        return (bc4) super.F2();
    }

    public bc4 J8(bc4 bc4Var) throws z14 {
        ac4.a Y7 = Y7();
        tb4 tb4Var = new tb4(this);
        Objects.requireNonNull(bc4Var);
        return (bc4) m14.d6(this, bc4Var, Y7, tb4Var, new tb4(bc4Var));
    }

    public /* synthetic */ Iterator J9(int i2) {
        return D0(i2).F0();
    }

    public int Jb() {
        return i8(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<bc4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    public bc4 K7(bc4 bc4Var) throws t14 {
        return L7(bc4Var, false);
    }

    /* renamed from: K8 */
    public boolean l9(cc4[] cc4VarArr, int i2) {
        return super.r6(cc4VarArr, i2);
    }

    public /* synthetic */ cc4 Ka(Integer num, int i2) {
        return D0(i2).r6(num, true);
    }

    public long Kb() {
        return Jb() & 4294967295L;
    }

    public bc4 L7(bc4 bc4Var, boolean z) throws t14, z14 {
        k5(bc4Var);
        return (bc4) m14.M5(this, z ? L0() : null, Y7(), true, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.v74
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return bc4.P8(bc4.this, i2);
            }
        });
    }

    public Iterator<yb4> L8(yb4 yb4Var, d34<yb4, ?, ?, cc4> d34Var, Predicate<cc4[]> predicate) {
        Iterator H4;
        final boolean f2 = m0().i().f();
        boolean z = (z3() || (f2 && C0())) ? false : true;
        if (z && predicate != null && predicate.test(yb4Var.O0().O5())) {
            yb4Var = null;
        }
        if (z) {
            H4 = null;
        } else {
            H4 = f34.H4(V0(), d34Var, z3() ? null : new Supplier() { // from class: com.p7700g.p99005.o94
                @Override // java.util.function.Supplier
                public final Object get() {
                    return bc4.this.v9();
                }
            }, new IntFunction() { // from class: com.p7700g.p99005.k84
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return bc4.this.x9(f2, i2);
                }
            }, predicate);
        }
        return f34.U3(z, yb4Var, d34Var, H4, f2 ? null : L0());
    }

    public /* synthetic */ Iterator L9(int i2) {
        return D0(i2).B0();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Lb */
    public bc4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.g24
    public void M(InetAddress inetAddress) {
        super.M(inetAddress);
    }

    public bc4 M7(bc4 bc4Var, int i2) throws t14, z14 {
        k5(bc4Var);
        final bc4 H = m0().H(i2);
        return (bc4) m14.M5(this, b(i2), Y7(), true, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.l94
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return bc4.Q8(bc4.this, H, i3);
            }
        });
    }

    public long Ma() {
        return I8() & 4294967295L;
    }

    @Override // com.p7700g.p99005.m14
    public o34[] N5(m14.c cVar) {
        return t8(e.c(cVar));
    }

    public Iterator<yb4> N7(yb4 yb4Var, d34<yb4, ?, ?, cc4> d34Var, int i2) {
        if (i2 >= 0) {
            if (i2 > V0()) {
                return L8(yb4Var, d34Var, null);
            }
            final boolean f2 = m0().i().f();
            boolean z = !i6(i2);
            return f34.U3(z, yb4Var, d34Var, z ? null : f34.I4(V0(), d34Var, null, new IntFunction() { // from class: com.p7700g.p99005.ia4
                @Override // java.util.function.IntFunction
                public final Object apply(int i3) {
                    return bc4.this.W8(f2, i3);
                }
            }, null, i2 - 1, i2, new IntFunction() { // from class: com.p7700g.p99005.w84
                @Override // java.util.function.IntFunction
                public final Object apply(int i3) {
                    return bc4.this.D0(i3).E6();
                }
            }), f2 ? null : L0());
        }
        throw new IllegalArgumentException();
    }

    public bc4 Na(bc4 bc4Var) throws t14 {
        return Oa(bc4Var, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Stream<bc4> O1(int i2) {
        return StreamSupport.stream(y2(i2), false);
    }

    @Override // com.p7700g.p99005.m14
    public boolean O6(m14 m14Var, m14 m14Var2) {
        return (m14Var instanceof bc4) && (m14Var2 instanceof bc4) && super.O6(m14Var, m14Var2);
    }

    public x44<yb4> O7(yb4 yb4Var, final ac4.a aVar, final int i2) {
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return ub(yb4Var, aVar, false);
            }
            boolean f2 = m0().i().f();
            final Integer num = null;
            Integer L0 = f2 ? null : L0();
            if (f2) {
                yb4Var = yb4Var.t0();
            } else {
                num = L0;
            }
            yb4 yb4Var2 = yb4Var;
            final int i3 = i2 - 1;
            return g24.h(yb4Var2, new Predicate() { // from class: com.p7700g.p99005.z74
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.w94
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bc4.d9(ac4.a.this, r2, (cc4[]) obj2);
                        }
                    }, ac4.a.this, ((yb4) ((g24.e) obj).a()).O0().O5(), i3, i2, num);
                    return K4;
                }
            }, new g24.d() { // from class: com.p7700g.p99005.o74
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    Iterator S2;
                    S2 = ((yb4) obj).S2(i2);
                    return S2;
                }
            }, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.g94
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long q4;
                    q4 = f34.q4(((yb4) obj).O0(), i2);
                    return q4;
                }
            });
        }
        throw new IllegalArgumentException();
    }

    public bc4 Oa(bc4 bc4Var, boolean z) throws t14, y14, z14 {
        k5(bc4Var);
        return (bc4) m14.V5(this, z ? L0() : null, Y7(), true, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.i84
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return bc4.y9(bc4.this, i2);
            }
        }, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<bc4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    public void P7(yb4 yb4Var, yb4 yb4Var2, yb4 yb4Var3) {
        if (!(yb4Var2 == null && yb4Var3 == null) && f34.C3(this) == null) {
            O0().Q7(yb4Var2 != null ? yb4Var2.O0() : null, yb4Var3 != null ? yb4Var3.O0() : null);
            c cVar = yb4Var.z0;
            if (cVar == null || ((yb4Var2 != null && cVar.a == 0) || (yb4Var3 != null && cVar.c == 0))) {
                synchronized (this) {
                    c cVar2 = yb4Var.z0;
                    if (cVar2 == null) {
                        c cVar3 = new c();
                        yb4Var.z0 = cVar3;
                        cVar3.a = yb4Var2;
                        cVar3.c = yb4Var3;
                    } else {
                        if (cVar2.a == 0) {
                            cVar2.a = yb4Var2;
                        }
                        if (cVar2.c == 0) {
                            cVar2.c = yb4Var3;
                        }
                    }
                }
            }
        }
    }

    public bc4 Pa(bc4 bc4Var, int i2) throws t14, y14, z14 {
        k5(bc4Var);
        final bc4 y = m0().y(i2);
        return (bc4) m14.V5(this, b(i2), Y7(), true, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.ha4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return bc4.z9(bc4.this, y, i3);
            }
        }, false);
    }

    @Override // com.p7700g.p99005.p14
    public String Q2() {
        String str;
        if (Z5() || (str = this.R.k) == null) {
            f fVar = this.R;
            String D2 = D2(f.r);
            fVar.k = D2;
            return D2;
        }
        return str;
    }

    public void Q7(bc4 bc4Var, bc4 bc4Var2) {
        f34.k<bc4> kVar = this.S;
        if (bc4Var == null && bc4Var2 == null) {
            return;
        }
        if (kVar == null || ((bc4Var != null && kVar.a == null) || (bc4Var2 != null && kVar.c == null))) {
            synchronized (this) {
                f34.k<bc4> kVar2 = this.S;
                if (kVar2 == null) {
                    f34.k<bc4> kVar3 = new f34.k<>();
                    this.S = kVar3;
                    kVar3.a = bc4Var;
                    kVar3.c = bc4Var2;
                } else {
                    if (kVar2.a == null) {
                        kVar2.a = bc4Var;
                    }
                    if (kVar2.c == null) {
                        kVar2.c = bc4Var2;
                    }
                }
            }
        }
    }

    @Deprecated
    public bc4[] Qa(bc4... bc4VarArr) throws z14 {
        return Ra(bc4VarArr);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public v44<bc4, cc4[]> R0() {
        bc4 bc4Var;
        final int V0 = V0();
        final Integer K3 = K3();
        final ac4.a Y7 = Y7();
        if (m0().i().f()) {
            K3 = null;
            bc4Var = t0();
        } else {
            bc4Var = this;
        }
        final int i2 = V0 - 1;
        return g24.g(bc4Var, new Predicate() { // from class: com.p7700g.p99005.p74
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.u74
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return bc4.ga(ac4.a.this, r2, (cc4[]) obj2);
                    }
                }, ac4.a.this, ((bc4) ((g24.e) obj).a()).O5(), i2, V0, K3);
                return K4;
            }
        }, c94.a, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.p84
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return bc4.ja(V0, (bc4) obj);
            }
        });
    }

    @Override // com.p7700g.p99005.m14
    public boolean R6(m14 m14Var) {
        return m14Var == this || ((m14Var instanceof bc4) && i34.V4(this, m14Var, 0));
    }

    public bc4[] Ra(bc4... bc4VarArr) throws z14 {
        R7(bc4VarArr);
        List<p14> H5 = m14.H5(Z7(bc4VarArr));
        return (bc4[]) H5.toArray(new bc4[H5.size()]);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public Stream<cc4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    @Override // com.p7700g.p99005.p14
    public String S1() {
        return G1();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<bc4> S2(int i2) {
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return iterator();
            }
            ac4.a Y7 = Y7();
            boolean z = !i6(i2);
            final boolean f2 = m0().i().f();
            return f34.W3(z, this, Y7, z ? null : f34.I4(V0(), Y7, null, new IntFunction() { // from class: com.p7700g.p99005.d84
                @Override // java.util.function.IntFunction
                public final Object apply(int i3) {
                    return bc4.this.S8(f2, i3);
                }
            }, null, i2 - 1, i2, new IntFunction() { // from class: com.p7700g.p99005.ga4
                @Override // java.util.function.IntFunction
                public final Object apply(int i3) {
                    return bc4.this.D0(i3).E6();
                }
            }), f2 ? null : L0());
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: S7 */
    public bc4 t5() {
        return (bc4) u5(this, a0(), b0());
    }

    public /* synthetic */ Iterator S8(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public bc4[] Sa(bc4... bc4VarArr) throws z14 {
        R7(bc4VarArr);
        bc4[] Z7 = Z7(bc4VarArr);
        final ac4.a Y7 = Y7();
        Objects.requireNonNull(Y7);
        List<p14> I5 = m14.I5(Z7, new m14.i() { // from class: com.p7700g.p99005.f74
            @Override // com.p7700g.p99005.m14.i
            public final p14 a(p14 p14Var, int i2, int i3, int i4) {
                return ac4.a.this.w4(p14Var, i2, i3, i4);
            }
        });
        return (bc4[]) I5.toArray(new bc4[I5.size()]);
    }

    @Override // com.p7700g.p99005.p14
    public String T3() {
        String str;
        if (Z5() || (str = this.R.l) == null) {
            f fVar = this.R;
            String D2 = D2(f.t);
            fVar.l = D2;
            return D2;
        }
        return str;
    }

    public bc4 T7(bc4 bc4Var) throws r04 {
        m5(bc4Var);
        sb4 sb4Var = sb4.a;
        kb4 kb4Var = kb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (bc4) v5(this, bc4Var, sb4Var, kb4Var, new db4(o04Var));
    }

    public Iterator<yb4> Ta(yb4 yb4Var, d34<yb4, ?, ?, cc4> d34Var, boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Ua(yb4Var, d34Var, z, L0.intValue());
        }
        return L8(yb4Var, d34Var, null);
    }

    @Override // com.p7700g.p99005.z04
    public String U0() {
        String str;
        if (Z5() || (str = this.R.a) == null) {
            f fVar = this.R;
            String D2 = D2(f.w);
            fVar.a = D2;
            return D2;
        }
        return str;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public x44<bc4> U1() {
        return super.U1();
    }

    public bc4 U7() {
        Integer K3 = K3();
        final yb4 x = m0().x(K3.intValue());
        if (m0().i().f()) {
            K3 = null;
        }
        return (bc4) m14.M5(this, K3, Y7(), false, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.s84
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = yb4.this.D0(i2).B1();
                return B1;
            }
        });
    }

    public /* synthetic */ Iterator U8(int i2) {
        return D0(i2).E6();
    }

    public Iterator<yb4> Ua(yb4 yb4Var, d34<yb4, ?, ?, cc4> d34Var, boolean z, int i2) {
        boolean z2;
        Iterator I4;
        if (i2 <= A0() && i2 >= 0) {
            if (z) {
                z2 = Y2(i2);
            } else {
                z2 = M6(i2) == 1;
            }
            if (z2) {
                yb4Var = yb4Var.o0(i2, false);
            }
            int n3 = m14.n3(i2, Z1(), u2());
            int i3 = m14.i3(i2, Z1(), u2());
            int V0 = V0();
            if (z2) {
                I4 = null;
            } else {
                I4 = f34.I4(V0, d34Var, null, new IntFunction() { // from class: com.p7700g.p99005.e94
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return bc4.this.D0(i4).iterator();
                    }
                }, null, n3, i3, z ? new IntFunction() { // from class: com.p7700g.p99005.y84
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return bc4.this.D0(i4).F0();
                    }
                } : new IntFunction() { // from class: com.p7700g.p99005.v94
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i4) {
                        return bc4.this.D0(i4).B0();
                    }
                });
            }
            return f34.U3(z2, yb4Var, d34Var, I4, b(i2));
        }
        throw new y14(yb4Var, i2);
    }

    public bc4 V7(boolean z) {
        int intValue = K3().intValue();
        ac4 m0 = m0();
        final yb4 E = m0.E(intValue);
        return (bc4) m14.V5(this, m0.i().f() ? null : b(intValue), Y7(), !z, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.r94
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = yb4.this.D0(i2).B1();
                return B1;
            }
        }, true);
    }

    @Override // com.p7700g.p99005.p14, com.p7700g.p99005.z04
    public Iterator<cc4[]> W0() {
        return jb(null);
    }

    @Override // com.p7700g.p99005.v04
    public boolean W1(v04 v04Var) {
        return v04Var == this || ((v04Var instanceof bc4) && f34.y4(this, v04Var, 0));
    }

    public bc4 W7() {
        Integer K3 = K3();
        final yb4 x = m0().x(K3.intValue());
        return (bc4) m14.V5(this, K3, Y7(), false, new tb4(this), new IntUnaryOperator() { // from class: com.p7700g.p99005.y74
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                int B1;
                B1 = yb4.this.D0(i2).B1();
                return B1;
            }
        }, true);
    }

    public /* synthetic */ Iterator W8(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public x44<yb4> Wa(yb4 yb4Var, ac4.a aVar, boolean z) {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            return Xa(yb4Var, aVar, z, L0.intValue());
        }
        return ub(yb4Var, aVar, false);
    }

    @Override // com.p7700g.p99005.m14
    public BigInteger X5(int i2, int i3) {
        if (N2(i2)) {
            if (z3()) {
                return BigInteger.valueOf(N6(i2, i3));
            }
            return BigInteger.ONE;
        }
        return BigInteger.ZERO;
    }

    public x44<yb4> Xa(yb4 yb4Var, final ac4.a aVar, boolean z, final int i2) {
        g24.d dVar;
        if (i2 <= A0() && i2 >= 0) {
            final Integer b2 = b(i2);
            final int n3 = m14.n3(i2, Z1(), u2());
            final int i3 = m14.i3(i2, Z1(), u2());
            yb4 o0 = yb4Var.o0(i2, false);
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.aa4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.a94
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bc4.S9(ac4.a.this, r2, (cc4[]) obj2);
                        }
                    }, ac4.a.this, ((yb4) ((g24.e) obj).a()).O0().O5(), n3, i3, b2);
                    return K4;
                }
            };
            if (z) {
                dVar = q94.a;
            } else {
                dVar = !M0() ? g84.a : z94.a;
            }
            return g24.h(o0, predicate, dVar, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.i94
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long w4;
                    w4 = f34.w4(((yb4) obj).O0(), i2);
                    return w4;
                }
            });
        }
        throw new y14(yb4Var, i2);
    }

    @Override // com.p7700g.p99005.p14
    public i54 Y1(m14.c cVar) {
        return Fb(e.c(cVar));
    }

    public /* synthetic */ Iterator Y8(int i2) {
        return D0(i2).E6();
    }

    @Override // com.p7700g.p99005.p14
    public j14.b Z0() {
        return j14.b.IPV4;
    }

    @Override // com.p7700g.p99005.z04
    public int Z1() {
        return 1;
    }

    @Override // com.p7700g.p99005.m14
    public boolean Z5() {
        if (this.R == null) {
            synchronized (this) {
                if (this.R == null) {
                    this.R = new f();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public /* synthetic */ cc4 Z9(boolean z, int i2) {
        return D0(i2).i6(z);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    /* renamed from: a8 */
    public cc4 t(int i2) {
        return (cc4) super.t(i2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: ab */
    public bc4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.p14
    public Iterator<cc4[]> b2() {
        return jb(X7());
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: b8 */
    public bc4 a2() {
        return (bc4) super.a2();
    }

    public /* synthetic */ cc4 ba(int i2) {
        return D0(i2).y6();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: bb */
    public bc4 v0(boolean z) {
        return (bc4) m14.T6(this, z, Y7(), rb4.a);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: c8 */
    public bc4 i2() {
        if (C0()) {
            return z4(K3().intValue());
        }
        return z4(0);
    }

    public bc4 cb(int i2, int i3, bc4 bc4Var, int i4, int i5) {
        return db(i2, i3, bc4Var, i4, i5, false);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: d8 */
    public bc4 z4(int i2) throws y14 {
        return (bc4) m14.C5(this, i2, D5(i2), Y7(), new m14.g() { // from class: com.p7700g.p99005.u94
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return bc4.this.n9((Integer) obj, i3);
            }
        });
    }

    public long e8(boolean z) {
        if (z && o4()) {
            return N6(K3().intValue(), V0());
        }
        return L6(V0());
    }

    public bc4 eb(int i2, bc4 bc4Var) {
        return cb(i2, bc4Var.V0() + i2, bc4Var, 0, bc4Var.V0());
    }

    @Override // com.p7700g.p99005.i34, com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof bc4) && ((bc4) obj).G(this));
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<bc4> f0() {
        return this;
    }

    public long f8() {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() < A0()) {
            return g8(L0.intValue());
        }
        return e8(false);
    }

    public /* synthetic */ Iterator fa(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: fb */
    public bc4 d0(final boolean z) {
        return (bc4) f34.E4(z, this, Y7(), new IntFunction() { // from class: com.p7700g.p99005.m84
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return bc4.this.Z9(z, i2);
            }
        }, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public int g3() {
        return V0();
    }

    @Override // com.p7700g.p99005.m14
    public boolean g6() {
        return true;
    }

    public long g8(int i2) {
        g24.d(this, i2);
        return M6(i2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: gb */
    public bc4 c0() {
        return s0();
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger h1(int i2) {
        return BigInteger.valueOf(g8(i2));
    }

    @Override // com.p7700g.p99005.m14
    public void h5(String str) {
        if (Z5() || this.R.a == null) {
            this.R.a = str;
        }
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: hb */
    public bc4 k0() {
        return !C0() ? this : t0();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: ib */
    public bc4 s0() {
        if (V0() <= 1) {
            return C0() ? t0() : this;
        }
        return (bc4) f34.G4(this, Y7(), new IntFunction() { // from class: com.p7700g.p99005.t84
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return bc4.this.D0(i2).y6();
            }
        }, true);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<bc4> iterator() {
        return M8(null);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<bc4> j1() {
        return super.j1();
    }

    @Override // com.p7700g.p99005.m14
    public i54 j7() {
        return Fb(e.o);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: j8 */
    public bc4 a0() {
        return m8(true, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Stream<bc4> k4() {
        return super.k4();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: k8 */
    public bc4 e2() {
        return m8(true, true);
    }

    public v44<yb4, cc4[]> kb(yb4 yb4Var, final ac4.a aVar) {
        final int V0 = V0();
        final Integer K3 = K3();
        if (m0().i().f()) {
            K3 = null;
            yb4Var = yb4Var.t0();
        }
        yb4 yb4Var2 = yb4Var;
        final int i2 = V0 - 1;
        return g24.g(yb4Var2, new Predicate() { // from class: com.p7700g.p99005.y94
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.q74
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return bc4.ka(ac4.a.this, r2, (cc4[]) obj2);
                    }
                }, ac4.a.this, ((yb4) ((g24.e) obj).a()).O0().O5(), i2, V0, K3);
                return K4;
            }
        }, z84.a, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.w74
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long q4;
                q4 = f34.q4(((yb4) obj).O0(), V0);
                return q4;
            }
        });
    }

    @Override // com.p7700g.p99005.p14
    public String l2() {
        return G1();
    }

    @Override // com.p7700g.p99005.m14
    public i54 l7() {
        return Fb(e.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001d, code lost:
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yb4 l8(yb4 yb4Var, boolean z, boolean z2) {
        Object obj;
        bc4 m8 = m8(z, z2);
        if (m8 == this) {
            return yb4Var;
        }
        yb4 yb4Var2 = null;
        if (m8 == null) {
            return null;
        }
        c cVar = yb4Var.z0;
        if (cVar != null) {
            if (z) {
                obj = z2 ? cVar.b : cVar.a;
            } else {
                obj = cVar.c;
            }
            yb4Var2 = (yb4) obj;
        }
        synchronized (this) {
            c cVar2 = yb4Var.z0;
            boolean z3 = true;
            boolean z4 = cVar2 == null;
            if (z4) {
                cVar2 = new c();
                yb4Var.z0 = cVar2;
            } else if (!z) {
                yb4Var2 = (yb4) cVar2.c;
                if (yb4Var2 == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            } else if (z2) {
                yb4Var2 = (yb4) cVar2.b;
                if (yb4Var2 == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            } else {
                yb4Var2 = (yb4) cVar2.a;
                if (yb4Var2 == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            }
            if (z4) {
                yb4 Q2 = Y7().Q(m8);
                if (!z) {
                    cVar2.c = Q2;
                } else if (z2) {
                    cVar2.b = Q2;
                } else {
                    cVar2.a = Q2;
                }
                yb4Var2 = Q2;
            }
        }
        return yb4Var2;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: lb */
    public bc4 h0(int i2) {
        return ob(i2, true, false, true);
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public byte[] m(boolean z) {
        int V0 = V0();
        byte[] bArr = new byte[V0];
        for (int i2 = 0; i2 < V0; i2++) {
            cc4 D0 = D0(i2);
            bArr[i2] = (byte) (z ? D0.B1() : D0.h3());
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: mb */
    public bc4 o0(int i2, boolean z) {
        return ob(i2, z, false, true);
    }

    public /* synthetic */ cc4 n9(Integer num, int i2) {
        return D0(i2).o6(num);
    }

    @Override // com.p7700g.p99005.m14
    /* renamed from: nb */
    public bc4 d7(int i2, boolean z, boolean z2) throws y14 {
        return ob(i2, z, false, z2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.i34, com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
    /* renamed from: o8 */
    public ac4 m0() {
        return n04.g();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    /* renamed from: p8 */
    public bc4 P1() {
        return (bc4) super.P1();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: pb */
    public bc4[] i1() {
        if (M0()) {
            return b1() ? new bc4[]{this} : qb(this);
        }
        ArrayList arrayList = (ArrayList) f7(true);
        return (bc4[]) arrayList.toArray(new bc4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.m14
    public boolean q5(m14 m14Var, int i2) {
        if (m14Var instanceof bc4) {
            bc4[] wb = ((bc4) m14Var).wb(this);
            if (wb != null) {
                for (bc4 bc4Var : wb) {
                    if (!bc4Var.o6(i2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: q8 */
    public bc4 o2() {
        if (C0()) {
            return Q3(K3().intValue());
        }
        return Q3(A0());
    }

    public bc4[] qb(bc4 bc4Var) {
        sb4 sb4Var = sb4.a;
        kb4 kb4Var = kb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        db4 db4Var = new db4(o04Var);
        hb4 hb4Var = hb4.a;
        lb4 lb4Var = lb4.a;
        final ac4.a Y7 = Y7();
        Objects.requireNonNull(Y7);
        return (bc4[]) m14.P5(this, bc4Var, sb4Var, kb4Var, db4Var, hb4Var, lb4Var, new IntFunction() { // from class: com.p7700g.p99005.nb4
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return ac4.a.this.W3(i2);
            }
        });
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: r8 */
    public bc4 Q3(int i2) throws y14 {
        return A2(i2, true);
    }

    public /* synthetic */ cc4 r9(boolean z, Integer num, int i2) {
        return D0(i2).r6(num, z);
    }

    public /* synthetic */ boolean ra(Integer num, cc4[] cc4VarArr) {
        return l9(cc4VarArr, num.intValue());
    }

    @Deprecated
    public bc4[] rb(bc4 bc4Var) {
        return tb(bc4Var);
    }

    @Override // com.p7700g.p99005.p14
    public String s4() {
        String str;
        if (Z5() || (str = this.R.m) == null) {
            f fVar = this.R;
            String D2 = D2(f.x);
            fVar.m = D2;
            return D2;
        }
        return str;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: s8 */
    public bc4 A2(int i2, final boolean z) throws y14 {
        return (bc4) m14.K5(this, i2, z, Y7(), new m14.g() { // from class: com.p7700g.p99005.f84
            @Override // com.p7700g.p99005.m14.g
            public final Object a(Object obj, int i3) {
                return bc4.this.r9(z, (Integer) obj, i3);
            }
        });
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: sb */
    public bc4[] Q0() throws r04 {
        if (M0()) {
            return new bc4[]{t0()};
        }
        ArrayList arrayList = (ArrayList) f7(false);
        return (bc4[]) arrayList.toArray(new bc4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<bc4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    public o34[] t8(e eVar) {
        if (!eVar.b(14)) {
            return super.N5(eVar);
        }
        ArrayList arrayList = new ArrayList(4);
        if (eVar.a(1)) {
            arrayList.add(this);
        }
        boolean[] zArr = new boolean[4];
        int V0 = V0() - 1;
        zArr[Math.max(3, V0)] = eVar.a(2);
        int max = Math.max(2, Math.min(2, V0));
        zArr[max] = zArr[max] | eVar.a(4);
        int max2 = Math.max(1, Math.min(1, V0));
        zArr[max2] = eVar.a(8) | zArr[max2];
        for (int i2 = 1; i2 < 4; i2++) {
            if (zArr[i2]) {
                arrayList.add(zb(i2));
            }
        }
        return (o34[]) arrayList.toArray(new o34[arrayList.size()]);
    }

    public bc4[] tb(bc4 bc4Var) {
        sb4 sb4Var = sb4.a;
        kb4 kb4Var = kb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (bc4[]) m14.Q5(this, bc4Var, sb4Var, kb4Var, new db4(o04Var), lb4.a, Y7());
    }

    @Override // com.p7700g.p99005.z04
    public int u2() {
        return 8;
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: u8 */
    public bc4 O0() {
        return this;
    }

    public x44<yb4> ub(yb4 yb4Var, final ac4.a aVar, boolean z) {
        yb4 yb4Var2;
        final Integer num;
        ToLongFunction toLongFunction;
        g24.d dVar;
        final int V0 = V0();
        final Integer K3 = K3();
        if (m0().i().f()) {
            num = null;
            yb4Var2 = yb4Var.t0();
        } else {
            yb4Var2 = yb4Var;
            num = K3;
        }
        if (z && o4()) {
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.t94
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return bc4.pa(V0, K3, (yb4) obj);
                }
            };
            dVar = new g24.d() { // from class: com.p7700g.p99005.k94
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return bc4.this.ta(K3, z2, z3, (yb4) obj);
                }
            };
        } else {
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.n84
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long q4;
                    q4 = f34.q4(((yb4) obj).O0(), V0);
                    return q4;
                }
            };
            dVar = fa4.a;
        }
        ToLongFunction toLongFunction2 = toLongFunction;
        final int i2 = V0 - 1;
        return g24.h(yb4Var2, new Predicate() { // from class: com.p7700g.p99005.v84
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.j84
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return bc4.wa(ac4.a.this, r2, (cc4[]) obj2);
                    }
                }, ac4.a.this, ((yb4) ((g24.e) obj).a()).O0().O5(), i2, V0, num);
                return K4;
            }
        }, dVar, null, null, toLongFunction2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: v8 */
    public bc4 z0(int i2) {
        return J0(i2, V0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.p7700g.p99005.ea4] */
    public x44<bc4> vb(boolean z) {
        bc4 bc4Var;
        final Integer num;
        ToLongFunction toLongFunction;
        e84 e84Var;
        final int V0 = V0();
        final Integer K3 = K3();
        final ac4.a Y7 = Y7();
        if (m0().i().f()) {
            num = null;
            bc4Var = t0();
        } else {
            bc4Var = this;
            num = K3;
        }
        if (z && o4()) {
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.s94
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return bc4.ya(V0, K3, (bc4) obj);
                }
            };
            e84Var = new g24.d() { // from class: com.p7700g.p99005.ea4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return bc4.this.Ca(K3, z2, z3, (bc4) obj);
                }
            };
        } else {
            toLongFunction = new ToLongFunction() { // from class: com.p7700g.p99005.c84
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return bc4.Da(V0, (bc4) obj);
                }
            };
            e84Var = e84.a;
        }
        final int i2 = V0 - 1;
        return g24.h(bc4Var, new Predicate() { // from class: com.p7700g.p99005.x84
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.s74
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return bc4.Fa(ac4.a.this, r2, (cc4[]) obj2);
                    }
                }, ac4.a.this, ((bc4) ((g24.e) obj).a()).O5(), i2, V0, num);
                return K4;
            }
        }, e84Var, null, null, toLongFunction);
    }

    @Override // com.p7700g.p99005.m14
    public i54 w7() {
        return Fb(e.m);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: w8 */
    public bc4 J0(int i2, int i3) {
        return (bc4) f34.t3(i2, i3, this, Y7());
    }

    public bc4[] wb(bc4 bc4Var) throws z14 {
        return (bc4[]) m14.i7(this, bc4Var, Y7(), new tb4(this), d94.a);
    }

    @Override // com.p7700g.p99005.p14
    public String x2() {
        return U0();
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04
    /* renamed from: x8 */
    public cc4 D0(int i2) {
        return (cc4) super.D0(i2);
    }

    public /* synthetic */ Iterator x9(boolean z, int i2) {
        return D0(i2).F6(!z);
    }

    public String xb(yb4.b bVar) {
        String D2;
        String str;
        String str2;
        if (bVar == yb4.b.OCTAL) {
            if (!Z5() && (str2 = this.R.z) != null) {
                return str2;
            }
            f fVar = this.R;
            D2 = D2(f.u);
            fVar.z = D2;
        } else if (bVar == yb4.b.HEX) {
            if (!Z5() && (str = this.R.A) != null) {
                return str;
            }
            f fVar2 = this.R;
            D2 = D2(f.v);
            fVar2.A = D2;
        } else {
            return U0();
        }
        return D2;
    }

    @Override // com.p7700g.p99005.g24
    public BigInteger y() {
        return BigInteger.valueOf(f8());
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<bc4> y0() {
        return Ya(false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.v04
    public boolean y1(v04 v04Var) {
        return (v04Var instanceof bc4) && super.y1(v04Var);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public x44<bc4> y2(final int i2) {
        bc4 bc4Var;
        if (i2 >= 0) {
            if (i2 >= V0()) {
                return spliterator();
            }
            final ac4.a Y7 = Y7();
            boolean f2 = m0().i().f();
            final Integer num = null;
            Integer L0 = f2 ? null : L0();
            if (f2) {
                bc4Var = t0();
            } else {
                num = L0;
                bc4Var = this;
            }
            final int i3 = i2 - 1;
            return g24.h(bc4Var, new Predicate() { // from class: com.p7700g.p99005.j94
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.n94
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bc4.Z8(ac4.a.this, r2, (cc4[]) obj2);
                        }
                    }, ac4.a.this, ((bc4) ((g24.e) obj).a()).O5(), i3, i2, num);
                    return K4;
                }
            }, new g24.d() { // from class: com.p7700g.p99005.ca4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    Iterator S2;
                    S2 = ((bc4) obj).S2(i2);
                    return S2;
                }
            }, null, null, new ToLongFunction() { // from class: com.p7700g.p99005.ka4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return bc4.c9(i2, (bc4) obj);
                }
            });
        }
        throw new IllegalArgumentException();
    }

    public String yb(yb4.b bVar, int i2) throws t14 {
        m14.e eVar;
        if (i2 <= 0) {
            return xb(bVar);
        }
        if (bVar == yb4.b.OCTAL) {
            eVar = f.u;
        } else if (bVar == yb4.b.HEX) {
            eVar = f.v;
        } else {
            eVar = f.w;
        }
        return Cb(eVar, i2);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14
    public Iterator<bc4> z1() {
        return M8(X7());
    }

    @Override // com.p7700g.p99005.m14
    public BigInteger z5(int i2) {
        if (!z3()) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(f34.q4(this, i2));
    }

    public void z8(int i2, int i3, Collection<? super cc4> collection) {
        while (i2 < i3) {
            collection.add(D0(i2));
            i2++;
        }
    }

    public i34 zb(int i2) {
        int V0 = V0();
        if (i2 > 0) {
            int i3 = 1;
            if (V0 > 1) {
                if (i2 >= V0) {
                    i2 = V0 - 1;
                } else {
                    i3 = V0 - i2;
                }
                int i4 = i3 - 1;
                h34[] h34VarArr = new h34[i3];
                for (int i5 = 0; i5 < i4; i5++) {
                    h34VarArr[i5] = t(i5);
                }
                h34VarArr[i4] = N8(i2);
                return new i34(h34VarArr, m0());
            }
        }
        return this;
    }

    public bc4(cc4[] cc4VarArr) throws c14 {
        this(cc4VarArr, true);
    }

    /* compiled from: IPv4AddressSection.java */
    /* loaded from: classes3.dex */
    public static class e extends m14.c {
        public static final int f = 2;
        public static final int g = 4;
        public static final int h = 8;
        public static final int i = 14;
        public static final int j = 65536;
        public static final int k = 256;
        public static final int l = 512;
        public static final e m = new e(17);
        public static final e n = new e();
        public static final e o = new e(66367, null, new qi4.h(3895));
        public final qi4.h p;
        public final ni4.b q;

        public e() {
            this.p = null;
            this.q = null;
        }

        public static e c(m14.c cVar) {
            if (cVar instanceof e) {
                return (e) cVar;
            }
            return new e(cVar.e & (-66319));
        }

        public e(int i2) {
            this(i2, null, null);
        }

        public e(int i2, ni4.b bVar, qi4.h hVar) {
            super(i2 | (hVar == null ? 0 : 65536));
            if (a(65536)) {
                hVar = hVar == null ? new qi4.h(3863) : hVar;
                if (bVar == null) {
                    bVar = j14.R;
                }
            }
            this.p = hVar;
            this.q = bVar;
        }
    }

    public bc4(cc4[] cc4VarArr, Integer num) throws c14 {
        this(cc4VarArr, true, num, false);
    }

    @Override // com.p7700g.p99005.m14, com.p7700g.p99005.p14, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<bc4> spliterator() {
        return vb(false);
    }

    public bc4(cc4[] cc4VarArr, boolean z, Integer num, boolean z2) throws c14 {
        this(cc4VarArr, z, num == null);
        if (num != null) {
            int length = cc4VarArr.length << 3;
            if (num.intValue() > length) {
                if (num.intValue() <= 32) {
                    num = Integer.valueOf(length);
                } else {
                    throw new y14(num.intValue());
                }
            }
            if (cc4VarArr.length > 0) {
                Integer num2 = this.z;
                if (num2 != g24.t && num2.intValue() < num.intValue()) {
                    num = this.z;
                }
                ac4 m0 = m0();
                f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), (z2 || !m14.l6(cc4VarArr, num, m0, false)) ? eb4.a : c74.a);
                this.z = num;
            }
        }
    }

    public bc4(cc4[] cc4VarArr, boolean z) throws c14 {
        this(cc4VarArr, z, true);
    }

    public bc4(cc4[] cc4VarArr, boolean z, boolean z2) throws c14 {
        super(cc4VarArr, z, true);
        if (z2 && C0()) {
            f34.x4(K3().intValue(), O5(), u2(), Z1(), wb4.a);
        }
        if (cc4VarArr.length > 4) {
            throw new c14(cc4VarArr.length);
        }
    }

    public bc4(n04.b bVar, int i2, Integer num) throws c14 {
        this(bVar, bVar, i2, num);
    }

    public bc4(n04.b bVar, n04.b bVar2, int i2, Integer num) throws c14 {
        super(new cc4[i2], false, false);
        cc4[] O5 = O5();
        ac4 m0 = m0();
        f34.X0(O5, bVar, bVar2, Z1(), u2(), m0, num);
        if (num != null) {
            if (num.intValue() <= 32) {
                if (m0.i().h() && m14.l6(O5, num, m0, false)) {
                    f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), c74.a);
                }
                this.z = num;
                return;
            }
            throw new y14(num.intValue());
        }
        this.z = g24.t;
    }

    public bc4(n04.b bVar, int i2) throws c14 {
        this(bVar, bVar, i2);
    }

    public bc4(n04.b bVar, n04.b bVar2, int i2) {
        this(bVar, bVar2, i2, (Integer) null);
    }

    public bc4(byte[] bArr, int i2, Integer num, boolean z, boolean z2) throws c14 {
        this(bArr, 0, bArr.length, i2, num, z, z2);
    }

    public bc4(byte[] bArr, int i2, int i3, int i4, Integer num, boolean z, boolean z2) throws c14 {
        super(new cc4[i4 >= 0 ? i4 : Math.max(0, i3 - i2)], false, false);
        Integer num2;
        cc4[] O5 = O5();
        ac4 m0 = m0();
        f34.M4(O5, bArr, i2, i3, Z1(), u2(), m0, num);
        boolean z3 = bArr.length == O5.length;
        if (num != null) {
            if (num.intValue() >= 0) {
                int length = O5.length << 3;
                if (num.intValue() <= length) {
                    num2 = num;
                } else if (num.intValue() <= 32) {
                    num2 = Integer.valueOf(length);
                } else {
                    throw new y14(num.intValue());
                }
                if (O5.length > 0) {
                    s04.c i5 = m0.i();
                    if (i5.h()) {
                        if (m14.l6(O5, num2, m0, false) && !z2) {
                            f34.J4(m0, num2.intValue(), O5, u2(), Z1(), m0.u(), c74.a);
                        } else if (z3 && num2.intValue() >= A0()) {
                            J(z ? (byte[]) bArr.clone() : bArr);
                        }
                    } else if (z3 && (i5.g() || num2.intValue() >= A0())) {
                        J(z ? (byte[]) bArr.clone() : bArr);
                    }
                } else if (z3) {
                    J(bArr);
                }
                this.z = num2;
                return;
            }
            throw new y14(num.intValue());
        }
        this.z = g24.t;
        if (z3) {
            J(z ? (byte[]) bArr.clone() : bArr);
        }
    }

    public bc4(byte[] bArr, int i2, int i3, int i4, Integer num) throws c14 {
        this(bArr, i2, i3, i4, num, true, false);
    }

    public bc4(byte[] bArr, Integer num) throws c14 {
        this(bArr, bArr.length, num, true, false);
    }

    public bc4(byte[] bArr) throws c14 {
        this(bArr, bArr.length, (Integer) null, true, false);
    }

    public bc4(byte[] bArr, int i2, int i3, Integer num) throws c14 {
        this(bArr, i2, i3, -1, num, true, false);
    }

    public bc4(byte[] bArr, int i2, int i3) throws c14 {
        this(bArr, i2, i3, -1, null, true, false);
    }

    public bc4(int i2, Integer num) throws c14 {
        super(new cc4[4], false, false);
        cc4[] O5 = O5();
        ac4 m0 = m0();
        f34.x0(O5, 0L, i2, u2(), m0, num);
        if (num != null) {
            if (num.intValue() <= 32) {
                if (m0.i().h() && m14.l6(O5, num, m0, false)) {
                    f34.J4(m0, num.intValue(), O5(), u2(), Z1(), m0.u(), c74.a);
                }
                this.z = num;
                return;
            }
            throw new y14(num.intValue());
        }
        this.z = g24.t;
    }

    public bc4(int i2) {
        this(i2, (Integer) null);
    }
}