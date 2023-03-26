package com.p7700g.p99005;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/jvm/internal/ArrayIntIterator;", "Lkotlin/collections/IntIterator;", "array", "", "([I)V", la1.l, "", "hasNext", "", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class y05 extends ft4 {
    @NotNull
    private final int[] s;
    private int t;

    public y05(@NotNull int[] iArr) {
        c25.p(iArr, "array");
        this.s = iArr;
    }

    @Override // com.p7700g.p99005.ft4
    public int b() {
        try {
            int[] iArr = this.s;
            int i = this.t;
            this.t = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.t--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.t < this.s.length;
    }
}