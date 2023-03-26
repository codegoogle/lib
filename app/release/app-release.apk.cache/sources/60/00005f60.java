package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes3.dex */
public class u43 {
    private static final int a = 4;
    private final AtomicInteger b;
    private final Set<t43<?>> c;
    private final PriorityBlockingQueue<t43<?>> d;
    private final PriorityBlockingQueue<t43<?>> e;
    private final g43 f;
    private final m43 g;
    private final w43 h;
    private final n43[] i;
    private h43 j;
    private final List<c> k;

    /* compiled from: RequestQueue.java */
    /* loaded from: classes3.dex */
    public class a implements b {
        public final /* synthetic */ Object a;

        public a(final Object val$tag) {
            this.a = val$tag;
        }

        @Override // com.p7700g.p99005.u43.b
        public boolean a(t43<?> request) {
            return request.z() == this.a;
        }
    }

    /* compiled from: RequestQueue.java */
    /* loaded from: classes3.dex */
    public interface b {
        boolean a(t43<?> request);
    }

    /* compiled from: RequestQueue.java */
    /* loaded from: classes3.dex */
    public interface c<T> {
        void a(t43<T> request);
    }

    public u43(g43 cache, m43 network, int threadPoolSize, w43 delivery) {
        this.b = new AtomicInteger();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.e = new PriorityBlockingQueue<>();
        this.k = new ArrayList();
        this.f = cache;
        this.g = network;
        this.i = new n43[threadPoolSize];
        this.h = delivery;
    }

    public <T> t43<T> a(t43<T> request) {
        request.N(this);
        synchronized (this.c) {
            this.c.add(request);
        }
        request.P(g());
        request.b("add-to-queue");
        if (!request.T()) {
            this.e.add(request);
            return request;
        }
        this.d.add(request);
        return request;
    }

    public <T> void b(c<T> listener) {
        synchronized (this.k) {
            this.k.add(listener);
        }
    }

    public void c(b filter) {
        synchronized (this.c) {
            for (t43<?> t43Var : this.c) {
                if (filter.a(t43Var)) {
                    t43Var.c();
                }
            }
        }
    }

    public void d(final Object tag) {
        if (tag != null) {
            c(new a(tag));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public <T> void e(t43<T> request) {
        synchronized (this.c) {
            this.c.remove(request);
        }
        synchronized (this.k) {
            for (c cVar : this.k) {
                cVar.a(request);
            }
        }
    }

    public g43 f() {
        return this.f;
    }

    public int g() {
        return this.b.incrementAndGet();
    }

    public <T> void h(c<T> listener) {
        synchronized (this.k) {
            this.k.remove(listener);
        }
    }

    public void i() {
        j();
        h43 h43Var = new h43(this.d, this.e, this.f, this.h);
        this.j = h43Var;
        h43Var.start();
        for (int i = 0; i < this.i.length; i++) {
            n43 n43Var = new n43(this.e, this.g, this.f, this.h);
            this.i[i] = n43Var;
            n43Var.start();
        }
    }

    public void j() {
        n43[] n43VarArr;
        h43 h43Var = this.j;
        if (h43Var != null) {
            h43Var.e();
        }
        for (n43 n43Var : this.i) {
            if (n43Var != null) {
                n43Var.e();
            }
        }
    }

    public u43(g43 cache, m43 network, int threadPoolSize) {
        this(cache, network, threadPoolSize, new k43(new Handler(Looper.getMainLooper())));
    }

    public u43(g43 cache, m43 network) {
        this(cache, network, 4);
    }
}