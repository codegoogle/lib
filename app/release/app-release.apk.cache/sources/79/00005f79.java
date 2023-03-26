package com.p7700g.p99005;

/* compiled from: SingleCheck.java */
/* loaded from: classes2.dex */
public final class u62<T> implements ol4<T> {
    private static final Object a = new Object();
    public static final /* synthetic */ boolean b = false;
    private volatile ol4<T> c;
    private volatile Object d = a;

    private u62(ol4<T> ol4Var) {
        this.c = ol4Var;
    }

    public static <P extends ol4<T>, T> ol4<T> a(P p) {
        return ((p instanceof u62) || (p instanceof g62)) ? p : new u62((ol4) q62.b(p));
    }

    @Override // com.p7700g.p99005.ol4
    public T get() {
        T t = (T) this.d;
        if (t == a) {
            ol4<T> ol4Var = this.c;
            if (ol4Var == null) {
                return (T) this.d;
            }
            T t2 = ol4Var.get();
            this.d = t2;
            this.c = null;
            return t2;
        }
        return t;
    }
}