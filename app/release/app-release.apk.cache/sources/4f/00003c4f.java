package com.p7700g.p99005;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0096\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c75<T, R, E> implements g75<E> {
    @NotNull
    private final g75<T> a;
    @NotNull
    private final f05<T, R> b;
    @NotNull
    private final f05<R, Iterator<E>> c;

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<E>, n35 {
        @NotNull
        private final Iterator<T> s;
        @Nullable
        private Iterator<? extends E> t;
        public final /* synthetic */ c75<T, R, E> u;

        public a(c75<T, R, E> c75Var) {
            this.u = c75Var;
            this.s = ((c75) c75Var).a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean a() {
            Iterator<? extends E> it = this.t;
            if ((it == null || it.hasNext()) ? false : true) {
                this.t = null;
            }
            while (true) {
                if (this.t == null) {
                    if (!this.s.hasNext()) {
                        return false;
                    }
                    Iterator<? extends E> it2 = (Iterator) ((c75) this.u).c.M(((c75) this.u).b.M(this.s.next()));
                    if (it2.hasNext()) {
                        this.t = it2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        @Nullable
        public final Iterator<E> b() {
            return (Iterator<? extends E>) this.t;
        }

        @NotNull
        public final Iterator<T> c() {
            return this.s;
        }

        public final void d(@Nullable Iterator<? extends E> it) {
            this.t = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.t;
                c25.m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c75(@NotNull g75<? extends T> g75Var, @NotNull f05<? super T, ? extends R> f05Var, @NotNull f05<? super R, ? extends Iterator<? extends E>> f05Var2) {
        c25.p(g75Var, "sequence");
        c25.p(f05Var, "transformer");
        c25.p(f05Var2, "iterator");
        this.a = g75Var;
        this.b = f05Var;
        this.c = f05Var2;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<E> iterator() {
        return new a(this);
    }
}