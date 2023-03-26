package com.p7700g.p99005;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.i2;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i5 extends j5 {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new a());
    @z1
    private volatile Handler c;

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        private static final String a = "arch_disk_io_%d";
        private final AtomicInteger b = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(a, Integer.valueOf(this.b.getAndIncrement())));
            return thread;
        }
    }

    private static Handler e(@x1 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // com.p7700g.p99005.j5
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // com.p7700g.p99005.j5
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // com.p7700g.p99005.j5
    public void d(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = e(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}