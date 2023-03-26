package com.p7700g.p99005;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaNetAuthenticator.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/p7700g/p99005/ur5;", "Lcom/p7700g/p99005/eq5;", "Ljava/net/Proxy;", "Lcom/p7700g/p99005/zq5;", "url", "Lcom/p7700g/p99005/uq5;", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lcom/p7700g/p99005/zq5;Lcom/p7700g/p99005/uq5;)Ljava/net/InetAddress;", "Lcom/p7700g/p99005/lr5;", "route", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/hr5;", "a", "(Lcom/p7700g/p99005/lr5;Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/hr5;", "d", "Lcom/p7700g/p99005/uq5;", "defaultDns", "<init>", "(Lcom/p7700g/p99005/uq5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ur5 implements eq5 {
    private final uq5 d;

    public ur5() {
        this(null, 1, null);
    }

    public ur5(@NotNull uq5 uq5Var) {
        c25.p(uq5Var, "defaultDns");
        this.d = uq5Var;
    }

    private final InetAddress b(Proxy proxy, zq5 zq5Var, uq5 uq5Var) throws IOException {
        Proxy.Type type = proxy.type();
        if (type == null || tr5.a[type.ordinal()] != 1) {
            SocketAddress address = proxy.address();
            Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            c25.o(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        return (InetAddress) rs4.w2(uq5Var.a(zq5Var.F()));
    }

    @Override // com.p7700g.p99005.eq5
    @Nullable
    public hr5 a(@Nullable lr5 lr5Var, @NotNull jr5 jr5Var) throws IOException {
        Proxy proxy;
        uq5 uq5Var;
        PasswordAuthentication requestPasswordAuthentication;
        dq5 d;
        c25.p(jr5Var, "response");
        List<kq5> A = jr5Var.A();
        hr5 T1 = jr5Var.T1();
        zq5 q = T1.q();
        boolean z = jr5Var.E() == 407;
        if (lr5Var == null || (proxy = lr5Var.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (kq5 kq5Var : A) {
            if (b95.K1("Basic", kq5Var.h(), true)) {
                if (lr5Var == null || (d = lr5Var.d()) == null || (uq5Var = d.n()) == null) {
                    uq5Var = this.d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    c25.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, q, uq5Var), inetSocketAddress.getPort(), q.X(), kq5Var.g(), kq5Var.h(), q.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String F = q.F();
                    c25.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(F, b(proxy, q, uq5Var), q.N(), q.X(), kq5Var.g(), kq5Var.h(), q.a0(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    c25.o(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    c25.o(password, "auth.password");
                    return T1.n().n(str, sq5.b(userName, new String(password), kq5Var.f())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ ur5(uq5 uq5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uq5.a : uq5Var);
    }
}