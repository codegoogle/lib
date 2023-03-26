package com.p7700g.p99005;

/* compiled from: DelegateFactory.java */
/* loaded from: classes2.dex */
public final class f62<T> implements h62<T> {
    private ol4<T> a;

    public static <T> void b(ol4<T> ol4Var, ol4<T> ol4Var2) {
        q62.b(ol4Var2);
        f62 f62Var = (f62) ol4Var;
        if (f62Var.a == null) {
            f62Var.a = ol4Var2;
            return;
        }
        throw new IllegalStateException();
    }

    public ol4<T> a() {
        return (ol4) q62.b(this.a);
    }

    @Deprecated
    public void c(ol4<T> ol4Var) {
        b(this, ol4Var);
    }

    @Override // com.p7700g.p99005.ol4
    public T get() {
        ol4<T> ol4Var = this.a;
        if (ol4Var != null) {
            return ol4Var.get();
        }
        throw new IllegalStateException();
    }
}