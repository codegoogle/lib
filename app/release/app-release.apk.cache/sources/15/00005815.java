package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TickerChannels.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class qh5 {

    /* compiled from: TickerChannels.kt */
    @mw4(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public long v;
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
            return qh5.c(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @mw4(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends kw4 {
        public long v;
        public long w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public b(uv4<? super b> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return qh5.d(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @mw4(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends vw4 implements j05<hh5<? super yq4>, uv4<? super yq4>, Object> {
        public final /* synthetic */ long A;
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ rh5 y;
        public final /* synthetic */ long z;

        /* compiled from: TickerChannels.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                rh5.values();
                int[] iArr = new int[2];
                iArr[rh5.FIXED_PERIOD.ordinal()] = 1;
                iArr[rh5.FIXED_DELAY.ordinal()] = 2;
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rh5 rh5Var, long j, long j2, uv4<? super c> uv4Var) {
            super(2, uv4Var);
            this.y = rh5Var;
            this.z = j;
            this.A = j2;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super yq4> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((c) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                hh5 hh5Var = (hh5) this.x;
                int ordinal = this.y.ordinal();
                if (ordinal == 0) {
                    long j = this.z;
                    long j2 = this.A;
                    nh5 c = hh5Var.c();
                    this.w = 1;
                    if (qh5.d(j, j2, c, this) == h) {
                        return h;
                    }
                } else if (ordinal == 1) {
                    long j3 = this.z;
                    long j4 = this.A;
                    nh5 c2 = hh5Var.c();
                    this.w = 2;
                    if (qh5.c(j3, j4, c2, this) == h) {
                        return h;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            c cVar = new c(this.y, this.z, this.A, uv4Var);
            cVar.x = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j, long j2, nh5<? super yq4> nh5Var, uv4<? super yq4> uv4Var) {
        a aVar;
        Object h;
        int i;
        nh5<? super yq4> nh5Var2;
        yq4 yq4Var;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.x;
                h = gw4.h();
                i = aVar.y;
                if (i != 0) {
                    rp4.n(obj);
                    aVar.w = nh5Var;
                    aVar.v = j;
                    aVar.y = 1;
                    if (wc5.b(j2, aVar) == h) {
                        return h;
                    }
                } else if (i == 1) {
                    j = aVar.v;
                    nh5Var = (nh5) aVar.w;
                    rp4.n(obj);
                } else if (i == 2) {
                    j = aVar.v;
                    nh5Var2 = (nh5) aVar.w;
                    rp4.n(obj);
                    aVar.w = nh5Var2;
                    aVar.v = j;
                    aVar.y = 3;
                    if (wc5.b(j, aVar) == h) {
                        return h;
                    }
                    nh5Var = nh5Var2;
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j = aVar.v;
                    nh5Var2 = (nh5) aVar.w;
                    rp4.n(obj);
                    nh5Var = nh5Var2;
                }
                yq4Var = yq4.a;
                aVar.w = nh5Var;
                aVar.v = j;
                aVar.y = 2;
                if (nh5Var.I(yq4Var, aVar) == h) {
                    return h;
                }
                nh5Var2 = nh5Var;
                aVar.w = nh5Var2;
                aVar.v = j;
                aVar.y = 3;
                if (wc5.b(j, aVar) == h) {
                }
                nh5Var = nh5Var2;
                yq4Var = yq4.a;
                aVar.w = nh5Var;
                aVar.v = j;
                aVar.y = 2;
                if (nh5Var.I(yq4Var, aVar) == h) {
                }
            }
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.x;
        h = gw4.h();
        i = aVar.y;
        if (i != 0) {
        }
        yq4Var = yq4.a;
        aVar.w = nh5Var;
        aVar.v = j;
        aVar.y = 2;
        if (nh5Var.I(yq4Var, aVar) == h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0108 -> B:18:0x0050). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x011f -> B:18:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(long j, long j2, nh5<? super yq4> nh5Var, uv4<? super yq4> uv4Var) {
        b bVar;
        Object h;
        int i;
        nh5<? super yq4> nh5Var2;
        long j3;
        long j4;
        long d;
        long j5;
        long j6;
        nh5<? super yq4> nh5Var3;
        long o;
        long c2;
        nh5<? super yq4> nh5Var4;
        yq4 yq4Var;
        if (uv4Var instanceof b) {
            bVar = (b) uv4Var;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                Object obj = bVar.y;
                h = gw4.h();
                i = bVar.z;
                if (i != 0) {
                    rp4.n(obj);
                    ra5 b2 = sa5.b();
                    Long g = b2 == null ? null : iw4.g(b2.b());
                    long nanoTime = (g == null ? System.nanoTime() : g.longValue()) + od5.d(j2);
                    nh5Var2 = nh5Var;
                    bVar.x = nh5Var2;
                    bVar.v = j;
                    bVar.w = nanoTime;
                    bVar.z = 1;
                    if (wc5.b(j2, bVar) == h) {
                        return h;
                    }
                    j3 = nanoTime;
                    j4 = j;
                } else if (i == 1) {
                    j3 = bVar.w;
                    j4 = bVar.v;
                    rp4.n(obj);
                    nh5Var2 = (nh5) bVar.x;
                } else if (i != 2) {
                    if (i == 3) {
                        j6 = bVar.w;
                        j5 = bVar.v;
                        nh5Var3 = (nh5) bVar.x;
                        rp4.n(obj);
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        j6 = bVar.w;
                        j5 = bVar.v;
                        nh5Var3 = (nh5) bVar.x;
                        rp4.n(obj);
                    }
                    long j7 = j6;
                    j3 = j5;
                    d = j7;
                    nh5Var4 = nh5Var3;
                    long j8 = j3 + d;
                    yq4Var = yq4.a;
                    bVar.x = nh5Var4;
                    bVar.v = j8;
                    bVar.w = d;
                    bVar.z = 2;
                    if (nh5Var4.I(yq4Var, bVar) == h) {
                        return h;
                    }
                    nh5Var3 = nh5Var4;
                    j6 = d;
                    j5 = j8;
                    ra5 b3 = sa5.b();
                    Long g2 = b3 != null ? null : iw4.g(b3.b());
                    long nanoTime2 = g2 != null ? System.nanoTime() : g2.longValue();
                    o = i55.o(j5 - nanoTime2, 0L);
                    if (o != 0 && j6 != 0) {
                        long j9 = j6 - ((nanoTime2 - j5) % j6);
                        j5 = nanoTime2 + j9;
                        long c3 = od5.c(j9);
                        bVar.x = nh5Var3;
                        bVar.v = j5;
                        bVar.w = j6;
                        bVar.z = 3;
                        if (wc5.b(c3, bVar) == h) {
                            return h;
                        }
                    } else {
                        c2 = od5.c(o);
                        bVar.x = nh5Var3;
                        bVar.v = j5;
                        bVar.w = j6;
                        bVar.z = 4;
                        if (wc5.b(c2, bVar) == h) {
                            return h;
                        }
                    }
                    long j72 = j6;
                    j3 = j5;
                    d = j72;
                    nh5Var4 = nh5Var3;
                    long j82 = j3 + d;
                    yq4Var = yq4.a;
                    bVar.x = nh5Var4;
                    bVar.v = j82;
                    bVar.w = d;
                    bVar.z = 2;
                    if (nh5Var4.I(yq4Var, bVar) == h) {
                    }
                } else {
                    j6 = bVar.w;
                    j5 = bVar.v;
                    nh5Var3 = (nh5) bVar.x;
                    rp4.n(obj);
                    ra5 b32 = sa5.b();
                    if (b32 != null) {
                    }
                    if (g2 != null) {
                    }
                    o = i55.o(j5 - nanoTime2, 0L);
                    if (o != 0) {
                    }
                    c2 = od5.c(o);
                    bVar.x = nh5Var3;
                    bVar.v = j5;
                    bVar.w = j6;
                    bVar.z = 4;
                    if (wc5.b(c2, bVar) == h) {
                    }
                    long j722 = j6;
                    j3 = j5;
                    d = j722;
                    nh5Var4 = nh5Var3;
                    long j822 = j3 + d;
                    yq4Var = yq4.a;
                    bVar.x = nh5Var4;
                    bVar.v = j822;
                    bVar.w = d;
                    bVar.z = 2;
                    if (nh5Var4.I(yq4Var, bVar) == h) {
                    }
                }
                d = od5.d(j4);
                nh5Var4 = nh5Var2;
                long j8222 = j3 + d;
                yq4Var = yq4.a;
                bVar.x = nh5Var4;
                bVar.v = j8222;
                bVar.w = d;
                bVar.z = 2;
                if (nh5Var4.I(yq4Var, bVar) == h) {
                }
            }
        }
        bVar = new b(uv4Var);
        Object obj2 = bVar.y;
        h = gw4.h();
        i = bVar.z;
        if (i != 0) {
        }
        d = od5.d(j4);
        nh5Var4 = nh5Var2;
        long j82222 = j3 + d;
        yq4Var = yq4.a;
        bVar.x = nh5Var4;
        bVar.v = j82222;
        bVar.w = d;
        bVar.z = 2;
        if (nh5Var4.I(yq4Var, bVar) == h) {
        }
    }

    @ve5
    @NotNull
    public static final jh5<yq4> e(long j, long j2, @NotNull xv4 xv4Var, @NotNull rh5 rh5Var) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return fh5.c(vd5.s, dd5.g().plus(xv4Var), 0, new c(rh5Var, j, j2, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    public static /* synthetic */ jh5 f(long j, long j2, xv4 xv4Var, rh5 rh5Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            xv4Var = zv4.s;
        }
        if ((i & 8) != 0) {
            rh5Var = rh5.FIXED_PERIOD;
        }
        return e(j, j2, xv4Var, rh5Var);
    }
}