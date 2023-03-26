package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.b35;
import com.p7700g.p99005.sg5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.WKSRecord;

/* compiled from: Delay.kt */
@vo4(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a3\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "initialDelayMillis", "sample", "periodMillis", aa.c.Q, "sample-HG0u8IE", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class yi5 {

    /* compiled from: Delay.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<T, Long> {
        public final /* synthetic */ long t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.t = j;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Long M(T t) {
            return Long.valueOf(this.t);
        }
    }

    /* compiled from: Delay.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "emittedItem", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<T, Long> {
        public final /* synthetic */ f05<T, o95> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f05<? super T, o95> f05Var) {
            super(1);
            this.t = f05Var;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Long M(T t) {
            return Long.valueOf(wc5.e(this.t.M(t).c2()));
        }
    }

    /* compiled from: Delay.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends vw4 implements k05<lc5, qi5<? super T>, uv4<? super yq4>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ f05<T, Long> B;
        public final /* synthetic */ pi5<T> C;
        public Object w;
        public Object x;
        public int y;
        private /* synthetic */ Object z;

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements f05<uv4<? super yq4>, Object> {
            public int w;
            public final /* synthetic */ qi5<T> x;
            public final /* synthetic */ b35.h<Object> y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qi5<? super T> qi5Var, b35.h<Object> hVar, uv4<? super a> uv4Var) {
                super(1, uv4Var);
                this.x = qi5Var;
                this.y = hVar;
            }

            @Override // com.p7700g.p99005.f05
            @Nullable
            /* renamed from: C3 */
            public final Object M(@Nullable uv4<? super yq4> uv4Var) {
                return ((a) X0(uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    qi5<T> qi5Var = this.x;
                    an5 an5Var = bl5.a;
                    Object obj2 = this.y.s;
                    if (obj2 == an5Var) {
                        obj2 = null;
                    }
                    this.w = 1;
                    if (qi5Var.b(obj2, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                this.y.s = null;
                return yq4.a;
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X0(@NotNull uv4<?> uv4Var) {
                return new a(this.x, this.y, uv4Var);
            }
        }

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {WKSRecord.Service.SUR_MEAS}, m = "invokeSuspend", n = {"$this$onFailure$iv"}, s = {"L$0"})
        @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements j05<sg5<? extends Object>, uv4<? super yq4>, Object> {
            public final /* synthetic */ qi5<T> A;
            public Object w;
            public int x;
            public /* synthetic */ Object y;
            public final /* synthetic */ b35.h<Object> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(b35.h<Object> hVar, qi5<? super T> qi5Var, uv4<? super b> uv4Var) {
                super(2, uv4Var);
                this.z = hVar;
                this.A = qi5Var;
            }

            @Nullable
            public final Object C3(@NotNull Object obj, @Nullable uv4<? super yq4> uv4Var) {
                return ((b) X(sg5.b(obj), uv4Var)).D1(yq4.a);
            }

            /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v6, types: [T, com.p7700g.p99005.an5] */
            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                b35.h<Object> hVar;
                b35.h<Object> hVar2;
                Object h = gw4.h();
                int i = this.x;
                if (i == 0) {
                    rp4.n(obj);
                    ?? o = ((sg5) this.y).o();
                    hVar = this.z;
                    boolean z = o instanceof sg5.c;
                    if (!z) {
                        hVar.s = o;
                    }
                    qi5<T> qi5Var = this.A;
                    if (z) {
                        Throwable f = sg5.f(o);
                        if (f == null) {
                            Object obj2 = hVar.s;
                            if (obj2 != null) {
                                if (obj2 == bl5.a) {
                                    obj2 = null;
                                }
                                this.y = o;
                                this.w = hVar;
                                this.x = 1;
                                if (qi5Var.b(obj2, this) == h) {
                                    return h;
                                }
                                hVar2 = hVar;
                            }
                            hVar.s = bl5.c;
                        } else {
                            throw f;
                        }
                    }
                    return yq4.a;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar2 = (b35.h) this.w;
                    rp4.n(obj);
                }
                hVar = hVar2;
                hVar.s = bl5.c;
                return yq4.a;
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                b bVar = new b(this.z, this.A, uv4Var);
                bVar.y = obj;
                return bVar;
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(sg5<? extends Object> sg5Var, uv4<? super yq4> uv4Var) {
                return C3(sg5Var.o(), uv4Var);
            }
        }

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.yi5$c$c */
        /* loaded from: classes3.dex */
        public static final class C0272c extends vw4 implements j05<hh5<? super Object>, uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public final /* synthetic */ pi5<T> y;

            /* compiled from: Delay.kt */
            @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.yi5$c$c$a */
            /* loaded from: classes3.dex */
            public static final class a<T> implements qi5, uw4 {
                public final /* synthetic */ hh5<Object> s;

                /* compiled from: Delay.kt */
                @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.yi5$c$c$a$a */
                /* loaded from: classes3.dex */
                public static final class C0273a extends kw4 {
                    public /* synthetic */ Object v;
                    public final /* synthetic */ a<T> w;
                    public int x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0273a(a<? super T> aVar, uv4<? super C0273a> uv4Var) {
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

                public a(hh5<Object> hh5Var) {
                    this.s = hh5Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // com.p7700g.p99005.qi5
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                    C0273a c0273a;
                    int i;
                    if (uv4Var instanceof C0273a) {
                        c0273a = (C0273a) uv4Var;
                        int i2 = c0273a.x;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0273a.x = i2 - Integer.MIN_VALUE;
                            Object obj = c0273a.v;
                            Object h = gw4.h();
                            i = c0273a.x;
                            if (i != 0) {
                                rp4.n(obj);
                                hh5<Object> hh5Var = this.s;
                                if (t == null) {
                                    t = (T) bl5.a;
                                }
                                c0273a.x = 1;
                                if (hh5Var.I(t, c0273a) == h) {
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
                    c0273a = new C0273a(this, uv4Var);
                    Object obj2 = c0273a.v;
                    Object h2 = gw4.h();
                    i = c0273a.x;
                    if (i != 0) {
                    }
                    return yq4.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0272c(pi5<? extends T> pi5Var, uv4<? super C0272c> uv4Var) {
                super(2, uv4Var);
                this.y = pi5Var;
            }

            @Override // com.p7700g.p99005.j05
            @Nullable
            /* renamed from: C3 */
            public final Object w3(@NotNull hh5<Object> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((C0272c) X(hh5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    pi5<T> pi5Var = this.y;
                    a aVar = new a((hh5) this.x);
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
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                C0272c c0272c = new C0272c(this.y, uv4Var);
                c0272c.x = obj;
                return c0272c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(f05<? super T, Long> f05Var, pi5<? extends T> pi5Var, uv4<? super c> uv4Var) {
            super(3, uv4Var);
            this.B = f05Var;
            this.C = pi5Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull lc5 lc5Var, @NotNull qi5<? super T> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            c cVar = new c(this.B, this.C, uv4Var);
            cVar.z = lc5Var;
            cVar.A = qi5Var;
            return cVar.D1(yq4.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:50|26|30|31|32|33|(1:35)|36|37|(1:39)|(1:41)(1:42)) */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f8, code lost:
            r10.M0(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:89:0x00dc, B:91:0x00e0, B:92:0x00ea), top: B:104:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x010b -> B:64:0x006f). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qi5 qi5Var;
            c cVar;
            jh5 jh5Var;
            b35.h hVar;
            b35.g gVar;
            Object obj2;
            Object L0;
            Object h = gw4.h();
            int i = this.y;
            if (i == 0) {
                rp4.n(obj);
                jh5 f = fh5.f((lc5) this.z, null, 0, new C0272c(this.C, null), 3, null);
                qi5Var = (qi5) this.A;
                cVar = this;
                jh5Var = f;
                hVar = new b35.h();
            } else if (i == 1) {
                hVar = (b35.h) this.w;
                jh5Var = (jh5) this.A;
                qi5Var = (qi5) this.z;
                rp4.n(obj);
                gVar = (b35.g) this.x;
                cVar = this;
                hVar.s = null;
                c cVar2 = cVar;
                obj2 = h;
                b35.g gVar2 = gVar;
                qi5 qi5Var2 = qi5Var;
                jh5 jh5Var2 = jh5Var;
                cVar2.z = qi5Var2;
                cVar2.A = jh5Var2;
                cVar2.w = hVar;
                cVar2.x = gVar2;
                cVar2.y = 2;
                jo5 jo5Var = new jo5(cVar2);
                if (hVar.s != 0) {
                    jo5Var.z(gVar2.s, new a(qi5Var2, hVar, null));
                }
                jo5Var.W(jh5Var2.l(), new b(hVar, qi5Var2, null));
                L0 = jo5Var.L0();
                if (L0 == gw4.h()) {
                    ow4.c(cVar2);
                }
                if (L0 != obj2) {
                    return obj2;
                }
                h = obj2;
                cVar = cVar2;
                jh5Var = jh5Var2;
                qi5Var = qi5Var2;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b35.g gVar3 = (b35.g) this.x;
                rp4.n(obj);
                qi5Var = (qi5) this.z;
                jh5Var = (jh5) this.A;
                hVar = (b35.h) this.w;
                cVar = this;
            }
            if (hVar.s != bl5.c) {
                gVar = new b35.g();
                Object obj3 = hVar.s;
                if (obj3 != null) {
                    f05<T, Long> f05Var = cVar.B;
                    an5 an5Var = bl5.a;
                    if (obj3 == an5Var) {
                        obj3 = null;
                    }
                    long longValue = f05Var.M(obj3).longValue();
                    gVar.s = longValue;
                    if (!(longValue >= 0)) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                    }
                    if (longValue == 0) {
                        Object obj4 = hVar.s;
                        if (obj4 == an5Var) {
                            obj4 = null;
                        }
                        cVar.z = qi5Var;
                        cVar.A = jh5Var;
                        cVar.w = hVar;
                        cVar.x = gVar;
                        cVar.y = 1;
                        if (qi5Var.b(obj4, cVar) == h) {
                            return h;
                        }
                        hVar.s = null;
                    }
                }
                c cVar22 = cVar;
                obj2 = h;
                b35.g gVar22 = gVar;
                qi5 qi5Var22 = qi5Var;
                jh5 jh5Var22 = jh5Var;
                cVar22.z = qi5Var22;
                cVar22.A = jh5Var22;
                cVar22.w = hVar;
                cVar22.x = gVar22;
                cVar22.y = 2;
                jo5 jo5Var2 = new jo5(cVar22);
                if (hVar.s != 0) {
                }
                jo5Var2.W(jh5Var22.l(), new b(hVar, qi5Var22, null));
                L0 = jo5Var2.L0();
                if (L0 == gw4.h()) {
                }
                if (L0 != obj2) {
                }
            } else {
                return yq4.a;
            }
        }
    }

    /* compiled from: Delay.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, aa.a.q, aa.a.r}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends vw4 implements j05<hh5<? super yq4>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ long y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, long j2, uv4<? super d> uv4Var) {
            super(2, uv4Var);
            this.y = j;
            this.z = j2;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super yq4> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((d) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005b -> B:36:0x0040). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object D1(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = com.p7700g.p99005.gw4.h()
                int r1 = r7.w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.x
                com.p7700g.p99005.hh5 r1 = (com.p7700g.p99005.hh5) r1
                com.p7700g.p99005.rp4.n(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.x
                com.p7700g.p99005.hh5 r1 = (com.p7700g.p99005.hh5) r1
                com.p7700g.p99005.rp4.n(r8)
                r8 = r7
                goto L51
            L2a:
                com.p7700g.p99005.rp4.n(r8)
                java.lang.Object r8 = r7.x
                r1 = r8
                com.p7700g.p99005.hh5 r1 = (com.p7700g.p99005.hh5) r1
                long r5 = r7.y
                r7.x = r1
                r7.w = r4
                java.lang.Object r8 = com.p7700g.p99005.wc5.b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                com.p7700g.p99005.nh5 r4 = r1.c()
                com.p7700g.p99005.yq4 r5 = com.p7700g.p99005.yq4.a
                r8.x = r1
                r8.w = r3
                java.lang.Object r4 = r4.I(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.z
                r8.x = r1
                r8.w = r2
                java.lang.Object r4 = com.p7700g.p99005.wc5.b(r4, r8)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p7700g.p99005.yi5.d.D1(java.lang.Object):java.lang.Object");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            d dVar = new d(this.y, this.z, uv4Var);
            dVar.x = obj;
            return dVar;
        }
    }

    /* compiled from: Delay.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends vw4 implements k05<lc5, qi5<? super T>, uv4<? super yq4>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ long B;
        public final /* synthetic */ pi5<T> C;
        public Object w;
        public Object x;
        public int y;
        private /* synthetic */ Object z;

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements j05<sg5<? extends Object>, uv4<? super yq4>, Object> {
            public int w;
            public /* synthetic */ Object x;
            public final /* synthetic */ b35.h<Object> y;
            public final /* synthetic */ jh5<yq4> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b35.h<Object> hVar, jh5<yq4> jh5Var, uv4<? super a> uv4Var) {
                super(2, uv4Var);
                this.y = hVar;
                this.z = jh5Var;
            }

            @Nullable
            public final Object C3(@NotNull Object obj, @Nullable uv4<? super yq4> uv4Var) {
                return ((a) X(sg5.b(obj), uv4Var)).D1(yq4.a);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [T, com.p7700g.p99005.an5] */
            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                gw4.h();
                if (this.w == 0) {
                    rp4.n(obj);
                    ?? o = ((sg5) this.x).o();
                    b35.h<Object> hVar = this.y;
                    boolean z = o instanceof sg5.c;
                    if (!z) {
                        hVar.s = o;
                    }
                    jh5<yq4> jh5Var = this.z;
                    if (z) {
                        Throwable f = sg5.f(o);
                        if (f == null) {
                            jh5Var.b(new sk5());
                            hVar.s = bl5.c;
                        } else {
                            throw f;
                        }
                    }
                    return yq4.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                a aVar = new a(this.y, this.z, uv4Var);
                aVar.x = obj;
                return aVar;
            }

            @Override // com.p7700g.p99005.j05
            public /* bridge */ /* synthetic */ Object w3(sg5<? extends Object> sg5Var, uv4<? super yq4> uv4Var) {
                return C3(sg5Var.o(), uv4Var);
            }
        }

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements j05<yq4, uv4<? super yq4>, Object> {
            public int w;
            public final /* synthetic */ b35.h<Object> x;
            public final /* synthetic */ qi5<T> y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(b35.h<Object> hVar, qi5<? super T> qi5Var, uv4<? super b> uv4Var) {
                super(2, uv4Var);
                this.x = hVar;
                this.y = qi5Var;
            }

            @Override // com.p7700g.p99005.j05
            @Nullable
            /* renamed from: C3 */
            public final Object w3(@NotNull yq4 yq4Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((b) X(yq4Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    b35.h<Object> hVar = this.x;
                    Object obj2 = hVar.s;
                    if (obj2 == null) {
                        return yq4.a;
                    }
                    hVar.s = null;
                    qi5<T> qi5Var = this.y;
                    if (obj2 == bl5.a) {
                        obj2 = null;
                    }
                    this.w = 1;
                    if (qi5Var.b(obj2, this) == h) {
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
                return new b(this.x, this.y, uv4Var);
            }
        }

        /* compiled from: Delay.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends vw4 implements j05<hh5<? super Object>, uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public final /* synthetic */ pi5<T> y;

            /* compiled from: Delay.kt */
            @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a<T> implements qi5, uw4 {
                public final /* synthetic */ hh5<Object> s;

                /* compiled from: Delay.kt */
                @mw4(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: com.p7700g.p99005.yi5$e$c$a$a */
                /* loaded from: classes3.dex */
                public static final class C0274a extends kw4 {
                    public /* synthetic */ Object v;
                    public final /* synthetic */ a<T> w;
                    public int x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0274a(a<? super T> aVar, uv4<? super C0274a> uv4Var) {
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

                public a(hh5<Object> hh5Var) {
                    this.s = hh5Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // com.p7700g.p99005.qi5
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                    C0274a c0274a;
                    int i;
                    if (uv4Var instanceof C0274a) {
                        c0274a = (C0274a) uv4Var;
                        int i2 = c0274a.x;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0274a.x = i2 - Integer.MIN_VALUE;
                            Object obj = c0274a.v;
                            Object h = gw4.h();
                            i = c0274a.x;
                            if (i != 0) {
                                rp4.n(obj);
                                hh5<Object> hh5Var = this.s;
                                if (t == null) {
                                    t = (T) bl5.a;
                                }
                                c0274a.x = 1;
                                if (hh5Var.I(t, c0274a) == h) {
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
                    c0274a = new C0274a(this, uv4Var);
                    Object obj2 = c0274a.v;
                    Object h2 = gw4.h();
                    i = c0274a.x;
                    if (i != 0) {
                    }
                    return yq4.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(pi5<? extends T> pi5Var, uv4<? super c> uv4Var) {
                super(2, uv4Var);
                this.y = pi5Var;
            }

            @Override // com.p7700g.p99005.j05
            @Nullable
            /* renamed from: C3 */
            public final Object w3(@NotNull hh5<Object> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((c) X(hh5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    pi5<T> pi5Var = this.y;
                    a aVar = new a((hh5) this.x);
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
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                c cVar = new c(this.y, uv4Var);
                cVar.x = obj;
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j, pi5<? extends T> pi5Var, uv4<? super e> uv4Var) {
            super(3, uv4Var);
            this.B = j;
            this.C = pi5Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull lc5 lc5Var, @NotNull qi5<? super T> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            e eVar = new e(this.B, this.C, uv4Var);
            eVar.z = lc5Var;
            eVar.A = qi5Var;
            return eVar.D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            jh5 g;
            qi5 qi5Var;
            jh5 jh5Var;
            b35.h hVar;
            jh5 jh5Var2;
            Object h = gw4.h();
            int i = this.y;
            if (i == 0) {
                rp4.n(obj);
                lc5 lc5Var = (lc5) this.z;
                jh5 f = fh5.f(lc5Var, null, -1, new c(this.C, null), 1, null);
                b35.h hVar2 = new b35.h();
                g = yi5.g(lc5Var, this.B, 0L, 2, null);
                qi5Var = (qi5) this.A;
                jh5Var = f;
                hVar = hVar2;
                jh5Var2 = g;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jh5Var2 = (jh5) this.x;
                hVar = (b35.h) this.w;
                jh5Var = (jh5) this.A;
                qi5Var = (qi5) this.z;
                rp4.n(obj);
            }
            while (hVar.s != bl5.c) {
                this.z = qi5Var;
                this.A = jh5Var;
                this.w = hVar;
                this.x = jh5Var2;
                this.y = 1;
                jo5 jo5Var = new jo5(this);
                try {
                    jo5Var.W(jh5Var.l(), new a(hVar, jh5Var2, null));
                    jo5Var.W(jh5Var2.k(), new b(hVar, qi5Var, null));
                } catch (Throwable th) {
                    jo5Var.M0(th);
                }
                Object L0 = jo5Var.L0();
                if (L0 == gw4.h()) {
                    ow4.c(this);
                    continue;
                }
                if (L0 == h) {
                    return h;
                }
            }
            return yq4.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ud5
    @NotNull
    public static final <T> pi5<T> a(@NotNull pi5<? extends T> pi5Var, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? pi5Var : e(pi5Var, new a(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @ud5
    @gp4
    @NotNull
    public static final <T> pi5<T> b(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, Long> f05Var) {
        return e(pi5Var, f05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> c(@NotNull pi5<? extends T> pi5Var, long j) {
        return ri5.a0(pi5Var, wc5.e(j));
    }

    @ud5
    @NotNull
    @fz4(name = "debounceDuration")
    @gp4
    public static final <T> pi5<T> d(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, o95> f05Var) {
        return e(pi5Var, new b(f05Var));
    }

    private static final <T> pi5<T> e(pi5<? extends T> pi5Var, f05<? super T, Long> f05Var) {
        return wk5.b(new c(f05Var, pi5Var, null));
    }

    @NotNull
    public static final jh5<yq4> f(@NotNull lc5 lc5Var, long j, long j2) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return fh5.f(lc5Var, null, 0, new d(j2, j, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    public static /* synthetic */ jh5 g(lc5 lc5Var, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return ri5.x0(lc5Var, j, j2);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> h(@NotNull pi5<? extends T> pi5Var, long j) {
        if (j > 0) {
            return wk5.b(new e(j, pi5Var, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> i(@NotNull pi5<? extends T> pi5Var, long j) {
        return ri5.A1(pi5Var, wc5.e(j));
    }
}