package com.p7700g.p99005;

import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: IPAddressRange.java */
/* loaded from: classes3.dex */
public interface v24 extends e24 {
    Stream<? extends j14> A1(int i);

    boolean C(q14 q14Var);

    String E0();

    Iterator<? extends j14> F1(int i);

    boolean M0();

    j14[] Q0();

    String U0();

    Iterator<? extends v24> V2(int i);

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    j14 a0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 a0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    j14 b0();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* bridge */ /* synthetic */ q04 b0();

    j14 e1();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    Iterable<? extends j14> f0();

    boolean h4(j14 j14Var);

    j14[] i1();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    Iterator<? extends j14> iterator();

    Stream<? extends v24> j2(int i);

    v44<? extends v24, ? extends j14> l3(int i);

    x44<? extends v24> s2(int i);

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    v44<? extends v24, ? extends j14> spliterator();

    q14 z2();
}