package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: VpnConfigChangeThreadWrapListener.java */
/* loaded from: classes2.dex */
public class fn1 implements xn1 {
    @x1
    private final Executor s;
    @x1
    private final xn1 t;

    public fn1(@x1 Executor executor, @x1 xn1 xn1Var) {
        this.s = executor;
        this.t = xn1Var;
    }

    private /* synthetic */ void a(do1 do1Var) {
        this.t.j(do1Var);
    }

    private /* synthetic */ void e(re1 re1Var) {
        this.t.d(re1Var);
    }

    private /* synthetic */ void g(qa1 qa1Var, md1 md1Var) {
        this.t.b(qa1Var, md1Var);
    }

    @Override // com.p7700g.p99005.xn1
    public void b(@x1 final qa1 qa1Var, @x1 final md1 md1Var) {
        this.s.execute(new Runnable() { // from class: com.p7700g.p99005.bm1
            @Override // java.lang.Runnable
            public final void run() {
                fn1.this.h(qa1Var, md1Var);
            }
        });
    }

    public /* synthetic */ void c(do1 do1Var) {
        this.t.j(do1Var);
    }

    @Override // com.p7700g.p99005.xn1
    public void d(@x1 final re1 re1Var) {
        this.s.execute(new Runnable() { // from class: com.p7700g.p99005.am1
            @Override // java.lang.Runnable
            public final void run() {
                fn1.this.f(re1Var);
            }
        });
    }

    public /* synthetic */ void f(re1 re1Var) {
        this.t.d(re1Var);
    }

    public /* synthetic */ void h(qa1 qa1Var, md1 md1Var) {
        this.t.b(qa1Var, md1Var);
    }

    @Override // com.p7700g.p99005.xn1
    public void j(@x1 final do1 do1Var) {
        this.s.execute(new Runnable() { // from class: com.p7700g.p99005.cm1
            @Override // java.lang.Runnable
            public final void run() {
                fn1.this.c(do1Var);
            }
        });
    }
}