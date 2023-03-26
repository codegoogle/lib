package com.p7700g.p99005;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocketAdapter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/p7700g/p99005/lu5;", "", "", "a", "()Z", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "d", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "e", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface lu5 {

    /* compiled from: SocketAdapter.kt */
    @vo4(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(@NotNull lu5 lu5Var, @NotNull SSLSocketFactory sSLSocketFactory) {
            c25.p(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        @Nullable
        public static X509TrustManager b(@NotNull lu5 lu5Var, @NotNull SSLSocketFactory sSLSocketFactory) {
            c25.p(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean a();

    boolean b(@NotNull SSLSocket sSLSocket);

    @Nullable
    String c(@NotNull SSLSocket sSLSocket);

    @Nullable
    X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory);

    boolean e(@NotNull SSLSocketFactory sSLSocketFactory);

    void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gr5> list);
}