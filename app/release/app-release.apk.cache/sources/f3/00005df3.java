package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import com.p7700g.p99005.i2;

/* compiled from: WorkForegroundRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class tf0 implements Runnable {
    public static final String s = tb0.f("WorkForegroundRunnable");
    public final zf0<Void> t = zf0.v();
    public final Context u;
    public final we0 v;
    public final ListenableWorker w;
    public final pb0 x;
    public final cg0 y;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ zf0 s;

        public a(final zf0 val$foregroundFuture) {
            this.s = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.s(tf0.this.w.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ zf0 s;

        public b(final zf0 val$foregroundFuture) {
            this.s = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ob0 ob0Var = (ob0) this.s.get();
                if (ob0Var != null) {
                    tb0.c().a(tf0.s, String.format("Updating notification for %s", tf0.this.v.f), new Throwable[0]);
                    tf0.this.w.setRunInForeground(true);
                    tf0 tf0Var = tf0.this;
                    tf0Var.t.s(tf0Var.x.a(tf0Var.u, tf0Var.w.getId(), ob0Var));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", tf0.this.v.f));
            } catch (Throwable th) {
                tf0.this.t.r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public tf0(@x1 Context context, @x1 we0 workSpec, @x1 ListenableWorker worker, @x1 pb0 foregroundUpdater, @x1 cg0 taskExecutor) {
        this.u = context;
        this.v = workSpec;
        this.w = worker;
        this.x = foregroundUpdater;
        this.y = taskExecutor;
    }

    @x1
    public gn2<Void> a() {
        return this.t;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.v.t && !jm.i()) {
            zf0 v = zf0.v();
            this.y.b().execute(new a(v));
            v.a(new b(v), this.y.b());
            return;
        }
        this.t.q(null);
    }
}