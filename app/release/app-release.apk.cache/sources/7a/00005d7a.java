package com.p7700g.p99005;

import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class t45 extends fs4 {
    private final int s;
    private final int t;
    private boolean u;
    private int v;

    public t45(char c, char c2, int i) {
        this.s = i;
        this.t = c2;
        boolean z = true;
        if (i <= 0 ? c25.t(c, c2) < 0 : c25.t(c, c2) > 0) {
            z = false;
        }
        this.u = z;
        this.v = z ? c : c2;
    }

    @Override // com.p7700g.p99005.fs4
    public char b() {
        int i = this.v;
        if (i == this.t) {
            if (this.u) {
                this.u = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.v = this.s + i;
        }
        return (char) i;
    }

    public final int c() {
        return this.s;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.u;
    }
}