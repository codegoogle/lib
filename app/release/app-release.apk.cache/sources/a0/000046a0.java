package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transform.kt */
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\b\u0004\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\b\u0004\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0007*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\u001ab\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u000123\b\u0004\u0010\u000e\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001ah\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u000125\b\u0004\u0010\u000e\u001a/\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001aH\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a|\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0017\u001a\u0002H\n2H\b\u0001\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001al\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012F\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a|\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0017\u001a\u0002H\n2H\b\u0001\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020 0\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"filter", "Lkotlinx/coroutines/flow/Flow;", "T", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "filterIsInstance", "R", "filterNot", "filterNotNull", "map", "transform", "Lkotlin/ParameterName;", "name", "value", "mapNotNull", "onEach", "action", "", "runningFold", "initial", "operation", "Lkotlin/Function3;", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "runningReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "scan", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class hj5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: com.p7700g.p99005.hj5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0189a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            public C0189a(uv4 uv4Var) {
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

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;
            public final /* synthetic */ j05 t;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
            /* renamed from: com.p7700g.p99005.hj5$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0190a extends kw4 {
                public /* synthetic */ Object v;
                public int w;
                public Object y;
                public Object z;

                public C0190a(uv4 uv4Var) {
                    super(uv4Var);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.v = obj;
                    this.w |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            public b(qi5 qi5Var, j05 j05Var) {
                this.s = qi5Var;
                this.t = j05Var;
            }

            @Nullable
            public final Object a(Object obj, @NotNull uv4 uv4Var) {
                z15.e(4);
                new C0190a(uv4Var);
                z15.e(5);
                qi5 qi5Var = this.s;
                if (((Boolean) this.t.w3(obj, uv4Var)).booleanValue()) {
                    z15.e(0);
                    qi5Var.b(obj, uv4Var);
                    z15.e(1);
                }
                return yq4.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                C0190a c0190a;
                Object obj;
                int i;
                Object obj2;
                qi5 qi5Var;
                if (uv4Var instanceof C0190a) {
                    c0190a = (C0190a) uv4Var;
                    int i2 = c0190a.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0190a.w = i2 - Integer.MIN_VALUE;
                        obj = c0190a.v;
                        Object h = gw4.h();
                        i = c0190a.w;
                        if (i != 0) {
                            rp4.n(obj);
                            qi5 qi5Var2 = this.s;
                            j05 j05Var = this.t;
                            c0190a.y = t;
                            c0190a.z = qi5Var2;
                            c0190a.w = 1;
                            Object w3 = j05Var.w3(t, c0190a);
                            if (w3 == h) {
                                return h;
                            }
                            obj2 = t;
                            qi5Var = qi5Var2;
                            obj = w3;
                        } else if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            rp4.n(obj);
                            return yq4.a;
                        } else {
                            qi5Var = (qi5) c0190a.z;
                            obj2 = c0190a.y;
                            rp4.n(obj);
                        }
                        if (((Boolean) obj).booleanValue()) {
                            c0190a.y = null;
                            c0190a.z = null;
                            c0190a.w = 2;
                            if (qi5Var.b(obj2, c0190a) == h) {
                                return h;
                            }
                        }
                        return yq4.a;
                    }
                }
                c0190a = new C0190a(uv4Var);
                obj = c0190a.v;
                Object h2 = gw4.h();
                i = c0190a.w;
                if (i != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                return yq4.a;
            }
        }

        public a(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a = this.s.a(new b(qi5Var, this.t), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new C0189a(uv4Var);
            z15.e(5);
            pi5 pi5Var = this.s;
            b bVar = new b(qi5Var, this.t);
            z15.e(0);
            pi5Var.a(bVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b implements pi5<Object> {
        public final /* synthetic */ pi5 s;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            public a(uv4 uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: com.p7700g.p99005.hj5$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0191b<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
            /* renamed from: com.p7700g.p99005.hj5$b$b$a */
            /* loaded from: classes3.dex */
            public static final class a extends kw4 {
                public /* synthetic */ Object v;
                public int w;
                public Object x;
                public Object y;

                public a(uv4 uv4Var) {
                    super(uv4Var);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.v = obj;
                    this.w |= Integer.MIN_VALUE;
                    return C0191b.this.b(null, this);
                }
            }

            public C0191b(qi5 qi5Var) {
                this.s = qi5Var;
            }

            @Nullable
            public final Object a(Object obj, @NotNull uv4 uv4Var) {
                z15.e(4);
                new a(uv4Var);
                z15.e(5);
                qi5 qi5Var = this.s;
                c25.y(3, "R");
                if (obj instanceof Object) {
                    z15.e(0);
                    qi5Var.b(obj, uv4Var);
                    z15.e(1);
                }
                return yq4.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(Object obj, @NotNull uv4 uv4Var) {
                a aVar;
                int i;
                if (uv4Var instanceof a) {
                    aVar = (a) uv4Var;
                    int i2 = aVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.w = i2 - Integer.MIN_VALUE;
                        Object obj2 = aVar.v;
                        Object h = gw4.h();
                        i = aVar.w;
                        if (i != 0) {
                            rp4.n(obj2);
                            qi5 qi5Var = this.s;
                            c25.y(3, "R");
                            if (obj instanceof Object) {
                                aVar.w = 1;
                                if (qi5Var.b(obj, aVar) == h) {
                                    return h;
                                }
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            rp4.n(obj2);
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
                return yq4.a;
            }
        }

        public b(pi5 pi5Var) {
            this.s = pi5Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super Object> qi5Var, @NotNull uv4 uv4Var) {
            pi5 pi5Var = this.s;
            c25.w();
            Object a2 = pi5Var.a(new C0191b(qi5Var), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5 pi5Var = this.s;
            c25.w();
            C0191b c0191b = new C0191b(qi5Var);
            z15.e(0);
            pi5Var.a(c0191b, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class c implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

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

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;
            public final /* synthetic */ j05 t;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
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
                    return b.this.b(null, this);
                }
            }

            public b(qi5 qi5Var, j05 j05Var) {
                this.s = qi5Var;
                this.t = j05Var;
            }

            @Nullable
            public final Object a(Object obj, @NotNull uv4 uv4Var) {
                z15.e(4);
                new a(uv4Var);
                z15.e(5);
                qi5 qi5Var = this.s;
                if (!((Boolean) this.t.w3(obj, uv4Var)).booleanValue()) {
                    z15.e(0);
                    qi5Var.b(obj, uv4Var);
                    z15.e(1);
                }
                return yq4.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                a aVar;
                Object obj;
                int i;
                Object obj2;
                qi5 qi5Var;
                if (uv4Var instanceof a) {
                    aVar = (a) uv4Var;
                    int i2 = aVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.w = i2 - Integer.MIN_VALUE;
                        obj = aVar.v;
                        Object h = gw4.h();
                        i = aVar.w;
                        if (i != 0) {
                            rp4.n(obj);
                            qi5 qi5Var2 = this.s;
                            j05 j05Var = this.t;
                            aVar.y = t;
                            aVar.z = qi5Var2;
                            aVar.w = 1;
                            Object w3 = j05Var.w3(t, aVar);
                            if (w3 == h) {
                                return h;
                            }
                            obj2 = t;
                            qi5Var = qi5Var2;
                            obj = w3;
                        } else if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            rp4.n(obj);
                            return yq4.a;
                        } else {
                            qi5Var = (qi5) aVar.z;
                            obj2 = aVar.y;
                            rp4.n(obj);
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.y = null;
                            aVar.z = null;
                            aVar.w = 2;
                            if (qi5Var.b(obj2, aVar) == h) {
                                return h;
                            }
                        }
                        return yq4.a;
                    }
                }
                aVar = new a(uv4Var);
                obj = aVar.v;
                Object h2 = gw4.h();
                i = aVar.w;
                if (i != 0) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return yq4.a;
            }
        }

        public c(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = this.s.a(new b(qi5Var, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5 pi5Var = this.s;
            b bVar = new b(qi5Var, this.t);
            z15.e(0);
            pi5Var.a(bVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements pi5<T> {
        public final /* synthetic */ pi5 s;

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.hj5$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0192a extends kw4 {
                public /* synthetic */ Object v;
                public int w;

                public C0192a(uv4 uv4Var) {
                    super(uv4Var);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.v = obj;
                    this.w |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(qi5 qi5Var) {
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
                C0192a c0192a;
                int i;
                if (uv4Var instanceof C0192a) {
                    c0192a = (C0192a) uv4Var;
                    int i2 = c0192a.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0192a.w = i2 - Integer.MIN_VALUE;
                        Object obj = c0192a.v;
                        Object h = gw4.h();
                        i = c0192a.w;
                        if (i != 0) {
                            rp4.n(obj);
                            qi5 qi5Var = this.s;
                            if (t != null) {
                                c0192a.w = 1;
                                if (qi5Var.b(t, c0192a) == h) {
                                    return h;
                                }
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            rp4.n(obj);
                        }
                        return yq4.a;
                    }
                }
                c0192a = new C0192a(uv4Var);
                Object obj2 = c0192a.v;
                Object h2 = gw4.h();
                i = c0192a.w;
                if (i != 0) {
                }
                return yq4.a;
            }
        }

        public d(pi5 pi5Var) {
            this.s = pi5Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = this.s.a(new a(qi5Var), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class e implements pi5<R> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

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

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;
            public final /* synthetic */ j05 t;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
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
                    return b.this.b(null, this);
                }
            }

            public b(qi5 qi5Var, j05 j05Var) {
                this.s = qi5Var;
                this.t = j05Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull uv4 uv4Var) {
                z15.e(4);
                new a(uv4Var);
                z15.e(5);
                qi5 qi5Var = this.s;
                Object w3 = this.t.w3(obj, uv4Var);
                z15.e(0);
                qi5Var.b(w3, uv4Var);
                z15.e(1);
                return yq4.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                a aVar;
                Object obj;
                Object h;
                int i;
                qi5 qi5Var;
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
                            qi5 qi5Var2 = this.s;
                            j05 j05Var = this.t;
                            aVar.y = qi5Var2;
                            aVar.w = 1;
                            Object w3 = j05Var.w3(t, aVar);
                            if (w3 == h) {
                                return h;
                            }
                            obj = w3;
                            qi5Var = qi5Var2;
                        } else if (i != 1) {
                            if (i == 2) {
                                rp4.n(obj);
                                return yq4.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            qi5Var = (qi5) aVar.y;
                            rp4.n(obj);
                        }
                        aVar.y = null;
                        aVar.w = 2;
                        if (qi5Var.b(obj, aVar) == h) {
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
                if (qi5Var.b(obj, aVar) == h) {
                }
                return yq4.a;
            }
        }

        public e(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = this.s.a(new b(qi5Var, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5 pi5Var = this.s;
            b bVar = new b(qi5Var, this.t);
            z15.e(0);
            pi5Var.a(bVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class f implements pi5<R> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

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

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;
            public final /* synthetic */ j05 t;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
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
                    return b.this.b(null, this);
                }
            }

            public b(qi5 qi5Var, j05 j05Var) {
                this.s = qi5Var;
                this.t = j05Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull uv4 uv4Var) {
                z15.e(4);
                new a(uv4Var);
                z15.e(5);
                qi5 qi5Var = this.s;
                Object w3 = this.t.w3(obj, uv4Var);
                if (w3 != null) {
                    z15.e(0);
                    qi5Var.b(w3, uv4Var);
                    z15.e(1);
                }
                return yq4.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                a aVar;
                Object obj;
                int i;
                qi5 qi5Var;
                if (uv4Var instanceof a) {
                    aVar = (a) uv4Var;
                    int i2 = aVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.w = i2 - Integer.MIN_VALUE;
                        obj = aVar.v;
                        Object h = gw4.h();
                        i = aVar.w;
                        if (i != 0) {
                            rp4.n(obj);
                            qi5 qi5Var2 = this.s;
                            j05 j05Var = this.t;
                            aVar.y = qi5Var2;
                            aVar.w = 1;
                            Object w3 = j05Var.w3(t, aVar);
                            if (w3 == h) {
                                return h;
                            }
                            obj = w3;
                            qi5Var = qi5Var2;
                        } else if (i != 1) {
                            if (i == 2) {
                                rp4.n(obj);
                                return yq4.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            qi5Var = (qi5) aVar.y;
                            rp4.n(obj);
                        }
                        if (obj != null) {
                            aVar.y = null;
                            aVar.w = 2;
                            if (qi5Var.b(obj, aVar) == h) {
                                return h;
                            }
                        }
                        return yq4.a;
                    }
                }
                aVar = new a(uv4Var);
                obj = aVar.v;
                Object h2 = gw4.h();
                i = aVar.w;
                if (i != 0) {
                }
                if (obj != null) {
                }
                return yq4.a;
            }
        }

        public f(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = this.s.a(new b(qi5Var, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5 pi5Var = this.s;
            b bVar = new b(qi5Var, this.t);
            z15.e(0);
            pi5Var.a(bVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: Emitters.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a<T> implements qi5, uw4 {
            public final /* synthetic */ qi5 s;
            public final /* synthetic */ j05 t;

            /* compiled from: Emitters.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.hj5$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0193a extends kw4 {
                public /* synthetic */ Object v;
                public int w;
                public Object y;
                public Object z;

                public C0193a(uv4 uv4Var) {
                    super(uv4Var);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.v = obj;
                    this.w |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(qi5 qi5Var, j05 j05Var) {
                this.s = qi5Var;
                this.t = j05Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                C0193a c0193a;
                Object h;
                int i;
                Object obj;
                qi5 qi5Var;
                if (uv4Var instanceof C0193a) {
                    c0193a = (C0193a) uv4Var;
                    int i2 = c0193a.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0193a.w = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0193a.v;
                        h = gw4.h();
                        i = c0193a.w;
                        if (i != 0) {
                            rp4.n(obj2);
                            qi5 qi5Var2 = this.s;
                            j05 j05Var = this.t;
                            c0193a.y = t;
                            c0193a.z = qi5Var2;
                            c0193a.w = 1;
                            z15.e(6);
                            Object w3 = j05Var.w3(t, c0193a);
                            z15.e(7);
                            if (w3 == h) {
                                return h;
                            }
                            obj = t;
                            qi5Var = qi5Var2;
                        } else if (i != 1) {
                            if (i == 2) {
                                rp4.n(obj2);
                                return yq4.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            qi5Var = (qi5) c0193a.z;
                            obj = c0193a.y;
                            rp4.n(obj2);
                        }
                        c0193a.y = null;
                        c0193a.z = null;
                        c0193a.w = 2;
                        if (qi5Var.b(obj, c0193a) == h) {
                            return h;
                        }
                        return yq4.a;
                    }
                }
                c0193a = new C0193a(uv4Var);
                Object obj22 = c0193a.v;
                h = gw4.h();
                i = c0193a.w;
                if (i != 0) {
                }
                c0193a.y = null;
                c0193a.z = null;
                c0193a.w = 2;
                if (qi5Var.b(obj, c0193a) == h) {
                }
                return yq4.a;
            }
        }

        public g(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = this.s.a(new a(qi5Var, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements pi5<R> {
        public final /* synthetic */ Object s;
        public final /* synthetic */ pi5 t;
        public final /* synthetic */ k05 u;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object A;
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

        public h(Object obj, pi5 pi5Var, k05 k05Var) {
            this.s = obj;
            this.t = pi5Var;
            this.u = k05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object h;
            int i;
            h hVar;
            qi5 qi5Var2;
            b35.h hVar2;
            pi5 pi5Var;
            i iVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    h = gw4.h();
                    i = aVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        b35.h hVar3 = new b35.h();
                        ?? r2 = this.s;
                        hVar3.s = r2;
                        aVar.y = this;
                        aVar.z = qi5Var;
                        aVar.A = hVar3;
                        aVar.w = 1;
                        if (qi5Var.b(r2, aVar) == h) {
                            return h;
                        }
                        hVar = this;
                        qi5Var2 = qi5Var;
                        hVar2 = hVar3;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(obj);
                        return yq4.a;
                    } else {
                        hVar2 = (b35.h) aVar.A;
                        qi5Var2 = (qi5) aVar.z;
                        hVar = (h) aVar.y;
                        rp4.n(obj);
                    }
                    pi5Var = hVar.t;
                    iVar = new i(hVar2, hVar.u, qi5Var2);
                    aVar.y = null;
                    aVar.z = null;
                    aVar.A = null;
                    aVar.w = 2;
                    if (pi5Var.a(iVar, aVar) == h) {
                        return h;
                    }
                    return yq4.a;
                }
            }
            aVar = new a(uv4Var);
            Object obj2 = aVar.v;
            h = gw4.h();
            i = aVar.w;
            if (i != 0) {
            }
            pi5Var = hVar.t;
            iVar = new i(hVar2, hVar.u, qi5Var2);
            aVar.y = null;
            aVar.z = null;
            aVar.A = null;
            aVar.w = 2;
            if (pi5Var.a(iVar, aVar) == h) {
            }
            return yq4.a;
        }
    }

    /* compiled from: Transform.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<R> s;
        public final /* synthetic */ k05<R, T, uv4<? super R>, Object> t;
        public final /* synthetic */ qi5<R> u;

        /* compiled from: Transform.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {103, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public Object w;
            public /* synthetic */ Object x;
            public final /* synthetic */ i<T> y;
            public int z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.y = iVar;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.x = obj;
                this.z |= Integer.MIN_VALUE;
                return this.y.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(b35.h<R> hVar, k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var, qi5<? super R> qi5Var) {
            this.s = hVar;
            this.t = k05Var;
            this.u = qi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object h;
            int i;
            i<T> iVar;
            b35.h hVar;
            qi5<R> qi5Var;
            T t2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    T t3 = (T) aVar.x;
                    h = gw4.h();
                    i = aVar.z;
                    if (i != 0) {
                        rp4.n(t3);
                        b35.h hVar2 = this.s;
                        k05<R, T, uv4<? super R>, Object> k05Var = this.t;
                        T t4 = hVar2.s;
                        aVar.v = this;
                        aVar.w = hVar2;
                        aVar.z = 1;
                        Object I = k05Var.I(t4, t, aVar);
                        if (I == h) {
                            return h;
                        }
                        iVar = this;
                        t3 = (T) I;
                        hVar = hVar2;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(t3);
                        return yq4.a;
                    } else {
                        hVar = (b35.h) aVar.w;
                        iVar = (i) aVar.v;
                        rp4.n(t3);
                    }
                    hVar.s = t3;
                    qi5Var = iVar.u;
                    t2 = iVar.s.s;
                    aVar.v = null;
                    aVar.w = null;
                    aVar.z = 2;
                    if (qi5Var.b(t2, aVar) == h) {
                        return h;
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            T t32 = (T) aVar.x;
            h = gw4.h();
            i = aVar.z;
            if (i != 0) {
            }
            hVar.s = t32;
            qi5Var = iVar.u;
            t2 = iVar.s.s;
            aVar.v = null;
            aVar.w = null;
            aVar.z = 2;
            if (qi5Var.b(t2, aVar) == h) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ k05 t;

        public j(pi5 pi5Var, k05 k05Var) {
            this.s = pi5Var;
            this.t = k05Var;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, com.p7700g.p99005.an5] */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            b35.h hVar = new b35.h();
            hVar.s = bl5.a;
            Object a = this.s.a(new k(hVar, this.t, qi5Var), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: Transform.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k<T> implements qi5, uw4 {
        public final /* synthetic */ b35.h<Object> s;
        public final /* synthetic */ k05<T, T, uv4<? super T>, Object> t;
        public final /* synthetic */ qi5<T> u;

        /* compiled from: Transform.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public Object w;
            public /* synthetic */ Object x;
            public final /* synthetic */ k<T> y;
            public int z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k<? super T> kVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.y = kVar;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.x = obj;
                this.z |= Integer.MIN_VALUE;
                return this.y.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(b35.h<Object> hVar, k05<? super T, ? super T, ? super uv4<? super T>, ? extends Object> k05Var, qi5<? super T> qi5Var) {
            this.s = hVar;
            this.t = k05Var;
            this.u = qi5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object h;
            int i;
            b35.h<Object> hVar;
            k<T> kVar;
            b35.h<Object> hVar2;
            qi5<T> qi5Var;
            T t2;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.x;
                    h = gw4.h();
                    i = aVar.z;
                    if (i != 0) {
                        rp4.n(obj);
                        hVar = this.s;
                        Object obj2 = hVar.s;
                        if (obj2 != bl5.a) {
                            aVar.v = this;
                            aVar.w = hVar;
                            aVar.z = 1;
                            Object I = ((k05<T, T, uv4<? super T>, Object>) this.t).I(obj2, t, aVar);
                            if (I == h) {
                                return h;
                            }
                            kVar = this;
                            obj = I;
                            hVar2 = hVar;
                        } else {
                            kVar = this;
                            hVar.s = t;
                            qi5Var = kVar.u;
                            t2 = kVar.s.s;
                            aVar.v = null;
                            aVar.w = null;
                            aVar.z = 2;
                            if (qi5Var.b(t2, aVar) == h) {
                                return h;
                            }
                            return yq4.a;
                        }
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rp4.n(obj);
                        return yq4.a;
                    } else {
                        hVar2 = (b35.h) aVar.w;
                        kVar = (k) aVar.v;
                        rp4.n(obj);
                    }
                    T t3 = obj;
                    hVar = hVar2;
                    t = t3;
                    hVar.s = t;
                    qi5Var = kVar.u;
                    t2 = kVar.s.s;
                    aVar.v = null;
                    aVar.w = null;
                    aVar.z = 2;
                    if (qi5Var.b(t2, aVar) == h) {
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            Object obj3 = aVar.x;
            h = gw4.h();
            i = aVar.z;
            if (i != 0) {
            }
            T t32 = obj3;
            hVar = hVar2;
            t = t32;
            hVar.s = t;
            qi5Var = kVar.u;
            t2 = kVar.s.s;
            aVar.v = null;
            aVar.w = null;
            aVar.z = 2;
            if (qi5Var.b(t2, aVar) == h) {
            }
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l implements pi5<ct4<? extends T>> {
        public final /* synthetic */ pi5 s;

        public l(pi5 pi5Var) {
            this.s = pi5Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super ct4<? extends T>> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object a = this.s.a(new m(qi5Var, new b35.f()), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: Transform.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m<T> implements qi5, uw4 {
        public final /* synthetic */ qi5<ct4<? extends T>> s;
        public final /* synthetic */ b35.f t;

        /* compiled from: Transform.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public final /* synthetic */ m<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super T> mVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.w = mVar;
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
        public m(qi5<? super ct4<? extends T>> qi5Var, b35.f fVar) {
            this.s = qi5Var;
            this.t = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.x = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.v;
                    Object h = gw4.h();
                    i = aVar.x;
                    if (i != 0) {
                        rp4.n(obj);
                        qi5<ct4<? extends T>> qi5Var = this.s;
                        b35.f fVar = this.t;
                        int i3 = fVar.s;
                        fVar.s = i3 + 1;
                        if (i3 < 0) {
                            throw new ArithmeticException("Index overflow has happened");
                        }
                        ct4<? extends T> ct4Var = new ct4<>(i3, t);
                        aVar.x = 1;
                        if (qi5Var.b(ct4Var, aVar) == h) {
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
            aVar = new a(this, uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.x;
            if (i != 0) {
            }
            return yq4.a;
        }
    }

    @NotNull
    public static final <T> pi5<T> a(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return new a(pi5Var, j05Var);
    }

    public static final /* synthetic */ <R> pi5<R> b(pi5<?> pi5Var) {
        c25.w();
        return new b(pi5Var);
    }

    @NotNull
    public static final <T> pi5<T> c(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return new c(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> d(@NotNull pi5<? extends T> pi5Var) {
        return new d(pi5Var);
    }

    @NotNull
    public static final <T, R> pi5<R> e(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        return new e(pi5Var, j05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> f(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        return new f(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return new g(pi5Var, j05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> h(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        return new h(r, pi5Var, k05Var);
    }

    @NotNull
    public static final <T> pi5<T> i(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super T, ? super T, ? super uv4<? super T>, ? extends Object> k05Var) {
        return new j(pi5Var, k05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> j(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ri5.y1(pi5Var, r, k05Var);
    }

    @NotNull
    public static final <T> pi5<ct4<T>> k(@NotNull pi5<? extends T> pi5Var) {
        return new l(pi5Var);
    }
}