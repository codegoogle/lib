package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: ProxyExecutor.java */
/* loaded from: classes.dex */
public class h41 implements Executor {
    @x1
    private Executor s;

    public h41(@x1 Executor executor) {
        this.s = executor;
    }

    public void a(@x1 Executor executor) {
        this.s = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@x1 Runnable runnable) {
        this.s.execute(runnable);
    }
}