package com.p7700g.p99005;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DelegatingWorkerFactory.java */
/* loaded from: classes.dex */
public class lb0 extends hc0 {
    private static final String b = tb0.f("DelegatingWkrFctry");
    private final List<hc0> c = new CopyOnWriteArrayList();

    @Override // com.p7700g.p99005.hc0
    @z1
    public final ListenableWorker a(@x1 Context appContext, @x1 String workerClassName, @x1 WorkerParameters workerParameters) {
        for (hc0 hc0Var : this.c) {
            try {
                ListenableWorker a = hc0Var.a(appContext, workerClassName, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                tb0.c().b(b, String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }

    public final void d(@x1 hc0 workerFactory) {
        this.c.add(workerFactory);
    }

    @x1
    @r2
    public List<hc0> e() {
        return this.c;
    }
}