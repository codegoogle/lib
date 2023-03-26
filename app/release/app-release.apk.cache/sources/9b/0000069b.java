package com.anythink.core.common.j;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public abstract class a {
    private boolean a;
    private Timer b;

    private boolean c() {
        return this.a;
    }

    public abstract void b();

    public final synchronized void a(long j) {
        this.b = new Timer();
        this.b.schedule(new TimerTask() { // from class: com.anythink.core.common.j.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    if (!a.this.a) {
                        a.this.a = true;
                        a.this.b();
                    }
                }
            }
        }, j);
    }

    public final synchronized void a() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }
}