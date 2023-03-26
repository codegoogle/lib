package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.b35;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.WKSRecord;

/* compiled from: Limit.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000323\b\u0004\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\b\u001a\u0002H\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001ap\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\u0001\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u0013\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001b¢\u0006\u0002\b\u001cø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"collectWhile", "", "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drop", NewHtcHomeBadger.d, "", "dropWhile", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "Lkotlinx/coroutines/flow/FlowCollector;", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "transformWhile", "R", "transform", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class cj5 {

    /* compiled from: Limit.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {WKSRecord.Service.NETBIOS_NS}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return cj5.b(null, null, this);
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b implements qi5<T> {
        public final /* synthetic */ j05<T, uv4<? super Boolean>, Object> s;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {WKSRecord.Service.CISCO_TNA}, m = "emit", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public int y;

            public a(uv4<? super a> uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.w = obj;
                this.y |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
            this.s = j05Var;
        }

        @Nullable
        public Object a(T t, @NotNull uv4<? super yq4> uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            if (((Boolean) this.s.w3(t, uv4Var)).booleanValue()) {
                return yq4.a;
            }
            throw new hk5(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object obj;
            int i;
            b bVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.y = i2 - Integer.MIN_VALUE;
                    obj = aVar.w;
                    Object h = gw4.h();
                    i = aVar.y;
                    if (i != 0) {
                        rp4.n(obj);
                        j05<T, uv4<? super Boolean>, Object> j05Var = this.s;
                        aVar.v = this;
                        aVar.y = 1;
                        obj = j05Var.w3(t, aVar);
                        if (obj == h) {
                            return h;
                        }
                        bVar = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        bVar = (b) aVar.v;
                        rp4.n(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return yq4.a;
                    }
                    throw new hk5(bVar);
                }
            }
            aVar = new a(uv4Var);
            obj = aVar.w;
            Object h2 = gw4.h();
            i = aVar.y;
            if (i != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ int t;

        public c(pi5 pi5Var, int i) {
            this.s = pi5Var;
            this.t = i;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object a = this.s.a(new d(new b35.f(), this.t, qi5Var), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<T> implements qi5, uw4 {
        public final /* synthetic */ b35.f s;
        public final /* synthetic */ int t;
        public final /* synthetic */ qi5<T> u;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public final /* synthetic */ d<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.w = dVar;
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
        public d(b35.f fVar, int i, qi5<? super T> qi5Var) {
            this.s = fVar;
            this.t = i;
            this.u = qi5Var;
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
                        b35.f fVar = this.s;
                        int i3 = fVar.s;
                        if (i3 < this.t) {
                            fVar.s = i3 + 1;
                            return yq4.a;
                        }
                        qi5<T> qi5Var = this.u;
                        aVar.x = 1;
                        if (qi5Var.b(t, aVar) == h) {
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

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        public e(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object a = this.s.a(new f(new b35.a(), qi5Var, this.t), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f<T> implements qi5, uw4 {
        public final /* synthetic */ b35.a s;
        public final /* synthetic */ qi5<T> t;
        public final /* synthetic */ j05<T, uv4<? super Boolean>, Object> u;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public Object w;
            public /* synthetic */ Object x;
            public final /* synthetic */ f<T> y;
            public int z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.y = fVar;
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
        public f(b35.a aVar, qi5<? super T> qi5Var, j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
            this.s = aVar;
            this.t = qi5Var;
            this.u = j05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            f<T> fVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.x;
                    Object h = gw4.h();
                    i = aVar.z;
                    if (i != 0) {
                        rp4.n(obj);
                        if (this.s.s) {
                            qi5<T> qi5Var = this.t;
                            aVar.z = 1;
                            if (qi5Var.b(t, aVar) == h) {
                                return h;
                            }
                            return yq4.a;
                        }
                        j05<T, uv4<? super Boolean>, Object> j05Var = this.u;
                        aVar.v = this;
                        aVar.w = t;
                        aVar.z = 2;
                        obj = j05Var.w3(t, aVar);
                        if (obj == h) {
                            return h;
                        }
                        fVar = this;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else if (i == 1) {
                        rp4.n(obj);
                        return yq4.a;
                    } else if (i == 2) {
                        t = (T) aVar.w;
                        fVar = (f) aVar.v;
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return yq4.a;
                        }
                        fVar.s.s = true;
                        aVar.v = null;
                        aVar.w = null;
                        aVar.z = 3;
                        if (fVar.t.b(t, aVar) == h) {
                            return h;
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            Object obj2 = aVar.x;
            Object h2 = gw4.h();
            i = aVar.z;
            if (i != 0) {
            }
            return yq4.a;
        }
    }

    /* compiled from: Limit.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public g(uv4<? super g> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return cj5.f(null, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ int t;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
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
                return h.this.a(null, this);
            }
        }

        public h(pi5 pi5Var, int i) {
            this.s = pi5Var;
            this.t = i;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            com.p7700g.p99005.xk5.b(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Type inference failed for: r7v0, types: [com.p7700g.p99005.qi5, com.p7700g.p99005.qi5<? super T>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [com.p7700g.p99005.qi5] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
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
                        b35.f fVar = new b35.f();
                        pi5 pi5Var = this.s;
                        i iVar = new i(fVar, this.t, qi5Var);
                        aVar.y = qi5Var;
                        aVar.w = 1;
                        Object a2 = pi5Var.a(iVar, aVar);
                        qi5Var = a2;
                        if (a2 == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        qi5 qi5Var2 = (qi5) aVar.y;
                        rp4.n(obj);
                        qi5Var = qi5Var2;
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
            return yq4.a;
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i<T> implements qi5, uw4 {
        public final /* synthetic */ b35.f s;
        public final /* synthetic */ int t;
        public final /* synthetic */ qi5<T> u;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public final /* synthetic */ i<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.w = iVar;
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
        public i(b35.f fVar, int i, qi5<? super T> qi5Var) {
            this.s = fVar;
            this.t = i;
            this.u = qi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
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
                    if (i == 0) {
                        if (i == 1) {
                            rp4.n(obj);
                            return yq4.a;
                        } else if (i == 2) {
                            rp4.n(obj);
                            return yq4.a;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    rp4.n(obj);
                    b35.f fVar = this.s;
                    int i3 = fVar.s + 1;
                    fVar.s = i3;
                    if (i3 >= this.t) {
                        qi5<T> qi5Var = this.u;
                        aVar.x = 2;
                        if (cj5.f(qi5Var, t, aVar) == h) {
                            return h;
                        }
                        return yq4.a;
                    }
                    qi5<T> qi5Var2 = this.u;
                    aVar.x = 1;
                    if (qi5Var2.b(t, aVar) == h) {
                        return h;
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            Object obj2 = aVar.v;
            Object h2 = gw4.h();
            i = aVar.x;
            if (i == 0) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements pi5<T> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
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
                return j.this.a(null, this);
            }
        }

        public j(pi5 pi5Var, j05 j05Var) {
            this.s = pi5Var;
            this.t = j05Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // com.p7700g.p99005.pi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            k kVar;
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
                        pi5 pi5Var = this.s;
                        k kVar2 = new k(this.t, qi5Var);
                        try {
                            aVar.y = kVar2;
                            aVar.w = 1;
                            if (pi5Var.a(kVar2, aVar) == h) {
                                return h;
                            }
                        } catch (hk5 e) {
                            e = e;
                            kVar = kVar2;
                            xk5.b(e, kVar);
                            return yq4.a;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        kVar = (k) aVar.y;
                        try {
                            rp4.n(obj);
                        } catch (hk5 e2) {
                            e = e2;
                            xk5.b(e, kVar);
                            return yq4.a;
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
            return yq4.a;
        }
    }

    /* compiled from: Limit.kt */
    @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k implements qi5<T> {
        public final /* synthetic */ j05 s;
        public final /* synthetic */ qi5 t;

        /* compiled from: Limit.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {143, 144}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
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
                return k.this.b(null, this);
            }
        }

        public k(j05 j05Var, qi5 qi5Var) {
            this.s = j05Var;
            this.t = qi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            int i;
            boolean z;
            Object obj;
            Object obj2;
            k kVar;
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.x = i2 - Integer.MIN_VALUE;
                    Object obj3 = aVar.w;
                    Object h = gw4.h();
                    i = aVar.x;
                    z = true;
                    if (i != 0) {
                        rp4.n(obj3);
                        j05 j05Var = this.s;
                        aVar.v = this;
                        aVar.z = t;
                        aVar.x = 1;
                        z15.e(6);
                        Object w3 = j05Var.w3(t, aVar);
                        z15.e(7);
                        if (w3 == h) {
                            return h;
                        }
                        obj = w3;
                        obj2 = t;
                        kVar = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            kVar = (k) aVar.v;
                            rp4.n(obj3);
                            if (z) {
                                return yq4.a;
                            }
                            throw new hk5(kVar);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        Object obj4 = aVar.z;
                        rp4.n(obj3);
                        obj2 = obj4;
                        kVar = (k) aVar.v;
                        obj = obj3;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        z = false;
                    } else {
                        qi5 qi5Var = kVar.t;
                        aVar.v = kVar;
                        aVar.z = null;
                        aVar.x = 2;
                        if (qi5Var.b(obj2, aVar) == h) {
                            return h;
                        }
                    }
                    if (z) {
                    }
                }
            }
            aVar = new a(uv4Var);
            Object obj32 = aVar.w;
            Object h2 = gw4.h();
            i = aVar.x;
            z = true;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            if (z) {
            }
        }
    }

    /* compiled from: Limit.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {153}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5<T> y;
        public final /* synthetic */ k05<qi5<? super R>, T, uv4<? super Boolean>, Object> z;

        /* compiled from: Limit.kt */
        @vo4(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements qi5<T> {
            public final /* synthetic */ k05 s;
            public final /* synthetic */ qi5 t;

            /* compiled from: Limit.kt */
            @mw4(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {143}, m = "emit", n = {"this"}, s = {"L$0"})
            @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.cj5$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0154a extends kw4 {
                public Object v;
                public /* synthetic */ Object w;
                public int x;

                public C0154a(uv4 uv4Var) {
                    super(uv4Var);
                }

                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    this.w = obj;
                    this.x |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(k05 k05Var, qi5 qi5Var) {
                this.s = k05Var;
                this.t = qi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
            @Override // com.p7700g.p99005.qi5
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
                C0154a c0154a;
                Object obj;
                int i;
                a aVar;
                if (uv4Var instanceof C0154a) {
                    c0154a = (C0154a) uv4Var;
                    int i2 = c0154a.x;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0154a.x = i2 - Integer.MIN_VALUE;
                        obj = c0154a.w;
                        Object h = gw4.h();
                        i = c0154a.x;
                        if (i != 0) {
                            rp4.n(obj);
                            k05 k05Var = this.s;
                            qi5 qi5Var = this.t;
                            c0154a.v = this;
                            c0154a.x = 1;
                            z15.e(6);
                            obj = k05Var.I(qi5Var, t, c0154a);
                            z15.e(7);
                            if (obj == h) {
                                return h;
                            }
                            aVar = this;
                        } else if (i == 1) {
                            aVar = (a) c0154a.v;
                            rp4.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            return yq4.a;
                        }
                        throw new hk5(aVar);
                    }
                }
                c0154a = new C0154a(uv4Var);
                obj = c0154a.w;
                Object h2 = gw4.h();
                i = c0154a.x;
                if (i != 0) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(pi5<? extends T> pi5Var, k05<? super qi5<? super R>, ? super T, ? super uv4<? super Boolean>, ? extends Object> k05Var, uv4<? super l> uv4Var) {
            super(2, uv4Var);
            this.y = pi5Var;
            this.z = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((l) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            a aVar;
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5<T> pi5Var = this.y;
                a aVar2 = new a(this.z, (qi5) this.x);
                try {
                    this.x = aVar2;
                    this.w = 1;
                    if (pi5Var.a(aVar2, this) == h) {
                        return h;
                    }
                } catch (hk5 e) {
                    e = e;
                    aVar = aVar2;
                    xk5.b(e, aVar);
                    return yq4.a;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                aVar = (a) this.x;
                try {
                    rp4.n(obj);
                } catch (hk5 e2) {
                    e = e2;
                    xk5.b(e, aVar);
                    return yq4.a;
                }
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            l lVar = new l(this.y, this.z, uv4Var);
            lVar.x = obj;
            return lVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        int i2;
        qi5<? super Object> qi5Var;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i3 = aVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.x = i3 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                Object h2 = gw4.h();
                i2 = aVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    qi5<? super Object> bVar = new b(j05Var);
                    try {
                        aVar.v = bVar;
                        aVar.x = 1;
                        if (pi5Var.a(bVar, aVar) == h2) {
                            return h2;
                        }
                    } catch (hk5 e2) {
                        e = e2;
                        qi5Var = bVar;
                        xk5.b(e, qi5Var);
                        return yq4.a;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (b) aVar.v;
                    try {
                        rp4.n(obj);
                    } catch (hk5 e3) {
                        e = e3;
                        xk5.b(e, qi5Var);
                        return yq4.a;
                    }
                }
                return yq4.a;
            }
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.w;
        Object h22 = gw4.h();
        i2 = aVar.x;
        if (i2 != 0) {
        }
        return yq4.a;
    }

    private static final <T> Object c(pi5<? extends T> pi5Var, j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super yq4> uv4Var) {
        b bVar = new b(j05Var);
        try {
            z15.e(0);
            pi5Var.a(bVar, uv4Var);
            z15.e(1);
        } catch (hk5 e2) {
            xk5.b(e2, bVar);
        }
        return yq4.a;
    }

    @NotNull
    public static final <T> pi5<T> d(@NotNull pi5<? extends T> pi5Var, int i2) {
        if (i2 >= 0) {
            return new c(pi5Var, i2);
        }
        throw new IllegalArgumentException(c25.C("Drop count should be non-negative, but had ", Integer.valueOf(i2)).toString());
    }

    @NotNull
    public static final <T> pi5<T> e(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return new e(pi5Var, j05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object f(qi5<? super T> qi5Var, T t, uv4<? super yq4> uv4Var) {
        g gVar;
        int i2;
        if (uv4Var instanceof g) {
            gVar = (g) uv4Var;
            int i3 = gVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.x = i3 - Integer.MIN_VALUE;
                Object obj = gVar.w;
                Object h2 = gw4.h();
                i2 = gVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    gVar.v = qi5Var;
                    gVar.x = 1;
                    if (qi5Var.b(t, gVar) == h2) {
                        return h2;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qi5Var = (qi5) gVar.v;
                    rp4.n(obj);
                }
                throw new hk5(qi5Var);
            }
        }
        gVar = new g(uv4Var);
        Object obj2 = gVar.w;
        Object h22 = gw4.h();
        i2 = gVar.x;
        if (i2 != 0) {
        }
        throw new hk5(qi5Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull pi5<? extends T> pi5Var, int i2) {
        if (i2 > 0) {
            return new h(pi5Var, i2);
        }
        throw new IllegalArgumentException(wo1.n("Requested element count ", i2, " should be positive").toString());
    }

    @NotNull
    public static final <T> pi5<T> h(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return new j(pi5Var, j05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> i(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super Boolean>, ? extends Object> k05Var) {
        return ri5.I0(new l(pi5Var, k05Var, null));
    }
}