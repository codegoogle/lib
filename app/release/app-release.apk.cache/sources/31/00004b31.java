package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yq5;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Response.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001!B}\b\u0000\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010m\u001a\u00020\u0005\u0012\u0006\u0010Q\u001a\u00020\u000b\u0012\u0006\u0010^\u001a\u00020\b\u0012\b\u0010>\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010U\u001a\u00020\u0018\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010B\u001a\u00020\u001c\u0012\u0006\u0010I\u001a\u00020\u001c\u0012\b\u0010i\u001a\u0004\u0018\u00010e¢\u0006\u0004\bn\u0010oJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b(\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b)\u0010'J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0012¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001cH\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001cH\u0007¢\u0006\u0004\b2\u00101J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\rR\u001b\u0010:\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010'R\u001b\u0010>\u001a\u0004\u0018\u00010\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0010R\u0019\u0010B\u001a\u00020\u001c8\u0007@\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u00101R\u0019\u0010F\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0004R\u0019\u0010I\u001a\u00020\u001c8\u0007@\u0006¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u00101R\u0013\u0010M\u001a\u00020J8F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0019\u0010Q\u001a\u00020\u000b8\u0007@\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010\rR\u0019\u0010U\u001a\u00020\u00188\u0007@\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u001aR\u0013\u0010W\u001a\u00020-8G@\u0006¢\u0006\u0006\u001a\u0004\bV\u0010/R\u001b\u0010Z\u001a\u0004\u0018\u00010\u001e8\u0007@\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bN\u0010\"R\u001b\u0010\\\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b[\u00108\u001a\u0004\bX\u0010'R\u0019\u0010^\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\bV\u0010]\u001a\u0004\bG\u0010\nR\u0018\u0010`\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010_R\u001b\u0010b\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\ba\u0010'R\u0013\u0010d\u001a\u00020J8F@\u0006¢\u0006\u0006\u001a\u0004\bc\u0010LR\u001e\u0010i\u001a\u0004\u0018\u00010e8\u0001@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bf\u0010hR\u0019\u0010m\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010\u0007¨\u0006p"}, d2 = {"Lcom/p7700g/p99005/jr5;", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/hr5;", "r", "()Lcom/p7700g/p99005/hr5;", "Lcom/p7700g/p99005/gr5;", com.anythink.expressad.d.a.b.dH, "()Lcom/p7700g/p99005/gr5;", "", "e", "()I", "", "j", "()Ljava/lang/String;", "Lcom/p7700g/p99005/xq5;", "f", "()Lcom/p7700g/p99005/xq5;", "name", "", "X", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "U", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p7700g/p99005/yq5;", "h", "()Lcom/p7700g/p99005/yq5;", "Z1", "", "byteCount", "Lcom/p7700g/p99005/kr5;", com.anythink.expressad.foundation.g.a.N, "(J)Lcom/p7700g/p99005/kr5;", "a", "()Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/jr5$a;", "c1", "()Lcom/p7700g/p99005/jr5$a;", "k", "()Lcom/p7700g/p99005/jr5;", "d", "l", "Lcom/p7700g/p99005/kq5;", bx.B4, "()Ljava/util/List;", "Lcom/p7700g/p99005/gq5;", "b", "()Lcom/p7700g/p99005/gq5;", "s", "()J", "q", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "toString", "C", "Lcom/p7700g/p99005/jr5;", "D1", "priorResponse", "x", "Lcom/p7700g/p99005/xq5;", "K", "handshake", "D", "J", "Y1", "sentRequestAtMillis", "t", "Lcom/p7700g/p99005/hr5;", "T1", "request", "E", "K1", "receivedResponseAtMillis", "", "Z", "()Z", "isRedirect", com.ironsource.sdk.controller.v.a, "Ljava/lang/String;", "x0", qm3.b.j, "y", "Lcom/p7700g/p99005/yq5;", "Y", "headers", "w", "cacheControl", "z", "Lcom/p7700g/p99005/kr5;", "body", AFHydra.EV_BYTECOUNT, "cacheResponse", AFHydra.STATUS_IDLE, "code", "Lcom/p7700g/p99005/gq5;", "lazyCacheControl", "X0", "networkResponse", "s1", "isSuccessful", "Lcom/p7700g/p99005/is5;", "F", "Lcom/p7700g/p99005/is5;", "()Lcom/p7700g/p99005/is5;", "exchange", "u", "Lcom/p7700g/p99005/gr5;", "J1", xu0.f.m, "<init>", "(Lcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/gr5;Ljava/lang/String;ILcom/p7700g/p99005/xq5;Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/kr5;Lcom/p7700g/p99005/jr5;Lcom/p7700g/p99005/jr5;Lcom/p7700g/p99005/jr5;JJLcom/p7700g/p99005/is5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class jr5 implements Closeable {
    @Nullable
    private final jr5 A;
    @Nullable
    private final jr5 B;
    @Nullable
    private final jr5 C;
    private final long D;
    private final long E;
    @Nullable
    private final is5 F;
    private gq5 s;
    @NotNull
    private final hr5 t;
    @NotNull
    private final gr5 u;
    @NotNull
    private final String v;
    private final int w;
    @Nullable
    private final xq5 x;
    @NotNull
    private final yq5 y;
    @Nullable
    private final kr5 z;

    public jr5(@NotNull hr5 hr5Var, @NotNull gr5 gr5Var, @NotNull String str, int i, @Nullable xq5 xq5Var, @NotNull yq5 yq5Var, @Nullable kr5 kr5Var, @Nullable jr5 jr5Var, @Nullable jr5 jr5Var2, @Nullable jr5 jr5Var3, long j, long j2, @Nullable is5 is5Var) {
        c25.p(hr5Var, "request");
        c25.p(gr5Var, xu0.f.m);
        c25.p(str, qm3.b.j);
        c25.p(yq5Var, "headers");
        this.t = hr5Var;
        this.u = gr5Var;
        this.v = str;
        this.w = i;
        this.x = xq5Var;
        this.y = yq5Var;
        this.z = kr5Var;
        this.A = jr5Var;
        this.B = jr5Var2;
        this.C = jr5Var3;
        this.D = j;
        this.E = j2;
        this.F = is5Var;
    }

    public static /* synthetic */ String W(jr5 jr5Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return jr5Var.U(str, str2);
    }

    @NotNull
    public final List<kq5> A() {
        String str;
        yq5 yq5Var = this.y;
        int i = this.w;
        if (i == 401) {
            str = sm4.x;
        } else if (i != 407) {
            return js4.F();
        } else {
            str = "Proxy-Authenticate";
        }
        return vs5.b(yq5Var, str);
    }

    @fz4(name = "priorResponse")
    @Nullable
    public final jr5 D1() {
        return this.C;
    }

    @fz4(name = "code")
    public final int E() {
        return this.w;
    }

    @fz4(name = "exchange")
    @Nullable
    public final is5 F() {
        return this.F;
    }

    @fz4(name = xu0.f.m)
    @NotNull
    public final gr5 J1() {
        return this.u;
    }

    @fz4(name = "handshake")
    @Nullable
    public final xq5 K() {
        return this.x;
    }

    @fz4(name = "receivedResponseAtMillis")
    public final long K1() {
        return this.E;
    }

    @gz4
    @Nullable
    public final String P(@NotNull String str) {
        return W(this, str, null, 2, null);
    }

    @fz4(name = "request")
    @NotNull
    public final hr5 T1() {
        return this.t;
    }

    @gz4
    @Nullable
    public final String U(@NotNull String str, @Nullable String str2) {
        c25.p(str, "name");
        String c = this.y.c(str);
        return c != null ? c : str2;
    }

    @NotNull
    public final List<String> X(@NotNull String str) {
        c25.p(str, "name");
        return this.y.u(str);
    }

    @fz4(name = "networkResponse")
    @Nullable
    public final jr5 X0() {
        return this.A;
    }

    @fz4(name = "headers")
    @NotNull
    public final yq5 Y() {
        return this.y;
    }

    @fz4(name = "sentRequestAtMillis")
    public final long Y1() {
        return this.D;
    }

    public final boolean Z() {
        int i = this.w;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @NotNull
    public final yq5 Z1() throws IOException {
        is5 is5Var = this.F;
        if (is5Var != null) {
            return is5Var.u();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @fz4(name = "-deprecated_body")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "body", imports = {}))
    @Nullable
    public final kr5 a() {
        return this.z;
    }

    @fz4(name = "-deprecated_cacheControl")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "cacheControl", imports = {}))
    @NotNull
    public final gq5 b() {
        return w();
    }

    @NotNull
    public final a c1() {
        return new a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kr5 kr5Var = this.z;
        if (kr5Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        kr5Var.close();
    }

    @fz4(name = "-deprecated_cacheResponse")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "cacheResponse", imports = {}))
    @Nullable
    public final jr5 d() {
        return this.B;
    }

    @NotNull
    public final kr5 d1(long j) throws IOException {
        kr5 kr5Var = this.z;
        c25.m(kr5Var);
        uv5 p = kr5Var.A().p();
        sv5 sv5Var = new sv5();
        p.i1(j);
        sv5Var.j1(p, Math.min(j, p.o().z2()));
        return kr5.s.f(sv5Var, this.z.k(), sv5Var.z2());
    }

    @fz4(name = "-deprecated_code")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "code", imports = {}))
    public final int e() {
        return this.w;
    }

    @fz4(name = "-deprecated_handshake")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "handshake", imports = {}))
    @Nullable
    public final xq5 f() {
        return this.x;
    }

    @fz4(name = "-deprecated_headers")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "headers", imports = {}))
    @NotNull
    public final yq5 h() {
        return this.y;
    }

    @fz4(name = "-deprecated_message")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = qm3.b.j, imports = {}))
    @NotNull
    public final String j() {
        return this.v;
    }

    @fz4(name = "-deprecated_networkResponse")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "networkResponse", imports = {}))
    @Nullable
    public final jr5 k() {
        return this.A;
    }

    @fz4(name = "-deprecated_priorResponse")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "priorResponse", imports = {}))
    @Nullable
    public final jr5 l() {
        return this.C;
    }

    @fz4(name = "-deprecated_protocol")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = xu0.f.m, imports = {}))
    @NotNull
    public final gr5 m() {
        return this.u;
    }

    @fz4(name = "-deprecated_receivedResponseAtMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "receivedResponseAtMillis", imports = {}))
    public final long q() {
        return this.E;
    }

    @fz4(name = "-deprecated_request")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "request", imports = {}))
    @NotNull
    public final hr5 r() {
        return this.t;
    }

    @fz4(name = "-deprecated_sentRequestAtMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "sentRequestAtMillis", imports = {}))
    public final long s() {
        return this.D;
    }

    public final boolean s1() {
        int i = this.w;
        return 200 <= i && 299 >= i;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Response{protocol=");
        G.append(this.u);
        G.append(", code=");
        G.append(this.w);
        G.append(", message=");
        G.append(this.v);
        G.append(", url=");
        G.append(this.t.q());
        G.append('}');
        return G.toString();
    }

    @fz4(name = "body")
    @Nullable
    public final kr5 v() {
        return this.z;
    }

    @fz4(name = "cacheControl")
    @NotNull
    public final gq5 w() {
        gq5 gq5Var = this.s;
        if (gq5Var == null) {
            gq5 c = gq5.c.c(this.y);
            this.s = c;
            return c;
        }
        return gq5Var;
    }

    @fz4(name = qm3.b.j)
    @NotNull
    public final String x0() {
        return this.v;
    }

    @fz4(name = "cacheResponse")
    @Nullable
    public final jr5 z() {
        return this.B;
    }

    /* compiled from: Response.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bt\u0010uB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bt\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\r2\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bD\u0010>\"\u0004\bF\u0010\nR$\u0010L\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010<R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bW\u0010ZR\"\u0010%\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u001a\u0004\bG\u0010]\"\u0004\b^\u0010_R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u00107\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010K\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010E\u001a\u0004\bn\u0010>\"\u0004\bo\u0010\nR$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010E\u001a\u0004\bp\u0010>\"\u0004\bq\u0010\nR\"\u00104\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010K\u001a\u0004\br\u0010k\"\u0004\bs\u0010m¨\u0006v"}, d2 = {"com/p7700g/p99005/jr5$a", "", "", "name", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/yq4;", "f", "(Ljava/lang/String;Lcom/p7700g/p99005/jr5;)V", "e", "(Lcom/p7700g/p99005/jr5;)V", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/jr5$a;", "E", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/jr5$a;", "Lcom/p7700g/p99005/gr5;", xu0.f.m, AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/gr5;)Lcom/p7700g/p99005/jr5$a;", "", "code", com.anythink.basead.d.g.i, "(I)Lcom/p7700g/p99005/jr5$a;", qm3.b.j, "y", "(Ljava/lang/String;)Lcom/p7700g/p99005/jr5$a;", "Lcom/p7700g/p99005/xq5;", "handshake", "u", "(Lcom/p7700g/p99005/xq5;)Lcom/p7700g/p99005/jr5$a;", "value", com.ironsource.sdk.controller.v.a, "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/jr5$a;", "a", "D", "Lcom/p7700g/p99005/yq5;", "headers", "w", "(Lcom/p7700g/p99005/yq5;)Lcom/p7700g/p99005/jr5$a;", "Lcom/p7700g/p99005/kr5;", "body", "b", "(Lcom/p7700g/p99005/kr5;)Lcom/p7700g/p99005/jr5$a;", "networkResponse", "z", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/jr5$a;", "cacheResponse", "d", "priorResponse", bx.B4, "", "sentRequestAtMillis", "F", "(J)Lcom/p7700g/p99005/jr5$a;", "receivedResponseAtMillis", "C", "Lcom/p7700g/p99005/is5;", "deferredTrailers", "x", "(Lcom/p7700g/p99005/is5;)V", "c", "()Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/kr5;", "h", "()Lcom/p7700g/p99005/kr5;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lcom/p7700g/p99005/kr5;)V", "i", "Lcom/p7700g/p99005/jr5;", "H", com.anythink.expressad.d.a.b.dH, "Lcom/p7700g/p99005/is5;", "k", "()Lcom/p7700g/p99005/is5;", "J", "exchange", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "Lcom/p7700g/p99005/gr5;", "q", "()Lcom/p7700g/p99005/gr5;", "P", "(Lcom/p7700g/p99005/gr5;)V", AFHydra.STATUS_IDLE, "j", "()I", "(I)V", "Lcom/p7700g/p99005/yq5$a;", "Lcom/p7700g/p99005/yq5$a;", "()Lcom/p7700g/p99005/yq5$a;", "L", "(Lcom/p7700g/p99005/yq5$a;)V", "Lcom/p7700g/p99005/hr5;", "s", "()Lcom/p7700g/p99005/hr5;", "R", "(Lcom/p7700g/p99005/hr5;)V", "Lcom/p7700g/p99005/xq5;", "l", "()Lcom/p7700g/p99005/xq5;", "K", "(Lcom/p7700g/p99005/xq5;)V", "r", "()J", "Q", "(J)V", ij3.b, "N", "p", "O", "t", "S", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static class a {
        @Nullable
        private hr5 a;
        @Nullable
        private gr5 b;
        private int c;
        @Nullable
        private String d;
        @Nullable
        private xq5 e;
        @NotNull
        private yq5.a f;
        @Nullable
        private kr5 g;
        @Nullable
        private jr5 h;
        @Nullable
        private jr5 i;
        @Nullable
        private jr5 j;
        private long k;
        private long l;
        @Nullable
        private is5 m;

        public a() {
            this.c = -1;
            this.f = new yq5.a();
        }

        private final void e(jr5 jr5Var) {
            if (jr5Var != null) {
                if (!(jr5Var.v() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, jr5 jr5Var) {
            if (jr5Var != null) {
                if (jr5Var.v() == null) {
                    if (jr5Var.X0() == null) {
                        if (jr5Var.z() == null) {
                            if (!(jr5Var.D1() == null)) {
                                throw new IllegalArgumentException(wo1.t(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(wo1.t(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(wo1.t(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(wo1.t(str, ".body != null").toString());
            }
        }

        @NotNull
        public a A(@Nullable jr5 jr5Var) {
            e(jr5Var);
            this.j = jr5Var;
            return this;
        }

        @NotNull
        public a B(@NotNull gr5 gr5Var) {
            c25.p(gr5Var, xu0.f.m);
            this.b = gr5Var;
            return this;
        }

        @NotNull
        public a C(long j) {
            this.l = j;
            return this;
        }

        @NotNull
        public a D(@NotNull String str) {
            c25.p(str, "name");
            this.f.l(str);
            return this;
        }

        @NotNull
        public a E(@NotNull hr5 hr5Var) {
            c25.p(hr5Var, "request");
            this.a = hr5Var;
            return this;
        }

        @NotNull
        public a F(long j) {
            this.k = j;
            return this;
        }

        public final void G(@Nullable kr5 kr5Var) {
            this.g = kr5Var;
        }

        public final void H(@Nullable jr5 jr5Var) {
            this.i = jr5Var;
        }

        public final void I(int i) {
            this.c = i;
        }

        public final void J(@Nullable is5 is5Var) {
            this.m = is5Var;
        }

        public final void K(@Nullable xq5 xq5Var) {
            this.e = xq5Var;
        }

        public final void L(@NotNull yq5.a aVar) {
            c25.p(aVar, "<set-?>");
            this.f = aVar;
        }

        public final void M(@Nullable String str) {
            this.d = str;
        }

        public final void N(@Nullable jr5 jr5Var) {
            this.h = jr5Var;
        }

        public final void O(@Nullable jr5 jr5Var) {
            this.j = jr5Var;
        }

        public final void P(@Nullable gr5 gr5Var) {
            this.b = gr5Var;
        }

        public final void Q(long j) {
            this.l = j;
        }

        public final void R(@Nullable hr5 hr5Var) {
            this.a = hr5Var;
        }

        public final void S(long j) {
            this.k = j;
        }

        @NotNull
        public a a(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            this.f.b(str, str2);
            return this;
        }

        @NotNull
        public a b(@Nullable kr5 kr5Var) {
            this.g = kr5Var;
            return this;
        }

        @NotNull
        public jr5 c() {
            int i = this.c;
            if (i >= 0) {
                hr5 hr5Var = this.a;
                if (hr5Var != null) {
                    gr5 gr5Var = this.b;
                    if (gr5Var != null) {
                        String str = this.d;
                        if (str != null) {
                            return new jr5(hr5Var, gr5Var, str, i, this.e, this.f.i(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder G = wo1.G("code < 0: ");
            G.append(this.c);
            throw new IllegalStateException(G.toString().toString());
        }

        @NotNull
        public a d(@Nullable jr5 jr5Var) {
            f("cacheResponse", jr5Var);
            this.i = jr5Var;
            return this;
        }

        @NotNull
        public a g(int i) {
            this.c = i;
            return this;
        }

        @Nullable
        public final kr5 h() {
            return this.g;
        }

        @Nullable
        public final jr5 i() {
            return this.i;
        }

        public final int j() {
            return this.c;
        }

        @Nullable
        public final is5 k() {
            return this.m;
        }

        @Nullable
        public final xq5 l() {
            return this.e;
        }

        @NotNull
        public final yq5.a m() {
            return this.f;
        }

        @Nullable
        public final String n() {
            return this.d;
        }

        @Nullable
        public final jr5 o() {
            return this.h;
        }

        @Nullable
        public final jr5 p() {
            return this.j;
        }

        @Nullable
        public final gr5 q() {
            return this.b;
        }

        public final long r() {
            return this.l;
        }

        @Nullable
        public final hr5 s() {
            return this.a;
        }

        public final long t() {
            return this.k;
        }

        @NotNull
        public a u(@Nullable xq5 xq5Var) {
            this.e = xq5Var;
            return this;
        }

        @NotNull
        public a v(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            this.f.m(str, str2);
            return this;
        }

        @NotNull
        public a w(@NotNull yq5 yq5Var) {
            c25.p(yq5Var, "headers");
            this.f = yq5Var.m();
            return this;
        }

        public final void x(@NotNull is5 is5Var) {
            c25.p(is5Var, "deferredTrailers");
            this.m = is5Var;
        }

        @NotNull
        public a y(@NotNull String str) {
            c25.p(str, qm3.b.j);
            this.d = str;
            return this;
        }

        @NotNull
        public a z(@Nullable jr5 jr5Var) {
            f("networkResponse", jr5Var);
            this.h = jr5Var;
            return this;
        }

        public a(@NotNull jr5 jr5Var) {
            c25.p(jr5Var, "response");
            this.c = -1;
            this.a = jr5Var.T1();
            this.b = jr5Var.J1();
            this.c = jr5Var.E();
            this.d = jr5Var.x0();
            this.e = jr5Var.K();
            this.f = jr5Var.Y().m();
            this.g = jr5Var.v();
            this.h = jr5Var.X0();
            this.i = jr5Var.z();
            this.j = jr5Var.D1();
            this.k = jr5Var.Y1();
            this.l = jr5Var.K1();
            this.m = jr5Var.F();
        }
    }
}