package com.p7700g.p99005;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq2 implements ThreadFactory {
    public static final /* synthetic */ nq2 a = new nq2();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return uq2.i(runnable);
    }
}