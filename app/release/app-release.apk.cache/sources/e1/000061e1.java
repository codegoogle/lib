package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collection.kt */
@vo4(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"toCollection", "C", "T", "", "Lkotlinx/coroutines/flow/Flow;", "destination", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSet", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class vi5 {

    /* compiled from: Collection.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T, C extends Collection<? super T>> extends kw4 {
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
            return ri5.V1(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* compiled from: Collection.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "C", "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<T> implements qi5, uw4 {
        public final /* synthetic */ Collection s;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.s = collection;
        }

        @Override // com.p7700g.p99005.qi5
        @Nullable
        public final Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
            this.s.add(t);
            return yq4.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends Collection<? super T>> Object a(@NotNull pi5<? extends T> pi5Var, @NotNull C c, @NotNull uv4<? super C> uv4Var) {
        a aVar;
        int i;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.x = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                Object h = gw4.h();
                i = aVar.x;
                if (i == 0) {
                    if (i == 1) {
                        Collection collection = (Collection) aVar.v;
                        rp4.n(obj);
                        return collection;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rp4.n(obj);
                qi5<? super Object> bVar = new b<>(c);
                aVar.v = c;
                aVar.x = 1;
                return pi5Var.a(bVar, aVar) == h ? h : c;
            }
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.w;
        Object h2 = gw4.h();
        i = aVar.x;
        if (i == 0) {
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull pi5<? extends T> pi5Var, @NotNull List<T> list, @NotNull uv4<? super List<? extends T>> uv4Var) {
        return ri5.V1(pi5Var, list, uv4Var);
    }

    public static /* synthetic */ Object c(pi5 pi5Var, List list, uv4 uv4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return ri5.W1(pi5Var, list, uv4Var);
    }

    @Nullable
    public static final <T> Object d(@NotNull pi5<? extends T> pi5Var, @NotNull Set<T> set, @NotNull uv4<? super Set<? extends T>> uv4Var) {
        return ri5.V1(pi5Var, set, uv4Var);
    }

    public static /* synthetic */ Object e(pi5 pi5Var, Set set, uv4 uv4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return ri5.Y1(pi5Var, set, uv4Var);
    }
}