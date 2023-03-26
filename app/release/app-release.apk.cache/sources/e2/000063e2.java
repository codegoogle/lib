package com.p7700g.p99005;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.SyncJobService;
import com.onesignal.SyncService;
import com.p7700g.p99005.ej3;
import com.p7700g.p99005.jm3;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: OSSyncService.java */
/* loaded from: classes3.dex */
public class wl3 extends rj3 {
    private static final Object d = new Object();
    private static final String e = "OS_SYNCSRV_BG_SYNC";
    private static final int f = 2071862118;
    private static final long g = 30000;
    private static wl3 h;
    private Long i = 0L;

    /* compiled from: OSSyncService.java */
    /* loaded from: classes3.dex */
    public static class a extends c {
        private WeakReference<Service> s;

        public a(Service service) {
            this.s = new WeakReference<>(service);
        }

        @Override // com.p7700g.p99005.wl3.c
        public void a() {
            jm3.a(jm3.u0.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.s.get() != null) {
                this.s.get().stopSelf();
            }
        }
    }

    /* compiled from: OSSyncService.java */
    @e2(api = 21)
    /* loaded from: classes3.dex */
    public static class b extends c {
        private WeakReference<JobService> s;
        private JobParameters t;

        public b(JobService jobService, JobParameters jobParameters) {
            this.s = new WeakReference<>(jobService);
            this.t = jobParameters;
        }

        @Override // com.p7700g.p99005.wl3.c
        public void a() {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            StringBuilder G = wo1.G("LollipopSyncRunnable:JobFinished needsJobReschedule: ");
            G.append(wl3.r().b);
            jm3.a(u0Var, G.toString());
            boolean z = wl3.r().b;
            wl3.r().b = false;
            if (this.s.get() != null) {
                this.s.get().jobFinished(this.t, z);
            }
        }
    }

    /* compiled from: OSSyncService.java */
    /* loaded from: classes3.dex */
    public static abstract class c implements Runnable {

        /* compiled from: OSSyncService.java */
        /* loaded from: classes3.dex */
        public class a implements ej3.b {
            public final /* synthetic */ BlockingQueue a;

            public a(BlockingQueue blockingQueue) {
                this.a = blockingQueue;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r2 = r2;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p7700g.p99005.ej3.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void a(ej3.d dVar) {
                ej3.d dVar2;
                if (dVar == null) {
                    dVar2 = new Object();
                }
                this.a.offer(dVar2);
            }

            @Override // com.p7700g.p99005.ej3.b
            public ej3.f getType() {
                return ej3.f.SYNC_SERVICE;
            }
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (rj3.a) {
                wl3.r().i = 0L;
            }
            if (jm3.c1() == null) {
                a();
                return;
            }
            jm3.i = jm3.M0();
            an3.m();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                ej3.g(jm3.g, false, false, new a(arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof ej3.d) {
                    an3.E((ej3.d) take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            an3.C(true);
            jm3.t0().d();
            a();
        }
    }

    public static wl3 r() {
        if (h == null) {
            synchronized (d) {
                if (h == null) {
                    h = new wl3();
                }
            }
        }
        return h;
    }

    @Override // com.p7700g.p99005.rj3
    public Class c() {
        return SyncJobService.class;
    }

    @Override // com.p7700g.p99005.rj3
    public Class d() {
        return SyncService.class;
    }

    @Override // com.p7700g.p99005.rj3
    public int e() {
        return f;
    }

    @Override // com.p7700g.p99005.rj3
    public String f() {
        return e;
    }

    @Override // com.p7700g.p99005.rj3
    public void l(Context context) {
        jm3.a(jm3.u0.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        t(context, 30000L);
    }

    public void q(Context context) {
        synchronized (rj3.a) {
            this.i = 0L;
            if (ej3.m(context)) {
                return;
            }
            a(context);
        }
    }

    public void s(Context context, long j) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        jm3.a(u0Var, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j);
        t(context, j);
    }

    public void t(Context context, long j) {
        synchronized (rj3.a) {
            if (this.i.longValue() != 0 && jm3.X0().b() + j > this.i.longValue()) {
                jm3.a(jm3.u0.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.i);
                return;
            }
            if (j < 5000) {
                j = 5000;
            }
            i(context, j);
            this.i = Long.valueOf(jm3.X0().b() + j);
        }
    }
}