package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.ks5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dispatcher.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b?\u0010@J\u001d\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%R \u0010)\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0013\u0010*\u001a\u00020#8G@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010%R.\u00102\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00103\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00104\u001a\u0004\b5\u0010!\"\u0004\b6\u00107R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R \u00109\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R*\u0010:\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00104\u001a\u0004\b;\u0010!\"\u0004\b<\u00107R\u0018\u0010>\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=¨\u0006A"}, d2 = {"Lcom/p7700g/p99005/tq5;", "", "", "host", "Lcom/p7700g/p99005/ks5$a;", "Lcom/p7700g/p99005/ks5;", "f", "(Ljava/lang/String;)Lcom/p7700g/p99005/ks5$a;", "", com.anythink.expressad.d.a.b.dH, "()Z", "T", "Ljava/util/Deque;", "calls", kg.p0, "Lcom/p7700g/p99005/yq4;", com.anythink.basead.d.g.i, "(Ljava/util/Deque;Ljava/lang/Object;)V", "c", "(Lcom/p7700g/p99005/ks5$a;)V", "b", "()V", "d", "(Lcom/p7700g/p99005/ks5;)V", "h", "i", "", "Lcom/p7700g/p99005/hq5;", "n", "()Ljava/util/List;", "p", "", ij3.b, "()I", "q", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "e", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "executorService", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "j", "()Ljava/lang/Runnable;", "r", "(Ljava/lang/Runnable;)V", "idleCallback", "maxRequests", AFHydra.STATUS_IDLE, "k", "s", "(I)V", "runningSyncCalls", "runningAsyncCalls", "maxRequestsPerHost", "l", "t", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class tq5 {
    private int a;
    private int b;
    @Nullable
    private Runnable c;
    private ExecutorService d;
    private final ArrayDeque<ks5.a> e;
    private final ArrayDeque<ks5.a> f;
    private final ArrayDeque<ks5> g;

    public tq5() {
        this.a = 64;
        this.b = 5;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
    }

    private final ks5.a f(String str) {
        Iterator<ks5.a> it = this.f.iterator();
        while (it.hasNext()) {
            ks5.a next = it.next();
            if (c25.g(next.d(), str)) {
                return next;
            }
        }
        Iterator<ks5.a> it2 = this.e.iterator();
        while (it2.hasNext()) {
            ks5.a next2 = it2.next();
            if (c25.g(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void g(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
                yq4 yq4Var = yq4.a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean m() {
        int i;
        boolean z;
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<ks5.a> it = this.e.iterator();
            c25.o(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                ks5.a next = it.next();
                if (this.f.size() >= this.a) {
                    break;
                } else if (next.c().get() < this.b) {
                    it.remove();
                    next.c().incrementAndGet();
                    c25.o(next, "asyncCall");
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = q() > 0;
            yq4 yq4Var = yq4.a;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((ks5.a) arrayList.get(i)).a(e());
        }
        return z;
    }

    @fz4(name = "-deprecated_executorService")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "executorService", imports = {}))
    @NotNull
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        Iterator<ks5.a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b().cancel();
        }
        Iterator<ks5.a> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().b().cancel();
        }
        Iterator<ks5> it3 = this.g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void c(@NotNull ks5.a aVar) {
        ks5.a f;
        c25.p(aVar, kg.p0);
        synchronized (this) {
            this.e.add(aVar);
            if (!aVar.b().u() && (f = f(aVar.d())) != null) {
                aVar.f(f);
            }
            yq4 yq4Var = yq4.a;
        }
        m();
    }

    public final synchronized void d(@NotNull ks5 ks5Var) {
        c25.p(ks5Var, kg.p0);
        this.g.add(ks5Var);
    }

    @fz4(name = "executorService")
    @NotNull
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        if (this.d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, sr5.U(sr5.i + " Dispatcher", false));
        }
        executorService = this.d;
        c25.m(executorService);
        return executorService;
    }

    public final void h(@NotNull ks5.a aVar) {
        c25.p(aVar, kg.p0);
        aVar.c().decrementAndGet();
        g(this.f, aVar);
    }

    public final void i(@NotNull ks5 ks5Var) {
        c25.p(ks5Var, kg.p0);
        g(this.g, ks5Var);
    }

    @Nullable
    public final synchronized Runnable j() {
        return this.c;
    }

    public final synchronized int k() {
        return this.a;
    }

    public final synchronized int l() {
        return this.b;
    }

    @NotNull
    public final synchronized List<hq5> n() {
        List<hq5> unmodifiableList;
        ArrayDeque<ks5.a> arrayDeque = this.e;
        ArrayList arrayList = new ArrayList(ks4.Z(arrayDeque, 10));
        for (ks5.a aVar : arrayDeque) {
            arrayList.add(aVar.b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        c25.o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int o() {
        return this.e.size();
    }

    @NotNull
    public final synchronized List<hq5> p() {
        List<hq5> unmodifiableList;
        ArrayDeque<ks5> arrayDeque = this.g;
        ArrayDeque<ks5.a> arrayDeque2 = this.f;
        ArrayList arrayList = new ArrayList(ks4.Z(arrayDeque2, 10));
        for (ks5.a aVar : arrayDeque2) {
            arrayList.add(aVar.b());
        }
        unmodifiableList = Collections.unmodifiableList(rs4.y4(arrayDeque, arrayList));
        c25.o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int q() {
        return this.f.size() + this.g.size();
    }

    public final synchronized void r(@Nullable Runnable runnable) {
        this.c = runnable;
    }

    public final void s(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.a = i;
                yq4 yq4Var = yq4.a;
            }
            m();
            return;
        }
        throw new IllegalArgumentException(wo1.l("max < 1: ", i).toString());
    }

    public final void t(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.b = i;
                yq4 yq4Var = yq4.a;
            }
            m();
            return;
        }
        throw new IllegalArgumentException(wo1.l("max < 1: ", i).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tq5(@NotNull ExecutorService executorService) {
        this();
        c25.p(executorService, "executorService");
        this.d = executorService;
    }
}