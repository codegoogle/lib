package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: Function.java */
/* loaded from: classes2.dex */
public final /* synthetic */ class m91 {
    public static n91 a(final n91 _this, final n91 n91Var) {
        Objects.requireNonNull(n91Var);
        return new n91() { // from class: com.p7700g.p99005.i91
            @Override // com.p7700g.p99005.n91
            public /* synthetic */ n91 a(n91 n91Var2) {
                return m91.b(this, n91Var2);
            }

            @Override // com.p7700g.p99005.n91
            public final Object apply(Object obj) {
                return m91.d(n91.this, n91Var, obj);
            }

            @Override // com.p7700g.p99005.n91
            public /* synthetic */ n91 b(n91 n91Var2) {
                return m91.a(this, n91Var2);
            }
        };
    }

    public static n91 b(final n91 _this, final n91 n91Var) {
        Objects.requireNonNull(n91Var);
        return new n91() { // from class: com.p7700g.p99005.h91
            @Override // com.p7700g.p99005.n91
            public /* synthetic */ n91 a(n91 n91Var2) {
                return m91.b(this, n91Var2);
            }

            @Override // com.p7700g.p99005.n91
            public final Object apply(Object obj) {
                return m91.e(n91.this, n91Var, obj);
            }

            @Override // com.p7700g.p99005.n91
            public /* synthetic */ n91 b(n91 n91Var2) {
                return m91.a(this, n91Var2);
            }
        };
    }

    public static <T> n91<T, T> c() {
        return j91.a;
    }

    public static /* synthetic */ Object d(n91 n91Var, n91 n91Var2, Object obj) {
        return n91Var2.apply(n91Var.apply(obj));
    }

    public static /* synthetic */ Object e(n91 n91Var, n91 n91Var2, Object obj) {
        return n91Var.apply(n91Var2.apply(obj));
    }

    public static /* synthetic */ Object f(Object obj) {
        return obj;
    }
}