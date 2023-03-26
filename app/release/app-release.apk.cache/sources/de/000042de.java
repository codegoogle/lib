package com.p7700g.p99005;

import com.p7700g.p99005.dq0;

/* compiled from: UnobservedErrorNotifier.java */
/* loaded from: classes.dex */
public class fq0 {
    @z1
    private dq0<?> a;

    public fq0(dq0<?> dq0Var) {
        this.a = dq0Var;
    }

    public void a() {
        this.a = null;
    }

    public void finalize() throws Throwable {
        dq0.q G;
        try {
            dq0<?> dq0Var = this.a;
            if (dq0Var != null && (G = dq0.G()) != null) {
                G.a(dq0Var, new gq0(dq0Var.E()));
            }
        } finally {
            super.finalize();
        }
    }
}