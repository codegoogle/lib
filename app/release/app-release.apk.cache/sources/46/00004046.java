package com.p7700g.p99005;

import com.p7700g.p99005.vv4;
import com.p7700g.p99005.xv4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineDispatcher.kt */
@vo4(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002J\u0012\u0010\u0017\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "limitedParallelism", "parallelism", "", "plus", "other", "releaseInterceptedContinuation", "toString", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ec5 extends rv4 implements vv4 {
    @NotNull
    public static final a s = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @fo4
    /* loaded from: classes3.dex */
    public static final class a extends sv4<vv4, ec5> {

        /* compiled from: CoroutineDispatcher.kt */
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.ec5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0169a extends e25 implements f05<xv4.b, ec5> {
            public static final C0169a t = new C0169a();

            public C0169a() {
                super(1);
            }

            @Override // com.p7700g.p99005.f05
            @Nullable
            /* renamed from: a */
            public final ec5 M(@NotNull xv4.b bVar) {
                if (bVar instanceof ec5) {
                    return (ec5) bVar;
                }
                return null;
            }
        }

        private a() {
            super(vv4.k0, C0169a.t);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ec5() {
        super(vv4.k0);
    }

    @Override // com.p7700g.p99005.vv4
    @NotNull
    public final <T> uv4<T> E(@NotNull uv4<? super T> uv4Var) {
        return new ul5(this, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final ec5 F(@NotNull ec5 ec5Var) {
        return ec5Var;
    }

    @Override // com.p7700g.p99005.vv4
    public final void f(@NotNull uv4<?> uv4Var) {
        ((ul5) uv4Var).t();
    }

    @Override // com.p7700g.p99005.rv4, com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @Nullable
    public <E extends xv4.b> E get(@NotNull xv4.c<E> cVar) {
        return (E) vv4.a.b(this, cVar);
    }

    @Override // com.p7700g.p99005.rv4, com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @NotNull
    public xv4 minusKey(@NotNull xv4.c<?> cVar) {
        return vv4.a.c(this, cVar);
    }

    public abstract void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable);

    @NotNull
    public String toString() {
        return qc5.a(this) + '@' + qc5.b(this);
    }

    @zd5
    public void v(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        s(xv4Var, runnable);
    }

    public boolean w(@NotNull xv4 xv4Var) {
        return true;
    }

    @td5
    @NotNull
    public ec5 z(int i) {
        cm5.a(i);
        return new bm5(this, i);
    }
}