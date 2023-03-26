package com.p7700g.p99005;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: classes2.dex */
public final class zr1 {
    private final Map<gq1, sr1<?>> a = new HashMap();
    private final Map<gq1, sr1<?>> b = new HashMap();

    private Map<gq1, sr1<?>> c(boolean z) {
        return z ? this.b : this.a;
    }

    public sr1<?> a(gq1 gq1Var, boolean z) {
        return c(z).get(gq1Var);
    }

    @r2
    public Map<gq1, sr1<?>> b() {
        return Collections.unmodifiableMap(this.a);
    }

    public void d(gq1 gq1Var, sr1<?> sr1Var) {
        c(sr1Var.q()).put(gq1Var, sr1Var);
    }

    public void e(gq1 gq1Var, sr1<?> sr1Var) {
        Map<gq1, sr1<?>> c = c(sr1Var.q());
        if (sr1Var.equals(c.get(gq1Var))) {
            c.remove(gq1Var);
        }
    }
}