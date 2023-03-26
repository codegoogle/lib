package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReversedViews.kt */
@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", "T", "Lkotlin/collections/AbstractList;", "delegate", "", "(Ljava/util/List;)V", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "get", la1.l, "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class ut4<T> extends nr4<T> {
    @NotNull
    private final List<T> t;

    /* JADX WARN: Multi-variable type inference failed */
    public ut4(@NotNull List<? extends T> list) {
        c25.p(list, "delegate");
        this.t = list;
    }

    @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
    public int a() {
        return this.t.size();
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    public T get(int i) {
        int Y0;
        List<T> list = this.t;
        Y0 = ps4.Y0(this, i);
        return list.get(Y0);
    }
}