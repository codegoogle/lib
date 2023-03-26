package com.p7700g.p99005;

import com.p7700g.p99005.lu5;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeferredSocketAdapter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/p7700g/p99005/ku5;", "Lcom/p7700g/p99005/lu5;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", com.anythink.basead.d.g.i, "(Ljavax/net/ssl/SSLSocket;)Lcom/p7700g/p99005/lu5;", "", "a", "()Z", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lcom/p7700g/p99005/lu5;", "delegate", "Lcom/p7700g/p99005/ku5$a;", "Lcom/p7700g/p99005/ku5$a;", "socketAdapterFactory", "<init>", "(Lcom/p7700g/p99005/ku5$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ku5 implements lu5 {
    private lu5 a;
    private final a b;

    /* compiled from: DeferredSocketAdapter.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/p7700g/p99005/ku5$a", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lcom/p7700g/p99005/lu5;", "c", "(Ljavax/net/ssl/SSLSocket;)Lcom/p7700g/p99005/lu5;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        boolean b(@NotNull SSLSocket sSLSocket);

        @NotNull
        lu5 c(@NotNull SSLSocket sSLSocket);
    }

    public ku5(@NotNull a aVar) {
        c25.p(aVar, "socketAdapterFactory");
        this.b = aVar;
    }

    private final synchronized lu5 g(SSLSocket sSLSocket) {
        if (this.a == null && this.b.b(sSLSocket)) {
            this.a = this.b.c(sSLSocket);
        }
        return this.a;
    }

    @Override // com.p7700g.p99005.lu5
    public boolean a() {
        return true;
    }

    @Override // com.p7700g.p99005.lu5
    public boolean b(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        return this.b.b(sSLSocket);
    }

    @Override // com.p7700g.p99005.lu5
    @Nullable
    public String c(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        lu5 g = g(sSLSocket);
        if (g != null) {
            return g.c(sSLSocket);
        }
        return null;
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
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gr5> list) {
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
        lu5 g = g(sSLSocket);
        if (g != null) {
            g.f(sSLSocket, str, list);
        }
    }
}