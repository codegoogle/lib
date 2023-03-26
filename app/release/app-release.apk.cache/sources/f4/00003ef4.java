package com.p7700g.p99005;

import android.os.Handler;
import android.os.HandlerThread;
import com.p7700g.p99005.jm3;

/* compiled from: OSTimeoutHandler.java */
/* loaded from: classes3.dex */
public class dm3 extends HandlerThread {
    private static final String s = dm3.class.getCanonicalName();
    private static final Object t = new Object();
    private static dm3 u;
    private final Handler v;

    private dm3() {
        super(s);
        start();
        this.v = new Handler(getLooper());
    }

    public static dm3 b() {
        if (u == null) {
            synchronized (t) {
                if (u == null) {
                    u = new dm3();
                }
            }
        }
        return u;
    }

    public void a(Runnable runnable) {
        synchronized (t) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "Running destroyTimeout with runnable: " + runnable.toString());
            this.v.removeCallbacks(runnable);
        }
    }

    public void c(long j, @x1 Runnable runnable) {
        synchronized (t) {
            a(runnable);
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "Running startTimeout with timeout: " + j + " and runnable: " + runnable.toString());
            this.v.postDelayed(runnable, j);
        }
    }
}