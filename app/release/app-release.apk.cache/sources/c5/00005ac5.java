package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class ru2 {
    private static final long a = TimeUnit.HOURS.toSeconds(8);
    private final Context b;
    private final bu2 c;
    private final wt2 d;
    private final FirebaseMessaging e;
    private final pr2 f;
    private final ScheduledExecutorService h;
    private final pu2 j;
    @k1("pendingOperations")
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> g = new q7();
    @k1("this")
    private boolean i = false;

    private ru2(FirebaseMessaging firebaseMessaging, pr2 pr2Var, bu2 bu2Var, pu2 pu2Var, wt2 wt2Var, Context context, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.e = firebaseMessaging;
        this.f = pr2Var;
        this.c = bu2Var;
        this.j = pu2Var;
        this.d = wt2Var;
        this.b = context;
        this.h = scheduledExecutorService;
    }

    private void a(ou2 ou2Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.g) {
            String e = ou2Var.e();
            if (this.g.containsKey(e)) {
                arrayDeque = this.g.get(e);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.g.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    @s2
    private static <T> T b(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    @s2
    private void c(String str) throws IOException {
        b(this.d.k((String) b(this.f.getId()), this.e.c(), str));
    }

    @s2
    private void d(String str) throws IOException {
        b(this.d.l((String) b(this.f.getId()), this.e.c(), str));
    }

    @r2
    public static Task<ru2> e(final FirebaseMessaging firebaseMessaging, final pr2 pr2Var, final bu2 bu2Var, final wt2 wt2Var, final Context context, @x1 final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, pr2Var, bu2Var, wt2Var) { // from class: com.p7700g.p99005.qu2
            private final Context a;
            private final ScheduledExecutorService b;
            private final FirebaseMessaging c;
            private final pr2 d;
            private final bu2 e;
            private final wt2 f;

            {
                this.a = context;
                this.b = scheduledExecutorService;
                this.c = firebaseMessaging;
                this.d = pr2Var;
                this.e = bu2Var;
                this.f = wt2Var;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return ru2.i(this.a, this.b, this.c, this.d, this.e, this.f);
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable(rs2.a, 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable(rs2.a, 3));
    }

    public static final /* synthetic */ ru2 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, pr2 pr2Var, bu2 bu2Var, wt2 wt2Var) throws Exception {
        return new ru2(firebaseMessaging, pr2Var, bu2Var, pu2.b(context, scheduledExecutorService), wt2Var, context, scheduledExecutorService);
    }

    private void j(ou2 ou2Var) {
        synchronized (this.g) {
            String e = ou2Var.e();
            if (this.g.containsKey(e)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.g.get(e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.g.remove(e);
                }
            }
        }
    }

    private void o() {
        if (h()) {
            return;
        }
        s(0L);
    }

    public boolean f() {
        return this.j.c() != null;
    }

    public synchronized boolean h() {
        return this.i;
    }

    @s2
    public boolean k(ou2 ou2Var) throws IOException {
        char c;
        try {
            String b = ou2Var.b();
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b.equals("U")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (b.equals("S")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                c(ou2Var.c());
                if (g()) {
                    String.valueOf(ou2Var.c()).length();
                }
            } else if (c != 1) {
                if (g()) {
                    String.valueOf(ou2Var).length();
                }
            } else {
                d(ou2Var.c());
                if (g()) {
                    String.valueOf(ou2Var.c()).length();
                }
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
            String.valueOf(e.getMessage()).length();
            return false;
        }
    }

    public void l(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @r2
    public Task<Void> m(ou2 ou2Var) {
        this.j.a(ou2Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        a(ou2Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public synchronized void n(boolean z) {
        this.i = z;
    }

    public void p() {
        if (f()) {
            o();
        }
    }

    public Task<Void> q(String str) {
        Task<Void> m = m(ou2.f(str));
        p();
        return m;
    }

    @s2
    public boolean r() throws IOException {
        while (true) {
            synchronized (this) {
                ou2 c = this.j.c();
                if (c == null) {
                    g();
                    return true;
                } else if (!k(c)) {
                    return false;
                } else {
                    this.j.e(c);
                    j(c);
                }
            }
        }
    }

    public void s(long j) {
        l(new su2(this, this.b, this.c, Math.min(Math.max(30L, j + j), a)), j);
        n(true);
    }

    public Task<Void> t(String str) {
        Task<Void> m = m(ou2.g(str));
        p();
        return m;
    }
}