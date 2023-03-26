package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collect.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000223\b\u0004\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\f\u001ak\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000eH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000221\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022\u0006\u0010\u0019\u001a\u00020\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"collect", "", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectIndexed", "Lkotlin/Function3;", "", la1.l, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectLatest", "emitAll", "Lkotlinx/coroutines/flow/FlowCollector;", "flow", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIn", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ui5 {

    /* compiled from: Collect.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a implements qi5<T> {
        public final /* synthetic */ j05<T, uv4<? super yq4>, Object> s;

        /* compiled from: Collect.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: com.p7700g.p99005.ui5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0255a extends kw4 {
            public /* synthetic */ Object v;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0255a(uv4<? super C0255a> uv4Var) {
                super(uv4Var);
                a.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
            this.s = j05Var;
        }

        @Nullable
        public Object a(T t, @NotNull uv4<? super yq4> uv4Var) {
            z15.e(4);
            new C0255a(uv4Var);
            z15.e(5);
            this.s.w3(t, uv4Var);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            Object w3 = this.s.w3(t, uv4Var);
            return w3 == gw4.h() ? w3 : yq4.a;
        }
    }

    /* compiled from: Collect.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", la1.l, "", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b implements qi5<T> {
        private int s;
        public final /* synthetic */ k05<Integer, T, uv4<? super yq4>, Object> t;

        /* compiled from: Collect.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4<? super a> uv4Var) {
                super(uv4Var);
                b.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(k05<? super Integer, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var) {
            this.t = k05Var;
        }

        @Nullable
        public Object a(T t, @NotNull uv4<? super yq4> uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            k05<Integer, T, uv4<? super yq4>, Object> k05Var = this.t;
            int i = this.s;
            this.s = i + 1;
            if (i >= 0) {
                k05Var.I(Integer.valueOf(i), t, uv4Var);
                return yq4.a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            k05<Integer, T, uv4<? super yq4>, Object> k05Var = this.t;
            int i = this.s;
            this.s = i + 1;
            if (i >= 0) {
                Object I = k05Var.I(iw4.f(i), t, uv4Var);
                return I == gw4.h() ? I : yq4.a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }
    }

    /* compiled from: Collect.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int w;
        public final /* synthetic */ pi5<T> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(pi5<? extends T> pi5Var, uv4<? super c> uv4Var) {
            super(2, uv4Var);
            this.x = pi5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((c) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5<T> pi5Var = this.x;
                this.w = 1;
                if (ri5.x(pi5Var, this) == h) {
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
            return new c(this.x, uv4Var);
        }
    }

    @Nullable
    public static final Object a(@NotNull pi5<?> pi5Var, @NotNull uv4<? super yq4> uv4Var) {
        Object a2 = pi5Var.a(al5.s, uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    @xn4(level = zn4.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object c(pi5<? extends T> pi5Var, j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var, uv4<? super yq4> uv4Var) {
        a aVar = new a(j05Var);
        z15.e(0);
        pi5Var.a(aVar, uv4Var);
        z15.e(1);
        return yq4.a;
    }

    @Nullable
    public static final <T> Object d(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super Integer, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var, @NotNull uv4<? super yq4> uv4Var) {
        Object a2 = pi5Var.a(new b(k05Var), uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    private static final <T> Object e(pi5<? extends T> pi5Var, k05<? super Integer, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super yq4> uv4Var) {
        b bVar = new b(k05Var);
        z15.e(0);
        pi5Var.a(bVar, uv4Var);
        z15.e(1);
        return yq4.a;
    }

    @Nullable
    public static final <T> Object f(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull uv4<? super yq4> uv4Var) {
        pi5 d;
        d = wi5.d(ri5.W0(pi5Var, j05Var), 0, null, 2, null);
        Object x = ri5.x(d, uv4Var);
        return x == gw4.h() ? x : yq4.a;
    }

    @Nullable
    public static final <T> Object g(@NotNull qi5<? super T> qi5Var, @NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super yq4> uv4Var) {
        ri5.o0(qi5Var);
        Object a2 = pi5Var.a(qi5Var, uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    @NotNull
    public static final <T> ee5 h(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var) {
        ee5 f;
        f = bb5.f(lc5Var, null, null, new c(pi5Var, null), 3, null);
        return f;
    }
}