package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.qm3;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Platform.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 92\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020!2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010\u0004¨\u0006A"}, d2 = {"Lcom/p7700g/p99005/au5;", "", "", "i", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "p", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "r", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lcom/p7700g/p99005/gr5;", "Lcom/p7700g/p99005/kz4;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", com.anythink.basead.d.g.i, "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", qm3.b.j, d.a.w, "", "t", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "l", "(Ljava/lang/String;)Z", "closer", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", ij3.b, "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lcom/p7700g/p99005/ru5;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/ru5;", "Lcom/p7700g/p99005/tu5;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/tu5;", "q", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class au5 {
    private static volatile au5 a = null;
    public static final int b = 4;
    public static final int c = 5;
    private static final Logger d;
    public static final a e;

    /* compiled from: Platform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u00020\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010!R\u001e\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006*"}, d2 = {"com/p7700g/p99005/au5$a", "", "Lcom/p7700g/p99005/au5;", "f", "()Lcom/p7700g/p99005/au5;", "d", "e", com.anythink.basead.d.g.i, "platform", "Lcom/p7700g/p99005/yq4;", "l", "(Lcom/p7700g/p99005/au5;)V", "", "Lcom/p7700g/p99005/gr5;", "protocols", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)[B", "", "k", "()Z", "isOpenJSSEPreferred", "h", "isAndroid", "j", "isConscryptPreferred", "i", "isBouncyCastlePreferred", "", "INFO", AFHydra.STATUS_IDLE, "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lcom/p7700g/p99005/au5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        private final au5 d() {
            du5.d.b();
            au5 a = tt5.g.a();
            if (a != null) {
                return a;
            }
            au5 a2 = ut5.g.a();
            c25.m(a2);
            return a2;
        }

        private final au5 e() {
            zt5 a;
            vt5 a2;
            wt5 c;
            if (!j() || (c = wt5.g.c()) == null) {
                if (!i() || (a2 = vt5.g.a()) == null) {
                    if (!k() || (a = zt5.g.a()) == null) {
                        yt5 a3 = yt5.g.a();
                        if (a3 != null) {
                            return a3;
                        }
                        au5 a4 = xt5.f.a();
                        return a4 != null ? a4 : new au5();
                    }
                    return a;
                }
                return a2;
            }
            return c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final au5 f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            c25.o(provider, "Security.getProviders()[0]");
            return c25.g("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            c25.o(provider, "Security.getProviders()[0]");
            return c25.g("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            c25.o(provider, "Security.getProviders()[0]");
            return c25.g("OpenJSSE", provider.getName());
        }

        public static /* synthetic */ void m(a aVar, au5 au5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                au5Var = aVar.f();
            }
            aVar.l(au5Var);
        }

        @NotNull
        public final List<String> b(@NotNull List<? extends gr5> list) {
            c25.p(list, "protocols");
            ArrayList<gr5> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((gr5) obj) != gr5.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ks4.Z(arrayList, 10));
            for (gr5 gr5Var : arrayList) {
                arrayList2.add(gr5Var.toString());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] c(@NotNull List<? extends gr5> list) {
            c25.p(list, "protocols");
            sv5 sv5Var = new sv5();
            for (String str : b(list)) {
                sv5Var.g0(str.length());
                sv5Var.K0(str);
            }
            return sv5Var.b0();
        }

        @jz4
        @NotNull
        public final au5 g() {
            return au5.a;
        }

        public final boolean h() {
            return c25.g("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void l(@NotNull au5 au5Var) {
            c25.p(au5Var, "platform");
            au5.a = au5Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        e = aVar;
        a = aVar.f();
        d = Logger.getLogger(fr5.class.getName());
    }

    @jz4
    @NotNull
    public static final au5 h() {
        return e.g();
    }

    public static /* synthetic */ void n(au5 au5Var, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            au5Var.m(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void c(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
    }

    @NotNull
    public ru5 d(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        return new pu5(e(x509TrustManager));
    }

    @NotNull
    public tu5 e(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        c25.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new qu5((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<gr5> list) {
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
    }

    public void g(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i) throws IOException {
        c25.p(socket, "socket");
        c25.p(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    @NotNull
    public final String i() {
        return "OkHttp";
    }

    @Nullable
    public String j(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object k(@NotNull String str) {
        c25.p(str, "closer");
        if (d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean l(@NotNull String str) {
        c25.p(str, "hostname");
        return true;
    }

    public void m(@NotNull String str, int i, @Nullable Throwable th) {
        c25.p(str, qm3.b.j);
        d.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void o(@NotNull String str, @Nullable Object obj) {
        c25.p(str, qm3.b.j);
        if (obj == null) {
            str = wo1.t(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(str, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        c25.o(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory q(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        try {
            SSLContext p = p();
            p.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = p.getSocketFactory();
            c25.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    @NotNull
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        c25.o(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        c25.m(trustManagers);
        boolean z = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder G = wo1.G("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        c25.o(arrays, "java.util.Arrays.toString(this)");
        G.append(arrays);
        throw new IllegalStateException(G.toString().toString());
    }

    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            c25.o(cls, "sslContextClass");
            Object Q = sr5.Q(sSLSocketFactory, cls, "context");
            if (Q != null) {
                return (X509TrustManager) sr5.Q(Q, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        c25.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}