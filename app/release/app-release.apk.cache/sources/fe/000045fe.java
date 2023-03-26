package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.qp4;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SequenceBuilder.kt */
@vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", CallMraidJS.b, "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class h75<T> extends i75<T> implements Iterator<T>, uv4<yq4>, n35 {
    private int s;
    @Nullable
    private T t;
    @Nullable
    private Iterator<? extends T> u;
    @Nullable
    private uv4<? super yq4> v;

    private final Throwable i() {
        int i = this.s;
        if (i != 4) {
            if (i != 5) {
                StringBuilder G = wo1.G("Unexpected state of the iterator: ");
                G.append(this.s);
                return new IllegalStateException(G.toString());
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T k() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // com.p7700g.p99005.i75
    @Nullable
    public Object b(T t, @NotNull uv4<? super yq4> uv4Var) {
        this.t = t;
        this.s = 3;
        this.v = uv4Var;
        Object h = gw4.h();
        if (h == gw4.h()) {
            ow4.c(uv4Var);
        }
        return h == gw4.h() ? h : yq4.a;
    }

    @Override // com.p7700g.p99005.i75
    @Nullable
    public Object d(@NotNull Iterator<? extends T> it, @NotNull uv4<? super yq4> uv4Var) {
        if (it.hasNext()) {
            this.u = it;
            this.s = 2;
            this.v = uv4Var;
            Object h = gw4.h();
            if (h == gw4.h()) {
                ow4.c(uv4Var);
            }
            return h == gw4.h() ? h : yq4.a;
        }
        return yq4.a;
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        return zv4.s;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.s;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw i();
                }
                Iterator<? extends T> it = this.u;
                c25.m(it);
                if (it.hasNext()) {
                    this.s = 2;
                    return true;
                }
                this.u = null;
            }
            this.s = 5;
            uv4<? super yq4> uv4Var = this.v;
            c25.m(uv4Var);
            this.v = null;
            qp4.a aVar = qp4.s;
            uv4Var.u(qp4.b(yq4.a));
        }
    }

    @Nullable
    public final uv4<yq4> j() {
        return this.v;
    }

    public final void l(@Nullable uv4<? super yq4> uv4Var) {
        this.v = uv4Var;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.s;
        if (i == 0 || i == 1) {
            return k();
        }
        if (i == 2) {
            this.s = 1;
            Iterator<? extends T> it = this.u;
            c25.m(it);
            return it.next();
        } else if (i == 3) {
            this.s = 0;
            T t = this.t;
            this.t = null;
            return t;
        } else {
            throw i();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.p7700g.p99005.uv4
    public void u(@NotNull Object obj) {
        rp4.n(obj);
        this.s = 4;
    }
}