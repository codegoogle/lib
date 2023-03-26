package com.p7700g.p99005;

import com.p7700g.p99005.c65;
import com.p7700g.p99005.h65;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes3.dex */
public abstract class n25 extends r25 implements c65 {
    public n25() {
    }

    @Override // com.p7700g.p99005.i15
    public t55 E4() {
        return c35.k(this);
    }

    @Override // com.p7700g.p99005.f05
    public Object M(Object obj) {
        return get(obj);
    }

    @Override // com.p7700g.p99005.h65
    @tp4(version = "1.1")
    public Object d(Object obj) {
        return ((c65) H4()).d(obj);
    }

    @tp4(version = "1.1")
    public n25(Object obj) {
        super(obj);
    }

    @Override // com.p7700g.p99005.f65
    public h65.a f() {
        return ((c65) H4()).f();
    }

    @Override // com.p7700g.p99005.a65
    public c65.a g() {
        return ((c65) H4()).g();
    }

    @tp4(version = "1.4")
    public n25(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}