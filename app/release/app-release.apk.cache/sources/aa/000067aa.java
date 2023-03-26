package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: ServerMessageThreadWrapListener.java */
/* loaded from: classes2.dex */
public class ym1 implements yd1 {
    @x1
    private final yd1 s;
    @x1
    private final Executor t;

    public ym1(@x1 yd1 yd1Var, @x1 Executor executor) {
        this.s = yd1Var;
        this.t = executor;
    }

    private /* synthetic */ void a(String str) {
        this.s.f(str);
    }

    public /* synthetic */ void b(String str) {
        this.s.f(str);
    }

    @Override // com.p7700g.p99005.yd1
    public void f(@x1 final String str) {
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.tk1
            @Override // java.lang.Runnable
            public final void run() {
                ym1.this.b(str);
            }
        });
    }
}