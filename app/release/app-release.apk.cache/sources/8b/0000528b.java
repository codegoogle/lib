package com.p7700g.p99005;

import com.p7700g.p99005.b35;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Distinct.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Be\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012:\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013RD\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lkotlinx/coroutines/flow/Flow;", "upstream", "keySelector", "Lkotlin/Function1;", "", "areEquivalent", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ni5<T> implements pi5<T> {
    @NotNull
    private final pi5<T> s;
    @cz4
    @NotNull
    public final f05<T, Object> t;
    @cz4
    @NotNull
    public final j05<Object, Object, Boolean> u;

    /* compiled from: Distinct.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements qi5, uw4 {
        public final /* synthetic */ ni5<T> s;
        public final /* synthetic */ b35.h<Object> t;
        public final /* synthetic */ qi5<T> u;

        /* compiled from: Distinct.kt */
        @mw4(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.ni5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0221a extends kw4 {
            public /* synthetic */ Object v;
            public final /* synthetic */ a<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0221a(a<? super T> aVar, uv4<? super C0221a> uv4Var) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public a(ni5<T> ni5Var, b35.h<Object> hVar, qi5<? super T> qi5Var) {
            this.s = ni5Var;
            this.t = hVar;
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
            C0221a c0221a;
            int i;
            if (uv4Var instanceof C0221a) {
                c0221a = (C0221a) uv4Var;
                int i2 = c0221a.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0221a.x = i2 - Integer.MIN_VALUE;
                    Object obj = c0221a.v;
                    Object h = gw4.h();
                    i = c0221a.x;
                    if (i != 0) {
                        rp4.n(obj);
                        T t2 = (T) this.s.t.M(t);
                        Object obj2 = this.t.s;
                        if (obj2 != bl5.a && this.s.u.w3(obj2, t2).booleanValue()) {
                            return yq4.a;
                        }
                        this.t.s = t2;
                        qi5<T> qi5Var = this.u;
                        c0221a.x = 1;
                        if (qi5Var.b(t, c0221a) == h) {
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
            c0221a = new C0221a(this, uv4Var);
            Object obj3 = c0221a.v;
            Object h2 = gw4.h();
            i = c0221a.x;
            if (i != 0) {
            }
            return yq4.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni5(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, ? extends Object> f05Var, @NotNull j05<Object, Object, Boolean> j05Var) {
        this.s = pi5Var;
        this.t = f05Var;
        this.u = j05Var;
    }

    @Override // com.p7700g.p99005.pi5
    @Nullable
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        b35.h hVar = new b35.h();
        hVar.s = (T) bl5.a;
        Object a2 = this.s.a(new a(this, hVar, qi5Var), uv4Var);
        return a2 == gw4.h() ? a2 : yq4.a;
    }
}