package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.xv4;
import com.p7700g.p99005.xv4.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", AFHydra.EV_BYTECOUNT, "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", "", "key", "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@fo4
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public abstract class sv4<B extends xv4.b, E extends B> implements xv4.c<E> {
    @NotNull
    private final f05<xv4.b, E> s;
    @NotNull
    private final xv4.c<?> t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.p7700g.p99005.f05<com.p7700g.p99005.xv4$b, E extends B>, java.lang.Object, com.p7700g.p99005.f05<? super com.p7700g.p99005.xv4$b, ? extends E extends B>] */
    public sv4(@NotNull xv4.c<B> cVar, @NotNull f05<? super xv4.b, ? extends E> f05Var) {
        c25.p(cVar, "baseKey");
        c25.p(f05Var, "safeCast");
        this.s = f05Var;
        this.t = cVar instanceof sv4 ? (xv4.c<B>) ((sv4) cVar).t : cVar;
    }

    public final boolean a(@NotNull xv4.c<?> cVar) {
        c25.p(cVar, "key");
        return cVar == this || this.t == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/p7700g/p99005/xv4$b;)TE; */
    @Nullable
    public final xv4.b b(@NotNull xv4.b bVar) {
        c25.p(bVar, "element");
        return (xv4.b) this.s.M(bVar);
    }
}