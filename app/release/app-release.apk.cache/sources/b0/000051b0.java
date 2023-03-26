package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes3.dex */
public class n43 extends Thread {
    private final BlockingQueue<t43<?>> s;
    private final m43 t;
    private final g43 u;
    private final w43 v;
    private volatile boolean w = false;

    public n43(BlockingQueue<t43<?>> queue, m43 network, g43 cache, w43 delivery) {
        this.s = queue;
        this.t = network;
        this.u = cache;
        this.v = delivery;
    }

    @TargetApi(14)
    private void a(t43<?> request) {
        TrafficStats.setThreadStatsTag(request.B());
    }

    private void b(t43<?> request, b53 error) {
        this.v.b(request, request.J(error));
    }

    private void c() throws InterruptedException {
        d(this.s.take());
    }

    @r2
    public void d(t43<?> request) {
        SystemClock.elapsedRealtime();
        try {
            request.b("network-queue-take");
            if (request.F()) {
                request.i("network-discard-cancelled");
                request.H();
                return;
            }
            a(request);
            p43 a = this.t.a(request);
            request.b("network-http-complete");
            if (a.e && request.E()) {
                request.i("not-modified");
                request.H();
                return;
            }
            v43<?> K = request.K(a);
            request.b("network-parse-complete");
            if (request.T() && K.b != null) {
                this.u.a(request.m(), K.b);
                request.b("network-cache-written");
            }
            request.G();
            this.v.c(request, K);
            request.I(K);
        } catch (b53 e) {
            b(request, e);
            request.H();
        } catch (Exception e2) {
            c53.d(e2, "Unhandled exception %s", e2.toString());
            this.v.b(request, new b53(e2));
            request.H();
        }
    }

    public void e() {
        this.w = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c53.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}