package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
public abstract class ll0<V, O> implements kl0<V, O> {
    public final List<ep0<V>> a;

    public ll0(V v) {
        this(Collections.singletonList(new ep0(v)));
    }

    @Override // com.p7700g.p99005.kl0
    public List<ep0<V>> b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.kl0
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    public ll0(List<ep0<V>> list) {
        this.a = list;
    }
}