package com.p7700g.p99005;

import java.util.List;

/* compiled from: SdkConnectionTest.java */
/* loaded from: classes.dex */
public class a51 {
    private static final kj1 a = w21.a;
    @x1
    private final z41 b;
    private kd1 c;
    @x1
    private final x21 d;

    public a51(@x1 z41 z41Var, @x1 kd1 kd1Var, @x1 x21 x21Var) {
        this.b = z41Var;
        this.c = kd1Var;
        this.d = x21Var;
    }

    public static /* synthetic */ g41 a(lm1 lm1Var, int i, dq0 dq0Var, long j, dq0 dq0Var2) throws Exception {
        a.c("Test performed for state: %s attempt: %d", lm1Var.j(), Integer.valueOf(i));
        y21 y21Var = (y21) r81.f((y21) dq0Var.F());
        g41 g41Var = new g41(y21Var.a() == null, System.currentTimeMillis() - j, i, j, y21Var.a(), lm1Var.j());
        List<km1> p = lm1Var.p();
        if (p.size() > 0) {
            g41Var.k(p.get(0).d());
        }
        List<nd1> list = (List) dq0Var2.F();
        if (list != null) {
            g41Var.l(kd1.b(list));
            g41Var.n(kd1.f(list));
            g41Var.m(list);
        }
        return g41Var;
    }

    /* renamed from: b */
    public /* synthetic */ dq0 c(final lm1 lm1Var, final int i, final long j, final dq0 dq0Var) throws Exception {
        if (!dq0Var.H()) {
            return this.c.i().q(new aq0() { // from class: com.p7700g.p99005.ez0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    return a51.a(lm1.this, i, dq0Var, j, dq0Var2);
                }
            });
        }
        w21.a.c("Test cancelled for state: %s attempt: %d", lm1Var.j(), Integer.valueOf(i));
        return null;
    }

    /* renamed from: d */
    public /* synthetic */ dq0 e(final long j, final int i, wp0 wp0Var, dq0 dq0Var) throws Exception {
        final lm1 lm1Var = (lm1) dq0Var.F();
        gc1 cast = gc1.cast(dq0Var.E());
        if (lm1Var == null) {
            w21.a.g(cast, "Failed to get connection status", new Object[0]);
            return dq0.D(new g41(false, System.currentTimeMillis() - j, i, j, cast.toTrackerName(), null));
        }
        a.c("Perform test for state: %s attempt: %d", lm1Var.j(), Integer.valueOf(i));
        return this.b.b(wp0Var).u(new aq0() { // from class: com.p7700g.p99005.fz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return a51.this.c(lm1Var, i, j, dq0Var2);
            }
        });
    }

    @x1
    public dq0<g41> f(@x1 final wp0 wp0Var, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        return this.d.o().u(new aq0() { // from class: com.p7700g.p99005.gz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return a51.this.e(currentTimeMillis, i, wp0Var, dq0Var);
            }
        });
    }
}