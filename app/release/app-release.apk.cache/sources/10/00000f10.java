package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04617c extends IC {
    public final /* synthetic */ HU A00;

    public C04617c(HU hu) {
        this.A00 = hu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(IF r3) {
        C0792Lb c0792Lb;
        Handler handler;
        c0792Lb = this.A00.A01;
        if (c0792Lb == null || r3.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A08(new P2(this));
    }
}