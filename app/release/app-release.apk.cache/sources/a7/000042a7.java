package com.p7700g.p99005;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R:\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "sharedFlow", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "collect", "", "collector", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class fk5<T> implements pj5<T> {
    @NotNull
    private final pj5<T> s;
    @NotNull
    private final j05<qi5<? super T>, uv4<? super yq4>, Object> t;

    /* compiled from: Share.kt */
    @mw4(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public /* synthetic */ Object v;
        public final /* synthetic */ fk5<T> w;
        public int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fk5<T> fk5Var, uv4<? super a> uv4Var) {
            super(uv4Var);
            this.w = fk5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return this.w.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fk5(@NotNull pj5<? extends T> pj5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        this.s = pj5Var;
        this.t = j05Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.p7700g.p99005.pj5, com.p7700g.p99005.pi5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<?> uv4Var) {
        a aVar;
        int i;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.x = i2 - Integer.MIN_VALUE;
                Object obj = aVar.v;
                Object h = gw4.h();
                i = aVar.x;
                if (i != 0) {
                    rp4.n(obj);
                    pj5<T> pj5Var = this.s;
                    ek5 ek5Var = new ek5(qi5Var, this.t);
                    aVar.x = 1;
                    if (pj5Var.a(ek5Var, aVar) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                throw new lo4();
            }
        }
        aVar = new a(this, uv4Var);
        Object obj2 = aVar.v;
        Object h2 = gw4.h();
        i = aVar.x;
        if (i != 0) {
        }
        throw new lo4();
    }

    @Override // com.p7700g.p99005.pj5
    @NotNull
    public List<T> c() {
        return this.s.c();
    }
}