package com.p7700g.p99005;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class e75<T> implements g75<ct4<? extends T>> {
    @NotNull
    private final g75<T> a;

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<ct4<? extends T>>, n35 {
        @NotNull
        private final Iterator<T> s;
        private int t;

        public a(e75<T> e75Var) {
            this.s = ((e75) e75Var).a.iterator();
        }

        public final int a() {
            return this.t;
        }

        @NotNull
        public final Iterator<T> b() {
            return this.s;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: c */
        public ct4<T> next() {
            int i = this.t;
            this.t = i + 1;
            if (i < 0) {
                js4.X();
            }
            return new ct4<>(i, this.s.next());
        }

        public final void d(int i) {
            this.t = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e75(@NotNull g75<? extends T> g75Var) {
        c25.p(g75Var, "sequence");
        this.a = g75Var;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<ct4<T>> iterator() {
        return new a(this);
    }
}