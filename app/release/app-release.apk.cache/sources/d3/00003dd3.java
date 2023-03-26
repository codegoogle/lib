package com.p7700g.p99005;

import com.p7700g.p99005.e02;

/* compiled from: ViewPropertyAnimationFactory.java */
/* loaded from: classes2.dex */
public class d02<R> implements b02<R> {
    private final e02.a a;
    private e02<R> b;

    public d02(e02.a aVar) {
        this.a = aVar;
    }

    @Override // com.p7700g.p99005.b02
    public a02<R> a(aq1 aq1Var, boolean z) {
        if (aq1Var != aq1.MEMORY_CACHE && z) {
            if (this.b == null) {
                this.b = new e02<>(this.a);
            }
            return this.b;
        }
        return zz1.b();
    }
}