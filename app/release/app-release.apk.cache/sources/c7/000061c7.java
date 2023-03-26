package com.p7700g.p99005;

import com.p7700g.p99005.jh5;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.common.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aC\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\n2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0015\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a'\u0010\u0017\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\t0\u001a\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"DEFAULT_CLOSE_MESSAGE", "", "cancelConsumed", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", "", "consume", "R", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class vg5 {

    /* compiled from: Channels.common.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a<E> extends kw4 {
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
            return vg5.e(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b<E> extends kw4 {
        public Object v;
        public Object w;
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
            return vg5.d(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<E> extends kw4 {
        public int A;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public c(uv4<? super c> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return tg5.g0(null, this);
        }
    }

    @np4
    public static final void a(@NotNull jh5<?> jh5Var, @Nullable Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = pd5.a("Channel was consumed, consumer had failed", th);
            }
        }
        jh5Var.b(r0);
    }

    @ve5
    public static final <E, R> R b(@NotNull jg5<E> jg5Var, @NotNull f05<? super jh5<? extends E>, ? extends R> f05Var) {
        jh5<E> z = jg5Var.z();
        try {
            return f05Var.M(z);
        } finally {
            z15.d(1);
            jh5.a.b(z, null, 1, null);
            z15.c(1);
        }
    }

    public static final <E, R> R c(@NotNull jh5<? extends E> jh5Var, @NotNull f05<? super jh5<? extends E>, ? extends R> f05Var) {
        try {
            R M = f05Var.M(jh5Var);
            z15.d(1);
            tg5.b(jh5Var, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:14:0x0038). Please submit an issue!!! */
    @ve5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object d(@NotNull jg5<E> jg5Var, @NotNull f05<? super E, yq4> f05Var, @NotNull uv4<? super yq4> uv4Var) {
        b bVar;
        int i;
        jh5<E> jh5Var;
        Throwable th;
        jh5<E> jh5Var2;
        qg5<E> it;
        Object a2;
        if (uv4Var instanceof b) {
            bVar = (b) uv4Var;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                Object obj = bVar.y;
                Object h = gw4.h();
                i = bVar.z;
                if (i != 0) {
                    rp4.n(obj);
                    jh5<E> z = jg5Var.z();
                    try {
                        jh5Var2 = z;
                        it = z.iterator();
                        bVar.v = f05Var;
                        bVar.w = jh5Var2;
                        bVar.x = it;
                        bVar.z = 1;
                        a2 = it.a(bVar);
                        if (a2 != h) {
                        }
                    } catch (Throwable th2) {
                        jh5Var = z;
                        th = th2;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5<E> qg5Var = (qg5) bVar.x;
                    jh5Var = (jh5) bVar.w;
                    f05<? super E, yq4> f05Var2 = (f05) bVar.v;
                    try {
                        rp4.n(obj);
                        b bVar2 = bVar;
                        jh5<E> jh5Var3 = jh5Var;
                        f05Var = f05Var2;
                        qg5<E> qg5Var2 = qg5Var;
                        Object obj2 = h;
                        b bVar3 = bVar2;
                        try {
                            if (!((Boolean) obj).booleanValue()) {
                                f05Var.M((Object) qg5Var2.next());
                                jh5Var2 = jh5Var3;
                                bVar = bVar3;
                                h = obj2;
                                it = qg5Var2;
                                try {
                                    bVar.v = f05Var;
                                    bVar.w = jh5Var2;
                                    bVar.x = it;
                                    bVar.z = 1;
                                    a2 = it.a(bVar);
                                    if (a2 != h) {
                                        return h;
                                    }
                                    bVar2 = bVar;
                                    jh5Var3 = jh5Var2;
                                    obj = a2;
                                    qg5Var2 = it;
                                    Object obj22 = h;
                                    b bVar32 = bVar2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        yq4 yq4Var = yq4.a;
                                        z15.d(1);
                                        jh5.a.b(jh5Var3, null, 1, null);
                                        z15.c(1);
                                        return yq4Var;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    jh5Var = jh5Var2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            jh5Var = jh5Var3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                z15.d(1);
                jh5.a.b(jh5Var, null, 1, null);
                z15.c(1);
                throw th;
            }
        }
        bVar = new b(uv4Var);
        Object obj3 = bVar.y;
        Object h2 = gw4.h();
        i = bVar.z;
        if (i != 0) {
        }
        z15.d(1);
        jh5.a.b(jh5Var, null, 1, null);
        z15.c(1);
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:37:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object e(@NotNull jh5<? extends E> jh5Var, @NotNull f05<? super E, yq4> f05Var, @NotNull uv4<? super yq4> uv4Var) {
        a aVar;
        int i;
        jh5<? extends E> jh5Var2;
        Throwable th;
        qg5<? extends E> it;
        f05<? super E, yq4> f05Var2;
        Object a2;
        if (uv4Var instanceof a) {
            aVar = (a) uv4Var;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                Object obj = aVar.y;
                Object h = gw4.h();
                i = aVar.z;
                if (i != 0) {
                    rp4.n(obj);
                    try {
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        f05Var2 = f05Var;
                        aVar.v = f05Var2;
                        aVar.w = jh5Var2;
                        aVar.x = it;
                        aVar.z = 1;
                        a2 = it.a(aVar);
                        if (a2 != h) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5<? extends E> qg5Var = (qg5) aVar.x;
                    jh5Var2 = (jh5) aVar.w;
                    f05<? super E, yq4> f05Var3 = (f05) aVar.v;
                    try {
                        rp4.n(obj);
                        qg5<? extends E> qg5Var2 = qg5Var;
                        if (!((Boolean) obj).booleanValue()) {
                            f05Var3.M((Object) qg5Var2.next());
                            f05Var2 = f05Var3;
                            it = qg5Var2;
                            aVar.v = f05Var2;
                            aVar.w = jh5Var2;
                            aVar.x = it;
                            aVar.z = 1;
                            a2 = it.a(aVar);
                            if (a2 != h) {
                                return h;
                            }
                            f05Var3 = f05Var2;
                            obj = a2;
                            qg5Var2 = it;
                            if (!((Boolean) obj).booleanValue()) {
                                yq4 yq4Var = yq4.a;
                                z15.d(1);
                                tg5.b(jh5Var2, null);
                                z15.c(1);
                                return yq4Var;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            z15.d(1);
                            tg5.b(jh5Var2, th);
                            z15.c(1);
                            throw th4;
                        }
                    }
                }
            }
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.y;
        Object h2 = gw4.h();
        i = aVar.z;
        if (i != 0) {
        }
    }

    @ve5
    private static final <E> Object f(jg5<E> jg5Var, f05<? super E, yq4> f05Var, uv4<? super yq4> uv4Var) {
        jh5<E> z = jg5Var.z();
        try {
            qg5<E> it = z.iterator();
            while (true) {
                z15.e(3);
                z15.e(0);
                Object a2 = it.a(null);
                z15.e(1);
                if (!((Boolean) a2).booleanValue()) {
                    return yq4.a;
                }
                f05Var.M(it.next());
            }
        } finally {
            z15.d(1);
            jh5.a.b(z, null, 1, null);
            z15.c(1);
        }
    }

    private static final <E> Object g(jh5<? extends E> jh5Var, f05<? super E, yq4> f05Var, uv4<? super yq4> uv4Var) {
        try {
            qg5<? extends E> it = jh5Var.iterator();
            while (true) {
                z15.e(3);
                z15.e(0);
                Object a2 = it.a(null);
                z15.e(1);
                if (!((Boolean) a2).booleanValue()) {
                    yq4 yq4Var = yq4.a;
                    z15.d(1);
                    tg5.b(jh5Var, null);
                    z15.c(1);
                    return yq4Var;
                }
                f05Var.M((E) it.next());
            }
        } finally {
        }
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> lo5<E> h(@NotNull jh5<? extends E> jh5Var) {
        return (lo5<? extends E>) jh5Var.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object i(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super E> uv4Var) {
        return jh5Var.s(uv4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:26:0x0068, B:28:0x0070, B:29:0x0079), top: B:44:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:26:0x0068, B:28:0x0070, B:29:0x0079), top: B:44:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object j(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super List<? extends E>> uv4Var) {
        c cVar;
        int i;
        jh5<? extends E> jh5Var2;
        Throwable th;
        List list;
        qg5<? extends E> it;
        List list2;
        Object a2;
        if (uv4Var instanceof c) {
            cVar = (c) uv4Var;
            int i2 = cVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.A = i2 - Integer.MIN_VALUE;
                Object obj = cVar.z;
                Object h = gw4.h();
                i = cVar.A;
                if (i != 0) {
                    rp4.n(obj);
                    try {
                        List j = is4.j();
                        list = j;
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        list2 = j;
                        cVar.v = list;
                        cVar.w = list2;
                        cVar.x = jh5Var2;
                        cVar.y = it;
                        cVar.A = 1;
                        a2 = it.a(cVar);
                        if (a2 != h) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5<? extends E> qg5Var = (qg5) cVar.y;
                    jh5<? extends E> jh5Var3 = (jh5) cVar.x;
                    List list3 = (List) cVar.w;
                    list = (List) cVar.v;
                    try {
                        rp4.n(obj);
                        List list4 = list3;
                        qg5<? extends E> qg5Var2 = qg5Var;
                        if (!((Boolean) obj).booleanValue()) {
                            list4.add(qg5Var2.next());
                            jh5Var2 = jh5Var3;
                            list2 = list4;
                            it = qg5Var2;
                            try {
                                cVar.v = list;
                                cVar.w = list2;
                                cVar.x = jh5Var2;
                                cVar.y = it;
                                cVar.A = 1;
                                a2 = it.a(cVar);
                                if (a2 != h) {
                                    return h;
                                }
                                jh5Var3 = jh5Var2;
                                obj = a2;
                                list4 = list2;
                                qg5Var2 = it;
                                if (!((Boolean) obj).booleanValue()) {
                                    yq4 yq4Var = yq4.a;
                                    tg5.b(jh5Var3, null);
                                    return is4.b(list);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    tg5.b(jh5Var2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        jh5Var2 = jh5Var3;
                        throw th;
                    }
                }
            }
        }
        cVar = new c(uv4Var);
        Object obj2 = cVar.z;
        Object h2 = gw4.h();
        i = cVar.A;
        if (i != 0) {
        }
    }
}