package com.p7700g.p99005;

import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public class jk0<K, A> extends tj0<K, A> {
    private final A i;

    public jk0(np0<A> np0Var) {
        this(np0Var, null);
    }

    @Override // com.p7700g.p99005.tj0
    public float c() {
        return 1.0f;
    }

    @Override // com.p7700g.p99005.tj0
    public A h() {
        np0<A> np0Var = this.e;
        A a = this.i;
        return np0Var.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // com.p7700g.p99005.tj0
    public A i(ep0<K> ep0Var, float f) {
        return h();
    }

    @Override // com.p7700g.p99005.tj0
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override // com.p7700g.p99005.tj0
    public void m(float f) {
        this.d = f;
    }

    public jk0(np0<A> np0Var, @z1 A a) {
        super(Collections.emptyList());
        n(np0Var);
        this.i = a;
    }
}