package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;

/* compiled from: UByteArray.kt */
@vo4(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\bø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"UByteArray", "Lkotlin/UByteArray;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", e31.b, "Lkotlin/Function1;", "Lkotlin/UByte;", "(ILkotlin/jvm/functions/Function1;)[B", "ubyteArrayOf", "elements", "ubyteArrayOf-GBYM_sE", "([B)[B", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class hq4 {
    @go4
    @dx4
    @tp4(version = "1.3")
    private static final byte[] a(int i, f05<? super Integer, fq4> f05Var) {
        c25.p(f05Var, e31.b);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = f05Var.M(Integer.valueOf(i2)).c1();
        }
        return gq4.d(bArr);
    }

    @go4
    @dx4
    @tp4(version = "1.3")
    private static final byte[] b(byte... bArr) {
        c25.p(bArr, "elements");
        return bArr;
    }
}