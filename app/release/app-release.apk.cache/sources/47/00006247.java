package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.xu0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventListener.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 H2\u00020\u0001:\u0002HIB\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\r0\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J!\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J9\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010\u0006J\u001f\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u0010\u0006J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010\u0006J\u001f\u0010?\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010\u0006J\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bB\u00109J\u001f\u0010C\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bC\u0010;J\u0017\u0010D\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010\u0006J\u001f\u0010E\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bE\u0010;J\u0017\u0010F\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bF\u0010\u0006J\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bG\u0010@J\u001f\u0010H\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bH\u0010@J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010\u0006J\u001f\u0010K\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010J\u001a\u00020=H\u0016¢\u0006\u0004\bK\u0010@¨\u0006N"}, d2 = {"Lcom/p7700g/p99005/vq5;", "", "Lcom/p7700g/p99005/hq5;", kg.p0, "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/hq5;)V", "Lcom/p7700g/p99005/zq5;", "url", "p", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/zq5;)V", "", "Ljava/net/Proxy;", "Lcom/p7700g/p99005/kz4;", "proxies", ij3.b, "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/zq5;Ljava/util/List;)V", "", "domainName", "n", "(Lcom/p7700g/p99005/hq5;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/hq5;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "Lcom/p7700g/p99005/xq5;", "handshake", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/xq5;)V", "Lcom/p7700g/p99005/gr5;", xu0.f.m, "h", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/p7700g/p99005/gr5;)V", "Ljava/io/IOException;", "ioe", "i", "(Lcom/p7700g/p99005/hq5;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/p7700g/p99005/gr5;Ljava/io/IOException;)V", "Lcom/p7700g/p99005/mq5;", "connection", "k", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/mq5;)V", "l", "u", "Lcom/p7700g/p99005/hr5;", "request", "t", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/hr5;)V", "r", "", "byteCount", "q", "(Lcom/p7700g/p99005/hq5;J)V", "s", "(Lcom/p7700g/p99005/hq5;Ljava/io/IOException;)V", "z", "Lcom/p7700g/p99005/jr5;", "response", "y", "(Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/jr5;)V", "w", com.ironsource.sdk.controller.v.a, "x", "d", "e", com.anythink.basead.d.g.i, bx.B4, "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class vq5 {
    public static final b b = new b(null);
    @cz4
    @NotNull
    public static final vq5 a = new a();

    /* compiled from: EventListener.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/p7700g/p99005/vq5$a", "Lcom/p7700g/p99005/vq5;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a extends vq5 {
    }

    /* compiled from: EventListener.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/vq5$b", "", "Lcom/p7700g/p99005/vq5;", "NONE", "Lcom/p7700g/p99005/vq5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/vq5$c", "", "Lcom/p7700g/p99005/hq5;", kg.p0, "Lcom/p7700g/p99005/vq5;", "a", "(Lcom/p7700g/p99005/hq5;)Lcom/p7700g/p99005/vq5;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface c {
        @NotNull
        vq5 a(@NotNull hq5 hq5Var);
    }

    public void A(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
    }

    public void B(@NotNull hq5 hq5Var, @Nullable xq5 xq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void C(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void a(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "cachedResponse");
    }

    public void b(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
    }

    public void c(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void d(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void e(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
    }

    public void f(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void g(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void h(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable gr5 gr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
    }

    public void i(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable gr5 gr5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
        c25.p(iOException, "ioe");
    }

    public void j(@NotNull hq5 hq5Var, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        c25.p(hq5Var, kg.p0);
        c25.p(inetSocketAddress, "inetSocketAddress");
        c25.p(proxy, "proxy");
    }

    public void k(@NotNull hq5 hq5Var, @NotNull mq5 mq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(mq5Var, "connection");
    }

    public void l(@NotNull hq5 hq5Var, @NotNull mq5 mq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(mq5Var, "connection");
    }

    public void m(@NotNull hq5 hq5Var, @NotNull String str, @NotNull List<InetAddress> list) {
        c25.p(hq5Var, kg.p0);
        c25.p(str, "domainName");
        c25.p(list, "inetAddressList");
    }

    public void n(@NotNull hq5 hq5Var, @NotNull String str) {
        c25.p(hq5Var, kg.p0);
        c25.p(str, "domainName");
    }

    public void o(@NotNull hq5 hq5Var, @NotNull zq5 zq5Var, @NotNull List<Proxy> list) {
        c25.p(hq5Var, kg.p0);
        c25.p(zq5Var, "url");
        c25.p(list, "proxies");
    }

    public void p(@NotNull hq5 hq5Var, @NotNull zq5 zq5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(zq5Var, "url");
    }

    public void q(@NotNull hq5 hq5Var, long j) {
        c25.p(hq5Var, kg.p0);
    }

    public void r(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void s(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
    }

    public void t(@NotNull hq5 hq5Var, @NotNull hr5 hr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(hr5Var, "request");
    }

    public void u(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void v(@NotNull hq5 hq5Var, long j) {
        c25.p(hq5Var, kg.p0);
    }

    public void w(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }

    public void x(@NotNull hq5 hq5Var, @NotNull IOException iOException) {
        c25.p(hq5Var, kg.p0);
        c25.p(iOException, "ioe");
    }

    public void y(@NotNull hq5 hq5Var, @NotNull jr5 jr5Var) {
        c25.p(hq5Var, kg.p0);
        c25.p(jr5Var, "response");
    }

    public void z(@NotNull hq5 hq5Var) {
        c25.p(hq5Var, kg.p0);
    }
}