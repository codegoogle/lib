package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.p7700g.p99005.bd0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.wf0;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ad0 implements jd0, jc0, wf0.b {
    private static final String s = tb0.f("DelayMetCommandHandler");
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private final kd0 A;
    @z1
    private PowerManager.WakeLock D;
    private final Context w;
    private final int x;
    private final String y;
    private final bd0 z;
    private boolean E = false;
    private int C = 0;
    private final Object B = new Object();

    public ad0(@x1 Context context, int startId, @x1 String workSpecId, @x1 bd0 dispatcher) {
        this.w = context;
        this.x = startId;
        this.z = dispatcher;
        this.y = workSpecId;
        this.A = new kd0(context, dispatcher.f(), this);
    }

    private void c() {
        synchronized (this.B) {
            this.A.e();
            this.z.h().f(this.y);
            PowerManager.WakeLock wakeLock = this.D;
            if (wakeLock != null && wakeLock.isHeld()) {
                tb0.c().a(s, String.format("Releasing wakelock %s for WorkSpec %s", this.D, this.y), new Throwable[0]);
                this.D.release();
            }
        }
    }

    private void g() {
        synchronized (this.B) {
            if (this.C < 2) {
                this.C = 2;
                tb0 c = tb0.c();
                String str = s;
                c.a(str, String.format("Stopping work for WorkSpec %s", this.y), new Throwable[0]);
                Intent g = yc0.g(this.w, this.y);
                bd0 bd0Var = this.z;
                bd0Var.k(new bd0.b(bd0Var, g, this.x));
                if (this.z.e().h(this.y)) {
                    tb0.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.y), new Throwable[0]);
                    Intent f = yc0.f(this.w, this.y);
                    bd0 bd0Var2 = this.z;
                    bd0Var2.k(new bd0.b(bd0Var2, f, this.x));
                } else {
                    tb0.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.y), new Throwable[0]);
                }
            } else {
                tb0.c().a(s, String.format("Already stopped work for %s", this.y), new Throwable[0]);
            }
        }
    }

    @Override // com.p7700g.p99005.wf0.b
    public void a(@x1 String workSpecId) {
        tb0.c().a(s, String.format("Exceeded time limits on execution for %s", workSpecId), new Throwable[0]);
        g();
    }

    @Override // com.p7700g.p99005.jd0
    public void b(@x1 List<String> workSpecIds) {
        g();
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        tb0.c().a(s, String.format("onExecuted %s, %s", workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
        c();
        if (needsReschedule) {
            Intent f = yc0.f(this.w, this.y);
            bd0 bd0Var = this.z;
            bd0Var.k(new bd0.b(bd0Var, f, this.x));
        }
        if (this.E) {
            Intent a = yc0.a(this.w);
            bd0 bd0Var2 = this.z;
            bd0Var2.k(new bd0.b(bd0Var2, a, this.x));
        }
    }

    @s2
    public void e() {
        this.D = sf0.b(this.w, String.format("%s (%s)", this.y, Integer.valueOf(this.x)));
        tb0 c = tb0.c();
        String str = s;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.D, this.y), new Throwable[0]);
        this.D.acquire();
        we0 u2 = this.z.g().M().L().u(this.y);
        if (u2 == null) {
            g();
            return;
        }
        boolean b = u2.b();
        this.E = b;
        if (!b) {
            tb0.c().a(str, String.format("No constraints for %s", this.y), new Throwable[0]);
            f(Collections.singletonList(this.y));
            return;
        }
        this.A.d(Collections.singletonList(u2));
    }

    @Override // com.p7700g.p99005.jd0
    public void f(@x1 List<String> workSpecIds) {
        if (workSpecIds.contains(this.y)) {
            synchronized (this.B) {
                if (this.C == 0) {
                    this.C = 1;
                    tb0.c().a(s, String.format("onAllConstraintsMet for %s", this.y), new Throwable[0]);
                    if (this.z.e().k(this.y)) {
                        this.z.h().e(this.y, yc0.B, this);
                    } else {
                        c();
                    }
                } else {
                    tb0.c().a(s, String.format("Already started work for %s", this.y), new Throwable[0]);
                }
            }
        }
    }
}