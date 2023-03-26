package com.p7700g.p99005;

import com.p7700g.p99005.jr5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.yu5;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Exchange.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002-&B'\u0012\u0006\u0010<\u001a\u000208\u0012\u0006\u0010K\u001a\u00020G\u0012\u0006\u0010F\u001a\u00020B\u0012\u0006\u00107\u001a\u000205¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0011J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0011J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0011J9\u0010-\u001a\u00028\u0000\"\n\b\u0000\u0010(*\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010\u0011R\u001c\u00104\u001a\u0002008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001c\u0010<\u001a\u0002088\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R$\u0010A\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010F\u001a\u00020B8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010K\u001a\u00020G8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u000b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010@¨\u0006P"}, d2 = {"Lcom/p7700g/p99005/is5;", "", "Ljava/io/IOException;", "e", "Lcom/p7700g/p99005/yq4;", "t", "(Ljava/io/IOException;)V", "Lcom/p7700g/p99005/hr5;", "request", "w", "(Lcom/p7700g/p99005/hr5;)V", "", "duplex", "Lcom/p7700g/p99005/vw5;", "c", "(Lcom/p7700g/p99005/hr5;Z)Lcom/p7700g/p99005/vw5;", "f", "()V", "s", "expectContinue", "Lcom/p7700g/p99005/jr5$a;", "q", "(Z)Lcom/p7700g/p99005/jr5$a;", "Lcom/p7700g/p99005/jr5;", "response", "r", "(Lcom/p7700g/p99005/jr5;)V", "Lcom/p7700g/p99005/kr5;", "p", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/yq5;", "u", "()Lcom/p7700g/p99005/yq5;", "Lcom/p7700g/p99005/yu5$d;", com.anythink.expressad.d.a.b.dH, "()Lcom/p7700g/p99005/yu5$d;", com.ironsource.sdk.controller.v.a, "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", ij3.b, "Lcom/p7700g/p99005/ls5;", "Lcom/p7700g/p99005/ls5;", "h", "()Lcom/p7700g/p99005/ls5;", "connection", "Lcom/p7700g/p99005/us5;", "Lcom/p7700g/p99005/us5;", "codec", "Lcom/p7700g/p99005/ks5;", "Lcom/p7700g/p99005/ks5;", com.anythink.basead.d.g.i, "()Lcom/p7700g/p99005/ks5;", kg.p0, "<set-?>", "Z", "l", "()Z", "isDuplex", "Lcom/p7700g/p99005/js5;", "Lcom/p7700g/p99005/js5;", "j", "()Lcom/p7700g/p99005/js5;", "finder", "Lcom/p7700g/p99005/vq5;", "Lcom/p7700g/p99005/vq5;", "i", "()Lcom/p7700g/p99005/vq5;", "eventListener", "k", "isCoalescedConnection", "<init>", "(Lcom/p7700g/p99005/ks5;Lcom/p7700g/p99005/vq5;Lcom/p7700g/p99005/js5;Lcom/p7700g/p99005/us5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class is5 {
    private boolean a;
    @NotNull
    private final ls5 b;
    @NotNull
    private final ks5 c;
    @NotNull
    private final vq5 d;
    @NotNull
    private final js5 e;
    private final us5 f;

    /* compiled from: Exchange.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006 "}, d2 = {"com/p7700g/p99005/is5$a", "Lcom/p7700g/p99005/aw5;", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "", "s", "Z", "completed", "u", "closed", "t", "J", "bytesReceived", com.ironsource.sdk.controller.v.a, "contentLength", "Lcom/p7700g/p99005/vw5;", "delegate", "<init>", "(Lcom/p7700g/p99005/is5;Lcom/p7700g/p99005/vw5;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class a extends aw5 {
        private boolean s;
        private long t;
        private boolean u;
        private final long v;
        public final /* synthetic */ is5 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull is5 is5Var, vw5 vw5Var, long j) {
            super(vw5Var);
            c25.p(vw5Var, "delegate");
            this.w = is5Var;
            this.v = j;
        }

        private final <E extends IOException> E a(E e) {
            if (this.s) {
                return e;
            }
            this.s = true;
            return (E) this.w.a(this.t, false, true, e);
        }

        @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.u) {
                return;
            }
            this.u = true;
            long j = this.v;
            if (j != -1 && this.t != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5
        public void write(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, rs2.f.b);
            if (!this.u) {
                long j2 = this.v;
                if (j2 != -1 && this.t + j > j2) {
                    StringBuilder G = wo1.G("expected ");
                    G.append(this.v);
                    G.append(" bytes but received ");
                    G.append(this.t + j);
                    throw new ProtocolException(G.toString());
                }
                try {
                    super.write(sv5Var, j);
                    this.t += j;
                    return;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Exchange.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012¨\u0006!"}, d2 = {"com/p7700g/p99005/is5$b", "Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Ljava/io/IOException;", "E", "e", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "u", "Z", "invokeStartEvent", "x", "J", "contentLength", "t", "bytesReceived", "w", "closed", com.ironsource.sdk.controller.v.a, "completed", "Lcom/p7700g/p99005/xw5;", "delegate", "<init>", "(Lcom/p7700g/p99005/is5;Lcom/p7700g/p99005/xw5;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class b extends bw5 {
        private long t;
        private boolean u;
        private boolean v;
        private boolean w;
        private final long x;
        public final /* synthetic */ is5 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull is5 is5Var, xw5 xw5Var, long j) {
            super(xw5Var);
            c25.p(xw5Var, "delegate");
            this.y = is5Var;
            this.x = j;
            this.u = true;
            if (j == 0) {
                d(null);
            }
        }

        @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.w) {
                return;
            }
            this.w = true;
            try {
                super.close();
                d(null);
            } catch (IOException e) {
                throw d(e);
            }
        }

        public final <E extends IOException> E d(E e) {
            if (this.v) {
                return e;
            }
            this.v = true;
            if (e == null && this.u) {
                this.u = false;
                this.y.i().w(this.y.g());
            }
            return (E) this.y.a(this.t, true, false, e);
        }

        @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, "sink");
            if (!this.w) {
                try {
                    long read = b().read(sv5Var, j);
                    if (this.u) {
                        this.u = false;
                        this.y.i().w(this.y.g());
                    }
                    if (read == -1) {
                        d(null);
                        return -1L;
                    }
                    long j2 = this.t + read;
                    long j3 = this.x;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.x + " bytes but received " + j2);
                    }
                    this.t = j2;
                    if (j2 == j3) {
                        d(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw d(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public is5(@NotNull ks5 ks5Var, @NotNull vq5 vq5Var, @NotNull js5 js5Var, @NotNull us5 us5Var) {
        c25.p(ks5Var, kg.p0);
        c25.p(vq5Var, "eventListener");
        c25.p(js5Var, "finder");
        c25.p(us5Var, "codec");
        this.c = ks5Var;
        this.d = vq5Var;
        this.e = js5Var;
        this.f = us5Var;
        this.b = us5Var.e();
    }

    private final void t(IOException iOException) {
        this.e.h(iOException);
        this.f.e().N(this.c, iOException);
    }

    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            t(e);
        }
        if (z2) {
            if (e != null) {
                this.d.s(this.c, e);
            } else {
                this.d.q(this.c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.d.x(this.c, e);
            } else {
                this.d.v(this.c, j);
            }
        }
        return (E) this.c.C(this, z2, z, e);
    }

    public final void b() {
        this.f.cancel();
    }

    @NotNull
    public final vw5 c(@NotNull hr5 hr5Var, boolean z) throws IOException {
        c25.p(hr5Var, "request");
        this.a = z;
        ir5 f = hr5Var.f();
        c25.m(f);
        long a2 = f.a();
        this.d.r(this.c);
        return new a(this, this.f.i(hr5Var, a2), a2);
    }

    public final void d() {
        this.f.cancel();
        this.c.C(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f.a();
        } catch (IOException e) {
            this.d.s(this.c, e);
            t(e);
            throw e;
        }
    }

    public final void f() throws IOException {
        try {
            this.f.f();
        } catch (IOException e) {
            this.d.s(this.c, e);
            t(e);
            throw e;
        }
    }

    @NotNull
    public final ks5 g() {
        return this.c;
    }

    @NotNull
    public final ls5 h() {
        return this.b;
    }

    @NotNull
    public final vq5 i() {
        return this.d;
    }

    @NotNull
    public final js5 j() {
        return this.e;
    }

    public final boolean k() {
        return !c25.g(this.e.d().w().F(), this.b.b().d().w().F());
    }

    public final boolean l() {
        return this.a;
    }

    @NotNull
    public final yu5.d m() throws SocketException {
        this.c.L();
        return this.f.e().E(this);
    }

    public final void n() {
        this.f.e().G();
    }

    public final void o() {
        this.c.C(this, true, false, null);
    }

    @NotNull
    public final kr5 p(@NotNull jr5 jr5Var) throws IOException {
        c25.p(jr5Var, "response");
        try {
            String W = jr5.W(jr5Var, "Content-Type", null, 2, null);
            long g = this.f.g(jr5Var);
            return new ys5(W, g, jw5.d(new b(this, this.f.c(jr5Var), g)));
        } catch (IOException e) {
            this.d.x(this.c, e);
            t(e);
            throw e;
        }
    }

    @Nullable
    public final jr5.a q(boolean z) throws IOException {
        try {
            jr5.a d = this.f.d(z);
            if (d != null) {
                d.x(this);
            }
            return d;
        } catch (IOException e) {
            this.d.x(this.c, e);
            t(e);
            throw e;
        }
    }

    public final void r(@NotNull jr5 jr5Var) {
        c25.p(jr5Var, "response");
        this.d.y(this.c, jr5Var);
    }

    public final void s() {
        this.d.z(this.c);
    }

    @NotNull
    public final yq5 u() throws IOException {
        return this.f.h();
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(@NotNull hr5 hr5Var) throws IOException {
        c25.p(hr5Var, "request");
        try {
            this.d.u(this.c);
            this.f.b(hr5Var);
            this.d.t(this.c, hr5Var);
        } catch (IOException e) {
            this.d.s(this.c, e);
            t(e);
            throw e;
        }
    }
}