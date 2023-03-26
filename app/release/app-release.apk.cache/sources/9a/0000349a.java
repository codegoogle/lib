package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.ai;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class c {
    public com.ironsource.mediationsdk.adunit.c.b.a a;
    public ai b;
    private Timer c;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            c.this.b.e();
        }
    }

    public c(com.ironsource.mediationsdk.adunit.c.b.a aVar, ai aiVar) {
        this.a = aVar;
        this.b = aiVar;
    }

    private void c() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final void a() {
        com.ironsource.mediationsdk.adunit.c.b.a aVar = this.a;
        if (aVar.a != a.EnumC0116a.MANUAL) {
            b(aVar.c);
        }
    }

    public final void b() {
        if (this.a.a != a.EnumC0116a.MANUAL) {
            b(0L);
        }
    }

    public void b(long j) {
        c();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new a(), j);
    }
}