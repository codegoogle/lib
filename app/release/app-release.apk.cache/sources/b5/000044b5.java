package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import com.p7700g.p99005.vj5;
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
/* compiled from: Share.kt */
@vo4(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aS\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$ø\u0001\u0000¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "started", "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class gj5 {

    /* compiled from: Share.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public final /* synthetic */ T A;
        public int w;
        public final /* synthetic */ vj5 x;
        public final /* synthetic */ pi5<T> y;
        public final /* synthetic */ kj5<T> z;

        /* compiled from: Share.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.gj5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0181a extends vw4 implements j05<Integer, uv4<? super Boolean>, Object> {
            public int w;
            public /* synthetic */ int x;

            public C0181a(uv4<? super C0181a> uv4Var) {
                super(2, uv4Var);
            }

            @Nullable
            public final Object C3(int i, @Nullable uv4<? super Boolean> uv4Var) {
                return ((C0181a) X(Integer.valueOf(i), uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                gw4.h();
                if (this.w == 0) {
                    rp4.n(obj);
                    return iw4.a(this.x > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                C0181a c0181a = new C0181a(uv4Var);
                c0181a.x = ((Number) obj).intValue();
                return c0181a;
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(Integer num, uv4<? super Boolean> uv4Var) {
                return C3(num.intValue(), uv4Var);
            }
        }

        /* compiled from: Share.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements j05<tj5, uv4<? super yq4>, Object> {
            public final /* synthetic */ T A;
            public int w;
            public /* synthetic */ Object x;
            public final /* synthetic */ pi5<T> y;
            public final /* synthetic */ kj5<T> z;

            /* compiled from: Share.kt */
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.gj5$a$b$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0182a {
                public static final /* synthetic */ int[] a;

                static {
                    tj5.values();
                    int[] iArr = new int[3];
                    iArr[tj5.START.ordinal()] = 1;
                    iArr[tj5.STOP.ordinal()] = 2;
                    iArr[tj5.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(pi5<? extends T> pi5Var, kj5<T> kj5Var, T t, uv4<? super b> uv4Var) {
                super(2, uv4Var);
                this.y = pi5Var;
                this.z = kj5Var;
                this.A = t;
            }

            @Nullable
            public final Object C3(@NotNull tj5 tj5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((b) X(tj5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    int ordinal = ((tj5) this.x).ordinal();
                    if (ordinal == 0) {
                        pi5<T> pi5Var = this.y;
                        qi5 qi5Var = this.z;
                        this.w = 1;
                        if (pi5Var.a(qi5Var, this) == h) {
                            return h;
                        }
                    } else if (ordinal == 2) {
                        T t = this.A;
                        if (t == rj5.a) {
                            this.z.y();
                        } else {
                            this.z.A(t);
                        }
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
                b bVar = new b(this.y, this.z, this.A, uv4Var);
                bVar.x = obj;
                return bVar;
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(tj5 tj5Var, uv4<? super yq4> uv4Var) {
                return C3(tj5Var, uv4Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vj5 vj5Var, pi5<? extends T> pi5Var, kj5<T> kj5Var, T t, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.x = vj5Var;
            this.y = pi5Var;
            this.z = kj5Var;
            this.A = t;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0068 A[RETURN] */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            pi5<T> pi5Var;
            qi5 qi5Var;
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                vj5 vj5Var = this.x;
                vj5.a aVar = vj5.a;
                if (vj5Var == aVar.c()) {
                    pi5<T> pi5Var2 = this.y;
                    qi5 qi5Var2 = this.z;
                    this.w = 1;
                    if (pi5Var2.a(qi5Var2, this) == h) {
                        return h;
                    }
                } else if (this.x == aVar.d()) {
                    ak5<Integer> E = this.z.E();
                    C0181a c0181a = new C0181a(null);
                    this.w = 2;
                    if (ri5.u0(E, c0181a, this) == h) {
                        return h;
                    }
                    pi5Var = this.y;
                    qi5Var = this.z;
                    this.w = 3;
                    if (pi5Var.a(qi5Var, this) == h) {
                    }
                } else {
                    pi5 g0 = ri5.g0(this.x.a(this.z.E()));
                    b bVar = new b(this.y, this.z, this.A, null);
                    this.w = 4;
                    if (ri5.A(g0, bVar, this) == h) {
                        return h;
                    }
                }
                return yq4.a;
            }
            if (i != 1) {
                if (i == 2) {
                    rp4.n(obj);
                    pi5Var = this.y;
                    qi5Var = this.z;
                    this.w = 3;
                    if (pi5Var.a(qi5Var, this) == h) {
                        return h;
                    }
                    return yq4.a;
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            rp4.n(obj);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new a(this.x, this.y, this.z, this.A, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    /* compiled from: Share.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5<T> y;
        public final /* synthetic */ pb5<ak5<T>> z;

        /* compiled from: Share.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a<T> implements qi5, uw4 {
            public final /* synthetic */ b35.h<lj5<T>> s;
            public final /* synthetic */ lc5 t;
            public final /* synthetic */ pb5<ak5<T>> u;

            public a(b35.h<lj5<T>> hVar, lc5 lc5Var, pb5<ak5<T>> pb5Var) {
                this.s = hVar;
                this.t = lc5Var;
                this.u = pb5Var;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [com.p7700g.p99005.ak5, T, com.p7700g.p99005.lj5] */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                yq4 yq4Var;
                lj5<T> lj5Var = this.s.s;
                if (lj5Var == null) {
                    yq4Var = null;
                } else {
                    lj5Var.setValue(t);
                    yq4Var = yq4.a;
                }
                if (yq4Var == null) {
                    lc5 lc5Var = this.t;
                    b35.h<lj5<T>> hVar = this.s;
                    pb5<ak5<T>> pb5Var = this.u;
                    ?? r4 = (T) ck5.a(t);
                    pb5Var.e(new nj5(r4, ie5.B(lc5Var.y())));
                    hVar.s = r4;
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(pi5<? extends T> pi5Var, pb5<ak5<T>> pb5Var, uv4<? super b> uv4Var) {
            super(2, uv4Var);
            this.y = pi5Var;
            this.z = pb5Var;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((b) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            try {
                if (i == 0) {
                    rp4.n(obj);
                    lc5 lc5Var = (lc5) this.x;
                    b35.h hVar = new b35.h();
                    pi5<T> pi5Var = this.y;
                    a aVar = new a(hVar, lc5Var, this.z);
                    this.w = 1;
                    if (pi5Var.a(aVar, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            } catch (Throwable th) {
                this.z.d(th);
                throw th;
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            b bVar = new b(this.y, this.z, uv4Var);
            bVar.x = obj;
            return bVar;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    @NotNull
    public static final <T> pj5<T> a(@NotNull kj5<T> kj5Var) {
        return new mj5(kj5Var, null);
    }

    @NotNull
    public static final <T> ak5<T> b(@NotNull lj5<T> lj5Var) {
        return new nj5(lj5Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> uj5<T> c(pi5<? extends T> pi5Var, int i) {
        lk5 lk5Var;
        pi5<T> i2;
        int n = i55.n(i, og5.n0.a()) - i;
        if ((pi5Var instanceof lk5) && (i2 = (lk5Var = (lk5) pi5Var).i()) != null) {
            int i3 = lk5Var.t;
            if (i3 != -3 && i3 != -2 && i3 != 0) {
                n = i3;
            } else if (lk5Var.u != ng5.SUSPEND) {
                if (i == 0) {
                    n = 1;
                }
                n = 0;
            }
            return new uj5<>(i2, n, lk5Var.u, lk5Var.s);
        }
        return new uj5<>(pi5Var, n, ng5.SUSPEND, zv4.s);
    }

    private static final <T> ee5 d(lc5 lc5Var, xv4 xv4Var, pi5<? extends T> pi5Var, kj5<T> kj5Var, vj5 vj5Var, T t) {
        return za5.d(lc5Var, xv4Var, c25.g(vj5Var, vj5.a.c()) ? nc5.DEFAULT : nc5.UNDISPATCHED, new a(vj5Var, pi5Var, kj5Var, t, null));
    }

    private static final <T> void e(lc5 lc5Var, xv4 xv4Var, pi5<? extends T> pi5Var, pb5<ak5<T>> pb5Var) {
        bb5.f(lc5Var, xv4Var, null, new b(pi5Var, pb5Var, null), 2, null);
    }

    @NotNull
    public static final <T> pj5<T> f(@NotNull pj5<? extends T> pj5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new fk5(pj5Var, j05Var);
    }

    @NotNull
    public static final <T> pj5<T> g(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull vj5 vj5Var, int i) {
        uj5 c = c(pi5Var, i);
        kj5 a2 = rj5.a(i, c.b, c.c);
        return new mj5(a2, d(lc5Var, c.d, c.a, a2, vj5Var, rj5.a));
    }

    public static /* synthetic */ pj5 h(pi5 pi5Var, lc5 lc5Var, vj5 vj5Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return ri5.F1(pi5Var, lc5Var, vj5Var, i);
    }

    @Nullable
    public static final <T> Object i(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull uv4<? super ak5<? extends T>> uv4Var) {
        uj5 c = c(pi5Var, 1);
        pb5 c2 = rb5.c(null, 1, null);
        e(lc5Var, c.d, c.a, c2);
        return c2.d1(uv4Var);
    }

    @NotNull
    public static final <T> ak5<T> j(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull vj5 vj5Var, T t) {
        uj5 c = c(pi5Var, 1);
        lj5 a2 = ck5.a(t);
        return new nj5(a2, d(lc5Var, c.d, c.a, a2, vj5Var, t));
    }
}