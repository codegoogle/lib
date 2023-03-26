package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DelayedWorkTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class uc0 {
    public static final String a = tb0.f("DelayedWorkTracker");
    public final vc0 b;
    private final bc0 c;
    private final Map<String, Runnable> d = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ we0 s;

        public a(final we0 val$workSpec) {
            this.s = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            tb0.c().a(uc0.a, String.format("Scheduling work %s", this.s.d), new Throwable[0]);
            uc0.this.b.a(this.s);
        }
    }

    public uc0(@x1 vc0 scheduler, @x1 bc0 runnableScheduler) {
        this.b = scheduler;
        this.c = runnableScheduler;
    }

    public void a(@x1 final we0 workSpec) {
        Runnable remove = this.d.remove(workSpec.d);
        if (remove != null) {
            this.c.b(remove);
        }
        a aVar = new a(workSpec);
        this.d.put(workSpec.d, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(workSpec.a() - currentTimeMillis, aVar);
    }

    public void b(@x1 String workSpecId) {
        Runnable remove = this.d.remove(workSpecId);
        if (remove != null) {
            this.c.b(remove);
        }
    }
}