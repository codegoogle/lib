package com.p7700g.p99005;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b75<T> implements g75<T> {
    @NotNull
    private final g75<T> a;
    private final boolean b;
    @NotNull
    private final f05<T, Boolean> c;

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, n35 {
        @NotNull
        private final Iterator<T> s;
        private int t = -1;
        @Nullable
        private T u;
        public final /* synthetic */ b75<T> v;

        public a(b75<T> b75Var) {
            this.v = b75Var;
            this.s = ((b75) b75Var).a.iterator();
        }

        private final void a() {
            while (this.s.hasNext()) {
                T next = this.s.next();
                if (((Boolean) ((b75) this.v).c.M(next)).booleanValue() == ((b75) this.v).b) {
                    this.u = next;
                    this.t = 1;
                    return;
                }
            }
            this.t = 0;
        }

        @NotNull
        public final Iterator<T> b() {
            return this.s;
        }

        @Nullable
        public final T c() {
            return this.u;
        }

        public final int d() {
            return this.t;
        }

        public final void e(@Nullable T t) {
            this.u = t;
        }

        public final void h(int i) {
            this.t = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.t == -1) {
                a();
            }
            return this.t == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.t == -1) {
                a();
            }
            if (this.t != 0) {
                T t = this.u;
                this.u = null;
                this.t = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b75(@NotNull g75<? extends T> g75Var, boolean z, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(g75Var, "sequence");
        c25.p(f05Var, "predicate");
        this.a = g75Var;
        this.b = z;
        this.c = f05Var;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ b75(g75 g75Var, boolean z, f05 f05Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g75Var, (i & 2) != 0 ? true : z, f05Var);
    }
}