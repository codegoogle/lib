package com.p7700g.p99005;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Strings.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class h85 implements g75<c55> {
    @NotNull
    private final CharSequence a;
    private final int b;
    private final int c;
    @NotNull
    private final j05<CharSequence, Integer, hp4<Integer, Integer>> d;

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<c55>, n35 {
        private int s = -1;
        private int t;
        private int u;
        @Nullable
        private c55 v;
        private int w;

        public a() {
            int B = i55.B(h85.this.b, 0, h85.this.a.length());
            this.t = B;
            this.u = B;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.x.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void a() {
            if (this.u >= 0) {
                if (h85.this.c > 0) {
                    int i = this.w + 1;
                    this.w = i;
                }
                if (this.u <= h85.this.a.length()) {
                    hp4 hp4Var = (hp4) h85.this.d.w3(h85.this.a, Integer.valueOf(this.u));
                    if (hp4Var == null) {
                        this.v = new c55(this.t, c95.i3(h85.this.a));
                        this.u = -1;
                    } else {
                        int intValue = ((Number) hp4Var.f()).intValue();
                        int intValue2 = ((Number) hp4Var.g()).intValue();
                        this.v = i55.z1(this.t, intValue);
                        int i2 = intValue + intValue2;
                        this.t = i2;
                        this.u = i2 + (intValue2 == 0 ? 1 : 0);
                    }
                    this.s = 1;
                    return;
                }
                this.v = new c55(this.t, c95.i3(h85.this.a));
                this.u = -1;
                this.s = 1;
                return;
            }
            this.s = 0;
            this.v = null;
        }

        public final int b() {
            return this.w;
        }

        public final int c() {
            return this.t;
        }

        @Nullable
        public final c55 d() {
            return this.v;
        }

        public final int e() {
            return this.u;
        }

        public final int h() {
            return this.s;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.s == -1) {
                a();
            }
            return this.s == 1;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: i */
        public c55 next() {
            if (this.s == -1) {
                a();
            }
            if (this.s != 0) {
                c55 c55Var = this.v;
                c25.n(c55Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.v = null;
                this.s = -1;
                return c55Var;
            }
            throw new NoSuchElementException();
        }

        public final void j(int i) {
            this.w = i;
        }

        public final void k(int i) {
            this.t = i;
        }

        public final void l(@Nullable c55 c55Var) {
            this.v = c55Var;
        }

        public final void m(int i) {
            this.u = i;
        }

        public final void n(int i) {
            this.s = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h85(@NotNull CharSequence charSequence, int i, int i2, @NotNull j05<? super CharSequence, ? super Integer, hp4<Integer, Integer>> j05Var) {
        c25.p(charSequence, "input");
        c25.p(j05Var, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = j05Var;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<c55> iterator() {
        return new a();
    }
}