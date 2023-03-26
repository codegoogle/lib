package com.p7700g.p99005;

import com.p7700g.p99005.ym4;

/* compiled from: WebApplicationException.java */
/* loaded from: classes3.dex */
public class lm4 extends RuntimeException {
    private static final long s = 11660101;
    private ym4 t;

    public lm4() {
        this((Throwable) null, ym4.b.INTERNAL_SERVER_ERROR);
    }

    public ym4 f() {
        return this.t;
    }

    public lm4(ym4 ym4Var) {
        this((Throwable) null, ym4Var);
    }

    public lm4(int i) {
        this((Throwable) null, i);
    }

    public lm4(ym4.b bVar) {
        this((Throwable) null, bVar);
    }

    public lm4(Throwable th) {
        this(th, ym4.b.INTERNAL_SERVER_ERROR);
    }

    public lm4(Throwable th, ym4 ym4Var) {
        super(th);
        if (ym4Var == null) {
            this.t = ym4.q().a();
        } else {
            this.t = ym4Var;
        }
    }

    public lm4(Throwable th, int i) {
        this(th, ym4.r(i).a());
    }

    public lm4(Throwable th, ym4.b bVar) {
        this(th, ym4.s(bVar).a());
    }
}