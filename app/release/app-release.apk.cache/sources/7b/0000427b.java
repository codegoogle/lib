package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* loaded from: classes2.dex */
public class fj1 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@x1 Runnable runnable) {
        runnable.run();
    }
}