package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Context.kt */
@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", "T", "Lkotlinx/coroutines/flow/CancellableFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ki5<T> implements ji5<T> {
    @NotNull
    private final pi5<T> s;

    /* compiled from: Context.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements qi5, uw4 {
        public final /* synthetic */ qi5<T> s;

        /* compiled from: Context.kt */
        @mw4(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.ki5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0205a extends kw4 {
            public /* synthetic */ Object v;
            public final /* synthetic */ a<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0205a(a<? super T> aVar, uv4<? super C0205a> uv4Var) {
                super(uv4Var);
                this.w = aVar;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return this.w.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(qi5<? super T> qi5Var) {
            this.s = qi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            C0205a c0205a;
            int i;
            if (uv4Var instanceof C0205a) {
                c0205a = (C0205a) uv4Var;
                int i2 = c0205a.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0205a.x = i2 - Integer.MIN_VALUE;
                    Object obj = c0205a.v;
                    Object h = gw4.h();
                    i = c0205a.x;
                    if (i != 0) {
                        rp4.n(obj);
                        ie5.z(c0205a.getContext());
                        qi5<T> qi5Var = this.s;
                        c0205a.x = 1;
                        if (qi5Var.b(t, c0205a) == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                    }
                    return yq4.a;
                }
            }
            c0205a = new C0205a(this, uv4Var);
            Object obj2 = c0205a.v;
            Object h2 = gw4.h();
            i = c0205a.x;
            if (i != 0) {
            }
            return yq4.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ki5(@NotNull pi5<? extends T> pi5Var) {
        this.s = pi5Var;
    }

    @Override // com.p7700g.p99005.pi5
    @Nullable
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        Object a2 = this.s.a(new a(qi5Var), uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }
}