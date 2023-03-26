package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.wb0;

/* compiled from: PruneWorkRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class lf0 implements Runnable {
    private final rc0 s;
    private final kc0 t = new kc0();

    public lf0(rc0 workManagerImpl) {
        this.s = workManagerImpl;
    }

    public wb0 a() {
        return this.t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.s.M().L().c();
            this.t.b(wb0.a);
        } catch (Throwable th) {
            this.t.b(new wb0.b.a(th));
        }
    }
}