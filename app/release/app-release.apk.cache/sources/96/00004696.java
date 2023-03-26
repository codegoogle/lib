package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Flow.kt */
@ud5
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class hi5<T> implements pi5<T>, ji5<T> {

    /* compiled from: Flow.kt */
    @mw4(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public final /* synthetic */ hi5<T> x;
        public int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hi5<T> hi5Var, uv4<? super a> uv4Var) {
            super(uv4Var);
            this.x = hi5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return this.x.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // com.p7700g.p99005.pi5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        int i;
        Throwable th;
        cl5 cl5Var;
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
                    qi5<? super T> cl5Var2 = new cl5<>(qi5Var, aVar.getContext());
                    try {
                        aVar.v = cl5Var2;
                        aVar.y = 1;
                        if (e(cl5Var2, aVar) == h) {
                            return h;
                        }
                        cl5Var = cl5Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        cl5Var = cl5Var2;
                        cl5Var.j3();
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cl5Var = (cl5) aVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        cl5Var.j3();
                        throw th;
                    }
                }
                cl5Var.j3();
                return yq4.a;
            }
        }
        aVar = new a(this, uv4Var);
        Object obj2 = aVar.w;
        Object h2 = gw4.h();
        i = aVar.y;
        if (i != 0) {
        }
        cl5Var.j3();
        return yq4.a;
    }

    @Nullable
    public abstract Object e(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var);
}