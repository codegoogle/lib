package com.p7700g.p99005;

import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: AddressSegmentSeries.java */
/* loaded from: classes3.dex */
public interface z04 extends i24, q04 {
    Iterator<? extends z04> B0();

    x04 D0(int i);

    Iterator<? extends z04> F0();

    x44<? extends z04> G0();

    String H3();

    String[] I1();

    v04 J0(int i, int i2);

    Stream<? extends z04> K0();

    x04[] N0();

    v04 O0();

    Stream<? extends z04> P0();

    v44<? extends z04, ? extends x04[]> R0();

    Stream<? extends x04[]> S0();

    boolean T0(int i);

    String U0();

    int V0();

    Iterator<? extends x04[]> W0();

    int Z1();

    /* bridge */ /* synthetic */ q04 a0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    z04 a0();

    /* bridge */ /* synthetic */ q04 b0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    z04 b0();

    /* bridge */ /* synthetic */ q04 c0();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    z04 c0();

    /* bridge */ /* synthetic */ q04 d0(boolean z);

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    z04 d0(boolean z);

    Iterable<? extends z04> f0();

    boolean f1(int i);

    z04 g0(long j) throws c14;

    int g1();

    z04 h0(int i);

    z04 i0();

    Iterator<? extends z04> iterator();

    z04 j0(int i);

    z04 k0();

    z04 l0(long j) throws c14;

    void m3(int i, int i2, x04[] x04VarArr, int i3);

    @Deprecated
    z04 n0();

    z04 o0(int i, boolean z);

    @Deprecated
    z04 p0(int i);

    z04 q0(boolean z, boolean z2);

    z04 r0(boolean z);

    void r2(x04[] x04VarArr);

    z04 s0();

    /* bridge */ /* synthetic */ v44 spliterator();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    x44<? extends z04> spliterator();

    Stream<? extends z04> stream();

    z04 t0();

    z04 u0(int i, boolean z);

    int u2();

    @Deprecated
    z04 v0(boolean z);

    x44<? extends z04> y0();

    v04 z0(int i);
}