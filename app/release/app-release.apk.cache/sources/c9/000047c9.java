package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveSpreadBuilders.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/LongSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "(I)V", "values", com.anythink.expressad.d.a.b.ay, "", "value", "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class i25 extends t25<long[]> {
    @NotNull
    private final long[] d;

    public i25(int i) {
        super(i);
        this.d = new long[i];
    }

    public final void h(long j) {
        long[] jArr = this.d;
        int b = b();
        e(b + 1);
        jArr[b] = j;
    }

    @Override // com.p7700g.p99005.t25
    /* renamed from: i */
    public int c(@NotNull long[] jArr) {
        c25.p(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public final long[] j() {
        return g(this.d, new long[f()]);
    }
}