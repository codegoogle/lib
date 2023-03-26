package com.p7700g.p99005;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.i2;

/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class hc0 {
    private static final String a = tb0.f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    /* loaded from: classes.dex */
    public class a extends hc0 {
        @Override // com.p7700g.p99005.hc0
        @z1
        public ListenableWorker a(@x1 Context appContext, @x1 String workerClassName, @x1 WorkerParameters workerParameters) {
            return null;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static hc0 c() {
        return new a();
    }

    @z1
    public abstract ListenableWorker a(@x1 Context appContext, @x1 String workerClassName, @x1 WorkerParameters workerParameters);

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public final ListenableWorker b(@x1 Context appContext, @x1 String workerClassName, @x1 WorkerParameters workerParameters) {
        ListenableWorker a2 = a(appContext, workerClassName, workerParameters);
        if (a2 == null) {
            Class cls = null;
            try {
                cls = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                tb0.c().b(a, wo1.t("Invalid class: ", workerClassName), th);
            }
            if (cls != null) {
                try {
                    a2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (Throwable th2) {
                    tb0.c().b(a, wo1.t("Could not instantiate ", workerClassName), th2);
                }
            }
        }
        if (a2 == null || !a2.isUsed()) {
            return a2;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
    }
}