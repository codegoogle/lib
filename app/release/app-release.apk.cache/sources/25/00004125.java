package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.dv5;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.vq5;
import com.p7700g.p99005.xu0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoggingEventListener.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001MB\u0011\b\u0002\u0012\u0006\u0010R\u001a\u00020P¢\u0006\u0004\bS\u0010TJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\nJ!\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010\nJ\u001f\u00105\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\nJ\u001f\u0010:\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010\nJ\u001f\u0010A\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\nJ\u001f\u0010D\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010;J\u001f\u0010E\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010=J\u0017\u0010F\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010\nJ\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010=J\u0017\u0010H\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\nJ\u001f\u0010I\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bI\u0010BJ\u001f\u0010J\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010\nJ\u001f\u0010M\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010L\u001a\u00020?H\u0016¢\u0006\u0004\bM\u0010BR\u0016\u0010O\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010NR\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010Q¨\u0006U"}, d2 = {"Lcom/p7700g/p99005/ev5;", "Lcom/p7700g/p99005/vq5;", "", qm3.b.j, "Lcom/p7700g/p99005/yq4;", "D", "(Ljava/lang/String;)V", "Lcom/p7700g/p99005/hq5;", kg.p0, "f", "(Lcom/p7700g/p99005/hq5;)V", "Lcom/p7700g/p99005/zq5;", "url", "p", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/zq5;)V", "", "Ljava/net/Proxy;", "proxies", ij3.b, "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/zq5;Ljava/util/List;)V", "domainName", "n", "(Lcom/p7700g/p99005/hq5;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/hq5;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "Lcom/p7700g/p99005/xq5;", "handshake", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/xq5;)V", "Lcom/p7700g/p99005/gr5;", xu0.f.m, "h", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/p7700g/p99005/gr5;)V", "Ljava/io/IOException;", "ioe", "i", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/p7700g/p99005/gr5;Ljava/io/IOException;)V", "Lcom/p7700g/p99005/mq5;", "connection", "k", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/mq5;)V", "l", "u", "Lcom/p7700g/p99005/hr5;", "request", "t", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/hr5;)V", "r", "", "byteCount", "q", "(Lcom/p7700g/p99005/hq5;J)V", "s", "(Lcom/p7700g/p99005/hq5;Ljava/io/IOException;)V", "z", "Lcom/p7700g/p99005/jr5;", "response", "y", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/jr5;)V", "w", com.ironsource.sdk.controller.v.a, "x", "d", "e", com.anythink.basead.d.g.i, bx.B4, "b", "c", "cachedResponse", "a", "J", "startNs", "Lcom/p7700g/p99005/dv5$b;", "Lcom/p7700g/p99005/dv5$b;", "logger", "<init>", "(Lcom/p7700g/p99005/dv5$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ev5 extends vq5 {
    private long c;
    private final dv5.b d;

    /* compiled from: LoggingEventListener.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"com/p7700g/p99005/ev5$a", "Lcom/p7700g/p99005/vq5$c;", "Lcom/p7700g/p99005/hq5;", kg.p0, "Lcom/p7700g/p99005/vq5;", "a", "(Lcom/p7700g/p99005/hq5;)Lcom/p7700g/p99005/vq5;", "Lcom/p7700g/p99005/dv5$b;", "Lcom/p7700g/p99005/dv5$b;", "logger", "<init>", "(Lcom/p7700g/p99005/dv5$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static class a implements vq5.c {
        private final dv5.b a;

        @gz4
        public a() {
            this(null, 1, null);
        }

        @gz4
        public a(@NotNull dv5.b bVar) {
            c25.p(bVar, "logger");
            this.a = bVar;
        }

        @Override // com.p7700g.p99005.vq5.c
        @NotNull
        public vq5 a(@NotNull hq5 hq5Var) {
            c25.p(hq5Var, kg.p0);
            return new ev5(this.a, null);
        }

        public /* synthetic */ a(dv5.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? dv5.b.a : bVar);
        }
    }

    public /* synthetic */ ev5(dv5.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    private final void D(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.c);
        dv5.b bVar = this.d;
        bVar.a(f14.u + millis + " ms] " + str);
    }

    @Override // com.p7700g.p99005.vq5
    public void A(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
        D("satisfactionFailure: " + jr5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void B(@NotNull hq5 hq5Var, @Nullable xq5 xq5Var) {
        c25.p(hq5Var, kg.p0);
        D("secureConnectEnd: " + xq5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void C(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("secureConnectStart");
    }

    @Override // com.p7700g.p99005.vq5
    public void a(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "cachedResponse");
        D("cacheConditionalHit: " + jr5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void b(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
        D("cacheHit: " + jr5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void c(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("cacheMiss");
    }

    @Override // com.p7700g.p99005.vq5
    public void d(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("callEnd");
    }

    @Override // com.p7700g.p99005.vq5
    public void e(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
        D("callFailed: " + iOException);
    }

    @Override // com.p7700g.p99005.vq5
    public void f(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        this.c = System.nanoTime();
        StringBuilder G = wo1.G("callStart: ");
        G.append(hq5Var.x0());
        D(G.toString());
    }

    @Override // com.p7700g.p99005.vq5
    public void g(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("canceled");
    }

    @Override // com.p7700g.p99005.vq5
    public void h(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable gr5 gr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
        D("connectEnd: " + gr5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void i(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable gr5 gr5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
        c25.p(iOException, "ioe");
        D("connectFailed: " + gr5Var + gl4.R + iOException);
    }

    @Override // com.p7700g.p99005.vq5
    public void j(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
        D("connectStart: " + inetSocketAddress + gl4.R + proxy);
    }

    @Override // com.p7700g.p99005.vq5
    public void k(@NotNull hq5 hq5Var, @NotNull mq5 mq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(mq5Var, "connection");
        D("connectionAcquired: " + mq5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void l(@NotNull hq5 hq5Var, @NotNull mq5 mq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(mq5Var, "connection");
        D("connectionReleased");
    }

    @Override // com.p7700g.p99005.vq5
    public void m(@NotNull hq5 hq5Var, @NotNull String str, @NotNull List<? extends InetAddress> list) {
        c25.p(hq5Var, kg.p0);
        c25.p(str, "domainName");
        c25.p(list, "inetAddressList");
        D("dnsEnd: " + list);
    }

    @Override // com.p7700g.p99005.vq5
    public void n(@NotNull hq5 hq5Var, @NotNull String str) {
        c25.p(hq5Var, kg.p0);
        c25.p(str, "domainName");
        D("dnsStart: " + str);
    }

    @Override // com.p7700g.p99005.vq5
    public void o(@NotNull hq5 hq5Var, @NotNull zq5 zq5Var, @NotNull List<? extends Proxy> list) {
        c25.p(hq5Var, kg.p0);
        c25.p(zq5Var, "url");
        c25.p(list, "proxies");
        D("proxySelectEnd: " + list);
    }

    @Override // com.p7700g.p99005.vq5
    public void p(@NotNull hq5 hq5Var, @NotNull zq5 zq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(zq5Var, "url");
        D("proxySelectStart: " + zq5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void q(@NotNull hq5 hq5Var, long j) {
        c25.p(hq5Var, kg.p0);
        D("requestBodyEnd: byteCount=" + j);
    }

    @Override // com.p7700g.p99005.vq5
    public void r(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("requestBodyStart");
    }

    @Override // com.p7700g.p99005.vq5
    public void s(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
        D("requestFailed: " + iOException);
    }

    @Override // com.p7700g.p99005.vq5
    public void t(@NotNull hq5 hq5Var, @NotNull hr5 hr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(hr5Var, "request");
        D("requestHeadersEnd");
    }

    @Override // com.p7700g.p99005.vq5
    public void u(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("requestHeadersStart");
    }

    @Override // com.p7700g.p99005.vq5
    public void v(@NotNull hq5 hq5Var, long j) {
        c25.p(hq5Var, kg.p0);
        D("responseBodyEnd: byteCount=" + j);
    }

    @Override // com.p7700g.p99005.vq5
    public void w(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("responseBodyStart");
    }

    @Override // com.p7700g.p99005.vq5
    public void x(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
        D("responseFailed: " + iOException);
    }

    @Override // com.p7700g.p99005.vq5
    public void y(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
        D("responseHeadersEnd: " + jr5Var);
    }

    @Override // com.p7700g.p99005.vq5
    public void z(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
        D("responseHeadersStart");
    }

    private ev5(dv5.b bVar) {
        this.d = bVar;
    }
}