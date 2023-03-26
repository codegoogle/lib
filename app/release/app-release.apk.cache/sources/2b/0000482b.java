package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.i2;

/* compiled from: DefaultRunnableScheduler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ic0 implements bc0 {
    private final Handler a;

    public ic0() {
        this.a = sm.a(Looper.getMainLooper());
    }

    @Override // com.p7700g.p99005.bc0
    public void a(long delayInMillis, @x1 Runnable runnable) {
        this.a.postDelayed(runnable, delayInMillis);
    }

    @Override // com.p7700g.p99005.bc0
    public void b(@x1 Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @x1
    public Handler c() {
        return this.a;
    }

    @r2
    public ic0(@x1 Handler handler) {
        this.a = handler;
    }
}