package com.p7700g.p99005;

import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b55 extends ft4 {
    private final int s;
    private final int t;
    private boolean u;
    private int v;

    public b55(int i, int i2, int i3) {
        this.s = i3;
        this.t = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.u = z;
        this.v = z ? i : i2;
    }

    @Override // com.p7700g.p99005.ft4
    public int b() {
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
        return i;
    }

    public final int c() {
        return this.s;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.u;
    }
}