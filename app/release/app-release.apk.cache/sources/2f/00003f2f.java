package com.p7700g.p99005;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.zq5;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Address.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b'\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010P\u001a\u00020-\u0012\u0006\u0010Q\u001a\u00020'\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u0010A\u001a\u00020\b\u0012\b\u0010L\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010I\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010>\u001a\u0004\u0018\u00010 \u0012\u0006\u0010D\u001a\u00020\u000b\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0017\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0010O\u001a\u00020\u0014¢\u0006\u0004\bR\u0010SJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0019\u00102\u001a\u00020\u00028G@\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b1\u0010\u0004R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G@\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u0010\u0011R\u0019\u00108\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b7\u0010\u0007R\u001b\u0010;\u001a\u0004\u0018\u00010\u00178\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010\u0019R\u001b\u0010>\u001a\u0004\u0018\u00010 8\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010\"R\u0019\u0010A\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010\nR\u0019\u0010D\u001a\u00020\u000b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\rR\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8G@\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\bE\u0010\u0011R\u001b\u0010I\u001a\u0004\u0018\u00010\u001d8\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010\u001fR\u001b\u0010L\u001a\u0004\u0018\u00010\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u0010\u001cR\u0019\u0010O\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010\u0016¨\u0006T"}, d2 = {"Lcom/p7700g/p99005/dq5;", "", "Lcom/p7700g/p99005/zq5;", "k", "()Lcom/p7700g/p99005/zq5;", "Lcom/p7700g/p99005/uq5;", "c", "()Lcom/p7700g/p99005/uq5;", "Ljavax/net/SocketFactory;", "i", "()Ljavax/net/SocketFactory;", "Lcom/p7700g/p99005/eq5;", com.anythink.basead.d.g.i, "()Lcom/p7700g/p99005/eq5;", "", "Lcom/p7700g/p99005/gr5;", "e", "()Ljava/util/List;", "Lcom/p7700g/p99005/oq5;", "b", "Ljava/net/ProxySelector;", "h", "()Ljava/net/ProxySelector;", "Ljava/net/Proxy;", "f", "()Ljava/net/Proxy;", "Ljavax/net/ssl/SSLSocketFactory;", "j", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "d", "()Ljavax/net/ssl/HostnameVerifier;", "Lcom/p7700g/p99005/jq5;", "a", "()Lcom/p7700g/p99005/jq5;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "that", ij3.b, "(Lcom/p7700g/p99005/dq5;)Z", "", "toString", "()Ljava/lang/String;", "Lcom/p7700g/p99005/zq5;", "w", "url", "Ljava/util/List;", "q", "protocols", "Lcom/p7700g/p99005/uq5;", "n", "dns", "Ljava/net/Proxy;", "r", "proxy", "Lcom/p7700g/p99005/jq5;", "l", "certificatePinner", "Ljavax/net/SocketFactory;", "u", "socketFactory", "Lcom/p7700g/p99005/eq5;", "s", "proxyAuthenticator", com.anythink.expressad.d.a.b.dH, "connectionSpecs", "Ljavax/net/ssl/HostnameVerifier;", "p", "hostnameVerifier", "Ljavax/net/ssl/SSLSocketFactory;", com.ironsource.sdk.controller.v.a, "sslSocketFactory", "Ljava/net/ProxySelector;", "t", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILcom/p7700g/p99005/uq5;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lcom/p7700g/p99005/jq5;Lcom/p7700g/p99005/eq5;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class dq5 {
    @NotNull
    private final zq5 a;
    @NotNull
    private final List<gr5> b;
    @NotNull
    private final List<oq5> c;
    @NotNull
    private final uq5 d;
    @NotNull
    private final SocketFactory e;
    @Nullable
    private final SSLSocketFactory f;
    @Nullable
    private final HostnameVerifier g;
    @Nullable
    private final jq5 h;
    @NotNull
    private final eq5 i;
    @Nullable
    private final Proxy j;
    @NotNull
    private final ProxySelector k;

    public dq5(@NotNull String str, int i, @NotNull uq5 uq5Var, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable jq5 jq5Var, @NotNull eq5 eq5Var, @Nullable Proxy proxy, @NotNull List<? extends gr5> list, @NotNull List<oq5> list2, @NotNull ProxySelector proxySelector) {
        c25.p(str, "uriHost");
        c25.p(uq5Var, "dns");
        c25.p(socketFactory, "socketFactory");
        c25.p(eq5Var, "proxyAuthenticator");
        c25.p(list, "protocols");
        c25.p(list2, "connectionSpecs");
        c25.p(proxySelector, "proxySelector");
        this.d = uq5Var;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = jq5Var;
        this.i = eq5Var;
        this.j = proxy;
        this.k = proxySelector;
        this.a = new zq5.a().M(sSLSocketFactory != null ? "https" : "http").x(str).D(i).h();
        this.b = sr5.c0(list);
        this.c = sr5.c0(list2);
    }

    @fz4(name = "-deprecated_certificatePinner")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "certificatePinner", imports = {}))
    @Nullable
    public final jq5 a() {
        return this.h;
    }

    @fz4(name = "-deprecated_connectionSpecs")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "connectionSpecs", imports = {}))
    @NotNull
    public final List<oq5> b() {
        return this.c;
    }

    @fz4(name = "-deprecated_dns")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "dns", imports = {}))
    @NotNull
    public final uq5 c() {
        return this.d;
    }

    @fz4(name = "-deprecated_hostnameVerifier")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "hostnameVerifier", imports = {}))
    @Nullable
    public final HostnameVerifier d() {
        return this.g;
    }

    @fz4(name = "-deprecated_protocols")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "protocols", imports = {}))
    @NotNull
    public final List<gr5> e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof dq5) {
            dq5 dq5Var = (dq5) obj;
            if (c25.g(this.a, dq5Var.a) && o(dq5Var)) {
                return true;
            }
        }
        return false;
    }

    @fz4(name = "-deprecated_proxy")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxy", imports = {}))
    @Nullable
    public final Proxy f() {
        return this.j;
    }

    @fz4(name = "-deprecated_proxyAuthenticator")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxyAuthenticator", imports = {}))
    @NotNull
    public final eq5 g() {
        return this.i;
    }

    @fz4(name = "-deprecated_proxySelector")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxySelector", imports = {}))
    @NotNull
    public final ProxySelector h() {
        return this.k;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.b.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = this.k.hashCode();
        int hashCode6 = Objects.hashCode(this.j);
        int hashCode7 = Objects.hashCode(this.f);
        int hashCode8 = Objects.hashCode(this.g);
        return Objects.hashCode(this.h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @fz4(name = "-deprecated_socketFactory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "socketFactory", imports = {}))
    @NotNull
    public final SocketFactory i() {
        return this.e;
    }

    @fz4(name = "-deprecated_sslSocketFactory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "sslSocketFactory", imports = {}))
    @Nullable
    public final SSLSocketFactory j() {
        return this.f;
    }

    @fz4(name = "-deprecated_url")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "url", imports = {}))
    @NotNull
    public final zq5 k() {
        return this.a;
    }

    @fz4(name = "certificatePinner")
    @Nullable
    public final jq5 l() {
        return this.h;
    }

    @fz4(name = "connectionSpecs")
    @NotNull
    public final List<oq5> m() {
        return this.c;
    }

    @fz4(name = "dns")
    @NotNull
    public final uq5 n() {
        return this.d;
    }

    public final boolean o(@NotNull dq5 dq5Var) {
        c25.p(dq5Var, "that");
        return c25.g(this.d, dq5Var.d) && c25.g(this.i, dq5Var.i) && c25.g(this.b, dq5Var.b) && c25.g(this.c, dq5Var.c) && c25.g(this.k, dq5Var.k) && c25.g(this.j, dq5Var.j) && c25.g(this.f, dq5Var.f) && c25.g(this.g, dq5Var.g) && c25.g(this.h, dq5Var.h) && this.a.N() == dq5Var.a.N();
    }

    @fz4(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier p() {
        return this.g;
    }

    @fz4(name = "protocols")
    @NotNull
    public final List<gr5> q() {
        return this.b;
    }

    @fz4(name = "proxy")
    @Nullable
    public final Proxy r() {
        return this.j;
    }

    @fz4(name = "proxyAuthenticator")
    @NotNull
    public final eq5 s() {
        return this.i;
    }

    @fz4(name = "proxySelector")
    @NotNull
    public final ProxySelector t() {
        return this.k;
    }

    @NotNull
    public String toString() {
        StringBuilder G;
        Object obj;
        StringBuilder G2 = wo1.G("Address{");
        G2.append(this.a.F());
        G2.append(':');
        G2.append(this.a.N());
        G2.append(", ");
        if (this.j != null) {
            G = wo1.G("proxy=");
            obj = this.j;
        } else {
            G = wo1.G("proxySelector=");
            obj = this.k;
        }
        G.append(obj);
        G2.append(G.toString());
        G2.append("}");
        return G2.toString();
    }

    @fz4(name = "socketFactory")
    @NotNull
    public final SocketFactory u() {
        return this.e;
    }

    @fz4(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory v() {
        return this.f;
    }

    @fz4(name = "url")
    @NotNull
    public final zq5 w() {
        return this.a;
    }
}