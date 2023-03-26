package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Android10Platform.kt */
@rr5
@vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/tt5;", "Lcom/p7700g/p99005/au5;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "l", "(Ljava/lang/String;)Z", "trustManager", "Lcom/p7700g/p99005/ru5;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lcom/p7700g/p99005/ru5;", "Lcom/p7700g/p99005/lu5;", "h", "Ljava/util/List;", "socketAdapters", "<init>", "()V", com.anythink.basead.d.g.i, "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class tt5 extends au5 {
    private static final boolean f;
    public static final a g = new a(null);
    private final List<lu5> h;

    /* compiled from: Android10Platform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/p7700g/p99005/tt5$a", "", "Lcom/p7700g/p99005/au5;", "a", "()Lcom/p7700g/p99005/au5;", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @Nullable
        public final au5 a() {
            if (b()) {
                return new tt5();
            }
            return null;
        }

        public final boolean b() {
            return tt5.f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f = au5.e.h() && Build.VERSION.SDK_INT >= 29;
    }

    public tt5() {
        List O = js4.O(bu5.a.a(), new ku5(gu5.b.d()), new ku5(ju5.b.a()), new ku5(hu5.b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : O) {
            if (((lu5) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.h = arrayList;
    }

    @Override // com.p7700g.p99005.au5
    @NotNull
    public ru5 d(@NotNull X509TrustManager x509TrustManager) {
        c25.p(x509TrustManager, "trustManager");
        cu5 a2 = cu5.b.a(x509TrustManager);
        return a2 != null ? a2 : super.d(x509TrustManager);
    }

    @Override // com.p7700g.p99005.au5
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gr5> list) {
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
    @SuppressLint({"NewApi"})
    public boolean l(@NotNull String str) {
        c25.p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
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