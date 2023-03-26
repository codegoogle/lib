package com.p7700g.p99005;

import com.p7700g.p99005.dg5;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinkedListChannel.kt */
@vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class eh5<E> extends bg5<E> {
    public eh5(@Nullable f05<? super E, yq4> f05Var) {
        super(f05Var);
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean M() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean N() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object P(E e) {
        kh5<?> T;
        do {
            Object P = super.P(e);
            an5 an5Var = cg5.d;
            if (P == an5Var) {
                return an5Var;
            }
            if (P == cg5.e) {
                T = T(e);
                if (T == null) {
                    return an5Var;
                }
            } else if (P instanceof xg5) {
                return P;
            } else {
                throw new IllegalStateException(c25.C("Invalid offerInternal result ", P).toString());
            }
        } while (!(T instanceof xg5));
        return T;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object Q(E e, @NotNull no5<?> no5Var) {
        Object E;
        while (true) {
            if (g0()) {
                E = super.Q(e, no5Var);
            } else {
                E = no5Var.E(m(e));
                if (E == null) {
                    E = cg5.d;
                }
            }
            if (E == oo5.d()) {
                return oo5.d();
            }
            an5 an5Var = cg5.d;
            if (E == an5Var) {
                return an5Var;
            }
            if (E != cg5.e && E != ll5.b) {
                if (E instanceof xg5) {
                    return E;
                }
                throw new IllegalStateException(c25.C("Invalid result ", E).toString());
            }
        }
    }

    @Override // com.p7700g.p99005.bg5
    public final boolean h0() {
        return true;
    }

    @Override // com.p7700g.p99005.bg5
    public final boolean i0() {
        return true;
    }

    @Override // com.p7700g.p99005.bg5
    public void l0(@NotNull Object obj, @NotNull xg5<?> xg5Var) {
        mn5 mn5Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                mh5 mh5Var = (mh5) obj;
                if (mh5Var instanceof dg5.a) {
                    f05<E, yq4> f05Var = this.t;
                    if (f05Var != null) {
                        mn5Var = rm5.c(f05Var, ((dg5.a) mh5Var).v, null);
                    }
                } else {
                    mh5Var.F0(xg5Var);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    mn5 mn5Var2 = null;
                    while (true) {
                        int i = size - 1;
                        mh5 mh5Var2 = (mh5) arrayList.get(size);
                        if (mh5Var2 instanceof dg5.a) {
                            f05<E, yq4> f05Var2 = this.t;
                            mn5Var2 = f05Var2 == null ? null : rm5.c(f05Var2, ((dg5.a) mh5Var2).v, mn5Var2);
                        } else {
                            mh5Var2.F0(xg5Var);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    mn5Var = mn5Var2;
                }
            }
        }
        if (mn5Var != null) {
            throw mn5Var;
        }
    }
}