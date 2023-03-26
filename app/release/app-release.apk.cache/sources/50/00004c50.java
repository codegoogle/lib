package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.nd0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public class kd0 implements nd0.a {
    private static final String a = tb0.f("WorkConstraintsTracker");
    @z1
    private final jd0 b;
    private final nd0<?>[] c;
    private final Object d;

    public kd0(@x1 Context context, @x1 cg0 taskExecutor, @z1 jd0 callback) {
        Context applicationContext = context.getApplicationContext();
        this.b = callback;
        this.c = new nd0[]{new ld0(applicationContext, taskExecutor), new md0(applicationContext, taskExecutor), new sd0(applicationContext, taskExecutor), new od0(applicationContext, taskExecutor), new rd0(applicationContext, taskExecutor), new qd0(applicationContext, taskExecutor), new pd0(applicationContext, taskExecutor)};
        this.d = new Object();
    }

    @Override // com.p7700g.p99005.nd0.a
    public void a(@x1 List<String> workSpecIds) {
        synchronized (this.d) {
            ArrayList arrayList = new ArrayList();
            for (String str : workSpecIds) {
                if (c(str)) {
                    tb0.c().a(a, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            jd0 jd0Var = this.b;
            if (jd0Var != null) {
                jd0Var.f(arrayList);
            }
        }
    }

    @Override // com.p7700g.p99005.nd0.a
    public void b(@x1 List<String> workSpecIds) {
        synchronized (this.d) {
            jd0 jd0Var = this.b;
            if (jd0Var != null) {
                jd0Var.b(workSpecIds);
            }
        }
    }

    public boolean c(@x1 String workSpecId) {
        nd0<?>[] nd0VarArr;
        synchronized (this.d) {
            for (nd0<?> nd0Var : this.c) {
                if (nd0Var.d(workSpecId)) {
                    tb0.c().a(a, String.format("Work %s constrained by %s", workSpecId, nd0Var.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(@x1 Iterable<we0> workSpecs) {
        synchronized (this.d) {
            for (nd0<?> nd0Var : this.c) {
                nd0Var.g(null);
            }
            for (nd0<?> nd0Var2 : this.c) {
                nd0Var2.e(workSpecs);
            }
            for (nd0<?> nd0Var3 : this.c) {
                nd0Var3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.d) {
            for (nd0<?> nd0Var : this.c) {
                nd0Var.f();
            }
        }
    }

    @r2
    public kd0(@z1 jd0 callback, nd0<?>[] controllers) {
        this.b = callback;
        this.c = controllers;
        this.d = new Object();
    }
}