package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ya  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1125Ya implements InterfaceC0583Cn {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final IQ A04;

    public C1125Ya(YY yy) {
        this.A04 = yy.A00;
        this.A04.A0Z(12);
        this.A02 = this.A04.A0I() & 255;
        this.A03 = this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0583Cn
    public final int A6q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0583Cn
    public final boolean A7c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0583Cn
    public final int AC3() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A0F();
        }
        if (i == 16) {
            return this.A04.A0J();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            this.A00 = this.A04.A0F();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}