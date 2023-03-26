package com.p7700g.p99005;

import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.v04;
import com.p7700g.p99005.x04;

/* compiled from: AddressCreator.java */
/* loaded from: classes3.dex */
public abstract class d34<T extends n04, R extends v04, E extends v04, S extends x04> extends s64<T, R, E, S> implements s04.a<S> {
    private static final long t = 4;

    public abstract T H(R r);

    public abstract T I(S[] sArr);

    public abstract T J(S[] sArr, Integer num);

    public abstract T L(S[] sArr, Integer num, boolean z);

    public abstract R M(byte[] bArr, int i, Integer num, boolean z);

    public abstract R N(S[] sArr, int i, boolean z);

    public abstract s04<S> m0();

    @Override // com.p7700g.p99005.s64
    public abstract R t(S[] sArr, Integer num, boolean z);

    @Override // com.p7700g.p99005.s64
    public abstract R u(S[] sArr);
}