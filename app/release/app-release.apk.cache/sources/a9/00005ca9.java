package com.p7700g.p99005;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener.java */
/* loaded from: classes3.dex */
public class sr2 implements wr2 {
    public final TaskCompletionSource<String> a;

    public sr2(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.p7700g.p99005.wr2
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.p7700g.p99005.wr2
    public boolean b(fs2 fs2Var) {
        if (fs2Var.l() || fs2Var.k() || fs2Var.i()) {
            this.a.trySetResult(fs2Var.d());
            return true;
        }
        return false;
    }
}