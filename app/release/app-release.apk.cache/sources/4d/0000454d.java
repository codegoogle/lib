package com.p7700g.p99005;

import com.p7700g.p99005.ku5;
import com.p7700g.p99005.lu5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidSocketAdapter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0003B\u0017\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0013¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001e\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001e\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/gu5;", "Lcom/p7700g/p99005/lu5;", "", "a", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", com.anythink.basead.d.g.i, "Ljava/lang/Class;", "sslSocketClass", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "e", "getAlpnSelectedProtocol", "d", "setHostname", "setAlpnProtocols", "<init>", "(Ljava/lang/Class;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class gu5 implements lu5 {
    @NotNull
    private static final ku5.a a;
    public static final a b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class<? super SSLSocket> g;

    /* compiled from: AndroidSocketAdapter.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/gu5$a", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lcom/p7700g/p99005/gu5;", "b", "(Ljava/lang/Class;)Lcom/p7700g/p99005/gu5;", "", "packageName", "Lcom/p7700g/p99005/ku5$a;", "c", "(Ljava/lang/String;)Lcom/p7700g/p99005/ku5$a;", "playProviderFactory", "Lcom/p7700g/p99005/ku5$a;", "d", "()Lcom/p7700g/p99005/ku5$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AndroidSocketAdapter.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/p7700g/p99005/gu5$a$a", "Lcom/p7700g/p99005/ku5$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lcom/p7700g/p99005/lu5;", "c", "(Ljavax/net/ssl/SSLSocket;)Lcom/p7700g/p99005/lu5;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.gu5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0184a implements ku5.a {
            public final /* synthetic */ String a;

            public C0184a(String str) {
                this.a = str;
            }

            @Override // com.p7700g.p99005.ku5.a
            public boolean b(@NotNull SSLSocket sSLSocket) {
                c25.p(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                c25.o(name, "sslSocket.javaClass.name");
                return b95.u2(name, wo1.B(new StringBuilder(), this.a, '.'), false, 2, null);
            }

            @Override // com.p7700g.p99005.ku5.a
            @NotNull
            public lu5 c(@NotNull SSLSocket sSLSocket) {
                c25.p(sSLSocket, "sslSocket");
                return gu5.b.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final gu5 b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!c25.g(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            c25.m(cls2);
            return new gu5(cls2);
        }

        @NotNull
        public final ku5.a c(@NotNull String str) {
            c25.p(str, "packageName");
            return new C0184a(str);
        }

        @NotNull
        public final ku5.a d() {
            return gu5.a;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        b = aVar;
        a = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public gu5(@NotNull Class<? super SSLSocket> cls) {
        c25.p(cls, "sslSocketClass");
        this.g = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        c25.o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.p7700g.p99005.lu5
    public boolean a() {
        return ut5.g.b();
    }

    @Override // com.p7700g.p99005.lu5
    public boolean b(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        return this.g.isInstance(sSLSocket);
    }

    @Override // com.p7700g.p99005.lu5
    @Nullable
    public String c(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        if (b(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.e.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    c25.o(charset, "StandardCharsets.UTF_8");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (c25.g(e2.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
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
        if (b(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.d.invoke(sSLSocket, str);
                }
                this.f.invoke(sSLSocket, au5.e.c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}