package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@vo4(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BU\u0012-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R:\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", "T", "Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function2;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ii5<T> extends mi5<T> {
    @NotNull
    private final j05<hh5<? super T>, uv4<? super yq4>, Object> w;

    /* compiled from: Builders.kt */
    @mw4(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public final /* synthetic */ ii5<T> x;
        public int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ii5<T> ii5Var, uv4<? super a> uv4Var) {
            super(uv4Var);
            this.x = ii5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return this.x.g(null, this);
        }
    }

    public /* synthetic */ ii5(j05 j05Var, xv4 xv4Var, int i, ng5 ng5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j05Var, (i2 & 2) != 0 ? zv4.s : xv4Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? ng5.SUSPEND : ng5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // com.p7700g.p99005.mi5, com.p7700g.p99005.lk5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(@NotNull hh5<? super T> hh5Var, @NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        int i;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                Object h = gw4.h();
                i = aVar.y;
                if (i != 0) {
                    rp4.n(obj);
                    aVar.v = hh5Var;
                    aVar.y = 1;
                    if (super.g(hh5Var, aVar) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hh5Var = (hh5) aVar.v;
                    rp4.n(obj);
                }
                if (!hh5Var.K()) {
                    return yq4.a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        aVar = new a(this, uv4Var);
        Object obj2 = aVar.w;
        Object h2 = gw4.h();
        i = aVar.y;
        if (i != 0) {
        }
        if (!hh5Var.K()) {
        }
    }

    @Override // com.p7700g.p99005.mi5, com.p7700g.p99005.lk5
    @NotNull
    public lk5<T> h(@NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return new ii5(this.w, xv4Var, i, ng5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ii5(@NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        super(j05Var, xv4Var, i, ng5Var);
        this.w = j05Var;
    }
}