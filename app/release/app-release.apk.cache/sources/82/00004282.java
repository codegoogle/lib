package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@vo4(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aG\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001as\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class fj5 {

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements qi5<T> {
        public final /* synthetic */ b35.h s;

        public a(b35.h hVar) {
            this.s = hVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.s = t;
            throw new hk5(this);
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements qi5<T> {
        public final /* synthetic */ j05 s;
        public final /* synthetic */ b35.h t;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {143}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public int x;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.w = obj;
                this.x |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(j05 j05Var, b35.h hVar) {
            this.s = j05Var;
            this.t = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object obj;
            int i;
            boolean z;
            b bVar;
            T t2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.x = i2 - Integer.MIN_VALUE;
                    obj = aVar.w;
                    Object h = gw4.h();
                    i = aVar.x;
                    z = true;
                    if (i != 0) {
                        rp4.n(obj);
                        j05 j05Var = this.s;
                        aVar.v = this;
                        aVar.z = t;
                        aVar.x = 1;
                        z15.e(6);
                        obj = j05Var.w3(t, aVar);
                        z15.e(7);
                        if (obj == h) {
                            return h;
                        }
                        bVar = this;
                        t2 = t;
                    } else if (i == 1) {
                        Object obj2 = aVar.z;
                        bVar = (b) aVar.v;
                        rp4.n(obj);
                        t2 = obj2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        bVar.t.s = t2;
                        z = false;
                    }
                    if (!z) {
                        return yq4.a;
                    }
                    throw new hk5(bVar);
                }
            }
            aVar = new a(uv4Var);
            obj = aVar.w;
            Object h2 = gw4.h();
            i = aVar.x;
            z = true;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            if (!z) {
            }
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {yg1.D}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<T> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public c(uv4<? super c> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return ri5.t0(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {yg1.D}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<T> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public d(uv4<? super d> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return ri5.u0(null, null, this);
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements qi5<T> {
        public final /* synthetic */ b35.h s;

        public e(b35.h hVar) {
            this.s = hVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.s = t;
            throw new hk5(this);
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements qi5<T> {
        public final /* synthetic */ j05 s;
        public final /* synthetic */ b35.h t;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {143}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public int x;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.w = obj;
                this.x |= Integer.MIN_VALUE;
                return f.this.b(null, this);
            }
        }

        public f(j05 j05Var, b35.h hVar) {
            this.s = j05Var;
            this.t = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object obj;
            int i;
            boolean z;
            f fVar;
            T t2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.x = i2 - Integer.MIN_VALUE;
                    obj = aVar.w;
                    Object h = gw4.h();
                    i = aVar.x;
                    z = true;
                    if (i != 0) {
                        rp4.n(obj);
                        j05 j05Var = this.s;
                        aVar.v = this;
                        aVar.z = t;
                        aVar.x = 1;
                        z15.e(6);
                        obj = j05Var.w3(t, aVar);
                        z15.e(7);
                        if (obj == h) {
                            return h;
                        }
                        fVar = this;
                        t2 = t;
                    } else if (i == 1) {
                        Object obj2 = aVar.z;
                        fVar = (f) aVar.v;
                        rp4.n(obj);
                        t2 = obj2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        fVar.t.s = t2;
                        z = false;
                    }
                    if (!z) {
                        return yq4.a;
                    }
                    throw new hk5(fVar);
                }
            }
            aVar = new a(uv4Var);
            obj = aVar.w;
            Object h2 = gw4.h();
            i = aVar.x;
            z = true;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            if (!z) {
            }
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {yg1.D}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g<T> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public g(uv4<? super g> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return ri5.v0(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {yg1.D}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h<T> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public h(uv4<? super h> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return ri5.w0(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class i<T, R> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public i(uv4<? super i> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return fj5.e(null, null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class j<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<R> s;
        public final /* synthetic */ k05<R, T, uv4<? super R>, Object> t;

        /* compiled from: Reduce.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public final /* synthetic */ j<T> x;
            public int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.x = jVar;
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
        public j(b35.h<R> hVar, k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
            this.s = hVar;
            this.t = k05Var;
        }

        @Nullable
        public final Object a(T t, @NotNull uv4<? super yq4> uv4Var) {
            z15.e(4);
            new a(this, uv4Var);
            z15.e(5);
            b35.h<R> hVar = this.s;
            hVar.s = (T) this.t.I(hVar.s, t, uv4Var);
            return yq4.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            b35.h hVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.y = i2 - Integer.MIN_VALUE;
                    T t2 = (T) aVar.w;
                    Object h = gw4.h();
                    i = aVar.y;
                    if (i != 0) {
                        rp4.n(t2);
                        b35.h hVar2 = this.s;
                        k05<R, T, uv4<? super R>, Object> k05Var = this.t;
                        T t3 = hVar2.s;
                        aVar.v = hVar2;
                        aVar.y = 1;
                        Object I = k05Var.I(t3, t, aVar);
                        if (I == h) {
                            return h;
                        }
                        t2 = (T) I;
                        hVar = hVar2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hVar = (b35.h) aVar.v;
                        rp4.n(t2);
                    }
                    hVar.s = t2;
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            T t22 = (T) aVar.w;
            Object h2 = gw4.h();
            i = aVar.y;
            if (i != 0) {
            }
            hVar.s = t22;
            return yq4.a;
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public k(uv4<? super k> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.S0(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<Object> s;

        public l(b35.h<Object> hVar) {
            this.s = hVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.s = t;
            return yq4.a;
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public m(uv4<? super m> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.T0(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<T> s;

        public n(b35.h<T> hVar) {
            this.s = hVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.s = t;
            return yq4.a;
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o<S, T extends S> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public o(uv4<? super o> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.s1(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<Object> s;
        public final /* synthetic */ k05<S, T, uv4<? super S>, Object> t;

        /* compiled from: Reduce.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public final /* synthetic */ p<T> x;
            public int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<? super T> pVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.x = pVar;
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
        public p(b35.h<Object> hVar, k05<? super S, ? super T, ? super uv4<? super S>, ? extends Object> k05Var) {
            this.s = hVar;
            this.t = k05Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            b35.h<Object> hVar;
            b35.h<Object> hVar2;
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
                        hVar = this.s;
                        Object obj2 = hVar.s;
                        if (obj2 != bl5.a) {
                            k05 k05Var = this.t;
                            aVar.v = hVar;
                            aVar.y = 1;
                            Object I = k05Var.I(obj2, t, aVar);
                            if (I == h) {
                                return h;
                            }
                            obj = I;
                            hVar2 = hVar;
                        }
                        hVar.s = t;
                        return yq4.a;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hVar2 = (b35.h) aVar.v;
                        rp4.n(obj);
                    }
                    T t2 = obj;
                    hVar = hVar2;
                    t = t2;
                    hVar.s = t;
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            Object obj3 = aVar.w;
            Object h2 = gw4.h();
            i = aVar.y;
            if (i != 0) {
            }
            T t22 = obj3;
            hVar = hVar2;
            t = t22;
            hVar.s = t;
            return yq4.a;
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public q(uv4<? super q> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.H1(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class r<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<Object> s;

        public r(b35.h<Object> hVar) {
            this.s = hVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            b35.h<Object> hVar = this.s;
            if (hVar.s == bl5.a) {
                hVar.s = t;
                return yq4.a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s implements qi5<T> {
        public final /* synthetic */ b35.h s;

        public s(b35.h hVar) {
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, com.p7700g.p99005.an5] */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            boolean z;
            b35.h hVar = this.s;
            T t2 = hVar.s;
            ?? r1 = bl5.a;
            if (t2 == r1) {
                hVar.s = t;
                z = true;
            } else {
                hVar.s = r1;
                z = false;
            }
            if (z) {
                return yq4.a;
            }
            throw new hk5(this);
        }
    }

    /* compiled from: Reduce.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {yg1.D}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t<T> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public t(uv4<? super t> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return ri5.I1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        c cVar;
        int i2;
        b35.h hVar;
        hk5 e2;
        qi5<? super Object> qi5Var;
        T t2;
        if (uv4Var instanceof c) {
            cVar = (c) uv4Var;
            int i3 = cVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.y = i3 - Integer.MIN_VALUE;
                Object obj = cVar.x;
                Object h2 = gw4.h();
                i2 = cVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = (T) bl5.a;
                    qi5<? super Object> aVar = new a(hVar2);
                    try {
                        cVar.v = hVar2;
                        cVar.w = aVar;
                        cVar.y = 1;
                        if (pi5Var.a(aVar, cVar) == h2) {
                            return h2;
                        }
                        hVar = hVar2;
                    } catch (hk5 e3) {
                        hVar = hVar2;
                        e2 = e3;
                        qi5Var = aVar;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 == bl5.a) {
                        }
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (a) cVar.w;
                    hVar = (b35.h) cVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e4) {
                        e2 = e4;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 == bl5.a) {
                        }
                    }
                }
                t2 = hVar.s;
                if (t2 == bl5.a) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        cVar = new c(uv4Var);
        Object obj2 = cVar.x;
        Object h22 = gw4.h();
        i2 = cVar.y;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 == bl5.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super T> uv4Var) {
        d dVar;
        int i2;
        j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var2;
        b35.h hVar;
        hk5 e2;
        qi5<? super Object> qi5Var;
        T t2;
        if (uv4Var instanceof d) {
            dVar = (d) uv4Var;
            int i3 = dVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.z = i3 - Integer.MIN_VALUE;
                Object obj = dVar.y;
                Object h2 = gw4.h();
                i2 = dVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = (T) bl5.a;
                    qi5<? super Object> bVar = new b(j05Var, hVar2);
                    try {
                        dVar.v = j05Var;
                        dVar.w = hVar2;
                        dVar.x = bVar;
                        dVar.z = 1;
                        if (pi5Var.a(bVar, dVar) == h2) {
                            return h2;
                        }
                        j05Var2 = j05Var;
                        hVar = hVar2;
                    } catch (hk5 e3) {
                        j05Var2 = j05Var;
                        hVar = hVar2;
                        e2 = e3;
                        qi5Var = bVar;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 == bl5.a) {
                        }
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (b) dVar.x;
                    hVar = (b35.h) dVar.w;
                    j05Var2 = (j05) dVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e4) {
                        e2 = e4;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 == bl5.a) {
                        }
                    }
                }
                t2 = hVar.s;
                if (t2 == bl5.a) {
                    return t2;
                }
                throw new NoSuchElementException(c25.C("Expected at least one element matching the predicate ", j05Var2));
            }
        }
        dVar = new d(uv4Var);
        Object obj2 = dVar.y;
        Object h22 = gw4.h();
        i2 = dVar.z;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 == bl5.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        g gVar;
        int i2;
        b35.h hVar;
        hk5 e2;
        qi5<? super Object> qi5Var;
        if (uv4Var instanceof g) {
            gVar = (g) uv4Var;
            int i3 = gVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.y = i3 - Integer.MIN_VALUE;
                Object obj = gVar.x;
                Object h2 = gw4.h();
                i2 = gVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    qi5<? super Object> eVar = new e(hVar2);
                    try {
                        gVar.v = hVar2;
                        gVar.w = eVar;
                        gVar.y = 1;
                        if (pi5Var.a(eVar, gVar) == h2) {
                            return h2;
                        }
                        hVar = hVar2;
                    } catch (hk5 e3) {
                        hVar = hVar2;
                        e2 = e3;
                        qi5Var = eVar;
                        xk5.b(e2, qi5Var);
                        return hVar.s;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (e) gVar.w;
                    hVar = (b35.h) gVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e4) {
                        e2 = e4;
                        xk5.b(e2, qi5Var);
                        return hVar.s;
                    }
                }
                return hVar.s;
            }
        }
        gVar = new g(uv4Var);
        Object obj2 = gVar.x;
        Object h22 = gw4.h();
        i2 = gVar.y;
        if (i2 != 0) {
        }
        return hVar.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object d(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super T> uv4Var) {
        h hVar;
        int i2;
        b35.h hVar2;
        hk5 e2;
        qi5<? super Object> qi5Var;
        if (uv4Var instanceof h) {
            hVar = (h) uv4Var;
            int i3 = hVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.y = i3 - Integer.MIN_VALUE;
                Object obj = hVar.x;
                Object h2 = gw4.h();
                i2 = hVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar3 = new b35.h();
                    qi5<? super Object> fVar = new f(j05Var, hVar3);
                    try {
                        hVar.v = hVar3;
                        hVar.w = fVar;
                        hVar.y = 1;
                        if (pi5Var.a(fVar, hVar) == h2) {
                            return h2;
                        }
                        hVar2 = hVar3;
                    } catch (hk5 e3) {
                        hVar2 = hVar3;
                        e2 = e3;
                        qi5Var = fVar;
                        xk5.b(e2, qi5Var);
                        return hVar2.s;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (f) hVar.w;
                    hVar2 = (b35.h) hVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e4) {
                        e2 = e4;
                        xk5.b(e2, qi5Var);
                        return hVar2.s;
                    }
                }
                return hVar2.s;
            }
        }
        hVar = new h(uv4Var);
        Object obj2 = hVar.x;
        Object h22 = gw4.h();
        i2 = hVar.y;
        if (i2 != 0) {
        }
        return hVar2.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, R> Object e(@NotNull pi5<? extends T> pi5Var, R r2, @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var, @NotNull uv4<? super R> uv4Var) {
        i iVar;
        int i2;
        b35.h hVar;
        if (uv4Var instanceof i) {
            iVar = (i) uv4Var;
            int i3 = iVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.x = i3 - Integer.MIN_VALUE;
                Object obj = iVar.w;
                Object h2 = gw4.h();
                i2 = iVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = r2;
                    qi5<? super Object> jVar = new j<>(hVar2, k05Var);
                    iVar.v = hVar2;
                    iVar.x = 1;
                    if (pi5Var.a(jVar, iVar) == h2) {
                        return h2;
                    }
                    hVar = hVar2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) iVar.v;
                    rp4.n(obj);
                }
                return hVar.s;
            }
        }
        iVar = new i(uv4Var);
        Object obj2 = iVar.w;
        Object h22 = gw4.h();
        i2 = iVar.x;
        if (i2 != 0) {
        }
        return hVar.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(pi5<? extends T> pi5Var, R r2, k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var, uv4<? super R> uv4Var) {
        b35.h hVar = new b35.h();
        hVar.s = r2;
        j jVar = new j(hVar, k05Var);
        z15.e(0);
        pi5Var.a(jVar, uv4Var);
        z15.e(1);
        return hVar.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object g(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        k kVar;
        int i2;
        b35.h hVar;
        T t2;
        if (uv4Var instanceof k) {
            kVar = (k) uv4Var;
            int i3 = kVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.x = i3 - Integer.MIN_VALUE;
                Object obj = kVar.w;
                Object h2 = gw4.h();
                i2 = kVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = (T) bl5.a;
                    qi5<? super Object> lVar = new l<>(hVar2);
                    kVar.v = hVar2;
                    kVar.x = 1;
                    if (pi5Var.a(lVar, kVar) == h2) {
                        return h2;
                    }
                    hVar = hVar2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) kVar.v;
                    rp4.n(obj);
                }
                t2 = hVar.s;
                if (t2 == bl5.a) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        kVar = new k(uv4Var);
        Object obj2 = kVar.w;
        Object h22 = gw4.h();
        i2 = kVar.x;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 == bl5.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object h(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        m mVar;
        int i2;
        b35.h hVar;
        if (uv4Var instanceof m) {
            mVar = (m) uv4Var;
            int i3 = mVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.x = i3 - Integer.MIN_VALUE;
                Object obj = mVar.w;
                Object h2 = gw4.h();
                i2 = mVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    qi5<? super Object> nVar = new n<>(hVar2);
                    mVar.v = hVar2;
                    mVar.x = 1;
                    if (pi5Var.a(nVar, mVar) == h2) {
                        return h2;
                    }
                    hVar = hVar2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) mVar.v;
                    rp4.n(obj);
                }
                return hVar.s;
            }
        }
        mVar = new m(uv4Var);
        Object obj2 = mVar.w;
        Object h22 = gw4.h();
        i2 = mVar.x;
        if (i2 != 0) {
        }
        return hVar.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.p7700g.p99005.an5] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S, T extends S> Object i(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super S, ? super T, ? super uv4<? super S>, ? extends Object> k05Var, @NotNull uv4<? super S> uv4Var) {
        o oVar;
        int i2;
        b35.h hVar;
        T t2;
        if (uv4Var instanceof o) {
            oVar = (o) uv4Var;
            int i3 = oVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.x = i3 - Integer.MIN_VALUE;
                Object obj = oVar.w;
                Object h2 = gw4.h();
                i2 = oVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = bl5.a;
                    qi5<? super Object> pVar = new p<>(hVar2, k05Var);
                    oVar.v = hVar2;
                    oVar.x = 1;
                    if (pi5Var.a(pVar, oVar) == h2) {
                        return h2;
                    }
                    hVar = hVar2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) oVar.v;
                    rp4.n(obj);
                }
                t2 = hVar.s;
                if (t2 == bl5.a) {
                    return t2;
                }
                throw new NoSuchElementException("Empty flow can't be reduced");
            }
        }
        oVar = new o(uv4Var);
        Object obj2 = oVar.w;
        Object h22 = gw4.h();
        i2 = oVar.x;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 == bl5.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object j(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        q qVar;
        int i2;
        b35.h hVar;
        T t2;
        if (uv4Var instanceof q) {
            qVar = (q) uv4Var;
            int i3 = qVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.x = i3 - Integer.MIN_VALUE;
                Object obj = qVar.w;
                Object h2 = gw4.h();
                i2 = qVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = (T) bl5.a;
                    qi5<? super Object> rVar = new r<>(hVar2);
                    qVar.v = hVar2;
                    qVar.x = 1;
                    if (pi5Var.a(rVar, qVar) == h2) {
                        return h2;
                    }
                    hVar = hVar2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar = (b35.h) qVar.v;
                    rp4.n(obj);
                }
                t2 = hVar.s;
                if (t2 == bl5.a) {
                    return t2;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        qVar = new q(uv4Var);
        Object obj2 = qVar.w;
        Object h22 = gw4.h();
        i2 = qVar.x;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 == bl5.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object k(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        t tVar;
        int i2;
        b35.h hVar;
        hk5 e2;
        qi5<? super Object> qi5Var;
        T t2;
        if (uv4Var instanceof t) {
            tVar = (t) uv4Var;
            int i3 = tVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.y = i3 - Integer.MIN_VALUE;
                Object obj = tVar.x;
                Object h2 = gw4.h();
                i2 = tVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    b35.h hVar2 = new b35.h();
                    hVar2.s = (T) bl5.a;
                    qi5<? super Object> sVar = new s(hVar2);
                    try {
                        tVar.v = hVar2;
                        tVar.w = sVar;
                        tVar.y = 1;
                        if (pi5Var.a(sVar, tVar) == h2) {
                            return h2;
                        }
                        hVar = hVar2;
                    } catch (hk5 e3) {
                        hVar = hVar2;
                        e2 = e3;
                        qi5Var = sVar;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 != bl5.a) {
                        }
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (s) tVar.w;
                    hVar = (b35.h) tVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e4) {
                        e2 = e4;
                        xk5.b(e2, qi5Var);
                        t2 = hVar.s;
                        if (t2 != bl5.a) {
                        }
                    }
                }
                t2 = hVar.s;
                if (t2 != bl5.a) {
                    return null;
                }
                return t2;
            }
        }
        tVar = new t(uv4Var);
        Object obj2 = tVar.x;
        Object h22 = gw4.h();
        i2 = tVar.y;
        if (i2 != 0) {
        }
        t2 = hVar.s;
        if (t2 != bl5.a) {
        }
    }
}