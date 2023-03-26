package com.p7700g.p99005;

import com.p7700g.p99005.vv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@vo4(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ok5<S, T> extends lk5<T> {
    @cz4
    @NotNull
    public final pi5<S> v;

    /* compiled from: ChannelFlow.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u008a@"}, d2 = {"<anonymous>", "", "S", "T", "it", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<qi5<? super T>, uv4<? super yq4>, Object> {
        public int w;
        public /* synthetic */ Object x;
        public final /* synthetic */ ok5<S, T> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ok5<S, T> ok5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.y = ok5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super T> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                ok5<S, T> ok5Var = this.y;
                this.w = 1;
                if (ok5Var.r((qi5) this.x, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.y, uv4Var);
            aVar.x = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ok5(@NotNull pi5<? extends S> pi5Var, @NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        super(xv4Var, i, ng5Var);
        this.v = pi5Var;
    }

    public static /* synthetic */ Object n(ok5 ok5Var, qi5 qi5Var, uv4 uv4Var) {
        if (ok5Var.t == -3) {
            xv4 context = uv4Var.getContext();
            xv4 plus = context.plus(ok5Var.s);
            if (c25.g(plus, context)) {
                Object r = ok5Var.r(qi5Var, uv4Var);
                return r == gw4.h() ? r : yq4.a;
            }
            vv4.b bVar = vv4.k0;
            if (c25.g(plus.get(bVar), context.get(bVar))) {
                Object q = ok5Var.q(qi5Var, plus, uv4Var);
                return q == gw4.h() ? q : yq4.a;
            }
        }
        Object a2 = super.a(qi5Var, uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    public static /* synthetic */ Object o(ok5 ok5Var, hh5 hh5Var, uv4 uv4Var) {
        Object r = ok5Var.r(new fl5(hh5Var), uv4Var);
        return r == gw4.h() ? r : yq4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(qi5<? super T> qi5Var, xv4 xv4Var, uv4<? super yq4> uv4Var) {
        Object d = mk5.d(xv4Var, mk5.a(qi5Var, uv4Var.getContext()), null, new a(this, null), uv4Var, 4, null);
        return d == gw4.h() ? d : yq4.a;
    }

    @Override // com.p7700g.p99005.lk5, com.p7700g.p99005.pi5
    @Nullable
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        return n(this, qi5Var, uv4Var);
    }

    @Override // com.p7700g.p99005.lk5
    @Nullable
    public Object g(@NotNull hh5<? super T> hh5Var, @NotNull uv4<? super yq4> uv4Var) {
        return o(this, hh5Var, uv4Var);
    }

    @Nullable
    public abstract Object r(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var);

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public String toString() {
        return this.v + " -> " + super.toString();
    }
}