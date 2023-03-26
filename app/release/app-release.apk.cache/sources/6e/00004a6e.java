package com.p7700g.p99005;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@vo4(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0017J\u0014\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H'J\u001a\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H&J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH¦\u0002J\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR!\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000bX¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isEmpty", "isEmpty$annotations", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", com.anythink.expressad.d.a.b.dO, "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveOrNull", "tryReceive", "tryReceive-PtdJZtk", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface jh5<E> {

    /* compiled from: Channel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Channel.kt */
        @vo4(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JJ\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062$\u0010\u0007\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/ReceiveChannel$onReceiveOrNull$1", "Lkotlinx/coroutines/selects/SelectClause1;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.jh5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0200a implements lo5<E> {
            public final /* synthetic */ jh5<E> s;

            /* compiled from: Channel.kt */
            @mw4(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            @vo4(d1 = {"\u0000\b\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0006\b\u0001\u0010\u0002 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "R", "E", "it", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.p7700g.p99005.jh5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0201a extends vw4 implements j05<sg5<? extends E>, uv4<? super R>, Object> {
                public int w;
                public /* synthetic */ Object x;
                public final /* synthetic */ j05<E, uv4<? super R>, Object> y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0201a(j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var, uv4<? super C0201a> uv4Var) {
                    super(2, uv4Var);
                    this.y = j05Var;
                }

                @Nullable
                public final Object C3(@NotNull Object obj, @Nullable uv4<? super R> uv4Var) {
                    return ((C0201a) X(sg5.b(obj), uv4Var)).D1(yq4.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p7700g.p99005.hw4
                @Nullable
                public final Object D1(@NotNull Object obj) {
                    Object h = gw4.h();
                    int i = this.w;
                    if (i == 0) {
                        rp4.n(obj);
                        Object o = ((sg5) this.x).o();
                        Throwable f = sg5.f(o);
                        if (f == null) {
                            j05<E, uv4<? super R>, Object> j05Var = this.y;
                            Object h2 = sg5.h(o);
                            this.w = 1;
                            obj = j05Var.w3(h2, this);
                            if (obj == h) {
                                return h;
                            }
                        } else {
                            throw f;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                    }
                    return obj;
                }

                @Override // com.p7700g.p99005.hw4
                @NotNull
                public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
                    C0201a c0201a = new C0201a(this.y, uv4Var);
                    c0201a.x = obj;
                    return c0201a;
                }

                @Override // com.p7700g.p99005.j05
                public /* bridge */ /* synthetic */ Object w3(Object obj, Object obj2) {
                    return C3(((sg5) obj).o(), (uv4) obj2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0200a(jh5<? extends E> jh5Var) {
                this.s = jh5Var;
            }

            @Override // com.p7700g.p99005.lo5
            @zd5
            public <R> void i(@NotNull no5<? super R> no5Var, @NotNull j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var) {
                this.s.l().i(no5Var, new C0201a(j05Var, null));
            }
        }

        /* compiled from: Channel.kt */
        @mw4(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b<E> extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            public b(uv4<? super b> uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(jh5 jh5Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            jh5Var.b(cancellationException);
        }

        public static /* synthetic */ boolean c(jh5 jh5Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return jh5Var.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @NotNull
        public static <E> lo5<E> d(@NotNull jh5<? extends E> jh5Var) {
            return new C0200a(jh5Var);
        }

        @xn4(level = zn4.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @op4(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @td5
        public static /* synthetic */ void f() {
        }

        @td5
        public static /* synthetic */ void g() {
        }

        @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @op4(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E h(@NotNull jh5<? extends E> jh5Var) {
            Object q = jh5Var.q();
            if (sg5.m(q)) {
                return (E) sg5.i(q);
            }
            Throwable f = sg5.f(q);
            if (f == null) {
                return null;
            }
            throw zm5.p(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @fx4
        @xn4(level = zn4.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> Object i(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super E> uv4Var) {
            b bVar;
            int i;
            Object t;
            if (uv4Var instanceof b) {
                bVar = (b) uv4Var;
                int i2 = bVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.v;
                    Object h = gw4.h();
                    i = bVar.w;
                    if (i != 0) {
                        rp4.n(obj);
                        bVar.w = 1;
                        t = jh5Var.t(bVar);
                        if (t == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        rp4.n(obj);
                        t = ((sg5) obj).o();
                    }
                    return sg5.h(t);
                }
            }
            bVar = new b(uv4Var);
            Object obj2 = bVar.v;
            Object h2 = gw4.h();
            i = bVar.w;
            if (i != 0) {
            }
            return sg5.h(t);
        }
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @op4(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E C();

    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th);

    void b(@Nullable CancellationException cancellationException);

    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isEmpty();

    @NotNull
    qg5<E> iterator();

    boolean j();

    @NotNull
    lo5<E> k();

    @NotNull
    lo5<sg5<E>> l();

    @NotNull
    lo5<E> p();

    @NotNull
    Object q();

    @fx4
    @xn4(level = zn4.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    Object s(@NotNull uv4<? super E> uv4Var);

    @Nullable
    Object t(@NotNull uv4<? super sg5<? extends E>> uv4Var);

    @Nullable
    Object w(@NotNull uv4<? super E> uv4Var);
}