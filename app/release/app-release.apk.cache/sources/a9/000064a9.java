package com.p7700g.p99005;

import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: AddressSegment.java */
/* loaded from: classes3.dex */
public interface x04 extends q04, j24 {
    int B1();

    boolean J3(int i, int i2);

    boolean R1(x04 x04Var);

    boolean T0(int i);

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 a0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    x04 a0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 b0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    x04 b0();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 c0();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    x04 c0();

    int c4();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 d0(boolean z);

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.v04
    x04 d0(boolean z);

    boolean equals(Object obj);

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    Iterable<? extends x04> f0();

    boolean f1(int i);

    boolean f2(x04 x04Var, int i);

    int g1();

    int h3();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    Iterator<? extends x04> iterator();

    boolean s1(int i, int i2, int i3);

    boolean s3(int i);

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    /* bridge */ /* synthetic */ v44 spliterator();

    @Override // com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    x44<? extends x04> spliterator();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    Stream<? extends x04> stream();
}