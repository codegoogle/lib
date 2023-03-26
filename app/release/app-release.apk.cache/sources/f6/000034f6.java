package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public final class a extends IronSourceLogger {
    private a() {
        super("console");
    }

    public a(int i) {
        super("console", 0);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder("UIThread: ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        sb2.append(" ");
        sb2.toString();
        if (i == 0) {
            sb = new StringBuilder("ironSourceSDK: ");
        } else if (i == 1) {
            sb = new StringBuilder("ironSourceSDK: ");
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            String str2 = "ironSourceSDK: " + ironSourceTag;
            return;
        } else {
            sb = new StringBuilder("ironSourceSDK: ");
        }
        sb.append(ironSourceTag);
        sb.toString();
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder L = wo1.L(str, ":stacktrace[");
        L.append(Log.getStackTraceString(th));
        L.append("]");
        log(ironSourceTag, L.toString(), 3);
    }
}