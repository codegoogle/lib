package com.p7700g.p99005;

import com.p7700g.p99005.yq5;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: internal.kt */
@fz4(name = "Internal")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "currentTimeMillis", "Lcom/p7700g/p99005/zq5;", "url", "", "setCookie", "Lcom/p7700g/p99005/pq5;", "f", "(JLcom/p7700g/p99005/zq5;Ljava/lang/String;)Lcom/p7700g/p99005/pq5;", "cookie", "", "forObsoleteRfc2965", "e", "(Lcom/p7700g/p99005/pq5;Z)Ljava/lang/String;", "Lcom/p7700g/p99005/yq5$a;", "builder", "line", "a", "(Lcom/p7700g/p99005/yq5$a;Ljava/lang/String;)Lcom/p7700g/p99005/yq5$a;", "name", "value", "b", "(Lcom/p7700g/p99005/yq5$a;Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/yq5$a;", "Lcom/p7700g/p99005/fq5;", com.anythink.expressad.foundation.g.a.a.a, "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/jr5;", "d", "(Lcom/p7700g/p99005/fq5;Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/oq5;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/oq5;Ljavax/net/ssl/SSLSocket;Z)V", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class qr5 {
    @NotNull
    public static final yq5.a a(@NotNull yq5.a aVar, @NotNull String str) {
        c25.p(aVar, "builder");
        c25.p(str, "line");
        return aVar.f(str);
    }

    @NotNull
    public static final yq5.a b(@NotNull yq5.a aVar, @NotNull String str, @NotNull String str2) {
        c25.p(aVar, "builder");
        c25.p(str, "name");
        c25.p(str2, "value");
        return aVar.g(str, str2);
    }

    public static final void c(@NotNull oq5 oq5Var, @NotNull SSLSocket sSLSocket, boolean z) {
        c25.p(oq5Var, "connectionSpec");
        c25.p(sSLSocket, "sslSocket");
        oq5Var.f(sSLSocket, z);
    }

    @Nullable
    public static final jr5 d(@NotNull fq5 fq5Var, @NotNull hr5 hr5Var) {
        c25.p(fq5Var, com.anythink.expressad.foundation.g.a.a.a);
        c25.p(hr5Var, "request");
        return fq5Var.h(hr5Var);
    }

    @NotNull
    public static final String e(@NotNull pq5 pq5Var, boolean z) {
        c25.p(pq5Var, "cookie");
        return pq5Var.y(z);
    }

    @Nullable
    public static final pq5 f(long j, @NotNull zq5 zq5Var, @NotNull String str) {
        c25.p(zq5Var, "url");
        c25.p(str, "setCookie");
        return pq5.e.f(j, zq5Var, str);
    }
}