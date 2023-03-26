package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveSpreadBuilders.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/ByteSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "(I)V", "values", com.anythink.expressad.d.a.b.ay, "", "value", "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class h15 extends t25<byte[]> {
    @NotNull
    private final byte[] d;

    public h15(int i) {
        super(i);
        this.d = new byte[i];
    }

    public final void h(byte b) {
        byte[] bArr = this.d;
        int b2 = b();
        e(b2 + 1);
        bArr[b2] = b;
    }

    @Override // com.p7700g.p99005.t25
    /* renamed from: i */
    public int c(@NotNull byte[] bArr) {
        c25.p(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public final byte[] j() {
        return g(this.d, new byte[f()]);
    }
}