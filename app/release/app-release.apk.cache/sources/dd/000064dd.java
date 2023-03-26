package com.p7700g.p99005;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes3.dex */
public class x25 extends w25 {
    public x25(y55 y55Var, String str, String str2) {
        super(i15.s, ((l15) y55Var).c(), str, str2, !(y55Var instanceof u55) ? 1 : 0);
    }

    @Override // com.p7700g.p99005.h65
    public Object get(Object obj) {
        return f().y4(obj);
    }

    @tp4(version = "1.4")
    public x25(Class cls, String str, String str2, int i) {
        super(i15.s, cls, str, str2, i);
    }

    @tp4(version = "1.4")
    public x25(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}