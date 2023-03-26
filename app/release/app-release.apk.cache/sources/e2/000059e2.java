package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class rf0 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@x1 Runnable command) {
        command.run();
    }
}