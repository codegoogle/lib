package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: TaskExecutor.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class j5 {
    public abstract void a(@x1 Runnable runnable);

    public void b(@x1 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@x1 Runnable runnable);
}