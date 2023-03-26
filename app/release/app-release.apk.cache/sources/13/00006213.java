package com.p7700g.p99005;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p7700g.p99005.i2;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class vn {
    private static final int a = 1;
    private static final int b = 0;
    @k1("mLock")
    private HandlerThread d;
    @k1("mLock")
    private Handler e;
    private final int h;
    private final int i;
    private final String j;
    private final Object c = new Object();
    private Handler.Callback g = new a();
    @k1("mLock")
    private int f = 0;

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                vn.this.c();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                vn.this.d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Callable s;
        public final /* synthetic */ Handler t;
        public final /* synthetic */ d u;

        /* compiled from: SelfDestructiveThread.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Object s;

            public a(Object obj) {
                this.s = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.u.a(this.s);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.s = callable;
            this.t = handler;
            this.u = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.s.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.t.post(new a(obj));
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ AtomicReference s;
        public final /* synthetic */ Callable t;
        public final /* synthetic */ ReentrantLock u;
        public final /* synthetic */ AtomicBoolean v;
        public final /* synthetic */ Condition w;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.s = atomicReference;
            this.t = callable;
            this.u = reentrantLock;
            this.v = atomicBoolean;
            this.w = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.set(this.t.call());
            } catch (Exception unused) {
            }
            this.u.lock();
            try {
                this.v.set(false);
                this.w.signal();
            } finally {
                this.u.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public vn(String str, int i, int i2) {
        this.j = str;
        this.i = i;
        this.h = i2;
    }

    private void e(Runnable runnable) {
        synchronized (this.c) {
            if (this.d == null) {
                HandlerThread handlerThread = new HandlerThread(this.j, this.i);
                this.d = handlerThread;
                handlerThread.start();
                this.e = new Handler(this.d.getLooper(), this.g);
                this.f++;
            }
            this.e.removeMessages(0);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    @r2
    public int a() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    @r2
    public boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.d != null;
        }
        return z;
    }

    public void c() {
        synchronized (this.c) {
            if (this.e.hasMessages(1)) {
                return;
            }
            this.d.quit();
            this.d = null;
            this.e = null;
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.c) {
            this.e.removeMessages(0);
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.h);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, on.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}