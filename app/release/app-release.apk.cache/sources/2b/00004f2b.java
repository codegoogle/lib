package com.p7700g.p99005;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Route.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u001c\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u0019\u0010\u001f\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/lr5;", "", "Lcom/p7700g/p99005/dq5;", "a", "()Lcom/p7700g/p99005/dq5;", "Ljava/net/Proxy;", "b", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "c", "()Ljava/net/InetSocketAddress;", "", "f", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/net/InetSocketAddress;", com.anythink.basead.d.g.i, "socketAddress", "Ljava/net/Proxy;", "e", "proxy", "Lcom/p7700g/p99005/dq5;", "d", "address", "<init>", "(Lcom/p7700g/p99005/dq5;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class lr5 {
    @NotNull
    private final dq5 a;
    @NotNull
    private final Proxy b;
    @NotNull
    private final InetSocketAddress c;

    public lr5(@NotNull dq5 dq5Var, @NotNull Proxy proxy, @NotNull InetSocketAddress inetSocketAddress) {
        c25.p(dq5Var, "address");
        c25.p(proxy, "proxy");
        c25.p(inetSocketAddress, "socketAddress");
        this.a = dq5Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    @fz4(name = "-deprecated_address")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "address", imports = {}))
    @NotNull
    public final dq5 a() {
        return this.a;
    }

    @fz4(name = "-deprecated_proxy")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "proxy", imports = {}))
    @NotNull
    public final Proxy b() {
        return this.b;
    }

    @fz4(name = "-deprecated_socketAddress")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "socketAddress", imports = {}))
    @NotNull
    public final InetSocketAddress c() {
        return this.c;
    }

    @fz4(name = "address")
    @NotNull
    public final dq5 d() {
        return this.a;
    }

    @fz4(name = "proxy")
    @NotNull
    public final Proxy e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof lr5) {
            lr5 lr5Var = (lr5) obj;
            if (c25.g(lr5Var.a, this.a) && c25.g(lr5Var.b, this.b) && c25.g(lr5Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.a.v() != null && this.b.type() == Proxy.Type.HTTP;
    }

    @fz4(name = "socketAddress")
    @NotNull
    public final InetSocketAddress g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Route{");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}