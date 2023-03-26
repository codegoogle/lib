package com.p7700g.p99005;

import com.p7700g.p99005.vv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public interface xv4 {

    /* compiled from: CoroutineContext.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.p7700g.p99005.xv4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0268a extends e25 implements j05<xv4, b, xv4> {
            public static final C0268a t = new C0268a();

            public C0268a() {
                super(2);
            }

            @Override // com.p7700g.p99005.j05
            @NotNull
            /* renamed from: a */
            public final xv4 w3(@NotNull xv4 xv4Var, @NotNull b bVar) {
                tv4 tv4Var;
                c25.p(xv4Var, "acc");
                c25.p(bVar, "element");
                xv4 minusKey = xv4Var.minusKey(bVar.getKey());
                zv4 zv4Var = zv4.s;
                if (minusKey == zv4Var) {
                    return bVar;
                }
                vv4.b bVar2 = vv4.k0;
                vv4 vv4Var = (vv4) minusKey.get(bVar2);
                if (vv4Var == null) {
                    tv4Var = new tv4(minusKey, bVar);
                } else {
                    xv4 minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == zv4Var) {
                        return new tv4(bVar, vv4Var);
                    }
                    tv4Var = new tv4(new tv4(minusKey2, bVar), vv4Var);
                }
                return tv4Var;
            }
        }

        @NotNull
        public static xv4 a(@NotNull xv4 xv4Var, @NotNull xv4 xv4Var2) {
            c25.p(xv4Var2, "context");
            return xv4Var2 == zv4.s ? xv4Var : (xv4) xv4Var2.fold(xv4Var, C0268a.t);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b extends xv4 {

        /* compiled from: CoroutineContext.kt */
        @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(@NotNull b bVar, R r, @NotNull j05<? super R, ? super b, ? extends R> j05Var) {
                c25.p(j05Var, "operation");
                return j05Var.w3(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends b> E b(@NotNull b bVar, @NotNull c<E> cVar) {
                c25.p(cVar, "key");
                if (c25.g(bVar.getKey(), cVar)) {
                    c25.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            @NotNull
            public static xv4 c(@NotNull b bVar, @NotNull c<?> cVar) {
                c25.p(cVar, "key");
                return c25.g(bVar.getKey(), cVar) ? zv4.s : bVar;
            }

            @NotNull
            public static xv4 d(@NotNull b bVar, @NotNull xv4 xv4Var) {
                c25.p(xv4Var, "context");
                return a.a(bVar, xv4Var);
            }
        }

        @Override // com.p7700g.p99005.xv4
        <R> R fold(R r, @NotNull j05<? super R, ? super b, ? extends R> j05Var);

        @Override // com.p7700g.p99005.xv4
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();

        @Override // com.p7700g.p99005.xv4
        @NotNull
        xv4 minusKey(@NotNull c<?> cVar);
    }

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, @NotNull j05<? super R, ? super b, ? extends R> j05Var);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    xv4 minusKey(@NotNull c<?> cVar);

    @NotNull
    xv4 plus(@NotNull xv4 xv4Var);
}