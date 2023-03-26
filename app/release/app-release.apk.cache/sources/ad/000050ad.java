package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@vo4(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BU\u0012-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016R:\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function2;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class mi5<T> extends lk5<T> {
    @NotNull
    private final j05<hh5<? super T>, uv4<? super yq4>, Object> v;

    public /* synthetic */ mi5(j05 j05Var, xv4 xv4Var, int i, ng5 ng5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j05Var, (i2 & 2) != 0 ? zv4.s : xv4Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? ng5.SUSPEND : ng5Var);
    }

    public static /* synthetic */ Object m(mi5 mi5Var, hh5 hh5Var, uv4 uv4Var) {
        Object w3 = mi5Var.v.w3(hh5Var, uv4Var);
        return w3 == gw4.h() ? w3 : yq4.a;
    }

    @Override // com.p7700g.p99005.lk5
    @Nullable
    public Object g(@NotNull hh5<? super T> hh5Var, @NotNull uv4<? super yq4> uv4Var) {
        return m(this, hh5Var, uv4Var);
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public lk5<T> h(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return new mi5(this.v, xv4Var, i, ng5Var);
    }

    @Override // com.p7700g.p99005.lk5
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("block[");
        G.append(this.v);
        G.append("] -> ");
        G.append(super.toString());
        return G.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mi5(@NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        super(xv4Var, i, ng5Var);
        this.v = j05Var;
    }
}