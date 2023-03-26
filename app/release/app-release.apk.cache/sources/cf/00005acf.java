package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public abstract class rv4 implements xv4.b {
    @NotNull
    private final xv4.c<?> key;

    public rv4(@NotNull xv4.c<?> cVar) {
        c25.p(cVar, "key");
        this.key = cVar;
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    public <R> R fold(R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
        return (R) xv4.b.a.a(this, r, j05Var);
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @Nullable
    public <E extends xv4.b> E get(@NotNull xv4.c<E> cVar) {
        return (E) xv4.b.a.b(this, cVar);
    }

    @Override // com.p7700g.p99005.xv4.b
    @NotNull
    public xv4.c<?> getKey() {
        return this.key;
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @NotNull
    public xv4 minusKey(@NotNull xv4.c<?> cVar) {
        return xv4.b.a.c(this, cVar);
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 plus(@NotNull xv4 xv4Var) {
        return xv4.b.a.d(this, xv4Var);
    }
}