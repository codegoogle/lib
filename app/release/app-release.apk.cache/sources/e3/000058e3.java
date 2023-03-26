package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* compiled from: SlidingWindow.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "(Ljava/util/List;)V", "_size", "", "fromIndex", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "getSize", "()I", "get", la1.l, "(I)Ljava/lang/Object;", "move", "", "toIndex", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class qt4<E> extends nr4<E> implements RandomAccess {
    @NotNull
    private final List<E> t;
    private int u;
    private int v;

    /* JADX WARN: Multi-variable type inference failed */
    public qt4(@NotNull List<? extends E> list) {
        c25.p(list, "list");
        this.t = list;
    }

    @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
    public int a() {
        return this.v;
    }

    public final void b(int i, int i2) {
        nr4.s.d(i, i2, this.t.size());
        this.u = i;
        this.v = i2 - i;
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    public E get(int i) {
        nr4.s.b(i, this.v);
        return this.t.get(this.u + i);
    }
}