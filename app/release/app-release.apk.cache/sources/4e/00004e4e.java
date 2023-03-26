package com.p7700g.p99005;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.tc0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class lc0 implements jc0, de0 {
    private static final String s = tb0.f("Processor");
    private static final String t = "ProcessorForegroundLck";
    private List<mc0> B;
    private Context v;
    private hb0 w;
    private cg0 x;
    private WorkDatabase y;
    private Map<String, tc0> A = new HashMap();
    private Map<String, tc0> z = new HashMap();
    private Set<String> C = new HashSet();
    private final List<jc0> D = new ArrayList();
    @z1
    private PowerManager.WakeLock u = null;
    private final Object E = new Object();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        @x1
        private jc0 s;
        @x1
        private String t;
        @x1
        private gn2<Boolean> u;

        public a(@x1 jc0 executionListener, @x1 String workSpecId, @x1 gn2<Boolean> future) {
            this.s = executionListener;
            this.t = workSpecId;
            this.u = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.u.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.s.d(this.t, z);
        }
    }

    public lc0(@x1 Context appContext, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, @x1 WorkDatabase workDatabase, @x1 List<mc0> schedulers) {
        this.v = appContext;
        this.w = configuration;
        this.x = workTaskExecutor;
        this.y = workDatabase;
        this.B = schedulers;
    }

    private static boolean f(@x1 String id, @z1 tc0 wrapper) {
        if (wrapper != null) {
            wrapper.d();
            tb0.c().a(s, String.format("WorkerWrapper interrupted for %s", id), new Throwable[0]);
            return true;
        }
        tb0.c().a(s, String.format("WorkerWrapper could not be found for %s", id), new Throwable[0]);
        return false;
    }

    private void n() {
        synchronized (this.E) {
            if (!(!this.z.isEmpty())) {
                this.v.startService(ee0.g(this.v));
                PowerManager.WakeLock wakeLock = this.u;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.u = null;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.de0
    public void a(@x1 String workSpecId, @x1 ob0 foregroundInfo) {
        synchronized (this.E) {
            tb0.c().d(s, String.format("Moving WorkSpec (%s) to the foreground", workSpecId), new Throwable[0]);
            tc0 remove = this.A.remove(workSpecId);
            if (remove != null) {
                if (this.u == null) {
                    PowerManager.WakeLock b = sf0.b(this.v, t);
                    this.u = b;
                    b.acquire();
                }
                this.z.put(workSpecId, remove);
                gh.u(this.v, ee0.e(this.v, workSpecId, foregroundInfo));
            }
        }
    }

    @Override // com.p7700g.p99005.de0
    public void b(@x1 String workSpecId) {
        synchronized (this.E) {
            this.z.remove(workSpecId);
            n();
        }
    }

    public void c(@x1 jc0 executionListener) {
        synchronized (this.E) {
            this.D.add(executionListener);
        }
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 final String workSpecId, boolean needsReschedule) {
        synchronized (this.E) {
            this.A.remove(workSpecId);
            tb0.c().a(s, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
            for (jc0 jc0Var : this.D) {
                jc0Var.d(workSpecId, needsReschedule);
            }
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this.E) {
            z = (this.A.isEmpty() && this.z.isEmpty()) ? false : true;
        }
        return z;
    }

    public boolean g(@x1 String id) {
        boolean contains;
        synchronized (this.E) {
            contains = this.C.contains(id);
        }
        return contains;
    }

    public boolean h(@x1 String workSpecId) {
        boolean z;
        synchronized (this.E) {
            z = this.A.containsKey(workSpecId) || this.z.containsKey(workSpecId);
        }
        return z;
    }

    public boolean i(@x1 String workSpecId) {
        boolean containsKey;
        synchronized (this.E) {
            containsKey = this.z.containsKey(workSpecId);
        }
        return containsKey;
    }

    public void j(@x1 jc0 executionListener) {
        synchronized (this.E) {
            this.D.remove(executionListener);
        }
    }

    public boolean k(@x1 String id) {
        return l(id, null);
    }

    public boolean l(@x1 String id, @z1 WorkerParameters.a runtimeExtras) {
        synchronized (this.E) {
            if (h(id)) {
                tb0.c().a(s, String.format("Work %s is already enqueued for processing", id), new Throwable[0]);
                return false;
            }
            tc0 a2 = new tc0.c(this.v, this.w, this.x, this, this.y, id).c(this.B).b(runtimeExtras).a();
            gn2<Boolean> b = a2.b();
            b.a(new a(this, id, b), this.x.b());
            this.A.put(id, a2);
            this.x.d().execute(a2);
            tb0.c().a(s, String.format("%s: processing %s", getClass().getSimpleName(), id), new Throwable[0]);
            return true;
        }
    }

    public boolean m(@x1 String id) {
        boolean f;
        synchronized (this.E) {
            boolean z = true;
            tb0.c().a(s, String.format("Processor cancelling %s", id), new Throwable[0]);
            this.C.add(id);
            tc0 remove = this.z.remove(id);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.A.remove(id);
            }
            f = f(id, remove);
            if (z) {
                n();
            }
        }
        return f;
    }

    public boolean o(@x1 String id) {
        boolean f;
        synchronized (this.E) {
            tb0.c().a(s, String.format("Processor stopping foreground work %s", id), new Throwable[0]);
            f = f(id, this.z.remove(id));
        }
        return f;
    }

    public boolean p(@x1 String id) {
        boolean f;
        synchronized (this.E) {
            tb0.c().a(s, String.format("Processor stopping background work %s", id), new Throwable[0]);
            f = f(id, this.A.remove(id));
        }
        return f;
    }
}