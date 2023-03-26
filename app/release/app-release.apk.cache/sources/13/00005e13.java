package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/UndispatchedMarker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "()V", "key", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class tf5 implements xv4.b, xv4.c<tf5> {
    @NotNull
    public static final tf5 s = new tf5();

    private tf5() {
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
        return this;
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