package com.anythink.expressad.foundation.g.h;

import com.p7700g.p99005.x1;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a {
    public static ThreadPoolExecutor a;
    private static ThreadPoolExecutor b;
    private static ThreadPoolExecutor c;

    public static ThreadPoolExecutor a() {
        if (a == null) {
            a = new ThreadPoolExecutor(5, 10, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@x1 Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return a;
    }

    public static ThreadPoolExecutor b() {
        if (c == null) {
            c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@x1 Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return c;
    }

    private static ThreadPoolExecutor c() {
        if (b == null) {
            b = new ThreadPoolExecutor(5, 200, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@x1 Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return b;
    }
}