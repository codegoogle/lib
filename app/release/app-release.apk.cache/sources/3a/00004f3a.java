package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.jr5;
import com.p7700g.p99005.jt5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.xq5;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yu5;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealConnection.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001cB\u001a\u0012\u0006\u0010z\u001a\u00020v\u0012\u0007\u0010\u0080\u0001\u001a\u00020\"¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u000bH\u0000¢\u0006\u0004\b0\u0010.JE\u00102\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u00101\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020$2\u0006\u00105\u001a\u0002042\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0000¢\u0006\u0004\b7\u00108J\u001f\u0010>\u001a\u00020=2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\"H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u000b¢\u0006\u0004\bG\u0010.J\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020$¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0011\u0010X\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bX\u0010YJ'\u0010]\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\u0006\u0010Z\u001a\u00020\"2\u0006\u0010\\\u001a\u00020[H\u0000¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020_2\b\u0010V\u001a\u0004\u0018\u00010[H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gR%\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0i0h8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010j\u001a\u0004\bk\u0010lR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010u\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0019\u0010z\u001a\u00020v8\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\bw\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010pR\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0089\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0082\u0001R'\u0010\u0091\u0001\u001a\u00030\u008d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bk\u0010s\u001a\u0005\b~\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u008f\u0001R'\u0010\u0098\u0001\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0017\u0010\u008f\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0005\b\u0097\u0001\u0010\u0016R\u0018\u0010\u009a\u0001\u001a\u00020$8@@\u0000X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010rR\u0018\u0010\u009b\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u008f\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u008f\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/p7700g/p99005/ls5;", "Lcom/p7700g/p99005/jt5$d;", "Lcom/p7700g/p99005/mq5;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lcom/p7700g/p99005/hq5;", kg.p0, "Lcom/p7700g/p99005/vq5;", "eventListener", "Lcom/p7700g/p99005/yq4;", "q", "(IIILcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/vq5;)V", ij3.b, "(IILcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/vq5;)V", "Lcom/p7700g/p99005/hs5;", "connectionSpecSelector", "pingIntervalMillis", "t", "(Lcom/p7700g/p99005/hs5;ILcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/vq5;)V", "L", "(I)V", "p", "(Lcom/p7700g/p99005/hs5;)V", "Lcom/p7700g/p99005/hr5;", "tunnelRequest", "Lcom/p7700g/p99005/zq5;", "url", "r", "(IILcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/zq5;)Lcom/p7700g/p99005/hr5;", "s", "()Lcom/p7700g/p99005/hr5;", "", "Lcom/p7700g/p99005/lr5;", "candidates", "", "H", "(Ljava/util/List;)Z", "M", "(Lcom/p7700g/p99005/zq5;)Z", "Lcom/p7700g/p99005/xq5;", "handshake", "l", "(Lcom/p7700g/p99005/zq5;Lcom/p7700g/p99005/xq5;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()V", "F", "z", "connectionRetryEnabled", com.anythink.expressad.d.a.b.dH, "(IIIIZLcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/vq5;)V", "Lcom/p7700g/p99005/dq5;", "address", "routes", bx.B4, "(Lcom/p7700g/p99005/dq5;Ljava/util/List;)Z", "Lcom/p7700g/p99005/fr5;", m31.a, "Lcom/p7700g/p99005/xs5;", "chain", "Lcom/p7700g/p99005/us5;", "D", "(Lcom/p7700g/p99005/fr5;Lcom/p7700g/p99005/xs5;)Lcom/p7700g/p99005/us5;", "Lcom/p7700g/p99005/is5;", "exchange", "Lcom/p7700g/p99005/yu5$d;", "E", "(Lcom/p7700g/p99005/is5;)Lcom/p7700g/p99005/yu5$d;", "b", "()Lcom/p7700g/p99005/lr5;", "k", "Ljava/net/Socket;", "d", "()Ljava/net/Socket;", "doExtensiveChecks", AFHydra.EV_BYTECOUNT, "(Z)Z", "Lcom/p7700g/p99005/mt5;", "stream", "f", "(Lcom/p7700g/p99005/mt5;)V", "Lcom/p7700g/p99005/jt5;", "connection", "Lcom/p7700g/p99005/qt5;", "settings", "e", "(Lcom/p7700g/p99005/jt5;Lcom/p7700g/p99005/qt5;)V", "c", "()Lcom/p7700g/p99005/xq5;", "failedRoute", "Ljava/io/IOException;", "failure", "n", "(Lcom/p7700g/p99005/fr5;Lcom/p7700g/p99005/lr5;Ljava/io/IOException;)V", "Lcom/p7700g/p99005/ks5;", "N", "(Lcom/p7700g/p99005/ks5;Ljava/io/IOException;)V", "Lcom/p7700g/p99005/gr5;", "a", "()Lcom/p7700g/p99005/gr5;", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "u", "()Ljava/util/List;", "calls", "i", "Lcom/p7700g/p99005/xq5;", "Z", "x", "()Z", "J", "(Z)V", "noNewExchanges", "Lcom/p7700g/p99005/ns5;", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/ns5;", "()Lcom/p7700g/p99005/ns5;", "connectionPool", "Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/tv5;", "sink", "w", "Lcom/p7700g/p99005/lr5;", "route", "h", "Ljava/net/Socket;", "socket", "j", "Lcom/p7700g/p99005/gr5;", xu0.f.m, "noCoalescedConnections", "Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/uv5;", rs2.f.b, com.anythink.basead.d.g.i, "rawSocket", "", "()J", AFHydra.STATUS_IDLE, "(J)V", "idleAtNs", "Lcom/p7700g/p99005/jt5;", "http2Connection", "successCount", "y", "()I", "K", "routeFailureCount", "C", "isMultiplexed", "refusedStreamCount", "allocationLimit", "<init>", "(Lcom/p7700g/p99005/ns5;Lcom/p7700g/p99005/lr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ls5 extends jt5.d implements mq5 {
    private static final String c = "throw with null exception";
    private static final int d = 21;
    public static final long e = 10000000000L;
    public static final a f = new a(null);
    private Socket g;
    private Socket h;
    private xq5 i;
    private gr5 j;
    private jt5 k;
    private uv5 l;
    private tv5 m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    @NotNull
    private final List<Reference<ks5>> t;
    private long u;
    @NotNull
    private final ns5 v;
    private final lr5 w;

    /* compiled from: RealConnection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"com/p7700g/p99005/ls5$a", "", "Lcom/p7700g/p99005/ns5;", "connectionPool", "Lcom/p7700g/p99005/lr5;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lcom/p7700g/p99005/ls5;", "a", "(Lcom/p7700g/p99005/ns5;Lcom/p7700g/p99005/lr5;Ljava/net/Socket;J)Lcom/p7700g/p99005/ls5;", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", AFHydra.STATUS_IDLE, "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final ls5 a(@NotNull ns5 ns5Var, @NotNull lr5 lr5Var, @NotNull Socket socket, long j) {
            c25.p(ns5Var, "connectionPool");
            c25.p(lr5Var, "route");
            c25.p(socket, "socket");
            ls5 ls5Var = new ls5(ns5Var, lr5Var);
            ls5Var.h = socket;
            ls5Var.I(j);
            return ls5Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<List<? extends Certificate>> {
        public final /* synthetic */ jq5 t;
        public final /* synthetic */ xq5 u;
        public final /* synthetic */ dq5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jq5 jq5Var, xq5 xq5Var, dq5 dq5Var) {
            super(0);
            this.t = jq5Var;
            this.u = xq5Var;
            this.v = dq5Var;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final List<Certificate> x() {
            ru5 e = this.t.e();
            c25.m(e);
            return e.a(this.u.m(), this.v.w().F());
        }
    }

    /* compiled from: RealConnection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<List<? extends X509Certificate>> {
        public c() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final List<X509Certificate> x() {
            xq5 xq5Var = ls5.this.i;
            c25.m(xq5Var);
            List<Certificate> m = xq5Var.m();
            ArrayList arrayList = new ArrayList(ks4.Z(m, 10));
            for (Certificate certificate : m) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: RealConnection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/ls5$d", "Lcom/p7700g/p99005/yu5$d;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class d extends yu5.d {
        public final /* synthetic */ is5 v;
        public final /* synthetic */ uv5 w;
        public final /* synthetic */ tv5 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(is5 is5Var, uv5 uv5Var, tv5 tv5Var, boolean z, uv5 uv5Var2, tv5 tv5Var2) {
            super(z, uv5Var2, tv5Var2);
            this.v = is5Var;
            this.w = uv5Var;
            this.x = tv5Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.v.a(-1L, true, true, null);
        }
    }

    public ls5(@NotNull ns5 ns5Var, @NotNull lr5 lr5Var) {
        c25.p(ns5Var, "connectionPool");
        c25.p(lr5Var, "route");
        this.v = ns5Var;
        this.w = lr5Var;
        this.s = 1;
        this.t = new ArrayList();
        this.u = Long.MAX_VALUE;
    }

    private final boolean H(List<lr5> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (lr5 lr5Var : list) {
                if (lr5Var.e().type() == Proxy.Type.DIRECT && this.w.e().type() == Proxy.Type.DIRECT && c25.g(this.w.g(), lr5Var.g())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void L(int i) throws IOException {
        Socket socket = this.h;
        c25.m(socket);
        uv5 uv5Var = this.l;
        c25.m(uv5Var);
        tv5 tv5Var = this.m;
        c25.m(tv5Var);
        socket.setSoTimeout(0);
        jt5 a2 = new jt5.b(true, fs5.a).y(socket, this.w.d().w().F(), uv5Var, tv5Var).k(this).l(i).a();
        this.k = a2;
        this.s = jt5.y.a().f();
        jt5.w2(a2, false, null, 3, null);
    }

    private final boolean M(zq5 zq5Var) {
        xq5 xq5Var;
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        zq5 w = this.w.d().w();
        if (zq5Var.N() != w.N()) {
            return false;
        }
        if (c25.g(zq5Var.F(), w.F())) {
            return true;
        }
        if (this.o || (xq5Var = this.i) == null) {
            return false;
        }
        c25.m(xq5Var);
        return l(zq5Var, xq5Var);
    }

    private final boolean l(zq5 zq5Var, xq5 xq5Var) {
        List<Certificate> m = xq5Var.m();
        if (!m.isEmpty()) {
            su5 su5Var = su5.c;
            String F = zq5Var.F();
            Certificate certificate = m.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (su5Var.c(F, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void o(int i, int i2, hq5 hq5Var, vq5 vq5Var) throws IOException {
        Socket socket;
        int i3;
        Proxy e2 = this.w.e();
        dq5 d2 = this.w.d();
        Proxy.Type type = e2.type();
        if (type == null || ((i3 = ms5.a[type.ordinal()]) != 1 && i3 != 2)) {
            socket = new Socket(e2);
        } else {
            socket = d2.u().createSocket();
            c25.m(socket);
        }
        this.g = socket;
        vq5Var.j(hq5Var, this.w.g(), e2);
        socket.setSoTimeout(i2);
        try {
            au5.e.g().g(socket, this.w.g(), i);
            try {
                this.l = jw5.d(jw5.t(socket));
                this.m = jw5.c(jw5.o(socket));
            } catch (NullPointerException e3) {
                if (c25.g(e3.getMessage(), c)) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            StringBuilder G = wo1.G("Failed to connect to ");
            G.append(this.w.g());
            ConnectException connectException = new ConnectException(G.toString());
            connectException.initCause(e4);
            throw connectException;
        }
    }

    private final void p(hs5 hs5Var) throws IOException {
        dq5 d2 = this.w.d();
        SSLSocketFactory v = d2.v();
        SSLSocket sSLSocket = null;
        try {
            c25.m(v);
            Socket createSocket = v.createSocket(this.g, d2.w().F(), d2.w().N(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    oq5 a2 = hs5Var.a(sSLSocket2);
                    if (a2.k()) {
                        au5.e.g().f(sSLSocket2, d2.w().F(), d2.q());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    xq5.a aVar = xq5.a;
                    c25.o(session, "sslSocketSession");
                    xq5 b2 = aVar.b(session);
                    HostnameVerifier p = d2.p();
                    c25.m(p);
                    if (!p.verify(d2.w().F(), session)) {
                        List<Certificate> m = b2.m();
                        if (!m.isEmpty()) {
                            Certificate certificate = m.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb = new StringBuilder();
                            sb.append("\n              |Hostname ");
                            sb.append(d2.w().F());
                            sb.append(" not verified:\n              |    certificate: ");
                            sb.append(jq5.b.a(x509Certificate));
                            sb.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            c25.o(subjectDN, "cert.subjectDN");
                            sb.append(subjectDN.getName());
                            sb.append("\n              |    subjectAltNames: ");
                            sb.append(su5.c.a(x509Certificate));
                            sb.append("\n              ");
                            throw new SSLPeerUnverifiedException(u85.r(sb.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + d2.w().F() + " not verified (no certificates)");
                    }
                    jq5 l = d2.l();
                    c25.m(l);
                    this.i = new xq5(b2.o(), b2.g(), b2.k(), new b(l, b2, d2));
                    l.c(d2.w().F(), new c());
                    String j = a2.k() ? au5.e.g().j(sSLSocket2) : null;
                    this.h = sSLSocket2;
                    this.l = jw5.d(jw5.t(sSLSocket2));
                    this.m = jw5.c(jw5.o(sSLSocket2));
                    this.j = j != null ? gr5.z.a(j) : gr5.HTTP_1_1;
                    au5.e.g().c(sSLSocket2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        au5.e.g().c(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        sr5.n(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void q(int i, int i2, int i3, hq5 hq5Var, vq5 vq5Var) throws IOException {
        hr5 s = s();
        zq5 q = s.q();
        for (int i4 = 0; i4 < 21; i4++) {
            o(i, i2, hq5Var, vq5Var);
            s = r(i2, i3, s, q);
            if (s == null) {
                return;
            }
            Socket socket = this.g;
            if (socket != null) {
                sr5.n(socket);
            }
            this.g = null;
            this.m = null;
            this.l = null;
            vq5Var.h(hq5Var, this.w.g(), this.w.e(), null);
        }
    }

    private final hr5 r(int i, int i2, hr5 hr5Var, zq5 zq5Var) throws IOException {
        StringBuilder G = wo1.G("CONNECT ");
        G.append(sr5.a0(zq5Var, true));
        G.append(" HTTP/1.1");
        String sb = G.toString();
        while (true) {
            uv5 uv5Var = this.l;
            c25.m(uv5Var);
            tv5 tv5Var = this.m;
            c25.m(tv5Var);
            dt5 dt5Var = new dt5(null, this, uv5Var, tv5Var);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            uv5Var.timeout().i(i, timeUnit);
            tv5Var.timeout().i(i2, timeUnit);
            dt5Var.C(hr5Var.k(), sb);
            dt5Var.a();
            jr5.a d2 = dt5Var.d(false);
            c25.m(d2);
            jr5 c2 = d2.E(hr5Var).c();
            dt5Var.B(c2);
            int E = c2.E();
            if (E == 200) {
                if (uv5Var.o().f0() && tv5Var.o().f0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (E == 407) {
                hr5 a2 = this.w.d().s().a(this.w, c2);
                if (a2 != null) {
                    if (b95.K1(com.anythink.expressad.foundation.d.c.cd, jr5.W(c2, "Connection", null, 2, null), true)) {
                        return a2;
                    }
                    hr5Var = a2;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                StringBuilder G2 = wo1.G("Unexpected response code for CONNECT: ");
                G2.append(c2.E());
                throw new IOException(G2.toString());
            }
        }
    }

    private final hr5 s() throws IOException {
        hr5 b2 = new hr5.a().D(this.w.d().w()).p("CONNECT", null).n(sm4.o, sr5.a0(this.w.d().w(), true)).n("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.c.c).n(sm4.v, sr5.j).b();
        hr5 a2 = this.w.d().s().a(this.w, new jr5.a().E(b2).B(gr5.HTTP_1_1).g(407).y("Preemptive Authenticate").b(sr5.c).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a2 != null ? a2 : b2;
    }

    private final void t(hs5 hs5Var, int i, hq5 hq5Var, vq5 vq5Var) throws IOException {
        if (this.w.d().v() == null) {
            List<gr5> q = this.w.d().q();
            gr5 gr5Var = gr5.H2_PRIOR_KNOWLEDGE;
            if (q.contains(gr5Var)) {
                this.h = this.g;
                this.j = gr5Var;
                L(i);
                return;
            }
            this.h = this.g;
            this.j = gr5.HTTP_1_1;
            return;
        }
        vq5Var.C(hq5Var);
        p(hs5Var);
        vq5Var.B(hq5Var, this.i);
        if (this.j == gr5.HTTP_2) {
            L(i);
        }
    }

    public final boolean A(@NotNull dq5 dq5Var, @Nullable List<lr5> list) {
        c25.p(dq5Var, "address");
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        } else if (this.t.size() >= this.s || this.n || !this.w.d().o(dq5Var)) {
            return false;
        } else {
            if (c25.g(dq5Var.w().F(), b().d().w().F())) {
                return true;
            }
            if (this.k != null && list != null && H(list) && dq5Var.p() == su5.c && M(dq5Var.w())) {
                try {
                    jq5 l = dq5Var.l();
                    c25.m(l);
                    String F = dq5Var.w().F();
                    xq5 c2 = c();
                    c25.m(c2);
                    l.a(F, c2.m());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public final boolean B(boolean z) {
        long j;
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.g;
        c25.m(socket);
        Socket socket2 = this.h;
        c25.m(socket2);
        uv5 uv5Var = this.l;
        c25.m(uv5Var);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        jt5 jt5Var = this.k;
        if (jt5Var != null) {
            return jt5Var.c2(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.u;
        }
        if (j < e || !z) {
            return true;
        }
        return sr5.K(socket2, uv5Var);
    }

    public final boolean C() {
        return this.k != null;
    }

    @NotNull
    public final us5 D(@NotNull fr5 fr5Var, @NotNull xs5 xs5Var) throws SocketException {
        c25.p(fr5Var, m31.a);
        c25.p(xs5Var, "chain");
        Socket socket = this.h;
        c25.m(socket);
        uv5 uv5Var = this.l;
        c25.m(uv5Var);
        tv5 tv5Var = this.m;
        c25.m(tv5Var);
        jt5 jt5Var = this.k;
        if (jt5Var != null) {
            return new kt5(fr5Var, this, xs5Var, jt5Var);
        }
        socket.setSoTimeout(xs5Var.b());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uv5Var.timeout().i(xs5Var.n(), timeUnit);
        tv5Var.timeout().i(xs5Var.p(), timeUnit);
        return new dt5(fr5Var, this, uv5Var, tv5Var);
    }

    @NotNull
    public final yu5.d E(@NotNull is5 is5Var) throws SocketException {
        c25.p(is5Var, "exchange");
        Socket socket = this.h;
        c25.m(socket);
        uv5 uv5Var = this.l;
        c25.m(uv5Var);
        tv5 tv5Var = this.m;
        c25.m(tv5Var);
        socket.setSoTimeout(0);
        G();
        return new d(is5Var, uv5Var, tv5Var, true, uv5Var, tv5Var);
    }

    public final synchronized void F() {
        this.o = true;
    }

    public final synchronized void G() {
        this.n = true;
    }

    public final void I(long j) {
        this.u = j;
    }

    public final void J(boolean z) {
        this.n = z;
    }

    public final void K(int i) {
        this.p = i;
    }

    public final synchronized void N(@NotNull ks5 ks5Var, @Nullable IOException iOException) {
        c25.p(ks5Var, kg.p0);
        if (iOException instanceof rt5) {
            if (((rt5) iOException).s == ft5.REFUSED_STREAM) {
                int i = this.r + 1;
                this.r = i;
                if (i > 1) {
                    this.n = true;
                    this.p++;
                }
            } else if (((rt5) iOException).s != ft5.CANCEL || !ks5Var.c1()) {
                this.n = true;
                this.p++;
            }
        } else if (!C() || (iOException instanceof et5)) {
            this.n = true;
            if (this.q == 0) {
                if (iOException != null) {
                    n(ks5Var.n(), this.w, iOException);
                }
                this.p++;
            }
        }
    }

    @Override // com.p7700g.p99005.mq5
    @NotNull
    public gr5 a() {
        gr5 gr5Var = this.j;
        c25.m(gr5Var);
        return gr5Var;
    }

    @Override // com.p7700g.p99005.mq5
    @NotNull
    public lr5 b() {
        return this.w;
    }

    @Override // com.p7700g.p99005.mq5
    @Nullable
    public xq5 c() {
        return this.i;
    }

    @Override // com.p7700g.p99005.mq5
    @NotNull
    public Socket d() {
        Socket socket = this.h;
        c25.m(socket);
        return socket;
    }

    @Override // com.p7700g.p99005.jt5.d
    public synchronized void e(@NotNull jt5 jt5Var, @NotNull qt5 qt5Var) {
        c25.p(jt5Var, "connection");
        c25.p(qt5Var, "settings");
        this.s = qt5Var.f();
    }

    @Override // com.p7700g.p99005.jt5.d
    public void f(@NotNull mt5 mt5Var) throws IOException {
        c25.p(mt5Var, "stream");
        mt5Var.d(ft5.REFUSED_STREAM, null);
    }

    public final void k() {
        Socket socket = this.g;
        if (socket != null) {
            sr5.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: IOException -> 0x00f1, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f1, blocks: (B:21:0x008c, B:23:0x0094), top: B:65:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[EDGE_INSN: B:72:0x013f->B:60:0x013f ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, int i2, int i3, int i4, boolean z, @NotNull hq5 hq5Var, @NotNull vq5 vq5Var) {
        Socket socket;
        Socket socket2;
        c25.p(hq5Var, kg.p0);
        c25.p(vq5Var, "eventListener");
        if (this.j == null) {
            List<oq5> m = this.w.d().m();
            hs5 hs5Var = new hs5(m);
            if (this.w.d().v() == null) {
                if (m.contains(oq5.f)) {
                    String F = this.w.d().w().F();
                    if (!au5.e.g().l(F)) {
                        throw new ps5(new UnknownServiceException(wo1.u("CLEARTEXT communication to ", F, " not permitted by network security policy")));
                    }
                } else {
                    throw new ps5(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.w.d().q().contains(gr5.H2_PRIOR_KNOWLEDGE)) {
                throw new ps5(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            ps5 ps5Var = null;
            do {
                try {
                    try {
                        if (this.w.f()) {
                            q(i, i2, i3, hq5Var, vq5Var);
                            if (this.g == null) {
                                if (!this.w.f() && this.g == null) {
                                    throw new ps5(new ProtocolException("Too many tunnel connections attempted: 21"));
                                }
                                this.u = System.nanoTime();
                                return;
                            }
                        } else {
                            try {
                                o(i, i2, hq5Var, vq5Var);
                            } catch (IOException e2) {
                                e = e2;
                                socket = this.h;
                                if (socket != null) {
                                    sr5.n(socket);
                                }
                                socket2 = this.g;
                                if (socket2 != null) {
                                    sr5.n(socket2);
                                }
                                this.h = null;
                                this.g = null;
                                this.l = null;
                                this.m = null;
                                this.i = null;
                                this.j = null;
                                this.k = null;
                                this.s = 1;
                                vq5Var.i(hq5Var, this.w.g(), this.w.e(), null, e);
                                if (ps5Var != null) {
                                    ps5Var = new ps5(e);
                                } else {
                                    ps5Var.a(e);
                                }
                                if (!z || hs5Var.b(e)) {
                                    throw ps5Var;
                                }
                                do {
                                    if (this.w.f()) {
                                    }
                                    t(hs5Var, i4, hq5Var, vq5Var);
                                    vq5Var.h(hq5Var, this.w.g(), this.w.e(), this.j);
                                    if (!this.w.f()) {
                                    }
                                    this.u = System.nanoTime();
                                    return;
                                } while (hs5Var.b(e));
                                throw ps5Var;
                            }
                        }
                        t(hs5Var, i4, hq5Var, vq5Var);
                        vq5Var.h(hq5Var, this.w.g(), this.w.e(), this.j);
                        if (!this.w.f()) {
                        }
                        this.u = System.nanoTime();
                        return;
                    } catch (IOException e3) {
                        e = e3;
                        socket = this.h;
                        if (socket != null) {
                        }
                        socket2 = this.g;
                        if (socket2 != null) {
                        }
                        this.h = null;
                        this.g = null;
                        this.l = null;
                        this.m = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.s = 1;
                        vq5Var.i(hq5Var, this.w.g(), this.w.e(), null, e);
                        if (ps5Var != null) {
                        }
                        if (!z || hs5Var.b(e)) {
                        }
                        do {
                            if (this.w.f()) {
                            }
                            t(hs5Var, i4, hq5Var, vq5Var);
                            vq5Var.h(hq5Var, this.w.g(), this.w.e(), this.j);
                            if (!this.w.f()) {
                            }
                            this.u = System.nanoTime();
                            return;
                        } while (hs5Var.b(e));
                        throw ps5Var;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } while (hs5Var.b(e));
            throw ps5Var;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void n(@NotNull fr5 fr5Var, @NotNull lr5 lr5Var, @NotNull IOException iOException) {
        c25.p(fr5Var, m31.a);
        c25.p(lr5Var, "failedRoute");
        c25.p(iOException, "failure");
        if (lr5Var.e().type() != Proxy.Type.DIRECT) {
            dq5 d2 = lr5Var.d();
            d2.t().connectFailed(d2.w().Z(), lr5Var.e().address(), iOException);
        }
        fr5Var.h0().b(lr5Var);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Connection{");
        G.append(this.w.d().w().F());
        G.append(':');
        G.append(this.w.d().w().N());
        G.append(e14.f0);
        G.append(" proxy=");
        G.append(this.w.e());
        G.append(" hostAddress=");
        G.append(this.w.g());
        G.append(" cipherSuite=");
        xq5 xq5Var = this.i;
        G.append((xq5Var == null || (r1 = xq5Var.g()) == null) ? "none" : "none");
        G.append(" protocol=");
        G.append(this.j);
        G.append('}');
        return G.toString();
    }

    @NotNull
    public final List<Reference<ks5>> u() {
        return this.t;
    }

    @NotNull
    public final ns5 v() {
        return this.v;
    }

    public final long w() {
        return this.u;
    }

    public final boolean x() {
        return this.n;
    }

    public final int y() {
        return this.p;
    }

    public final synchronized void z() {
        this.q++;
    }
}