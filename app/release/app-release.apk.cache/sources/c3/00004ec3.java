package com.p7700g.p99005;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@vo4(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0016J&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001c\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R9\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity$kotlinx_coroutines_core", "()I", "additionalToStringProps", "", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public abstract class lk5<T> implements yk5<T> {
    @cz4
    @NotNull
    public final xv4 s;
    @cz4
    public final int t;
    @cz4
    @NotNull
    public final ng5 u;

    /* compiled from: ChannelFlow.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ qi5<T> y;
        public final /* synthetic */ lk5<T> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qi5<? super T> qi5Var, lk5<T> lk5Var, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.y = qi5Var;
            this.z = lk5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                qi5<T> qi5Var = this.y;
                jh5<T> l = this.z.l((lc5) this.x);
                this.w = 1;
                if (ri5.l0(qi5Var, l, this) == h) {
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
    }

    /* compiled from: ChannelFlow.kt */
    @mw4(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends vw4 implements j05<hh5<? super T>, uv4<? super yq4>, Object> {
        public int w;
        public /* synthetic */ Object x;
        public final /* synthetic */ lk5<T> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lk5<T> lk5Var, uv4<? super b> uv4Var) {
            super(2, uv4Var);
            this.y = lk5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super T> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((b) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                lk5<T> lk5Var = this.y;
                this.w = 1;
                if (lk5Var.g((hh5) this.x, this) == h) {
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
            b bVar = new b(this.y, uv4Var);
            bVar.x = obj;
            return bVar;
        }
    }

    public lk5(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        this.s = xv4Var;
        this.t = i;
        this.u = ng5Var;
    }

    public static /* synthetic */ Object f(lk5 lk5Var, qi5 qi5Var, uv4 uv4Var) {
        Object g = mc5.g(new a(qi5Var, lk5Var, null), uv4Var);
        return g == gw4.h() ? g : yq4.a;
    }

    @Override // com.p7700g.p99005.pi5
    @Nullable
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        return f(this, qi5Var, uv4Var);
    }

    @Override // com.p7700g.p99005.yk5
    @NotNull
    public pi5<T> d(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        xv4 plus = xv4Var.plus(this.s);
        if (ng5Var == ng5.SUSPEND) {
            int i2 = this.t;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            ng5Var = this.u;
        }
        return (c25.g(plus, this.s) && i == this.t && ng5Var == this.u) ? this : h(plus, i, ng5Var);
    }

    @Nullable
    public String e() {
        return null;
    }

    @Nullable
    public abstract Object g(@NotNull hh5<? super T> hh5Var, @NotNull uv4<? super yq4> uv4Var);

    @NotNull
    public abstract lk5<T> h(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var);

    @Nullable
    public pi5<T> i() {
        return null;
    }

    @NotNull
    public final j05<hh5<? super T>, uv4<? super yq4>, Object> j() {
        return new b(this, null);
    }

    public final int k() {
        int i = this.t;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @NotNull
    public jh5<T> l(@NotNull lc5 lc5Var) {
        return fh5.h(lc5Var, this.s, k(), this.u, nc5.ATOMIC, null, j(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        xv4 xv4Var = this.s;
        if (xv4Var != zv4.s) {
            arrayList.add(c25.C("context=", xv4Var));
        }
        int i = this.t;
        if (i != -3) {
            arrayList.add(c25.C("capacity=", Integer.valueOf(i)));
        }
        ng5 ng5Var = this.u;
        if (ng5Var != ng5.SUSPEND) {
            arrayList.add(c25.C("onBufferOverflow=", ng5Var));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(qc5.a(this));
        sb.append(f14.u);
        return wo1.B(sb, rs4.h3(arrayList, ", ", null, null, 0, null, null, 62, null), f14.v);
    }
}