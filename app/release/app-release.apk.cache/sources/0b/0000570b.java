package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Pipe.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b3\u00104J-\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00028G@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\"\u0010\u001e\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000bR\u0019\u0010%\u001a\u00020\u000e8G@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\"\u0010)\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010.\u001a\u00020*8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u001c\u00102\u001a\u00020/8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\"\u00101¨\u00065"}, d2 = {"Lcom/p7700g/p99005/pw5;", "", "Lcom/p7700g/p99005/vw5;", "Lkotlin/Function1;", "Lcom/p7700g/p99005/yq4;", "Lcom/p7700g/p99005/ho4;", "block", "f", "(Lcom/p7700g/p99005/vw5;Lcom/p7700g/p99005/f05;)V", "sink", "e", "(Lcom/p7700g/p99005/vw5;)V", "a", "()Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/xw5;", "b", "()Lcom/p7700g/p99005/xw5;", "d", "()V", "", "Z", "l", "()Z", "p", "(Z)V", "sourceClosed", "Lcom/p7700g/p99005/vw5;", "q", "h", com.anythink.expressad.d.a.b.dH, "canceled", "i", "n", "foldedSink", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/xw5;", "r", rs2.f.b, "c", "k", ij3.b, "sinkClosed", "", "J", "j", "()J", "maxBufferSize", "Lcom/p7700g/p99005/sv5;", "Lcom/p7700g/p99005/sv5;", "()Lcom/p7700g/p99005/sv5;", "buffer", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class pw5 {
    @NotNull
    private final sv5 a = new sv5();
    private boolean b;
    private boolean c;
    private boolean d;
    @Nullable
    private vw5 e;
    @NotNull
    private final vw5 f;
    @NotNull
    private final xw5 g;
    private final long h;

    /* compiled from: Pipe.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/pw5$a", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "s", "Lcom/p7700g/p99005/zw5;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a implements vw5 {
        private final zw5 s = new zw5();

        public a() {
        }

        @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (pw5.this.g()) {
                if (pw5.this.k()) {
                    return;
                }
                vw5 i = pw5.this.i();
                if (i == null) {
                    if (pw5.this.l() && pw5.this.g().z2() > 0) {
                        throw new IOException("source is closed");
                    }
                    pw5.this.o(true);
                    sv5 g = pw5.this.g();
                    if (g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    g.notifyAll();
                    i = null;
                }
                yq4 yq4Var = yq4.a;
                if (i != null) {
                    pw5 pw5Var = pw5.this;
                    zw5 timeout = i.timeout();
                    zw5 timeout2 = pw5Var.q().timeout();
                    long j = timeout.j();
                    long a = zw5.b.a(timeout2.j(), timeout.j());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.i(a, timeUnit);
                    if (timeout.f()) {
                        long d = timeout.d();
                        if (timeout2.f()) {
                            timeout.e(Math.min(timeout.d(), timeout2.d()));
                        }
                        try {
                            i.close();
                            timeout.i(j, timeUnit);
                            if (timeout2.f()) {
                                timeout.e(d);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.i(j, TimeUnit.NANOSECONDS);
                            if (timeout2.f()) {
                                timeout.e(d);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.f()) {
                        timeout.e(timeout2.d());
                    }
                    try {
                        i.close();
                        timeout.i(j, timeUnit);
                        if (timeout2.f()) {
                            timeout.a();
                        }
                    } catch (Throwable th2) {
                        timeout.i(j, TimeUnit.NANOSECONDS);
                        if (timeout2.f()) {
                            timeout.a();
                        }
                        throw th2;
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.vw5, java.io.Flushable
        public void flush() {
            vw5 i;
            synchronized (pw5.this.g()) {
                if (!pw5.this.k()) {
                    if (!pw5.this.h()) {
                        i = pw5.this.i();
                        if (i == null) {
                            if (pw5.this.l() && pw5.this.g().z2() > 0) {
                                throw new IOException("source is closed");
                            }
                            i = null;
                        }
                        yq4 yq4Var = yq4.a;
                    } else {
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("closed".toString());
                }
            }
            if (i != null) {
                pw5 pw5Var = pw5.this;
                zw5 timeout = i.timeout();
                zw5 timeout2 = pw5Var.q().timeout();
                long j = timeout.j();
                long a = zw5.b.a(timeout2.j(), timeout.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.i(a, timeUnit);
                if (timeout.f()) {
                    long d = timeout.d();
                    if (timeout2.f()) {
                        timeout.e(Math.min(timeout.d(), timeout2.d()));
                    }
                    try {
                        i.flush();
                        timeout.i(j, timeUnit);
                        if (timeout2.f()) {
                            timeout.e(d);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        timeout.i(j, TimeUnit.NANOSECONDS);
                        if (timeout2.f()) {
                            timeout.e(d);
                        }
                        throw th;
                    }
                }
                if (timeout2.f()) {
                    timeout.e(timeout2.d());
                }
                try {
                    i.flush();
                    timeout.i(j, timeUnit);
                    if (timeout2.f()) {
                        timeout.a();
                    }
                } catch (Throwable th2) {
                    timeout.i(j, TimeUnit.NANOSECONDS);
                    if (timeout2.f()) {
                        timeout.a();
                    }
                    throw th2;
                }
            }
        }

        @Override // com.p7700g.p99005.vw5
        @NotNull
        public zw5 timeout() {
            return this.s;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
            r1 = com.p7700g.p99005.yq4.a;
         */
        @Override // com.p7700g.p99005.vw5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void write(@NotNull sv5 sv5Var, long j) {
            vw5 vw5Var;
            c25.p(sv5Var, rs2.f.b);
            synchronized (pw5.this.g()) {
                if (!pw5.this.k()) {
                    if (!pw5.this.h()) {
                        while (true) {
                            if (j <= 0) {
                                vw5Var = null;
                                break;
                            }
                            vw5Var = pw5.this.i();
                            if (vw5Var != null) {
                                break;
                            } else if (!pw5.this.l()) {
                                long j2 = pw5.this.j() - pw5.this.g().z2();
                                if (j2 == 0) {
                                    this.s.k(pw5.this.g());
                                    if (pw5.this.h()) {
                                        throw new IOException("canceled");
                                    }
                                } else {
                                    long min = Math.min(j2, j);
                                    pw5.this.g().write(sv5Var, min);
                                    j -= min;
                                    sv5 g = pw5.this.g();
                                    if (g == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    g.notifyAll();
                                }
                            } else {
                                throw new IOException("source is closed");
                            }
                        }
                    } else {
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("closed".toString());
                }
            }
            if (vw5Var != null) {
                pw5 pw5Var = pw5.this;
                zw5 timeout = vw5Var.timeout();
                zw5 timeout2 = pw5Var.q().timeout();
                long j3 = timeout.j();
                long a = zw5.b.a(timeout2.j(), timeout.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.i(a, timeUnit);
                if (timeout.f()) {
                    long d = timeout.d();
                    if (timeout2.f()) {
                        timeout.e(Math.min(timeout.d(), timeout2.d()));
                    }
                    try {
                        vw5Var.write(sv5Var, j);
                        timeout.i(j3, timeUnit);
                        if (timeout2.f()) {
                            timeout.e(d);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        timeout.i(j3, TimeUnit.NANOSECONDS);
                        if (timeout2.f()) {
                            timeout.e(d);
                        }
                        throw th;
                    }
                }
                if (timeout2.f()) {
                    timeout.e(timeout2.d());
                }
                try {
                    vw5Var.write(sv5Var, j);
                    timeout.i(j3, timeUnit);
                    if (timeout2.f()) {
                        timeout.a();
                    }
                } catch (Throwable th2) {
                    timeout.i(j3, TimeUnit.NANOSECONDS);
                    if (timeout2.f()) {
                        timeout.a();
                    }
                    throw th2;
                }
            }
        }
    }

    /* compiled from: Pipe.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/pw5$b", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "s", "Lcom/p7700g/p99005/zw5;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class b implements xw5 {
        private final zw5 s = new zw5();

        public b() {
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (pw5.this.g()) {
                pw5.this.p(true);
                sv5 g = pw5.this.g();
                if (g != null) {
                    g.notifyAll();
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
        }

        @Override // com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) {
            c25.p(sv5Var, "sink");
            synchronized (pw5.this.g()) {
                if (!pw5.this.l()) {
                    if (!pw5.this.h()) {
                        while (pw5.this.g().z2() == 0) {
                            if (pw5.this.k()) {
                                return -1L;
                            }
                            this.s.k(pw5.this.g());
                            if (pw5.this.h()) {
                                throw new IOException("canceled");
                            }
                        }
                        long read = pw5.this.g().read(sv5Var, j);
                        sv5 g = pw5.this.g();
                        if (g != null) {
                            g.notifyAll();
                            return read;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    throw new IOException("canceled");
                }
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        public zw5 timeout() {
            return this.s;
        }
    }

    public pw5(long j) {
        this.h = j;
        if (j >= 1) {
            this.f = new a();
            this.g = new b();
            return;
        }
        throw new IllegalArgumentException(wo1.p("maxBufferSize < 1: ", j).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(vw5 vw5Var, f05<? super vw5, yq4> f05Var) {
        zw5 timeout = vw5Var.timeout();
        zw5 timeout2 = q().timeout();
        long j = timeout.j();
        long a2 = zw5.b.a(timeout2.j(), timeout.j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.i(a2, timeUnit);
        if (timeout.f()) {
            long d = timeout.d();
            if (timeout2.f()) {
                timeout.e(Math.min(timeout.d(), timeout2.d()));
            }
            try {
                f05Var.M(vw5Var);
                z15.d(1);
                timeout.i(j, timeUnit);
                if (timeout2.f()) {
                    timeout.e(d);
                }
                z15.c(1);
                return;
            } catch (Throwable th) {
                z15.d(1);
                timeout.i(j, TimeUnit.NANOSECONDS);
                if (timeout2.f()) {
                    timeout.e(d);
                }
                z15.c(1);
                throw th;
            }
        }
        if (timeout2.f()) {
            timeout.e(timeout2.d());
        }
        try {
            f05Var.M(vw5Var);
            z15.d(1);
            timeout.i(j, timeUnit);
            if (timeout2.f()) {
                timeout.a();
            }
            z15.c(1);
        } catch (Throwable th2) {
            z15.d(1);
            timeout.i(j, TimeUnit.NANOSECONDS);
            if (timeout2.f()) {
                timeout.a();
            }
            z15.c(1);
            throw th2;
        }
    }

    @fz4(name = "-deprecated_sink")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "sink", imports = {}))
    @NotNull
    public final vw5 a() {
        return this.f;
    }

    @fz4(name = "-deprecated_source")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = rs2.f.b, imports = {}))
    @NotNull
    public final xw5 b() {
        return this.g;
    }

    public final void d() {
        synchronized (this.a) {
            this.b = true;
            this.a.d();
            sv5 sv5Var = this.a;
            if (sv5Var != null) {
                sv5Var.notifyAll();
                yq4 yq4Var = yq4.a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    public final void e(@NotNull vw5 vw5Var) throws IOException {
        boolean z;
        sv5 sv5Var;
        c25.p(vw5Var, "sink");
        while (true) {
            synchronized (this.a) {
                if (this.e == null) {
                    if (!this.b) {
                        if (this.a.f0()) {
                            this.d = true;
                            this.e = vw5Var;
                            return;
                        }
                        z = this.c;
                        sv5Var = new sv5();
                        sv5 sv5Var2 = this.a;
                        sv5Var.write(sv5Var2, sv5Var2.z2());
                        sv5 sv5Var3 = this.a;
                        if (sv5Var3 != null) {
                            sv5Var3.notifyAll();
                            yq4 yq4Var = yq4.a;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                    } else {
                        this.e = vw5Var;
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("sink already folded".toString());
                }
            }
            try {
                vw5Var.write(sv5Var, sv5Var.z2());
                if (z) {
                    vw5Var.close();
                } else {
                    vw5Var.flush();
                }
            } catch (Throwable th) {
                synchronized (this.a) {
                    this.d = true;
                    sv5 sv5Var4 = this.a;
                    if (sv5Var4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    sv5Var4.notifyAll();
                    yq4 yq4Var2 = yq4.a;
                    throw th;
                }
            }
        }
    }

    @NotNull
    public final sv5 g() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    @Nullable
    public final vw5 i() {
        return this.e;
    }

    public final long j() {
        return this.h;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.d;
    }

    public final void m(boolean z) {
        this.b = z;
    }

    public final void n(@Nullable vw5 vw5Var) {
        this.e = vw5Var;
    }

    public final void o(boolean z) {
        this.c = z;
    }

    public final void p(boolean z) {
        this.d = z;
    }

    @fz4(name = "sink")
    @NotNull
    public final vw5 q() {
        return this.f;
    }

    @fz4(name = rs2.f.b)
    @NotNull
    public final xw5 r() {
        return this.g;
    }
}