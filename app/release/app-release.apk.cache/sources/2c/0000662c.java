package com.p7700g.p99005;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \n2\u00020\u0001:\u0002\u001f B7\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012¨\u0006!"}, d2 = {"Lcom/p7700g/p99005/xt5;", "Lcom/p7700g/p99005/au5;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lcom/p7700g/p99005/gr5;", "protocols", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "i", "Ljava/lang/reflect/Method;", "removeMethod", "Ljava/lang/Class;", "k", "Ljava/lang/Class;", "serverProviderClass", "h", "getMethod", "clientProviderClass", com.anythink.basead.d.g.i, "putMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class xt5 extends au5 {
    public static final b f = new b(null);
    private final Method g;
    private final Method h;
    private final Method i;
    private final Class<?> j;
    private final Class<?> k;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018\"\u0004\b\u0014\u0010\u0019¨\u0006\u001d"}, d2 = {"com/p7700g/p99005/xt5$a", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "Z", "b", "()Z", "d", "(Z)V", "unsupported", "", "", "c", "Ljava/util/List;", "protocols", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "selected", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a implements InvocationHandler {
        private boolean a;
        @Nullable
        private String b;
        private final List<String> c;

        public a(@NotNull List<String> list) {
            c25.p(list, "protocols");
            this.c = list;
        }

        @Nullable
        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public final void c(@Nullable String str) {
            this.b = str;
        }

        public final void d(boolean z) {
            this.a = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            c25.p(obj, "proxy");
            c25.p(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (c25.g(name, "supports") && c25.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (c25.g(name, "unsupported") && c25.g(Void.TYPE, returnType)) {
                this.a = true;
                return null;
            }
            if (c25.g(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.c;
                }
            }
            if ((c25.g(name, "selectProtocol") || c25.g(name, "select")) && c25.g(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!this.c.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.b = str;
                            return str;
                        }
                    }
                }
                String str2 = this.c.get(0);
                this.b = str2;
                return str2;
            } else if ((c25.g(name, "protocolSelected") || c25.g(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                this.b = (String) obj4;
                return null;
            } else {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/xt5$b", "", "Lcom/p7700g/p99005/au5;", "a", "()Lcom/p7700g/p99005/au5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        @Nullable
        public final au5 a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                c25.o(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod(la1.b, SSLSocket.class);
                c25.o(method, "putMethod");
                c25.o(method2, "getMethod");
                c25.o(method3, "removeMethod");
                c25.o(cls3, "clientProviderClass");
                c25.o(cls4, "serverProviderClass");
                return new xt5(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xt5(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        c25.p(method, "putMethod");
        c25.p(method2, "getMethod");
        c25.p(method3, "removeMethod");
        c25.p(cls, "clientProviderClass");
        c25.p(cls2, "serverProviderClass");
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = cls;
        this.k = cls2;
    }

    @Override // com.p7700g.p99005.au5
    public void c(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        try {
            this.i.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // com.p7700g.p99005.au5
    public void f(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gr5> list) {
        c25.p(sSLSocket, "sslSocket");
        c25.p(list, "protocols");
        try {
            this.g.invoke(null, sSLSocket, Proxy.newProxyInstance(au5.class.getClassLoader(), new Class[]{this.j, this.k}, new a(au5.e.b(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // com.p7700g.p99005.au5
    @Nullable
    public String j(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.h.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    au5.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}