package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class xf0<V> implements gn2<V> {
    public static final boolean s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger t = Logger.getLogger(xf0.class.getName());
    private static final long u = 1000;
    public static final b v;
    private static final Object w;
    @z1
    public volatile Object x;
    @z1
    public volatile e y;
    @z1
    public volatile i z;

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        public abstract boolean a(xf0<?> future, e expect, e update);

        public abstract boolean b(xf0<?> future, Object expect, Object update);

        public abstract boolean c(xf0<?> future, i expect, i update);

        public abstract void d(i waiter, i newValue);

        public abstract void e(i waiter, Thread newValue);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c a;
        public static final c b;
        public final boolean c;
        @z1
        public final Throwable d;

        static {
            if (xf0.s) {
                b = null;
                a = null;
                return;
            }
            b = new c(false, null);
            a = new c(true, null);
        }

        public c(boolean wasInterrupted, @z1 Throwable cause) {
            this.c = wasInterrupted;
            this.d = cause;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static final d a = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable b;

        /* compiled from: AbstractFuture.java */
        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.b = (Throwable) xf0.e(exception);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {
        public static final e a = new e(null, null);
        public final Runnable b;
        public final Executor c;
        @z1
        public e d;

        public e(Runnable task, Executor executor) {
            this.b = task;
            this.c = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<xf0, i> c;
        public final AtomicReferenceFieldUpdater<xf0, e> d;
        public final AtomicReferenceFieldUpdater<xf0, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<xf0, i> waitersUpdater, AtomicReferenceFieldUpdater<xf0, e> listenersUpdater, AtomicReferenceFieldUpdater<xf0, Object> valueUpdater) {
            super();
            this.a = waiterThreadUpdater;
            this.b = waiterNextUpdater;
            this.c = waitersUpdater;
            this.d = listenersUpdater;
            this.e = valueUpdater;
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean a(xf0<?> future, e expect, e update) {
            return this.d.compareAndSet(future, expect, update);
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean b(xf0<?> future, Object expect, Object update) {
            return this.e.compareAndSet(future, expect, update);
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean c(xf0<?> future, i expect, i update) {
            return this.c.compareAndSet(future, expect, update);
        }

        @Override // com.p7700g.p99005.xf0.b
        public void d(i waiter, i newValue) {
            this.b.lazySet(waiter, newValue);
        }

        @Override // com.p7700g.p99005.xf0.b
        public void e(i waiter, Thread newValue) {
            this.a.lazySet(waiter, newValue);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final xf0<V> s;
        public final gn2<? extends V> t;

        public g(xf0<V> owner, gn2<? extends V> future) {
            this.s = owner;
            this.t = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s.x != this) {
                return;
            }
            if (xf0.v.b(this.s, this, xf0.j(this.t))) {
                xf0.g(this.s);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean a(xf0<?> future, e expect, e update) {
            synchronized (future) {
                if (future.y == expect) {
                    future.y = update;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean b(xf0<?> future, Object expect, Object update) {
            synchronized (future) {
                if (future.x == expect) {
                    future.x = update;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.xf0.b
        public boolean c(xf0<?> future, i expect, i update) {
            synchronized (future) {
                if (future.z == expect) {
                    future.z = update;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.xf0.b
        public void d(i waiter, i newValue) {
            waiter.c = newValue;
        }

        @Override // com.p7700g.p99005.xf0.b
        public void e(i waiter, Thread newValue) {
            waiter.b = newValue;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i {
        public static final i a = new i(false);
        @z1
        public volatile Thread b;
        @z1
        public volatile i c;

        public i(boolean unused) {
        }

        public void a(i next) {
            xf0.v.d(this, next);
        }

        public void b() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            xf0.v.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(xf0.class, i.class, "z"), AtomicReferenceFieldUpdater.newUpdater(xf0.class, e.class, "y"), AtomicReferenceFieldUpdater.newUpdater(xf0.class, Object.class, "x"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        v = hVar;
        if (th != null) {
            t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        w = new Object();
    }

    private void b(StringBuilder builder) {
        try {
            Object k = k(this);
            builder.append("SUCCESS, result=[");
            builder.append(t(k));
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e2) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e2.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            builder.append("FAILURE, cause=[");
            builder.append(e3.getCause());
            builder.append("]");
        }
    }

    private static CancellationException d(@z1 String message, @z1 Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @x1
    public static <T> T e(@z1 T reference) {
        Objects.requireNonNull(reference);
        return reference;
    }

    private e f(e onto) {
        e eVar;
        do {
            eVar = this.y;
        } while (!v.a(this, eVar, e.a));
        e eVar2 = onto;
        e eVar3 = eVar;
        while (eVar3 != null) {
            e eVar4 = eVar3.d;
            eVar3.d = eVar2;
            eVar2 = eVar3;
            eVar3 = eVar4;
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.p7700g.p99005.xf0$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.p7700g.p99005.xf0<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.p7700g.p99005.xf0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.p7700g.p99005.xf0, com.p7700g.p99005.xf0<V>] */
    public static void g(xf0<?> future) {
        e eVar = null;
        while (true) {
            future.o();
            future.c();
            e f2 = future.f(eVar);
            while (f2 != null) {
                eVar = f2.d;
                Runnable runnable = f2.b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    future = gVar.s;
                    if (future.x == gVar) {
                        if (v.b(future, gVar, j(gVar.t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f2.c);
                }
                f2 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = t;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == w) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).b);
        }
        throw d("Task was cancelled.", ((c) obj).d);
    }

    public static Object j(gn2<?> future) {
        if (future instanceof xf0) {
            Object obj = ((xf0) future).x;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.c ? cVar.d != null ? new c(false, cVar.d) : c.b : obj;
            }
            return obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!s) & isCancelled) {
            return c.b;
        }
        try {
            Object k = k(future);
            return k == null ? w : k;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) throws ExecutionException {
        V v2;
        boolean z = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.z;
        } while (!v.c(this, iVar, i.a));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.c;
        }
    }

    private void p(i node) {
        node.b = null;
        while (true) {
            i iVar = this.z;
            if (iVar == i.a) {
                return;
            }
            i iVar2 = null;
            while (iVar != null) {
                i iVar3 = iVar.c;
                if (iVar.b != null) {
                    iVar2 = iVar;
                } else if (iVar2 != null) {
                    iVar2.c = iVar3;
                    if (iVar2.b == null) {
                        break;
                    }
                } else if (!v.c(this, iVar, iVar3)) {
                    break;
                }
                iVar = iVar3;
            }
            return;
        }
    }

    private String t(Object o) {
        return o == this ? "this future" : String.valueOf(o);
    }

    @Override // com.p7700g.p99005.gn2
    public final void a(Runnable listener, Executor executor) {
        e(listener);
        e(executor);
        e eVar = this.y;
        if (eVar != e.a) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.d = eVar;
                if (v.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.y;
            } while (eVar != e.a);
            h(listener, executor);
        }
        h(listener, executor);
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.x;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (s) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else if (mayInterruptIfRunning) {
            cVar = c.a;
        } else {
            cVar = c.b;
        }
        boolean z = false;
        xf0<V> xf0Var = this;
        while (true) {
            if (v.b(xf0Var, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    xf0Var.l();
                }
                g(xf0Var);
                if (!(obj instanceof g)) {
                    return true;
                }
                gn2<? extends V> gn2Var = ((g) obj).t;
                if (gn2Var instanceof xf0) {
                    xf0Var = (xf0) gn2Var;
                    obj = xf0Var.x;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z = true;
                } else {
                    gn2Var.cancel(mayInterruptIfRunning);
                    return true;
                }
            } else {
                obj = xf0Var.x;
                if (!(obj instanceof g)) {
                    return z;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = unit.toNanos(timeout);
        if (!Thread.interrupted()) {
            Object obj = this.x;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.z;
                if (iVar != i.a) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (v.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.x;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(iVar2);
                        } else {
                            iVar = this.z;
                        }
                    } while (iVar != i.a);
                    return i(this.x);
                }
                return i(this.x);
            }
            while (nanos > 0) {
                Object obj3 = this.x;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String xf0Var = toString();
            String lowerCase = unit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + timeout + " " + unit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String t2 = wo1.t(str, " (plus ");
                long j = -nanos;
                long convert = unit.convert(j, TimeUnit.NANOSECONDS);
                long nanos2 = j - unit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = t2 + convert + " " + lowerCase;
                    if (z) {
                        str2 = wo1.t(str2, ",");
                    }
                    t2 = wo1.t(str2, " ");
                }
                if (z) {
                    t2 = t2 + nanos2 + " nanoseconds ";
                }
                str = wo1.t(t2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(wo1.t(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(wo1.u(str, " for ", xf0Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.x instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.x;
        return (!(obj instanceof g)) & (obj != null);
    }

    public void l() {
    }

    public final void m(@z1 Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(u());
        }
    }

    @z1
    public String n() {
        Object obj = this.x;
        if (obj instanceof g) {
            return wo1.C(wo1.G("setFuture=["), t(((g) obj).t), "]");
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder G = wo1.G("remaining delay=[");
            G.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            G.append(" ms]");
            return G.toString();
        }
        return null;
    }

    public boolean q(@z1 V value) {
        if (value == null) {
            value = (V) w;
        }
        if (v.b(this, null, value)) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean r(Throwable throwable) {
        if (v.b(this, null, new d((Throwable) e(throwable)))) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean s(gn2<? extends V> future) {
        d dVar;
        e(future);
        Object obj = this.x;
        if (obj == null) {
            if (future.isDone()) {
                if (v.b(this, null, j(future))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, future);
            if (v.b(this, null, gVar)) {
                try {
                    future.a(gVar, yf0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.a;
                    }
                    v.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.x;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).c);
        }
        return false;
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                sb = n();
            } catch (RuntimeException e2) {
                StringBuilder G = wo1.G("Exception thrown from implementation: ");
                G.append(e2.getClass());
                sb = G.toString();
            }
            if (sb != null && !sb.isEmpty()) {
                wo1.g0(sb2, "PENDING, info=[", sb, "]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u() {
        Object obj = this.x;
        return (obj instanceof c) && ((c) obj).c;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.x;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.z;
            if (iVar != i.a) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (v.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.x;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.z;
                } while (iVar != i.a);
                return i(this.x);
            }
            return i(this.x);
        }
        throw new InterruptedException();
    }
}