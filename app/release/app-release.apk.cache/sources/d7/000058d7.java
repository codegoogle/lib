package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: RouteSelector.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0002/\u0010B'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b-\u0010.J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+¨\u00060"}, d2 = {"Lcom/p7700g/p99005/qs5;", "", "Lcom/p7700g/p99005/zq5;", "url", "Ljava/net/Proxy;", "proxy", "Lcom/p7700g/p99005/yq4;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/zq5;Ljava/net/Proxy;)V", "", "c", "()Z", "e", "()Ljava/net/Proxy;", "f", "(Ljava/net/Proxy;)V", "b", "Lcom/p7700g/p99005/qs5$b;", "d", "()Lcom/p7700g/p99005/qs5$b;", "Lcom/p7700g/p99005/hq5;", "h", "Lcom/p7700g/p99005/hq5;", kg.p0, "Lcom/p7700g/p99005/vq5;", "i", "Lcom/p7700g/p99005/vq5;", "eventListener", "", "Lcom/p7700g/p99005/lr5;", "Ljava/util/List;", "postponedRoutes", "", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "Lcom/p7700g/p99005/os5;", "Lcom/p7700g/p99005/os5;", "routeDatabase", "proxies", "", AFHydra.STATUS_IDLE, "nextProxyIndex", "Lcom/p7700g/p99005/dq5;", "Lcom/p7700g/p99005/dq5;", "address", "<init>", "(Lcom/p7700g/p99005/dq5;Lcom/p7700g/p99005/os5;Lcom/p7700g/p99005/hq5;Lcom/p7700g/p99005/vq5;)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class qs5 {
    public static final a a = new a(null);
    private List<? extends Proxy> b;
    private int c;
    private List<? extends InetSocketAddress> d;
    private final List<lr5> e;
    private final dq5 f;
    private final os5 g;
    private final hq5 h;
    private final vq5 i;

    /* compiled from: RouteSelector.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"com/p7700g/p99005/qs5$a", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final String a(@NotNull InetSocketAddress inetSocketAddress) {
            c25.p(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                c25.o(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            c25.o(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/qs5$b", "", "", "b", "()Z", "Lcom/p7700g/p99005/lr5;", "c", "()Lcom/p7700g/p99005/lr5;", "", "Ljava/util/List;", "a", "()Ljava/util/List;", "routes", "", AFHydra.STATUS_IDLE, "nextRouteIndex", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private int a;
        @NotNull
        private final List<lr5> b;

        public b(@NotNull List<lr5> list) {
            c25.p(list, "routes");
            this.b = list;
        }

        @NotNull
        public final List<lr5> a() {
            return this.b;
        }

        public final boolean b() {
            return this.a < this.b.size();
        }

        @NotNull
        public final lr5 c() {
            if (b()) {
                List<lr5> list = this.b;
                int i = this.a;
                this.a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: RouteSelector.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/net/Proxy;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<List<? extends Proxy>> {
        public final /* synthetic */ Proxy u;
        public final /* synthetic */ zq5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Proxy proxy, zq5 zq5Var) {
            super(0);
            this.u = proxy;
            this.v = zq5Var;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final List<Proxy> x() {
            Proxy proxy = this.u;
            if (proxy != null) {
                return is4.l(proxy);
            }
            URI Z = this.v.Z();
            if (Z.getHost() == null) {
                return sr5.z(Proxy.NO_PROXY);
            }
            List<Proxy> select = qs5.this.f.t().select(Z);
            return select == null || select.isEmpty() ? sr5.z(Proxy.NO_PROXY) : sr5.c0(select);
        }
    }

    public qs5(@NotNull dq5 dq5Var, @NotNull os5 os5Var, @NotNull hq5 hq5Var, @NotNull vq5 vq5Var) {
        c25.p(dq5Var, "address");
        c25.p(os5Var, "routeDatabase");
        c25.p(hq5Var, kg.p0);
        c25.p(vq5Var, "eventListener");
        this.f = dq5Var;
        this.g = os5Var;
        this.h = hq5Var;
        this.i = vq5Var;
        this.b = js4.F();
        this.d = js4.F();
        this.e = new ArrayList();
        g(dq5Var.w(), dq5Var.r());
    }

    private final boolean c() {
        return this.c < this.b.size();
    }

    private final Proxy e() throws IOException {
        if (c()) {
            List<? extends Proxy> list = this.b;
            int i = this.c;
            this.c = i + 1;
            Proxy proxy = list.get(i);
            f(proxy);
            return proxy;
        }
        StringBuilder G = wo1.G("No route to ");
        G.append(this.f.w().F());
        G.append("; exhausted proxy configurations: ");
        G.append(this.b);
        throw new SocketException(G.toString());
    }

    private final void f(Proxy proxy) throws IOException {
        String F;
        int N;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                F = a.a(inetSocketAddress);
                N = inetSocketAddress.getPort();
            } else {
                StringBuilder G = wo1.G("Proxy.address() is not an InetSocketAddress: ");
                G.append(address.getClass());
                throw new IllegalArgumentException(G.toString().toString());
            }
        } else {
            F = this.f.w().F();
            N = this.f.w().N();
        }
        if (1 <= N && 65535 >= N) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(F, N));
                return;
            }
            this.i.n(this.h, F);
            List<InetAddress> a2 = this.f.n().a(F);
            if (!a2.isEmpty()) {
                this.i.m(this.h, F, a2);
                for (InetAddress inetAddress : a2) {
                    arrayList.add(new InetSocketAddress(inetAddress, N));
                }
                return;
            }
            throw new UnknownHostException(this.f.n() + " returned no addresses for " + F);
        }
        throw new SocketException("No route to " + F + ':' + N + "; port is out of range");
    }

    private final void g(zq5 zq5Var, Proxy proxy) {
        c cVar = new c(proxy, zq5Var);
        this.i.p(this.h, zq5Var);
        List<Proxy> x = cVar.x();
        this.b = x;
        this.c = 0;
        this.i.o(this.h, zq5Var, x);
    }

    public final boolean b() {
        return c() || (this.e.isEmpty() ^ true);
    }

    @NotNull
    public final b d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e = e();
                for (InetSocketAddress inetSocketAddress : this.d) {
                    lr5 lr5Var = new lr5(this.f, e, inetSocketAddress);
                    if (this.g.c(lr5Var)) {
                        this.e.add(lr5Var);
                    } else {
                        arrayList.add(lr5Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                os4.o0(arrayList, this.e);
                this.e.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}