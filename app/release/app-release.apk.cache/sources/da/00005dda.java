package com.p7700g.p99005;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes2.dex */
public class tc1 implements nc1 {
    @z1
    private uc1 a;
    @z1
    private xa1<Integer> b;
    @z1
    private pc1 c;
    @x1
    private oc1 d;

    public tc1(@x1 oc1 oc1Var) {
        this.d = oc1Var;
    }

    @Override // com.p7700g.p99005.nc1
    public void a(@x1 qc1 qc1Var) {
        uc1 uc1Var = this.a;
        if (uc1Var != null) {
            int c = uc1Var.c(null);
            xa1<Integer> xa1Var = this.b;
            if (xa1Var != null) {
                try {
                    xa1Var.accept(Integer.valueOf(c));
                } catch (Exception unused) {
                }
            }
        }
    }

    public void b(@x1 Context context, @x1 ScheduledExecutorService scheduledExecutorService, @z1 xa1<Integer> xa1Var) {
        this.a = new uc1(context);
        this.b = xa1Var;
        me1 a = this.d.a(context, scheduledExecutorService);
        if (xa1Var != null) {
            try {
                xa1Var.accept(Integer.valueOf(this.a.c(null)));
            } catch (Exception unused) {
            }
        }
        this.c = a.c("NetworkTypeObserver", this);
    }

    public void c(@x1 Context context) {
        pc1 pc1Var = this.c;
        if (pc1Var != null) {
            pc1Var.cancel();
        }
    }
}