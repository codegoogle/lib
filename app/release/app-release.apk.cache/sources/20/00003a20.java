package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveSpreadBuilders.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0002J\f\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/jvm/internal/IntSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "(I)V", "values", com.anythink.expressad.d.a.b.ay, "", "value", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b25 extends t25<int[]> {
    @NotNull
    private final int[] d;

    public b25(int i) {
        super(i);
        this.d = new int[i];
    }

    public final void h(int i) {
        int[] iArr = this.d;
        int b = b();
        e(b + 1);
        iArr[b] = i;
    }

    @Override // com.p7700g.p99005.t25
    /* renamed from: i */
    public int c(@NotNull int[] iArr) {
        c25.p(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public final int[] j() {
        return g(this.d, new int[f()]);
    }
}