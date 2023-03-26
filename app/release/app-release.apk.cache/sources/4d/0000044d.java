package com.anythink.basead;

import android.os.SystemClock;
import com.anythink.core.common.b.m;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class d {
    public Timer a;
    public long b;
    public long c;
    public Runnable d;

    public d(long j, Runnable runnable) {
        this.c = j;
        this.d = runnable;
    }

    public final void a() {
        if (this.a != null || this.c < 0) {
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        Timer timer = new Timer();
        this.a = timer;
        timer.schedule(new TimerTask() { // from class: com.anythink.basead.d.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                m.a().a(d.this.d);
            }
        }, this.c);
    }

    public final void b() {
        if (this.a != null) {
            this.c -= SystemClock.elapsedRealtime() - this.b;
            Timer timer = this.a;
            if (timer != null) {
                timer.cancel();
                this.a = null;
            }
        }
    }

    public final void c() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
        }
        this.c = -1L;
    }
}