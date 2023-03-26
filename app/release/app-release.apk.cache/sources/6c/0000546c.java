package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class oi0<T> {
    public static Executor a = Executors.newCachedThreadPool();
    private final Set<ji0<T>> b;
    private final Set<ji0<Throwable>> c;
    private final Handler d;
    @z1
    private volatile ni0<T> e;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<ni0<T>> {
        public a(Callable<ni0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                oi0.this.k(get());
            } catch (InterruptedException | ExecutionException e) {
                oi0.this.k(new ni0(e));
            }
        }
    }

    @i2({i2.a.LIBRARY})
    public oi0(Callable<ni0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        ni0<T> ni0Var = this.e;
        if (ni0Var == null) {
            return;
        }
        if (ni0Var.b() != null) {
            h(ni0Var.b());
        } else {
            f(ni0Var.a());
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            yo0.f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ji0) it.next()).onResult(th);
        }
    }

    private void g() {
        this.d.post(new Runnable() { // from class: com.p7700g.p99005.wh0
            @Override // java.lang.Runnable
            public final void run() {
                oi0.this.e();
            }
        });
    }

    private synchronized void h(T t) {
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            ((ji0) it.next()).onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@z1 ni0<T> ni0Var) {
        if (this.e == null) {
            this.e = ni0Var;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized oi0<T> b(ji0<Throwable> ji0Var) {
        ni0<T> ni0Var = this.e;
        if (ni0Var != null && ni0Var.a() != null) {
            ji0Var.onResult(ni0Var.a());
        }
        this.c.add(ji0Var);
        return this;
    }

    public synchronized oi0<T> c(ji0<T> ji0Var) {
        ni0<T> ni0Var = this.e;
        if (ni0Var != null && ni0Var.b() != null) {
            ji0Var.onResult(ni0Var.b());
        }
        this.b.add(ji0Var);
        return this;
    }

    public synchronized oi0<T> i(ji0<Throwable> ji0Var) {
        this.c.remove(ji0Var);
        return this;
    }

    public synchronized oi0<T> j(ji0<T> ji0Var) {
        this.b.remove(ji0Var);
        return this;
    }

    @i2({i2.a.LIBRARY})
    public oi0(Callable<ni0<T>> callable, boolean z) {
        this.b = new LinkedHashSet(1);
        this.c = new LinkedHashSet(1);
        this.d = new Handler(Looper.getMainLooper());
        this.e = null;
        if (z) {
            try {
                k(callable.call());
                return;
            } catch (Throwable th) {
                k(new ni0<>(th));
                return;
            }
        }
        a.execute(new a(callable));
    }
}