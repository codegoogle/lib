package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class f implements c {
    private String a = "INTERNAL";
    private Timer b;
    private boolean c;
    private Long d;
    private long e;
    public Runnable f;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            f.this.f.run();
        }
    }

    public f(long j, Runnable runnable, boolean z) {
        this.e = j;
        this.f = runnable;
        this.c = false;
        this.d = null;
        if (0 == 0) {
            this.c = true;
            d.a().a(this);
            this.d = Long.valueOf(System.currentTimeMillis() + this.e);
            if (d.a().b()) {
                return;
            }
            d();
        }
    }

    private void d() {
        if (this.b == null) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.e);
            Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    private void e() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        Long l;
        if (this.b == null && (l = this.d) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.e = longValue;
            if (longValue > 0) {
                d();
                return;
            }
            c();
            this.f.run();
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        if (this.b != null) {
            e();
        }
    }

    public final void c() {
        e();
        this.c = false;
        this.d = null;
        d a2 = d.a();
        if (a2.A.contains(this)) {
            a2.A.remove(this);
        }
    }
}