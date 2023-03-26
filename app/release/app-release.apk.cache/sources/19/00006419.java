package com.p7700g.p99005;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* compiled from: CancellationToken.java */
/* loaded from: classes.dex */
public class wp0 {
    private final yp0 a;

    public wp0(yp0 yp0Var) {
        this.a = yp0Var;
    }

    public boolean a() {
        return this.a.k();
    }

    public xp0 b(Runnable runnable) {
        return this.a.m(runnable);
    }

    public void c() throws CancellationException {
        this.a.q();
    }

    @x1
    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.a.k()));
    }
}