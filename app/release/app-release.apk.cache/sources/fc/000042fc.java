package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.ar5;
import com.p7700g.p99005.au5;
import com.p7700g.p99005.hq5;
import com.p7700g.p99005.nr5;
import com.p7700g.p99005.ru5;
import com.p7700g.p99005.vq5;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OkHttpClient.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\b\u0016\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\n\u000fB\u0014\b\u0000\u0012\u0007\u0010±\u0001\u001a\u00020\u0011¢\u0006\u0006\b²\u0001\u0010³\u0001B\n\b\u0016¢\u0006\u0005\b²\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\"H\u0007¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020\"H\u0007¢\u0006\u0004\b)\u0010$J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020%H\u0007¢\u0006\u0004\b9\u0010'J\u000f\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001aH\u0007¢\u0006\u0004\bA\u0010\u001dJ\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u001aH\u0007¢\u0006\u0004\bC\u0010\u001dJ\u000f\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020JH\u0007¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020JH\u0007¢\u0006\u0004\bN\u0010LJ\u000f\u0010O\u001a\u00020JH\u0007¢\u0006\u0004\bO\u0010LJ\u000f\u0010P\u001a\u00020JH\u0007¢\u0006\u0004\bP\u0010LR\u0013\u0010R\u001a\u00020=8G@\u0006¢\u0006\u0006\u001a\u0004\bQ\u0010?R\u0019\u0010U\u001a\u00020\"8G@\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010$R\u0019\u0010X\u001a\u0002008G@\u0006¢\u0006\f\n\u0004\b9\u0010V\u001a\u0004\bW\u00102R\u0019\u0010Z\u001a\u00020\"8G@\u0006¢\u0006\f\n\u0004\b\u001c\u0010S\u001a\u0004\bY\u0010$R\u0019\u0010]\u001a\u00020J8G@\u0006¢\u0006\f\n\u0004\b[\u0010N\u001a\u0004\b\\\u0010LR\u001b\u0010`\u001a\u0004\u0018\u0001038G@\u0006¢\u0006\f\n\u0004\b7\u0010^\u001a\u0004\b_\u00105R\u001b\u0010e\u001a\u0004\u0018\u00010a8G@\u0006¢\u0006\f\n\u0004\b>\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010h\u001a\u00020J8G@\u0006¢\u0006\f\n\u0004\bf\u0010N\u001a\u0004\bg\u0010LR\u0019\u0010l\u001a\u00020D8G@\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010FR\u0019\u0010p\u001a\u00020:8G@\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010<R\u0019\u0010t\u001a\u00020G8G@\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010IR\u001b\u0010x\u001a\u0004\u0018\u00010-8G@\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010/R\u0019\u0010z\u001a\u00020\"8G@\u0006¢\u0006\f\n\u0004\bC\u0010S\u001a\u0004\by\u0010$R\u001f\u0010~\u001a\b\u0012\u0004\u0012\u00020B0\u001a8G@\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010\u001dR \u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u001a8G@\u0006¢\u0006\f\n\u0004\bO\u0010|\u001a\u0004\b\u007f\u0010\u001dR\u001d\u0010\u0084\u0001\u001a\u00020\u00148G@\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010\u0016R\u001c\u0010\u0087\u0001\u001a\u0002068G@\u0006¢\u0006\u000e\n\u0005\bN\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u00108R\u001f\u0010\u008d\u0001\u001a\u00030\u0088\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u0090\u0001\u001a\u00020%8G@\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010'R\u001b\u0010\u0092\u0001\u001a\u00020J8G@\u0006¢\u0006\r\n\u0004\bw\u0010N\u001a\u0005\b\u0091\u0001\u0010LR\u001d\u0010\u0096\u0001\u001a\u00020\u001f8G@\u0006¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010!R\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0097\u0001R!\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G@\u0006¢\u0006\r\n\u0004\b)\u0010|\u001a\u0005\b\u0099\u0001\u0010\u001dR \u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018G@\u0006¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u009c\u0001\u001a\u0005\bf\u0010\u009d\u0001R\u001c\u0010 \u0001\u001a\u00020J8G@\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010N\u001a\u0005\b\u009f\u0001\u0010LR\u001c\u0010£\u0001\u001a\u00020\u00178G@\u0006¢\u0006\u000e\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0004\bS\u0010\u0019R!\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G@\u0006¢\u0006\r\n\u0004\bE\u0010|\u001a\u0005\b¤\u0001\u0010\u001dR\u001c\u0010§\u0001\u001a\u00020%8G@\u0006¢\u0006\u000e\n\u0005\b#\u0010\u008e\u0001\u001a\u0005\b¦\u0001\u0010'R\u001b\u0010©\u0001\u001a\u00020J8G@\u0006¢\u0006\r\n\u0004\bs\u0010N\u001a\u0005\b¨\u0001\u0010LR\u001e\u0010\u00ad\u0001\u001a\u00030ª\u00018G@\u0006¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010#\u001a\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010°\u0001\u001a\u00020*8G@\u0006¢\u0006\u000e\n\u0005\b4\u0010®\u0001\u001a\u0005\b¯\u0001\u0010,¨\u0006´\u0001"}, d2 = {"Lcom/p7700g/p99005/fr5;", "", "Lcom/p7700g/p99005/hq5$a;", "Lcom/p7700g/p99005/nr5$a;", "Lcom/p7700g/p99005/yq4;", "y0", "()V", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/hq5;", "a", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/hq5;", "Lcom/p7700g/p99005/or5;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/p7700g/p99005/nr5;", "b", "(Lcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/or5;)Lcom/p7700g/p99005/nr5;", "Lcom/p7700g/p99005/fr5$a;", "m0", "()Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/tq5;", ij3.b, "()Lcom/p7700g/p99005/tq5;", "Lcom/p7700g/p99005/nq5;", "h", "()Lcom/p7700g/p99005/nq5;", "", "Lcom/p7700g/p99005/ar5;", bx.B4, "()Ljava/util/List;", AFHydra.EV_BYTECOUNT, "Lcom/p7700g/p99005/vq5$c;", "t", "()Lcom/p7700g/p99005/vq5$c;", "", "J", "()Z", "Lcom/p7700g/p99005/eq5;", "c", "()Lcom/p7700g/p99005/eq5;", "u", "x", "Lcom/p7700g/p99005/rq5;", "n", "()Lcom/p7700g/p99005/rq5;", "Lcom/p7700g/p99005/fq5;", "d", "()Lcom/p7700g/p99005/fq5;", "Lcom/p7700g/p99005/uq5;", "p", "()Lcom/p7700g/p99005/uq5;", "Ljava/net/Proxy;", "E", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "H", "()Ljava/net/ProxySelector;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Ljavax/net/SocketFactory;", "L", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "M", "()Ljavax/net/ssl/SSLSocketFactory;", "Lcom/p7700g/p99005/oq5;", "i", "Lcom/p7700g/p99005/gr5;", "D", "Ljavax/net/ssl/HostnameVerifier;", "y", "()Ljavax/net/ssl/HostnameVerifier;", "Lcom/p7700g/p99005/jq5;", "f", "()Lcom/p7700g/p99005/jq5;", "", "e", "()I", com.anythink.basead.d.g.i, AFHydra.STATUS_IDLE, "N", "C", "v0", "sslSocketFactory", "Z", "f0", "followRedirects", "Lcom/p7700g/p99005/uq5;", "d0", "dns", "t0", "retryOnConnectionFailure", bx.y4, "n0", "pingIntervalMillis", "Ljava/net/Proxy;", "p0", "proxy", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "A0", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "U", "s0", "readTimeoutMillis", "P", "Ljavax/net/ssl/HostnameVerifier;", "i0", "hostnameVerifier", "K", "Ljavax/net/SocketFactory;", "u0", "socketFactory", "Q", "Lcom/p7700g/p99005/jq5;", bx.C4, "certificatePinner", "F", "Lcom/p7700g/p99005/fq5;", "S", com.anythink.expressad.foundation.g.a.a.a, "g0", "followSslRedirects", "O", "Ljava/util/List;", "o0", "protocols", "a0", "connectionSpecs", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/tq5;", "c0", "dispatcher", "Ljava/net/ProxySelector;", "r0", "proxySelector", "Lcom/p7700g/p99005/os5;", "Y", "Lcom/p7700g/p99005/os5;", "h0", "()Lcom/p7700g/p99005/os5;", "routeDatabase", "Lcom/p7700g/p99005/eq5;", "R", "authenticator", "T", "callTimeoutMillis", "z", "Lcom/p7700g/p99005/vq5$c;", "e0", "eventListenerFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "j0", "interceptors", "Lcom/p7700g/p99005/ru5;", "Lcom/p7700g/p99005/ru5;", "()Lcom/p7700g/p99005/ru5;", "certificateChainCleaner", "X", "connectTimeoutMillis", "w", "Lcom/p7700g/p99005/nq5;", "connectionPool", "l0", "networkInterceptors", "q0", "proxyAuthenticator", "z0", "writeTimeoutMillis", "", "k0", "()J", "minWebSocketMessageToCompress", "Lcom/p7700g/p99005/rq5;", "b0", "cookieJar", "builder", "<init>", "(Lcom/p7700g/p99005/fr5$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class fr5 implements Cloneable, hq5.a, nr5.a {
    private final boolean A;
    @NotNull
    private final eq5 B;
    private final boolean C;
    private final boolean D;
    @NotNull
    private final rq5 E;
    @Nullable
    private final fq5 F;
    @NotNull
    private final uq5 G;
    @Nullable
    private final Proxy H;
    @NotNull
    private final ProxySelector I;
    @NotNull
    private final eq5 J;
    @NotNull
    private final SocketFactory K;
    private final SSLSocketFactory L;
    @Nullable
    private final X509TrustManager M;
    @NotNull
    private final List<oq5> N;
    @NotNull
    private final List<gr5> O;
    @NotNull
    private final HostnameVerifier P;
    @NotNull
    private final jq5 Q;
    @Nullable
    private final ru5 R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final long X;
    @NotNull
    private final os5 Y;
    @NotNull
    private final tq5 v;
    @NotNull
    private final nq5 w;
    @NotNull
    private final List<ar5> x;
    @NotNull
    private final List<ar5> y;
    @NotNull
    private final vq5.c z;
    public static final b u = new b(null);
    @NotNull
    private static final List<gr5> s = sr5.z(gr5.HTTP_2, gr5.HTTP_1_1);
    @NotNull
    private static final List<oq5> t = sr5.z(oq5.d, oq5.f);

    /* compiled from: OkHttpClient.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"com/p7700g/p99005/fr5$b", "", "", "Lcom/p7700g/p99005/gr5;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/p7700g/p99005/oq5;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        @NotNull
        public final List<oq5> a() {
            return fr5.t;
        }

        @NotNull
        public final List<gr5> b() {
            return fr5.s;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fr5(@NotNull a aVar) {
        ProxySelector R;
        c25.p(aVar, "builder");
        this.v = aVar.E();
        this.w = aVar.B();
        this.x = sr5.c0(aVar.K());
        this.y = sr5.c0(aVar.M());
        this.z = aVar.G();
        this.A = aVar.T();
        this.B = aVar.v();
        this.C = aVar.H();
        this.D = aVar.I();
        this.E = aVar.D();
        this.F = aVar.w();
        this.G = aVar.F();
        this.H = aVar.P();
        if (aVar.P() != null) {
            R = nu5.a;
        } else {
            R = aVar.R();
            R = R == null ? ProxySelector.getDefault() : R;
            if (R == null) {
                R = nu5.a;
            }
        }
        this.I = R;
        this.J = aVar.Q();
        this.K = aVar.V();
        List<oq5> C = aVar.C();
        this.N = C;
        this.O = aVar.O();
        this.P = aVar.J();
        this.S = aVar.x();
        this.T = aVar.A();
        this.U = aVar.S();
        this.V = aVar.X();
        this.W = aVar.N();
        this.X = aVar.L();
        os5 U = aVar.U();
        this.Y = U == null ? new os5() : U;
        boolean z = true;
        if (!(C instanceof Collection) || !C.isEmpty()) {
            Iterator<T> it = C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((oq5) it.next()).i()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.L = null;
            this.R = null;
            this.M = null;
            this.Q = jq5.a;
        } else if (aVar.W() != null) {
            this.L = aVar.W();
            ru5 y = aVar.y();
            c25.m(y);
            this.R = y;
            X509TrustManager Y = aVar.Y();
            c25.m(Y);
            this.M = Y;
            jq5 z2 = aVar.z();
            c25.m(y);
            this.Q = z2.j(y);
        } else {
            au5.a aVar2 = au5.e;
            X509TrustManager r = aVar2.g().r();
            this.M = r;
            au5 g = aVar2.g();
            c25.m(r);
            this.L = g.q(r);
            ru5.a aVar3 = ru5.a;
            c25.m(r);
            ru5 a2 = aVar3.a(r);
            this.R = a2;
            jq5 z3 = aVar.z();
            c25.m(a2);
            this.Q = z3.j(a2);
        }
        y0();
    }

    private final void y0() {
        boolean z;
        List<ar5> list = this.x;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            List<ar5> list2 = this.y;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<oq5> list3 = this.N;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (oq5 oq5Var : list3) {
                        if (oq5Var.i()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (this.L == null) {
                        if (this.R == null) {
                            if (this.M == null) {
                                if (!c25.g(this.Q, jq5.a)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.L != null) {
                    if (this.R != null) {
                        if (this.M == null) {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
            }
            StringBuilder G = wo1.G("Null network interceptor: ");
            G.append(this.y);
            throw new IllegalStateException(G.toString().toString());
        }
        StringBuilder G2 = wo1.G("Null interceptor: ");
        G2.append(this.x);
        throw new IllegalStateException(G2.toString().toString());
    }

    @fz4(name = "-deprecated_interceptors")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "interceptors", imports = {}))
    @NotNull
    public final List<ar5> A() {
        return this.x;
    }

    @fz4(name = "x509TrustManager")
    @Nullable
    public final X509TrustManager A0() {
        return this.M;
    }

    @fz4(name = "-deprecated_networkInterceptors")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "networkInterceptors", imports = {}))
    @NotNull
    public final List<ar5> B() {
        return this.y;
    }

    @fz4(name = "-deprecated_pingIntervalMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "pingIntervalMillis", imports = {}))
    public final int C() {
        return this.W;
    }

    @fz4(name = "-deprecated_protocols")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "protocols", imports = {}))
    @NotNull
    public final List<gr5> D() {
        return this.O;
    }

    @fz4(name = "-deprecated_proxy")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxy", imports = {}))
    @Nullable
    public final Proxy E() {
        return this.H;
    }

    @fz4(name = "-deprecated_proxyAuthenticator")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxyAuthenticator", imports = {}))
    @NotNull
    public final eq5 G() {
        return this.J;
    }

    @fz4(name = "-deprecated_proxySelector")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxySelector", imports = {}))
    @NotNull
    public final ProxySelector H() {
        return this.I;
    }

    @fz4(name = "-deprecated_readTimeoutMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "readTimeoutMillis", imports = {}))
    public final int I() {
        return this.U;
    }

    @fz4(name = "-deprecated_retryOnConnectionFailure")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "retryOnConnectionFailure", imports = {}))
    public final boolean J() {
        return this.A;
    }

    @fz4(name = "-deprecated_socketFactory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "socketFactory", imports = {}))
    @NotNull
    public final SocketFactory L() {
        return this.K;
    }

    @fz4(name = "-deprecated_sslSocketFactory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "sslSocketFactory", imports = {}))
    @NotNull
    public final SSLSocketFactory M() {
        return v0();
    }

    @fz4(name = "-deprecated_writeTimeoutMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "writeTimeoutMillis", imports = {}))
    public final int N() {
        return this.V;
    }

    @fz4(name = "authenticator")
    @NotNull
    public final eq5 R() {
        return this.B;
    }

    @fz4(name = com.anythink.expressad.foundation.g.a.a.a)
    @Nullable
    public final fq5 S() {
        return this.F;
    }

    @fz4(name = "callTimeoutMillis")
    public final int T() {
        return this.S;
    }

    @fz4(name = "certificateChainCleaner")
    @Nullable
    public final ru5 U() {
        return this.R;
    }

    @fz4(name = "certificatePinner")
    @NotNull
    public final jq5 V() {
        return this.Q;
    }

    @fz4(name = "connectTimeoutMillis")
    public final int X() {
        return this.T;
    }

    @fz4(name = "connectionPool")
    @NotNull
    public final nq5 Z() {
        return this.w;
    }

    @Override // com.p7700g.p99005.hq5.a
    @NotNull
    public hq5 a(@NotNull hr5 hr5Var) {
        c25.p(hr5Var, "request");
        return new ks5(this, hr5Var, false);
    }

    @fz4(name = "connectionSpecs")
    @NotNull
    public final List<oq5> a0() {
        return this.N;
    }

    @Override // com.p7700g.p99005.nr5.a
    @NotNull
    public nr5 b(@NotNull hr5 hr5Var, @NotNull or5 or5Var) {
        c25.p(hr5Var, "request");
        c25.p(or5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        yu5 yu5Var = new yu5(fs5.a, hr5Var, or5Var, new Random(), this.W, null, this.X);
        yu5Var.s(this);
        return yu5Var;
    }

    @fz4(name = "cookieJar")
    @NotNull
    public final rq5 b0() {
        return this.E;
    }

    @fz4(name = "-deprecated_authenticator")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "authenticator", imports = {}))
    @NotNull
    public final eq5 c() {
        return this.B;
    }

    @fz4(name = "dispatcher")
    @NotNull
    public final tq5 c0() {
        return this.v;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @fz4(name = "-deprecated_cache")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = com.anythink.expressad.foundation.g.a.a.a, imports = {}))
    @Nullable
    public final fq5 d() {
        return this.F;
    }

    @fz4(name = "dns")
    @NotNull
    public final uq5 d0() {
        return this.G;
    }

    @fz4(name = "-deprecated_callTimeoutMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "callTimeoutMillis", imports = {}))
    public final int e() {
        return this.S;
    }

    @fz4(name = "eventListenerFactory")
    @NotNull
    public final vq5.c e0() {
        return this.z;
    }

    @fz4(name = "-deprecated_certificatePinner")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "certificatePinner", imports = {}))
    @NotNull
    public final jq5 f() {
        return this.Q;
    }

    @fz4(name = "followRedirects")
    public final boolean f0() {
        return this.C;
    }

    @fz4(name = "-deprecated_connectTimeoutMillis")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "connectTimeoutMillis", imports = {}))
    public final int g() {
        return this.T;
    }

    @fz4(name = "followSslRedirects")
    public final boolean g0() {
        return this.D;
    }

    @fz4(name = "-deprecated_connectionPool")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "connectionPool", imports = {}))
    @NotNull
    public final nq5 h() {
        return this.w;
    }

    @NotNull
    public final os5 h0() {
        return this.Y;
    }

    @fz4(name = "-deprecated_connectionSpecs")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "connectionSpecs", imports = {}))
    @NotNull
    public final List<oq5> i() {
        return this.N;
    }

    @fz4(name = "hostnameVerifier")
    @NotNull
    public final HostnameVerifier i0() {
        return this.P;
    }

    @fz4(name = "interceptors")
    @NotNull
    public final List<ar5> j0() {
        return this.x;
    }

    @fz4(name = "minWebSocketMessageToCompress")
    public final long k0() {
        return this.X;
    }

    @fz4(name = "networkInterceptors")
    @NotNull
    public final List<ar5> l0() {
        return this.y;
    }

    @NotNull
    public a m0() {
        return new a(this);
    }

    @fz4(name = "-deprecated_cookieJar")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "cookieJar", imports = {}))
    @NotNull
    public final rq5 n() {
        return this.E;
    }

    @fz4(name = "pingIntervalMillis")
    public final int n0() {
        return this.W;
    }

    @fz4(name = "-deprecated_dispatcher")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "dispatcher", imports = {}))
    @NotNull
    public final tq5 o() {
        return this.v;
    }

    @fz4(name = "protocols")
    @NotNull
    public final List<gr5> o0() {
        return this.O;
    }

    @fz4(name = "-deprecated_dns")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "dns", imports = {}))
    @NotNull
    public final uq5 p() {
        return this.G;
    }

    @fz4(name = "proxy")
    @Nullable
    public final Proxy p0() {
        return this.H;
    }

    @fz4(name = "proxyAuthenticator")
    @NotNull
    public final eq5 q0() {
        return this.J;
    }

    @fz4(name = "proxySelector")
    @NotNull
    public final ProxySelector r0() {
        return this.I;
    }

    @fz4(name = "readTimeoutMillis")
    public final int s0() {
        return this.U;
    }

    @fz4(name = "-deprecated_eventListenerFactory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "eventListenerFactory", imports = {}))
    @NotNull
    public final vq5.c t() {
        return this.z;
    }

    @fz4(name = "retryOnConnectionFailure")
    public final boolean t0() {
        return this.A;
    }

    @fz4(name = "-deprecated_followRedirects")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "followRedirects", imports = {}))
    public final boolean u() {
        return this.C;
    }

    @fz4(name = "socketFactory")
    @NotNull
    public final SocketFactory u0() {
        return this.K;
    }

    @fz4(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory v0() {
        SSLSocketFactory sSLSocketFactory = this.L;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @fz4(name = "-deprecated_followSslRedirects")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "followSslRedirects", imports = {}))
    public final boolean x() {
        return this.D;
    }

    @fz4(name = "-deprecated_hostnameVerifier")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "hostnameVerifier", imports = {}))
    @NotNull
    public final HostnameVerifier y() {
        return this.P;
    }

    @fz4(name = "writeTimeoutMillis")
    public final int z0() {
        return this.V;
    }

    /* compiled from: OkHttpClient.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000ú\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002B\u0014\b\u0010\u0012\u0007\u0010\u0081\u0002\u001a\u00020z¢\u0006\u0006\bÿ\u0001\u0010\u0082\u0002J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0019\u001a\u00020\u00042#\b\u0004\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0011J8\u0010\u001d\u001a\u00020\u00042#\b\u0004\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b/\u0010)J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020&¢\u0006\u0004\b1\u0010)J\u0015\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020*¢\u0006\u0004\bG\u0010-J\u0015\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020\u00042\u0006\u0010M\u001a\u00020L2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u001b\u0010W\u001a\u00020\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T¢\u0006\u0004\bW\u0010XJ\u001b\u0010[\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0T¢\u0006\u0004\b[\u0010XJ\u0015\u0010^\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\u00042\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u001d\u0010h\u001a\u00020\u00042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bl\u0010mJ\u001d\u0010n\u001a\u00020\u00042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bn\u0010iJ\u0017\u0010o\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bo\u0010mJ\u001d\u0010p\u001a\u00020\u00042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bp\u0010iJ\u0017\u0010q\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bq\u0010mJ\u001d\u0010r\u001a\u00020\u00042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\br\u0010iJ\u0017\u0010s\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bs\u0010mJ\u001d\u0010u\u001a\u00020\u00042\u0006\u0010t\u001a\u00020d2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bu\u0010iJ\u0017\u0010v\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bv\u0010mJ\u0015\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020d¢\u0006\u0004\bx\u0010yJ\r\u0010{\u001a\u00020z¢\u0006\u0004\b{\u0010|R$\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u0019\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010\u000eR&\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b{\u0010^\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bW\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b$\u0010\u0082\u0001\u001a\u0005\b\u008e\u0001\u0010\u000e\"\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b8\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010a\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R'\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b,\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R'\u0010F\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b4\u0010\u0091\u0001\u001a\u0006\b¨\u0001\u0010\u0093\u0001\"\u0006\b©\u0001\u0010\u0095\u0001R)\u0010¯\u0001\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R'\u0010²\u0001\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bl\u0010^\u001a\u0006\b°\u0001\u0010\u0086\u0001\"\u0006\b±\u0001\u0010\u0088\u0001R*\u0010¸\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010°\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R'\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001d\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R*\u0010À\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010°\u0001\u001a\u0006\b¾\u0001\u0010µ\u0001\"\u0006\b¿\u0001\u0010·\u0001R'\u0010]\u001a\u00020\\8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b1\u0010Á\u0001\u001a\u0006\bª\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R'\u0010I\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ï\u0001\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b \u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010Ò\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010°\u0001\u001a\u0006\bÐ\u0001\u0010µ\u0001\"\u0006\bÑ\u0001\u0010·\u0001R*\u0010Õ\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010°\u0001\u001a\u0006\bÓ\u0001\u0010µ\u0001\"\u0006\bÔ\u0001\u0010·\u0001R&\u0010.\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bh\u0010^\u001a\u0006\bÖ\u0001\u0010\u0086\u0001\"\u0006\b×\u0001\u0010\u0088\u0001R*\u0010Ý\u0001\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b<\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R)\u0010?\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\t\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R)\u00107\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bn\u0010ã\u0001\u001a\u0006\b\u009c\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R,\u0010î\u0001\u001a\u0005\u0018\u00010ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R%\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0005\bï\u0001\u0010\u000eR*\u0010ó\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010°\u0001\u001a\u0006\bñ\u0001\u0010µ\u0001\"\u0006\bò\u0001\u0010·\u0001R,\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0T8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b/\u0010\u0082\u0001\u001a\u0005\bô\u0001\u0010\u000e\"\u0006\bõ\u0001\u0010\u0090\u0001R'\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bb\u0010ö\u0001\u001a\u0006\bè\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bo\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0083\u0002"}, d2 = {"com/p7700g/p99005/fr5$a", "", "Lcom/p7700g/p99005/tq5;", "dispatcher", "Lcom/p7700g/p99005/fr5$a;", "p", "(Lcom/p7700g/p99005/tq5;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/nq5;", "connectionPool", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/nq5;)Lcom/p7700g/p99005/fr5$a;", "", "Lcom/p7700g/p99005/ar5;", "a0", "()Ljava/util/List;", "interceptor", "c", "(Lcom/p7700g/p99005/ar5;)Lcom/p7700g/p99005/fr5$a;", "Lkotlin/Function1;", "Lcom/p7700g/p99005/ar5$a;", "Lcom/p7700g/p99005/ip4;", "name", "chain", "Lcom/p7700g/p99005/jr5;", "block", "a", "(Lcom/p7700g/p99005/f05;)Lcom/p7700g/p99005/fr5$a;", "c0", "d", "b", "Lcom/p7700g/p99005/vq5;", "eventListener", "r", "(Lcom/p7700g/p99005/vq5;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/vq5$c;", "eventListenerFactory", "s", "(Lcom/p7700g/p99005/vq5$c;)Lcom/p7700g/p99005/fr5$a;", "", "retryOnConnectionFailure", "l0", "(Z)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/eq5;", "authenticator", "e", "(Lcom/p7700g/p99005/eq5;)Lcom/p7700g/p99005/fr5$a;", "followRedirects", "t", "followProtocolRedirects", "u", "Lcom/p7700g/p99005/rq5;", "cookieJar", ij3.b, "(Lcom/p7700g/p99005/rq5;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/fq5;", com.anythink.expressad.foundation.g.a.a.a, com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/fq5;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/uq5;", "dns", "q", "(Lcom/p7700g/p99005/uq5;)Lcom/p7700g/p99005/fr5$a;", "Ljava/net/Proxy;", "proxy", "g0", "(Ljava/net/Proxy;)Lcom/p7700g/p99005/fr5$a;", "Ljava/net/ProxySelector;", "proxySelector", "i0", "(Ljava/net/ProxySelector;)Lcom/p7700g/p99005/fr5$a;", "proxyAuthenticator", "h0", "Ljavax/net/SocketFactory;", "socketFactory", "O0", "(Ljavax/net/SocketFactory;)Lcom/p7700g/p99005/fr5$a;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "P0", "(Ljavax/net/ssl/SSLSocketFactory;)Lcom/p7700g/p99005/fr5$a;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Q0", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/fr5$a;", "", "Lcom/p7700g/p99005/oq5;", "connectionSpecs", "n", "(Ljava/util/List;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/gr5;", "protocols", "f0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Z", "(Ljavax/net/ssl/HostnameVerifier;)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/jq5;", "certificatePinner", "j", "(Lcom/p7700g/p99005/jq5;)Lcom/p7700g/p99005/fr5$a;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "(JLjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/fr5$a;", "Ljava/time/Duration;", "duration", "i", "(Ljava/time/Duration;)Lcom/p7700g/p99005/fr5$a;", "k", "l", "j0", "k0", "R0", "S0", "interval", "d0", "e0", "bytes", "b0", "(J)Lcom/p7700g/p99005/fr5$a;", "Lcom/p7700g/p99005/fr5;", "f", "()Lcom/p7700g/p99005/fr5;", "Lcom/p7700g/p99005/tq5;", "E", "()Lcom/p7700g/p99005/tq5;", "v0", "(Lcom/p7700g/p99005/tq5;)V", "Ljava/util/List;", "K", "interceptors", "T", "()Z", "I0", "(Z)V", "Ljava/net/ProxySelector;", "R", "()Ljava/net/ProxySelector;", "G0", "(Ljava/net/ProxySelector;)V", "C", "t0", "(Ljava/util/List;)V", "Lcom/p7700g/p99005/eq5;", com.ironsource.sdk.controller.v.a, "()Lcom/p7700g/p99005/eq5;", "m0", "(Lcom/p7700g/p99005/eq5;)V", "Lcom/p7700g/p99005/jq5;", "z", "()Lcom/p7700g/p99005/jq5;", "q0", "(Lcom/p7700g/p99005/jq5;)V", "Lcom/p7700g/p99005/ru5;", "w", "Lcom/p7700g/p99005/ru5;", "y", "()Lcom/p7700g/p99005/ru5;", "p0", "(Lcom/p7700g/p99005/ru5;)V", "certificateChainCleaner", "Lcom/p7700g/p99005/vq5$c;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Lcom/p7700g/p99005/vq5$c;", "x0", "(Lcom/p7700g/p99005/vq5$c;)V", "Q", "F0", "J", "L", "()J", "B0", "(J)V", "minWebSocketMessageToCompress", AFHydra.STATUS_IDLE, "z0", "followSslRedirects", "", "S", "()I", "H0", "(I)V", "readTimeout", "Lcom/p7700g/p99005/nq5;", AFHydra.EV_BYTECOUNT, "()Lcom/p7700g/p99005/nq5;", "s0", "(Lcom/p7700g/p99005/nq5;)V", "x", "o0", "callTimeout", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "A0", "(Ljavax/net/ssl/HostnameVerifier;)V", "Ljavax/net/SocketFactory;", bx.C4, "()Ljavax/net/SocketFactory;", "K0", "(Ljavax/net/SocketFactory;)V", "Ljavax/net/ssl/X509TrustManager;", "Y", "()Ljavax/net/ssl/X509TrustManager;", "N0", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", bx.B4, "r0", "connectTimeout", "X", "M0", "writeTimeout", "H", "y0", "Ljavax/net/ssl/SSLSocketFactory;", bx.y4, "()Ljavax/net/ssl/SSLSocketFactory;", "L0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljava/net/Proxy;", "P", "()Ljava/net/Proxy;", "E0", "(Ljava/net/Proxy;)V", "Lcom/p7700g/p99005/fq5;", "()Lcom/p7700g/p99005/fq5;", "n0", "(Lcom/p7700g/p99005/fq5;)V", "Lcom/p7700g/p99005/os5;", "D", "Lcom/p7700g/p99005/os5;", "U", "()Lcom/p7700g/p99005/os5;", "J0", "(Lcom/p7700g/p99005/os5;)V", "routeDatabase", "M", "networkInterceptors", "N", AFHydra.STATUS_CONNECTING, "pingInterval", "O", AFHydra.STATUS_DISCONNECTING, "Lcom/p7700g/p99005/rq5;", "()Lcom/p7700g/p99005/rq5;", "u0", "(Lcom/p7700g/p99005/rq5;)V", "Lcom/p7700g/p99005/uq5;", "F", "()Lcom/p7700g/p99005/uq5;", "w0", "(Lcom/p7700g/p99005/uq5;)V", "<init>", "()V", "okHttpClient", "(Lcom/p7700g/p99005/fr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private int A;
        private int B;
        private long C;
        @Nullable
        private os5 D;
        @NotNull
        private tq5 a;
        @NotNull
        private nq5 b;
        @NotNull
        private final List<ar5> c;
        @NotNull
        private final List<ar5> d;
        @NotNull
        private vq5.c e;
        private boolean f;
        @NotNull
        private eq5 g;
        private boolean h;
        private boolean i;
        @NotNull
        private rq5 j;
        @Nullable
        private fq5 k;
        @NotNull
        private uq5 l;
        @Nullable
        private Proxy m;
        @Nullable
        private ProxySelector n;
        @NotNull
        private eq5 o;
        @NotNull
        private SocketFactory p;
        @Nullable
        private SSLSocketFactory q;
        @Nullable
        private X509TrustManager r;
        @NotNull
        private List<oq5> s;
        @NotNull
        private List<? extends gr5> t;
        @NotNull
        private HostnameVerifier u;
        @NotNull
        private jq5 v;
        @Nullable
        private ru5 w;
        private int x;
        private int y;
        private int z;

        /* compiled from: OkHttpClient.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.fr5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0175a implements ar5 {
            public final /* synthetic */ f05 b;

            public C0175a(f05 f05Var) {
                this.b = f05Var;
            }

            @Override // com.p7700g.p99005.ar5
            @NotNull
            public final jr5 a(@NotNull ar5.a aVar) {
                c25.p(aVar, "chain");
                return (jr5) this.b.M(aVar);
            }
        }

        /* compiled from: OkHttpClient.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class b implements ar5 {
            public final /* synthetic */ f05 b;

            public b(f05 f05Var) {
                this.b = f05Var;
            }

            @Override // com.p7700g.p99005.ar5
            @NotNull
            public final jr5 a(@NotNull ar5.a aVar) {
                c25.p(aVar, "chain");
                return (jr5) this.b.M(aVar);
            }
        }

        public a() {
            this.a = new tq5();
            this.b = new nq5();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = sr5.e(vq5.a);
            this.f = true;
            eq5 eq5Var = eq5.a;
            this.g = eq5Var;
            this.h = true;
            this.i = true;
            this.j = rq5.a;
            this.l = uq5.a;
            this.o = eq5Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            c25.o(socketFactory, "SocketFactory.getDefault()");
            this.p = socketFactory;
            b bVar = fr5.u;
            this.s = bVar.a();
            this.t = bVar.b();
            this.u = su5.c;
            this.v = jq5.a;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final int A() {
            return this.y;
        }

        public final void A0(@NotNull HostnameVerifier hostnameVerifier) {
            c25.p(hostnameVerifier, "<set-?>");
            this.u = hostnameVerifier;
        }

        @NotNull
        public final nq5 B() {
            return this.b;
        }

        public final void B0(long j) {
            this.C = j;
        }

        @NotNull
        public final List<oq5> C() {
            return this.s;
        }

        public final void C0(int i) {
            this.B = i;
        }

        @NotNull
        public final rq5 D() {
            return this.j;
        }

        public final void D0(@NotNull List<? extends gr5> list) {
            c25.p(list, "<set-?>");
            this.t = list;
        }

        @NotNull
        public final tq5 E() {
            return this.a;
        }

        public final void E0(@Nullable Proxy proxy) {
            this.m = proxy;
        }

        @NotNull
        public final uq5 F() {
            return this.l;
        }

        public final void F0(@NotNull eq5 eq5Var) {
            c25.p(eq5Var, "<set-?>");
            this.o = eq5Var;
        }

        @NotNull
        public final vq5.c G() {
            return this.e;
        }

        public final void G0(@Nullable ProxySelector proxySelector) {
            this.n = proxySelector;
        }

        public final boolean H() {
            return this.h;
        }

        public final void H0(int i) {
            this.z = i;
        }

        public final boolean I() {
            return this.i;
        }

        public final void I0(boolean z) {
            this.f = z;
        }

        @NotNull
        public final HostnameVerifier J() {
            return this.u;
        }

        public final void J0(@Nullable os5 os5Var) {
            this.D = os5Var;
        }

        @NotNull
        public final List<ar5> K() {
            return this.c;
        }

        public final void K0(@NotNull SocketFactory socketFactory) {
            c25.p(socketFactory, "<set-?>");
            this.p = socketFactory;
        }

        public final long L() {
            return this.C;
        }

        public final void L0(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.q = sSLSocketFactory;
        }

        @NotNull
        public final List<ar5> M() {
            return this.d;
        }

        public final void M0(int i) {
            this.A = i;
        }

        public final int N() {
            return this.B;
        }

        public final void N0(@Nullable X509TrustManager x509TrustManager) {
            this.r = x509TrustManager;
        }

        @NotNull
        public final List<gr5> O() {
            return this.t;
        }

        @NotNull
        public final a O0(@NotNull SocketFactory socketFactory) {
            c25.p(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!c25.g(socketFactory, this.p)) {
                    this.D = null;
                }
                this.p = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @Nullable
        public final Proxy P() {
            return this.m;
        }

        @xn4(level = zn4.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final a P0(@NotNull SSLSocketFactory sSLSocketFactory) {
            c25.p(sSLSocketFactory, "sslSocketFactory");
            if (!c25.g(sSLSocketFactory, this.q)) {
                this.D = null;
            }
            this.q = sSLSocketFactory;
            au5.a aVar = au5.e;
            X509TrustManager s = aVar.g().s(sSLSocketFactory);
            if (s != null) {
                this.r = s;
                au5 g = aVar.g();
                X509TrustManager x509TrustManager = this.r;
                c25.m(x509TrustManager);
                this.w = g.d(x509TrustManager);
                return this;
            }
            StringBuilder G = wo1.G("Unable to extract the trust manager on ");
            G.append(aVar.g());
            G.append(", ");
            G.append("sslSocketFactory is ");
            G.append(sSLSocketFactory.getClass());
            throw new IllegalStateException(G.toString());
        }

        @NotNull
        public final eq5 Q() {
            return this.o;
        }

        @NotNull
        public final a Q0(@NotNull SSLSocketFactory sSLSocketFactory, @NotNull X509TrustManager x509TrustManager) {
            c25.p(sSLSocketFactory, "sslSocketFactory");
            c25.p(x509TrustManager, "trustManager");
            if ((!c25.g(sSLSocketFactory, this.q)) || (!c25.g(x509TrustManager, this.r))) {
                this.D = null;
            }
            this.q = sSLSocketFactory;
            this.w = ru5.a.a(x509TrustManager);
            this.r = x509TrustManager;
            return this;
        }

        @Nullable
        public final ProxySelector R() {
            return this.n;
        }

        @NotNull
        public final a R0(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            this.A = sr5.j("timeout", j, timeUnit);
            return this;
        }

        public final int S() {
            return this.z;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a S0(@NotNull Duration duration) {
            c25.p(duration, "duration");
            R0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final boolean T() {
            return this.f;
        }

        @Nullable
        public final os5 U() {
            return this.D;
        }

        @NotNull
        public final SocketFactory V() {
            return this.p;
        }

        @Nullable
        public final SSLSocketFactory W() {
            return this.q;
        }

        public final int X() {
            return this.A;
        }

        @Nullable
        public final X509TrustManager Y() {
            return this.r;
        }

        @NotNull
        public final a Z(@NotNull HostnameVerifier hostnameVerifier) {
            c25.p(hostnameVerifier, "hostnameVerifier");
            if (!c25.g(hostnameVerifier, this.u)) {
                this.D = null;
            }
            this.u = hostnameVerifier;
            return this;
        }

        @fz4(name = "-addInterceptor")
        @NotNull
        public final a a(@NotNull f05<? super ar5.a, jr5> f05Var) {
            c25.p(f05Var, "block");
            return c(new C0175a(f05Var));
        }

        @NotNull
        public final List<ar5> a0() {
            return this.c;
        }

        @fz4(name = "-addNetworkInterceptor")
        @NotNull
        public final a b(@NotNull f05<? super ar5.a, jr5> f05Var) {
            c25.p(f05Var, "block");
            return d(new b(f05Var));
        }

        @NotNull
        public final a b0(long j) {
            if (j >= 0) {
                this.C = j;
                return this;
            }
            throw new IllegalArgumentException(wo1.p("minWebSocketMessageToCompress must be positive: ", j).toString());
        }

        @NotNull
        public final a c(@NotNull ar5 ar5Var) {
            c25.p(ar5Var, "interceptor");
            this.c.add(ar5Var);
            return this;
        }

        @NotNull
        public final List<ar5> c0() {
            return this.d;
        }

        @NotNull
        public final a d(@NotNull ar5 ar5Var) {
            c25.p(ar5Var, "interceptor");
            this.d.add(ar5Var);
            return this;
        }

        @NotNull
        public final a d0(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            this.B = sr5.j("interval", j, timeUnit);
            return this;
        }

        @NotNull
        public final a e(@NotNull eq5 eq5Var) {
            c25.p(eq5Var, "authenticator");
            this.g = eq5Var;
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a e0(@NotNull Duration duration) {
            c25.p(duration, "duration");
            d0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final fr5 f() {
            return new fr5(this);
        }

        @NotNull
        public final a f0(@NotNull List<? extends gr5> list) {
            c25.p(list, "protocols");
            List T5 = rs4.T5(list);
            gr5 gr5Var = gr5.H2_PRIOR_KNOWLEDGE;
            boolean z = false;
            if (T5.contains(gr5Var) || T5.contains(gr5.HTTP_1_1)) {
                if ((!T5.contains(gr5Var) || T5.size() <= 1) ? true : true) {
                    if (!T5.contains(gr5.HTTP_1_0)) {
                        if (!T5.contains(null)) {
                            T5.remove(gr5.SPDY_3);
                            if (!c25.g(T5, this.t)) {
                                this.D = null;
                            }
                            List<? extends gr5> unmodifiableList = Collections.unmodifiableList(T5);
                            c25.o(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                            this.t = unmodifiableList;
                            return this;
                        }
                        throw new IllegalArgumentException("protocols must not contain null".toString());
                    }
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + T5).toString());
                }
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + T5).toString());
            }
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + T5).toString());
        }

        @NotNull
        public final a g(@Nullable fq5 fq5Var) {
            this.k = fq5Var;
            return this;
        }

        @NotNull
        public final a g0(@Nullable Proxy proxy) {
            if (!c25.g(proxy, this.m)) {
                this.D = null;
            }
            this.m = proxy;
            return this;
        }

        @NotNull
        public final a h(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            this.x = sr5.j("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final a h0(@NotNull eq5 eq5Var) {
            c25.p(eq5Var, "proxyAuthenticator");
            if (!c25.g(eq5Var, this.o)) {
                this.D = null;
            }
            this.o = eq5Var;
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a i(@NotNull Duration duration) {
            c25.p(duration, "duration");
            h(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final a i0(@NotNull ProxySelector proxySelector) {
            c25.p(proxySelector, "proxySelector");
            if (!c25.g(proxySelector, this.n)) {
                this.D = null;
            }
            this.n = proxySelector;
            return this;
        }

        @NotNull
        public final a j(@NotNull jq5 jq5Var) {
            c25.p(jq5Var, "certificatePinner");
            if (!c25.g(jq5Var, this.v)) {
                this.D = null;
            }
            this.v = jq5Var;
            return this;
        }

        @NotNull
        public final a j0(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            this.z = sr5.j("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final a k(long j, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "unit");
            this.y = sr5.j("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a k0(@NotNull Duration duration) {
            c25.p(duration, "duration");
            j0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a l(@NotNull Duration duration) {
            c25.p(duration, "duration");
            k(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final a l0(boolean z) {
            this.f = z;
            return this;
        }

        @NotNull
        public final a m(@NotNull nq5 nq5Var) {
            c25.p(nq5Var, "connectionPool");
            this.b = nq5Var;
            return this;
        }

        public final void m0(@NotNull eq5 eq5Var) {
            c25.p(eq5Var, "<set-?>");
            this.g = eq5Var;
        }

        @NotNull
        public final a n(@NotNull List<oq5> list) {
            c25.p(list, "connectionSpecs");
            if (!c25.g(list, this.s)) {
                this.D = null;
            }
            this.s = sr5.c0(list);
            return this;
        }

        public final void n0(@Nullable fq5 fq5Var) {
            this.k = fq5Var;
        }

        @NotNull
        public final a o(@NotNull rq5 rq5Var) {
            c25.p(rq5Var, "cookieJar");
            this.j = rq5Var;
            return this;
        }

        public final void o0(int i) {
            this.x = i;
        }

        @NotNull
        public final a p(@NotNull tq5 tq5Var) {
            c25.p(tq5Var, "dispatcher");
            this.a = tq5Var;
            return this;
        }

        public final void p0(@Nullable ru5 ru5Var) {
            this.w = ru5Var;
        }

        @NotNull
        public final a q(@NotNull uq5 uq5Var) {
            c25.p(uq5Var, "dns");
            if (!c25.g(uq5Var, this.l)) {
                this.D = null;
            }
            this.l = uq5Var;
            return this;
        }

        public final void q0(@NotNull jq5 jq5Var) {
            c25.p(jq5Var, "<set-?>");
            this.v = jq5Var;
        }

        @NotNull
        public final a r(@NotNull vq5 vq5Var) {
            c25.p(vq5Var, "eventListener");
            this.e = sr5.e(vq5Var);
            return this;
        }

        public final void r0(int i) {
            this.y = i;
        }

        @NotNull
        public final a s(@NotNull vq5.c cVar) {
            c25.p(cVar, "eventListenerFactory");
            this.e = cVar;
            return this;
        }

        public final void s0(@NotNull nq5 nq5Var) {
            c25.p(nq5Var, "<set-?>");
            this.b = nq5Var;
        }

        @NotNull
        public final a t(boolean z) {
            this.h = z;
            return this;
        }

        public final void t0(@NotNull List<oq5> list) {
            c25.p(list, "<set-?>");
            this.s = list;
        }

        @NotNull
        public final a u(boolean z) {
            this.i = z;
            return this;
        }

        public final void u0(@NotNull rq5 rq5Var) {
            c25.p(rq5Var, "<set-?>");
            this.j = rq5Var;
        }

        @NotNull
        public final eq5 v() {
            return this.g;
        }

        public final void v0(@NotNull tq5 tq5Var) {
            c25.p(tq5Var, "<set-?>");
            this.a = tq5Var;
        }

        @Nullable
        public final fq5 w() {
            return this.k;
        }

        public final void w0(@NotNull uq5 uq5Var) {
            c25.p(uq5Var, "<set-?>");
            this.l = uq5Var;
        }

        public final int x() {
            return this.x;
        }

        public final void x0(@NotNull vq5.c cVar) {
            c25.p(cVar, "<set-?>");
            this.e = cVar;
        }

        @Nullable
        public final ru5 y() {
            return this.w;
        }

        public final void y0(boolean z) {
            this.h = z;
        }

        @NotNull
        public final jq5 z() {
            return this.v;
        }

        public final void z0(boolean z) {
            this.i = z;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull fr5 fr5Var) {
            this();
            c25.p(fr5Var, "okHttpClient");
            this.a = fr5Var.c0();
            this.b = fr5Var.Z();
            os4.o0(this.c, fr5Var.j0());
            os4.o0(this.d, fr5Var.l0());
            this.e = fr5Var.e0();
            this.f = fr5Var.t0();
            this.g = fr5Var.R();
            this.h = fr5Var.f0();
            this.i = fr5Var.g0();
            this.j = fr5Var.b0();
            this.k = fr5Var.S();
            this.l = fr5Var.d0();
            this.m = fr5Var.p0();
            this.n = fr5Var.r0();
            this.o = fr5Var.q0();
            this.p = fr5Var.u0();
            this.q = fr5Var.L;
            this.r = fr5Var.A0();
            this.s = fr5Var.a0();
            this.t = fr5Var.o0();
            this.u = fr5Var.i0();
            this.v = fr5Var.V();
            this.w = fr5Var.U();
            this.x = fr5Var.T();
            this.y = fr5Var.X();
            this.z = fr5Var.s0();
            this.A = fr5Var.z0();
            this.B = fr5Var.n0();
            this.C = fr5Var.k0();
            this.D = fr5Var.h0();
        }
    }

    public fr5() {
        this(new a());
    }
}