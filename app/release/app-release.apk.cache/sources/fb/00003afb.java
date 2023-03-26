package com.p7700g.p99005;

import com.p7700g.p99005.gb5;
import com.p7700g.p99005.hm5;
import com.p7700g.p99005.og5;
import com.p7700g.p99005.qg5;
import com.p7700g.p99005.qp4;
import com.p7700g.p99005.sg5;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@vo4(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", com.anythink.expressad.d.a.b.dO, "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class bg5<E> extends dg5<E> implements og5<E> {

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<E> implements qg5<E> {
        @cz4
        @NotNull
        public final bg5<E> a;
        @Nullable
        private Object b = cg5.f;

        public a(@NotNull bg5<E> bg5Var) {
            this.a = bg5Var;
        }

        private final boolean e(Object obj) {
            if (obj instanceof xg5) {
                xg5 xg5Var = (xg5) obj;
                if (xg5Var.v == null) {
                    return false;
                }
                throw zm5.p(xg5Var.K0());
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(uv4<? super Boolean> uv4Var) {
            hb5 b = jb5.b(fw4.d(uv4Var));
            d dVar = new d(this, b);
            while (true) {
                if (this.a.d0(dVar)) {
                    this.a.s0(b, dVar);
                    break;
                }
                Object o0 = this.a.o0();
                g(o0);
                if (o0 instanceof xg5) {
                    xg5 xg5Var = (xg5) o0;
                    if (xg5Var.v == null) {
                        qp4.a aVar = qp4.s;
                        b.u(qp4.b(iw4.a(false)));
                    } else {
                        qp4.a aVar2 = qp4.s;
                        b.u(qp4.b(rp4.a(xg5Var.K0())));
                    }
                } else if (o0 != cg5.f) {
                    Boolean a = iw4.a(true);
                    f05<E, yq4> f05Var = this.a.t;
                    b.V(a, f05Var == null ? null : rm5.a(f05Var, o0, b.getContext()));
                }
            }
            Object x = b.x();
            if (x == gw4.h()) {
                ow4.c(uv4Var);
            }
            return x;
        }

        @Override // com.p7700g.p99005.qg5
        @Nullable
        public Object a(@NotNull uv4<? super Boolean> uv4Var) {
            Object d = d();
            an5 an5Var = cg5.f;
            if (d != an5Var) {
                return iw4.a(e(d()));
            }
            g(this.a.o0());
            return d() != an5Var ? iw4.a(e(d())) : f(uv4Var);
        }

        @Override // com.p7700g.p99005.qg5
        @fz4(name = "next")
        @xn4(level = zn4.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object b(uv4 uv4Var) {
            return qg5.a.a(this, uv4Var);
        }

        @Nullable
        public final Object d() {
            return this.b;
        }

        public final void g(@Nullable Object obj) {
            this.b = obj;
        }

        @Override // com.p7700g.p99005.qg5
        public E next() {
            E e = (E) this.b;
            if (!(e instanceof xg5)) {
                an5 an5Var = cg5.f;
                if (e != an5Var) {
                    this.b = an5Var;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw zm5.p(((xg5) e).K0());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class b<E> extends ih5<E> {
        @cz4
        @NotNull
        public final gb5<Object> v;
        @cz4
        public final int w;

        public b(@NotNull gb5<Object> gb5Var, int i) {
            this.v = gb5Var;
            this.w = i;
        }

        @Override // com.p7700g.p99005.kh5
        public void A(E e) {
            this.v.w0(ib5.d);
        }

        @Override // com.p7700g.p99005.kh5
        @Nullable
        public an5 F(E e, @Nullable hm5.d dVar) {
            if (this.v.N(G0(e), dVar == null ? null : dVar.c, E0(e)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return ib5.d;
        }

        @Override // com.p7700g.p99005.ih5
        public void F0(@NotNull xg5<?> xg5Var) {
            if (this.w == 1) {
                gb5<Object> gb5Var = this.v;
                qp4.a aVar = qp4.s;
                gb5Var.u(qp4.b(sg5.b(sg5.a.a(xg5Var.v))));
                return;
            }
            gb5<Object> gb5Var2 = this.v;
            qp4.a aVar2 = qp4.s;
            gb5Var2.u(qp4.b(rp4.a(xg5Var.K0())));
        }

        @Nullable
        public final Object G0(E e) {
            return this.w == 1 ? sg5.b(sg5.a.c(e)) : e;
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("ReceiveElement@");
            G.append(qc5.b(this));
            G.append("[receiveMode=");
            return wo1.y(G, this.w, f14.v);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<E> extends b<E> {
        @cz4
        @NotNull
        public final f05<E, yq4> x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull gb5<Object> gb5Var, int i, @NotNull f05<? super E, yq4> f05Var) {
            super(gb5Var, i);
            this.x = f05Var;
        }

        @Override // com.p7700g.p99005.ih5
        @Nullable
        public f05<Throwable, yq4> E0(E e) {
            return rm5.a(this.x, e, this.v.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class d<E> extends ih5<E> {
        @cz4
        @NotNull
        public final a<E> v;
        @cz4
        @NotNull
        public final gb5<Boolean> w;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull a<E> aVar, @NotNull gb5<? super Boolean> gb5Var) {
            this.v = aVar;
            this.w = gb5Var;
        }

        @Override // com.p7700g.p99005.kh5
        public void A(E e) {
            this.v.g(e);
            this.w.w0(ib5.d);
        }

        @Override // com.p7700g.p99005.ih5
        @Nullable
        public f05<Throwable, yq4> E0(E e) {
            f05<E, yq4> f05Var = this.v.a.t;
            if (f05Var == null) {
                return null;
            }
            return rm5.a(f05Var, e, this.w.getContext());
        }

        @Override // com.p7700g.p99005.kh5
        @Nullable
        public an5 F(E e, @Nullable hm5.d dVar) {
            if (this.w.N(Boolean.TRUE, dVar == null ? null : dVar.c, E0(e)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return ib5.d;
        }

        @Override // com.p7700g.p99005.ih5
        public void F0(@NotNull xg5<?> xg5Var) {
            Object J;
            if (xg5Var.v == null) {
                J = gb5.a.b(this.w, Boolean.FALSE, null, 2, null);
            } else {
                J = this.w.J(xg5Var.K0());
            }
            if (J != null) {
                this.v.g(xg5Var);
                this.w.w0(J);
            }
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            return c25.C("ReceiveHasNext@", qc5.b(this));
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e<R, E> extends ih5<E> implements gd5 {
        @cz4
        @NotNull
        public final bg5<E> v;
        @cz4
        @NotNull
        public final no5<R> w;
        @cz4
        @NotNull
        public final j05<Object, uv4<? super R>, Object> x;
        @cz4
        public final int y;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull bg5<E> bg5Var, @NotNull no5<? super R> no5Var, @NotNull j05<Object, ? super uv4<? super R>, ? extends Object> j05Var, int i) {
            this.v = bg5Var;
            this.w = no5Var;
            this.x = j05Var;
            this.y = i;
        }

        @Override // com.p7700g.p99005.kh5
        public void A(E e) {
            on5.e(this.x, this.y == 1 ? sg5.b(sg5.a.c(e)) : e, this.w.y(), E0(e));
        }

        @Override // com.p7700g.p99005.ih5
        @Nullable
        public f05<Throwable, yq4> E0(E e) {
            f05<E, yq4> f05Var = this.v.t;
            if (f05Var == null) {
                return null;
            }
            return rm5.a(f05Var, e, this.w.y().getContext());
        }

        @Override // com.p7700g.p99005.kh5
        @Nullable
        public an5 F(E e, @Nullable hm5.d dVar) {
            return (an5) this.w.j(dVar);
        }

        @Override // com.p7700g.p99005.ih5
        public void F0(@NotNull xg5<?> xg5Var) {
            if (this.w.p()) {
                int i = this.y;
                if (i == 0) {
                    this.w.C(xg5Var.K0());
                } else if (i != 1) {
                } else {
                    on5.f(this.x, sg5.b(sg5.a.a(xg5Var.v)), this.w.y(), null, 4, null);
                }
            }
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("ReceiveSelect@");
            G.append(qc5.b(this));
            G.append(f14.u);
            G.append(this.w);
            G.append(",receiveMode=");
            return wo1.y(G, this.y, f14.v);
        }

        @Override // com.p7700g.p99005.gd5
        public void w() {
            if (u0()) {
                this.v.m0();
            }
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class f extends wa5 {
        @NotNull
        private final ih5<?> s;

        public f(@NotNull ih5<?> ih5Var) {
            this.s = ih5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.fb5
        public void a(@Nullable Throwable th) {
            if (this.s.u0()) {
                bg5.this.m0();
            }
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("RemoveReceiveOnCancel[");
            G.append(this.s);
            G.append(f14.v);
            return G.toString();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "onRemoved", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g<E> extends hm5.e<mh5> {
        public g(@NotNull fm5 fm5Var) {
            super(fm5Var);
        }

        @Override // com.p7700g.p99005.hm5.e, com.p7700g.p99005.hm5.a
        @Nullable
        public Object e(@NotNull hm5 hm5Var) {
            if (hm5Var instanceof xg5) {
                return hm5Var;
            }
            if (hm5Var instanceof mh5) {
                return null;
            }
            return cg5.f;
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public Object j(@NotNull hm5.d dVar) {
            an5 G0 = ((mh5) dVar.a).G0(dVar);
            if (G0 == null) {
                return im5.a;
            }
            Object obj = ll5.b;
            if (G0 == obj) {
                return obj;
            }
            return null;
        }

        @Override // com.p7700g.p99005.hm5.a
        public void k(@NotNull hm5 hm5Var) {
            ((mh5) hm5Var).H0();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends hm5.c {
        public final /* synthetic */ hm5 d;
        public final /* synthetic */ bg5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(hm5 hm5Var, bg5 bg5Var) {
            super(hm5Var);
            this.d = hm5Var;
            this.e = bg5Var;
        }

        @Override // com.p7700g.p99005.ml5
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull hm5 hm5Var) {
            if (this.e.i0()) {
                return null;
            }
            return gm5.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JH\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$onReceive$1", "Lkotlinx/coroutines/selects/SelectClause1;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements lo5<E> {
        public final /* synthetic */ bg5<E> s;

        public i(bg5<E> bg5Var) {
            this.s = bg5Var;
        }

        @Override // com.p7700g.p99005.lo5
        public <R> void i(@NotNull no5<? super R> no5Var, @NotNull j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var) {
            this.s.r0(no5Var, 0, j05Var);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @vo4(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JQ\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$onReceiveCatching$1", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlinx/coroutines/channels/ChannelResult;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements lo5<sg5<? extends E>> {
        public final /* synthetic */ bg5<E> s;

        public j(bg5<E> bg5Var) {
            this.s = bg5Var;
        }

        @Override // com.p7700g.p99005.lo5
        public <R> void i(@NotNull no5<? super R> no5Var, @NotNull j05<? super sg5<? extends E>, ? super uv4<? super R>, ? extends Object> j05Var) {
            this.s.r0(no5Var, 1, j05Var);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @mw4(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends kw4 {
        public /* synthetic */ Object v;
        public final /* synthetic */ bg5<E> w;
        public int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(bg5<E> bg5Var, uv4<? super k> uv4Var) {
            super(uv4Var);
            this.w = bg5Var;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            Object t = this.w.t(this);
            return t == gw4.h() ? t : sg5.b(t);
        }
    }

    public bg5(@Nullable f05<? super E, yq4> f05Var) {
        super(f05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d0(ih5<? super E> ih5Var) {
        boolean e0 = e0(ih5Var);
        if (e0) {
            n0();
        }
        return e0;
    }

    private final <R> boolean f0(no5<? super R> no5Var, j05<Object, ? super uv4<? super R>, ? extends Object> j05Var, int i2) {
        e eVar = new e(this, no5Var, j05Var, i2);
        boolean d0 = d0(eVar);
        if (d0) {
            no5Var.K(eVar);
        }
        return d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.p7700g.p99005.bg5$b] */
    public final <R> Object q0(int i2, uv4<? super R> uv4Var) {
        c cVar;
        hb5 b2 = jb5.b(fw4.d(uv4Var));
        if (this.t == null) {
            cVar = new b(b2, i2);
        } else {
            cVar = new c(b2, i2, this.t);
        }
        while (true) {
            if (d0(cVar)) {
                s0(b2, cVar);
                break;
            }
            Object o0 = o0();
            if (o0 instanceof xg5) {
                cVar.F0((xg5) o0);
                break;
            } else if (o0 != cg5.f) {
                b2.V(cVar.G0(o0), cVar.E0(o0));
                break;
            }
        }
        Object x = b2.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void r0(no5<? super R> no5Var, int i2, j05<Object, ? super uv4<? super R>, ? extends Object> j05Var) {
        while (!no5Var.v()) {
            if (j0()) {
                if (f0(no5Var, j05Var, i2)) {
                    return;
                }
            } else {
                Object p0 = p0(no5Var);
                if (p0 == oo5.d()) {
                    return;
                }
                if (p0 != cg5.f && p0 != ll5.b) {
                    t0(j05Var, no5Var, i2, p0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(gb5<?> gb5Var, ih5<?> ih5Var) {
        gb5Var.D(new f(ih5Var));
    }

    private final <R> void t0(j05<Object, ? super uv4<? super R>, ? extends Object> j05Var, no5<? super R> no5Var, int i2, Object obj) {
        boolean z = obj instanceof xg5;
        if (!z) {
            if (i2 == 1) {
                sg5.b bVar = sg5.a;
                pn5.d(j05Var, sg5.b(z ? bVar.a(((xg5) obj).v) : bVar.c(obj)), no5Var.y());
                return;
            }
            pn5.d(j05Var, obj, no5Var.y());
        } else if (i2 != 0) {
            if (i2 == 1 && no5Var.p()) {
                pn5.d(j05Var, sg5.b(sg5.a.a(((xg5) obj).v)), no5Var.y());
            }
        } else {
            throw zm5.p(((xg5) obj).K0());
        }
    }

    @Override // com.p7700g.p99005.jh5
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @op4(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E C() {
        return (E) og5.a.d(this);
    }

    @Override // com.p7700g.p99005.dg5
    @Nullable
    public kh5<E> V() {
        kh5<E> V = super.V();
        if (V != null && !(V instanceof xg5)) {
            m0();
        }
        return V;
    }

    @Override // com.p7700g.p99005.jh5
    public final void b(@Nullable CancellationException cancellationException) {
        if (j()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(c25.C(qc5.a(this), " was cancelled"));
        }
        a(cancellationException);
    }

    @Override // com.p7700g.p99005.jh5
    /* renamed from: b0 */
    public final boolean a(@Nullable Throwable th) {
        boolean x = x(th);
        k0(x);
        return x;
    }

    @NotNull
    public final g<E> c0() {
        return new g<>(A());
    }

    @Override // com.p7700g.p99005.jh5
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    public boolean e0(@NotNull ih5<? super E> ih5Var) {
        int B0;
        hm5 o0;
        if (h0()) {
            hm5 A = A();
            do {
                o0 = A.o0();
                if (!(!(o0 instanceof mh5))) {
                    return false;
                }
            } while (!o0.f0(ih5Var, A));
        } else {
            hm5 A2 = A();
            h hVar = new h(ih5Var, this);
            do {
                hm5 o02 = A2.o0();
                if (!(!(o02 instanceof mh5))) {
                    return false;
                }
                B0 = o02.B0(ih5Var, A2, hVar);
                if (B0 != 1) {
                }
            } while (B0 != 2);
            return false;
        }
        return true;
    }

    public final boolean g0() {
        return A().n0() instanceof kh5;
    }

    public abstract boolean h0();

    public abstract boolean i0();

    @Override // com.p7700g.p99005.jh5
    public boolean isEmpty() {
        return j0();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public final qg5<E> iterator() {
        return new a(this);
    }

    @Override // com.p7700g.p99005.jh5
    public boolean j() {
        return u() != null && i0();
    }

    public final boolean j0() {
        return !(A().n0() instanceof mh5) && i0();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public final lo5<E> k() {
        return new i(this);
    }

    public void k0(boolean z) {
        xg5<?> y = y();
        if (y != null) {
            Object c2 = zl5.c(null, 1, null);
            while (true) {
                hm5 o0 = y.o0();
                if (o0 instanceof fm5) {
                    l0(c2, y);
                    return;
                } else if (!o0.u0()) {
                    o0.p0();
                } else {
                    c2 = zl5.h(c2, (mh5) o0);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public final lo5<sg5<E>> l() {
        return new j(this);
    }

    public void l0(@NotNull Object obj, @NotNull xg5<?> xg5Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((mh5) obj).F0(xg5Var);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((mh5) arrayList.get(size)).F0(xg5Var);
            if (i2 < 0) {
                return;
            }
            size = i2;
        }
    }

    public void m0() {
    }

    public void n0() {
    }

    @Nullable
    public Object o0() {
        while (true) {
            mh5 W = W();
            if (W == null) {
                return cg5.f;
            }
            if (W.G0(null) != null) {
                W.D0();
                return W.E0();
            }
            W.H0();
        }
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public lo5<E> p() {
        return og5.a.b(this);
    }

    @Nullable
    public Object p0(@NotNull no5<?> no5Var) {
        g<E> c0 = c0();
        Object E = no5Var.E(c0);
        if (E != null) {
            return E;
        }
        c0.o().D0();
        return c0.o().E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.jh5
    @NotNull
    public final Object q() {
        Object o0 = o0();
        return o0 == cg5.f ? sg5.a.b() : o0 instanceof xg5 ? sg5.a.a(((xg5) o0).v) : sg5.a.c(o0);
    }

    @Override // com.p7700g.p99005.jh5
    @fx4
    @xn4(level = zn4.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object s(@NotNull uv4<? super E> uv4Var) {
        return og5.a.e(this, uv4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.p7700g.p99005.jh5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull uv4<? super sg5<? extends E>> uv4Var) {
        k kVar;
        int i2;
        if (uv4Var instanceof k) {
            kVar = (k) uv4Var;
            int i3 = kVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.x = i3 - Integer.MIN_VALUE;
                Object obj = kVar.v;
                Object h2 = gw4.h();
                i2 = kVar.x;
                if (i2 != 0) {
                    rp4.n(obj);
                    Object o0 = o0();
                    if (o0 != cg5.f) {
                        return o0 instanceof xg5 ? sg5.a.a(((xg5) o0).v) : sg5.a.c(o0);
                    }
                    kVar.x = 1;
                    obj = q0(1, kVar);
                    if (obj == h2) {
                        return h2;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return ((sg5) obj).o();
            }
        }
        kVar = new k(this, uv4Var);
        Object obj2 = kVar.v;
        Object h22 = gw4.h();
        i2 = kVar.x;
        if (i2 != 0) {
        }
        return ((sg5) obj2).o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.jh5
    @Nullable
    public final Object w(@NotNull uv4<? super E> uv4Var) {
        Object o0 = o0();
        return (o0 == cg5.f || (o0 instanceof xg5)) ? q0(0, uv4Var) : o0;
    }
}