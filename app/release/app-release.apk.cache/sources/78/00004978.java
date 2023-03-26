package com.p7700g.p99005;

import java.lang.Thread;

/* compiled from: SafeRunnable.java */
/* loaded from: classes4.dex */
public abstract class iy5 implements Runnable {
    public final ox5 s;

    public iy5(ox5 ox5Var) {
        this.s = ox5Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.s.y()) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}