package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes3.dex */
public final class b extends IronSourceLogger {
    public LogListener c;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ IronSourceLogger.IronSourceTag t;
        private /* synthetic */ int u;

        public a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.s = str;
            this.t = ironSourceTag;
            this.u = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.c == null || this.s == null) {
                return;
            }
            b.this.c.onLog(this.t, this.s, this.u);
        }
    }

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i) {
        super("publisher", 1);
        this.c = null;
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        com.ironsource.environment.e.c.a.b(new a(str, ironSourceTag, i));
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}