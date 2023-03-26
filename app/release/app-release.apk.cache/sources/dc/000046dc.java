package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class hm2 {
    private static final Map a = new HashMap();
    private final Context b;
    private final wl2 c;
    private boolean h;
    private final Intent i;
    @z1
    private ServiceConnection m;
    @z1
    private IInterface n;
    private final sm2 o;
    private final List e = new ArrayList();
    @k1("attachedRemoteTasksLock")
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final IBinder.DeathRecipient k = new IBinder.DeathRecipient() { // from class: com.p7700g.p99005.zl2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            hm2.h(hm2.this);
        }
    };
    @k1("attachedRemoteTasksLock")
    private final AtomicInteger l = new AtomicInteger(0);
    private final String d = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    private final WeakReference j = new WeakReference(null);

    public hm2(Context context, wl2 wl2Var, String str, Intent intent, sm2 sm2Var, @z1 cm2 cm2Var, byte[] bArr) {
        this.b = context;
        this.c = wl2Var;
        this.i = intent;
        this.o = sm2Var;
    }

    public static /* synthetic */ void h(hm2 hm2Var) {
        hm2Var.c.d("reportBinderDeath", new Object[0]);
        cm2 cm2Var = (cm2) hm2Var.j.get();
        if (cm2Var != null) {
            hm2Var.c.d("calling onBinderDied", new Object[0]);
            cm2Var.zza();
        } else {
            hm2Var.c.d("%s : Binder has died.", hm2Var.d);
            for (xl2 xl2Var : hm2Var.e) {
                xl2Var.c(hm2Var.s());
            }
            hm2Var.e.clear();
        }
        hm2Var.t();
    }

    public static /* bridge */ /* synthetic */ void m(hm2 hm2Var, xl2 xl2Var) {
        if (hm2Var.n != null || hm2Var.h) {
            if (hm2Var.h) {
                hm2Var.c.d("Waiting to bind to the service.", new Object[0]);
                hm2Var.e.add(xl2Var);
                return;
            }
            xl2Var.run();
            return;
        }
        hm2Var.c.d("Initiate binding to the service.", new Object[0]);
        hm2Var.e.add(xl2Var);
        gm2 gm2Var = new gm2(hm2Var, null);
        hm2Var.m = gm2Var;
        hm2Var.h = true;
        if (hm2Var.b.bindService(hm2Var.i, gm2Var, 1)) {
            return;
        }
        hm2Var.c.d("Failed to bind to the service.", new Object[0]);
        hm2Var.h = false;
        for (xl2 xl2Var2 : hm2Var.e) {
            xl2Var2.c(new im2());
        }
        hm2Var.e.clear();
    }

    public static /* bridge */ /* synthetic */ void n(hm2 hm2Var) {
        hm2Var.c.d("linkToDeath", new Object[0]);
        try {
            hm2Var.n.asBinder().linkToDeath(hm2Var.k, 0);
        } catch (RemoteException e) {
            hm2Var.c.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(hm2 hm2Var) {
        hm2Var.c.d("unlinkToDeath", new Object[0]);
        hm2Var.n.asBinder().unlinkToDeath(hm2Var.k, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.d).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.g) {
            for (TaskCompletionSource taskCompletionSource : this.f) {
                taskCompletionSource.trySetException(s());
            }
            this.f.clear();
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = a;
        synchronized (map) {
            if (!map.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                map.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.d);
        }
        return handler;
    }

    @z1
    public final IInterface e() {
        return this.n;
    }

    public final void p(xl2 xl2Var, @z1 final TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.p7700g.p99005.yl2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    hm2.this.q(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.g) {
            if (this.l.getAndIncrement() > 0) {
                this.c.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new am2(this, xl2Var.b(), xl2Var));
    }

    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        synchronized (this.g) {
            if (this.l.get() > 0 && this.l.decrementAndGet() > 0) {
                this.c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new bm2(this));
        }
    }
}