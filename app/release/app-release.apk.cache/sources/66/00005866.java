package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
@vo4(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003Bx\u0012B\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001f\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u001cRO\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\rX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "transform", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function3;", "create", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flowCollect", "collector", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class qk5<T, R> extends ok5<T, R> {
    @NotNull
    private final k05<qi5<? super R>, T, uv4<? super yq4>, Object> w;

    /* compiled from: Merge.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ qk5<T, R> y;
        public final /* synthetic */ qi5<R> z;

        /* compiled from: Merge.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.qk5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0235a<T> implements qi5, uw4 {
            public final /* synthetic */ b35.h<ee5> s;
            public final /* synthetic */ lc5 t;
            public final /* synthetic */ qk5<T, R> u;
            public final /* synthetic */ qi5<R> v;

            /* compiled from: Merge.kt */
            @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.qk5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0236a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
                public int w;
                public final /* synthetic */ qk5<T, R> x;
                public final /* synthetic */ qi5<R> y;
                public final /* synthetic */ T z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0236a(qk5<T, R> qk5Var, qi5<? super R> qi5Var, T t, uv4<? super C0236a> uv4Var) {
                    super(2, uv4Var);
                    this.x = qk5Var;
                    this.y = qi5Var;
                    this.z = t;
                }

                @Nullable
                public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
                    return ((C0236a) X(lc5Var, uv4Var)).D1(yq4.a);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    Object h = gw4.h();
                    int i = this.w;
                    if (i == 0) {
                        rp4.n(obj);
                        k05 k05Var = ((qk5) this.x).w;
                        qi5<R> qi5Var = this.y;
                        T t = this.z;
                        this.w = 1;
                        if (k05Var.I(qi5Var, t, this) == h) {
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
                    return new C0236a(this.x, this.y, this.z, uv4Var);
                }

                @Override // com.p7700g.p99005.j05
                public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
                    return C3(lc5Var, uv4Var);
                }
            }

            /* compiled from: Merge.kt */
            @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.qk5$a$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends kw4 {
                public int A;
                public Object v;
                public Object w;
                public Object x;
                public /* synthetic */ Object y;
                public final /* synthetic */ C0235a<T> z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0235a<? super T> c0235a, uv4<? super b> uv4Var) {
                    super(uv4Var);
                    this.z = c0235a;
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.y = obj;
                    this.A |= Integer.MIN_VALUE;
                    return this.z.b(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0235a(b35.h<ee5> hVar, lc5 lc5Var, qk5<T, R> qk5Var, qi5<? super R> qi5Var) {
                this.s = hVar;
                this.t = lc5Var;
                this.u = qk5Var;
                this.v = qi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                b bVar;
                int i;
                C0235a<T> c0235a;
                ee5 f;
                if (uv4Var instanceof b) {
                    bVar = (b) uv4Var;
                    int i2 = bVar.A;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.A = i2 - Integer.MIN_VALUE;
                        Object obj = bVar.y;
                        Object h = gw4.h();
                        i = bVar.A;
                        if (i != 0) {
                            rp4.n(obj);
                            ee5 ee5Var = this.s.s;
                            if (ee5Var != null) {
                                ee5Var.b(new sk5());
                                bVar.v = this;
                                bVar.w = t;
                                bVar.x = ee5Var;
                                bVar.A = 1;
                                if (ee5Var.x0(bVar) == h) {
                                    return h;
                                }
                            }
                            c0235a = this;
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ee5 ee5Var2 = (ee5) bVar.x;
                            t = (T) bVar.w;
                            c0235a = (C0235a) bVar.v;
                            rp4.n(obj);
                        }
                        b35.h<ee5> hVar = c0235a.s;
                        f = bb5.f(c0235a.t, null, nc5.UNDISPATCHED, new C0236a(c0235a.u, c0235a.v, t, null), 1, null);
                        hVar.s = (T) f;
                        return yq4.a;
                    }
                }
                bVar = new b(this, uv4Var);
                Object obj2 = bVar.y;
                Object h2 = gw4.h();
                i = bVar.A;
                if (i != 0) {
                }
                b35.h<ee5> hVar2 = c0235a.s;
                f = bb5.f(c0235a.t, null, nc5.UNDISPATCHED, new C0236a(c0235a.u, c0235a.v, t, null), 1, null);
                hVar2.s = (T) f;
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qk5<T, R> qk5Var, qi5<? super R> qi5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.y = qk5Var;
            this.z = qi5Var;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                b35.h hVar = new b35.h();
                qk5<T, R> qk5Var = this.y;
                pi5<S> pi5Var = qk5Var.v;
                C0235a c0235a = new C0235a(hVar, (lc5) this.x, qk5Var, this.z);
                this.w = 1;
                if (pi5Var.a(c0235a, this) == h) {
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
            a aVar = new a(this.y, this.z, uv4Var);
            aVar.x = obj;
            return aVar;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    public /* synthetic */ qk5(k05 k05Var, pi5 pi5Var, xv4 xv4Var, int i, ng5 ng5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(k05Var, pi5Var, (i2 & 4) != 0 ? zv4.s : xv4Var, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? ng5.SUSPEND : ng5Var);
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public lk5<R> h(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return new qk5(this.w, this.v, xv4Var, i, ng5Var);
    }

    @Override // com.p7700g.p99005.ok5
    @Nullable
    public Object r(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        Object g = mc5.g(new a(this, qi5Var, null), uv4Var);
        return g == gw4.h() ? g : yq4.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qk5(@NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var, @NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        super(pi5Var, xv4Var, i, ng5Var);
        this.w = k05Var;
    }
}