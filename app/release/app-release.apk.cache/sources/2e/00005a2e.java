package com.p7700g.p99005;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p7700g.p99005.ii3;
import com.p7700g.p99005.jm3;

/* compiled from: OSBackgroundSync.java */
/* loaded from: classes3.dex */
public abstract class rj3 {
    public static final Object a = new Object();
    public boolean b = false;
    private Thread c;

    private boolean g(Context context) {
        return ii3.c.a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    @e2(api = 21)
    private boolean h(Context context) {
        Thread thread;
        for (JobInfo jobInfo : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (jobInfo.getId() == e() && (thread = this.c) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private void j(Context context, long j) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        jm3.a(u0Var, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j);
        ((AlarmManager) context.getSystemService(kg.v0)).set(0, jm3.X0().b() + j, n(context));
    }

    @e2(21)
    private void k(Context context, long j) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        jm3.a(u0Var, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j);
        if (h(context)) {
            jm3.a(u0Var, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.b = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(e(), new ComponentName(context, c()));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (g(context)) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            jm3.u0 u0Var2 = jm3.u0.INFO;
            jm3.a(u0Var2, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + schedule);
        } catch (NullPointerException e) {
            jm3.b(jm3.u0.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private PendingIntent n(Context context) {
        return PendingIntent.getService(context, e(), new Intent(context, d()), 201326592);
    }

    private static boolean o() {
        return true;
    }

    public void a(Context context) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, getClass().getSimpleName() + " cancel background sync");
        synchronized (a) {
            if (o()) {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(e());
            } else {
                ((AlarmManager) context.getSystemService(kg.v0)).cancel(n(context));
            }
        }
    }

    public void b(Context context, Runnable runnable) {
        jm3.P1(jm3.u0.DEBUG, "OSBackground sync, calling initWithContext");
        jm3.q1(context);
        Thread thread = new Thread(runnable, f());
        this.c = thread;
        thread.start();
    }

    public abstract Class c();

    public abstract Class d();

    public abstract int e();

    public abstract String f();

    public void i(Context context, long j) {
        synchronized (a) {
            if (o()) {
                k(context, j);
            } else {
                j(context, j);
            }
        }
    }

    public abstract void l(Context context);

    public boolean m() {
        Thread thread = this.c;
        if (thread != null && thread.isAlive()) {
            this.c.interrupt();
            return true;
        }
        return false;
    }
}