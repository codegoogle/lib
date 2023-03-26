package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "concurrency", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "additionalToStringProps", "", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class nk5<T> extends lk5<T> {
    @NotNull
    private final pi5<pi5<T>> v;
    private final int w;

    /* compiled from: Merge.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements qi5, uw4 {
        public final /* synthetic */ ee5 s;
        public final /* synthetic */ yo5 t;
        public final /* synthetic */ hh5<T> u;
        public final /* synthetic */ fl5<T> v;

        /* compiled from: Merge.kt */
        @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.nk5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0222a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
            public int w;
            public final /* synthetic */ pi5<T> x;
            public final /* synthetic */ fl5<T> y;
            public final /* synthetic */ yo5 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0222a(pi5<? extends T> pi5Var, fl5<T> fl5Var, yo5 yo5Var, uv4<? super C0222a> uv4Var) {
                super(2, uv4Var);
                this.x = pi5Var;
                this.y = fl5Var;
                this.z = yo5Var;
            }

            @Override // com.p7700g.p99005.j05
            @Nullable
            /* renamed from: C3 */
            public final Object w3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
                return ((C0222a) X(lc5Var, uv4Var)).D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                try {
                    if (i == 0) {
                        rp4.n(obj);
                        pi5<T> pi5Var = this.x;
                        fl5<T> fl5Var = this.y;
                        this.w = 1;
                        if (pi5Var.a(fl5Var, this) == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                    }
                    this.z.release();
                    return yq4.a;
                } catch (Throwable th) {
                    this.z.release();
                    throw th;
                }
            }

            @Override // com.p7700g.p99005.hw4
            @NotNull
            public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                return new C0222a(this.x, this.y, this.z, uv4Var);
            }
        }

        /* compiled from: Merge.kt */
        @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends kw4 {
            public Object v;
            public Object w;
            public /* synthetic */ Object x;
            public final /* synthetic */ a<T> y;
            public int z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, uv4<? super b> uv4Var) {
                super(uv4Var);
                this.y = aVar;
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
        public a(ee5 ee5Var, yo5 yo5Var, hh5<? super T> hh5Var, fl5<T> fl5Var) {
            this.s = ee5Var;
            this.t = yo5Var;
            this.u = hh5Var;
            this.v = fl5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super yq4> uv4Var) {
            b bVar;
            int i;
            a<T> aVar;
            if (uv4Var instanceof b) {
                bVar = (b) uv4Var;
                int i2 = bVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.z = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.x;
                    Object h = gw4.h();
                    i = bVar.z;
                    if (i != 0) {
                        rp4.n(obj);
                        ee5 ee5Var = this.s;
                        if (ee5Var != null) {
                            ie5.A(ee5Var);
                        }
                        yo5 yo5Var = this.t;
                        bVar.v = this;
                        bVar.w = pi5Var;
                        bVar.z = 1;
                        if (yo5Var.b(bVar) == h) {
                            return h;
                        }
                        aVar = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        pi5Var = (pi5) bVar.w;
                        aVar = (a) bVar.v;
                        rp4.n(obj);
                    }
                    bb5.f(aVar.u, null, null, new C0222a(pi5Var, aVar.v, aVar.t, null), 3, null);
                    return yq4.a;
                }
            }
            bVar = new b(this, uv4Var);
            Object obj2 = bVar.x;
            Object h2 = gw4.h();
            i = bVar.z;
            if (i != 0) {
            }
            bb5.f(aVar.u, null, null, new C0222a(pi5Var, aVar.v, aVar.t, null), 3, null);
            return yq4.a;
        }
    }

    public /* synthetic */ nk5(pi5 pi5Var, int i, xv4 xv4Var, int i2, ng5 ng5Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(pi5Var, i, (i3 & 4) != 0 ? zv4.s : xv4Var, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? ng5.SUSPEND : ng5Var);
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public String e() {
        return c25.C("concurrency=", Integer.valueOf(this.w));
    }

    @Override // com.p7700g.p99005.lk5
    @Nullable
    public Object g(@NotNull hh5<? super T> hh5Var, @NotNull uv4<? super yq4> uv4Var) {
        Object a2 = this.v.a(new a((ee5) uv4Var.getContext().get(ee5.m0), ap5.b(this.w, 0, 2, null), hh5Var, new fl5(hh5Var)), uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public lk5<T> h(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return new nk5(this.v, this.w, xv4Var, i, ng5Var);
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public jh5<T> l(@NotNull lc5 lc5Var) {
        return fh5.c(lc5Var, this.s, this.t, j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nk5(@NotNull pi5<? extends pi5<? extends T>> pi5Var, int i, @NotNull xv4 xv4Var, int i2, @NotNull ng5 ng5Var) {
        super(xv4Var, i2, ng5Var);
        this.v = pi5Var;
        this.w = i;
    }
}