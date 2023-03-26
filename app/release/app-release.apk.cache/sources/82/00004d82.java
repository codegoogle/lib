package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationImpl.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public abstract class kw4 extends hw4 {
    @Nullable
    private final xv4 t;
    @Nullable
    private transient uv4<Object> u;

    public kw4(@Nullable uv4<Object> uv4Var, @Nullable xv4 xv4Var) {
        super(uv4Var);
        this.t = xv4Var;
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        xv4 xv4Var = this.t;
        c25.m(xv4Var);
        return xv4Var;
    }

    @Override // com.p7700g.p99005.hw4
    public void j3() {
        uv4<?> uv4Var = this.u;
        if (uv4Var != null && uv4Var != this) {
            xv4.b bVar = getContext().get(vv4.k0);
            c25.m(bVar);
            ((vv4) bVar).f(uv4Var);
        }
        this.u = jw4.s;
    }

    @NotNull
    public final uv4<Object> t3() {
        uv4<Object> uv4Var = this.u;
        if (uv4Var == null) {
            vv4 vv4Var = (vv4) getContext().get(vv4.k0);
            if (vv4Var == null || (uv4Var = vv4Var.E(this)) == null) {
                uv4Var = this;
            }
            this.u = uv4Var;
        }
        return uv4Var;
    }

    public kw4(@Nullable uv4<Object> uv4Var) {
        this(uv4Var, uv4Var != null ? uv4Var.getContext() : null);
    }
}