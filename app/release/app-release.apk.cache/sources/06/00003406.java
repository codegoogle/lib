package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class B {
    private Runnable a = new b();
    private int b;
    public InterfaceC1271c c;
    private com.ironsource.lifecycle.f d;

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC1271c interfaceC1271c = B.this.c;
            if (interfaceC1271c != null) {
                interfaceC1271c.c_();
            }
        }
    }

    public B(int i, InterfaceC1271c interfaceC1271c) {
        this.b = 0;
        this.c = interfaceC1271c;
        this.b = i;
    }

    private boolean b() {
        return this.b > 0;
    }

    public final void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.c();
        this.d = null;
    }

    public final void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.c_();
                return;
            }
            a();
            this.d = new com.ironsource.lifecycle.f(millis, this.a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format("%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}