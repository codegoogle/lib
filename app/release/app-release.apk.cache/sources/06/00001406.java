package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.Ss  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0987Ss extends KP {
    public final /* synthetic */ C0991Sw A00;
    public final /* synthetic */ C0755Jm A01;

    public C0987Ss(C0991Sw c0991Sw, C0755Jm c0755Jm) {
        this.A00 = c0991Sw;
        this.A01 = c0755Jm;
    }

    @Override // com.facebook.ads.redexgen.X.KP
    public final void A04() {
        C04044w c04044w;
        C04044w c04044w2;
        C04044w c04044w3;
        c04044w = this.A00.A01;
        if (c04044w.A07() == null) {
            return;
        }
        c04044w2 = this.A00.A01;
        AdListener A07 = c04044w2.A07();
        c04044w3 = this.A00.A01;
        A07.onError(c04044w3.A08(), C0755Jm.A00(this.A01));
    }
}