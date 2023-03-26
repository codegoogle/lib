package com.p7700g.p99005;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CompositeVpnListener.java */
/* loaded from: classes.dex */
public class m71 implements db1 {
    @x1
    private final List<db1> a;
    @x1
    private final h31 b;
    @x1
    private final kj1 c;
    @x1
    private final Executor d;

    public m71(@x1 List<db1> list, @x1 h31 h31Var, @x1 kj1 kj1Var, @x1 Executor executor) {
        this.a = list;
        this.b = h31Var;
        this.c = kj1Var;
        this.d = executor;
    }

    private /* synthetic */ Object a(gc1 gc1Var) throws Exception {
        for (db1 db1Var : this.a) {
            db1Var.n(gc1Var);
        }
        return null;
    }

    private /* synthetic */ Object c(en1 en1Var) throws Exception {
        for (db1 db1Var : this.a) {
            db1Var.m(en1Var);
        }
        return null;
    }

    public /* synthetic */ Object b(gc1 gc1Var) {
        a(gc1Var);
        return null;
    }

    public /* synthetic */ Object d(en1 en1Var) {
        c(en1Var);
        return null;
    }

    @Override // com.p7700g.p99005.db1
    public void m(@x1 final en1 en1Var) {
        try {
            this.c.c("Vpn state changed to %s", en1Var);
            this.b.e(new w51(en1Var));
            dq0.e(new Callable() { // from class: com.p7700g.p99005.j71
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    m71.this.d(en1Var);
                    return null;
                }
            }, this.d);
        } catch (Throwable th) {
            this.c.f(th);
        }
    }

    @Override // com.p7700g.p99005.db1
    public void n(@x1 final gc1 gc1Var) {
        this.b.e(new u51(gc1Var));
        dq0.e(new Callable() { // from class: com.p7700g.p99005.i71
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m71.this.b(gc1Var);
                return null;
            }
        }, this.d);
    }
}