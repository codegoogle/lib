package com.p7700g.p99005;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CompositeTrafficListener.java */
/* loaded from: classes.dex */
public class k71 implements ab1 {
    @x1
    private final List<ab1> a;
    @x1
    private final kj1 b;
    @x1
    private final Executor c;

    public k71(@x1 List<ab1> list, @x1 kj1 kj1Var, @x1 Executor executor) {
        this.a = list;
        this.b = kj1Var;
        this.c = executor;
    }

    private /* synthetic */ Object b(long j, long j2) throws Exception {
        for (ab1 ab1Var : this.a) {
            try {
                ab1Var.a(j, j2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.ab1
    public void a(final long j, final long j2) {
        this.b.c("onTrafficUpdate tx: %d rx: %d", Long.valueOf(j), Long.valueOf(j2));
        dq0.e(new Callable() { // from class: com.p7700g.p99005.g71
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k71.this.c(j, j2);
                return null;
            }
        }, this.c);
    }

    public /* synthetic */ Object c(long j, long j2) {
        b(j, j2);
        return null;
    }
}