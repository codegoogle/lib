package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public enum yf0 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}