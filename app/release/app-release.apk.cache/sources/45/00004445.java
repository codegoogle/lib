package com.p7700g.p99005;

import com.ironsource.adapters.ironsource.IronSourceAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuation.kt */
@vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0014\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\fH'J1\u0010\u0010\u001a\u00020\f2'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u0015H&J:\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H'¢\u0006\u0002\u0010\u0019J#\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00028\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u001cJF\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H'¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\nH'J\u0019\u0010 \u001a\u00020\f*\u00020!2\u0006\u0010\u0017\u001a\u00028\u0000H'¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\f*\u00020!2\u0006\u0010\u001f\u001a\u00020\nH'R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006$"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", com.anythink.expressad.d.a.b.dO, "cause", "", "completeResume", "", IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, "", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", com.anythink.expressad.foundation.d.c.ca, "value", "onCancellation", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "tryResume", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface gb5<T> extends uv4<T> {

    /* compiled from: CancellableContinuation.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(gb5 gb5Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return gb5Var.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(gb5 gb5Var, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return gb5Var.n(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void D(@NotNull f05<? super Throwable, yq4> f05Var);

    @zd5
    @Nullable
    Object J(@NotNull Throwable th);

    @zd5
    @Nullable
    Object N(T t, @Nullable Object obj, @Nullable f05<? super Throwable, yq4> f05Var);

    @td5
    void R(@NotNull ec5 ec5Var, @NotNull Throwable th);

    @td5
    void S(@NotNull ec5 ec5Var, T t);

    @zd5
    void T();

    @td5
    void V(T t, @Nullable f05<? super Throwable, yq4> f05Var);

    boolean a(@Nullable Throwable th);

    boolean h();

    boolean isCancelled();

    boolean m();

    @zd5
    @Nullable
    Object n(T t, @Nullable Object obj);

    @zd5
    void w0(@NotNull Object obj);
}