package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lint.kt */
@vo4(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a\"\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00022\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0007\u001am\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132D\b\b\u0010\u0015\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0002\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u001fH\u0007\u001a!\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u001e\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u001fH\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010%\u001a\u00020\u0001H\u0007\u001af\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\b\b\u0002\u0010'\u001a\u00020(23\b\n\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0*H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132Y\b\b\u0010)\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0002\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0-¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001a'\u00100\u001a\b\u0012\u0004\u0012\u0002H\u001201\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\u001a'\u00102\u001a\b\u0012\u0004\u0012\u0002H\u001203\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\"\"\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\u0007\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/flow/FlowCollector;", "getCoroutineContext$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "isActive", "", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", com.anythink.expressad.d.a.b.dO, "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellable", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "catch", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "conflate", "Lkotlinx/coroutines/flow/StateFlow;", NewHtcHomeBadger.d, "", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distinctUntilChanged", "flowOn", "context", qk3.a, "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/SharedFlow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "toList", "", "toSet", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class jj5 {

    /* compiled from: Lint.kt */
    @mw4(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<Throwable, uv4<? super Boolean>, Object> {
        public int w;

        public a(uv4<? super a> uv4Var) {
            super(2, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull Throwable th, @Nullable uv4<? super Boolean> uv4Var) {
            return ((a) X(th, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                return iw4.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new a(uv4Var);
        }
    }

    @xn4(level = zn4.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @op4(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@NotNull qi5<?> qi5Var, @Nullable CancellationException cancellationException) {
        throw wo1.V();
    }

    public static /* synthetic */ void b(qi5 qi5Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        a(qi5Var, cancellationException);
    }

    @xn4(level = zn4.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @op4(expression = "this", imports = {}))
    @NotNull
    public static final <T> pi5<T> c(@NotNull pj5<? extends T> pj5Var) {
        throw wo1.V();
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @op4(expression = "this", imports = {}))
    private static final <T> pi5<T> d(pj5<? extends T> pj5Var, k05<? super qi5<? super T>, ? super Throwable, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return ri5.u(pj5Var, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @op4(expression = "this", imports = {}))
    @NotNull
    public static final <T> pi5<T> e(@NotNull ak5<? extends T> ak5Var) {
        throw wo1.V();
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object f(pj5<? extends T> pj5Var, uv4<? super Integer> uv4Var) {
        z15.e(0);
        Object Y = ri5.Y(pj5Var, uv4Var);
        z15.e(1);
        return Y;
    }

    @xn4(level = zn4.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @op4(expression = "this", imports = {}))
    @NotNull
    public static final <T> pi5<T> g(@NotNull ak5<? extends T> ak5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @op4(expression = "this", imports = {}))
    @NotNull
    public static final <T> pi5<T> h(@NotNull pj5<? extends T> pj5Var, @NotNull xv4 xv4Var) {
        throw wo1.V();
    }

    @NotNull
    public static final xv4 i(@NotNull qi5<?> qi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @op4(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(qi5 qi5Var) {
    }

    public static final boolean k(@NotNull qi5<?> qi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @op4(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(qi5 qi5Var) {
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @op4(expression = "this", imports = {}))
    private static final <T> pi5<T> m(pj5<? extends T> pj5Var, long j, j05<? super Throwable, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return ri5.v1(pj5Var, j, j05Var);
    }

    public static /* synthetic */ pi5 n(pj5 pj5Var, long j, j05 j05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            j05Var = new a(null);
        }
        return ri5.v1(pj5Var, j, j05Var);
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @op4(expression = "this", imports = {}))
    private static final <T> pi5<T> o(pj5<? extends T> pj5Var, l05<? super qi5<? super T>, ? super Throwable, ? super Long, ? super uv4<? super Boolean>, ? extends Object> l05Var) {
        return ri5.x1(pj5Var, l05Var);
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object p(pj5<? extends T> pj5Var, uv4<? super List<? extends T>> uv4Var) {
        Object c;
        z15.e(0);
        c = vi5.c(pj5Var, null, uv4Var, 1, null);
        z15.e(1);
        return c;
    }

    @dx4
    @xn4(level = zn4.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object q(pj5<? extends T> pj5Var, uv4<? super Set<? extends T>> uv4Var) {
        Object e;
        z15.e(0);
        e = vi5.e(pj5Var, null, uv4Var, 1, null);
        z15.e(1);
        return e;
    }
}