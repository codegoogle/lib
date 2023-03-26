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

/* compiled from: AbstractResolvableFuture.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class a8<V> implements gn2<V> {
    public static final boolean s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger t = Logger.getLogger(a8.class.getName());
    private static final long u = 1000;
    public static final b v;
    private static final Object w;
    @z1
    public volatile Object x;
    @z1
    public volatile e y;
    @z1
    public volatile i z;

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        public abstract boolean a(a8<?> a8Var, e eVar, e eVar2);

        public abstract boolean b(a8<?> a8Var, Object obj, Object obj2);

        public abstract boolean c(a8<?> a8Var, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c a;
        public static final c b;
        public final boolean c;
        @z1
        public final Throwable d;

        static {
            if (a8.s) {
                b = null;
                a = null;
                return;
            }
            b = new c(false, null);
            a = new c(true, null);
        }

        public c(boolean z, @z1 Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static final d a = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable b;

        /* compiled from: AbstractResolvableFuture.java */
        /* loaded from: classes.dex */
        public static class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.b = (Throwable) a8.e(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class e {
        public static final e a = new e(null, null);
        public final Runnable b;
        public final Executor c;
        @z1
        public e d;

        public e(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<a8, i> c;
        public final AtomicReferenceFieldUpdater<a8, e> d;
        public final AtomicReferenceFieldUpdater<a8, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a8, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a8, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a8, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean a(a8<?> a8Var, e eVar, e eVar2) {
            return this.d.compareAndSet(a8Var, eVar, eVar2);
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean b(a8<?> a8Var, Object obj, Object obj2) {
            return this.e.compareAndSet(a8Var, obj, obj2);
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean c(a8<?> a8Var, i iVar, i iVar2) {
            return this.c.compareAndSet(a8Var, iVar, iVar2);
        }

        @Override // com.p7700g.p99005.a8.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // com.p7700g.p99005.a8.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final a8<V> s;
        public final gn2<? extends V> t;

        public g(a8<V> a8Var, gn2<? extends V> gn2Var) {
            this.s = a8Var;
            this.t = gn2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s.x != this) {
                return;
            }
            if (a8.v.b(this.s, this, a8.j(this.t))) {
                a8.g(this.s);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean a(a8<?> a8Var, e eVar, e eVar2) {
            synchronized (a8Var) {
                if (a8Var.y == eVar) {
                    a8Var.y = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean b(a8<?> a8Var, Object obj, Object obj2) {
            synchronized (a8Var) {
                if (a8Var.x == obj) {
                    a8Var.x = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.a8.b
        public boolean c(a8<?> a8Var, i iVar, i iVar2) {
            synchronized (a8Var) {
                if (a8Var.z == iVar) {
                    a8Var.z = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.p7700g.p99005.a8.b
        public void d(i iVar, i iVar2) {
            iVar.c = iVar2;
        }

        @Override // com.p7700g.p99005.a8.b
        public void e(i iVar, Thread thread) {
            iVar.b = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class i {
        public static final i a = new i(false);
        @z1
        public volatile Thread b;
        @z1
        public volatile i c;

        public i(boolean z) {
        }

        public void a(i iVar) {
            a8.v.d(this, iVar);
        }

        public void b() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a8.v.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a8.class, i.class, "z"), AtomicReferenceFieldUpdater.newUpdater(a8.class, e.class, "y"), AtomicReferenceFieldUpdater.newUpdater(a8.class, Object.class, "x"));
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

    private void b(StringBuilder sb) {
        try {
            Object k = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(k));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static CancellationException d(@z1 String str, @z1 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @x1
    public static <T> T e(@z1 T t2) {
        Objects.requireNonNull(t2);
        return t2;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.y;
        } while (!v.a(this, eVar2, e.a));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.d;
            eVar4.d = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.p7700g.p99005.a8$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.p7700g.p99005.a8<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.p7700g.p99005.a8] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.p7700g.p99005.a8, com.p7700g.p99005.a8<V>] */
    public static void g(a8<?> a8Var) {
        e eVar = null;
        while (true) {
            a8Var.o();
            a8Var.c();
            e f2 = a8Var.f(eVar);
            while (f2 != null) {
                eVar = f2.d;
                Runnable runnable = f2.b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    a8Var = gVar.s;
                    if (a8Var.x == gVar) {
                        if (v.b(a8Var, gVar, j(gVar.t))) {
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

    public static Object j(gn2<?> gn2Var) {
        if (gn2Var instanceof a8) {
            Object obj = ((a8) gn2Var).x;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.c ? cVar.d != null ? new c(false, cVar.d) : c.b : obj;
            }
            return obj;
        }
        boolean isCancelled = gn2Var.isCancelled();
        if ((!s) & isCancelled) {
            return c.b;
        }
        try {
            Object k = k(gn2Var);
            return k == null ? w : k;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + gn2Var, e2));
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

    private void p(i iVar) {
        iVar.b = null;
        while (true) {
            i iVar2 = this.z;
            if (iVar2 == i.a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.c;
                if (iVar2.b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.c = iVar4;
                    if (iVar3.b == null) {
                        break;
                    }
                } else if (!v.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.p7700g.p99005.gn2
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.y;
        if (eVar != e.a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.d = eVar;
                if (v.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.y;
            } while (eVar != e.a);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.x;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = s ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.a : c.b;
        boolean z2 = false;
        a8<V> a8Var = this;
        while (true) {
            if (v.b(a8Var, obj, cVar)) {
                if (z) {
                    a8Var.l();
                }
                g(a8Var);
                if (!(obj instanceof g)) {
                    return true;
                }
                gn2<? extends V> gn2Var = ((g) obj).t;
                if (gn2Var instanceof a8) {
                    a8Var = (a8) gn2Var;
                    obj = a8Var.x;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    gn2Var.cancel(z);
                    return true;
                }
            } else {
                obj = a8Var.x;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
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
            String a8Var = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String t2 = wo1.t(str, " (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(wo1.u(str, " for ", a8Var));
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

    public final void m(@z1 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(u());
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

    public boolean q(@z1 V v2) {
        if (v2 == null) {
            v2 = (V) w;
        }
        if (v.b(this, null, v2)) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean r(Throwable th) {
        if (v.b(this, null, new d((Throwable) e(th)))) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean s(gn2<? extends V> gn2Var) {
        d dVar;
        e(gn2Var);
        Object obj = this.x;
        if (obj == null) {
            if (gn2Var.isDone()) {
                if (v.b(this, null, j(gn2Var))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, gn2Var);
            if (v.b(this, null, gVar)) {
                try {
                    gn2Var.a(gVar, c8.INSTANCE);
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
            gn2Var.cancel(((c) obj).c);
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