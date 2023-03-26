package com.p7700g.p99005;

import android.os.SystemClock;
import com.p7700g.p99005.v43;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFuture.java */
/* loaded from: classes3.dex */
public class p53<T> implements Future<T>, v43.b<T>, v43.a {
    private t43<?> s;
    private boolean t = false;
    private T u;
    private b53 v;

    private p53() {
    }

    private synchronized T c(Long timeoutMs) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.v == null) {
            if (this.t) {
                return this.u;
            }
            if (timeoutMs == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (timeoutMs.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = timeoutMs.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.v == null) {
                if (this.t) {
                    return this.u;
                }
                throw new TimeoutException();
            }
            throw new ExecutionException(this.v);
        }
        throw new ExecutionException(this.v);
    }

    public static <E> p53<E> d() {
        return new p53<>();
    }

    @Override // com.p7700g.p99005.v43.a
    public synchronized void b(b53 error) {
        this.v = error;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean mayInterruptIfRunning) {
        if (this.s == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.s.c();
        return true;
    }

    public void e(t43<?> request) {
        this.s = request;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        t43<?> t43Var = this.s;
        if (t43Var == null) {
            return false;
        }
        return t43Var.F();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.t && this.v == null) {
            z = isCancelled();
        }
        return z;
    }

    @Override // com.p7700g.p99005.v43.b
    public synchronized void onResponse(T response) {
        this.t = true;
        this.u = response;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return c(Long.valueOf(TimeUnit.MILLISECONDS.convert(timeout, unit)));
    }
}