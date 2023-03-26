package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1232ax implements HL {
    public final int A00;
    public final HJ A01;
    public final HL A02;
    public final HL A03;
    public final InterfaceC0705Hl A04;
    public final InterfaceC0707Hn A05;

    public C1232ax(InterfaceC0705Hl interfaceC0705Hl, HL hl, HL hl2, HJ hj, int i, InterfaceC0707Hn interfaceC0707Hn) {
        this.A04 = interfaceC0705Hl;
        this.A03 = hl;
        this.A02 = hl2;
        this.A01 = hj;
        this.A00 = i;
        this.A05 = interfaceC0707Hn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HL
    /* renamed from: A00 */
    public final C1231aw A4D() {
        InterfaceC0705Hl interfaceC0705Hl = this.A04;
        HM A4D = this.A03.A4D();
        HM A4D2 = this.A02.A4D();
        HJ hj = this.A01;
        return new C1231aw(interfaceC0705Hl, A4D, A4D2, hj != null ? hj.createDataSink() : null, this.A00, this.A05);
    }
}