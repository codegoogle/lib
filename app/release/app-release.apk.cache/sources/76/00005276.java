package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J-\u0010\u000f\u001a\u00020\u00102#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012H'J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u0016\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007R$\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/SendChannel;", "E", "", "isClosedForSend", "", "isClosedForSend$annotations", "()V", "()Z", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", com.anythink.expressad.foundation.d.c.cd, "cause", "", "invokeOnClose", "", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offer", "element", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface nh5<E> {

    /* compiled from: Channel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(nh5 nh5Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return nh5Var.x(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @td5
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull nh5<? super E> nh5Var, E e) {
            Object F = nh5Var.F(e);
            if (sg5.m(F)) {
                return true;
            }
            Throwable f = sg5.f(F);
            if (f == null) {
                return false;
            }
            throw zm5.p(f);
        }
    }

    @td5
    void B(@NotNull f05<? super Throwable, yq4> f05Var);

    @NotNull
    Object F(E e);

    @Nullable
    Object I(E e, @NotNull uv4<? super yq4> uv4Var);

    boolean K();

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
    boolean g(E e);

    @NotNull
    mo5<E, nh5<E>> v();

    boolean x(@Nullable Throwable th);
}