package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.ks5;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealConnectionPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001'\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ5\u0010\u0015\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+¨\u00064"}, d2 = {"Lcom/p7700g/p99005/ns5;", "", "Lcom/p7700g/p99005/ls5;", "connection", "", "now", "", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/ls5;J)I", "f", "()I", "d", "Lcom/p7700g/p99005/dq5;", "address", "Lcom/p7700g/p99005/ks5;", kg.p0, "", "Lcom/p7700g/p99005/lr5;", "routes", "", "requireMultiplexed", "a", "(Lcom/p7700g/p99005/dq5;Lcom/p7700g/p99005/ks5;Ljava/util/List;Z)Z", "Lcom/p7700g/p99005/yq4;", "h", "(Lcom/p7700g/p99005/ls5;)V", "c", "(Lcom/p7700g/p99005/ls5;)Z", "e", "()V", "b", "(J)J", AFHydra.STATUS_IDLE, "maxIdleConnections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "J", "keepAliveDurationNs", "com/p7700g/p99005/ns5$b", "Lcom/p7700g/p99005/ns5$b;", "cleanupTask", "Lcom/p7700g/p99005/es5;", "Lcom/p7700g/p99005/es5;", "cleanupQueue", "Lcom/p7700g/p99005/fs5;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lcom/p7700g/p99005/fs5;IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ns5 {
    public static final a a = new a(null);
    private final long b;
    private final es5 c;
    private final b d;
    private final ConcurrentLinkedQueue<ls5> e;
    private final int f;

    /* compiled from: RealConnectionPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/ns5$a", "", "Lcom/p7700g/p99005/nq5;", "connectionPool", "Lcom/p7700g/p99005/ns5;", "a", "(Lcom/p7700g/p99005/nq5;)Lcom/p7700g/p99005/ns5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final ns5 a(@NotNull nq5 nq5Var) {
            c25.p(nq5Var, "connectionPool");
            return nq5Var.c();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/ns5$b", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b extends cs5 {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            return ns5.this.b(System.nanoTime());
        }
    }

    public ns5(@NotNull fs5 fs5Var, int i, long j, @NotNull TimeUnit timeUnit) {
        c25.p(fs5Var, "taskRunner");
        c25.p(timeUnit, "timeUnit");
        this.f = i;
        this.b = timeUnit.toNanos(j);
        this.c = fs5Var.j();
        this.d = new b(wo1.C(new StringBuilder(), sr5.i, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue<>();
        if (!(j > 0)) {
            throw new IllegalArgumentException(wo1.p("keepAliveDuration <= 0: ", j).toString());
        }
    }

    private final int g(ls5 ls5Var, long j) {
        if (sr5.h && !Thread.holdsLock(ls5Var)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(ls5Var);
            throw new AssertionError(G.toString());
        }
        List<Reference<ks5>> u = ls5Var.u();
        int i = 0;
        while (i < u.size()) {
            Reference<ks5> reference = u.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder G2 = wo1.G("A connection to ");
                G2.append(ls5Var.b().d().w());
                G2.append(" was leaked. ");
                G2.append("Did you forget to close a response body?");
                au5.e.g().o(G2.toString(), ((ks5.b) reference).a());
                u.remove(i);
                ls5Var.J(true);
                if (u.isEmpty()) {
                    ls5Var.I(j - this.b);
                    return 0;
                }
            }
        }
        return u.size();
    }

    public final boolean a(@NotNull dq5 dq5Var, @NotNull ks5 ks5Var, @Nullable List<lr5> list, boolean z) {
        c25.p(dq5Var, "address");
        c25.p(ks5Var, kg.p0);
        Iterator<ls5> it = this.e.iterator();
        while (it.hasNext()) {
            ls5 next = it.next();
            c25.o(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.C()) {
                        yq4 yq4Var = yq4.a;
                    }
                }
                if (next.A(dq5Var, list)) {
                    ks5Var.c(next);
                    return true;
                }
                yq4 yq4Var2 = yq4.a;
            }
        }
        return false;
    }

    public final long b(long j) {
        Iterator<ls5> it = this.e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        ls5 ls5Var = null;
        int i2 = 0;
        while (it.hasNext()) {
            ls5 next = it.next();
            c25.o(next, "connection");
            synchronized (next) {
                if (g(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long w = j - next.w();
                    if (w > j2) {
                        yq4 yq4Var = yq4.a;
                        ls5Var = next;
                        j2 = w;
                    } else {
                        yq4 yq4Var2 = yq4.a;
                    }
                }
            }
        }
        long j3 = this.b;
        if (j2 < j3 && i <= this.f) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        c25.m(ls5Var);
        synchronized (ls5Var) {
            if (!ls5Var.u().isEmpty()) {
                return 0L;
            }
            if (ls5Var.w() + j2 != j) {
                return 0L;
            }
            ls5Var.J(true);
            this.e.remove(ls5Var);
            sr5.n(ls5Var.d());
            if (this.e.isEmpty()) {
                this.c.a();
            }
            return 0L;
        }
    }

    public final boolean c(@NotNull ls5 ls5Var) {
        c25.p(ls5Var, "connection");
        if (sr5.h && !Thread.holdsLock(ls5Var)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(ls5Var);
            throw new AssertionError(G.toString());
        } else if (!ls5Var.x() && this.f != 0) {
            es5.p(this.c, this.d, 0L, 2, null);
            return false;
        } else {
            ls5Var.J(true);
            this.e.remove(ls5Var);
            if (this.e.isEmpty()) {
                this.c.a();
                return true;
            }
            return true;
        }
    }

    public final int d() {
        return this.e.size();
    }

    public final void e() {
        Socket socket;
        Iterator<ls5> it = this.e.iterator();
        c25.o(it, "connections.iterator()");
        while (it.hasNext()) {
            ls5 next = it.next();
            c25.o(next, "connection");
            synchronized (next) {
                if (next.u().isEmpty()) {
                    it.remove();
                    next.J(true);
                    socket = next.d();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                sr5.n(socket);
            }
        }
        if (this.e.isEmpty()) {
            this.c.a();
        }
    }

    public final int f() {
        boolean isEmpty;
        ConcurrentLinkedQueue<ls5> concurrentLinkedQueue = this.e;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (ls5 ls5Var : concurrentLinkedQueue) {
                c25.o(ls5Var, "it");
                synchronized (ls5Var) {
                    isEmpty = ls5Var.u().isEmpty();
                }
                if (isEmpty && (i = i + 1) < 0) {
                    js4.W();
                }
            }
        }
        return i;
    }

    public final void h(@NotNull ls5 ls5Var) {
        c25.p(ls5Var, "connection");
        if (sr5.h && !Thread.holdsLock(ls5Var)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(ls5Var);
            throw new AssertionError(G.toString());
        }
        this.e.add(ls5Var);
        es5.p(this.c, this.d, 0L, 2, null);
    }
}