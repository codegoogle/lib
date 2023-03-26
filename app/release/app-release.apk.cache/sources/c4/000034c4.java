package com.ironsource.mediationsdk;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class ah {
    private com.ironsource.mediationsdk.utils.c a;
    public ai b;
    private Timer c = null;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.b.e();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.b.e();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.b.e();
        }
    }

    public ah(com.ironsource.mediationsdk.utils.c cVar, ai aiVar) {
        this.a = cVar;
        this.b = aiVar;
    }

    private void e() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final synchronized void a() {
        if (this.a.n) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new a(), this.a.l);
        }
    }

    public final synchronized void b() {
        if (!this.a.n) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new b(), this.a.l);
        }
    }

    public final void c() {
        synchronized (this) {
            e();
        }
        this.b.e();
    }

    public final synchronized void d() {
        e();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new c(), this.a.k);
    }
}