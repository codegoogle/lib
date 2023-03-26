package com.ironsource.mediationsdk.b;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public abstract class a<T> {
    private Timer a;
    private long b;
    public T c;

    /* renamed from: com.ironsource.mediationsdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0118a extends TimerTask {
        public C0118a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a.this.a();
        }
    }

    public a(long j) {
        this.b = j;
    }

    public abstract void a();

    public final void b(T t) {
        if ((this.b <= 0) || t == null) {
            return;
        }
        this.c = t;
        e();
        Timer timer = new Timer();
        this.a = timer;
        timer.schedule(new C0118a(), this.b);
    }

    public final void c() {
        this.c = null;
    }

    public final void e() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
        }
    }
}