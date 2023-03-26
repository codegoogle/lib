package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.af  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1214af implements HL {
    public final InterfaceC0701Hh<? super C1213ae> A00;

    public C1214af() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1214af(InterfaceC0701Hh<? super C1213ae> interfaceC0701Hh) {
        this.A00 = interfaceC0701Hh;
    }

    @Override // com.facebook.ads.redexgen.X.HL
    public final HM A4D() {
        return new C1213ae(this.A00);
    }
}