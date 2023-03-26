package com.p7700g.p99005;

/* compiled from: BoltsCallbacks.java */
/* loaded from: classes2.dex */
public class dj1 {
    @x1
    public static <T> aq0<T, T> a(@x1 final ua1<T> ua1Var) {
        return new aq0() { // from class: com.p7700g.p99005.wi1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return dj1.d(ua1.this, dq0Var);
            }
        };
    }

    @x1
    public static <T> aq0<T, T> b(@x1 final va1 va1Var) {
        return new aq0() { // from class: com.p7700g.p99005.yi1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                dj1.e(va1.this, dq0Var);
                return null;
            }
        };
    }

    @x1
    public static <T> aq0<T, T> c(@x1 final ua1<T> ua1Var) {
        return new aq0() { // from class: com.p7700g.p99005.xi1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return dj1.f(ua1.this, dq0Var);
            }
        };
    }

    public static /* synthetic */ Object d(ua1 ua1Var, dq0 dq0Var) throws Exception {
        try {
            if (!dq0Var.J()) {
                ua1Var.b(r81.f(dq0Var.F()));
                return dq0Var.F();
            }
            throw dq0Var.E();
        } catch (Throwable th) {
            ua1Var.a(gc1.cast(th));
            throw th;
        }
    }

    public static /* synthetic */ Object e(va1 va1Var, dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            va1Var.complete();
            return null;
        }
        va1Var.a(gc1.cast(dq0Var.E()));
        throw dq0Var.E();
    }

    public static /* synthetic */ Object f(ua1 ua1Var, dq0 dq0Var) throws Exception {
        try {
            if (!dq0Var.J()) {
                ua1Var.b(dq0Var.F());
                return dq0Var.F();
            }
            throw dq0Var.E();
        } catch (Throwable th) {
            ua1Var.a(gc1.cast(th));
            throw th;
        }
    }
}