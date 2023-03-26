package com.p7700g.p99005;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes3.dex */
public interface gn2<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}