package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.rs2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Http2Stream.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u0004628#B3\b\u0000\u0012\u0006\u0010e\u001a\u00020)\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bs\u0010tJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b1\u0010&J\u000f\u00102\u001a\u00020\u0012H\u0000¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0012H\u0000¢\u0006\u0004\b8\u00103J\u000f\u00109\u001a\u00020\u0012H\u0000¢\u0006\u0004\b9\u00103R \u0010(\u001a\u00060:R\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R*\u0010C\u001a\u0002042\u0006\u0010?\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u00107R \u0010I\u001a\u00060DR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010O\u001a\u00060JR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bE\u0010R\"\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0013\u0010Z\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bX\u0010YR*\u0010]\u001a\u0002042\u0006\u0010?\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b[\u0010A\"\u0004\b\\\u00107R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010^\u001a\u0004\b;\u0010_\"\u0004\b`\u0010&R*\u0010b\u001a\u0002042\u0006\u0010?\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00109\u001a\u0004\bK\u0010A\"\u0004\ba\u00107R\u0019\u0010e\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\bc\u0010dR\u0013\u0010g\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bf\u0010YR\u0019\u0010k\u001a\u00020h8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010i\u001a\u0004\bU\u0010jR*\u0010n\u001a\u0002042\u0006\u0010?\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\bl\u0010A\"\u0004\bm\u00107R\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\t0o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010pR \u0010r\u001a\u00060JR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bP\u0010N¨\u0006u"}, d2 = {"Lcom/p7700g/p99005/mt5;", "", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "Ljava/io/IOException;", "errorException", "", "e", "(Lcom/p7700g/p99005/ft5;Ljava/io/IOException;)Z", "Lcom/p7700g/p99005/yq5;", "H", "()Lcom/p7700g/p99005/yq5;", AFHydra.STATUS_IDLE, "", "Lcom/p7700g/p99005/gt5;", "responseHeaders", "outFinished", "flushHeaders", "Lcom/p7700g/p99005/yq4;", "K", "(Ljava/util/List;ZZ)V", "trailers", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/yq5;)V", "Lcom/p7700g/p99005/zw5;", "x", "()Lcom/p7700g/p99005/zw5;", "L", "Lcom/p7700g/p99005/xw5;", "q", "()Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/vw5;", ij3.b, "()Lcom/p7700g/p99005/vw5;", "rstStatusCode", "d", "(Lcom/p7700g/p99005/ft5;Ljava/io/IOException;)V", "f", "(Lcom/p7700g/p99005/ft5;)V", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", "length", "y", "(Lcom/p7700g/p99005/uv5;I)V", "headers", "inFinished", "z", "(Lcom/p7700g/p99005/yq5;Z)V", bx.B4, "b", "()V", "", "delta", "a", "(J)V", "c", "J", "Lcom/p7700g/p99005/mt5$c;", "i", "Lcom/p7700g/p99005/mt5$c;", "r", "()Lcom/p7700g/p99005/mt5$c;", "<set-?>", "t", "()J", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "writeBytesTotal", "Lcom/p7700g/p99005/mt5$b;", "j", "Lcom/p7700g/p99005/mt5$b;", "p", "()Lcom/p7700g/p99005/mt5$b;", "sink", "Lcom/p7700g/p99005/mt5$d;", "l", "Lcom/p7700g/p99005/mt5$d;", "u", "()Lcom/p7700g/p99005/mt5$d;", "writeTimeout", "n", "Ljava/io/IOException;", "()Ljava/io/IOException;", "C", "(Ljava/io/IOException;)V", "h", "Z", "hasResponseHeaders", "w", "()Z", "isOpen", com.anythink.expressad.d.a.b.dH, "E", "readBytesTotal", "Lcom/p7700g/p99005/ft5;", "()Lcom/p7700g/p99005/ft5;", AFHydra.EV_BYTECOUNT, "D", "readBytesAcknowledged", "k", "()I", "id", com.ironsource.sdk.controller.v.a, "isLocallyInitiated", "Lcom/p7700g/p99005/jt5;", "Lcom/p7700g/p99005/jt5;", "()Lcom/p7700g/p99005/jt5;", "connection", "s", "F", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "readTimeout", "<init>", "(ILcom/p7700g/p99005/jt5;ZZLcom/p7700g/p99005/yq5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class mt5 {
    public static final long a = 16384;
    public static final a b = new a(null);
    private long c;
    private long d;
    private long e;
    private long f;
    private final ArrayDeque<yq5> g;
    private boolean h;
    @NotNull
    private final c i;
    @NotNull
    private final b j;
    @NotNull
    private final d k;
    @NotNull
    private final d l;
    @Nullable
    private ft5 m;
    @Nullable
    private IOException n;
    private final int o;
    @NotNull
    private final jt5 p;

    /* compiled from: Http2Stream.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/mt5$a", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020$¢\u0006\u0004\b3\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010#\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u0019\u00102\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"¨\u00065"}, d2 = {"com/p7700g/p99005/mt5$c", "Lcom/p7700g/p99005/xw5;", "", "read", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.d.a.b.dH, "(J)V", "Lcom/p7700g/p99005/sv5;", "sink", "byteCount", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "h", "(Lcom/p7700g/p99005/uv5;J)V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/yq5;", "u", "Lcom/p7700g/p99005/yq5;", "f", "()Lcom/p7700g/p99005/yq5;", "l", "(Lcom/p7700g/p99005/yq5;)V", "trailers", "w", "J", "maxByteCount", "t", "Lcom/p7700g/p99005/sv5;", "d", "()Lcom/p7700g/p99005/sv5;", "readBuffer", "", com.ironsource.sdk.controller.v.a, "Z", "a", "()Z", "j", "(Z)V", "closed", "x", "b", "k", "finished", "s", "e", "receiveBuffer", "<init>", "(Lcom/p7700g/p99005/mt5;JZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class c implements xw5 {
        @NotNull
        private final sv5 s = new sv5();
        @NotNull
        private final sv5 t = new sv5();
        @Nullable
        private yq5 u;
        private boolean v;
        private final long w;
        private boolean x;

        public c(long j, boolean z) {
            this.w = j;
            this.x = z;
        }

        private final void m(long j) {
            mt5 mt5Var = mt5.this;
            if (sr5.h && Thread.holdsLock(mt5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(mt5Var);
                throw new AssertionError(G.toString());
            }
            mt5.this.h().x2(j);
        }

        public final boolean a() {
            return this.v;
        }

        public final boolean b() {
            return this.x;
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long z2;
            synchronized (mt5.this) {
                this.v = true;
                z2 = this.t.z2();
                this.t.d();
                mt5 mt5Var = mt5.this;
                if (mt5Var != null) {
                    mt5Var.notifyAll();
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (z2 > 0) {
                m(z2);
            }
            mt5.this.b();
        }

        @NotNull
        public final sv5 d() {
            return this.t;
        }

        @NotNull
        public final sv5 e() {
            return this.s;
        }

        @Nullable
        public final yq5 f() {
            return this.u;
        }

        public final void h(@NotNull uv5 uv5Var, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            c25.p(uv5Var, rs2.f.b);
            mt5 mt5Var = mt5.this;
            if (sr5.h && Thread.holdsLock(mt5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(mt5Var);
                throw new AssertionError(G.toString());
            }
            while (j > 0) {
                synchronized (mt5.this) {
                    z = this.x;
                    z2 = true;
                    z3 = this.t.z2() + j > this.w;
                    yq4 yq4Var = yq4.a;
                }
                if (z3) {
                    uv5Var.skip(j);
                    mt5.this.f(ft5.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    uv5Var.skip(j);
                    return;
                } else {
                    long read = uv5Var.read(this.s, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (mt5.this) {
                            if (this.v) {
                                j2 = this.s.z2();
                                this.s.d();
                            } else {
                                if (this.t.z2() != 0) {
                                    z2 = false;
                                }
                                this.t.b1(this.s);
                                if (z2) {
                                    mt5 mt5Var2 = mt5.this;
                                    if (mt5Var2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    mt5Var2.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            m(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final void j(boolean z) {
            this.v = z;
        }

        public final void k(boolean z) {
            this.x = z;
        }

        public final void l(@Nullable yq5 yq5Var) {
            this.u = yq5Var;
        }

        @Override // com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) throws IOException {
            IOException iOException;
            long j2;
            boolean z;
            long j3;
            c25.p(sv5Var, "sink");
            if (j >= 0) {
                do {
                    iOException = null;
                    synchronized (mt5.this) {
                        mt5.this.n().x();
                        if (mt5.this.i() != null && (iOException = mt5.this.j()) == null) {
                            ft5 i = mt5.this.i();
                            c25.m(i);
                            iOException = new rt5(i);
                        }
                        if (!this.v) {
                            if (this.t.z2() > 0) {
                                sv5 sv5Var2 = this.t;
                                j2 = sv5Var2.read(sv5Var, Math.min(j, sv5Var2.z2()));
                                mt5 mt5Var = mt5.this;
                                mt5Var.E(mt5Var.m() + j2);
                                long m = mt5.this.m() - mt5.this.l();
                                if (iOException == null && m >= mt5.this.h().X0().e() / 2) {
                                    mt5.this.h().F2(mt5.this.k(), m);
                                    mt5 mt5Var2 = mt5.this;
                                    mt5Var2.D(mt5Var2.m());
                                }
                            } else if (this.x || iOException != null) {
                                j2 = -1;
                            } else {
                                mt5.this.J();
                                z = true;
                                j3 = -1;
                                mt5.this.n().F();
                                yq4 yq4Var = yq4.a;
                            }
                            j3 = j2;
                            z = false;
                            mt5.this.n().F();
                            yq4 yq4Var2 = yq4.a;
                        } else {
                            throw new IOException("stream closed");
                        }
                    }
                } while (z);
                if (j3 != -1) {
                    m(j3);
                    return j3;
                } else if (iOException == null) {
                    return -1L;
                } else {
                    c25.m(iOException);
                    throw iOException;
                }
            }
            throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        public zw5 timeout() {
            return mt5.this.n();
        }
    }

    /* compiled from: Http2Stream.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"com/p7700g/p99005/mt5$d", "Lcom/p7700g/p99005/qv5;", "Lcom/p7700g/p99005/yq4;", "D", "()V", "Ljava/io/IOException;", "cause", "z", "(Ljava/io/IOException;)Ljava/io/IOException;", "F", "<init>", "(Lcom/p7700g/p99005/mt5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class d extends qv5 {
        public d() {
        }

        @Override // com.p7700g.p99005.qv5
        public void D() {
            mt5.this.f(ft5.CANCEL);
            mt5.this.h().n2();
        }

        public final void F() throws IOException {
            if (y()) {
                throw z(null);
            }
        }

        @Override // com.p7700g.p99005.qv5
        @NotNull
        public IOException z(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public mt5(int i, @NotNull jt5 jt5Var, boolean z, boolean z2, @Nullable yq5 yq5Var) {
        c25.p(jt5Var, "connection");
        this.o = i;
        this.p = jt5Var;
        this.f = jt5Var.c1().e();
        ArrayDeque<yq5> arrayDeque = new ArrayDeque<>();
        this.g = arrayDeque;
        this.i = new c(jt5Var.X0().e(), z2);
        this.j = new b(z);
        this.k = new d();
        this.l = new d();
        if (yq5Var != null) {
            if (!v()) {
                arrayDeque.add(yq5Var);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!v()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean e(ft5 ft5Var, IOException iOException) {
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            if (this.i.b() && this.j.d()) {
                return false;
            }
            this.m = ft5Var;
            this.n = iOException;
            notifyAll();
            yq4 yq4Var = yq4.a;
            this.p.m2(this.o);
            return true;
        }
    }

    public final synchronized void A(@NotNull ft5 ft5Var) {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.m == null) {
            this.m = ft5Var;
            notifyAll();
        }
    }

    public final void B(@Nullable ft5 ft5Var) {
        this.m = ft5Var;
    }

    public final void C(@Nullable IOException iOException) {
        this.n = iOException;
    }

    public final void D(long j) {
        this.d = j;
    }

    public final void E(long j) {
        this.c = j;
    }

    public final void F(long j) {
        this.f = j;
    }

    public final void G(long j) {
        this.e = j;
    }

    @NotNull
    public final synchronized yq5 H() throws IOException {
        yq5 removeFirst;
        this.k.x();
        while (this.g.isEmpty() && this.m == null) {
            J();
        }
        this.k.F();
        if (!this.g.isEmpty()) {
            removeFirst = this.g.removeFirst();
            c25.o(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            ft5 ft5Var = this.m;
            c25.m(ft5Var);
            throw new rt5(ft5Var);
        }
        return removeFirst;
    }

    @NotNull
    public final synchronized yq5 I() throws IOException {
        yq5 f;
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            ft5 ft5Var = this.m;
            c25.m(ft5Var);
            throw new rt5(ft5Var);
        }
        if (this.i.b() && this.i.e().f0() && this.i.d().f0()) {
            f = this.i.f();
            if (f == null) {
                f = sr5.b;
            }
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        return f;
    }

    public final void J() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void K(@NotNull List<gt5> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        c25.p(list, "responseHeaders");
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this) {
            this.h = true;
            if (z) {
                this.j.h(true);
            }
            yq4 yq4Var = yq4.a;
        }
        if (!z2) {
            synchronized (this.p) {
                z3 = this.p.a2() >= this.p.Z1();
            }
            z2 = z3;
        }
        this.p.z2(this.o, z, list);
        if (z2) {
            this.p.flush();
        }
    }

    @NotNull
    public final zw5 L() {
        return this.l;
    }

    public final void a(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z;
        boolean w;
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this) {
            z = !this.i.b() && this.i.a() && (this.j.d() || this.j.b());
            w = w();
            yq4 yq4Var = yq4.a;
        }
        if (z) {
            d(ft5.CANCEL, null);
        } else if (w) {
        } else {
            this.p.m2(this.o);
        }
    }

    public final void c() throws IOException {
        if (!this.j.b()) {
            if (!this.j.d()) {
                if (this.m != null) {
                    IOException iOException = this.n;
                    if (iOException != null) {
                        throw iOException;
                    }
                    ft5 ft5Var = this.m;
                    c25.m(ft5Var);
                    throw new rt5(ft5Var);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void d(@NotNull ft5 ft5Var, @Nullable IOException iOException) throws IOException {
        c25.p(ft5Var, "rstStatusCode");
        if (e(ft5Var, iOException)) {
            this.p.D2(this.o, ft5Var);
        }
    }

    public final void f(@NotNull ft5 ft5Var) {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        if (e(ft5Var, null)) {
            this.p.E2(this.o, ft5Var);
        }
    }

    public final void g(@NotNull yq5 yq5Var) {
        c25.p(yq5Var, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.j.d()) {
                if (yq5Var.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.j.j(yq5Var);
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    @NotNull
    public final jt5 h() {
        return this.p;
    }

    @Nullable
    public final synchronized ft5 i() {
        return this.m;
    }

    @Nullable
    public final IOException j() {
        return this.n;
    }

    public final int k() {
        return this.o;
    }

    public final long l() {
        return this.d;
    }

    public final long m() {
        return this.c;
    }

    @NotNull
    public final d n() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vw5 o() {
        boolean z;
        synchronized (this) {
            if (!this.h && !v()) {
                z = false;
                if (!z) {
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
            }
            z = true;
            if (!z) {
            }
        }
        return this.j;
    }

    @NotNull
    public final b p() {
        return this.j;
    }

    @NotNull
    public final xw5 q() {
        return this.i;
    }

    @NotNull
    public final c r() {
        return this.i;
    }

    public final long s() {
        return this.f;
    }

    public final long t() {
        return this.e;
    }

    @NotNull
    public final d u() {
        return this.l;
    }

    public final boolean v() {
        return this.p.W() == ((this.o & 1) == 1);
    }

    public final synchronized boolean w() {
        if (this.m != null) {
            return false;
        }
        if ((this.i.b() || this.i.a()) && (this.j.d() || this.j.b())) {
            if (this.h) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final zw5 x() {
        return this.k;
    }

    public final void y(@NotNull uv5 uv5Var, int i) throws IOException {
        c25.p(uv5Var, rs2.f.b);
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        this.i.h(uv5Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:10:0x0039, B:14:0x0041, B:17:0x0050, B:18:0x0055, B:15:0x0047), top: B:26:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(@NotNull yq5 yq5Var, boolean z) {
        boolean w;
        c25.p(yq5Var, "headers");
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        synchronized (this) {
            if (this.h && z) {
                this.i.l(yq5Var);
                if (z) {
                    this.i.k(true);
                }
                w = w();
                notifyAll();
                yq4 yq4Var = yq4.a;
            }
            this.h = true;
            this.g.add(yq5Var);
            if (z) {
            }
            w = w();
            notifyAll();
            yq4 yq4Var2 = yq4.a;
        }
        if (w) {
            return;
        }
        this.p.m2(this.o);
    }

    /* compiled from: Http2Stream.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0006¨\u0006*"}, d2 = {"com/p7700g/p99005/mt5$b", "Lcom/p7700g/p99005/vw5;", "", "outFinishedOnLastFrame", "Lcom/p7700g/p99005/yq4;", "a", "(Z)V", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, com.ironsource.sdk.controller.v.a, "Z", "d", "()Z", "h", "finished", "s", "Lcom/p7700g/p99005/sv5;", "sendBuffer", "Lcom/p7700g/p99005/yq5;", "t", "Lcom/p7700g/p99005/yq5;", "e", "()Lcom/p7700g/p99005/yq5;", "j", "(Lcom/p7700g/p99005/yq5;)V", "trailers", "u", "b", "f", "closed", "<init>", "(Lcom/p7700g/p99005/mt5;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class b implements vw5 {
        private final sv5 s;
        @Nullable
        private yq5 t;
        private boolean u;
        private boolean v;

        public b(boolean z) {
            this.v = z;
            this.s = new sv5();
        }

        private final void a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (mt5.this) {
                mt5.this.u().x();
                while (mt5.this.t() >= mt5.this.s() && !this.v && !this.u && mt5.this.i() == null) {
                    mt5.this.J();
                }
                mt5.this.u().F();
                mt5.this.c();
                min = Math.min(mt5.this.s() - mt5.this.t(), this.s.z2());
                mt5 mt5Var = mt5.this;
                mt5Var.G(mt5Var.t() + min);
                z2 = z && min == this.s.z2() && mt5.this.i() == null;
                yq4 yq4Var = yq4.a;
            }
            mt5.this.u().x();
            try {
                mt5.this.h().y2(mt5.this.k(), z2, this.s, min);
            } finally {
                mt5.this.u().F();
            }
        }

        public final boolean b() {
            return this.u;
        }

        @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            mt5 mt5Var = mt5.this;
            if (sr5.h && Thread.holdsLock(mt5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(mt5Var);
                throw new AssertionError(G.toString());
            }
            synchronized (mt5.this) {
                if (this.u) {
                    return;
                }
                boolean z = mt5.this.i() == null;
                yq4 yq4Var = yq4.a;
                if (!mt5.this.p().v) {
                    boolean z2 = this.s.z2() > 0;
                    if (this.t != null) {
                        while (this.s.z2() > 0) {
                            a(false);
                        }
                        jt5 h = mt5.this.h();
                        int k = mt5.this.k();
                        yq5 yq5Var = this.t;
                        c25.m(yq5Var);
                        h.z2(k, z, sr5.W(yq5Var));
                    } else if (z2) {
                        while (this.s.z2() > 0) {
                            a(true);
                        }
                    } else if (z) {
                        mt5.this.h().y2(mt5.this.k(), true, null, 0L);
                    }
                }
                synchronized (mt5.this) {
                    this.u = true;
                    yq4 yq4Var2 = yq4.a;
                }
                mt5.this.h().flush();
                mt5.this.b();
            }
        }

        public final boolean d() {
            return this.v;
        }

        @Nullable
        public final yq5 e() {
            return this.t;
        }

        public final void f(boolean z) {
            this.u = z;
        }

        @Override // com.p7700g.p99005.vw5, java.io.Flushable
        public void flush() throws IOException {
            mt5 mt5Var = mt5.this;
            if (sr5.h && Thread.holdsLock(mt5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(mt5Var);
                throw new AssertionError(G.toString());
            }
            synchronized (mt5.this) {
                mt5.this.c();
                yq4 yq4Var = yq4.a;
            }
            while (this.s.z2() > 0) {
                a(false);
                mt5.this.h().flush();
            }
        }

        public final void h(boolean z) {
            this.v = z;
        }

        public final void j(@Nullable yq5 yq5Var) {
            this.t = yq5Var;
        }

        @Override // com.p7700g.p99005.vw5
        @NotNull
        public zw5 timeout() {
            return mt5.this.u();
        }

        @Override // com.p7700g.p99005.vw5
        public void write(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, rs2.f.b);
            mt5 mt5Var = mt5.this;
            if (sr5.h && Thread.holdsLock(mt5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST NOT hold lock on ");
                G.append(mt5Var);
                throw new AssertionError(G.toString());
            }
            this.s.write(sv5Var, j);
            while (this.s.z2() >= 16384) {
                a(false);
            }
        }

        public /* synthetic */ b(mt5 mt5Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}