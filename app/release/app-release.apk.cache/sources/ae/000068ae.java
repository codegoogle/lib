package com.p7700g.p99005;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class z65<T> implements g75<T> {
    @NotNull
    private final g75<T> a;
    @NotNull
    private final f05<T, Boolean> b;

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"kotlin/sequences/DropWhileSequence$iterator$1", "", "dropState", "", "getDropState", "()I", "setDropState", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "drop", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, n35 {
        @NotNull
        private final Iterator<T> s;
        private int t = -1;
        @Nullable
        private T u;
        public final /* synthetic */ z65<T> v;

        public a(z65<T> z65Var) {
            this.v = z65Var;
            this.s = ((z65) z65Var).a.iterator();
        }

        private final void a() {
            while (this.s.hasNext()) {
                T next = this.s.next();
                if (!((Boolean) ((z65) this.v).b.M(next)).booleanValue()) {
                    this.u = next;
                    this.t = 1;
                    return;
                }
            }
            this.t = 0;
        }

        public final int b() {
            return this.t;
        }

        @NotNull
        public final Iterator<T> c() {
            return this.s;
        }

        @Nullable
        public final T d() {
            return this.u;
        }

        public final void e(int i) {
            this.t = i;
        }

        public final void h(@Nullable T t) {
            this.u = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.t == -1) {
                a();
            }
            return this.t == 1 || this.s.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.t == -1) {
                a();
            }
            if (this.t == 1) {
                T t = this.u;
                this.u = null;
                this.t = 0;
                return t;
            }
            return this.s.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z65(@NotNull g75<? extends T> g75Var, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(g75Var, "sequence");
        c25.p(f05Var, "predicate");
        this.a = g75Var;
        this.b = f05Var;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}