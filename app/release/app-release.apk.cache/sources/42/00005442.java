package com.p7700g.p99005;

import androidx.work.WorkerParameters;
import com.p7700g.p99005.i2;

/* compiled from: StartWorkRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class of0 implements Runnable {
    private rc0 s;
    private String t;
    private WorkerParameters.a u;

    public of0(rc0 workManagerImpl, String workSpecId, WorkerParameters.a runtimeExtras) {
        this.s = workManagerImpl;
        this.t = workSpecId;
        this.u = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.s.J().l(this.t, this.u);
    }
}