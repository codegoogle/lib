package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2Z extends A3 {
    public final int A00;
    public final int A01;
    public final InterfaceC0701Hh<? super HM> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2Z(String str, InterfaceC0701Hh<? super HM> interfaceC0701Hh) {
        this(str, interfaceC0701Hh, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2Z(String str, InterfaceC0701Hh<? super HM> interfaceC0701Hh, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0701Hh;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.A3
    /* renamed from: A00 */
    public final A5 A01(HW hw) {
        return new A5(this.A03, null, this.A02, this.A00, this.A01, this.A04, hw);
    }
}