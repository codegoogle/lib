package com.p7700g.p99005;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class tg5 {
    @NotNull
    public static final String a = "Channel was closed";

    @np4
    @NotNull
    public static final <E, R> jh5<R> J(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var) {
        return wg5.E(jh5Var, xv4Var, j05Var);
    }

    @np4
    @NotNull
    public static final <E, R> jh5<R> L(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull k05<? super Integer, ? super E, ? super uv4<? super R>, ? extends Object> k05Var) {
        return wg5.G(jh5Var, xv4Var, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> lo5<E> U(@NotNull jh5<? extends E> jh5Var) {
        return vg5.h(jh5Var);
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object V(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super E> uv4Var) {
        return vg5.i(jh5Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @op4(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@NotNull nh5<? super E> nh5Var, E e) {
        ug5.a(nh5Var, e);
    }

    @np4
    public static final void b(@NotNull jh5<?> jh5Var, @Nullable Throwable th) {
        vg5.a(jh5Var, th);
    }

    @ve5
    public static final <E, R> R c(@NotNull jg5<E> jg5Var, @NotNull f05<? super jh5<? extends E>, ? extends R> f05Var) {
        return (R) vg5.b(jg5Var, f05Var);
    }

    public static final <E, R> R d(@NotNull jh5<? extends E> jh5Var, @NotNull f05<? super jh5<? extends E>, ? extends R> f05Var) {
        return (R) vg5.c(jh5Var, f05Var);
    }

    @ve5
    @Nullable
    public static final <E> Object e(@NotNull jg5<E> jg5Var, @NotNull f05<? super E, yq4> f05Var, @NotNull uv4<? super yq4> uv4Var) {
        return vg5.d(jg5Var, f05Var, uv4Var);
    }

    @np4
    @Nullable
    public static final <E, C extends nh5<? super E>> Object e0(@NotNull jh5<? extends E> jh5Var, @NotNull C c, @NotNull uv4<? super C> uv4Var) {
        return wg5.W(jh5Var, c, uv4Var);
    }

    @Nullable
    public static final <E> Object f(@NotNull jh5<? extends E> jh5Var, @NotNull f05<? super E, yq4> f05Var, @NotNull uv4<? super yq4> uv4Var) {
        return vg5.e(jh5Var, f05Var, uv4Var);
    }

    @np4
    @Nullable
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull jh5<? extends E> jh5Var, @NotNull C c, @NotNull uv4<? super C> uv4Var) {
        return wg5.X(jh5Var, c, uv4Var);
    }

    @np4
    @NotNull
    public static final f05<Throwable, yq4> g(@NotNull jh5<?> jh5Var) {
        return wg5.b(jh5Var);
    }

    @Nullable
    public static final <E> Object g0(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super List<? extends E>> uv4Var) {
        return vg5.j(jh5Var, uv4Var);
    }

    @np4
    @NotNull
    public static final f05<Throwable, yq4> h(@NotNull jh5<?>... jh5VarArr) {
        return wg5.c(jh5VarArr);
    }

    @np4
    @Nullable
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@NotNull jh5<? extends hp4<? extends K, ? extends V>> jh5Var, @NotNull M m, @NotNull uv4<? super M> uv4Var) {
        return wg5.Y(jh5Var, m, uv4Var);
    }

    @np4
    @NotNull
    public static final <E, K> jh5<E> k(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super K>, ? extends Object> j05Var) {
        return wg5.f(jh5Var, xv4Var, j05Var);
    }

    @np4
    @Nullable
    public static final <E> Object k0(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super Set<E>> uv4Var) {
        return wg5.b0(jh5Var, uv4Var);
    }

    @NotNull
    public static final <E> Object m0(@NotNull nh5<? super E> nh5Var, E e) {
        return ug5.b(nh5Var, e);
    }

    @np4
    @NotNull
    public static final <E, R, V> jh5<V> q0(@NotNull jh5<? extends E> jh5Var, @NotNull jh5<? extends R> jh5Var2, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super R, ? extends V> j05Var) {
        return wg5.g0(jh5Var, jh5Var2, xv4Var, j05Var);
    }

    @np4
    @NotNull
    public static final <E> jh5<E> s(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return wg5.n(jh5Var, xv4Var, j05Var);
    }

    @np4
    @NotNull
    public static final <E> jh5<E> y(@NotNull jh5<? extends E> jh5Var) {
        return wg5.t(jh5Var);
    }
}