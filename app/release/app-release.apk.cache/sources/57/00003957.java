package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Semaphore.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002\u001a6\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0019*\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"BROKEN", "Lkotlinx/coroutines/internal/Symbol;", "getBROKEN$annotations", "()V", "CANCELLED", "getCANCELLED$annotations", "MAX_SPIN_CYCLES", "", "getMAX_SPIN_CYCLES$annotations", "PERMIT", "getPERMIT$annotations", "SEGMENT_SIZE", "getSEGMENT_SIZE$annotations", "TAKEN", "getTAKEN$annotations", "Semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "acquiredPermits", "createSegment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "id", "", "prev", "withPermit", "T", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ap5 {
    private static final int a;
    @NotNull
    private static final an5 b;
    @NotNull
    private static final an5 c;
    @NotNull
    private static final an5 d;
    @NotNull
    private static final an5 e;
    private static final int f;

    /* compiled from: Semaphore.kt */
    @mw4(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a<T> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return ap5.q(null, null, this);
        }
    }

    static {
        int d2;
        int d3;
        d2 = en5.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        a = d2;
        b = new an5("PERMIT");
        c = new an5("TAKEN");
        d = new an5("BROKEN");
        e = new an5("CANCELLED");
        d3 = en5.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f = d3;
    }

    @NotNull
    public static final yo5 a(int i, int i2) {
        return new zo5(i, i2);
    }

    public static /* synthetic */ yo5 b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bp5 j(long j, bp5 bp5Var) {
        return new bp5(j, bp5Var, 0);
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static /* synthetic */ void o() {
    }

    private static /* synthetic */ void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object q(@NotNull yo5 yo5Var, @NotNull uz4<? extends T> uz4Var, @NotNull uv4<? super T> uv4Var) {
        a aVar;
        int i;
        try {
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.y = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.x;
                    Object h = gw4.h();
                    i = aVar.y;
                    if (i != 0) {
                        rp4.n(obj);
                        aVar.v = yo5Var;
                        aVar.w = uz4Var;
                        aVar.y = 1;
                        if (yo5Var.b(aVar) == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        uz4Var = (uz4) aVar.w;
                        yo5Var = (yo5) aVar.v;
                        rp4.n(obj);
                    }
                    return uz4Var.x();
                }
            }
            return uz4Var.x();
        } finally {
            z15.d(1);
            yo5Var.release();
            z15.c(1);
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.x;
        Object h2 = gw4.h();
        i = aVar.y;
        if (i != 0) {
        }
    }

    private static final <T> Object r(yo5 yo5Var, uz4<? extends T> uz4Var, uv4<? super T> uv4Var) {
        z15.e(0);
        yo5Var.b(uv4Var);
        z15.e(1);
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            yo5Var.release();
            z15.c(1);
        }
    }
}