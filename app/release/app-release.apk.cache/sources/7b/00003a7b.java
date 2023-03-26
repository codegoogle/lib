package com.p7700g.p99005;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class b8 {

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public Object a;
        public d<T> b;
        private d8<Void> c = d8.v();
        private boolean d;

        private void e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void a(@x1 Runnable runnable, @x1 Executor executor) {
            d8<Void> d8Var = this.c;
            if (d8Var != null) {
                d8Var.a(runnable, executor);
            }
        }

        public void b() {
            this.a = null;
            this.b = null;
            this.c.q(null);
        }

        public boolean c(T t) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.c(t)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public boolean d() {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.b(true)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public boolean f(@x1 Throwable th) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.d(th)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public void finalize() {
            d8<Void> d8Var;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                StringBuilder G = wo1.G("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                G.append(this.a);
                dVar.d(new b(G.toString()));
            }
            if (this.d || (d8Var = this.c) == null) {
                return;
            }
            d8Var.q(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        @z1
        Object a(@x1 a<T> aVar) throws Exception;
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements gn2<T> {
        public final WeakReference<a<T>> s;
        private final a8<T> t = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* loaded from: classes.dex */
        public class a extends a8<T> {
            public a() {
            }

            @Override // com.p7700g.p99005.a8
            public String n() {
                a<T> aVar = d.this.s.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder G = wo1.G("tag=[");
                G.append(aVar.a);
                G.append("]");
                return G.toString();
            }
        }

        public d(a<T> aVar) {
            this.s = new WeakReference<>(aVar);
        }

        @Override // com.p7700g.p99005.gn2
        public void a(@x1 Runnable runnable, @x1 Executor executor) {
            this.t.a(runnable, executor);
        }

        public boolean b(boolean z) {
            return this.t.cancel(z);
        }

        public boolean c(T t) {
            return this.t.q(t);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.s.get();
            boolean cancel = this.t.cancel(z);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        public boolean d(Throwable th) {
            return this.t.r(th);
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.t.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.t.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.t.isDone();
        }

        public String toString() {
            return this.t.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @x1 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.t.get(j, timeUnit);
        }
    }

    private b8() {
    }

    @x1
    public static <T> gn2<T> a(@x1 c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object a2 = cVar.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
            }
        } catch (Exception e) {
            dVar.d(e);
        }
        return dVar;
    }
}