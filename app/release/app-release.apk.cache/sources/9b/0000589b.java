package com.p7700g.p99005;

import java.util.Set;

/* compiled from: AbstractComponentContainer.java */
/* loaded from: classes3.dex */
public abstract class qo2 implements to2 {
    @Override // com.p7700g.p99005.to2
    public <T> T a(Class<T> cls) {
        er2<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    @Override // com.p7700g.p99005.to2
    public <T> Set<T> e(Class<T> cls) {
        return d(cls).get();
    }
}