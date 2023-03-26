package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class vc0 implements mc0, jd0, jc0 {
    private static final String s = tb0.f("GreedyScheduler");
    public Boolean A;
    private final Context t;
    private final rc0 u;
    private final kd0 v;
    private uc0 x;
    private boolean y;
    private final Set<we0> w = new HashSet();
    private final Object z = new Object();

    public vc0(@x1 Context context, @x1 hb0 configuration, @x1 cg0 taskExecutor, @x1 rc0 workManagerImpl) {
        this.t = context;
        this.u = workManagerImpl;
        this.v = new kd0(context, taskExecutor, this);
        this.x = new uc0(this, configuration.k());
    }

    private void g() {
        this.A = Boolean.valueOf(kf0.b(this.t, this.u.F()));
    }

    private void h() {
        if (this.y) {
            return;
        }
        this.u.J().c(this);
        this.y = true;
    }

    private void i(@x1 String workSpecId) {
        synchronized (this.z) {
            Iterator<we0> it = this.w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                we0 next = it.next();
                if (next.d.equals(workSpecId)) {
                    tb0.c().a(s, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                    this.w.remove(next);
                    this.v.d(this.w);
                    break;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.mc0
    public void a(@x1 we0... workSpecs) {
        if (this.A == null) {
            g();
        }
        if (!this.A.booleanValue()) {
            tb0.c().d(s, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (we0 we0Var : workSpecs) {
            long a = we0Var.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (we0Var.e == dc0.a.ENQUEUED) {
                if (currentTimeMillis < a) {
                    uc0 uc0Var = this.x;
                    if (uc0Var != null) {
                        uc0Var.a(we0Var);
                    }
                } else if (we0Var.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && we0Var.m.h()) {
                        tb0.c().a(s, String.format("Ignoring WorkSpec %s, Requires device idle.", we0Var), new Throwable[0]);
                    } else if (i >= 24 && we0Var.m.e()) {
                        tb0.c().a(s, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", we0Var), new Throwable[0]);
                    } else {
                        hashSet.add(we0Var);
                        hashSet2.add(we0Var.d);
                    }
                } else {
                    tb0.c().a(s, String.format("Starting work for %s", we0Var.d), new Throwable[0]);
                    this.u.U(we0Var.d);
                }
            }
        }
        synchronized (this.z) {
            if (!hashSet.isEmpty()) {
                tb0.c().a(s, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.w.addAll(hashSet);
                this.v.d(this.w);
            }
        }
    }

    @Override // com.p7700g.p99005.jd0
    public void b(@x1 List<String> workSpecIds) {
        for (String str : workSpecIds) {
            tb0.c().a(s, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.u.X(str);
        }
    }

    @Override // com.p7700g.p99005.mc0
    public boolean c() {
        return false;
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        i(workSpecId);
    }

    @Override // com.p7700g.p99005.mc0
    public void e(@x1 String workSpecId) {
        if (this.A == null) {
            g();
        }
        if (!this.A.booleanValue()) {
            tb0.c().d(s, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        tb0.c().a(s, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        uc0 uc0Var = this.x;
        if (uc0Var != null) {
            uc0Var.b(workSpecId);
        }
        this.u.X(workSpecId);
    }

    @Override // com.p7700g.p99005.jd0
    public void f(@x1 List<String> workSpecIds) {
        for (String str : workSpecIds) {
            tb0.c().a(s, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.u.U(str);
        }
    }

    @r2
    public void j(@x1 uc0 delayedWorkTracker) {
        this.x = delayedWorkTracker;
    }

    @r2
    public vc0(@x1 Context context, @x1 rc0 workManagerImpl, @x1 kd0 workConstraintsTracker) {
        this.t = context;
        this.u = workManagerImpl;
        this.v = workConstraintsTracker;
    }
}