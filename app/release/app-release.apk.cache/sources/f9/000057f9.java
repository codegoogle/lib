package com.p7700g.p99005;

import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;

/* compiled from: StopWorkRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class qf0 implements Runnable {
    private static final String s = tb0.f("StopWorkRunnable");
    private final rc0 t;
    private final String u;
    private final boolean v;

    public qf0(@x1 rc0 workManagerImpl, @x1 String workSpecId, boolean stopInForeground) {
        this.t = workManagerImpl;
        this.u = workSpecId;
        this.v = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean p;
        WorkDatabase M = this.t.M();
        lc0 J = this.t.J();
        xe0 L = M.L();
        M.c();
        try {
            boolean i = J.i(this.u);
            if (this.v) {
                p = this.t.J().o(this.u);
            } else {
                if (!i && L.t(this.u) == dc0.a.RUNNING) {
                    L.b(dc0.a.ENQUEUED, this.u);
                }
                p = this.t.J().p(this.u);
            }
            tb0.c().a(s, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.u, Boolean.valueOf(p)), new Throwable[0]);
            M.A();
        } finally {
            M.i();
        }
    }
}