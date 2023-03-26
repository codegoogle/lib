package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "awaitCancellation", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-VtjQ1oo", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class wc5 {

    /* compiled from: Delay.kt */
    @mw4(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public /* synthetic */ Object v;
        public int w;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.v = obj;
            this.w |= Integer.MIN_VALUE;
            return wc5.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull uv4<?> uv4Var) {
        a aVar;
        int i;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.w = i2 - Integer.MIN_VALUE;
                Object obj = aVar.v;
                Object h = gw4.h();
                i = aVar.w;
                if (i != 0) {
                    rp4.n(obj);
                    aVar.w = 1;
                    hb5 hb5Var = new hb5(fw4.d(aVar), 1);
                    hb5Var.T();
                    Object x = hb5Var.x();
                    if (x == gw4.h()) {
                        ow4.c(aVar);
                    }
                    if (x == h) {
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
        aVar = new a(uv4Var);
        Object obj2 = aVar.v;
        Object h2 = gw4.h();
        i = aVar.w;
        if (i != 0) {
        }
        throw new lo4();
    }

    @Nullable
    public static final Object b(long j, @NotNull uv4<? super yq4> uv4Var) {
        if (j <= 0) {
            return yq4.a;
        }
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        if (j < Long.MAX_VALUE) {
            d(hb5Var.getContext()).j(j, hb5Var);
        }
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    @Nullable
    public static final Object c(long j, @NotNull uv4<? super yq4> uv4Var) {
        Object b = b(e(j), uv4Var);
        return b == gw4.h() ? b : yq4.a;
    }

    @NotNull
    public static final vc5 d(@NotNull xv4 xv4Var) {
        xv4.b bVar = xv4Var.get(vv4.k0);
        vc5 vc5Var = bVar instanceof vc5 ? (vc5) bVar : null;
        return vc5Var == null ? sc5.a() : vc5Var;
    }

    public static final long e(long j) {
        if (o95.h(j, o95.s.W()) > 0) {
            return i55.o(o95.J(j), 1L);
        }
        return 0L;
    }
}