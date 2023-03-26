package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu2 implements Executor {
    public static final Executor s = new uu2();

    private uu2() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}