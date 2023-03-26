package com.p7700g.p99005;

/* compiled from: MutablePropertyReference0Impl.java */
/* loaded from: classes3.dex */
public class m25 extends l25 {
    public m25(y55 y55Var, String str, String str2) {
        super(i15.s, ((l15) y55Var).c(), str, str2, !(y55Var instanceof u55) ? 1 : 0);
    }

    @Override // com.p7700g.p99005.g65
    public Object get() {
        return f().y4(new Object[0]);
    }

    @Override // com.p7700g.p99005.b65
    public void set(Object obj) {
        g().y4(obj);
    }

    @tp4(version = "1.4")
    public m25(Class cls, String str, String str2, int i) {
        super(i15.s, cls, str, str2, i);
    }

    @tp4(version = "1.4")
    public m25(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}