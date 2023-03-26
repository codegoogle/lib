package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConscryptPlatform.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0002#$B\t\b\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/wt5;", "Lcom/p7700g/p99005/au5;", "Ljavax/net/ssl/SSLContext;", "p", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "r", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "Lcom/p7700g/p99005/kz4;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "trustManager", "q", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "Ljava/security/Provider;", "h", "Ljava/security/Provider;", IronSourceConstants.EVENTS_PROVIDER, "<init>", "()V", com.anythink.basead.d.g.i, "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class wt5 extends au5 {
    private static final boolean f;
    public static final a g;
    private final Provider h;

    /* compiled from: ConscryptPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/wt5$a", "", "Lcom/p7700g/p99005/wt5;", "c", "()Lcom/p7700g/p99005/wt5;", "", "major", "minor", "patch", "", "a", "(III)Z", "isSupported", "Z", "d", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ boolean b(a aVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return aVar.a(i, i2, i3);
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        @Nullable
        public final wt5 c() {
            if (d()) {
                return new wt5(null);
            }
            return null;
        }

        public final boolean d() {
            return wt5.f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\f\u001a\u00020\u00062\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/wt5$b", "Lorg/conscrypt/ConscryptHostnameVerifier;", "", "hostname", "Ljavax/net/ssl/SSLSession;", yo3.e, "", "a", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "", "Ljava/security/cert/X509Certificate;", "certs", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();

        private b() {
        }

        public final boolean a(@Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }

        public boolean b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }
    }

    static {
        a aVar = new a(null);
        g = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f = z;
    }

    private wt5() {
        Provider newProvider = Conscrypt.newProvider();
        c25.o(newProvider, "Conscrypt.newProvider()");
        this.h = newProvider;
    }

    @Override // com.p7700g.p99005.au5
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<gr5> list) {
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = au5.e.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.f(sSLSocket, str, list);
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public String j(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.j(sSLSocket);
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.h);
        c25.o(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public SSLSocketFactory q(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        SSLContext p = p();
        p.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = p.getSocketFactory();
        c25.o(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        c25.o(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        c25.m(trustManagers);
        boolean z = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
            return x509TrustManager;
        }
        StringBuilder G = wo1.G("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        c25.o(arrays, "java.util.Arrays.toString(this)");
        G.append(arrays);
        throw new IllegalStateException(G.toString().toString());
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    public /* synthetic */ wt5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}