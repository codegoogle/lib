package com.microsoft.appcenter.crashes;

import com.microsoft.appcenter.utils.ShutdownHelper;
import com.p7700g.p99005.r2;
import java.lang.Thread;

/* loaded from: classes3.dex */
public class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler mDefaultUncaughtExceptionHandler;
    private boolean mIgnoreDefaultExceptionHandler = false;

    @r2
    public Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        return this.mDefaultUncaughtExceptionHandler;
    }

    public void register() {
        if (!this.mIgnoreDefaultExceptionHandler) {
            this.mDefaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        } else {
            this.mDefaultUncaughtExceptionHandler = null;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @r2
    public void setIgnoreDefaultExceptionHandler(boolean z) {
        this.mIgnoreDefaultExceptionHandler = z;
        if (z) {
            this.mDefaultUncaughtExceptionHandler = null;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Crashes.getInstance().saveUncaughtException(thread, th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultUncaughtExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            ShutdownHelper.shutdown(10);
        }
    }

    public void unregister() {
        Thread.setDefaultUncaughtExceptionHandler(this.mDefaultUncaughtExceptionHandler);
    }
}