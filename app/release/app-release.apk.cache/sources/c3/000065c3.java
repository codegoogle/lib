package com.p7700g.p99005;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public abstract class xl2 implements Runnable {
    @z1
    private final TaskCompletionSource s;

    public xl2() {
        this.s = null;
    }

    public xl2(@z1 TaskCompletionSource taskCompletionSource) {
        this.s = taskCompletionSource;
    }

    public abstract void a();

    @z1
    public final TaskCompletionSource b() {
        return this.s;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.s;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }
}