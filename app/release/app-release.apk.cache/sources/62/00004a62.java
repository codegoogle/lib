package com.p7700g.p99005;

import com.p7700g.p99005.nh5;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BroadcastChannel.kt */
@ve5
@vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J\u001a\u0010\u0003\u001a\u00020\u00072\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", com.anythink.expressad.d.a.b.dO, "", "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface jg5<E> extends nh5<E> {

    /* compiled from: BroadcastChannel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(jg5 jg5Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            jg5Var.b(cancellationException);
        }

        public static /* synthetic */ boolean b(jg5 jg5Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return jg5Var.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull jg5<E> jg5Var, E e) {
            return nh5.a.c(jg5Var, e);
        }
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean a(Throwable th);

    void b(@Nullable CancellationException cancellationException);

    @NotNull
    jh5<E> z();
}