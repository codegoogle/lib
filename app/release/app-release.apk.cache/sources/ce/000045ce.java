package com.p7700g.p99005;

import android.os.Process;
import com.p7700g.p99005.g43;
import com.p7700g.p99005.t43;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes3.dex */
public class h43 extends Thread {
    private static final boolean s = c53.b;
    private final BlockingQueue<t43<?>> t;
    private final BlockingQueue<t43<?>> u;
    private final g43 v;
    private final w43 w;
    private volatile boolean x = false;
    private final b y = new b(this);

    /* compiled from: CacheDispatcher.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ t43 s;

        public a(final t43 val$request) {
            this.s = val$request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h43.this.u.put(this.s);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* compiled from: CacheDispatcher.java */
    /* loaded from: classes3.dex */
    public static class b implements t43.c {
        private final Map<String, List<t43<?>>> a = new HashMap();
        private final h43 b;

        public b(h43 cacheDispatcher) {
            this.b = cacheDispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean d(t43<?> request) {
            String m = request.m();
            if (this.a.containsKey(m)) {
                List<t43<?>> list = this.a.get(m);
                if (list == null) {
                    list = new ArrayList<>();
                }
                request.b("waiting-for-response");
                list.add(request);
                this.a.put(m, list);
                if (c53.b) {
                    c53.b("Request for cacheKey=%s is in flight, putting on hold.", m);
                }
                return true;
            }
            this.a.put(m, null);
            request.M(this);
            if (c53.b) {
                c53.b("new request, sending to network %s", m);
            }
            return false;
        }

        @Override // com.p7700g.p99005.t43.c
        public void a(t43<?> request, v43<?> response) {
            List<t43<?>> remove;
            g43.a aVar = response.b;
            if (aVar != null && !aVar.a()) {
                String m = request.m();
                synchronized (this) {
                    remove = this.a.remove(m);
                }
                if (remove != null) {
                    if (c53.b) {
                        c53.f("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m);
                    }
                    for (t43<?> t43Var : remove) {
                        this.b.w.c(t43Var, response);
                    }
                    return;
                }
                return;
            }
            b(request);
        }

        @Override // com.p7700g.p99005.t43.c
        public synchronized void b(t43<?> request) {
            String m = request.m();
            List<t43<?>> remove = this.a.remove(m);
            if (remove != null && !remove.isEmpty()) {
                if (c53.b) {
                    c53.f("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), m);
                }
                t43<?> remove2 = remove.remove(0);
                this.a.put(m, remove);
                remove2.M(this);
                try {
                    this.b.u.put(remove2);
                } catch (InterruptedException e) {
                    c53.c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.b.e();
                }
            }
        }
    }

    public h43(BlockingQueue<t43<?>> cacheQueue, BlockingQueue<t43<?>> networkQueue, g43 cache, w43 delivery) {
        this.t = cacheQueue;
        this.u = networkQueue;
        this.v = cache;
        this.w = delivery;
    }

    private void c() throws InterruptedException {
        d(this.t.take());
    }

    @r2
    public void d(final t43<?> request) throws InterruptedException {
        request.b("cache-queue-take");
        if (request.F()) {
            request.i("cache-discard-canceled");
            return;
        }
        g43.a aVar = this.v.get(request.m());
        if (aVar == null) {
            request.b("cache-miss");
            if (this.y.d(request)) {
                return;
            }
            this.u.put(request);
        } else if (aVar.a()) {
            request.b("cache-hit-expired");
            request.L(aVar);
            if (this.y.d(request)) {
                return;
            }
            this.u.put(request);
        } else {
            request.b("cache-hit");
            v43<?> K = request.K(new p43(aVar.a, aVar.g));
            request.b("cache-hit-parsed");
            if (!aVar.b()) {
                this.w.c(request, K);
                return;
            }
            request.b("cache-hit-refresh-needed");
            request.L(aVar);
            K.d = true;
            if (!this.y.d(request)) {
                this.w.a(request, K, new a(request));
            } else {
                this.w.c(request, K);
            }
        }
    }

    public void e() {
        this.x = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (s) {
            c53.f("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.v.initialize();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c53.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}