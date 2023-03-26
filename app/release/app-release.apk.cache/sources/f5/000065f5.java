package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Mutex.kt */
@vo4(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u001aB\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0018H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0019\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"EMPTY_LOCKED", "Lkotlinx/coroutines/sync/Empty;", "getEMPTY_LOCKED$annotations", "()V", "EMPTY_UNLOCKED", "getEMPTY_UNLOCKED$annotations", "LOCKED", "Lkotlinx/coroutines/internal/Symbol;", "getLOCKED$annotations", "LOCK_FAIL", "getLOCK_FAIL$annotations", "UNLOCKED", "getUNLOCKED$annotations", "UNLOCK_FAIL", "getUNLOCK_FAIL$annotations", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class xo5 {
    @NotNull
    private static final an5 a = new an5("LOCK_FAIL");
    @NotNull
    private static final an5 b = new an5("UNLOCK_FAIL");
    @NotNull
    private static final an5 c;
    @NotNull
    private static final an5 d;
    @NotNull
    private static final uo5 e;
    @NotNull
    private static final uo5 f;

    /* compiled from: Mutex.kt */
    @mw4(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a<T> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return xo5.o(null, null, null, this);
        }
    }

    static {
        an5 an5Var = new an5("LOCKED");
        c = an5Var;
        an5 an5Var2 = new an5("UNLOCKED");
        d = an5Var2;
        e = new uo5(an5Var);
        f = new uo5(an5Var2);
    }

    @NotNull
    public static final vo5 a(boolean z) {
        return new wo5(z);
    }

    public static /* synthetic */ vo5 b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object o(@NotNull vo5 vo5Var, @Nullable Object obj, @NotNull uz4<? extends T> uz4Var, @NotNull uv4<? super T> uv4Var) {
        a aVar;
        int i;
        try {
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.y;
                    Object h = gw4.h();
                    i = aVar.z;
                    if (i != 0) {
                        rp4.n(obj2);
                        aVar.v = vo5Var;
                        aVar.w = obj;
                        aVar.x = uz4Var;
                        aVar.z = 1;
                        if (vo5Var.c(obj, aVar) == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        uz4Var = (uz4) aVar.x;
                        obj = aVar.w;
                        vo5Var = (vo5) aVar.v;
                        rp4.n(obj2);
                    }
                    return uz4Var.x();
                }
            }
            return uz4Var.x();
        } finally {
            z15.d(1);
            vo5Var.d(obj);
            z15.c(1);
        }
        aVar = new a(uv4Var);
        Object obj22 = aVar.y;
        Object h2 = gw4.h();
        i = aVar.z;
        if (i != 0) {
        }
    }

    private static final <T> Object p(vo5 vo5Var, Object obj, uz4<? extends T> uz4Var, uv4<? super T> uv4Var) {
        z15.e(0);
        vo5Var.c(obj, uv4Var);
        z15.e(1);
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            vo5Var.d(obj);
            z15.c(1);
        }
    }

    public static /* synthetic */ Object q(vo5 vo5Var, Object obj, uz4 uz4Var, uv4 uv4Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        z15.e(0);
        vo5Var.c(obj, uv4Var);
        z15.e(1);
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            vo5Var.d(obj);
            z15.c(1);
        }
    }
}