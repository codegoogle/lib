package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.eg1;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ServiceReporter.java */
/* loaded from: classes2.dex */
public class mb1 {
    @x1
    private yp0 a = new yp0();
    @x1
    private final ob1 b;
    private ScheduledExecutorService c;
    @z1
    private eg1 d;

    public mb1(@x1 ob1 ob1Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.b = ob1Var;
        this.c = scheduledExecutorService;
    }

    public void a() {
        this.a.d();
    }

    public void b(@x1 kd1 kd1Var, @x1 uc1 uc1Var, @x1 eg1.a aVar) {
        this.d = new eg1(kd1Var, aVar, uc1Var, this.c);
    }

    @x1
    public dq0<ig1> c(boolean z, @z1 kg1 kg1Var, @x1 String str, @z1 Exception exc) {
        if (z) {
            if (kg1Var != null) {
                return ((eg1) r81.f(this.d)).M(kg1Var, str, this.b.d(), exc);
            }
            return dq0.D(null);
        }
        return dq0.C(new RuntimeException());
    }

    @x1
    public dq0<kg1> d(@x1 Bundle bundle, @x1 String str, @x1 dq0<fo1> dq0Var, @z1 fo1 fo1Var) {
        Bundle bundle2;
        this.a.d();
        this.a = new yp0();
        Exception E = dq0Var.E();
        if (fo1Var != null) {
            bundle2 = fo1Var.y;
        } else {
            Bundle bundle3 = new Bundle();
            E = gc1.handleTrackingException(dq0Var.E(), bundle3);
            bundle2 = bundle3;
        }
        bundle2.putBundle("startExtras", bundle);
        wp0 j = this.a.j();
        return ((eg1) r81.f(this.d)).P(str, this.b.a(), j, bundle2, E);
    }

    public void e() {
        try {
            this.a.d();
        } catch (Throwable unused) {
        }
    }
}