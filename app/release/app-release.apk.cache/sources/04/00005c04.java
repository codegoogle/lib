package com.p7700g.p99005;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@vo4(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\n\u001aK\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0010\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a+\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0013\"\u0002H\u0002¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0016H\u0007\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0013¢\u0006\u0002\u0010\u0014\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001*\u00020\u0018\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u001a\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001b\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001c\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001*\u00020\u001d\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u001e\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001f\u001a6\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0 H\u0007ø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"callbackFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "channelFlow", "emptyFlow", "flow", "Lkotlinx/coroutines/flow/FlowCollector;", "flowOf", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "elements", "", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "asFlow", "Lkotlin/Function0;", "", "", "", "", "", "", "Lkotlin/ranges/IntRange;", "Lkotlin/ranges/LongRange;", "Lkotlin/sequences/Sequence;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class si5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements pi5<Long> {
        public final /* synthetic */ f55 s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.si5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0242a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public C0242a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(f55 f55Var) {
            this.s = f55Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super Long> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            C0242a c0242a;
            int i;
            qi5<? super Long> qi5Var2;
            Iterator<Long> it;
            if (uv4Var instanceof C0242a) {
                c0242a = (C0242a) uv4Var;
                int i2 = c0242a.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0242a.w = i2 - Integer.MIN_VALUE;
                    Object obj = c0242a.v;
                    Object h = gw4.h();
                    i = c0242a.w;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5Var2 = qi5Var;
                        it = this.s.iterator();
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (Iterator) c0242a.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) c0242a.y;
                    }
                    while (it.hasNext()) {
                        Long g = iw4.g(((gt4) it).b());
                        c0242a.y = qi5Var2;
                        c0242a.z = it;
                        c0242a.w = 1;
                        if (qi5Var2.b(g, c0242a) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            c0242a = new C0242a(uv4Var);
            Object obj2 = c0242a.v;
            Object h2 = gw4.h();
            i = c0242a.w;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements pi5<T> {
        public final /* synthetic */ uz4 s;

        public b(uz4 uz4Var) {
            this.s = uz4Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object b = qi5Var.b(this.s.x(), uv4Var);
            return b == gw4.h() ? b : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements pi5<T> {
        public final /* synthetic */ f05 s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(f05 f05Var) {
            this.s = f05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object obj;
            Object h;
            int i;
            qi5 qi5Var2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    obj = aVar.v;
                    h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        f05 f05Var = this.s;
                        aVar.y = qi5Var;
                        aVar.w = 1;
                        z15.e(6);
                        obj = f05Var.M(aVar);
                        z15.e(7);
                        qi5Var2 = qi5Var;
                        if (obj == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(obj);
                        return yq4.a;
                    } else {
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    aVar.y = null;
                    aVar.w = 2;
                    if (qi5Var2.b(obj, aVar) == h) {
                        return h;
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            obj = aVar.v;
            h = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            aVar.y = null;
            aVar.w = 2;
            if (qi5Var2.b(obj, aVar) == h) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements pi5<T> {
        public final /* synthetic */ Iterable s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(Iterable iterable) {
            this.s = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            qi5 qi5Var2;
            Iterator it;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5Var2 = qi5Var;
                        it = this.s.iterator();
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (Iterator) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (it.hasNext()) {
                        Object next = it.next();
                        aVar.y = qi5Var2;
                        aVar.z = it;
                        aVar.w = 1;
                        if (qi5Var2.b(next, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements pi5<T> {
        public final /* synthetic */ Iterator s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(Iterator it) {
            this.s = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            qi5 qi5Var2;
            Iterator it;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5Var2 = qi5Var;
                        it = this.s;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (Iterator) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (it.hasNext()) {
                        Object next = it.next();
                        aVar.y = qi5Var2;
                        aVar.z = it;
                        aVar.w = 1;
                        if (qi5Var2.b(next, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements pi5<T> {
        public final /* synthetic */ g75 s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(g75 g75Var) {
            this.s = g75Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            qi5 qi5Var2;
            Iterator it;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5Var2 = qi5Var;
                        it = this.s.iterator();
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (Iterator) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (it.hasNext()) {
                        Object next = it.next();
                        aVar.y = qi5Var2;
                        aVar.z = it;
                        aVar.w = 1;
                        if (qi5Var2.b(next, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements pi5<T> {
        public final /* synthetic */ Object[] s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public int A;
            public int B;
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(Object[] objArr) {
            this.s = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            int i2;
            qi5 qi5Var2;
            int i3;
            Object[] objArr;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i4 = aVar.w;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        Object[] objArr2 = this.s;
                        i2 = 0;
                        int length = objArr2.length;
                        qi5Var2 = qi5Var;
                        i3 = length;
                        objArr = objArr2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i3 = aVar.B;
                        i2 = aVar.A;
                        objArr = (Object[]) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (i2 < i3) {
                        Object obj2 = objArr[i2];
                        i2++;
                        aVar.y = qi5Var2;
                        aVar.z = objArr;
                        aVar.A = i2;
                        aVar.B = i3;
                        aVar.w = 1;
                        if (qi5Var2.b(obj2, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj3 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (i2 < i3) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements pi5<Integer> {
        public final /* synthetic */ int[] s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public int A;
            public int B;
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(int[] iArr) {
            this.s = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super Integer> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            int i2;
            qi5<? super Integer> qi5Var2;
            int i3;
            int[] iArr;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i4 = aVar.w;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        int[] iArr2 = this.s;
                        i2 = 0;
                        int length = iArr2.length;
                        qi5Var2 = qi5Var;
                        i3 = length;
                        iArr = iArr2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i3 = aVar.B;
                        i2 = aVar.A;
                        iArr = (int[]) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (i2 < i3) {
                        int i5 = iArr[i2];
                        i2++;
                        Integer f = iw4.f(i5);
                        aVar.y = qi5Var2;
                        aVar.z = iArr;
                        aVar.A = i2;
                        aVar.B = i3;
                        aVar.w = 1;
                        if (qi5Var2.b(f, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (i2 < i3) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements pi5<Long> {
        public final /* synthetic */ long[] s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public int A;
            public int B;
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(long[] jArr) {
            this.s = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super Long> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            int i2;
            qi5<? super Long> qi5Var2;
            int i3;
            long[] jArr;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i4 = aVar.w;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        long[] jArr2 = this.s;
                        i2 = 0;
                        int length = jArr2.length;
                        qi5Var2 = qi5Var;
                        i3 = length;
                        jArr = jArr2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i3 = aVar.B;
                        i2 = aVar.A;
                        jArr = (long[]) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (i2 < i3) {
                        long j = jArr[i2];
                        i2++;
                        Long g = iw4.g(j);
                        aVar.y = qi5Var2;
                        aVar.z = jArr;
                        aVar.A = i2;
                        aVar.B = i3;
                        aVar.w = 1;
                        if (qi5Var2.b(g, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (i2 < i3) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements pi5<Integer> {
        public final /* synthetic */ c55 s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(c55 c55Var) {
            this.s = c55Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super Integer> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            qi5<? super Integer> qi5Var2;
            Iterator<Integer> it;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5Var2 = qi5Var;
                        it = this.s.iterator();
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (Iterator) aVar.z;
                        rp4.n(obj);
                        qi5Var2 = (qi5) aVar.y;
                    }
                    while (it.hasNext()) {
                        Integer f = iw4.f(((ft4) it).b());
                        aVar.y = qi5Var2;
                        aVar.z = it;
                        aVar.w = 1;
                        if (qi5Var2.b(f, aVar) == h) {
                            return h;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k implements pi5<T> {
        public final /* synthetic */ Object[] s;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public int A;
            public int B;
            public /* synthetic */ Object v;
            public int w;
            public Object y;
            public Object z;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(Object[] objArr) {
            this.s = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            k kVar;
            qi5 qi5Var2;
            int length;
            Object obj;
            a aVar2;
            int i2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i3 = aVar.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i3 - Integer.MIN_VALUE;
                    Object obj2 = aVar.v;
                    Object h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj2);
                        kVar = this;
                        qi5Var2 = qi5Var;
                        length = this.s.length;
                        obj = h;
                        aVar2 = aVar;
                        i2 = 0;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        length = aVar.B;
                        int i4 = aVar.A;
                        kVar = (k) aVar.y;
                        rp4.n(obj2);
                        qi5Var2 = (qi5) aVar.z;
                        aVar2 = aVar;
                        i2 = i4;
                        obj = h;
                    }
                    while (i2 < length) {
                        Object obj3 = kVar.s[i2];
                        i2++;
                        aVar2.y = kVar;
                        aVar2.z = qi5Var2;
                        aVar2.A = i2;
                        aVar2.B = length;
                        aVar2.w = 1;
                        if (qi5Var2.b(obj3, aVar2) == obj) {
                            return obj;
                        }
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj22 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            while (i2 < length) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l implements pi5<T> {
        public final /* synthetic */ Object s;

        public l(Object obj) {
            this.s = obj;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object b = qi5Var.b(this.s, uv4Var);
            return b == gw4.h() ? b : yq4.a;
        }
    }

    @NotNull
    public static final <T> pi5<T> a(@NotNull Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @NotNull
    public static final <T> pi5<T> b(@NotNull Iterator<? extends T> it) {
        return new e(it);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> c(@NotNull uz4<? extends T> uz4Var) {
        return new b(uz4Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> d(@NotNull f05<? super uv4<? super T>, ? extends Object> f05Var) {
        return new c(f05Var);
    }

    @NotNull
    public static final pi5<Integer> e(@NotNull c55 c55Var) {
        return new j(c55Var);
    }

    @NotNull
    public static final pi5<Long> f(@NotNull f55 f55Var) {
        return new a(f55Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull g75<? extends T> g75Var) {
        return new f(g75Var);
    }

    @NotNull
    public static final pi5<Integer> h(@NotNull int[] iArr) {
        return new h(iArr);
    }

    @NotNull
    public static final pi5<Long> i(@NotNull long[] jArr) {
        return new i(jArr);
    }

    @NotNull
    public static final <T> pi5<T> j(@NotNull T[] tArr) {
        return new g(tArr);
    }

    @NotNull
    public static final <T> pi5<T> k(@on4 @NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new ii5(j05Var, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> pi5<T> l(@on4 @NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new mi5(j05Var, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> pi5<T> m() {
        return oi5.s;
    }

    @NotNull
    public static final <T> pi5<T> n(@on4 @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new oj5(j05Var);
    }

    @NotNull
    public static final <T> pi5<T> o(T t) {
        return new l(t);
    }

    @NotNull
    public static final <T> pi5<T> p(@NotNull T... tArr) {
        return new k(tArr);
    }
}