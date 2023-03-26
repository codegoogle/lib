package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", NewHtcHomeBadger.d, "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class p75<T> implements g75<T>, y65<T> {
    @NotNull
    private final g75<T> a;
    private final int b;
    private final int c;

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, n35 {
        @NotNull
        private final Iterator<T> s;
        private int t;
        public final /* synthetic */ p75<T> u;

        public a(p75<T> p75Var) {
            this.u = p75Var;
            this.s = ((p75) p75Var).a.iterator();
        }

        private final void a() {
            while (this.t < ((p75) this.u).b && this.s.hasNext()) {
                this.s.next();
                this.t++;
            }
        }

        @NotNull
        public final Iterator<T> b() {
            return this.s;
        }

        public final int c() {
            return this.t;
        }

        public final void d(int i) {
            this.t = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.t < ((p75) this.u).c && this.s.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.t < ((p75) this.u).c) {
                this.t++;
                return this.s.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p75(@NotNull g75<? extends T> g75Var, int i, int i2) {
        c25.p(g75Var, "sequence");
        this.a = g75Var;
        this.b = i;
        this.c = i2;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(wo1.l("startIndex should be non-negative, but is ", i).toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(wo1.l("endIndex should be non-negative, but is ", i2).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(wo1.o("endIndex should be not less than startIndex, but was ", i2, " < ", i).toString());
        }
    }

    private final int f() {
        return this.c - this.b;
    }

    @Override // com.p7700g.p99005.y65
    @NotNull
    public g75<T> a(int i) {
        if (i >= f()) {
            return this;
        }
        g75<T> g75Var = this.a;
        int i2 = this.b;
        return new p75(g75Var, i2, i + i2);
    }

    @Override // com.p7700g.p99005.y65
    @NotNull
    public g75<T> b(int i) {
        return i >= f() ? m75.g() : new p75(this.a, this.b + i, this.c);
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}