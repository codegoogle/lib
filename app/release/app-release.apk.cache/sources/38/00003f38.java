package com.p7700g.p99005;

import android.support.v4.media.session.PlaybackStateCompat;
import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.mw5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.vv5;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MultipartReader.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003012B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0018\u00010\u001aR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0016\u0010)\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 ¨\u00063"}, d2 = {"Lcom/p7700g/p99005/dr5;", "Ljava/io/Closeable;", "", "maxResult", "j", "(J)J", "Lcom/p7700g/p99005/dr5$b;", "k", "()Lcom/p7700g/p99005/dr5$b;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "", "y", "Z", "noMoreParts", "Lcom/p7700g/p99005/uv5;", bx.B4, "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", AFHydra.EV_BYTECOUNT, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "boundary", "Lcom/p7700g/p99005/dr5$c;", "z", "Lcom/p7700g/p99005/dr5$c;", "currentPart", "Lcom/p7700g/p99005/vv5;", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/vv5;", "crlfDashDashBoundary", "", "w", AFHydra.STATUS_IDLE, "partCount", "x", "closed", "u", "dashDashBoundary", "<init>", "(Lcom/p7700g/p99005/uv5;Ljava/lang/String;)V", "Lcom/p7700g/p99005/kr5;", "response", "(Lcom/p7700g/p99005/kr5;)V", "t", "a", "b", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class dr5 implements Closeable {
    @NotNull
    private static final mw5 s;
    public static final a t = new a(null);
    private final uv5 A;
    @NotNull
    private final String B;
    private final vv5 u;
    private final vv5 v;
    private int w;
    private boolean x;
    private boolean y;
    private c z;

    /* compiled from: MultipartReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/dr5$a", "", "Lcom/p7700g/p99005/mw5;", "afterBoundaryOptions", "Lcom/p7700g/p99005/mw5;", "a", "()Lcom/p7700g/p99005/mw5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final mw5 a() {
            return dr5.s;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MultipartReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/dr5$b", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/yq5;", "s", "Lcom/p7700g/p99005/yq5;", "b", "()Lcom/p7700g/p99005/yq5;", "headers", "Lcom/p7700g/p99005/uv5;", "t", "Lcom/p7700g/p99005/uv5;", "a", "()Lcom/p7700g/p99005/uv5;", "body", "<init>", "(Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/uv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b implements Closeable {
        @NotNull
        private final yq5 s;
        @NotNull
        private final uv5 t;

        public b(@NotNull yq5 yq5Var, @NotNull uv5 uv5Var) {
            c25.p(yq5Var, "headers");
            c25.p(uv5Var, "body");
            this.s = yq5Var;
            this.t = uv5Var;
        }

        @fz4(name = "body")
        @NotNull
        public final uv5 a() {
            return this.t;
        }

        @fz4(name = "headers")
        @NotNull
        public final yq5 b() {
            return this.s;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.t.close();
        }
    }

    /* compiled from: MultipartReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/dr5$c", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "s", "Lcom/p7700g/p99005/zw5;", "<init>", "(Lcom/p7700g/p99005/dr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class c implements xw5 {
        private final zw5 s = new zw5();

        public c() {
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (c25.g(dr5.this.z, this)) {
                dr5.this.z = null;
            }
        }

        @Override // com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) {
            c25.p(sv5Var, "sink");
            if (j >= 0) {
                if (c25.g(dr5.this.z, this)) {
                    zw5 timeout = dr5.this.A.timeout();
                    zw5 zw5Var = this.s;
                    long j2 = timeout.j();
                    long a = zw5.b.a(zw5Var.j(), timeout.j());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.i(a, timeUnit);
                    if (timeout.f()) {
                        long d = timeout.d();
                        if (zw5Var.f()) {
                            timeout.e(Math.min(timeout.d(), zw5Var.d()));
                        }
                        try {
                            long j3 = dr5.this.j(j);
                            long read = j3 == 0 ? -1L : dr5.this.A.read(sv5Var, j3);
                            timeout.i(j2, timeUnit);
                            if (zw5Var.f()) {
                                timeout.e(d);
                            }
                            return read;
                        } catch (Throwable th) {
                            timeout.i(j2, TimeUnit.NANOSECONDS);
                            if (zw5Var.f()) {
                                timeout.e(d);
                            }
                            throw th;
                        }
                    }
                    if (zw5Var.f()) {
                        timeout.e(zw5Var.d());
                    }
                    try {
                        long j4 = dr5.this.j(j);
                        long read2 = j4 == 0 ? -1L : dr5.this.A.read(sv5Var, j4);
                        timeout.i(j2, timeUnit);
                        if (zw5Var.f()) {
                            timeout.a();
                        }
                        return read2;
                    } catch (Throwable th2) {
                        timeout.i(j2, TimeUnit.NANOSECONDS);
                        if (zw5Var.f()) {
                            timeout.a();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        public zw5 timeout() {
            return this.s;
        }
    }

    static {
        mw5.a aVar = mw5.t;
        vv5.a aVar2 = vv5.u;
        s = aVar.d(aVar2.l("\r\n"), aVar2.l("--"), aVar2.l(" "), aVar2.l("\t"));
    }

    public dr5(@NotNull uv5 uv5Var, @NotNull String str) throws IOException {
        c25.p(uv5Var, rs2.f.b);
        c25.p(str, "boundary");
        this.A = uv5Var;
        this.B = str;
        this.u = new sv5().K0("--").K0(str).f1();
        this.v = new sv5().K0("\r\n--").K0(str).f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long j) {
        this.A.P1(this.v.C3());
        long d0 = this.A.o().d0(this.v);
        if (d0 == -1) {
            return Math.min(j, (this.A.o().z2() - this.v.C3()) + 1);
        }
        return Math.min(j, d0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.x) {
            return;
        }
        this.x = true;
        this.z = null;
        this.A.close();
    }

    @fz4(name = "boundary")
    @NotNull
    public final String h() {
        return this.B;
    }

    @Nullable
    public final b k() throws IOException {
        if (!this.x) {
            if (this.y) {
                return null;
            }
            if (this.w == 0 && this.A.Q0(0L, this.u)) {
                this.A.skip(this.u.C3());
            } else {
                while (true) {
                    long j = j(PlaybackStateCompat.F);
                    if (j == 0) {
                        break;
                    }
                    this.A.skip(j);
                }
                this.A.skip(this.v.C3());
            }
            boolean z = false;
            while (true) {
                int X1 = this.A.X1(s);
                if (X1 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (X1 == 0) {
                    this.w++;
                    yq5 b2 = new ct5(this.A).b();
                    c cVar = new c();
                    this.z = cVar;
                    return new b(b2, jw5.d(cVar));
                } else if (X1 == 1) {
                    if (!z) {
                        if (this.w != 0) {
                            this.y = true;
                            return null;
                        }
                        throw new ProtocolException("expected at least 1 part");
                    }
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (X1 == 2 || X1 == 3) {
                    z = true;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dr5(@NotNull kr5 kr5Var) throws IOException {
        this(r0, r3);
        String i;
        c25.p(kr5Var, "response");
        uv5 A = kr5Var.A();
        br5 k = kr5Var.k();
        if (k != null && (i = k.i("boundary")) != null) {
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}