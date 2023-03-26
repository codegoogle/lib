package com.p7700g.p99005;

/* compiled from: BoltsUtils.java */
/* loaded from: classes.dex */
public class a21 {

    /* compiled from: BoltsUtils.java */
    /* loaded from: classes.dex */
    public static class a<T> implements ua1<T> {
        @x1
        public final eq0<T> b = new eq0<>();

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 gc1Var) {
            this.b.c(gc1Var);
        }

        @Override // com.p7700g.p99005.ua1
        public void b(@x1 T t) {
            this.b.d(t);
        }

        @x1
        public dq0<T> c() {
            return this.b.a();
        }
    }

    /* compiled from: BoltsUtils.java */
    /* loaded from: classes.dex */
    public static class b implements va1 {
        @x1
        public final eq0<Void> b = new eq0<>();

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.b.c(gc1Var);
        }

        @x1
        public dq0<Void> b() {
            return this.b.a();
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            this.b.d(null);
        }
    }

    @x1
    public static <T> aq0<T, T> a(@x1 final ua1<T> ua1Var) {
        return new aq0() { // from class: com.p7700g.p99005.zu0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return a21.c(ua1.this, dq0Var);
            }
        };
    }

    @x1
    public static <T> aq0<T, T> b(@x1 final va1 va1Var) {
        return new aq0() { // from class: com.p7700g.p99005.av0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                a21.d(va1.this, dq0Var);
                return null;
            }
        };
    }

    public static /* synthetic */ Object c(ua1 ua1Var, dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            ua1Var.b(r81.f(dq0Var.F()));
            return dq0Var.F();
        }
        ua1Var.a(d81.b(dq0Var.E()));
        throw dq0Var.E();
    }

    public static /* synthetic */ Object d(va1 va1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            va1Var.a(d81.b(dq0Var.E()));
            return null;
        }
        va1Var.complete();
        return null;
    }
}