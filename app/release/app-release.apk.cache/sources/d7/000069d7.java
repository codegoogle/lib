package com.p7700g.p99005;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes2.dex */
public final class zs1 {
    private final Map<String, a> a = new HashMap();
    private final b b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes2.dex */
    public static class a {
        public final Lock a = new ReentrantLock();
        public int b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes2.dex */
    public static class b {
        private static final int a = 10;
        private final Queue<a> b = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.b) {
                poll = this.b.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void b(a aVar) {
            synchronized (this.b) {
                if (this.b.size() < 10) {
                    this.b.offer(aVar);
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.a.get(str);
            if (aVar == null) {
                aVar = this.b.a();
                this.a.put(str, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) x02.d(this.a.get(str));
            int i = aVar.b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a remove = this.a.remove(str);
                    if (remove.equals(aVar)) {
                        this.b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
            }
        }
        aVar.a.unlock();
    }
}