package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: Subscriber.java */
/* loaded from: classes3.dex */
public interface mq2 {
    <T> void a(Class<T> cls, kq2<? super T> kq2Var);

    <T> void b(Class<T> cls, Executor executor, kq2<? super T> kq2Var);

    <T> void d(Class<T> cls, kq2<? super T> kq2Var);
}