package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@vo4(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class yv4 {
    /* JADX WARN: Multi-variable type inference failed */
    @fo4
    @tp4(version = "1.3")
    @Nullable
    public static final <E extends xv4.b> E a(@NotNull xv4.b bVar, @NotNull xv4.c<E> cVar) {
        c25.p(bVar, "<this>");
        c25.p(cVar, "key");
        if (cVar instanceof sv4) {
            sv4 sv4Var = (sv4) cVar;
            if (sv4Var.a(bVar.getKey())) {
                E e = (E) sv4Var.b(bVar);
                if (e instanceof xv4.b) {
                    return e;
                }
                return null;
            }
            return null;
        } else if (bVar.getKey() == cVar) {
            return bVar;
        } else {
            return null;
        }
    }

    @fo4
    @tp4(version = "1.3")
    @NotNull
    public static final xv4 b(@NotNull xv4.b bVar, @NotNull xv4.c<?> cVar) {
        c25.p(bVar, "<this>");
        c25.p(cVar, "key");
        if (!(cVar instanceof sv4)) {
            return bVar.getKey() == cVar ? zv4.s : bVar;
        }
        sv4 sv4Var = (sv4) cVar;
        return (!sv4Var.a(bVar.getKey()) || sv4Var.b(bVar) == null) ? bVar : zv4.s;
    }
}