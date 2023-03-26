package com.ironsource.environment;

import com.microsoft.appcenter.AppCenter;
import java.lang.Thread;

/* loaded from: classes3.dex */
public final class d implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace2) {
            sb.append(stackTraceElement.toString());
            sb.append(AppCenter.PAIR_DELIMITER + System.lineSeparator());
            if (stackTraceElement.toString().contains(e.a().i)) {
                z = true;
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                sb.append(stackTraceElement2.toString());
                sb.append(AppCenter.PAIR_DELIMITER + System.lineSeparator());
                if (stackTraceElement2.toString().contains(e.a().i)) {
                    z = true;
                }
            }
        }
        if (z) {
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(System.currentTimeMillis());
            new c(sb2, sb3.toString(), "Crash").d();
        }
        this.a.uncaughtException(thread, th);
    }
}