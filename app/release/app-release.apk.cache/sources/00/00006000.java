package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import com.p7700g.p99005.sg5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Channels.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"sendBlocking", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "trySendBlocking", "Lkotlinx/coroutines/channels/ChannelResult;", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ug5 {

    /* compiled from: Channels.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<lc5, uv4<? super yq4>, Object> {
        public int w;
        public final /* synthetic */ nh5<E> x;
        public final /* synthetic */ E y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(nh5<? super E> nh5Var, E e, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.x = nh5Var;
            this.y = e;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                nh5<E> nh5Var = this.x;
                E e = this.y;
                this.w = 1;
                if (nh5Var.I(e, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new a(this.x, this.y, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super yq4> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    /* compiled from: Channels.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends vw4 implements j05<lc5, uv4<? super sg5<? extends yq4>>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ nh5<E> y;
        public final /* synthetic */ E z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(nh5<? super E> nh5Var, E e, uv4<? super b> uv4Var) {
            super(2, uv4Var);
            this.y = nh5Var;
            this.z = e;
        }

        @Nullable
        public final Object C3(@NotNull lc5 lc5Var, @Nullable uv4<? super sg5<yq4>> uv4Var) {
            return ((b) X(lc5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object b;
            Object h = gw4.h();
            int i = this.w;
            try {
                if (i == 0) {
                    rp4.n(obj);
                    lc5 lc5Var = (lc5) this.x;
                    nh5<E> nh5Var = this.y;
                    E e = this.z;
                    qp4.a aVar = qp4.s;
                    this.w = 1;
                    if (nh5Var.I(e, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                b = qp4.b(yq4.a);
            } catch (Throwable th) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th));
            }
            return sg5.b(qp4.m(b) ? sg5.a.c(yq4.a) : sg5.a.a(qp4.e(b)));
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            b bVar = new b(this.y, this.z, uv4Var);
            bVar.x = obj;
            return bVar;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ Object w3(lc5 lc5Var, uv4<? super sg5<? extends yq4>> uv4Var) {
            return C3(lc5Var, uv4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @op4(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@NotNull nh5<? super E> nh5Var, E e) {
        if (sg5.m(nh5Var.F(e))) {
            return;
        }
        ab5.b(null, new a(nh5Var, e, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object b(@NotNull nh5<? super E> nh5Var, E e) {
        Object b2;
        Object F = nh5Var.F(e);
        if (F instanceof sg5.c) {
            b2 = ab5.b(null, new b(nh5Var, e, null), 1, null);
            return ((sg5) b2).o();
        }
        yq4 yq4Var = (yq4) F;
        return sg5.a.c(yq4.a);
    }
}