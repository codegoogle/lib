package com.p7700g.p99005;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Await.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class va5 {

    /* compiled from: Await.kt */
    @mw4(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {54}, m = "joinAll", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public Object v;
        public int w;
        public int x;
        public /* synthetic */ Object y;
        public int z;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return va5.d(null, this);
        }
    }

    /* compiled from: Await.kt */
    @mw4(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends kw4 {
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
            return va5.c(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends tc5<? extends T>> collection, @NotNull uv4<? super List<? extends T>> uv4Var) {
        if (collection.isEmpty()) {
            return js4.F();
        }
        Object[] array = collection.toArray(new tc5[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new ua5((tc5[]) array).b(uv4Var);
    }

    @Nullable
    public static final <T> Object b(@NotNull tc5<? extends T>[] tc5VarArr, @NotNull uv4<? super List<? extends T>> uv4Var) {
        return tc5VarArr.length == 0 ? js4.F() : new ua5(tc5VarArr).b(uv4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(@NotNull Collection<? extends ee5> collection, @NotNull uv4<? super yq4> uv4Var) {
        b bVar;
        int i;
        Iterator it;
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
                    it = collection.iterator();
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) bVar.v;
                    rp4.n(obj);
                }
                while (it.hasNext()) {
                    bVar.v = it;
                    bVar.x = 1;
                    if (((ee5) it.next()).x0(bVar) == h) {
                        return h;
                    }
                }
                return yq4.a;
            }
        }
        bVar = new b(uv4Var);
        Object obj2 = bVar.w;
        Object h2 = gw4.h();
        i = bVar.x;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return yq4.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(@NotNull ee5[] ee5VarArr, @NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        int i;
        ee5[] ee5VarArr2;
        int length;
        Object obj;
        a aVar2;
        int i2;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i3 = aVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.z = i3 - Integer.MIN_VALUE;
                Object obj2 = aVar.y;
                Object h = gw4.h();
                i = aVar.z;
                if (i != 0) {
                    rp4.n(obj2);
                    ee5VarArr2 = ee5VarArr;
                    length = ee5VarArr.length;
                    obj = h;
                    aVar2 = aVar;
                    i2 = 0;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    length = aVar.x;
                    int i4 = aVar.w;
                    rp4.n(obj2);
                    ee5VarArr2 = (ee5[]) aVar.v;
                    aVar2 = aVar;
                    i2 = i4;
                    obj = h;
                }
                while (i2 < length) {
                    ee5 ee5Var = ee5VarArr2[i2];
                    i2++;
                    aVar2.v = ee5VarArr2;
                    aVar2.w = i2;
                    aVar2.x = length;
                    aVar2.z = 1;
                    if (ee5Var.x0(aVar2) == obj) {
                        return obj;
                    }
                }
                return yq4.a;
            }
        }
        aVar = new a(uv4Var);
        Object obj22 = aVar.y;
        Object h2 = gw4.h();
        i = aVar.z;
        if (i != 0) {
        }
        while (i2 < length) {
        }
        return yq4.a;
    }
}