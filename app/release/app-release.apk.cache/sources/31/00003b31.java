package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Errors.kt */
@vo4(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001ac\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c23\b\u0002\u0010\u001d\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a}\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001d\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0!¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", qk3.a, "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class bj5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ k05 t;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.bj5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0151a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0151a(uv4 uv4Var) {
                super(uv4Var);
                a.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(pi5 pi5Var, k05 k05Var) {
            this.s = pi5Var;
            this.t = k05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0057  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            C0151a c0151a;
            int i;
            a aVar;
            qi5 qi5Var2;
            Throwable th;
            if (uv4Var instanceof C0151a) {
                c0151a = (C0151a) uv4Var;
                int i2 = c0151a.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0151a.w = i2 - Integer.MIN_VALUE;
                    Object obj = c0151a.v;
                    Object h = gw4.h();
                    i = c0151a.w;
                    if (i != 0) {
                        rp4.n(obj);
                        pi5 pi5Var = this.s;
                        c0151a.y = this;
                        c0151a.z = qi5Var;
                        c0151a.w = 1;
                        obj = ri5.v(pi5Var, qi5Var, c0151a);
                        if (obj == h) {
                            return h;
                        }
                        aVar = this;
                        qi5Var2 = qi5Var;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(obj);
                        return yq4.a;
                    } else {
                        aVar = (a) c0151a.y;
                        rp4.n(obj);
                        qi5Var2 = (qi5) c0151a.z;
                    }
                    th = (Throwable) obj;
                    if (th != null) {
                        k05 k05Var = aVar.t;
                        c0151a.y = null;
                        c0151a.z = null;
                        c0151a.w = 2;
                        z15.e(6);
                        Object I = k05Var.I(qi5Var2, th, c0151a);
                        z15.e(7);
                        if (I == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            c0151a = new C0151a(uv4Var);
            Object obj2 = c0151a.v;
            Object h2 = gw4.h();
            i = c0151a.w;
            if (i != 0) {
            }
            th = (Throwable) obj2;
            if (th != null) {
            }
            return yq4.a;
        }
    }

    /* compiled from: Errors.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public b(uv4<? super b> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.v(null, null, this);
        }
    }

    /* compiled from: Errors.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<T> implements qi5, uw4 {
        public final /* synthetic */ qi5<T> s;
        public final /* synthetic */ b35.h<Throwable> t;

        /* compiled from: Errors.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public final /* synthetic */ c<T> x;
            public int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.x = cVar;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.w = obj;
                this.y |= Integer.MIN_VALUE;
                return this.x.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(qi5<? super T> qi5Var, b35.h<Throwable> hVar) {
            this.s = qi5Var;
            this.t = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0037  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            c<T> cVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.y = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.w;
                    Object h = gw4.h();
                    i = aVar.y;
                    if (i != 0) {
                        rp4.n(obj);
                        try {
                            qi5<T> qi5Var = this.s;
                            aVar.v = this;
                            aVar.y = 1;
                            if (qi5Var.b(t, aVar) == h) {
                                return h;
                            }
                        } catch (Throwable t2) {
                            t2 = th;
                            cVar = this;
                            cVar.t.s = t2;
                            throw ((Throwable) t2);
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        cVar = (c) aVar.v;
                        try {
                            rp4.n(obj);
                        } catch (Throwable t22) {
                            t22 = th;
                            cVar.t.s = t22;
                            throw ((Throwable) t22);
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            Object obj2 = aVar.w;
            Object h2 = gw4.h();
            i = aVar.y;
            if (i != 0) {
            }
            return yq4.a;
        }
    }

    /* compiled from: Errors.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends vw4 implements j05<Throwable, uv4<? super Boolean>, Object> {
        public int w;

        public d(uv4<? super d> uv4Var) {
            super(2, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull Throwable th, @Nullable uv4<? super Boolean> uv4Var) {
            return ((d) X(th, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                return iw4.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new d(uv4Var);
        }
    }

    /* compiled from: Errors.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends vw4 implements l05<qi5<? super T>, Throwable, Long, uv4<? super Boolean>, Object> {
        public final /* synthetic */ j05<Throwable, uv4<? super Boolean>, Object> A;
        public int w;
        public /* synthetic */ Object x;
        public /* synthetic */ long y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j, j05<? super Throwable, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super e> uv4Var) {
            super(4, uv4Var);
            this.z = j;
            this.A = j05Var;
        }

        @Nullable
        public final Object C3(@NotNull qi5<? super T> qi5Var, @NotNull Throwable th, long j, @Nullable uv4<? super Boolean> uv4Var) {
            e eVar = new e(this.z, this.A, uv4Var);
            eVar.x = th;
            eVar.y = j;
            return eVar.D1(yq4.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L8;
         */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            boolean z = true;
            if (i == 0) {
                rp4.n(obj);
                Throwable th = (Throwable) this.x;
                if (this.y < this.z) {
                    j05<Throwable, uv4<? super Boolean>, Object> j05Var = this.A;
                    this.w = 1;
                    obj = j05Var.w3(th, this);
                    if (obj == h) {
                        return h;
                    }
                }
                z = false;
                return iw4.a(z);
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
        }

        @Override // com.p7700g.p99005.l05
        public /* bridge */ /* synthetic */ Object Z(Object obj, Throwable th, Long l, uv4<? super Boolean> uv4Var) {
            return C3((qi5) obj, th, l.longValue(), uv4Var);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ l05 t;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object A;
            public long B;
            public int C;
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var) {
                super(uv4Var);
                f.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(pi5 pi5Var, l05 l05Var) {
            this.s = pi5Var;
            this.t = l05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00af  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0097 -> B:63:0x009a). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00a9 -> B:68:0x00aa). Please submit an issue!!! */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            long j;
            f fVar;
            int i2;
            f fVar2;
            qi5 qi5Var2;
            Throwable th;
            qi5 qi5Var3;
            Object v;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i3 = aVar.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i3 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        j = 0;
                        fVar = this;
                        qi5Var3 = qi5Var;
                        pi5 pi5Var = fVar.s;
                        aVar.y = fVar;
                        aVar.z = qi5Var3;
                        aVar.A = null;
                        aVar.B = j;
                        aVar.C = 0;
                        aVar.w = 1;
                        v = ri5.v(pi5Var, qi5Var3, aVar);
                        if (v != h) {
                        }
                    } else if (i == 1) {
                        i2 = aVar.C;
                        j = aVar.B;
                        qi5Var2 = (qi5) aVar.z;
                        fVar2 = (f) aVar.y;
                        rp4.n(obj);
                        th = (Throwable) obj;
                        if (th == null) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        j = aVar.B;
                        Throwable th2 = (Throwable) aVar.A;
                        qi5Var2 = (qi5) aVar.z;
                        fVar2 = (f) aVar.y;
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            j++;
                            fVar = fVar2;
                            i2 = 1;
                            if (i2 == 0) {
                                qi5Var3 = qi5Var2;
                                pi5 pi5Var2 = fVar.s;
                                aVar.y = fVar;
                                aVar.z = qi5Var3;
                                aVar.A = null;
                                aVar.B = j;
                                aVar.C = 0;
                                aVar.w = 1;
                                v = ri5.v(pi5Var2, qi5Var3, aVar);
                                if (v != h) {
                                    return h;
                                }
                                qi5Var2 = qi5Var3;
                                i2 = 0;
                                fVar2 = fVar;
                                obj = v;
                                th = (Throwable) obj;
                                if (th == null) {
                                    l05 l05Var = fVar2.t;
                                    Long g = iw4.g(j);
                                    aVar.y = fVar2;
                                    aVar.z = qi5Var2;
                                    aVar.A = th;
                                    aVar.B = j;
                                    aVar.w = 2;
                                    z15.e(6);
                                    Object Z = l05Var.Z(qi5Var2, th, g, aVar);
                                    z15.e(7);
                                    if (Z == h) {
                                        return h;
                                    }
                                    obj = Z;
                                    th2 = th;
                                    if (!((Boolean) obj).booleanValue()) {
                                        throw th2;
                                    }
                                } else {
                                    fVar = fVar2;
                                    if (i2 == 0) {
                                    }
                                }
                            } else {
                                return yq4.a;
                            }
                        }
                    }
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
        }
    }

    @NotNull
    public static final <T> pi5<T> a(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super qi5<? super T>, ? super Throwable, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return new a(pi5Var, k05Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull pi5<? extends T> pi5Var, @NotNull qi5<? super T> qi5Var, @NotNull uv4<? super Throwable> uv4Var) {
        b bVar;
        int i;
        b35.h hVar;
        Throwable th;
        if (uv4Var instanceof b) {
            bVar = (b) uv4Var;
            int i2 = bVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.x = i2 - Integer.MIN_VALUE;
                Object obj = bVar.w;
                Object h = gw4.h();
                i = bVar.x;
                if (i != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    try {
                        qi5<? super Object> cVar = new c<>(qi5Var, hVar2);
                        bVar.v = hVar2;
                        bVar.x = 1;
                        if (pi5Var.a(cVar, bVar) == h) {
                            return h;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = hVar2;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) bVar.v;
                    try {
                        rp4.n(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) hVar.s;
                if (!d(th, th) || c(th, bVar.getContext())) {
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    co4.a(th, th);
                    throw th;
                }
                co4.a(th, th);
                throw th;
            }
        }
        bVar = new b(uv4Var);
        Object obj2 = bVar.w;
        Object h2 = gw4.h();
        i = bVar.x;
        if (i != 0) {
        }
        th = (Throwable) hVar.s;
        if (d(th, th)) {
        }
        throw th;
    }

    private static final boolean c(Throwable th, xv4 xv4Var) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var == null || !ee5Var.isCancelled()) {
            return false;
        }
        return d(th, ee5Var.c1());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && c25.g(th2, th);
    }

    @NotNull
    public static final <T> pi5<T> e(@NotNull pi5<? extends T> pi5Var, long j, @NotNull j05<? super Throwable, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        if (j > 0) {
            return ri5.x1(pi5Var, new e(j, j05Var, null));
        }
        throw new IllegalArgumentException(c25.C("Expected positive amount of retries, but had ", Long.valueOf(j)).toString());
    }

    public static /* synthetic */ pi5 f(pi5 pi5Var, long j, j05 j05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            j05Var = new d(null);
        }
        return ri5.v1(pi5Var, j, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull pi5<? extends T> pi5Var, @NotNull l05<? super qi5<? super T>, ? super Throwable, ? super Long, ? super uv4<? super Boolean>, ? extends Object> l05Var) {
        return new f(pi5Var, l05Var);
    }
}