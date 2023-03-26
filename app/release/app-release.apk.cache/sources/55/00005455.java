package com.p7700g.p99005;

import com.p7700g.p99005.jh5;
import com.p7700g.p99005.nh5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Factory", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface og5<E> extends nh5<E>, jh5<E> {
    @NotNull
    public static final b n0 = b.a;
    public static final int o0 = Integer.MAX_VALUE;
    public static final int p0 = 0;
    public static final int q0 = -1;
    public static final int r0 = -2;
    public static final int s0 = -3;
    @NotNull
    public static final String t0 = "kotlinx.coroutines.channels.defaultBuffer";

    /* compiled from: Channel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static <E> lo5<E> b(@NotNull og5<E> og5Var) {
            return jh5.a.d(og5Var);
        }

        @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull og5<E> og5Var, E e) {
            return nh5.a.c(og5Var, e);
        }

        @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @op4(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull og5<E> og5Var) {
            return (E) jh5.a.h(og5Var);
        }

        @fx4
        @xn4(level = zn4.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object e(@NotNull og5<E> og5Var, @NotNull uv4<? super E> uv4Var) {
            return jh5.a.i(og5Var, uv4Var);
        }
    }

    /* compiled from: Channel.kt */
    @vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/Channel$Factory;", "", "()V", "BUFFERED", "", "CHANNEL_DEFAULT_CAPACITY", "getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core", "()I", "CONFLATED", "DEFAULT_BUFFER_PROPERTY_NAME", "", "OPTIONAL_CHANNEL", "RENDEZVOUS", it0.b, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public static final int b = Integer.MAX_VALUE;
        public static final int c = 0;
        public static final int d = -1;
        public static final int e = -2;
        public static final int f = -3;
        @NotNull
        public static final String g = "kotlinx.coroutines.channels.defaultBuffer";
        public static final /* synthetic */ b a = new b();
        private static final int h = cn5.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int a() {
            return h;
        }
    }
}