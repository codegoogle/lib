package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncTimeout.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b(\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"Lcom/p7700g/p99005/qv5;", "Lcom/p7700g/p99005/zw5;", "", "now", bx.B4, "(J)J", "Lcom/p7700g/p99005/yq4;", "x", "()V", "", "y", "()Z", "D", "Lcom/p7700g/p99005/vw5;", "sink", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/vw5;)Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/xw5;", rs2.f.b, "C", "(Lcom/p7700g/p99005/xw5;)Lcom/p7700g/p99005/xw5;", "T", "Lkotlin/Function0;", "block", "E", "(Lcom/p7700g/p99005/uz4;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "r", "(Ljava/io/IOException;)Ljava/io/IOException;", "z", "k", "Z", "inQueue", com.anythink.expressad.d.a.b.dH, "J", "timeoutAt", "l", "Lcom/p7700g/p99005/qv5;", "next", "<init>", "j", "a", "b", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public class qv5 extends zw5 {
    private static final int f = 65536;
    private static final long g;
    private static final long h;
    private static qv5 i;
    @NotNull
    public static final a j = new a(null);
    private boolean k;
    private qv5 l;
    private long m;

    /* compiled from: AsyncTimeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"com/p7700g/p99005/qv5$a", "", "Lcom/p7700g/p99005/qv5;", "node", "", "timeoutNanos", "", "hasDeadline", "Lcom/p7700g/p99005/yq4;", "e", "(Lcom/p7700g/p99005/qv5;JZ)V", "d", "(Lcom/p7700g/p99005/qv5;)Z", "c", "()Lcom/p7700g/p99005/qv5;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", AFHydra.STATUS_IDLE, "head", "Lcom/p7700g/p99005/qv5;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(qv5 qv5Var) {
            synchronized (qv5.class) {
                if (qv5Var.k) {
                    qv5Var.k = false;
                    for (qv5 qv5Var2 = qv5.i; qv5Var2 != null; qv5Var2 = qv5Var2.l) {
                        if (qv5Var2.l == qv5Var) {
                            qv5Var2.l = qv5Var.l;
                            qv5Var.l = null;
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(qv5 qv5Var, long j, boolean z) {
            synchronized (qv5.class) {
                if (!qv5Var.k) {
                    qv5Var.k = true;
                    if (qv5.i == null) {
                        qv5.i = new qv5();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i != 0 && z) {
                        qv5Var.m = Math.min(j, qv5Var.d() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        qv5Var.m = j + nanoTime;
                    } else if (z) {
                        qv5Var.m = qv5Var.d();
                    } else {
                        throw new AssertionError();
                    }
                    long A = qv5Var.A(nanoTime);
                    qv5 qv5Var2 = qv5.i;
                    c25.m(qv5Var2);
                    while (qv5Var2.l != null) {
                        qv5 qv5Var3 = qv5Var2.l;
                        c25.m(qv5Var3);
                        if (A < qv5Var3.A(nanoTime)) {
                            break;
                        }
                        qv5Var2 = qv5Var2.l;
                        c25.m(qv5Var2);
                    }
                    qv5Var.l = qv5Var2.l;
                    qv5Var2.l = qv5Var;
                    if (qv5Var2 == qv5.i) {
                        qv5.class.notify();
                    }
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        @Nullable
        public final qv5 c() throws InterruptedException {
            qv5 qv5Var = qv5.i;
            c25.m(qv5Var);
            qv5 qv5Var2 = qv5Var.l;
            if (qv5Var2 != null) {
                long A = qv5Var2.A(System.nanoTime());
                if (A <= 0) {
                    qv5 qv5Var3 = qv5.i;
                    c25.m(qv5Var3);
                    qv5Var3.l = qv5Var2.l;
                    qv5Var2.l = null;
                    return qv5Var2;
                }
                long j = A / 1000000;
                qv5.class.wait(j, (int) (A - (1000000 * j)));
                return null;
            }
            long nanoTime = System.nanoTime();
            qv5.class.wait(qv5.g);
            qv5 qv5Var4 = qv5.i;
            c25.m(qv5Var4);
            if (qv5Var4.l != null || System.nanoTime() - nanoTime < qv5.h) {
                return null;
            }
            return qv5.i;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p7700g/p99005/qv5$b", "Ljava/lang/Thread;", "Lcom/p7700g/p99005/yq4;", "run", "()V", "<init>", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            qv5 c;
            while (true) {
                try {
                    synchronized (qv5.class) {
                        c = qv5.j.c();
                        if (c == qv5.i) {
                            qv5.i = null;
                            return;
                        }
                        yq4 yq4Var = yq4.a;
                    }
                    if (c != null) {
                        c.D();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/qv5$c", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/qv5;", "a", "()Lcom/p7700g/p99005/qv5;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class c implements vw5 {
        public final /* synthetic */ vw5 t;

        public c(vw5 vw5Var) {
            this.t = vw5Var;
        }

        @Override // com.p7700g.p99005.vw5
        @NotNull
        /* renamed from: a */
        public qv5 timeout() {
            return qv5.this;
        }

        @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            qv5 qv5Var = qv5.this;
            qv5Var.x();
            try {
                this.t.close();
                yq4 yq4Var = yq4.a;
                if (qv5Var.y()) {
                    throw qv5Var.r(null);
                }
            } catch (IOException e) {
                if (!qv5Var.y()) {
                    throw e;
                }
                throw qv5Var.r(e);
            } finally {
                qv5Var.y();
            }
        }

        @Override // com.p7700g.p99005.vw5, java.io.Flushable
        public void flush() {
            qv5 qv5Var = qv5.this;
            qv5Var.x();
            try {
                this.t.flush();
                yq4 yq4Var = yq4.a;
                if (qv5Var.y()) {
                    throw qv5Var.r(null);
                }
            } catch (IOException e) {
                if (!qv5Var.y()) {
                    throw e;
                }
                throw qv5Var.r(e);
            } finally {
                qv5Var.y();
            }
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("AsyncTimeout.sink(");
            G.append(this.t);
            G.append(')');
            return G.toString();
        }

        @Override // com.p7700g.p99005.vw5
        public void write(@NotNull sv5 sv5Var, long j) {
            c25.p(sv5Var, rs2.f.b);
            pv5.e(sv5Var.z2(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                sw5 sw5Var = sv5Var.s;
                c25.m(sw5Var);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += sw5Var.f - sw5Var.e;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                    }
                }
                qv5 qv5Var = qv5.this;
                qv5Var.x();
                try {
                    this.t.write(sv5Var, j2);
                    yq4 yq4Var = yq4.a;
                    if (qv5Var.y()) {
                        throw qv5Var.r(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!qv5Var.y()) {
                        throw e;
                    }
                    throw qv5Var.r(e);
                } finally {
                    qv5Var.y();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/qv5$d", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/qv5;", "a", "()Lcom/p7700g/p99005/qv5;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class d implements xw5 {
        public final /* synthetic */ xw5 t;

        public d(xw5 xw5Var) {
            this.t = xw5Var;
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        /* renamed from: a */
        public qv5 timeout() {
            return qv5.this;
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            qv5 qv5Var = qv5.this;
            qv5Var.x();
            try {
                this.t.close();
                yq4 yq4Var = yq4.a;
                if (qv5Var.y()) {
                    throw qv5Var.r(null);
                }
            } catch (IOException e) {
                if (!qv5Var.y()) {
                    throw e;
                }
                throw qv5Var.r(e);
            } finally {
                qv5Var.y();
            }
        }

        @Override // com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) {
            c25.p(sv5Var, "sink");
            qv5 qv5Var = qv5.this;
            qv5Var.x();
            try {
                long read = this.t.read(sv5Var, j);
                if (qv5Var.y()) {
                    throw qv5Var.r(null);
                }
                return read;
            } catch (IOException e) {
                if (qv5Var.y()) {
                    throw qv5Var.r(e);
                }
                throw e;
            } finally {
                qv5Var.y();
            }
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("AsyncTimeout.source(");
            G.append(this.t);
            G.append(')');
            return G.toString();
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        g = millis;
        h = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A(long j2) {
        return this.m - j2;
    }

    @NotNull
    public final vw5 B(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        return new c(vw5Var);
    }

    @NotNull
    public final xw5 C(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        return new d(xw5Var);
    }

    public void D() {
    }

    public final <T> T E(@NotNull uz4<? extends T> uz4Var) {
        c25.p(uz4Var, "block");
        x();
        try {
            try {
                T x = uz4Var.x();
                z15.d(1);
                if (y()) {
                    throw r(null);
                }
                z15.c(1);
                return x;
            } catch (IOException e) {
                if (y()) {
                    throw r(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            z15.d(1);
            y();
            z15.c(1);
            throw th;
        }
    }

    @np4
    @NotNull
    public final IOException r(@Nullable IOException iOException) {
        return z(iOException);
    }

    public final void x() {
        long j2 = j();
        boolean f2 = f();
        if (j2 != 0 || f2) {
            j.e(this, j2, f2);
        }
    }

    public final boolean y() {
        return j.d(this);
    }

    @NotNull
    public IOException z(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}