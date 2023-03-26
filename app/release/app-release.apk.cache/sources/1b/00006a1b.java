package com.p7700g.p99005;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Timeout.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b%\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Lcom/p7700g/p99005/zw5;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/zw5;", "j", "()J", "", "f", "()Z", "d", "deadlineNanoTime", "e", "(J)Lcom/p7700g/p99005/zw5;", "duration", "c", "b", "()Lcom/p7700g/p99005/zw5;", "a", "Lcom/p7700g/p99005/yq4;", "h", "()V", "monitor", "k", "(Ljava/lang/Object;)V", "other", "Lkotlin/Function0;", "block", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/zw5;Lcom/p7700g/p99005/uz4;)V", "J", "timeoutNanos", "Z", "hasDeadline", "<init>", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public class zw5 {
    private boolean c;
    private long d;
    private long e;
    @NotNull
    public static final b b = new b(null);
    @cz4
    @NotNull
    public static final zw5 a = new a();

    /* compiled from: Timeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/zw5$a", "Lcom/p7700g/p99005/zw5;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/zw5;", "deadlineNanoTime", "e", "(J)Lcom/p7700g/p99005/zw5;", "Lcom/p7700g/p99005/yq4;", "h", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a extends zw5 {
        @Override // com.p7700g.p99005.zw5
        @NotNull
        public zw5 e(long j) {
            return this;
        }

        @Override // com.p7700g.p99005.zw5
        public void h() {
        }

        @Override // com.p7700g.p99005.zw5
        @NotNull
        public zw5 i(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/p7700g/p99005/zw5$b", "", "", "aNanos", "bNanos", "a", "(JJ)J", "Lcom/p7700g/p99005/zw5;", "NONE", "Lcom/p7700g/p99005/zw5;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final long a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public zw5 a() {
        this.c = false;
        return this;
    }

    @NotNull
    public zw5 b() {
        this.e = 0L;
        return this;
    }

    @NotNull
    public final zw5 c(long j, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        if (j > 0) {
            return e(timeUnit.toNanos(j) + System.nanoTime());
        }
        throw new IllegalArgumentException(wo1.p("duration <= 0: ", j).toString());
    }

    public long d() {
        if (this.c) {
            return this.d;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @NotNull
    public zw5 e(long j) {
        this.c = true;
        this.d = j;
        return this;
    }

    public boolean f() {
        return this.c;
    }

    public final void g(@NotNull zw5 zw5Var, @NotNull uz4<yq4> uz4Var) {
        c25.p(zw5Var, "other");
        c25.p(uz4Var, "block");
        long j = j();
        long a2 = b.a(zw5Var.j(), j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(a2, timeUnit);
        if (f()) {
            long d = d();
            if (zw5Var.f()) {
                e(Math.min(d(), zw5Var.d()));
            }
            try {
                uz4Var.x();
                z15.d(1);
                i(j, timeUnit);
                if (zw5Var.f()) {
                    e(d);
                }
                z15.c(1);
                return;
            } catch (Throwable th) {
                z15.d(1);
                i(j, TimeUnit.NANOSECONDS);
                if (zw5Var.f()) {
                    e(d);
                }
                z15.c(1);
                throw th;
            }
        }
        if (zw5Var.f()) {
            e(zw5Var.d());
        }
        try {
            uz4Var.x();
            z15.d(1);
            i(j, timeUnit);
            if (zw5Var.f()) {
                a();
            }
            z15.c(1);
        } catch (Throwable th2) {
            z15.d(1);
            i(j, TimeUnit.NANOSECONDS);
            if (zw5Var.f()) {
                a();
            }
            z15.c(1);
            throw th2;
        }
    }

    public void h() throws IOException {
        Thread currentThread = Thread.currentThread();
        c25.o(currentThread, "Thread.currentThread()");
        if (!currentThread.isInterrupted()) {
            if (this.c && this.d - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @NotNull
    public zw5 i(long j, @NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "unit");
        if (j >= 0) {
            this.e = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(wo1.p("timeout < 0: ", j).toString());
    }

    public long j() {
        return this.e;
    }

    public final void k(@NotNull Object obj) throws InterruptedIOException {
        c25.p(obj, "monitor");
        try {
            boolean f = f();
            long j = j();
            long j2 = 0;
            if (!f && j == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f && j != 0) {
                j = Math.min(j, d() - nanoTime);
            } else if (f) {
                j = d() - nanoTime;
            }
            if (j > 0) {
                long j3 = j / 1000000;
                Long.signum(j3);
                obj.wait(j3, (int) (j - (1000000 * j3)));
                j2 = System.nanoTime() - nanoTime;
            }
            if (j2 >= j) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}