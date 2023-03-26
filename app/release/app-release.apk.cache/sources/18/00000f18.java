package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04697n extends IC {
    public final /* synthetic */ C0702Hi A00;

    public C04697n(C0702Hi c0702Hi) {
        this.A00 = c0702Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(IF r5) {
        C0792Lb c0792Lb;
        boolean z;
        Handler handler;
        boolean A0E;
        boolean z2;
        Handler handler2;
        int i;
        c0792Lb = this.A00.A01;
        if (c0792Lb == null) {
            return;
        }
        z = this.A00.A03;
        if (z || r5.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0E = this.A00.A0E(PD.A05);
        if (A0E) {
            this.A00.A03();
            this.A00.A07(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        C0706Hm c0706Hm = new C0706Hm(this);
        i = this.A00.A00;
        handler2.postDelayed(c0706Hm, i);
    }
}