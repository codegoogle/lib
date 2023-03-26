package com.p7700g.p99005;

import com.p7700g.p99005.dr2;

/* compiled from: OptionalProvider.java */
/* loaded from: classes3.dex */
public class hp2<T> implements er2<T>, dr2<T> {
    private static final dr2.a<Object> a = oo2.a;
    private static final er2<Object> b = no2.a;
    @k1("this")
    private dr2.a<T> c;
    private volatile er2<T> d;

    private hp2(dr2.a<T> aVar, er2<T> er2Var) {
        this.c = aVar;
        this.d = er2Var;
    }

    public static <T> hp2<T> b() {
        return new hp2<>(a, b);
    }

    public static /* synthetic */ void c(er2 er2Var) {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ void e(dr2.a aVar, dr2.a aVar2, er2 er2Var) {
        aVar.a(er2Var);
        aVar2.a(er2Var);
    }

    public static <T> hp2<T> f(er2<T> er2Var) {
        return new hp2<>(null, er2Var);
    }

    @Override // com.p7700g.p99005.dr2
    public void a(@x1 final dr2.a<T> aVar) {
        er2<T> er2Var;
        er2<T> er2Var2 = this.d;
        er2<Object> er2Var3 = b;
        if (er2Var2 != er2Var3) {
            aVar.a(er2Var2);
            return;
        }
        er2<T> er2Var4 = null;
        synchronized (this) {
            er2Var = this.d;
            if (er2Var != er2Var3) {
                er2Var4 = er2Var;
            } else {
                final dr2.a<T> aVar2 = this.c;
                this.c = new dr2.a() { // from class: com.p7700g.p99005.po2
                    @Override // com.p7700g.p99005.dr2.a
                    public final void a(er2 er2Var5) {
                        hp2.e(dr2.a.this, aVar, er2Var5);
                    }
                };
            }
        }
        if (er2Var4 != null) {
            aVar.a(er2Var);
        }
    }

    public void g(er2<T> er2Var) {
        dr2.a<T> aVar;
        if (this.d == b) {
            synchronized (this) {
                aVar = this.c;
                this.c = null;
                this.d = er2Var;
            }
            aVar.a(er2Var);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.p7700g.p99005.er2
    public T get() {
        return this.d.get();
    }
}