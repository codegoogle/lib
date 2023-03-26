package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "next0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface qg5<E> {

    /* compiled from: Channel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Channel.kt */
        @mw4(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.qg5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0231a<E> extends kw4 {
            public Object v;
            public /* synthetic */ Object w;
            public int x;

            public C0231a(uv4<? super C0231a> uv4Var) {
                super(uv4Var);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.w = obj;
                this.x |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        @fz4(name = "next")
        @xn4(level = zn4.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object a(qg5 qg5Var, uv4 uv4Var) {
            C0231a c0231a;
            Object obj;
            int i;
            if (uv4Var instanceof C0231a) {
                c0231a = (C0231a) uv4Var;
                int i2 = c0231a.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0231a.x = i2 - Integer.MIN_VALUE;
                    obj = c0231a.w;
                    Object h = gw4.h();
                    i = c0231a.x;
                    if (i != 0) {
                        rp4.n(obj);
                        c0231a.v = qg5Var;
                        c0231a.x = 1;
                        obj = qg5Var.a(c0231a);
                        if (obj == h) {
                            return h;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        qg5Var = (qg5) c0231a.v;
                        rp4.n(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return qg5Var.next();
                    }
                    throw new yg5(tg5.a);
                }
            }
            c0231a = new C0231a(uv4Var);
            obj = c0231a.w;
            Object h2 = gw4.h();
            i = c0231a.x;
            if (i != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Nullable
    Object a(@NotNull uv4<? super Boolean> uv4Var);

    @fz4(name = "next")
    @xn4(level = zn4.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object b(uv4 uv4Var);

    E next();
}