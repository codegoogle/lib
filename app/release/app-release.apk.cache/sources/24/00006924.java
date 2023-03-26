package com.p7700g.p99005;

import com.p7700g.p99005.vc5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@vo4(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class zf5 extends qe5 implements vc5 {
    private zf5() {
    }

    public /* synthetic */ zf5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract zf5 Y();

    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        return vc5.a.b(this, j, runnable, xv4Var);
    }

    @Override // com.p7700g.p99005.vc5
    @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object r(long j, @NotNull uv4<? super yq4> uv4Var) {
        return vc5.a.a(this, j, uv4Var);
    }
}