package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaskQueue.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b>\u0010?J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\u00020 8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020)8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100R$\u00106\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u00102\u001a\u0004\b!\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b&\u0010\u001d\"\u0004\b8\u00100R\"\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Lcom/p7700g/p99005/es5;", "", "Lcom/p7700g/p99005/cs5;", "task", "", "delayNanos", "Lcom/p7700g/p99005/yq4;", "n", "(Lcom/p7700g/p99005/cs5;J)V", "", "name", "Lkotlin/Function0;", "block", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;JLcom/p7700g/p99005/uz4;)V", "", "cancelable", "c", "(Ljava/lang/String;JZLcom/p7700g/p99005/uz4;)V", "Ljava/util/concurrent/CountDownLatch;", "l", "()Ljava/util/concurrent/CountDownLatch;", "recurrence", "q", "(Lcom/p7700g/p99005/cs5;JZ)Z", "a", "()V", "u", "b", "()Z", "toString", "()Ljava/lang/String;", "Lcom/p7700g/p99005/fs5;", "e", "Lcom/p7700g/p99005/fs5;", "k", "()Lcom/p7700g/p99005/fs5;", "taskRunner", "f", "Ljava/lang/String;", "h", "", "i", "()Ljava/util/List;", "scheduledTasks", "Z", "j", "t", "(Z)V", "shutdown", "Lcom/p7700g/p99005/cs5;", "()Lcom/p7700g/p99005/cs5;", "r", "(Lcom/p7700g/p99005/cs5;)V", "activeTask", "d", "s", "cancelActiveTask", "", "Ljava/util/List;", com.anythink.basead.d.g.i, "futureTasks", "<init>", "(Lcom/p7700g/p99005/fs5;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class es5 {
    private boolean a;
    @Nullable
    private cs5 b;
    @NotNull
    private final List<cs5> c;
    private boolean d;
    @NotNull
    private final fs5 e;
    @NotNull
    private final String f;

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/p7700g/p99005/es5$a", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "Ljava/util/concurrent/CountDownLatch;", "e", "Ljava/util/concurrent/CountDownLatch;", "i", "()Ljava/util/concurrent/CountDownLatch;", "latch", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a extends cs5 {
        @NotNull
        private final CountDownLatch e;

        public a() {
            super(wo1.C(new StringBuilder(), sr5.i, " awaitIdle"), false);
            this.e = new CountDownLatch(1);
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            this.e.countDown();
            return -1L;
        }

        @NotNull
        public final CountDownLatch i() {
            return this.e;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/es5$b", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b extends cs5 {
        public final /* synthetic */ uz4 e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uz4 uz4Var, String str, boolean z, String str2, boolean z2) {
            super(str2, z2);
            this.e = uz4Var;
            this.f = str;
            this.g = z;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            this.e.x();
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/es5$c", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c extends cs5 {
        public final /* synthetic */ uz4 e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(uz4 uz4Var, String str, String str2) {
            super(str2, false, 2, null);
            this.e = uz4Var;
            this.f = str;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            return ((Number) this.e.x()).longValue();
        }
    }

    public es5(@NotNull fs5 fs5Var, @NotNull String str) {
        c25.p(fs5Var, "taskRunner");
        c25.p(str, "name");
        this.e = fs5Var;
        this.f = str;
        this.c = new ArrayList();
    }

    public static /* synthetic */ void d(es5 es5Var, String str, long j, boolean z, uz4 uz4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z2 = (i & 4) != 0 ? true : z;
        c25.p(str, "name");
        c25.p(uz4Var, "block");
        es5Var.n(new b(uz4Var, str, z2, str, z2), j);
    }

    public static /* synthetic */ void o(es5 es5Var, String str, long j, uz4 uz4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c25.p(str, "name");
        c25.p(uz4Var, "block");
        es5Var.n(new c(uz4Var, str, str), j);
    }

    public static /* synthetic */ void p(es5 es5Var, cs5 cs5Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        es5Var.n(cs5Var, j);
    }

    public final void a() {
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this.e) {
            if (b()) {
                this.e.i(this);
            }
            yq4 yq4Var = yq4.a;
        }
    }

    public final boolean b() {
        cs5 cs5Var = this.b;
        if (cs5Var != null) {
            c25.m(cs5Var);
            if (cs5Var.a()) {
                this.d = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).a()) {
                cs5 cs5Var2 = this.c.get(size);
                if (fs5.c.a().isLoggable(Level.FINE)) {
                    ds5.c(cs5Var2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(@NotNull String str, long j, boolean z, @NotNull uz4<yq4> uz4Var) {
        c25.p(str, "name");
        c25.p(uz4Var, "block");
        n(new b(uz4Var, str, z, str, z), j);
    }

    @Nullable
    public final cs5 e() {
        return this.b;
    }

    public final boolean f() {
        return this.d;
    }

    @NotNull
    public final List<cs5> g() {
        return this.c;
    }

    @NotNull
    public final String h() {
        return this.f;
    }

    @NotNull
    public final List<cs5> i() {
        List<cs5> Q5;
        synchronized (this.e) {
            Q5 = rs4.Q5(this.c);
        }
        return Q5;
    }

    public final boolean j() {
        return this.a;
    }

    @NotNull
    public final fs5 k() {
        return this.e;
    }

    @NotNull
    public final CountDownLatch l() {
        synchronized (this.e) {
            if (this.b == null && this.c.isEmpty()) {
                return new CountDownLatch(0);
            }
            cs5 cs5Var = this.b;
            if (cs5Var instanceof a) {
                return ((a) cs5Var).i();
            }
            for (cs5 cs5Var2 : this.c) {
                if (cs5Var2 instanceof a) {
                    return ((a) cs5Var2).i();
                }
            }
            a aVar = new a();
            if (q(aVar, 0L, false)) {
                this.e.i(this);
            }
            return aVar.i();
        }
    }

    public final void m(@NotNull String str, long j, @NotNull uz4<Long> uz4Var) {
        c25.p(str, "name");
        c25.p(uz4Var, "block");
        n(new c(uz4Var, str, str), j);
    }

    public final void n(@NotNull cs5 cs5Var, long j) {
        c25.p(cs5Var, "task");
        synchronized (this.e) {
            if (this.a) {
                if (cs5Var.a()) {
                    if (fs5.c.a().isLoggable(Level.FINE)) {
                        ds5.c(cs5Var, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (fs5.c.a().isLoggable(Level.FINE)) {
                    ds5.c(cs5Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (q(cs5Var, j, false)) {
                this.e.i(this);
            }
            yq4 yq4Var = yq4.a;
        }
    }

    public final boolean q(@NotNull cs5 cs5Var, long j, boolean z) {
        String sb;
        c25.p(cs5Var, "task");
        cs5Var.e(this);
        long nanoTime = this.e.h().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.c.indexOf(cs5Var);
        if (indexOf != -1) {
            if (cs5Var.c() <= j2) {
                if (fs5.c.a().isLoggable(Level.FINE)) {
                    ds5.c(cs5Var, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(indexOf);
        }
        cs5Var.g(j2);
        if (fs5.c.a().isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder G = wo1.G("run again after ");
                G.append(ds5.b(j2 - nanoTime));
                sb = G.toString();
            } else {
                StringBuilder G2 = wo1.G("scheduled after ");
                G2.append(ds5.b(j2 - nanoTime));
                sb = G2.toString();
            }
            ds5.c(cs5Var, this, sb);
        }
        Iterator<cs5> it = this.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().c() - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.c.size();
        }
        this.c.add(i, cs5Var);
        return i == 0;
    }

    public final void r(@Nullable cs5 cs5Var) {
        this.b = cs5Var;
    }

    public final void s(boolean z) {
        this.d = z;
    }

    public final void t(boolean z) {
        this.a = z;
    }

    @NotNull
    public String toString() {
        return this.f;
    }

    public final void u() {
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.i(this);
            }
            yq4 yq4Var = yq4.a;
        }
    }
}