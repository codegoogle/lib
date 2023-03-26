package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.Qu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0940Qu implements C0L {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C0940Qu(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ABQ(int i) throws C0941Qv {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void close() throws C0941Qv {
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int length() throws C0941Qv {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int read(byte[] bArr) throws C0941Qv {
        return this.A00.read(bArr, 0, bArr.length);
    }
}