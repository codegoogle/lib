package com.p7700g.p99005;

import com.p7700g.p99005.ts1;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes2.dex */
public abstract class ks1<T extends ts1> {
    private static final int a = 20;
    private final Queue<T> b = z02.f(20);

    public abstract T a();

    public T b() {
        T poll = this.b.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.b.size() < 20) {
            this.b.offer(t);
        }
    }
}