package com.p7700g.p99005;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.wb0;
import com.p7700g.p99005.we0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ff0 implements Runnable {
    private static final String s = tb0.f("EnqueueRunnable");
    private final oc0 t;
    private final kc0 u = new kc0();

    public ff0(@x1 oc0 workContinuation) {
        this.t = workContinuation;
    }

    private static boolean b(@x1 oc0 workContinuation) {
        boolean c = c(workContinuation.n(), workContinuation.m(), (String[]) oc0.s(workContinuation).toArray(new String[0]), workContinuation.k(), workContinuation.i());
        workContinuation.r();
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(rc0 workManagerImpl, @x1 List<? extends gc0> workList, String[] prerequisiteIds, String name, nb0 existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        int i;
        boolean z5;
        ArrayList arrayList;
        ge0 ge0Var;
        rc0 rc0Var = workManagerImpl;
        String[] strArr = prerequisiteIds;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase M = workManagerImpl.M();
        boolean z6 = strArr != null && strArr.length > 0;
        if (z6) {
            z = true;
            z2 = false;
            z3 = false;
            for (String str : strArr) {
                we0 u = M.L().u(str);
                if (u == null) {
                    tb0.c().b(s, String.format("Prerequisite %s doesn't exist; not enqueuing", str), new Throwable[0]);
                    return false;
                }
                dc0.a aVar = u.e;
                z &= aVar == dc0.a.SUCCEEDED;
                if (aVar == dc0.a.FAILED) {
                    z3 = true;
                } else if (aVar == dc0.a.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z7 = !TextUtils.isEmpty(name);
        if (z7 && !z6) {
            List<we0.b> e = M.L().e(name);
            if (!e.isEmpty()) {
                if (existingWorkPolicy != nb0.APPEND && existingWorkPolicy != nb0.APPEND_OR_REPLACE) {
                    if (existingWorkPolicy == nb0.KEEP) {
                        for (we0.b bVar : e) {
                            dc0.a aVar2 = bVar.b;
                            if (aVar2 == dc0.a.ENQUEUED || aVar2 == dc0.a.RUNNING) {
                                return false;
                            }
                            while (r3.hasNext()) {
                            }
                        }
                    }
                    ef0.d(name, rc0Var, false).run();
                    xe0 L = M.L();
                    for (we0.b bVar2 : e) {
                        L.a(bVar2.a);
                    }
                    z4 = true;
                    for (gc0 gc0Var : workList) {
                        we0 d = gc0Var.d();
                        if (!z6 || z) {
                            if (!d.d()) {
                                d.q = currentTimeMillis;
                            } else {
                                j = currentTimeMillis;
                                d.q = 0L;
                                i = Build.VERSION.SDK_INT;
                                if (i < 23 && i <= 25) {
                                    g(d);
                                } else if (i <= 22 && h(rc0Var, nc0.a)) {
                                    g(d);
                                }
                                if (d.e == dc0.a.ENQUEUED) {
                                    z4 = true;
                                }
                                M.L().h(d);
                                if (z6) {
                                    for (String str2 : strArr) {
                                        M.C().a(new fe0(gc0Var.b(), str2));
                                    }
                                }
                                for (String str3 : gc0Var.c()) {
                                    M.M().a(new ze0(str3, gc0Var.b()));
                                }
                                if (!z7) {
                                    M.J().a(new qe0(name, gc0Var.b()));
                                }
                                rc0Var = workManagerImpl;
                                currentTimeMillis = j;
                            }
                        } else if (z3) {
                            d.e = dc0.a.FAILED;
                        } else if (z2) {
                            d.e = dc0.a.CANCELLED;
                        } else {
                            d.e = dc0.a.BLOCKED;
                        }
                        j = currentTimeMillis;
                        i = Build.VERSION.SDK_INT;
                        if (i < 23) {
                        }
                        if (i <= 22) {
                            g(d);
                        }
                        if (d.e == dc0.a.ENQUEUED) {
                        }
                        M.L().h(d);
                        if (z6) {
                        }
                        while (r0.hasNext()) {
                        }
                        if (!z7) {
                        }
                        rc0Var = workManagerImpl;
                        currentTimeMillis = j;
                    }
                    return z4;
                }
                ge0 C = M.C();
                ArrayList arrayList2 = new ArrayList();
                for (we0.b bVar3 : e) {
                    if (C.d(bVar3.a)) {
                        ge0Var = C;
                    } else {
                        dc0.a aVar3 = bVar3.b;
                        ge0Var = C;
                        boolean z8 = (aVar3 == dc0.a.SUCCEEDED) & z;
                        if (aVar3 == dc0.a.FAILED) {
                            z3 = true;
                        } else if (aVar3 == dc0.a.CANCELLED) {
                            z2 = true;
                        }
                        arrayList2.add(bVar3.a);
                        z = z8;
                    }
                    C = ge0Var;
                }
                if (existingWorkPolicy == nb0.APPEND_OR_REPLACE && (z2 || z3)) {
                    xe0 L2 = M.L();
                    for (we0.b bVar4 : L2.e(name)) {
                        L2.a(bVar4.a);
                    }
                    z5 = false;
                    z2 = false;
                    arrayList = Collections.emptyList();
                } else {
                    z5 = z3;
                    arrayList = arrayList2;
                }
                strArr = (String[]) arrayList.toArray(strArr);
                z6 = strArr.length > 0;
                z3 = z5;
            }
        }
        z4 = false;
        while (r7.hasNext()) {
        }
        return z4;
    }

    private static boolean e(@x1 oc0 workContinuation) {
        List<oc0> l = workContinuation.l();
        boolean z = false;
        if (l != null) {
            boolean z2 = false;
            for (oc0 oc0Var : l) {
                if (!oc0Var.q()) {
                    z2 |= e(oc0Var);
                } else {
                    tb0.c().h(s, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", oc0Var.j())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(workContinuation) | z;
    }

    private static void g(we0 workSpec) {
        ib0 ib0Var = workSpec.m;
        String str = workSpec.f;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (ib0Var.f() || ib0Var.i()) {
            kb0.a aVar = new kb0.a();
            aVar.c(workSpec.h).q(ConstraintTrackingWorker.t, str);
            workSpec.f = ConstraintTrackingWorker.class.getName();
            workSpec.h = aVar.a();
        }
    }

    private static boolean h(@x1 rc0 workManager, @x1 String className) {
        try {
            Class<?> cls = Class.forName(className);
            for (mc0 mc0Var : workManager.L()) {
                if (cls.isAssignableFrom(mc0Var.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    @r2
    public boolean a() {
        WorkDatabase M = this.t.n().M();
        M.c();
        try {
            boolean e = e(this.t);
            M.A();
            return e;
        } finally {
            M.i();
        }
    }

    @x1
    public wb0 d() {
        return this.u;
    }

    @r2
    public void f() {
        rc0 n = this.t.n();
        nc0.b(n.F(), n.M(), n.L());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.t.o()) {
                if (a()) {
                    if0.c(this.t.n().E(), RescheduleReceiver.class, true);
                    f();
                }
                this.u.b(wb0.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.t));
        } catch (Throwable th) {
            this.u.b(new wb0.b.a(th));
        }
    }
}