package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ti5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements pi5<T> {
        public final /* synthetic */ jg5 s;

        public a(jg5 jg5Var) {
            this.s = jg5Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super T> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object l0 = ri5.l0(qi5Var, this.s.z(), uv4Var);
            return l0 == gw4.h() ? l0 : yq4.a;
        }
    }

    /* compiled from: Channels.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<T> extends kw4 {
        public Object v;
        public Object w;
        public boolean x;
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
            return ti5.e(null, null, false, this);
        }
    }

    @xn4(level = zn4.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> pi5<T> b(@NotNull jg5<T> jg5Var) {
        return new a(jg5Var);
    }

    @NotNull
    public static final <T> pi5<T> c(@NotNull jh5<? extends T> jh5Var) {
        return new li5(jh5Var, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object d(@NotNull qi5<? super T> qi5Var, @NotNull jh5<? extends T> jh5Var, @NotNull uv4<? super yq4> uv4Var) {
        Object e = e(qi5Var, jh5Var, true, uv4Var);
        return e == gw4.h() ? e : yq4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object e(qi5<? super T> qi5Var, jh5<? extends T> jh5Var, boolean z, uv4<? super yq4> uv4Var) {
        b bVar;
        int i;
        Object obj;
        qi5 qi5Var2;
        boolean z2;
        try {
            if (uv4Var instanceof b) {
                bVar = (b) uv4Var;
                int i2 = bVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.z = i2 - Integer.MIN_VALUE;
                    Object obj2 = bVar.y;
                    Object h = gw4.h();
                    i = bVar.z;
                    if (i != 0) {
                        rp4.n(obj2);
                        ri5.o0(qi5Var);
                        z2 = z;
                        bVar.v = qi5Var;
                        bVar.w = jh5Var;
                        bVar.x = z2;
                        bVar.z = 1;
                        obj = jh5Var.t(bVar);
                        if (obj == h) {
                        }
                    } else if (i == 1) {
                        qi5Var = (qi5<? super T>) bVar.x;
                        jh5Var = (jh5) bVar.w;
                        qi5 qi5Var3 = (qi5) bVar.v;
                        rp4.n(obj2);
                        obj = ((sg5) obj2).o();
                        qi5Var2 = qi5Var3;
                        if (!sg5.k(obj)) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        qi5Var = (qi5<? super T>) bVar.x;
                        jh5Var = (jh5) bVar.w;
                        qi5<? super T> qi5Var4 = (qi5) bVar.v;
                        rp4.n(obj2);
                        qi5<? super T> qi5Var5 = qi5Var4;
                        qi5<? super T> qi5Var6 = qi5Var5;
                        z2 = qi5Var;
                        qi5Var = qi5Var6;
                        try {
                            bVar.v = qi5Var;
                            bVar.w = jh5Var;
                            bVar.x = z2;
                            bVar.z = 1;
                            obj = jh5Var.t(bVar);
                            if (obj == h) {
                                return h;
                            }
                            qi5<? super T> qi5Var7 = z2;
                            qi5Var2 = qi5Var;
                            qi5Var = qi5Var7;
                            if (!sg5.k(obj)) {
                                Throwable f = sg5.f(obj);
                                if (f == null) {
                                    if (qi5Var != null) {
                                        tg5.b(jh5Var, null);
                                    }
                                    return yq4.a;
                                }
                                throw f;
                            }
                            Object i3 = sg5.i(obj);
                            bVar.v = qi5Var2;
                            bVar.w = jh5Var;
                            bVar.x = (boolean) qi5Var;
                            bVar.z = 2;
                            Object b2 = qi5Var2.b(i3, bVar);
                            qi5Var5 = qi5Var2;
                            if (b2 == h) {
                                return h;
                            }
                            qi5<? super T> qi5Var62 = qi5Var5;
                            z2 = qi5Var;
                            qi5Var = qi5Var62;
                            bVar.v = qi5Var;
                            bVar.w = jh5Var;
                            bVar.x = z2;
                            bVar.z = 1;
                            obj = jh5Var.t(bVar);
                            if (obj == h) {
                            }
                        } catch (Throwable th) {
                            qi5<? super T> qi5Var8 = z2;
                            th = th;
                            qi5Var = qi5Var8;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                if (qi5Var != null) {
                                    tg5.b(jh5Var, th);
                                }
                                throw th2;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        bVar = new b(uv4Var);
        Object obj22 = bVar.y;
        Object h2 = gw4.h();
        i = bVar.z;
    }

    @ud5
    @NotNull
    public static final <T> jh5<T> f(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var) {
        return mk5.b(pi5Var).l(lc5Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull jh5<? extends T> jh5Var) {
        return new li5(jh5Var, false, null, 0, null, 28, null);
    }
}