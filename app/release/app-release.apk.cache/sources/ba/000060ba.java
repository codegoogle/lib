package com.p7700g.p99005;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.p7700g.p99005.mu5;
import com.p7700g.p99005.qm3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPlatform.kt */
@rr5
@vo4(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u00020\u0001:\u000289B\u0007¢\u0006\u0004\b6\u00107J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/p7700g/p99005/ut5;", "Lcom/p7700g/p99005/au5;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lcom/p7700g/p99005/yq4;", com.anythink.basead.d.g.i, "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "Lcom/p7700g/p99005/kz4;", "protocols", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "k", "(Ljava/lang/String;)Ljava/lang/Object;", qm3.b.j, "stackTrace", ij3.b, "(Ljava/lang/String;Ljava/lang/Object;)V", "", "l", "(Ljava/lang/String;)Z", "trustManager", "Lcom/p7700g/p99005/ru5;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/ru5;", "Lcom/p7700g/p99005/tu5;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/tu5;", "Lcom/p7700g/p99005/lu5;", "h", "Ljava/util/List;", "socketAdapters", "Lcom/p7700g/p99005/iu5;", "i", "Lcom/p7700g/p99005/iu5;", "closeGuard", "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ut5 extends au5 {
    private static final boolean f;
    public static final a g = new a(null);
    private final List<lu5> h;
    private final iu5 i;

    /* compiled from: AndroidPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/p7700g/p99005/ut5$a", "", "Lcom/p7700g/p99005/au5;", "a", "()Lcom/p7700g/p99005/au5;", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @Nullable
        public final au5 a() {
            if (b()) {
                return new ut5();
            }
            return null;
        }

        public final boolean b() {
            return ut5.f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006 "}, d2 = {"com/p7700g/p99005/ut5$b", "Lcom/p7700g/p99005/tu5;", "Ljavax/net/ssl/X509TrustManager;", "b", "()Ljavax/net/ssl/X509TrustManager;", "Ljava/lang/reflect/Method;", "c", "()Ljava/lang/reflect/Method;", "Ljava/security/cert/X509Certificate;", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "trustManager", "findByIssuerAndSignatureMethod", "Lcom/p7700g/p99005/ut5$b;", "d", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)Lcom/p7700g/p99005/ut5$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", "Ljavax/net/ssl/X509TrustManager;", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b implements tu5 {
        private final X509TrustManager a;
        private final Method b;

        public b(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            c25.p(x509TrustManager, "trustManager");
            c25.p(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        private final X509TrustManager b() {
            return this.a;
        }

        private final Method c() {
            return this.b;
        }

        public static /* synthetic */ b e(b bVar, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = bVar.a;
            }
            if ((i & 2) != 0) {
                method = bVar.b;
            }
            return bVar.d(x509TrustManager, method);
        }

        @Override // com.p7700g.p99005.tu5
        @Nullable
        public X509Certificate a(@NotNull X509Certificate x509Certificate) {
            c25.p(x509Certificate, "cert");
            try {
                Object invoke = this.b.invoke(this.a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        @NotNull
        public final b d(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            c25.p(x509TrustManager, "trustManager");
            c25.p(method, "findByIssuerAndSignatureMethod");
            return new b(x509TrustManager, method);
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return c25.g(this.a, bVar.a) && c25.g(this.b, bVar.b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("CustomTrustRootIndex(trustManager=");
            G.append(this.a);
            G.append(", findByIssuerAndSignatureMethod=");
            G.append(this.b);
            G.append(")");
            return G.toString();
        }
    }

    static {
        boolean z = false;
        if (au5.e.h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f = z;
    }

    public ut5() {
        List O = js4.O(mu5.a.b(mu5.h, null, 1, null), new ku5(gu5.b.d()), new ku5(ju5.b.a()), new ku5(hu5.b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : O) {
            if (((lu5) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.h = arrayList;
        this.i = iu5.a.a();
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public ru5 d(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        cu5 a2 = cu5.b.a(x509TrustManager);
        return a2 != null ? a2 : super.d(x509TrustManager);
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public tu5 e(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            c25.o(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // com.p7700g.p99005.au5
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<gr5> list) {
        Object obj;
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lu5) obj).b(sSLSocket)) {
                break;
            }
        }
        lu5 lu5Var = (lu5) obj;
        if (lu5Var != null) {
            lu5Var.f(sSLSocket, str, list);
        }
    }

    @Override // com.p7700g.p99005.au5
    public void g(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i) throws IOException {
        c25.p(socket, "socket");
        c25.p(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public String j(@NotNull SSLSocket sSLSocket) {
        Object obj;
        c25.p(sSLSocket, "sslSocket");
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lu5) obj).b(sSLSocket)) {
                break;
            }
        }
        lu5 lu5Var = (lu5) obj;
        if (lu5Var != null) {
            return lu5Var.c(sSLSocket);
        }
        return null;
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public Object k(@NotNull String str) {
        c25.p(str, "closer");
        return this.i.a(str);
    }

    @Override // com.p7700g.p99005.au5
    public boolean l(@NotNull String str) {
        c25.p(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            c25.o(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            return networkSecurityPolicy.isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // com.p7700g.p99005.au5
    public void o(@NotNull String str, @Nullable Object obj) {
        c25.p(str, qm3.b.j);
        if (this.i.b(obj)) {
            return;
        }
        au5.n(this, str, 5, null, 4, null);
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sSLSocketFactory) {
        Object obj;
        c25.p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lu5) obj).e(sSLSocketFactory)) {
                break;
            }
        }
        lu5 lu5Var = (lu5) obj;
        if (lu5Var != null) {
            return lu5Var.d(sSLSocketFactory);
        }
        return null;
    }
}