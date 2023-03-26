package com.p7700g.p99005;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes3.dex */
public class rr2 implements wr2 {
    private final xr2 a;
    private final TaskCompletionSource<tr2> b;

    public rr2(xr2 xr2Var, TaskCompletionSource<tr2> taskCompletionSource) {
        this.a = xr2Var;
        this.b = taskCompletionSource;
    }

    @Override // com.p7700g.p99005.wr2
    public boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // com.p7700g.p99005.wr2
    public boolean b(fs2 fs2Var) {
        if (!fs2Var.k() || this.a.f(fs2Var)) {
            return false;
        }
        this.b.setResult(tr2.a().b(fs2Var.b()).d(fs2Var.c()).c(fs2Var.h()).a());
        return true;
    }
}