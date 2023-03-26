package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.p7700g.p99005.lu5;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Android10SocketAdapter.kt */
@SuppressLint({"NewApi"})
@rr5
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/bu5;", "Lcom/p7700g/p99005/lu5;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "a", "()Z", "", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class bu5 implements lu5 {
    public static final a a = new a(null);

    /* compiled from: Android10SocketAdapter.kt */
    @rr5
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/p7700g/p99005/bu5$a", "", "Lcom/p7700g/p99005/lu5;", "a", "()Lcom/p7700g/p99005/lu5;", "", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @Nullable
        public final lu5 a() {
            if (b()) {
                return new bu5();
            }
            return null;
        }

        public final boolean b() {
            return au5.e.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.p7700g.p99005.lu5
    public boolean a() {
        return a.b();
    }

    @Override // com.p7700g.p99005.lu5
    public boolean b(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // com.p7700g.p99005.lu5
    @SuppressLint({"NewApi"})
    @Nullable
    public String c(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.p7700g.p99005.lu5
    @Nullable
    public X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        return lu5.a.b(this, sSLSocketFactory);
    }

    @Override // com.p7700g.p99005.lu5
    public boolean e(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        return lu5.a.a(this, sSLSocketFactory);
    }

    @Override // com.p7700g.p99005.lu5
    @SuppressLint({"NewApi"})
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gr5> list) {
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            c25.o(sSLParameters, "sslParameters");
            Object[] array = au5.e.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}