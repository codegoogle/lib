package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p7700g.p99005.zu2;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class zu2 implements ServiceConnection {
    private final Context s;
    private final Intent t;
    private final ScheduledExecutorService u;
    private final Queue<a> v;
    @z1
    private wu2 w;
    @k1("this")
    private boolean x;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static class a {
        public final Intent a;
        private final TaskCompletionSource<Void> b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.a = intent;
        }

        public static final /* synthetic */ void e(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        public void a(ScheduledExecutorService scheduledExecutorService) {
            c().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener(scheduledExecutorService.schedule(new Runnable(this) { // from class: com.p7700g.p99005.xu2
                private final zu2.a s;

                {
                    this.s = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.s.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS)) { // from class: com.p7700g.p99005.yu2
                private final ScheduledFuture a;

                {
                    this.a = r1;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
                    zu2.a.e(this.a, task);
                }
            });
        }

        public void b() {
            this.b.trySetResult(null);
        }

        public Task<Void> c() {
            return this.b.getTask();
        }

        public final /* synthetic */ void d() {
            String.valueOf(this.a.getAction()).length();
            b();
        }
    }

    public zu2(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @k1("this")
    private void a() {
        while (!this.v.isEmpty()) {
            this.v.poll().b();
        }
    }

    private synchronized void b() {
        Log.isLoggable(rs2.a, 3);
        while (!this.v.isEmpty()) {
            Log.isLoggable(rs2.a, 3);
            wu2 wu2Var = this.w;
            if (wu2Var != null && wu2Var.isBinderAlive()) {
                Log.isLoggable(rs2.a, 3);
                this.w.b(this.v.poll());
            } else {
                d();
                return;
            }
        }
    }

    @k1("this")
    private void d() {
        Log.isLoggable(rs2.a, 3);
        if (this.x) {
            return;
        }
        this.x = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.s, this.t, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.x = false;
        a();
    }

    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        Log.isLoggable(rs2.a, 3);
        aVar = new a(intent);
        aVar.a(this.u);
        this.v.add(aVar);
        b();
        return aVar.c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(rs2.a, 3)) {
            String.valueOf(componentName).length();
        }
        this.x = false;
        if (!(iBinder instanceof wu2)) {
            String.valueOf(iBinder).length();
            a();
            return;
        }
        this.w = (wu2) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(rs2.a, 3)) {
            String.valueOf(componentName).length();
        }
        b();
    }

    @r2
    public zu2(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.v = new ArrayDeque();
        this.x = false;
        Context applicationContext = context.getApplicationContext();
        this.s = applicationContext;
        this.t = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.u = scheduledExecutorService;
    }
}