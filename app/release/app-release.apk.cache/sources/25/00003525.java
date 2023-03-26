package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1281o {
    private static C1281o a;
    private long b = 0;
    private boolean c = false;
    public int d;

    /* renamed from: com.ironsource.mediationsdk.o$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ IronSourceBannerLayout s;
        private /* synthetic */ IronSourceError t;
        private /* synthetic */ boolean u;

        public a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
            this.s = ironSourceBannerLayout;
            this.t = ironSourceError;
            this.u = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1281o.this.b(this.s, this.t, this.u);
        }
    }

    private C1281o() {
    }

    public static synchronized C1281o a() {
        C1281o c1281o;
        synchronized (C1281o.class) {
            if (a == null) {
                a = new C1281o();
            }
            c1281o = a;
        }
        return c1281o;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        a(ironSourceBannerLayout, ironSourceError, false);
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
        synchronized (this) {
            if (this.c) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            int i = this.d;
            if (currentTimeMillis > i * 1000) {
                b(ironSourceBannerLayout, ironSourceError, z);
                return;
            }
            this.c = true;
            long j = (i * 1000) - currentTimeMillis;
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("delaying callback by " + j);
            com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.a;
            com.ironsource.environment.e.c.b(new a(ironSourceBannerLayout, ironSourceError, z), j);
        }
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
        if (ironSourceBannerLayout != null) {
            this.b = System.currentTimeMillis();
            this.c = false;
            ironSourceBannerLayout.e(ironSourceError, z);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        return z;
    }
}