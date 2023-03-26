package com.p7700g.p99005;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StandardAndroidSocketAdapter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B3\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00100\n\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\n\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/p7700g/p99005/mu5;", "Lcom/p7700g/p99005/gu5;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "e", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "Ljavax/net/ssl/X509TrustManager;", "d", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljava/lang/Class;", "i", "Ljava/lang/Class;", "sslSocketFactoryClass", "j", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "h", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class mu5 extends gu5 {
    public static final a h = new a(null);
    private final Class<? super SSLSocketFactory> i;
    private final Class<?> j;

    /* compiled from: StandardAndroidSocketAdapter.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/mu5$a", "", "", "packageName", "Lcom/p7700g/p99005/lu5;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/lu5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ lu5 b(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        @Nullable
        public final lu5 a(@NotNull String str) {
            c25.p(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                c25.o(cls3, "paramsClass");
                return new mu5(cls, cls2, cls3);
            } catch (Exception e) {
                au5.e.g().m("unable to load android socket classes", 5, e);
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu5(@NotNull Class<? super SSLSocket> cls, @NotNull Class<? super SSLSocketFactory> cls2, @NotNull Class<?> cls3) {
        super(cls);
        c25.p(cls, "sslSocketClass");
        c25.p(cls2, "sslSocketFactoryClass");
        c25.p(cls3, "paramClass");
        this.i = cls2;
        this.j = cls3;
    }

    @Override // com.p7700g.p99005.gu5, com.p7700g.p99005.lu5
    @Nullable
    public X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        Object Q = sr5.Q(sSLSocketFactory, this.j, "sslParameters");
        c25.m(Q);
        X509TrustManager x509TrustManager = (X509TrustManager) sr5.Q(Q, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) sr5.Q(Q, X509TrustManager.class, "trustManager");
    }

    @Override // com.p7700g.p99005.gu5, com.p7700g.p99005.lu5
    public boolean e(@NotNull SSLSocketFactory sSLSocketFactory) {
        c25.p(sSLSocketFactory, "sslSocketFactory");
        return this.i.isInstance(sSLSocketFactory);
    }
}