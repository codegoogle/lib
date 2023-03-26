package com.p7700g.p99005;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: TransportErrorCollector.java */
/* loaded from: classes2.dex */
public class cn1 {
    @x1
    private static final kj1 a = kj1.b("TransportErrorHandler");
    public static int b = 2000;
    @x1
    private final List<a> c;
    private final List<gc1> d;
    private final List<va1> e;
    @x1
    private final ScheduledExecutorService f;
    @z1
    private ScheduledFuture g;

    /* compiled from: TransportErrorCollector.java */
    /* loaded from: classes2.dex */
    public interface a {
        @z1
        gc1 c(@x1 List<gc1> list);
    }

    public cn1() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void c() {
        if (this.d.isEmpty()) {
            return;
        }
        a.c("send %d errors to processor ", Integer.valueOf(this.d.size()));
        gc1 gc1Var = null;
        for (a aVar : this.c) {
            gc1Var = aVar.c(this.d);
        }
        if (gc1Var != null) {
            for (va1 va1Var : this.e) {
                va1Var.a(gc1Var);
            }
        } else {
            for (va1 va1Var2 : this.e) {
                va1Var2.complete();
            }
        }
        this.e.clear();
    }

    public boolean a(@x1 a aVar) {
        return this.c.add(aVar);
    }

    public synchronized void d(@z1 gc1 gc1Var, @z1 va1 va1Var) {
        if (gc1Var != null) {
            a.d(gc1Var, "processError: gprReason: %s", gc1Var.getGprReason());
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = this.f.schedule(new Runnable() { // from class: com.p7700g.p99005.zl1
            @Override // java.lang.Runnable
            public final void run() {
                cn1.this.c();
            }
        }, b, TimeUnit.MILLISECONDS);
        if (gc1Var != null) {
            if (va1Var != null) {
                this.e.add(va1Var);
            }
            this.d.add(gc1Var);
        }
    }

    public boolean e(@x1 a aVar) {
        return this.c.remove(aVar);
    }

    public synchronized void f() {
        a.c("clear errors", new Object[0]);
        this.d.clear();
    }

    @r2
    public cn1(@x1 ScheduledExecutorService scheduledExecutorService) {
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = scheduledExecutorService;
    }
}