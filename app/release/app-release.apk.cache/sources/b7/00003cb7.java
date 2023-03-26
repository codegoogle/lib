package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractChannel.kt */
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\u001a#\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u0013*\u0004\u0018\u00010\u0014H\u0082\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u0013*\u0006\u0012\u0002\b\u00030\u0016H\u0082\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0016\u0010\f\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000*(\b\u0000\u0010\u0018\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "getEMPTY$annotations", "()V", "ENQUEUE_FAILED", "getENQUEUE_FAILED$annotations", "HANDLER_INVOKED", "getHANDLER_INVOKED$annotations", "OFFER_FAILED", "getOFFER_FAILED$annotations", "OFFER_SUCCESS", "getOFFER_SUCCESS$annotations", "POLL_FAILED", "getPOLL_FAILED$annotations", "RECEIVE_RESULT", "", "RECEIVE_THROWS_ON_CLOSE", "toResult", "Lkotlinx/coroutines/channels/ChannelResult;", "E", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Object;", "Handler", "Lkotlin/Function1;", "", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class cg5 {
    public static final int a = 0;
    public static final int b = 1;
    @cz4
    @NotNull
    public static final an5 c = new an5("EMPTY");
    @cz4
    @NotNull
    public static final an5 d = new an5("OFFER_SUCCESS");
    @cz4
    @NotNull
    public static final an5 e = new an5("OFFER_FAILED");
    @cz4
    @NotNull
    public static final an5 f = new an5("POLL_FAILED");
    @cz4
    @NotNull
    public static final an5 g = new an5("ENQUEUE_FAILED");
    @cz4
    @NotNull
    public static final an5 h = new an5("ON_CLOSE_HANDLER_INVOKED");

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    private static final <E> Object g(Object obj) {
        return obj instanceof xg5 ? sg5.a.a(((xg5) obj).v) : sg5.a.c(obj);
    }

    private static final <E> Object h(xg5<?> xg5Var) {
        return sg5.a.a(xg5Var.v);
    }
}