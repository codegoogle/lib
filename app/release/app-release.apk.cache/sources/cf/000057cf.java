package com.p7700g.p99005;

import com.p7700g.p99005.kb;

/* compiled from: ChainReference.java */
/* loaded from: classes.dex */
public class qb extends fb {
    public float n0;
    public kb.b o0;

    public qb(kb kbVar, kb.e eVar) {
        super(kbVar, eVar);
        this.n0 = 0.5f;
        this.o0 = kb.b.SPREAD;
    }

    @Override // com.p7700g.p99005.db
    /* renamed from: Q0 */
    public qb n(float f) {
        this.n0 = f;
        return this;
    }

    public float R0() {
        return this.n0;
    }

    public kb.b S0() {
        return kb.b.SPREAD;
    }

    public qb T0(kb.b bVar) {
        this.o0 = bVar;
        return this;
    }
}