package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: ChannelFlow.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/FusibleFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "fuse", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public interface yk5<T> extends pi5<T> {

    /* compiled from: ChannelFlow.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ pi5 a(yk5 yk5Var, xv4 xv4Var, int i, ng5 ng5Var, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    xv4Var = zv4.s;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    ng5Var = ng5.SUSPEND;
                }
                return yk5Var.d(xv4Var, i, ng5Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    pi5<T> d(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var);
}