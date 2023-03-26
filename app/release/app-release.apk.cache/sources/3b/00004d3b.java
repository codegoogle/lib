package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealCall.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t*\u0001l\u0018\u00002\u00020\u0001:\u0002yzB\u001f\u0012\u0006\u0010h\u001a\u00020d\u0012\u0006\u0010k\u001a\u00020\u0018\u0012\u0006\u0010I\u001a\u00020\u001c¢\u0006\u0004\bw\u0010xJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010!J\u001d\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J;\u00108\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b:\u0010\bJ\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0002¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u001cH\u0000¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u001c¢\u0006\u0004\bB\u0010\u001eJ\u000f\u0010\u0006\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0006\u0010\u0012R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0019\u0010I\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010\u001eR\u0016\u0010J\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010GR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR(\u00102\u001a\u0004\u0018\u0001012\b\u0010O\u001a\u0004\u0018\u0001018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR(\u0010V\u001a\u0004\u0018\u00010.2\b\u0010O\u001a\u0004\u0018\u00010.8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010T\u001a\u0004\bL\u0010UR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010GR\u0016\u0010Y\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010GR\u0016\u0010Z\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010GR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010c\u001a\u00020_8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b`\u0010bR\u0019\u0010h\u001a\u00020d8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010e\u001a\u0004\bf\u0010gR\u0019\u0010k\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bP\u0010\u001aR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010mR$\u0010p\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010Q\u001a\u0004\bo\u0010S\"\u0004\bi\u00104R\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u00105\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010T¨\u0006{"}, d2 = {"Lcom/p7700g/p99005/ks5;", "Lcom/p7700g/p99005/hq5;", "Lcom/p7700g/p99005/yq4;", "e", "()V", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "M", "Lcom/p7700g/p99005/zq5;", "url", "Lcom/p7700g/p99005/dq5;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/zq5;)Lcom/p7700g/p99005/dq5;", "", "N", "()Ljava/lang/String;", "Lcom/p7700g/p99005/qv5;", "J", "()Lcom/p7700g/p99005/qv5;", "f", "()Lcom/p7700g/p99005/ks5;", "Lcom/p7700g/p99005/hr5;", "x0", "()Lcom/p7700g/p99005/hr5;", com.anythink.expressad.d.a.b.dO, "", "c1", "()Z", "Lcom/p7700g/p99005/jr5;", "w0", "()Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/iq5;", "responseCallback", "D1", "(Lcom/p7700g/p99005/iq5;)V", "X0", bx.B4, "request", "newExchangeFinder", "h", "(Lcom/p7700g/p99005/hr5;Z)V", "Lcom/p7700g/p99005/xs5;", "chain", "Lcom/p7700g/p99005/is5;", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/xs5;)Lcom/p7700g/p99005/is5;", "Lcom/p7700g/p99005/ls5;", "connection", "c", "(Lcom/p7700g/p99005/ls5;)V", "exchange", "requestDone", "responseDone", "C", "(Lcom/p7700g/p99005/is5;ZZLjava/io/IOException;)Ljava/io/IOException;", "D", "Ljava/net/Socket;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Ljava/net/Socket;", "L", "closeExchange", "i", "(Z)V", "H", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.sdk.controller.v.a, "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Z", "u", "forWebSocket", "expectMoreExchanges", "Lcom/p7700g/p99005/js5;", "x", "Lcom/p7700g/p99005/js5;", "exchangeFinder", "<set-?>", "y", "Lcom/p7700g/p99005/ls5;", ij3.b, "()Lcom/p7700g/p99005/ls5;", "Lcom/p7700g/p99005/is5;", "()Lcom/p7700g/p99005/is5;", "interceptorScopedExchange", "requestBodyOpen", "z", "timeoutEarlyExit", "responseBodyOpen", "Lcom/p7700g/p99005/ns5;", "s", "Lcom/p7700g/p99005/ns5;", "connectionPool", "Lcom/p7700g/p99005/vq5;", "t", "Lcom/p7700g/p99005/vq5;", "()Lcom/p7700g/p99005/vq5;", "eventListener", "Lcom/p7700g/p99005/fr5;", "Lcom/p7700g/p99005/fr5;", "n", "()Lcom/p7700g/p99005/fr5;", m31.a, AFHydra.STATUS_IDLE, "Lcom/p7700g/p99005/hr5;", "originalRequest", "com/p7700g/p99005/ks5$c", "Lcom/p7700g/p99005/ks5$c;", "timeout", "p", "connectionToCancel", "canceled", "", "w", "Ljava/lang/Object;", "callStackTrace", "F", "<init>", "(Lcom/p7700g/p99005/fr5;Lcom/p7700g/p99005/hr5;Z)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ks5 implements hq5 {
    @Nullable
    private is5 A;
    private boolean B;
    private boolean C;
    private boolean D;
    private volatile boolean E;
    private volatile is5 F;
    @Nullable
    private volatile ls5 G;
    @NotNull
    private final fr5 H;
    @NotNull
    private final hr5 I;
    private final boolean J;
    private final ns5 s;
    @NotNull
    private final vq5 t;
    private final c u;
    private final AtomicBoolean v;
    private Object w;
    private js5 x;
    @Nullable
    private ls5 y;
    private boolean z;

    /* compiled from: RealCall.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0018\u001a\u00020\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u00020\u00198F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"com/p7700g/p99005/ks5$a", "Ljava/lang/Runnable;", "Lcom/p7700g/p99005/ks5$a;", "Lcom/p7700g/p99005/ks5;", "other", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/ks5$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "b", "()Lcom/p7700g/p99005/ks5;", kg.p0, "Lcom/p7700g/p99005/iq5;", "t", "Lcom/p7700g/p99005/iq5;", "responseCallback", "", "d", "()Ljava/lang/String;", "host", "Lcom/p7700g/p99005/hr5;", "e", "()Lcom/p7700g/p99005/hr5;", "request", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "s", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "<init>", "(Lcom/p7700g/p99005/ks5;Lcom/p7700g/p99005/iq5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class a implements Runnable {
        @NotNull
        private volatile AtomicInteger s;
        private final iq5 t;
        public final /* synthetic */ ks5 u;

        public a(@NotNull ks5 ks5Var, iq5 iq5Var) {
            c25.p(iq5Var, "responseCallback");
            this.u = ks5Var;
            this.t = iq5Var;
            this.s = new AtomicInteger(0);
        }

        public final void a(@NotNull ExecutorService executorService) {
            c25.p(executorService, "executorService");
            tq5 c0 = this.u.n().c0();
            if (sr5.h && Thread.holdsLock(c0)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(c0);
                throw new AssertionError(G.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.u.D(interruptedIOException);
                    this.t.b(this.u, interruptedIOException);
                    this.u.n().c0().h(this);
                }
            } catch (Throwable th) {
                this.u.n().c0().h(this);
                throw th;
            }
        }

        @NotNull
        public final ks5 b() {
            return this.u;
        }

        @NotNull
        public final AtomicInteger c() {
            return this.s;
        }

        @NotNull
        public final String d() {
            return this.u.y().q().F();
        }

        @NotNull
        public final hr5 e() {
            return this.u.y();
        }

        public final void f(@NotNull a aVar) {
            c25.p(aVar, "other");
            this.s = aVar.s;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            fr5 n;
            StringBuilder G = wo1.G("OkHttp ");
            G.append(this.u.E());
            String sb = G.toString();
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb);
            try {
                this.u.u.x();
                try {
                    z = true;
                } catch (IOException e) {
                    e = e;
                    z = false;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                try {
                    this.t.a(this.u, this.u.A());
                    n = this.u.n();
                } catch (IOException e2) {
                    e = e2;
                    if (z) {
                        au5 g = au5.e.g();
                        g.m("Callback failure for " + this.u.N(), 4, e);
                    } else {
                        this.t.b(this.u, e);
                    }
                    n = this.u.n();
                    n.c0().h(this);
                } catch (Throwable th2) {
                    th = th2;
                    this.u.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        co4.a(iOException, th);
                        this.t.b(this.u, iOException);
                    }
                    throw th;
                }
                n.c0().h(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"com/p7700g/p99005/ks5$b", "Ljava/lang/ref/WeakReference;", "Lcom/p7700g/p99005/ks5;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lcom/p7700g/p99005/ks5;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<ks5> {
        @Nullable
        private final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ks5 ks5Var, @Nullable Object obj) {
            super(ks5Var);
            c25.p(ks5Var, "referent");
            this.a = obj;
        }

        @Nullable
        public final Object a() {
            return this.a;
        }
    }

    /* compiled from: RealCall.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/ks5$c", "Lcom/p7700g/p99005/qv5;", "Lcom/p7700g/p99005/yq4;", "D", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c extends qv5 {
        public c() {
        }

        @Override // com.p7700g.p99005.qv5
        public void D() {
            ks5.this.cancel();
        }
    }

    public ks5(@NotNull fr5 fr5Var, @NotNull hr5 hr5Var, boolean z) {
        c25.p(fr5Var, m31.a);
        c25.p(hr5Var, "originalRequest");
        this.H = fr5Var;
        this.I = hr5Var;
        this.J = z;
        this.s = fr5Var.Z().c();
        this.t = fr5Var.e0().a(this);
        c cVar = new c();
        cVar.i(fr5Var.T(), TimeUnit.MILLISECONDS);
        yq4 yq4Var = yq4.a;
        this.u = cVar;
        this.v = new AtomicBoolean();
        this.D = true;
    }

    private final <E extends IOException> E M(E e) {
        if (!this.z && this.u.y()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
            return interruptedIOException;
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String N() {
        StringBuilder sb = new StringBuilder();
        sb.append(c1() ? "canceled " : "");
        sb.append(this.J ? "web socket" : kg.p0);
        sb.append(" to ");
        sb.append(E());
        return sb.toString();
    }

    private final <E extends IOException> E d(E e) {
        Socket G;
        boolean z = sr5.h;
        if (z && Thread.holdsLock(this)) {
            StringBuilder G2 = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G2.append(currentThread.getName());
            G2.append(" MUST NOT hold lock on ");
            G2.append(this);
            throw new AssertionError(G2.toString());
        }
        ls5 ls5Var = this.y;
        if (ls5Var != null) {
            if (z && Thread.holdsLock(ls5Var)) {
                StringBuilder G3 = wo1.G("Thread ");
                Thread currentThread2 = Thread.currentThread();
                c25.o(currentThread2, "Thread.currentThread()");
                G3.append(currentThread2.getName());
                G3.append(" MUST NOT hold lock on ");
                G3.append(ls5Var);
                throw new AssertionError(G3.toString());
            }
            synchronized (ls5Var) {
                G = G();
            }
            if (this.y == null) {
                if (G != null) {
                    sr5.n(G);
                }
                this.t.l(this, ls5Var);
            } else {
                if (!(G == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e2 = (E) M(e);
        if (e != null) {
            vq5 vq5Var = this.t;
            c25.m(e2);
            vq5Var.e(this, e2);
        } else {
            this.t.d(this);
        }
        return e2;
    }

    private final void e() {
        this.w = au5.e.g().k("response.body().close()");
        this.t.f(this);
    }

    private final dq5 g(zq5 zq5Var) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        jq5 jq5Var;
        if (zq5Var.G()) {
            SSLSocketFactory v0 = this.H.v0();
            hostnameVerifier = this.H.i0();
            sSLSocketFactory = v0;
            jq5Var = this.H.V();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            jq5Var = null;
        }
        return new dq5(zq5Var.F(), zq5Var.N(), this.H.d0(), this.H.u0(), sSLSocketFactory, hostnameVerifier, jq5Var, this.H.q0(), this.H.p0(), this.H.o0(), this.H.a0(), this.H.r0());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jr5 A() throws IOException {
        ArrayList arrayList = new ArrayList();
        os4.o0(arrayList, this.H.j0());
        arrayList.add(new at5(this.H));
        arrayList.add(new rs5(this.H.b0()));
        arrayList.add(new vr5(this.H.S()));
        arrayList.add(gs5.b);
        if (!this.J) {
            os4.o0(arrayList, this.H.l0());
        }
        arrayList.add(new ss5(this.J));
        boolean z = false;
        try {
            jr5 e = new xs5(this, arrayList, 0, null, this.I, this.H.X(), this.H.s0(), this.H.z0()).e(this.I);
            if (!c1()) {
                D(null);
                return e;
            }
            sr5.l(e);
            throw new IOException("Canceled");
        } catch (IOException e2) {
            try {
                IOException D = D(e2);
                if (D == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw D;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    D(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    @NotNull
    public final is5 B(@NotNull xs5 xs5Var) {
        c25.p(xs5Var, "chain");
        synchronized (this) {
            if (this.D) {
                if (!this.C) {
                    if (!this.B) {
                        yq4 yq4Var = yq4.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        js5 js5Var = this.x;
        c25.m(js5Var);
        is5 is5Var = new is5(this, this.t, js5Var, js5Var.a(this.H, xs5Var));
        this.A = is5Var;
        this.F = is5Var;
        synchronized (this) {
            this.B = true;
            this.C = true;
        }
        if (this.E) {
            throw new IOException("Canceled");
        }
        return is5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E C(@NotNull is5 is5Var, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        c25.p(is5Var, "exchange");
        boolean z5 = true;
        if (!c25.g(is5Var, this.F)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.B) {
                    }
                    if (z) {
                        this.B = false;
                    }
                    if (z2) {
                        this.C = false;
                    }
                    z4 = this.B;
                    boolean z6 = z4 && !this.C;
                    if (!z4 || this.C || this.D) {
                        z5 = false;
                    }
                    z3 = z6;
                    yq4 yq4Var = yq4.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z2 || !this.C) {
                z5 = false;
                yq4 yq4Var2 = yq4.a;
            }
            if (z) {
            }
            if (z2) {
            }
            z4 = this.B;
            if (z4) {
            }
            if (!z4) {
            }
            z5 = false;
            z3 = z6;
            yq4 yq4Var22 = yq4.a;
        }
        if (z3) {
            this.F = null;
            ls5 ls5Var = this.y;
            if (ls5Var != null) {
                ls5Var.z();
            }
        }
        return z5 ? (E) d(e) : e;
    }

    @Nullable
    public final IOException D(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.D) {
                this.D = false;
                if (!this.B && !this.C) {
                    z = true;
                }
            }
            yq4 yq4Var = yq4.a;
        }
        return z ? d(iOException) : iOException;
    }

    @Override // com.p7700g.p99005.hq5
    public void D1(@NotNull iq5 iq5Var) {
        c25.p(iq5Var, "responseCallback");
        if (this.v.compareAndSet(false, true)) {
            e();
            this.H.c0().c(new a(this, iq5Var));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @NotNull
    public final String E() {
        return this.I.q().V();
    }

    @Nullable
    public final Socket G() {
        ls5 ls5Var = this.y;
        c25.m(ls5Var);
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
        Iterator<Reference<ks5>> it = u.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (c25.g(it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            u.remove(i);
            this.y = null;
            if (u.isEmpty()) {
                ls5Var.I(System.nanoTime());
                if (this.s.c(ls5Var)) {
                    return ls5Var.d();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean H() {
        js5 js5Var = this.x;
        c25.m(js5Var);
        return js5Var.e();
    }

    public final void I(@Nullable ls5 ls5Var) {
        this.G = ls5Var;
    }

    @Override // com.p7700g.p99005.hq5
    @NotNull
    /* renamed from: J */
    public qv5 timeout() {
        return this.u;
    }

    public final void L() {
        if (!this.z) {
            this.z = true;
            this.u.y();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.p7700g.p99005.hq5
    public boolean X0() {
        return this.v.get();
    }

    public final void c(@NotNull ls5 ls5Var) {
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
        if (this.y == null) {
            this.y = ls5Var;
            ls5Var.u().add(new b(this, this.w));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.p7700g.p99005.hq5
    public boolean c1() {
        return this.E;
    }

    @Override // com.p7700g.p99005.hq5
    public void cancel() {
        if (this.E) {
            return;
        }
        this.E = true;
        is5 is5Var = this.F;
        if (is5Var != null) {
            is5Var.b();
        }
        ls5 ls5Var = this.G;
        if (ls5Var != null) {
            ls5Var.k();
        }
        this.t.g(this);
    }

    @Override // com.p7700g.p99005.hq5
    @NotNull
    /* renamed from: f */
    public ks5 d1() {
        return new ks5(this.H, this.I, this.J);
    }

    public final void h(@NotNull hr5 hr5Var, boolean z) {
        c25.p(hr5Var, "request");
        if (this.A == null) {
            synchronized (this) {
                if (!this.C) {
                    if (!this.B) {
                        yq4 yq4Var = yq4.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z) {
                this.x = new js5(this.s, g(hr5Var.q()), this, this.t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void i(boolean z) {
        is5 is5Var;
        synchronized (this) {
            if (this.D) {
                yq4 yq4Var = yq4.a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (is5Var = this.F) != null) {
            is5Var.d();
        }
        this.A = null;
    }

    @NotNull
    public final fr5 n() {
        return this.H;
    }

    @Nullable
    public final ls5 o() {
        return this.y;
    }

    @Nullable
    public final ls5 p() {
        return this.G;
    }

    @NotNull
    public final vq5 t() {
        return this.t;
    }

    public final boolean u() {
        return this.J;
    }

    @Override // com.p7700g.p99005.hq5
    @NotNull
    public jr5 w0() {
        if (this.v.compareAndSet(false, true)) {
            this.u.x();
            e();
            try {
                this.H.c0().d(this);
                return A();
            } finally {
                this.H.c0().i(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Nullable
    public final is5 x() {
        return this.A;
    }

    @Override // com.p7700g.p99005.hq5
    @NotNull
    public hr5 x0() {
        return this.I;
    }

    @NotNull
    public final hr5 y() {
        return this.I;
    }
}