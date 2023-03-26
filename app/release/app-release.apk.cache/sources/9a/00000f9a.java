package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* loaded from: assets/audience_network.dex */
public final class A0 implements InterfaceC1268ba {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public A0(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.JQ
    public final void A8k() {
        KT.A00(new C1237b3(this));
    }

    @Override // com.facebook.ads.redexgen.X.JQ
    public final void A8n() {
        KT.A00(new C1238b4(this));
    }

    @Override // com.facebook.ads.redexgen.X.JQ
    public final void A9X(C0755Jm c0755Jm) {
        KT.A00(new bI(this, c0755Jm));
    }

    @Override // com.facebook.ads.redexgen.X.JQ
    public final void AA6() {
        KT.A00(new C1234az(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268ba
    public final void AA9() {
        KT.A00(new C1239b5(this));
    }
}