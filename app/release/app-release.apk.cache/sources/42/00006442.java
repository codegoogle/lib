package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.wu2;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes3.dex */
public abstract class ws2 extends Service {
    private Binder t;
    private int v;
    @r2
    public final ExecutorService s = ft2.c();
    private final Object u = new Object();
    private int w = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public class a implements wu2.a {
        public a() {
        }

        @Override // com.p7700g.p99005.wu2.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return ws2.this.h(intent);
        }
    }

    private void b(Intent intent) {
        if (intent != null) {
            tu2.b(intent);
        }
        synchronized (this.u) {
            int i = this.w - 1;
            this.w = i;
            if (i == 0) {
                i(this.v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @u1
    public Task<Void> h(Intent intent) {
        if (e(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.s.execute(new Runnable(this, intent, taskCompletionSource) { // from class: com.p7700g.p99005.ts2
            private final ws2 s;
            private final Intent t;
            private final TaskCompletionSource u;

            {
                this.s = this;
                this.t = intent;
                this.u = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.g(this.t, this.u);
            }
        });
        return taskCompletionSource.getTask();
    }

    @x1
    public Intent c(@x1 Intent intent) {
        return intent;
    }

    public abstract void d(@x1 Intent intent);

    public boolean e(@x1 Intent intent) {
        return false;
    }

    public final /* synthetic */ void f(Intent intent, Task task) {
        b(intent);
    }

    public final /* synthetic */ void g(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            d(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public boolean i(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    @x1
    public final synchronized IBinder onBind(@x1 Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.t == null) {
            this.t = new wu2(new a());
        }
        return this.t;
    }

    @Override // android.app.Service
    @t0
    public void onDestroy() {
        this.s.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@x1 Intent intent, int i, int i2) {
        synchronized (this.u) {
            this.v = i2;
            this.w++;
        }
        Intent c = c(intent);
        if (c == null) {
            b(intent);
            return 2;
        }
        Task<Void> h = h(c);
        if (h.isComplete()) {
            b(intent);
            return 2;
        }
        h.addOnCompleteListener(us2.s, new OnCompleteListener(this, intent) { // from class: com.p7700g.p99005.vs2
            private final ws2 a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task) {
                this.a.f(this.b, task);
            }
        });
        return 3;
    }
}