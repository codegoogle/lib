package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.b35;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Count.kt */
@vo4(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {NewHtcHomeBadger.d, "", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class xi5 {

    /* compiled from: Count.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = NewHtcHomeBadger.d, n = {"i"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
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
            return ri5.Y(null, this);
        }
    }

    /* compiled from: Count.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<T> implements qi5, uw4 {
        public final /* synthetic */ b35.f s;

        public b(b35.f fVar) {
            this.s = fVar;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.s++;
            return yq4.a;
        }
    }

    /* compiled from: Count.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = NewHtcHomeBadger.d, n = {"i"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<T> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public c(uv4<? super c> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return ri5.Z(null, null, this);
        }
    }

    /* compiled from: Count.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<T> implements qi5, uw4 {
        public final /* synthetic */ j05<T, uv4<? super Boolean>, Object> s;
        public final /* synthetic */ b35.f t;

        /* compiled from: Count.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public final /* synthetic */ d<T> x;
            public int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, uv4<? super a> uv4Var) {
                super(uv4Var);
                this.x = dVar;
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
        public d(j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, b35.f fVar) {
            this.s = j05Var;
            this.t = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        @Override // com.p7700g.p99005.qi5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            a aVar;
            Object obj;
            int i;
            d<T> dVar;
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
                        dVar = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        dVar = (d) aVar.v;
                        rp4.n(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        dVar.t.s++;
                    }
                    return yq4.a;
                }
            }
            aVar = new a(this, uv4Var);
            obj = aVar.w;
            Object h2 = gw4.h();
            i = aVar.y;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            return yq4.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super Integer> uv4Var) {
        a aVar;
        int i;
        b35.f fVar;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.x = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                Object h = gw4.h();
                i = aVar.x;
                if (i != 0) {
                    rp4.n(obj);
                    b35.f fVar2 = new b35.f();
                    qi5<? super Object> bVar = new b<>(fVar2);
                    aVar.v = fVar2;
                    aVar.x = 1;
                    if (pi5Var.a(bVar, aVar) == h) {
                        return h;
                    }
                    fVar = fVar2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fVar = (b35.f) aVar.v;
                    rp4.n(obj);
                }
                return iw4.f(fVar.s);
            }
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.w;
        Object h2 = gw4.h();
        i = aVar.x;
        if (i != 0) {
        }
        return iw4.f(fVar.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super Integer> uv4Var) {
        c cVar;
        int i;
        b35.f fVar;
        if (uv4Var instanceof c) {
            cVar = (c) uv4Var;
            int i2 = cVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.x = i2 - Integer.MIN_VALUE;
                Object obj = cVar.w;
                Object h = gw4.h();
                i = cVar.x;
                if (i != 0) {
                    rp4.n(obj);
                    b35.f fVar2 = new b35.f();
                    qi5<? super Object> dVar = new d<>(j05Var, fVar2);
                    cVar.v = fVar2;
                    cVar.x = 1;
                    if (pi5Var.a(dVar, cVar) == h) {
                        return h;
                    }
                    fVar = fVar2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fVar = (b35.f) cVar.v;
                    rp4.n(obj);
                }
                return iw4.f(fVar.s);
            }
        }
        cVar = new c(uv4Var);
        Object obj2 = cVar.w;
        Object h2 = gw4.h();
        i = cVar.x;
        if (i != 0) {
        }
        return iw4.f(fVar.s);
    }
}