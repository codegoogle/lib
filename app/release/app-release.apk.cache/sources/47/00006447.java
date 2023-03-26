package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: HttpMethod.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/p7700g/p99005/ws5;", "", "", "method", "", "e", "(Ljava/lang/String;)Z", "b", "a", "d", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ws5 {
    public static final ws5 a = new ws5();

    private ws5() {
    }

    @jz4
    public static final boolean b(@NotNull String str) {
        c25.p(str, "method");
        return (c25.g(str, "GET") || c25.g(str, "HEAD")) ? false : true;
    }

    @jz4
    public static final boolean e(@NotNull String str) {
        c25.p(str, "method");
        return c25.g(str, "POST") || c25.g(str, cm4.y0) || c25.g(str, "PATCH") || c25.g(str, "PROPPATCH") || c25.g(str, "REPORT");
    }

    public final boolean a(@NotNull String str) {
        c25.p(str, "method");
        return c25.g(str, "POST") || c25.g(str, "PATCH") || c25.g(str, cm4.y0) || c25.g(str, "DELETE") || c25.g(str, "MOVE");
    }

    public final boolean c(@NotNull String str) {
        c25.p(str, "method");
        return !c25.g(str, "PROPFIND");
    }

    public final boolean d(@NotNull String str) {
        c25.p(str, "method");
        return c25.g(str, "PROPFIND");
    }
}