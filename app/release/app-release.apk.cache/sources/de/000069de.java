package com.p7700g.p99005;

import java.net.Proxy;
import org.jetbrains.annotations.NotNull;

/* compiled from: RequestLine.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/zs5;", "", "Lcom/p7700g/p99005/hr5;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(Lcom/p7700g/p99005/hr5;Ljava/net/Proxy$Type;)Z", "", "a", "(Lcom/p7700g/p99005/hr5;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lcom/p7700g/p99005/zq5;", "url", "c", "(Lcom/p7700g/p99005/zq5;)Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class zs5 {
    public static final zs5 a = new zs5();

    private zs5() {
    }

    private final boolean b(hr5 hr5Var, Proxy.Type type) {
        return !hr5Var.l() && type == Proxy.Type.HTTP;
    }

    @NotNull
    public final String a(@NotNull hr5 hr5Var, @NotNull Proxy.Type type) {
        c25.p(hr5Var, "request");
        c25.p(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(hr5Var.m());
        sb.append(gl4.R);
        zs5 zs5Var = a;
        if (zs5Var.b(hr5Var, type)) {
            sb.append(hr5Var.q());
        } else {
            sb.append(zs5Var.c(hr5Var.q()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String c(@NotNull zq5 zq5Var) {
        c25.p(zq5Var, "url");
        String x = zq5Var.x();
        String z = zq5Var.z();
        if (z != null) {
            return x + '?' + z;
        }
        return x;
    }
}