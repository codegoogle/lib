package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.kt */
@vo4(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016ø\u0001\u0000¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", "", "completion", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class cl5<T> extends kw4 implements qi5<T>, lw4 {
    @cz4
    @NotNull
    public final qi5<T> v;
    @cz4
    @NotNull
    public final xv4 w;
    @cz4
    public final int x;
    @Nullable
    private xv4 y;
    @Nullable
    private uv4<? super yq4> z;

    /* compiled from: SafeCollector.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", NewHtcHomeBadger.d, "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05<Integer, xv4.b, Integer> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @NotNull
        public final Integer a(int i, @NotNull xv4.b bVar) {
            return Integer.valueOf(i + 1);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Integer w3(Integer num, xv4.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cl5(@NotNull qi5<? super T> qi5Var, @NotNull xv4 xv4Var) {
        super(zk5.s, zv4.s);
        this.v = qi5Var;
        this.w = xv4Var;
        this.x = ((Number) xv4Var.fold(0, a.t)).intValue();
    }

    private final void C3(xv4 xv4Var, xv4 xv4Var2, T t) {
        if (xv4Var2 instanceof uk5) {
            n4((uk5) xv4Var2, t);
        }
        el5.a(this, xv4Var);
    }

    private final Object G3(uv4<? super yq4> uv4Var, T t) {
        xv4 context = uv4Var.getContext();
        ie5.z(context);
        xv4 xv4Var = this.y;
        if (xv4Var != context) {
            C3(context, xv4Var, t);
            this.y = context;
        }
        this.z = uv4Var;
        Object I = dl5.a().I(this.v, t, this);
        if (!c25.g(I, gw4.h())) {
            this.z = null;
        }
        return I;
    }

    private final void n4(uk5 uk5Var, Object obj) {
        StringBuilder G = wo1.G("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        G.append(uk5Var.s);
        G.append(", but then emission attempt of value '");
        G.append(obj);
        G.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(u85.p(G.toString()).toString());
    }

    @Override // com.p7700g.p99005.hw4
    @NotNull
    public Object D1(@NotNull Object obj) {
        Throwable e = qp4.e(obj);
        if (e != null) {
            this.y = new uk5(e, getContext());
        }
        uv4<? super yq4> uv4Var = this.z;
        if (uv4Var != null) {
            uv4Var.u(obj);
        }
        return gw4.h();
    }

    @Override // com.p7700g.p99005.hw4, com.p7700g.p99005.lw4
    @Nullable
    public StackTraceElement H() {
        return null;
    }

    @Override // com.p7700g.p99005.qi5
    @Nullable
    public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
        try {
            Object G3 = G3(uv4Var, t);
            if (G3 == gw4.h()) {
                ow4.c(uv4Var);
            }
            return G3 == gw4.h() ? G3 : yq4.a;
        } catch (Throwable th) {
            this.y = new uk5(th, uv4Var.getContext());
            throw th;
        }
    }

    @Override // com.p7700g.p99005.kw4, com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        xv4 xv4Var = this.y;
        return xv4Var == null ? zv4.s : xv4Var;
    }

    @Override // com.p7700g.p99005.kw4, com.p7700g.p99005.hw4
    public void j3() {
        super.j3();
    }

    @Override // com.p7700g.p99005.hw4, com.p7700g.p99005.lw4
    @Nullable
    public lw4 o() {
        uv4<? super yq4> uv4Var = this.z;
        if (uv4Var instanceof lw4) {
            return (lw4) uv4Var;
        }
        return null;
    }
}